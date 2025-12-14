package com.ridehub.feign.msbooking.client.api;

import com.ridehub.feign.msbooking.client.invoker.ApiClient;
import com.ridehub.feign.msbooking.client.invoker.EncodingUtils;
import com.ridehub.feign.msbooking.client.model.ApiResponse;

import com.ridehub.feign.msbooking.client.model.PagePaymentWebhookLog;
import com.ridehub.feign.msbooking.client.model.Pageable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface PaymentWebhookResourceMsbookingApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param pageable  (required)
   * @param provider  (optional)
   * @param status  (optional)
   * @return PagePaymentWebhookLog
   */
  @RequestLine("GET /api/admin/webhooks?provider={provider}&status={status}&pageable={pageable}")
  @Headers({
    "Accept: */*",
  })
  PagePaymentWebhookLog getWebhookLogs(@Param("pageable") @jakarta.annotation.Nonnull Pageable pageable, @Param("provider") @jakarta.annotation.Nullable String provider, @Param("status") @jakarta.annotation.Nullable String status);

  /**
   * 
   * Similar to <code>getWebhookLogs</code> but it also returns the http response headers .
   * 
   * @param pageable  (required)
   * @param provider  (optional)
   * @param status  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/admin/webhooks?provider={provider}&status={status}&pageable={pageable}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<PagePaymentWebhookLog> getWebhookLogsWithHttpInfo(@Param("pageable") @jakarta.annotation.Nonnull Pageable pageable, @Param("provider") @jakarta.annotation.Nullable String provider, @Param("status") @jakarta.annotation.Nullable String status);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getWebhookLogs</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetWebhookLogsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>provider -  (optional)</li>
   *   <li>status -  (optional)</li>
   *   <li>pageable -  (required)</li>
   *   </ul>
   * @return PagePaymentWebhookLog
   */
  @RequestLine("GET /api/admin/webhooks?provider={provider}&status={status}&pageable={pageable}")
  @Headers({
  "Accept: */*",
  })
  PagePaymentWebhookLog getWebhookLogs(@QueryMap(encoded=true) GetWebhookLogsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getWebhookLogs</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>provider -  (optional)</li>
          *   <li>status -  (optional)</li>
          *   <li>pageable -  (required)</li>
      *   </ul>
          * @return PagePaymentWebhookLog
      */
      @RequestLine("GET /api/admin/webhooks?provider={provider}&status={status}&pageable={pageable}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<PagePaymentWebhookLog> getWebhookLogsWithHttpInfo(@QueryMap(encoded=true) GetWebhookLogsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getWebhookLogs</code> method in a fluent style.
   */
  public static class GetWebhookLogsQueryParams extends HashMap<String, Object> {
    public GetWebhookLogsQueryParams provider(@jakarta.annotation.Nullable final String value) {
      put("provider", EncodingUtils.encode(value));
      return this;
    }
    public GetWebhookLogsQueryParams status(@jakarta.annotation.Nullable final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
    public GetWebhookLogsQueryParams pageable(@jakarta.annotation.Nonnull final Pageable value) {
      put("pageable", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param provider  (required)
   * @param body  (required)
   * @param xSignature  (optional)
   * @return String
   */
  @RequestLine("POST /api/payments/webhook/{provider}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
    "X-Signature: {xSignature}"
  })
  String handleWebhook(@Param("provider") @jakarta.annotation.Nonnull String provider, @jakarta.annotation.Nonnull String body, @Param("xSignature") @jakarta.annotation.Nullable String xSignature);

  /**
   * 
   * Similar to <code>handleWebhook</code> but it also returns the http response headers .
   * 
   * @param provider  (required)
   * @param body  (required)
   * @param xSignature  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/payments/webhook/{provider}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
    "X-Signature: {xSignature}"
  })
  ApiResponse<String> handleWebhookWithHttpInfo(@Param("provider") @jakarta.annotation.Nonnull String provider, @jakarta.annotation.Nonnull String body, @Param("xSignature") @jakarta.annotation.Nullable String xSignature);


}
