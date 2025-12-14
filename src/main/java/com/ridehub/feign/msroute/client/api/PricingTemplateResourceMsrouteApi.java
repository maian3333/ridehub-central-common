package com.ridehub.feign.msroute.client.api;

import com.ridehub.feign.msroute.client.invoker.ApiClient;
import com.ridehub.feign.msroute.client.invoker.EncodingUtils;
import com.ridehub.feign.msroute.client.model.ApiResponse;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.ridehub.feign.msroute.client.model.PricingTemplateDTO;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface PricingTemplateResourceMsrouteApi extends ApiClient.Api {


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
   * @param vehicleTypeEquals  (optional)
   * @param vehicleTypeNotEquals  (optional)
   * @param vehicleTypeSpecified  (optional)
   * @param vehicleTypeIn  (optional)
   * @param vehicleTypeNotIn  (optional)
   * @param seatTypeEquals  (optional)
   * @param seatTypeNotEquals  (optional)
   * @param seatTypeSpecified  (optional)
   * @param seatTypeIn  (optional)
   * @param seatTypeNotIn  (optional)
   * @param occasionTypeEquals  (optional)
   * @param occasionTypeNotEquals  (optional)
   * @param occasionTypeSpecified  (optional)
   * @param occasionTypeIn  (optional)
   * @param occasionTypeNotIn  (optional)
   * @param baseFareGreaterThan  (optional)
   * @param baseFareLessThan  (optional)
   * @param baseFareGreaterThanOrEqual  (optional)
   * @param baseFareLessThanOrEqual  (optional)
   * @param baseFareEquals  (optional)
   * @param baseFareNotEquals  (optional)
   * @param baseFareSpecified  (optional)
   * @param baseFareIn  (optional)
   * @param baseFareNotIn  (optional)
   * @param vehicleFactorGreaterThan  (optional)
   * @param vehicleFactorLessThan  (optional)
   * @param vehicleFactorGreaterThanOrEqual  (optional)
   * @param vehicleFactorLessThanOrEqual  (optional)
   * @param vehicleFactorEquals  (optional)
   * @param vehicleFactorNotEquals  (optional)
   * @param vehicleFactorSpecified  (optional)
   * @param vehicleFactorIn  (optional)
   * @param vehicleFactorNotIn  (optional)
   * @param floorFactorGreaterThan  (optional)
   * @param floorFactorLessThan  (optional)
   * @param floorFactorGreaterThanOrEqual  (optional)
   * @param floorFactorLessThanOrEqual  (optional)
   * @param floorFactorEquals  (optional)
   * @param floorFactorNotEquals  (optional)
   * @param floorFactorSpecified  (optional)
   * @param floorFactorIn  (optional)
   * @param floorFactorNotIn  (optional)
   * @param seatFactorGreaterThan  (optional)
   * @param seatFactorLessThan  (optional)
   * @param seatFactorGreaterThanOrEqual  (optional)
   * @param seatFactorLessThanOrEqual  (optional)
   * @param seatFactorEquals  (optional)
   * @param seatFactorNotEquals  (optional)
   * @param seatFactorSpecified  (optional)
   * @param seatFactorIn  (optional)
   * @param seatFactorNotIn  (optional)
   * @param occasionFactorGreaterThan  (optional)
   * @param occasionFactorLessThan  (optional)
   * @param occasionFactorGreaterThanOrEqual  (optional)
   * @param occasionFactorLessThanOrEqual  (optional)
   * @param occasionFactorEquals  (optional)
   * @param occasionFactorNotEquals  (optional)
   * @param occasionFactorSpecified  (optional)
   * @param occasionFactorIn  (optional)
   * @param occasionFactorNotIn  (optional)
   * @param finalPriceGreaterThan  (optional)
   * @param finalPriceLessThan  (optional)
   * @param finalPriceGreaterThanOrEqual  (optional)
   * @param finalPriceLessThanOrEqual  (optional)
   * @param finalPriceEquals  (optional)
   * @param finalPriceNotEquals  (optional)
   * @param finalPriceSpecified  (optional)
   * @param finalPriceIn  (optional)
   * @param finalPriceNotIn  (optional)
   * @param validFromGreaterThan  (optional)
   * @param validFromLessThan  (optional)
   * @param validFromGreaterThanOrEqual  (optional)
   * @param validFromLessThanOrEqual  (optional)
   * @param validFromEquals  (optional)
   * @param validFromNotEquals  (optional)
   * @param validFromSpecified  (optional)
   * @param validFromIn  (optional)
   * @param validFromNotIn  (optional)
   * @param validToGreaterThan  (optional)
   * @param validToLessThan  (optional)
   * @param validToGreaterThanOrEqual  (optional)
   * @param validToLessThanOrEqual  (optional)
   * @param validToEquals  (optional)
   * @param validToNotEquals  (optional)
   * @param validToSpecified  (optional)
   * @param validToIn  (optional)
   * @param validToNotIn  (optional)
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
   * @param distinct  (optional)
   * @return Long
   */
  @RequestLine("GET /api/pricing-templates/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&seatType.equals={seatTypeEquals}&seatType.notEquals={seatTypeNotEquals}&seatType.specified={seatTypeSpecified}&seatType.in={seatTypeIn}&seatType.notIn={seatTypeNotIn}&occasionType.equals={occasionTypeEquals}&occasionType.notEquals={occasionTypeNotEquals}&occasionType.specified={occasionTypeSpecified}&occasionType.in={occasionTypeIn}&occasionType.notIn={occasionTypeNotIn}&baseFare.greaterThan={baseFareGreaterThan}&baseFare.lessThan={baseFareLessThan}&baseFare.greaterThanOrEqual={baseFareGreaterThanOrEqual}&baseFare.lessThanOrEqual={baseFareLessThanOrEqual}&baseFare.equals={baseFareEquals}&baseFare.notEquals={baseFareNotEquals}&baseFare.specified={baseFareSpecified}&baseFare.in={baseFareIn}&baseFare.notIn={baseFareNotIn}&vehicleFactor.greaterThan={vehicleFactorGreaterThan}&vehicleFactor.lessThan={vehicleFactorLessThan}&vehicleFactor.greaterThanOrEqual={vehicleFactorGreaterThanOrEqual}&vehicleFactor.lessThanOrEqual={vehicleFactorLessThanOrEqual}&vehicleFactor.equals={vehicleFactorEquals}&vehicleFactor.notEquals={vehicleFactorNotEquals}&vehicleFactor.specified={vehicleFactorSpecified}&vehicleFactor.in={vehicleFactorIn}&vehicleFactor.notIn={vehicleFactorNotIn}&floorFactor.greaterThan={floorFactorGreaterThan}&floorFactor.lessThan={floorFactorLessThan}&floorFactor.greaterThanOrEqual={floorFactorGreaterThanOrEqual}&floorFactor.lessThanOrEqual={floorFactorLessThanOrEqual}&floorFactor.equals={floorFactorEquals}&floorFactor.notEquals={floorFactorNotEquals}&floorFactor.specified={floorFactorSpecified}&floorFactor.in={floorFactorIn}&floorFactor.notIn={floorFactorNotIn}&seatFactor.greaterThan={seatFactorGreaterThan}&seatFactor.lessThan={seatFactorLessThan}&seatFactor.greaterThanOrEqual={seatFactorGreaterThanOrEqual}&seatFactor.lessThanOrEqual={seatFactorLessThanOrEqual}&seatFactor.equals={seatFactorEquals}&seatFactor.notEquals={seatFactorNotEquals}&seatFactor.specified={seatFactorSpecified}&seatFactor.in={seatFactorIn}&seatFactor.notIn={seatFactorNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&finalPrice.greaterThan={finalPriceGreaterThan}&finalPrice.lessThan={finalPriceLessThan}&finalPrice.greaterThanOrEqual={finalPriceGreaterThanOrEqual}&finalPrice.lessThanOrEqual={finalPriceLessThanOrEqual}&finalPrice.equals={finalPriceEquals}&finalPrice.notEquals={finalPriceNotEquals}&finalPrice.specified={finalPriceSpecified}&finalPrice.in={finalPriceIn}&finalPrice.notIn={finalPriceNotIn}&validFrom.greaterThan={validFromGreaterThan}&validFrom.lessThan={validFromLessThan}&validFrom.greaterThanOrEqual={validFromGreaterThanOrEqual}&validFrom.lessThanOrEqual={validFromLessThanOrEqual}&validFrom.equals={validFromEquals}&validFrom.notEquals={validFromNotEquals}&validFrom.specified={validFromSpecified}&validFrom.in={validFromIn}&validFrom.notIn={validFromNotIn}&validTo.greaterThan={validToGreaterThan}&validTo.lessThan={validToLessThan}&validTo.greaterThanOrEqual={validToGreaterThanOrEqual}&validTo.lessThanOrEqual={validToLessThanOrEqual}&validTo.equals={validToEquals}&validTo.notEquals={validToNotEquals}&validTo.specified={validToSpecified}&validTo.in={validToIn}&validTo.notIn={validToNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countPricingTemplates(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("vehicleTypeEquals") @jakarta.annotation.Nullable String vehicleTypeEquals, @Param("vehicleTypeNotEquals") @jakarta.annotation.Nullable String vehicleTypeNotEquals, @Param("vehicleTypeSpecified") @jakarta.annotation.Nullable Boolean vehicleTypeSpecified, @Param("vehicleTypeIn") @jakarta.annotation.Nullable List<String> vehicleTypeIn, @Param("vehicleTypeNotIn") @jakarta.annotation.Nullable List<String> vehicleTypeNotIn, @Param("seatTypeEquals") @jakarta.annotation.Nullable String seatTypeEquals, @Param("seatTypeNotEquals") @jakarta.annotation.Nullable String seatTypeNotEquals, @Param("seatTypeSpecified") @jakarta.annotation.Nullable Boolean seatTypeSpecified, @Param("seatTypeIn") @jakarta.annotation.Nullable List<String> seatTypeIn, @Param("seatTypeNotIn") @jakarta.annotation.Nullable List<String> seatTypeNotIn, @Param("occasionTypeEquals") @jakarta.annotation.Nullable String occasionTypeEquals, @Param("occasionTypeNotEquals") @jakarta.annotation.Nullable String occasionTypeNotEquals, @Param("occasionTypeSpecified") @jakarta.annotation.Nullable Boolean occasionTypeSpecified, @Param("occasionTypeIn") @jakarta.annotation.Nullable List<String> occasionTypeIn, @Param("occasionTypeNotIn") @jakarta.annotation.Nullable List<String> occasionTypeNotIn, @Param("baseFareGreaterThan") @jakarta.annotation.Nullable BigDecimal baseFareGreaterThan, @Param("baseFareLessThan") @jakarta.annotation.Nullable BigDecimal baseFareLessThan, @Param("baseFareGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal baseFareGreaterThanOrEqual, @Param("baseFareLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal baseFareLessThanOrEqual, @Param("baseFareEquals") @jakarta.annotation.Nullable BigDecimal baseFareEquals, @Param("baseFareNotEquals") @jakarta.annotation.Nullable BigDecimal baseFareNotEquals, @Param("baseFareSpecified") @jakarta.annotation.Nullable Boolean baseFareSpecified, @Param("baseFareIn") @jakarta.annotation.Nullable List<BigDecimal> baseFareIn, @Param("baseFareNotIn") @jakarta.annotation.Nullable List<BigDecimal> baseFareNotIn, @Param("vehicleFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal vehicleFactorGreaterThan, @Param("vehicleFactorLessThan") @jakarta.annotation.Nullable BigDecimal vehicleFactorLessThan, @Param("vehicleFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal vehicleFactorGreaterThanOrEqual, @Param("vehicleFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal vehicleFactorLessThanOrEqual, @Param("vehicleFactorEquals") @jakarta.annotation.Nullable BigDecimal vehicleFactorEquals, @Param("vehicleFactorNotEquals") @jakarta.annotation.Nullable BigDecimal vehicleFactorNotEquals, @Param("vehicleFactorSpecified") @jakarta.annotation.Nullable Boolean vehicleFactorSpecified, @Param("vehicleFactorIn") @jakarta.annotation.Nullable List<BigDecimal> vehicleFactorIn, @Param("vehicleFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> vehicleFactorNotIn, @Param("floorFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal floorFactorGreaterThan, @Param("floorFactorLessThan") @jakarta.annotation.Nullable BigDecimal floorFactorLessThan, @Param("floorFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal floorFactorGreaterThanOrEqual, @Param("floorFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal floorFactorLessThanOrEqual, @Param("floorFactorEquals") @jakarta.annotation.Nullable BigDecimal floorFactorEquals, @Param("floorFactorNotEquals") @jakarta.annotation.Nullable BigDecimal floorFactorNotEquals, @Param("floorFactorSpecified") @jakarta.annotation.Nullable Boolean floorFactorSpecified, @Param("floorFactorIn") @jakarta.annotation.Nullable List<BigDecimal> floorFactorIn, @Param("floorFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> floorFactorNotIn, @Param("seatFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal seatFactorGreaterThan, @Param("seatFactorLessThan") @jakarta.annotation.Nullable BigDecimal seatFactorLessThan, @Param("seatFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal seatFactorGreaterThanOrEqual, @Param("seatFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal seatFactorLessThanOrEqual, @Param("seatFactorEquals") @jakarta.annotation.Nullable BigDecimal seatFactorEquals, @Param("seatFactorNotEquals") @jakarta.annotation.Nullable BigDecimal seatFactorNotEquals, @Param("seatFactorSpecified") @jakarta.annotation.Nullable Boolean seatFactorSpecified, @Param("seatFactorIn") @jakarta.annotation.Nullable List<BigDecimal> seatFactorIn, @Param("seatFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> seatFactorNotIn, @Param("occasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThan, @Param("occasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThan, @Param("occasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThanOrEqual, @Param("occasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThanOrEqual, @Param("occasionFactorEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorEquals, @Param("occasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorNotEquals, @Param("occasionFactorSpecified") @jakarta.annotation.Nullable Boolean occasionFactorSpecified, @Param("occasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorIn, @Param("occasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorNotIn, @Param("finalPriceGreaterThan") @jakarta.annotation.Nullable BigDecimal finalPriceGreaterThan, @Param("finalPriceLessThan") @jakarta.annotation.Nullable BigDecimal finalPriceLessThan, @Param("finalPriceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal finalPriceGreaterThanOrEqual, @Param("finalPriceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal finalPriceLessThanOrEqual, @Param("finalPriceEquals") @jakarta.annotation.Nullable BigDecimal finalPriceEquals, @Param("finalPriceNotEquals") @jakarta.annotation.Nullable BigDecimal finalPriceNotEquals, @Param("finalPriceSpecified") @jakarta.annotation.Nullable Boolean finalPriceSpecified, @Param("finalPriceIn") @jakarta.annotation.Nullable List<BigDecimal> finalPriceIn, @Param("finalPriceNotIn") @jakarta.annotation.Nullable List<BigDecimal> finalPriceNotIn, @Param("validFromGreaterThan") @jakarta.annotation.Nullable LocalDate validFromGreaterThan, @Param("validFromLessThan") @jakarta.annotation.Nullable LocalDate validFromLessThan, @Param("validFromGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate validFromGreaterThanOrEqual, @Param("validFromLessThanOrEqual") @jakarta.annotation.Nullable LocalDate validFromLessThanOrEqual, @Param("validFromEquals") @jakarta.annotation.Nullable LocalDate validFromEquals, @Param("validFromNotEquals") @jakarta.annotation.Nullable LocalDate validFromNotEquals, @Param("validFromSpecified") @jakarta.annotation.Nullable Boolean validFromSpecified, @Param("validFromIn") @jakarta.annotation.Nullable List<LocalDate> validFromIn, @Param("validFromNotIn") @jakarta.annotation.Nullable List<LocalDate> validFromNotIn, @Param("validToGreaterThan") @jakarta.annotation.Nullable LocalDate validToGreaterThan, @Param("validToLessThan") @jakarta.annotation.Nullable LocalDate validToLessThan, @Param("validToGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate validToGreaterThanOrEqual, @Param("validToLessThanOrEqual") @jakarta.annotation.Nullable LocalDate validToLessThanOrEqual, @Param("validToEquals") @jakarta.annotation.Nullable LocalDate validToEquals, @Param("validToNotEquals") @jakarta.annotation.Nullable LocalDate validToNotEquals, @Param("validToSpecified") @jakarta.annotation.Nullable Boolean validToSpecified, @Param("validToIn") @jakarta.annotation.Nullable List<LocalDate> validToIn, @Param("validToNotIn") @jakarta.annotation.Nullable List<LocalDate> validToNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countPricingTemplates</code> but it also returns the http response headers .
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
   * @param vehicleTypeEquals  (optional)
   * @param vehicleTypeNotEquals  (optional)
   * @param vehicleTypeSpecified  (optional)
   * @param vehicleTypeIn  (optional)
   * @param vehicleTypeNotIn  (optional)
   * @param seatTypeEquals  (optional)
   * @param seatTypeNotEquals  (optional)
   * @param seatTypeSpecified  (optional)
   * @param seatTypeIn  (optional)
   * @param seatTypeNotIn  (optional)
   * @param occasionTypeEquals  (optional)
   * @param occasionTypeNotEquals  (optional)
   * @param occasionTypeSpecified  (optional)
   * @param occasionTypeIn  (optional)
   * @param occasionTypeNotIn  (optional)
   * @param baseFareGreaterThan  (optional)
   * @param baseFareLessThan  (optional)
   * @param baseFareGreaterThanOrEqual  (optional)
   * @param baseFareLessThanOrEqual  (optional)
   * @param baseFareEquals  (optional)
   * @param baseFareNotEquals  (optional)
   * @param baseFareSpecified  (optional)
   * @param baseFareIn  (optional)
   * @param baseFareNotIn  (optional)
   * @param vehicleFactorGreaterThan  (optional)
   * @param vehicleFactorLessThan  (optional)
   * @param vehicleFactorGreaterThanOrEqual  (optional)
   * @param vehicleFactorLessThanOrEqual  (optional)
   * @param vehicleFactorEquals  (optional)
   * @param vehicleFactorNotEquals  (optional)
   * @param vehicleFactorSpecified  (optional)
   * @param vehicleFactorIn  (optional)
   * @param vehicleFactorNotIn  (optional)
   * @param floorFactorGreaterThan  (optional)
   * @param floorFactorLessThan  (optional)
   * @param floorFactorGreaterThanOrEqual  (optional)
   * @param floorFactorLessThanOrEqual  (optional)
   * @param floorFactorEquals  (optional)
   * @param floorFactorNotEquals  (optional)
   * @param floorFactorSpecified  (optional)
   * @param floorFactorIn  (optional)
   * @param floorFactorNotIn  (optional)
   * @param seatFactorGreaterThan  (optional)
   * @param seatFactorLessThan  (optional)
   * @param seatFactorGreaterThanOrEqual  (optional)
   * @param seatFactorLessThanOrEqual  (optional)
   * @param seatFactorEquals  (optional)
   * @param seatFactorNotEquals  (optional)
   * @param seatFactorSpecified  (optional)
   * @param seatFactorIn  (optional)
   * @param seatFactorNotIn  (optional)
   * @param occasionFactorGreaterThan  (optional)
   * @param occasionFactorLessThan  (optional)
   * @param occasionFactorGreaterThanOrEqual  (optional)
   * @param occasionFactorLessThanOrEqual  (optional)
   * @param occasionFactorEquals  (optional)
   * @param occasionFactorNotEquals  (optional)
   * @param occasionFactorSpecified  (optional)
   * @param occasionFactorIn  (optional)
   * @param occasionFactorNotIn  (optional)
   * @param finalPriceGreaterThan  (optional)
   * @param finalPriceLessThan  (optional)
   * @param finalPriceGreaterThanOrEqual  (optional)
   * @param finalPriceLessThanOrEqual  (optional)
   * @param finalPriceEquals  (optional)
   * @param finalPriceNotEquals  (optional)
   * @param finalPriceSpecified  (optional)
   * @param finalPriceIn  (optional)
   * @param finalPriceNotIn  (optional)
   * @param validFromGreaterThan  (optional)
   * @param validFromLessThan  (optional)
   * @param validFromGreaterThanOrEqual  (optional)
   * @param validFromLessThanOrEqual  (optional)
   * @param validFromEquals  (optional)
   * @param validFromNotEquals  (optional)
   * @param validFromSpecified  (optional)
   * @param validFromIn  (optional)
   * @param validFromNotIn  (optional)
   * @param validToGreaterThan  (optional)
   * @param validToLessThan  (optional)
   * @param validToGreaterThanOrEqual  (optional)
   * @param validToLessThanOrEqual  (optional)
   * @param validToEquals  (optional)
   * @param validToNotEquals  (optional)
   * @param validToSpecified  (optional)
   * @param validToIn  (optional)
   * @param validToNotIn  (optional)
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
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/pricing-templates/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&seatType.equals={seatTypeEquals}&seatType.notEquals={seatTypeNotEquals}&seatType.specified={seatTypeSpecified}&seatType.in={seatTypeIn}&seatType.notIn={seatTypeNotIn}&occasionType.equals={occasionTypeEquals}&occasionType.notEquals={occasionTypeNotEquals}&occasionType.specified={occasionTypeSpecified}&occasionType.in={occasionTypeIn}&occasionType.notIn={occasionTypeNotIn}&baseFare.greaterThan={baseFareGreaterThan}&baseFare.lessThan={baseFareLessThan}&baseFare.greaterThanOrEqual={baseFareGreaterThanOrEqual}&baseFare.lessThanOrEqual={baseFareLessThanOrEqual}&baseFare.equals={baseFareEquals}&baseFare.notEquals={baseFareNotEquals}&baseFare.specified={baseFareSpecified}&baseFare.in={baseFareIn}&baseFare.notIn={baseFareNotIn}&vehicleFactor.greaterThan={vehicleFactorGreaterThan}&vehicleFactor.lessThan={vehicleFactorLessThan}&vehicleFactor.greaterThanOrEqual={vehicleFactorGreaterThanOrEqual}&vehicleFactor.lessThanOrEqual={vehicleFactorLessThanOrEqual}&vehicleFactor.equals={vehicleFactorEquals}&vehicleFactor.notEquals={vehicleFactorNotEquals}&vehicleFactor.specified={vehicleFactorSpecified}&vehicleFactor.in={vehicleFactorIn}&vehicleFactor.notIn={vehicleFactorNotIn}&floorFactor.greaterThan={floorFactorGreaterThan}&floorFactor.lessThan={floorFactorLessThan}&floorFactor.greaterThanOrEqual={floorFactorGreaterThanOrEqual}&floorFactor.lessThanOrEqual={floorFactorLessThanOrEqual}&floorFactor.equals={floorFactorEquals}&floorFactor.notEquals={floorFactorNotEquals}&floorFactor.specified={floorFactorSpecified}&floorFactor.in={floorFactorIn}&floorFactor.notIn={floorFactorNotIn}&seatFactor.greaterThan={seatFactorGreaterThan}&seatFactor.lessThan={seatFactorLessThan}&seatFactor.greaterThanOrEqual={seatFactorGreaterThanOrEqual}&seatFactor.lessThanOrEqual={seatFactorLessThanOrEqual}&seatFactor.equals={seatFactorEquals}&seatFactor.notEquals={seatFactorNotEquals}&seatFactor.specified={seatFactorSpecified}&seatFactor.in={seatFactorIn}&seatFactor.notIn={seatFactorNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&finalPrice.greaterThan={finalPriceGreaterThan}&finalPrice.lessThan={finalPriceLessThan}&finalPrice.greaterThanOrEqual={finalPriceGreaterThanOrEqual}&finalPrice.lessThanOrEqual={finalPriceLessThanOrEqual}&finalPrice.equals={finalPriceEquals}&finalPrice.notEquals={finalPriceNotEquals}&finalPrice.specified={finalPriceSpecified}&finalPrice.in={finalPriceIn}&finalPrice.notIn={finalPriceNotIn}&validFrom.greaterThan={validFromGreaterThan}&validFrom.lessThan={validFromLessThan}&validFrom.greaterThanOrEqual={validFromGreaterThanOrEqual}&validFrom.lessThanOrEqual={validFromLessThanOrEqual}&validFrom.equals={validFromEquals}&validFrom.notEquals={validFromNotEquals}&validFrom.specified={validFromSpecified}&validFrom.in={validFromIn}&validFrom.notIn={validFromNotIn}&validTo.greaterThan={validToGreaterThan}&validTo.lessThan={validToLessThan}&validTo.greaterThanOrEqual={validToGreaterThanOrEqual}&validTo.lessThanOrEqual={validToLessThanOrEqual}&validTo.equals={validToEquals}&validTo.notEquals={validToNotEquals}&validTo.specified={validToSpecified}&validTo.in={validToIn}&validTo.notIn={validToNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countPricingTemplatesWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("vehicleTypeEquals") @jakarta.annotation.Nullable String vehicleTypeEquals, @Param("vehicleTypeNotEquals") @jakarta.annotation.Nullable String vehicleTypeNotEquals, @Param("vehicleTypeSpecified") @jakarta.annotation.Nullable Boolean vehicleTypeSpecified, @Param("vehicleTypeIn") @jakarta.annotation.Nullable List<String> vehicleTypeIn, @Param("vehicleTypeNotIn") @jakarta.annotation.Nullable List<String> vehicleTypeNotIn, @Param("seatTypeEquals") @jakarta.annotation.Nullable String seatTypeEquals, @Param("seatTypeNotEquals") @jakarta.annotation.Nullable String seatTypeNotEquals, @Param("seatTypeSpecified") @jakarta.annotation.Nullable Boolean seatTypeSpecified, @Param("seatTypeIn") @jakarta.annotation.Nullable List<String> seatTypeIn, @Param("seatTypeNotIn") @jakarta.annotation.Nullable List<String> seatTypeNotIn, @Param("occasionTypeEquals") @jakarta.annotation.Nullable String occasionTypeEquals, @Param("occasionTypeNotEquals") @jakarta.annotation.Nullable String occasionTypeNotEquals, @Param("occasionTypeSpecified") @jakarta.annotation.Nullable Boolean occasionTypeSpecified, @Param("occasionTypeIn") @jakarta.annotation.Nullable List<String> occasionTypeIn, @Param("occasionTypeNotIn") @jakarta.annotation.Nullable List<String> occasionTypeNotIn, @Param("baseFareGreaterThan") @jakarta.annotation.Nullable BigDecimal baseFareGreaterThan, @Param("baseFareLessThan") @jakarta.annotation.Nullable BigDecimal baseFareLessThan, @Param("baseFareGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal baseFareGreaterThanOrEqual, @Param("baseFareLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal baseFareLessThanOrEqual, @Param("baseFareEquals") @jakarta.annotation.Nullable BigDecimal baseFareEquals, @Param("baseFareNotEquals") @jakarta.annotation.Nullable BigDecimal baseFareNotEquals, @Param("baseFareSpecified") @jakarta.annotation.Nullable Boolean baseFareSpecified, @Param("baseFareIn") @jakarta.annotation.Nullable List<BigDecimal> baseFareIn, @Param("baseFareNotIn") @jakarta.annotation.Nullable List<BigDecimal> baseFareNotIn, @Param("vehicleFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal vehicleFactorGreaterThan, @Param("vehicleFactorLessThan") @jakarta.annotation.Nullable BigDecimal vehicleFactorLessThan, @Param("vehicleFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal vehicleFactorGreaterThanOrEqual, @Param("vehicleFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal vehicleFactorLessThanOrEqual, @Param("vehicleFactorEquals") @jakarta.annotation.Nullable BigDecimal vehicleFactorEquals, @Param("vehicleFactorNotEquals") @jakarta.annotation.Nullable BigDecimal vehicleFactorNotEquals, @Param("vehicleFactorSpecified") @jakarta.annotation.Nullable Boolean vehicleFactorSpecified, @Param("vehicleFactorIn") @jakarta.annotation.Nullable List<BigDecimal> vehicleFactorIn, @Param("vehicleFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> vehicleFactorNotIn, @Param("floorFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal floorFactorGreaterThan, @Param("floorFactorLessThan") @jakarta.annotation.Nullable BigDecimal floorFactorLessThan, @Param("floorFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal floorFactorGreaterThanOrEqual, @Param("floorFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal floorFactorLessThanOrEqual, @Param("floorFactorEquals") @jakarta.annotation.Nullable BigDecimal floorFactorEquals, @Param("floorFactorNotEquals") @jakarta.annotation.Nullable BigDecimal floorFactorNotEquals, @Param("floorFactorSpecified") @jakarta.annotation.Nullable Boolean floorFactorSpecified, @Param("floorFactorIn") @jakarta.annotation.Nullable List<BigDecimal> floorFactorIn, @Param("floorFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> floorFactorNotIn, @Param("seatFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal seatFactorGreaterThan, @Param("seatFactorLessThan") @jakarta.annotation.Nullable BigDecimal seatFactorLessThan, @Param("seatFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal seatFactorGreaterThanOrEqual, @Param("seatFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal seatFactorLessThanOrEqual, @Param("seatFactorEquals") @jakarta.annotation.Nullable BigDecimal seatFactorEquals, @Param("seatFactorNotEquals") @jakarta.annotation.Nullable BigDecimal seatFactorNotEquals, @Param("seatFactorSpecified") @jakarta.annotation.Nullable Boolean seatFactorSpecified, @Param("seatFactorIn") @jakarta.annotation.Nullable List<BigDecimal> seatFactorIn, @Param("seatFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> seatFactorNotIn, @Param("occasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThan, @Param("occasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThan, @Param("occasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThanOrEqual, @Param("occasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThanOrEqual, @Param("occasionFactorEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorEquals, @Param("occasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorNotEquals, @Param("occasionFactorSpecified") @jakarta.annotation.Nullable Boolean occasionFactorSpecified, @Param("occasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorIn, @Param("occasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorNotIn, @Param("finalPriceGreaterThan") @jakarta.annotation.Nullable BigDecimal finalPriceGreaterThan, @Param("finalPriceLessThan") @jakarta.annotation.Nullable BigDecimal finalPriceLessThan, @Param("finalPriceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal finalPriceGreaterThanOrEqual, @Param("finalPriceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal finalPriceLessThanOrEqual, @Param("finalPriceEquals") @jakarta.annotation.Nullable BigDecimal finalPriceEquals, @Param("finalPriceNotEquals") @jakarta.annotation.Nullable BigDecimal finalPriceNotEquals, @Param("finalPriceSpecified") @jakarta.annotation.Nullable Boolean finalPriceSpecified, @Param("finalPriceIn") @jakarta.annotation.Nullable List<BigDecimal> finalPriceIn, @Param("finalPriceNotIn") @jakarta.annotation.Nullable List<BigDecimal> finalPriceNotIn, @Param("validFromGreaterThan") @jakarta.annotation.Nullable LocalDate validFromGreaterThan, @Param("validFromLessThan") @jakarta.annotation.Nullable LocalDate validFromLessThan, @Param("validFromGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate validFromGreaterThanOrEqual, @Param("validFromLessThanOrEqual") @jakarta.annotation.Nullable LocalDate validFromLessThanOrEqual, @Param("validFromEquals") @jakarta.annotation.Nullable LocalDate validFromEquals, @Param("validFromNotEquals") @jakarta.annotation.Nullable LocalDate validFromNotEquals, @Param("validFromSpecified") @jakarta.annotation.Nullable Boolean validFromSpecified, @Param("validFromIn") @jakarta.annotation.Nullable List<LocalDate> validFromIn, @Param("validFromNotIn") @jakarta.annotation.Nullable List<LocalDate> validFromNotIn, @Param("validToGreaterThan") @jakarta.annotation.Nullable LocalDate validToGreaterThan, @Param("validToLessThan") @jakarta.annotation.Nullable LocalDate validToLessThan, @Param("validToGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate validToGreaterThanOrEqual, @Param("validToLessThanOrEqual") @jakarta.annotation.Nullable LocalDate validToLessThanOrEqual, @Param("validToEquals") @jakarta.annotation.Nullable LocalDate validToEquals, @Param("validToNotEquals") @jakarta.annotation.Nullable LocalDate validToNotEquals, @Param("validToSpecified") @jakarta.annotation.Nullable Boolean validToSpecified, @Param("validToIn") @jakarta.annotation.Nullable List<LocalDate> validToIn, @Param("validToNotIn") @jakarta.annotation.Nullable List<LocalDate> validToNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countPricingTemplates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountPricingTemplatesQueryParams} class that allows for
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
   *   <li>vehicleTypeEquals -  (optional)</li>
   *   <li>vehicleTypeNotEquals -  (optional)</li>
   *   <li>vehicleTypeSpecified -  (optional)</li>
   *   <li>vehicleTypeIn -  (optional)</li>
   *   <li>vehicleTypeNotIn -  (optional)</li>
   *   <li>seatTypeEquals -  (optional)</li>
   *   <li>seatTypeNotEquals -  (optional)</li>
   *   <li>seatTypeSpecified -  (optional)</li>
   *   <li>seatTypeIn -  (optional)</li>
   *   <li>seatTypeNotIn -  (optional)</li>
   *   <li>occasionTypeEquals -  (optional)</li>
   *   <li>occasionTypeNotEquals -  (optional)</li>
   *   <li>occasionTypeSpecified -  (optional)</li>
   *   <li>occasionTypeIn -  (optional)</li>
   *   <li>occasionTypeNotIn -  (optional)</li>
   *   <li>baseFareGreaterThan -  (optional)</li>
   *   <li>baseFareLessThan -  (optional)</li>
   *   <li>baseFareGreaterThanOrEqual -  (optional)</li>
   *   <li>baseFareLessThanOrEqual -  (optional)</li>
   *   <li>baseFareEquals -  (optional)</li>
   *   <li>baseFareNotEquals -  (optional)</li>
   *   <li>baseFareSpecified -  (optional)</li>
   *   <li>baseFareIn -  (optional)</li>
   *   <li>baseFareNotIn -  (optional)</li>
   *   <li>vehicleFactorGreaterThan -  (optional)</li>
   *   <li>vehicleFactorLessThan -  (optional)</li>
   *   <li>vehicleFactorGreaterThanOrEqual -  (optional)</li>
   *   <li>vehicleFactorLessThanOrEqual -  (optional)</li>
   *   <li>vehicleFactorEquals -  (optional)</li>
   *   <li>vehicleFactorNotEquals -  (optional)</li>
   *   <li>vehicleFactorSpecified -  (optional)</li>
   *   <li>vehicleFactorIn -  (optional)</li>
   *   <li>vehicleFactorNotIn -  (optional)</li>
   *   <li>floorFactorGreaterThan -  (optional)</li>
   *   <li>floorFactorLessThan -  (optional)</li>
   *   <li>floorFactorGreaterThanOrEqual -  (optional)</li>
   *   <li>floorFactorLessThanOrEqual -  (optional)</li>
   *   <li>floorFactorEquals -  (optional)</li>
   *   <li>floorFactorNotEquals -  (optional)</li>
   *   <li>floorFactorSpecified -  (optional)</li>
   *   <li>floorFactorIn -  (optional)</li>
   *   <li>floorFactorNotIn -  (optional)</li>
   *   <li>seatFactorGreaterThan -  (optional)</li>
   *   <li>seatFactorLessThan -  (optional)</li>
   *   <li>seatFactorGreaterThanOrEqual -  (optional)</li>
   *   <li>seatFactorLessThanOrEqual -  (optional)</li>
   *   <li>seatFactorEquals -  (optional)</li>
   *   <li>seatFactorNotEquals -  (optional)</li>
   *   <li>seatFactorSpecified -  (optional)</li>
   *   <li>seatFactorIn -  (optional)</li>
   *   <li>seatFactorNotIn -  (optional)</li>
   *   <li>occasionFactorGreaterThan -  (optional)</li>
   *   <li>occasionFactorLessThan -  (optional)</li>
   *   <li>occasionFactorGreaterThanOrEqual -  (optional)</li>
   *   <li>occasionFactorLessThanOrEqual -  (optional)</li>
   *   <li>occasionFactorEquals -  (optional)</li>
   *   <li>occasionFactorNotEquals -  (optional)</li>
   *   <li>occasionFactorSpecified -  (optional)</li>
   *   <li>occasionFactorIn -  (optional)</li>
   *   <li>occasionFactorNotIn -  (optional)</li>
   *   <li>finalPriceGreaterThan -  (optional)</li>
   *   <li>finalPriceLessThan -  (optional)</li>
   *   <li>finalPriceGreaterThanOrEqual -  (optional)</li>
   *   <li>finalPriceLessThanOrEqual -  (optional)</li>
   *   <li>finalPriceEquals -  (optional)</li>
   *   <li>finalPriceNotEquals -  (optional)</li>
   *   <li>finalPriceSpecified -  (optional)</li>
   *   <li>finalPriceIn -  (optional)</li>
   *   <li>finalPriceNotIn -  (optional)</li>
   *   <li>validFromGreaterThan -  (optional)</li>
   *   <li>validFromLessThan -  (optional)</li>
   *   <li>validFromGreaterThanOrEqual -  (optional)</li>
   *   <li>validFromLessThanOrEqual -  (optional)</li>
   *   <li>validFromEquals -  (optional)</li>
   *   <li>validFromNotEquals -  (optional)</li>
   *   <li>validFromSpecified -  (optional)</li>
   *   <li>validFromIn -  (optional)</li>
   *   <li>validFromNotIn -  (optional)</li>
   *   <li>validToGreaterThan -  (optional)</li>
   *   <li>validToLessThan -  (optional)</li>
   *   <li>validToGreaterThanOrEqual -  (optional)</li>
   *   <li>validToLessThanOrEqual -  (optional)</li>
   *   <li>validToEquals -  (optional)</li>
   *   <li>validToNotEquals -  (optional)</li>
   *   <li>validToSpecified -  (optional)</li>
   *   <li>validToIn -  (optional)</li>
   *   <li>validToNotIn -  (optional)</li>
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
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return Long
   */
  @RequestLine("GET /api/pricing-templates/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&seatType.equals={seatTypeEquals}&seatType.notEquals={seatTypeNotEquals}&seatType.specified={seatTypeSpecified}&seatType.in={seatTypeIn}&seatType.notIn={seatTypeNotIn}&occasionType.equals={occasionTypeEquals}&occasionType.notEquals={occasionTypeNotEquals}&occasionType.specified={occasionTypeSpecified}&occasionType.in={occasionTypeIn}&occasionType.notIn={occasionTypeNotIn}&baseFare.greaterThan={baseFareGreaterThan}&baseFare.lessThan={baseFareLessThan}&baseFare.greaterThanOrEqual={baseFareGreaterThanOrEqual}&baseFare.lessThanOrEqual={baseFareLessThanOrEqual}&baseFare.equals={baseFareEquals}&baseFare.notEquals={baseFareNotEquals}&baseFare.specified={baseFareSpecified}&baseFare.in={baseFareIn}&baseFare.notIn={baseFareNotIn}&vehicleFactor.greaterThan={vehicleFactorGreaterThan}&vehicleFactor.lessThan={vehicleFactorLessThan}&vehicleFactor.greaterThanOrEqual={vehicleFactorGreaterThanOrEqual}&vehicleFactor.lessThanOrEqual={vehicleFactorLessThanOrEqual}&vehicleFactor.equals={vehicleFactorEquals}&vehicleFactor.notEquals={vehicleFactorNotEquals}&vehicleFactor.specified={vehicleFactorSpecified}&vehicleFactor.in={vehicleFactorIn}&vehicleFactor.notIn={vehicleFactorNotIn}&floorFactor.greaterThan={floorFactorGreaterThan}&floorFactor.lessThan={floorFactorLessThan}&floorFactor.greaterThanOrEqual={floorFactorGreaterThanOrEqual}&floorFactor.lessThanOrEqual={floorFactorLessThanOrEqual}&floorFactor.equals={floorFactorEquals}&floorFactor.notEquals={floorFactorNotEquals}&floorFactor.specified={floorFactorSpecified}&floorFactor.in={floorFactorIn}&floorFactor.notIn={floorFactorNotIn}&seatFactor.greaterThan={seatFactorGreaterThan}&seatFactor.lessThan={seatFactorLessThan}&seatFactor.greaterThanOrEqual={seatFactorGreaterThanOrEqual}&seatFactor.lessThanOrEqual={seatFactorLessThanOrEqual}&seatFactor.equals={seatFactorEquals}&seatFactor.notEquals={seatFactorNotEquals}&seatFactor.specified={seatFactorSpecified}&seatFactor.in={seatFactorIn}&seatFactor.notIn={seatFactorNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&finalPrice.greaterThan={finalPriceGreaterThan}&finalPrice.lessThan={finalPriceLessThan}&finalPrice.greaterThanOrEqual={finalPriceGreaterThanOrEqual}&finalPrice.lessThanOrEqual={finalPriceLessThanOrEqual}&finalPrice.equals={finalPriceEquals}&finalPrice.notEquals={finalPriceNotEquals}&finalPrice.specified={finalPriceSpecified}&finalPrice.in={finalPriceIn}&finalPrice.notIn={finalPriceNotIn}&validFrom.greaterThan={validFromGreaterThan}&validFrom.lessThan={validFromLessThan}&validFrom.greaterThanOrEqual={validFromGreaterThanOrEqual}&validFrom.lessThanOrEqual={validFromLessThanOrEqual}&validFrom.equals={validFromEquals}&validFrom.notEquals={validFromNotEquals}&validFrom.specified={validFromSpecified}&validFrom.in={validFromIn}&validFrom.notIn={validFromNotIn}&validTo.greaterThan={validToGreaterThan}&validTo.lessThan={validToLessThan}&validTo.greaterThanOrEqual={validToGreaterThanOrEqual}&validTo.lessThanOrEqual={validToLessThanOrEqual}&validTo.equals={validToEquals}&validTo.notEquals={validToNotEquals}&validTo.specified={validToSpecified}&validTo.in={validToIn}&validTo.notIn={validToNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countPricingTemplates(@QueryMap(encoded=true) CountPricingTemplatesQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countPricingTemplates</code> that receives the query parameters as a map,
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
          *   <li>vehicleTypeEquals -  (optional)</li>
          *   <li>vehicleTypeNotEquals -  (optional)</li>
          *   <li>vehicleTypeSpecified -  (optional)</li>
          *   <li>vehicleTypeIn -  (optional)</li>
          *   <li>vehicleTypeNotIn -  (optional)</li>
          *   <li>seatTypeEquals -  (optional)</li>
          *   <li>seatTypeNotEquals -  (optional)</li>
          *   <li>seatTypeSpecified -  (optional)</li>
          *   <li>seatTypeIn -  (optional)</li>
          *   <li>seatTypeNotIn -  (optional)</li>
          *   <li>occasionTypeEquals -  (optional)</li>
          *   <li>occasionTypeNotEquals -  (optional)</li>
          *   <li>occasionTypeSpecified -  (optional)</li>
          *   <li>occasionTypeIn -  (optional)</li>
          *   <li>occasionTypeNotIn -  (optional)</li>
          *   <li>baseFareGreaterThan -  (optional)</li>
          *   <li>baseFareLessThan -  (optional)</li>
          *   <li>baseFareGreaterThanOrEqual -  (optional)</li>
          *   <li>baseFareLessThanOrEqual -  (optional)</li>
          *   <li>baseFareEquals -  (optional)</li>
          *   <li>baseFareNotEquals -  (optional)</li>
          *   <li>baseFareSpecified -  (optional)</li>
          *   <li>baseFareIn -  (optional)</li>
          *   <li>baseFareNotIn -  (optional)</li>
          *   <li>vehicleFactorGreaterThan -  (optional)</li>
          *   <li>vehicleFactorLessThan -  (optional)</li>
          *   <li>vehicleFactorGreaterThanOrEqual -  (optional)</li>
          *   <li>vehicleFactorLessThanOrEqual -  (optional)</li>
          *   <li>vehicleFactorEquals -  (optional)</li>
          *   <li>vehicleFactorNotEquals -  (optional)</li>
          *   <li>vehicleFactorSpecified -  (optional)</li>
          *   <li>vehicleFactorIn -  (optional)</li>
          *   <li>vehicleFactorNotIn -  (optional)</li>
          *   <li>floorFactorGreaterThan -  (optional)</li>
          *   <li>floorFactorLessThan -  (optional)</li>
          *   <li>floorFactorGreaterThanOrEqual -  (optional)</li>
          *   <li>floorFactorLessThanOrEqual -  (optional)</li>
          *   <li>floorFactorEquals -  (optional)</li>
          *   <li>floorFactorNotEquals -  (optional)</li>
          *   <li>floorFactorSpecified -  (optional)</li>
          *   <li>floorFactorIn -  (optional)</li>
          *   <li>floorFactorNotIn -  (optional)</li>
          *   <li>seatFactorGreaterThan -  (optional)</li>
          *   <li>seatFactorLessThan -  (optional)</li>
          *   <li>seatFactorGreaterThanOrEqual -  (optional)</li>
          *   <li>seatFactorLessThanOrEqual -  (optional)</li>
          *   <li>seatFactorEquals -  (optional)</li>
          *   <li>seatFactorNotEquals -  (optional)</li>
          *   <li>seatFactorSpecified -  (optional)</li>
          *   <li>seatFactorIn -  (optional)</li>
          *   <li>seatFactorNotIn -  (optional)</li>
          *   <li>occasionFactorGreaterThan -  (optional)</li>
          *   <li>occasionFactorLessThan -  (optional)</li>
          *   <li>occasionFactorGreaterThanOrEqual -  (optional)</li>
          *   <li>occasionFactorLessThanOrEqual -  (optional)</li>
          *   <li>occasionFactorEquals -  (optional)</li>
          *   <li>occasionFactorNotEquals -  (optional)</li>
          *   <li>occasionFactorSpecified -  (optional)</li>
          *   <li>occasionFactorIn -  (optional)</li>
          *   <li>occasionFactorNotIn -  (optional)</li>
          *   <li>finalPriceGreaterThan -  (optional)</li>
          *   <li>finalPriceLessThan -  (optional)</li>
          *   <li>finalPriceGreaterThanOrEqual -  (optional)</li>
          *   <li>finalPriceLessThanOrEqual -  (optional)</li>
          *   <li>finalPriceEquals -  (optional)</li>
          *   <li>finalPriceNotEquals -  (optional)</li>
          *   <li>finalPriceSpecified -  (optional)</li>
          *   <li>finalPriceIn -  (optional)</li>
          *   <li>finalPriceNotIn -  (optional)</li>
          *   <li>validFromGreaterThan -  (optional)</li>
          *   <li>validFromLessThan -  (optional)</li>
          *   <li>validFromGreaterThanOrEqual -  (optional)</li>
          *   <li>validFromLessThanOrEqual -  (optional)</li>
          *   <li>validFromEquals -  (optional)</li>
          *   <li>validFromNotEquals -  (optional)</li>
          *   <li>validFromSpecified -  (optional)</li>
          *   <li>validFromIn -  (optional)</li>
          *   <li>validFromNotIn -  (optional)</li>
          *   <li>validToGreaterThan -  (optional)</li>
          *   <li>validToLessThan -  (optional)</li>
          *   <li>validToGreaterThanOrEqual -  (optional)</li>
          *   <li>validToLessThanOrEqual -  (optional)</li>
          *   <li>validToEquals -  (optional)</li>
          *   <li>validToNotEquals -  (optional)</li>
          *   <li>validToSpecified -  (optional)</li>
          *   <li>validToIn -  (optional)</li>
          *   <li>validToNotIn -  (optional)</li>
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
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return Long
      */
      @RequestLine("GET /api/pricing-templates/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&seatType.equals={seatTypeEquals}&seatType.notEquals={seatTypeNotEquals}&seatType.specified={seatTypeSpecified}&seatType.in={seatTypeIn}&seatType.notIn={seatTypeNotIn}&occasionType.equals={occasionTypeEquals}&occasionType.notEquals={occasionTypeNotEquals}&occasionType.specified={occasionTypeSpecified}&occasionType.in={occasionTypeIn}&occasionType.notIn={occasionTypeNotIn}&baseFare.greaterThan={baseFareGreaterThan}&baseFare.lessThan={baseFareLessThan}&baseFare.greaterThanOrEqual={baseFareGreaterThanOrEqual}&baseFare.lessThanOrEqual={baseFareLessThanOrEqual}&baseFare.equals={baseFareEquals}&baseFare.notEquals={baseFareNotEquals}&baseFare.specified={baseFareSpecified}&baseFare.in={baseFareIn}&baseFare.notIn={baseFareNotIn}&vehicleFactor.greaterThan={vehicleFactorGreaterThan}&vehicleFactor.lessThan={vehicleFactorLessThan}&vehicleFactor.greaterThanOrEqual={vehicleFactorGreaterThanOrEqual}&vehicleFactor.lessThanOrEqual={vehicleFactorLessThanOrEqual}&vehicleFactor.equals={vehicleFactorEquals}&vehicleFactor.notEquals={vehicleFactorNotEquals}&vehicleFactor.specified={vehicleFactorSpecified}&vehicleFactor.in={vehicleFactorIn}&vehicleFactor.notIn={vehicleFactorNotIn}&floorFactor.greaterThan={floorFactorGreaterThan}&floorFactor.lessThan={floorFactorLessThan}&floorFactor.greaterThanOrEqual={floorFactorGreaterThanOrEqual}&floorFactor.lessThanOrEqual={floorFactorLessThanOrEqual}&floorFactor.equals={floorFactorEquals}&floorFactor.notEquals={floorFactorNotEquals}&floorFactor.specified={floorFactorSpecified}&floorFactor.in={floorFactorIn}&floorFactor.notIn={floorFactorNotIn}&seatFactor.greaterThan={seatFactorGreaterThan}&seatFactor.lessThan={seatFactorLessThan}&seatFactor.greaterThanOrEqual={seatFactorGreaterThanOrEqual}&seatFactor.lessThanOrEqual={seatFactorLessThanOrEqual}&seatFactor.equals={seatFactorEquals}&seatFactor.notEquals={seatFactorNotEquals}&seatFactor.specified={seatFactorSpecified}&seatFactor.in={seatFactorIn}&seatFactor.notIn={seatFactorNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&finalPrice.greaterThan={finalPriceGreaterThan}&finalPrice.lessThan={finalPriceLessThan}&finalPrice.greaterThanOrEqual={finalPriceGreaterThanOrEqual}&finalPrice.lessThanOrEqual={finalPriceLessThanOrEqual}&finalPrice.equals={finalPriceEquals}&finalPrice.notEquals={finalPriceNotEquals}&finalPrice.specified={finalPriceSpecified}&finalPrice.in={finalPriceIn}&finalPrice.notIn={finalPriceNotIn}&validFrom.greaterThan={validFromGreaterThan}&validFrom.lessThan={validFromLessThan}&validFrom.greaterThanOrEqual={validFromGreaterThanOrEqual}&validFrom.lessThanOrEqual={validFromLessThanOrEqual}&validFrom.equals={validFromEquals}&validFrom.notEquals={validFromNotEquals}&validFrom.specified={validFromSpecified}&validFrom.in={validFromIn}&validFrom.notIn={validFromNotIn}&validTo.greaterThan={validToGreaterThan}&validTo.lessThan={validToLessThan}&validTo.greaterThanOrEqual={validToGreaterThanOrEqual}&validTo.lessThanOrEqual={validToLessThanOrEqual}&validTo.equals={validToEquals}&validTo.notEquals={validToNotEquals}&validTo.specified={validToSpecified}&validTo.in={validToIn}&validTo.notIn={validToNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countPricingTemplatesWithHttpInfo(@QueryMap(encoded=true) CountPricingTemplatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countPricingTemplates</code> method in a fluent style.
   */
  public static class CountPricingTemplatesQueryParams extends HashMap<String, Object> {
    public CountPricingTemplatesQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams vehicleTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("vehicleType.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams vehicleTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("vehicleType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams vehicleTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehicleType.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams vehicleTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehicleType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams vehicleTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehicleType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams seatTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("seatType.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams seatTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("seatType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams seatTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("seatType.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams seatTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("seatType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams seatTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("seatType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams occasionTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("occasionType.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams occasionTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("occasionType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams occasionTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occasionType.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams occasionTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("occasionType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams occasionTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("occasionType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams baseFareGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams baseFareLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams baseFareGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams baseFareLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams baseFareEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams baseFareNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams baseFareSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("baseFare.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams baseFareIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("baseFare.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams baseFareNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("baseFare.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams vehicleFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams vehicleFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams vehicleFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams vehicleFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams vehicleFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams vehicleFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams vehicleFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehicleFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams vehicleFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("vehicleFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams vehicleFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("vehicleFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams floorFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams floorFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams floorFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams floorFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams floorFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams floorFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams floorFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("floorFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams floorFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("floorFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams floorFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("floorFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams seatFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams seatFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams seatFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams seatFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams seatFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams seatFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams seatFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("seatFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams seatFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("seatFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams seatFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("seatFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams occasionFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams occasionFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams occasionFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams occasionFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams occasionFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams occasionFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams occasionFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occasionFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams occasionFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occasionFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams occasionFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occasionFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams finalPriceGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams finalPriceLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams finalPriceGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams finalPriceLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams finalPriceEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams finalPriceNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams finalPriceSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("finalPrice.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams finalPriceIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("finalPrice.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams finalPriceNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("finalPrice.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams validFromGreaterThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams validFromLessThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams validFromGreaterThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams validFromLessThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams validFromEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams validFromNotEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams validFromSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("validFrom.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams validFromIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("validFrom.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams validFromNotIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("validFrom.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams validToGreaterThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams validToLessThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams validToGreaterThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams validToLessThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams validToEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams validToNotEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams validToSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("validTo.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams validToIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("validTo.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams validToNotIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("validTo.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams routeIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams routeIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams routeIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams routeIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams routeIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams routeIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams routeIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("routeId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingTemplatesQueryParams routeIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams routeIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingTemplatesQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param pricingTemplateDTO  (required)
   * @return PricingTemplateDTO
   */
  @RequestLine("POST /api/pricing-templates")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  PricingTemplateDTO createPricingTemplate(@jakarta.annotation.Nonnull PricingTemplateDTO pricingTemplateDTO);

  /**
   * 
   * Similar to <code>createPricingTemplate</code> but it also returns the http response headers .
   * 
   * @param pricingTemplateDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/pricing-templates")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<PricingTemplateDTO> createPricingTemplateWithHttpInfo(@jakarta.annotation.Nonnull PricingTemplateDTO pricingTemplateDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/pricing-templates/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deletePricingTemplate(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deletePricingTemplate</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/pricing-templates/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deletePricingTemplateWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



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
   * @param vehicleTypeEquals  (optional)
   * @param vehicleTypeNotEquals  (optional)
   * @param vehicleTypeSpecified  (optional)
   * @param vehicleTypeIn  (optional)
   * @param vehicleTypeNotIn  (optional)
   * @param seatTypeEquals  (optional)
   * @param seatTypeNotEquals  (optional)
   * @param seatTypeSpecified  (optional)
   * @param seatTypeIn  (optional)
   * @param seatTypeNotIn  (optional)
   * @param occasionTypeEquals  (optional)
   * @param occasionTypeNotEquals  (optional)
   * @param occasionTypeSpecified  (optional)
   * @param occasionTypeIn  (optional)
   * @param occasionTypeNotIn  (optional)
   * @param baseFareGreaterThan  (optional)
   * @param baseFareLessThan  (optional)
   * @param baseFareGreaterThanOrEqual  (optional)
   * @param baseFareLessThanOrEqual  (optional)
   * @param baseFareEquals  (optional)
   * @param baseFareNotEquals  (optional)
   * @param baseFareSpecified  (optional)
   * @param baseFareIn  (optional)
   * @param baseFareNotIn  (optional)
   * @param vehicleFactorGreaterThan  (optional)
   * @param vehicleFactorLessThan  (optional)
   * @param vehicleFactorGreaterThanOrEqual  (optional)
   * @param vehicleFactorLessThanOrEqual  (optional)
   * @param vehicleFactorEquals  (optional)
   * @param vehicleFactorNotEquals  (optional)
   * @param vehicleFactorSpecified  (optional)
   * @param vehicleFactorIn  (optional)
   * @param vehicleFactorNotIn  (optional)
   * @param floorFactorGreaterThan  (optional)
   * @param floorFactorLessThan  (optional)
   * @param floorFactorGreaterThanOrEqual  (optional)
   * @param floorFactorLessThanOrEqual  (optional)
   * @param floorFactorEquals  (optional)
   * @param floorFactorNotEquals  (optional)
   * @param floorFactorSpecified  (optional)
   * @param floorFactorIn  (optional)
   * @param floorFactorNotIn  (optional)
   * @param seatFactorGreaterThan  (optional)
   * @param seatFactorLessThan  (optional)
   * @param seatFactorGreaterThanOrEqual  (optional)
   * @param seatFactorLessThanOrEqual  (optional)
   * @param seatFactorEquals  (optional)
   * @param seatFactorNotEquals  (optional)
   * @param seatFactorSpecified  (optional)
   * @param seatFactorIn  (optional)
   * @param seatFactorNotIn  (optional)
   * @param occasionFactorGreaterThan  (optional)
   * @param occasionFactorLessThan  (optional)
   * @param occasionFactorGreaterThanOrEqual  (optional)
   * @param occasionFactorLessThanOrEqual  (optional)
   * @param occasionFactorEquals  (optional)
   * @param occasionFactorNotEquals  (optional)
   * @param occasionFactorSpecified  (optional)
   * @param occasionFactorIn  (optional)
   * @param occasionFactorNotIn  (optional)
   * @param finalPriceGreaterThan  (optional)
   * @param finalPriceLessThan  (optional)
   * @param finalPriceGreaterThanOrEqual  (optional)
   * @param finalPriceLessThanOrEqual  (optional)
   * @param finalPriceEquals  (optional)
   * @param finalPriceNotEquals  (optional)
   * @param finalPriceSpecified  (optional)
   * @param finalPriceIn  (optional)
   * @param finalPriceNotIn  (optional)
   * @param validFromGreaterThan  (optional)
   * @param validFromLessThan  (optional)
   * @param validFromGreaterThanOrEqual  (optional)
   * @param validFromLessThanOrEqual  (optional)
   * @param validFromEquals  (optional)
   * @param validFromNotEquals  (optional)
   * @param validFromSpecified  (optional)
   * @param validFromIn  (optional)
   * @param validFromNotIn  (optional)
   * @param validToGreaterThan  (optional)
   * @param validToLessThan  (optional)
   * @param validToGreaterThanOrEqual  (optional)
   * @param validToLessThanOrEqual  (optional)
   * @param validToEquals  (optional)
   * @param validToNotEquals  (optional)
   * @param validToSpecified  (optional)
   * @param validToIn  (optional)
   * @param validToNotIn  (optional)
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
   * @param distinct  (optional)
   * @param page Zero-based page index (0..N) (optional, default to 0)
   * @param size The size of the page to be returned (optional, default to 20)
   * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return List&lt;PricingTemplateDTO&gt;
   */
  @RequestLine("GET /api/pricing-templates?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&seatType.equals={seatTypeEquals}&seatType.notEquals={seatTypeNotEquals}&seatType.specified={seatTypeSpecified}&seatType.in={seatTypeIn}&seatType.notIn={seatTypeNotIn}&occasionType.equals={occasionTypeEquals}&occasionType.notEquals={occasionTypeNotEquals}&occasionType.specified={occasionTypeSpecified}&occasionType.in={occasionTypeIn}&occasionType.notIn={occasionTypeNotIn}&baseFare.greaterThan={baseFareGreaterThan}&baseFare.lessThan={baseFareLessThan}&baseFare.greaterThanOrEqual={baseFareGreaterThanOrEqual}&baseFare.lessThanOrEqual={baseFareLessThanOrEqual}&baseFare.equals={baseFareEquals}&baseFare.notEquals={baseFareNotEquals}&baseFare.specified={baseFareSpecified}&baseFare.in={baseFareIn}&baseFare.notIn={baseFareNotIn}&vehicleFactor.greaterThan={vehicleFactorGreaterThan}&vehicleFactor.lessThan={vehicleFactorLessThan}&vehicleFactor.greaterThanOrEqual={vehicleFactorGreaterThanOrEqual}&vehicleFactor.lessThanOrEqual={vehicleFactorLessThanOrEqual}&vehicleFactor.equals={vehicleFactorEquals}&vehicleFactor.notEquals={vehicleFactorNotEquals}&vehicleFactor.specified={vehicleFactorSpecified}&vehicleFactor.in={vehicleFactorIn}&vehicleFactor.notIn={vehicleFactorNotIn}&floorFactor.greaterThan={floorFactorGreaterThan}&floorFactor.lessThan={floorFactorLessThan}&floorFactor.greaterThanOrEqual={floorFactorGreaterThanOrEqual}&floorFactor.lessThanOrEqual={floorFactorLessThanOrEqual}&floorFactor.equals={floorFactorEquals}&floorFactor.notEquals={floorFactorNotEquals}&floorFactor.specified={floorFactorSpecified}&floorFactor.in={floorFactorIn}&floorFactor.notIn={floorFactorNotIn}&seatFactor.greaterThan={seatFactorGreaterThan}&seatFactor.lessThan={seatFactorLessThan}&seatFactor.greaterThanOrEqual={seatFactorGreaterThanOrEqual}&seatFactor.lessThanOrEqual={seatFactorLessThanOrEqual}&seatFactor.equals={seatFactorEquals}&seatFactor.notEquals={seatFactorNotEquals}&seatFactor.specified={seatFactorSpecified}&seatFactor.in={seatFactorIn}&seatFactor.notIn={seatFactorNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&finalPrice.greaterThan={finalPriceGreaterThan}&finalPrice.lessThan={finalPriceLessThan}&finalPrice.greaterThanOrEqual={finalPriceGreaterThanOrEqual}&finalPrice.lessThanOrEqual={finalPriceLessThanOrEqual}&finalPrice.equals={finalPriceEquals}&finalPrice.notEquals={finalPriceNotEquals}&finalPrice.specified={finalPriceSpecified}&finalPrice.in={finalPriceIn}&finalPrice.notIn={finalPriceNotIn}&validFrom.greaterThan={validFromGreaterThan}&validFrom.lessThan={validFromLessThan}&validFrom.greaterThanOrEqual={validFromGreaterThanOrEqual}&validFrom.lessThanOrEqual={validFromLessThanOrEqual}&validFrom.equals={validFromEquals}&validFrom.notEquals={validFromNotEquals}&validFrom.specified={validFromSpecified}&validFrom.in={validFromIn}&validFrom.notIn={validFromNotIn}&validTo.greaterThan={validToGreaterThan}&validTo.lessThan={validToLessThan}&validTo.greaterThanOrEqual={validToGreaterThanOrEqual}&validTo.lessThanOrEqual={validToLessThanOrEqual}&validTo.equals={validToEquals}&validTo.notEquals={validToNotEquals}&validTo.specified={validToSpecified}&validTo.in={validToIn}&validTo.notIn={validToNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  List<PricingTemplateDTO> getAllPricingTemplates(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("vehicleTypeEquals") @jakarta.annotation.Nullable String vehicleTypeEquals, @Param("vehicleTypeNotEquals") @jakarta.annotation.Nullable String vehicleTypeNotEquals, @Param("vehicleTypeSpecified") @jakarta.annotation.Nullable Boolean vehicleTypeSpecified, @Param("vehicleTypeIn") @jakarta.annotation.Nullable List<String> vehicleTypeIn, @Param("vehicleTypeNotIn") @jakarta.annotation.Nullable List<String> vehicleTypeNotIn, @Param("seatTypeEquals") @jakarta.annotation.Nullable String seatTypeEquals, @Param("seatTypeNotEquals") @jakarta.annotation.Nullable String seatTypeNotEquals, @Param("seatTypeSpecified") @jakarta.annotation.Nullable Boolean seatTypeSpecified, @Param("seatTypeIn") @jakarta.annotation.Nullable List<String> seatTypeIn, @Param("seatTypeNotIn") @jakarta.annotation.Nullable List<String> seatTypeNotIn, @Param("occasionTypeEquals") @jakarta.annotation.Nullable String occasionTypeEquals, @Param("occasionTypeNotEquals") @jakarta.annotation.Nullable String occasionTypeNotEquals, @Param("occasionTypeSpecified") @jakarta.annotation.Nullable Boolean occasionTypeSpecified, @Param("occasionTypeIn") @jakarta.annotation.Nullable List<String> occasionTypeIn, @Param("occasionTypeNotIn") @jakarta.annotation.Nullable List<String> occasionTypeNotIn, @Param("baseFareGreaterThan") @jakarta.annotation.Nullable BigDecimal baseFareGreaterThan, @Param("baseFareLessThan") @jakarta.annotation.Nullable BigDecimal baseFareLessThan, @Param("baseFareGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal baseFareGreaterThanOrEqual, @Param("baseFareLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal baseFareLessThanOrEqual, @Param("baseFareEquals") @jakarta.annotation.Nullable BigDecimal baseFareEquals, @Param("baseFareNotEquals") @jakarta.annotation.Nullable BigDecimal baseFareNotEquals, @Param("baseFareSpecified") @jakarta.annotation.Nullable Boolean baseFareSpecified, @Param("baseFareIn") @jakarta.annotation.Nullable List<BigDecimal> baseFareIn, @Param("baseFareNotIn") @jakarta.annotation.Nullable List<BigDecimal> baseFareNotIn, @Param("vehicleFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal vehicleFactorGreaterThan, @Param("vehicleFactorLessThan") @jakarta.annotation.Nullable BigDecimal vehicleFactorLessThan, @Param("vehicleFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal vehicleFactorGreaterThanOrEqual, @Param("vehicleFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal vehicleFactorLessThanOrEqual, @Param("vehicleFactorEquals") @jakarta.annotation.Nullable BigDecimal vehicleFactorEquals, @Param("vehicleFactorNotEquals") @jakarta.annotation.Nullable BigDecimal vehicleFactorNotEquals, @Param("vehicleFactorSpecified") @jakarta.annotation.Nullable Boolean vehicleFactorSpecified, @Param("vehicleFactorIn") @jakarta.annotation.Nullable List<BigDecimal> vehicleFactorIn, @Param("vehicleFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> vehicleFactorNotIn, @Param("floorFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal floorFactorGreaterThan, @Param("floorFactorLessThan") @jakarta.annotation.Nullable BigDecimal floorFactorLessThan, @Param("floorFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal floorFactorGreaterThanOrEqual, @Param("floorFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal floorFactorLessThanOrEqual, @Param("floorFactorEquals") @jakarta.annotation.Nullable BigDecimal floorFactorEquals, @Param("floorFactorNotEquals") @jakarta.annotation.Nullable BigDecimal floorFactorNotEquals, @Param("floorFactorSpecified") @jakarta.annotation.Nullable Boolean floorFactorSpecified, @Param("floorFactorIn") @jakarta.annotation.Nullable List<BigDecimal> floorFactorIn, @Param("floorFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> floorFactorNotIn, @Param("seatFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal seatFactorGreaterThan, @Param("seatFactorLessThan") @jakarta.annotation.Nullable BigDecimal seatFactorLessThan, @Param("seatFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal seatFactorGreaterThanOrEqual, @Param("seatFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal seatFactorLessThanOrEqual, @Param("seatFactorEquals") @jakarta.annotation.Nullable BigDecimal seatFactorEquals, @Param("seatFactorNotEquals") @jakarta.annotation.Nullable BigDecimal seatFactorNotEquals, @Param("seatFactorSpecified") @jakarta.annotation.Nullable Boolean seatFactorSpecified, @Param("seatFactorIn") @jakarta.annotation.Nullable List<BigDecimal> seatFactorIn, @Param("seatFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> seatFactorNotIn, @Param("occasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThan, @Param("occasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThan, @Param("occasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThanOrEqual, @Param("occasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThanOrEqual, @Param("occasionFactorEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorEquals, @Param("occasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorNotEquals, @Param("occasionFactorSpecified") @jakarta.annotation.Nullable Boolean occasionFactorSpecified, @Param("occasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorIn, @Param("occasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorNotIn, @Param("finalPriceGreaterThan") @jakarta.annotation.Nullable BigDecimal finalPriceGreaterThan, @Param("finalPriceLessThan") @jakarta.annotation.Nullable BigDecimal finalPriceLessThan, @Param("finalPriceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal finalPriceGreaterThanOrEqual, @Param("finalPriceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal finalPriceLessThanOrEqual, @Param("finalPriceEquals") @jakarta.annotation.Nullable BigDecimal finalPriceEquals, @Param("finalPriceNotEquals") @jakarta.annotation.Nullable BigDecimal finalPriceNotEquals, @Param("finalPriceSpecified") @jakarta.annotation.Nullable Boolean finalPriceSpecified, @Param("finalPriceIn") @jakarta.annotation.Nullable List<BigDecimal> finalPriceIn, @Param("finalPriceNotIn") @jakarta.annotation.Nullable List<BigDecimal> finalPriceNotIn, @Param("validFromGreaterThan") @jakarta.annotation.Nullable LocalDate validFromGreaterThan, @Param("validFromLessThan") @jakarta.annotation.Nullable LocalDate validFromLessThan, @Param("validFromGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate validFromGreaterThanOrEqual, @Param("validFromLessThanOrEqual") @jakarta.annotation.Nullable LocalDate validFromLessThanOrEqual, @Param("validFromEquals") @jakarta.annotation.Nullable LocalDate validFromEquals, @Param("validFromNotEquals") @jakarta.annotation.Nullable LocalDate validFromNotEquals, @Param("validFromSpecified") @jakarta.annotation.Nullable Boolean validFromSpecified, @Param("validFromIn") @jakarta.annotation.Nullable List<LocalDate> validFromIn, @Param("validFromNotIn") @jakarta.annotation.Nullable List<LocalDate> validFromNotIn, @Param("validToGreaterThan") @jakarta.annotation.Nullable LocalDate validToGreaterThan, @Param("validToLessThan") @jakarta.annotation.Nullable LocalDate validToLessThan, @Param("validToGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate validToGreaterThanOrEqual, @Param("validToLessThanOrEqual") @jakarta.annotation.Nullable LocalDate validToLessThanOrEqual, @Param("validToEquals") @jakarta.annotation.Nullable LocalDate validToEquals, @Param("validToNotEquals") @jakarta.annotation.Nullable LocalDate validToNotEquals, @Param("validToSpecified") @jakarta.annotation.Nullable Boolean validToSpecified, @Param("validToIn") @jakarta.annotation.Nullable List<LocalDate> validToIn, @Param("validToNotIn") @jakarta.annotation.Nullable List<LocalDate> validToNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);

  /**
   * 
   * Similar to <code>getAllPricingTemplates</code> but it also returns the http response headers .
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
   * @param vehicleTypeEquals  (optional)
   * @param vehicleTypeNotEquals  (optional)
   * @param vehicleTypeSpecified  (optional)
   * @param vehicleTypeIn  (optional)
   * @param vehicleTypeNotIn  (optional)
   * @param seatTypeEquals  (optional)
   * @param seatTypeNotEquals  (optional)
   * @param seatTypeSpecified  (optional)
   * @param seatTypeIn  (optional)
   * @param seatTypeNotIn  (optional)
   * @param occasionTypeEquals  (optional)
   * @param occasionTypeNotEquals  (optional)
   * @param occasionTypeSpecified  (optional)
   * @param occasionTypeIn  (optional)
   * @param occasionTypeNotIn  (optional)
   * @param baseFareGreaterThan  (optional)
   * @param baseFareLessThan  (optional)
   * @param baseFareGreaterThanOrEqual  (optional)
   * @param baseFareLessThanOrEqual  (optional)
   * @param baseFareEquals  (optional)
   * @param baseFareNotEquals  (optional)
   * @param baseFareSpecified  (optional)
   * @param baseFareIn  (optional)
   * @param baseFareNotIn  (optional)
   * @param vehicleFactorGreaterThan  (optional)
   * @param vehicleFactorLessThan  (optional)
   * @param vehicleFactorGreaterThanOrEqual  (optional)
   * @param vehicleFactorLessThanOrEqual  (optional)
   * @param vehicleFactorEquals  (optional)
   * @param vehicleFactorNotEquals  (optional)
   * @param vehicleFactorSpecified  (optional)
   * @param vehicleFactorIn  (optional)
   * @param vehicleFactorNotIn  (optional)
   * @param floorFactorGreaterThan  (optional)
   * @param floorFactorLessThan  (optional)
   * @param floorFactorGreaterThanOrEqual  (optional)
   * @param floorFactorLessThanOrEqual  (optional)
   * @param floorFactorEquals  (optional)
   * @param floorFactorNotEquals  (optional)
   * @param floorFactorSpecified  (optional)
   * @param floorFactorIn  (optional)
   * @param floorFactorNotIn  (optional)
   * @param seatFactorGreaterThan  (optional)
   * @param seatFactorLessThan  (optional)
   * @param seatFactorGreaterThanOrEqual  (optional)
   * @param seatFactorLessThanOrEqual  (optional)
   * @param seatFactorEquals  (optional)
   * @param seatFactorNotEquals  (optional)
   * @param seatFactorSpecified  (optional)
   * @param seatFactorIn  (optional)
   * @param seatFactorNotIn  (optional)
   * @param occasionFactorGreaterThan  (optional)
   * @param occasionFactorLessThan  (optional)
   * @param occasionFactorGreaterThanOrEqual  (optional)
   * @param occasionFactorLessThanOrEqual  (optional)
   * @param occasionFactorEquals  (optional)
   * @param occasionFactorNotEquals  (optional)
   * @param occasionFactorSpecified  (optional)
   * @param occasionFactorIn  (optional)
   * @param occasionFactorNotIn  (optional)
   * @param finalPriceGreaterThan  (optional)
   * @param finalPriceLessThan  (optional)
   * @param finalPriceGreaterThanOrEqual  (optional)
   * @param finalPriceLessThanOrEqual  (optional)
   * @param finalPriceEquals  (optional)
   * @param finalPriceNotEquals  (optional)
   * @param finalPriceSpecified  (optional)
   * @param finalPriceIn  (optional)
   * @param finalPriceNotIn  (optional)
   * @param validFromGreaterThan  (optional)
   * @param validFromLessThan  (optional)
   * @param validFromGreaterThanOrEqual  (optional)
   * @param validFromLessThanOrEqual  (optional)
   * @param validFromEquals  (optional)
   * @param validFromNotEquals  (optional)
   * @param validFromSpecified  (optional)
   * @param validFromIn  (optional)
   * @param validFromNotIn  (optional)
   * @param validToGreaterThan  (optional)
   * @param validToLessThan  (optional)
   * @param validToGreaterThanOrEqual  (optional)
   * @param validToLessThanOrEqual  (optional)
   * @param validToEquals  (optional)
   * @param validToNotEquals  (optional)
   * @param validToSpecified  (optional)
   * @param validToIn  (optional)
   * @param validToNotIn  (optional)
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
   * @param distinct  (optional)
   * @param page Zero-based page index (0..N) (optional, default to 0)
   * @param size The size of the page to be returned (optional, default to 20)
   * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/pricing-templates?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&seatType.equals={seatTypeEquals}&seatType.notEquals={seatTypeNotEquals}&seatType.specified={seatTypeSpecified}&seatType.in={seatTypeIn}&seatType.notIn={seatTypeNotIn}&occasionType.equals={occasionTypeEquals}&occasionType.notEquals={occasionTypeNotEquals}&occasionType.specified={occasionTypeSpecified}&occasionType.in={occasionTypeIn}&occasionType.notIn={occasionTypeNotIn}&baseFare.greaterThan={baseFareGreaterThan}&baseFare.lessThan={baseFareLessThan}&baseFare.greaterThanOrEqual={baseFareGreaterThanOrEqual}&baseFare.lessThanOrEqual={baseFareLessThanOrEqual}&baseFare.equals={baseFareEquals}&baseFare.notEquals={baseFareNotEquals}&baseFare.specified={baseFareSpecified}&baseFare.in={baseFareIn}&baseFare.notIn={baseFareNotIn}&vehicleFactor.greaterThan={vehicleFactorGreaterThan}&vehicleFactor.lessThan={vehicleFactorLessThan}&vehicleFactor.greaterThanOrEqual={vehicleFactorGreaterThanOrEqual}&vehicleFactor.lessThanOrEqual={vehicleFactorLessThanOrEqual}&vehicleFactor.equals={vehicleFactorEquals}&vehicleFactor.notEquals={vehicleFactorNotEquals}&vehicleFactor.specified={vehicleFactorSpecified}&vehicleFactor.in={vehicleFactorIn}&vehicleFactor.notIn={vehicleFactorNotIn}&floorFactor.greaterThan={floorFactorGreaterThan}&floorFactor.lessThan={floorFactorLessThan}&floorFactor.greaterThanOrEqual={floorFactorGreaterThanOrEqual}&floorFactor.lessThanOrEqual={floorFactorLessThanOrEqual}&floorFactor.equals={floorFactorEquals}&floorFactor.notEquals={floorFactorNotEquals}&floorFactor.specified={floorFactorSpecified}&floorFactor.in={floorFactorIn}&floorFactor.notIn={floorFactorNotIn}&seatFactor.greaterThan={seatFactorGreaterThan}&seatFactor.lessThan={seatFactorLessThan}&seatFactor.greaterThanOrEqual={seatFactorGreaterThanOrEqual}&seatFactor.lessThanOrEqual={seatFactorLessThanOrEqual}&seatFactor.equals={seatFactorEquals}&seatFactor.notEquals={seatFactorNotEquals}&seatFactor.specified={seatFactorSpecified}&seatFactor.in={seatFactorIn}&seatFactor.notIn={seatFactorNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&finalPrice.greaterThan={finalPriceGreaterThan}&finalPrice.lessThan={finalPriceLessThan}&finalPrice.greaterThanOrEqual={finalPriceGreaterThanOrEqual}&finalPrice.lessThanOrEqual={finalPriceLessThanOrEqual}&finalPrice.equals={finalPriceEquals}&finalPrice.notEquals={finalPriceNotEquals}&finalPrice.specified={finalPriceSpecified}&finalPrice.in={finalPriceIn}&finalPrice.notIn={finalPriceNotIn}&validFrom.greaterThan={validFromGreaterThan}&validFrom.lessThan={validFromLessThan}&validFrom.greaterThanOrEqual={validFromGreaterThanOrEqual}&validFrom.lessThanOrEqual={validFromLessThanOrEqual}&validFrom.equals={validFromEquals}&validFrom.notEquals={validFromNotEquals}&validFrom.specified={validFromSpecified}&validFrom.in={validFromIn}&validFrom.notIn={validFromNotIn}&validTo.greaterThan={validToGreaterThan}&validTo.lessThan={validToLessThan}&validTo.greaterThanOrEqual={validToGreaterThanOrEqual}&validTo.lessThanOrEqual={validToLessThanOrEqual}&validTo.equals={validToEquals}&validTo.notEquals={validToNotEquals}&validTo.specified={validToSpecified}&validTo.in={validToIn}&validTo.notIn={validToNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<PricingTemplateDTO>> getAllPricingTemplatesWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("vehicleTypeEquals") @jakarta.annotation.Nullable String vehicleTypeEquals, @Param("vehicleTypeNotEquals") @jakarta.annotation.Nullable String vehicleTypeNotEquals, @Param("vehicleTypeSpecified") @jakarta.annotation.Nullable Boolean vehicleTypeSpecified, @Param("vehicleTypeIn") @jakarta.annotation.Nullable List<String> vehicleTypeIn, @Param("vehicleTypeNotIn") @jakarta.annotation.Nullable List<String> vehicleTypeNotIn, @Param("seatTypeEquals") @jakarta.annotation.Nullable String seatTypeEquals, @Param("seatTypeNotEquals") @jakarta.annotation.Nullable String seatTypeNotEquals, @Param("seatTypeSpecified") @jakarta.annotation.Nullable Boolean seatTypeSpecified, @Param("seatTypeIn") @jakarta.annotation.Nullable List<String> seatTypeIn, @Param("seatTypeNotIn") @jakarta.annotation.Nullable List<String> seatTypeNotIn, @Param("occasionTypeEquals") @jakarta.annotation.Nullable String occasionTypeEquals, @Param("occasionTypeNotEquals") @jakarta.annotation.Nullable String occasionTypeNotEquals, @Param("occasionTypeSpecified") @jakarta.annotation.Nullable Boolean occasionTypeSpecified, @Param("occasionTypeIn") @jakarta.annotation.Nullable List<String> occasionTypeIn, @Param("occasionTypeNotIn") @jakarta.annotation.Nullable List<String> occasionTypeNotIn, @Param("baseFareGreaterThan") @jakarta.annotation.Nullable BigDecimal baseFareGreaterThan, @Param("baseFareLessThan") @jakarta.annotation.Nullable BigDecimal baseFareLessThan, @Param("baseFareGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal baseFareGreaterThanOrEqual, @Param("baseFareLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal baseFareLessThanOrEqual, @Param("baseFareEquals") @jakarta.annotation.Nullable BigDecimal baseFareEquals, @Param("baseFareNotEquals") @jakarta.annotation.Nullable BigDecimal baseFareNotEquals, @Param("baseFareSpecified") @jakarta.annotation.Nullable Boolean baseFareSpecified, @Param("baseFareIn") @jakarta.annotation.Nullable List<BigDecimal> baseFareIn, @Param("baseFareNotIn") @jakarta.annotation.Nullable List<BigDecimal> baseFareNotIn, @Param("vehicleFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal vehicleFactorGreaterThan, @Param("vehicleFactorLessThan") @jakarta.annotation.Nullable BigDecimal vehicleFactorLessThan, @Param("vehicleFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal vehicleFactorGreaterThanOrEqual, @Param("vehicleFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal vehicleFactorLessThanOrEqual, @Param("vehicleFactorEquals") @jakarta.annotation.Nullable BigDecimal vehicleFactorEquals, @Param("vehicleFactorNotEquals") @jakarta.annotation.Nullable BigDecimal vehicleFactorNotEquals, @Param("vehicleFactorSpecified") @jakarta.annotation.Nullable Boolean vehicleFactorSpecified, @Param("vehicleFactorIn") @jakarta.annotation.Nullable List<BigDecimal> vehicleFactorIn, @Param("vehicleFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> vehicleFactorNotIn, @Param("floorFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal floorFactorGreaterThan, @Param("floorFactorLessThan") @jakarta.annotation.Nullable BigDecimal floorFactorLessThan, @Param("floorFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal floorFactorGreaterThanOrEqual, @Param("floorFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal floorFactorLessThanOrEqual, @Param("floorFactorEquals") @jakarta.annotation.Nullable BigDecimal floorFactorEquals, @Param("floorFactorNotEquals") @jakarta.annotation.Nullable BigDecimal floorFactorNotEquals, @Param("floorFactorSpecified") @jakarta.annotation.Nullable Boolean floorFactorSpecified, @Param("floorFactorIn") @jakarta.annotation.Nullable List<BigDecimal> floorFactorIn, @Param("floorFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> floorFactorNotIn, @Param("seatFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal seatFactorGreaterThan, @Param("seatFactorLessThan") @jakarta.annotation.Nullable BigDecimal seatFactorLessThan, @Param("seatFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal seatFactorGreaterThanOrEqual, @Param("seatFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal seatFactorLessThanOrEqual, @Param("seatFactorEquals") @jakarta.annotation.Nullable BigDecimal seatFactorEquals, @Param("seatFactorNotEquals") @jakarta.annotation.Nullable BigDecimal seatFactorNotEquals, @Param("seatFactorSpecified") @jakarta.annotation.Nullable Boolean seatFactorSpecified, @Param("seatFactorIn") @jakarta.annotation.Nullable List<BigDecimal> seatFactorIn, @Param("seatFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> seatFactorNotIn, @Param("occasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThan, @Param("occasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThan, @Param("occasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorGreaterThanOrEqual, @Param("occasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occasionFactorLessThanOrEqual, @Param("occasionFactorEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorEquals, @Param("occasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal occasionFactorNotEquals, @Param("occasionFactorSpecified") @jakarta.annotation.Nullable Boolean occasionFactorSpecified, @Param("occasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorIn, @Param("occasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> occasionFactorNotIn, @Param("finalPriceGreaterThan") @jakarta.annotation.Nullable BigDecimal finalPriceGreaterThan, @Param("finalPriceLessThan") @jakarta.annotation.Nullable BigDecimal finalPriceLessThan, @Param("finalPriceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal finalPriceGreaterThanOrEqual, @Param("finalPriceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal finalPriceLessThanOrEqual, @Param("finalPriceEquals") @jakarta.annotation.Nullable BigDecimal finalPriceEquals, @Param("finalPriceNotEquals") @jakarta.annotation.Nullable BigDecimal finalPriceNotEquals, @Param("finalPriceSpecified") @jakarta.annotation.Nullable Boolean finalPriceSpecified, @Param("finalPriceIn") @jakarta.annotation.Nullable List<BigDecimal> finalPriceIn, @Param("finalPriceNotIn") @jakarta.annotation.Nullable List<BigDecimal> finalPriceNotIn, @Param("validFromGreaterThan") @jakarta.annotation.Nullable LocalDate validFromGreaterThan, @Param("validFromLessThan") @jakarta.annotation.Nullable LocalDate validFromLessThan, @Param("validFromGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate validFromGreaterThanOrEqual, @Param("validFromLessThanOrEqual") @jakarta.annotation.Nullable LocalDate validFromLessThanOrEqual, @Param("validFromEquals") @jakarta.annotation.Nullable LocalDate validFromEquals, @Param("validFromNotEquals") @jakarta.annotation.Nullable LocalDate validFromNotEquals, @Param("validFromSpecified") @jakarta.annotation.Nullable Boolean validFromSpecified, @Param("validFromIn") @jakarta.annotation.Nullable List<LocalDate> validFromIn, @Param("validFromNotIn") @jakarta.annotation.Nullable List<LocalDate> validFromNotIn, @Param("validToGreaterThan") @jakarta.annotation.Nullable LocalDate validToGreaterThan, @Param("validToLessThan") @jakarta.annotation.Nullable LocalDate validToLessThan, @Param("validToGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate validToGreaterThanOrEqual, @Param("validToLessThanOrEqual") @jakarta.annotation.Nullable LocalDate validToLessThanOrEqual, @Param("validToEquals") @jakarta.annotation.Nullable LocalDate validToEquals, @Param("validToNotEquals") @jakarta.annotation.Nullable LocalDate validToNotEquals, @Param("validToSpecified") @jakarta.annotation.Nullable Boolean validToSpecified, @Param("validToIn") @jakarta.annotation.Nullable List<LocalDate> validToIn, @Param("validToNotIn") @jakarta.annotation.Nullable List<LocalDate> validToNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllPricingTemplates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllPricingTemplatesQueryParams} class that allows for
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
   *   <li>vehicleTypeEquals -  (optional)</li>
   *   <li>vehicleTypeNotEquals -  (optional)</li>
   *   <li>vehicleTypeSpecified -  (optional)</li>
   *   <li>vehicleTypeIn -  (optional)</li>
   *   <li>vehicleTypeNotIn -  (optional)</li>
   *   <li>seatTypeEquals -  (optional)</li>
   *   <li>seatTypeNotEquals -  (optional)</li>
   *   <li>seatTypeSpecified -  (optional)</li>
   *   <li>seatTypeIn -  (optional)</li>
   *   <li>seatTypeNotIn -  (optional)</li>
   *   <li>occasionTypeEquals -  (optional)</li>
   *   <li>occasionTypeNotEquals -  (optional)</li>
   *   <li>occasionTypeSpecified -  (optional)</li>
   *   <li>occasionTypeIn -  (optional)</li>
   *   <li>occasionTypeNotIn -  (optional)</li>
   *   <li>baseFareGreaterThan -  (optional)</li>
   *   <li>baseFareLessThan -  (optional)</li>
   *   <li>baseFareGreaterThanOrEqual -  (optional)</li>
   *   <li>baseFareLessThanOrEqual -  (optional)</li>
   *   <li>baseFareEquals -  (optional)</li>
   *   <li>baseFareNotEquals -  (optional)</li>
   *   <li>baseFareSpecified -  (optional)</li>
   *   <li>baseFareIn -  (optional)</li>
   *   <li>baseFareNotIn -  (optional)</li>
   *   <li>vehicleFactorGreaterThan -  (optional)</li>
   *   <li>vehicleFactorLessThan -  (optional)</li>
   *   <li>vehicleFactorGreaterThanOrEqual -  (optional)</li>
   *   <li>vehicleFactorLessThanOrEqual -  (optional)</li>
   *   <li>vehicleFactorEquals -  (optional)</li>
   *   <li>vehicleFactorNotEquals -  (optional)</li>
   *   <li>vehicleFactorSpecified -  (optional)</li>
   *   <li>vehicleFactorIn -  (optional)</li>
   *   <li>vehicleFactorNotIn -  (optional)</li>
   *   <li>floorFactorGreaterThan -  (optional)</li>
   *   <li>floorFactorLessThan -  (optional)</li>
   *   <li>floorFactorGreaterThanOrEqual -  (optional)</li>
   *   <li>floorFactorLessThanOrEqual -  (optional)</li>
   *   <li>floorFactorEquals -  (optional)</li>
   *   <li>floorFactorNotEquals -  (optional)</li>
   *   <li>floorFactorSpecified -  (optional)</li>
   *   <li>floorFactorIn -  (optional)</li>
   *   <li>floorFactorNotIn -  (optional)</li>
   *   <li>seatFactorGreaterThan -  (optional)</li>
   *   <li>seatFactorLessThan -  (optional)</li>
   *   <li>seatFactorGreaterThanOrEqual -  (optional)</li>
   *   <li>seatFactorLessThanOrEqual -  (optional)</li>
   *   <li>seatFactorEquals -  (optional)</li>
   *   <li>seatFactorNotEquals -  (optional)</li>
   *   <li>seatFactorSpecified -  (optional)</li>
   *   <li>seatFactorIn -  (optional)</li>
   *   <li>seatFactorNotIn -  (optional)</li>
   *   <li>occasionFactorGreaterThan -  (optional)</li>
   *   <li>occasionFactorLessThan -  (optional)</li>
   *   <li>occasionFactorGreaterThanOrEqual -  (optional)</li>
   *   <li>occasionFactorLessThanOrEqual -  (optional)</li>
   *   <li>occasionFactorEquals -  (optional)</li>
   *   <li>occasionFactorNotEquals -  (optional)</li>
   *   <li>occasionFactorSpecified -  (optional)</li>
   *   <li>occasionFactorIn -  (optional)</li>
   *   <li>occasionFactorNotIn -  (optional)</li>
   *   <li>finalPriceGreaterThan -  (optional)</li>
   *   <li>finalPriceLessThan -  (optional)</li>
   *   <li>finalPriceGreaterThanOrEqual -  (optional)</li>
   *   <li>finalPriceLessThanOrEqual -  (optional)</li>
   *   <li>finalPriceEquals -  (optional)</li>
   *   <li>finalPriceNotEquals -  (optional)</li>
   *   <li>finalPriceSpecified -  (optional)</li>
   *   <li>finalPriceIn -  (optional)</li>
   *   <li>finalPriceNotIn -  (optional)</li>
   *   <li>validFromGreaterThan -  (optional)</li>
   *   <li>validFromLessThan -  (optional)</li>
   *   <li>validFromGreaterThanOrEqual -  (optional)</li>
   *   <li>validFromLessThanOrEqual -  (optional)</li>
   *   <li>validFromEquals -  (optional)</li>
   *   <li>validFromNotEquals -  (optional)</li>
   *   <li>validFromSpecified -  (optional)</li>
   *   <li>validFromIn -  (optional)</li>
   *   <li>validFromNotIn -  (optional)</li>
   *   <li>validToGreaterThan -  (optional)</li>
   *   <li>validToLessThan -  (optional)</li>
   *   <li>validToGreaterThanOrEqual -  (optional)</li>
   *   <li>validToLessThanOrEqual -  (optional)</li>
   *   <li>validToEquals -  (optional)</li>
   *   <li>validToNotEquals -  (optional)</li>
   *   <li>validToSpecified -  (optional)</li>
   *   <li>validToIn -  (optional)</li>
   *   <li>validToNotIn -  (optional)</li>
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
   *   <li>distinct -  (optional)</li>
   *   <li>page - Zero-based page index (0..N) (optional, default to 0)</li>
   *   <li>size - The size of the page to be returned (optional, default to 20)</li>
   *   <li>sort - Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
   *   </ul>
   * @return List&lt;PricingTemplateDTO&gt;
   */
  @RequestLine("GET /api/pricing-templates?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&seatType.equals={seatTypeEquals}&seatType.notEquals={seatTypeNotEquals}&seatType.specified={seatTypeSpecified}&seatType.in={seatTypeIn}&seatType.notIn={seatTypeNotIn}&occasionType.equals={occasionTypeEquals}&occasionType.notEquals={occasionTypeNotEquals}&occasionType.specified={occasionTypeSpecified}&occasionType.in={occasionTypeIn}&occasionType.notIn={occasionTypeNotIn}&baseFare.greaterThan={baseFareGreaterThan}&baseFare.lessThan={baseFareLessThan}&baseFare.greaterThanOrEqual={baseFareGreaterThanOrEqual}&baseFare.lessThanOrEqual={baseFareLessThanOrEqual}&baseFare.equals={baseFareEquals}&baseFare.notEquals={baseFareNotEquals}&baseFare.specified={baseFareSpecified}&baseFare.in={baseFareIn}&baseFare.notIn={baseFareNotIn}&vehicleFactor.greaterThan={vehicleFactorGreaterThan}&vehicleFactor.lessThan={vehicleFactorLessThan}&vehicleFactor.greaterThanOrEqual={vehicleFactorGreaterThanOrEqual}&vehicleFactor.lessThanOrEqual={vehicleFactorLessThanOrEqual}&vehicleFactor.equals={vehicleFactorEquals}&vehicleFactor.notEquals={vehicleFactorNotEquals}&vehicleFactor.specified={vehicleFactorSpecified}&vehicleFactor.in={vehicleFactorIn}&vehicleFactor.notIn={vehicleFactorNotIn}&floorFactor.greaterThan={floorFactorGreaterThan}&floorFactor.lessThan={floorFactorLessThan}&floorFactor.greaterThanOrEqual={floorFactorGreaterThanOrEqual}&floorFactor.lessThanOrEqual={floorFactorLessThanOrEqual}&floorFactor.equals={floorFactorEquals}&floorFactor.notEquals={floorFactorNotEquals}&floorFactor.specified={floorFactorSpecified}&floorFactor.in={floorFactorIn}&floorFactor.notIn={floorFactorNotIn}&seatFactor.greaterThan={seatFactorGreaterThan}&seatFactor.lessThan={seatFactorLessThan}&seatFactor.greaterThanOrEqual={seatFactorGreaterThanOrEqual}&seatFactor.lessThanOrEqual={seatFactorLessThanOrEqual}&seatFactor.equals={seatFactorEquals}&seatFactor.notEquals={seatFactorNotEquals}&seatFactor.specified={seatFactorSpecified}&seatFactor.in={seatFactorIn}&seatFactor.notIn={seatFactorNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&finalPrice.greaterThan={finalPriceGreaterThan}&finalPrice.lessThan={finalPriceLessThan}&finalPrice.greaterThanOrEqual={finalPriceGreaterThanOrEqual}&finalPrice.lessThanOrEqual={finalPriceLessThanOrEqual}&finalPrice.equals={finalPriceEquals}&finalPrice.notEquals={finalPriceNotEquals}&finalPrice.specified={finalPriceSpecified}&finalPrice.in={finalPriceIn}&finalPrice.notIn={finalPriceNotIn}&validFrom.greaterThan={validFromGreaterThan}&validFrom.lessThan={validFromLessThan}&validFrom.greaterThanOrEqual={validFromGreaterThanOrEqual}&validFrom.lessThanOrEqual={validFromLessThanOrEqual}&validFrom.equals={validFromEquals}&validFrom.notEquals={validFromNotEquals}&validFrom.specified={validFromSpecified}&validFrom.in={validFromIn}&validFrom.notIn={validFromNotIn}&validTo.greaterThan={validToGreaterThan}&validTo.lessThan={validToLessThan}&validTo.greaterThanOrEqual={validToGreaterThanOrEqual}&validTo.lessThanOrEqual={validToLessThanOrEqual}&validTo.equals={validToEquals}&validTo.notEquals={validToNotEquals}&validTo.specified={validToSpecified}&validTo.in={validToIn}&validTo.notIn={validToNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
  "Accept: */*",
  })
  List<PricingTemplateDTO> getAllPricingTemplates(@QueryMap(encoded=true) GetAllPricingTemplatesQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllPricingTemplates</code> that receives the query parameters as a map,
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
          *   <li>vehicleTypeEquals -  (optional)</li>
          *   <li>vehicleTypeNotEquals -  (optional)</li>
          *   <li>vehicleTypeSpecified -  (optional)</li>
          *   <li>vehicleTypeIn -  (optional)</li>
          *   <li>vehicleTypeNotIn -  (optional)</li>
          *   <li>seatTypeEquals -  (optional)</li>
          *   <li>seatTypeNotEquals -  (optional)</li>
          *   <li>seatTypeSpecified -  (optional)</li>
          *   <li>seatTypeIn -  (optional)</li>
          *   <li>seatTypeNotIn -  (optional)</li>
          *   <li>occasionTypeEquals -  (optional)</li>
          *   <li>occasionTypeNotEquals -  (optional)</li>
          *   <li>occasionTypeSpecified -  (optional)</li>
          *   <li>occasionTypeIn -  (optional)</li>
          *   <li>occasionTypeNotIn -  (optional)</li>
          *   <li>baseFareGreaterThan -  (optional)</li>
          *   <li>baseFareLessThan -  (optional)</li>
          *   <li>baseFareGreaterThanOrEqual -  (optional)</li>
          *   <li>baseFareLessThanOrEqual -  (optional)</li>
          *   <li>baseFareEquals -  (optional)</li>
          *   <li>baseFareNotEquals -  (optional)</li>
          *   <li>baseFareSpecified -  (optional)</li>
          *   <li>baseFareIn -  (optional)</li>
          *   <li>baseFareNotIn -  (optional)</li>
          *   <li>vehicleFactorGreaterThan -  (optional)</li>
          *   <li>vehicleFactorLessThan -  (optional)</li>
          *   <li>vehicleFactorGreaterThanOrEqual -  (optional)</li>
          *   <li>vehicleFactorLessThanOrEqual -  (optional)</li>
          *   <li>vehicleFactorEquals -  (optional)</li>
          *   <li>vehicleFactorNotEquals -  (optional)</li>
          *   <li>vehicleFactorSpecified -  (optional)</li>
          *   <li>vehicleFactorIn -  (optional)</li>
          *   <li>vehicleFactorNotIn -  (optional)</li>
          *   <li>floorFactorGreaterThan -  (optional)</li>
          *   <li>floorFactorLessThan -  (optional)</li>
          *   <li>floorFactorGreaterThanOrEqual -  (optional)</li>
          *   <li>floorFactorLessThanOrEqual -  (optional)</li>
          *   <li>floorFactorEquals -  (optional)</li>
          *   <li>floorFactorNotEquals -  (optional)</li>
          *   <li>floorFactorSpecified -  (optional)</li>
          *   <li>floorFactorIn -  (optional)</li>
          *   <li>floorFactorNotIn -  (optional)</li>
          *   <li>seatFactorGreaterThan -  (optional)</li>
          *   <li>seatFactorLessThan -  (optional)</li>
          *   <li>seatFactorGreaterThanOrEqual -  (optional)</li>
          *   <li>seatFactorLessThanOrEqual -  (optional)</li>
          *   <li>seatFactorEquals -  (optional)</li>
          *   <li>seatFactorNotEquals -  (optional)</li>
          *   <li>seatFactorSpecified -  (optional)</li>
          *   <li>seatFactorIn -  (optional)</li>
          *   <li>seatFactorNotIn -  (optional)</li>
          *   <li>occasionFactorGreaterThan -  (optional)</li>
          *   <li>occasionFactorLessThan -  (optional)</li>
          *   <li>occasionFactorGreaterThanOrEqual -  (optional)</li>
          *   <li>occasionFactorLessThanOrEqual -  (optional)</li>
          *   <li>occasionFactorEquals -  (optional)</li>
          *   <li>occasionFactorNotEquals -  (optional)</li>
          *   <li>occasionFactorSpecified -  (optional)</li>
          *   <li>occasionFactorIn -  (optional)</li>
          *   <li>occasionFactorNotIn -  (optional)</li>
          *   <li>finalPriceGreaterThan -  (optional)</li>
          *   <li>finalPriceLessThan -  (optional)</li>
          *   <li>finalPriceGreaterThanOrEqual -  (optional)</li>
          *   <li>finalPriceLessThanOrEqual -  (optional)</li>
          *   <li>finalPriceEquals -  (optional)</li>
          *   <li>finalPriceNotEquals -  (optional)</li>
          *   <li>finalPriceSpecified -  (optional)</li>
          *   <li>finalPriceIn -  (optional)</li>
          *   <li>finalPriceNotIn -  (optional)</li>
          *   <li>validFromGreaterThan -  (optional)</li>
          *   <li>validFromLessThan -  (optional)</li>
          *   <li>validFromGreaterThanOrEqual -  (optional)</li>
          *   <li>validFromLessThanOrEqual -  (optional)</li>
          *   <li>validFromEquals -  (optional)</li>
          *   <li>validFromNotEquals -  (optional)</li>
          *   <li>validFromSpecified -  (optional)</li>
          *   <li>validFromIn -  (optional)</li>
          *   <li>validFromNotIn -  (optional)</li>
          *   <li>validToGreaterThan -  (optional)</li>
          *   <li>validToLessThan -  (optional)</li>
          *   <li>validToGreaterThanOrEqual -  (optional)</li>
          *   <li>validToLessThanOrEqual -  (optional)</li>
          *   <li>validToEquals -  (optional)</li>
          *   <li>validToNotEquals -  (optional)</li>
          *   <li>validToSpecified -  (optional)</li>
          *   <li>validToIn -  (optional)</li>
          *   <li>validToNotIn -  (optional)</li>
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
          *   <li>distinct -  (optional)</li>
          *   <li>page - Zero-based page index (0..N) (optional, default to 0)</li>
          *   <li>size - The size of the page to be returned (optional, default to 20)</li>
          *   <li>sort - Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
      *   </ul>
          * @return List&lt;PricingTemplateDTO&gt;
      */
      @RequestLine("GET /api/pricing-templates?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&seatType.equals={seatTypeEquals}&seatType.notEquals={seatTypeNotEquals}&seatType.specified={seatTypeSpecified}&seatType.in={seatTypeIn}&seatType.notIn={seatTypeNotIn}&occasionType.equals={occasionTypeEquals}&occasionType.notEquals={occasionTypeNotEquals}&occasionType.specified={occasionTypeSpecified}&occasionType.in={occasionTypeIn}&occasionType.notIn={occasionTypeNotIn}&baseFare.greaterThan={baseFareGreaterThan}&baseFare.lessThan={baseFareLessThan}&baseFare.greaterThanOrEqual={baseFareGreaterThanOrEqual}&baseFare.lessThanOrEqual={baseFareLessThanOrEqual}&baseFare.equals={baseFareEquals}&baseFare.notEquals={baseFareNotEquals}&baseFare.specified={baseFareSpecified}&baseFare.in={baseFareIn}&baseFare.notIn={baseFareNotIn}&vehicleFactor.greaterThan={vehicleFactorGreaterThan}&vehicleFactor.lessThan={vehicleFactorLessThan}&vehicleFactor.greaterThanOrEqual={vehicleFactorGreaterThanOrEqual}&vehicleFactor.lessThanOrEqual={vehicleFactorLessThanOrEqual}&vehicleFactor.equals={vehicleFactorEquals}&vehicleFactor.notEquals={vehicleFactorNotEquals}&vehicleFactor.specified={vehicleFactorSpecified}&vehicleFactor.in={vehicleFactorIn}&vehicleFactor.notIn={vehicleFactorNotIn}&floorFactor.greaterThan={floorFactorGreaterThan}&floorFactor.lessThan={floorFactorLessThan}&floorFactor.greaterThanOrEqual={floorFactorGreaterThanOrEqual}&floorFactor.lessThanOrEqual={floorFactorLessThanOrEqual}&floorFactor.equals={floorFactorEquals}&floorFactor.notEquals={floorFactorNotEquals}&floorFactor.specified={floorFactorSpecified}&floorFactor.in={floorFactorIn}&floorFactor.notIn={floorFactorNotIn}&seatFactor.greaterThan={seatFactorGreaterThan}&seatFactor.lessThan={seatFactorLessThan}&seatFactor.greaterThanOrEqual={seatFactorGreaterThanOrEqual}&seatFactor.lessThanOrEqual={seatFactorLessThanOrEqual}&seatFactor.equals={seatFactorEquals}&seatFactor.notEquals={seatFactorNotEquals}&seatFactor.specified={seatFactorSpecified}&seatFactor.in={seatFactorIn}&seatFactor.notIn={seatFactorNotIn}&occasionFactor.greaterThan={occasionFactorGreaterThan}&occasionFactor.lessThan={occasionFactorLessThan}&occasionFactor.greaterThanOrEqual={occasionFactorGreaterThanOrEqual}&occasionFactor.lessThanOrEqual={occasionFactorLessThanOrEqual}&occasionFactor.equals={occasionFactorEquals}&occasionFactor.notEquals={occasionFactorNotEquals}&occasionFactor.specified={occasionFactorSpecified}&occasionFactor.in={occasionFactorIn}&occasionFactor.notIn={occasionFactorNotIn}&finalPrice.greaterThan={finalPriceGreaterThan}&finalPrice.lessThan={finalPriceLessThan}&finalPrice.greaterThanOrEqual={finalPriceGreaterThanOrEqual}&finalPrice.lessThanOrEqual={finalPriceLessThanOrEqual}&finalPrice.equals={finalPriceEquals}&finalPrice.notEquals={finalPriceNotEquals}&finalPrice.specified={finalPriceSpecified}&finalPrice.in={finalPriceIn}&finalPrice.notIn={finalPriceNotIn}&validFrom.greaterThan={validFromGreaterThan}&validFrom.lessThan={validFromLessThan}&validFrom.greaterThanOrEqual={validFromGreaterThanOrEqual}&validFrom.lessThanOrEqual={validFromLessThanOrEqual}&validFrom.equals={validFromEquals}&validFrom.notEquals={validFromNotEquals}&validFrom.specified={validFromSpecified}&validFrom.in={validFromIn}&validFrom.notIn={validFromNotIn}&validTo.greaterThan={validToGreaterThan}&validTo.lessThan={validToLessThan}&validTo.greaterThanOrEqual={validToGreaterThanOrEqual}&validTo.lessThanOrEqual={validToLessThanOrEqual}&validTo.equals={validToEquals}&validTo.notEquals={validToNotEquals}&validTo.specified={validToSpecified}&validTo.in={validToIn}&validTo.notIn={validToNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<PricingTemplateDTO>> getAllPricingTemplatesWithHttpInfo(@QueryMap(encoded=true) GetAllPricingTemplatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllPricingTemplates</code> method in a fluent style.
   */
  public static class GetAllPricingTemplatesQueryParams extends HashMap<String, Object> {
    public GetAllPricingTemplatesQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams vehicleTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("vehicleType.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams vehicleTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("vehicleType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams vehicleTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehicleType.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams vehicleTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehicleType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams vehicleTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehicleType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams seatTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("seatType.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams seatTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("seatType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams seatTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("seatType.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams seatTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("seatType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams seatTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("seatType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams occasionTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("occasionType.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams occasionTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("occasionType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams occasionTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occasionType.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams occasionTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("occasionType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams occasionTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("occasionType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams baseFareGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams baseFareLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams baseFareGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams baseFareLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams baseFareEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams baseFareNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams baseFareSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("baseFare.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams baseFareIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("baseFare.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams baseFareNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("baseFare.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams vehicleFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams vehicleFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams vehicleFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams vehicleFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams vehicleFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams vehicleFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams vehicleFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehicleFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams vehicleFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("vehicleFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams vehicleFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("vehicleFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams floorFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams floorFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams floorFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams floorFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams floorFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams floorFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams floorFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("floorFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams floorFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("floorFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams floorFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("floorFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams seatFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams seatFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams seatFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams seatFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams seatFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams seatFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams seatFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("seatFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams seatFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("seatFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams seatFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("seatFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams occasionFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams occasionFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams occasionFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams occasionFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams occasionFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams occasionFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occasionFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams occasionFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occasionFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams occasionFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occasionFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams occasionFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occasionFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams finalPriceGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams finalPriceLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams finalPriceGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams finalPriceLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams finalPriceEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams finalPriceNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams finalPriceSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("finalPrice.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams finalPriceIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("finalPrice.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams finalPriceNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("finalPrice.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validFromGreaterThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validFromLessThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validFromGreaterThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validFromLessThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validFromEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validFromNotEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validFromSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("validFrom.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validFromIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("validFrom.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validFromNotIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("validFrom.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validToGreaterThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validToLessThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validToGreaterThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validToLessThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validToEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validToNotEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validToSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("validTo.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validToIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("validTo.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams validToNotIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("validTo.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams routeIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams routeIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams routeIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams routeIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams routeIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams routeIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams routeIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("routeId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams routeIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams routeIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingTemplatesQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams page(@jakarta.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams size(@jakarta.annotation.Nullable final Integer value) {
      put("size", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingTemplatesQueryParams sort(@jakarta.annotation.Nullable final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return PricingTemplateDTO
   */
  @RequestLine("GET /api/pricing-templates/{id}")
  @Headers({
    "Accept: */*",
  })
  PricingTemplateDTO getPricingTemplate(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getPricingTemplate</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/pricing-templates/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<PricingTemplateDTO> getPricingTemplateWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param tripId  (required)
   * @param seatId  (required)
   * @return PricingTemplateDTO
   */
  @RequestLine("GET /api/pricing-templates/trip/{tripId}/seat/{seatId}")
  @Headers({
    "Accept: */*",
  })
  PricingTemplateDTO getPricingTemplateByTripAndSeat(@Param("tripId") @jakarta.annotation.Nonnull Long tripId, @Param("seatId") @jakarta.annotation.Nonnull Long seatId);

  /**
   * 
   * Similar to <code>getPricingTemplateByTripAndSeat</code> but it also returns the http response headers .
   * 
   * @param tripId  (required)
   * @param seatId  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/pricing-templates/trip/{tripId}/seat/{seatId}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<PricingTemplateDTO> getPricingTemplateByTripAndSeatWithHttpInfo(@Param("tripId") @jakarta.annotation.Nonnull Long tripId, @Param("seatId") @jakarta.annotation.Nonnull Long seatId);



  /**
   * 
   * 
   * @param id  (required)
   * @param pricingTemplateDTO  (required)
   * @return PricingTemplateDTO
   */
  @RequestLine("PATCH /api/pricing-templates/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  PricingTemplateDTO partialUpdatePricingTemplate(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull PricingTemplateDTO pricingTemplateDTO);

  /**
   * 
   * Similar to <code>partialUpdatePricingTemplate</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param pricingTemplateDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/pricing-templates/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<PricingTemplateDTO> partialUpdatePricingTemplateWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull PricingTemplateDTO pricingTemplateDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param pricingTemplateDTO  (required)
   * @return PricingTemplateDTO
   */
  @RequestLine("PUT /api/pricing-templates/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  PricingTemplateDTO updatePricingTemplate(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull PricingTemplateDTO pricingTemplateDTO);

  /**
   * 
   * Similar to <code>updatePricingTemplate</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param pricingTemplateDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/pricing-templates/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<PricingTemplateDTO> updatePricingTemplateWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull PricingTemplateDTO pricingTemplateDTO);


}
