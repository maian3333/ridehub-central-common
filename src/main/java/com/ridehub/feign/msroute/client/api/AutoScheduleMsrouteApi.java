package com.ridehub.feign.msroute.client.api;

import com.ridehub.feign.msroute.client.invoker.ApiClient;
import com.ridehub.feign.msroute.client.invoker.EncodingUtils;
import com.ridehub.feign.msroute.client.model.ApiResponse;

import com.ridehub.feign.msroute.client.model.AutoScheduleResponse;
import com.ridehub.feign.msroute.client.model.AutoScheduleStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface AutoScheduleMsrouteApi extends ApiClient.Api {


  /**
   * Get auto-scheduling status
   * Returns the current status of the auto-scheduling system
   * @return AutoScheduleStatus
   */
  @RequestLine("GET /api/auto-schedule/status")
  @Headers({
    "Accept: */*",
  })
  AutoScheduleStatus getAutoScheduleStatus();

  /**
   * Get auto-scheduling status
   * Similar to <code>getAutoScheduleStatus</code> but it also returns the http response headers .
   * Returns the current status of the auto-scheduling system
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/auto-schedule/status")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<AutoScheduleStatus> getAutoScheduleStatusWithHttpInfo();



  /**
   * Manually trigger auto-scheduling process
   * Triggers the auto-scheduling process to create trips for active schedules
   * @return AutoScheduleResponse
   */
  @RequestLine("POST /api/auto-schedule/trigger")
  @Headers({
    "Accept: */*",
  })
  AutoScheduleResponse triggerAutoSchedule();

  /**
   * Manually trigger auto-scheduling process
   * Similar to <code>triggerAutoSchedule</code> but it also returns the http response headers .
   * Triggers the auto-scheduling process to create trips for active schedules
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/auto-schedule/trigger")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<AutoScheduleResponse> triggerAutoScheduleWithHttpInfo();


}
