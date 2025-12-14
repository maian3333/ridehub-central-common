package com.ridehub.feign.msbooking.client.api;

import com.ridehub.feign.msbooking.client.invoker.ApiClient;
import com.ridehub.feign.msbooking.client.invoker.EncodingUtils;
import com.ridehub.feign.msbooking.client.model.ApiResponse;

import com.ridehub.feign.msbooking.client.model.RefundRequestDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface VnPayCallbackResourceMsbookingApi extends ApiClient.Api {


  /**
   * 
   * 
   */
  @RequestLine("GET /api/payment/vnpay/callback")
  @Headers({
    "Accept: application/json",
  })
  void handleCallback();

  /**
   * 
   * Similar to <code>handleCallback</code> but it also returns the http response headers .
   * 
   */
  @RequestLine("GET /api/payment/vnpay/callback")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> handleCallbackWithHttpInfo();



  /**
   * 
   * 
   * @return String
   */
  @RequestLine("GET /api/payment/vnpay/webhook")
  @Headers({
    "Accept: */*",
  })
  String handleVnpayIpn();

  /**
   * 
   * Similar to <code>handleVnpayIpn</code> but it also returns the http response headers .
   * 
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/payment/vnpay/webhook")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<String> handleVnpayIpnWithHttpInfo();



  /**
   * 
   * 
   * @param body  (required)
   * @param xSignature  (optional)
   * @return String
   */
  @RequestLine("POST /api/payment/vnpay/webhook")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
    "X-Signature: {xSignature}"
  })
  String handleWebhook1(@jakarta.annotation.Nonnull String body, @Param("xSignature") @jakarta.annotation.Nullable String xSignature);

  /**
   * 
   * Similar to <code>handleWebhook1</code> but it also returns the http response headers .
   * 
   * @param body  (required)
   * @param xSignature  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/payment/vnpay/webhook")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
    "X-Signature: {xSignature}"
  })
  ApiResponse<String> handleWebhook1WithHttpInfo(@jakarta.annotation.Nonnull String body, @Param("xSignature") @jakarta.annotation.Nullable String xSignature);



  /**
   * 
   * 
   * @param transactionId  (required)
   * @return Map&lt;String, Object&gt;
   */
  @RequestLine("POST /api/payment/vnpay/poll/{transactionId}")
  @Headers({
    "Accept: */*",
  })
  Map<String, Object> pollTransaction(@Param("transactionId") @jakarta.annotation.Nonnull String transactionId);

  /**
   * 
   * Similar to <code>pollTransaction</code> but it also returns the http response headers .
   * 
   * @param transactionId  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/payment/vnpay/poll/{transactionId}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Map<String, Object>> pollTransactionWithHttpInfo(@Param("transactionId") @jakarta.annotation.Nonnull String transactionId);



  /**
   * 
   * 
   * @param transactionId  (required)
   * @return Map&lt;String, Object&gt;
   */
  @RequestLine("GET /api/payment/vnpay/query/{transactionId}")
  @Headers({
    "Accept: */*",
  })
  Map<String, Object> queryTransaction(@Param("transactionId") @jakarta.annotation.Nonnull String transactionId);

  /**
   * 
   * Similar to <code>queryTransaction</code> but it also returns the http response headers .
   * 
   * @param transactionId  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/payment/vnpay/query/{transactionId}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Map<String, Object>> queryTransactionWithHttpInfo(@Param("transactionId") @jakarta.annotation.Nonnull String transactionId);



  /**
   * 
   * 
   * @param transactionId  (required)
   * @param refundRequestDTO  (required)
   * @return Map&lt;String, Object&gt;
   */
  @RequestLine("POST /api/payment/vnpay/refund/{transactionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  Map<String, Object> refundTransaction(@Param("transactionId") @jakarta.annotation.Nonnull String transactionId, @jakarta.annotation.Nonnull RefundRequestDTO refundRequestDTO);

  /**
   * 
   * Similar to <code>refundTransaction</code> but it also returns the http response headers .
   * 
   * @param transactionId  (required)
   * @param refundRequestDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/payment/vnpay/refund/{transactionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<Map<String, Object>> refundTransactionWithHttpInfo(@Param("transactionId") @jakarta.annotation.Nonnull String transactionId, @jakarta.annotation.Nonnull RefundRequestDTO refundRequestDTO);


}
