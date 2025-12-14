package com.ridehub.feign.msbooking.client.api;

import com.ridehub.feign.msbooking.client.invoker.ApiClient;
import com.ridehub.feign.msbooking.client.invoker.EncodingUtils;
import com.ridehub.feign.msbooking.client.model.ApiResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface SePayCallbackResourceMsbookingApi extends ApiClient.Api {


  /**
   * 
   * 
   */
  @RequestLine("GET /api/payment/sepay/callback")
  @Headers({
    "Accept: application/json",
  })
  void handleCallback1();

  /**
   * 
   * Similar to <code>handleCallback1</code> but it also returns the http response headers .
   * 
   */
  @RequestLine("GET /api/payment/sepay/callback")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> handleCallback1WithHttpInfo();



  /**
   * 
   * 
   * @param params  (required)
   */
  @RequestLine("GET /api/payment/sepay/error?params={params}")
  @Headers({
    "Accept: application/json",
  })
  void handleError(@Param("params") @jakarta.annotation.Nonnull Map<String, String> params);

  /**
   * 
   * Similar to <code>handleError</code> but it also returns the http response headers .
   * 
   * @param params  (required)
   */
  @RequestLine("GET /api/payment/sepay/error?params={params}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> handleErrorWithHttpInfo(@Param("params") @jakarta.annotation.Nonnull Map<String, String> params);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>handleError</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HandleErrorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>params -  (required)</li>
   *   </ul>
   */
  @RequestLine("GET /api/payment/sepay/error?params={params}")
  @Headers({
  "Accept: application/json",
  })
  void handleError(@QueryMap(encoded=true) HandleErrorQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>handleError</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>params -  (required)</li>
      *   </ul>
      */
      @RequestLine("GET /api/payment/sepay/error?params={params}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> handleErrorWithHttpInfo(@QueryMap(encoded=true) HandleErrorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>handleError</code> method in a fluent style.
   */
  public static class HandleErrorQueryParams extends HashMap<String, Object> {
    public HandleErrorQueryParams params(@jakarta.annotation.Nonnull final Map<String, String> value) {
      put("params", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param params  (required)
   */
  @RequestLine("GET /api/payment/sepay/success?params={params}")
  @Headers({
    "Accept: application/json",
  })
  void handleSuccess(@Param("params") @jakarta.annotation.Nonnull Map<String, String> params);

  /**
   * 
   * Similar to <code>handleSuccess</code> but it also returns the http response headers .
   * 
   * @param params  (required)
   */
  @RequestLine("GET /api/payment/sepay/success?params={params}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> handleSuccessWithHttpInfo(@Param("params") @jakarta.annotation.Nonnull Map<String, String> params);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>handleSuccess</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HandleSuccessQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>params -  (required)</li>
   *   </ul>
   */
  @RequestLine("GET /api/payment/sepay/success?params={params}")
  @Headers({
  "Accept: application/json",
  })
  void handleSuccess(@QueryMap(encoded=true) HandleSuccessQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>handleSuccess</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>params -  (required)</li>
      *   </ul>
      */
      @RequestLine("GET /api/payment/sepay/success?params={params}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> handleSuccessWithHttpInfo(@QueryMap(encoded=true) HandleSuccessQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>handleSuccess</code> method in a fluent style.
   */
  public static class HandleSuccessQueryParams extends HashMap<String, Object> {
    public HandleSuccessQueryParams params(@jakarta.annotation.Nonnull final Map<String, String> value) {
      put("params", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param body  (required)
   * @param xSignature  (optional)
   * @return String
   */
  @RequestLine("POST /api/payment/sepay/webhook")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
    "X-Signature: {xSignature}"
  })
  String handleWebhook2(@jakarta.annotation.Nonnull String body, @Param("xSignature") @jakarta.annotation.Nullable String xSignature);

  /**
   * 
   * Similar to <code>handleWebhook2</code> but it also returns the http response headers .
   * 
   * @param body  (required)
   * @param xSignature  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/payment/sepay/webhook")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
    "X-Signature: {xSignature}"
  })
  ApiResponse<String> handleWebhook2WithHttpInfo(@jakarta.annotation.Nonnull String body, @Param("xSignature") @jakarta.annotation.Nullable String xSignature);



  /**
   * 
   * 
   * @param orderId  (required)
   * @return Map&lt;String, Object&gt;
   */
  @RequestLine("GET /api/payment/sepay/query?orderId={orderId}")
  @Headers({
    "Accept: */*",
  })
  Map<String, Object> queryOrderDetail(@Param("orderId") @jakarta.annotation.Nonnull String orderId);

  /**
   * 
   * Similar to <code>queryOrderDetail</code> but it also returns the http response headers .
   * 
   * @param orderId  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/payment/sepay/query?orderId={orderId}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Map<String, Object>> queryOrderDetailWithHttpInfo(@Param("orderId") @jakarta.annotation.Nonnull String orderId);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>queryOrderDetail</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryOrderDetailQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>orderId -  (required)</li>
   *   </ul>
   * @return Map&lt;String, Object&gt;
   */
  @RequestLine("GET /api/payment/sepay/query?orderId={orderId}")
  @Headers({
  "Accept: */*",
  })
  Map<String, Object> queryOrderDetail(@QueryMap(encoded=true) QueryOrderDetailQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>queryOrderDetail</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>orderId -  (required)</li>
      *   </ul>
          * @return Map&lt;String, Object&gt;
      */
      @RequestLine("GET /api/payment/sepay/query?orderId={orderId}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Map<String, Object>> queryOrderDetailWithHttpInfo(@QueryMap(encoded=true) QueryOrderDetailQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>queryOrderDetail</code> method in a fluent style.
   */
  public static class QueryOrderDetailQueryParams extends HashMap<String, Object> {
    public QueryOrderDetailQueryParams orderId(@jakarta.annotation.Nonnull final String value) {
      put("orderId", EncodingUtils.encode(value));
      return this;
    }
  }
}
