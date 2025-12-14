package com.ridehub.feign.msbooking.client.api;

import com.ridehub.feign.msbooking.client.invoker.ApiClient;
import com.ridehub.feign.msbooking.client.invoker.EncodingUtils;
import com.ridehub.feign.msbooking.client.model.ApiResponse;

import com.ridehub.feign.msbooking.client.model.InitiatePaymentRequestVM;
import com.ridehub.feign.msbooking.client.model.PaymentInitiationResultVM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface PaymentResourceMsbookingApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param id  (required)
   * @param initiatePaymentRequestVM  (required)
   * @return PaymentInitiationResultVM
   */
  @RequestLine("POST /api/bookings/{id}/pay")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  PaymentInitiationResultVM initiatePayment(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull InitiatePaymentRequestVM initiatePaymentRequestVM);

  /**
   * 
   * Similar to <code>initiatePayment</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param initiatePaymentRequestVM  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/bookings/{id}/pay")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<PaymentInitiationResultVM> initiatePaymentWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull InitiatePaymentRequestVM initiatePaymentRequestVM);


}
