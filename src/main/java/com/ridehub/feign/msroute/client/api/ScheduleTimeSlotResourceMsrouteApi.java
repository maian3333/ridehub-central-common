package com.ridehub.feign.msroute.client.api;

import com.ridehub.feign.msroute.client.invoker.ApiClient;
import com.ridehub.feign.msroute.client.invoker.EncodingUtils;
import com.ridehub.feign.msroute.client.model.ApiResponse;

import java.time.OffsetDateTime;
import com.ridehub.feign.msroute.client.model.ScheduleTimeSlotDTO;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface ScheduleTimeSlotResourceMsrouteApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param idGreaterThan  (optional)
   * @param idLessThan  (optional)
   * @param idGreaterThanOrEqual  (optional)
   * @param idLessThanOrEqual  (optional)
   * @param idEquals  (optional)
   * @param idNotEquals  (optional)
   * @param idSpecified  (optional)
   * @param idIn  (optional)
   * @param idNotIn  (optional)
   * @param slotCodeContains  (optional)
   * @param slotCodeDoesNotContain  (optional)
   * @param slotCodeEquals  (optional)
   * @param slotCodeNotEquals  (optional)
   * @param slotCodeSpecified  (optional)
   * @param slotCodeIn  (optional)
   * @param slotCodeNotIn  (optional)
   * @param departureTimeGreaterThan  (optional)
   * @param departureTimeLessThan  (optional)
   * @param departureTimeGreaterThanOrEqual  (optional)
   * @param departureTimeLessThanOrEqual  (optional)
   * @param departureTimeEquals  (optional)
   * @param departureTimeNotEquals  (optional)
   * @param departureTimeSpecified  (optional)
   * @param departureTimeIn  (optional)
   * @param departureTimeNotIn  (optional)
   * @param arrivalTimeGreaterThan  (optional)
   * @param arrivalTimeLessThan  (optional)
   * @param arrivalTimeGreaterThanOrEqual  (optional)
   * @param arrivalTimeLessThanOrEqual  (optional)
   * @param arrivalTimeEquals  (optional)
   * @param arrivalTimeNotEquals  (optional)
   * @param arrivalTimeSpecified  (optional)
   * @param arrivalTimeIn  (optional)
   * @param arrivalTimeNotIn  (optional)
   * @param bufferMinutesGreaterThan  (optional)
   * @param bufferMinutesLessThan  (optional)
   * @param bufferMinutesGreaterThanOrEqual  (optional)
   * @param bufferMinutesLessThanOrEqual  (optional)
   * @param bufferMinutesEquals  (optional)
   * @param bufferMinutesNotEquals  (optional)
   * @param bufferMinutesSpecified  (optional)
   * @param bufferMinutesIn  (optional)
   * @param bufferMinutesNotIn  (optional)
   * @param sequenceGreaterThan  (optional)
   * @param sequenceLessThan  (optional)
   * @param sequenceGreaterThanOrEqual  (optional)
   * @param sequenceLessThanOrEqual  (optional)
   * @param sequenceEquals  (optional)
   * @param sequenceNotEquals  (optional)
   * @param sequenceSpecified  (optional)
   * @param sequenceIn  (optional)
   * @param sequenceNotIn  (optional)
   * @param activeEquals  (optional)
   * @param activeNotEquals  (optional)
   * @param activeSpecified  (optional)
   * @param activeIn  (optional)
   * @param activeNotIn  (optional)
   * @param createdAtGreaterThan  (optional)
   * @param createdAtLessThan  (optional)
   * @param createdAtGreaterThanOrEqual  (optional)
   * @param createdAtLessThanOrEqual  (optional)
   * @param createdAtEquals  (optional)
   * @param createdAtNotEquals  (optional)
   * @param createdAtSpecified  (optional)
   * @param createdAtIn  (optional)
   * @param createdAtNotIn  (optional)
   * @param updatedAtGreaterThan  (optional)
   * @param updatedAtLessThan  (optional)
   * @param updatedAtGreaterThanOrEqual  (optional)
   * @param updatedAtLessThanOrEqual  (optional)
   * @param updatedAtEquals  (optional)
   * @param updatedAtNotEquals  (optional)
   * @param updatedAtSpecified  (optional)
   * @param updatedAtIn  (optional)
   * @param updatedAtNotIn  (optional)
   * @param isDeletedEquals  (optional)
   * @param isDeletedNotEquals  (optional)
   * @param isDeletedSpecified  (optional)
   * @param isDeletedIn  (optional)
   * @param isDeletedNotIn  (optional)
   * @param deletedAtGreaterThan  (optional)
   * @param deletedAtLessThan  (optional)
   * @param deletedAtGreaterThanOrEqual  (optional)
   * @param deletedAtLessThanOrEqual  (optional)
   * @param deletedAtEquals  (optional)
   * @param deletedAtNotEquals  (optional)
   * @param deletedAtSpecified  (optional)
   * @param deletedAtIn  (optional)
   * @param deletedAtNotIn  (optional)
   * @param deletedByEquals  (optional)
   * @param deletedByNotEquals  (optional)
   * @param deletedBySpecified  (optional)
   * @param deletedByIn  (optional)
   * @param deletedByNotIn  (optional)
   * @param scheduleIdGreaterThan  (optional)
   * @param scheduleIdLessThan  (optional)
   * @param scheduleIdGreaterThanOrEqual  (optional)
   * @param scheduleIdLessThanOrEqual  (optional)
   * @param scheduleIdEquals  (optional)
   * @param scheduleIdNotEquals  (optional)
   * @param scheduleIdSpecified  (optional)
   * @param scheduleIdIn  (optional)
   * @param scheduleIdNotIn  (optional)
   * @param distinct  (optional)
   * @return Long
   */
  @RequestLine("GET /api/schedule-time-slots/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&slotCode.contains={slotCodeContains}&slotCode.doesNotContain={slotCodeDoesNotContain}&slotCode.equals={slotCodeEquals}&slotCode.notEquals={slotCodeNotEquals}&slotCode.specified={slotCodeSpecified}&slotCode.in={slotCodeIn}&slotCode.notIn={slotCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&bufferMinutes.greaterThan={bufferMinutesGreaterThan}&bufferMinutes.lessThan={bufferMinutesLessThan}&bufferMinutes.greaterThanOrEqual={bufferMinutesGreaterThanOrEqual}&bufferMinutes.lessThanOrEqual={bufferMinutesLessThanOrEqual}&bufferMinutes.equals={bufferMinutesEquals}&bufferMinutes.notEquals={bufferMinutesNotEquals}&bufferMinutes.specified={bufferMinutesSpecified}&bufferMinutes.in={bufferMinutesIn}&bufferMinutes.notIn={bufferMinutesNotIn}&sequence.greaterThan={sequenceGreaterThan}&sequence.lessThan={sequenceLessThan}&sequence.greaterThanOrEqual={sequenceGreaterThanOrEqual}&sequence.lessThanOrEqual={sequenceLessThanOrEqual}&sequence.equals={sequenceEquals}&sequence.notEquals={sequenceNotEquals}&sequence.specified={sequenceSpecified}&sequence.in={sequenceIn}&sequence.notIn={sequenceNotIn}&active.equals={activeEquals}&active.notEquals={activeNotEquals}&active.specified={activeSpecified}&active.in={activeIn}&active.notIn={activeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&scheduleId.greaterThan={scheduleIdGreaterThan}&scheduleId.lessThan={scheduleIdLessThan}&scheduleId.greaterThanOrEqual={scheduleIdGreaterThanOrEqual}&scheduleId.lessThanOrEqual={scheduleIdLessThanOrEqual}&scheduleId.equals={scheduleIdEquals}&scheduleId.notEquals={scheduleIdNotEquals}&scheduleId.specified={scheduleIdSpecified}&scheduleId.in={scheduleIdIn}&scheduleId.notIn={scheduleIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countScheduleTimeSlots(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("slotCodeContains") @jakarta.annotation.Nullable String slotCodeContains, @Param("slotCodeDoesNotContain") @jakarta.annotation.Nullable String slotCodeDoesNotContain, @Param("slotCodeEquals") @jakarta.annotation.Nullable String slotCodeEquals, @Param("slotCodeNotEquals") @jakarta.annotation.Nullable String slotCodeNotEquals, @Param("slotCodeSpecified") @jakarta.annotation.Nullable Boolean slotCodeSpecified, @Param("slotCodeIn") @jakarta.annotation.Nullable List<String> slotCodeIn, @Param("slotCodeNotIn") @jakarta.annotation.Nullable List<String> slotCodeNotIn, @Param("departureTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThan, @Param("departureTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThan, @Param("departureTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThanOrEqual, @Param("departureTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThanOrEqual, @Param("departureTimeEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeEquals, @Param("departureTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeNotEquals, @Param("departureTimeSpecified") @jakarta.annotation.Nullable Boolean departureTimeSpecified, @Param("departureTimeIn") @jakarta.annotation.Nullable List<String> departureTimeIn, @Param("departureTimeNotIn") @jakarta.annotation.Nullable List<String> departureTimeNotIn, @Param("arrivalTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThan, @Param("arrivalTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThan, @Param("arrivalTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThanOrEqual, @Param("arrivalTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThanOrEqual, @Param("arrivalTimeEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeEquals, @Param("arrivalTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeNotEquals, @Param("arrivalTimeSpecified") @jakarta.annotation.Nullable Boolean arrivalTimeSpecified, @Param("arrivalTimeIn") @jakarta.annotation.Nullable List<String> arrivalTimeIn, @Param("arrivalTimeNotIn") @jakarta.annotation.Nullable List<String> arrivalTimeNotIn, @Param("bufferMinutesGreaterThan") @jakarta.annotation.Nullable Integer bufferMinutesGreaterThan, @Param("bufferMinutesLessThan") @jakarta.annotation.Nullable Integer bufferMinutesLessThan, @Param("bufferMinutesGreaterThanOrEqual") @jakarta.annotation.Nullable Integer bufferMinutesGreaterThanOrEqual, @Param("bufferMinutesLessThanOrEqual") @jakarta.annotation.Nullable Integer bufferMinutesLessThanOrEqual, @Param("bufferMinutesEquals") @jakarta.annotation.Nullable Integer bufferMinutesEquals, @Param("bufferMinutesNotEquals") @jakarta.annotation.Nullable Integer bufferMinutesNotEquals, @Param("bufferMinutesSpecified") @jakarta.annotation.Nullable Boolean bufferMinutesSpecified, @Param("bufferMinutesIn") @jakarta.annotation.Nullable List<Integer> bufferMinutesIn, @Param("bufferMinutesNotIn") @jakarta.annotation.Nullable List<Integer> bufferMinutesNotIn, @Param("sequenceGreaterThan") @jakarta.annotation.Nullable Integer sequenceGreaterThan, @Param("sequenceLessThan") @jakarta.annotation.Nullable Integer sequenceLessThan, @Param("sequenceGreaterThanOrEqual") @jakarta.annotation.Nullable Integer sequenceGreaterThanOrEqual, @Param("sequenceLessThanOrEqual") @jakarta.annotation.Nullable Integer sequenceLessThanOrEqual, @Param("sequenceEquals") @jakarta.annotation.Nullable Integer sequenceEquals, @Param("sequenceNotEquals") @jakarta.annotation.Nullable Integer sequenceNotEquals, @Param("sequenceSpecified") @jakarta.annotation.Nullable Boolean sequenceSpecified, @Param("sequenceIn") @jakarta.annotation.Nullable List<Integer> sequenceIn, @Param("sequenceNotIn") @jakarta.annotation.Nullable List<Integer> sequenceNotIn, @Param("activeEquals") @jakarta.annotation.Nullable Boolean activeEquals, @Param("activeNotEquals") @jakarta.annotation.Nullable Boolean activeNotEquals, @Param("activeSpecified") @jakarta.annotation.Nullable Boolean activeSpecified, @Param("activeIn") @jakarta.annotation.Nullable List<Boolean> activeIn, @Param("activeNotIn") @jakarta.annotation.Nullable List<Boolean> activeNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("scheduleIdGreaterThan") @jakarta.annotation.Nullable Long scheduleIdGreaterThan, @Param("scheduleIdLessThan") @jakarta.annotation.Nullable Long scheduleIdLessThan, @Param("scheduleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long scheduleIdGreaterThanOrEqual, @Param("scheduleIdLessThanOrEqual") @jakarta.annotation.Nullable Long scheduleIdLessThanOrEqual, @Param("scheduleIdEquals") @jakarta.annotation.Nullable Long scheduleIdEquals, @Param("scheduleIdNotEquals") @jakarta.annotation.Nullable Long scheduleIdNotEquals, @Param("scheduleIdSpecified") @jakarta.annotation.Nullable Boolean scheduleIdSpecified, @Param("scheduleIdIn") @jakarta.annotation.Nullable List<Long> scheduleIdIn, @Param("scheduleIdNotIn") @jakarta.annotation.Nullable List<Long> scheduleIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countScheduleTimeSlots</code> but it also returns the http response headers .
   * 
   * @param idGreaterThan  (optional)
   * @param idLessThan  (optional)
   * @param idGreaterThanOrEqual  (optional)
   * @param idLessThanOrEqual  (optional)
   * @param idEquals  (optional)
   * @param idNotEquals  (optional)
   * @param idSpecified  (optional)
   * @param idIn  (optional)
   * @param idNotIn  (optional)
   * @param slotCodeContains  (optional)
   * @param slotCodeDoesNotContain  (optional)
   * @param slotCodeEquals  (optional)
   * @param slotCodeNotEquals  (optional)
   * @param slotCodeSpecified  (optional)
   * @param slotCodeIn  (optional)
   * @param slotCodeNotIn  (optional)
   * @param departureTimeGreaterThan  (optional)
   * @param departureTimeLessThan  (optional)
   * @param departureTimeGreaterThanOrEqual  (optional)
   * @param departureTimeLessThanOrEqual  (optional)
   * @param departureTimeEquals  (optional)
   * @param departureTimeNotEquals  (optional)
   * @param departureTimeSpecified  (optional)
   * @param departureTimeIn  (optional)
   * @param departureTimeNotIn  (optional)
   * @param arrivalTimeGreaterThan  (optional)
   * @param arrivalTimeLessThan  (optional)
   * @param arrivalTimeGreaterThanOrEqual  (optional)
   * @param arrivalTimeLessThanOrEqual  (optional)
   * @param arrivalTimeEquals  (optional)
   * @param arrivalTimeNotEquals  (optional)
   * @param arrivalTimeSpecified  (optional)
   * @param arrivalTimeIn  (optional)
   * @param arrivalTimeNotIn  (optional)
   * @param bufferMinutesGreaterThan  (optional)
   * @param bufferMinutesLessThan  (optional)
   * @param bufferMinutesGreaterThanOrEqual  (optional)
   * @param bufferMinutesLessThanOrEqual  (optional)
   * @param bufferMinutesEquals  (optional)
   * @param bufferMinutesNotEquals  (optional)
   * @param bufferMinutesSpecified  (optional)
   * @param bufferMinutesIn  (optional)
   * @param bufferMinutesNotIn  (optional)
   * @param sequenceGreaterThan  (optional)
   * @param sequenceLessThan  (optional)
   * @param sequenceGreaterThanOrEqual  (optional)
   * @param sequenceLessThanOrEqual  (optional)
   * @param sequenceEquals  (optional)
   * @param sequenceNotEquals  (optional)
   * @param sequenceSpecified  (optional)
   * @param sequenceIn  (optional)
   * @param sequenceNotIn  (optional)
   * @param activeEquals  (optional)
   * @param activeNotEquals  (optional)
   * @param activeSpecified  (optional)
   * @param activeIn  (optional)
   * @param activeNotIn  (optional)
   * @param createdAtGreaterThan  (optional)
   * @param createdAtLessThan  (optional)
   * @param createdAtGreaterThanOrEqual  (optional)
   * @param createdAtLessThanOrEqual  (optional)
   * @param createdAtEquals  (optional)
   * @param createdAtNotEquals  (optional)
   * @param createdAtSpecified  (optional)
   * @param createdAtIn  (optional)
   * @param createdAtNotIn  (optional)
   * @param updatedAtGreaterThan  (optional)
   * @param updatedAtLessThan  (optional)
   * @param updatedAtGreaterThanOrEqual  (optional)
   * @param updatedAtLessThanOrEqual  (optional)
   * @param updatedAtEquals  (optional)
   * @param updatedAtNotEquals  (optional)
   * @param updatedAtSpecified  (optional)
   * @param updatedAtIn  (optional)
   * @param updatedAtNotIn  (optional)
   * @param isDeletedEquals  (optional)
   * @param isDeletedNotEquals  (optional)
   * @param isDeletedSpecified  (optional)
   * @param isDeletedIn  (optional)
   * @param isDeletedNotIn  (optional)
   * @param deletedAtGreaterThan  (optional)
   * @param deletedAtLessThan  (optional)
   * @param deletedAtGreaterThanOrEqual  (optional)
   * @param deletedAtLessThanOrEqual  (optional)
   * @param deletedAtEquals  (optional)
   * @param deletedAtNotEquals  (optional)
   * @param deletedAtSpecified  (optional)
   * @param deletedAtIn  (optional)
   * @param deletedAtNotIn  (optional)
   * @param deletedByEquals  (optional)
   * @param deletedByNotEquals  (optional)
   * @param deletedBySpecified  (optional)
   * @param deletedByIn  (optional)
   * @param deletedByNotIn  (optional)
   * @param scheduleIdGreaterThan  (optional)
   * @param scheduleIdLessThan  (optional)
   * @param scheduleIdGreaterThanOrEqual  (optional)
   * @param scheduleIdLessThanOrEqual  (optional)
   * @param scheduleIdEquals  (optional)
   * @param scheduleIdNotEquals  (optional)
   * @param scheduleIdSpecified  (optional)
   * @param scheduleIdIn  (optional)
   * @param scheduleIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/schedule-time-slots/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&slotCode.contains={slotCodeContains}&slotCode.doesNotContain={slotCodeDoesNotContain}&slotCode.equals={slotCodeEquals}&slotCode.notEquals={slotCodeNotEquals}&slotCode.specified={slotCodeSpecified}&slotCode.in={slotCodeIn}&slotCode.notIn={slotCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&bufferMinutes.greaterThan={bufferMinutesGreaterThan}&bufferMinutes.lessThan={bufferMinutesLessThan}&bufferMinutes.greaterThanOrEqual={bufferMinutesGreaterThanOrEqual}&bufferMinutes.lessThanOrEqual={bufferMinutesLessThanOrEqual}&bufferMinutes.equals={bufferMinutesEquals}&bufferMinutes.notEquals={bufferMinutesNotEquals}&bufferMinutes.specified={bufferMinutesSpecified}&bufferMinutes.in={bufferMinutesIn}&bufferMinutes.notIn={bufferMinutesNotIn}&sequence.greaterThan={sequenceGreaterThan}&sequence.lessThan={sequenceLessThan}&sequence.greaterThanOrEqual={sequenceGreaterThanOrEqual}&sequence.lessThanOrEqual={sequenceLessThanOrEqual}&sequence.equals={sequenceEquals}&sequence.notEquals={sequenceNotEquals}&sequence.specified={sequenceSpecified}&sequence.in={sequenceIn}&sequence.notIn={sequenceNotIn}&active.equals={activeEquals}&active.notEquals={activeNotEquals}&active.specified={activeSpecified}&active.in={activeIn}&active.notIn={activeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&scheduleId.greaterThan={scheduleIdGreaterThan}&scheduleId.lessThan={scheduleIdLessThan}&scheduleId.greaterThanOrEqual={scheduleIdGreaterThanOrEqual}&scheduleId.lessThanOrEqual={scheduleIdLessThanOrEqual}&scheduleId.equals={scheduleIdEquals}&scheduleId.notEquals={scheduleIdNotEquals}&scheduleId.specified={scheduleIdSpecified}&scheduleId.in={scheduleIdIn}&scheduleId.notIn={scheduleIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countScheduleTimeSlotsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("slotCodeContains") @jakarta.annotation.Nullable String slotCodeContains, @Param("slotCodeDoesNotContain") @jakarta.annotation.Nullable String slotCodeDoesNotContain, @Param("slotCodeEquals") @jakarta.annotation.Nullable String slotCodeEquals, @Param("slotCodeNotEquals") @jakarta.annotation.Nullable String slotCodeNotEquals, @Param("slotCodeSpecified") @jakarta.annotation.Nullable Boolean slotCodeSpecified, @Param("slotCodeIn") @jakarta.annotation.Nullable List<String> slotCodeIn, @Param("slotCodeNotIn") @jakarta.annotation.Nullable List<String> slotCodeNotIn, @Param("departureTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThan, @Param("departureTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThan, @Param("departureTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThanOrEqual, @Param("departureTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThanOrEqual, @Param("departureTimeEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeEquals, @Param("departureTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeNotEquals, @Param("departureTimeSpecified") @jakarta.annotation.Nullable Boolean departureTimeSpecified, @Param("departureTimeIn") @jakarta.annotation.Nullable List<String> departureTimeIn, @Param("departureTimeNotIn") @jakarta.annotation.Nullable List<String> departureTimeNotIn, @Param("arrivalTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThan, @Param("arrivalTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThan, @Param("arrivalTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThanOrEqual, @Param("arrivalTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThanOrEqual, @Param("arrivalTimeEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeEquals, @Param("arrivalTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeNotEquals, @Param("arrivalTimeSpecified") @jakarta.annotation.Nullable Boolean arrivalTimeSpecified, @Param("arrivalTimeIn") @jakarta.annotation.Nullable List<String> arrivalTimeIn, @Param("arrivalTimeNotIn") @jakarta.annotation.Nullable List<String> arrivalTimeNotIn, @Param("bufferMinutesGreaterThan") @jakarta.annotation.Nullable Integer bufferMinutesGreaterThan, @Param("bufferMinutesLessThan") @jakarta.annotation.Nullable Integer bufferMinutesLessThan, @Param("bufferMinutesGreaterThanOrEqual") @jakarta.annotation.Nullable Integer bufferMinutesGreaterThanOrEqual, @Param("bufferMinutesLessThanOrEqual") @jakarta.annotation.Nullable Integer bufferMinutesLessThanOrEqual, @Param("bufferMinutesEquals") @jakarta.annotation.Nullable Integer bufferMinutesEquals, @Param("bufferMinutesNotEquals") @jakarta.annotation.Nullable Integer bufferMinutesNotEquals, @Param("bufferMinutesSpecified") @jakarta.annotation.Nullable Boolean bufferMinutesSpecified, @Param("bufferMinutesIn") @jakarta.annotation.Nullable List<Integer> bufferMinutesIn, @Param("bufferMinutesNotIn") @jakarta.annotation.Nullable List<Integer> bufferMinutesNotIn, @Param("sequenceGreaterThan") @jakarta.annotation.Nullable Integer sequenceGreaterThan, @Param("sequenceLessThan") @jakarta.annotation.Nullable Integer sequenceLessThan, @Param("sequenceGreaterThanOrEqual") @jakarta.annotation.Nullable Integer sequenceGreaterThanOrEqual, @Param("sequenceLessThanOrEqual") @jakarta.annotation.Nullable Integer sequenceLessThanOrEqual, @Param("sequenceEquals") @jakarta.annotation.Nullable Integer sequenceEquals, @Param("sequenceNotEquals") @jakarta.annotation.Nullable Integer sequenceNotEquals, @Param("sequenceSpecified") @jakarta.annotation.Nullable Boolean sequenceSpecified, @Param("sequenceIn") @jakarta.annotation.Nullable List<Integer> sequenceIn, @Param("sequenceNotIn") @jakarta.annotation.Nullable List<Integer> sequenceNotIn, @Param("activeEquals") @jakarta.annotation.Nullable Boolean activeEquals, @Param("activeNotEquals") @jakarta.annotation.Nullable Boolean activeNotEquals, @Param("activeSpecified") @jakarta.annotation.Nullable Boolean activeSpecified, @Param("activeIn") @jakarta.annotation.Nullable List<Boolean> activeIn, @Param("activeNotIn") @jakarta.annotation.Nullable List<Boolean> activeNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("scheduleIdGreaterThan") @jakarta.annotation.Nullable Long scheduleIdGreaterThan, @Param("scheduleIdLessThan") @jakarta.annotation.Nullable Long scheduleIdLessThan, @Param("scheduleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long scheduleIdGreaterThanOrEqual, @Param("scheduleIdLessThanOrEqual") @jakarta.annotation.Nullable Long scheduleIdLessThanOrEqual, @Param("scheduleIdEquals") @jakarta.annotation.Nullable Long scheduleIdEquals, @Param("scheduleIdNotEquals") @jakarta.annotation.Nullable Long scheduleIdNotEquals, @Param("scheduleIdSpecified") @jakarta.annotation.Nullable Boolean scheduleIdSpecified, @Param("scheduleIdIn") @jakarta.annotation.Nullable List<Long> scheduleIdIn, @Param("scheduleIdNotIn") @jakarta.annotation.Nullable List<Long> scheduleIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countScheduleTimeSlots</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountScheduleTimeSlotsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>idGreaterThan -  (optional)</li>
   *   <li>idLessThan -  (optional)</li>
   *   <li>idGreaterThanOrEqual -  (optional)</li>
   *   <li>idLessThanOrEqual -  (optional)</li>
   *   <li>idEquals -  (optional)</li>
   *   <li>idNotEquals -  (optional)</li>
   *   <li>idSpecified -  (optional)</li>
   *   <li>idIn -  (optional)</li>
   *   <li>idNotIn -  (optional)</li>
   *   <li>slotCodeContains -  (optional)</li>
   *   <li>slotCodeDoesNotContain -  (optional)</li>
   *   <li>slotCodeEquals -  (optional)</li>
   *   <li>slotCodeNotEquals -  (optional)</li>
   *   <li>slotCodeSpecified -  (optional)</li>
   *   <li>slotCodeIn -  (optional)</li>
   *   <li>slotCodeNotIn -  (optional)</li>
   *   <li>departureTimeGreaterThan -  (optional)</li>
   *   <li>departureTimeLessThan -  (optional)</li>
   *   <li>departureTimeGreaterThanOrEqual -  (optional)</li>
   *   <li>departureTimeLessThanOrEqual -  (optional)</li>
   *   <li>departureTimeEquals -  (optional)</li>
   *   <li>departureTimeNotEquals -  (optional)</li>
   *   <li>departureTimeSpecified -  (optional)</li>
   *   <li>departureTimeIn -  (optional)</li>
   *   <li>departureTimeNotIn -  (optional)</li>
   *   <li>arrivalTimeGreaterThan -  (optional)</li>
   *   <li>arrivalTimeLessThan -  (optional)</li>
   *   <li>arrivalTimeGreaterThanOrEqual -  (optional)</li>
   *   <li>arrivalTimeLessThanOrEqual -  (optional)</li>
   *   <li>arrivalTimeEquals -  (optional)</li>
   *   <li>arrivalTimeNotEquals -  (optional)</li>
   *   <li>arrivalTimeSpecified -  (optional)</li>
   *   <li>arrivalTimeIn -  (optional)</li>
   *   <li>arrivalTimeNotIn -  (optional)</li>
   *   <li>bufferMinutesGreaterThan -  (optional)</li>
   *   <li>bufferMinutesLessThan -  (optional)</li>
   *   <li>bufferMinutesGreaterThanOrEqual -  (optional)</li>
   *   <li>bufferMinutesLessThanOrEqual -  (optional)</li>
   *   <li>bufferMinutesEquals -  (optional)</li>
   *   <li>bufferMinutesNotEquals -  (optional)</li>
   *   <li>bufferMinutesSpecified -  (optional)</li>
   *   <li>bufferMinutesIn -  (optional)</li>
   *   <li>bufferMinutesNotIn -  (optional)</li>
   *   <li>sequenceGreaterThan -  (optional)</li>
   *   <li>sequenceLessThan -  (optional)</li>
   *   <li>sequenceGreaterThanOrEqual -  (optional)</li>
   *   <li>sequenceLessThanOrEqual -  (optional)</li>
   *   <li>sequenceEquals -  (optional)</li>
   *   <li>sequenceNotEquals -  (optional)</li>
   *   <li>sequenceSpecified -  (optional)</li>
   *   <li>sequenceIn -  (optional)</li>
   *   <li>sequenceNotIn -  (optional)</li>
   *   <li>activeEquals -  (optional)</li>
   *   <li>activeNotEquals -  (optional)</li>
   *   <li>activeSpecified -  (optional)</li>
   *   <li>activeIn -  (optional)</li>
   *   <li>activeNotIn -  (optional)</li>
   *   <li>createdAtGreaterThan -  (optional)</li>
   *   <li>createdAtLessThan -  (optional)</li>
   *   <li>createdAtGreaterThanOrEqual -  (optional)</li>
   *   <li>createdAtLessThanOrEqual -  (optional)</li>
   *   <li>createdAtEquals -  (optional)</li>
   *   <li>createdAtNotEquals -  (optional)</li>
   *   <li>createdAtSpecified -  (optional)</li>
   *   <li>createdAtIn -  (optional)</li>
   *   <li>createdAtNotIn -  (optional)</li>
   *   <li>updatedAtGreaterThan -  (optional)</li>
   *   <li>updatedAtLessThan -  (optional)</li>
   *   <li>updatedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>updatedAtLessThanOrEqual -  (optional)</li>
   *   <li>updatedAtEquals -  (optional)</li>
   *   <li>updatedAtNotEquals -  (optional)</li>
   *   <li>updatedAtSpecified -  (optional)</li>
   *   <li>updatedAtIn -  (optional)</li>
   *   <li>updatedAtNotIn -  (optional)</li>
   *   <li>isDeletedEquals -  (optional)</li>
   *   <li>isDeletedNotEquals -  (optional)</li>
   *   <li>isDeletedSpecified -  (optional)</li>
   *   <li>isDeletedIn -  (optional)</li>
   *   <li>isDeletedNotIn -  (optional)</li>
   *   <li>deletedAtGreaterThan -  (optional)</li>
   *   <li>deletedAtLessThan -  (optional)</li>
   *   <li>deletedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>deletedAtLessThanOrEqual -  (optional)</li>
   *   <li>deletedAtEquals -  (optional)</li>
   *   <li>deletedAtNotEquals -  (optional)</li>
   *   <li>deletedAtSpecified -  (optional)</li>
   *   <li>deletedAtIn -  (optional)</li>
   *   <li>deletedAtNotIn -  (optional)</li>
   *   <li>deletedByEquals -  (optional)</li>
   *   <li>deletedByNotEquals -  (optional)</li>
   *   <li>deletedBySpecified -  (optional)</li>
   *   <li>deletedByIn -  (optional)</li>
   *   <li>deletedByNotIn -  (optional)</li>
   *   <li>scheduleIdGreaterThan -  (optional)</li>
   *   <li>scheduleIdLessThan -  (optional)</li>
   *   <li>scheduleIdGreaterThanOrEqual -  (optional)</li>
   *   <li>scheduleIdLessThanOrEqual -  (optional)</li>
   *   <li>scheduleIdEquals -  (optional)</li>
   *   <li>scheduleIdNotEquals -  (optional)</li>
   *   <li>scheduleIdSpecified -  (optional)</li>
   *   <li>scheduleIdIn -  (optional)</li>
   *   <li>scheduleIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return Long
   */
  @RequestLine("GET /api/schedule-time-slots/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&slotCode.contains={slotCodeContains}&slotCode.doesNotContain={slotCodeDoesNotContain}&slotCode.equals={slotCodeEquals}&slotCode.notEquals={slotCodeNotEquals}&slotCode.specified={slotCodeSpecified}&slotCode.in={slotCodeIn}&slotCode.notIn={slotCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&bufferMinutes.greaterThan={bufferMinutesGreaterThan}&bufferMinutes.lessThan={bufferMinutesLessThan}&bufferMinutes.greaterThanOrEqual={bufferMinutesGreaterThanOrEqual}&bufferMinutes.lessThanOrEqual={bufferMinutesLessThanOrEqual}&bufferMinutes.equals={bufferMinutesEquals}&bufferMinutes.notEquals={bufferMinutesNotEquals}&bufferMinutes.specified={bufferMinutesSpecified}&bufferMinutes.in={bufferMinutesIn}&bufferMinutes.notIn={bufferMinutesNotIn}&sequence.greaterThan={sequenceGreaterThan}&sequence.lessThan={sequenceLessThan}&sequence.greaterThanOrEqual={sequenceGreaterThanOrEqual}&sequence.lessThanOrEqual={sequenceLessThanOrEqual}&sequence.equals={sequenceEquals}&sequence.notEquals={sequenceNotEquals}&sequence.specified={sequenceSpecified}&sequence.in={sequenceIn}&sequence.notIn={sequenceNotIn}&active.equals={activeEquals}&active.notEquals={activeNotEquals}&active.specified={activeSpecified}&active.in={activeIn}&active.notIn={activeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&scheduleId.greaterThan={scheduleIdGreaterThan}&scheduleId.lessThan={scheduleIdLessThan}&scheduleId.greaterThanOrEqual={scheduleIdGreaterThanOrEqual}&scheduleId.lessThanOrEqual={scheduleIdLessThanOrEqual}&scheduleId.equals={scheduleIdEquals}&scheduleId.notEquals={scheduleIdNotEquals}&scheduleId.specified={scheduleIdSpecified}&scheduleId.in={scheduleIdIn}&scheduleId.notIn={scheduleIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countScheduleTimeSlots(@QueryMap(encoded=true) CountScheduleTimeSlotsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countScheduleTimeSlots</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>idGreaterThan -  (optional)</li>
          *   <li>idLessThan -  (optional)</li>
          *   <li>idGreaterThanOrEqual -  (optional)</li>
          *   <li>idLessThanOrEqual -  (optional)</li>
          *   <li>idEquals -  (optional)</li>
          *   <li>idNotEquals -  (optional)</li>
          *   <li>idSpecified -  (optional)</li>
          *   <li>idIn -  (optional)</li>
          *   <li>idNotIn -  (optional)</li>
          *   <li>slotCodeContains -  (optional)</li>
          *   <li>slotCodeDoesNotContain -  (optional)</li>
          *   <li>slotCodeEquals -  (optional)</li>
          *   <li>slotCodeNotEquals -  (optional)</li>
          *   <li>slotCodeSpecified -  (optional)</li>
          *   <li>slotCodeIn -  (optional)</li>
          *   <li>slotCodeNotIn -  (optional)</li>
          *   <li>departureTimeGreaterThan -  (optional)</li>
          *   <li>departureTimeLessThan -  (optional)</li>
          *   <li>departureTimeGreaterThanOrEqual -  (optional)</li>
          *   <li>departureTimeLessThanOrEqual -  (optional)</li>
          *   <li>departureTimeEquals -  (optional)</li>
          *   <li>departureTimeNotEquals -  (optional)</li>
          *   <li>departureTimeSpecified -  (optional)</li>
          *   <li>departureTimeIn -  (optional)</li>
          *   <li>departureTimeNotIn -  (optional)</li>
          *   <li>arrivalTimeGreaterThan -  (optional)</li>
          *   <li>arrivalTimeLessThan -  (optional)</li>
          *   <li>arrivalTimeGreaterThanOrEqual -  (optional)</li>
          *   <li>arrivalTimeLessThanOrEqual -  (optional)</li>
          *   <li>arrivalTimeEquals -  (optional)</li>
          *   <li>arrivalTimeNotEquals -  (optional)</li>
          *   <li>arrivalTimeSpecified -  (optional)</li>
          *   <li>arrivalTimeIn -  (optional)</li>
          *   <li>arrivalTimeNotIn -  (optional)</li>
          *   <li>bufferMinutesGreaterThan -  (optional)</li>
          *   <li>bufferMinutesLessThan -  (optional)</li>
          *   <li>bufferMinutesGreaterThanOrEqual -  (optional)</li>
          *   <li>bufferMinutesLessThanOrEqual -  (optional)</li>
          *   <li>bufferMinutesEquals -  (optional)</li>
          *   <li>bufferMinutesNotEquals -  (optional)</li>
          *   <li>bufferMinutesSpecified -  (optional)</li>
          *   <li>bufferMinutesIn -  (optional)</li>
          *   <li>bufferMinutesNotIn -  (optional)</li>
          *   <li>sequenceGreaterThan -  (optional)</li>
          *   <li>sequenceLessThan -  (optional)</li>
          *   <li>sequenceGreaterThanOrEqual -  (optional)</li>
          *   <li>sequenceLessThanOrEqual -  (optional)</li>
          *   <li>sequenceEquals -  (optional)</li>
          *   <li>sequenceNotEquals -  (optional)</li>
          *   <li>sequenceSpecified -  (optional)</li>
          *   <li>sequenceIn -  (optional)</li>
          *   <li>sequenceNotIn -  (optional)</li>
          *   <li>activeEquals -  (optional)</li>
          *   <li>activeNotEquals -  (optional)</li>
          *   <li>activeSpecified -  (optional)</li>
          *   <li>activeIn -  (optional)</li>
          *   <li>activeNotIn -  (optional)</li>
          *   <li>createdAtGreaterThan -  (optional)</li>
          *   <li>createdAtLessThan -  (optional)</li>
          *   <li>createdAtGreaterThanOrEqual -  (optional)</li>
          *   <li>createdAtLessThanOrEqual -  (optional)</li>
          *   <li>createdAtEquals -  (optional)</li>
          *   <li>createdAtNotEquals -  (optional)</li>
          *   <li>createdAtSpecified -  (optional)</li>
          *   <li>createdAtIn -  (optional)</li>
          *   <li>createdAtNotIn -  (optional)</li>
          *   <li>updatedAtGreaterThan -  (optional)</li>
          *   <li>updatedAtLessThan -  (optional)</li>
          *   <li>updatedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>updatedAtLessThanOrEqual -  (optional)</li>
          *   <li>updatedAtEquals -  (optional)</li>
          *   <li>updatedAtNotEquals -  (optional)</li>
          *   <li>updatedAtSpecified -  (optional)</li>
          *   <li>updatedAtIn -  (optional)</li>
          *   <li>updatedAtNotIn -  (optional)</li>
          *   <li>isDeletedEquals -  (optional)</li>
          *   <li>isDeletedNotEquals -  (optional)</li>
          *   <li>isDeletedSpecified -  (optional)</li>
          *   <li>isDeletedIn -  (optional)</li>
          *   <li>isDeletedNotIn -  (optional)</li>
          *   <li>deletedAtGreaterThan -  (optional)</li>
          *   <li>deletedAtLessThan -  (optional)</li>
          *   <li>deletedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>deletedAtLessThanOrEqual -  (optional)</li>
          *   <li>deletedAtEquals -  (optional)</li>
          *   <li>deletedAtNotEquals -  (optional)</li>
          *   <li>deletedAtSpecified -  (optional)</li>
          *   <li>deletedAtIn -  (optional)</li>
          *   <li>deletedAtNotIn -  (optional)</li>
          *   <li>deletedByEquals -  (optional)</li>
          *   <li>deletedByNotEquals -  (optional)</li>
          *   <li>deletedBySpecified -  (optional)</li>
          *   <li>deletedByIn -  (optional)</li>
          *   <li>deletedByNotIn -  (optional)</li>
          *   <li>scheduleIdGreaterThan -  (optional)</li>
          *   <li>scheduleIdLessThan -  (optional)</li>
          *   <li>scheduleIdGreaterThanOrEqual -  (optional)</li>
          *   <li>scheduleIdLessThanOrEqual -  (optional)</li>
          *   <li>scheduleIdEquals -  (optional)</li>
          *   <li>scheduleIdNotEquals -  (optional)</li>
          *   <li>scheduleIdSpecified -  (optional)</li>
          *   <li>scheduleIdIn -  (optional)</li>
          *   <li>scheduleIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return Long
      */
      @RequestLine("GET /api/schedule-time-slots/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&slotCode.contains={slotCodeContains}&slotCode.doesNotContain={slotCodeDoesNotContain}&slotCode.equals={slotCodeEquals}&slotCode.notEquals={slotCodeNotEquals}&slotCode.specified={slotCodeSpecified}&slotCode.in={slotCodeIn}&slotCode.notIn={slotCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&bufferMinutes.greaterThan={bufferMinutesGreaterThan}&bufferMinutes.lessThan={bufferMinutesLessThan}&bufferMinutes.greaterThanOrEqual={bufferMinutesGreaterThanOrEqual}&bufferMinutes.lessThanOrEqual={bufferMinutesLessThanOrEqual}&bufferMinutes.equals={bufferMinutesEquals}&bufferMinutes.notEquals={bufferMinutesNotEquals}&bufferMinutes.specified={bufferMinutesSpecified}&bufferMinutes.in={bufferMinutesIn}&bufferMinutes.notIn={bufferMinutesNotIn}&sequence.greaterThan={sequenceGreaterThan}&sequence.lessThan={sequenceLessThan}&sequence.greaterThanOrEqual={sequenceGreaterThanOrEqual}&sequence.lessThanOrEqual={sequenceLessThanOrEqual}&sequence.equals={sequenceEquals}&sequence.notEquals={sequenceNotEquals}&sequence.specified={sequenceSpecified}&sequence.in={sequenceIn}&sequence.notIn={sequenceNotIn}&active.equals={activeEquals}&active.notEquals={activeNotEquals}&active.specified={activeSpecified}&active.in={activeIn}&active.notIn={activeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&scheduleId.greaterThan={scheduleIdGreaterThan}&scheduleId.lessThan={scheduleIdLessThan}&scheduleId.greaterThanOrEqual={scheduleIdGreaterThanOrEqual}&scheduleId.lessThanOrEqual={scheduleIdLessThanOrEqual}&scheduleId.equals={scheduleIdEquals}&scheduleId.notEquals={scheduleIdNotEquals}&scheduleId.specified={scheduleIdSpecified}&scheduleId.in={scheduleIdIn}&scheduleId.notIn={scheduleIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countScheduleTimeSlotsWithHttpInfo(@QueryMap(encoded=true) CountScheduleTimeSlotsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countScheduleTimeSlots</code> method in a fluent style.
   */
  public static class CountScheduleTimeSlotsQueryParams extends HashMap<String, Object> {
    public CountScheduleTimeSlotsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams slotCodeContains(@jakarta.annotation.Nullable final String value) {
      put("slotCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams slotCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("slotCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams slotCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("slotCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams slotCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("slotCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams slotCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("slotCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams slotCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("slotCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams slotCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("slotCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams departureTimeGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams departureTimeLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams departureTimeGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams departureTimeLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams departureTimeEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams departureTimeNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams departureTimeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("departureTime.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams departureTimeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("departureTime.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams departureTimeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("departureTime.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams arrivalTimeGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams arrivalTimeLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams arrivalTimeGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams arrivalTimeLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams arrivalTimeEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams arrivalTimeNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams arrivalTimeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("arrivalTime.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams arrivalTimeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("arrivalTime.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams arrivalTimeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("arrivalTime.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams bufferMinutesGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("bufferMinutes.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams bufferMinutesLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("bufferMinutes.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams bufferMinutesGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("bufferMinutes.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams bufferMinutesLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("bufferMinutes.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams bufferMinutesEquals(@jakarta.annotation.Nullable final Integer value) {
      put("bufferMinutes.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams bufferMinutesNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("bufferMinutes.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams bufferMinutesSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("bufferMinutes.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams bufferMinutesIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("bufferMinutes.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams bufferMinutesNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("bufferMinutes.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams sequenceGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("sequence.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams sequenceLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("sequence.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams sequenceGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("sequence.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams sequenceLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("sequence.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams sequenceEquals(@jakarta.annotation.Nullable final Integer value) {
      put("sequence.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams sequenceNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("sequence.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams sequenceSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("sequence.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams sequenceIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("sequence.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams sequenceNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("sequence.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams activeEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("active.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams activeNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("active.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams activeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("active.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams activeIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("active.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams activeNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("active.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams scheduleIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams scheduleIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams scheduleIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams scheduleIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams scheduleIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams scheduleIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams scheduleIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("scheduleId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams scheduleIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("scheduleId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams scheduleIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("scheduleId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleTimeSlotsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param scheduleTimeSlotDTO  (required)
   * @return ScheduleTimeSlotDTO
   */
  @RequestLine("POST /api/schedule-time-slots")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ScheduleTimeSlotDTO createScheduleTimeSlot(@jakarta.annotation.Nonnull ScheduleTimeSlotDTO scheduleTimeSlotDTO);

  /**
   * 
   * Similar to <code>createScheduleTimeSlot</code> but it also returns the http response headers .
   * 
   * @param scheduleTimeSlotDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/schedule-time-slots")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<ScheduleTimeSlotDTO> createScheduleTimeSlotWithHttpInfo(@jakarta.annotation.Nonnull ScheduleTimeSlotDTO scheduleTimeSlotDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/schedule-time-slots/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteScheduleTimeSlot(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deleteScheduleTimeSlot</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/schedule-time-slots/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteScheduleTimeSlotWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param idGreaterThan  (optional)
   * @param idLessThan  (optional)
   * @param idGreaterThanOrEqual  (optional)
   * @param idLessThanOrEqual  (optional)
   * @param idEquals  (optional)
   * @param idNotEquals  (optional)
   * @param idSpecified  (optional)
   * @param idIn  (optional)
   * @param idNotIn  (optional)
   * @param slotCodeContains  (optional)
   * @param slotCodeDoesNotContain  (optional)
   * @param slotCodeEquals  (optional)
   * @param slotCodeNotEquals  (optional)
   * @param slotCodeSpecified  (optional)
   * @param slotCodeIn  (optional)
   * @param slotCodeNotIn  (optional)
   * @param departureTimeGreaterThan  (optional)
   * @param departureTimeLessThan  (optional)
   * @param departureTimeGreaterThanOrEqual  (optional)
   * @param departureTimeLessThanOrEqual  (optional)
   * @param departureTimeEquals  (optional)
   * @param departureTimeNotEquals  (optional)
   * @param departureTimeSpecified  (optional)
   * @param departureTimeIn  (optional)
   * @param departureTimeNotIn  (optional)
   * @param arrivalTimeGreaterThan  (optional)
   * @param arrivalTimeLessThan  (optional)
   * @param arrivalTimeGreaterThanOrEqual  (optional)
   * @param arrivalTimeLessThanOrEqual  (optional)
   * @param arrivalTimeEquals  (optional)
   * @param arrivalTimeNotEquals  (optional)
   * @param arrivalTimeSpecified  (optional)
   * @param arrivalTimeIn  (optional)
   * @param arrivalTimeNotIn  (optional)
   * @param bufferMinutesGreaterThan  (optional)
   * @param bufferMinutesLessThan  (optional)
   * @param bufferMinutesGreaterThanOrEqual  (optional)
   * @param bufferMinutesLessThanOrEqual  (optional)
   * @param bufferMinutesEquals  (optional)
   * @param bufferMinutesNotEquals  (optional)
   * @param bufferMinutesSpecified  (optional)
   * @param bufferMinutesIn  (optional)
   * @param bufferMinutesNotIn  (optional)
   * @param sequenceGreaterThan  (optional)
   * @param sequenceLessThan  (optional)
   * @param sequenceGreaterThanOrEqual  (optional)
   * @param sequenceLessThanOrEqual  (optional)
   * @param sequenceEquals  (optional)
   * @param sequenceNotEquals  (optional)
   * @param sequenceSpecified  (optional)
   * @param sequenceIn  (optional)
   * @param sequenceNotIn  (optional)
   * @param activeEquals  (optional)
   * @param activeNotEquals  (optional)
   * @param activeSpecified  (optional)
   * @param activeIn  (optional)
   * @param activeNotIn  (optional)
   * @param createdAtGreaterThan  (optional)
   * @param createdAtLessThan  (optional)
   * @param createdAtGreaterThanOrEqual  (optional)
   * @param createdAtLessThanOrEqual  (optional)
   * @param createdAtEquals  (optional)
   * @param createdAtNotEquals  (optional)
   * @param createdAtSpecified  (optional)
   * @param createdAtIn  (optional)
   * @param createdAtNotIn  (optional)
   * @param updatedAtGreaterThan  (optional)
   * @param updatedAtLessThan  (optional)
   * @param updatedAtGreaterThanOrEqual  (optional)
   * @param updatedAtLessThanOrEqual  (optional)
   * @param updatedAtEquals  (optional)
   * @param updatedAtNotEquals  (optional)
   * @param updatedAtSpecified  (optional)
   * @param updatedAtIn  (optional)
   * @param updatedAtNotIn  (optional)
   * @param isDeletedEquals  (optional)
   * @param isDeletedNotEquals  (optional)
   * @param isDeletedSpecified  (optional)
   * @param isDeletedIn  (optional)
   * @param isDeletedNotIn  (optional)
   * @param deletedAtGreaterThan  (optional)
   * @param deletedAtLessThan  (optional)
   * @param deletedAtGreaterThanOrEqual  (optional)
   * @param deletedAtLessThanOrEqual  (optional)
   * @param deletedAtEquals  (optional)
   * @param deletedAtNotEquals  (optional)
   * @param deletedAtSpecified  (optional)
   * @param deletedAtIn  (optional)
   * @param deletedAtNotIn  (optional)
   * @param deletedByEquals  (optional)
   * @param deletedByNotEquals  (optional)
   * @param deletedBySpecified  (optional)
   * @param deletedByIn  (optional)
   * @param deletedByNotIn  (optional)
   * @param scheduleIdGreaterThan  (optional)
   * @param scheduleIdLessThan  (optional)
   * @param scheduleIdGreaterThanOrEqual  (optional)
   * @param scheduleIdLessThanOrEqual  (optional)
   * @param scheduleIdEquals  (optional)
   * @param scheduleIdNotEquals  (optional)
   * @param scheduleIdSpecified  (optional)
   * @param scheduleIdIn  (optional)
   * @param scheduleIdNotIn  (optional)
   * @param distinct  (optional)
   * @return List&lt;ScheduleTimeSlotDTO&gt;
   */
  @RequestLine("GET /api/schedule-time-slots?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&slotCode.contains={slotCodeContains}&slotCode.doesNotContain={slotCodeDoesNotContain}&slotCode.equals={slotCodeEquals}&slotCode.notEquals={slotCodeNotEquals}&slotCode.specified={slotCodeSpecified}&slotCode.in={slotCodeIn}&slotCode.notIn={slotCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&bufferMinutes.greaterThan={bufferMinutesGreaterThan}&bufferMinutes.lessThan={bufferMinutesLessThan}&bufferMinutes.greaterThanOrEqual={bufferMinutesGreaterThanOrEqual}&bufferMinutes.lessThanOrEqual={bufferMinutesLessThanOrEqual}&bufferMinutes.equals={bufferMinutesEquals}&bufferMinutes.notEquals={bufferMinutesNotEquals}&bufferMinutes.specified={bufferMinutesSpecified}&bufferMinutes.in={bufferMinutesIn}&bufferMinutes.notIn={bufferMinutesNotIn}&sequence.greaterThan={sequenceGreaterThan}&sequence.lessThan={sequenceLessThan}&sequence.greaterThanOrEqual={sequenceGreaterThanOrEqual}&sequence.lessThanOrEqual={sequenceLessThanOrEqual}&sequence.equals={sequenceEquals}&sequence.notEquals={sequenceNotEquals}&sequence.specified={sequenceSpecified}&sequence.in={sequenceIn}&sequence.notIn={sequenceNotIn}&active.equals={activeEquals}&active.notEquals={activeNotEquals}&active.specified={activeSpecified}&active.in={activeIn}&active.notIn={activeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&scheduleId.greaterThan={scheduleIdGreaterThan}&scheduleId.lessThan={scheduleIdLessThan}&scheduleId.greaterThanOrEqual={scheduleIdGreaterThanOrEqual}&scheduleId.lessThanOrEqual={scheduleIdLessThanOrEqual}&scheduleId.equals={scheduleIdEquals}&scheduleId.notEquals={scheduleIdNotEquals}&scheduleId.specified={scheduleIdSpecified}&scheduleId.in={scheduleIdIn}&scheduleId.notIn={scheduleIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  List<ScheduleTimeSlotDTO> getAllScheduleTimeSlots(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("slotCodeContains") @jakarta.annotation.Nullable String slotCodeContains, @Param("slotCodeDoesNotContain") @jakarta.annotation.Nullable String slotCodeDoesNotContain, @Param("slotCodeEquals") @jakarta.annotation.Nullable String slotCodeEquals, @Param("slotCodeNotEquals") @jakarta.annotation.Nullable String slotCodeNotEquals, @Param("slotCodeSpecified") @jakarta.annotation.Nullable Boolean slotCodeSpecified, @Param("slotCodeIn") @jakarta.annotation.Nullable List<String> slotCodeIn, @Param("slotCodeNotIn") @jakarta.annotation.Nullable List<String> slotCodeNotIn, @Param("departureTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThan, @Param("departureTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThan, @Param("departureTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThanOrEqual, @Param("departureTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThanOrEqual, @Param("departureTimeEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeEquals, @Param("departureTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeNotEquals, @Param("departureTimeSpecified") @jakarta.annotation.Nullable Boolean departureTimeSpecified, @Param("departureTimeIn") @jakarta.annotation.Nullable List<String> departureTimeIn, @Param("departureTimeNotIn") @jakarta.annotation.Nullable List<String> departureTimeNotIn, @Param("arrivalTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThan, @Param("arrivalTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThan, @Param("arrivalTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThanOrEqual, @Param("arrivalTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThanOrEqual, @Param("arrivalTimeEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeEquals, @Param("arrivalTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeNotEquals, @Param("arrivalTimeSpecified") @jakarta.annotation.Nullable Boolean arrivalTimeSpecified, @Param("arrivalTimeIn") @jakarta.annotation.Nullable List<String> arrivalTimeIn, @Param("arrivalTimeNotIn") @jakarta.annotation.Nullable List<String> arrivalTimeNotIn, @Param("bufferMinutesGreaterThan") @jakarta.annotation.Nullable Integer bufferMinutesGreaterThan, @Param("bufferMinutesLessThan") @jakarta.annotation.Nullable Integer bufferMinutesLessThan, @Param("bufferMinutesGreaterThanOrEqual") @jakarta.annotation.Nullable Integer bufferMinutesGreaterThanOrEqual, @Param("bufferMinutesLessThanOrEqual") @jakarta.annotation.Nullable Integer bufferMinutesLessThanOrEqual, @Param("bufferMinutesEquals") @jakarta.annotation.Nullable Integer bufferMinutesEquals, @Param("bufferMinutesNotEquals") @jakarta.annotation.Nullable Integer bufferMinutesNotEquals, @Param("bufferMinutesSpecified") @jakarta.annotation.Nullable Boolean bufferMinutesSpecified, @Param("bufferMinutesIn") @jakarta.annotation.Nullable List<Integer> bufferMinutesIn, @Param("bufferMinutesNotIn") @jakarta.annotation.Nullable List<Integer> bufferMinutesNotIn, @Param("sequenceGreaterThan") @jakarta.annotation.Nullable Integer sequenceGreaterThan, @Param("sequenceLessThan") @jakarta.annotation.Nullable Integer sequenceLessThan, @Param("sequenceGreaterThanOrEqual") @jakarta.annotation.Nullable Integer sequenceGreaterThanOrEqual, @Param("sequenceLessThanOrEqual") @jakarta.annotation.Nullable Integer sequenceLessThanOrEqual, @Param("sequenceEquals") @jakarta.annotation.Nullable Integer sequenceEquals, @Param("sequenceNotEquals") @jakarta.annotation.Nullable Integer sequenceNotEquals, @Param("sequenceSpecified") @jakarta.annotation.Nullable Boolean sequenceSpecified, @Param("sequenceIn") @jakarta.annotation.Nullable List<Integer> sequenceIn, @Param("sequenceNotIn") @jakarta.annotation.Nullable List<Integer> sequenceNotIn, @Param("activeEquals") @jakarta.annotation.Nullable Boolean activeEquals, @Param("activeNotEquals") @jakarta.annotation.Nullable Boolean activeNotEquals, @Param("activeSpecified") @jakarta.annotation.Nullable Boolean activeSpecified, @Param("activeIn") @jakarta.annotation.Nullable List<Boolean> activeIn, @Param("activeNotIn") @jakarta.annotation.Nullable List<Boolean> activeNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("scheduleIdGreaterThan") @jakarta.annotation.Nullable Long scheduleIdGreaterThan, @Param("scheduleIdLessThan") @jakarta.annotation.Nullable Long scheduleIdLessThan, @Param("scheduleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long scheduleIdGreaterThanOrEqual, @Param("scheduleIdLessThanOrEqual") @jakarta.annotation.Nullable Long scheduleIdLessThanOrEqual, @Param("scheduleIdEquals") @jakarta.annotation.Nullable Long scheduleIdEquals, @Param("scheduleIdNotEquals") @jakarta.annotation.Nullable Long scheduleIdNotEquals, @Param("scheduleIdSpecified") @jakarta.annotation.Nullable Boolean scheduleIdSpecified, @Param("scheduleIdIn") @jakarta.annotation.Nullable List<Long> scheduleIdIn, @Param("scheduleIdNotIn") @jakarta.annotation.Nullable List<Long> scheduleIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>getAllScheduleTimeSlots</code> but it also returns the http response headers .
   * 
   * @param idGreaterThan  (optional)
   * @param idLessThan  (optional)
   * @param idGreaterThanOrEqual  (optional)
   * @param idLessThanOrEqual  (optional)
   * @param idEquals  (optional)
   * @param idNotEquals  (optional)
   * @param idSpecified  (optional)
   * @param idIn  (optional)
   * @param idNotIn  (optional)
   * @param slotCodeContains  (optional)
   * @param slotCodeDoesNotContain  (optional)
   * @param slotCodeEquals  (optional)
   * @param slotCodeNotEquals  (optional)
   * @param slotCodeSpecified  (optional)
   * @param slotCodeIn  (optional)
   * @param slotCodeNotIn  (optional)
   * @param departureTimeGreaterThan  (optional)
   * @param departureTimeLessThan  (optional)
   * @param departureTimeGreaterThanOrEqual  (optional)
   * @param departureTimeLessThanOrEqual  (optional)
   * @param departureTimeEquals  (optional)
   * @param departureTimeNotEquals  (optional)
   * @param departureTimeSpecified  (optional)
   * @param departureTimeIn  (optional)
   * @param departureTimeNotIn  (optional)
   * @param arrivalTimeGreaterThan  (optional)
   * @param arrivalTimeLessThan  (optional)
   * @param arrivalTimeGreaterThanOrEqual  (optional)
   * @param arrivalTimeLessThanOrEqual  (optional)
   * @param arrivalTimeEquals  (optional)
   * @param arrivalTimeNotEquals  (optional)
   * @param arrivalTimeSpecified  (optional)
   * @param arrivalTimeIn  (optional)
   * @param arrivalTimeNotIn  (optional)
   * @param bufferMinutesGreaterThan  (optional)
   * @param bufferMinutesLessThan  (optional)
   * @param bufferMinutesGreaterThanOrEqual  (optional)
   * @param bufferMinutesLessThanOrEqual  (optional)
   * @param bufferMinutesEquals  (optional)
   * @param bufferMinutesNotEquals  (optional)
   * @param bufferMinutesSpecified  (optional)
   * @param bufferMinutesIn  (optional)
   * @param bufferMinutesNotIn  (optional)
   * @param sequenceGreaterThan  (optional)
   * @param sequenceLessThan  (optional)
   * @param sequenceGreaterThanOrEqual  (optional)
   * @param sequenceLessThanOrEqual  (optional)
   * @param sequenceEquals  (optional)
   * @param sequenceNotEquals  (optional)
   * @param sequenceSpecified  (optional)
   * @param sequenceIn  (optional)
   * @param sequenceNotIn  (optional)
   * @param activeEquals  (optional)
   * @param activeNotEquals  (optional)
   * @param activeSpecified  (optional)
   * @param activeIn  (optional)
   * @param activeNotIn  (optional)
   * @param createdAtGreaterThan  (optional)
   * @param createdAtLessThan  (optional)
   * @param createdAtGreaterThanOrEqual  (optional)
   * @param createdAtLessThanOrEqual  (optional)
   * @param createdAtEquals  (optional)
   * @param createdAtNotEquals  (optional)
   * @param createdAtSpecified  (optional)
   * @param createdAtIn  (optional)
   * @param createdAtNotIn  (optional)
   * @param updatedAtGreaterThan  (optional)
   * @param updatedAtLessThan  (optional)
   * @param updatedAtGreaterThanOrEqual  (optional)
   * @param updatedAtLessThanOrEqual  (optional)
   * @param updatedAtEquals  (optional)
   * @param updatedAtNotEquals  (optional)
   * @param updatedAtSpecified  (optional)
   * @param updatedAtIn  (optional)
   * @param updatedAtNotIn  (optional)
   * @param isDeletedEquals  (optional)
   * @param isDeletedNotEquals  (optional)
   * @param isDeletedSpecified  (optional)
   * @param isDeletedIn  (optional)
   * @param isDeletedNotIn  (optional)
   * @param deletedAtGreaterThan  (optional)
   * @param deletedAtLessThan  (optional)
   * @param deletedAtGreaterThanOrEqual  (optional)
   * @param deletedAtLessThanOrEqual  (optional)
   * @param deletedAtEquals  (optional)
   * @param deletedAtNotEquals  (optional)
   * @param deletedAtSpecified  (optional)
   * @param deletedAtIn  (optional)
   * @param deletedAtNotIn  (optional)
   * @param deletedByEquals  (optional)
   * @param deletedByNotEquals  (optional)
   * @param deletedBySpecified  (optional)
   * @param deletedByIn  (optional)
   * @param deletedByNotIn  (optional)
   * @param scheduleIdGreaterThan  (optional)
   * @param scheduleIdLessThan  (optional)
   * @param scheduleIdGreaterThanOrEqual  (optional)
   * @param scheduleIdLessThanOrEqual  (optional)
   * @param scheduleIdEquals  (optional)
   * @param scheduleIdNotEquals  (optional)
   * @param scheduleIdSpecified  (optional)
   * @param scheduleIdIn  (optional)
   * @param scheduleIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/schedule-time-slots?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&slotCode.contains={slotCodeContains}&slotCode.doesNotContain={slotCodeDoesNotContain}&slotCode.equals={slotCodeEquals}&slotCode.notEquals={slotCodeNotEquals}&slotCode.specified={slotCodeSpecified}&slotCode.in={slotCodeIn}&slotCode.notIn={slotCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&bufferMinutes.greaterThan={bufferMinutesGreaterThan}&bufferMinutes.lessThan={bufferMinutesLessThan}&bufferMinutes.greaterThanOrEqual={bufferMinutesGreaterThanOrEqual}&bufferMinutes.lessThanOrEqual={bufferMinutesLessThanOrEqual}&bufferMinutes.equals={bufferMinutesEquals}&bufferMinutes.notEquals={bufferMinutesNotEquals}&bufferMinutes.specified={bufferMinutesSpecified}&bufferMinutes.in={bufferMinutesIn}&bufferMinutes.notIn={bufferMinutesNotIn}&sequence.greaterThan={sequenceGreaterThan}&sequence.lessThan={sequenceLessThan}&sequence.greaterThanOrEqual={sequenceGreaterThanOrEqual}&sequence.lessThanOrEqual={sequenceLessThanOrEqual}&sequence.equals={sequenceEquals}&sequence.notEquals={sequenceNotEquals}&sequence.specified={sequenceSpecified}&sequence.in={sequenceIn}&sequence.notIn={sequenceNotIn}&active.equals={activeEquals}&active.notEquals={activeNotEquals}&active.specified={activeSpecified}&active.in={activeIn}&active.notIn={activeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&scheduleId.greaterThan={scheduleIdGreaterThan}&scheduleId.lessThan={scheduleIdLessThan}&scheduleId.greaterThanOrEqual={scheduleIdGreaterThanOrEqual}&scheduleId.lessThanOrEqual={scheduleIdLessThanOrEqual}&scheduleId.equals={scheduleIdEquals}&scheduleId.notEquals={scheduleIdNotEquals}&scheduleId.specified={scheduleIdSpecified}&scheduleId.in={scheduleIdIn}&scheduleId.notIn={scheduleIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<ScheduleTimeSlotDTO>> getAllScheduleTimeSlotsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("slotCodeContains") @jakarta.annotation.Nullable String slotCodeContains, @Param("slotCodeDoesNotContain") @jakarta.annotation.Nullable String slotCodeDoesNotContain, @Param("slotCodeEquals") @jakarta.annotation.Nullable String slotCodeEquals, @Param("slotCodeNotEquals") @jakarta.annotation.Nullable String slotCodeNotEquals, @Param("slotCodeSpecified") @jakarta.annotation.Nullable Boolean slotCodeSpecified, @Param("slotCodeIn") @jakarta.annotation.Nullable List<String> slotCodeIn, @Param("slotCodeNotIn") @jakarta.annotation.Nullable List<String> slotCodeNotIn, @Param("departureTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThan, @Param("departureTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThan, @Param("departureTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThanOrEqual, @Param("departureTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThanOrEqual, @Param("departureTimeEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeEquals, @Param("departureTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeNotEquals, @Param("departureTimeSpecified") @jakarta.annotation.Nullable Boolean departureTimeSpecified, @Param("departureTimeIn") @jakarta.annotation.Nullable List<String> departureTimeIn, @Param("departureTimeNotIn") @jakarta.annotation.Nullable List<String> departureTimeNotIn, @Param("arrivalTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThan, @Param("arrivalTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThan, @Param("arrivalTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThanOrEqual, @Param("arrivalTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThanOrEqual, @Param("arrivalTimeEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeEquals, @Param("arrivalTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeNotEquals, @Param("arrivalTimeSpecified") @jakarta.annotation.Nullable Boolean arrivalTimeSpecified, @Param("arrivalTimeIn") @jakarta.annotation.Nullable List<String> arrivalTimeIn, @Param("arrivalTimeNotIn") @jakarta.annotation.Nullable List<String> arrivalTimeNotIn, @Param("bufferMinutesGreaterThan") @jakarta.annotation.Nullable Integer bufferMinutesGreaterThan, @Param("bufferMinutesLessThan") @jakarta.annotation.Nullable Integer bufferMinutesLessThan, @Param("bufferMinutesGreaterThanOrEqual") @jakarta.annotation.Nullable Integer bufferMinutesGreaterThanOrEqual, @Param("bufferMinutesLessThanOrEqual") @jakarta.annotation.Nullable Integer bufferMinutesLessThanOrEqual, @Param("bufferMinutesEquals") @jakarta.annotation.Nullable Integer bufferMinutesEquals, @Param("bufferMinutesNotEquals") @jakarta.annotation.Nullable Integer bufferMinutesNotEquals, @Param("bufferMinutesSpecified") @jakarta.annotation.Nullable Boolean bufferMinutesSpecified, @Param("bufferMinutesIn") @jakarta.annotation.Nullable List<Integer> bufferMinutesIn, @Param("bufferMinutesNotIn") @jakarta.annotation.Nullable List<Integer> bufferMinutesNotIn, @Param("sequenceGreaterThan") @jakarta.annotation.Nullable Integer sequenceGreaterThan, @Param("sequenceLessThan") @jakarta.annotation.Nullable Integer sequenceLessThan, @Param("sequenceGreaterThanOrEqual") @jakarta.annotation.Nullable Integer sequenceGreaterThanOrEqual, @Param("sequenceLessThanOrEqual") @jakarta.annotation.Nullable Integer sequenceLessThanOrEqual, @Param("sequenceEquals") @jakarta.annotation.Nullable Integer sequenceEquals, @Param("sequenceNotEquals") @jakarta.annotation.Nullable Integer sequenceNotEquals, @Param("sequenceSpecified") @jakarta.annotation.Nullable Boolean sequenceSpecified, @Param("sequenceIn") @jakarta.annotation.Nullable List<Integer> sequenceIn, @Param("sequenceNotIn") @jakarta.annotation.Nullable List<Integer> sequenceNotIn, @Param("activeEquals") @jakarta.annotation.Nullable Boolean activeEquals, @Param("activeNotEquals") @jakarta.annotation.Nullable Boolean activeNotEquals, @Param("activeSpecified") @jakarta.annotation.Nullable Boolean activeSpecified, @Param("activeIn") @jakarta.annotation.Nullable List<Boolean> activeIn, @Param("activeNotIn") @jakarta.annotation.Nullable List<Boolean> activeNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("scheduleIdGreaterThan") @jakarta.annotation.Nullable Long scheduleIdGreaterThan, @Param("scheduleIdLessThan") @jakarta.annotation.Nullable Long scheduleIdLessThan, @Param("scheduleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long scheduleIdGreaterThanOrEqual, @Param("scheduleIdLessThanOrEqual") @jakarta.annotation.Nullable Long scheduleIdLessThanOrEqual, @Param("scheduleIdEquals") @jakarta.annotation.Nullable Long scheduleIdEquals, @Param("scheduleIdNotEquals") @jakarta.annotation.Nullable Long scheduleIdNotEquals, @Param("scheduleIdSpecified") @jakarta.annotation.Nullable Boolean scheduleIdSpecified, @Param("scheduleIdIn") @jakarta.annotation.Nullable List<Long> scheduleIdIn, @Param("scheduleIdNotIn") @jakarta.annotation.Nullable List<Long> scheduleIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllScheduleTimeSlots</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllScheduleTimeSlotsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>idGreaterThan -  (optional)</li>
   *   <li>idLessThan -  (optional)</li>
   *   <li>idGreaterThanOrEqual -  (optional)</li>
   *   <li>idLessThanOrEqual -  (optional)</li>
   *   <li>idEquals -  (optional)</li>
   *   <li>idNotEquals -  (optional)</li>
   *   <li>idSpecified -  (optional)</li>
   *   <li>idIn -  (optional)</li>
   *   <li>idNotIn -  (optional)</li>
   *   <li>slotCodeContains -  (optional)</li>
   *   <li>slotCodeDoesNotContain -  (optional)</li>
   *   <li>slotCodeEquals -  (optional)</li>
   *   <li>slotCodeNotEquals -  (optional)</li>
   *   <li>slotCodeSpecified -  (optional)</li>
   *   <li>slotCodeIn -  (optional)</li>
   *   <li>slotCodeNotIn -  (optional)</li>
   *   <li>departureTimeGreaterThan -  (optional)</li>
   *   <li>departureTimeLessThan -  (optional)</li>
   *   <li>departureTimeGreaterThanOrEqual -  (optional)</li>
   *   <li>departureTimeLessThanOrEqual -  (optional)</li>
   *   <li>departureTimeEquals -  (optional)</li>
   *   <li>departureTimeNotEquals -  (optional)</li>
   *   <li>departureTimeSpecified -  (optional)</li>
   *   <li>departureTimeIn -  (optional)</li>
   *   <li>departureTimeNotIn -  (optional)</li>
   *   <li>arrivalTimeGreaterThan -  (optional)</li>
   *   <li>arrivalTimeLessThan -  (optional)</li>
   *   <li>arrivalTimeGreaterThanOrEqual -  (optional)</li>
   *   <li>arrivalTimeLessThanOrEqual -  (optional)</li>
   *   <li>arrivalTimeEquals -  (optional)</li>
   *   <li>arrivalTimeNotEquals -  (optional)</li>
   *   <li>arrivalTimeSpecified -  (optional)</li>
   *   <li>arrivalTimeIn -  (optional)</li>
   *   <li>arrivalTimeNotIn -  (optional)</li>
   *   <li>bufferMinutesGreaterThan -  (optional)</li>
   *   <li>bufferMinutesLessThan -  (optional)</li>
   *   <li>bufferMinutesGreaterThanOrEqual -  (optional)</li>
   *   <li>bufferMinutesLessThanOrEqual -  (optional)</li>
   *   <li>bufferMinutesEquals -  (optional)</li>
   *   <li>bufferMinutesNotEquals -  (optional)</li>
   *   <li>bufferMinutesSpecified -  (optional)</li>
   *   <li>bufferMinutesIn -  (optional)</li>
   *   <li>bufferMinutesNotIn -  (optional)</li>
   *   <li>sequenceGreaterThan -  (optional)</li>
   *   <li>sequenceLessThan -  (optional)</li>
   *   <li>sequenceGreaterThanOrEqual -  (optional)</li>
   *   <li>sequenceLessThanOrEqual -  (optional)</li>
   *   <li>sequenceEquals -  (optional)</li>
   *   <li>sequenceNotEquals -  (optional)</li>
   *   <li>sequenceSpecified -  (optional)</li>
   *   <li>sequenceIn -  (optional)</li>
   *   <li>sequenceNotIn -  (optional)</li>
   *   <li>activeEquals -  (optional)</li>
   *   <li>activeNotEquals -  (optional)</li>
   *   <li>activeSpecified -  (optional)</li>
   *   <li>activeIn -  (optional)</li>
   *   <li>activeNotIn -  (optional)</li>
   *   <li>createdAtGreaterThan -  (optional)</li>
   *   <li>createdAtLessThan -  (optional)</li>
   *   <li>createdAtGreaterThanOrEqual -  (optional)</li>
   *   <li>createdAtLessThanOrEqual -  (optional)</li>
   *   <li>createdAtEquals -  (optional)</li>
   *   <li>createdAtNotEquals -  (optional)</li>
   *   <li>createdAtSpecified -  (optional)</li>
   *   <li>createdAtIn -  (optional)</li>
   *   <li>createdAtNotIn -  (optional)</li>
   *   <li>updatedAtGreaterThan -  (optional)</li>
   *   <li>updatedAtLessThan -  (optional)</li>
   *   <li>updatedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>updatedAtLessThanOrEqual -  (optional)</li>
   *   <li>updatedAtEquals -  (optional)</li>
   *   <li>updatedAtNotEquals -  (optional)</li>
   *   <li>updatedAtSpecified -  (optional)</li>
   *   <li>updatedAtIn -  (optional)</li>
   *   <li>updatedAtNotIn -  (optional)</li>
   *   <li>isDeletedEquals -  (optional)</li>
   *   <li>isDeletedNotEquals -  (optional)</li>
   *   <li>isDeletedSpecified -  (optional)</li>
   *   <li>isDeletedIn -  (optional)</li>
   *   <li>isDeletedNotIn -  (optional)</li>
   *   <li>deletedAtGreaterThan -  (optional)</li>
   *   <li>deletedAtLessThan -  (optional)</li>
   *   <li>deletedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>deletedAtLessThanOrEqual -  (optional)</li>
   *   <li>deletedAtEquals -  (optional)</li>
   *   <li>deletedAtNotEquals -  (optional)</li>
   *   <li>deletedAtSpecified -  (optional)</li>
   *   <li>deletedAtIn -  (optional)</li>
   *   <li>deletedAtNotIn -  (optional)</li>
   *   <li>deletedByEquals -  (optional)</li>
   *   <li>deletedByNotEquals -  (optional)</li>
   *   <li>deletedBySpecified -  (optional)</li>
   *   <li>deletedByIn -  (optional)</li>
   *   <li>deletedByNotIn -  (optional)</li>
   *   <li>scheduleIdGreaterThan -  (optional)</li>
   *   <li>scheduleIdLessThan -  (optional)</li>
   *   <li>scheduleIdGreaterThanOrEqual -  (optional)</li>
   *   <li>scheduleIdLessThanOrEqual -  (optional)</li>
   *   <li>scheduleIdEquals -  (optional)</li>
   *   <li>scheduleIdNotEquals -  (optional)</li>
   *   <li>scheduleIdSpecified -  (optional)</li>
   *   <li>scheduleIdIn -  (optional)</li>
   *   <li>scheduleIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return List&lt;ScheduleTimeSlotDTO&gt;
   */
  @RequestLine("GET /api/schedule-time-slots?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&slotCode.contains={slotCodeContains}&slotCode.doesNotContain={slotCodeDoesNotContain}&slotCode.equals={slotCodeEquals}&slotCode.notEquals={slotCodeNotEquals}&slotCode.specified={slotCodeSpecified}&slotCode.in={slotCodeIn}&slotCode.notIn={slotCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&bufferMinutes.greaterThan={bufferMinutesGreaterThan}&bufferMinutes.lessThan={bufferMinutesLessThan}&bufferMinutes.greaterThanOrEqual={bufferMinutesGreaterThanOrEqual}&bufferMinutes.lessThanOrEqual={bufferMinutesLessThanOrEqual}&bufferMinutes.equals={bufferMinutesEquals}&bufferMinutes.notEquals={bufferMinutesNotEquals}&bufferMinutes.specified={bufferMinutesSpecified}&bufferMinutes.in={bufferMinutesIn}&bufferMinutes.notIn={bufferMinutesNotIn}&sequence.greaterThan={sequenceGreaterThan}&sequence.lessThan={sequenceLessThan}&sequence.greaterThanOrEqual={sequenceGreaterThanOrEqual}&sequence.lessThanOrEqual={sequenceLessThanOrEqual}&sequence.equals={sequenceEquals}&sequence.notEquals={sequenceNotEquals}&sequence.specified={sequenceSpecified}&sequence.in={sequenceIn}&sequence.notIn={sequenceNotIn}&active.equals={activeEquals}&active.notEquals={activeNotEquals}&active.specified={activeSpecified}&active.in={activeIn}&active.notIn={activeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&scheduleId.greaterThan={scheduleIdGreaterThan}&scheduleId.lessThan={scheduleIdLessThan}&scheduleId.greaterThanOrEqual={scheduleIdGreaterThanOrEqual}&scheduleId.lessThanOrEqual={scheduleIdLessThanOrEqual}&scheduleId.equals={scheduleIdEquals}&scheduleId.notEquals={scheduleIdNotEquals}&scheduleId.specified={scheduleIdSpecified}&scheduleId.in={scheduleIdIn}&scheduleId.notIn={scheduleIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  List<ScheduleTimeSlotDTO> getAllScheduleTimeSlots(@QueryMap(encoded=true) GetAllScheduleTimeSlotsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllScheduleTimeSlots</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>idGreaterThan -  (optional)</li>
          *   <li>idLessThan -  (optional)</li>
          *   <li>idGreaterThanOrEqual -  (optional)</li>
          *   <li>idLessThanOrEqual -  (optional)</li>
          *   <li>idEquals -  (optional)</li>
          *   <li>idNotEquals -  (optional)</li>
          *   <li>idSpecified -  (optional)</li>
          *   <li>idIn -  (optional)</li>
          *   <li>idNotIn -  (optional)</li>
          *   <li>slotCodeContains -  (optional)</li>
          *   <li>slotCodeDoesNotContain -  (optional)</li>
          *   <li>slotCodeEquals -  (optional)</li>
          *   <li>slotCodeNotEquals -  (optional)</li>
          *   <li>slotCodeSpecified -  (optional)</li>
          *   <li>slotCodeIn -  (optional)</li>
          *   <li>slotCodeNotIn -  (optional)</li>
          *   <li>departureTimeGreaterThan -  (optional)</li>
          *   <li>departureTimeLessThan -  (optional)</li>
          *   <li>departureTimeGreaterThanOrEqual -  (optional)</li>
          *   <li>departureTimeLessThanOrEqual -  (optional)</li>
          *   <li>departureTimeEquals -  (optional)</li>
          *   <li>departureTimeNotEquals -  (optional)</li>
          *   <li>departureTimeSpecified -  (optional)</li>
          *   <li>departureTimeIn -  (optional)</li>
          *   <li>departureTimeNotIn -  (optional)</li>
          *   <li>arrivalTimeGreaterThan -  (optional)</li>
          *   <li>arrivalTimeLessThan -  (optional)</li>
          *   <li>arrivalTimeGreaterThanOrEqual -  (optional)</li>
          *   <li>arrivalTimeLessThanOrEqual -  (optional)</li>
          *   <li>arrivalTimeEquals -  (optional)</li>
          *   <li>arrivalTimeNotEquals -  (optional)</li>
          *   <li>arrivalTimeSpecified -  (optional)</li>
          *   <li>arrivalTimeIn -  (optional)</li>
          *   <li>arrivalTimeNotIn -  (optional)</li>
          *   <li>bufferMinutesGreaterThan -  (optional)</li>
          *   <li>bufferMinutesLessThan -  (optional)</li>
          *   <li>bufferMinutesGreaterThanOrEqual -  (optional)</li>
          *   <li>bufferMinutesLessThanOrEqual -  (optional)</li>
          *   <li>bufferMinutesEquals -  (optional)</li>
          *   <li>bufferMinutesNotEquals -  (optional)</li>
          *   <li>bufferMinutesSpecified -  (optional)</li>
          *   <li>bufferMinutesIn -  (optional)</li>
          *   <li>bufferMinutesNotIn -  (optional)</li>
          *   <li>sequenceGreaterThan -  (optional)</li>
          *   <li>sequenceLessThan -  (optional)</li>
          *   <li>sequenceGreaterThanOrEqual -  (optional)</li>
          *   <li>sequenceLessThanOrEqual -  (optional)</li>
          *   <li>sequenceEquals -  (optional)</li>
          *   <li>sequenceNotEquals -  (optional)</li>
          *   <li>sequenceSpecified -  (optional)</li>
          *   <li>sequenceIn -  (optional)</li>
          *   <li>sequenceNotIn -  (optional)</li>
          *   <li>activeEquals -  (optional)</li>
          *   <li>activeNotEquals -  (optional)</li>
          *   <li>activeSpecified -  (optional)</li>
          *   <li>activeIn -  (optional)</li>
          *   <li>activeNotIn -  (optional)</li>
          *   <li>createdAtGreaterThan -  (optional)</li>
          *   <li>createdAtLessThan -  (optional)</li>
          *   <li>createdAtGreaterThanOrEqual -  (optional)</li>
          *   <li>createdAtLessThanOrEqual -  (optional)</li>
          *   <li>createdAtEquals -  (optional)</li>
          *   <li>createdAtNotEquals -  (optional)</li>
          *   <li>createdAtSpecified -  (optional)</li>
          *   <li>createdAtIn -  (optional)</li>
          *   <li>createdAtNotIn -  (optional)</li>
          *   <li>updatedAtGreaterThan -  (optional)</li>
          *   <li>updatedAtLessThan -  (optional)</li>
          *   <li>updatedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>updatedAtLessThanOrEqual -  (optional)</li>
          *   <li>updatedAtEquals -  (optional)</li>
          *   <li>updatedAtNotEquals -  (optional)</li>
          *   <li>updatedAtSpecified -  (optional)</li>
          *   <li>updatedAtIn -  (optional)</li>
          *   <li>updatedAtNotIn -  (optional)</li>
          *   <li>isDeletedEquals -  (optional)</li>
          *   <li>isDeletedNotEquals -  (optional)</li>
          *   <li>isDeletedSpecified -  (optional)</li>
          *   <li>isDeletedIn -  (optional)</li>
          *   <li>isDeletedNotIn -  (optional)</li>
          *   <li>deletedAtGreaterThan -  (optional)</li>
          *   <li>deletedAtLessThan -  (optional)</li>
          *   <li>deletedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>deletedAtLessThanOrEqual -  (optional)</li>
          *   <li>deletedAtEquals -  (optional)</li>
          *   <li>deletedAtNotEquals -  (optional)</li>
          *   <li>deletedAtSpecified -  (optional)</li>
          *   <li>deletedAtIn -  (optional)</li>
          *   <li>deletedAtNotIn -  (optional)</li>
          *   <li>deletedByEquals -  (optional)</li>
          *   <li>deletedByNotEquals -  (optional)</li>
          *   <li>deletedBySpecified -  (optional)</li>
          *   <li>deletedByIn -  (optional)</li>
          *   <li>deletedByNotIn -  (optional)</li>
          *   <li>scheduleIdGreaterThan -  (optional)</li>
          *   <li>scheduleIdLessThan -  (optional)</li>
          *   <li>scheduleIdGreaterThanOrEqual -  (optional)</li>
          *   <li>scheduleIdLessThanOrEqual -  (optional)</li>
          *   <li>scheduleIdEquals -  (optional)</li>
          *   <li>scheduleIdNotEquals -  (optional)</li>
          *   <li>scheduleIdSpecified -  (optional)</li>
          *   <li>scheduleIdIn -  (optional)</li>
          *   <li>scheduleIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return List&lt;ScheduleTimeSlotDTO&gt;
      */
      @RequestLine("GET /api/schedule-time-slots?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&slotCode.contains={slotCodeContains}&slotCode.doesNotContain={slotCodeDoesNotContain}&slotCode.equals={slotCodeEquals}&slotCode.notEquals={slotCodeNotEquals}&slotCode.specified={slotCodeSpecified}&slotCode.in={slotCodeIn}&slotCode.notIn={slotCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&bufferMinutes.greaterThan={bufferMinutesGreaterThan}&bufferMinutes.lessThan={bufferMinutesLessThan}&bufferMinutes.greaterThanOrEqual={bufferMinutesGreaterThanOrEqual}&bufferMinutes.lessThanOrEqual={bufferMinutesLessThanOrEqual}&bufferMinutes.equals={bufferMinutesEquals}&bufferMinutes.notEquals={bufferMinutesNotEquals}&bufferMinutes.specified={bufferMinutesSpecified}&bufferMinutes.in={bufferMinutesIn}&bufferMinutes.notIn={bufferMinutesNotIn}&sequence.greaterThan={sequenceGreaterThan}&sequence.lessThan={sequenceLessThan}&sequence.greaterThanOrEqual={sequenceGreaterThanOrEqual}&sequence.lessThanOrEqual={sequenceLessThanOrEqual}&sequence.equals={sequenceEquals}&sequence.notEquals={sequenceNotEquals}&sequence.specified={sequenceSpecified}&sequence.in={sequenceIn}&sequence.notIn={sequenceNotIn}&active.equals={activeEquals}&active.notEquals={activeNotEquals}&active.specified={activeSpecified}&active.in={activeIn}&active.notIn={activeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&scheduleId.greaterThan={scheduleIdGreaterThan}&scheduleId.lessThan={scheduleIdLessThan}&scheduleId.greaterThanOrEqual={scheduleIdGreaterThanOrEqual}&scheduleId.lessThanOrEqual={scheduleIdLessThanOrEqual}&scheduleId.equals={scheduleIdEquals}&scheduleId.notEquals={scheduleIdNotEquals}&scheduleId.specified={scheduleIdSpecified}&scheduleId.in={scheduleIdIn}&scheduleId.notIn={scheduleIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<ScheduleTimeSlotDTO>> getAllScheduleTimeSlotsWithHttpInfo(@QueryMap(encoded=true) GetAllScheduleTimeSlotsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllScheduleTimeSlots</code> method in a fluent style.
   */
  public static class GetAllScheduleTimeSlotsQueryParams extends HashMap<String, Object> {
    public GetAllScheduleTimeSlotsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams slotCodeContains(@jakarta.annotation.Nullable final String value) {
      put("slotCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams slotCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("slotCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams slotCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("slotCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams slotCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("slotCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams slotCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("slotCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams slotCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("slotCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams slotCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("slotCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams departureTimeGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams departureTimeLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams departureTimeGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams departureTimeLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams departureTimeEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams departureTimeNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams departureTimeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("departureTime.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams departureTimeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("departureTime.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams departureTimeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("departureTime.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams arrivalTimeGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams arrivalTimeLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams arrivalTimeGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams arrivalTimeLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams arrivalTimeEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams arrivalTimeNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams arrivalTimeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("arrivalTime.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams arrivalTimeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("arrivalTime.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams arrivalTimeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("arrivalTime.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams bufferMinutesGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("bufferMinutes.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams bufferMinutesLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("bufferMinutes.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams bufferMinutesGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("bufferMinutes.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams bufferMinutesLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("bufferMinutes.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams bufferMinutesEquals(@jakarta.annotation.Nullable final Integer value) {
      put("bufferMinutes.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams bufferMinutesNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("bufferMinutes.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams bufferMinutesSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("bufferMinutes.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams bufferMinutesIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("bufferMinutes.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams bufferMinutesNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("bufferMinutes.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams sequenceGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("sequence.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams sequenceLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("sequence.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams sequenceGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("sequence.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams sequenceLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("sequence.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams sequenceEquals(@jakarta.annotation.Nullable final Integer value) {
      put("sequence.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams sequenceNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("sequence.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams sequenceSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("sequence.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams sequenceIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("sequence.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams sequenceNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("sequence.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams activeEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("active.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams activeNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("active.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams activeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("active.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams activeIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("active.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams activeNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("active.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams scheduleIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams scheduleIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams scheduleIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams scheduleIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams scheduleIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams scheduleIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams scheduleIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("scheduleId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams scheduleIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("scheduleId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams scheduleIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("scheduleId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleTimeSlotsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return ScheduleTimeSlotDTO
   */
  @RequestLine("GET /api/schedule-time-slots/{id}")
  @Headers({
    "Accept: */*",
  })
  ScheduleTimeSlotDTO getScheduleTimeSlot(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getScheduleTimeSlot</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/schedule-time-slots/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<ScheduleTimeSlotDTO> getScheduleTimeSlotWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param scheduleTimeSlotDTO  (required)
   * @return ScheduleTimeSlotDTO
   */
  @RequestLine("PATCH /api/schedule-time-slots/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ScheduleTimeSlotDTO partialUpdateScheduleTimeSlot(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ScheduleTimeSlotDTO scheduleTimeSlotDTO);

  /**
   * 
   * Similar to <code>partialUpdateScheduleTimeSlot</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param scheduleTimeSlotDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/schedule-time-slots/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<ScheduleTimeSlotDTO> partialUpdateScheduleTimeSlotWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ScheduleTimeSlotDTO scheduleTimeSlotDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param scheduleTimeSlotDTO  (required)
   * @return ScheduleTimeSlotDTO
   */
  @RequestLine("PUT /api/schedule-time-slots/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ScheduleTimeSlotDTO updateScheduleTimeSlot(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ScheduleTimeSlotDTO scheduleTimeSlotDTO);

  /**
   * 
   * Similar to <code>updateScheduleTimeSlot</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param scheduleTimeSlotDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/schedule-time-slots/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<ScheduleTimeSlotDTO> updateScheduleTimeSlotWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ScheduleTimeSlotDTO scheduleTimeSlotDTO);


}
