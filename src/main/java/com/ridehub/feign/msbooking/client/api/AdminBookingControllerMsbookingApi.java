package com.ridehub.feign.msbooking.client.api;

import com.ridehub.feign.msbooking.client.invoker.ApiClient;
import com.ridehub.feign.msbooking.client.invoker.EncodingUtils;
import com.ridehub.feign.msbooking.client.model.ApiResponse;

import com.ridehub.feign.msbooking.client.model.Booking;
import com.ridehub.feign.msbooking.client.model.PageBooking;
import com.ridehub.feign.msbooking.client.model.Pageable;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface AdminBookingControllerMsbookingApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("POST /api/admin/bookings/{id}/cancel")
  @Headers({
    "Accept: application/json",
  })
  void cancelBooking(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>cancelBooking</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("POST /api/admin/bookings/{id}/cancel")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> cancelBookingWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("POST /api/admin/bookings/{id}/confirm")
  @Headers({
    "Accept: application/json",
  })
  void confirmBooking(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>confirmBooking</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("POST /api/admin/bookings/{id}/confirm")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> confirmBookingWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param pageable  (required)
   * @param status  (optional)
   * @param customerId  (optional)
   * @param tripId  (optional)
   * @return PageBooking
   */
  @RequestLine("GET /api/admin/bookings?status={status}&customerId={customerId}&tripId={tripId}&pageable={pageable}")
  @Headers({
    "Accept: */*",
  })
  PageBooking getAllBookings1(@Param("pageable") @jakarta.annotation.Nonnull Pageable pageable, @Param("status") @jakarta.annotation.Nullable String status, @Param("customerId") @jakarta.annotation.Nullable UUID customerId, @Param("tripId") @jakarta.annotation.Nullable Long tripId);

  /**
   * 
   * Similar to <code>getAllBookings1</code> but it also returns the http response headers .
   * 
   * @param pageable  (required)
   * @param status  (optional)
   * @param customerId  (optional)
   * @param tripId  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/admin/bookings?status={status}&customerId={customerId}&tripId={tripId}&pageable={pageable}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<PageBooking> getAllBookings1WithHttpInfo(@Param("pageable") @jakarta.annotation.Nonnull Pageable pageable, @Param("status") @jakarta.annotation.Nullable String status, @Param("customerId") @jakarta.annotation.Nullable UUID customerId, @Param("tripId") @jakarta.annotation.Nullable Long tripId);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllBookings1</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllBookings1QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>status -  (optional)</li>
   *   <li>customerId -  (optional)</li>
   *   <li>tripId -  (optional)</li>
   *   <li>pageable -  (required)</li>
   *   </ul>
   * @return PageBooking
   */
  @RequestLine("GET /api/admin/bookings?status={status}&customerId={customerId}&tripId={tripId}&pageable={pageable}")
  @Headers({
  "Accept: */*",
  })
  PageBooking getAllBookings1(@QueryMap(encoded=true) GetAllBookings1QueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllBookings1</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>status -  (optional)</li>
          *   <li>customerId -  (optional)</li>
          *   <li>tripId -  (optional)</li>
          *   <li>pageable -  (required)</li>
      *   </ul>
          * @return PageBooking
      */
      @RequestLine("GET /api/admin/bookings?status={status}&customerId={customerId}&tripId={tripId}&pageable={pageable}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<PageBooking> getAllBookings1WithHttpInfo(@QueryMap(encoded=true) GetAllBookings1QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllBookings1</code> method in a fluent style.
   */
  public static class GetAllBookings1QueryParams extends HashMap<String, Object> {
    public GetAllBookings1QueryParams status(@jakarta.annotation.Nullable final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
    public GetAllBookings1QueryParams customerId(@jakarta.annotation.Nullable final UUID value) {
      put("customerId", EncodingUtils.encode(value));
      return this;
    }
    public GetAllBookings1QueryParams tripId(@jakarta.annotation.Nullable final Long value) {
      put("tripId", EncodingUtils.encode(value));
      return this;
    }
    public GetAllBookings1QueryParams pageable(@jakarta.annotation.Nonnull final Pageable value) {
      put("pageable", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return Booking
   */
  @RequestLine("GET /api/admin/bookings/{id}")
  @Headers({
    "Accept: */*",
  })
  Booking getBooking1(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getBooking1</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/admin/bookings/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Booking> getBooking1WithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @return List&lt;Map&lt;String, Object&gt;&gt;
   */
  @RequestLine("GET /api/admin/bookings/critical-payments")
  @Headers({
    "Accept: */*",
  })
  List<Map<String, Object>> getCriticalPayments();

  /**
   * 
   * Similar to <code>getCriticalPayments</code> but it also returns the http response headers .
   * 
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/admin/bookings/critical-payments")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<Map<String, Object>>> getCriticalPaymentsWithHttpInfo();



  /**
   * 
   * 
   * @param transactionId  (required)
   * @return Map&lt;String, Object&gt;
   */
  @RequestLine("POST /api/admin/bookings/recover-expired-payment?transactionId={transactionId}")
  @Headers({
    "Accept: */*",
  })
  Map<String, Object> recoverExpiredBookingPayment(@Param("transactionId") @jakarta.annotation.Nonnull String transactionId);

  /**
   * 
   * Similar to <code>recoverExpiredBookingPayment</code> but it also returns the http response headers .
   * 
   * @param transactionId  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/admin/bookings/recover-expired-payment?transactionId={transactionId}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Map<String, Object>> recoverExpiredBookingPaymentWithHttpInfo(@Param("transactionId") @jakarta.annotation.Nonnull String transactionId);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>recoverExpiredBookingPayment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RecoverExpiredBookingPaymentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>transactionId -  (required)</li>
   *   </ul>
   * @return Map&lt;String, Object&gt;
   */
  @RequestLine("POST /api/admin/bookings/recover-expired-payment?transactionId={transactionId}")
  @Headers({
  "Accept: */*",
  })
  Map<String, Object> recoverExpiredBookingPayment(@QueryMap(encoded=true) RecoverExpiredBookingPaymentQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>recoverExpiredBookingPayment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>transactionId -  (required)</li>
      *   </ul>
          * @return Map&lt;String, Object&gt;
      */
      @RequestLine("POST /api/admin/bookings/recover-expired-payment?transactionId={transactionId}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Map<String, Object>> recoverExpiredBookingPaymentWithHttpInfo(@QueryMap(encoded=true) RecoverExpiredBookingPaymentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>recoverExpiredBookingPayment</code> method in a fluent style.
   */
  public static class RecoverExpiredBookingPaymentQueryParams extends HashMap<String, Object> {
    public RecoverExpiredBookingPaymentQueryParams transactionId(@jakarta.annotation.Nonnull final String value) {
      put("transactionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
