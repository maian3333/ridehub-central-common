package com.ridehub.feign.msroute.client.api;

import com.ridehub.feign.msroute.client.invoker.ApiClient;
import com.ridehub.feign.msroute.client.invoker.EncodingUtils;
import com.ridehub.feign.msroute.client.model.ApiResponse;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import com.ridehub.feign.msroute.client.model.TripDTO;
import com.ridehub.feign.msroute.client.model.TripDetailVM;
import com.ridehub.feign.msroute.client.model.TripWithPricingDTO;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface TripResourceMsrouteApi extends ApiClient.Api {


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
   * @param tripCodeContains  (optional)
   * @param tripCodeDoesNotContain  (optional)
   * @param tripCodeEquals  (optional)
   * @param tripCodeNotEquals  (optional)
   * @param tripCodeSpecified  (optional)
   * @param tripCodeIn  (optional)
   * @param tripCodeNotIn  (optional)
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
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param vehicleIdGreaterThan  (optional)
   * @param vehicleIdLessThan  (optional)
   * @param vehicleIdGreaterThanOrEqual  (optional)
   * @param vehicleIdLessThanOrEqual  (optional)
   * @param vehicleIdEquals  (optional)
   * @param vehicleIdNotEquals  (optional)
   * @param vehicleIdSpecified  (optional)
   * @param vehicleIdIn  (optional)
   * @param vehicleIdNotIn  (optional)
   * @param slotIdGreaterThan  (optional)
   * @param slotIdLessThan  (optional)
   * @param slotIdGreaterThanOrEqual  (optional)
   * @param slotIdLessThanOrEqual  (optional)
   * @param slotIdEquals  (optional)
   * @param slotIdNotEquals  (optional)
   * @param slotIdSpecified  (optional)
   * @param slotIdIn  (optional)
   * @param slotIdNotIn  (optional)
   * @param driverIdGreaterThan  (optional)
   * @param driverIdLessThan  (optional)
   * @param driverIdGreaterThanOrEqual  (optional)
   * @param driverIdLessThanOrEqual  (optional)
   * @param driverIdEquals  (optional)
   * @param driverIdNotEquals  (optional)
   * @param driverIdSpecified  (optional)
   * @param driverIdIn  (optional)
   * @param driverIdNotIn  (optional)
   * @param attendantIdGreaterThan  (optional)
   * @param attendantIdLessThan  (optional)
   * @param attendantIdGreaterThanOrEqual  (optional)
   * @param attendantIdLessThanOrEqual  (optional)
   * @param attendantIdEquals  (optional)
   * @param attendantIdNotEquals  (optional)
   * @param attendantIdSpecified  (optional)
   * @param attendantIdIn  (optional)
   * @param attendantIdNotIn  (optional)
   * @param vehicleTypeEquals  (optional)
   * @param vehicleTypeNotEquals  (optional)
   * @param vehicleTypeSpecified  (optional)
   * @param vehicleTypeIn  (optional)
   * @param vehicleTypeNotIn  (optional)
   * @param routeCodeContains  (optional)
   * @param routeCodeDoesNotContain  (optional)
   * @param routeCodeEquals  (optional)
   * @param routeCodeNotEquals  (optional)
   * @param routeCodeSpecified  (optional)
   * @param routeCodeIn  (optional)
   * @param routeCodeNotIn  (optional)
   * @param originDistrictCodeContains  (optional)
   * @param originDistrictCodeDoesNotContain  (optional)
   * @param originDistrictCodeEquals  (optional)
   * @param originDistrictCodeNotEquals  (optional)
   * @param originDistrictCodeSpecified  (optional)
   * @param originDistrictCodeIn  (optional)
   * @param originDistrictCodeNotIn  (optional)
   * @param originProvinceCodeContains  (optional)
   * @param originProvinceCodeDoesNotContain  (optional)
   * @param originProvinceCodeEquals  (optional)
   * @param originProvinceCodeNotEquals  (optional)
   * @param originProvinceCodeSpecified  (optional)
   * @param originProvinceCodeIn  (optional)
   * @param originProvinceCodeNotIn  (optional)
   * @param destinationDistrictCodeContains  (optional)
   * @param destinationDistrictCodeDoesNotContain  (optional)
   * @param destinationDistrictCodeEquals  (optional)
   * @param destinationDistrictCodeNotEquals  (optional)
   * @param destinationDistrictCodeSpecified  (optional)
   * @param destinationDistrictCodeIn  (optional)
   * @param destinationDistrictCodeNotIn  (optional)
   * @param destinationProvinceCodeContains  (optional)
   * @param destinationProvinceCodeDoesNotContain  (optional)
   * @param destinationProvinceCodeEquals  (optional)
   * @param destinationProvinceCodeNotEquals  (optional)
   * @param destinationProvinceCodeSpecified  (optional)
   * @param destinationProvinceCodeIn  (optional)
   * @param destinationProvinceCodeNotIn  (optional)
   * @param vehiclePlateNumberContains  (optional)
   * @param vehiclePlateNumberDoesNotContain  (optional)
   * @param vehiclePlateNumberEquals  (optional)
   * @param vehiclePlateNumberNotEquals  (optional)
   * @param vehiclePlateNumberSpecified  (optional)
   * @param vehiclePlateNumberIn  (optional)
   * @param vehiclePlateNumberNotIn  (optional)
   * @param distinct  (optional)
   * @return Long
   */
  @RequestLine("GET /api/trips/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&tripCode.contains={tripCodeContains}&tripCode.doesNotContain={tripCodeDoesNotContain}&tripCode.equals={tripCodeEquals}&tripCode.notEquals={tripCodeNotEquals}&tripCode.specified={tripCodeSpecified}&tripCode.in={tripCodeIn}&tripCode.notIn={tripCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleId.greaterThan={vehicleIdGreaterThan}&vehicleId.lessThan={vehicleIdLessThan}&vehicleId.greaterThanOrEqual={vehicleIdGreaterThanOrEqual}&vehicleId.lessThanOrEqual={vehicleIdLessThanOrEqual}&vehicleId.equals={vehicleIdEquals}&vehicleId.notEquals={vehicleIdNotEquals}&vehicleId.specified={vehicleIdSpecified}&vehicleId.in={vehicleIdIn}&vehicleId.notIn={vehicleIdNotIn}&slotId.greaterThan={slotIdGreaterThan}&slotId.lessThan={slotIdLessThan}&slotId.greaterThanOrEqual={slotIdGreaterThanOrEqual}&slotId.lessThanOrEqual={slotIdLessThanOrEqual}&slotId.equals={slotIdEquals}&slotId.notEquals={slotIdNotEquals}&slotId.specified={slotIdSpecified}&slotId.in={slotIdIn}&slotId.notIn={slotIdNotIn}&driverId.greaterThan={driverIdGreaterThan}&driverId.lessThan={driverIdLessThan}&driverId.greaterThanOrEqual={driverIdGreaterThanOrEqual}&driverId.lessThanOrEqual={driverIdLessThanOrEqual}&driverId.equals={driverIdEquals}&driverId.notEquals={driverIdNotEquals}&driverId.specified={driverIdSpecified}&driverId.in={driverIdIn}&driverId.notIn={driverIdNotIn}&attendantId.greaterThan={attendantIdGreaterThan}&attendantId.lessThan={attendantIdLessThan}&attendantId.greaterThanOrEqual={attendantIdGreaterThanOrEqual}&attendantId.lessThanOrEqual={attendantIdLessThanOrEqual}&attendantId.equals={attendantIdEquals}&attendantId.notEquals={attendantIdNotEquals}&attendantId.specified={attendantIdSpecified}&attendantId.in={attendantIdIn}&attendantId.notIn={attendantIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&originDistrictCode.contains={originDistrictCodeContains}&originDistrictCode.doesNotContain={originDistrictCodeDoesNotContain}&originDistrictCode.equals={originDistrictCodeEquals}&originDistrictCode.notEquals={originDistrictCodeNotEquals}&originDistrictCode.specified={originDistrictCodeSpecified}&originDistrictCode.in={originDistrictCodeIn}&originDistrictCode.notIn={originDistrictCodeNotIn}&originProvinceCode.contains={originProvinceCodeContains}&originProvinceCode.doesNotContain={originProvinceCodeDoesNotContain}&originProvinceCode.equals={originProvinceCodeEquals}&originProvinceCode.notEquals={originProvinceCodeNotEquals}&originProvinceCode.specified={originProvinceCodeSpecified}&originProvinceCode.in={originProvinceCodeIn}&originProvinceCode.notIn={originProvinceCodeNotIn}&destinationDistrictCode.contains={destinationDistrictCodeContains}&destinationDistrictCode.doesNotContain={destinationDistrictCodeDoesNotContain}&destinationDistrictCode.equals={destinationDistrictCodeEquals}&destinationDistrictCode.notEquals={destinationDistrictCodeNotEquals}&destinationDistrictCode.specified={destinationDistrictCodeSpecified}&destinationDistrictCode.in={destinationDistrictCodeIn}&destinationDistrictCode.notIn={destinationDistrictCodeNotIn}&destinationProvinceCode.contains={destinationProvinceCodeContains}&destinationProvinceCode.doesNotContain={destinationProvinceCodeDoesNotContain}&destinationProvinceCode.equals={destinationProvinceCodeEquals}&destinationProvinceCode.notEquals={destinationProvinceCodeNotEquals}&destinationProvinceCode.specified={destinationProvinceCodeSpecified}&destinationProvinceCode.in={destinationProvinceCodeIn}&destinationProvinceCode.notIn={destinationProvinceCodeNotIn}&vehiclePlateNumber.contains={vehiclePlateNumberContains}&vehiclePlateNumber.doesNotContain={vehiclePlateNumberDoesNotContain}&vehiclePlateNumber.equals={vehiclePlateNumberEquals}&vehiclePlateNumber.notEquals={vehiclePlateNumberNotEquals}&vehiclePlateNumber.specified={vehiclePlateNumberSpecified}&vehiclePlateNumber.in={vehiclePlateNumberIn}&vehiclePlateNumber.notIn={vehiclePlateNumberNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countTrips(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("tripCodeContains") @jakarta.annotation.Nullable String tripCodeContains, @Param("tripCodeDoesNotContain") @jakarta.annotation.Nullable String tripCodeDoesNotContain, @Param("tripCodeEquals") @jakarta.annotation.Nullable String tripCodeEquals, @Param("tripCodeNotEquals") @jakarta.annotation.Nullable String tripCodeNotEquals, @Param("tripCodeSpecified") @jakarta.annotation.Nullable Boolean tripCodeSpecified, @Param("tripCodeIn") @jakarta.annotation.Nullable List<String> tripCodeIn, @Param("tripCodeNotIn") @jakarta.annotation.Nullable List<String> tripCodeNotIn, @Param("departureTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThan, @Param("departureTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThan, @Param("departureTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThanOrEqual, @Param("departureTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThanOrEqual, @Param("departureTimeEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeEquals, @Param("departureTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeNotEquals, @Param("departureTimeSpecified") @jakarta.annotation.Nullable Boolean departureTimeSpecified, @Param("departureTimeIn") @jakarta.annotation.Nullable List<OffsetDateTime> departureTimeIn, @Param("departureTimeNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> departureTimeNotIn, @Param("arrivalTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThan, @Param("arrivalTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThan, @Param("arrivalTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThanOrEqual, @Param("arrivalTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThanOrEqual, @Param("arrivalTimeEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeEquals, @Param("arrivalTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeNotEquals, @Param("arrivalTimeSpecified") @jakarta.annotation.Nullable Boolean arrivalTimeSpecified, @Param("arrivalTimeIn") @jakarta.annotation.Nullable List<OffsetDateTime> arrivalTimeIn, @Param("arrivalTimeNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> arrivalTimeNotIn, @Param("occasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThan, @Param("occasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThan, @Param("occasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThanOrEqual, @Param("occasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThanOrEqual, @Param("occasionFactorEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorEquals, @Param("occasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorNotEquals, @Param("occasionFactorSpecified") @jakarta.annotation.Nullable Boolean occasionFactorSpecified, @Param("occasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorIn, @Param("occasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("vehicleIdGreaterThan") @jakarta.annotation.Nullable Long vehicleIdGreaterThan, @Param("vehicleIdLessThan") @jakarta.annotation.Nullable Long vehicleIdLessThan, @Param("vehicleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long vehicleIdGreaterThanOrEqual, @Param("vehicleIdLessThanOrEqual") @jakarta.annotation.Nullable Long vehicleIdLessThanOrEqual, @Param("vehicleIdEquals") @jakarta.annotation.Nullable Long vehicleIdEquals, @Param("vehicleIdNotEquals") @jakarta.annotation.Nullable Long vehicleIdNotEquals, @Param("vehicleIdSpecified") @jakarta.annotation.Nullable Boolean vehicleIdSpecified, @Param("vehicleIdIn") @jakarta.annotation.Nullable List<Long> vehicleIdIn, @Param("vehicleIdNotIn") @jakarta.annotation.Nullable List<Long> vehicleIdNotIn, @Param("slotIdGreaterThan") @jakarta.annotation.Nullable Long slotIdGreaterThan, @Param("slotIdLessThan") @jakarta.annotation.Nullable Long slotIdLessThan, @Param("slotIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long slotIdGreaterThanOrEqual, @Param("slotIdLessThanOrEqual") @jakarta.annotation.Nullable Long slotIdLessThanOrEqual, @Param("slotIdEquals") @jakarta.annotation.Nullable Long slotIdEquals, @Param("slotIdNotEquals") @jakarta.annotation.Nullable Long slotIdNotEquals, @Param("slotIdSpecified") @jakarta.annotation.Nullable Boolean slotIdSpecified, @Param("slotIdIn") @jakarta.annotation.Nullable List<Long> slotIdIn, @Param("slotIdNotIn") @jakarta.annotation.Nullable List<Long> slotIdNotIn, @Param("driverIdGreaterThan") @jakarta.annotation.Nullable Long driverIdGreaterThan, @Param("driverIdLessThan") @jakarta.annotation.Nullable Long driverIdLessThan, @Param("driverIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long driverIdGreaterThanOrEqual, @Param("driverIdLessThanOrEqual") @jakarta.annotation.Nullable Long driverIdLessThanOrEqual, @Param("driverIdEquals") @jakarta.annotation.Nullable Long driverIdEquals, @Param("driverIdNotEquals") @jakarta.annotation.Nullable Long driverIdNotEquals, @Param("driverIdSpecified") @jakarta.annotation.Nullable Boolean driverIdSpecified, @Param("driverIdIn") @jakarta.annotation.Nullable List<Long> driverIdIn, @Param("driverIdNotIn") @jakarta.annotation.Nullable List<Long> driverIdNotIn, @Param("attendantIdGreaterThan") @jakarta.annotation.Nullable Long attendantIdGreaterThan, @Param("attendantIdLessThan") @jakarta.annotation.Nullable Long attendantIdLessThan, @Param("attendantIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long attendantIdGreaterThanOrEqual, @Param("attendantIdLessThanOrEqual") @jakarta.annotation.Nullable Long attendantIdLessThanOrEqual, @Param("attendantIdEquals") @jakarta.annotation.Nullable Long attendantIdEquals, @Param("attendantIdNotEquals") @jakarta.annotation.Nullable Long attendantIdNotEquals, @Param("attendantIdSpecified") @jakarta.annotation.Nullable Boolean attendantIdSpecified, @Param("attendantIdIn") @jakarta.annotation.Nullable List<Long> attendantIdIn, @Param("attendantIdNotIn") @jakarta.annotation.Nullable List<Long> attendantIdNotIn, @Param("vehicleTypeEquals") @jakarta.annotation.Nullable String vehicleTypeEquals, @Param("vehicleTypeNotEquals") @jakarta.annotation.Nullable String vehicleTypeNotEquals, @Param("vehicleTypeSpecified") @jakarta.annotation.Nullable Boolean vehicleTypeSpecified, @Param("vehicleTypeIn") @jakarta.annotation.Nullable List<String> vehicleTypeIn, @Param("vehicleTypeNotIn") @jakarta.annotation.Nullable List<String> vehicleTypeNotIn, @Param("routeCodeContains") @jakarta.annotation.Nullable String routeCodeContains, @Param("routeCodeDoesNotContain") @jakarta.annotation.Nullable String routeCodeDoesNotContain, @Param("routeCodeEquals") @jakarta.annotation.Nullable String routeCodeEquals, @Param("routeCodeNotEquals") @jakarta.annotation.Nullable String routeCodeNotEquals, @Param("routeCodeSpecified") @jakarta.annotation.Nullable Boolean routeCodeSpecified, @Param("routeCodeIn") @jakarta.annotation.Nullable List<String> routeCodeIn, @Param("routeCodeNotIn") @jakarta.annotation.Nullable List<String> routeCodeNotIn, @Param("originDistrictCodeContains") @jakarta.annotation.Nullable String originDistrictCodeContains, @Param("originDistrictCodeDoesNotContain") @jakarta.annotation.Nullable String originDistrictCodeDoesNotContain, @Param("originDistrictCodeEquals") @jakarta.annotation.Nullable String originDistrictCodeEquals, @Param("originDistrictCodeNotEquals") @jakarta.annotation.Nullable String originDistrictCodeNotEquals, @Param("originDistrictCodeSpecified") @jakarta.annotation.Nullable Boolean originDistrictCodeSpecified, @Param("originDistrictCodeIn") @jakarta.annotation.Nullable List<String> originDistrictCodeIn, @Param("originDistrictCodeNotIn") @jakarta.annotation.Nullable List<String> originDistrictCodeNotIn, @Param("originProvinceCodeContains") @jakarta.annotation.Nullable String originProvinceCodeContains, @Param("originProvinceCodeDoesNotContain") @jakarta.annotation.Nullable String originProvinceCodeDoesNotContain, @Param("originProvinceCodeEquals") @jakarta.annotation.Nullable String originProvinceCodeEquals, @Param("originProvinceCodeNotEquals") @jakarta.annotation.Nullable String originProvinceCodeNotEquals, @Param("originProvinceCodeSpecified") @jakarta.annotation.Nullable Boolean originProvinceCodeSpecified, @Param("originProvinceCodeIn") @jakarta.annotation.Nullable List<String> originProvinceCodeIn, @Param("originProvinceCodeNotIn") @jakarta.annotation.Nullable List<String> originProvinceCodeNotIn, @Param("destinationDistrictCodeContains") @jakarta.annotation.Nullable String destinationDistrictCodeContains, @Param("destinationDistrictCodeDoesNotContain") @jakarta.annotation.Nullable String destinationDistrictCodeDoesNotContain, @Param("destinationDistrictCodeEquals") @jakarta.annotation.Nullable String destinationDistrictCodeEquals, @Param("destinationDistrictCodeNotEquals") @jakarta.annotation.Nullable String destinationDistrictCodeNotEquals, @Param("destinationDistrictCodeSpecified") @jakarta.annotation.Nullable Boolean destinationDistrictCodeSpecified, @Param("destinationDistrictCodeIn") @jakarta.annotation.Nullable List<String> destinationDistrictCodeIn, @Param("destinationDistrictCodeNotIn") @jakarta.annotation.Nullable List<String> destinationDistrictCodeNotIn, @Param("destinationProvinceCodeContains") @jakarta.annotation.Nullable String destinationProvinceCodeContains, @Param("destinationProvinceCodeDoesNotContain") @jakarta.annotation.Nullable String destinationProvinceCodeDoesNotContain, @Param("destinationProvinceCodeEquals") @jakarta.annotation.Nullable String destinationProvinceCodeEquals, @Param("destinationProvinceCodeNotEquals") @jakarta.annotation.Nullable String destinationProvinceCodeNotEquals, @Param("destinationProvinceCodeSpecified") @jakarta.annotation.Nullable Boolean destinationProvinceCodeSpecified, @Param("destinationProvinceCodeIn") @jakarta.annotation.Nullable List<String> destinationProvinceCodeIn, @Param("destinationProvinceCodeNotIn") @jakarta.annotation.Nullable List<String> destinationProvinceCodeNotIn, @Param("vehiclePlateNumberContains") @jakarta.annotation.Nullable String vehiclePlateNumberContains, @Param("vehiclePlateNumberDoesNotContain") @jakarta.annotation.Nullable String vehiclePlateNumberDoesNotContain, @Param("vehiclePlateNumberEquals") @jakarta.annotation.Nullable String vehiclePlateNumberEquals, @Param("vehiclePlateNumberNotEquals") @jakarta.annotation.Nullable String vehiclePlateNumberNotEquals, @Param("vehiclePlateNumberSpecified") @jakarta.annotation.Nullable Boolean vehiclePlateNumberSpecified, @Param("vehiclePlateNumberIn") @jakarta.annotation.Nullable List<String> vehiclePlateNumberIn, @Param("vehiclePlateNumberNotIn") @jakarta.annotation.Nullable List<String> vehiclePlateNumberNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countTrips</code> but it also returns the http response headers .
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
   * @param tripCodeContains  (optional)
   * @param tripCodeDoesNotContain  (optional)
   * @param tripCodeEquals  (optional)
   * @param tripCodeNotEquals  (optional)
   * @param tripCodeSpecified  (optional)
   * @param tripCodeIn  (optional)
   * @param tripCodeNotIn  (optional)
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
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param vehicleIdGreaterThan  (optional)
   * @param vehicleIdLessThan  (optional)
   * @param vehicleIdGreaterThanOrEqual  (optional)
   * @param vehicleIdLessThanOrEqual  (optional)
   * @param vehicleIdEquals  (optional)
   * @param vehicleIdNotEquals  (optional)
   * @param vehicleIdSpecified  (optional)
   * @param vehicleIdIn  (optional)
   * @param vehicleIdNotIn  (optional)
   * @param slotIdGreaterThan  (optional)
   * @param slotIdLessThan  (optional)
   * @param slotIdGreaterThanOrEqual  (optional)
   * @param slotIdLessThanOrEqual  (optional)
   * @param slotIdEquals  (optional)
   * @param slotIdNotEquals  (optional)
   * @param slotIdSpecified  (optional)
   * @param slotIdIn  (optional)
   * @param slotIdNotIn  (optional)
   * @param driverIdGreaterThan  (optional)
   * @param driverIdLessThan  (optional)
   * @param driverIdGreaterThanOrEqual  (optional)
   * @param driverIdLessThanOrEqual  (optional)
   * @param driverIdEquals  (optional)
   * @param driverIdNotEquals  (optional)
   * @param driverIdSpecified  (optional)
   * @param driverIdIn  (optional)
   * @param driverIdNotIn  (optional)
   * @param attendantIdGreaterThan  (optional)
   * @param attendantIdLessThan  (optional)
   * @param attendantIdGreaterThanOrEqual  (optional)
   * @param attendantIdLessThanOrEqual  (optional)
   * @param attendantIdEquals  (optional)
   * @param attendantIdNotEquals  (optional)
   * @param attendantIdSpecified  (optional)
   * @param attendantIdIn  (optional)
   * @param attendantIdNotIn  (optional)
   * @param vehicleTypeEquals  (optional)
   * @param vehicleTypeNotEquals  (optional)
   * @param vehicleTypeSpecified  (optional)
   * @param vehicleTypeIn  (optional)
   * @param vehicleTypeNotIn  (optional)
   * @param routeCodeContains  (optional)
   * @param routeCodeDoesNotContain  (optional)
   * @param routeCodeEquals  (optional)
   * @param routeCodeNotEquals  (optional)
   * @param routeCodeSpecified  (optional)
   * @param routeCodeIn  (optional)
   * @param routeCodeNotIn  (optional)
   * @param originDistrictCodeContains  (optional)
   * @param originDistrictCodeDoesNotContain  (optional)
   * @param originDistrictCodeEquals  (optional)
   * @param originDistrictCodeNotEquals  (optional)
   * @param originDistrictCodeSpecified  (optional)
   * @param originDistrictCodeIn  (optional)
   * @param originDistrictCodeNotIn  (optional)
   * @param originProvinceCodeContains  (optional)
   * @param originProvinceCodeDoesNotContain  (optional)
   * @param originProvinceCodeEquals  (optional)
   * @param originProvinceCodeNotEquals  (optional)
   * @param originProvinceCodeSpecified  (optional)
   * @param originProvinceCodeIn  (optional)
   * @param originProvinceCodeNotIn  (optional)
   * @param destinationDistrictCodeContains  (optional)
   * @param destinationDistrictCodeDoesNotContain  (optional)
   * @param destinationDistrictCodeEquals  (optional)
   * @param destinationDistrictCodeNotEquals  (optional)
   * @param destinationDistrictCodeSpecified  (optional)
   * @param destinationDistrictCodeIn  (optional)
   * @param destinationDistrictCodeNotIn  (optional)
   * @param destinationProvinceCodeContains  (optional)
   * @param destinationProvinceCodeDoesNotContain  (optional)
   * @param destinationProvinceCodeEquals  (optional)
   * @param destinationProvinceCodeNotEquals  (optional)
   * @param destinationProvinceCodeSpecified  (optional)
   * @param destinationProvinceCodeIn  (optional)
   * @param destinationProvinceCodeNotIn  (optional)
   * @param vehiclePlateNumberContains  (optional)
   * @param vehiclePlateNumberDoesNotContain  (optional)
   * @param vehiclePlateNumberEquals  (optional)
   * @param vehiclePlateNumberNotEquals  (optional)
   * @param vehiclePlateNumberSpecified  (optional)
   * @param vehiclePlateNumberIn  (optional)
   * @param vehiclePlateNumberNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/trips/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&tripCode.contains={tripCodeContains}&tripCode.doesNotContain={tripCodeDoesNotContain}&tripCode.equals={tripCodeEquals}&tripCode.notEquals={tripCodeNotEquals}&tripCode.specified={tripCodeSpecified}&tripCode.in={tripCodeIn}&tripCode.notIn={tripCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleId.greaterThan={vehicleIdGreaterThan}&vehicleId.lessThan={vehicleIdLessThan}&vehicleId.greaterThanOrEqual={vehicleIdGreaterThanOrEqual}&vehicleId.lessThanOrEqual={vehicleIdLessThanOrEqual}&vehicleId.equals={vehicleIdEquals}&vehicleId.notEquals={vehicleIdNotEquals}&vehicleId.specified={vehicleIdSpecified}&vehicleId.in={vehicleIdIn}&vehicleId.notIn={vehicleIdNotIn}&slotId.greaterThan={slotIdGreaterThan}&slotId.lessThan={slotIdLessThan}&slotId.greaterThanOrEqual={slotIdGreaterThanOrEqual}&slotId.lessThanOrEqual={slotIdLessThanOrEqual}&slotId.equals={slotIdEquals}&slotId.notEquals={slotIdNotEquals}&slotId.specified={slotIdSpecified}&slotId.in={slotIdIn}&slotId.notIn={slotIdNotIn}&driverId.greaterThan={driverIdGreaterThan}&driverId.lessThan={driverIdLessThan}&driverId.greaterThanOrEqual={driverIdGreaterThanOrEqual}&driverId.lessThanOrEqual={driverIdLessThanOrEqual}&driverId.equals={driverIdEquals}&driverId.notEquals={driverIdNotEquals}&driverId.specified={driverIdSpecified}&driverId.in={driverIdIn}&driverId.notIn={driverIdNotIn}&attendantId.greaterThan={attendantIdGreaterThan}&attendantId.lessThan={attendantIdLessThan}&attendantId.greaterThanOrEqual={attendantIdGreaterThanOrEqual}&attendantId.lessThanOrEqual={attendantIdLessThanOrEqual}&attendantId.equals={attendantIdEquals}&attendantId.notEquals={attendantIdNotEquals}&attendantId.specified={attendantIdSpecified}&attendantId.in={attendantIdIn}&attendantId.notIn={attendantIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&originDistrictCode.contains={originDistrictCodeContains}&originDistrictCode.doesNotContain={originDistrictCodeDoesNotContain}&originDistrictCode.equals={originDistrictCodeEquals}&originDistrictCode.notEquals={originDistrictCodeNotEquals}&originDistrictCode.specified={originDistrictCodeSpecified}&originDistrictCode.in={originDistrictCodeIn}&originDistrictCode.notIn={originDistrictCodeNotIn}&originProvinceCode.contains={originProvinceCodeContains}&originProvinceCode.doesNotContain={originProvinceCodeDoesNotContain}&originProvinceCode.equals={originProvinceCodeEquals}&originProvinceCode.notEquals={originProvinceCodeNotEquals}&originProvinceCode.specified={originProvinceCodeSpecified}&originProvinceCode.in={originProvinceCodeIn}&originProvinceCode.notIn={originProvinceCodeNotIn}&destinationDistrictCode.contains={destinationDistrictCodeContains}&destinationDistrictCode.doesNotContain={destinationDistrictCodeDoesNotContain}&destinationDistrictCode.equals={destinationDistrictCodeEquals}&destinationDistrictCode.notEquals={destinationDistrictCodeNotEquals}&destinationDistrictCode.specified={destinationDistrictCodeSpecified}&destinationDistrictCode.in={destinationDistrictCodeIn}&destinationDistrictCode.notIn={destinationDistrictCodeNotIn}&destinationProvinceCode.contains={destinationProvinceCodeContains}&destinationProvinceCode.doesNotContain={destinationProvinceCodeDoesNotContain}&destinationProvinceCode.equals={destinationProvinceCodeEquals}&destinationProvinceCode.notEquals={destinationProvinceCodeNotEquals}&destinationProvinceCode.specified={destinationProvinceCodeSpecified}&destinationProvinceCode.in={destinationProvinceCodeIn}&destinationProvinceCode.notIn={destinationProvinceCodeNotIn}&vehiclePlateNumber.contains={vehiclePlateNumberContains}&vehiclePlateNumber.doesNotContain={vehiclePlateNumberDoesNotContain}&vehiclePlateNumber.equals={vehiclePlateNumberEquals}&vehiclePlateNumber.notEquals={vehiclePlateNumberNotEquals}&vehiclePlateNumber.specified={vehiclePlateNumberSpecified}&vehiclePlateNumber.in={vehiclePlateNumberIn}&vehiclePlateNumber.notIn={vehiclePlateNumberNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countTripsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("tripCodeContains") @jakarta.annotation.Nullable String tripCodeContains, @Param("tripCodeDoesNotContain") @jakarta.annotation.Nullable String tripCodeDoesNotContain, @Param("tripCodeEquals") @jakarta.annotation.Nullable String tripCodeEquals, @Param("tripCodeNotEquals") @jakarta.annotation.Nullable String tripCodeNotEquals, @Param("tripCodeSpecified") @jakarta.annotation.Nullable Boolean tripCodeSpecified, @Param("tripCodeIn") @jakarta.annotation.Nullable List<String> tripCodeIn, @Param("tripCodeNotIn") @jakarta.annotation.Nullable List<String> tripCodeNotIn, @Param("departureTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThan, @Param("departureTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThan, @Param("departureTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThanOrEqual, @Param("departureTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThanOrEqual, @Param("departureTimeEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeEquals, @Param("departureTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeNotEquals, @Param("departureTimeSpecified") @jakarta.annotation.Nullable Boolean departureTimeSpecified, @Param("departureTimeIn") @jakarta.annotation.Nullable List<OffsetDateTime> departureTimeIn, @Param("departureTimeNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> departureTimeNotIn, @Param("arrivalTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThan, @Param("arrivalTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThan, @Param("arrivalTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThanOrEqual, @Param("arrivalTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThanOrEqual, @Param("arrivalTimeEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeEquals, @Param("arrivalTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeNotEquals, @Param("arrivalTimeSpecified") @jakarta.annotation.Nullable Boolean arrivalTimeSpecified, @Param("arrivalTimeIn") @jakarta.annotation.Nullable List<OffsetDateTime> arrivalTimeIn, @Param("arrivalTimeNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> arrivalTimeNotIn, @Param("occasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThan, @Param("occasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThan, @Param("occasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThanOrEqual, @Param("occasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThanOrEqual, @Param("occasionFactorEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorEquals, @Param("occasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorNotEquals, @Param("occasionFactorSpecified") @jakarta.annotation.Nullable Boolean occasionFactorSpecified, @Param("occasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorIn, @Param("occasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("vehicleIdGreaterThan") @jakarta.annotation.Nullable Long vehicleIdGreaterThan, @Param("vehicleIdLessThan") @jakarta.annotation.Nullable Long vehicleIdLessThan, @Param("vehicleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long vehicleIdGreaterThanOrEqual, @Param("vehicleIdLessThanOrEqual") @jakarta.annotation.Nullable Long vehicleIdLessThanOrEqual, @Param("vehicleIdEquals") @jakarta.annotation.Nullable Long vehicleIdEquals, @Param("vehicleIdNotEquals") @jakarta.annotation.Nullable Long vehicleIdNotEquals, @Param("vehicleIdSpecified") @jakarta.annotation.Nullable Boolean vehicleIdSpecified, @Param("vehicleIdIn") @jakarta.annotation.Nullable List<Long> vehicleIdIn, @Param("vehicleIdNotIn") @jakarta.annotation.Nullable List<Long> vehicleIdNotIn, @Param("slotIdGreaterThan") @jakarta.annotation.Nullable Long slotIdGreaterThan, @Param("slotIdLessThan") @jakarta.annotation.Nullable Long slotIdLessThan, @Param("slotIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long slotIdGreaterThanOrEqual, @Param("slotIdLessThanOrEqual") @jakarta.annotation.Nullable Long slotIdLessThanOrEqual, @Param("slotIdEquals") @jakarta.annotation.Nullable Long slotIdEquals, @Param("slotIdNotEquals") @jakarta.annotation.Nullable Long slotIdNotEquals, @Param("slotIdSpecified") @jakarta.annotation.Nullable Boolean slotIdSpecified, @Param("slotIdIn") @jakarta.annotation.Nullable List<Long> slotIdIn, @Param("slotIdNotIn") @jakarta.annotation.Nullable List<Long> slotIdNotIn, @Param("driverIdGreaterThan") @jakarta.annotation.Nullable Long driverIdGreaterThan, @Param("driverIdLessThan") @jakarta.annotation.Nullable Long driverIdLessThan, @Param("driverIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long driverIdGreaterThanOrEqual, @Param("driverIdLessThanOrEqual") @jakarta.annotation.Nullable Long driverIdLessThanOrEqual, @Param("driverIdEquals") @jakarta.annotation.Nullable Long driverIdEquals, @Param("driverIdNotEquals") @jakarta.annotation.Nullable Long driverIdNotEquals, @Param("driverIdSpecified") @jakarta.annotation.Nullable Boolean driverIdSpecified, @Param("driverIdIn") @jakarta.annotation.Nullable List<Long> driverIdIn, @Param("driverIdNotIn") @jakarta.annotation.Nullable List<Long> driverIdNotIn, @Param("attendantIdGreaterThan") @jakarta.annotation.Nullable Long attendantIdGreaterThan, @Param("attendantIdLessThan") @jakarta.annotation.Nullable Long attendantIdLessThan, @Param("attendantIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long attendantIdGreaterThanOrEqual, @Param("attendantIdLessThanOrEqual") @jakarta.annotation.Nullable Long attendantIdLessThanOrEqual, @Param("attendantIdEquals") @jakarta.annotation.Nullable Long attendantIdEquals, @Param("attendantIdNotEquals") @jakarta.annotation.Nullable Long attendantIdNotEquals, @Param("attendantIdSpecified") @jakarta.annotation.Nullable Boolean attendantIdSpecified, @Param("attendantIdIn") @jakarta.annotation.Nullable List<Long> attendantIdIn, @Param("attendantIdNotIn") @jakarta.annotation.Nullable List<Long> attendantIdNotIn, @Param("vehicleTypeEquals") @jakarta.annotation.Nullable String vehicleTypeEquals, @Param("vehicleTypeNotEquals") @jakarta.annotation.Nullable String vehicleTypeNotEquals, @Param("vehicleTypeSpecified") @jakarta.annotation.Nullable Boolean vehicleTypeSpecified, @Param("vehicleTypeIn") @jakarta.annotation.Nullable List<String> vehicleTypeIn, @Param("vehicleTypeNotIn") @jakarta.annotation.Nullable List<String> vehicleTypeNotIn, @Param("routeCodeContains") @jakarta.annotation.Nullable String routeCodeContains, @Param("routeCodeDoesNotContain") @jakarta.annotation.Nullable String routeCodeDoesNotContain, @Param("routeCodeEquals") @jakarta.annotation.Nullable String routeCodeEquals, @Param("routeCodeNotEquals") @jakarta.annotation.Nullable String routeCodeNotEquals, @Param("routeCodeSpecified") @jakarta.annotation.Nullable Boolean routeCodeSpecified, @Param("routeCodeIn") @jakarta.annotation.Nullable List<String> routeCodeIn, @Param("routeCodeNotIn") @jakarta.annotation.Nullable List<String> routeCodeNotIn, @Param("originDistrictCodeContains") @jakarta.annotation.Nullable String originDistrictCodeContains, @Param("originDistrictCodeDoesNotContain") @jakarta.annotation.Nullable String originDistrictCodeDoesNotContain, @Param("originDistrictCodeEquals") @jakarta.annotation.Nullable String originDistrictCodeEquals, @Param("originDistrictCodeNotEquals") @jakarta.annotation.Nullable String originDistrictCodeNotEquals, @Param("originDistrictCodeSpecified") @jakarta.annotation.Nullable Boolean originDistrictCodeSpecified, @Param("originDistrictCodeIn") @jakarta.annotation.Nullable List<String> originDistrictCodeIn, @Param("originDistrictCodeNotIn") @jakarta.annotation.Nullable List<String> originDistrictCodeNotIn, @Param("originProvinceCodeContains") @jakarta.annotation.Nullable String originProvinceCodeContains, @Param("originProvinceCodeDoesNotContain") @jakarta.annotation.Nullable String originProvinceCodeDoesNotContain, @Param("originProvinceCodeEquals") @jakarta.annotation.Nullable String originProvinceCodeEquals, @Param("originProvinceCodeNotEquals") @jakarta.annotation.Nullable String originProvinceCodeNotEquals, @Param("originProvinceCodeSpecified") @jakarta.annotation.Nullable Boolean originProvinceCodeSpecified, @Param("originProvinceCodeIn") @jakarta.annotation.Nullable List<String> originProvinceCodeIn, @Param("originProvinceCodeNotIn") @jakarta.annotation.Nullable List<String> originProvinceCodeNotIn, @Param("destinationDistrictCodeContains") @jakarta.annotation.Nullable String destinationDistrictCodeContains, @Param("destinationDistrictCodeDoesNotContain") @jakarta.annotation.Nullable String destinationDistrictCodeDoesNotContain, @Param("destinationDistrictCodeEquals") @jakarta.annotation.Nullable String destinationDistrictCodeEquals, @Param("destinationDistrictCodeNotEquals") @jakarta.annotation.Nullable String destinationDistrictCodeNotEquals, @Param("destinationDistrictCodeSpecified") @jakarta.annotation.Nullable Boolean destinationDistrictCodeSpecified, @Param("destinationDistrictCodeIn") @jakarta.annotation.Nullable List<String> destinationDistrictCodeIn, @Param("destinationDistrictCodeNotIn") @jakarta.annotation.Nullable List<String> destinationDistrictCodeNotIn, @Param("destinationProvinceCodeContains") @jakarta.annotation.Nullable String destinationProvinceCodeContains, @Param("destinationProvinceCodeDoesNotContain") @jakarta.annotation.Nullable String destinationProvinceCodeDoesNotContain, @Param("destinationProvinceCodeEquals") @jakarta.annotation.Nullable String destinationProvinceCodeEquals, @Param("destinationProvinceCodeNotEquals") @jakarta.annotation.Nullable String destinationProvinceCodeNotEquals, @Param("destinationProvinceCodeSpecified") @jakarta.annotation.Nullable Boolean destinationProvinceCodeSpecified, @Param("destinationProvinceCodeIn") @jakarta.annotation.Nullable List<String> destinationProvinceCodeIn, @Param("destinationProvinceCodeNotIn") @jakarta.annotation.Nullable List<String> destinationProvinceCodeNotIn, @Param("vehiclePlateNumberContains") @jakarta.annotation.Nullable String vehiclePlateNumberContains, @Param("vehiclePlateNumberDoesNotContain") @jakarta.annotation.Nullable String vehiclePlateNumberDoesNotContain, @Param("vehiclePlateNumberEquals") @jakarta.annotation.Nullable String vehiclePlateNumberEquals, @Param("vehiclePlateNumberNotEquals") @jakarta.annotation.Nullable String vehiclePlateNumberNotEquals, @Param("vehiclePlateNumberSpecified") @jakarta.annotation.Nullable Boolean vehiclePlateNumberSpecified, @Param("vehiclePlateNumberIn") @jakarta.annotation.Nullable List<String> vehiclePlateNumberIn, @Param("vehiclePlateNumberNotIn") @jakarta.annotation.Nullable List<String> vehiclePlateNumberNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countTrips</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountTripsQueryParams} class that allows for
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
   *   <li>tripCodeContains -  (optional)</li>
   *   <li>tripCodeDoesNotContain -  (optional)</li>
   *   <li>tripCodeEquals -  (optional)</li>
   *   <li>tripCodeNotEquals -  (optional)</li>
   *   <li>tripCodeSpecified -  (optional)</li>
   *   <li>tripCodeIn -  (optional)</li>
   *   <li>tripCodeNotIn -  (optional)</li>
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
   *   <li>routeIdGreaterThan -  (optional)</li>
   *   <li>routeIdLessThan -  (optional)</li>
   *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
   *   <li>routeIdLessThanOrEqual -  (optional)</li>
   *   <li>routeIdEquals -  (optional)</li>
   *   <li>routeIdNotEquals -  (optional)</li>
   *   <li>routeIdSpecified -  (optional)</li>
   *   <li>routeIdIn -  (optional)</li>
   *   <li>routeIdNotIn -  (optional)</li>
   *   <li>vehicleIdGreaterThan -  (optional)</li>
   *   <li>vehicleIdLessThan -  (optional)</li>
   *   <li>vehicleIdGreaterThanOrEqual -  (optional)</li>
   *   <li>vehicleIdLessThanOrEqual -  (optional)</li>
   *   <li>vehicleIdEquals -  (optional)</li>
   *   <li>vehicleIdNotEquals -  (optional)</li>
   *   <li>vehicleIdSpecified -  (optional)</li>
   *   <li>vehicleIdIn -  (optional)</li>
   *   <li>vehicleIdNotIn -  (optional)</li>
   *   <li>slotIdGreaterThan -  (optional)</li>
   *   <li>slotIdLessThan -  (optional)</li>
   *   <li>slotIdGreaterThanOrEqual -  (optional)</li>
   *   <li>slotIdLessThanOrEqual -  (optional)</li>
   *   <li>slotIdEquals -  (optional)</li>
   *   <li>slotIdNotEquals -  (optional)</li>
   *   <li>slotIdSpecified -  (optional)</li>
   *   <li>slotIdIn -  (optional)</li>
   *   <li>slotIdNotIn -  (optional)</li>
   *   <li>driverIdGreaterThan -  (optional)</li>
   *   <li>driverIdLessThan -  (optional)</li>
   *   <li>driverIdGreaterThanOrEqual -  (optional)</li>
   *   <li>driverIdLessThanOrEqual -  (optional)</li>
   *   <li>driverIdEquals -  (optional)</li>
   *   <li>driverIdNotEquals -  (optional)</li>
   *   <li>driverIdSpecified -  (optional)</li>
   *   <li>driverIdIn -  (optional)</li>
   *   <li>driverIdNotIn -  (optional)</li>
   *   <li>attendantIdGreaterThan -  (optional)</li>
   *   <li>attendantIdLessThan -  (optional)</li>
   *   <li>attendantIdGreaterThanOrEqual -  (optional)</li>
   *   <li>attendantIdLessThanOrEqual -  (optional)</li>
   *   <li>attendantIdEquals -  (optional)</li>
   *   <li>attendantIdNotEquals -  (optional)</li>
   *   <li>attendantIdSpecified -  (optional)</li>
   *   <li>attendantIdIn -  (optional)</li>
   *   <li>attendantIdNotIn -  (optional)</li>
   *   <li>vehicleTypeEquals -  (optional)</li>
   *   <li>vehicleTypeNotEquals -  (optional)</li>
   *   <li>vehicleTypeSpecified -  (optional)</li>
   *   <li>vehicleTypeIn -  (optional)</li>
   *   <li>vehicleTypeNotIn -  (optional)</li>
   *   <li>routeCodeContains -  (optional)</li>
   *   <li>routeCodeDoesNotContain -  (optional)</li>
   *   <li>routeCodeEquals -  (optional)</li>
   *   <li>routeCodeNotEquals -  (optional)</li>
   *   <li>routeCodeSpecified -  (optional)</li>
   *   <li>routeCodeIn -  (optional)</li>
   *   <li>routeCodeNotIn -  (optional)</li>
   *   <li>originDistrictCodeContains -  (optional)</li>
   *   <li>originDistrictCodeDoesNotContain -  (optional)</li>
   *   <li>originDistrictCodeEquals -  (optional)</li>
   *   <li>originDistrictCodeNotEquals -  (optional)</li>
   *   <li>originDistrictCodeSpecified -  (optional)</li>
   *   <li>originDistrictCodeIn -  (optional)</li>
   *   <li>originDistrictCodeNotIn -  (optional)</li>
   *   <li>originProvinceCodeContains -  (optional)</li>
   *   <li>originProvinceCodeDoesNotContain -  (optional)</li>
   *   <li>originProvinceCodeEquals -  (optional)</li>
   *   <li>originProvinceCodeNotEquals -  (optional)</li>
   *   <li>originProvinceCodeSpecified -  (optional)</li>
   *   <li>originProvinceCodeIn -  (optional)</li>
   *   <li>originProvinceCodeNotIn -  (optional)</li>
   *   <li>destinationDistrictCodeContains -  (optional)</li>
   *   <li>destinationDistrictCodeDoesNotContain -  (optional)</li>
   *   <li>destinationDistrictCodeEquals -  (optional)</li>
   *   <li>destinationDistrictCodeNotEquals -  (optional)</li>
   *   <li>destinationDistrictCodeSpecified -  (optional)</li>
   *   <li>destinationDistrictCodeIn -  (optional)</li>
   *   <li>destinationDistrictCodeNotIn -  (optional)</li>
   *   <li>destinationProvinceCodeContains -  (optional)</li>
   *   <li>destinationProvinceCodeDoesNotContain -  (optional)</li>
   *   <li>destinationProvinceCodeEquals -  (optional)</li>
   *   <li>destinationProvinceCodeNotEquals -  (optional)</li>
   *   <li>destinationProvinceCodeSpecified -  (optional)</li>
   *   <li>destinationProvinceCodeIn -  (optional)</li>
   *   <li>destinationProvinceCodeNotIn -  (optional)</li>
   *   <li>vehiclePlateNumberContains -  (optional)</li>
   *   <li>vehiclePlateNumberDoesNotContain -  (optional)</li>
   *   <li>vehiclePlateNumberEquals -  (optional)</li>
   *   <li>vehiclePlateNumberNotEquals -  (optional)</li>
   *   <li>vehiclePlateNumberSpecified -  (optional)</li>
   *   <li>vehiclePlateNumberIn -  (optional)</li>
   *   <li>vehiclePlateNumberNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return Long
   */
  @RequestLine("GET /api/trips/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&tripCode.contains={tripCodeContains}&tripCode.doesNotContain={tripCodeDoesNotContain}&tripCode.equals={tripCodeEquals}&tripCode.notEquals={tripCodeNotEquals}&tripCode.specified={tripCodeSpecified}&tripCode.in={tripCodeIn}&tripCode.notIn={tripCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleId.greaterThan={vehicleIdGreaterThan}&vehicleId.lessThan={vehicleIdLessThan}&vehicleId.greaterThanOrEqual={vehicleIdGreaterThanOrEqual}&vehicleId.lessThanOrEqual={vehicleIdLessThanOrEqual}&vehicleId.equals={vehicleIdEquals}&vehicleId.notEquals={vehicleIdNotEquals}&vehicleId.specified={vehicleIdSpecified}&vehicleId.in={vehicleIdIn}&vehicleId.notIn={vehicleIdNotIn}&slotId.greaterThan={slotIdGreaterThan}&slotId.lessThan={slotIdLessThan}&slotId.greaterThanOrEqual={slotIdGreaterThanOrEqual}&slotId.lessThanOrEqual={slotIdLessThanOrEqual}&slotId.equals={slotIdEquals}&slotId.notEquals={slotIdNotEquals}&slotId.specified={slotIdSpecified}&slotId.in={slotIdIn}&slotId.notIn={slotIdNotIn}&driverId.greaterThan={driverIdGreaterThan}&driverId.lessThan={driverIdLessThan}&driverId.greaterThanOrEqual={driverIdGreaterThanOrEqual}&driverId.lessThanOrEqual={driverIdLessThanOrEqual}&driverId.equals={driverIdEquals}&driverId.notEquals={driverIdNotEquals}&driverId.specified={driverIdSpecified}&driverId.in={driverIdIn}&driverId.notIn={driverIdNotIn}&attendantId.greaterThan={attendantIdGreaterThan}&attendantId.lessThan={attendantIdLessThan}&attendantId.greaterThanOrEqual={attendantIdGreaterThanOrEqual}&attendantId.lessThanOrEqual={attendantIdLessThanOrEqual}&attendantId.equals={attendantIdEquals}&attendantId.notEquals={attendantIdNotEquals}&attendantId.specified={attendantIdSpecified}&attendantId.in={attendantIdIn}&attendantId.notIn={attendantIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&originDistrictCode.contains={originDistrictCodeContains}&originDistrictCode.doesNotContain={originDistrictCodeDoesNotContain}&originDistrictCode.equals={originDistrictCodeEquals}&originDistrictCode.notEquals={originDistrictCodeNotEquals}&originDistrictCode.specified={originDistrictCodeSpecified}&originDistrictCode.in={originDistrictCodeIn}&originDistrictCode.notIn={originDistrictCodeNotIn}&originProvinceCode.contains={originProvinceCodeContains}&originProvinceCode.doesNotContain={originProvinceCodeDoesNotContain}&originProvinceCode.equals={originProvinceCodeEquals}&originProvinceCode.notEquals={originProvinceCodeNotEquals}&originProvinceCode.specified={originProvinceCodeSpecified}&originProvinceCode.in={originProvinceCodeIn}&originProvinceCode.notIn={originProvinceCodeNotIn}&destinationDistrictCode.contains={destinationDistrictCodeContains}&destinationDistrictCode.doesNotContain={destinationDistrictCodeDoesNotContain}&destinationDistrictCode.equals={destinationDistrictCodeEquals}&destinationDistrictCode.notEquals={destinationDistrictCodeNotEquals}&destinationDistrictCode.specified={destinationDistrictCodeSpecified}&destinationDistrictCode.in={destinationDistrictCodeIn}&destinationDistrictCode.notIn={destinationDistrictCodeNotIn}&destinationProvinceCode.contains={destinationProvinceCodeContains}&destinationProvinceCode.doesNotContain={destinationProvinceCodeDoesNotContain}&destinationProvinceCode.equals={destinationProvinceCodeEquals}&destinationProvinceCode.notEquals={destinationProvinceCodeNotEquals}&destinationProvinceCode.specified={destinationProvinceCodeSpecified}&destinationProvinceCode.in={destinationProvinceCodeIn}&destinationProvinceCode.notIn={destinationProvinceCodeNotIn}&vehiclePlateNumber.contains={vehiclePlateNumberContains}&vehiclePlateNumber.doesNotContain={vehiclePlateNumberDoesNotContain}&vehiclePlateNumber.equals={vehiclePlateNumberEquals}&vehiclePlateNumber.notEquals={vehiclePlateNumberNotEquals}&vehiclePlateNumber.specified={vehiclePlateNumberSpecified}&vehiclePlateNumber.in={vehiclePlateNumberIn}&vehiclePlateNumber.notIn={vehiclePlateNumberNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countTrips(@QueryMap(encoded=true) CountTripsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countTrips</code> that receives the query parameters as a map,
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
          *   <li>tripCodeContains -  (optional)</li>
          *   <li>tripCodeDoesNotContain -  (optional)</li>
          *   <li>tripCodeEquals -  (optional)</li>
          *   <li>tripCodeNotEquals -  (optional)</li>
          *   <li>tripCodeSpecified -  (optional)</li>
          *   <li>tripCodeIn -  (optional)</li>
          *   <li>tripCodeNotIn -  (optional)</li>
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
          *   <li>routeIdGreaterThan -  (optional)</li>
          *   <li>routeIdLessThan -  (optional)</li>
          *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
          *   <li>routeIdLessThanOrEqual -  (optional)</li>
          *   <li>routeIdEquals -  (optional)</li>
          *   <li>routeIdNotEquals -  (optional)</li>
          *   <li>routeIdSpecified -  (optional)</li>
          *   <li>routeIdIn -  (optional)</li>
          *   <li>routeIdNotIn -  (optional)</li>
          *   <li>vehicleIdGreaterThan -  (optional)</li>
          *   <li>vehicleIdLessThan -  (optional)</li>
          *   <li>vehicleIdGreaterThanOrEqual -  (optional)</li>
          *   <li>vehicleIdLessThanOrEqual -  (optional)</li>
          *   <li>vehicleIdEquals -  (optional)</li>
          *   <li>vehicleIdNotEquals -  (optional)</li>
          *   <li>vehicleIdSpecified -  (optional)</li>
          *   <li>vehicleIdIn -  (optional)</li>
          *   <li>vehicleIdNotIn -  (optional)</li>
          *   <li>slotIdGreaterThan -  (optional)</li>
          *   <li>slotIdLessThan -  (optional)</li>
          *   <li>slotIdGreaterThanOrEqual -  (optional)</li>
          *   <li>slotIdLessThanOrEqual -  (optional)</li>
          *   <li>slotIdEquals -  (optional)</li>
          *   <li>slotIdNotEquals -  (optional)</li>
          *   <li>slotIdSpecified -  (optional)</li>
          *   <li>slotIdIn -  (optional)</li>
          *   <li>slotIdNotIn -  (optional)</li>
          *   <li>driverIdGreaterThan -  (optional)</li>
          *   <li>driverIdLessThan -  (optional)</li>
          *   <li>driverIdGreaterThanOrEqual -  (optional)</li>
          *   <li>driverIdLessThanOrEqual -  (optional)</li>
          *   <li>driverIdEquals -  (optional)</li>
          *   <li>driverIdNotEquals -  (optional)</li>
          *   <li>driverIdSpecified -  (optional)</li>
          *   <li>driverIdIn -  (optional)</li>
          *   <li>driverIdNotIn -  (optional)</li>
          *   <li>attendantIdGreaterThan -  (optional)</li>
          *   <li>attendantIdLessThan -  (optional)</li>
          *   <li>attendantIdGreaterThanOrEqual -  (optional)</li>
          *   <li>attendantIdLessThanOrEqual -  (optional)</li>
          *   <li>attendantIdEquals -  (optional)</li>
          *   <li>attendantIdNotEquals -  (optional)</li>
          *   <li>attendantIdSpecified -  (optional)</li>
          *   <li>attendantIdIn -  (optional)</li>
          *   <li>attendantIdNotIn -  (optional)</li>
          *   <li>vehicleTypeEquals -  (optional)</li>
          *   <li>vehicleTypeNotEquals -  (optional)</li>
          *   <li>vehicleTypeSpecified -  (optional)</li>
          *   <li>vehicleTypeIn -  (optional)</li>
          *   <li>vehicleTypeNotIn -  (optional)</li>
          *   <li>routeCodeContains -  (optional)</li>
          *   <li>routeCodeDoesNotContain -  (optional)</li>
          *   <li>routeCodeEquals -  (optional)</li>
          *   <li>routeCodeNotEquals -  (optional)</li>
          *   <li>routeCodeSpecified -  (optional)</li>
          *   <li>routeCodeIn -  (optional)</li>
          *   <li>routeCodeNotIn -  (optional)</li>
          *   <li>originDistrictCodeContains -  (optional)</li>
          *   <li>originDistrictCodeDoesNotContain -  (optional)</li>
          *   <li>originDistrictCodeEquals -  (optional)</li>
          *   <li>originDistrictCodeNotEquals -  (optional)</li>
          *   <li>originDistrictCodeSpecified -  (optional)</li>
          *   <li>originDistrictCodeIn -  (optional)</li>
          *   <li>originDistrictCodeNotIn -  (optional)</li>
          *   <li>originProvinceCodeContains -  (optional)</li>
          *   <li>originProvinceCodeDoesNotContain -  (optional)</li>
          *   <li>originProvinceCodeEquals -  (optional)</li>
          *   <li>originProvinceCodeNotEquals -  (optional)</li>
          *   <li>originProvinceCodeSpecified -  (optional)</li>
          *   <li>originProvinceCodeIn -  (optional)</li>
          *   <li>originProvinceCodeNotIn -  (optional)</li>
          *   <li>destinationDistrictCodeContains -  (optional)</li>
          *   <li>destinationDistrictCodeDoesNotContain -  (optional)</li>
          *   <li>destinationDistrictCodeEquals -  (optional)</li>
          *   <li>destinationDistrictCodeNotEquals -  (optional)</li>
          *   <li>destinationDistrictCodeSpecified -  (optional)</li>
          *   <li>destinationDistrictCodeIn -  (optional)</li>
          *   <li>destinationDistrictCodeNotIn -  (optional)</li>
          *   <li>destinationProvinceCodeContains -  (optional)</li>
          *   <li>destinationProvinceCodeDoesNotContain -  (optional)</li>
          *   <li>destinationProvinceCodeEquals -  (optional)</li>
          *   <li>destinationProvinceCodeNotEquals -  (optional)</li>
          *   <li>destinationProvinceCodeSpecified -  (optional)</li>
          *   <li>destinationProvinceCodeIn -  (optional)</li>
          *   <li>destinationProvinceCodeNotIn -  (optional)</li>
          *   <li>vehiclePlateNumberContains -  (optional)</li>
          *   <li>vehiclePlateNumberDoesNotContain -  (optional)</li>
          *   <li>vehiclePlateNumberEquals -  (optional)</li>
          *   <li>vehiclePlateNumberNotEquals -  (optional)</li>
          *   <li>vehiclePlateNumberSpecified -  (optional)</li>
          *   <li>vehiclePlateNumberIn -  (optional)</li>
          *   <li>vehiclePlateNumberNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return Long
      */
      @RequestLine("GET /api/trips/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&tripCode.contains={tripCodeContains}&tripCode.doesNotContain={tripCodeDoesNotContain}&tripCode.equals={tripCodeEquals}&tripCode.notEquals={tripCodeNotEquals}&tripCode.specified={tripCodeSpecified}&tripCode.in={tripCodeIn}&tripCode.notIn={tripCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleId.greaterThan={vehicleIdGreaterThan}&vehicleId.lessThan={vehicleIdLessThan}&vehicleId.greaterThanOrEqual={vehicleIdGreaterThanOrEqual}&vehicleId.lessThanOrEqual={vehicleIdLessThanOrEqual}&vehicleId.equals={vehicleIdEquals}&vehicleId.notEquals={vehicleIdNotEquals}&vehicleId.specified={vehicleIdSpecified}&vehicleId.in={vehicleIdIn}&vehicleId.notIn={vehicleIdNotIn}&slotId.greaterThan={slotIdGreaterThan}&slotId.lessThan={slotIdLessThan}&slotId.greaterThanOrEqual={slotIdGreaterThanOrEqual}&slotId.lessThanOrEqual={slotIdLessThanOrEqual}&slotId.equals={slotIdEquals}&slotId.notEquals={slotIdNotEquals}&slotId.specified={slotIdSpecified}&slotId.in={slotIdIn}&slotId.notIn={slotIdNotIn}&driverId.greaterThan={driverIdGreaterThan}&driverId.lessThan={driverIdLessThan}&driverId.greaterThanOrEqual={driverIdGreaterThanOrEqual}&driverId.lessThanOrEqual={driverIdLessThanOrEqual}&driverId.equals={driverIdEquals}&driverId.notEquals={driverIdNotEquals}&driverId.specified={driverIdSpecified}&driverId.in={driverIdIn}&driverId.notIn={driverIdNotIn}&attendantId.greaterThan={attendantIdGreaterThan}&attendantId.lessThan={attendantIdLessThan}&attendantId.greaterThanOrEqual={attendantIdGreaterThanOrEqual}&attendantId.lessThanOrEqual={attendantIdLessThanOrEqual}&attendantId.equals={attendantIdEquals}&attendantId.notEquals={attendantIdNotEquals}&attendantId.specified={attendantIdSpecified}&attendantId.in={attendantIdIn}&attendantId.notIn={attendantIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&originDistrictCode.contains={originDistrictCodeContains}&originDistrictCode.doesNotContain={originDistrictCodeDoesNotContain}&originDistrictCode.equals={originDistrictCodeEquals}&originDistrictCode.notEquals={originDistrictCodeNotEquals}&originDistrictCode.specified={originDistrictCodeSpecified}&originDistrictCode.in={originDistrictCodeIn}&originDistrictCode.notIn={originDistrictCodeNotIn}&originProvinceCode.contains={originProvinceCodeContains}&originProvinceCode.doesNotContain={originProvinceCodeDoesNotContain}&originProvinceCode.equals={originProvinceCodeEquals}&originProvinceCode.notEquals={originProvinceCodeNotEquals}&originProvinceCode.specified={originProvinceCodeSpecified}&originProvinceCode.in={originProvinceCodeIn}&originProvinceCode.notIn={originProvinceCodeNotIn}&destinationDistrictCode.contains={destinationDistrictCodeContains}&destinationDistrictCode.doesNotContain={destinationDistrictCodeDoesNotContain}&destinationDistrictCode.equals={destinationDistrictCodeEquals}&destinationDistrictCode.notEquals={destinationDistrictCodeNotEquals}&destinationDistrictCode.specified={destinationDistrictCodeSpecified}&destinationDistrictCode.in={destinationDistrictCodeIn}&destinationDistrictCode.notIn={destinationDistrictCodeNotIn}&destinationProvinceCode.contains={destinationProvinceCodeContains}&destinationProvinceCode.doesNotContain={destinationProvinceCodeDoesNotContain}&destinationProvinceCode.equals={destinationProvinceCodeEquals}&destinationProvinceCode.notEquals={destinationProvinceCodeNotEquals}&destinationProvinceCode.specified={destinationProvinceCodeSpecified}&destinationProvinceCode.in={destinationProvinceCodeIn}&destinationProvinceCode.notIn={destinationProvinceCodeNotIn}&vehiclePlateNumber.contains={vehiclePlateNumberContains}&vehiclePlateNumber.doesNotContain={vehiclePlateNumberDoesNotContain}&vehiclePlateNumber.equals={vehiclePlateNumberEquals}&vehiclePlateNumber.notEquals={vehiclePlateNumberNotEquals}&vehiclePlateNumber.specified={vehiclePlateNumberSpecified}&vehiclePlateNumber.in={vehiclePlateNumberIn}&vehiclePlateNumber.notIn={vehiclePlateNumberNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countTripsWithHttpInfo(@QueryMap(encoded=true) CountTripsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countTrips</code> method in a fluent style.
   */
  public static class CountTripsQueryParams extends HashMap<String, Object> {
    public CountTripsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams tripCodeContains(@jakarta.annotation.Nullable final String value) {
      put("tripCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams tripCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("tripCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams tripCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("tripCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams tripCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("tripCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams tripCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("tripCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams tripCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("tripCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams tripCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("tripCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams departureTimeGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams departureTimeLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams departureTimeGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams departureTimeLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams departureTimeEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams departureTimeNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams departureTimeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("departureTime.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams departureTimeIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("departureTime.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams departureTimeNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("departureTime.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams arrivalTimeGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams arrivalTimeLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams arrivalTimeGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams arrivalTimeLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams arrivalTimeEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams arrivalTimeNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams arrivalTimeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("arrivalTime.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams arrivalTimeIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("arrivalTime.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams arrivalTimeNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("arrivalTime.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams occasionFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams occasionFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams occasionFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams occasionFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams occasionFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams occasionFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams occasionFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occasionFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams occasionFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occasionFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams occasionFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occasionFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams routeIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams routeIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams routeIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams routeIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams routeIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams routeIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams routeIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("routeId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams routeIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams routeIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams vehicleIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams vehicleIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams vehicleIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams vehicleIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams vehicleIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams vehicleIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams vehicleIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehicleId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams vehicleIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("vehicleId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams vehicleIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("vehicleId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams slotIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("slotId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams slotIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("slotId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams slotIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("slotId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams slotIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("slotId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams slotIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("slotId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams slotIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("slotId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams slotIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("slotId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams slotIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("slotId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams slotIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("slotId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams driverIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("driverId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams driverIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("driverId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams driverIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("driverId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams driverIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("driverId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams driverIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("driverId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams driverIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("driverId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams driverIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("driverId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams driverIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("driverId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams driverIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("driverId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams attendantIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams attendantIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams attendantIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams attendantIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams attendantIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams attendantIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams attendantIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("attendantId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams attendantIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("attendantId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams attendantIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("attendantId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams vehicleTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("vehicleType.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams vehicleTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("vehicleType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams vehicleTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehicleType.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams vehicleTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehicleType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams vehicleTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehicleType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams routeCodeContains(@jakarta.annotation.Nullable final String value) {
      put("routeCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams routeCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("routeCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams routeCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("routeCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams routeCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("routeCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams routeCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("routeCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams routeCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("routeCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams routeCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("routeCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams originDistrictCodeContains(@jakarta.annotation.Nullable final String value) {
      put("originDistrictCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams originDistrictCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("originDistrictCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams originDistrictCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("originDistrictCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams originDistrictCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("originDistrictCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams originDistrictCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("originDistrictCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams originDistrictCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("originDistrictCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams originDistrictCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("originDistrictCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams originProvinceCodeContains(@jakarta.annotation.Nullable final String value) {
      put("originProvinceCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams originProvinceCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("originProvinceCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams originProvinceCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("originProvinceCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams originProvinceCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("originProvinceCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams originProvinceCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("originProvinceCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams originProvinceCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("originProvinceCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams originProvinceCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("originProvinceCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams destinationDistrictCodeContains(@jakarta.annotation.Nullable final String value) {
      put("destinationDistrictCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams destinationDistrictCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("destinationDistrictCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams destinationDistrictCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("destinationDistrictCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams destinationDistrictCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("destinationDistrictCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams destinationDistrictCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("destinationDistrictCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams destinationDistrictCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("destinationDistrictCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams destinationDistrictCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("destinationDistrictCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams destinationProvinceCodeContains(@jakarta.annotation.Nullable final String value) {
      put("destinationProvinceCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams destinationProvinceCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("destinationProvinceCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams destinationProvinceCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("destinationProvinceCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams destinationProvinceCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("destinationProvinceCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams destinationProvinceCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("destinationProvinceCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams destinationProvinceCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("destinationProvinceCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams destinationProvinceCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("destinationProvinceCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams vehiclePlateNumberContains(@jakarta.annotation.Nullable final String value) {
      put("vehiclePlateNumber.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams vehiclePlateNumberDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("vehiclePlateNumber.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams vehiclePlateNumberEquals(@jakarta.annotation.Nullable final String value) {
      put("vehiclePlateNumber.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams vehiclePlateNumberNotEquals(@jakarta.annotation.Nullable final String value) {
      put("vehiclePlateNumber.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams vehiclePlateNumberSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehiclePlateNumber.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripsQueryParams vehiclePlateNumberIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehiclePlateNumber.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams vehiclePlateNumberNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehiclePlateNumber.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param tripDTO  (required)
   * @return TripDTO
   */
  @RequestLine("POST /api/trips")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TripDTO createTrip(@jakarta.annotation.Nonnull TripDTO tripDTO);

  /**
   * 
   * Similar to <code>createTrip</code> but it also returns the http response headers .
   * 
   * @param tripDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/trips")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TripDTO> createTripWithHttpInfo(@jakarta.annotation.Nonnull TripDTO tripDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/trips/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTrip(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deleteTrip</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/trips/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTripWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



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
   * @param tripCodeContains  (optional)
   * @param tripCodeDoesNotContain  (optional)
   * @param tripCodeEquals  (optional)
   * @param tripCodeNotEquals  (optional)
   * @param tripCodeSpecified  (optional)
   * @param tripCodeIn  (optional)
   * @param tripCodeNotIn  (optional)
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
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param vehicleIdGreaterThan  (optional)
   * @param vehicleIdLessThan  (optional)
   * @param vehicleIdGreaterThanOrEqual  (optional)
   * @param vehicleIdLessThanOrEqual  (optional)
   * @param vehicleIdEquals  (optional)
   * @param vehicleIdNotEquals  (optional)
   * @param vehicleIdSpecified  (optional)
   * @param vehicleIdIn  (optional)
   * @param vehicleIdNotIn  (optional)
   * @param slotIdGreaterThan  (optional)
   * @param slotIdLessThan  (optional)
   * @param slotIdGreaterThanOrEqual  (optional)
   * @param slotIdLessThanOrEqual  (optional)
   * @param slotIdEquals  (optional)
   * @param slotIdNotEquals  (optional)
   * @param slotIdSpecified  (optional)
   * @param slotIdIn  (optional)
   * @param slotIdNotIn  (optional)
   * @param driverIdGreaterThan  (optional)
   * @param driverIdLessThan  (optional)
   * @param driverIdGreaterThanOrEqual  (optional)
   * @param driverIdLessThanOrEqual  (optional)
   * @param driverIdEquals  (optional)
   * @param driverIdNotEquals  (optional)
   * @param driverIdSpecified  (optional)
   * @param driverIdIn  (optional)
   * @param driverIdNotIn  (optional)
   * @param attendantIdGreaterThan  (optional)
   * @param attendantIdLessThan  (optional)
   * @param attendantIdGreaterThanOrEqual  (optional)
   * @param attendantIdLessThanOrEqual  (optional)
   * @param attendantIdEquals  (optional)
   * @param attendantIdNotEquals  (optional)
   * @param attendantIdSpecified  (optional)
   * @param attendantIdIn  (optional)
   * @param attendantIdNotIn  (optional)
   * @param vehicleTypeEquals  (optional)
   * @param vehicleTypeNotEquals  (optional)
   * @param vehicleTypeSpecified  (optional)
   * @param vehicleTypeIn  (optional)
   * @param vehicleTypeNotIn  (optional)
   * @param routeCodeContains  (optional)
   * @param routeCodeDoesNotContain  (optional)
   * @param routeCodeEquals  (optional)
   * @param routeCodeNotEquals  (optional)
   * @param routeCodeSpecified  (optional)
   * @param routeCodeIn  (optional)
   * @param routeCodeNotIn  (optional)
   * @param originDistrictCodeContains  (optional)
   * @param originDistrictCodeDoesNotContain  (optional)
   * @param originDistrictCodeEquals  (optional)
   * @param originDistrictCodeNotEquals  (optional)
   * @param originDistrictCodeSpecified  (optional)
   * @param originDistrictCodeIn  (optional)
   * @param originDistrictCodeNotIn  (optional)
   * @param originProvinceCodeContains  (optional)
   * @param originProvinceCodeDoesNotContain  (optional)
   * @param originProvinceCodeEquals  (optional)
   * @param originProvinceCodeNotEquals  (optional)
   * @param originProvinceCodeSpecified  (optional)
   * @param originProvinceCodeIn  (optional)
   * @param originProvinceCodeNotIn  (optional)
   * @param destinationDistrictCodeContains  (optional)
   * @param destinationDistrictCodeDoesNotContain  (optional)
   * @param destinationDistrictCodeEquals  (optional)
   * @param destinationDistrictCodeNotEquals  (optional)
   * @param destinationDistrictCodeSpecified  (optional)
   * @param destinationDistrictCodeIn  (optional)
   * @param destinationDistrictCodeNotIn  (optional)
   * @param destinationProvinceCodeContains  (optional)
   * @param destinationProvinceCodeDoesNotContain  (optional)
   * @param destinationProvinceCodeEquals  (optional)
   * @param destinationProvinceCodeNotEquals  (optional)
   * @param destinationProvinceCodeSpecified  (optional)
   * @param destinationProvinceCodeIn  (optional)
   * @param destinationProvinceCodeNotIn  (optional)
   * @param vehiclePlateNumberContains  (optional)
   * @param vehiclePlateNumberDoesNotContain  (optional)
   * @param vehiclePlateNumberEquals  (optional)
   * @param vehiclePlateNumberNotEquals  (optional)
   * @param vehiclePlateNumberSpecified  (optional)
   * @param vehiclePlateNumberIn  (optional)
   * @param vehiclePlateNumberNotIn  (optional)
   * @param distinct  (optional)
   * @param page Zero-based page index (0..N) (optional, default to 0)
   * @param size The size of the page to be returned (optional, default to 20)
   * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return List&lt;TripDTO&gt;
   */
  @RequestLine("GET /api/trips?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&tripCode.contains={tripCodeContains}&tripCode.doesNotContain={tripCodeDoesNotContain}&tripCode.equals={tripCodeEquals}&tripCode.notEquals={tripCodeNotEquals}&tripCode.specified={tripCodeSpecified}&tripCode.in={tripCodeIn}&tripCode.notIn={tripCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleId.greaterThan={vehicleIdGreaterThan}&vehicleId.lessThan={vehicleIdLessThan}&vehicleId.greaterThanOrEqual={vehicleIdGreaterThanOrEqual}&vehicleId.lessThanOrEqual={vehicleIdLessThanOrEqual}&vehicleId.equals={vehicleIdEquals}&vehicleId.notEquals={vehicleIdNotEquals}&vehicleId.specified={vehicleIdSpecified}&vehicleId.in={vehicleIdIn}&vehicleId.notIn={vehicleIdNotIn}&slotId.greaterThan={slotIdGreaterThan}&slotId.lessThan={slotIdLessThan}&slotId.greaterThanOrEqual={slotIdGreaterThanOrEqual}&slotId.lessThanOrEqual={slotIdLessThanOrEqual}&slotId.equals={slotIdEquals}&slotId.notEquals={slotIdNotEquals}&slotId.specified={slotIdSpecified}&slotId.in={slotIdIn}&slotId.notIn={slotIdNotIn}&driverId.greaterThan={driverIdGreaterThan}&driverId.lessThan={driverIdLessThan}&driverId.greaterThanOrEqual={driverIdGreaterThanOrEqual}&driverId.lessThanOrEqual={driverIdLessThanOrEqual}&driverId.equals={driverIdEquals}&driverId.notEquals={driverIdNotEquals}&driverId.specified={driverIdSpecified}&driverId.in={driverIdIn}&driverId.notIn={driverIdNotIn}&attendantId.greaterThan={attendantIdGreaterThan}&attendantId.lessThan={attendantIdLessThan}&attendantId.greaterThanOrEqual={attendantIdGreaterThanOrEqual}&attendantId.lessThanOrEqual={attendantIdLessThanOrEqual}&attendantId.equals={attendantIdEquals}&attendantId.notEquals={attendantIdNotEquals}&attendantId.specified={attendantIdSpecified}&attendantId.in={attendantIdIn}&attendantId.notIn={attendantIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&originDistrictCode.contains={originDistrictCodeContains}&originDistrictCode.doesNotContain={originDistrictCodeDoesNotContain}&originDistrictCode.equals={originDistrictCodeEquals}&originDistrictCode.notEquals={originDistrictCodeNotEquals}&originDistrictCode.specified={originDistrictCodeSpecified}&originDistrictCode.in={originDistrictCodeIn}&originDistrictCode.notIn={originDistrictCodeNotIn}&originProvinceCode.contains={originProvinceCodeContains}&originProvinceCode.doesNotContain={originProvinceCodeDoesNotContain}&originProvinceCode.equals={originProvinceCodeEquals}&originProvinceCode.notEquals={originProvinceCodeNotEquals}&originProvinceCode.specified={originProvinceCodeSpecified}&originProvinceCode.in={originProvinceCodeIn}&originProvinceCode.notIn={originProvinceCodeNotIn}&destinationDistrictCode.contains={destinationDistrictCodeContains}&destinationDistrictCode.doesNotContain={destinationDistrictCodeDoesNotContain}&destinationDistrictCode.equals={destinationDistrictCodeEquals}&destinationDistrictCode.notEquals={destinationDistrictCodeNotEquals}&destinationDistrictCode.specified={destinationDistrictCodeSpecified}&destinationDistrictCode.in={destinationDistrictCodeIn}&destinationDistrictCode.notIn={destinationDistrictCodeNotIn}&destinationProvinceCode.contains={destinationProvinceCodeContains}&destinationProvinceCode.doesNotContain={destinationProvinceCodeDoesNotContain}&destinationProvinceCode.equals={destinationProvinceCodeEquals}&destinationProvinceCode.notEquals={destinationProvinceCodeNotEquals}&destinationProvinceCode.specified={destinationProvinceCodeSpecified}&destinationProvinceCode.in={destinationProvinceCodeIn}&destinationProvinceCode.notIn={destinationProvinceCodeNotIn}&vehiclePlateNumber.contains={vehiclePlateNumberContains}&vehiclePlateNumber.doesNotContain={vehiclePlateNumberDoesNotContain}&vehiclePlateNumber.equals={vehiclePlateNumberEquals}&vehiclePlateNumber.notEquals={vehiclePlateNumberNotEquals}&vehiclePlateNumber.specified={vehiclePlateNumberSpecified}&vehiclePlateNumber.in={vehiclePlateNumberIn}&vehiclePlateNumber.notIn={vehiclePlateNumberNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  List<TripDTO> getAllTrips(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("tripCodeContains") @jakarta.annotation.Nullable String tripCodeContains, @Param("tripCodeDoesNotContain") @jakarta.annotation.Nullable String tripCodeDoesNotContain, @Param("tripCodeEquals") @jakarta.annotation.Nullable String tripCodeEquals, @Param("tripCodeNotEquals") @jakarta.annotation.Nullable String tripCodeNotEquals, @Param("tripCodeSpecified") @jakarta.annotation.Nullable Boolean tripCodeSpecified, @Param("tripCodeIn") @jakarta.annotation.Nullable List<String> tripCodeIn, @Param("tripCodeNotIn") @jakarta.annotation.Nullable List<String> tripCodeNotIn, @Param("departureTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThan, @Param("departureTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThan, @Param("departureTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThanOrEqual, @Param("departureTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThanOrEqual, @Param("departureTimeEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeEquals, @Param("departureTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeNotEquals, @Param("departureTimeSpecified") @jakarta.annotation.Nullable Boolean departureTimeSpecified, @Param("departureTimeIn") @jakarta.annotation.Nullable List<OffsetDateTime> departureTimeIn, @Param("departureTimeNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> departureTimeNotIn, @Param("arrivalTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThan, @Param("arrivalTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThan, @Param("arrivalTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThanOrEqual, @Param("arrivalTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThanOrEqual, @Param("arrivalTimeEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeEquals, @Param("arrivalTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeNotEquals, @Param("arrivalTimeSpecified") @jakarta.annotation.Nullable Boolean arrivalTimeSpecified, @Param("arrivalTimeIn") @jakarta.annotation.Nullable List<OffsetDateTime> arrivalTimeIn, @Param("arrivalTimeNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> arrivalTimeNotIn, @Param("occasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThan, @Param("occasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThan, @Param("occasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThanOrEqual, @Param("occasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThanOrEqual, @Param("occasionFactorEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorEquals, @Param("occasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorNotEquals, @Param("occasionFactorSpecified") @jakarta.annotation.Nullable Boolean occasionFactorSpecified, @Param("occasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorIn, @Param("occasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("vehicleIdGreaterThan") @jakarta.annotation.Nullable Long vehicleIdGreaterThan, @Param("vehicleIdLessThan") @jakarta.annotation.Nullable Long vehicleIdLessThan, @Param("vehicleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long vehicleIdGreaterThanOrEqual, @Param("vehicleIdLessThanOrEqual") @jakarta.annotation.Nullable Long vehicleIdLessThanOrEqual, @Param("vehicleIdEquals") @jakarta.annotation.Nullable Long vehicleIdEquals, @Param("vehicleIdNotEquals") @jakarta.annotation.Nullable Long vehicleIdNotEquals, @Param("vehicleIdSpecified") @jakarta.annotation.Nullable Boolean vehicleIdSpecified, @Param("vehicleIdIn") @jakarta.annotation.Nullable List<Long> vehicleIdIn, @Param("vehicleIdNotIn") @jakarta.annotation.Nullable List<Long> vehicleIdNotIn, @Param("slotIdGreaterThan") @jakarta.annotation.Nullable Long slotIdGreaterThan, @Param("slotIdLessThan") @jakarta.annotation.Nullable Long slotIdLessThan, @Param("slotIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long slotIdGreaterThanOrEqual, @Param("slotIdLessThanOrEqual") @jakarta.annotation.Nullable Long slotIdLessThanOrEqual, @Param("slotIdEquals") @jakarta.annotation.Nullable Long slotIdEquals, @Param("slotIdNotEquals") @jakarta.annotation.Nullable Long slotIdNotEquals, @Param("slotIdSpecified") @jakarta.annotation.Nullable Boolean slotIdSpecified, @Param("slotIdIn") @jakarta.annotation.Nullable List<Long> slotIdIn, @Param("slotIdNotIn") @jakarta.annotation.Nullable List<Long> slotIdNotIn, @Param("driverIdGreaterThan") @jakarta.annotation.Nullable Long driverIdGreaterThan, @Param("driverIdLessThan") @jakarta.annotation.Nullable Long driverIdLessThan, @Param("driverIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long driverIdGreaterThanOrEqual, @Param("driverIdLessThanOrEqual") @jakarta.annotation.Nullable Long driverIdLessThanOrEqual, @Param("driverIdEquals") @jakarta.annotation.Nullable Long driverIdEquals, @Param("driverIdNotEquals") @jakarta.annotation.Nullable Long driverIdNotEquals, @Param("driverIdSpecified") @jakarta.annotation.Nullable Boolean driverIdSpecified, @Param("driverIdIn") @jakarta.annotation.Nullable List<Long> driverIdIn, @Param("driverIdNotIn") @jakarta.annotation.Nullable List<Long> driverIdNotIn, @Param("attendantIdGreaterThan") @jakarta.annotation.Nullable Long attendantIdGreaterThan, @Param("attendantIdLessThan") @jakarta.annotation.Nullable Long attendantIdLessThan, @Param("attendantIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long attendantIdGreaterThanOrEqual, @Param("attendantIdLessThanOrEqual") @jakarta.annotation.Nullable Long attendantIdLessThanOrEqual, @Param("attendantIdEquals") @jakarta.annotation.Nullable Long attendantIdEquals, @Param("attendantIdNotEquals") @jakarta.annotation.Nullable Long attendantIdNotEquals, @Param("attendantIdSpecified") @jakarta.annotation.Nullable Boolean attendantIdSpecified, @Param("attendantIdIn") @jakarta.annotation.Nullable List<Long> attendantIdIn, @Param("attendantIdNotIn") @jakarta.annotation.Nullable List<Long> attendantIdNotIn, @Param("vehicleTypeEquals") @jakarta.annotation.Nullable String vehicleTypeEquals, @Param("vehicleTypeNotEquals") @jakarta.annotation.Nullable String vehicleTypeNotEquals, @Param("vehicleTypeSpecified") @jakarta.annotation.Nullable Boolean vehicleTypeSpecified, @Param("vehicleTypeIn") @jakarta.annotation.Nullable List<String> vehicleTypeIn, @Param("vehicleTypeNotIn") @jakarta.annotation.Nullable List<String> vehicleTypeNotIn, @Param("routeCodeContains") @jakarta.annotation.Nullable String routeCodeContains, @Param("routeCodeDoesNotContain") @jakarta.annotation.Nullable String routeCodeDoesNotContain, @Param("routeCodeEquals") @jakarta.annotation.Nullable String routeCodeEquals, @Param("routeCodeNotEquals") @jakarta.annotation.Nullable String routeCodeNotEquals, @Param("routeCodeSpecified") @jakarta.annotation.Nullable Boolean routeCodeSpecified, @Param("routeCodeIn") @jakarta.annotation.Nullable List<String> routeCodeIn, @Param("routeCodeNotIn") @jakarta.annotation.Nullable List<String> routeCodeNotIn, @Param("originDistrictCodeContains") @jakarta.annotation.Nullable String originDistrictCodeContains, @Param("originDistrictCodeDoesNotContain") @jakarta.annotation.Nullable String originDistrictCodeDoesNotContain, @Param("originDistrictCodeEquals") @jakarta.annotation.Nullable String originDistrictCodeEquals, @Param("originDistrictCodeNotEquals") @jakarta.annotation.Nullable String originDistrictCodeNotEquals, @Param("originDistrictCodeSpecified") @jakarta.annotation.Nullable Boolean originDistrictCodeSpecified, @Param("originDistrictCodeIn") @jakarta.annotation.Nullable List<String> originDistrictCodeIn, @Param("originDistrictCodeNotIn") @jakarta.annotation.Nullable List<String> originDistrictCodeNotIn, @Param("originProvinceCodeContains") @jakarta.annotation.Nullable String originProvinceCodeContains, @Param("originProvinceCodeDoesNotContain") @jakarta.annotation.Nullable String originProvinceCodeDoesNotContain, @Param("originProvinceCodeEquals") @jakarta.annotation.Nullable String originProvinceCodeEquals, @Param("originProvinceCodeNotEquals") @jakarta.annotation.Nullable String originProvinceCodeNotEquals, @Param("originProvinceCodeSpecified") @jakarta.annotation.Nullable Boolean originProvinceCodeSpecified, @Param("originProvinceCodeIn") @jakarta.annotation.Nullable List<String> originProvinceCodeIn, @Param("originProvinceCodeNotIn") @jakarta.annotation.Nullable List<String> originProvinceCodeNotIn, @Param("destinationDistrictCodeContains") @jakarta.annotation.Nullable String destinationDistrictCodeContains, @Param("destinationDistrictCodeDoesNotContain") @jakarta.annotation.Nullable String destinationDistrictCodeDoesNotContain, @Param("destinationDistrictCodeEquals") @jakarta.annotation.Nullable String destinationDistrictCodeEquals, @Param("destinationDistrictCodeNotEquals") @jakarta.annotation.Nullable String destinationDistrictCodeNotEquals, @Param("destinationDistrictCodeSpecified") @jakarta.annotation.Nullable Boolean destinationDistrictCodeSpecified, @Param("destinationDistrictCodeIn") @jakarta.annotation.Nullable List<String> destinationDistrictCodeIn, @Param("destinationDistrictCodeNotIn") @jakarta.annotation.Nullable List<String> destinationDistrictCodeNotIn, @Param("destinationProvinceCodeContains") @jakarta.annotation.Nullable String destinationProvinceCodeContains, @Param("destinationProvinceCodeDoesNotContain") @jakarta.annotation.Nullable String destinationProvinceCodeDoesNotContain, @Param("destinationProvinceCodeEquals") @jakarta.annotation.Nullable String destinationProvinceCodeEquals, @Param("destinationProvinceCodeNotEquals") @jakarta.annotation.Nullable String destinationProvinceCodeNotEquals, @Param("destinationProvinceCodeSpecified") @jakarta.annotation.Nullable Boolean destinationProvinceCodeSpecified, @Param("destinationProvinceCodeIn") @jakarta.annotation.Nullable List<String> destinationProvinceCodeIn, @Param("destinationProvinceCodeNotIn") @jakarta.annotation.Nullable List<String> destinationProvinceCodeNotIn, @Param("vehiclePlateNumberContains") @jakarta.annotation.Nullable String vehiclePlateNumberContains, @Param("vehiclePlateNumberDoesNotContain") @jakarta.annotation.Nullable String vehiclePlateNumberDoesNotContain, @Param("vehiclePlateNumberEquals") @jakarta.annotation.Nullable String vehiclePlateNumberEquals, @Param("vehiclePlateNumberNotEquals") @jakarta.annotation.Nullable String vehiclePlateNumberNotEquals, @Param("vehiclePlateNumberSpecified") @jakarta.annotation.Nullable Boolean vehiclePlateNumberSpecified, @Param("vehiclePlateNumberIn") @jakarta.annotation.Nullable List<String> vehiclePlateNumberIn, @Param("vehiclePlateNumberNotIn") @jakarta.annotation.Nullable List<String> vehiclePlateNumberNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);

  /**
   * 
   * Similar to <code>getAllTrips</code> but it also returns the http response headers .
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
   * @param tripCodeContains  (optional)
   * @param tripCodeDoesNotContain  (optional)
   * @param tripCodeEquals  (optional)
   * @param tripCodeNotEquals  (optional)
   * @param tripCodeSpecified  (optional)
   * @param tripCodeIn  (optional)
   * @param tripCodeNotIn  (optional)
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
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param vehicleIdGreaterThan  (optional)
   * @param vehicleIdLessThan  (optional)
   * @param vehicleIdGreaterThanOrEqual  (optional)
   * @param vehicleIdLessThanOrEqual  (optional)
   * @param vehicleIdEquals  (optional)
   * @param vehicleIdNotEquals  (optional)
   * @param vehicleIdSpecified  (optional)
   * @param vehicleIdIn  (optional)
   * @param vehicleIdNotIn  (optional)
   * @param slotIdGreaterThan  (optional)
   * @param slotIdLessThan  (optional)
   * @param slotIdGreaterThanOrEqual  (optional)
   * @param slotIdLessThanOrEqual  (optional)
   * @param slotIdEquals  (optional)
   * @param slotIdNotEquals  (optional)
   * @param slotIdSpecified  (optional)
   * @param slotIdIn  (optional)
   * @param slotIdNotIn  (optional)
   * @param driverIdGreaterThan  (optional)
   * @param driverIdLessThan  (optional)
   * @param driverIdGreaterThanOrEqual  (optional)
   * @param driverIdLessThanOrEqual  (optional)
   * @param driverIdEquals  (optional)
   * @param driverIdNotEquals  (optional)
   * @param driverIdSpecified  (optional)
   * @param driverIdIn  (optional)
   * @param driverIdNotIn  (optional)
   * @param attendantIdGreaterThan  (optional)
   * @param attendantIdLessThan  (optional)
   * @param attendantIdGreaterThanOrEqual  (optional)
   * @param attendantIdLessThanOrEqual  (optional)
   * @param attendantIdEquals  (optional)
   * @param attendantIdNotEquals  (optional)
   * @param attendantIdSpecified  (optional)
   * @param attendantIdIn  (optional)
   * @param attendantIdNotIn  (optional)
   * @param vehicleTypeEquals  (optional)
   * @param vehicleTypeNotEquals  (optional)
   * @param vehicleTypeSpecified  (optional)
   * @param vehicleTypeIn  (optional)
   * @param vehicleTypeNotIn  (optional)
   * @param routeCodeContains  (optional)
   * @param routeCodeDoesNotContain  (optional)
   * @param routeCodeEquals  (optional)
   * @param routeCodeNotEquals  (optional)
   * @param routeCodeSpecified  (optional)
   * @param routeCodeIn  (optional)
   * @param routeCodeNotIn  (optional)
   * @param originDistrictCodeContains  (optional)
   * @param originDistrictCodeDoesNotContain  (optional)
   * @param originDistrictCodeEquals  (optional)
   * @param originDistrictCodeNotEquals  (optional)
   * @param originDistrictCodeSpecified  (optional)
   * @param originDistrictCodeIn  (optional)
   * @param originDistrictCodeNotIn  (optional)
   * @param originProvinceCodeContains  (optional)
   * @param originProvinceCodeDoesNotContain  (optional)
   * @param originProvinceCodeEquals  (optional)
   * @param originProvinceCodeNotEquals  (optional)
   * @param originProvinceCodeSpecified  (optional)
   * @param originProvinceCodeIn  (optional)
   * @param originProvinceCodeNotIn  (optional)
   * @param destinationDistrictCodeContains  (optional)
   * @param destinationDistrictCodeDoesNotContain  (optional)
   * @param destinationDistrictCodeEquals  (optional)
   * @param destinationDistrictCodeNotEquals  (optional)
   * @param destinationDistrictCodeSpecified  (optional)
   * @param destinationDistrictCodeIn  (optional)
   * @param destinationDistrictCodeNotIn  (optional)
   * @param destinationProvinceCodeContains  (optional)
   * @param destinationProvinceCodeDoesNotContain  (optional)
   * @param destinationProvinceCodeEquals  (optional)
   * @param destinationProvinceCodeNotEquals  (optional)
   * @param destinationProvinceCodeSpecified  (optional)
   * @param destinationProvinceCodeIn  (optional)
   * @param destinationProvinceCodeNotIn  (optional)
   * @param vehiclePlateNumberContains  (optional)
   * @param vehiclePlateNumberDoesNotContain  (optional)
   * @param vehiclePlateNumberEquals  (optional)
   * @param vehiclePlateNumberNotEquals  (optional)
   * @param vehiclePlateNumberSpecified  (optional)
   * @param vehiclePlateNumberIn  (optional)
   * @param vehiclePlateNumberNotIn  (optional)
   * @param distinct  (optional)
   * @param page Zero-based page index (0..N) (optional, default to 0)
   * @param size The size of the page to be returned (optional, default to 20)
   * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/trips?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&tripCode.contains={tripCodeContains}&tripCode.doesNotContain={tripCodeDoesNotContain}&tripCode.equals={tripCodeEquals}&tripCode.notEquals={tripCodeNotEquals}&tripCode.specified={tripCodeSpecified}&tripCode.in={tripCodeIn}&tripCode.notIn={tripCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleId.greaterThan={vehicleIdGreaterThan}&vehicleId.lessThan={vehicleIdLessThan}&vehicleId.greaterThanOrEqual={vehicleIdGreaterThanOrEqual}&vehicleId.lessThanOrEqual={vehicleIdLessThanOrEqual}&vehicleId.equals={vehicleIdEquals}&vehicleId.notEquals={vehicleIdNotEquals}&vehicleId.specified={vehicleIdSpecified}&vehicleId.in={vehicleIdIn}&vehicleId.notIn={vehicleIdNotIn}&slotId.greaterThan={slotIdGreaterThan}&slotId.lessThan={slotIdLessThan}&slotId.greaterThanOrEqual={slotIdGreaterThanOrEqual}&slotId.lessThanOrEqual={slotIdLessThanOrEqual}&slotId.equals={slotIdEquals}&slotId.notEquals={slotIdNotEquals}&slotId.specified={slotIdSpecified}&slotId.in={slotIdIn}&slotId.notIn={slotIdNotIn}&driverId.greaterThan={driverIdGreaterThan}&driverId.lessThan={driverIdLessThan}&driverId.greaterThanOrEqual={driverIdGreaterThanOrEqual}&driverId.lessThanOrEqual={driverIdLessThanOrEqual}&driverId.equals={driverIdEquals}&driverId.notEquals={driverIdNotEquals}&driverId.specified={driverIdSpecified}&driverId.in={driverIdIn}&driverId.notIn={driverIdNotIn}&attendantId.greaterThan={attendantIdGreaterThan}&attendantId.lessThan={attendantIdLessThan}&attendantId.greaterThanOrEqual={attendantIdGreaterThanOrEqual}&attendantId.lessThanOrEqual={attendantIdLessThanOrEqual}&attendantId.equals={attendantIdEquals}&attendantId.notEquals={attendantIdNotEquals}&attendantId.specified={attendantIdSpecified}&attendantId.in={attendantIdIn}&attendantId.notIn={attendantIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&originDistrictCode.contains={originDistrictCodeContains}&originDistrictCode.doesNotContain={originDistrictCodeDoesNotContain}&originDistrictCode.equals={originDistrictCodeEquals}&originDistrictCode.notEquals={originDistrictCodeNotEquals}&originDistrictCode.specified={originDistrictCodeSpecified}&originDistrictCode.in={originDistrictCodeIn}&originDistrictCode.notIn={originDistrictCodeNotIn}&originProvinceCode.contains={originProvinceCodeContains}&originProvinceCode.doesNotContain={originProvinceCodeDoesNotContain}&originProvinceCode.equals={originProvinceCodeEquals}&originProvinceCode.notEquals={originProvinceCodeNotEquals}&originProvinceCode.specified={originProvinceCodeSpecified}&originProvinceCode.in={originProvinceCodeIn}&originProvinceCode.notIn={originProvinceCodeNotIn}&destinationDistrictCode.contains={destinationDistrictCodeContains}&destinationDistrictCode.doesNotContain={destinationDistrictCodeDoesNotContain}&destinationDistrictCode.equals={destinationDistrictCodeEquals}&destinationDistrictCode.notEquals={destinationDistrictCodeNotEquals}&destinationDistrictCode.specified={destinationDistrictCodeSpecified}&destinationDistrictCode.in={destinationDistrictCodeIn}&destinationDistrictCode.notIn={destinationDistrictCodeNotIn}&destinationProvinceCode.contains={destinationProvinceCodeContains}&destinationProvinceCode.doesNotContain={destinationProvinceCodeDoesNotContain}&destinationProvinceCode.equals={destinationProvinceCodeEquals}&destinationProvinceCode.notEquals={destinationProvinceCodeNotEquals}&destinationProvinceCode.specified={destinationProvinceCodeSpecified}&destinationProvinceCode.in={destinationProvinceCodeIn}&destinationProvinceCode.notIn={destinationProvinceCodeNotIn}&vehiclePlateNumber.contains={vehiclePlateNumberContains}&vehiclePlateNumber.doesNotContain={vehiclePlateNumberDoesNotContain}&vehiclePlateNumber.equals={vehiclePlateNumberEquals}&vehiclePlateNumber.notEquals={vehiclePlateNumberNotEquals}&vehiclePlateNumber.specified={vehiclePlateNumberSpecified}&vehiclePlateNumber.in={vehiclePlateNumberIn}&vehiclePlateNumber.notIn={vehiclePlateNumberNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<TripDTO>> getAllTripsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("tripCodeContains") @jakarta.annotation.Nullable String tripCodeContains, @Param("tripCodeDoesNotContain") @jakarta.annotation.Nullable String tripCodeDoesNotContain, @Param("tripCodeEquals") @jakarta.annotation.Nullable String tripCodeEquals, @Param("tripCodeNotEquals") @jakarta.annotation.Nullable String tripCodeNotEquals, @Param("tripCodeSpecified") @jakarta.annotation.Nullable Boolean tripCodeSpecified, @Param("tripCodeIn") @jakarta.annotation.Nullable List<String> tripCodeIn, @Param("tripCodeNotIn") @jakarta.annotation.Nullable List<String> tripCodeNotIn, @Param("departureTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThan, @Param("departureTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThan, @Param("departureTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThanOrEqual, @Param("departureTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThanOrEqual, @Param("departureTimeEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeEquals, @Param("departureTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeNotEquals, @Param("departureTimeSpecified") @jakarta.annotation.Nullable Boolean departureTimeSpecified, @Param("departureTimeIn") @jakarta.annotation.Nullable List<OffsetDateTime> departureTimeIn, @Param("departureTimeNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> departureTimeNotIn, @Param("arrivalTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThan, @Param("arrivalTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThan, @Param("arrivalTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThanOrEqual, @Param("arrivalTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThanOrEqual, @Param("arrivalTimeEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeEquals, @Param("arrivalTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeNotEquals, @Param("arrivalTimeSpecified") @jakarta.annotation.Nullable Boolean arrivalTimeSpecified, @Param("arrivalTimeIn") @jakarta.annotation.Nullable List<OffsetDateTime> arrivalTimeIn, @Param("arrivalTimeNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> arrivalTimeNotIn, @Param("occasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThan, @Param("occasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThan, @Param("occasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThanOrEqual, @Param("occasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThanOrEqual, @Param("occasionFactorEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorEquals, @Param("occasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorNotEquals, @Param("occasionFactorSpecified") @jakarta.annotation.Nullable Boolean occasionFactorSpecified, @Param("occasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorIn, @Param("occasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("vehicleIdGreaterThan") @jakarta.annotation.Nullable Long vehicleIdGreaterThan, @Param("vehicleIdLessThan") @jakarta.annotation.Nullable Long vehicleIdLessThan, @Param("vehicleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long vehicleIdGreaterThanOrEqual, @Param("vehicleIdLessThanOrEqual") @jakarta.annotation.Nullable Long vehicleIdLessThanOrEqual, @Param("vehicleIdEquals") @jakarta.annotation.Nullable Long vehicleIdEquals, @Param("vehicleIdNotEquals") @jakarta.annotation.Nullable Long vehicleIdNotEquals, @Param("vehicleIdSpecified") @jakarta.annotation.Nullable Boolean vehicleIdSpecified, @Param("vehicleIdIn") @jakarta.annotation.Nullable List<Long> vehicleIdIn, @Param("vehicleIdNotIn") @jakarta.annotation.Nullable List<Long> vehicleIdNotIn, @Param("slotIdGreaterThan") @jakarta.annotation.Nullable Long slotIdGreaterThan, @Param("slotIdLessThan") @jakarta.annotation.Nullable Long slotIdLessThan, @Param("slotIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long slotIdGreaterThanOrEqual, @Param("slotIdLessThanOrEqual") @jakarta.annotation.Nullable Long slotIdLessThanOrEqual, @Param("slotIdEquals") @jakarta.annotation.Nullable Long slotIdEquals, @Param("slotIdNotEquals") @jakarta.annotation.Nullable Long slotIdNotEquals, @Param("slotIdSpecified") @jakarta.annotation.Nullable Boolean slotIdSpecified, @Param("slotIdIn") @jakarta.annotation.Nullable List<Long> slotIdIn, @Param("slotIdNotIn") @jakarta.annotation.Nullable List<Long> slotIdNotIn, @Param("driverIdGreaterThan") @jakarta.annotation.Nullable Long driverIdGreaterThan, @Param("driverIdLessThan") @jakarta.annotation.Nullable Long driverIdLessThan, @Param("driverIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long driverIdGreaterThanOrEqual, @Param("driverIdLessThanOrEqual") @jakarta.annotation.Nullable Long driverIdLessThanOrEqual, @Param("driverIdEquals") @jakarta.annotation.Nullable Long driverIdEquals, @Param("driverIdNotEquals") @jakarta.annotation.Nullable Long driverIdNotEquals, @Param("driverIdSpecified") @jakarta.annotation.Nullable Boolean driverIdSpecified, @Param("driverIdIn") @jakarta.annotation.Nullable List<Long> driverIdIn, @Param("driverIdNotIn") @jakarta.annotation.Nullable List<Long> driverIdNotIn, @Param("attendantIdGreaterThan") @jakarta.annotation.Nullable Long attendantIdGreaterThan, @Param("attendantIdLessThan") @jakarta.annotation.Nullable Long attendantIdLessThan, @Param("attendantIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long attendantIdGreaterThanOrEqual, @Param("attendantIdLessThanOrEqual") @jakarta.annotation.Nullable Long attendantIdLessThanOrEqual, @Param("attendantIdEquals") @jakarta.annotation.Nullable Long attendantIdEquals, @Param("attendantIdNotEquals") @jakarta.annotation.Nullable Long attendantIdNotEquals, @Param("attendantIdSpecified") @jakarta.annotation.Nullable Boolean attendantIdSpecified, @Param("attendantIdIn") @jakarta.annotation.Nullable List<Long> attendantIdIn, @Param("attendantIdNotIn") @jakarta.annotation.Nullable List<Long> attendantIdNotIn, @Param("vehicleTypeEquals") @jakarta.annotation.Nullable String vehicleTypeEquals, @Param("vehicleTypeNotEquals") @jakarta.annotation.Nullable String vehicleTypeNotEquals, @Param("vehicleTypeSpecified") @jakarta.annotation.Nullable Boolean vehicleTypeSpecified, @Param("vehicleTypeIn") @jakarta.annotation.Nullable List<String> vehicleTypeIn, @Param("vehicleTypeNotIn") @jakarta.annotation.Nullable List<String> vehicleTypeNotIn, @Param("routeCodeContains") @jakarta.annotation.Nullable String routeCodeContains, @Param("routeCodeDoesNotContain") @jakarta.annotation.Nullable String routeCodeDoesNotContain, @Param("routeCodeEquals") @jakarta.annotation.Nullable String routeCodeEquals, @Param("routeCodeNotEquals") @jakarta.annotation.Nullable String routeCodeNotEquals, @Param("routeCodeSpecified") @jakarta.annotation.Nullable Boolean routeCodeSpecified, @Param("routeCodeIn") @jakarta.annotation.Nullable List<String> routeCodeIn, @Param("routeCodeNotIn") @jakarta.annotation.Nullable List<String> routeCodeNotIn, @Param("originDistrictCodeContains") @jakarta.annotation.Nullable String originDistrictCodeContains, @Param("originDistrictCodeDoesNotContain") @jakarta.annotation.Nullable String originDistrictCodeDoesNotContain, @Param("originDistrictCodeEquals") @jakarta.annotation.Nullable String originDistrictCodeEquals, @Param("originDistrictCodeNotEquals") @jakarta.annotation.Nullable String originDistrictCodeNotEquals, @Param("originDistrictCodeSpecified") @jakarta.annotation.Nullable Boolean originDistrictCodeSpecified, @Param("originDistrictCodeIn") @jakarta.annotation.Nullable List<String> originDistrictCodeIn, @Param("originDistrictCodeNotIn") @jakarta.annotation.Nullable List<String> originDistrictCodeNotIn, @Param("originProvinceCodeContains") @jakarta.annotation.Nullable String originProvinceCodeContains, @Param("originProvinceCodeDoesNotContain") @jakarta.annotation.Nullable String originProvinceCodeDoesNotContain, @Param("originProvinceCodeEquals") @jakarta.annotation.Nullable String originProvinceCodeEquals, @Param("originProvinceCodeNotEquals") @jakarta.annotation.Nullable String originProvinceCodeNotEquals, @Param("originProvinceCodeSpecified") @jakarta.annotation.Nullable Boolean originProvinceCodeSpecified, @Param("originProvinceCodeIn") @jakarta.annotation.Nullable List<String> originProvinceCodeIn, @Param("originProvinceCodeNotIn") @jakarta.annotation.Nullable List<String> originProvinceCodeNotIn, @Param("destinationDistrictCodeContains") @jakarta.annotation.Nullable String destinationDistrictCodeContains, @Param("destinationDistrictCodeDoesNotContain") @jakarta.annotation.Nullable String destinationDistrictCodeDoesNotContain, @Param("destinationDistrictCodeEquals") @jakarta.annotation.Nullable String destinationDistrictCodeEquals, @Param("destinationDistrictCodeNotEquals") @jakarta.annotation.Nullable String destinationDistrictCodeNotEquals, @Param("destinationDistrictCodeSpecified") @jakarta.annotation.Nullable Boolean destinationDistrictCodeSpecified, @Param("destinationDistrictCodeIn") @jakarta.annotation.Nullable List<String> destinationDistrictCodeIn, @Param("destinationDistrictCodeNotIn") @jakarta.annotation.Nullable List<String> destinationDistrictCodeNotIn, @Param("destinationProvinceCodeContains") @jakarta.annotation.Nullable String destinationProvinceCodeContains, @Param("destinationProvinceCodeDoesNotContain") @jakarta.annotation.Nullable String destinationProvinceCodeDoesNotContain, @Param("destinationProvinceCodeEquals") @jakarta.annotation.Nullable String destinationProvinceCodeEquals, @Param("destinationProvinceCodeNotEquals") @jakarta.annotation.Nullable String destinationProvinceCodeNotEquals, @Param("destinationProvinceCodeSpecified") @jakarta.annotation.Nullable Boolean destinationProvinceCodeSpecified, @Param("destinationProvinceCodeIn") @jakarta.annotation.Nullable List<String> destinationProvinceCodeIn, @Param("destinationProvinceCodeNotIn") @jakarta.annotation.Nullable List<String> destinationProvinceCodeNotIn, @Param("vehiclePlateNumberContains") @jakarta.annotation.Nullable String vehiclePlateNumberContains, @Param("vehiclePlateNumberDoesNotContain") @jakarta.annotation.Nullable String vehiclePlateNumberDoesNotContain, @Param("vehiclePlateNumberEquals") @jakarta.annotation.Nullable String vehiclePlateNumberEquals, @Param("vehiclePlateNumberNotEquals") @jakarta.annotation.Nullable String vehiclePlateNumberNotEquals, @Param("vehiclePlateNumberSpecified") @jakarta.annotation.Nullable Boolean vehiclePlateNumberSpecified, @Param("vehiclePlateNumberIn") @jakarta.annotation.Nullable List<String> vehiclePlateNumberIn, @Param("vehiclePlateNumberNotIn") @jakarta.annotation.Nullable List<String> vehiclePlateNumberNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllTrips</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllTripsQueryParams} class that allows for
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
   *   <li>tripCodeContains -  (optional)</li>
   *   <li>tripCodeDoesNotContain -  (optional)</li>
   *   <li>tripCodeEquals -  (optional)</li>
   *   <li>tripCodeNotEquals -  (optional)</li>
   *   <li>tripCodeSpecified -  (optional)</li>
   *   <li>tripCodeIn -  (optional)</li>
   *   <li>tripCodeNotIn -  (optional)</li>
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
   *   <li>routeIdGreaterThan -  (optional)</li>
   *   <li>routeIdLessThan -  (optional)</li>
   *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
   *   <li>routeIdLessThanOrEqual -  (optional)</li>
   *   <li>routeIdEquals -  (optional)</li>
   *   <li>routeIdNotEquals -  (optional)</li>
   *   <li>routeIdSpecified -  (optional)</li>
   *   <li>routeIdIn -  (optional)</li>
   *   <li>routeIdNotIn -  (optional)</li>
   *   <li>vehicleIdGreaterThan -  (optional)</li>
   *   <li>vehicleIdLessThan -  (optional)</li>
   *   <li>vehicleIdGreaterThanOrEqual -  (optional)</li>
   *   <li>vehicleIdLessThanOrEqual -  (optional)</li>
   *   <li>vehicleIdEquals -  (optional)</li>
   *   <li>vehicleIdNotEquals -  (optional)</li>
   *   <li>vehicleIdSpecified -  (optional)</li>
   *   <li>vehicleIdIn -  (optional)</li>
   *   <li>vehicleIdNotIn -  (optional)</li>
   *   <li>slotIdGreaterThan -  (optional)</li>
   *   <li>slotIdLessThan -  (optional)</li>
   *   <li>slotIdGreaterThanOrEqual -  (optional)</li>
   *   <li>slotIdLessThanOrEqual -  (optional)</li>
   *   <li>slotIdEquals -  (optional)</li>
   *   <li>slotIdNotEquals -  (optional)</li>
   *   <li>slotIdSpecified -  (optional)</li>
   *   <li>slotIdIn -  (optional)</li>
   *   <li>slotIdNotIn -  (optional)</li>
   *   <li>driverIdGreaterThan -  (optional)</li>
   *   <li>driverIdLessThan -  (optional)</li>
   *   <li>driverIdGreaterThanOrEqual -  (optional)</li>
   *   <li>driverIdLessThanOrEqual -  (optional)</li>
   *   <li>driverIdEquals -  (optional)</li>
   *   <li>driverIdNotEquals -  (optional)</li>
   *   <li>driverIdSpecified -  (optional)</li>
   *   <li>driverIdIn -  (optional)</li>
   *   <li>driverIdNotIn -  (optional)</li>
   *   <li>attendantIdGreaterThan -  (optional)</li>
   *   <li>attendantIdLessThan -  (optional)</li>
   *   <li>attendantIdGreaterThanOrEqual -  (optional)</li>
   *   <li>attendantIdLessThanOrEqual -  (optional)</li>
   *   <li>attendantIdEquals -  (optional)</li>
   *   <li>attendantIdNotEquals -  (optional)</li>
   *   <li>attendantIdSpecified -  (optional)</li>
   *   <li>attendantIdIn -  (optional)</li>
   *   <li>attendantIdNotIn -  (optional)</li>
   *   <li>vehicleTypeEquals -  (optional)</li>
   *   <li>vehicleTypeNotEquals -  (optional)</li>
   *   <li>vehicleTypeSpecified -  (optional)</li>
   *   <li>vehicleTypeIn -  (optional)</li>
   *   <li>vehicleTypeNotIn -  (optional)</li>
   *   <li>routeCodeContains -  (optional)</li>
   *   <li>routeCodeDoesNotContain -  (optional)</li>
   *   <li>routeCodeEquals -  (optional)</li>
   *   <li>routeCodeNotEquals -  (optional)</li>
   *   <li>routeCodeSpecified -  (optional)</li>
   *   <li>routeCodeIn -  (optional)</li>
   *   <li>routeCodeNotIn -  (optional)</li>
   *   <li>originDistrictCodeContains -  (optional)</li>
   *   <li>originDistrictCodeDoesNotContain -  (optional)</li>
   *   <li>originDistrictCodeEquals -  (optional)</li>
   *   <li>originDistrictCodeNotEquals -  (optional)</li>
   *   <li>originDistrictCodeSpecified -  (optional)</li>
   *   <li>originDistrictCodeIn -  (optional)</li>
   *   <li>originDistrictCodeNotIn -  (optional)</li>
   *   <li>originProvinceCodeContains -  (optional)</li>
   *   <li>originProvinceCodeDoesNotContain -  (optional)</li>
   *   <li>originProvinceCodeEquals -  (optional)</li>
   *   <li>originProvinceCodeNotEquals -  (optional)</li>
   *   <li>originProvinceCodeSpecified -  (optional)</li>
   *   <li>originProvinceCodeIn -  (optional)</li>
   *   <li>originProvinceCodeNotIn -  (optional)</li>
   *   <li>destinationDistrictCodeContains -  (optional)</li>
   *   <li>destinationDistrictCodeDoesNotContain -  (optional)</li>
   *   <li>destinationDistrictCodeEquals -  (optional)</li>
   *   <li>destinationDistrictCodeNotEquals -  (optional)</li>
   *   <li>destinationDistrictCodeSpecified -  (optional)</li>
   *   <li>destinationDistrictCodeIn -  (optional)</li>
   *   <li>destinationDistrictCodeNotIn -  (optional)</li>
   *   <li>destinationProvinceCodeContains -  (optional)</li>
   *   <li>destinationProvinceCodeDoesNotContain -  (optional)</li>
   *   <li>destinationProvinceCodeEquals -  (optional)</li>
   *   <li>destinationProvinceCodeNotEquals -  (optional)</li>
   *   <li>destinationProvinceCodeSpecified -  (optional)</li>
   *   <li>destinationProvinceCodeIn -  (optional)</li>
   *   <li>destinationProvinceCodeNotIn -  (optional)</li>
   *   <li>vehiclePlateNumberContains -  (optional)</li>
   *   <li>vehiclePlateNumberDoesNotContain -  (optional)</li>
   *   <li>vehiclePlateNumberEquals -  (optional)</li>
   *   <li>vehiclePlateNumberNotEquals -  (optional)</li>
   *   <li>vehiclePlateNumberSpecified -  (optional)</li>
   *   <li>vehiclePlateNumberIn -  (optional)</li>
   *   <li>vehiclePlateNumberNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   <li>page - Zero-based page index (0..N) (optional, default to 0)</li>
   *   <li>size - The size of the page to be returned (optional, default to 20)</li>
   *   <li>sort - Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
   *   </ul>
   * @return List&lt;TripDTO&gt;
   */
  @RequestLine("GET /api/trips?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&tripCode.contains={tripCodeContains}&tripCode.doesNotContain={tripCodeDoesNotContain}&tripCode.equals={tripCodeEquals}&tripCode.notEquals={tripCodeNotEquals}&tripCode.specified={tripCodeSpecified}&tripCode.in={tripCodeIn}&tripCode.notIn={tripCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleId.greaterThan={vehicleIdGreaterThan}&vehicleId.lessThan={vehicleIdLessThan}&vehicleId.greaterThanOrEqual={vehicleIdGreaterThanOrEqual}&vehicleId.lessThanOrEqual={vehicleIdLessThanOrEqual}&vehicleId.equals={vehicleIdEquals}&vehicleId.notEquals={vehicleIdNotEquals}&vehicleId.specified={vehicleIdSpecified}&vehicleId.in={vehicleIdIn}&vehicleId.notIn={vehicleIdNotIn}&slotId.greaterThan={slotIdGreaterThan}&slotId.lessThan={slotIdLessThan}&slotId.greaterThanOrEqual={slotIdGreaterThanOrEqual}&slotId.lessThanOrEqual={slotIdLessThanOrEqual}&slotId.equals={slotIdEquals}&slotId.notEquals={slotIdNotEquals}&slotId.specified={slotIdSpecified}&slotId.in={slotIdIn}&slotId.notIn={slotIdNotIn}&driverId.greaterThan={driverIdGreaterThan}&driverId.lessThan={driverIdLessThan}&driverId.greaterThanOrEqual={driverIdGreaterThanOrEqual}&driverId.lessThanOrEqual={driverIdLessThanOrEqual}&driverId.equals={driverIdEquals}&driverId.notEquals={driverIdNotEquals}&driverId.specified={driverIdSpecified}&driverId.in={driverIdIn}&driverId.notIn={driverIdNotIn}&attendantId.greaterThan={attendantIdGreaterThan}&attendantId.lessThan={attendantIdLessThan}&attendantId.greaterThanOrEqual={attendantIdGreaterThanOrEqual}&attendantId.lessThanOrEqual={attendantIdLessThanOrEqual}&attendantId.equals={attendantIdEquals}&attendantId.notEquals={attendantIdNotEquals}&attendantId.specified={attendantIdSpecified}&attendantId.in={attendantIdIn}&attendantId.notIn={attendantIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&originDistrictCode.contains={originDistrictCodeContains}&originDistrictCode.doesNotContain={originDistrictCodeDoesNotContain}&originDistrictCode.equals={originDistrictCodeEquals}&originDistrictCode.notEquals={originDistrictCodeNotEquals}&originDistrictCode.specified={originDistrictCodeSpecified}&originDistrictCode.in={originDistrictCodeIn}&originDistrictCode.notIn={originDistrictCodeNotIn}&originProvinceCode.contains={originProvinceCodeContains}&originProvinceCode.doesNotContain={originProvinceCodeDoesNotContain}&originProvinceCode.equals={originProvinceCodeEquals}&originProvinceCode.notEquals={originProvinceCodeNotEquals}&originProvinceCode.specified={originProvinceCodeSpecified}&originProvinceCode.in={originProvinceCodeIn}&originProvinceCode.notIn={originProvinceCodeNotIn}&destinationDistrictCode.contains={destinationDistrictCodeContains}&destinationDistrictCode.doesNotContain={destinationDistrictCodeDoesNotContain}&destinationDistrictCode.equals={destinationDistrictCodeEquals}&destinationDistrictCode.notEquals={destinationDistrictCodeNotEquals}&destinationDistrictCode.specified={destinationDistrictCodeSpecified}&destinationDistrictCode.in={destinationDistrictCodeIn}&destinationDistrictCode.notIn={destinationDistrictCodeNotIn}&destinationProvinceCode.contains={destinationProvinceCodeContains}&destinationProvinceCode.doesNotContain={destinationProvinceCodeDoesNotContain}&destinationProvinceCode.equals={destinationProvinceCodeEquals}&destinationProvinceCode.notEquals={destinationProvinceCodeNotEquals}&destinationProvinceCode.specified={destinationProvinceCodeSpecified}&destinationProvinceCode.in={destinationProvinceCodeIn}&destinationProvinceCode.notIn={destinationProvinceCodeNotIn}&vehiclePlateNumber.contains={vehiclePlateNumberContains}&vehiclePlateNumber.doesNotContain={vehiclePlateNumberDoesNotContain}&vehiclePlateNumber.equals={vehiclePlateNumberEquals}&vehiclePlateNumber.notEquals={vehiclePlateNumberNotEquals}&vehiclePlateNumber.specified={vehiclePlateNumberSpecified}&vehiclePlateNumber.in={vehiclePlateNumberIn}&vehiclePlateNumber.notIn={vehiclePlateNumberNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
  "Accept: */*",
  })
  List<TripDTO> getAllTrips(@QueryMap(encoded=true) GetAllTripsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllTrips</code> that receives the query parameters as a map,
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
          *   <li>tripCodeContains -  (optional)</li>
          *   <li>tripCodeDoesNotContain -  (optional)</li>
          *   <li>tripCodeEquals -  (optional)</li>
          *   <li>tripCodeNotEquals -  (optional)</li>
          *   <li>tripCodeSpecified -  (optional)</li>
          *   <li>tripCodeIn -  (optional)</li>
          *   <li>tripCodeNotIn -  (optional)</li>
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
          *   <li>routeIdGreaterThan -  (optional)</li>
          *   <li>routeIdLessThan -  (optional)</li>
          *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
          *   <li>routeIdLessThanOrEqual -  (optional)</li>
          *   <li>routeIdEquals -  (optional)</li>
          *   <li>routeIdNotEquals -  (optional)</li>
          *   <li>routeIdSpecified -  (optional)</li>
          *   <li>routeIdIn -  (optional)</li>
          *   <li>routeIdNotIn -  (optional)</li>
          *   <li>vehicleIdGreaterThan -  (optional)</li>
          *   <li>vehicleIdLessThan -  (optional)</li>
          *   <li>vehicleIdGreaterThanOrEqual -  (optional)</li>
          *   <li>vehicleIdLessThanOrEqual -  (optional)</li>
          *   <li>vehicleIdEquals -  (optional)</li>
          *   <li>vehicleIdNotEquals -  (optional)</li>
          *   <li>vehicleIdSpecified -  (optional)</li>
          *   <li>vehicleIdIn -  (optional)</li>
          *   <li>vehicleIdNotIn -  (optional)</li>
          *   <li>slotIdGreaterThan -  (optional)</li>
          *   <li>slotIdLessThan -  (optional)</li>
          *   <li>slotIdGreaterThanOrEqual -  (optional)</li>
          *   <li>slotIdLessThanOrEqual -  (optional)</li>
          *   <li>slotIdEquals -  (optional)</li>
          *   <li>slotIdNotEquals -  (optional)</li>
          *   <li>slotIdSpecified -  (optional)</li>
          *   <li>slotIdIn -  (optional)</li>
          *   <li>slotIdNotIn -  (optional)</li>
          *   <li>driverIdGreaterThan -  (optional)</li>
          *   <li>driverIdLessThan -  (optional)</li>
          *   <li>driverIdGreaterThanOrEqual -  (optional)</li>
          *   <li>driverIdLessThanOrEqual -  (optional)</li>
          *   <li>driverIdEquals -  (optional)</li>
          *   <li>driverIdNotEquals -  (optional)</li>
          *   <li>driverIdSpecified -  (optional)</li>
          *   <li>driverIdIn -  (optional)</li>
          *   <li>driverIdNotIn -  (optional)</li>
          *   <li>attendantIdGreaterThan -  (optional)</li>
          *   <li>attendantIdLessThan -  (optional)</li>
          *   <li>attendantIdGreaterThanOrEqual -  (optional)</li>
          *   <li>attendantIdLessThanOrEqual -  (optional)</li>
          *   <li>attendantIdEquals -  (optional)</li>
          *   <li>attendantIdNotEquals -  (optional)</li>
          *   <li>attendantIdSpecified -  (optional)</li>
          *   <li>attendantIdIn -  (optional)</li>
          *   <li>attendantIdNotIn -  (optional)</li>
          *   <li>vehicleTypeEquals -  (optional)</li>
          *   <li>vehicleTypeNotEquals -  (optional)</li>
          *   <li>vehicleTypeSpecified -  (optional)</li>
          *   <li>vehicleTypeIn -  (optional)</li>
          *   <li>vehicleTypeNotIn -  (optional)</li>
          *   <li>routeCodeContains -  (optional)</li>
          *   <li>routeCodeDoesNotContain -  (optional)</li>
          *   <li>routeCodeEquals -  (optional)</li>
          *   <li>routeCodeNotEquals -  (optional)</li>
          *   <li>routeCodeSpecified -  (optional)</li>
          *   <li>routeCodeIn -  (optional)</li>
          *   <li>routeCodeNotIn -  (optional)</li>
          *   <li>originDistrictCodeContains -  (optional)</li>
          *   <li>originDistrictCodeDoesNotContain -  (optional)</li>
          *   <li>originDistrictCodeEquals -  (optional)</li>
          *   <li>originDistrictCodeNotEquals -  (optional)</li>
          *   <li>originDistrictCodeSpecified -  (optional)</li>
          *   <li>originDistrictCodeIn -  (optional)</li>
          *   <li>originDistrictCodeNotIn -  (optional)</li>
          *   <li>originProvinceCodeContains -  (optional)</li>
          *   <li>originProvinceCodeDoesNotContain -  (optional)</li>
          *   <li>originProvinceCodeEquals -  (optional)</li>
          *   <li>originProvinceCodeNotEquals -  (optional)</li>
          *   <li>originProvinceCodeSpecified -  (optional)</li>
          *   <li>originProvinceCodeIn -  (optional)</li>
          *   <li>originProvinceCodeNotIn -  (optional)</li>
          *   <li>destinationDistrictCodeContains -  (optional)</li>
          *   <li>destinationDistrictCodeDoesNotContain -  (optional)</li>
          *   <li>destinationDistrictCodeEquals -  (optional)</li>
          *   <li>destinationDistrictCodeNotEquals -  (optional)</li>
          *   <li>destinationDistrictCodeSpecified -  (optional)</li>
          *   <li>destinationDistrictCodeIn -  (optional)</li>
          *   <li>destinationDistrictCodeNotIn -  (optional)</li>
          *   <li>destinationProvinceCodeContains -  (optional)</li>
          *   <li>destinationProvinceCodeDoesNotContain -  (optional)</li>
          *   <li>destinationProvinceCodeEquals -  (optional)</li>
          *   <li>destinationProvinceCodeNotEquals -  (optional)</li>
          *   <li>destinationProvinceCodeSpecified -  (optional)</li>
          *   <li>destinationProvinceCodeIn -  (optional)</li>
          *   <li>destinationProvinceCodeNotIn -  (optional)</li>
          *   <li>vehiclePlateNumberContains -  (optional)</li>
          *   <li>vehiclePlateNumberDoesNotContain -  (optional)</li>
          *   <li>vehiclePlateNumberEquals -  (optional)</li>
          *   <li>vehiclePlateNumberNotEquals -  (optional)</li>
          *   <li>vehiclePlateNumberSpecified -  (optional)</li>
          *   <li>vehiclePlateNumberIn -  (optional)</li>
          *   <li>vehiclePlateNumberNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
          *   <li>page - Zero-based page index (0..N) (optional, default to 0)</li>
          *   <li>size - The size of the page to be returned (optional, default to 20)</li>
          *   <li>sort - Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
      *   </ul>
          * @return List&lt;TripDTO&gt;
      */
      @RequestLine("GET /api/trips?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&tripCode.contains={tripCodeContains}&tripCode.doesNotContain={tripCodeDoesNotContain}&tripCode.equals={tripCodeEquals}&tripCode.notEquals={tripCodeNotEquals}&tripCode.specified={tripCodeSpecified}&tripCode.in={tripCodeIn}&tripCode.notIn={tripCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleId.greaterThan={vehicleIdGreaterThan}&vehicleId.lessThan={vehicleIdLessThan}&vehicleId.greaterThanOrEqual={vehicleIdGreaterThanOrEqual}&vehicleId.lessThanOrEqual={vehicleIdLessThanOrEqual}&vehicleId.equals={vehicleIdEquals}&vehicleId.notEquals={vehicleIdNotEquals}&vehicleId.specified={vehicleIdSpecified}&vehicleId.in={vehicleIdIn}&vehicleId.notIn={vehicleIdNotIn}&slotId.greaterThan={slotIdGreaterThan}&slotId.lessThan={slotIdLessThan}&slotId.greaterThanOrEqual={slotIdGreaterThanOrEqual}&slotId.lessThanOrEqual={slotIdLessThanOrEqual}&slotId.equals={slotIdEquals}&slotId.notEquals={slotIdNotEquals}&slotId.specified={slotIdSpecified}&slotId.in={slotIdIn}&slotId.notIn={slotIdNotIn}&driverId.greaterThan={driverIdGreaterThan}&driverId.lessThan={driverIdLessThan}&driverId.greaterThanOrEqual={driverIdGreaterThanOrEqual}&driverId.lessThanOrEqual={driverIdLessThanOrEqual}&driverId.equals={driverIdEquals}&driverId.notEquals={driverIdNotEquals}&driverId.specified={driverIdSpecified}&driverId.in={driverIdIn}&driverId.notIn={driverIdNotIn}&attendantId.greaterThan={attendantIdGreaterThan}&attendantId.lessThan={attendantIdLessThan}&attendantId.greaterThanOrEqual={attendantIdGreaterThanOrEqual}&attendantId.lessThanOrEqual={attendantIdLessThanOrEqual}&attendantId.equals={attendantIdEquals}&attendantId.notEquals={attendantIdNotEquals}&attendantId.specified={attendantIdSpecified}&attendantId.in={attendantIdIn}&attendantId.notIn={attendantIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&originDistrictCode.contains={originDistrictCodeContains}&originDistrictCode.doesNotContain={originDistrictCodeDoesNotContain}&originDistrictCode.equals={originDistrictCodeEquals}&originDistrictCode.notEquals={originDistrictCodeNotEquals}&originDistrictCode.specified={originDistrictCodeSpecified}&originDistrictCode.in={originDistrictCodeIn}&originDistrictCode.notIn={originDistrictCodeNotIn}&originProvinceCode.contains={originProvinceCodeContains}&originProvinceCode.doesNotContain={originProvinceCodeDoesNotContain}&originProvinceCode.equals={originProvinceCodeEquals}&originProvinceCode.notEquals={originProvinceCodeNotEquals}&originProvinceCode.specified={originProvinceCodeSpecified}&originProvinceCode.in={originProvinceCodeIn}&originProvinceCode.notIn={originProvinceCodeNotIn}&destinationDistrictCode.contains={destinationDistrictCodeContains}&destinationDistrictCode.doesNotContain={destinationDistrictCodeDoesNotContain}&destinationDistrictCode.equals={destinationDistrictCodeEquals}&destinationDistrictCode.notEquals={destinationDistrictCodeNotEquals}&destinationDistrictCode.specified={destinationDistrictCodeSpecified}&destinationDistrictCode.in={destinationDistrictCodeIn}&destinationDistrictCode.notIn={destinationDistrictCodeNotIn}&destinationProvinceCode.contains={destinationProvinceCodeContains}&destinationProvinceCode.doesNotContain={destinationProvinceCodeDoesNotContain}&destinationProvinceCode.equals={destinationProvinceCodeEquals}&destinationProvinceCode.notEquals={destinationProvinceCodeNotEquals}&destinationProvinceCode.specified={destinationProvinceCodeSpecified}&destinationProvinceCode.in={destinationProvinceCodeIn}&destinationProvinceCode.notIn={destinationProvinceCodeNotIn}&vehiclePlateNumber.contains={vehiclePlateNumberContains}&vehiclePlateNumber.doesNotContain={vehiclePlateNumberDoesNotContain}&vehiclePlateNumber.equals={vehiclePlateNumberEquals}&vehiclePlateNumber.notEquals={vehiclePlateNumberNotEquals}&vehiclePlateNumber.specified={vehiclePlateNumberSpecified}&vehiclePlateNumber.in={vehiclePlateNumberIn}&vehiclePlateNumber.notIn={vehiclePlateNumberNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<TripDTO>> getAllTripsWithHttpInfo(@QueryMap(encoded=true) GetAllTripsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllTrips</code> method in a fluent style.
   */
  public static class GetAllTripsQueryParams extends HashMap<String, Object> {
    public GetAllTripsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams tripCodeContains(@jakarta.annotation.Nullable final String value) {
      put("tripCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams tripCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("tripCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams tripCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("tripCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams tripCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("tripCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams tripCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("tripCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams tripCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("tripCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams tripCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("tripCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams departureTimeGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams departureTimeLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams departureTimeGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams departureTimeLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams departureTimeEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams departureTimeNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams departureTimeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("departureTime.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams departureTimeIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("departureTime.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams departureTimeNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("departureTime.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams arrivalTimeGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams arrivalTimeLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams arrivalTimeGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams arrivalTimeLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams arrivalTimeEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams arrivalTimeNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams arrivalTimeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("arrivalTime.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams arrivalTimeIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("arrivalTime.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams arrivalTimeNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("arrivalTime.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams occasionFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams occasionFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams occasionFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams occasionFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams occasionFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams occasionFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams occasionFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occasionFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams occasionFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occasionFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams occasionFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occasionFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams routeIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams routeIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams routeIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams routeIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams routeIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams routeIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams routeIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("routeId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams routeIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams routeIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams vehicleIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams vehicleIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams vehicleIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams vehicleIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams vehicleIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams vehicleIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams vehicleIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehicleId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams vehicleIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("vehicleId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams vehicleIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("vehicleId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams slotIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("slotId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams slotIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("slotId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams slotIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("slotId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams slotIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("slotId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams slotIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("slotId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams slotIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("slotId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams slotIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("slotId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams slotIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("slotId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams slotIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("slotId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams driverIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("driverId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams driverIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("driverId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams driverIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("driverId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams driverIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("driverId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams driverIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("driverId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams driverIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("driverId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams driverIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("driverId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams driverIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("driverId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams driverIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("driverId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams attendantIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams attendantIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams attendantIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams attendantIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams attendantIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams attendantIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams attendantIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("attendantId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams attendantIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("attendantId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams attendantIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("attendantId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams vehicleTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("vehicleType.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams vehicleTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("vehicleType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams vehicleTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehicleType.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams vehicleTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehicleType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams vehicleTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehicleType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams routeCodeContains(@jakarta.annotation.Nullable final String value) {
      put("routeCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams routeCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("routeCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams routeCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("routeCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams routeCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("routeCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams routeCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("routeCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams routeCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("routeCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams routeCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("routeCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams originDistrictCodeContains(@jakarta.annotation.Nullable final String value) {
      put("originDistrictCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams originDistrictCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("originDistrictCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams originDistrictCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("originDistrictCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams originDistrictCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("originDistrictCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams originDistrictCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("originDistrictCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams originDistrictCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("originDistrictCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams originDistrictCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("originDistrictCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams originProvinceCodeContains(@jakarta.annotation.Nullable final String value) {
      put("originProvinceCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams originProvinceCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("originProvinceCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams originProvinceCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("originProvinceCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams originProvinceCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("originProvinceCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams originProvinceCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("originProvinceCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams originProvinceCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("originProvinceCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams originProvinceCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("originProvinceCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams destinationDistrictCodeContains(@jakarta.annotation.Nullable final String value) {
      put("destinationDistrictCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams destinationDistrictCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("destinationDistrictCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams destinationDistrictCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("destinationDistrictCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams destinationDistrictCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("destinationDistrictCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams destinationDistrictCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("destinationDistrictCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams destinationDistrictCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("destinationDistrictCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams destinationDistrictCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("destinationDistrictCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams destinationProvinceCodeContains(@jakarta.annotation.Nullable final String value) {
      put("destinationProvinceCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams destinationProvinceCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("destinationProvinceCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams destinationProvinceCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("destinationProvinceCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams destinationProvinceCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("destinationProvinceCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams destinationProvinceCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("destinationProvinceCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams destinationProvinceCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("destinationProvinceCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams destinationProvinceCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("destinationProvinceCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams vehiclePlateNumberContains(@jakarta.annotation.Nullable final String value) {
      put("vehiclePlateNumber.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams vehiclePlateNumberDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("vehiclePlateNumber.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams vehiclePlateNumberEquals(@jakarta.annotation.Nullable final String value) {
      put("vehiclePlateNumber.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams vehiclePlateNumberNotEquals(@jakarta.annotation.Nullable final String value) {
      put("vehiclePlateNumber.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams vehiclePlateNumberSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehiclePlateNumber.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams vehiclePlateNumberIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehiclePlateNumber.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams vehiclePlateNumberNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehiclePlateNumber.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams page(@jakarta.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams size(@jakarta.annotation.Nullable final Integer value) {
      put("size", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsQueryParams sort(@jakarta.annotation.Nullable final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

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
   * @param tripCodeContains  (optional)
   * @param tripCodeDoesNotContain  (optional)
   * @param tripCodeEquals  (optional)
   * @param tripCodeNotEquals  (optional)
   * @param tripCodeSpecified  (optional)
   * @param tripCodeIn  (optional)
   * @param tripCodeNotIn  (optional)
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
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param vehicleIdGreaterThan  (optional)
   * @param vehicleIdLessThan  (optional)
   * @param vehicleIdGreaterThanOrEqual  (optional)
   * @param vehicleIdLessThanOrEqual  (optional)
   * @param vehicleIdEquals  (optional)
   * @param vehicleIdNotEquals  (optional)
   * @param vehicleIdSpecified  (optional)
   * @param vehicleIdIn  (optional)
   * @param vehicleIdNotIn  (optional)
   * @param slotIdGreaterThan  (optional)
   * @param slotIdLessThan  (optional)
   * @param slotIdGreaterThanOrEqual  (optional)
   * @param slotIdLessThanOrEqual  (optional)
   * @param slotIdEquals  (optional)
   * @param slotIdNotEquals  (optional)
   * @param slotIdSpecified  (optional)
   * @param slotIdIn  (optional)
   * @param slotIdNotIn  (optional)
   * @param driverIdGreaterThan  (optional)
   * @param driverIdLessThan  (optional)
   * @param driverIdGreaterThanOrEqual  (optional)
   * @param driverIdLessThanOrEqual  (optional)
   * @param driverIdEquals  (optional)
   * @param driverIdNotEquals  (optional)
   * @param driverIdSpecified  (optional)
   * @param driverIdIn  (optional)
   * @param driverIdNotIn  (optional)
   * @param attendantIdGreaterThan  (optional)
   * @param attendantIdLessThan  (optional)
   * @param attendantIdGreaterThanOrEqual  (optional)
   * @param attendantIdLessThanOrEqual  (optional)
   * @param attendantIdEquals  (optional)
   * @param attendantIdNotEquals  (optional)
   * @param attendantIdSpecified  (optional)
   * @param attendantIdIn  (optional)
   * @param attendantIdNotIn  (optional)
   * @param vehicleTypeEquals  (optional)
   * @param vehicleTypeNotEquals  (optional)
   * @param vehicleTypeSpecified  (optional)
   * @param vehicleTypeIn  (optional)
   * @param vehicleTypeNotIn  (optional)
   * @param routeCodeContains  (optional)
   * @param routeCodeDoesNotContain  (optional)
   * @param routeCodeEquals  (optional)
   * @param routeCodeNotEquals  (optional)
   * @param routeCodeSpecified  (optional)
   * @param routeCodeIn  (optional)
   * @param routeCodeNotIn  (optional)
   * @param originDistrictCodeContains  (optional)
   * @param originDistrictCodeDoesNotContain  (optional)
   * @param originDistrictCodeEquals  (optional)
   * @param originDistrictCodeNotEquals  (optional)
   * @param originDistrictCodeSpecified  (optional)
   * @param originDistrictCodeIn  (optional)
   * @param originDistrictCodeNotIn  (optional)
   * @param originProvinceCodeContains  (optional)
   * @param originProvinceCodeDoesNotContain  (optional)
   * @param originProvinceCodeEquals  (optional)
   * @param originProvinceCodeNotEquals  (optional)
   * @param originProvinceCodeSpecified  (optional)
   * @param originProvinceCodeIn  (optional)
   * @param originProvinceCodeNotIn  (optional)
   * @param destinationDistrictCodeContains  (optional)
   * @param destinationDistrictCodeDoesNotContain  (optional)
   * @param destinationDistrictCodeEquals  (optional)
   * @param destinationDistrictCodeNotEquals  (optional)
   * @param destinationDistrictCodeSpecified  (optional)
   * @param destinationDistrictCodeIn  (optional)
   * @param destinationDistrictCodeNotIn  (optional)
   * @param destinationProvinceCodeContains  (optional)
   * @param destinationProvinceCodeDoesNotContain  (optional)
   * @param destinationProvinceCodeEquals  (optional)
   * @param destinationProvinceCodeNotEquals  (optional)
   * @param destinationProvinceCodeSpecified  (optional)
   * @param destinationProvinceCodeIn  (optional)
   * @param destinationProvinceCodeNotIn  (optional)
   * @param vehiclePlateNumberContains  (optional)
   * @param vehiclePlateNumberDoesNotContain  (optional)
   * @param vehiclePlateNumberEquals  (optional)
   * @param vehiclePlateNumberNotEquals  (optional)
   * @param vehiclePlateNumberSpecified  (optional)
   * @param vehiclePlateNumberIn  (optional)
   * @param vehiclePlateNumberNotIn  (optional)
   * @param distinct  (optional)
   * @param page Zero-based page index (0..N) (optional, default to 0)
   * @param size The size of the page to be returned (optional, default to 20)
   * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return List&lt;TripWithPricingDTO&gt;
   */
  @RequestLine("GET /api/trips/with-pricing?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&tripCode.contains={tripCodeContains}&tripCode.doesNotContain={tripCodeDoesNotContain}&tripCode.equals={tripCodeEquals}&tripCode.notEquals={tripCodeNotEquals}&tripCode.specified={tripCodeSpecified}&tripCode.in={tripCodeIn}&tripCode.notIn={tripCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleId.greaterThan={vehicleIdGreaterThan}&vehicleId.lessThan={vehicleIdLessThan}&vehicleId.greaterThanOrEqual={vehicleIdGreaterThanOrEqual}&vehicleId.lessThanOrEqual={vehicleIdLessThanOrEqual}&vehicleId.equals={vehicleIdEquals}&vehicleId.notEquals={vehicleIdNotEquals}&vehicleId.specified={vehicleIdSpecified}&vehicleId.in={vehicleIdIn}&vehicleId.notIn={vehicleIdNotIn}&slotId.greaterThan={slotIdGreaterThan}&slotId.lessThan={slotIdLessThan}&slotId.greaterThanOrEqual={slotIdGreaterThanOrEqual}&slotId.lessThanOrEqual={slotIdLessThanOrEqual}&slotId.equals={slotIdEquals}&slotId.notEquals={slotIdNotEquals}&slotId.specified={slotIdSpecified}&slotId.in={slotIdIn}&slotId.notIn={slotIdNotIn}&driverId.greaterThan={driverIdGreaterThan}&driverId.lessThan={driverIdLessThan}&driverId.greaterThanOrEqual={driverIdGreaterThanOrEqual}&driverId.lessThanOrEqual={driverIdLessThanOrEqual}&driverId.equals={driverIdEquals}&driverId.notEquals={driverIdNotEquals}&driverId.specified={driverIdSpecified}&driverId.in={driverIdIn}&driverId.notIn={driverIdNotIn}&attendantId.greaterThan={attendantIdGreaterThan}&attendantId.lessThan={attendantIdLessThan}&attendantId.greaterThanOrEqual={attendantIdGreaterThanOrEqual}&attendantId.lessThanOrEqual={attendantIdLessThanOrEqual}&attendantId.equals={attendantIdEquals}&attendantId.notEquals={attendantIdNotEquals}&attendantId.specified={attendantIdSpecified}&attendantId.in={attendantIdIn}&attendantId.notIn={attendantIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&originDistrictCode.contains={originDistrictCodeContains}&originDistrictCode.doesNotContain={originDistrictCodeDoesNotContain}&originDistrictCode.equals={originDistrictCodeEquals}&originDistrictCode.notEquals={originDistrictCodeNotEquals}&originDistrictCode.specified={originDistrictCodeSpecified}&originDistrictCode.in={originDistrictCodeIn}&originDistrictCode.notIn={originDistrictCodeNotIn}&originProvinceCode.contains={originProvinceCodeContains}&originProvinceCode.doesNotContain={originProvinceCodeDoesNotContain}&originProvinceCode.equals={originProvinceCodeEquals}&originProvinceCode.notEquals={originProvinceCodeNotEquals}&originProvinceCode.specified={originProvinceCodeSpecified}&originProvinceCode.in={originProvinceCodeIn}&originProvinceCode.notIn={originProvinceCodeNotIn}&destinationDistrictCode.contains={destinationDistrictCodeContains}&destinationDistrictCode.doesNotContain={destinationDistrictCodeDoesNotContain}&destinationDistrictCode.equals={destinationDistrictCodeEquals}&destinationDistrictCode.notEquals={destinationDistrictCodeNotEquals}&destinationDistrictCode.specified={destinationDistrictCodeSpecified}&destinationDistrictCode.in={destinationDistrictCodeIn}&destinationDistrictCode.notIn={destinationDistrictCodeNotIn}&destinationProvinceCode.contains={destinationProvinceCodeContains}&destinationProvinceCode.doesNotContain={destinationProvinceCodeDoesNotContain}&destinationProvinceCode.equals={destinationProvinceCodeEquals}&destinationProvinceCode.notEquals={destinationProvinceCodeNotEquals}&destinationProvinceCode.specified={destinationProvinceCodeSpecified}&destinationProvinceCode.in={destinationProvinceCodeIn}&destinationProvinceCode.notIn={destinationProvinceCodeNotIn}&vehiclePlateNumber.contains={vehiclePlateNumberContains}&vehiclePlateNumber.doesNotContain={vehiclePlateNumberDoesNotContain}&vehiclePlateNumber.equals={vehiclePlateNumberEquals}&vehiclePlateNumber.notEquals={vehiclePlateNumberNotEquals}&vehiclePlateNumber.specified={vehiclePlateNumberSpecified}&vehiclePlateNumber.in={vehiclePlateNumberIn}&vehiclePlateNumber.notIn={vehiclePlateNumberNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  List<TripWithPricingDTO> getAllTripsWithPricing(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("tripCodeContains") @jakarta.annotation.Nullable String tripCodeContains, @Param("tripCodeDoesNotContain") @jakarta.annotation.Nullable String tripCodeDoesNotContain, @Param("tripCodeEquals") @jakarta.annotation.Nullable String tripCodeEquals, @Param("tripCodeNotEquals") @jakarta.annotation.Nullable String tripCodeNotEquals, @Param("tripCodeSpecified") @jakarta.annotation.Nullable Boolean tripCodeSpecified, @Param("tripCodeIn") @jakarta.annotation.Nullable List<String> tripCodeIn, @Param("tripCodeNotIn") @jakarta.annotation.Nullable List<String> tripCodeNotIn, @Param("departureTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThan, @Param("departureTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThan, @Param("departureTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThanOrEqual, @Param("departureTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThanOrEqual, @Param("departureTimeEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeEquals, @Param("departureTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeNotEquals, @Param("departureTimeSpecified") @jakarta.annotation.Nullable Boolean departureTimeSpecified, @Param("departureTimeIn") @jakarta.annotation.Nullable List<OffsetDateTime> departureTimeIn, @Param("departureTimeNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> departureTimeNotIn, @Param("arrivalTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThan, @Param("arrivalTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThan, @Param("arrivalTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThanOrEqual, @Param("arrivalTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThanOrEqual, @Param("arrivalTimeEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeEquals, @Param("arrivalTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeNotEquals, @Param("arrivalTimeSpecified") @jakarta.annotation.Nullable Boolean arrivalTimeSpecified, @Param("arrivalTimeIn") @jakarta.annotation.Nullable List<OffsetDateTime> arrivalTimeIn, @Param("arrivalTimeNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> arrivalTimeNotIn, @Param("occasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThan, @Param("occasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThan, @Param("occasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThanOrEqual, @Param("occasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThanOrEqual, @Param("occasionFactorEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorEquals, @Param("occasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorNotEquals, @Param("occasionFactorSpecified") @jakarta.annotation.Nullable Boolean occasionFactorSpecified, @Param("occasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorIn, @Param("occasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("vehicleIdGreaterThan") @jakarta.annotation.Nullable Long vehicleIdGreaterThan, @Param("vehicleIdLessThan") @jakarta.annotation.Nullable Long vehicleIdLessThan, @Param("vehicleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long vehicleIdGreaterThanOrEqual, @Param("vehicleIdLessThanOrEqual") @jakarta.annotation.Nullable Long vehicleIdLessThanOrEqual, @Param("vehicleIdEquals") @jakarta.annotation.Nullable Long vehicleIdEquals, @Param("vehicleIdNotEquals") @jakarta.annotation.Nullable Long vehicleIdNotEquals, @Param("vehicleIdSpecified") @jakarta.annotation.Nullable Boolean vehicleIdSpecified, @Param("vehicleIdIn") @jakarta.annotation.Nullable List<Long> vehicleIdIn, @Param("vehicleIdNotIn") @jakarta.annotation.Nullable List<Long> vehicleIdNotIn, @Param("slotIdGreaterThan") @jakarta.annotation.Nullable Long slotIdGreaterThan, @Param("slotIdLessThan") @jakarta.annotation.Nullable Long slotIdLessThan, @Param("slotIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long slotIdGreaterThanOrEqual, @Param("slotIdLessThanOrEqual") @jakarta.annotation.Nullable Long slotIdLessThanOrEqual, @Param("slotIdEquals") @jakarta.annotation.Nullable Long slotIdEquals, @Param("slotIdNotEquals") @jakarta.annotation.Nullable Long slotIdNotEquals, @Param("slotIdSpecified") @jakarta.annotation.Nullable Boolean slotIdSpecified, @Param("slotIdIn") @jakarta.annotation.Nullable List<Long> slotIdIn, @Param("slotIdNotIn") @jakarta.annotation.Nullable List<Long> slotIdNotIn, @Param("driverIdGreaterThan") @jakarta.annotation.Nullable Long driverIdGreaterThan, @Param("driverIdLessThan") @jakarta.annotation.Nullable Long driverIdLessThan, @Param("driverIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long driverIdGreaterThanOrEqual, @Param("driverIdLessThanOrEqual") @jakarta.annotation.Nullable Long driverIdLessThanOrEqual, @Param("driverIdEquals") @jakarta.annotation.Nullable Long driverIdEquals, @Param("driverIdNotEquals") @jakarta.annotation.Nullable Long driverIdNotEquals, @Param("driverIdSpecified") @jakarta.annotation.Nullable Boolean driverIdSpecified, @Param("driverIdIn") @jakarta.annotation.Nullable List<Long> driverIdIn, @Param("driverIdNotIn") @jakarta.annotation.Nullable List<Long> driverIdNotIn, @Param("attendantIdGreaterThan") @jakarta.annotation.Nullable Long attendantIdGreaterThan, @Param("attendantIdLessThan") @jakarta.annotation.Nullable Long attendantIdLessThan, @Param("attendantIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long attendantIdGreaterThanOrEqual, @Param("attendantIdLessThanOrEqual") @jakarta.annotation.Nullable Long attendantIdLessThanOrEqual, @Param("attendantIdEquals") @jakarta.annotation.Nullable Long attendantIdEquals, @Param("attendantIdNotEquals") @jakarta.annotation.Nullable Long attendantIdNotEquals, @Param("attendantIdSpecified") @jakarta.annotation.Nullable Boolean attendantIdSpecified, @Param("attendantIdIn") @jakarta.annotation.Nullable List<Long> attendantIdIn, @Param("attendantIdNotIn") @jakarta.annotation.Nullable List<Long> attendantIdNotIn, @Param("vehicleTypeEquals") @jakarta.annotation.Nullable String vehicleTypeEquals, @Param("vehicleTypeNotEquals") @jakarta.annotation.Nullable String vehicleTypeNotEquals, @Param("vehicleTypeSpecified") @jakarta.annotation.Nullable Boolean vehicleTypeSpecified, @Param("vehicleTypeIn") @jakarta.annotation.Nullable List<String> vehicleTypeIn, @Param("vehicleTypeNotIn") @jakarta.annotation.Nullable List<String> vehicleTypeNotIn, @Param("routeCodeContains") @jakarta.annotation.Nullable String routeCodeContains, @Param("routeCodeDoesNotContain") @jakarta.annotation.Nullable String routeCodeDoesNotContain, @Param("routeCodeEquals") @jakarta.annotation.Nullable String routeCodeEquals, @Param("routeCodeNotEquals") @jakarta.annotation.Nullable String routeCodeNotEquals, @Param("routeCodeSpecified") @jakarta.annotation.Nullable Boolean routeCodeSpecified, @Param("routeCodeIn") @jakarta.annotation.Nullable List<String> routeCodeIn, @Param("routeCodeNotIn") @jakarta.annotation.Nullable List<String> routeCodeNotIn, @Param("originDistrictCodeContains") @jakarta.annotation.Nullable String originDistrictCodeContains, @Param("originDistrictCodeDoesNotContain") @jakarta.annotation.Nullable String originDistrictCodeDoesNotContain, @Param("originDistrictCodeEquals") @jakarta.annotation.Nullable String originDistrictCodeEquals, @Param("originDistrictCodeNotEquals") @jakarta.annotation.Nullable String originDistrictCodeNotEquals, @Param("originDistrictCodeSpecified") @jakarta.annotation.Nullable Boolean originDistrictCodeSpecified, @Param("originDistrictCodeIn") @jakarta.annotation.Nullable List<String> originDistrictCodeIn, @Param("originDistrictCodeNotIn") @jakarta.annotation.Nullable List<String> originDistrictCodeNotIn, @Param("originProvinceCodeContains") @jakarta.annotation.Nullable String originProvinceCodeContains, @Param("originProvinceCodeDoesNotContain") @jakarta.annotation.Nullable String originProvinceCodeDoesNotContain, @Param("originProvinceCodeEquals") @jakarta.annotation.Nullable String originProvinceCodeEquals, @Param("originProvinceCodeNotEquals") @jakarta.annotation.Nullable String originProvinceCodeNotEquals, @Param("originProvinceCodeSpecified") @jakarta.annotation.Nullable Boolean originProvinceCodeSpecified, @Param("originProvinceCodeIn") @jakarta.annotation.Nullable List<String> originProvinceCodeIn, @Param("originProvinceCodeNotIn") @jakarta.annotation.Nullable List<String> originProvinceCodeNotIn, @Param("destinationDistrictCodeContains") @jakarta.annotation.Nullable String destinationDistrictCodeContains, @Param("destinationDistrictCodeDoesNotContain") @jakarta.annotation.Nullable String destinationDistrictCodeDoesNotContain, @Param("destinationDistrictCodeEquals") @jakarta.annotation.Nullable String destinationDistrictCodeEquals, @Param("destinationDistrictCodeNotEquals") @jakarta.annotation.Nullable String destinationDistrictCodeNotEquals, @Param("destinationDistrictCodeSpecified") @jakarta.annotation.Nullable Boolean destinationDistrictCodeSpecified, @Param("destinationDistrictCodeIn") @jakarta.annotation.Nullable List<String> destinationDistrictCodeIn, @Param("destinationDistrictCodeNotIn") @jakarta.annotation.Nullable List<String> destinationDistrictCodeNotIn, @Param("destinationProvinceCodeContains") @jakarta.annotation.Nullable String destinationProvinceCodeContains, @Param("destinationProvinceCodeDoesNotContain") @jakarta.annotation.Nullable String destinationProvinceCodeDoesNotContain, @Param("destinationProvinceCodeEquals") @jakarta.annotation.Nullable String destinationProvinceCodeEquals, @Param("destinationProvinceCodeNotEquals") @jakarta.annotation.Nullable String destinationProvinceCodeNotEquals, @Param("destinationProvinceCodeSpecified") @jakarta.annotation.Nullable Boolean destinationProvinceCodeSpecified, @Param("destinationProvinceCodeIn") @jakarta.annotation.Nullable List<String> destinationProvinceCodeIn, @Param("destinationProvinceCodeNotIn") @jakarta.annotation.Nullable List<String> destinationProvinceCodeNotIn, @Param("vehiclePlateNumberContains") @jakarta.annotation.Nullable String vehiclePlateNumberContains, @Param("vehiclePlateNumberDoesNotContain") @jakarta.annotation.Nullable String vehiclePlateNumberDoesNotContain, @Param("vehiclePlateNumberEquals") @jakarta.annotation.Nullable String vehiclePlateNumberEquals, @Param("vehiclePlateNumberNotEquals") @jakarta.annotation.Nullable String vehiclePlateNumberNotEquals, @Param("vehiclePlateNumberSpecified") @jakarta.annotation.Nullable Boolean vehiclePlateNumberSpecified, @Param("vehiclePlateNumberIn") @jakarta.annotation.Nullable List<String> vehiclePlateNumberIn, @Param("vehiclePlateNumberNotIn") @jakarta.annotation.Nullable List<String> vehiclePlateNumberNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);

  /**
   * 
   * Similar to <code>getAllTripsWithPricing</code> but it also returns the http response headers .
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
   * @param tripCodeContains  (optional)
   * @param tripCodeDoesNotContain  (optional)
   * @param tripCodeEquals  (optional)
   * @param tripCodeNotEquals  (optional)
   * @param tripCodeSpecified  (optional)
   * @param tripCodeIn  (optional)
   * @param tripCodeNotIn  (optional)
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
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param vehicleIdGreaterThan  (optional)
   * @param vehicleIdLessThan  (optional)
   * @param vehicleIdGreaterThanOrEqual  (optional)
   * @param vehicleIdLessThanOrEqual  (optional)
   * @param vehicleIdEquals  (optional)
   * @param vehicleIdNotEquals  (optional)
   * @param vehicleIdSpecified  (optional)
   * @param vehicleIdIn  (optional)
   * @param vehicleIdNotIn  (optional)
   * @param slotIdGreaterThan  (optional)
   * @param slotIdLessThan  (optional)
   * @param slotIdGreaterThanOrEqual  (optional)
   * @param slotIdLessThanOrEqual  (optional)
   * @param slotIdEquals  (optional)
   * @param slotIdNotEquals  (optional)
   * @param slotIdSpecified  (optional)
   * @param slotIdIn  (optional)
   * @param slotIdNotIn  (optional)
   * @param driverIdGreaterThan  (optional)
   * @param driverIdLessThan  (optional)
   * @param driverIdGreaterThanOrEqual  (optional)
   * @param driverIdLessThanOrEqual  (optional)
   * @param driverIdEquals  (optional)
   * @param driverIdNotEquals  (optional)
   * @param driverIdSpecified  (optional)
   * @param driverIdIn  (optional)
   * @param driverIdNotIn  (optional)
   * @param attendantIdGreaterThan  (optional)
   * @param attendantIdLessThan  (optional)
   * @param attendantIdGreaterThanOrEqual  (optional)
   * @param attendantIdLessThanOrEqual  (optional)
   * @param attendantIdEquals  (optional)
   * @param attendantIdNotEquals  (optional)
   * @param attendantIdSpecified  (optional)
   * @param attendantIdIn  (optional)
   * @param attendantIdNotIn  (optional)
   * @param vehicleTypeEquals  (optional)
   * @param vehicleTypeNotEquals  (optional)
   * @param vehicleTypeSpecified  (optional)
   * @param vehicleTypeIn  (optional)
   * @param vehicleTypeNotIn  (optional)
   * @param routeCodeContains  (optional)
   * @param routeCodeDoesNotContain  (optional)
   * @param routeCodeEquals  (optional)
   * @param routeCodeNotEquals  (optional)
   * @param routeCodeSpecified  (optional)
   * @param routeCodeIn  (optional)
   * @param routeCodeNotIn  (optional)
   * @param originDistrictCodeContains  (optional)
   * @param originDistrictCodeDoesNotContain  (optional)
   * @param originDistrictCodeEquals  (optional)
   * @param originDistrictCodeNotEquals  (optional)
   * @param originDistrictCodeSpecified  (optional)
   * @param originDistrictCodeIn  (optional)
   * @param originDistrictCodeNotIn  (optional)
   * @param originProvinceCodeContains  (optional)
   * @param originProvinceCodeDoesNotContain  (optional)
   * @param originProvinceCodeEquals  (optional)
   * @param originProvinceCodeNotEquals  (optional)
   * @param originProvinceCodeSpecified  (optional)
   * @param originProvinceCodeIn  (optional)
   * @param originProvinceCodeNotIn  (optional)
   * @param destinationDistrictCodeContains  (optional)
   * @param destinationDistrictCodeDoesNotContain  (optional)
   * @param destinationDistrictCodeEquals  (optional)
   * @param destinationDistrictCodeNotEquals  (optional)
   * @param destinationDistrictCodeSpecified  (optional)
   * @param destinationDistrictCodeIn  (optional)
   * @param destinationDistrictCodeNotIn  (optional)
   * @param destinationProvinceCodeContains  (optional)
   * @param destinationProvinceCodeDoesNotContain  (optional)
   * @param destinationProvinceCodeEquals  (optional)
   * @param destinationProvinceCodeNotEquals  (optional)
   * @param destinationProvinceCodeSpecified  (optional)
   * @param destinationProvinceCodeIn  (optional)
   * @param destinationProvinceCodeNotIn  (optional)
   * @param vehiclePlateNumberContains  (optional)
   * @param vehiclePlateNumberDoesNotContain  (optional)
   * @param vehiclePlateNumberEquals  (optional)
   * @param vehiclePlateNumberNotEquals  (optional)
   * @param vehiclePlateNumberSpecified  (optional)
   * @param vehiclePlateNumberIn  (optional)
   * @param vehiclePlateNumberNotIn  (optional)
   * @param distinct  (optional)
   * @param page Zero-based page index (0..N) (optional, default to 0)
   * @param size The size of the page to be returned (optional, default to 20)
   * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/trips/with-pricing?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&tripCode.contains={tripCodeContains}&tripCode.doesNotContain={tripCodeDoesNotContain}&tripCode.equals={tripCodeEquals}&tripCode.notEquals={tripCodeNotEquals}&tripCode.specified={tripCodeSpecified}&tripCode.in={tripCodeIn}&tripCode.notIn={tripCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleId.greaterThan={vehicleIdGreaterThan}&vehicleId.lessThan={vehicleIdLessThan}&vehicleId.greaterThanOrEqual={vehicleIdGreaterThanOrEqual}&vehicleId.lessThanOrEqual={vehicleIdLessThanOrEqual}&vehicleId.equals={vehicleIdEquals}&vehicleId.notEquals={vehicleIdNotEquals}&vehicleId.specified={vehicleIdSpecified}&vehicleId.in={vehicleIdIn}&vehicleId.notIn={vehicleIdNotIn}&slotId.greaterThan={slotIdGreaterThan}&slotId.lessThan={slotIdLessThan}&slotId.greaterThanOrEqual={slotIdGreaterThanOrEqual}&slotId.lessThanOrEqual={slotIdLessThanOrEqual}&slotId.equals={slotIdEquals}&slotId.notEquals={slotIdNotEquals}&slotId.specified={slotIdSpecified}&slotId.in={slotIdIn}&slotId.notIn={slotIdNotIn}&driverId.greaterThan={driverIdGreaterThan}&driverId.lessThan={driverIdLessThan}&driverId.greaterThanOrEqual={driverIdGreaterThanOrEqual}&driverId.lessThanOrEqual={driverIdLessThanOrEqual}&driverId.equals={driverIdEquals}&driverId.notEquals={driverIdNotEquals}&driverId.specified={driverIdSpecified}&driverId.in={driverIdIn}&driverId.notIn={driverIdNotIn}&attendantId.greaterThan={attendantIdGreaterThan}&attendantId.lessThan={attendantIdLessThan}&attendantId.greaterThanOrEqual={attendantIdGreaterThanOrEqual}&attendantId.lessThanOrEqual={attendantIdLessThanOrEqual}&attendantId.equals={attendantIdEquals}&attendantId.notEquals={attendantIdNotEquals}&attendantId.specified={attendantIdSpecified}&attendantId.in={attendantIdIn}&attendantId.notIn={attendantIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&originDistrictCode.contains={originDistrictCodeContains}&originDistrictCode.doesNotContain={originDistrictCodeDoesNotContain}&originDistrictCode.equals={originDistrictCodeEquals}&originDistrictCode.notEquals={originDistrictCodeNotEquals}&originDistrictCode.specified={originDistrictCodeSpecified}&originDistrictCode.in={originDistrictCodeIn}&originDistrictCode.notIn={originDistrictCodeNotIn}&originProvinceCode.contains={originProvinceCodeContains}&originProvinceCode.doesNotContain={originProvinceCodeDoesNotContain}&originProvinceCode.equals={originProvinceCodeEquals}&originProvinceCode.notEquals={originProvinceCodeNotEquals}&originProvinceCode.specified={originProvinceCodeSpecified}&originProvinceCode.in={originProvinceCodeIn}&originProvinceCode.notIn={originProvinceCodeNotIn}&destinationDistrictCode.contains={destinationDistrictCodeContains}&destinationDistrictCode.doesNotContain={destinationDistrictCodeDoesNotContain}&destinationDistrictCode.equals={destinationDistrictCodeEquals}&destinationDistrictCode.notEquals={destinationDistrictCodeNotEquals}&destinationDistrictCode.specified={destinationDistrictCodeSpecified}&destinationDistrictCode.in={destinationDistrictCodeIn}&destinationDistrictCode.notIn={destinationDistrictCodeNotIn}&destinationProvinceCode.contains={destinationProvinceCodeContains}&destinationProvinceCode.doesNotContain={destinationProvinceCodeDoesNotContain}&destinationProvinceCode.equals={destinationProvinceCodeEquals}&destinationProvinceCode.notEquals={destinationProvinceCodeNotEquals}&destinationProvinceCode.specified={destinationProvinceCodeSpecified}&destinationProvinceCode.in={destinationProvinceCodeIn}&destinationProvinceCode.notIn={destinationProvinceCodeNotIn}&vehiclePlateNumber.contains={vehiclePlateNumberContains}&vehiclePlateNumber.doesNotContain={vehiclePlateNumberDoesNotContain}&vehiclePlateNumber.equals={vehiclePlateNumberEquals}&vehiclePlateNumber.notEquals={vehiclePlateNumberNotEquals}&vehiclePlateNumber.specified={vehiclePlateNumberSpecified}&vehiclePlateNumber.in={vehiclePlateNumberIn}&vehiclePlateNumber.notIn={vehiclePlateNumberNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<TripWithPricingDTO>> getAllTripsWithPricingWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("tripCodeContains") @jakarta.annotation.Nullable String tripCodeContains, @Param("tripCodeDoesNotContain") @jakarta.annotation.Nullable String tripCodeDoesNotContain, @Param("tripCodeEquals") @jakarta.annotation.Nullable String tripCodeEquals, @Param("tripCodeNotEquals") @jakarta.annotation.Nullable String tripCodeNotEquals, @Param("tripCodeSpecified") @jakarta.annotation.Nullable Boolean tripCodeSpecified, @Param("tripCodeIn") @jakarta.annotation.Nullable List<String> tripCodeIn, @Param("tripCodeNotIn") @jakarta.annotation.Nullable List<String> tripCodeNotIn, @Param("departureTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThan, @Param("departureTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThan, @Param("departureTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeGreaterThanOrEqual, @Param("departureTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime departureTimeLessThanOrEqual, @Param("departureTimeEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeEquals, @Param("departureTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime departureTimeNotEquals, @Param("departureTimeSpecified") @jakarta.annotation.Nullable Boolean departureTimeSpecified, @Param("departureTimeIn") @jakarta.annotation.Nullable List<OffsetDateTime> departureTimeIn, @Param("departureTimeNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> departureTimeNotIn, @Param("arrivalTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThan, @Param("arrivalTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThan, @Param("arrivalTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeGreaterThanOrEqual, @Param("arrivalTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeLessThanOrEqual, @Param("arrivalTimeEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeEquals, @Param("arrivalTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime arrivalTimeNotEquals, @Param("arrivalTimeSpecified") @jakarta.annotation.Nullable Boolean arrivalTimeSpecified, @Param("arrivalTimeIn") @jakarta.annotation.Nullable List<OffsetDateTime> arrivalTimeIn, @Param("arrivalTimeNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> arrivalTimeNotIn, @Param("occasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThan, @Param("occasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThan, @Param("occasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThanOrEqual, @Param("occasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThanOrEqual, @Param("occasionFactorEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorEquals, @Param("occasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorNotEquals, @Param("occasionFactorSpecified") @jakarta.annotation.Nullable Boolean occasionFactorSpecified, @Param("occasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorIn, @Param("occasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("vehicleIdGreaterThan") @jakarta.annotation.Nullable Long vehicleIdGreaterThan, @Param("vehicleIdLessThan") @jakarta.annotation.Nullable Long vehicleIdLessThan, @Param("vehicleIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long vehicleIdGreaterThanOrEqual, @Param("vehicleIdLessThanOrEqual") @jakarta.annotation.Nullable Long vehicleIdLessThanOrEqual, @Param("vehicleIdEquals") @jakarta.annotation.Nullable Long vehicleIdEquals, @Param("vehicleIdNotEquals") @jakarta.annotation.Nullable Long vehicleIdNotEquals, @Param("vehicleIdSpecified") @jakarta.annotation.Nullable Boolean vehicleIdSpecified, @Param("vehicleIdIn") @jakarta.annotation.Nullable List<Long> vehicleIdIn, @Param("vehicleIdNotIn") @jakarta.annotation.Nullable List<Long> vehicleIdNotIn, @Param("slotIdGreaterThan") @jakarta.annotation.Nullable Long slotIdGreaterThan, @Param("slotIdLessThan") @jakarta.annotation.Nullable Long slotIdLessThan, @Param("slotIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long slotIdGreaterThanOrEqual, @Param("slotIdLessThanOrEqual") @jakarta.annotation.Nullable Long slotIdLessThanOrEqual, @Param("slotIdEquals") @jakarta.annotation.Nullable Long slotIdEquals, @Param("slotIdNotEquals") @jakarta.annotation.Nullable Long slotIdNotEquals, @Param("slotIdSpecified") @jakarta.annotation.Nullable Boolean slotIdSpecified, @Param("slotIdIn") @jakarta.annotation.Nullable List<Long> slotIdIn, @Param("slotIdNotIn") @jakarta.annotation.Nullable List<Long> slotIdNotIn, @Param("driverIdGreaterThan") @jakarta.annotation.Nullable Long driverIdGreaterThan, @Param("driverIdLessThan") @jakarta.annotation.Nullable Long driverIdLessThan, @Param("driverIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long driverIdGreaterThanOrEqual, @Param("driverIdLessThanOrEqual") @jakarta.annotation.Nullable Long driverIdLessThanOrEqual, @Param("driverIdEquals") @jakarta.annotation.Nullable Long driverIdEquals, @Param("driverIdNotEquals") @jakarta.annotation.Nullable Long driverIdNotEquals, @Param("driverIdSpecified") @jakarta.annotation.Nullable Boolean driverIdSpecified, @Param("driverIdIn") @jakarta.annotation.Nullable List<Long> driverIdIn, @Param("driverIdNotIn") @jakarta.annotation.Nullable List<Long> driverIdNotIn, @Param("attendantIdGreaterThan") @jakarta.annotation.Nullable Long attendantIdGreaterThan, @Param("attendantIdLessThan") @jakarta.annotation.Nullable Long attendantIdLessThan, @Param("attendantIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long attendantIdGreaterThanOrEqual, @Param("attendantIdLessThanOrEqual") @jakarta.annotation.Nullable Long attendantIdLessThanOrEqual, @Param("attendantIdEquals") @jakarta.annotation.Nullable Long attendantIdEquals, @Param("attendantIdNotEquals") @jakarta.annotation.Nullable Long attendantIdNotEquals, @Param("attendantIdSpecified") @jakarta.annotation.Nullable Boolean attendantIdSpecified, @Param("attendantIdIn") @jakarta.annotation.Nullable List<Long> attendantIdIn, @Param("attendantIdNotIn") @jakarta.annotation.Nullable List<Long> attendantIdNotIn, @Param("vehicleTypeEquals") @jakarta.annotation.Nullable String vehicleTypeEquals, @Param("vehicleTypeNotEquals") @jakarta.annotation.Nullable String vehicleTypeNotEquals, @Param("vehicleTypeSpecified") @jakarta.annotation.Nullable Boolean vehicleTypeSpecified, @Param("vehicleTypeIn") @jakarta.annotation.Nullable List<String> vehicleTypeIn, @Param("vehicleTypeNotIn") @jakarta.annotation.Nullable List<String> vehicleTypeNotIn, @Param("routeCodeContains") @jakarta.annotation.Nullable String routeCodeContains, @Param("routeCodeDoesNotContain") @jakarta.annotation.Nullable String routeCodeDoesNotContain, @Param("routeCodeEquals") @jakarta.annotation.Nullable String routeCodeEquals, @Param("routeCodeNotEquals") @jakarta.annotation.Nullable String routeCodeNotEquals, @Param("routeCodeSpecified") @jakarta.annotation.Nullable Boolean routeCodeSpecified, @Param("routeCodeIn") @jakarta.annotation.Nullable List<String> routeCodeIn, @Param("routeCodeNotIn") @jakarta.annotation.Nullable List<String> routeCodeNotIn, @Param("originDistrictCodeContains") @jakarta.annotation.Nullable String originDistrictCodeContains, @Param("originDistrictCodeDoesNotContain") @jakarta.annotation.Nullable String originDistrictCodeDoesNotContain, @Param("originDistrictCodeEquals") @jakarta.annotation.Nullable String originDistrictCodeEquals, @Param("originDistrictCodeNotEquals") @jakarta.annotation.Nullable String originDistrictCodeNotEquals, @Param("originDistrictCodeSpecified") @jakarta.annotation.Nullable Boolean originDistrictCodeSpecified, @Param("originDistrictCodeIn") @jakarta.annotation.Nullable List<String> originDistrictCodeIn, @Param("originDistrictCodeNotIn") @jakarta.annotation.Nullable List<String> originDistrictCodeNotIn, @Param("originProvinceCodeContains") @jakarta.annotation.Nullable String originProvinceCodeContains, @Param("originProvinceCodeDoesNotContain") @jakarta.annotation.Nullable String originProvinceCodeDoesNotContain, @Param("originProvinceCodeEquals") @jakarta.annotation.Nullable String originProvinceCodeEquals, @Param("originProvinceCodeNotEquals") @jakarta.annotation.Nullable String originProvinceCodeNotEquals, @Param("originProvinceCodeSpecified") @jakarta.annotation.Nullable Boolean originProvinceCodeSpecified, @Param("originProvinceCodeIn") @jakarta.annotation.Nullable List<String> originProvinceCodeIn, @Param("originProvinceCodeNotIn") @jakarta.annotation.Nullable List<String> originProvinceCodeNotIn, @Param("destinationDistrictCodeContains") @jakarta.annotation.Nullable String destinationDistrictCodeContains, @Param("destinationDistrictCodeDoesNotContain") @jakarta.annotation.Nullable String destinationDistrictCodeDoesNotContain, @Param("destinationDistrictCodeEquals") @jakarta.annotation.Nullable String destinationDistrictCodeEquals, @Param("destinationDistrictCodeNotEquals") @jakarta.annotation.Nullable String destinationDistrictCodeNotEquals, @Param("destinationDistrictCodeSpecified") @jakarta.annotation.Nullable Boolean destinationDistrictCodeSpecified, @Param("destinationDistrictCodeIn") @jakarta.annotation.Nullable List<String> destinationDistrictCodeIn, @Param("destinationDistrictCodeNotIn") @jakarta.annotation.Nullable List<String> destinationDistrictCodeNotIn, @Param("destinationProvinceCodeContains") @jakarta.annotation.Nullable String destinationProvinceCodeContains, @Param("destinationProvinceCodeDoesNotContain") @jakarta.annotation.Nullable String destinationProvinceCodeDoesNotContain, @Param("destinationProvinceCodeEquals") @jakarta.annotation.Nullable String destinationProvinceCodeEquals, @Param("destinationProvinceCodeNotEquals") @jakarta.annotation.Nullable String destinationProvinceCodeNotEquals, @Param("destinationProvinceCodeSpecified") @jakarta.annotation.Nullable Boolean destinationProvinceCodeSpecified, @Param("destinationProvinceCodeIn") @jakarta.annotation.Nullable List<String> destinationProvinceCodeIn, @Param("destinationProvinceCodeNotIn") @jakarta.annotation.Nullable List<String> destinationProvinceCodeNotIn, @Param("vehiclePlateNumberContains") @jakarta.annotation.Nullable String vehiclePlateNumberContains, @Param("vehiclePlateNumberDoesNotContain") @jakarta.annotation.Nullable String vehiclePlateNumberDoesNotContain, @Param("vehiclePlateNumberEquals") @jakarta.annotation.Nullable String vehiclePlateNumberEquals, @Param("vehiclePlateNumberNotEquals") @jakarta.annotation.Nullable String vehiclePlateNumberNotEquals, @Param("vehiclePlateNumberSpecified") @jakarta.annotation.Nullable Boolean vehiclePlateNumberSpecified, @Param("vehiclePlateNumberIn") @jakarta.annotation.Nullable List<String> vehiclePlateNumberIn, @Param("vehiclePlateNumberNotIn") @jakarta.annotation.Nullable List<String> vehiclePlateNumberNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllTripsWithPricing</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllTripsWithPricingQueryParams} class that allows for
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
   *   <li>tripCodeContains -  (optional)</li>
   *   <li>tripCodeDoesNotContain -  (optional)</li>
   *   <li>tripCodeEquals -  (optional)</li>
   *   <li>tripCodeNotEquals -  (optional)</li>
   *   <li>tripCodeSpecified -  (optional)</li>
   *   <li>tripCodeIn -  (optional)</li>
   *   <li>tripCodeNotIn -  (optional)</li>
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
   *   <li>routeIdGreaterThan -  (optional)</li>
   *   <li>routeIdLessThan -  (optional)</li>
   *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
   *   <li>routeIdLessThanOrEqual -  (optional)</li>
   *   <li>routeIdEquals -  (optional)</li>
   *   <li>routeIdNotEquals -  (optional)</li>
   *   <li>routeIdSpecified -  (optional)</li>
   *   <li>routeIdIn -  (optional)</li>
   *   <li>routeIdNotIn -  (optional)</li>
   *   <li>vehicleIdGreaterThan -  (optional)</li>
   *   <li>vehicleIdLessThan -  (optional)</li>
   *   <li>vehicleIdGreaterThanOrEqual -  (optional)</li>
   *   <li>vehicleIdLessThanOrEqual -  (optional)</li>
   *   <li>vehicleIdEquals -  (optional)</li>
   *   <li>vehicleIdNotEquals -  (optional)</li>
   *   <li>vehicleIdSpecified -  (optional)</li>
   *   <li>vehicleIdIn -  (optional)</li>
   *   <li>vehicleIdNotIn -  (optional)</li>
   *   <li>slotIdGreaterThan -  (optional)</li>
   *   <li>slotIdLessThan -  (optional)</li>
   *   <li>slotIdGreaterThanOrEqual -  (optional)</li>
   *   <li>slotIdLessThanOrEqual -  (optional)</li>
   *   <li>slotIdEquals -  (optional)</li>
   *   <li>slotIdNotEquals -  (optional)</li>
   *   <li>slotIdSpecified -  (optional)</li>
   *   <li>slotIdIn -  (optional)</li>
   *   <li>slotIdNotIn -  (optional)</li>
   *   <li>driverIdGreaterThan -  (optional)</li>
   *   <li>driverIdLessThan -  (optional)</li>
   *   <li>driverIdGreaterThanOrEqual -  (optional)</li>
   *   <li>driverIdLessThanOrEqual -  (optional)</li>
   *   <li>driverIdEquals -  (optional)</li>
   *   <li>driverIdNotEquals -  (optional)</li>
   *   <li>driverIdSpecified -  (optional)</li>
   *   <li>driverIdIn -  (optional)</li>
   *   <li>driverIdNotIn -  (optional)</li>
   *   <li>attendantIdGreaterThan -  (optional)</li>
   *   <li>attendantIdLessThan -  (optional)</li>
   *   <li>attendantIdGreaterThanOrEqual -  (optional)</li>
   *   <li>attendantIdLessThanOrEqual -  (optional)</li>
   *   <li>attendantIdEquals -  (optional)</li>
   *   <li>attendantIdNotEquals -  (optional)</li>
   *   <li>attendantIdSpecified -  (optional)</li>
   *   <li>attendantIdIn -  (optional)</li>
   *   <li>attendantIdNotIn -  (optional)</li>
   *   <li>vehicleTypeEquals -  (optional)</li>
   *   <li>vehicleTypeNotEquals -  (optional)</li>
   *   <li>vehicleTypeSpecified -  (optional)</li>
   *   <li>vehicleTypeIn -  (optional)</li>
   *   <li>vehicleTypeNotIn -  (optional)</li>
   *   <li>routeCodeContains -  (optional)</li>
   *   <li>routeCodeDoesNotContain -  (optional)</li>
   *   <li>routeCodeEquals -  (optional)</li>
   *   <li>routeCodeNotEquals -  (optional)</li>
   *   <li>routeCodeSpecified -  (optional)</li>
   *   <li>routeCodeIn -  (optional)</li>
   *   <li>routeCodeNotIn -  (optional)</li>
   *   <li>originDistrictCodeContains -  (optional)</li>
   *   <li>originDistrictCodeDoesNotContain -  (optional)</li>
   *   <li>originDistrictCodeEquals -  (optional)</li>
   *   <li>originDistrictCodeNotEquals -  (optional)</li>
   *   <li>originDistrictCodeSpecified -  (optional)</li>
   *   <li>originDistrictCodeIn -  (optional)</li>
   *   <li>originDistrictCodeNotIn -  (optional)</li>
   *   <li>originProvinceCodeContains -  (optional)</li>
   *   <li>originProvinceCodeDoesNotContain -  (optional)</li>
   *   <li>originProvinceCodeEquals -  (optional)</li>
   *   <li>originProvinceCodeNotEquals -  (optional)</li>
   *   <li>originProvinceCodeSpecified -  (optional)</li>
   *   <li>originProvinceCodeIn -  (optional)</li>
   *   <li>originProvinceCodeNotIn -  (optional)</li>
   *   <li>destinationDistrictCodeContains -  (optional)</li>
   *   <li>destinationDistrictCodeDoesNotContain -  (optional)</li>
   *   <li>destinationDistrictCodeEquals -  (optional)</li>
   *   <li>destinationDistrictCodeNotEquals -  (optional)</li>
   *   <li>destinationDistrictCodeSpecified -  (optional)</li>
   *   <li>destinationDistrictCodeIn -  (optional)</li>
   *   <li>destinationDistrictCodeNotIn -  (optional)</li>
   *   <li>destinationProvinceCodeContains -  (optional)</li>
   *   <li>destinationProvinceCodeDoesNotContain -  (optional)</li>
   *   <li>destinationProvinceCodeEquals -  (optional)</li>
   *   <li>destinationProvinceCodeNotEquals -  (optional)</li>
   *   <li>destinationProvinceCodeSpecified -  (optional)</li>
   *   <li>destinationProvinceCodeIn -  (optional)</li>
   *   <li>destinationProvinceCodeNotIn -  (optional)</li>
   *   <li>vehiclePlateNumberContains -  (optional)</li>
   *   <li>vehiclePlateNumberDoesNotContain -  (optional)</li>
   *   <li>vehiclePlateNumberEquals -  (optional)</li>
   *   <li>vehiclePlateNumberNotEquals -  (optional)</li>
   *   <li>vehiclePlateNumberSpecified -  (optional)</li>
   *   <li>vehiclePlateNumberIn -  (optional)</li>
   *   <li>vehiclePlateNumberNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   <li>page - Zero-based page index (0..N) (optional, default to 0)</li>
   *   <li>size - The size of the page to be returned (optional, default to 20)</li>
   *   <li>sort - Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
   *   </ul>
   * @return List&lt;TripWithPricingDTO&gt;
   */
  @RequestLine("GET /api/trips/with-pricing?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&tripCode.contains={tripCodeContains}&tripCode.doesNotContain={tripCodeDoesNotContain}&tripCode.equals={tripCodeEquals}&tripCode.notEquals={tripCodeNotEquals}&tripCode.specified={tripCodeSpecified}&tripCode.in={tripCodeIn}&tripCode.notIn={tripCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleId.greaterThan={vehicleIdGreaterThan}&vehicleId.lessThan={vehicleIdLessThan}&vehicleId.greaterThanOrEqual={vehicleIdGreaterThanOrEqual}&vehicleId.lessThanOrEqual={vehicleIdLessThanOrEqual}&vehicleId.equals={vehicleIdEquals}&vehicleId.notEquals={vehicleIdNotEquals}&vehicleId.specified={vehicleIdSpecified}&vehicleId.in={vehicleIdIn}&vehicleId.notIn={vehicleIdNotIn}&slotId.greaterThan={slotIdGreaterThan}&slotId.lessThan={slotIdLessThan}&slotId.greaterThanOrEqual={slotIdGreaterThanOrEqual}&slotId.lessThanOrEqual={slotIdLessThanOrEqual}&slotId.equals={slotIdEquals}&slotId.notEquals={slotIdNotEquals}&slotId.specified={slotIdSpecified}&slotId.in={slotIdIn}&slotId.notIn={slotIdNotIn}&driverId.greaterThan={driverIdGreaterThan}&driverId.lessThan={driverIdLessThan}&driverId.greaterThanOrEqual={driverIdGreaterThanOrEqual}&driverId.lessThanOrEqual={driverIdLessThanOrEqual}&driverId.equals={driverIdEquals}&driverId.notEquals={driverIdNotEquals}&driverId.specified={driverIdSpecified}&driverId.in={driverIdIn}&driverId.notIn={driverIdNotIn}&attendantId.greaterThan={attendantIdGreaterThan}&attendantId.lessThan={attendantIdLessThan}&attendantId.greaterThanOrEqual={attendantIdGreaterThanOrEqual}&attendantId.lessThanOrEqual={attendantIdLessThanOrEqual}&attendantId.equals={attendantIdEquals}&attendantId.notEquals={attendantIdNotEquals}&attendantId.specified={attendantIdSpecified}&attendantId.in={attendantIdIn}&attendantId.notIn={attendantIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&originDistrictCode.contains={originDistrictCodeContains}&originDistrictCode.doesNotContain={originDistrictCodeDoesNotContain}&originDistrictCode.equals={originDistrictCodeEquals}&originDistrictCode.notEquals={originDistrictCodeNotEquals}&originDistrictCode.specified={originDistrictCodeSpecified}&originDistrictCode.in={originDistrictCodeIn}&originDistrictCode.notIn={originDistrictCodeNotIn}&originProvinceCode.contains={originProvinceCodeContains}&originProvinceCode.doesNotContain={originProvinceCodeDoesNotContain}&originProvinceCode.equals={originProvinceCodeEquals}&originProvinceCode.notEquals={originProvinceCodeNotEquals}&originProvinceCode.specified={originProvinceCodeSpecified}&originProvinceCode.in={originProvinceCodeIn}&originProvinceCode.notIn={originProvinceCodeNotIn}&destinationDistrictCode.contains={destinationDistrictCodeContains}&destinationDistrictCode.doesNotContain={destinationDistrictCodeDoesNotContain}&destinationDistrictCode.equals={destinationDistrictCodeEquals}&destinationDistrictCode.notEquals={destinationDistrictCodeNotEquals}&destinationDistrictCode.specified={destinationDistrictCodeSpecified}&destinationDistrictCode.in={destinationDistrictCodeIn}&destinationDistrictCode.notIn={destinationDistrictCodeNotIn}&destinationProvinceCode.contains={destinationProvinceCodeContains}&destinationProvinceCode.doesNotContain={destinationProvinceCodeDoesNotContain}&destinationProvinceCode.equals={destinationProvinceCodeEquals}&destinationProvinceCode.notEquals={destinationProvinceCodeNotEquals}&destinationProvinceCode.specified={destinationProvinceCodeSpecified}&destinationProvinceCode.in={destinationProvinceCodeIn}&destinationProvinceCode.notIn={destinationProvinceCodeNotIn}&vehiclePlateNumber.contains={vehiclePlateNumberContains}&vehiclePlateNumber.doesNotContain={vehiclePlateNumberDoesNotContain}&vehiclePlateNumber.equals={vehiclePlateNumberEquals}&vehiclePlateNumber.notEquals={vehiclePlateNumberNotEquals}&vehiclePlateNumber.specified={vehiclePlateNumberSpecified}&vehiclePlateNumber.in={vehiclePlateNumberIn}&vehiclePlateNumber.notIn={vehiclePlateNumberNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
  "Accept: */*",
  })
  List<TripWithPricingDTO> getAllTripsWithPricing(@QueryMap(encoded=true) GetAllTripsWithPricingQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllTripsWithPricing</code> that receives the query parameters as a map,
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
          *   <li>tripCodeContains -  (optional)</li>
          *   <li>tripCodeDoesNotContain -  (optional)</li>
          *   <li>tripCodeEquals -  (optional)</li>
          *   <li>tripCodeNotEquals -  (optional)</li>
          *   <li>tripCodeSpecified -  (optional)</li>
          *   <li>tripCodeIn -  (optional)</li>
          *   <li>tripCodeNotIn -  (optional)</li>
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
          *   <li>routeIdGreaterThan -  (optional)</li>
          *   <li>routeIdLessThan -  (optional)</li>
          *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
          *   <li>routeIdLessThanOrEqual -  (optional)</li>
          *   <li>routeIdEquals -  (optional)</li>
          *   <li>routeIdNotEquals -  (optional)</li>
          *   <li>routeIdSpecified -  (optional)</li>
          *   <li>routeIdIn -  (optional)</li>
          *   <li>routeIdNotIn -  (optional)</li>
          *   <li>vehicleIdGreaterThan -  (optional)</li>
          *   <li>vehicleIdLessThan -  (optional)</li>
          *   <li>vehicleIdGreaterThanOrEqual -  (optional)</li>
          *   <li>vehicleIdLessThanOrEqual -  (optional)</li>
          *   <li>vehicleIdEquals -  (optional)</li>
          *   <li>vehicleIdNotEquals -  (optional)</li>
          *   <li>vehicleIdSpecified -  (optional)</li>
          *   <li>vehicleIdIn -  (optional)</li>
          *   <li>vehicleIdNotIn -  (optional)</li>
          *   <li>slotIdGreaterThan -  (optional)</li>
          *   <li>slotIdLessThan -  (optional)</li>
          *   <li>slotIdGreaterThanOrEqual -  (optional)</li>
          *   <li>slotIdLessThanOrEqual -  (optional)</li>
          *   <li>slotIdEquals -  (optional)</li>
          *   <li>slotIdNotEquals -  (optional)</li>
          *   <li>slotIdSpecified -  (optional)</li>
          *   <li>slotIdIn -  (optional)</li>
          *   <li>slotIdNotIn -  (optional)</li>
          *   <li>driverIdGreaterThan -  (optional)</li>
          *   <li>driverIdLessThan -  (optional)</li>
          *   <li>driverIdGreaterThanOrEqual -  (optional)</li>
          *   <li>driverIdLessThanOrEqual -  (optional)</li>
          *   <li>driverIdEquals -  (optional)</li>
          *   <li>driverIdNotEquals -  (optional)</li>
          *   <li>driverIdSpecified -  (optional)</li>
          *   <li>driverIdIn -  (optional)</li>
          *   <li>driverIdNotIn -  (optional)</li>
          *   <li>attendantIdGreaterThan -  (optional)</li>
          *   <li>attendantIdLessThan -  (optional)</li>
          *   <li>attendantIdGreaterThanOrEqual -  (optional)</li>
          *   <li>attendantIdLessThanOrEqual -  (optional)</li>
          *   <li>attendantIdEquals -  (optional)</li>
          *   <li>attendantIdNotEquals -  (optional)</li>
          *   <li>attendantIdSpecified -  (optional)</li>
          *   <li>attendantIdIn -  (optional)</li>
          *   <li>attendantIdNotIn -  (optional)</li>
          *   <li>vehicleTypeEquals -  (optional)</li>
          *   <li>vehicleTypeNotEquals -  (optional)</li>
          *   <li>vehicleTypeSpecified -  (optional)</li>
          *   <li>vehicleTypeIn -  (optional)</li>
          *   <li>vehicleTypeNotIn -  (optional)</li>
          *   <li>routeCodeContains -  (optional)</li>
          *   <li>routeCodeDoesNotContain -  (optional)</li>
          *   <li>routeCodeEquals -  (optional)</li>
          *   <li>routeCodeNotEquals -  (optional)</li>
          *   <li>routeCodeSpecified -  (optional)</li>
          *   <li>routeCodeIn -  (optional)</li>
          *   <li>routeCodeNotIn -  (optional)</li>
          *   <li>originDistrictCodeContains -  (optional)</li>
          *   <li>originDistrictCodeDoesNotContain -  (optional)</li>
          *   <li>originDistrictCodeEquals -  (optional)</li>
          *   <li>originDistrictCodeNotEquals -  (optional)</li>
          *   <li>originDistrictCodeSpecified -  (optional)</li>
          *   <li>originDistrictCodeIn -  (optional)</li>
          *   <li>originDistrictCodeNotIn -  (optional)</li>
          *   <li>originProvinceCodeContains -  (optional)</li>
          *   <li>originProvinceCodeDoesNotContain -  (optional)</li>
          *   <li>originProvinceCodeEquals -  (optional)</li>
          *   <li>originProvinceCodeNotEquals -  (optional)</li>
          *   <li>originProvinceCodeSpecified -  (optional)</li>
          *   <li>originProvinceCodeIn -  (optional)</li>
          *   <li>originProvinceCodeNotIn -  (optional)</li>
          *   <li>destinationDistrictCodeContains -  (optional)</li>
          *   <li>destinationDistrictCodeDoesNotContain -  (optional)</li>
          *   <li>destinationDistrictCodeEquals -  (optional)</li>
          *   <li>destinationDistrictCodeNotEquals -  (optional)</li>
          *   <li>destinationDistrictCodeSpecified -  (optional)</li>
          *   <li>destinationDistrictCodeIn -  (optional)</li>
          *   <li>destinationDistrictCodeNotIn -  (optional)</li>
          *   <li>destinationProvinceCodeContains -  (optional)</li>
          *   <li>destinationProvinceCodeDoesNotContain -  (optional)</li>
          *   <li>destinationProvinceCodeEquals -  (optional)</li>
          *   <li>destinationProvinceCodeNotEquals -  (optional)</li>
          *   <li>destinationProvinceCodeSpecified -  (optional)</li>
          *   <li>destinationProvinceCodeIn -  (optional)</li>
          *   <li>destinationProvinceCodeNotIn -  (optional)</li>
          *   <li>vehiclePlateNumberContains -  (optional)</li>
          *   <li>vehiclePlateNumberDoesNotContain -  (optional)</li>
          *   <li>vehiclePlateNumberEquals -  (optional)</li>
          *   <li>vehiclePlateNumberNotEquals -  (optional)</li>
          *   <li>vehiclePlateNumberSpecified -  (optional)</li>
          *   <li>vehiclePlateNumberIn -  (optional)</li>
          *   <li>vehiclePlateNumberNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
          *   <li>page - Zero-based page index (0..N) (optional, default to 0)</li>
          *   <li>size - The size of the page to be returned (optional, default to 20)</li>
          *   <li>sort - Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
      *   </ul>
          * @return List&lt;TripWithPricingDTO&gt;
      */
      @RequestLine("GET /api/trips/with-pricing?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&tripCode.contains={tripCodeContains}&tripCode.doesNotContain={tripCodeDoesNotContain}&tripCode.equals={tripCodeEquals}&tripCode.notEquals={tripCodeNotEquals}&tripCode.specified={tripCodeSpecified}&tripCode.in={tripCodeIn}&tripCode.notIn={tripCodeNotIn}&departureTime.greaterThan={departureTimeGreaterThan}&departureTime.lessThan={departureTimeLessThan}&departureTime.greaterThanOrEqual={departureTimeGreaterThanOrEqual}&departureTime.lessThanOrEqual={departureTimeLessThanOrEqual}&departureTime.equals={departureTimeEquals}&departureTime.notEquals={departureTimeNotEquals}&departureTime.specified={departureTimeSpecified}&departureTime.in={departureTimeIn}&departureTime.notIn={departureTimeNotIn}&arrivalTime.greaterThan={arrivalTimeGreaterThan}&arrivalTime.lessThan={arrivalTimeLessThan}&arrivalTime.greaterThanOrEqual={arrivalTimeGreaterThanOrEqual}&arrivalTime.lessThanOrEqual={arrivalTimeLessThanOrEqual}&arrivalTime.equals={arrivalTimeEquals}&arrivalTime.notEquals={arrivalTimeNotEquals}&arrivalTime.specified={arrivalTimeSpecified}&arrivalTime.in={arrivalTimeIn}&arrivalTime.notIn={arrivalTimeNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleId.greaterThan={vehicleIdGreaterThan}&vehicleId.lessThan={vehicleIdLessThan}&vehicleId.greaterThanOrEqual={vehicleIdGreaterThanOrEqual}&vehicleId.lessThanOrEqual={vehicleIdLessThanOrEqual}&vehicleId.equals={vehicleIdEquals}&vehicleId.notEquals={vehicleIdNotEquals}&vehicleId.specified={vehicleIdSpecified}&vehicleId.in={vehicleIdIn}&vehicleId.notIn={vehicleIdNotIn}&slotId.greaterThan={slotIdGreaterThan}&slotId.lessThan={slotIdLessThan}&slotId.greaterThanOrEqual={slotIdGreaterThanOrEqual}&slotId.lessThanOrEqual={slotIdLessThanOrEqual}&slotId.equals={slotIdEquals}&slotId.notEquals={slotIdNotEquals}&slotId.specified={slotIdSpecified}&slotId.in={slotIdIn}&slotId.notIn={slotIdNotIn}&driverId.greaterThan={driverIdGreaterThan}&driverId.lessThan={driverIdLessThan}&driverId.greaterThanOrEqual={driverIdGreaterThanOrEqual}&driverId.lessThanOrEqual={driverIdLessThanOrEqual}&driverId.equals={driverIdEquals}&driverId.notEquals={driverIdNotEquals}&driverId.specified={driverIdSpecified}&driverId.in={driverIdIn}&driverId.notIn={driverIdNotIn}&attendantId.greaterThan={attendantIdGreaterThan}&attendantId.lessThan={attendantIdLessThan}&attendantId.greaterThanOrEqual={attendantIdGreaterThanOrEqual}&attendantId.lessThanOrEqual={attendantIdLessThanOrEqual}&attendantId.equals={attendantIdEquals}&attendantId.notEquals={attendantIdNotEquals}&attendantId.specified={attendantIdSpecified}&attendantId.in={attendantIdIn}&attendantId.notIn={attendantIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&originDistrictCode.contains={originDistrictCodeContains}&originDistrictCode.doesNotContain={originDistrictCodeDoesNotContain}&originDistrictCode.equals={originDistrictCodeEquals}&originDistrictCode.notEquals={originDistrictCodeNotEquals}&originDistrictCode.specified={originDistrictCodeSpecified}&originDistrictCode.in={originDistrictCodeIn}&originDistrictCode.notIn={originDistrictCodeNotIn}&originProvinceCode.contains={originProvinceCodeContains}&originProvinceCode.doesNotContain={originProvinceCodeDoesNotContain}&originProvinceCode.equals={originProvinceCodeEquals}&originProvinceCode.notEquals={originProvinceCodeNotEquals}&originProvinceCode.specified={originProvinceCodeSpecified}&originProvinceCode.in={originProvinceCodeIn}&originProvinceCode.notIn={originProvinceCodeNotIn}&destinationDistrictCode.contains={destinationDistrictCodeContains}&destinationDistrictCode.doesNotContain={destinationDistrictCodeDoesNotContain}&destinationDistrictCode.equals={destinationDistrictCodeEquals}&destinationDistrictCode.notEquals={destinationDistrictCodeNotEquals}&destinationDistrictCode.specified={destinationDistrictCodeSpecified}&destinationDistrictCode.in={destinationDistrictCodeIn}&destinationDistrictCode.notIn={destinationDistrictCodeNotIn}&destinationProvinceCode.contains={destinationProvinceCodeContains}&destinationProvinceCode.doesNotContain={destinationProvinceCodeDoesNotContain}&destinationProvinceCode.equals={destinationProvinceCodeEquals}&destinationProvinceCode.notEquals={destinationProvinceCodeNotEquals}&destinationProvinceCode.specified={destinationProvinceCodeSpecified}&destinationProvinceCode.in={destinationProvinceCodeIn}&destinationProvinceCode.notIn={destinationProvinceCodeNotIn}&vehiclePlateNumber.contains={vehiclePlateNumberContains}&vehiclePlateNumber.doesNotContain={vehiclePlateNumberDoesNotContain}&vehiclePlateNumber.equals={vehiclePlateNumberEquals}&vehiclePlateNumber.notEquals={vehiclePlateNumberNotEquals}&vehiclePlateNumber.specified={vehiclePlateNumberSpecified}&vehiclePlateNumber.in={vehiclePlateNumberIn}&vehiclePlateNumber.notIn={vehiclePlateNumberNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<TripWithPricingDTO>> getAllTripsWithPricingWithHttpInfo(@QueryMap(encoded=true) GetAllTripsWithPricingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllTripsWithPricing</code> method in a fluent style.
   */
  public static class GetAllTripsWithPricingQueryParams extends HashMap<String, Object> {
    public GetAllTripsWithPricingQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams tripCodeContains(@jakarta.annotation.Nullable final String value) {
      put("tripCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams tripCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("tripCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams tripCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("tripCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams tripCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("tripCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams tripCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("tripCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams tripCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("tripCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams tripCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("tripCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams departureTimeGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams departureTimeLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams departureTimeGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams departureTimeLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams departureTimeEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams departureTimeNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("departureTime.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams departureTimeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("departureTime.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams departureTimeIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("departureTime.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams departureTimeNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("departureTime.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams arrivalTimeGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams arrivalTimeLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams arrivalTimeGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams arrivalTimeLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams arrivalTimeEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams arrivalTimeNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("arrivalTime.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams arrivalTimeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("arrivalTime.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams arrivalTimeIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("arrivalTime.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams arrivalTimeNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("arrivalTime.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams occasionFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams occasionFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams occasionFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams occasionFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams occasionFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams occasionFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams occasionFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occasionFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams occasionFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occasionFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams occasionFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occasionFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams routeIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams routeIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams routeIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams routeIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams routeIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams routeIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams routeIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("routeId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams routeIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams routeIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehicleIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehicleIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehicleIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehicleIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehicleIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehicleIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("vehicleId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehicleIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehicleId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehicleIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("vehicleId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehicleIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("vehicleId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams slotIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("slotId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams slotIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("slotId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams slotIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("slotId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams slotIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("slotId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams slotIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("slotId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams slotIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("slotId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams slotIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("slotId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams slotIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("slotId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams slotIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("slotId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams driverIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("driverId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams driverIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("driverId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams driverIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("driverId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams driverIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("driverId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams driverIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("driverId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams driverIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("driverId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams driverIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("driverId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams driverIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("driverId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams driverIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("driverId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams attendantIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams attendantIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams attendantIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams attendantIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams attendantIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams attendantIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("attendantId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams attendantIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("attendantId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams attendantIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("attendantId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams attendantIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("attendantId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehicleTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("vehicleType.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehicleTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("vehicleType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehicleTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehicleType.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehicleTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehicleType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehicleTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehicleType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams routeCodeContains(@jakarta.annotation.Nullable final String value) {
      put("routeCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams routeCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("routeCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams routeCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("routeCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams routeCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("routeCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams routeCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("routeCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams routeCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("routeCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams routeCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("routeCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams originDistrictCodeContains(@jakarta.annotation.Nullable final String value) {
      put("originDistrictCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams originDistrictCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("originDistrictCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams originDistrictCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("originDistrictCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams originDistrictCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("originDistrictCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams originDistrictCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("originDistrictCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams originDistrictCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("originDistrictCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams originDistrictCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("originDistrictCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams originProvinceCodeContains(@jakarta.annotation.Nullable final String value) {
      put("originProvinceCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams originProvinceCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("originProvinceCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams originProvinceCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("originProvinceCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams originProvinceCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("originProvinceCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams originProvinceCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("originProvinceCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams originProvinceCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("originProvinceCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams originProvinceCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("originProvinceCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams destinationDistrictCodeContains(@jakarta.annotation.Nullable final String value) {
      put("destinationDistrictCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams destinationDistrictCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("destinationDistrictCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams destinationDistrictCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("destinationDistrictCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams destinationDistrictCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("destinationDistrictCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams destinationDistrictCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("destinationDistrictCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams destinationDistrictCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("destinationDistrictCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams destinationDistrictCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("destinationDistrictCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams destinationProvinceCodeContains(@jakarta.annotation.Nullable final String value) {
      put("destinationProvinceCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams destinationProvinceCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("destinationProvinceCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams destinationProvinceCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("destinationProvinceCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams destinationProvinceCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("destinationProvinceCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams destinationProvinceCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("destinationProvinceCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams destinationProvinceCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("destinationProvinceCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams destinationProvinceCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("destinationProvinceCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehiclePlateNumberContains(@jakarta.annotation.Nullable final String value) {
      put("vehiclePlateNumber.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehiclePlateNumberDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("vehiclePlateNumber.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehiclePlateNumberEquals(@jakarta.annotation.Nullable final String value) {
      put("vehiclePlateNumber.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehiclePlateNumberNotEquals(@jakarta.annotation.Nullable final String value) {
      put("vehiclePlateNumber.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehiclePlateNumberSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehiclePlateNumber.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehiclePlateNumberIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehiclePlateNumber.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams vehiclePlateNumberNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehiclePlateNumber.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripsWithPricingQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams page(@jakarta.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams size(@jakarta.annotation.Nullable final Integer value) {
      put("size", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripsWithPricingQueryParams sort(@jakarta.annotation.Nullable final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return TripDTO
   */
  @RequestLine("GET /api/trips/{id}")
  @Headers({
    "Accept: */*",
  })
  TripDTO getTrip(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getTrip</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/trips/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<TripDTO> getTripWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @return TripDetailVM
   */
  @RequestLine("GET /api/trips/{id}/detail")
  @Headers({
    "Accept: application/json",
  })
  TripDetailVM getTripDetail(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getTripDetail</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/trips/{id}/detail")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TripDetailVM> getTripDetailWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param tripDTO  (required)
   * @return TripDTO
   */
  @RequestLine("PATCH /api/trips/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TripDTO partialUpdateTrip(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TripDTO tripDTO);

  /**
   * 
   * Similar to <code>partialUpdateTrip</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param tripDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/trips/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TripDTO> partialUpdateTripWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TripDTO tripDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param tripDTO  (required)
   * @return TripDTO
   */
  @RequestLine("PUT /api/trips/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TripDTO updateTrip(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TripDTO tripDTO);

  /**
   * 
   * Similar to <code>updateTrip</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param tripDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/trips/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TripDTO> updateTripWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TripDTO tripDTO);


}
