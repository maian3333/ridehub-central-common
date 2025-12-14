package com.ridehub.feign.msroute.client.api;

import com.ridehub.feign.msroute.client.invoker.ApiClient;
import com.ridehub.feign.msroute.client.invoker.EncodingUtils;
import com.ridehub.feign.msroute.client.model.ApiResponse;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.ridehub.feign.msroute.client.model.ScheduleDTO;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface ScheduleResourceMsrouteApi extends ApiClient.Api {


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
   * @param scheduleCodeContains  (optional)
   * @param scheduleCodeDoesNotContain  (optional)
   * @param scheduleCodeEquals  (optional)
   * @param scheduleCodeNotEquals  (optional)
   * @param scheduleCodeSpecified  (optional)
   * @param scheduleCodeIn  (optional)
   * @param scheduleCodeNotIn  (optional)
   * @param startDateGreaterThan  (optional)
   * @param startDateLessThan  (optional)
   * @param startDateGreaterThanOrEqual  (optional)
   * @param startDateLessThanOrEqual  (optional)
   * @param startDateEquals  (optional)
   * @param startDateNotEquals  (optional)
   * @param startDateSpecified  (optional)
   * @param startDateIn  (optional)
   * @param startDateNotIn  (optional)
   * @param endDateGreaterThan  (optional)
   * @param endDateLessThan  (optional)
   * @param endDateGreaterThanOrEqual  (optional)
   * @param endDateLessThanOrEqual  (optional)
   * @param endDateEquals  (optional)
   * @param endDateNotEquals  (optional)
   * @param endDateSpecified  (optional)
   * @param endDateIn  (optional)
   * @param endDateNotIn  (optional)
   * @param daysOfWeekContains  (optional)
   * @param daysOfWeekDoesNotContain  (optional)
   * @param daysOfWeekEquals  (optional)
   * @param daysOfWeekNotEquals  (optional)
   * @param daysOfWeekSpecified  (optional)
   * @param daysOfWeekIn  (optional)
   * @param daysOfWeekNotIn  (optional)
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
   * @param timeSlotsIdGreaterThan  (optional)
   * @param timeSlotsIdLessThan  (optional)
   * @param timeSlotsIdGreaterThanOrEqual  (optional)
   * @param timeSlotsIdLessThanOrEqual  (optional)
   * @param timeSlotsIdEquals  (optional)
   * @param timeSlotsIdNotEquals  (optional)
   * @param timeSlotsIdSpecified  (optional)
   * @param timeSlotsIdIn  (optional)
   * @param timeSlotsIdNotIn  (optional)
   * @param occasionRuleIdGreaterThan  (optional)
   * @param occasionRuleIdLessThan  (optional)
   * @param occasionRuleIdGreaterThanOrEqual  (optional)
   * @param occasionRuleIdLessThanOrEqual  (optional)
   * @param occasionRuleIdEquals  (optional)
   * @param occasionRuleIdNotEquals  (optional)
   * @param occasionRuleIdSpecified  (optional)
   * @param occasionRuleIdIn  (optional)
   * @param occasionRuleIdNotIn  (optional)
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param distinct  (optional)
   * @return Long
   */
  @RequestLine("GET /api/schedules/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&scheduleCode.contains={scheduleCodeContains}&scheduleCode.doesNotContain={scheduleCodeDoesNotContain}&scheduleCode.equals={scheduleCodeEquals}&scheduleCode.notEquals={scheduleCodeNotEquals}&scheduleCode.specified={scheduleCodeSpecified}&scheduleCode.in={scheduleCodeIn}&scheduleCode.notIn={scheduleCodeNotIn}&startDate.greaterThan={startDateGreaterThan}&startDate.lessThan={startDateLessThan}&startDate.greaterThanOrEqual={startDateGreaterThanOrEqual}&startDate.lessThanOrEqual={startDateLessThanOrEqual}&startDate.equals={startDateEquals}&startDate.notEquals={startDateNotEquals}&startDate.specified={startDateSpecified}&startDate.in={startDateIn}&startDate.notIn={startDateNotIn}&endDate.greaterThan={endDateGreaterThan}&endDate.lessThan={endDateLessThan}&endDate.greaterThanOrEqual={endDateGreaterThanOrEqual}&endDate.lessThanOrEqual={endDateLessThanOrEqual}&endDate.equals={endDateEquals}&endDate.notEquals={endDateNotEquals}&endDate.specified={endDateSpecified}&endDate.in={endDateIn}&endDate.notIn={endDateNotIn}&daysOfWeek.contains={daysOfWeekContains}&daysOfWeek.doesNotContain={daysOfWeekDoesNotContain}&daysOfWeek.equals={daysOfWeekEquals}&daysOfWeek.notEquals={daysOfWeekNotEquals}&daysOfWeek.specified={daysOfWeekSpecified}&daysOfWeek.in={daysOfWeekIn}&daysOfWeek.notIn={daysOfWeekNotIn}&active.equals={activeEquals}&active.notEquals={activeNotEquals}&active.specified={activeSpecified}&active.in={activeIn}&active.notIn={activeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&timeSlotsId.greaterThan={timeSlotsIdGreaterThan}&timeSlotsId.lessThan={timeSlotsIdLessThan}&timeSlotsId.greaterThanOrEqual={timeSlotsIdGreaterThanOrEqual}&timeSlotsId.lessThanOrEqual={timeSlotsIdLessThanOrEqual}&timeSlotsId.equals={timeSlotsIdEquals}&timeSlotsId.notEquals={timeSlotsIdNotEquals}&timeSlotsId.specified={timeSlotsIdSpecified}&timeSlotsId.in={timeSlotsIdIn}&timeSlotsId.notIn={timeSlotsIdNotIn}&occasionRuleId.greaterThan={occasionRuleIdGreaterThan}&occasionRuleId.lessThan={occasionRuleIdLessThan}&occasionRuleId.greaterThanOrEqual={occasionRuleIdGreaterThanOrEqual}&occasionRuleId.lessThanOrEqual={occasionRuleIdLessThanOrEqual}&occasionRuleId.equals={occasionRuleIdEquals}&occasionRuleId.notEquals={occasionRuleIdNotEquals}&occasionRuleId.specified={occasionRuleIdSpecified}&occasionRuleId.in={occasionRuleIdIn}&occasionRuleId.notIn={occasionRuleIdNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countSchedules(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("scheduleCodeContains") @jakarta.annotation.Nullable String scheduleCodeContains, @Param("scheduleCodeDoesNotContain") @jakarta.annotation.Nullable String scheduleCodeDoesNotContain, @Param("scheduleCodeEquals") @jakarta.annotation.Nullable String scheduleCodeEquals, @Param("scheduleCodeNotEquals") @jakarta.annotation.Nullable String scheduleCodeNotEquals, @Param("scheduleCodeSpecified") @jakarta.annotation.Nullable Boolean scheduleCodeSpecified, @Param("scheduleCodeIn") @jakarta.annotation.Nullable List<String> scheduleCodeIn, @Param("scheduleCodeNotIn") @jakarta.annotation.Nullable List<String> scheduleCodeNotIn, @Param("startDateGreaterThan") @jakarta.annotation.Nullable LocalDate startDateGreaterThan, @Param("startDateLessThan") @jakarta.annotation.Nullable LocalDate startDateLessThan, @Param("startDateGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate startDateGreaterThanOrEqual, @Param("startDateLessThanOrEqual") @jakarta.annotation.Nullable LocalDate startDateLessThanOrEqual, @Param("startDateEquals") @jakarta.annotation.Nullable LocalDate startDateEquals, @Param("startDateNotEquals") @jakarta.annotation.Nullable LocalDate startDateNotEquals, @Param("startDateSpecified") @jakarta.annotation.Nullable Boolean startDateSpecified, @Param("startDateIn") @jakarta.annotation.Nullable List<LocalDate> startDateIn, @Param("startDateNotIn") @jakarta.annotation.Nullable List<LocalDate> startDateNotIn, @Param("endDateGreaterThan") @jakarta.annotation.Nullable LocalDate endDateGreaterThan, @Param("endDateLessThan") @jakarta.annotation.Nullable LocalDate endDateLessThan, @Param("endDateGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate endDateGreaterThanOrEqual, @Param("endDateLessThanOrEqual") @jakarta.annotation.Nullable LocalDate endDateLessThanOrEqual, @Param("endDateEquals") @jakarta.annotation.Nullable LocalDate endDateEquals, @Param("endDateNotEquals") @jakarta.annotation.Nullable LocalDate endDateNotEquals, @Param("endDateSpecified") @jakarta.annotation.Nullable Boolean endDateSpecified, @Param("endDateIn") @jakarta.annotation.Nullable List<LocalDate> endDateIn, @Param("endDateNotIn") @jakarta.annotation.Nullable List<LocalDate> endDateNotIn, @Param("daysOfWeekContains") @jakarta.annotation.Nullable String daysOfWeekContains, @Param("daysOfWeekDoesNotContain") @jakarta.annotation.Nullable String daysOfWeekDoesNotContain, @Param("daysOfWeekEquals") @jakarta.annotation.Nullable String daysOfWeekEquals, @Param("daysOfWeekNotEquals") @jakarta.annotation.Nullable String daysOfWeekNotEquals, @Param("daysOfWeekSpecified") @jakarta.annotation.Nullable Boolean daysOfWeekSpecified, @Param("daysOfWeekIn") @jakarta.annotation.Nullable List<String> daysOfWeekIn, @Param("daysOfWeekNotIn") @jakarta.annotation.Nullable List<String> daysOfWeekNotIn, @Param("activeEquals") @jakarta.annotation.Nullable Boolean activeEquals, @Param("activeNotEquals") @jakarta.annotation.Nullable Boolean activeNotEquals, @Param("activeSpecified") @jakarta.annotation.Nullable Boolean activeSpecified, @Param("activeIn") @jakarta.annotation.Nullable List<Boolean> activeIn, @Param("activeNotIn") @jakarta.annotation.Nullable List<Boolean> activeNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("timeSlotsIdGreaterThan") @jakarta.annotation.Nullable Long timeSlotsIdGreaterThan, @Param("timeSlotsIdLessThan") @jakarta.annotation.Nullable Long timeSlotsIdLessThan, @Param("timeSlotsIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long timeSlotsIdGreaterThanOrEqual, @Param("timeSlotsIdLessThanOrEqual") @jakarta.annotation.Nullable Long timeSlotsIdLessThanOrEqual, @Param("timeSlotsIdEquals") @jakarta.annotation.Nullable Long timeSlotsIdEquals, @Param("timeSlotsIdNotEquals") @jakarta.annotation.Nullable Long timeSlotsIdNotEquals, @Param("timeSlotsIdSpecified") @jakarta.annotation.Nullable Boolean timeSlotsIdSpecified, @Param("timeSlotsIdIn") @jakarta.annotation.Nullable List<Long> timeSlotsIdIn, @Param("timeSlotsIdNotIn") @jakarta.annotation.Nullable List<Long> timeSlotsIdNotIn, @Param("occasionRuleIdGreaterThan") @jakarta.annotation.Nullable Long occasionRuleIdGreaterThan, @Param("occasionRuleIdLessThan") @jakarta.annotation.Nullable Long occasionRuleIdLessThan, @Param("occasionRuleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long occasionRuleIdGreaterThanOrEqual, @Param("occasionRuleIdLessThanOrEqual") @jakarta.annotation.Nullable Long occasionRuleIdLessThanOrEqual, @Param("occasionRuleIdEquals") @jakarta.annotation.Nullable Long occasionRuleIdEquals, @Param("occasionRuleIdNotEquals") @jakarta.annotation.Nullable Long occasionRuleIdNotEquals, @Param("occasionRuleIdSpecified") @jakarta.annotation.Nullable Boolean occasionRuleIdSpecified, @Param("occasionRuleIdIn") @jakarta.annotation.Nullable List<Long> occasionRuleIdIn, @Param("occasionRuleIdNotIn") @jakarta.annotation.Nullable List<Long> occasionRuleIdNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countSchedules</code> but it also returns the http response headers .
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
   * @param scheduleCodeContains  (optional)
   * @param scheduleCodeDoesNotContain  (optional)
   * @param scheduleCodeEquals  (optional)
   * @param scheduleCodeNotEquals  (optional)
   * @param scheduleCodeSpecified  (optional)
   * @param scheduleCodeIn  (optional)
   * @param scheduleCodeNotIn  (optional)
   * @param startDateGreaterThan  (optional)
   * @param startDateLessThan  (optional)
   * @param startDateGreaterThanOrEqual  (optional)
   * @param startDateLessThanOrEqual  (optional)
   * @param startDateEquals  (optional)
   * @param startDateNotEquals  (optional)
   * @param startDateSpecified  (optional)
   * @param startDateIn  (optional)
   * @param startDateNotIn  (optional)
   * @param endDateGreaterThan  (optional)
   * @param endDateLessThan  (optional)
   * @param endDateGreaterThanOrEqual  (optional)
   * @param endDateLessThanOrEqual  (optional)
   * @param endDateEquals  (optional)
   * @param endDateNotEquals  (optional)
   * @param endDateSpecified  (optional)
   * @param endDateIn  (optional)
   * @param endDateNotIn  (optional)
   * @param daysOfWeekContains  (optional)
   * @param daysOfWeekDoesNotContain  (optional)
   * @param daysOfWeekEquals  (optional)
   * @param daysOfWeekNotEquals  (optional)
   * @param daysOfWeekSpecified  (optional)
   * @param daysOfWeekIn  (optional)
   * @param daysOfWeekNotIn  (optional)
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
   * @param timeSlotsIdGreaterThan  (optional)
   * @param timeSlotsIdLessThan  (optional)
   * @param timeSlotsIdGreaterThanOrEqual  (optional)
   * @param timeSlotsIdLessThanOrEqual  (optional)
   * @param timeSlotsIdEquals  (optional)
   * @param timeSlotsIdNotEquals  (optional)
   * @param timeSlotsIdSpecified  (optional)
   * @param timeSlotsIdIn  (optional)
   * @param timeSlotsIdNotIn  (optional)
   * @param occasionRuleIdGreaterThan  (optional)
   * @param occasionRuleIdLessThan  (optional)
   * @param occasionRuleIdGreaterThanOrEqual  (optional)
   * @param occasionRuleIdLessThanOrEqual  (optional)
   * @param occasionRuleIdEquals  (optional)
   * @param occasionRuleIdNotEquals  (optional)
   * @param occasionRuleIdSpecified  (optional)
   * @param occasionRuleIdIn  (optional)
   * @param occasionRuleIdNotIn  (optional)
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/schedules/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&scheduleCode.contains={scheduleCodeContains}&scheduleCode.doesNotContain={scheduleCodeDoesNotContain}&scheduleCode.equals={scheduleCodeEquals}&scheduleCode.notEquals={scheduleCodeNotEquals}&scheduleCode.specified={scheduleCodeSpecified}&scheduleCode.in={scheduleCodeIn}&scheduleCode.notIn={scheduleCodeNotIn}&startDate.greaterThan={startDateGreaterThan}&startDate.lessThan={startDateLessThan}&startDate.greaterThanOrEqual={startDateGreaterThanOrEqual}&startDate.lessThanOrEqual={startDateLessThanOrEqual}&startDate.equals={startDateEquals}&startDate.notEquals={startDateNotEquals}&startDate.specified={startDateSpecified}&startDate.in={startDateIn}&startDate.notIn={startDateNotIn}&endDate.greaterThan={endDateGreaterThan}&endDate.lessThan={endDateLessThan}&endDate.greaterThanOrEqual={endDateGreaterThanOrEqual}&endDate.lessThanOrEqual={endDateLessThanOrEqual}&endDate.equals={endDateEquals}&endDate.notEquals={endDateNotEquals}&endDate.specified={endDateSpecified}&endDate.in={endDateIn}&endDate.notIn={endDateNotIn}&daysOfWeek.contains={daysOfWeekContains}&daysOfWeek.doesNotContain={daysOfWeekDoesNotContain}&daysOfWeek.equals={daysOfWeekEquals}&daysOfWeek.notEquals={daysOfWeekNotEquals}&daysOfWeek.specified={daysOfWeekSpecified}&daysOfWeek.in={daysOfWeekIn}&daysOfWeek.notIn={daysOfWeekNotIn}&active.equals={activeEquals}&active.notEquals={activeNotEquals}&active.specified={activeSpecified}&active.in={activeIn}&active.notIn={activeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&timeSlotsId.greaterThan={timeSlotsIdGreaterThan}&timeSlotsId.lessThan={timeSlotsIdLessThan}&timeSlotsId.greaterThanOrEqual={timeSlotsIdGreaterThanOrEqual}&timeSlotsId.lessThanOrEqual={timeSlotsIdLessThanOrEqual}&timeSlotsId.equals={timeSlotsIdEquals}&timeSlotsId.notEquals={timeSlotsIdNotEquals}&timeSlotsId.specified={timeSlotsIdSpecified}&timeSlotsId.in={timeSlotsIdIn}&timeSlotsId.notIn={timeSlotsIdNotIn}&occasionRuleId.greaterThan={occasionRuleIdGreaterThan}&occasionRuleId.lessThan={occasionRuleIdLessThan}&occasionRuleId.greaterThanOrEqual={occasionRuleIdGreaterThanOrEqual}&occasionRuleId.lessThanOrEqual={occasionRuleIdLessThanOrEqual}&occasionRuleId.equals={occasionRuleIdEquals}&occasionRuleId.notEquals={occasionRuleIdNotEquals}&occasionRuleId.specified={occasionRuleIdSpecified}&occasionRuleId.in={occasionRuleIdIn}&occasionRuleId.notIn={occasionRuleIdNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countSchedulesWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("scheduleCodeContains") @jakarta.annotation.Nullable String scheduleCodeContains, @Param("scheduleCodeDoesNotContain") @jakarta.annotation.Nullable String scheduleCodeDoesNotContain, @Param("scheduleCodeEquals") @jakarta.annotation.Nullable String scheduleCodeEquals, @Param("scheduleCodeNotEquals") @jakarta.annotation.Nullable String scheduleCodeNotEquals, @Param("scheduleCodeSpecified") @jakarta.annotation.Nullable Boolean scheduleCodeSpecified, @Param("scheduleCodeIn") @jakarta.annotation.Nullable List<String> scheduleCodeIn, @Param("scheduleCodeNotIn") @jakarta.annotation.Nullable List<String> scheduleCodeNotIn, @Param("startDateGreaterThan") @jakarta.annotation.Nullable LocalDate startDateGreaterThan, @Param("startDateLessThan") @jakarta.annotation.Nullable LocalDate startDateLessThan, @Param("startDateGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate startDateGreaterThanOrEqual, @Param("startDateLessThanOrEqual") @jakarta.annotation.Nullable LocalDate startDateLessThanOrEqual, @Param("startDateEquals") @jakarta.annotation.Nullable LocalDate startDateEquals, @Param("startDateNotEquals") @jakarta.annotation.Nullable LocalDate startDateNotEquals, @Param("startDateSpecified") @jakarta.annotation.Nullable Boolean startDateSpecified, @Param("startDateIn") @jakarta.annotation.Nullable List<LocalDate> startDateIn, @Param("startDateNotIn") @jakarta.annotation.Nullable List<LocalDate> startDateNotIn, @Param("endDateGreaterThan") @jakarta.annotation.Nullable LocalDate endDateGreaterThan, @Param("endDateLessThan") @jakarta.annotation.Nullable LocalDate endDateLessThan, @Param("endDateGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate endDateGreaterThanOrEqual, @Param("endDateLessThanOrEqual") @jakarta.annotation.Nullable LocalDate endDateLessThanOrEqual, @Param("endDateEquals") @jakarta.annotation.Nullable LocalDate endDateEquals, @Param("endDateNotEquals") @jakarta.annotation.Nullable LocalDate endDateNotEquals, @Param("endDateSpecified") @jakarta.annotation.Nullable Boolean endDateSpecified, @Param("endDateIn") @jakarta.annotation.Nullable List<LocalDate> endDateIn, @Param("endDateNotIn") @jakarta.annotation.Nullable List<LocalDate> endDateNotIn, @Param("daysOfWeekContains") @jakarta.annotation.Nullable String daysOfWeekContains, @Param("daysOfWeekDoesNotContain") @jakarta.annotation.Nullable String daysOfWeekDoesNotContain, @Param("daysOfWeekEquals") @jakarta.annotation.Nullable String daysOfWeekEquals, @Param("daysOfWeekNotEquals") @jakarta.annotation.Nullable String daysOfWeekNotEquals, @Param("daysOfWeekSpecified") @jakarta.annotation.Nullable Boolean daysOfWeekSpecified, @Param("daysOfWeekIn") @jakarta.annotation.Nullable List<String> daysOfWeekIn, @Param("daysOfWeekNotIn") @jakarta.annotation.Nullable List<String> daysOfWeekNotIn, @Param("activeEquals") @jakarta.annotation.Nullable Boolean activeEquals, @Param("activeNotEquals") @jakarta.annotation.Nullable Boolean activeNotEquals, @Param("activeSpecified") @jakarta.annotation.Nullable Boolean activeSpecified, @Param("activeIn") @jakarta.annotation.Nullable List<Boolean> activeIn, @Param("activeNotIn") @jakarta.annotation.Nullable List<Boolean> activeNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("timeSlotsIdGreaterThan") @jakarta.annotation.Nullable Long timeSlotsIdGreaterThan, @Param("timeSlotsIdLessThan") @jakarta.annotation.Nullable Long timeSlotsIdLessThan, @Param("timeSlotsIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long timeSlotsIdGreaterThanOrEqual, @Param("timeSlotsIdLessThanOrEqual") @jakarta.annotation.Nullable Long timeSlotsIdLessThanOrEqual, @Param("timeSlotsIdEquals") @jakarta.annotation.Nullable Long timeSlotsIdEquals, @Param("timeSlotsIdNotEquals") @jakarta.annotation.Nullable Long timeSlotsIdNotEquals, @Param("timeSlotsIdSpecified") @jakarta.annotation.Nullable Boolean timeSlotsIdSpecified, @Param("timeSlotsIdIn") @jakarta.annotation.Nullable List<Long> timeSlotsIdIn, @Param("timeSlotsIdNotIn") @jakarta.annotation.Nullable List<Long> timeSlotsIdNotIn, @Param("occasionRuleIdGreaterThan") @jakarta.annotation.Nullable Long occasionRuleIdGreaterThan, @Param("occasionRuleIdLessThan") @jakarta.annotation.Nullable Long occasionRuleIdLessThan, @Param("occasionRuleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long occasionRuleIdGreaterThanOrEqual, @Param("occasionRuleIdLessThanOrEqual") @jakarta.annotation.Nullable Long occasionRuleIdLessThanOrEqual, @Param("occasionRuleIdEquals") @jakarta.annotation.Nullable Long occasionRuleIdEquals, @Param("occasionRuleIdNotEquals") @jakarta.annotation.Nullable Long occasionRuleIdNotEquals, @Param("occasionRuleIdSpecified") @jakarta.annotation.Nullable Boolean occasionRuleIdSpecified, @Param("occasionRuleIdIn") @jakarta.annotation.Nullable List<Long> occasionRuleIdIn, @Param("occasionRuleIdNotIn") @jakarta.annotation.Nullable List<Long> occasionRuleIdNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countSchedules</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountSchedulesQueryParams} class that allows for
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
   *   <li>scheduleCodeContains -  (optional)</li>
   *   <li>scheduleCodeDoesNotContain -  (optional)</li>
   *   <li>scheduleCodeEquals -  (optional)</li>
   *   <li>scheduleCodeNotEquals -  (optional)</li>
   *   <li>scheduleCodeSpecified -  (optional)</li>
   *   <li>scheduleCodeIn -  (optional)</li>
   *   <li>scheduleCodeNotIn -  (optional)</li>
   *   <li>startDateGreaterThan -  (optional)</li>
   *   <li>startDateLessThan -  (optional)</li>
   *   <li>startDateGreaterThanOrEqual -  (optional)</li>
   *   <li>startDateLessThanOrEqual -  (optional)</li>
   *   <li>startDateEquals -  (optional)</li>
   *   <li>startDateNotEquals -  (optional)</li>
   *   <li>startDateSpecified -  (optional)</li>
   *   <li>startDateIn -  (optional)</li>
   *   <li>startDateNotIn -  (optional)</li>
   *   <li>endDateGreaterThan -  (optional)</li>
   *   <li>endDateLessThan -  (optional)</li>
   *   <li>endDateGreaterThanOrEqual -  (optional)</li>
   *   <li>endDateLessThanOrEqual -  (optional)</li>
   *   <li>endDateEquals -  (optional)</li>
   *   <li>endDateNotEquals -  (optional)</li>
   *   <li>endDateSpecified -  (optional)</li>
   *   <li>endDateIn -  (optional)</li>
   *   <li>endDateNotIn -  (optional)</li>
   *   <li>daysOfWeekContains -  (optional)</li>
   *   <li>daysOfWeekDoesNotContain -  (optional)</li>
   *   <li>daysOfWeekEquals -  (optional)</li>
   *   <li>daysOfWeekNotEquals -  (optional)</li>
   *   <li>daysOfWeekSpecified -  (optional)</li>
   *   <li>daysOfWeekIn -  (optional)</li>
   *   <li>daysOfWeekNotIn -  (optional)</li>
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
   *   <li>timeSlotsIdGreaterThan -  (optional)</li>
   *   <li>timeSlotsIdLessThan -  (optional)</li>
   *   <li>timeSlotsIdGreaterThanOrEqual -  (optional)</li>
   *   <li>timeSlotsIdLessThanOrEqual -  (optional)</li>
   *   <li>timeSlotsIdEquals -  (optional)</li>
   *   <li>timeSlotsIdNotEquals -  (optional)</li>
   *   <li>timeSlotsIdSpecified -  (optional)</li>
   *   <li>timeSlotsIdIn -  (optional)</li>
   *   <li>timeSlotsIdNotIn -  (optional)</li>
   *   <li>occasionRuleIdGreaterThan -  (optional)</li>
   *   <li>occasionRuleIdLessThan -  (optional)</li>
   *   <li>occasionRuleIdGreaterThanOrEqual -  (optional)</li>
   *   <li>occasionRuleIdLessThanOrEqual -  (optional)</li>
   *   <li>occasionRuleIdEquals -  (optional)</li>
   *   <li>occasionRuleIdNotEquals -  (optional)</li>
   *   <li>occasionRuleIdSpecified -  (optional)</li>
   *   <li>occasionRuleIdIn -  (optional)</li>
   *   <li>occasionRuleIdNotIn -  (optional)</li>
   *   <li>routeIdGreaterThan -  (optional)</li>
   *   <li>routeIdLessThan -  (optional)</li>
   *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
   *   <li>routeIdLessThanOrEqual -  (optional)</li>
   *   <li>routeIdEquals -  (optional)</li>
   *   <li>routeIdNotEquals -  (optional)</li>
   *   <li>routeIdSpecified -  (optional)</li>
   *   <li>routeIdIn -  (optional)</li>
   *   <li>routeIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return Long
   */
  @RequestLine("GET /api/schedules/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&scheduleCode.contains={scheduleCodeContains}&scheduleCode.doesNotContain={scheduleCodeDoesNotContain}&scheduleCode.equals={scheduleCodeEquals}&scheduleCode.notEquals={scheduleCodeNotEquals}&scheduleCode.specified={scheduleCodeSpecified}&scheduleCode.in={scheduleCodeIn}&scheduleCode.notIn={scheduleCodeNotIn}&startDate.greaterThan={startDateGreaterThan}&startDate.lessThan={startDateLessThan}&startDate.greaterThanOrEqual={startDateGreaterThanOrEqual}&startDate.lessThanOrEqual={startDateLessThanOrEqual}&startDate.equals={startDateEquals}&startDate.notEquals={startDateNotEquals}&startDate.specified={startDateSpecified}&startDate.in={startDateIn}&startDate.notIn={startDateNotIn}&endDate.greaterThan={endDateGreaterThan}&endDate.lessThan={endDateLessThan}&endDate.greaterThanOrEqual={endDateGreaterThanOrEqual}&endDate.lessThanOrEqual={endDateLessThanOrEqual}&endDate.equals={endDateEquals}&endDate.notEquals={endDateNotEquals}&endDate.specified={endDateSpecified}&endDate.in={endDateIn}&endDate.notIn={endDateNotIn}&daysOfWeek.contains={daysOfWeekContains}&daysOfWeek.doesNotContain={daysOfWeekDoesNotContain}&daysOfWeek.equals={daysOfWeekEquals}&daysOfWeek.notEquals={daysOfWeekNotEquals}&daysOfWeek.specified={daysOfWeekSpecified}&daysOfWeek.in={daysOfWeekIn}&daysOfWeek.notIn={daysOfWeekNotIn}&active.equals={activeEquals}&active.notEquals={activeNotEquals}&active.specified={activeSpecified}&active.in={activeIn}&active.notIn={activeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&timeSlotsId.greaterThan={timeSlotsIdGreaterThan}&timeSlotsId.lessThan={timeSlotsIdLessThan}&timeSlotsId.greaterThanOrEqual={timeSlotsIdGreaterThanOrEqual}&timeSlotsId.lessThanOrEqual={timeSlotsIdLessThanOrEqual}&timeSlotsId.equals={timeSlotsIdEquals}&timeSlotsId.notEquals={timeSlotsIdNotEquals}&timeSlotsId.specified={timeSlotsIdSpecified}&timeSlotsId.in={timeSlotsIdIn}&timeSlotsId.notIn={timeSlotsIdNotIn}&occasionRuleId.greaterThan={occasionRuleIdGreaterThan}&occasionRuleId.lessThan={occasionRuleIdLessThan}&occasionRuleId.greaterThanOrEqual={occasionRuleIdGreaterThanOrEqual}&occasionRuleId.lessThanOrEqual={occasionRuleIdLessThanOrEqual}&occasionRuleId.equals={occasionRuleIdEquals}&occasionRuleId.notEquals={occasionRuleIdNotEquals}&occasionRuleId.specified={occasionRuleIdSpecified}&occasionRuleId.in={occasionRuleIdIn}&occasionRuleId.notIn={occasionRuleIdNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countSchedules(@QueryMap(encoded=true) CountSchedulesQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countSchedules</code> that receives the query parameters as a map,
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
          *   <li>scheduleCodeContains -  (optional)</li>
          *   <li>scheduleCodeDoesNotContain -  (optional)</li>
          *   <li>scheduleCodeEquals -  (optional)</li>
          *   <li>scheduleCodeNotEquals -  (optional)</li>
          *   <li>scheduleCodeSpecified -  (optional)</li>
          *   <li>scheduleCodeIn -  (optional)</li>
          *   <li>scheduleCodeNotIn -  (optional)</li>
          *   <li>startDateGreaterThan -  (optional)</li>
          *   <li>startDateLessThan -  (optional)</li>
          *   <li>startDateGreaterThanOrEqual -  (optional)</li>
          *   <li>startDateLessThanOrEqual -  (optional)</li>
          *   <li>startDateEquals -  (optional)</li>
          *   <li>startDateNotEquals -  (optional)</li>
          *   <li>startDateSpecified -  (optional)</li>
          *   <li>startDateIn -  (optional)</li>
          *   <li>startDateNotIn -  (optional)</li>
          *   <li>endDateGreaterThan -  (optional)</li>
          *   <li>endDateLessThan -  (optional)</li>
          *   <li>endDateGreaterThanOrEqual -  (optional)</li>
          *   <li>endDateLessThanOrEqual -  (optional)</li>
          *   <li>endDateEquals -  (optional)</li>
          *   <li>endDateNotEquals -  (optional)</li>
          *   <li>endDateSpecified -  (optional)</li>
          *   <li>endDateIn -  (optional)</li>
          *   <li>endDateNotIn -  (optional)</li>
          *   <li>daysOfWeekContains -  (optional)</li>
          *   <li>daysOfWeekDoesNotContain -  (optional)</li>
          *   <li>daysOfWeekEquals -  (optional)</li>
          *   <li>daysOfWeekNotEquals -  (optional)</li>
          *   <li>daysOfWeekSpecified -  (optional)</li>
          *   <li>daysOfWeekIn -  (optional)</li>
          *   <li>daysOfWeekNotIn -  (optional)</li>
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
          *   <li>timeSlotsIdGreaterThan -  (optional)</li>
          *   <li>timeSlotsIdLessThan -  (optional)</li>
          *   <li>timeSlotsIdGreaterThanOrEqual -  (optional)</li>
          *   <li>timeSlotsIdLessThanOrEqual -  (optional)</li>
          *   <li>timeSlotsIdEquals -  (optional)</li>
          *   <li>timeSlotsIdNotEquals -  (optional)</li>
          *   <li>timeSlotsIdSpecified -  (optional)</li>
          *   <li>timeSlotsIdIn -  (optional)</li>
          *   <li>timeSlotsIdNotIn -  (optional)</li>
          *   <li>occasionRuleIdGreaterThan -  (optional)</li>
          *   <li>occasionRuleIdLessThan -  (optional)</li>
          *   <li>occasionRuleIdGreaterThanOrEqual -  (optional)</li>
          *   <li>occasionRuleIdLessThanOrEqual -  (optional)</li>
          *   <li>occasionRuleIdEquals -  (optional)</li>
          *   <li>occasionRuleIdNotEquals -  (optional)</li>
          *   <li>occasionRuleIdSpecified -  (optional)</li>
          *   <li>occasionRuleIdIn -  (optional)</li>
          *   <li>occasionRuleIdNotIn -  (optional)</li>
          *   <li>routeIdGreaterThan -  (optional)</li>
          *   <li>routeIdLessThan -  (optional)</li>
          *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
          *   <li>routeIdLessThanOrEqual -  (optional)</li>
          *   <li>routeIdEquals -  (optional)</li>
          *   <li>routeIdNotEquals -  (optional)</li>
          *   <li>routeIdSpecified -  (optional)</li>
          *   <li>routeIdIn -  (optional)</li>
          *   <li>routeIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return Long
      */
      @RequestLine("GET /api/schedules/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&scheduleCode.contains={scheduleCodeContains}&scheduleCode.doesNotContain={scheduleCodeDoesNotContain}&scheduleCode.equals={scheduleCodeEquals}&scheduleCode.notEquals={scheduleCodeNotEquals}&scheduleCode.specified={scheduleCodeSpecified}&scheduleCode.in={scheduleCodeIn}&scheduleCode.notIn={scheduleCodeNotIn}&startDate.greaterThan={startDateGreaterThan}&startDate.lessThan={startDateLessThan}&startDate.greaterThanOrEqual={startDateGreaterThanOrEqual}&startDate.lessThanOrEqual={startDateLessThanOrEqual}&startDate.equals={startDateEquals}&startDate.notEquals={startDateNotEquals}&startDate.specified={startDateSpecified}&startDate.in={startDateIn}&startDate.notIn={startDateNotIn}&endDate.greaterThan={endDateGreaterThan}&endDate.lessThan={endDateLessThan}&endDate.greaterThanOrEqual={endDateGreaterThanOrEqual}&endDate.lessThanOrEqual={endDateLessThanOrEqual}&endDate.equals={endDateEquals}&endDate.notEquals={endDateNotEquals}&endDate.specified={endDateSpecified}&endDate.in={endDateIn}&endDate.notIn={endDateNotIn}&daysOfWeek.contains={daysOfWeekContains}&daysOfWeek.doesNotContain={daysOfWeekDoesNotContain}&daysOfWeek.equals={daysOfWeekEquals}&daysOfWeek.notEquals={daysOfWeekNotEquals}&daysOfWeek.specified={daysOfWeekSpecified}&daysOfWeek.in={daysOfWeekIn}&daysOfWeek.notIn={daysOfWeekNotIn}&active.equals={activeEquals}&active.notEquals={activeNotEquals}&active.specified={activeSpecified}&active.in={activeIn}&active.notIn={activeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&timeSlotsId.greaterThan={timeSlotsIdGreaterThan}&timeSlotsId.lessThan={timeSlotsIdLessThan}&timeSlotsId.greaterThanOrEqual={timeSlotsIdGreaterThanOrEqual}&timeSlotsId.lessThanOrEqual={timeSlotsIdLessThanOrEqual}&timeSlotsId.equals={timeSlotsIdEquals}&timeSlotsId.notEquals={timeSlotsIdNotEquals}&timeSlotsId.specified={timeSlotsIdSpecified}&timeSlotsId.in={timeSlotsIdIn}&timeSlotsId.notIn={timeSlotsIdNotIn}&occasionRuleId.greaterThan={occasionRuleIdGreaterThan}&occasionRuleId.lessThan={occasionRuleIdLessThan}&occasionRuleId.greaterThanOrEqual={occasionRuleIdGreaterThanOrEqual}&occasionRuleId.lessThanOrEqual={occasionRuleIdLessThanOrEqual}&occasionRuleId.equals={occasionRuleIdEquals}&occasionRuleId.notEquals={occasionRuleIdNotEquals}&occasionRuleId.specified={occasionRuleIdSpecified}&occasionRuleId.in={occasionRuleIdIn}&occasionRuleId.notIn={occasionRuleIdNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countSchedulesWithHttpInfo(@QueryMap(encoded=true) CountSchedulesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countSchedules</code> method in a fluent style.
   */
  public static class CountSchedulesQueryParams extends HashMap<String, Object> {
    public CountSchedulesQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams scheduleCodeContains(@jakarta.annotation.Nullable final String value) {
      put("scheduleCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams scheduleCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("scheduleCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams scheduleCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("scheduleCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams scheduleCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("scheduleCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams scheduleCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("scheduleCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams scheduleCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("scheduleCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams scheduleCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("scheduleCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams startDateGreaterThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("startDate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams startDateLessThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("startDate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams startDateGreaterThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("startDate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams startDateLessThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("startDate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams startDateEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("startDate.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams startDateNotEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("startDate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams startDateSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("startDate.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams startDateIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("startDate.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams startDateNotIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("startDate.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams endDateGreaterThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("endDate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams endDateLessThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("endDate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams endDateGreaterThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("endDate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams endDateLessThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("endDate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams endDateEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("endDate.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams endDateNotEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("endDate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams endDateSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("endDate.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams endDateIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("endDate.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams endDateNotIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("endDate.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams daysOfWeekContains(@jakarta.annotation.Nullable final String value) {
      put("daysOfWeek.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams daysOfWeekDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("daysOfWeek.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams daysOfWeekEquals(@jakarta.annotation.Nullable final String value) {
      put("daysOfWeek.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams daysOfWeekNotEquals(@jakarta.annotation.Nullable final String value) {
      put("daysOfWeek.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams daysOfWeekSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("daysOfWeek.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams daysOfWeekIn(@jakarta.annotation.Nullable final List<String> value) {
      put("daysOfWeek.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams daysOfWeekNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("daysOfWeek.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams activeEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("active.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams activeNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("active.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams activeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("active.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams activeIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("active.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams activeNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("active.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams timeSlotsIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("timeSlotsId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams timeSlotsIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("timeSlotsId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams timeSlotsIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("timeSlotsId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams timeSlotsIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("timeSlotsId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams timeSlotsIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("timeSlotsId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams timeSlotsIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("timeSlotsId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams timeSlotsIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("timeSlotsId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams timeSlotsIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("timeSlotsId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams timeSlotsIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("timeSlotsId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams occasionRuleIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("occasionRuleId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams occasionRuleIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("occasionRuleId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams occasionRuleIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("occasionRuleId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams occasionRuleIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("occasionRuleId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams occasionRuleIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("occasionRuleId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams occasionRuleIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("occasionRuleId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams occasionRuleIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occasionRuleId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams occasionRuleIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("occasionRuleId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams occasionRuleIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("occasionRuleId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams routeIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams routeIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams routeIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams routeIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams routeIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams routeIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams routeIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("routeId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountSchedulesQueryParams routeIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams routeIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountSchedulesQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param scheduleDTO  (required)
   * @return ScheduleDTO
   */
  @RequestLine("POST /api/schedules")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ScheduleDTO createSchedule(@jakarta.annotation.Nonnull ScheduleDTO scheduleDTO);

  /**
   * 
   * Similar to <code>createSchedule</code> but it also returns the http response headers .
   * 
   * @param scheduleDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/schedules")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<ScheduleDTO> createScheduleWithHttpInfo(@jakarta.annotation.Nonnull ScheduleDTO scheduleDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/schedules/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteSchedule(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deleteSchedule</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/schedules/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteScheduleWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



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
   * @param scheduleCodeContains  (optional)
   * @param scheduleCodeDoesNotContain  (optional)
   * @param scheduleCodeEquals  (optional)
   * @param scheduleCodeNotEquals  (optional)
   * @param scheduleCodeSpecified  (optional)
   * @param scheduleCodeIn  (optional)
   * @param scheduleCodeNotIn  (optional)
   * @param startDateGreaterThan  (optional)
   * @param startDateLessThan  (optional)
   * @param startDateGreaterThanOrEqual  (optional)
   * @param startDateLessThanOrEqual  (optional)
   * @param startDateEquals  (optional)
   * @param startDateNotEquals  (optional)
   * @param startDateSpecified  (optional)
   * @param startDateIn  (optional)
   * @param startDateNotIn  (optional)
   * @param endDateGreaterThan  (optional)
   * @param endDateLessThan  (optional)
   * @param endDateGreaterThanOrEqual  (optional)
   * @param endDateLessThanOrEqual  (optional)
   * @param endDateEquals  (optional)
   * @param endDateNotEquals  (optional)
   * @param endDateSpecified  (optional)
   * @param endDateIn  (optional)
   * @param endDateNotIn  (optional)
   * @param daysOfWeekContains  (optional)
   * @param daysOfWeekDoesNotContain  (optional)
   * @param daysOfWeekEquals  (optional)
   * @param daysOfWeekNotEquals  (optional)
   * @param daysOfWeekSpecified  (optional)
   * @param daysOfWeekIn  (optional)
   * @param daysOfWeekNotIn  (optional)
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
   * @param timeSlotsIdGreaterThan  (optional)
   * @param timeSlotsIdLessThan  (optional)
   * @param timeSlotsIdGreaterThanOrEqual  (optional)
   * @param timeSlotsIdLessThanOrEqual  (optional)
   * @param timeSlotsIdEquals  (optional)
   * @param timeSlotsIdNotEquals  (optional)
   * @param timeSlotsIdSpecified  (optional)
   * @param timeSlotsIdIn  (optional)
   * @param timeSlotsIdNotIn  (optional)
   * @param occasionRuleIdGreaterThan  (optional)
   * @param occasionRuleIdLessThan  (optional)
   * @param occasionRuleIdGreaterThanOrEqual  (optional)
   * @param occasionRuleIdLessThanOrEqual  (optional)
   * @param occasionRuleIdEquals  (optional)
   * @param occasionRuleIdNotEquals  (optional)
   * @param occasionRuleIdSpecified  (optional)
   * @param occasionRuleIdIn  (optional)
   * @param occasionRuleIdNotIn  (optional)
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param distinct  (optional)
   * @return List&lt;ScheduleDTO&gt;
   */
  @RequestLine("GET /api/schedules?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&scheduleCode.contains={scheduleCodeContains}&scheduleCode.doesNotContain={scheduleCodeDoesNotContain}&scheduleCode.equals={scheduleCodeEquals}&scheduleCode.notEquals={scheduleCodeNotEquals}&scheduleCode.specified={scheduleCodeSpecified}&scheduleCode.in={scheduleCodeIn}&scheduleCode.notIn={scheduleCodeNotIn}&startDate.greaterThan={startDateGreaterThan}&startDate.lessThan={startDateLessThan}&startDate.greaterThanOrEqual={startDateGreaterThanOrEqual}&startDate.lessThanOrEqual={startDateLessThanOrEqual}&startDate.equals={startDateEquals}&startDate.notEquals={startDateNotEquals}&startDate.specified={startDateSpecified}&startDate.in={startDateIn}&startDate.notIn={startDateNotIn}&endDate.greaterThan={endDateGreaterThan}&endDate.lessThan={endDateLessThan}&endDate.greaterThanOrEqual={endDateGreaterThanOrEqual}&endDate.lessThanOrEqual={endDateLessThanOrEqual}&endDate.equals={endDateEquals}&endDate.notEquals={endDateNotEquals}&endDate.specified={endDateSpecified}&endDate.in={endDateIn}&endDate.notIn={endDateNotIn}&daysOfWeek.contains={daysOfWeekContains}&daysOfWeek.doesNotContain={daysOfWeekDoesNotContain}&daysOfWeek.equals={daysOfWeekEquals}&daysOfWeek.notEquals={daysOfWeekNotEquals}&daysOfWeek.specified={daysOfWeekSpecified}&daysOfWeek.in={daysOfWeekIn}&daysOfWeek.notIn={daysOfWeekNotIn}&active.equals={activeEquals}&active.notEquals={activeNotEquals}&active.specified={activeSpecified}&active.in={activeIn}&active.notIn={activeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&timeSlotsId.greaterThan={timeSlotsIdGreaterThan}&timeSlotsId.lessThan={timeSlotsIdLessThan}&timeSlotsId.greaterThanOrEqual={timeSlotsIdGreaterThanOrEqual}&timeSlotsId.lessThanOrEqual={timeSlotsIdLessThanOrEqual}&timeSlotsId.equals={timeSlotsIdEquals}&timeSlotsId.notEquals={timeSlotsIdNotEquals}&timeSlotsId.specified={timeSlotsIdSpecified}&timeSlotsId.in={timeSlotsIdIn}&timeSlotsId.notIn={timeSlotsIdNotIn}&occasionRuleId.greaterThan={occasionRuleIdGreaterThan}&occasionRuleId.lessThan={occasionRuleIdLessThan}&occasionRuleId.greaterThanOrEqual={occasionRuleIdGreaterThanOrEqual}&occasionRuleId.lessThanOrEqual={occasionRuleIdLessThanOrEqual}&occasionRuleId.equals={occasionRuleIdEquals}&occasionRuleId.notEquals={occasionRuleIdNotEquals}&occasionRuleId.specified={occasionRuleIdSpecified}&occasionRuleId.in={occasionRuleIdIn}&occasionRuleId.notIn={occasionRuleIdNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  List<ScheduleDTO> getAllSchedules(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("scheduleCodeContains") @jakarta.annotation.Nullable String scheduleCodeContains, @Param("scheduleCodeDoesNotContain") @jakarta.annotation.Nullable String scheduleCodeDoesNotContain, @Param("scheduleCodeEquals") @jakarta.annotation.Nullable String scheduleCodeEquals, @Param("scheduleCodeNotEquals") @jakarta.annotation.Nullable String scheduleCodeNotEquals, @Param("scheduleCodeSpecified") @jakarta.annotation.Nullable Boolean scheduleCodeSpecified, @Param("scheduleCodeIn") @jakarta.annotation.Nullable List<String> scheduleCodeIn, @Param("scheduleCodeNotIn") @jakarta.annotation.Nullable List<String> scheduleCodeNotIn, @Param("startDateGreaterThan") @jakarta.annotation.Nullable LocalDate startDateGreaterThan, @Param("startDateLessThan") @jakarta.annotation.Nullable LocalDate startDateLessThan, @Param("startDateGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate startDateGreaterThanOrEqual, @Param("startDateLessThanOrEqual") @jakarta.annotation.Nullable LocalDate startDateLessThanOrEqual, @Param("startDateEquals") @jakarta.annotation.Nullable LocalDate startDateEquals, @Param("startDateNotEquals") @jakarta.annotation.Nullable LocalDate startDateNotEquals, @Param("startDateSpecified") @jakarta.annotation.Nullable Boolean startDateSpecified, @Param("startDateIn") @jakarta.annotation.Nullable List<LocalDate> startDateIn, @Param("startDateNotIn") @jakarta.annotation.Nullable List<LocalDate> startDateNotIn, @Param("endDateGreaterThan") @jakarta.annotation.Nullable LocalDate endDateGreaterThan, @Param("endDateLessThan") @jakarta.annotation.Nullable LocalDate endDateLessThan, @Param("endDateGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate endDateGreaterThanOrEqual, @Param("endDateLessThanOrEqual") @jakarta.annotation.Nullable LocalDate endDateLessThanOrEqual, @Param("endDateEquals") @jakarta.annotation.Nullable LocalDate endDateEquals, @Param("endDateNotEquals") @jakarta.annotation.Nullable LocalDate endDateNotEquals, @Param("endDateSpecified") @jakarta.annotation.Nullable Boolean endDateSpecified, @Param("endDateIn") @jakarta.annotation.Nullable List<LocalDate> endDateIn, @Param("endDateNotIn") @jakarta.annotation.Nullable List<LocalDate> endDateNotIn, @Param("daysOfWeekContains") @jakarta.annotation.Nullable String daysOfWeekContains, @Param("daysOfWeekDoesNotContain") @jakarta.annotation.Nullable String daysOfWeekDoesNotContain, @Param("daysOfWeekEquals") @jakarta.annotation.Nullable String daysOfWeekEquals, @Param("daysOfWeekNotEquals") @jakarta.annotation.Nullable String daysOfWeekNotEquals, @Param("daysOfWeekSpecified") @jakarta.annotation.Nullable Boolean daysOfWeekSpecified, @Param("daysOfWeekIn") @jakarta.annotation.Nullable List<String> daysOfWeekIn, @Param("daysOfWeekNotIn") @jakarta.annotation.Nullable List<String> daysOfWeekNotIn, @Param("activeEquals") @jakarta.annotation.Nullable Boolean activeEquals, @Param("activeNotEquals") @jakarta.annotation.Nullable Boolean activeNotEquals, @Param("activeSpecified") @jakarta.annotation.Nullable Boolean activeSpecified, @Param("activeIn") @jakarta.annotation.Nullable List<Boolean> activeIn, @Param("activeNotIn") @jakarta.annotation.Nullable List<Boolean> activeNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("timeSlotsIdGreaterThan") @jakarta.annotation.Nullable Long timeSlotsIdGreaterThan, @Param("timeSlotsIdLessThan") @jakarta.annotation.Nullable Long timeSlotsIdLessThan, @Param("timeSlotsIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long timeSlotsIdGreaterThanOrEqual, @Param("timeSlotsIdLessThanOrEqual") @jakarta.annotation.Nullable Long timeSlotsIdLessThanOrEqual, @Param("timeSlotsIdEquals") @jakarta.annotation.Nullable Long timeSlotsIdEquals, @Param("timeSlotsIdNotEquals") @jakarta.annotation.Nullable Long timeSlotsIdNotEquals, @Param("timeSlotsIdSpecified") @jakarta.annotation.Nullable Boolean timeSlotsIdSpecified, @Param("timeSlotsIdIn") @jakarta.annotation.Nullable List<Long> timeSlotsIdIn, @Param("timeSlotsIdNotIn") @jakarta.annotation.Nullable List<Long> timeSlotsIdNotIn, @Param("occasionRuleIdGreaterThan") @jakarta.annotation.Nullable Long occasionRuleIdGreaterThan, @Param("occasionRuleIdLessThan") @jakarta.annotation.Nullable Long occasionRuleIdLessThan, @Param("occasionRuleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long occasionRuleIdGreaterThanOrEqual, @Param("occasionRuleIdLessThanOrEqual") @jakarta.annotation.Nullable Long occasionRuleIdLessThanOrEqual, @Param("occasionRuleIdEquals") @jakarta.annotation.Nullable Long occasionRuleIdEquals, @Param("occasionRuleIdNotEquals") @jakarta.annotation.Nullable Long occasionRuleIdNotEquals, @Param("occasionRuleIdSpecified") @jakarta.annotation.Nullable Boolean occasionRuleIdSpecified, @Param("occasionRuleIdIn") @jakarta.annotation.Nullable List<Long> occasionRuleIdIn, @Param("occasionRuleIdNotIn") @jakarta.annotation.Nullable List<Long> occasionRuleIdNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>getAllSchedules</code> but it also returns the http response headers .
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
   * @param scheduleCodeContains  (optional)
   * @param scheduleCodeDoesNotContain  (optional)
   * @param scheduleCodeEquals  (optional)
   * @param scheduleCodeNotEquals  (optional)
   * @param scheduleCodeSpecified  (optional)
   * @param scheduleCodeIn  (optional)
   * @param scheduleCodeNotIn  (optional)
   * @param startDateGreaterThan  (optional)
   * @param startDateLessThan  (optional)
   * @param startDateGreaterThanOrEqual  (optional)
   * @param startDateLessThanOrEqual  (optional)
   * @param startDateEquals  (optional)
   * @param startDateNotEquals  (optional)
   * @param startDateSpecified  (optional)
   * @param startDateIn  (optional)
   * @param startDateNotIn  (optional)
   * @param endDateGreaterThan  (optional)
   * @param endDateLessThan  (optional)
   * @param endDateGreaterThanOrEqual  (optional)
   * @param endDateLessThanOrEqual  (optional)
   * @param endDateEquals  (optional)
   * @param endDateNotEquals  (optional)
   * @param endDateSpecified  (optional)
   * @param endDateIn  (optional)
   * @param endDateNotIn  (optional)
   * @param daysOfWeekContains  (optional)
   * @param daysOfWeekDoesNotContain  (optional)
   * @param daysOfWeekEquals  (optional)
   * @param daysOfWeekNotEquals  (optional)
   * @param daysOfWeekSpecified  (optional)
   * @param daysOfWeekIn  (optional)
   * @param daysOfWeekNotIn  (optional)
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
   * @param timeSlotsIdGreaterThan  (optional)
   * @param timeSlotsIdLessThan  (optional)
   * @param timeSlotsIdGreaterThanOrEqual  (optional)
   * @param timeSlotsIdLessThanOrEqual  (optional)
   * @param timeSlotsIdEquals  (optional)
   * @param timeSlotsIdNotEquals  (optional)
   * @param timeSlotsIdSpecified  (optional)
   * @param timeSlotsIdIn  (optional)
   * @param timeSlotsIdNotIn  (optional)
   * @param occasionRuleIdGreaterThan  (optional)
   * @param occasionRuleIdLessThan  (optional)
   * @param occasionRuleIdGreaterThanOrEqual  (optional)
   * @param occasionRuleIdLessThanOrEqual  (optional)
   * @param occasionRuleIdEquals  (optional)
   * @param occasionRuleIdNotEquals  (optional)
   * @param occasionRuleIdSpecified  (optional)
   * @param occasionRuleIdIn  (optional)
   * @param occasionRuleIdNotIn  (optional)
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/schedules?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&scheduleCode.contains={scheduleCodeContains}&scheduleCode.doesNotContain={scheduleCodeDoesNotContain}&scheduleCode.equals={scheduleCodeEquals}&scheduleCode.notEquals={scheduleCodeNotEquals}&scheduleCode.specified={scheduleCodeSpecified}&scheduleCode.in={scheduleCodeIn}&scheduleCode.notIn={scheduleCodeNotIn}&startDate.greaterThan={startDateGreaterThan}&startDate.lessThan={startDateLessThan}&startDate.greaterThanOrEqual={startDateGreaterThanOrEqual}&startDate.lessThanOrEqual={startDateLessThanOrEqual}&startDate.equals={startDateEquals}&startDate.notEquals={startDateNotEquals}&startDate.specified={startDateSpecified}&startDate.in={startDateIn}&startDate.notIn={startDateNotIn}&endDate.greaterThan={endDateGreaterThan}&endDate.lessThan={endDateLessThan}&endDate.greaterThanOrEqual={endDateGreaterThanOrEqual}&endDate.lessThanOrEqual={endDateLessThanOrEqual}&endDate.equals={endDateEquals}&endDate.notEquals={endDateNotEquals}&endDate.specified={endDateSpecified}&endDate.in={endDateIn}&endDate.notIn={endDateNotIn}&daysOfWeek.contains={daysOfWeekContains}&daysOfWeek.doesNotContain={daysOfWeekDoesNotContain}&daysOfWeek.equals={daysOfWeekEquals}&daysOfWeek.notEquals={daysOfWeekNotEquals}&daysOfWeek.specified={daysOfWeekSpecified}&daysOfWeek.in={daysOfWeekIn}&daysOfWeek.notIn={daysOfWeekNotIn}&active.equals={activeEquals}&active.notEquals={activeNotEquals}&active.specified={activeSpecified}&active.in={activeIn}&active.notIn={activeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&timeSlotsId.greaterThan={timeSlotsIdGreaterThan}&timeSlotsId.lessThan={timeSlotsIdLessThan}&timeSlotsId.greaterThanOrEqual={timeSlotsIdGreaterThanOrEqual}&timeSlotsId.lessThanOrEqual={timeSlotsIdLessThanOrEqual}&timeSlotsId.equals={timeSlotsIdEquals}&timeSlotsId.notEquals={timeSlotsIdNotEquals}&timeSlotsId.specified={timeSlotsIdSpecified}&timeSlotsId.in={timeSlotsIdIn}&timeSlotsId.notIn={timeSlotsIdNotIn}&occasionRuleId.greaterThan={occasionRuleIdGreaterThan}&occasionRuleId.lessThan={occasionRuleIdLessThan}&occasionRuleId.greaterThanOrEqual={occasionRuleIdGreaterThanOrEqual}&occasionRuleId.lessThanOrEqual={occasionRuleIdLessThanOrEqual}&occasionRuleId.equals={occasionRuleIdEquals}&occasionRuleId.notEquals={occasionRuleIdNotEquals}&occasionRuleId.specified={occasionRuleIdSpecified}&occasionRuleId.in={occasionRuleIdIn}&occasionRuleId.notIn={occasionRuleIdNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<ScheduleDTO>> getAllSchedulesWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("scheduleCodeContains") @jakarta.annotation.Nullable String scheduleCodeContains, @Param("scheduleCodeDoesNotContain") @jakarta.annotation.Nullable String scheduleCodeDoesNotContain, @Param("scheduleCodeEquals") @jakarta.annotation.Nullable String scheduleCodeEquals, @Param("scheduleCodeNotEquals") @jakarta.annotation.Nullable String scheduleCodeNotEquals, @Param("scheduleCodeSpecified") @jakarta.annotation.Nullable Boolean scheduleCodeSpecified, @Param("scheduleCodeIn") @jakarta.annotation.Nullable List<String> scheduleCodeIn, @Param("scheduleCodeNotIn") @jakarta.annotation.Nullable List<String> scheduleCodeNotIn, @Param("startDateGreaterThan") @jakarta.annotation.Nullable LocalDate startDateGreaterThan, @Param("startDateLessThan") @jakarta.annotation.Nullable LocalDate startDateLessThan, @Param("startDateGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate startDateGreaterThanOrEqual, @Param("startDateLessThanOrEqual") @jakarta.annotation.Nullable LocalDate startDateLessThanOrEqual, @Param("startDateEquals") @jakarta.annotation.Nullable LocalDate startDateEquals, @Param("startDateNotEquals") @jakarta.annotation.Nullable LocalDate startDateNotEquals, @Param("startDateSpecified") @jakarta.annotation.Nullable Boolean startDateSpecified, @Param("startDateIn") @jakarta.annotation.Nullable List<LocalDate> startDateIn, @Param("startDateNotIn") @jakarta.annotation.Nullable List<LocalDate> startDateNotIn, @Param("endDateGreaterThan") @jakarta.annotation.Nullable LocalDate endDateGreaterThan, @Param("endDateLessThan") @jakarta.annotation.Nullable LocalDate endDateLessThan, @Param("endDateGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate endDateGreaterThanOrEqual, @Param("endDateLessThanOrEqual") @jakarta.annotation.Nullable LocalDate endDateLessThanOrEqual, @Param("endDateEquals") @jakarta.annotation.Nullable LocalDate endDateEquals, @Param("endDateNotEquals") @jakarta.annotation.Nullable LocalDate endDateNotEquals, @Param("endDateSpecified") @jakarta.annotation.Nullable Boolean endDateSpecified, @Param("endDateIn") @jakarta.annotation.Nullable List<LocalDate> endDateIn, @Param("endDateNotIn") @jakarta.annotation.Nullable List<LocalDate> endDateNotIn, @Param("daysOfWeekContains") @jakarta.annotation.Nullable String daysOfWeekContains, @Param("daysOfWeekDoesNotContain") @jakarta.annotation.Nullable String daysOfWeekDoesNotContain, @Param("daysOfWeekEquals") @jakarta.annotation.Nullable String daysOfWeekEquals, @Param("daysOfWeekNotEquals") @jakarta.annotation.Nullable String daysOfWeekNotEquals, @Param("daysOfWeekSpecified") @jakarta.annotation.Nullable Boolean daysOfWeekSpecified, @Param("daysOfWeekIn") @jakarta.annotation.Nullable List<String> daysOfWeekIn, @Param("daysOfWeekNotIn") @jakarta.annotation.Nullable List<String> daysOfWeekNotIn, @Param("activeEquals") @jakarta.annotation.Nullable Boolean activeEquals, @Param("activeNotEquals") @jakarta.annotation.Nullable Boolean activeNotEquals, @Param("activeSpecified") @jakarta.annotation.Nullable Boolean activeSpecified, @Param("activeIn") @jakarta.annotation.Nullable List<Boolean> activeIn, @Param("activeNotIn") @jakarta.annotation.Nullable List<Boolean> activeNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("timeSlotsIdGreaterThan") @jakarta.annotation.Nullable Long timeSlotsIdGreaterThan, @Param("timeSlotsIdLessThan") @jakarta.annotation.Nullable Long timeSlotsIdLessThan, @Param("timeSlotsIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long timeSlotsIdGreaterThanOrEqual, @Param("timeSlotsIdLessThanOrEqual") @jakarta.annotation.Nullable Long timeSlotsIdLessThanOrEqual, @Param("timeSlotsIdEquals") @jakarta.annotation.Nullable Long timeSlotsIdEquals, @Param("timeSlotsIdNotEquals") @jakarta.annotation.Nullable Long timeSlotsIdNotEquals, @Param("timeSlotsIdSpecified") @jakarta.annotation.Nullable Boolean timeSlotsIdSpecified, @Param("timeSlotsIdIn") @jakarta.annotation.Nullable List<Long> timeSlotsIdIn, @Param("timeSlotsIdNotIn") @jakarta.annotation.Nullable List<Long> timeSlotsIdNotIn, @Param("occasionRuleIdGreaterThan") @jakarta.annotation.Nullable Long occasionRuleIdGreaterThan, @Param("occasionRuleIdLessThan") @jakarta.annotation.Nullable Long occasionRuleIdLessThan, @Param("occasionRuleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long occasionRuleIdGreaterThanOrEqual, @Param("occasionRuleIdLessThanOrEqual") @jakarta.annotation.Nullable Long occasionRuleIdLessThanOrEqual, @Param("occasionRuleIdEquals") @jakarta.annotation.Nullable Long occasionRuleIdEquals, @Param("occasionRuleIdNotEquals") @jakarta.annotation.Nullable Long occasionRuleIdNotEquals, @Param("occasionRuleIdSpecified") @jakarta.annotation.Nullable Boolean occasionRuleIdSpecified, @Param("occasionRuleIdIn") @jakarta.annotation.Nullable List<Long> occasionRuleIdIn, @Param("occasionRuleIdNotIn") @jakarta.annotation.Nullable List<Long> occasionRuleIdNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllSchedules</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllSchedulesQueryParams} class that allows for
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
   *   <li>scheduleCodeContains -  (optional)</li>
   *   <li>scheduleCodeDoesNotContain -  (optional)</li>
   *   <li>scheduleCodeEquals -  (optional)</li>
   *   <li>scheduleCodeNotEquals -  (optional)</li>
   *   <li>scheduleCodeSpecified -  (optional)</li>
   *   <li>scheduleCodeIn -  (optional)</li>
   *   <li>scheduleCodeNotIn -  (optional)</li>
   *   <li>startDateGreaterThan -  (optional)</li>
   *   <li>startDateLessThan -  (optional)</li>
   *   <li>startDateGreaterThanOrEqual -  (optional)</li>
   *   <li>startDateLessThanOrEqual -  (optional)</li>
   *   <li>startDateEquals -  (optional)</li>
   *   <li>startDateNotEquals -  (optional)</li>
   *   <li>startDateSpecified -  (optional)</li>
   *   <li>startDateIn -  (optional)</li>
   *   <li>startDateNotIn -  (optional)</li>
   *   <li>endDateGreaterThan -  (optional)</li>
   *   <li>endDateLessThan -  (optional)</li>
   *   <li>endDateGreaterThanOrEqual -  (optional)</li>
   *   <li>endDateLessThanOrEqual -  (optional)</li>
   *   <li>endDateEquals -  (optional)</li>
   *   <li>endDateNotEquals -  (optional)</li>
   *   <li>endDateSpecified -  (optional)</li>
   *   <li>endDateIn -  (optional)</li>
   *   <li>endDateNotIn -  (optional)</li>
   *   <li>daysOfWeekContains -  (optional)</li>
   *   <li>daysOfWeekDoesNotContain -  (optional)</li>
   *   <li>daysOfWeekEquals -  (optional)</li>
   *   <li>daysOfWeekNotEquals -  (optional)</li>
   *   <li>daysOfWeekSpecified -  (optional)</li>
   *   <li>daysOfWeekIn -  (optional)</li>
   *   <li>daysOfWeekNotIn -  (optional)</li>
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
   *   <li>timeSlotsIdGreaterThan -  (optional)</li>
   *   <li>timeSlotsIdLessThan -  (optional)</li>
   *   <li>timeSlotsIdGreaterThanOrEqual -  (optional)</li>
   *   <li>timeSlotsIdLessThanOrEqual -  (optional)</li>
   *   <li>timeSlotsIdEquals -  (optional)</li>
   *   <li>timeSlotsIdNotEquals -  (optional)</li>
   *   <li>timeSlotsIdSpecified -  (optional)</li>
   *   <li>timeSlotsIdIn -  (optional)</li>
   *   <li>timeSlotsIdNotIn -  (optional)</li>
   *   <li>occasionRuleIdGreaterThan -  (optional)</li>
   *   <li>occasionRuleIdLessThan -  (optional)</li>
   *   <li>occasionRuleIdGreaterThanOrEqual -  (optional)</li>
   *   <li>occasionRuleIdLessThanOrEqual -  (optional)</li>
   *   <li>occasionRuleIdEquals -  (optional)</li>
   *   <li>occasionRuleIdNotEquals -  (optional)</li>
   *   <li>occasionRuleIdSpecified -  (optional)</li>
   *   <li>occasionRuleIdIn -  (optional)</li>
   *   <li>occasionRuleIdNotIn -  (optional)</li>
   *   <li>routeIdGreaterThan -  (optional)</li>
   *   <li>routeIdLessThan -  (optional)</li>
   *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
   *   <li>routeIdLessThanOrEqual -  (optional)</li>
   *   <li>routeIdEquals -  (optional)</li>
   *   <li>routeIdNotEquals -  (optional)</li>
   *   <li>routeIdSpecified -  (optional)</li>
   *   <li>routeIdIn -  (optional)</li>
   *   <li>routeIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return List&lt;ScheduleDTO&gt;
   */
  @RequestLine("GET /api/schedules?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&scheduleCode.contains={scheduleCodeContains}&scheduleCode.doesNotContain={scheduleCodeDoesNotContain}&scheduleCode.equals={scheduleCodeEquals}&scheduleCode.notEquals={scheduleCodeNotEquals}&scheduleCode.specified={scheduleCodeSpecified}&scheduleCode.in={scheduleCodeIn}&scheduleCode.notIn={scheduleCodeNotIn}&startDate.greaterThan={startDateGreaterThan}&startDate.lessThan={startDateLessThan}&startDate.greaterThanOrEqual={startDateGreaterThanOrEqual}&startDate.lessThanOrEqual={startDateLessThanOrEqual}&startDate.equals={startDateEquals}&startDate.notEquals={startDateNotEquals}&startDate.specified={startDateSpecified}&startDate.in={startDateIn}&startDate.notIn={startDateNotIn}&endDate.greaterThan={endDateGreaterThan}&endDate.lessThan={endDateLessThan}&endDate.greaterThanOrEqual={endDateGreaterThanOrEqual}&endDate.lessThanOrEqual={endDateLessThanOrEqual}&endDate.equals={endDateEquals}&endDate.notEquals={endDateNotEquals}&endDate.specified={endDateSpecified}&endDate.in={endDateIn}&endDate.notIn={endDateNotIn}&daysOfWeek.contains={daysOfWeekContains}&daysOfWeek.doesNotContain={daysOfWeekDoesNotContain}&daysOfWeek.equals={daysOfWeekEquals}&daysOfWeek.notEquals={daysOfWeekNotEquals}&daysOfWeek.specified={daysOfWeekSpecified}&daysOfWeek.in={daysOfWeekIn}&daysOfWeek.notIn={daysOfWeekNotIn}&active.equals={activeEquals}&active.notEquals={activeNotEquals}&active.specified={activeSpecified}&active.in={activeIn}&active.notIn={activeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&timeSlotsId.greaterThan={timeSlotsIdGreaterThan}&timeSlotsId.lessThan={timeSlotsIdLessThan}&timeSlotsId.greaterThanOrEqual={timeSlotsIdGreaterThanOrEqual}&timeSlotsId.lessThanOrEqual={timeSlotsIdLessThanOrEqual}&timeSlotsId.equals={timeSlotsIdEquals}&timeSlotsId.notEquals={timeSlotsIdNotEquals}&timeSlotsId.specified={timeSlotsIdSpecified}&timeSlotsId.in={timeSlotsIdIn}&timeSlotsId.notIn={timeSlotsIdNotIn}&occasionRuleId.greaterThan={occasionRuleIdGreaterThan}&occasionRuleId.lessThan={occasionRuleIdLessThan}&occasionRuleId.greaterThanOrEqual={occasionRuleIdGreaterThanOrEqual}&occasionRuleId.lessThanOrEqual={occasionRuleIdLessThanOrEqual}&occasionRuleId.equals={occasionRuleIdEquals}&occasionRuleId.notEquals={occasionRuleIdNotEquals}&occasionRuleId.specified={occasionRuleIdSpecified}&occasionRuleId.in={occasionRuleIdIn}&occasionRuleId.notIn={occasionRuleIdNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  List<ScheduleDTO> getAllSchedules(@QueryMap(encoded=true) GetAllSchedulesQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllSchedules</code> that receives the query parameters as a map,
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
          *   <li>scheduleCodeContains -  (optional)</li>
          *   <li>scheduleCodeDoesNotContain -  (optional)</li>
          *   <li>scheduleCodeEquals -  (optional)</li>
          *   <li>scheduleCodeNotEquals -  (optional)</li>
          *   <li>scheduleCodeSpecified -  (optional)</li>
          *   <li>scheduleCodeIn -  (optional)</li>
          *   <li>scheduleCodeNotIn -  (optional)</li>
          *   <li>startDateGreaterThan -  (optional)</li>
          *   <li>startDateLessThan -  (optional)</li>
          *   <li>startDateGreaterThanOrEqual -  (optional)</li>
          *   <li>startDateLessThanOrEqual -  (optional)</li>
          *   <li>startDateEquals -  (optional)</li>
          *   <li>startDateNotEquals -  (optional)</li>
          *   <li>startDateSpecified -  (optional)</li>
          *   <li>startDateIn -  (optional)</li>
          *   <li>startDateNotIn -  (optional)</li>
          *   <li>endDateGreaterThan -  (optional)</li>
          *   <li>endDateLessThan -  (optional)</li>
          *   <li>endDateGreaterThanOrEqual -  (optional)</li>
          *   <li>endDateLessThanOrEqual -  (optional)</li>
          *   <li>endDateEquals -  (optional)</li>
          *   <li>endDateNotEquals -  (optional)</li>
          *   <li>endDateSpecified -  (optional)</li>
          *   <li>endDateIn -  (optional)</li>
          *   <li>endDateNotIn -  (optional)</li>
          *   <li>daysOfWeekContains -  (optional)</li>
          *   <li>daysOfWeekDoesNotContain -  (optional)</li>
          *   <li>daysOfWeekEquals -  (optional)</li>
          *   <li>daysOfWeekNotEquals -  (optional)</li>
          *   <li>daysOfWeekSpecified -  (optional)</li>
          *   <li>daysOfWeekIn -  (optional)</li>
          *   <li>daysOfWeekNotIn -  (optional)</li>
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
          *   <li>timeSlotsIdGreaterThan -  (optional)</li>
          *   <li>timeSlotsIdLessThan -  (optional)</li>
          *   <li>timeSlotsIdGreaterThanOrEqual -  (optional)</li>
          *   <li>timeSlotsIdLessThanOrEqual -  (optional)</li>
          *   <li>timeSlotsIdEquals -  (optional)</li>
          *   <li>timeSlotsIdNotEquals -  (optional)</li>
          *   <li>timeSlotsIdSpecified -  (optional)</li>
          *   <li>timeSlotsIdIn -  (optional)</li>
          *   <li>timeSlotsIdNotIn -  (optional)</li>
          *   <li>occasionRuleIdGreaterThan -  (optional)</li>
          *   <li>occasionRuleIdLessThan -  (optional)</li>
          *   <li>occasionRuleIdGreaterThanOrEqual -  (optional)</li>
          *   <li>occasionRuleIdLessThanOrEqual -  (optional)</li>
          *   <li>occasionRuleIdEquals -  (optional)</li>
          *   <li>occasionRuleIdNotEquals -  (optional)</li>
          *   <li>occasionRuleIdSpecified -  (optional)</li>
          *   <li>occasionRuleIdIn -  (optional)</li>
          *   <li>occasionRuleIdNotIn -  (optional)</li>
          *   <li>routeIdGreaterThan -  (optional)</li>
          *   <li>routeIdLessThan -  (optional)</li>
          *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
          *   <li>routeIdLessThanOrEqual -  (optional)</li>
          *   <li>routeIdEquals -  (optional)</li>
          *   <li>routeIdNotEquals -  (optional)</li>
          *   <li>routeIdSpecified -  (optional)</li>
          *   <li>routeIdIn -  (optional)</li>
          *   <li>routeIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return List&lt;ScheduleDTO&gt;
      */
      @RequestLine("GET /api/schedules?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&scheduleCode.contains={scheduleCodeContains}&scheduleCode.doesNotContain={scheduleCodeDoesNotContain}&scheduleCode.equals={scheduleCodeEquals}&scheduleCode.notEquals={scheduleCodeNotEquals}&scheduleCode.specified={scheduleCodeSpecified}&scheduleCode.in={scheduleCodeIn}&scheduleCode.notIn={scheduleCodeNotIn}&startDate.greaterThan={startDateGreaterThan}&startDate.lessThan={startDateLessThan}&startDate.greaterThanOrEqual={startDateGreaterThanOrEqual}&startDate.lessThanOrEqual={startDateLessThanOrEqual}&startDate.equals={startDateEquals}&startDate.notEquals={startDateNotEquals}&startDate.specified={startDateSpecified}&startDate.in={startDateIn}&startDate.notIn={startDateNotIn}&endDate.greaterThan={endDateGreaterThan}&endDate.lessThan={endDateLessThan}&endDate.greaterThanOrEqual={endDateGreaterThanOrEqual}&endDate.lessThanOrEqual={endDateLessThanOrEqual}&endDate.equals={endDateEquals}&endDate.notEquals={endDateNotEquals}&endDate.specified={endDateSpecified}&endDate.in={endDateIn}&endDate.notIn={endDateNotIn}&daysOfWeek.contains={daysOfWeekContains}&daysOfWeek.doesNotContain={daysOfWeekDoesNotContain}&daysOfWeek.equals={daysOfWeekEquals}&daysOfWeek.notEquals={daysOfWeekNotEquals}&daysOfWeek.specified={daysOfWeekSpecified}&daysOfWeek.in={daysOfWeekIn}&daysOfWeek.notIn={daysOfWeekNotIn}&active.equals={activeEquals}&active.notEquals={activeNotEquals}&active.specified={activeSpecified}&active.in={activeIn}&active.notIn={activeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&timeSlotsId.greaterThan={timeSlotsIdGreaterThan}&timeSlotsId.lessThan={timeSlotsIdLessThan}&timeSlotsId.greaterThanOrEqual={timeSlotsIdGreaterThanOrEqual}&timeSlotsId.lessThanOrEqual={timeSlotsIdLessThanOrEqual}&timeSlotsId.equals={timeSlotsIdEquals}&timeSlotsId.notEquals={timeSlotsIdNotEquals}&timeSlotsId.specified={timeSlotsIdSpecified}&timeSlotsId.in={timeSlotsIdIn}&timeSlotsId.notIn={timeSlotsIdNotIn}&occasionRuleId.greaterThan={occasionRuleIdGreaterThan}&occasionRuleId.lessThan={occasionRuleIdLessThan}&occasionRuleId.greaterThanOrEqual={occasionRuleIdGreaterThanOrEqual}&occasionRuleId.lessThanOrEqual={occasionRuleIdLessThanOrEqual}&occasionRuleId.equals={occasionRuleIdEquals}&occasionRuleId.notEquals={occasionRuleIdNotEquals}&occasionRuleId.specified={occasionRuleIdSpecified}&occasionRuleId.in={occasionRuleIdIn}&occasionRuleId.notIn={occasionRuleIdNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<ScheduleDTO>> getAllSchedulesWithHttpInfo(@QueryMap(encoded=true) GetAllSchedulesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllSchedules</code> method in a fluent style.
   */
  public static class GetAllSchedulesQueryParams extends HashMap<String, Object> {
    public GetAllSchedulesQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams scheduleCodeContains(@jakarta.annotation.Nullable final String value) {
      put("scheduleCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams scheduleCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("scheduleCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams scheduleCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("scheduleCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams scheduleCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("scheduleCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams scheduleCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("scheduleCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams scheduleCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("scheduleCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams scheduleCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("scheduleCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams startDateGreaterThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("startDate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams startDateLessThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("startDate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams startDateGreaterThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("startDate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams startDateLessThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("startDate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams startDateEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("startDate.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams startDateNotEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("startDate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams startDateSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("startDate.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams startDateIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("startDate.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams startDateNotIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("startDate.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams endDateGreaterThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("endDate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams endDateLessThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("endDate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams endDateGreaterThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("endDate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams endDateLessThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("endDate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams endDateEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("endDate.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams endDateNotEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("endDate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams endDateSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("endDate.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams endDateIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("endDate.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams endDateNotIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("endDate.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams daysOfWeekContains(@jakarta.annotation.Nullable final String value) {
      put("daysOfWeek.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams daysOfWeekDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("daysOfWeek.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams daysOfWeekEquals(@jakarta.annotation.Nullable final String value) {
      put("daysOfWeek.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams daysOfWeekNotEquals(@jakarta.annotation.Nullable final String value) {
      put("daysOfWeek.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams daysOfWeekSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("daysOfWeek.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams daysOfWeekIn(@jakarta.annotation.Nullable final List<String> value) {
      put("daysOfWeek.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams daysOfWeekNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("daysOfWeek.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams activeEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("active.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams activeNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("active.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams activeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("active.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams activeIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("active.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams activeNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("active.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams timeSlotsIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("timeSlotsId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams timeSlotsIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("timeSlotsId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams timeSlotsIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("timeSlotsId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams timeSlotsIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("timeSlotsId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams timeSlotsIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("timeSlotsId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams timeSlotsIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("timeSlotsId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams timeSlotsIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("timeSlotsId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams timeSlotsIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("timeSlotsId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams timeSlotsIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("timeSlotsId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams occasionRuleIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("occasionRuleId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams occasionRuleIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("occasionRuleId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams occasionRuleIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("occasionRuleId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams occasionRuleIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("occasionRuleId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams occasionRuleIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("occasionRuleId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams occasionRuleIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("occasionRuleId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams occasionRuleIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occasionRuleId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams occasionRuleIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("occasionRuleId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams occasionRuleIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("occasionRuleId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams routeIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams routeIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams routeIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams routeIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams routeIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams routeIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams routeIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("routeId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllSchedulesQueryParams routeIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams routeIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllSchedulesQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return ScheduleDTO
   */
  @RequestLine("GET /api/schedules/{id}")
  @Headers({
    "Accept: */*",
  })
  ScheduleDTO getSchedule(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getSchedule</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/schedules/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<ScheduleDTO> getScheduleWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param scheduleDTO  (required)
   * @return ScheduleDTO
   */
  @RequestLine("PATCH /api/schedules/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ScheduleDTO partialUpdateSchedule(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ScheduleDTO scheduleDTO);

  /**
   * 
   * Similar to <code>partialUpdateSchedule</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param scheduleDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/schedules/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<ScheduleDTO> partialUpdateScheduleWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ScheduleDTO scheduleDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param scheduleDTO  (required)
   * @return ScheduleDTO
   */
  @RequestLine("PUT /api/schedules/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ScheduleDTO updateSchedule(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ScheduleDTO scheduleDTO);

  /**
   * 
   * Similar to <code>updateSchedule</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param scheduleDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/schedules/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<ScheduleDTO> updateScheduleWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ScheduleDTO scheduleDTO);


}
