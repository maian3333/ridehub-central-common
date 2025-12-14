package com.ridehub.common.feign;

import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import feign.RequestInterceptor;

import java.time.Instant;
import java.util.Map;

/**
 * Consolidated authentication manager for Feign clients.
 * Handles both service-to-service authentication and user token forwarding.
 */
public class RidehubFeignAuthManager {

    private final String tokenUrl;
    private final String clientId;
    private final String clientSecret;
    private final String scope;
    private final RestTemplate rt = new RestTemplate();

    private volatile String cachedToken;
    private volatile Instant expiresAt = Instant.EPOCH;

    public RidehubFeignAuthManager(String tokenUrl, String clientId, String clientSecret, String scope) {
        this.tokenUrl = tokenUrl;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.scope = scope;
    }

    /**
     * Create a RequestInterceptor that handles both user token forwarding and service auth
     */
    public RequestInterceptor createAuthInterceptor() {
        return req -> {
            // 1) Try to forward user JWT from SecurityContext first
            if (forwardUserToken(req)) {
                return; // User token found and forwarded
            }

            // 2) No user token -> use service-to-service client_credentials token
            try {
                String token = getAccessToken();
                req.header("Authorization", "Bearer " + token);
            } catch (Throwable e) {
                // Don't block app startup; requests will 401 if auth is truly required
            }
        };
    }

    /**
     * Try to forward user token from SecurityContext
     */
    private boolean forwardUserToken(feign.RequestTemplate req) {
        try {
            Class<?> sch = Class.forName("org.springframework.security.core.context.SecurityContextHolder");
            Object context = sch.getMethod("getContext").invoke(null);
            if (context != null) {
                Object auth = context.getClass().getMethod("getAuthentication").invoke(context);
                if (auth != null) {
                    Class<?> jwtAuthClass = Class.forName(
                            "org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken");
                    if (jwtAuthClass.isInstance(auth)) {
                        Object token = auth.getClass().getMethod("getToken").invoke(auth);
                        if (token != null) {
                            String tokenValue = (String) token.getClass().getMethod("getTokenValue").invoke(token);
                            if (tokenValue != null && !tokenValue.isBlank()) {
                                req.header("Authorization", "Bearer " + tokenValue);
                                return true;
                            }
                        }
                    }
                }
            }
        } catch (ClassNotFoundException ignore) {
            // Security not on classpath
        } catch (Throwable ignore) {
            // Best-effort approach
        }
        return false;
    }

    /**
     * Get service-to-service access token with caching
     */
    public synchronized String getAccessToken() {
        if (cachedToken != null && Instant.now().isBefore(expiresAt.minusSeconds(30))) {
            return cachedToken;
        }

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String, String> form = new LinkedMultiValueMap<>();
        form.add("grant_type", "client_credentials");
        form.add("client_id", clientId);
        form.add("client_secret", clientSecret);
        if (scope != null && !scope.isBlank()) {
            form.add("scope", scope);
        }

        ResponseEntity<Map> resp = rt.postForEntity(tokenUrl, new HttpEntity<>(form, headers), Map.class);
        if (!resp.getStatusCode().is2xxSuccessful() || resp.getBody() == null) {
            throw new IllegalStateException("Failed to fetch service token: " + resp.getStatusCode());
        }

        String token = (String) resp.getBody().get("access_token");
        Number expiresIn = (Number) resp.getBody().get("expires_in");
        if (token == null || expiresIn == null) {
            throw new IllegalStateException("Token response missing required fields");
        }

        cachedToken = token;
        expiresAt = Instant.now().plusSeconds(expiresIn.longValue());
        return cachedToken;
    }

    /**
     * Clear cached token (useful for testing or forced refresh)
     */
    public synchronized void clearCache() {
        cachedToken = null;
        expiresAt = Instant.EPOCH;
    }
}