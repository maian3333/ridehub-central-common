package com.ridehub.feign.msroute.client.api;

import com.ridehub.feign.msroute.client.invoker.ApiClient;
import com.ridehub.feign.msroute.client.invoker.EncodingUtils;
import com.ridehub.feign.msroute.client.model.ApiResponse;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import com.ridehub.feign.msroute.client.model.ScheduleOccasionDTO;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface ScheduleOccasionResourceMsrouteApi extends ApiClient.Api {


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
   * @param occasionEquals  (optional)
   * @param occasionNotEquals  (optional)
   * @param occasionSpecified  (optional)
   * @param occasionIn  (optional)
   * @param occasionNotIn  (optional)
   * @param occasionFactorGreaterThan  (optional)
   * @param occasionFactorLessThan  (optional)
   * @param occasionFactorGreaterThanOrEqual  (optional)
   * @param occasionFactorLessThanOrEqual  (optional)
   * @param occasionFactorEquals  (optional)
   * @param occasionFactorNotEquals  (optional)
   * @param occasionFactorSpecified  (optional)
   * @param occasionFactorIn  (optional)
   * @param occasionFactorNotIn  (optional)
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
  @RequestLine("GET /api/schedule-occasions/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&occasion.equals={occasionEquals}&occasion.notEquals={occasionNotEquals}&occasion.specified={occasionSpecified}&occasion.in={occasionIn}&occasion.notIn={occasionNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&scheduleId.greaterThan={scheduleIdGreaterThan}&scheduleId.lessThan={scheduleIdLessThan}&scheduleId.greaterThanOrEqual={scheduleIdGreaterThanOrEqual}&scheduleId.lessThanOrEqual={scheduleIdLessThanOrEqual}&scheduleId.equals={scheduleIdEquals}&scheduleId.notEquals={scheduleIdNotEquals}&scheduleId.specified={scheduleIdSpecified}&scheduleId.in={scheduleIdIn}&scheduleId.notIn={scheduleIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countScheduleOccasions(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("occasionEquals") @jakarta.annotation.Nullable String occasionEquals, @Param("occasionNotEquals") @jakarta.annotation.Nullable String occasionNotEquals, @Param("occasionSpecified") @jakarta.annotation.Nullable Boolean occasionSpecified, @Param("occasionIn") @jakarta.annotation.Nullable List<String> occasionIn, @Param("occasionNotIn") @jakarta.annotation.Nullable List<String> occasionNotIn, @Param("occasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThan, @Param("occasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThan, @Param("occasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThanOrEqual, @Param("occasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThanOrEqual, @Param("occasionFactorEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorEquals, @Param("occasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorNotEquals, @Param("occasionFactorSpecified") @jakarta.annotation.Nullable Boolean occasionFactorSpecified, @Param("occasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorIn, @Param("occasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("scheduleIdGreaterThan") @jakarta.annotation.Nullable Long scheduleIdGreaterThan, @Param("scheduleIdLessThan") @jakarta.annotation.Nullable Long scheduleIdLessThan, @Param("scheduleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long scheduleIdGreaterThanOrEqual, @Param("scheduleIdLessThanOrEqual") @jakarta.annotation.Nullable Long scheduleIdLessThanOrEqual, @Param("scheduleIdEquals") @jakarta.annotation.Nullable Long scheduleIdEquals, @Param("scheduleIdNotEquals") @jakarta.annotation.Nullable Long scheduleIdNotEquals, @Param("scheduleIdSpecified") @jakarta.annotation.Nullable Boolean scheduleIdSpecified, @Param("scheduleIdIn") @jakarta.annotation.Nullable List<Long> scheduleIdIn, @Param("scheduleIdNotIn") @jakarta.annotation.Nullable List<Long> scheduleIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countScheduleOccasions</code> but it also returns the http response headers .
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
   * @param occasionEquals  (optional)
   * @param occasionNotEquals  (optional)
   * @param occasionSpecified  (optional)
   * @param occasionIn  (optional)
   * @param occasionNotIn  (optional)
   * @param occasionFactorGreaterThan  (optional)
   * @param occasionFactorLessThan  (optional)
   * @param occasionFactorGreaterThanOrEqual  (optional)
   * @param occasionFactorLessThanOrEqual  (optional)
   * @param occasionFactorEquals  (optional)
   * @param occasionFactorNotEquals  (optional)
   * @param occasionFactorSpecified  (optional)
   * @param occasionFactorIn  (optional)
   * @param occasionFactorNotIn  (optional)
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
  @RequestLine("GET /api/schedule-occasions/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&occasion.equals={occasionEquals}&occasion.notEquals={occasionNotEquals}&occasion.specified={occasionSpecified}&occasion.in={occasionIn}&occasion.notIn={occasionNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&scheduleId.greaterThan={scheduleIdGreaterThan}&scheduleId.lessThan={scheduleIdLessThan}&scheduleId.greaterThanOrEqual={scheduleIdGreaterThanOrEqual}&scheduleId.lessThanOrEqual={scheduleIdLessThanOrEqual}&scheduleId.equals={scheduleIdEquals}&scheduleId.notEquals={scheduleIdNotEquals}&scheduleId.specified={scheduleIdSpecified}&scheduleId.in={scheduleIdIn}&scheduleId.notIn={scheduleIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countScheduleOccasionsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("occasionEquals") @jakarta.annotation.Nullable String occasionEquals, @Param("occasionNotEquals") @jakarta.annotation.Nullable String occasionNotEquals, @Param("occasionSpecified") @jakarta.annotation.Nullable Boolean occasionSpecified, @Param("occasionIn") @jakarta.annotation.Nullable List<String> occasionIn, @Param("occasionNotIn") @jakarta.annotation.Nullable List<String> occasionNotIn, @Param("occasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThan, @Param("occasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThan, @Param("occasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThanOrEqual, @Param("occasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThanOrEqual, @Param("occasionFactorEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorEquals, @Param("occasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorNotEquals, @Param("occasionFactorSpecified") @jakarta.annotation.Nullable Boolean occasionFactorSpecified, @Param("occasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorIn, @Param("occasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("scheduleIdGreaterThan") @jakarta.annotation.Nullable Long scheduleIdGreaterThan, @Param("scheduleIdLessThan") @jakarta.annotation.Nullable Long scheduleIdLessThan, @Param("scheduleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long scheduleIdGreaterThanOrEqual, @Param("scheduleIdLessThanOrEqual") @jakarta.annotation.Nullable Long scheduleIdLessThanOrEqual, @Param("scheduleIdEquals") @jakarta.annotation.Nullable Long scheduleIdEquals, @Param("scheduleIdNotEquals") @jakarta.annotation.Nullable Long scheduleIdNotEquals, @Param("scheduleIdSpecified") @jakarta.annotation.Nullable Boolean scheduleIdSpecified, @Param("scheduleIdIn") @jakarta.annotation.Nullable List<Long> scheduleIdIn, @Param("scheduleIdNotIn") @jakarta.annotation.Nullable List<Long> scheduleIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countScheduleOccasions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountScheduleOccasionsQueryParams} class that allows for
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
   *   <li>occasionEquals -  (optional)</li>
   *   <li>occasionNotEquals -  (optional)</li>
   *   <li>occasionSpecified -  (optional)</li>
   *   <li>occasionIn -  (optional)</li>
   *   <li>occasionNotIn -  (optional)</li>
   *   <li>occasionFactorGreaterThan -  (optional)</li>
   *   <li>occasionFactorLessThan -  (optional)</li>
   *   <li>occasionFactorGreaterThanOrEqual -  (optional)</li>
   *   <li>occasionFactorLessThanOrEqual -  (optional)</li>
   *   <li>occasionFactorEquals -  (optional)</li>
   *   <li>occasionFactorNotEquals -  (optional)</li>
   *   <li>occasionFactorSpecified -  (optional)</li>
   *   <li>occasionFactorIn -  (optional)</li>
   *   <li>occasionFactorNotIn -  (optional)</li>
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
  @RequestLine("GET /api/schedule-occasions/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&occasion.equals={occasionEquals}&occasion.notEquals={occasionNotEquals}&occasion.specified={occasionSpecified}&occasion.in={occasionIn}&occasion.notIn={occasionNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&scheduleId.greaterThan={scheduleIdGreaterThan}&scheduleId.lessThan={scheduleIdLessThan}&scheduleId.greaterThanOrEqual={scheduleIdGreaterThanOrEqual}&scheduleId.lessThanOrEqual={scheduleIdLessThanOrEqual}&scheduleId.equals={scheduleIdEquals}&scheduleId.notEquals={scheduleIdNotEquals}&scheduleId.specified={scheduleIdSpecified}&scheduleId.in={scheduleIdIn}&scheduleId.notIn={scheduleIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countScheduleOccasions(@QueryMap(encoded=true) CountScheduleOccasionsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countScheduleOccasions</code> that receives the query parameters as a map,
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
          *   <li>occasionEquals -  (optional)</li>
          *   <li>occasionNotEquals -  (optional)</li>
          *   <li>occasionSpecified -  (optional)</li>
          *   <li>occasionIn -  (optional)</li>
          *   <li>occasionNotIn -  (optional)</li>
          *   <li>occasionFactorGreaterThan -  (optional)</li>
          *   <li>occasionFactorLessThan -  (optional)</li>
          *   <li>occasionFactorGreaterThanOrEqual -  (optional)</li>
          *   <li>occasionFactorLessThanOrEqual -  (optional)</li>
          *   <li>occasionFactorEquals -  (optional)</li>
          *   <li>occasionFactorNotEquals -  (optional)</li>
          *   <li>occasionFactorSpecified -  (optional)</li>
          *   <li>occasionFactorIn -  (optional)</li>
          *   <li>occasionFactorNotIn -  (optional)</li>
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
      @RequestLine("GET /api/schedule-occasions/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&occasion.equals={occasionEquals}&occasion.notEquals={occasionNotEquals}&occasion.specified={occasionSpecified}&occasion.in={occasionIn}&occasion.notIn={occasionNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&scheduleId.greaterThan={scheduleIdGreaterThan}&scheduleId.lessThan={scheduleIdLessThan}&scheduleId.greaterThanOrEqual={scheduleIdGreaterThanOrEqual}&scheduleId.lessThanOrEqual={scheduleIdLessThanOrEqual}&scheduleId.equals={scheduleIdEquals}&scheduleId.notEquals={scheduleIdNotEquals}&scheduleId.specified={scheduleIdSpecified}&scheduleId.in={scheduleIdIn}&scheduleId.notIn={scheduleIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countScheduleOccasionsWithHttpInfo(@QueryMap(encoded=true) CountScheduleOccasionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countScheduleOccasions</code> method in a fluent style.
   */
  public static class CountScheduleOccasionsQueryParams extends HashMap<String, Object> {
    public CountScheduleOccasionsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams occasionEquals(@jakarta.annotation.Nullable final String value) {
      put("occasion.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams occasionNotEquals(@jakarta.annotation.Nullable final String value) {
      put("occasion.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams occasionSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occasion.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams occasionIn(@jakarta.annotation.Nullable final List<String> value) {
      put("occasion.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams occasionNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("occasion.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams occasionFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams occasionFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams occasionFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams occasionFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams occasionFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams occasionFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams occasionFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occasionFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams occasionFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occasionFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams occasionFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occasionFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams scheduleIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams scheduleIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams scheduleIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams scheduleIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams scheduleIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams scheduleIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams scheduleIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("scheduleId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountScheduleOccasionsQueryParams scheduleIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("scheduleId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams scheduleIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("scheduleId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountScheduleOccasionsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param scheduleOccasionDTO  (required)
   * @return ScheduleOccasionDTO
   */
  @RequestLine("POST /api/schedule-occasions")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ScheduleOccasionDTO createScheduleOccasion(@jakarta.annotation.Nonnull ScheduleOccasionDTO scheduleOccasionDTO);

  /**
   * 
   * Similar to <code>createScheduleOccasion</code> but it also returns the http response headers .
   * 
   * @param scheduleOccasionDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/schedule-occasions")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<ScheduleOccasionDTO> createScheduleOccasionWithHttpInfo(@jakarta.annotation.Nonnull ScheduleOccasionDTO scheduleOccasionDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/schedule-occasions/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteScheduleOccasion(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deleteScheduleOccasion</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/schedule-occasions/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteScheduleOccasionWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



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
   * @param occasionEquals  (optional)
   * @param occasionNotEquals  (optional)
   * @param occasionSpecified  (optional)
   * @param occasionIn  (optional)
   * @param occasionNotIn  (optional)
   * @param occasionFactorGreaterThan  (optional)
   * @param occasionFactorLessThan  (optional)
   * @param occasionFactorGreaterThanOrEqual  (optional)
   * @param occasionFactorLessThanOrEqual  (optional)
   * @param occasionFactorEquals  (optional)
   * @param occasionFactorNotEquals  (optional)
   * @param occasionFactorSpecified  (optional)
   * @param occasionFactorIn  (optional)
   * @param occasionFactorNotIn  (optional)
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
   * @return List&lt;ScheduleOccasionDTO&gt;
   */
  @RequestLine("GET /api/schedule-occasions?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&occasion.equals={occasionEquals}&occasion.notEquals={occasionNotEquals}&occasion.specified={occasionSpecified}&occasion.in={occasionIn}&occasion.notIn={occasionNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&scheduleId.greaterThan={scheduleIdGreaterThan}&scheduleId.lessThan={scheduleIdLessThan}&scheduleId.greaterThanOrEqual={scheduleIdGreaterThanOrEqual}&scheduleId.lessThanOrEqual={scheduleIdLessThanOrEqual}&scheduleId.equals={scheduleIdEquals}&scheduleId.notEquals={scheduleIdNotEquals}&scheduleId.specified={scheduleIdSpecified}&scheduleId.in={scheduleIdIn}&scheduleId.notIn={scheduleIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  List<ScheduleOccasionDTO> getAllScheduleOccasions(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("occasionEquals") @jakarta.annotation.Nullable String occasionEquals, @Param("occasionNotEquals") @jakarta.annotation.Nullable String occasionNotEquals, @Param("occasionSpecified") @jakarta.annotation.Nullable Boolean occasionSpecified, @Param("occasionIn") @jakarta.annotation.Nullable List<String> occasionIn, @Param("occasionNotIn") @jakarta.annotation.Nullable List<String> occasionNotIn, @Param("occasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThan, @Param("occasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThan, @Param("occasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThanOrEqual, @Param("occasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThanOrEqual, @Param("occasionFactorEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorEquals, @Param("occasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorNotEquals, @Param("occasionFactorSpecified") @jakarta.annotation.Nullable Boolean occasionFactorSpecified, @Param("occasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorIn, @Param("occasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("scheduleIdGreaterThan") @jakarta.annotation.Nullable Long scheduleIdGreaterThan, @Param("scheduleIdLessThan") @jakarta.annotation.Nullable Long scheduleIdLessThan, @Param("scheduleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long scheduleIdGreaterThanOrEqual, @Param("scheduleIdLessThanOrEqual") @jakarta.annotation.Nullable Long scheduleIdLessThanOrEqual, @Param("scheduleIdEquals") @jakarta.annotation.Nullable Long scheduleIdEquals, @Param("scheduleIdNotEquals") @jakarta.annotation.Nullable Long scheduleIdNotEquals, @Param("scheduleIdSpecified") @jakarta.annotation.Nullable Boolean scheduleIdSpecified, @Param("scheduleIdIn") @jakarta.annotation.Nullable List<Long> scheduleIdIn, @Param("scheduleIdNotIn") @jakarta.annotation.Nullable List<Long> scheduleIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>getAllScheduleOccasions</code> but it also returns the http response headers .
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
   * @param occasionEquals  (optional)
   * @param occasionNotEquals  (optional)
   * @param occasionSpecified  (optional)
   * @param occasionIn  (optional)
   * @param occasionNotIn  (optional)
   * @param occasionFactorGreaterThan  (optional)
   * @param occasionFactorLessThan  (optional)
   * @param occasionFactorGreaterThanOrEqual  (optional)
   * @param occasionFactorLessThanOrEqual  (optional)
   * @param occasionFactorEquals  (optional)
   * @param occasionFactorNotEquals  (optional)
   * @param occasionFactorSpecified  (optional)
   * @param occasionFactorIn  (optional)
   * @param occasionFactorNotIn  (optional)
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
  @RequestLine("GET /api/schedule-occasions?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&occasion.equals={occasionEquals}&occasion.notEquals={occasionNotEquals}&occasion.specified={occasionSpecified}&occasion.in={occasionIn}&occasion.notIn={occasionNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&scheduleId.greaterThan={scheduleIdGreaterThan}&scheduleId.lessThan={scheduleIdLessThan}&scheduleId.greaterThanOrEqual={scheduleIdGreaterThanOrEqual}&scheduleId.lessThanOrEqual={scheduleIdLessThanOrEqual}&scheduleId.equals={scheduleIdEquals}&scheduleId.notEquals={scheduleIdNotEquals}&scheduleId.specified={scheduleIdSpecified}&scheduleId.in={scheduleIdIn}&scheduleId.notIn={scheduleIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<ScheduleOccasionDTO>> getAllScheduleOccasionsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("occasionEquals") @jakarta.annotation.Nullable String occasionEquals, @Param("occasionNotEquals") @jakarta.annotation.Nullable String occasionNotEquals, @Param("occasionSpecified") @jakarta.annotation.Nullable Boolean occasionSpecified, @Param("occasionIn") @jakarta.annotation.Nullable List<String> occasionIn, @Param("occasionNotIn") @jakarta.annotation.Nullable List<String> occasionNotIn, @Param("occasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThan, @Param("occasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThan, @Param("occasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThanOrEqual, @Param("occasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThanOrEqual, @Param("occasionFactorEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorEquals, @Param("occasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorNotEquals, @Param("occasionFactorSpecified") @jakarta.annotation.Nullable Boolean occasionFactorSpecified, @Param("occasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorIn, @Param("occasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("scheduleIdGreaterThan") @jakarta.annotation.Nullable Long scheduleIdGreaterThan, @Param("scheduleIdLessThan") @jakarta.annotation.Nullable Long scheduleIdLessThan, @Param("scheduleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long scheduleIdGreaterThanOrEqual, @Param("scheduleIdLessThanOrEqual") @jakarta.annotation.Nullable Long scheduleIdLessThanOrEqual, @Param("scheduleIdEquals") @jakarta.annotation.Nullable Long scheduleIdEquals, @Param("scheduleIdNotEquals") @jakarta.annotation.Nullable Long scheduleIdNotEquals, @Param("scheduleIdSpecified") @jakarta.annotation.Nullable Boolean scheduleIdSpecified, @Param("scheduleIdIn") @jakarta.annotation.Nullable List<Long> scheduleIdIn, @Param("scheduleIdNotIn") @jakarta.annotation.Nullable List<Long> scheduleIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllScheduleOccasions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllScheduleOccasionsQueryParams} class that allows for
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
   *   <li>occasionEquals -  (optional)</li>
   *   <li>occasionNotEquals -  (optional)</li>
   *   <li>occasionSpecified -  (optional)</li>
   *   <li>occasionIn -  (optional)</li>
   *   <li>occasionNotIn -  (optional)</li>
   *   <li>occasionFactorGreaterThan -  (optional)</li>
   *   <li>occasionFactorLessThan -  (optional)</li>
   *   <li>occasionFactorGreaterThanOrEqual -  (optional)</li>
   *   <li>occasionFactorLessThanOrEqual -  (optional)</li>
   *   <li>occasionFactorEquals -  (optional)</li>
   *   <li>occasionFactorNotEquals -  (optional)</li>
   *   <li>occasionFactorSpecified -  (optional)</li>
   *   <li>occasionFactorIn -  (optional)</li>
   *   <li>occasionFactorNotIn -  (optional)</li>
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
   * @return List&lt;ScheduleOccasionDTO&gt;
   */
  @RequestLine("GET /api/schedule-occasions?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&occasion.equals={occasionEquals}&occasion.notEquals={occasionNotEquals}&occasion.specified={occasionSpecified}&occasion.in={occasionIn}&occasion.notIn={occasionNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&scheduleId.greaterThan={scheduleIdGreaterThan}&scheduleId.lessThan={scheduleIdLessThan}&scheduleId.greaterThanOrEqual={scheduleIdGreaterThanOrEqual}&scheduleId.lessThanOrEqual={scheduleIdLessThanOrEqual}&scheduleId.equals={scheduleIdEquals}&scheduleId.notEquals={scheduleIdNotEquals}&scheduleId.specified={scheduleIdSpecified}&scheduleId.in={scheduleIdIn}&scheduleId.notIn={scheduleIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  List<ScheduleOccasionDTO> getAllScheduleOccasions(@QueryMap(encoded=true) GetAllScheduleOccasionsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllScheduleOccasions</code> that receives the query parameters as a map,
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
          *   <li>occasionEquals -  (optional)</li>
          *   <li>occasionNotEquals -  (optional)</li>
          *   <li>occasionSpecified -  (optional)</li>
          *   <li>occasionIn -  (optional)</li>
          *   <li>occasionNotIn -  (optional)</li>
          *   <li>occasionFactorGreaterThan -  (optional)</li>
          *   <li>occasionFactorLessThan -  (optional)</li>
          *   <li>occasionFactorGreaterThanOrEqual -  (optional)</li>
          *   <li>occasionFactorLessThanOrEqual -  (optional)</li>
          *   <li>occasionFactorEquals -  (optional)</li>
          *   <li>occasionFactorNotEquals -  (optional)</li>
          *   <li>occasionFactorSpecified -  (optional)</li>
          *   <li>occasionFactorIn -  (optional)</li>
          *   <li>occasionFactorNotIn -  (optional)</li>
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
          * @return List&lt;ScheduleOccasionDTO&gt;
      */
      @RequestLine("GET /api/schedule-occasions?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&occasion.equals={occasionEquals}&occasion.notEquals={occasionNotEquals}&occasion.specified={occasionSpecified}&occasion.in={occasionIn}&occasion.notIn={occasionNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&scheduleId.greaterThan={scheduleIdGreaterThan}&scheduleId.lessThan={scheduleIdLessThan}&scheduleId.greaterThanOrEqual={scheduleIdGreaterThanOrEqual}&scheduleId.lessThanOrEqual={scheduleIdLessThanOrEqual}&scheduleId.equals={scheduleIdEquals}&scheduleId.notEquals={scheduleIdNotEquals}&scheduleId.specified={scheduleIdSpecified}&scheduleId.in={scheduleIdIn}&scheduleId.notIn={scheduleIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<ScheduleOccasionDTO>> getAllScheduleOccasionsWithHttpInfo(@QueryMap(encoded=true) GetAllScheduleOccasionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllScheduleOccasions</code> method in a fluent style.
   */
  public static class GetAllScheduleOccasionsQueryParams extends HashMap<String, Object> {
    public GetAllScheduleOccasionsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams occasionEquals(@jakarta.annotation.Nullable final String value) {
      put("occasion.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams occasionNotEquals(@jakarta.annotation.Nullable final String value) {
      put("occasion.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams occasionSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occasion.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams occasionIn(@jakarta.annotation.Nullable final List<String> value) {
      put("occasion.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams occasionNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("occasion.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams occasionFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams occasionFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams occasionFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams occasionFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams occasionFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams occasionFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams occasionFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occasionFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams occasionFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occasionFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams occasionFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occasionFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams scheduleIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams scheduleIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams scheduleIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams scheduleIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams scheduleIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams scheduleIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("scheduleId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams scheduleIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("scheduleId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams scheduleIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("scheduleId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams scheduleIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("scheduleId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllScheduleOccasionsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return ScheduleOccasionDTO
   */
  @RequestLine("GET /api/schedule-occasions/{id}")
  @Headers({
    "Accept: */*",
  })
  ScheduleOccasionDTO getScheduleOccasion(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getScheduleOccasion</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/schedule-occasions/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<ScheduleOccasionDTO> getScheduleOccasionWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param scheduleOccasionDTO  (required)
   * @return ScheduleOccasionDTO
   */
  @RequestLine("PATCH /api/schedule-occasions/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ScheduleOccasionDTO partialUpdateScheduleOccasion(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ScheduleOccasionDTO scheduleOccasionDTO);

  /**
   * 
   * Similar to <code>partialUpdateScheduleOccasion</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param scheduleOccasionDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/schedule-occasions/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<ScheduleOccasionDTO> partialUpdateScheduleOccasionWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ScheduleOccasionDTO scheduleOccasionDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param scheduleOccasionDTO  (required)
   * @return ScheduleOccasionDTO
   */
  @RequestLine("PUT /api/schedule-occasions/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ScheduleOccasionDTO updateScheduleOccasion(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ScheduleOccasionDTO scheduleOccasionDTO);

  /**
   * 
   * Similar to <code>updateScheduleOccasion</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param scheduleOccasionDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/schedule-occasions/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<ScheduleOccasionDTO> updateScheduleOccasionWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ScheduleOccasionDTO scheduleOccasionDTO);


}
