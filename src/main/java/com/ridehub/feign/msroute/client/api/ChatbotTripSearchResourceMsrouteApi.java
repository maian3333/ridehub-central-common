package com.ridehub.feign.msroute.client.api;

import com.ridehub.feign.msroute.client.invoker.ApiClient;
import com.ridehub.feign.msroute.client.invoker.EncodingUtils;
import com.ridehub.feign.msroute.client.model.ApiResponse;

import com.ridehub.feign.msroute.client.model.ChatbotTripSearchRequest;
import com.ridehub.feign.msroute.client.model.PageTripDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface ChatbotTripSearchResourceMsrouteApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param chatbotTripSearchRequest  (required)
   * @param page Zero-based page index (0..N) (optional, default to 0)
   * @param size The size of the page to be returned (optional, default to 20)
   * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return PageTripDTO
   */
  @RequestLine("POST /api/chatbot/trips/search?page={page}&size={size}&sort={sort}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  PageTripDTO searchTrips(@jakarta.annotation.Nonnull ChatbotTripSearchRequest chatbotTripSearchRequest, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);

  /**
   * 
   * Similar to <code>searchTrips</code> but it also returns the http response headers .
   * 
   * @param chatbotTripSearchRequest  (required)
   * @param page Zero-based page index (0..N) (optional, default to 0)
   * @param size The size of the page to be returned (optional, default to 20)
   * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/chatbot/trips/search?page={page}&size={size}&sort={sort}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<PageTripDTO> searchTripsWithHttpInfo(@jakarta.annotation.Nonnull ChatbotTripSearchRequest chatbotTripSearchRequest, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>searchTrips</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SearchTripsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param chatbotTripSearchRequest  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Zero-based page index (0..N) (optional, default to 0)</li>
   *   <li>size - The size of the page to be returned (optional, default to 20)</li>
   *   <li>sort - Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
   *   </ul>
   * @return PageTripDTO
   */
  @RequestLine("POST /api/chatbot/trips/search?page={page}&size={size}&sort={sort}")
  @Headers({
  "Content-Type: application/json",
  "Accept: */*",
  })
  PageTripDTO searchTrips(@jakarta.annotation.Nonnull ChatbotTripSearchRequest chatbotTripSearchRequest, @QueryMap(encoded=true) SearchTripsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>searchTrips</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param chatbotTripSearchRequest  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Zero-based page index (0..N) (optional, default to 0)</li>
          *   <li>size - The size of the page to be returned (optional, default to 20)</li>
          *   <li>sort - Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
      *   </ul>
          * @return PageTripDTO
      */
      @RequestLine("POST /api/chatbot/trips/search?page={page}&size={size}&sort={sort}")
      @Headers({
    "Content-Type: application/json",
    "Accept: */*",
      })
   ApiResponse<PageTripDTO> searchTripsWithHttpInfo(@jakarta.annotation.Nonnull ChatbotTripSearchRequest chatbotTripSearchRequest, @QueryMap(encoded=true) SearchTripsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>searchTrips</code> method in a fluent style.
   */
  public static class SearchTripsQueryParams extends HashMap<String, Object> {
    public SearchTripsQueryParams page(@jakarta.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public SearchTripsQueryParams size(@jakarta.annotation.Nullable final Integer value) {
      put("size", EncodingUtils.encode(value));
      return this;
    }
    public SearchTripsQueryParams sort(@jakarta.annotation.Nullable final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
}
