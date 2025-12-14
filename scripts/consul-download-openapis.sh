#!/usr/bin/env bash
set -euo pipefail

# Args
KEYCLOAK_TOKEN_FILE="${1:?openapi-auth.properties path (to read access.token)}"
CONSUL_URL_RAW="${2:?https://consul...}"
CONSUL_TOKEN_RAW="${3:?consul acl token}"
GATEWAY_URL_RAW="${4:?https://apigateway...}"
OPENAPI_DIR="${5:-target/openapi}"
SERVICE_NAME_PATTERN="${6:-.*}"  # regex; default all
FETCH_MODE="${7:-gateway}"       # "gateway" or "direct"

# --- normalize CRLF from args (important on Windows/Git Bash) ---
CONSUL_URL="$(printf %s "$CONSUL_URL_RAW" | tr -d '\r')"
CONSUL_TOKEN="$(printf %s "$CONSUL_TOKEN_RAW" | tr -d '\r')"
GATEWAY_URL="$(printf %s "$GATEWAY_URL_RAW" | tr -d '\r')"

mkdir -p "$OPENAPI_DIR"

# Read token saved by properties-maven-plugin (strip CR) - used for Gateway/OpenAPI calls
ACCESS_TOKEN="$(grep '^access.token=' "$KEYCLOAK_TOKEN_FILE" | cut -d'=' -f2- | tr -d '\r')"

# Requires jq
if ! command -v jq >/dev/null 2>&1; then
  echo "ERROR: jq is required." >&2
  exit 1
fi

# Common curl options for Consul (ACL)
CONSUL_CURL=(-fsSL -H "X-Consul-Token: $CONSUL_TOKEN")
# If you also allow query param token via nginx lua, you can switch to:
# CONSUL_URL_WITH_TOKEN="$CONSUL_URL?token=$CONSUL_TOKEN"

echo "==> Fetching service list from Consul with ACL token..."
SERVICES_JSON="$(curl "${CONSUL_CURL[@]}" "$CONSUL_URL/v1/catalog/services")"

jq -r 'keys[]' <<<"$SERVICES_JSON" | while IFS= read -r SVC; do
  SVC="${SVC//$'\r'/}"
  [[ "$SVC" =~ $SERVICE_NAME_PATTERN ]] || continue
  echo " -> Found service: $SVC"

  OPENAPI_URL=""
  if [[ "$FETCH_MODE" == "gateway" ]]; then
    # Through gateway service proxy (Bearer token)
    OPENAPI_URL="$GATEWAY_URL/services/$SVC/v3/api-docs/springdocDefault"
  else
    # Direct from instance(s) (Consul ACL)
    SVC_NODES_JSON="$(curl "${CONSUL_CURL[@]}" "$CONSUL_URL/v1/catalog/service/$SVC")"
    ADDR="$(jq -r '.[0].ServiceAddress // .[0].Address // empty' <<<"$SVC_NODES_JSON" | tr -d '\r')"
    PORT="$(jq -r '.[0].ServicePort // empty' <<<"$SVC_NODES_JSON" | tr -d '\r')"

    if [[ -z "$ADDR" || -z "$PORT" ]]; then
      echo "    WARN: no address/port for $SVC; skipping"
      continue
    fi

    OPENAPI_URL="http://$ADDR:$PORT/v3/api-docs"
  fi

  OUT="$OPENAPI_DIR/$SVC.json"
  echo "    Downloading OpenAPI: $OPENAPI_URL -> $OUT"

  # Gateway usually needs Bearer; direct mode usually doesn't (adjust if yours does)
  if [[ "$FETCH_MODE" == "gateway" ]]; then
    if ! curl -fSL -H "Authorization: Bearer $ACCESS_TOKEN" "$OPENAPI_URL" -o "$OUT"; then
      echo "    WARN: failed to download spec for $SVC"
      rm -f "$OUT" || true
      continue
    fi
  else
    if ! curl -fSL "$OPENAPI_URL" -o "$OUT"; then
      echo "    WARN: failed to download spec for $SVC"
      rm -f "$OUT" || true
      continue
    fi
  fi

  if ! jq -e '.openapi // .swagger' "$OUT" >/dev/null 2>&1; then
    echo "    WARN: $OUT is not a valid OpenAPI file; removing"
    rm -f "$OUT" || true
    continue
  fi
done

echo "==> Done."
