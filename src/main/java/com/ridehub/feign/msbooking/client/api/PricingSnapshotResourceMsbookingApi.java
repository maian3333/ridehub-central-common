package com.ridehub.feign.msbooking.client.api;

import com.ridehub.feign.msbooking.client.invoker.ApiClient;
import com.ridehub.feign.msbooking.client.invoker.EncodingUtils;
import com.ridehub.feign.msbooking.client.model.ApiResponse;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import com.ridehub.feign.msbooking.client.model.PricingSnapshotDTO;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface PricingSnapshotResourceMsbookingApi extends ApiClient.Api {


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
   * @param scheduleOccasionFactorGreaterThan  (optional)
   * @param scheduleOccasionFactorLessThan  (optional)
   * @param scheduleOccasionFactorGreaterThanOrEqual  (optional)
   * @param scheduleOccasionFactorLessThanOrEqual  (optional)
   * @param scheduleOccasionFactorEquals  (optional)
   * @param scheduleOccasionFactorNotEquals  (optional)
   * @param scheduleOccasionFactorSpecified  (optional)
   * @param scheduleOccasionFactorIn  (optional)
   * @param scheduleOccasionFactorNotIn  (optional)
   * @param finalPriceGreaterThan  (optional)
   * @param finalPriceLessThan  (optional)
   * @param finalPriceGreaterThanOrEqual  (optional)
   * @param finalPriceLessThanOrEqual  (optional)
   * @param finalPriceEquals  (optional)
   * @param finalPriceNotEquals  (optional)
   * @param finalPriceSpecified  (optional)
   * @param finalPriceIn  (optional)
   * @param finalPriceNotIn  (optional)
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
   * @param bookingIdGreaterThan  (optional)
   * @param bookingIdLessThan  (optional)
   * @param bookingIdGreaterThanOrEqual  (optional)
   * @param bookingIdLessThanOrEqual  (optional)
   * @param bookingIdEquals  (optional)
   * @param bookingIdNotEquals  (optional)
   * @param bookingIdSpecified  (optional)
   * @param bookingIdIn  (optional)
   * @param bookingIdNotIn  (optional)
   * @param distinct  (optional)
   * @return Long
   */
  @RequestLine("GET /api/pricing-snapshots/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&baseFare.greaterThan={baseFareGreaterThan}&baseFare.lessThan={baseFareLessThan}&baseFare.greaterThanOrEqual={baseFareGreaterThanOrEqual}&baseFare.lessThanOrEqual={baseFareLessThanOrEqual}&baseFare.equals={baseFareEquals}&baseFare.notEquals={baseFareNotEquals}&baseFare.specified={baseFareSpecified}&baseFare.in={baseFareIn}&baseFare.notIn={baseFareNotIn}&vehicleFactor.greaterThan={vehicleFactorGreaterThan}&vehicleFactor.lessThan={vehicleFactorLessThan}&vehicleFactor.greaterThanOrEqual={vehicleFactorGreaterThanOrEqual}&vehicleFactor.lessThanOrEqual={vehicleFactorLessThanOrEqual}&vehicleFactor.equals={vehicleFactorEquals}&vehicleFactor.notEquals={vehicleFactorNotEquals}&vehicleFactor.specified={vehicleFactorSpecified}&vehicleFactor.in={vehicleFactorIn}&vehicleFactor.notIn={vehicleFactorNotIn}&floorFactor.greaterThan={floorFactorGreaterThan}&floorFactor.lessThan={floorFactorLessThan}&floorFactor.greaterThanOrEqual={floorFactorGreaterThanOrEqual}&floorFactor.lessThanOrEqual={floorFactorLessThanOrEqual}&floorFactor.equals={floorFactorEquals}&floorFactor.notEquals={floorFactorNotEquals}&floorFactor.specified={floorFactorSpecified}&floorFactor.in={floorFactorIn}&floorFactor.notIn={floorFactorNotIn}&seatFactor.greaterThan={seatFactorGreaterThan}&seatFactor.lessThan={seatFactorLessThan}&seatFactor.greaterThanOrEqual={seatFactorGreaterThanOrEqual}&seatFactor.lessThanOrEqual={seatFactorLessThanOrEqual}&seatFactor.equals={seatFactorEquals}&seatFactor.notEquals={seatFactorNotEquals}&seatFactor.specified={seatFactorSpecified}&seatFactor.in={seatFactorIn}&seatFactor.notIn={seatFactorNotIn}&scheduleOccasionFactor.greaterThan={scheduleOccasionFactorGreaterThan}&scheduleOccasionFactor.lessThan={scheduleOccasionFactorLessThan}&scheduleOccasionFactor.greaterThanOrEqual={scheduleOccasionFactorGreaterThanOrEqual}&scheduleOccasionFactor.lessThanOrEqual={scheduleOccasionFactorLessThanOrEqual}&scheduleOccasionFactor.equals={scheduleOccasionFactorEquals}&scheduleOccasionFactor.notEquals={scheduleOccasionFactorNotEquals}&scheduleOccasionFactor.specified={scheduleOccasionFactorSpecified}&scheduleOccasionFactor.in={scheduleOccasionFactorIn}&scheduleOccasionFactor.notIn={scheduleOccasionFactorNotIn}&finalPrice.greaterThan={finalPriceGreaterThan}&finalPrice.lessThan={finalPriceLessThan}&finalPrice.greaterThanOrEqual={finalPriceGreaterThanOrEqual}&finalPrice.lessThanOrEqual={finalPriceLessThanOrEqual}&finalPrice.equals={finalPriceEquals}&finalPrice.notEquals={finalPriceNotEquals}&finalPrice.specified={finalPriceSpecified}&finalPrice.in={finalPriceIn}&finalPrice.notIn={finalPriceNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&bookingId.greaterThan={bookingIdGreaterThan}&bookingId.lessThan={bookingIdLessThan}&bookingId.greaterThanOrEqual={bookingIdGreaterThanOrEqual}&bookingId.lessThanOrEqual={bookingIdLessThanOrEqual}&bookingId.equals={bookingIdEquals}&bookingId.notEquals={bookingIdNotEquals}&bookingId.specified={bookingIdSpecified}&bookingId.in={bookingIdIn}&bookingId.notIn={bookingIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countPricingSnapshots(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("baseFareGreaterThan") @jakarta.annotation.Nullable BigDecimal baseFareGreaterThan, @Param("baseFareLessThan") @jakarta.annotation.Nullable BigDecimal baseFareLessThan, @Param("baseFareGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal baseFareGreaterThanOrEqual, @Param("baseFareLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal baseFareLessThanOrEqual, @Param("baseFareEquals") @jakarta.annotation.Nullable BigDecimal baseFareEquals, @Param("baseFareNotEquals") @jakarta.annotation.Nullable BigDecimal baseFareNotEquals, @Param("baseFareSpecified") @jakarta.annotation.Nullable Boolean baseFareSpecified, @Param("baseFareIn") @jakarta.annotation.Nullable List<BigDecimal> baseFareIn, @Param("baseFareNotIn") @jakarta.annotation.Nullable List<BigDecimal> baseFareNotIn, @Param("vehicleFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal vehicleFactorGreaterThan, @Param("vehicleFactorLessThan") @jakarta.annotation.Nullable BigDecimal vehicleFactorLessThan, @Param("vehicleFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal vehicleFactorGreaterThanOrEqual, @Param("vehicleFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal vehicleFactorLessThanOrEqual, @Param("vehicleFactorEquals") @jakarta.annotation.Nullable BigDecimal vehicleFactorEquals, @Param("vehicleFactorNotEquals") @jakarta.annotation.Nullable BigDecimal vehicleFactorNotEquals, @Param("vehicleFactorSpecified") @jakarta.annotation.Nullable Boolean vehicleFactorSpecified, @Param("vehicleFactorIn") @jakarta.annotation.Nullable List<BigDecimal> vehicleFactorIn, @Param("vehicleFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> vehicleFactorNotIn, @Param("floorFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal floorFactorGreaterThan, @Param("floorFactorLessThan") @jakarta.annotation.Nullable BigDecimal floorFactorLessThan, @Param("floorFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal floorFactorGreaterThanOrEqual, @Param("floorFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal floorFactorLessThanOrEqual, @Param("floorFactorEquals") @jakarta.annotation.Nullable BigDecimal floorFactorEquals, @Param("floorFactorNotEquals") @jakarta.annotation.Nullable BigDecimal floorFactorNotEquals, @Param("floorFactorSpecified") @jakarta.annotation.Nullable Boolean floorFactorSpecified, @Param("floorFactorIn") @jakarta.annotation.Nullable List<BigDecimal> floorFactorIn, @Param("floorFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> floorFactorNotIn, @Param("seatFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal seatFactorGreaterThan, @Param("seatFactorLessThan") @jakarta.annotation.Nullable BigDecimal seatFactorLessThan, @Param("seatFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal seatFactorGreaterThanOrEqual, @Param("seatFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal seatFactorLessThanOrEqual, @Param("seatFactorEquals") @jakarta.annotation.Nullable BigDecimal seatFactorEquals, @Param("seatFactorNotEquals") @jakarta.annotation.Nullable BigDecimal seatFactorNotEquals, @Param("seatFactorSpecified") @jakarta.annotation.Nullable Boolean seatFactorSpecified, @Param("seatFactorIn") @jakarta.annotation.Nullable List<BigDecimal> seatFactorIn, @Param("seatFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> seatFactorNotIn, @Param("scheduleOccasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorGreaterThan, @Param("scheduleOccasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorLessThan, @Param("scheduleOccasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorGreaterThanOrEqual, @Param("scheduleOccasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorLessThanOrEqual, @Param("scheduleOccasionFactorEquals") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorEquals, @Param("scheduleOccasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorNotEquals, @Param("scheduleOccasionFactorSpecified") @jakarta.annotation.Nullable Boolean scheduleOccasionFactorSpecified, @Param("scheduleOccasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> scheduleOccasionFactorIn, @Param("scheduleOccasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> scheduleOccasionFactorNotIn, @Param("finalPriceGreaterThan") @jakarta.annotation.Nullable BigDecimal finalPriceGreaterThan, @Param("finalPriceLessThan") @jakarta.annotation.Nullable BigDecimal finalPriceLessThan, @Param("finalPriceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal finalPriceGreaterThanOrEqual, @Param("finalPriceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal finalPriceLessThanOrEqual, @Param("finalPriceEquals") @jakarta.annotation.Nullable BigDecimal finalPriceEquals, @Param("finalPriceNotEquals") @jakarta.annotation.Nullable BigDecimal finalPriceNotEquals, @Param("finalPriceSpecified") @jakarta.annotation.Nullable Boolean finalPriceSpecified, @Param("finalPriceIn") @jakarta.annotation.Nullable List<BigDecimal> finalPriceIn, @Param("finalPriceNotIn") @jakarta.annotation.Nullable List<BigDecimal> finalPriceNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("bookingIdGreaterThan") @jakarta.annotation.Nullable Long bookingIdGreaterThan, @Param("bookingIdLessThan") @jakarta.annotation.Nullable Long bookingIdLessThan, @Param("bookingIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long bookingIdGreaterThanOrEqual, @Param("bookingIdLessThanOrEqual") @jakarta.annotation.Nullable Long bookingIdLessThanOrEqual, @Param("bookingIdEquals") @jakarta.annotation.Nullable Long bookingIdEquals, @Param("bookingIdNotEquals") @jakarta.annotation.Nullable Long bookingIdNotEquals, @Param("bookingIdSpecified") @jakarta.annotation.Nullable Boolean bookingIdSpecified, @Param("bookingIdIn") @jakarta.annotation.Nullable List<Long> bookingIdIn, @Param("bookingIdNotIn") @jakarta.annotation.Nullable List<Long> bookingIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countPricingSnapshots</code> but it also returns the http response headers .
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
   * @param scheduleOccasionFactorGreaterThan  (optional)
   * @param scheduleOccasionFactorLessThan  (optional)
   * @param scheduleOccasionFactorGreaterThanOrEqual  (optional)
   * @param scheduleOccasionFactorLessThanOrEqual  (optional)
   * @param scheduleOccasionFactorEquals  (optional)
   * @param scheduleOccasionFactorNotEquals  (optional)
   * @param scheduleOccasionFactorSpecified  (optional)
   * @param scheduleOccasionFactorIn  (optional)
   * @param scheduleOccasionFactorNotIn  (optional)
   * @param finalPriceGreaterThan  (optional)
   * @param finalPriceLessThan  (optional)
   * @param finalPriceGreaterThanOrEqual  (optional)
   * @param finalPriceLessThanOrEqual  (optional)
   * @param finalPriceEquals  (optional)
   * @param finalPriceNotEquals  (optional)
   * @param finalPriceSpecified  (optional)
   * @param finalPriceIn  (optional)
   * @param finalPriceNotIn  (optional)
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
   * @param bookingIdGreaterThan  (optional)
   * @param bookingIdLessThan  (optional)
   * @param bookingIdGreaterThanOrEqual  (optional)
   * @param bookingIdLessThanOrEqual  (optional)
   * @param bookingIdEquals  (optional)
   * @param bookingIdNotEquals  (optional)
   * @param bookingIdSpecified  (optional)
   * @param bookingIdIn  (optional)
   * @param bookingIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/pricing-snapshots/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&baseFare.greaterThan={baseFareGreaterThan}&baseFare.lessThan={baseFareLessThan}&baseFare.greaterThanOrEqual={baseFareGreaterThanOrEqual}&baseFare.lessThanOrEqual={baseFareLessThanOrEqual}&baseFare.equals={baseFareEquals}&baseFare.notEquals={baseFareNotEquals}&baseFare.specified={baseFareSpecified}&baseFare.in={baseFareIn}&baseFare.notIn={baseFareNotIn}&vehicleFactor.greaterThan={vehicleFactorGreaterThan}&vehicleFactor.lessThan={vehicleFactorLessThan}&vehicleFactor.greaterThanOrEqual={vehicleFactorGreaterThanOrEqual}&vehicleFactor.lessThanOrEqual={vehicleFactorLessThanOrEqual}&vehicleFactor.equals={vehicleFactorEquals}&vehicleFactor.notEquals={vehicleFactorNotEquals}&vehicleFactor.specified={vehicleFactorSpecified}&vehicleFactor.in={vehicleFactorIn}&vehicleFactor.notIn={vehicleFactorNotIn}&floorFactor.greaterThan={floorFactorGreaterThan}&floorFactor.lessThan={floorFactorLessThan}&floorFactor.greaterThanOrEqual={floorFactorGreaterThanOrEqual}&floorFactor.lessThanOrEqual={floorFactorLessThanOrEqual}&floorFactor.equals={floorFactorEquals}&floorFactor.notEquals={floorFactorNotEquals}&floorFactor.specified={floorFactorSpecified}&floorFactor.in={floorFactorIn}&floorFactor.notIn={floorFactorNotIn}&seatFactor.greaterThan={seatFactorGreaterThan}&seatFactor.lessThan={seatFactorLessThan}&seatFactor.greaterThanOrEqual={seatFactorGreaterThanOrEqual}&seatFactor.lessThanOrEqual={seatFactorLessThanOrEqual}&seatFactor.equals={seatFactorEquals}&seatFactor.notEquals={seatFactorNotEquals}&seatFactor.specified={seatFactorSpecified}&seatFactor.in={seatFactorIn}&seatFactor.notIn={seatFactorNotIn}&scheduleOccasionFactor.greaterThan={scheduleOccasionFactorGreaterThan}&scheduleOccasionFactor.lessThan={scheduleOccasionFactorLessThan}&scheduleOccasionFactor.greaterThanOrEqual={scheduleOccasionFactorGreaterThanOrEqual}&scheduleOccasionFactor.lessThanOrEqual={scheduleOccasionFactorLessThanOrEqual}&scheduleOccasionFactor.equals={scheduleOccasionFactorEquals}&scheduleOccasionFactor.notEquals={scheduleOccasionFactorNotEquals}&scheduleOccasionFactor.specified={scheduleOccasionFactorSpecified}&scheduleOccasionFactor.in={scheduleOccasionFactorIn}&scheduleOccasionFactor.notIn={scheduleOccasionFactorNotIn}&finalPrice.greaterThan={finalPriceGreaterThan}&finalPrice.lessThan={finalPriceLessThan}&finalPrice.greaterThanOrEqual={finalPriceGreaterThanOrEqual}&finalPrice.lessThanOrEqual={finalPriceLessThanOrEqual}&finalPrice.equals={finalPriceEquals}&finalPrice.notEquals={finalPriceNotEquals}&finalPrice.specified={finalPriceSpecified}&finalPrice.in={finalPriceIn}&finalPrice.notIn={finalPriceNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&bookingId.greaterThan={bookingIdGreaterThan}&bookingId.lessThan={bookingIdLessThan}&bookingId.greaterThanOrEqual={bookingIdGreaterThanOrEqual}&bookingId.lessThanOrEqual={bookingIdLessThanOrEqual}&bookingId.equals={bookingIdEquals}&bookingId.notEquals={bookingIdNotEquals}&bookingId.specified={bookingIdSpecified}&bookingId.in={bookingIdIn}&bookingId.notIn={bookingIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countPricingSnapshotsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("baseFareGreaterThan") @jakarta.annotation.Nullable BigDecimal baseFareGreaterThan, @Param("baseFareLessThan") @jakarta.annotation.Nullable BigDecimal baseFareLessThan, @Param("baseFareGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal baseFareGreaterThanOrEqual, @Param("baseFareLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal baseFareLessThanOrEqual, @Param("baseFareEquals") @jakarta.annotation.Nullable BigDecimal baseFareEquals, @Param("baseFareNotEquals") @jakarta.annotation.Nullable BigDecimal baseFareNotEquals, @Param("baseFareSpecified") @jakarta.annotation.Nullable Boolean baseFareSpecified, @Param("baseFareIn") @jakarta.annotation.Nullable List<BigDecimal> baseFareIn, @Param("baseFareNotIn") @jakarta.annotation.Nullable List<BigDecimal> baseFareNotIn, @Param("vehicleFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal vehicleFactorGreaterThan, @Param("vehicleFactorLessThan") @jakarta.annotation.Nullable BigDecimal vehicleFactorLessThan, @Param("vehicleFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal vehicleFactorGreaterThanOrEqual, @Param("vehicleFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal vehicleFactorLessThanOrEqual, @Param("vehicleFactorEquals") @jakarta.annotation.Nullable BigDecimal vehicleFactorEquals, @Param("vehicleFactorNotEquals") @jakarta.annotation.Nullable BigDecimal vehicleFactorNotEquals, @Param("vehicleFactorSpecified") @jakarta.annotation.Nullable Boolean vehicleFactorSpecified, @Param("vehicleFactorIn") @jakarta.annotation.Nullable List<BigDecimal> vehicleFactorIn, @Param("vehicleFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> vehicleFactorNotIn, @Param("floorFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal floorFactorGreaterThan, @Param("floorFactorLessThan") @jakarta.annotation.Nullable BigDecimal floorFactorLessThan, @Param("floorFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal floorFactorGreaterThanOrEqual, @Param("floorFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal floorFactorLessThanOrEqual, @Param("floorFactorEquals") @jakarta.annotation.Nullable BigDecimal floorFactorEquals, @Param("floorFactorNotEquals") @jakarta.annotation.Nullable BigDecimal floorFactorNotEquals, @Param("floorFactorSpecified") @jakarta.annotation.Nullable Boolean floorFactorSpecified, @Param("floorFactorIn") @jakarta.annotation.Nullable List<BigDecimal> floorFactorIn, @Param("floorFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> floorFactorNotIn, @Param("seatFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal seatFactorGreaterThan, @Param("seatFactorLessThan") @jakarta.annotation.Nullable BigDecimal seatFactorLessThan, @Param("seatFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal seatFactorGreaterThanOrEqual, @Param("seatFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal seatFactorLessThanOrEqual, @Param("seatFactorEquals") @jakarta.annotation.Nullable BigDecimal seatFactorEquals, @Param("seatFactorNotEquals") @jakarta.annotation.Nullable BigDecimal seatFactorNotEquals, @Param("seatFactorSpecified") @jakarta.annotation.Nullable Boolean seatFactorSpecified, @Param("seatFactorIn") @jakarta.annotation.Nullable List<BigDecimal> seatFactorIn, @Param("seatFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> seatFactorNotIn, @Param("scheduleOccasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorGreaterThan, @Param("scheduleOccasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorLessThan, @Param("scheduleOccasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorGreaterThanOrEqual, @Param("scheduleOccasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorLessThanOrEqual, @Param("scheduleOccasionFactorEquals") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorEquals, @Param("scheduleOccasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorNotEquals, @Param("scheduleOccasionFactorSpecified") @jakarta.annotation.Nullable Boolean scheduleOccasionFactorSpecified, @Param("scheduleOccasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> scheduleOccasionFactorIn, @Param("scheduleOccasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> scheduleOccasionFactorNotIn, @Param("finalPriceGreaterThan") @jakarta.annotation.Nullable BigDecimal finalPriceGreaterThan, @Param("finalPriceLessThan") @jakarta.annotation.Nullable BigDecimal finalPriceLessThan, @Param("finalPriceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal finalPriceGreaterThanOrEqual, @Param("finalPriceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal finalPriceLessThanOrEqual, @Param("finalPriceEquals") @jakarta.annotation.Nullable BigDecimal finalPriceEquals, @Param("finalPriceNotEquals") @jakarta.annotation.Nullable BigDecimal finalPriceNotEquals, @Param("finalPriceSpecified") @jakarta.annotation.Nullable Boolean finalPriceSpecified, @Param("finalPriceIn") @jakarta.annotation.Nullable List<BigDecimal> finalPriceIn, @Param("finalPriceNotIn") @jakarta.annotation.Nullable List<BigDecimal> finalPriceNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("bookingIdGreaterThan") @jakarta.annotation.Nullable Long bookingIdGreaterThan, @Param("bookingIdLessThan") @jakarta.annotation.Nullable Long bookingIdLessThan, @Param("bookingIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long bookingIdGreaterThanOrEqual, @Param("bookingIdLessThanOrEqual") @jakarta.annotation.Nullable Long bookingIdLessThanOrEqual, @Param("bookingIdEquals") @jakarta.annotation.Nullable Long bookingIdEquals, @Param("bookingIdNotEquals") @jakarta.annotation.Nullable Long bookingIdNotEquals, @Param("bookingIdSpecified") @jakarta.annotation.Nullable Boolean bookingIdSpecified, @Param("bookingIdIn") @jakarta.annotation.Nullable List<Long> bookingIdIn, @Param("bookingIdNotIn") @jakarta.annotation.Nullable List<Long> bookingIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countPricingSnapshots</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountPricingSnapshotsQueryParams} class that allows for
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
   *   <li>scheduleOccasionFactorGreaterThan -  (optional)</li>
   *   <li>scheduleOccasionFactorLessThan -  (optional)</li>
   *   <li>scheduleOccasionFactorGreaterThanOrEqual -  (optional)</li>
   *   <li>scheduleOccasionFactorLessThanOrEqual -  (optional)</li>
   *   <li>scheduleOccasionFactorEquals -  (optional)</li>
   *   <li>scheduleOccasionFactorNotEquals -  (optional)</li>
   *   <li>scheduleOccasionFactorSpecified -  (optional)</li>
   *   <li>scheduleOccasionFactorIn -  (optional)</li>
   *   <li>scheduleOccasionFactorNotIn -  (optional)</li>
   *   <li>finalPriceGreaterThan -  (optional)</li>
   *   <li>finalPriceLessThan -  (optional)</li>
   *   <li>finalPriceGreaterThanOrEqual -  (optional)</li>
   *   <li>finalPriceLessThanOrEqual -  (optional)</li>
   *   <li>finalPriceEquals -  (optional)</li>
   *   <li>finalPriceNotEquals -  (optional)</li>
   *   <li>finalPriceSpecified -  (optional)</li>
   *   <li>finalPriceIn -  (optional)</li>
   *   <li>finalPriceNotIn -  (optional)</li>
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
   *   <li>bookingIdGreaterThan -  (optional)</li>
   *   <li>bookingIdLessThan -  (optional)</li>
   *   <li>bookingIdGreaterThanOrEqual -  (optional)</li>
   *   <li>bookingIdLessThanOrEqual -  (optional)</li>
   *   <li>bookingIdEquals -  (optional)</li>
   *   <li>bookingIdNotEquals -  (optional)</li>
   *   <li>bookingIdSpecified -  (optional)</li>
   *   <li>bookingIdIn -  (optional)</li>
   *   <li>bookingIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return Long
   */
  @RequestLine("GET /api/pricing-snapshots/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&baseFare.greaterThan={baseFareGreaterThan}&baseFare.lessThan={baseFareLessThan}&baseFare.greaterThanOrEqual={baseFareGreaterThanOrEqual}&baseFare.lessThanOrEqual={baseFareLessThanOrEqual}&baseFare.equals={baseFareEquals}&baseFare.notEquals={baseFareNotEquals}&baseFare.specified={baseFareSpecified}&baseFare.in={baseFareIn}&baseFare.notIn={baseFareNotIn}&vehicleFactor.greaterThan={vehicleFactorGreaterThan}&vehicleFactor.lessThan={vehicleFactorLessThan}&vehicleFactor.greaterThanOrEqual={vehicleFactorGreaterThanOrEqual}&vehicleFactor.lessThanOrEqual={vehicleFactorLessThanOrEqual}&vehicleFactor.equals={vehicleFactorEquals}&vehicleFactor.notEquals={vehicleFactorNotEquals}&vehicleFactor.specified={vehicleFactorSpecified}&vehicleFactor.in={vehicleFactorIn}&vehicleFactor.notIn={vehicleFactorNotIn}&floorFactor.greaterThan={floorFactorGreaterThan}&floorFactor.lessThan={floorFactorLessThan}&floorFactor.greaterThanOrEqual={floorFactorGreaterThanOrEqual}&floorFactor.lessThanOrEqual={floorFactorLessThanOrEqual}&floorFactor.equals={floorFactorEquals}&floorFactor.notEquals={floorFactorNotEquals}&floorFactor.specified={floorFactorSpecified}&floorFactor.in={floorFactorIn}&floorFactor.notIn={floorFactorNotIn}&seatFactor.greaterThan={seatFactorGreaterThan}&seatFactor.lessThan={seatFactorLessThan}&seatFactor.greaterThanOrEqual={seatFactorGreaterThanOrEqual}&seatFactor.lessThanOrEqual={seatFactorLessThanOrEqual}&seatFactor.equals={seatFactorEquals}&seatFactor.notEquals={seatFactorNotEquals}&seatFactor.specified={seatFactorSpecified}&seatFactor.in={seatFactorIn}&seatFactor.notIn={seatFactorNotIn}&scheduleOccasionFactor.greaterThan={scheduleOccasionFactorGreaterThan}&scheduleOccasionFactor.lessThan={scheduleOccasionFactorLessThan}&scheduleOccasionFactor.greaterThanOrEqual={scheduleOccasionFactorGreaterThanOrEqual}&scheduleOccasionFactor.lessThanOrEqual={scheduleOccasionFactorLessThanOrEqual}&scheduleOccasionFactor.equals={scheduleOccasionFactorEquals}&scheduleOccasionFactor.notEquals={scheduleOccasionFactorNotEquals}&scheduleOccasionFactor.specified={scheduleOccasionFactorSpecified}&scheduleOccasionFactor.in={scheduleOccasionFactorIn}&scheduleOccasionFactor.notIn={scheduleOccasionFactorNotIn}&finalPrice.greaterThan={finalPriceGreaterThan}&finalPrice.lessThan={finalPriceLessThan}&finalPrice.greaterThanOrEqual={finalPriceGreaterThanOrEqual}&finalPrice.lessThanOrEqual={finalPriceLessThanOrEqual}&finalPrice.equals={finalPriceEquals}&finalPrice.notEquals={finalPriceNotEquals}&finalPrice.specified={finalPriceSpecified}&finalPrice.in={finalPriceIn}&finalPrice.notIn={finalPriceNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&bookingId.greaterThan={bookingIdGreaterThan}&bookingId.lessThan={bookingIdLessThan}&bookingId.greaterThanOrEqual={bookingIdGreaterThanOrEqual}&bookingId.lessThanOrEqual={bookingIdLessThanOrEqual}&bookingId.equals={bookingIdEquals}&bookingId.notEquals={bookingIdNotEquals}&bookingId.specified={bookingIdSpecified}&bookingId.in={bookingIdIn}&bookingId.notIn={bookingIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countPricingSnapshots(@QueryMap(encoded=true) CountPricingSnapshotsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countPricingSnapshots</code> that receives the query parameters as a map,
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
          *   <li>scheduleOccasionFactorGreaterThan -  (optional)</li>
          *   <li>scheduleOccasionFactorLessThan -  (optional)</li>
          *   <li>scheduleOccasionFactorGreaterThanOrEqual -  (optional)</li>
          *   <li>scheduleOccasionFactorLessThanOrEqual -  (optional)</li>
          *   <li>scheduleOccasionFactorEquals -  (optional)</li>
          *   <li>scheduleOccasionFactorNotEquals -  (optional)</li>
          *   <li>scheduleOccasionFactorSpecified -  (optional)</li>
          *   <li>scheduleOccasionFactorIn -  (optional)</li>
          *   <li>scheduleOccasionFactorNotIn -  (optional)</li>
          *   <li>finalPriceGreaterThan -  (optional)</li>
          *   <li>finalPriceLessThan -  (optional)</li>
          *   <li>finalPriceGreaterThanOrEqual -  (optional)</li>
          *   <li>finalPriceLessThanOrEqual -  (optional)</li>
          *   <li>finalPriceEquals -  (optional)</li>
          *   <li>finalPriceNotEquals -  (optional)</li>
          *   <li>finalPriceSpecified -  (optional)</li>
          *   <li>finalPriceIn -  (optional)</li>
          *   <li>finalPriceNotIn -  (optional)</li>
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
          *   <li>bookingIdGreaterThan -  (optional)</li>
          *   <li>bookingIdLessThan -  (optional)</li>
          *   <li>bookingIdGreaterThanOrEqual -  (optional)</li>
          *   <li>bookingIdLessThanOrEqual -  (optional)</li>
          *   <li>bookingIdEquals -  (optional)</li>
          *   <li>bookingIdNotEquals -  (optional)</li>
          *   <li>bookingIdSpecified -  (optional)</li>
          *   <li>bookingIdIn -  (optional)</li>
          *   <li>bookingIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return Long
      */
      @RequestLine("GET /api/pricing-snapshots/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&baseFare.greaterThan={baseFareGreaterThan}&baseFare.lessThan={baseFareLessThan}&baseFare.greaterThanOrEqual={baseFareGreaterThanOrEqual}&baseFare.lessThanOrEqual={baseFareLessThanOrEqual}&baseFare.equals={baseFareEquals}&baseFare.notEquals={baseFareNotEquals}&baseFare.specified={baseFareSpecified}&baseFare.in={baseFareIn}&baseFare.notIn={baseFareNotIn}&vehicleFactor.greaterThan={vehicleFactorGreaterThan}&vehicleFactor.lessThan={vehicleFactorLessThan}&vehicleFactor.greaterThanOrEqual={vehicleFactorGreaterThanOrEqual}&vehicleFactor.lessThanOrEqual={vehicleFactorLessThanOrEqual}&vehicleFactor.equals={vehicleFactorEquals}&vehicleFactor.notEquals={vehicleFactorNotEquals}&vehicleFactor.specified={vehicleFactorSpecified}&vehicleFactor.in={vehicleFactorIn}&vehicleFactor.notIn={vehicleFactorNotIn}&floorFactor.greaterThan={floorFactorGreaterThan}&floorFactor.lessThan={floorFactorLessThan}&floorFactor.greaterThanOrEqual={floorFactorGreaterThanOrEqual}&floorFactor.lessThanOrEqual={floorFactorLessThanOrEqual}&floorFactor.equals={floorFactorEquals}&floorFactor.notEquals={floorFactorNotEquals}&floorFactor.specified={floorFactorSpecified}&floorFactor.in={floorFactorIn}&floorFactor.notIn={floorFactorNotIn}&seatFactor.greaterThan={seatFactorGreaterThan}&seatFactor.lessThan={seatFactorLessThan}&seatFactor.greaterThanOrEqual={seatFactorGreaterThanOrEqual}&seatFactor.lessThanOrEqual={seatFactorLessThanOrEqual}&seatFactor.equals={seatFactorEquals}&seatFactor.notEquals={seatFactorNotEquals}&seatFactor.specified={seatFactorSpecified}&seatFactor.in={seatFactorIn}&seatFactor.notIn={seatFactorNotIn}&scheduleOccasionFactor.greaterThan={scheduleOccasionFactorGreaterThan}&scheduleOccasionFactor.lessThan={scheduleOccasionFactorLessThan}&scheduleOccasionFactor.greaterThanOrEqual={scheduleOccasionFactorGreaterThanOrEqual}&scheduleOccasionFactor.lessThanOrEqual={scheduleOccasionFactorLessThanOrEqual}&scheduleOccasionFactor.equals={scheduleOccasionFactorEquals}&scheduleOccasionFactor.notEquals={scheduleOccasionFactorNotEquals}&scheduleOccasionFactor.specified={scheduleOccasionFactorSpecified}&scheduleOccasionFactor.in={scheduleOccasionFactorIn}&scheduleOccasionFactor.notIn={scheduleOccasionFactorNotIn}&finalPrice.greaterThan={finalPriceGreaterThan}&finalPrice.lessThan={finalPriceLessThan}&finalPrice.greaterThanOrEqual={finalPriceGreaterThanOrEqual}&finalPrice.lessThanOrEqual={finalPriceLessThanOrEqual}&finalPrice.equals={finalPriceEquals}&finalPrice.notEquals={finalPriceNotEquals}&finalPrice.specified={finalPriceSpecified}&finalPrice.in={finalPriceIn}&finalPrice.notIn={finalPriceNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&bookingId.greaterThan={bookingIdGreaterThan}&bookingId.lessThan={bookingIdLessThan}&bookingId.greaterThanOrEqual={bookingIdGreaterThanOrEqual}&bookingId.lessThanOrEqual={bookingIdLessThanOrEqual}&bookingId.equals={bookingIdEquals}&bookingId.notEquals={bookingIdNotEquals}&bookingId.specified={bookingIdSpecified}&bookingId.in={bookingIdIn}&bookingId.notIn={bookingIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countPricingSnapshotsWithHttpInfo(@QueryMap(encoded=true) CountPricingSnapshotsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countPricingSnapshots</code> method in a fluent style.
   */
  public static class CountPricingSnapshotsQueryParams extends HashMap<String, Object> {
    public CountPricingSnapshotsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams baseFareGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams baseFareLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams baseFareGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams baseFareLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams baseFareEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams baseFareNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams baseFareSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("baseFare.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams baseFareIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("baseFare.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams baseFareNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("baseFare.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams vehicleFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams vehicleFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams vehicleFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams vehicleFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams vehicleFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams vehicleFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams vehicleFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehicleFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams vehicleFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("vehicleFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams vehicleFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("vehicleFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams floorFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams floorFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams floorFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams floorFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams floorFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams floorFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams floorFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("floorFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams floorFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("floorFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams floorFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("floorFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams seatFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams seatFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams seatFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams seatFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams seatFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams seatFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams seatFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("seatFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams seatFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("seatFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams seatFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("seatFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams scheduleOccasionFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("scheduleOccasionFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams scheduleOccasionFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("scheduleOccasionFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams scheduleOccasionFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("scheduleOccasionFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams scheduleOccasionFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("scheduleOccasionFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams scheduleOccasionFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("scheduleOccasionFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams scheduleOccasionFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("scheduleOccasionFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams scheduleOccasionFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("scheduleOccasionFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams scheduleOccasionFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("scheduleOccasionFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams scheduleOccasionFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("scheduleOccasionFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams finalPriceGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams finalPriceLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams finalPriceGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams finalPriceLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams finalPriceEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams finalPriceNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams finalPriceSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("finalPrice.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams finalPriceIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("finalPrice.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams finalPriceNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("finalPrice.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams bookingIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams bookingIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams bookingIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams bookingIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams bookingIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams bookingIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams bookingIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("bookingId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPricingSnapshotsQueryParams bookingIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("bookingId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams bookingIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("bookingId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPricingSnapshotsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param pricingSnapshotDTO  (required)
   * @return PricingSnapshotDTO
   */
  @RequestLine("POST /api/pricing-snapshots")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  PricingSnapshotDTO createPricingSnapshot(@jakarta.annotation.Nonnull PricingSnapshotDTO pricingSnapshotDTO);

  /**
   * 
   * Similar to <code>createPricingSnapshot</code> but it also returns the http response headers .
   * 
   * @param pricingSnapshotDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/pricing-snapshots")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<PricingSnapshotDTO> createPricingSnapshotWithHttpInfo(@jakarta.annotation.Nonnull PricingSnapshotDTO pricingSnapshotDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/pricing-snapshots/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deletePricingSnapshot(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deletePricingSnapshot</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/pricing-snapshots/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deletePricingSnapshotWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



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
   * @param scheduleOccasionFactorGreaterThan  (optional)
   * @param scheduleOccasionFactorLessThan  (optional)
   * @param scheduleOccasionFactorGreaterThanOrEqual  (optional)
   * @param scheduleOccasionFactorLessThanOrEqual  (optional)
   * @param scheduleOccasionFactorEquals  (optional)
   * @param scheduleOccasionFactorNotEquals  (optional)
   * @param scheduleOccasionFactorSpecified  (optional)
   * @param scheduleOccasionFactorIn  (optional)
   * @param scheduleOccasionFactorNotIn  (optional)
   * @param finalPriceGreaterThan  (optional)
   * @param finalPriceLessThan  (optional)
   * @param finalPriceGreaterThanOrEqual  (optional)
   * @param finalPriceLessThanOrEqual  (optional)
   * @param finalPriceEquals  (optional)
   * @param finalPriceNotEquals  (optional)
   * @param finalPriceSpecified  (optional)
   * @param finalPriceIn  (optional)
   * @param finalPriceNotIn  (optional)
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
   * @param bookingIdGreaterThan  (optional)
   * @param bookingIdLessThan  (optional)
   * @param bookingIdGreaterThanOrEqual  (optional)
   * @param bookingIdLessThanOrEqual  (optional)
   * @param bookingIdEquals  (optional)
   * @param bookingIdNotEquals  (optional)
   * @param bookingIdSpecified  (optional)
   * @param bookingIdIn  (optional)
   * @param bookingIdNotIn  (optional)
   * @param distinct  (optional)
   * @return List&lt;PricingSnapshotDTO&gt;
   */
  @RequestLine("GET /api/pricing-snapshots?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&baseFare.greaterThan={baseFareGreaterThan}&baseFare.lessThan={baseFareLessThan}&baseFare.greaterThanOrEqual={baseFareGreaterThanOrEqual}&baseFare.lessThanOrEqual={baseFareLessThanOrEqual}&baseFare.equals={baseFareEquals}&baseFare.notEquals={baseFareNotEquals}&baseFare.specified={baseFareSpecified}&baseFare.in={baseFareIn}&baseFare.notIn={baseFareNotIn}&vehicleFactor.greaterThan={vehicleFactorGreaterThan}&vehicleFactor.lessThan={vehicleFactorLessThan}&vehicleFactor.greaterThanOrEqual={vehicleFactorGreaterThanOrEqual}&vehicleFactor.lessThanOrEqual={vehicleFactorLessThanOrEqual}&vehicleFactor.equals={vehicleFactorEquals}&vehicleFactor.notEquals={vehicleFactorNotEquals}&vehicleFactor.specified={vehicleFactorSpecified}&vehicleFactor.in={vehicleFactorIn}&vehicleFactor.notIn={vehicleFactorNotIn}&floorFactor.greaterThan={floorFactorGreaterThan}&floorFactor.lessThan={floorFactorLessThan}&floorFactor.greaterThanOrEqual={floorFactorGreaterThanOrEqual}&floorFactor.lessThanOrEqual={floorFactorLessThanOrEqual}&floorFactor.equals={floorFactorEquals}&floorFactor.notEquals={floorFactorNotEquals}&floorFactor.specified={floorFactorSpecified}&floorFactor.in={floorFactorIn}&floorFactor.notIn={floorFactorNotIn}&seatFactor.greaterThan={seatFactorGreaterThan}&seatFactor.lessThan={seatFactorLessThan}&seatFactor.greaterThanOrEqual={seatFactorGreaterThanOrEqual}&seatFactor.lessThanOrEqual={seatFactorLessThanOrEqual}&seatFactor.equals={seatFactorEquals}&seatFactor.notEquals={seatFactorNotEquals}&seatFactor.specified={seatFactorSpecified}&seatFactor.in={seatFactorIn}&seatFactor.notIn={seatFactorNotIn}&scheduleOccasionFactor.greaterThan={scheduleOccasionFactorGreaterThan}&scheduleOccasionFactor.lessThan={scheduleOccasionFactorLessThan}&scheduleOccasionFactor.greaterThanOrEqual={scheduleOccasionFactorGreaterThanOrEqual}&scheduleOccasionFactor.lessThanOrEqual={scheduleOccasionFactorLessThanOrEqual}&scheduleOccasionFactor.equals={scheduleOccasionFactorEquals}&scheduleOccasionFactor.notEquals={scheduleOccasionFactorNotEquals}&scheduleOccasionFactor.specified={scheduleOccasionFactorSpecified}&scheduleOccasionFactor.in={scheduleOccasionFactorIn}&scheduleOccasionFactor.notIn={scheduleOccasionFactorNotIn}&finalPrice.greaterThan={finalPriceGreaterThan}&finalPrice.lessThan={finalPriceLessThan}&finalPrice.greaterThanOrEqual={finalPriceGreaterThanOrEqual}&finalPrice.lessThanOrEqual={finalPriceLessThanOrEqual}&finalPrice.equals={finalPriceEquals}&finalPrice.notEquals={finalPriceNotEquals}&finalPrice.specified={finalPriceSpecified}&finalPrice.in={finalPriceIn}&finalPrice.notIn={finalPriceNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&bookingId.greaterThan={bookingIdGreaterThan}&bookingId.lessThan={bookingIdLessThan}&bookingId.greaterThanOrEqual={bookingIdGreaterThanOrEqual}&bookingId.lessThanOrEqual={bookingIdLessThanOrEqual}&bookingId.equals={bookingIdEquals}&bookingId.notEquals={bookingIdNotEquals}&bookingId.specified={bookingIdSpecified}&bookingId.in={bookingIdIn}&bookingId.notIn={bookingIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  List<PricingSnapshotDTO> getAllPricingSnapshots(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("baseFareGreaterThan") @jakarta.annotation.Nullable BigDecimal baseFareGreaterThan, @Param("baseFareLessThan") @jakarta.annotation.Nullable BigDecimal baseFareLessThan, @Param("baseFareGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal baseFareGreaterThanOrEqual, @Param("baseFareLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal baseFareLessThanOrEqual, @Param("baseFareEquals") @jakarta.annotation.Nullable BigDecimal baseFareEquals, @Param("baseFareNotEquals") @jakarta.annotation.Nullable BigDecimal baseFareNotEquals, @Param("baseFareSpecified") @jakarta.annotation.Nullable Boolean baseFareSpecified, @Param("baseFareIn") @jakarta.annotation.Nullable List<BigDecimal> baseFareIn, @Param("baseFareNotIn") @jakarta.annotation.Nullable List<BigDecimal> baseFareNotIn, @Param("vehicleFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal vehicleFactorGreaterThan, @Param("vehicleFactorLessThan") @jakarta.annotation.Nullable BigDecimal vehicleFactorLessThan, @Param("vehicleFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal vehicleFactorGreaterThanOrEqual, @Param("vehicleFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal vehicleFactorLessThanOrEqual, @Param("vehicleFactorEquals") @jakarta.annotation.Nullable BigDecimal vehicleFactorEquals, @Param("vehicleFactorNotEquals") @jakarta.annotation.Nullable BigDecimal vehicleFactorNotEquals, @Param("vehicleFactorSpecified") @jakarta.annotation.Nullable Boolean vehicleFactorSpecified, @Param("vehicleFactorIn") @jakarta.annotation.Nullable List<BigDecimal> vehicleFactorIn, @Param("vehicleFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> vehicleFactorNotIn, @Param("floorFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal floorFactorGreaterThan, @Param("floorFactorLessThan") @jakarta.annotation.Nullable BigDecimal floorFactorLessThan, @Param("floorFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal floorFactorGreaterThanOrEqual, @Param("floorFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal floorFactorLessThanOrEqual, @Param("floorFactorEquals") @jakarta.annotation.Nullable BigDecimal floorFactorEquals, @Param("floorFactorNotEquals") @jakarta.annotation.Nullable BigDecimal floorFactorNotEquals, @Param("floorFactorSpecified") @jakarta.annotation.Nullable Boolean floorFactorSpecified, @Param("floorFactorIn") @jakarta.annotation.Nullable List<BigDecimal> floorFactorIn, @Param("floorFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> floorFactorNotIn, @Param("seatFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal seatFactorGreaterThan, @Param("seatFactorLessThan") @jakarta.annotation.Nullable BigDecimal seatFactorLessThan, @Param("seatFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal seatFactorGreaterThanOrEqual, @Param("seatFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal seatFactorLessThanOrEqual, @Param("seatFactorEquals") @jakarta.annotation.Nullable BigDecimal seatFactorEquals, @Param("seatFactorNotEquals") @jakarta.annotation.Nullable BigDecimal seatFactorNotEquals, @Param("seatFactorSpecified") @jakarta.annotation.Nullable Boolean seatFactorSpecified, @Param("seatFactorIn") @jakarta.annotation.Nullable List<BigDecimal> seatFactorIn, @Param("seatFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> seatFactorNotIn, @Param("scheduleOccasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorGreaterThan, @Param("scheduleOccasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorLessThan, @Param("scheduleOccasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorGreaterThanOrEqual, @Param("scheduleOccasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorLessThanOrEqual, @Param("scheduleOccasionFactorEquals") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorEquals, @Param("scheduleOccasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorNotEquals, @Param("scheduleOccasionFactorSpecified") @jakarta.annotation.Nullable Boolean scheduleOccasionFactorSpecified, @Param("scheduleOccasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> scheduleOccasionFactorIn, @Param("scheduleOccasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> scheduleOccasionFactorNotIn, @Param("finalPriceGreaterThan") @jakarta.annotation.Nullable BigDecimal finalPriceGreaterThan, @Param("finalPriceLessThan") @jakarta.annotation.Nullable BigDecimal finalPriceLessThan, @Param("finalPriceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal finalPriceGreaterThanOrEqual, @Param("finalPriceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal finalPriceLessThanOrEqual, @Param("finalPriceEquals") @jakarta.annotation.Nullable BigDecimal finalPriceEquals, @Param("finalPriceNotEquals") @jakarta.annotation.Nullable BigDecimal finalPriceNotEquals, @Param("finalPriceSpecified") @jakarta.annotation.Nullable Boolean finalPriceSpecified, @Param("finalPriceIn") @jakarta.annotation.Nullable List<BigDecimal> finalPriceIn, @Param("finalPriceNotIn") @jakarta.annotation.Nullable List<BigDecimal> finalPriceNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("bookingIdGreaterThan") @jakarta.annotation.Nullable Long bookingIdGreaterThan, @Param("bookingIdLessThan") @jakarta.annotation.Nullable Long bookingIdLessThan, @Param("bookingIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long bookingIdGreaterThanOrEqual, @Param("bookingIdLessThanOrEqual") @jakarta.annotation.Nullable Long bookingIdLessThanOrEqual, @Param("bookingIdEquals") @jakarta.annotation.Nullable Long bookingIdEquals, @Param("bookingIdNotEquals") @jakarta.annotation.Nullable Long bookingIdNotEquals, @Param("bookingIdSpecified") @jakarta.annotation.Nullable Boolean bookingIdSpecified, @Param("bookingIdIn") @jakarta.annotation.Nullable List<Long> bookingIdIn, @Param("bookingIdNotIn") @jakarta.annotation.Nullable List<Long> bookingIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>getAllPricingSnapshots</code> but it also returns the http response headers .
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
   * @param scheduleOccasionFactorGreaterThan  (optional)
   * @param scheduleOccasionFactorLessThan  (optional)
   * @param scheduleOccasionFactorGreaterThanOrEqual  (optional)
   * @param scheduleOccasionFactorLessThanOrEqual  (optional)
   * @param scheduleOccasionFactorEquals  (optional)
   * @param scheduleOccasionFactorNotEquals  (optional)
   * @param scheduleOccasionFactorSpecified  (optional)
   * @param scheduleOccasionFactorIn  (optional)
   * @param scheduleOccasionFactorNotIn  (optional)
   * @param finalPriceGreaterThan  (optional)
   * @param finalPriceLessThan  (optional)
   * @param finalPriceGreaterThanOrEqual  (optional)
   * @param finalPriceLessThanOrEqual  (optional)
   * @param finalPriceEquals  (optional)
   * @param finalPriceNotEquals  (optional)
   * @param finalPriceSpecified  (optional)
   * @param finalPriceIn  (optional)
   * @param finalPriceNotIn  (optional)
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
   * @param bookingIdGreaterThan  (optional)
   * @param bookingIdLessThan  (optional)
   * @param bookingIdGreaterThanOrEqual  (optional)
   * @param bookingIdLessThanOrEqual  (optional)
   * @param bookingIdEquals  (optional)
   * @param bookingIdNotEquals  (optional)
   * @param bookingIdSpecified  (optional)
   * @param bookingIdIn  (optional)
   * @param bookingIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/pricing-snapshots?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&baseFare.greaterThan={baseFareGreaterThan}&baseFare.lessThan={baseFareLessThan}&baseFare.greaterThanOrEqual={baseFareGreaterThanOrEqual}&baseFare.lessThanOrEqual={baseFareLessThanOrEqual}&baseFare.equals={baseFareEquals}&baseFare.notEquals={baseFareNotEquals}&baseFare.specified={baseFareSpecified}&baseFare.in={baseFareIn}&baseFare.notIn={baseFareNotIn}&vehicleFactor.greaterThan={vehicleFactorGreaterThan}&vehicleFactor.lessThan={vehicleFactorLessThan}&vehicleFactor.greaterThanOrEqual={vehicleFactorGreaterThanOrEqual}&vehicleFactor.lessThanOrEqual={vehicleFactorLessThanOrEqual}&vehicleFactor.equals={vehicleFactorEquals}&vehicleFactor.notEquals={vehicleFactorNotEquals}&vehicleFactor.specified={vehicleFactorSpecified}&vehicleFactor.in={vehicleFactorIn}&vehicleFactor.notIn={vehicleFactorNotIn}&floorFactor.greaterThan={floorFactorGreaterThan}&floorFactor.lessThan={floorFactorLessThan}&floorFactor.greaterThanOrEqual={floorFactorGreaterThanOrEqual}&floorFactor.lessThanOrEqual={floorFactorLessThanOrEqual}&floorFactor.equals={floorFactorEquals}&floorFactor.notEquals={floorFactorNotEquals}&floorFactor.specified={floorFactorSpecified}&floorFactor.in={floorFactorIn}&floorFactor.notIn={floorFactorNotIn}&seatFactor.greaterThan={seatFactorGreaterThan}&seatFactor.lessThan={seatFactorLessThan}&seatFactor.greaterThanOrEqual={seatFactorGreaterThanOrEqual}&seatFactor.lessThanOrEqual={seatFactorLessThanOrEqual}&seatFactor.equals={seatFactorEquals}&seatFactor.notEquals={seatFactorNotEquals}&seatFactor.specified={seatFactorSpecified}&seatFactor.in={seatFactorIn}&seatFactor.notIn={seatFactorNotIn}&scheduleOccasionFactor.greaterThan={scheduleOccasionFactorGreaterThan}&scheduleOccasionFactor.lessThan={scheduleOccasionFactorLessThan}&scheduleOccasionFactor.greaterThanOrEqual={scheduleOccasionFactorGreaterThanOrEqual}&scheduleOccasionFactor.lessThanOrEqual={scheduleOccasionFactorLessThanOrEqual}&scheduleOccasionFactor.equals={scheduleOccasionFactorEquals}&scheduleOccasionFactor.notEquals={scheduleOccasionFactorNotEquals}&scheduleOccasionFactor.specified={scheduleOccasionFactorSpecified}&scheduleOccasionFactor.in={scheduleOccasionFactorIn}&scheduleOccasionFactor.notIn={scheduleOccasionFactorNotIn}&finalPrice.greaterThan={finalPriceGreaterThan}&finalPrice.lessThan={finalPriceLessThan}&finalPrice.greaterThanOrEqual={finalPriceGreaterThanOrEqual}&finalPrice.lessThanOrEqual={finalPriceLessThanOrEqual}&finalPrice.equals={finalPriceEquals}&finalPrice.notEquals={finalPriceNotEquals}&finalPrice.specified={finalPriceSpecified}&finalPrice.in={finalPriceIn}&finalPrice.notIn={finalPriceNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&bookingId.greaterThan={bookingIdGreaterThan}&bookingId.lessThan={bookingIdLessThan}&bookingId.greaterThanOrEqual={bookingIdGreaterThanOrEqual}&bookingId.lessThanOrEqual={bookingIdLessThanOrEqual}&bookingId.equals={bookingIdEquals}&bookingId.notEquals={bookingIdNotEquals}&bookingId.specified={bookingIdSpecified}&bookingId.in={bookingIdIn}&bookingId.notIn={bookingIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<PricingSnapshotDTO>> getAllPricingSnapshotsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("baseFareGreaterThan") @jakarta.annotation.Nullable BigDecimal baseFareGreaterThan, @Param("baseFareLessThan") @jakarta.annotation.Nullable BigDecimal baseFareLessThan, @Param("baseFareGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal baseFareGreaterThanOrEqual, @Param("baseFareLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal baseFareLessThanOrEqual, @Param("baseFareEquals") @jakarta.annotation.Nullable BigDecimal baseFareEquals, @Param("baseFareNotEquals") @jakarta.annotation.Nullable BigDecimal baseFareNotEquals, @Param("baseFareSpecified") @jakarta.annotation.Nullable Boolean baseFareSpecified, @Param("baseFareIn") @jakarta.annotation.Nullable List<BigDecimal> baseFareIn, @Param("baseFareNotIn") @jakarta.annotation.Nullable List<BigDecimal> baseFareNotIn, @Param("vehicleFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal vehicleFactorGreaterThan, @Param("vehicleFactorLessThan") @jakarta.annotation.Nullable BigDecimal vehicleFactorLessThan, @Param("vehicleFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal vehicleFactorGreaterThanOrEqual, @Param("vehicleFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal vehicleFactorLessThanOrEqual, @Param("vehicleFactorEquals") @jakarta.annotation.Nullable BigDecimal vehicleFactorEquals, @Param("vehicleFactorNotEquals") @jakarta.annotation.Nullable BigDecimal vehicleFactorNotEquals, @Param("vehicleFactorSpecified") @jakarta.annotation.Nullable Boolean vehicleFactorSpecified, @Param("vehicleFactorIn") @jakarta.annotation.Nullable List<BigDecimal> vehicleFactorIn, @Param("vehicleFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> vehicleFactorNotIn, @Param("floorFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal floorFactorGreaterThan, @Param("floorFactorLessThan") @jakarta.annotation.Nullable BigDecimal floorFactorLessThan, @Param("floorFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal floorFactorGreaterThanOrEqual, @Param("floorFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal floorFactorLessThanOrEqual, @Param("floorFactorEquals") @jakarta.annotation.Nullable BigDecimal floorFactorEquals, @Param("floorFactorNotEquals") @jakarta.annotation.Nullable BigDecimal floorFactorNotEquals, @Param("floorFactorSpecified") @jakarta.annotation.Nullable Boolean floorFactorSpecified, @Param("floorFactorIn") @jakarta.annotation.Nullable List<BigDecimal> floorFactorIn, @Param("floorFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> floorFactorNotIn, @Param("seatFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal seatFactorGreaterThan, @Param("seatFactorLessThan") @jakarta.annotation.Nullable BigDecimal seatFactorLessThan, @Param("seatFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal seatFactorGreaterThanOrEqual, @Param("seatFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal seatFactorLessThanOrEqual, @Param("seatFactorEquals") @jakarta.annotation.Nullable BigDecimal seatFactorEquals, @Param("seatFactorNotEquals") @jakarta.annotation.Nullable BigDecimal seatFactorNotEquals, @Param("seatFactorSpecified") @jakarta.annotation.Nullable Boolean seatFactorSpecified, @Param("seatFactorIn") @jakarta.annotation.Nullable List<BigDecimal> seatFactorIn, @Param("seatFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> seatFactorNotIn, @Param("scheduleOccasionFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorGreaterThan, @Param("scheduleOccasionFactorLessThan") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorLessThan, @Param("scheduleOccasionFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorGreaterThanOrEqual, @Param("scheduleOccasionFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorLessThanOrEqual, @Param("scheduleOccasionFactorEquals") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorEquals, @Param("scheduleOccasionFactorNotEquals") @jakarta.annotation.Nullable BigDecimal scheduleOccasionFactorNotEquals, @Param("scheduleOccasionFactorSpecified") @jakarta.annotation.Nullable Boolean scheduleOccasionFactorSpecified, @Param("scheduleOccasionFactorIn") @jakarta.annotation.Nullable List<BigDecimal> scheduleOccasionFactorIn, @Param("scheduleOccasionFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> scheduleOccasionFactorNotIn, @Param("finalPriceGreaterThan") @jakarta.annotation.Nullable BigDecimal finalPriceGreaterThan, @Param("finalPriceLessThan") @jakarta.annotation.Nullable BigDecimal finalPriceLessThan, @Param("finalPriceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal finalPriceGreaterThanOrEqual, @Param("finalPriceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal finalPriceLessThanOrEqual, @Param("finalPriceEquals") @jakarta.annotation.Nullable BigDecimal finalPriceEquals, @Param("finalPriceNotEquals") @jakarta.annotation.Nullable BigDecimal finalPriceNotEquals, @Param("finalPriceSpecified") @jakarta.annotation.Nullable Boolean finalPriceSpecified, @Param("finalPriceIn") @jakarta.annotation.Nullable List<BigDecimal> finalPriceIn, @Param("finalPriceNotIn") @jakarta.annotation.Nullable List<BigDecimal> finalPriceNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("bookingIdGreaterThan") @jakarta.annotation.Nullable Long bookingIdGreaterThan, @Param("bookingIdLessThan") @jakarta.annotation.Nullable Long bookingIdLessThan, @Param("bookingIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long bookingIdGreaterThanOrEqual, @Param("bookingIdLessThanOrEqual") @jakarta.annotation.Nullable Long bookingIdLessThanOrEqual, @Param("bookingIdEquals") @jakarta.annotation.Nullable Long bookingIdEquals, @Param("bookingIdNotEquals") @jakarta.annotation.Nullable Long bookingIdNotEquals, @Param("bookingIdSpecified") @jakarta.annotation.Nullable Boolean bookingIdSpecified, @Param("bookingIdIn") @jakarta.annotation.Nullable List<Long> bookingIdIn, @Param("bookingIdNotIn") @jakarta.annotation.Nullable List<Long> bookingIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllPricingSnapshots</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllPricingSnapshotsQueryParams} class that allows for
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
   *   <li>scheduleOccasionFactorGreaterThan -  (optional)</li>
   *   <li>scheduleOccasionFactorLessThan -  (optional)</li>
   *   <li>scheduleOccasionFactorGreaterThanOrEqual -  (optional)</li>
   *   <li>scheduleOccasionFactorLessThanOrEqual -  (optional)</li>
   *   <li>scheduleOccasionFactorEquals -  (optional)</li>
   *   <li>scheduleOccasionFactorNotEquals -  (optional)</li>
   *   <li>scheduleOccasionFactorSpecified -  (optional)</li>
   *   <li>scheduleOccasionFactorIn -  (optional)</li>
   *   <li>scheduleOccasionFactorNotIn -  (optional)</li>
   *   <li>finalPriceGreaterThan -  (optional)</li>
   *   <li>finalPriceLessThan -  (optional)</li>
   *   <li>finalPriceGreaterThanOrEqual -  (optional)</li>
   *   <li>finalPriceLessThanOrEqual -  (optional)</li>
   *   <li>finalPriceEquals -  (optional)</li>
   *   <li>finalPriceNotEquals -  (optional)</li>
   *   <li>finalPriceSpecified -  (optional)</li>
   *   <li>finalPriceIn -  (optional)</li>
   *   <li>finalPriceNotIn -  (optional)</li>
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
   *   <li>bookingIdGreaterThan -  (optional)</li>
   *   <li>bookingIdLessThan -  (optional)</li>
   *   <li>bookingIdGreaterThanOrEqual -  (optional)</li>
   *   <li>bookingIdLessThanOrEqual -  (optional)</li>
   *   <li>bookingIdEquals -  (optional)</li>
   *   <li>bookingIdNotEquals -  (optional)</li>
   *   <li>bookingIdSpecified -  (optional)</li>
   *   <li>bookingIdIn -  (optional)</li>
   *   <li>bookingIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return List&lt;PricingSnapshotDTO&gt;
   */
  @RequestLine("GET /api/pricing-snapshots?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&baseFare.greaterThan={baseFareGreaterThan}&baseFare.lessThan={baseFareLessThan}&baseFare.greaterThanOrEqual={baseFareGreaterThanOrEqual}&baseFare.lessThanOrEqual={baseFareLessThanOrEqual}&baseFare.equals={baseFareEquals}&baseFare.notEquals={baseFareNotEquals}&baseFare.specified={baseFareSpecified}&baseFare.in={baseFareIn}&baseFare.notIn={baseFareNotIn}&vehicleFactor.greaterThan={vehicleFactorGreaterThan}&vehicleFactor.lessThan={vehicleFactorLessThan}&vehicleFactor.greaterThanOrEqual={vehicleFactorGreaterThanOrEqual}&vehicleFactor.lessThanOrEqual={vehicleFactorLessThanOrEqual}&vehicleFactor.equals={vehicleFactorEquals}&vehicleFactor.notEquals={vehicleFactorNotEquals}&vehicleFactor.specified={vehicleFactorSpecified}&vehicleFactor.in={vehicleFactorIn}&vehicleFactor.notIn={vehicleFactorNotIn}&floorFactor.greaterThan={floorFactorGreaterThan}&floorFactor.lessThan={floorFactorLessThan}&floorFactor.greaterThanOrEqual={floorFactorGreaterThanOrEqual}&floorFactor.lessThanOrEqual={floorFactorLessThanOrEqual}&floorFactor.equals={floorFactorEquals}&floorFactor.notEquals={floorFactorNotEquals}&floorFactor.specified={floorFactorSpecified}&floorFactor.in={floorFactorIn}&floorFactor.notIn={floorFactorNotIn}&seatFactor.greaterThan={seatFactorGreaterThan}&seatFactor.lessThan={seatFactorLessThan}&seatFactor.greaterThanOrEqual={seatFactorGreaterThanOrEqual}&seatFactor.lessThanOrEqual={seatFactorLessThanOrEqual}&seatFactor.equals={seatFactorEquals}&seatFactor.notEquals={seatFactorNotEquals}&seatFactor.specified={seatFactorSpecified}&seatFactor.in={seatFactorIn}&seatFactor.notIn={seatFactorNotIn}&scheduleOccasionFactor.greaterThan={scheduleOccasionFactorGreaterThan}&scheduleOccasionFactor.lessThan={scheduleOccasionFactorLessThan}&scheduleOccasionFactor.greaterThanOrEqual={scheduleOccasionFactorGreaterThanOrEqual}&scheduleOccasionFactor.lessThanOrEqual={scheduleOccasionFactorLessThanOrEqual}&scheduleOccasionFactor.equals={scheduleOccasionFactorEquals}&scheduleOccasionFactor.notEquals={scheduleOccasionFactorNotEquals}&scheduleOccasionFactor.specified={scheduleOccasionFactorSpecified}&scheduleOccasionFactor.in={scheduleOccasionFactorIn}&scheduleOccasionFactor.notIn={scheduleOccasionFactorNotIn}&finalPrice.greaterThan={finalPriceGreaterThan}&finalPrice.lessThan={finalPriceLessThan}&finalPrice.greaterThanOrEqual={finalPriceGreaterThanOrEqual}&finalPrice.lessThanOrEqual={finalPriceLessThanOrEqual}&finalPrice.equals={finalPriceEquals}&finalPrice.notEquals={finalPriceNotEquals}&finalPrice.specified={finalPriceSpecified}&finalPrice.in={finalPriceIn}&finalPrice.notIn={finalPriceNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&bookingId.greaterThan={bookingIdGreaterThan}&bookingId.lessThan={bookingIdLessThan}&bookingId.greaterThanOrEqual={bookingIdGreaterThanOrEqual}&bookingId.lessThanOrEqual={bookingIdLessThanOrEqual}&bookingId.equals={bookingIdEquals}&bookingId.notEquals={bookingIdNotEquals}&bookingId.specified={bookingIdSpecified}&bookingId.in={bookingIdIn}&bookingId.notIn={bookingIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  List<PricingSnapshotDTO> getAllPricingSnapshots(@QueryMap(encoded=true) GetAllPricingSnapshotsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllPricingSnapshots</code> that receives the query parameters as a map,
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
          *   <li>scheduleOccasionFactorGreaterThan -  (optional)</li>
          *   <li>scheduleOccasionFactorLessThan -  (optional)</li>
          *   <li>scheduleOccasionFactorGreaterThanOrEqual -  (optional)</li>
          *   <li>scheduleOccasionFactorLessThanOrEqual -  (optional)</li>
          *   <li>scheduleOccasionFactorEquals -  (optional)</li>
          *   <li>scheduleOccasionFactorNotEquals -  (optional)</li>
          *   <li>scheduleOccasionFactorSpecified -  (optional)</li>
          *   <li>scheduleOccasionFactorIn -  (optional)</li>
          *   <li>scheduleOccasionFactorNotIn -  (optional)</li>
          *   <li>finalPriceGreaterThan -  (optional)</li>
          *   <li>finalPriceLessThan -  (optional)</li>
          *   <li>finalPriceGreaterThanOrEqual -  (optional)</li>
          *   <li>finalPriceLessThanOrEqual -  (optional)</li>
          *   <li>finalPriceEquals -  (optional)</li>
          *   <li>finalPriceNotEquals -  (optional)</li>
          *   <li>finalPriceSpecified -  (optional)</li>
          *   <li>finalPriceIn -  (optional)</li>
          *   <li>finalPriceNotIn -  (optional)</li>
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
          *   <li>bookingIdGreaterThan -  (optional)</li>
          *   <li>bookingIdLessThan -  (optional)</li>
          *   <li>bookingIdGreaterThanOrEqual -  (optional)</li>
          *   <li>bookingIdLessThanOrEqual -  (optional)</li>
          *   <li>bookingIdEquals -  (optional)</li>
          *   <li>bookingIdNotEquals -  (optional)</li>
          *   <li>bookingIdSpecified -  (optional)</li>
          *   <li>bookingIdIn -  (optional)</li>
          *   <li>bookingIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return List&lt;PricingSnapshotDTO&gt;
      */
      @RequestLine("GET /api/pricing-snapshots?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&baseFare.greaterThan={baseFareGreaterThan}&baseFare.lessThan={baseFareLessThan}&baseFare.greaterThanOrEqual={baseFareGreaterThanOrEqual}&baseFare.lessThanOrEqual={baseFareLessThanOrEqual}&baseFare.equals={baseFareEquals}&baseFare.notEquals={baseFareNotEquals}&baseFare.specified={baseFareSpecified}&baseFare.in={baseFareIn}&baseFare.notIn={baseFareNotIn}&vehicleFactor.greaterThan={vehicleFactorGreaterThan}&vehicleFactor.lessThan={vehicleFactorLessThan}&vehicleFactor.greaterThanOrEqual={vehicleFactorGreaterThanOrEqual}&vehicleFactor.lessThanOrEqual={vehicleFactorLessThanOrEqual}&vehicleFactor.equals={vehicleFactorEquals}&vehicleFactor.notEquals={vehicleFactorNotEquals}&vehicleFactor.specified={vehicleFactorSpecified}&vehicleFactor.in={vehicleFactorIn}&vehicleFactor.notIn={vehicleFactorNotIn}&floorFactor.greaterThan={floorFactorGreaterThan}&floorFactor.lessThan={floorFactorLessThan}&floorFactor.greaterThanOrEqual={floorFactorGreaterThanOrEqual}&floorFactor.lessThanOrEqual={floorFactorLessThanOrEqual}&floorFactor.equals={floorFactorEquals}&floorFactor.notEquals={floorFactorNotEquals}&floorFactor.specified={floorFactorSpecified}&floorFactor.in={floorFactorIn}&floorFactor.notIn={floorFactorNotIn}&seatFactor.greaterThan={seatFactorGreaterThan}&seatFactor.lessThan={seatFactorLessThan}&seatFactor.greaterThanOrEqual={seatFactorGreaterThanOrEqual}&seatFactor.lessThanOrEqual={seatFactorLessThanOrEqual}&seatFactor.equals={seatFactorEquals}&seatFactor.notEquals={seatFactorNotEquals}&seatFactor.specified={seatFactorSpecified}&seatFactor.in={seatFactorIn}&seatFactor.notIn={seatFactorNotIn}&scheduleOccasionFactor.greaterThan={scheduleOccasionFactorGreaterThan}&scheduleOccasionFactor.lessThan={scheduleOccasionFactorLessThan}&scheduleOccasionFactor.greaterThanOrEqual={scheduleOccasionFactorGreaterThanOrEqual}&scheduleOccasionFactor.lessThanOrEqual={scheduleOccasionFactorLessThanOrEqual}&scheduleOccasionFactor.equals={scheduleOccasionFactorEquals}&scheduleOccasionFactor.notEquals={scheduleOccasionFactorNotEquals}&scheduleOccasionFactor.specified={scheduleOccasionFactorSpecified}&scheduleOccasionFactor.in={scheduleOccasionFactorIn}&scheduleOccasionFactor.notIn={scheduleOccasionFactorNotIn}&finalPrice.greaterThan={finalPriceGreaterThan}&finalPrice.lessThan={finalPriceLessThan}&finalPrice.greaterThanOrEqual={finalPriceGreaterThanOrEqual}&finalPrice.lessThanOrEqual={finalPriceLessThanOrEqual}&finalPrice.equals={finalPriceEquals}&finalPrice.notEquals={finalPriceNotEquals}&finalPrice.specified={finalPriceSpecified}&finalPrice.in={finalPriceIn}&finalPrice.notIn={finalPriceNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&bookingId.greaterThan={bookingIdGreaterThan}&bookingId.lessThan={bookingIdLessThan}&bookingId.greaterThanOrEqual={bookingIdGreaterThanOrEqual}&bookingId.lessThanOrEqual={bookingIdLessThanOrEqual}&bookingId.equals={bookingIdEquals}&bookingId.notEquals={bookingIdNotEquals}&bookingId.specified={bookingIdSpecified}&bookingId.in={bookingIdIn}&bookingId.notIn={bookingIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<PricingSnapshotDTO>> getAllPricingSnapshotsWithHttpInfo(@QueryMap(encoded=true) GetAllPricingSnapshotsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllPricingSnapshots</code> method in a fluent style.
   */
  public static class GetAllPricingSnapshotsQueryParams extends HashMap<String, Object> {
    public GetAllPricingSnapshotsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams baseFareGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams baseFareLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams baseFareGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams baseFareLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams baseFareEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams baseFareNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("baseFare.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams baseFareSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("baseFare.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams baseFareIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("baseFare.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams baseFareNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("baseFare.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams vehicleFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams vehicleFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams vehicleFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams vehicleFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams vehicleFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams vehicleFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("vehicleFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams vehicleFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehicleFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams vehicleFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("vehicleFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams vehicleFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("vehicleFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams floorFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams floorFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams floorFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams floorFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams floorFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams floorFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("floorFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams floorFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("floorFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams floorFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("floorFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams floorFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("floorFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams seatFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams seatFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams seatFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams seatFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams seatFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams seatFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("seatFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams seatFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("seatFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams seatFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("seatFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams seatFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("seatFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams scheduleOccasionFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("scheduleOccasionFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams scheduleOccasionFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("scheduleOccasionFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams scheduleOccasionFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("scheduleOccasionFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams scheduleOccasionFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("scheduleOccasionFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams scheduleOccasionFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("scheduleOccasionFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams scheduleOccasionFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("scheduleOccasionFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams scheduleOccasionFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("scheduleOccasionFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams scheduleOccasionFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("scheduleOccasionFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams scheduleOccasionFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("scheduleOccasionFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams finalPriceGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams finalPriceLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams finalPriceGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams finalPriceLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams finalPriceEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams finalPriceNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("finalPrice.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams finalPriceSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("finalPrice.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams finalPriceIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("finalPrice.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams finalPriceNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("finalPrice.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams bookingIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams bookingIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams bookingIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams bookingIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams bookingIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams bookingIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams bookingIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("bookingId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams bookingIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("bookingId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams bookingIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("bookingId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPricingSnapshotsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return PricingSnapshotDTO
   */
  @RequestLine("GET /api/pricing-snapshots/{id}")
  @Headers({
    "Accept: */*",
  })
  PricingSnapshotDTO getPricingSnapshot(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getPricingSnapshot</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/pricing-snapshots/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<PricingSnapshotDTO> getPricingSnapshotWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param pricingSnapshotDTO  (required)
   * @return PricingSnapshotDTO
   */
  @RequestLine("PATCH /api/pricing-snapshots/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  PricingSnapshotDTO partialUpdatePricingSnapshot(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull PricingSnapshotDTO pricingSnapshotDTO);

  /**
   * 
   * Similar to <code>partialUpdatePricingSnapshot</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param pricingSnapshotDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/pricing-snapshots/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<PricingSnapshotDTO> partialUpdatePricingSnapshotWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull PricingSnapshotDTO pricingSnapshotDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param pricingSnapshotDTO  (required)
   * @return PricingSnapshotDTO
   */
  @RequestLine("PUT /api/pricing-snapshots/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  PricingSnapshotDTO updatePricingSnapshot(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull PricingSnapshotDTO pricingSnapshotDTO);

  /**
   * 
   * Similar to <code>updatePricingSnapshot</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param pricingSnapshotDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/pricing-snapshots/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<PricingSnapshotDTO> updatePricingSnapshotWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull PricingSnapshotDTO pricingSnapshotDTO);


}
