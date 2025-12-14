package com.ridehub.feign.msbooking.client.api;

import com.ridehub.feign.msbooking.client.invoker.ApiClient;
import com.ridehub.feign.msbooking.client.invoker.EncodingUtils;
import com.ridehub.feign.msbooking.client.model.ApiResponse;

import com.ridehub.feign.msbooking.client.model.PagePaymentTransaction;
import com.ridehub.feign.msbooking.client.model.Pageable;
import com.ridehub.feign.msbooking.client.model.PaymentTransaction;
import com.ridehub.feign.msbooking.client.model.RefundRequest;
import com.ridehub.feign.msbooking.client.model.RefundResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface AdminPaymentControllerMsbookingApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param pageable  (required)
   * @param status  (optional)
   * @param orderRef  (optional)
   * @param bookingId  (optional)
   * @return PagePaymentTransaction
   */
  @RequestLine("GET /api/admin/payments?status={status}&orderRef={orderRef}&bookingId={bookingId}&pageable={pageable}")
  @Headers({
    "Accept: */*",
  })
  PagePaymentTransaction getAllPaymentTransactions1(@Param("pageable") @jakarta.annotation.Nonnull Pageable pageable, @Param("status") @jakarta.annotation.Nullable String status, @Param("orderRef") @jakarta.annotation.Nullable String orderRef, @Param("bookingId") @jakarta.annotation.Nullable Long bookingId);

  /**
   * 
   * Similar to <code>getAllPaymentTransactions1</code> but it also returns the http response headers .
   * 
   * @param pageable  (required)
   * @param status  (optional)
   * @param orderRef  (optional)
   * @param bookingId  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/admin/payments?status={status}&orderRef={orderRef}&bookingId={bookingId}&pageable={pageable}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<PagePaymentTransaction> getAllPaymentTransactions1WithHttpInfo(@Param("pageable") @jakarta.annotation.Nonnull Pageable pageable, @Param("status") @jakarta.annotation.Nullable String status, @Param("orderRef") @jakarta.annotation.Nullable String orderRef, @Param("bookingId") @jakarta.annotation.Nullable Long bookingId);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllPaymentTransactions1</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllPaymentTransactions1QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>status -  (optional)</li>
   *   <li>orderRef -  (optional)</li>
   *   <li>bookingId -  (optional)</li>
   *   <li>pageable -  (required)</li>
   *   </ul>
   * @return PagePaymentTransaction
   */
  @RequestLine("GET /api/admin/payments?status={status}&orderRef={orderRef}&bookingId={bookingId}&pageable={pageable}")
  @Headers({
  "Accept: */*",
  })
  PagePaymentTransaction getAllPaymentTransactions1(@QueryMap(encoded=true) GetAllPaymentTransactions1QueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllPaymentTransactions1</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>status -  (optional)</li>
          *   <li>orderRef -  (optional)</li>
          *   <li>bookingId -  (optional)</li>
          *   <li>pageable -  (required)</li>
      *   </ul>
          * @return PagePaymentTransaction
      */
      @RequestLine("GET /api/admin/payments?status={status}&orderRef={orderRef}&bookingId={bookingId}&pageable={pageable}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<PagePaymentTransaction> getAllPaymentTransactions1WithHttpInfo(@QueryMap(encoded=true) GetAllPaymentTransactions1QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllPaymentTransactions1</code> method in a fluent style.
   */
  public static class GetAllPaymentTransactions1QueryParams extends HashMap<String, Object> {
    public GetAllPaymentTransactions1QueryParams status(@jakarta.annotation.Nullable final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentTransactions1QueryParams orderRef(@jakarta.annotation.Nullable final String value) {
      put("orderRef", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentTransactions1QueryParams bookingId(@jakarta.annotation.Nullable final Long value) {
      put("bookingId", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentTransactions1QueryParams pageable(@jakarta.annotation.Nonnull final Pageable value) {
      put("pageable", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return PaymentTransaction
   */
  @RequestLine("GET /api/admin/payments/{id}")
  @Headers({
    "Accept: */*",
  })
  PaymentTransaction getPaymentTransaction1(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getPaymentTransaction1</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/admin/payments/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<PaymentTransaction> getPaymentTransaction1WithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param refundRequest  (required)
   * @return RefundResponse
   */
  @RequestLine("POST /api/admin/payments/{id}/refund")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  RefundResponse processRefund(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull RefundRequest refundRequest);

  /**
   * 
   * Similar to <code>processRefund</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param refundRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/admin/payments/{id}/refund")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<RefundResponse> processRefundWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull RefundRequest refundRequest);


}
