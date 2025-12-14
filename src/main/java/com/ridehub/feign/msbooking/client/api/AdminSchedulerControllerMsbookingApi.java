package com.ridehub.feign.msbooking.client.api;

import com.ridehub.feign.msbooking.client.invoker.ApiClient;
import com.ridehub.feign.msbooking.client.invoker.EncodingUtils;
import com.ridehub.feign.msbooking.client.model.ApiResponse;

import com.ridehub.feign.msbooking.client.model.CleanupReport;
import com.ridehub.feign.msbooking.client.model.CleanupStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface AdminSchedulerControllerMsbookingApi extends ApiClient.Api {


  /**
   * 
   * 
   * @return CleanupStatus
   */
  @RequestLine("GET /api/admin/cleanup/status")
  @Headers({
    "Accept: */*",
  })
  CleanupStatus getCleanupStatus();

  /**
   * 
   * Similar to <code>getCleanupStatus</code> but it also returns the http response headers .
   * 
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/admin/cleanup/status")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<CleanupStatus> getCleanupStatusWithHttpInfo();



  /**
   * 
   * 
   * @return CleanupReport
   */
  @RequestLine("POST /api/admin/cleanup")
  @Headers({
    "Accept: */*",
  })
  CleanupReport triggerCleanup();

  /**
   * 
   * Similar to <code>triggerCleanup</code> but it also returns the http response headers .
   * 
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/admin/cleanup")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<CleanupReport> triggerCleanupWithHttpInfo();


}
