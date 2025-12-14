package com.ridehub.feign.msuser.client.api;

import com.ridehub.feign.msuser.client.invoker.ApiClient;
import com.ridehub.feign.msuser.client.invoker.EncodingUtils;
import com.ridehub.feign.msuser.client.model.ApiResponse;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.ridehub.feign.msuser.client.model.UserStatisticsDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface UserStatisticsResourceMsuserApi extends ApiClient.Api {


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
   * @param totalTripsGreaterThan  (optional)
   * @param totalTripsLessThan  (optional)
   * @param totalTripsGreaterThanOrEqual  (optional)
   * @param totalTripsLessThanOrEqual  (optional)
   * @param totalTripsEquals  (optional)
   * @param totalTripsNotEquals  (optional)
   * @param totalTripsSpecified  (optional)
   * @param totalTripsIn  (optional)
   * @param totalTripsNotIn  (optional)
   * @param totalSpentGreaterThan  (optional)
   * @param totalSpentLessThan  (optional)
   * @param totalSpentGreaterThanOrEqual  (optional)
   * @param totalSpentLessThanOrEqual  (optional)
   * @param totalSpentEquals  (optional)
   * @param totalSpentNotEquals  (optional)
   * @param totalSpentSpecified  (optional)
   * @param totalSpentIn  (optional)
   * @param totalSpentNotIn  (optional)
   * @param favoriteRoutesContains  (optional)
   * @param favoriteRoutesDoesNotContain  (optional)
   * @param favoriteRoutesEquals  (optional)
   * @param favoriteRoutesNotEquals  (optional)
   * @param favoriteRoutesSpecified  (optional)
   * @param favoriteRoutesIn  (optional)
   * @param favoriteRoutesNotIn  (optional)
   * @param preferredVehicleTypesContains  (optional)
   * @param preferredVehicleTypesDoesNotContain  (optional)
   * @param preferredVehicleTypesEquals  (optional)
   * @param preferredVehicleTypesNotEquals  (optional)
   * @param preferredVehicleTypesSpecified  (optional)
   * @param preferredVehicleTypesIn  (optional)
   * @param preferredVehicleTypesNotIn  (optional)
   * @param averageTripDurationGreaterThan  (optional)
   * @param averageTripDurationLessThan  (optional)
   * @param averageTripDurationGreaterThanOrEqual  (optional)
   * @param averageTripDurationLessThanOrEqual  (optional)
   * @param averageTripDurationEquals  (optional)
   * @param averageTripDurationNotEquals  (optional)
   * @param averageTripDurationSpecified  (optional)
   * @param averageTripDurationIn  (optional)
   * @param averageTripDurationNotIn  (optional)
   * @param lastTravelDateGreaterThan  (optional)
   * @param lastTravelDateLessThan  (optional)
   * @param lastTravelDateGreaterThanOrEqual  (optional)
   * @param lastTravelDateLessThanOrEqual  (optional)
   * @param lastTravelDateEquals  (optional)
   * @param lastTravelDateNotEquals  (optional)
   * @param lastTravelDateSpecified  (optional)
   * @param lastTravelDateIn  (optional)
   * @param lastTravelDateNotIn  (optional)
   * @param bookingFrequencyContains  (optional)
   * @param bookingFrequencyDoesNotContain  (optional)
   * @param bookingFrequencyEquals  (optional)
   * @param bookingFrequencyNotEquals  (optional)
   * @param bookingFrequencySpecified  (optional)
   * @param bookingFrequencyIn  (optional)
   * @param bookingFrequencyNotIn  (optional)
   * @param loyaltyPointsGreaterThan  (optional)
   * @param loyaltyPointsLessThan  (optional)
   * @param loyaltyPointsGreaterThanOrEqual  (optional)
   * @param loyaltyPointsLessThanOrEqual  (optional)
   * @param loyaltyPointsEquals  (optional)
   * @param loyaltyPointsNotEquals  (optional)
   * @param loyaltyPointsSpecified  (optional)
   * @param loyaltyPointsIn  (optional)
   * @param loyaltyPointsNotIn  (optional)
   * @param mostFrequentOriginContains  (optional)
   * @param mostFrequentOriginDoesNotContain  (optional)
   * @param mostFrequentOriginEquals  (optional)
   * @param mostFrequentOriginNotEquals  (optional)
   * @param mostFrequentOriginSpecified  (optional)
   * @param mostFrequentOriginIn  (optional)
   * @param mostFrequentOriginNotIn  (optional)
   * @param mostFrequentDestinationContains  (optional)
   * @param mostFrequentDestinationDoesNotContain  (optional)
   * @param mostFrequentDestinationEquals  (optional)
   * @param mostFrequentDestinationNotEquals  (optional)
   * @param mostFrequentDestinationSpecified  (optional)
   * @param mostFrequentDestinationIn  (optional)
   * @param mostFrequentDestinationNotIn  (optional)
   * @param averageTripDistanceGreaterThan  (optional)
   * @param averageTripDistanceLessThan  (optional)
   * @param averageTripDistanceGreaterThanOrEqual  (optional)
   * @param averageTripDistanceLessThanOrEqual  (optional)
   * @param averageTripDistanceEquals  (optional)
   * @param averageTripDistanceNotEquals  (optional)
   * @param averageTripDistanceSpecified  (optional)
   * @param averageTripDistanceIn  (optional)
   * @param averageTripDistanceNotIn  (optional)
   * @param peakTravelTimeContains  (optional)
   * @param peakTravelTimeDoesNotContain  (optional)
   * @param peakTravelTimeEquals  (optional)
   * @param peakTravelTimeNotEquals  (optional)
   * @param peakTravelTimeSpecified  (optional)
   * @param peakTravelTimeIn  (optional)
   * @param peakTravelTimeNotIn  (optional)
   * @param weekendTripsGreaterThan  (optional)
   * @param weekendTripsLessThan  (optional)
   * @param weekendTripsGreaterThanOrEqual  (optional)
   * @param weekendTripsLessThanOrEqual  (optional)
   * @param weekendTripsEquals  (optional)
   * @param weekendTripsNotEquals  (optional)
   * @param weekendTripsSpecified  (optional)
   * @param weekendTripsIn  (optional)
   * @param weekendTripsNotIn  (optional)
   * @param holidayTripsGreaterThan  (optional)
   * @param holidayTripsLessThan  (optional)
   * @param holidayTripsGreaterThanOrEqual  (optional)
   * @param holidayTripsLessThanOrEqual  (optional)
   * @param holidayTripsEquals  (optional)
   * @param holidayTripsNotEquals  (optional)
   * @param holidayTripsSpecified  (optional)
   * @param holidayTripsIn  (optional)
   * @param holidayTripsNotIn  (optional)
   * @param cancelledTripsGreaterThan  (optional)
   * @param cancelledTripsLessThan  (optional)
   * @param cancelledTripsGreaterThanOrEqual  (optional)
   * @param cancelledTripsLessThanOrEqual  (optional)
   * @param cancelledTripsEquals  (optional)
   * @param cancelledTripsNotEquals  (optional)
   * @param cancelledTripsSpecified  (optional)
   * @param cancelledTripsIn  (optional)
   * @param cancelledTripsNotIn  (optional)
   * @param onTimePerformanceRateGreaterThan  (optional)
   * @param onTimePerformanceRateLessThan  (optional)
   * @param onTimePerformanceRateGreaterThanOrEqual  (optional)
   * @param onTimePerformanceRateLessThanOrEqual  (optional)
   * @param onTimePerformanceRateEquals  (optional)
   * @param onTimePerformanceRateNotEquals  (optional)
   * @param onTimePerformanceRateSpecified  (optional)
   * @param onTimePerformanceRateIn  (optional)
   * @param onTimePerformanceRateNotIn  (optional)
   * @param preferredSeatTypesContains  (optional)
   * @param preferredSeatTypesDoesNotContain  (optional)
   * @param preferredSeatTypesEquals  (optional)
   * @param preferredSeatTypesNotEquals  (optional)
   * @param preferredSeatTypesSpecified  (optional)
   * @param preferredSeatTypesIn  (optional)
   * @param preferredSeatTypesNotIn  (optional)
   * @param monthlyTripCountGreaterThan  (optional)
   * @param monthlyTripCountLessThan  (optional)
   * @param monthlyTripCountGreaterThanOrEqual  (optional)
   * @param monthlyTripCountLessThanOrEqual  (optional)
   * @param monthlyTripCountEquals  (optional)
   * @param monthlyTripCountNotEquals  (optional)
   * @param monthlyTripCountSpecified  (optional)
   * @param monthlyTripCountIn  (optional)
   * @param monthlyTripCountNotIn  (optional)
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
   * @param userIdGreaterThan  (optional)
   * @param userIdLessThan  (optional)
   * @param userIdGreaterThanOrEqual  (optional)
   * @param userIdLessThanOrEqual  (optional)
   * @param userIdEquals  (optional)
   * @param userIdNotEquals  (optional)
   * @param userIdSpecified  (optional)
   * @param userIdIn  (optional)
   * @param userIdNotIn  (optional)
   * @param distinct  (optional)
   * @return Long
   */
  @RequestLine("GET /api/user-statistics/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&totalTrips.greaterThan={totalTripsGreaterThan}&totalTrips.lessThan={totalTripsLessThan}&totalTrips.greaterThanOrEqual={totalTripsGreaterThanOrEqual}&totalTrips.lessThanOrEqual={totalTripsLessThanOrEqual}&totalTrips.equals={totalTripsEquals}&totalTrips.notEquals={totalTripsNotEquals}&totalTrips.specified={totalTripsSpecified}&totalTrips.in={totalTripsIn}&totalTrips.notIn={totalTripsNotIn}&totalSpent.greaterThan={totalSpentGreaterThan}&totalSpent.lessThan={totalSpentLessThan}&totalSpent.greaterThanOrEqual={totalSpentGreaterThanOrEqual}&totalSpent.lessThanOrEqual={totalSpentLessThanOrEqual}&totalSpent.equals={totalSpentEquals}&totalSpent.notEquals={totalSpentNotEquals}&totalSpent.specified={totalSpentSpecified}&totalSpent.in={totalSpentIn}&totalSpent.notIn={totalSpentNotIn}&favoriteRoutes.contains={favoriteRoutesContains}&favoriteRoutes.doesNotContain={favoriteRoutesDoesNotContain}&favoriteRoutes.equals={favoriteRoutesEquals}&favoriteRoutes.notEquals={favoriteRoutesNotEquals}&favoriteRoutes.specified={favoriteRoutesSpecified}&favoriteRoutes.in={favoriteRoutesIn}&favoriteRoutes.notIn={favoriteRoutesNotIn}&preferredVehicleTypes.contains={preferredVehicleTypesContains}&preferredVehicleTypes.doesNotContain={preferredVehicleTypesDoesNotContain}&preferredVehicleTypes.equals={preferredVehicleTypesEquals}&preferredVehicleTypes.notEquals={preferredVehicleTypesNotEquals}&preferredVehicleTypes.specified={preferredVehicleTypesSpecified}&preferredVehicleTypes.in={preferredVehicleTypesIn}&preferredVehicleTypes.notIn={preferredVehicleTypesNotIn}&averageTripDuration.greaterThan={averageTripDurationGreaterThan}&averageTripDuration.lessThan={averageTripDurationLessThan}&averageTripDuration.greaterThanOrEqual={averageTripDurationGreaterThanOrEqual}&averageTripDuration.lessThanOrEqual={averageTripDurationLessThanOrEqual}&averageTripDuration.equals={averageTripDurationEquals}&averageTripDuration.notEquals={averageTripDurationNotEquals}&averageTripDuration.specified={averageTripDurationSpecified}&averageTripDuration.in={averageTripDurationIn}&averageTripDuration.notIn={averageTripDurationNotIn}&lastTravelDate.greaterThan={lastTravelDateGreaterThan}&lastTravelDate.lessThan={lastTravelDateLessThan}&lastTravelDate.greaterThanOrEqual={lastTravelDateGreaterThanOrEqual}&lastTravelDate.lessThanOrEqual={lastTravelDateLessThanOrEqual}&lastTravelDate.equals={lastTravelDateEquals}&lastTravelDate.notEquals={lastTravelDateNotEquals}&lastTravelDate.specified={lastTravelDateSpecified}&lastTravelDate.in={lastTravelDateIn}&lastTravelDate.notIn={lastTravelDateNotIn}&bookingFrequency.contains={bookingFrequencyContains}&bookingFrequency.doesNotContain={bookingFrequencyDoesNotContain}&bookingFrequency.equals={bookingFrequencyEquals}&bookingFrequency.notEquals={bookingFrequencyNotEquals}&bookingFrequency.specified={bookingFrequencySpecified}&bookingFrequency.in={bookingFrequencyIn}&bookingFrequency.notIn={bookingFrequencyNotIn}&loyaltyPoints.greaterThan={loyaltyPointsGreaterThan}&loyaltyPoints.lessThan={loyaltyPointsLessThan}&loyaltyPoints.greaterThanOrEqual={loyaltyPointsGreaterThanOrEqual}&loyaltyPoints.lessThanOrEqual={loyaltyPointsLessThanOrEqual}&loyaltyPoints.equals={loyaltyPointsEquals}&loyaltyPoints.notEquals={loyaltyPointsNotEquals}&loyaltyPoints.specified={loyaltyPointsSpecified}&loyaltyPoints.in={loyaltyPointsIn}&loyaltyPoints.notIn={loyaltyPointsNotIn}&mostFrequentOrigin.contains={mostFrequentOriginContains}&mostFrequentOrigin.doesNotContain={mostFrequentOriginDoesNotContain}&mostFrequentOrigin.equals={mostFrequentOriginEquals}&mostFrequentOrigin.notEquals={mostFrequentOriginNotEquals}&mostFrequentOrigin.specified={mostFrequentOriginSpecified}&mostFrequentOrigin.in={mostFrequentOriginIn}&mostFrequentOrigin.notIn={mostFrequentOriginNotIn}&mostFrequentDestination.contains={mostFrequentDestinationContains}&mostFrequentDestination.doesNotContain={mostFrequentDestinationDoesNotContain}&mostFrequentDestination.equals={mostFrequentDestinationEquals}&mostFrequentDestination.notEquals={mostFrequentDestinationNotEquals}&mostFrequentDestination.specified={mostFrequentDestinationSpecified}&mostFrequentDestination.in={mostFrequentDestinationIn}&mostFrequentDestination.notIn={mostFrequentDestinationNotIn}&averageTripDistance.greaterThan={averageTripDistanceGreaterThan}&averageTripDistance.lessThan={averageTripDistanceLessThan}&averageTripDistance.greaterThanOrEqual={averageTripDistanceGreaterThanOrEqual}&averageTripDistance.lessThanOrEqual={averageTripDistanceLessThanOrEqual}&averageTripDistance.equals={averageTripDistanceEquals}&averageTripDistance.notEquals={averageTripDistanceNotEquals}&averageTripDistance.specified={averageTripDistanceSpecified}&averageTripDistance.in={averageTripDistanceIn}&averageTripDistance.notIn={averageTripDistanceNotIn}&peakTravelTime.contains={peakTravelTimeContains}&peakTravelTime.doesNotContain={peakTravelTimeDoesNotContain}&peakTravelTime.equals={peakTravelTimeEquals}&peakTravelTime.notEquals={peakTravelTimeNotEquals}&peakTravelTime.specified={peakTravelTimeSpecified}&peakTravelTime.in={peakTravelTimeIn}&peakTravelTime.notIn={peakTravelTimeNotIn}&weekendTrips.greaterThan={weekendTripsGreaterThan}&weekendTrips.lessThan={weekendTripsLessThan}&weekendTrips.greaterThanOrEqual={weekendTripsGreaterThanOrEqual}&weekendTrips.lessThanOrEqual={weekendTripsLessThanOrEqual}&weekendTrips.equals={weekendTripsEquals}&weekendTrips.notEquals={weekendTripsNotEquals}&weekendTrips.specified={weekendTripsSpecified}&weekendTrips.in={weekendTripsIn}&weekendTrips.notIn={weekendTripsNotIn}&holidayTrips.greaterThan={holidayTripsGreaterThan}&holidayTrips.lessThan={holidayTripsLessThan}&holidayTrips.greaterThanOrEqual={holidayTripsGreaterThanOrEqual}&holidayTrips.lessThanOrEqual={holidayTripsLessThanOrEqual}&holidayTrips.equals={holidayTripsEquals}&holidayTrips.notEquals={holidayTripsNotEquals}&holidayTrips.specified={holidayTripsSpecified}&holidayTrips.in={holidayTripsIn}&holidayTrips.notIn={holidayTripsNotIn}&cancelledTrips.greaterThan={cancelledTripsGreaterThan}&cancelledTrips.lessThan={cancelledTripsLessThan}&cancelledTrips.greaterThanOrEqual={cancelledTripsGreaterThanOrEqual}&cancelledTrips.lessThanOrEqual={cancelledTripsLessThanOrEqual}&cancelledTrips.equals={cancelledTripsEquals}&cancelledTrips.notEquals={cancelledTripsNotEquals}&cancelledTrips.specified={cancelledTripsSpecified}&cancelledTrips.in={cancelledTripsIn}&cancelledTrips.notIn={cancelledTripsNotIn}&onTimePerformanceRate.greaterThan={onTimePerformanceRateGreaterThan}&onTimePerformanceRate.lessThan={onTimePerformanceRateLessThan}&onTimePerformanceRate.greaterThanOrEqual={onTimePerformanceRateGreaterThanOrEqual}&onTimePerformanceRate.lessThanOrEqual={onTimePerformanceRateLessThanOrEqual}&onTimePerformanceRate.equals={onTimePerformanceRateEquals}&onTimePerformanceRate.notEquals={onTimePerformanceRateNotEquals}&onTimePerformanceRate.specified={onTimePerformanceRateSpecified}&onTimePerformanceRate.in={onTimePerformanceRateIn}&onTimePerformanceRate.notIn={onTimePerformanceRateNotIn}&preferredSeatTypes.contains={preferredSeatTypesContains}&preferredSeatTypes.doesNotContain={preferredSeatTypesDoesNotContain}&preferredSeatTypes.equals={preferredSeatTypesEquals}&preferredSeatTypes.notEquals={preferredSeatTypesNotEquals}&preferredSeatTypes.specified={preferredSeatTypesSpecified}&preferredSeatTypes.in={preferredSeatTypesIn}&preferredSeatTypes.notIn={preferredSeatTypesNotIn}&monthlyTripCount.greaterThan={monthlyTripCountGreaterThan}&monthlyTripCount.lessThan={monthlyTripCountLessThan}&monthlyTripCount.greaterThanOrEqual={monthlyTripCountGreaterThanOrEqual}&monthlyTripCount.lessThanOrEqual={monthlyTripCountLessThanOrEqual}&monthlyTripCount.equals={monthlyTripCountEquals}&monthlyTripCount.notEquals={monthlyTripCountNotEquals}&monthlyTripCount.specified={monthlyTripCountSpecified}&monthlyTripCount.in={monthlyTripCountIn}&monthlyTripCount.notIn={monthlyTripCountNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countUserStatistics(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("totalTripsGreaterThan") @jakarta.annotation.Nullable Integer totalTripsGreaterThan, @Param("totalTripsLessThan") @jakarta.annotation.Nullable Integer totalTripsLessThan, @Param("totalTripsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer totalTripsGreaterThanOrEqual, @Param("totalTripsLessThanOrEqual") @jakarta.annotation.Nullable Integer totalTripsLessThanOrEqual, @Param("totalTripsEquals") @jakarta.annotation.Nullable Integer totalTripsEquals, @Param("totalTripsNotEquals") @jakarta.annotation.Nullable Integer totalTripsNotEquals, @Param("totalTripsSpecified") @jakarta.annotation.Nullable Boolean totalTripsSpecified, @Param("totalTripsIn") @jakarta.annotation.Nullable List<Integer> totalTripsIn, @Param("totalTripsNotIn") @jakarta.annotation.Nullable List<Integer> totalTripsNotIn, @Param("totalSpentGreaterThan") @jakarta.annotation.Nullable BigDecimal totalSpentGreaterThan, @Param("totalSpentLessThan") @jakarta.annotation.Nullable BigDecimal totalSpentLessThan, @Param("totalSpentGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal totalSpentGreaterThanOrEqual, @Param("totalSpentLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal totalSpentLessThanOrEqual, @Param("totalSpentEquals") @jakarta.annotation.Nullable BigDecimal totalSpentEquals, @Param("totalSpentNotEquals") @jakarta.annotation.Nullable BigDecimal totalSpentNotEquals, @Param("totalSpentSpecified") @jakarta.annotation.Nullable Boolean totalSpentSpecified, @Param("totalSpentIn") @jakarta.annotation.Nullable List<BigDecimal> totalSpentIn, @Param("totalSpentNotIn") @jakarta.annotation.Nullable List<BigDecimal> totalSpentNotIn, @Param("favoriteRoutesContains") @jakarta.annotation.Nullable String favoriteRoutesContains, @Param("favoriteRoutesDoesNotContain") @jakarta.annotation.Nullable String favoriteRoutesDoesNotContain, @Param("favoriteRoutesEquals") @jakarta.annotation.Nullable String favoriteRoutesEquals, @Param("favoriteRoutesNotEquals") @jakarta.annotation.Nullable String favoriteRoutesNotEquals, @Param("favoriteRoutesSpecified") @jakarta.annotation.Nullable Boolean favoriteRoutesSpecified, @Param("favoriteRoutesIn") @jakarta.annotation.Nullable List<String> favoriteRoutesIn, @Param("favoriteRoutesNotIn") @jakarta.annotation.Nullable List<String> favoriteRoutesNotIn, @Param("preferredVehicleTypesContains") @jakarta.annotation.Nullable String preferredVehicleTypesContains, @Param("preferredVehicleTypesDoesNotContain") @jakarta.annotation.Nullable String preferredVehicleTypesDoesNotContain, @Param("preferredVehicleTypesEquals") @jakarta.annotation.Nullable String preferredVehicleTypesEquals, @Param("preferredVehicleTypesNotEquals") @jakarta.annotation.Nullable String preferredVehicleTypesNotEquals, @Param("preferredVehicleTypesSpecified") @jakarta.annotation.Nullable Boolean preferredVehicleTypesSpecified, @Param("preferredVehicleTypesIn") @jakarta.annotation.Nullable List<String> preferredVehicleTypesIn, @Param("preferredVehicleTypesNotIn") @jakarta.annotation.Nullable List<String> preferredVehicleTypesNotIn, @Param("averageTripDurationGreaterThan") @jakarta.annotation.Nullable Integer averageTripDurationGreaterThan, @Param("averageTripDurationLessThan") @jakarta.annotation.Nullable Integer averageTripDurationLessThan, @Param("averageTripDurationGreaterThanOrEqual") @jakarta.annotation.Nullable Integer averageTripDurationGreaterThanOrEqual, @Param("averageTripDurationLessThanOrEqual") @jakarta.annotation.Nullable Integer averageTripDurationLessThanOrEqual, @Param("averageTripDurationEquals") @jakarta.annotation.Nullable Integer averageTripDurationEquals, @Param("averageTripDurationNotEquals") @jakarta.annotation.Nullable Integer averageTripDurationNotEquals, @Param("averageTripDurationSpecified") @jakarta.annotation.Nullable Boolean averageTripDurationSpecified, @Param("averageTripDurationIn") @jakarta.annotation.Nullable List<Integer> averageTripDurationIn, @Param("averageTripDurationNotIn") @jakarta.annotation.Nullable List<Integer> averageTripDurationNotIn, @Param("lastTravelDateGreaterThan") @jakarta.annotation.Nullable LocalDate lastTravelDateGreaterThan, @Param("lastTravelDateLessThan") @jakarta.annotation.Nullable LocalDate lastTravelDateLessThan, @Param("lastTravelDateGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate lastTravelDateGreaterThanOrEqual, @Param("lastTravelDateLessThanOrEqual") @jakarta.annotation.Nullable LocalDate lastTravelDateLessThanOrEqual, @Param("lastTravelDateEquals") @jakarta.annotation.Nullable LocalDate lastTravelDateEquals, @Param("lastTravelDateNotEquals") @jakarta.annotation.Nullable LocalDate lastTravelDateNotEquals, @Param("lastTravelDateSpecified") @jakarta.annotation.Nullable Boolean lastTravelDateSpecified, @Param("lastTravelDateIn") @jakarta.annotation.Nullable List<LocalDate> lastTravelDateIn, @Param("lastTravelDateNotIn") @jakarta.annotation.Nullable List<LocalDate> lastTravelDateNotIn, @Param("bookingFrequencyContains") @jakarta.annotation.Nullable String bookingFrequencyContains, @Param("bookingFrequencyDoesNotContain") @jakarta.annotation.Nullable String bookingFrequencyDoesNotContain, @Param("bookingFrequencyEquals") @jakarta.annotation.Nullable String bookingFrequencyEquals, @Param("bookingFrequencyNotEquals") @jakarta.annotation.Nullable String bookingFrequencyNotEquals, @Param("bookingFrequencySpecified") @jakarta.annotation.Nullable Boolean bookingFrequencySpecified, @Param("bookingFrequencyIn") @jakarta.annotation.Nullable List<String> bookingFrequencyIn, @Param("bookingFrequencyNotIn") @jakarta.annotation.Nullable List<String> bookingFrequencyNotIn, @Param("loyaltyPointsGreaterThan") @jakarta.annotation.Nullable Integer loyaltyPointsGreaterThan, @Param("loyaltyPointsLessThan") @jakarta.annotation.Nullable Integer loyaltyPointsLessThan, @Param("loyaltyPointsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer loyaltyPointsGreaterThanOrEqual, @Param("loyaltyPointsLessThanOrEqual") @jakarta.annotation.Nullable Integer loyaltyPointsLessThanOrEqual, @Param("loyaltyPointsEquals") @jakarta.annotation.Nullable Integer loyaltyPointsEquals, @Param("loyaltyPointsNotEquals") @jakarta.annotation.Nullable Integer loyaltyPointsNotEquals, @Param("loyaltyPointsSpecified") @jakarta.annotation.Nullable Boolean loyaltyPointsSpecified, @Param("loyaltyPointsIn") @jakarta.annotation.Nullable List<Integer> loyaltyPointsIn, @Param("loyaltyPointsNotIn") @jakarta.annotation.Nullable List<Integer> loyaltyPointsNotIn, @Param("mostFrequentOriginContains") @jakarta.annotation.Nullable String mostFrequentOriginContains, @Param("mostFrequentOriginDoesNotContain") @jakarta.annotation.Nullable String mostFrequentOriginDoesNotContain, @Param("mostFrequentOriginEquals") @jakarta.annotation.Nullable String mostFrequentOriginEquals, @Param("mostFrequentOriginNotEquals") @jakarta.annotation.Nullable String mostFrequentOriginNotEquals, @Param("mostFrequentOriginSpecified") @jakarta.annotation.Nullable Boolean mostFrequentOriginSpecified, @Param("mostFrequentOriginIn") @jakarta.annotation.Nullable List<String> mostFrequentOriginIn, @Param("mostFrequentOriginNotIn") @jakarta.annotation.Nullable List<String> mostFrequentOriginNotIn, @Param("mostFrequentDestinationContains") @jakarta.annotation.Nullable String mostFrequentDestinationContains, @Param("mostFrequentDestinationDoesNotContain") @jakarta.annotation.Nullable String mostFrequentDestinationDoesNotContain, @Param("mostFrequentDestinationEquals") @jakarta.annotation.Nullable String mostFrequentDestinationEquals, @Param("mostFrequentDestinationNotEquals") @jakarta.annotation.Nullable String mostFrequentDestinationNotEquals, @Param("mostFrequentDestinationSpecified") @jakarta.annotation.Nullable Boolean mostFrequentDestinationSpecified, @Param("mostFrequentDestinationIn") @jakarta.annotation.Nullable List<String> mostFrequentDestinationIn, @Param("mostFrequentDestinationNotIn") @jakarta.annotation.Nullable List<String> mostFrequentDestinationNotIn, @Param("averageTripDistanceGreaterThan") @jakarta.annotation.Nullable BigDecimal averageTripDistanceGreaterThan, @Param("averageTripDistanceLessThan") @jakarta.annotation.Nullable BigDecimal averageTripDistanceLessThan, @Param("averageTripDistanceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal averageTripDistanceGreaterThanOrEqual, @Param("averageTripDistanceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal averageTripDistanceLessThanOrEqual, @Param("averageTripDistanceEquals") @jakarta.annotation.Nullable BigDecimal averageTripDistanceEquals, @Param("averageTripDistanceNotEquals") @jakarta.annotation.Nullable BigDecimal averageTripDistanceNotEquals, @Param("averageTripDistanceSpecified") @jakarta.annotation.Nullable Boolean averageTripDistanceSpecified, @Param("averageTripDistanceIn") @jakarta.annotation.Nullable List<BigDecimal> averageTripDistanceIn, @Param("averageTripDistanceNotIn") @jakarta.annotation.Nullable List<BigDecimal> averageTripDistanceNotIn, @Param("peakTravelTimeContains") @jakarta.annotation.Nullable String peakTravelTimeContains, @Param("peakTravelTimeDoesNotContain") @jakarta.annotation.Nullable String peakTravelTimeDoesNotContain, @Param("peakTravelTimeEquals") @jakarta.annotation.Nullable String peakTravelTimeEquals, @Param("peakTravelTimeNotEquals") @jakarta.annotation.Nullable String peakTravelTimeNotEquals, @Param("peakTravelTimeSpecified") @jakarta.annotation.Nullable Boolean peakTravelTimeSpecified, @Param("peakTravelTimeIn") @jakarta.annotation.Nullable List<String> peakTravelTimeIn, @Param("peakTravelTimeNotIn") @jakarta.annotation.Nullable List<String> peakTravelTimeNotIn, @Param("weekendTripsGreaterThan") @jakarta.annotation.Nullable Integer weekendTripsGreaterThan, @Param("weekendTripsLessThan") @jakarta.annotation.Nullable Integer weekendTripsLessThan, @Param("weekendTripsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer weekendTripsGreaterThanOrEqual, @Param("weekendTripsLessThanOrEqual") @jakarta.annotation.Nullable Integer weekendTripsLessThanOrEqual, @Param("weekendTripsEquals") @jakarta.annotation.Nullable Integer weekendTripsEquals, @Param("weekendTripsNotEquals") @jakarta.annotation.Nullable Integer weekendTripsNotEquals, @Param("weekendTripsSpecified") @jakarta.annotation.Nullable Boolean weekendTripsSpecified, @Param("weekendTripsIn") @jakarta.annotation.Nullable List<Integer> weekendTripsIn, @Param("weekendTripsNotIn") @jakarta.annotation.Nullable List<Integer> weekendTripsNotIn, @Param("holidayTripsGreaterThan") @jakarta.annotation.Nullable Integer holidayTripsGreaterThan, @Param("holidayTripsLessThan") @jakarta.annotation.Nullable Integer holidayTripsLessThan, @Param("holidayTripsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer holidayTripsGreaterThanOrEqual, @Param("holidayTripsLessThanOrEqual") @jakarta.annotation.Nullable Integer holidayTripsLessThanOrEqual, @Param("holidayTripsEquals") @jakarta.annotation.Nullable Integer holidayTripsEquals, @Param("holidayTripsNotEquals") @jakarta.annotation.Nullable Integer holidayTripsNotEquals, @Param("holidayTripsSpecified") @jakarta.annotation.Nullable Boolean holidayTripsSpecified, @Param("holidayTripsIn") @jakarta.annotation.Nullable List<Integer> holidayTripsIn, @Param("holidayTripsNotIn") @jakarta.annotation.Nullable List<Integer> holidayTripsNotIn, @Param("cancelledTripsGreaterThan") @jakarta.annotation.Nullable Integer cancelledTripsGreaterThan, @Param("cancelledTripsLessThan") @jakarta.annotation.Nullable Integer cancelledTripsLessThan, @Param("cancelledTripsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer cancelledTripsGreaterThanOrEqual, @Param("cancelledTripsLessThanOrEqual") @jakarta.annotation.Nullable Integer cancelledTripsLessThanOrEqual, @Param("cancelledTripsEquals") @jakarta.annotation.Nullable Integer cancelledTripsEquals, @Param("cancelledTripsNotEquals") @jakarta.annotation.Nullable Integer cancelledTripsNotEquals, @Param("cancelledTripsSpecified") @jakarta.annotation.Nullable Boolean cancelledTripsSpecified, @Param("cancelledTripsIn") @jakarta.annotation.Nullable List<Integer> cancelledTripsIn, @Param("cancelledTripsNotIn") @jakarta.annotation.Nullable List<Integer> cancelledTripsNotIn, @Param("onTimePerformanceRateGreaterThan") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateGreaterThan, @Param("onTimePerformanceRateLessThan") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateLessThan, @Param("onTimePerformanceRateGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateGreaterThanOrEqual, @Param("onTimePerformanceRateLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateLessThanOrEqual, @Param("onTimePerformanceRateEquals") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateEquals, @Param("onTimePerformanceRateNotEquals") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateNotEquals, @Param("onTimePerformanceRateSpecified") @jakarta.annotation.Nullable Boolean onTimePerformanceRateSpecified, @Param("onTimePerformanceRateIn") @jakarta.annotation.Nullable List<BigDecimal> onTimePerformanceRateIn, @Param("onTimePerformanceRateNotIn") @jakarta.annotation.Nullable List<BigDecimal> onTimePerformanceRateNotIn, @Param("preferredSeatTypesContains") @jakarta.annotation.Nullable String preferredSeatTypesContains, @Param("preferredSeatTypesDoesNotContain") @jakarta.annotation.Nullable String preferredSeatTypesDoesNotContain, @Param("preferredSeatTypesEquals") @jakarta.annotation.Nullable String preferredSeatTypesEquals, @Param("preferredSeatTypesNotEquals") @jakarta.annotation.Nullable String preferredSeatTypesNotEquals, @Param("preferredSeatTypesSpecified") @jakarta.annotation.Nullable Boolean preferredSeatTypesSpecified, @Param("preferredSeatTypesIn") @jakarta.annotation.Nullable List<String> preferredSeatTypesIn, @Param("preferredSeatTypesNotIn") @jakarta.annotation.Nullable List<String> preferredSeatTypesNotIn, @Param("monthlyTripCountGreaterThan") @jakarta.annotation.Nullable Integer monthlyTripCountGreaterThan, @Param("monthlyTripCountLessThan") @jakarta.annotation.Nullable Integer monthlyTripCountLessThan, @Param("monthlyTripCountGreaterThanOrEqual") @jakarta.annotation.Nullable Integer monthlyTripCountGreaterThanOrEqual, @Param("monthlyTripCountLessThanOrEqual") @jakarta.annotation.Nullable Integer monthlyTripCountLessThanOrEqual, @Param("monthlyTripCountEquals") @jakarta.annotation.Nullable Integer monthlyTripCountEquals, @Param("monthlyTripCountNotEquals") @jakarta.annotation.Nullable Integer monthlyTripCountNotEquals, @Param("monthlyTripCountSpecified") @jakarta.annotation.Nullable Boolean monthlyTripCountSpecified, @Param("monthlyTripCountIn") @jakarta.annotation.Nullable List<Integer> monthlyTripCountIn, @Param("monthlyTripCountNotIn") @jakarta.annotation.Nullable List<Integer> monthlyTripCountNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("userIdGreaterThan") @jakarta.annotation.Nullable Long userIdGreaterThan, @Param("userIdLessThan") @jakarta.annotation.Nullable Long userIdLessThan, @Param("userIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long userIdGreaterThanOrEqual, @Param("userIdLessThanOrEqual") @jakarta.annotation.Nullable Long userIdLessThanOrEqual, @Param("userIdEquals") @jakarta.annotation.Nullable Long userIdEquals, @Param("userIdNotEquals") @jakarta.annotation.Nullable Long userIdNotEquals, @Param("userIdSpecified") @jakarta.annotation.Nullable Boolean userIdSpecified, @Param("userIdIn") @jakarta.annotation.Nullable List<Long> userIdIn, @Param("userIdNotIn") @jakarta.annotation.Nullable List<Long> userIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countUserStatistics</code> but it also returns the http response headers .
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
   * @param totalTripsGreaterThan  (optional)
   * @param totalTripsLessThan  (optional)
   * @param totalTripsGreaterThanOrEqual  (optional)
   * @param totalTripsLessThanOrEqual  (optional)
   * @param totalTripsEquals  (optional)
   * @param totalTripsNotEquals  (optional)
   * @param totalTripsSpecified  (optional)
   * @param totalTripsIn  (optional)
   * @param totalTripsNotIn  (optional)
   * @param totalSpentGreaterThan  (optional)
   * @param totalSpentLessThan  (optional)
   * @param totalSpentGreaterThanOrEqual  (optional)
   * @param totalSpentLessThanOrEqual  (optional)
   * @param totalSpentEquals  (optional)
   * @param totalSpentNotEquals  (optional)
   * @param totalSpentSpecified  (optional)
   * @param totalSpentIn  (optional)
   * @param totalSpentNotIn  (optional)
   * @param favoriteRoutesContains  (optional)
   * @param favoriteRoutesDoesNotContain  (optional)
   * @param favoriteRoutesEquals  (optional)
   * @param favoriteRoutesNotEquals  (optional)
   * @param favoriteRoutesSpecified  (optional)
   * @param favoriteRoutesIn  (optional)
   * @param favoriteRoutesNotIn  (optional)
   * @param preferredVehicleTypesContains  (optional)
   * @param preferredVehicleTypesDoesNotContain  (optional)
   * @param preferredVehicleTypesEquals  (optional)
   * @param preferredVehicleTypesNotEquals  (optional)
   * @param preferredVehicleTypesSpecified  (optional)
   * @param preferredVehicleTypesIn  (optional)
   * @param preferredVehicleTypesNotIn  (optional)
   * @param averageTripDurationGreaterThan  (optional)
   * @param averageTripDurationLessThan  (optional)
   * @param averageTripDurationGreaterThanOrEqual  (optional)
   * @param averageTripDurationLessThanOrEqual  (optional)
   * @param averageTripDurationEquals  (optional)
   * @param averageTripDurationNotEquals  (optional)
   * @param averageTripDurationSpecified  (optional)
   * @param averageTripDurationIn  (optional)
   * @param averageTripDurationNotIn  (optional)
   * @param lastTravelDateGreaterThan  (optional)
   * @param lastTravelDateLessThan  (optional)
   * @param lastTravelDateGreaterThanOrEqual  (optional)
   * @param lastTravelDateLessThanOrEqual  (optional)
   * @param lastTravelDateEquals  (optional)
   * @param lastTravelDateNotEquals  (optional)
   * @param lastTravelDateSpecified  (optional)
   * @param lastTravelDateIn  (optional)
   * @param lastTravelDateNotIn  (optional)
   * @param bookingFrequencyContains  (optional)
   * @param bookingFrequencyDoesNotContain  (optional)
   * @param bookingFrequencyEquals  (optional)
   * @param bookingFrequencyNotEquals  (optional)
   * @param bookingFrequencySpecified  (optional)
   * @param bookingFrequencyIn  (optional)
   * @param bookingFrequencyNotIn  (optional)
   * @param loyaltyPointsGreaterThan  (optional)
   * @param loyaltyPointsLessThan  (optional)
   * @param loyaltyPointsGreaterThanOrEqual  (optional)
   * @param loyaltyPointsLessThanOrEqual  (optional)
   * @param loyaltyPointsEquals  (optional)
   * @param loyaltyPointsNotEquals  (optional)
   * @param loyaltyPointsSpecified  (optional)
   * @param loyaltyPointsIn  (optional)
   * @param loyaltyPointsNotIn  (optional)
   * @param mostFrequentOriginContains  (optional)
   * @param mostFrequentOriginDoesNotContain  (optional)
   * @param mostFrequentOriginEquals  (optional)
   * @param mostFrequentOriginNotEquals  (optional)
   * @param mostFrequentOriginSpecified  (optional)
   * @param mostFrequentOriginIn  (optional)
   * @param mostFrequentOriginNotIn  (optional)
   * @param mostFrequentDestinationContains  (optional)
   * @param mostFrequentDestinationDoesNotContain  (optional)
   * @param mostFrequentDestinationEquals  (optional)
   * @param mostFrequentDestinationNotEquals  (optional)
   * @param mostFrequentDestinationSpecified  (optional)
   * @param mostFrequentDestinationIn  (optional)
   * @param mostFrequentDestinationNotIn  (optional)
   * @param averageTripDistanceGreaterThan  (optional)
   * @param averageTripDistanceLessThan  (optional)
   * @param averageTripDistanceGreaterThanOrEqual  (optional)
   * @param averageTripDistanceLessThanOrEqual  (optional)
   * @param averageTripDistanceEquals  (optional)
   * @param averageTripDistanceNotEquals  (optional)
   * @param averageTripDistanceSpecified  (optional)
   * @param averageTripDistanceIn  (optional)
   * @param averageTripDistanceNotIn  (optional)
   * @param peakTravelTimeContains  (optional)
   * @param peakTravelTimeDoesNotContain  (optional)
   * @param peakTravelTimeEquals  (optional)
   * @param peakTravelTimeNotEquals  (optional)
   * @param peakTravelTimeSpecified  (optional)
   * @param peakTravelTimeIn  (optional)
   * @param peakTravelTimeNotIn  (optional)
   * @param weekendTripsGreaterThan  (optional)
   * @param weekendTripsLessThan  (optional)
   * @param weekendTripsGreaterThanOrEqual  (optional)
   * @param weekendTripsLessThanOrEqual  (optional)
   * @param weekendTripsEquals  (optional)
   * @param weekendTripsNotEquals  (optional)
   * @param weekendTripsSpecified  (optional)
   * @param weekendTripsIn  (optional)
   * @param weekendTripsNotIn  (optional)
   * @param holidayTripsGreaterThan  (optional)
   * @param holidayTripsLessThan  (optional)
   * @param holidayTripsGreaterThanOrEqual  (optional)
   * @param holidayTripsLessThanOrEqual  (optional)
   * @param holidayTripsEquals  (optional)
   * @param holidayTripsNotEquals  (optional)
   * @param holidayTripsSpecified  (optional)
   * @param holidayTripsIn  (optional)
   * @param holidayTripsNotIn  (optional)
   * @param cancelledTripsGreaterThan  (optional)
   * @param cancelledTripsLessThan  (optional)
   * @param cancelledTripsGreaterThanOrEqual  (optional)
   * @param cancelledTripsLessThanOrEqual  (optional)
   * @param cancelledTripsEquals  (optional)
   * @param cancelledTripsNotEquals  (optional)
   * @param cancelledTripsSpecified  (optional)
   * @param cancelledTripsIn  (optional)
   * @param cancelledTripsNotIn  (optional)
   * @param onTimePerformanceRateGreaterThan  (optional)
   * @param onTimePerformanceRateLessThan  (optional)
   * @param onTimePerformanceRateGreaterThanOrEqual  (optional)
   * @param onTimePerformanceRateLessThanOrEqual  (optional)
   * @param onTimePerformanceRateEquals  (optional)
   * @param onTimePerformanceRateNotEquals  (optional)
   * @param onTimePerformanceRateSpecified  (optional)
   * @param onTimePerformanceRateIn  (optional)
   * @param onTimePerformanceRateNotIn  (optional)
   * @param preferredSeatTypesContains  (optional)
   * @param preferredSeatTypesDoesNotContain  (optional)
   * @param preferredSeatTypesEquals  (optional)
   * @param preferredSeatTypesNotEquals  (optional)
   * @param preferredSeatTypesSpecified  (optional)
   * @param preferredSeatTypesIn  (optional)
   * @param preferredSeatTypesNotIn  (optional)
   * @param monthlyTripCountGreaterThan  (optional)
   * @param monthlyTripCountLessThan  (optional)
   * @param monthlyTripCountGreaterThanOrEqual  (optional)
   * @param monthlyTripCountLessThanOrEqual  (optional)
   * @param monthlyTripCountEquals  (optional)
   * @param monthlyTripCountNotEquals  (optional)
   * @param monthlyTripCountSpecified  (optional)
   * @param monthlyTripCountIn  (optional)
   * @param monthlyTripCountNotIn  (optional)
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
   * @param userIdGreaterThan  (optional)
   * @param userIdLessThan  (optional)
   * @param userIdGreaterThanOrEqual  (optional)
   * @param userIdLessThanOrEqual  (optional)
   * @param userIdEquals  (optional)
   * @param userIdNotEquals  (optional)
   * @param userIdSpecified  (optional)
   * @param userIdIn  (optional)
   * @param userIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/user-statistics/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&totalTrips.greaterThan={totalTripsGreaterThan}&totalTrips.lessThan={totalTripsLessThan}&totalTrips.greaterThanOrEqual={totalTripsGreaterThanOrEqual}&totalTrips.lessThanOrEqual={totalTripsLessThanOrEqual}&totalTrips.equals={totalTripsEquals}&totalTrips.notEquals={totalTripsNotEquals}&totalTrips.specified={totalTripsSpecified}&totalTrips.in={totalTripsIn}&totalTrips.notIn={totalTripsNotIn}&totalSpent.greaterThan={totalSpentGreaterThan}&totalSpent.lessThan={totalSpentLessThan}&totalSpent.greaterThanOrEqual={totalSpentGreaterThanOrEqual}&totalSpent.lessThanOrEqual={totalSpentLessThanOrEqual}&totalSpent.equals={totalSpentEquals}&totalSpent.notEquals={totalSpentNotEquals}&totalSpent.specified={totalSpentSpecified}&totalSpent.in={totalSpentIn}&totalSpent.notIn={totalSpentNotIn}&favoriteRoutes.contains={favoriteRoutesContains}&favoriteRoutes.doesNotContain={favoriteRoutesDoesNotContain}&favoriteRoutes.equals={favoriteRoutesEquals}&favoriteRoutes.notEquals={favoriteRoutesNotEquals}&favoriteRoutes.specified={favoriteRoutesSpecified}&favoriteRoutes.in={favoriteRoutesIn}&favoriteRoutes.notIn={favoriteRoutesNotIn}&preferredVehicleTypes.contains={preferredVehicleTypesContains}&preferredVehicleTypes.doesNotContain={preferredVehicleTypesDoesNotContain}&preferredVehicleTypes.equals={preferredVehicleTypesEquals}&preferredVehicleTypes.notEquals={preferredVehicleTypesNotEquals}&preferredVehicleTypes.specified={preferredVehicleTypesSpecified}&preferredVehicleTypes.in={preferredVehicleTypesIn}&preferredVehicleTypes.notIn={preferredVehicleTypesNotIn}&averageTripDuration.greaterThan={averageTripDurationGreaterThan}&averageTripDuration.lessThan={averageTripDurationLessThan}&averageTripDuration.greaterThanOrEqual={averageTripDurationGreaterThanOrEqual}&averageTripDuration.lessThanOrEqual={averageTripDurationLessThanOrEqual}&averageTripDuration.equals={averageTripDurationEquals}&averageTripDuration.notEquals={averageTripDurationNotEquals}&averageTripDuration.specified={averageTripDurationSpecified}&averageTripDuration.in={averageTripDurationIn}&averageTripDuration.notIn={averageTripDurationNotIn}&lastTravelDate.greaterThan={lastTravelDateGreaterThan}&lastTravelDate.lessThan={lastTravelDateLessThan}&lastTravelDate.greaterThanOrEqual={lastTravelDateGreaterThanOrEqual}&lastTravelDate.lessThanOrEqual={lastTravelDateLessThanOrEqual}&lastTravelDate.equals={lastTravelDateEquals}&lastTravelDate.notEquals={lastTravelDateNotEquals}&lastTravelDate.specified={lastTravelDateSpecified}&lastTravelDate.in={lastTravelDateIn}&lastTravelDate.notIn={lastTravelDateNotIn}&bookingFrequency.contains={bookingFrequencyContains}&bookingFrequency.doesNotContain={bookingFrequencyDoesNotContain}&bookingFrequency.equals={bookingFrequencyEquals}&bookingFrequency.notEquals={bookingFrequencyNotEquals}&bookingFrequency.specified={bookingFrequencySpecified}&bookingFrequency.in={bookingFrequencyIn}&bookingFrequency.notIn={bookingFrequencyNotIn}&loyaltyPoints.greaterThan={loyaltyPointsGreaterThan}&loyaltyPoints.lessThan={loyaltyPointsLessThan}&loyaltyPoints.greaterThanOrEqual={loyaltyPointsGreaterThanOrEqual}&loyaltyPoints.lessThanOrEqual={loyaltyPointsLessThanOrEqual}&loyaltyPoints.equals={loyaltyPointsEquals}&loyaltyPoints.notEquals={loyaltyPointsNotEquals}&loyaltyPoints.specified={loyaltyPointsSpecified}&loyaltyPoints.in={loyaltyPointsIn}&loyaltyPoints.notIn={loyaltyPointsNotIn}&mostFrequentOrigin.contains={mostFrequentOriginContains}&mostFrequentOrigin.doesNotContain={mostFrequentOriginDoesNotContain}&mostFrequentOrigin.equals={mostFrequentOriginEquals}&mostFrequentOrigin.notEquals={mostFrequentOriginNotEquals}&mostFrequentOrigin.specified={mostFrequentOriginSpecified}&mostFrequentOrigin.in={mostFrequentOriginIn}&mostFrequentOrigin.notIn={mostFrequentOriginNotIn}&mostFrequentDestination.contains={mostFrequentDestinationContains}&mostFrequentDestination.doesNotContain={mostFrequentDestinationDoesNotContain}&mostFrequentDestination.equals={mostFrequentDestinationEquals}&mostFrequentDestination.notEquals={mostFrequentDestinationNotEquals}&mostFrequentDestination.specified={mostFrequentDestinationSpecified}&mostFrequentDestination.in={mostFrequentDestinationIn}&mostFrequentDestination.notIn={mostFrequentDestinationNotIn}&averageTripDistance.greaterThan={averageTripDistanceGreaterThan}&averageTripDistance.lessThan={averageTripDistanceLessThan}&averageTripDistance.greaterThanOrEqual={averageTripDistanceGreaterThanOrEqual}&averageTripDistance.lessThanOrEqual={averageTripDistanceLessThanOrEqual}&averageTripDistance.equals={averageTripDistanceEquals}&averageTripDistance.notEquals={averageTripDistanceNotEquals}&averageTripDistance.specified={averageTripDistanceSpecified}&averageTripDistance.in={averageTripDistanceIn}&averageTripDistance.notIn={averageTripDistanceNotIn}&peakTravelTime.contains={peakTravelTimeContains}&peakTravelTime.doesNotContain={peakTravelTimeDoesNotContain}&peakTravelTime.equals={peakTravelTimeEquals}&peakTravelTime.notEquals={peakTravelTimeNotEquals}&peakTravelTime.specified={peakTravelTimeSpecified}&peakTravelTime.in={peakTravelTimeIn}&peakTravelTime.notIn={peakTravelTimeNotIn}&weekendTrips.greaterThan={weekendTripsGreaterThan}&weekendTrips.lessThan={weekendTripsLessThan}&weekendTrips.greaterThanOrEqual={weekendTripsGreaterThanOrEqual}&weekendTrips.lessThanOrEqual={weekendTripsLessThanOrEqual}&weekendTrips.equals={weekendTripsEquals}&weekendTrips.notEquals={weekendTripsNotEquals}&weekendTrips.specified={weekendTripsSpecified}&weekendTrips.in={weekendTripsIn}&weekendTrips.notIn={weekendTripsNotIn}&holidayTrips.greaterThan={holidayTripsGreaterThan}&holidayTrips.lessThan={holidayTripsLessThan}&holidayTrips.greaterThanOrEqual={holidayTripsGreaterThanOrEqual}&holidayTrips.lessThanOrEqual={holidayTripsLessThanOrEqual}&holidayTrips.equals={holidayTripsEquals}&holidayTrips.notEquals={holidayTripsNotEquals}&holidayTrips.specified={holidayTripsSpecified}&holidayTrips.in={holidayTripsIn}&holidayTrips.notIn={holidayTripsNotIn}&cancelledTrips.greaterThan={cancelledTripsGreaterThan}&cancelledTrips.lessThan={cancelledTripsLessThan}&cancelledTrips.greaterThanOrEqual={cancelledTripsGreaterThanOrEqual}&cancelledTrips.lessThanOrEqual={cancelledTripsLessThanOrEqual}&cancelledTrips.equals={cancelledTripsEquals}&cancelledTrips.notEquals={cancelledTripsNotEquals}&cancelledTrips.specified={cancelledTripsSpecified}&cancelledTrips.in={cancelledTripsIn}&cancelledTrips.notIn={cancelledTripsNotIn}&onTimePerformanceRate.greaterThan={onTimePerformanceRateGreaterThan}&onTimePerformanceRate.lessThan={onTimePerformanceRateLessThan}&onTimePerformanceRate.greaterThanOrEqual={onTimePerformanceRateGreaterThanOrEqual}&onTimePerformanceRate.lessThanOrEqual={onTimePerformanceRateLessThanOrEqual}&onTimePerformanceRate.equals={onTimePerformanceRateEquals}&onTimePerformanceRate.notEquals={onTimePerformanceRateNotEquals}&onTimePerformanceRate.specified={onTimePerformanceRateSpecified}&onTimePerformanceRate.in={onTimePerformanceRateIn}&onTimePerformanceRate.notIn={onTimePerformanceRateNotIn}&preferredSeatTypes.contains={preferredSeatTypesContains}&preferredSeatTypes.doesNotContain={preferredSeatTypesDoesNotContain}&preferredSeatTypes.equals={preferredSeatTypesEquals}&preferredSeatTypes.notEquals={preferredSeatTypesNotEquals}&preferredSeatTypes.specified={preferredSeatTypesSpecified}&preferredSeatTypes.in={preferredSeatTypesIn}&preferredSeatTypes.notIn={preferredSeatTypesNotIn}&monthlyTripCount.greaterThan={monthlyTripCountGreaterThan}&monthlyTripCount.lessThan={monthlyTripCountLessThan}&monthlyTripCount.greaterThanOrEqual={monthlyTripCountGreaterThanOrEqual}&monthlyTripCount.lessThanOrEqual={monthlyTripCountLessThanOrEqual}&monthlyTripCount.equals={monthlyTripCountEquals}&monthlyTripCount.notEquals={monthlyTripCountNotEquals}&monthlyTripCount.specified={monthlyTripCountSpecified}&monthlyTripCount.in={monthlyTripCountIn}&monthlyTripCount.notIn={monthlyTripCountNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countUserStatisticsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("totalTripsGreaterThan") @jakarta.annotation.Nullable Integer totalTripsGreaterThan, @Param("totalTripsLessThan") @jakarta.annotation.Nullable Integer totalTripsLessThan, @Param("totalTripsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer totalTripsGreaterThanOrEqual, @Param("totalTripsLessThanOrEqual") @jakarta.annotation.Nullable Integer totalTripsLessThanOrEqual, @Param("totalTripsEquals") @jakarta.annotation.Nullable Integer totalTripsEquals, @Param("totalTripsNotEquals") @jakarta.annotation.Nullable Integer totalTripsNotEquals, @Param("totalTripsSpecified") @jakarta.annotation.Nullable Boolean totalTripsSpecified, @Param("totalTripsIn") @jakarta.annotation.Nullable List<Integer> totalTripsIn, @Param("totalTripsNotIn") @jakarta.annotation.Nullable List<Integer> totalTripsNotIn, @Param("totalSpentGreaterThan") @jakarta.annotation.Nullable BigDecimal totalSpentGreaterThan, @Param("totalSpentLessThan") @jakarta.annotation.Nullable BigDecimal totalSpentLessThan, @Param("totalSpentGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal totalSpentGreaterThanOrEqual, @Param("totalSpentLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal totalSpentLessThanOrEqual, @Param("totalSpentEquals") @jakarta.annotation.Nullable BigDecimal totalSpentEquals, @Param("totalSpentNotEquals") @jakarta.annotation.Nullable BigDecimal totalSpentNotEquals, @Param("totalSpentSpecified") @jakarta.annotation.Nullable Boolean totalSpentSpecified, @Param("totalSpentIn") @jakarta.annotation.Nullable List<BigDecimal> totalSpentIn, @Param("totalSpentNotIn") @jakarta.annotation.Nullable List<BigDecimal> totalSpentNotIn, @Param("favoriteRoutesContains") @jakarta.annotation.Nullable String favoriteRoutesContains, @Param("favoriteRoutesDoesNotContain") @jakarta.annotation.Nullable String favoriteRoutesDoesNotContain, @Param("favoriteRoutesEquals") @jakarta.annotation.Nullable String favoriteRoutesEquals, @Param("favoriteRoutesNotEquals") @jakarta.annotation.Nullable String favoriteRoutesNotEquals, @Param("favoriteRoutesSpecified") @jakarta.annotation.Nullable Boolean favoriteRoutesSpecified, @Param("favoriteRoutesIn") @jakarta.annotation.Nullable List<String> favoriteRoutesIn, @Param("favoriteRoutesNotIn") @jakarta.annotation.Nullable List<String> favoriteRoutesNotIn, @Param("preferredVehicleTypesContains") @jakarta.annotation.Nullable String preferredVehicleTypesContains, @Param("preferredVehicleTypesDoesNotContain") @jakarta.annotation.Nullable String preferredVehicleTypesDoesNotContain, @Param("preferredVehicleTypesEquals") @jakarta.annotation.Nullable String preferredVehicleTypesEquals, @Param("preferredVehicleTypesNotEquals") @jakarta.annotation.Nullable String preferredVehicleTypesNotEquals, @Param("preferredVehicleTypesSpecified") @jakarta.annotation.Nullable Boolean preferredVehicleTypesSpecified, @Param("preferredVehicleTypesIn") @jakarta.annotation.Nullable List<String> preferredVehicleTypesIn, @Param("preferredVehicleTypesNotIn") @jakarta.annotation.Nullable List<String> preferredVehicleTypesNotIn, @Param("averageTripDurationGreaterThan") @jakarta.annotation.Nullable Integer averageTripDurationGreaterThan, @Param("averageTripDurationLessThan") @jakarta.annotation.Nullable Integer averageTripDurationLessThan, @Param("averageTripDurationGreaterThanOrEqual") @jakarta.annotation.Nullable Integer averageTripDurationGreaterThanOrEqual, @Param("averageTripDurationLessThanOrEqual") @jakarta.annotation.Nullable Integer averageTripDurationLessThanOrEqual, @Param("averageTripDurationEquals") @jakarta.annotation.Nullable Integer averageTripDurationEquals, @Param("averageTripDurationNotEquals") @jakarta.annotation.Nullable Integer averageTripDurationNotEquals, @Param("averageTripDurationSpecified") @jakarta.annotation.Nullable Boolean averageTripDurationSpecified, @Param("averageTripDurationIn") @jakarta.annotation.Nullable List<Integer> averageTripDurationIn, @Param("averageTripDurationNotIn") @jakarta.annotation.Nullable List<Integer> averageTripDurationNotIn, @Param("lastTravelDateGreaterThan") @jakarta.annotation.Nullable LocalDate lastTravelDateGreaterThan, @Param("lastTravelDateLessThan") @jakarta.annotation.Nullable LocalDate lastTravelDateLessThan, @Param("lastTravelDateGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate lastTravelDateGreaterThanOrEqual, @Param("lastTravelDateLessThanOrEqual") @jakarta.annotation.Nullable LocalDate lastTravelDateLessThanOrEqual, @Param("lastTravelDateEquals") @jakarta.annotation.Nullable LocalDate lastTravelDateEquals, @Param("lastTravelDateNotEquals") @jakarta.annotation.Nullable LocalDate lastTravelDateNotEquals, @Param("lastTravelDateSpecified") @jakarta.annotation.Nullable Boolean lastTravelDateSpecified, @Param("lastTravelDateIn") @jakarta.annotation.Nullable List<LocalDate> lastTravelDateIn, @Param("lastTravelDateNotIn") @jakarta.annotation.Nullable List<LocalDate> lastTravelDateNotIn, @Param("bookingFrequencyContains") @jakarta.annotation.Nullable String bookingFrequencyContains, @Param("bookingFrequencyDoesNotContain") @jakarta.annotation.Nullable String bookingFrequencyDoesNotContain, @Param("bookingFrequencyEquals") @jakarta.annotation.Nullable String bookingFrequencyEquals, @Param("bookingFrequencyNotEquals") @jakarta.annotation.Nullable String bookingFrequencyNotEquals, @Param("bookingFrequencySpecified") @jakarta.annotation.Nullable Boolean bookingFrequencySpecified, @Param("bookingFrequencyIn") @jakarta.annotation.Nullable List<String> bookingFrequencyIn, @Param("bookingFrequencyNotIn") @jakarta.annotation.Nullable List<String> bookingFrequencyNotIn, @Param("loyaltyPointsGreaterThan") @jakarta.annotation.Nullable Integer loyaltyPointsGreaterThan, @Param("loyaltyPointsLessThan") @jakarta.annotation.Nullable Integer loyaltyPointsLessThan, @Param("loyaltyPointsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer loyaltyPointsGreaterThanOrEqual, @Param("loyaltyPointsLessThanOrEqual") @jakarta.annotation.Nullable Integer loyaltyPointsLessThanOrEqual, @Param("loyaltyPointsEquals") @jakarta.annotation.Nullable Integer loyaltyPointsEquals, @Param("loyaltyPointsNotEquals") @jakarta.annotation.Nullable Integer loyaltyPointsNotEquals, @Param("loyaltyPointsSpecified") @jakarta.annotation.Nullable Boolean loyaltyPointsSpecified, @Param("loyaltyPointsIn") @jakarta.annotation.Nullable List<Integer> loyaltyPointsIn, @Param("loyaltyPointsNotIn") @jakarta.annotation.Nullable List<Integer> loyaltyPointsNotIn, @Param("mostFrequentOriginContains") @jakarta.annotation.Nullable String mostFrequentOriginContains, @Param("mostFrequentOriginDoesNotContain") @jakarta.annotation.Nullable String mostFrequentOriginDoesNotContain, @Param("mostFrequentOriginEquals") @jakarta.annotation.Nullable String mostFrequentOriginEquals, @Param("mostFrequentOriginNotEquals") @jakarta.annotation.Nullable String mostFrequentOriginNotEquals, @Param("mostFrequentOriginSpecified") @jakarta.annotation.Nullable Boolean mostFrequentOriginSpecified, @Param("mostFrequentOriginIn") @jakarta.annotation.Nullable List<String> mostFrequentOriginIn, @Param("mostFrequentOriginNotIn") @jakarta.annotation.Nullable List<String> mostFrequentOriginNotIn, @Param("mostFrequentDestinationContains") @jakarta.annotation.Nullable String mostFrequentDestinationContains, @Param("mostFrequentDestinationDoesNotContain") @jakarta.annotation.Nullable String mostFrequentDestinationDoesNotContain, @Param("mostFrequentDestinationEquals") @jakarta.annotation.Nullable String mostFrequentDestinationEquals, @Param("mostFrequentDestinationNotEquals") @jakarta.annotation.Nullable String mostFrequentDestinationNotEquals, @Param("mostFrequentDestinationSpecified") @jakarta.annotation.Nullable Boolean mostFrequentDestinationSpecified, @Param("mostFrequentDestinationIn") @jakarta.annotation.Nullable List<String> mostFrequentDestinationIn, @Param("mostFrequentDestinationNotIn") @jakarta.annotation.Nullable List<String> mostFrequentDestinationNotIn, @Param("averageTripDistanceGreaterThan") @jakarta.annotation.Nullable BigDecimal averageTripDistanceGreaterThan, @Param("averageTripDistanceLessThan") @jakarta.annotation.Nullable BigDecimal averageTripDistanceLessThan, @Param("averageTripDistanceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal averageTripDistanceGreaterThanOrEqual, @Param("averageTripDistanceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal averageTripDistanceLessThanOrEqual, @Param("averageTripDistanceEquals") @jakarta.annotation.Nullable BigDecimal averageTripDistanceEquals, @Param("averageTripDistanceNotEquals") @jakarta.annotation.Nullable BigDecimal averageTripDistanceNotEquals, @Param("averageTripDistanceSpecified") @jakarta.annotation.Nullable Boolean averageTripDistanceSpecified, @Param("averageTripDistanceIn") @jakarta.annotation.Nullable List<BigDecimal> averageTripDistanceIn, @Param("averageTripDistanceNotIn") @jakarta.annotation.Nullable List<BigDecimal> averageTripDistanceNotIn, @Param("peakTravelTimeContains") @jakarta.annotation.Nullable String peakTravelTimeContains, @Param("peakTravelTimeDoesNotContain") @jakarta.annotation.Nullable String peakTravelTimeDoesNotContain, @Param("peakTravelTimeEquals") @jakarta.annotation.Nullable String peakTravelTimeEquals, @Param("peakTravelTimeNotEquals") @jakarta.annotation.Nullable String peakTravelTimeNotEquals, @Param("peakTravelTimeSpecified") @jakarta.annotation.Nullable Boolean peakTravelTimeSpecified, @Param("peakTravelTimeIn") @jakarta.annotation.Nullable List<String> peakTravelTimeIn, @Param("peakTravelTimeNotIn") @jakarta.annotation.Nullable List<String> peakTravelTimeNotIn, @Param("weekendTripsGreaterThan") @jakarta.annotation.Nullable Integer weekendTripsGreaterThan, @Param("weekendTripsLessThan") @jakarta.annotation.Nullable Integer weekendTripsLessThan, @Param("weekendTripsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer weekendTripsGreaterThanOrEqual, @Param("weekendTripsLessThanOrEqual") @jakarta.annotation.Nullable Integer weekendTripsLessThanOrEqual, @Param("weekendTripsEquals") @jakarta.annotation.Nullable Integer weekendTripsEquals, @Param("weekendTripsNotEquals") @jakarta.annotation.Nullable Integer weekendTripsNotEquals, @Param("weekendTripsSpecified") @jakarta.annotation.Nullable Boolean weekendTripsSpecified, @Param("weekendTripsIn") @jakarta.annotation.Nullable List<Integer> weekendTripsIn, @Param("weekendTripsNotIn") @jakarta.annotation.Nullable List<Integer> weekendTripsNotIn, @Param("holidayTripsGreaterThan") @jakarta.annotation.Nullable Integer holidayTripsGreaterThan, @Param("holidayTripsLessThan") @jakarta.annotation.Nullable Integer holidayTripsLessThan, @Param("holidayTripsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer holidayTripsGreaterThanOrEqual, @Param("holidayTripsLessThanOrEqual") @jakarta.annotation.Nullable Integer holidayTripsLessThanOrEqual, @Param("holidayTripsEquals") @jakarta.annotation.Nullable Integer holidayTripsEquals, @Param("holidayTripsNotEquals") @jakarta.annotation.Nullable Integer holidayTripsNotEquals, @Param("holidayTripsSpecified") @jakarta.annotation.Nullable Boolean holidayTripsSpecified, @Param("holidayTripsIn") @jakarta.annotation.Nullable List<Integer> holidayTripsIn, @Param("holidayTripsNotIn") @jakarta.annotation.Nullable List<Integer> holidayTripsNotIn, @Param("cancelledTripsGreaterThan") @jakarta.annotation.Nullable Integer cancelledTripsGreaterThan, @Param("cancelledTripsLessThan") @jakarta.annotation.Nullable Integer cancelledTripsLessThan, @Param("cancelledTripsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer cancelledTripsGreaterThanOrEqual, @Param("cancelledTripsLessThanOrEqual") @jakarta.annotation.Nullable Integer cancelledTripsLessThanOrEqual, @Param("cancelledTripsEquals") @jakarta.annotation.Nullable Integer cancelledTripsEquals, @Param("cancelledTripsNotEquals") @jakarta.annotation.Nullable Integer cancelledTripsNotEquals, @Param("cancelledTripsSpecified") @jakarta.annotation.Nullable Boolean cancelledTripsSpecified, @Param("cancelledTripsIn") @jakarta.annotation.Nullable List<Integer> cancelledTripsIn, @Param("cancelledTripsNotIn") @jakarta.annotation.Nullable List<Integer> cancelledTripsNotIn, @Param("onTimePerformanceRateGreaterThan") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateGreaterThan, @Param("onTimePerformanceRateLessThan") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateLessThan, @Param("onTimePerformanceRateGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateGreaterThanOrEqual, @Param("onTimePerformanceRateLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateLessThanOrEqual, @Param("onTimePerformanceRateEquals") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateEquals, @Param("onTimePerformanceRateNotEquals") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateNotEquals, @Param("onTimePerformanceRateSpecified") @jakarta.annotation.Nullable Boolean onTimePerformanceRateSpecified, @Param("onTimePerformanceRateIn") @jakarta.annotation.Nullable List<BigDecimal> onTimePerformanceRateIn, @Param("onTimePerformanceRateNotIn") @jakarta.annotation.Nullable List<BigDecimal> onTimePerformanceRateNotIn, @Param("preferredSeatTypesContains") @jakarta.annotation.Nullable String preferredSeatTypesContains, @Param("preferredSeatTypesDoesNotContain") @jakarta.annotation.Nullable String preferredSeatTypesDoesNotContain, @Param("preferredSeatTypesEquals") @jakarta.annotation.Nullable String preferredSeatTypesEquals, @Param("preferredSeatTypesNotEquals") @jakarta.annotation.Nullable String preferredSeatTypesNotEquals, @Param("preferredSeatTypesSpecified") @jakarta.annotation.Nullable Boolean preferredSeatTypesSpecified, @Param("preferredSeatTypesIn") @jakarta.annotation.Nullable List<String> preferredSeatTypesIn, @Param("preferredSeatTypesNotIn") @jakarta.annotation.Nullable List<String> preferredSeatTypesNotIn, @Param("monthlyTripCountGreaterThan") @jakarta.annotation.Nullable Integer monthlyTripCountGreaterThan, @Param("monthlyTripCountLessThan") @jakarta.annotation.Nullable Integer monthlyTripCountLessThan, @Param("monthlyTripCountGreaterThanOrEqual") @jakarta.annotation.Nullable Integer monthlyTripCountGreaterThanOrEqual, @Param("monthlyTripCountLessThanOrEqual") @jakarta.annotation.Nullable Integer monthlyTripCountLessThanOrEqual, @Param("monthlyTripCountEquals") @jakarta.annotation.Nullable Integer monthlyTripCountEquals, @Param("monthlyTripCountNotEquals") @jakarta.annotation.Nullable Integer monthlyTripCountNotEquals, @Param("monthlyTripCountSpecified") @jakarta.annotation.Nullable Boolean monthlyTripCountSpecified, @Param("monthlyTripCountIn") @jakarta.annotation.Nullable List<Integer> monthlyTripCountIn, @Param("monthlyTripCountNotIn") @jakarta.annotation.Nullable List<Integer> monthlyTripCountNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("userIdGreaterThan") @jakarta.annotation.Nullable Long userIdGreaterThan, @Param("userIdLessThan") @jakarta.annotation.Nullable Long userIdLessThan, @Param("userIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long userIdGreaterThanOrEqual, @Param("userIdLessThanOrEqual") @jakarta.annotation.Nullable Long userIdLessThanOrEqual, @Param("userIdEquals") @jakarta.annotation.Nullable Long userIdEquals, @Param("userIdNotEquals") @jakarta.annotation.Nullable Long userIdNotEquals, @Param("userIdSpecified") @jakarta.annotation.Nullable Boolean userIdSpecified, @Param("userIdIn") @jakarta.annotation.Nullable List<Long> userIdIn, @Param("userIdNotIn") @jakarta.annotation.Nullable List<Long> userIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countUserStatistics</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountUserStatisticsQueryParams} class that allows for
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
   *   <li>totalTripsGreaterThan -  (optional)</li>
   *   <li>totalTripsLessThan -  (optional)</li>
   *   <li>totalTripsGreaterThanOrEqual -  (optional)</li>
   *   <li>totalTripsLessThanOrEqual -  (optional)</li>
   *   <li>totalTripsEquals -  (optional)</li>
   *   <li>totalTripsNotEquals -  (optional)</li>
   *   <li>totalTripsSpecified -  (optional)</li>
   *   <li>totalTripsIn -  (optional)</li>
   *   <li>totalTripsNotIn -  (optional)</li>
   *   <li>totalSpentGreaterThan -  (optional)</li>
   *   <li>totalSpentLessThan -  (optional)</li>
   *   <li>totalSpentGreaterThanOrEqual -  (optional)</li>
   *   <li>totalSpentLessThanOrEqual -  (optional)</li>
   *   <li>totalSpentEquals -  (optional)</li>
   *   <li>totalSpentNotEquals -  (optional)</li>
   *   <li>totalSpentSpecified -  (optional)</li>
   *   <li>totalSpentIn -  (optional)</li>
   *   <li>totalSpentNotIn -  (optional)</li>
   *   <li>favoriteRoutesContains -  (optional)</li>
   *   <li>favoriteRoutesDoesNotContain -  (optional)</li>
   *   <li>favoriteRoutesEquals -  (optional)</li>
   *   <li>favoriteRoutesNotEquals -  (optional)</li>
   *   <li>favoriteRoutesSpecified -  (optional)</li>
   *   <li>favoriteRoutesIn -  (optional)</li>
   *   <li>favoriteRoutesNotIn -  (optional)</li>
   *   <li>preferredVehicleTypesContains -  (optional)</li>
   *   <li>preferredVehicleTypesDoesNotContain -  (optional)</li>
   *   <li>preferredVehicleTypesEquals -  (optional)</li>
   *   <li>preferredVehicleTypesNotEquals -  (optional)</li>
   *   <li>preferredVehicleTypesSpecified -  (optional)</li>
   *   <li>preferredVehicleTypesIn -  (optional)</li>
   *   <li>preferredVehicleTypesNotIn -  (optional)</li>
   *   <li>averageTripDurationGreaterThan -  (optional)</li>
   *   <li>averageTripDurationLessThan -  (optional)</li>
   *   <li>averageTripDurationGreaterThanOrEqual -  (optional)</li>
   *   <li>averageTripDurationLessThanOrEqual -  (optional)</li>
   *   <li>averageTripDurationEquals -  (optional)</li>
   *   <li>averageTripDurationNotEquals -  (optional)</li>
   *   <li>averageTripDurationSpecified -  (optional)</li>
   *   <li>averageTripDurationIn -  (optional)</li>
   *   <li>averageTripDurationNotIn -  (optional)</li>
   *   <li>lastTravelDateGreaterThan -  (optional)</li>
   *   <li>lastTravelDateLessThan -  (optional)</li>
   *   <li>lastTravelDateGreaterThanOrEqual -  (optional)</li>
   *   <li>lastTravelDateLessThanOrEqual -  (optional)</li>
   *   <li>lastTravelDateEquals -  (optional)</li>
   *   <li>lastTravelDateNotEquals -  (optional)</li>
   *   <li>lastTravelDateSpecified -  (optional)</li>
   *   <li>lastTravelDateIn -  (optional)</li>
   *   <li>lastTravelDateNotIn -  (optional)</li>
   *   <li>bookingFrequencyContains -  (optional)</li>
   *   <li>bookingFrequencyDoesNotContain -  (optional)</li>
   *   <li>bookingFrequencyEquals -  (optional)</li>
   *   <li>bookingFrequencyNotEquals -  (optional)</li>
   *   <li>bookingFrequencySpecified -  (optional)</li>
   *   <li>bookingFrequencyIn -  (optional)</li>
   *   <li>bookingFrequencyNotIn -  (optional)</li>
   *   <li>loyaltyPointsGreaterThan -  (optional)</li>
   *   <li>loyaltyPointsLessThan -  (optional)</li>
   *   <li>loyaltyPointsGreaterThanOrEqual -  (optional)</li>
   *   <li>loyaltyPointsLessThanOrEqual -  (optional)</li>
   *   <li>loyaltyPointsEquals -  (optional)</li>
   *   <li>loyaltyPointsNotEquals -  (optional)</li>
   *   <li>loyaltyPointsSpecified -  (optional)</li>
   *   <li>loyaltyPointsIn -  (optional)</li>
   *   <li>loyaltyPointsNotIn -  (optional)</li>
   *   <li>mostFrequentOriginContains -  (optional)</li>
   *   <li>mostFrequentOriginDoesNotContain -  (optional)</li>
   *   <li>mostFrequentOriginEquals -  (optional)</li>
   *   <li>mostFrequentOriginNotEquals -  (optional)</li>
   *   <li>mostFrequentOriginSpecified -  (optional)</li>
   *   <li>mostFrequentOriginIn -  (optional)</li>
   *   <li>mostFrequentOriginNotIn -  (optional)</li>
   *   <li>mostFrequentDestinationContains -  (optional)</li>
   *   <li>mostFrequentDestinationDoesNotContain -  (optional)</li>
   *   <li>mostFrequentDestinationEquals -  (optional)</li>
   *   <li>mostFrequentDestinationNotEquals -  (optional)</li>
   *   <li>mostFrequentDestinationSpecified -  (optional)</li>
   *   <li>mostFrequentDestinationIn -  (optional)</li>
   *   <li>mostFrequentDestinationNotIn -  (optional)</li>
   *   <li>averageTripDistanceGreaterThan -  (optional)</li>
   *   <li>averageTripDistanceLessThan -  (optional)</li>
   *   <li>averageTripDistanceGreaterThanOrEqual -  (optional)</li>
   *   <li>averageTripDistanceLessThanOrEqual -  (optional)</li>
   *   <li>averageTripDistanceEquals -  (optional)</li>
   *   <li>averageTripDistanceNotEquals -  (optional)</li>
   *   <li>averageTripDistanceSpecified -  (optional)</li>
   *   <li>averageTripDistanceIn -  (optional)</li>
   *   <li>averageTripDistanceNotIn -  (optional)</li>
   *   <li>peakTravelTimeContains -  (optional)</li>
   *   <li>peakTravelTimeDoesNotContain -  (optional)</li>
   *   <li>peakTravelTimeEquals -  (optional)</li>
   *   <li>peakTravelTimeNotEquals -  (optional)</li>
   *   <li>peakTravelTimeSpecified -  (optional)</li>
   *   <li>peakTravelTimeIn -  (optional)</li>
   *   <li>peakTravelTimeNotIn -  (optional)</li>
   *   <li>weekendTripsGreaterThan -  (optional)</li>
   *   <li>weekendTripsLessThan -  (optional)</li>
   *   <li>weekendTripsGreaterThanOrEqual -  (optional)</li>
   *   <li>weekendTripsLessThanOrEqual -  (optional)</li>
   *   <li>weekendTripsEquals -  (optional)</li>
   *   <li>weekendTripsNotEquals -  (optional)</li>
   *   <li>weekendTripsSpecified -  (optional)</li>
   *   <li>weekendTripsIn -  (optional)</li>
   *   <li>weekendTripsNotIn -  (optional)</li>
   *   <li>holidayTripsGreaterThan -  (optional)</li>
   *   <li>holidayTripsLessThan -  (optional)</li>
   *   <li>holidayTripsGreaterThanOrEqual -  (optional)</li>
   *   <li>holidayTripsLessThanOrEqual -  (optional)</li>
   *   <li>holidayTripsEquals -  (optional)</li>
   *   <li>holidayTripsNotEquals -  (optional)</li>
   *   <li>holidayTripsSpecified -  (optional)</li>
   *   <li>holidayTripsIn -  (optional)</li>
   *   <li>holidayTripsNotIn -  (optional)</li>
   *   <li>cancelledTripsGreaterThan -  (optional)</li>
   *   <li>cancelledTripsLessThan -  (optional)</li>
   *   <li>cancelledTripsGreaterThanOrEqual -  (optional)</li>
   *   <li>cancelledTripsLessThanOrEqual -  (optional)</li>
   *   <li>cancelledTripsEquals -  (optional)</li>
   *   <li>cancelledTripsNotEquals -  (optional)</li>
   *   <li>cancelledTripsSpecified -  (optional)</li>
   *   <li>cancelledTripsIn -  (optional)</li>
   *   <li>cancelledTripsNotIn -  (optional)</li>
   *   <li>onTimePerformanceRateGreaterThan -  (optional)</li>
   *   <li>onTimePerformanceRateLessThan -  (optional)</li>
   *   <li>onTimePerformanceRateGreaterThanOrEqual -  (optional)</li>
   *   <li>onTimePerformanceRateLessThanOrEqual -  (optional)</li>
   *   <li>onTimePerformanceRateEquals -  (optional)</li>
   *   <li>onTimePerformanceRateNotEquals -  (optional)</li>
   *   <li>onTimePerformanceRateSpecified -  (optional)</li>
   *   <li>onTimePerformanceRateIn -  (optional)</li>
   *   <li>onTimePerformanceRateNotIn -  (optional)</li>
   *   <li>preferredSeatTypesContains -  (optional)</li>
   *   <li>preferredSeatTypesDoesNotContain -  (optional)</li>
   *   <li>preferredSeatTypesEquals -  (optional)</li>
   *   <li>preferredSeatTypesNotEquals -  (optional)</li>
   *   <li>preferredSeatTypesSpecified -  (optional)</li>
   *   <li>preferredSeatTypesIn -  (optional)</li>
   *   <li>preferredSeatTypesNotIn -  (optional)</li>
   *   <li>monthlyTripCountGreaterThan -  (optional)</li>
   *   <li>monthlyTripCountLessThan -  (optional)</li>
   *   <li>monthlyTripCountGreaterThanOrEqual -  (optional)</li>
   *   <li>monthlyTripCountLessThanOrEqual -  (optional)</li>
   *   <li>monthlyTripCountEquals -  (optional)</li>
   *   <li>monthlyTripCountNotEquals -  (optional)</li>
   *   <li>monthlyTripCountSpecified -  (optional)</li>
   *   <li>monthlyTripCountIn -  (optional)</li>
   *   <li>monthlyTripCountNotIn -  (optional)</li>
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
   *   <li>userIdGreaterThan -  (optional)</li>
   *   <li>userIdLessThan -  (optional)</li>
   *   <li>userIdGreaterThanOrEqual -  (optional)</li>
   *   <li>userIdLessThanOrEqual -  (optional)</li>
   *   <li>userIdEquals -  (optional)</li>
   *   <li>userIdNotEquals -  (optional)</li>
   *   <li>userIdSpecified -  (optional)</li>
   *   <li>userIdIn -  (optional)</li>
   *   <li>userIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return Long
   */
  @RequestLine("GET /api/user-statistics/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&totalTrips.greaterThan={totalTripsGreaterThan}&totalTrips.lessThan={totalTripsLessThan}&totalTrips.greaterThanOrEqual={totalTripsGreaterThanOrEqual}&totalTrips.lessThanOrEqual={totalTripsLessThanOrEqual}&totalTrips.equals={totalTripsEquals}&totalTrips.notEquals={totalTripsNotEquals}&totalTrips.specified={totalTripsSpecified}&totalTrips.in={totalTripsIn}&totalTrips.notIn={totalTripsNotIn}&totalSpent.greaterThan={totalSpentGreaterThan}&totalSpent.lessThan={totalSpentLessThan}&totalSpent.greaterThanOrEqual={totalSpentGreaterThanOrEqual}&totalSpent.lessThanOrEqual={totalSpentLessThanOrEqual}&totalSpent.equals={totalSpentEquals}&totalSpent.notEquals={totalSpentNotEquals}&totalSpent.specified={totalSpentSpecified}&totalSpent.in={totalSpentIn}&totalSpent.notIn={totalSpentNotIn}&favoriteRoutes.contains={favoriteRoutesContains}&favoriteRoutes.doesNotContain={favoriteRoutesDoesNotContain}&favoriteRoutes.equals={favoriteRoutesEquals}&favoriteRoutes.notEquals={favoriteRoutesNotEquals}&favoriteRoutes.specified={favoriteRoutesSpecified}&favoriteRoutes.in={favoriteRoutesIn}&favoriteRoutes.notIn={favoriteRoutesNotIn}&preferredVehicleTypes.contains={preferredVehicleTypesContains}&preferredVehicleTypes.doesNotContain={preferredVehicleTypesDoesNotContain}&preferredVehicleTypes.equals={preferredVehicleTypesEquals}&preferredVehicleTypes.notEquals={preferredVehicleTypesNotEquals}&preferredVehicleTypes.specified={preferredVehicleTypesSpecified}&preferredVehicleTypes.in={preferredVehicleTypesIn}&preferredVehicleTypes.notIn={preferredVehicleTypesNotIn}&averageTripDuration.greaterThan={averageTripDurationGreaterThan}&averageTripDuration.lessThan={averageTripDurationLessThan}&averageTripDuration.greaterThanOrEqual={averageTripDurationGreaterThanOrEqual}&averageTripDuration.lessThanOrEqual={averageTripDurationLessThanOrEqual}&averageTripDuration.equals={averageTripDurationEquals}&averageTripDuration.notEquals={averageTripDurationNotEquals}&averageTripDuration.specified={averageTripDurationSpecified}&averageTripDuration.in={averageTripDurationIn}&averageTripDuration.notIn={averageTripDurationNotIn}&lastTravelDate.greaterThan={lastTravelDateGreaterThan}&lastTravelDate.lessThan={lastTravelDateLessThan}&lastTravelDate.greaterThanOrEqual={lastTravelDateGreaterThanOrEqual}&lastTravelDate.lessThanOrEqual={lastTravelDateLessThanOrEqual}&lastTravelDate.equals={lastTravelDateEquals}&lastTravelDate.notEquals={lastTravelDateNotEquals}&lastTravelDate.specified={lastTravelDateSpecified}&lastTravelDate.in={lastTravelDateIn}&lastTravelDate.notIn={lastTravelDateNotIn}&bookingFrequency.contains={bookingFrequencyContains}&bookingFrequency.doesNotContain={bookingFrequencyDoesNotContain}&bookingFrequency.equals={bookingFrequencyEquals}&bookingFrequency.notEquals={bookingFrequencyNotEquals}&bookingFrequency.specified={bookingFrequencySpecified}&bookingFrequency.in={bookingFrequencyIn}&bookingFrequency.notIn={bookingFrequencyNotIn}&loyaltyPoints.greaterThan={loyaltyPointsGreaterThan}&loyaltyPoints.lessThan={loyaltyPointsLessThan}&loyaltyPoints.greaterThanOrEqual={loyaltyPointsGreaterThanOrEqual}&loyaltyPoints.lessThanOrEqual={loyaltyPointsLessThanOrEqual}&loyaltyPoints.equals={loyaltyPointsEquals}&loyaltyPoints.notEquals={loyaltyPointsNotEquals}&loyaltyPoints.specified={loyaltyPointsSpecified}&loyaltyPoints.in={loyaltyPointsIn}&loyaltyPoints.notIn={loyaltyPointsNotIn}&mostFrequentOrigin.contains={mostFrequentOriginContains}&mostFrequentOrigin.doesNotContain={mostFrequentOriginDoesNotContain}&mostFrequentOrigin.equals={mostFrequentOriginEquals}&mostFrequentOrigin.notEquals={mostFrequentOriginNotEquals}&mostFrequentOrigin.specified={mostFrequentOriginSpecified}&mostFrequentOrigin.in={mostFrequentOriginIn}&mostFrequentOrigin.notIn={mostFrequentOriginNotIn}&mostFrequentDestination.contains={mostFrequentDestinationContains}&mostFrequentDestination.doesNotContain={mostFrequentDestinationDoesNotContain}&mostFrequentDestination.equals={mostFrequentDestinationEquals}&mostFrequentDestination.notEquals={mostFrequentDestinationNotEquals}&mostFrequentDestination.specified={mostFrequentDestinationSpecified}&mostFrequentDestination.in={mostFrequentDestinationIn}&mostFrequentDestination.notIn={mostFrequentDestinationNotIn}&averageTripDistance.greaterThan={averageTripDistanceGreaterThan}&averageTripDistance.lessThan={averageTripDistanceLessThan}&averageTripDistance.greaterThanOrEqual={averageTripDistanceGreaterThanOrEqual}&averageTripDistance.lessThanOrEqual={averageTripDistanceLessThanOrEqual}&averageTripDistance.equals={averageTripDistanceEquals}&averageTripDistance.notEquals={averageTripDistanceNotEquals}&averageTripDistance.specified={averageTripDistanceSpecified}&averageTripDistance.in={averageTripDistanceIn}&averageTripDistance.notIn={averageTripDistanceNotIn}&peakTravelTime.contains={peakTravelTimeContains}&peakTravelTime.doesNotContain={peakTravelTimeDoesNotContain}&peakTravelTime.equals={peakTravelTimeEquals}&peakTravelTime.notEquals={peakTravelTimeNotEquals}&peakTravelTime.specified={peakTravelTimeSpecified}&peakTravelTime.in={peakTravelTimeIn}&peakTravelTime.notIn={peakTravelTimeNotIn}&weekendTrips.greaterThan={weekendTripsGreaterThan}&weekendTrips.lessThan={weekendTripsLessThan}&weekendTrips.greaterThanOrEqual={weekendTripsGreaterThanOrEqual}&weekendTrips.lessThanOrEqual={weekendTripsLessThanOrEqual}&weekendTrips.equals={weekendTripsEquals}&weekendTrips.notEquals={weekendTripsNotEquals}&weekendTrips.specified={weekendTripsSpecified}&weekendTrips.in={weekendTripsIn}&weekendTrips.notIn={weekendTripsNotIn}&holidayTrips.greaterThan={holidayTripsGreaterThan}&holidayTrips.lessThan={holidayTripsLessThan}&holidayTrips.greaterThanOrEqual={holidayTripsGreaterThanOrEqual}&holidayTrips.lessThanOrEqual={holidayTripsLessThanOrEqual}&holidayTrips.equals={holidayTripsEquals}&holidayTrips.notEquals={holidayTripsNotEquals}&holidayTrips.specified={holidayTripsSpecified}&holidayTrips.in={holidayTripsIn}&holidayTrips.notIn={holidayTripsNotIn}&cancelledTrips.greaterThan={cancelledTripsGreaterThan}&cancelledTrips.lessThan={cancelledTripsLessThan}&cancelledTrips.greaterThanOrEqual={cancelledTripsGreaterThanOrEqual}&cancelledTrips.lessThanOrEqual={cancelledTripsLessThanOrEqual}&cancelledTrips.equals={cancelledTripsEquals}&cancelledTrips.notEquals={cancelledTripsNotEquals}&cancelledTrips.specified={cancelledTripsSpecified}&cancelledTrips.in={cancelledTripsIn}&cancelledTrips.notIn={cancelledTripsNotIn}&onTimePerformanceRate.greaterThan={onTimePerformanceRateGreaterThan}&onTimePerformanceRate.lessThan={onTimePerformanceRateLessThan}&onTimePerformanceRate.greaterThanOrEqual={onTimePerformanceRateGreaterThanOrEqual}&onTimePerformanceRate.lessThanOrEqual={onTimePerformanceRateLessThanOrEqual}&onTimePerformanceRate.equals={onTimePerformanceRateEquals}&onTimePerformanceRate.notEquals={onTimePerformanceRateNotEquals}&onTimePerformanceRate.specified={onTimePerformanceRateSpecified}&onTimePerformanceRate.in={onTimePerformanceRateIn}&onTimePerformanceRate.notIn={onTimePerformanceRateNotIn}&preferredSeatTypes.contains={preferredSeatTypesContains}&preferredSeatTypes.doesNotContain={preferredSeatTypesDoesNotContain}&preferredSeatTypes.equals={preferredSeatTypesEquals}&preferredSeatTypes.notEquals={preferredSeatTypesNotEquals}&preferredSeatTypes.specified={preferredSeatTypesSpecified}&preferredSeatTypes.in={preferredSeatTypesIn}&preferredSeatTypes.notIn={preferredSeatTypesNotIn}&monthlyTripCount.greaterThan={monthlyTripCountGreaterThan}&monthlyTripCount.lessThan={monthlyTripCountLessThan}&monthlyTripCount.greaterThanOrEqual={monthlyTripCountGreaterThanOrEqual}&monthlyTripCount.lessThanOrEqual={monthlyTripCountLessThanOrEqual}&monthlyTripCount.equals={monthlyTripCountEquals}&monthlyTripCount.notEquals={monthlyTripCountNotEquals}&monthlyTripCount.specified={monthlyTripCountSpecified}&monthlyTripCount.in={monthlyTripCountIn}&monthlyTripCount.notIn={monthlyTripCountNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countUserStatistics(@QueryMap(encoded=true) CountUserStatisticsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countUserStatistics</code> that receives the query parameters as a map,
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
          *   <li>totalTripsGreaterThan -  (optional)</li>
          *   <li>totalTripsLessThan -  (optional)</li>
          *   <li>totalTripsGreaterThanOrEqual -  (optional)</li>
          *   <li>totalTripsLessThanOrEqual -  (optional)</li>
          *   <li>totalTripsEquals -  (optional)</li>
          *   <li>totalTripsNotEquals -  (optional)</li>
          *   <li>totalTripsSpecified -  (optional)</li>
          *   <li>totalTripsIn -  (optional)</li>
          *   <li>totalTripsNotIn -  (optional)</li>
          *   <li>totalSpentGreaterThan -  (optional)</li>
          *   <li>totalSpentLessThan -  (optional)</li>
          *   <li>totalSpentGreaterThanOrEqual -  (optional)</li>
          *   <li>totalSpentLessThanOrEqual -  (optional)</li>
          *   <li>totalSpentEquals -  (optional)</li>
          *   <li>totalSpentNotEquals -  (optional)</li>
          *   <li>totalSpentSpecified -  (optional)</li>
          *   <li>totalSpentIn -  (optional)</li>
          *   <li>totalSpentNotIn -  (optional)</li>
          *   <li>favoriteRoutesContains -  (optional)</li>
          *   <li>favoriteRoutesDoesNotContain -  (optional)</li>
          *   <li>favoriteRoutesEquals -  (optional)</li>
          *   <li>favoriteRoutesNotEquals -  (optional)</li>
          *   <li>favoriteRoutesSpecified -  (optional)</li>
          *   <li>favoriteRoutesIn -  (optional)</li>
          *   <li>favoriteRoutesNotIn -  (optional)</li>
          *   <li>preferredVehicleTypesContains -  (optional)</li>
          *   <li>preferredVehicleTypesDoesNotContain -  (optional)</li>
          *   <li>preferredVehicleTypesEquals -  (optional)</li>
          *   <li>preferredVehicleTypesNotEquals -  (optional)</li>
          *   <li>preferredVehicleTypesSpecified -  (optional)</li>
          *   <li>preferredVehicleTypesIn -  (optional)</li>
          *   <li>preferredVehicleTypesNotIn -  (optional)</li>
          *   <li>averageTripDurationGreaterThan -  (optional)</li>
          *   <li>averageTripDurationLessThan -  (optional)</li>
          *   <li>averageTripDurationGreaterThanOrEqual -  (optional)</li>
          *   <li>averageTripDurationLessThanOrEqual -  (optional)</li>
          *   <li>averageTripDurationEquals -  (optional)</li>
          *   <li>averageTripDurationNotEquals -  (optional)</li>
          *   <li>averageTripDurationSpecified -  (optional)</li>
          *   <li>averageTripDurationIn -  (optional)</li>
          *   <li>averageTripDurationNotIn -  (optional)</li>
          *   <li>lastTravelDateGreaterThan -  (optional)</li>
          *   <li>lastTravelDateLessThan -  (optional)</li>
          *   <li>lastTravelDateGreaterThanOrEqual -  (optional)</li>
          *   <li>lastTravelDateLessThanOrEqual -  (optional)</li>
          *   <li>lastTravelDateEquals -  (optional)</li>
          *   <li>lastTravelDateNotEquals -  (optional)</li>
          *   <li>lastTravelDateSpecified -  (optional)</li>
          *   <li>lastTravelDateIn -  (optional)</li>
          *   <li>lastTravelDateNotIn -  (optional)</li>
          *   <li>bookingFrequencyContains -  (optional)</li>
          *   <li>bookingFrequencyDoesNotContain -  (optional)</li>
          *   <li>bookingFrequencyEquals -  (optional)</li>
          *   <li>bookingFrequencyNotEquals -  (optional)</li>
          *   <li>bookingFrequencySpecified -  (optional)</li>
          *   <li>bookingFrequencyIn -  (optional)</li>
          *   <li>bookingFrequencyNotIn -  (optional)</li>
          *   <li>loyaltyPointsGreaterThan -  (optional)</li>
          *   <li>loyaltyPointsLessThan -  (optional)</li>
          *   <li>loyaltyPointsGreaterThanOrEqual -  (optional)</li>
          *   <li>loyaltyPointsLessThanOrEqual -  (optional)</li>
          *   <li>loyaltyPointsEquals -  (optional)</li>
          *   <li>loyaltyPointsNotEquals -  (optional)</li>
          *   <li>loyaltyPointsSpecified -  (optional)</li>
          *   <li>loyaltyPointsIn -  (optional)</li>
          *   <li>loyaltyPointsNotIn -  (optional)</li>
          *   <li>mostFrequentOriginContains -  (optional)</li>
          *   <li>mostFrequentOriginDoesNotContain -  (optional)</li>
          *   <li>mostFrequentOriginEquals -  (optional)</li>
          *   <li>mostFrequentOriginNotEquals -  (optional)</li>
          *   <li>mostFrequentOriginSpecified -  (optional)</li>
          *   <li>mostFrequentOriginIn -  (optional)</li>
          *   <li>mostFrequentOriginNotIn -  (optional)</li>
          *   <li>mostFrequentDestinationContains -  (optional)</li>
          *   <li>mostFrequentDestinationDoesNotContain -  (optional)</li>
          *   <li>mostFrequentDestinationEquals -  (optional)</li>
          *   <li>mostFrequentDestinationNotEquals -  (optional)</li>
          *   <li>mostFrequentDestinationSpecified -  (optional)</li>
          *   <li>mostFrequentDestinationIn -  (optional)</li>
          *   <li>mostFrequentDestinationNotIn -  (optional)</li>
          *   <li>averageTripDistanceGreaterThan -  (optional)</li>
          *   <li>averageTripDistanceLessThan -  (optional)</li>
          *   <li>averageTripDistanceGreaterThanOrEqual -  (optional)</li>
          *   <li>averageTripDistanceLessThanOrEqual -  (optional)</li>
          *   <li>averageTripDistanceEquals -  (optional)</li>
          *   <li>averageTripDistanceNotEquals -  (optional)</li>
          *   <li>averageTripDistanceSpecified -  (optional)</li>
          *   <li>averageTripDistanceIn -  (optional)</li>
          *   <li>averageTripDistanceNotIn -  (optional)</li>
          *   <li>peakTravelTimeContains -  (optional)</li>
          *   <li>peakTravelTimeDoesNotContain -  (optional)</li>
          *   <li>peakTravelTimeEquals -  (optional)</li>
          *   <li>peakTravelTimeNotEquals -  (optional)</li>
          *   <li>peakTravelTimeSpecified -  (optional)</li>
          *   <li>peakTravelTimeIn -  (optional)</li>
          *   <li>peakTravelTimeNotIn -  (optional)</li>
          *   <li>weekendTripsGreaterThan -  (optional)</li>
          *   <li>weekendTripsLessThan -  (optional)</li>
          *   <li>weekendTripsGreaterThanOrEqual -  (optional)</li>
          *   <li>weekendTripsLessThanOrEqual -  (optional)</li>
          *   <li>weekendTripsEquals -  (optional)</li>
          *   <li>weekendTripsNotEquals -  (optional)</li>
          *   <li>weekendTripsSpecified -  (optional)</li>
          *   <li>weekendTripsIn -  (optional)</li>
          *   <li>weekendTripsNotIn -  (optional)</li>
          *   <li>holidayTripsGreaterThan -  (optional)</li>
          *   <li>holidayTripsLessThan -  (optional)</li>
          *   <li>holidayTripsGreaterThanOrEqual -  (optional)</li>
          *   <li>holidayTripsLessThanOrEqual -  (optional)</li>
          *   <li>holidayTripsEquals -  (optional)</li>
          *   <li>holidayTripsNotEquals -  (optional)</li>
          *   <li>holidayTripsSpecified -  (optional)</li>
          *   <li>holidayTripsIn -  (optional)</li>
          *   <li>holidayTripsNotIn -  (optional)</li>
          *   <li>cancelledTripsGreaterThan -  (optional)</li>
          *   <li>cancelledTripsLessThan -  (optional)</li>
          *   <li>cancelledTripsGreaterThanOrEqual -  (optional)</li>
          *   <li>cancelledTripsLessThanOrEqual -  (optional)</li>
          *   <li>cancelledTripsEquals -  (optional)</li>
          *   <li>cancelledTripsNotEquals -  (optional)</li>
          *   <li>cancelledTripsSpecified -  (optional)</li>
          *   <li>cancelledTripsIn -  (optional)</li>
          *   <li>cancelledTripsNotIn -  (optional)</li>
          *   <li>onTimePerformanceRateGreaterThan -  (optional)</li>
          *   <li>onTimePerformanceRateLessThan -  (optional)</li>
          *   <li>onTimePerformanceRateGreaterThanOrEqual -  (optional)</li>
          *   <li>onTimePerformanceRateLessThanOrEqual -  (optional)</li>
          *   <li>onTimePerformanceRateEquals -  (optional)</li>
          *   <li>onTimePerformanceRateNotEquals -  (optional)</li>
          *   <li>onTimePerformanceRateSpecified -  (optional)</li>
          *   <li>onTimePerformanceRateIn -  (optional)</li>
          *   <li>onTimePerformanceRateNotIn -  (optional)</li>
          *   <li>preferredSeatTypesContains -  (optional)</li>
          *   <li>preferredSeatTypesDoesNotContain -  (optional)</li>
          *   <li>preferredSeatTypesEquals -  (optional)</li>
          *   <li>preferredSeatTypesNotEquals -  (optional)</li>
          *   <li>preferredSeatTypesSpecified -  (optional)</li>
          *   <li>preferredSeatTypesIn -  (optional)</li>
          *   <li>preferredSeatTypesNotIn -  (optional)</li>
          *   <li>monthlyTripCountGreaterThan -  (optional)</li>
          *   <li>monthlyTripCountLessThan -  (optional)</li>
          *   <li>monthlyTripCountGreaterThanOrEqual -  (optional)</li>
          *   <li>monthlyTripCountLessThanOrEqual -  (optional)</li>
          *   <li>monthlyTripCountEquals -  (optional)</li>
          *   <li>monthlyTripCountNotEquals -  (optional)</li>
          *   <li>monthlyTripCountSpecified -  (optional)</li>
          *   <li>monthlyTripCountIn -  (optional)</li>
          *   <li>monthlyTripCountNotIn -  (optional)</li>
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
          *   <li>userIdGreaterThan -  (optional)</li>
          *   <li>userIdLessThan -  (optional)</li>
          *   <li>userIdGreaterThanOrEqual -  (optional)</li>
          *   <li>userIdLessThanOrEqual -  (optional)</li>
          *   <li>userIdEquals -  (optional)</li>
          *   <li>userIdNotEquals -  (optional)</li>
          *   <li>userIdSpecified -  (optional)</li>
          *   <li>userIdIn -  (optional)</li>
          *   <li>userIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return Long
      */
      @RequestLine("GET /api/user-statistics/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&totalTrips.greaterThan={totalTripsGreaterThan}&totalTrips.lessThan={totalTripsLessThan}&totalTrips.greaterThanOrEqual={totalTripsGreaterThanOrEqual}&totalTrips.lessThanOrEqual={totalTripsLessThanOrEqual}&totalTrips.equals={totalTripsEquals}&totalTrips.notEquals={totalTripsNotEquals}&totalTrips.specified={totalTripsSpecified}&totalTrips.in={totalTripsIn}&totalTrips.notIn={totalTripsNotIn}&totalSpent.greaterThan={totalSpentGreaterThan}&totalSpent.lessThan={totalSpentLessThan}&totalSpent.greaterThanOrEqual={totalSpentGreaterThanOrEqual}&totalSpent.lessThanOrEqual={totalSpentLessThanOrEqual}&totalSpent.equals={totalSpentEquals}&totalSpent.notEquals={totalSpentNotEquals}&totalSpent.specified={totalSpentSpecified}&totalSpent.in={totalSpentIn}&totalSpent.notIn={totalSpentNotIn}&favoriteRoutes.contains={favoriteRoutesContains}&favoriteRoutes.doesNotContain={favoriteRoutesDoesNotContain}&favoriteRoutes.equals={favoriteRoutesEquals}&favoriteRoutes.notEquals={favoriteRoutesNotEquals}&favoriteRoutes.specified={favoriteRoutesSpecified}&favoriteRoutes.in={favoriteRoutesIn}&favoriteRoutes.notIn={favoriteRoutesNotIn}&preferredVehicleTypes.contains={preferredVehicleTypesContains}&preferredVehicleTypes.doesNotContain={preferredVehicleTypesDoesNotContain}&preferredVehicleTypes.equals={preferredVehicleTypesEquals}&preferredVehicleTypes.notEquals={preferredVehicleTypesNotEquals}&preferredVehicleTypes.specified={preferredVehicleTypesSpecified}&preferredVehicleTypes.in={preferredVehicleTypesIn}&preferredVehicleTypes.notIn={preferredVehicleTypesNotIn}&averageTripDuration.greaterThan={averageTripDurationGreaterThan}&averageTripDuration.lessThan={averageTripDurationLessThan}&averageTripDuration.greaterThanOrEqual={averageTripDurationGreaterThanOrEqual}&averageTripDuration.lessThanOrEqual={averageTripDurationLessThanOrEqual}&averageTripDuration.equals={averageTripDurationEquals}&averageTripDuration.notEquals={averageTripDurationNotEquals}&averageTripDuration.specified={averageTripDurationSpecified}&averageTripDuration.in={averageTripDurationIn}&averageTripDuration.notIn={averageTripDurationNotIn}&lastTravelDate.greaterThan={lastTravelDateGreaterThan}&lastTravelDate.lessThan={lastTravelDateLessThan}&lastTravelDate.greaterThanOrEqual={lastTravelDateGreaterThanOrEqual}&lastTravelDate.lessThanOrEqual={lastTravelDateLessThanOrEqual}&lastTravelDate.equals={lastTravelDateEquals}&lastTravelDate.notEquals={lastTravelDateNotEquals}&lastTravelDate.specified={lastTravelDateSpecified}&lastTravelDate.in={lastTravelDateIn}&lastTravelDate.notIn={lastTravelDateNotIn}&bookingFrequency.contains={bookingFrequencyContains}&bookingFrequency.doesNotContain={bookingFrequencyDoesNotContain}&bookingFrequency.equals={bookingFrequencyEquals}&bookingFrequency.notEquals={bookingFrequencyNotEquals}&bookingFrequency.specified={bookingFrequencySpecified}&bookingFrequency.in={bookingFrequencyIn}&bookingFrequency.notIn={bookingFrequencyNotIn}&loyaltyPoints.greaterThan={loyaltyPointsGreaterThan}&loyaltyPoints.lessThan={loyaltyPointsLessThan}&loyaltyPoints.greaterThanOrEqual={loyaltyPointsGreaterThanOrEqual}&loyaltyPoints.lessThanOrEqual={loyaltyPointsLessThanOrEqual}&loyaltyPoints.equals={loyaltyPointsEquals}&loyaltyPoints.notEquals={loyaltyPointsNotEquals}&loyaltyPoints.specified={loyaltyPointsSpecified}&loyaltyPoints.in={loyaltyPointsIn}&loyaltyPoints.notIn={loyaltyPointsNotIn}&mostFrequentOrigin.contains={mostFrequentOriginContains}&mostFrequentOrigin.doesNotContain={mostFrequentOriginDoesNotContain}&mostFrequentOrigin.equals={mostFrequentOriginEquals}&mostFrequentOrigin.notEquals={mostFrequentOriginNotEquals}&mostFrequentOrigin.specified={mostFrequentOriginSpecified}&mostFrequentOrigin.in={mostFrequentOriginIn}&mostFrequentOrigin.notIn={mostFrequentOriginNotIn}&mostFrequentDestination.contains={mostFrequentDestinationContains}&mostFrequentDestination.doesNotContain={mostFrequentDestinationDoesNotContain}&mostFrequentDestination.equals={mostFrequentDestinationEquals}&mostFrequentDestination.notEquals={mostFrequentDestinationNotEquals}&mostFrequentDestination.specified={mostFrequentDestinationSpecified}&mostFrequentDestination.in={mostFrequentDestinationIn}&mostFrequentDestination.notIn={mostFrequentDestinationNotIn}&averageTripDistance.greaterThan={averageTripDistanceGreaterThan}&averageTripDistance.lessThan={averageTripDistanceLessThan}&averageTripDistance.greaterThanOrEqual={averageTripDistanceGreaterThanOrEqual}&averageTripDistance.lessThanOrEqual={averageTripDistanceLessThanOrEqual}&averageTripDistance.equals={averageTripDistanceEquals}&averageTripDistance.notEquals={averageTripDistanceNotEquals}&averageTripDistance.specified={averageTripDistanceSpecified}&averageTripDistance.in={averageTripDistanceIn}&averageTripDistance.notIn={averageTripDistanceNotIn}&peakTravelTime.contains={peakTravelTimeContains}&peakTravelTime.doesNotContain={peakTravelTimeDoesNotContain}&peakTravelTime.equals={peakTravelTimeEquals}&peakTravelTime.notEquals={peakTravelTimeNotEquals}&peakTravelTime.specified={peakTravelTimeSpecified}&peakTravelTime.in={peakTravelTimeIn}&peakTravelTime.notIn={peakTravelTimeNotIn}&weekendTrips.greaterThan={weekendTripsGreaterThan}&weekendTrips.lessThan={weekendTripsLessThan}&weekendTrips.greaterThanOrEqual={weekendTripsGreaterThanOrEqual}&weekendTrips.lessThanOrEqual={weekendTripsLessThanOrEqual}&weekendTrips.equals={weekendTripsEquals}&weekendTrips.notEquals={weekendTripsNotEquals}&weekendTrips.specified={weekendTripsSpecified}&weekendTrips.in={weekendTripsIn}&weekendTrips.notIn={weekendTripsNotIn}&holidayTrips.greaterThan={holidayTripsGreaterThan}&holidayTrips.lessThan={holidayTripsLessThan}&holidayTrips.greaterThanOrEqual={holidayTripsGreaterThanOrEqual}&holidayTrips.lessThanOrEqual={holidayTripsLessThanOrEqual}&holidayTrips.equals={holidayTripsEquals}&holidayTrips.notEquals={holidayTripsNotEquals}&holidayTrips.specified={holidayTripsSpecified}&holidayTrips.in={holidayTripsIn}&holidayTrips.notIn={holidayTripsNotIn}&cancelledTrips.greaterThan={cancelledTripsGreaterThan}&cancelledTrips.lessThan={cancelledTripsLessThan}&cancelledTrips.greaterThanOrEqual={cancelledTripsGreaterThanOrEqual}&cancelledTrips.lessThanOrEqual={cancelledTripsLessThanOrEqual}&cancelledTrips.equals={cancelledTripsEquals}&cancelledTrips.notEquals={cancelledTripsNotEquals}&cancelledTrips.specified={cancelledTripsSpecified}&cancelledTrips.in={cancelledTripsIn}&cancelledTrips.notIn={cancelledTripsNotIn}&onTimePerformanceRate.greaterThan={onTimePerformanceRateGreaterThan}&onTimePerformanceRate.lessThan={onTimePerformanceRateLessThan}&onTimePerformanceRate.greaterThanOrEqual={onTimePerformanceRateGreaterThanOrEqual}&onTimePerformanceRate.lessThanOrEqual={onTimePerformanceRateLessThanOrEqual}&onTimePerformanceRate.equals={onTimePerformanceRateEquals}&onTimePerformanceRate.notEquals={onTimePerformanceRateNotEquals}&onTimePerformanceRate.specified={onTimePerformanceRateSpecified}&onTimePerformanceRate.in={onTimePerformanceRateIn}&onTimePerformanceRate.notIn={onTimePerformanceRateNotIn}&preferredSeatTypes.contains={preferredSeatTypesContains}&preferredSeatTypes.doesNotContain={preferredSeatTypesDoesNotContain}&preferredSeatTypes.equals={preferredSeatTypesEquals}&preferredSeatTypes.notEquals={preferredSeatTypesNotEquals}&preferredSeatTypes.specified={preferredSeatTypesSpecified}&preferredSeatTypes.in={preferredSeatTypesIn}&preferredSeatTypes.notIn={preferredSeatTypesNotIn}&monthlyTripCount.greaterThan={monthlyTripCountGreaterThan}&monthlyTripCount.lessThan={monthlyTripCountLessThan}&monthlyTripCount.greaterThanOrEqual={monthlyTripCountGreaterThanOrEqual}&monthlyTripCount.lessThanOrEqual={monthlyTripCountLessThanOrEqual}&monthlyTripCount.equals={monthlyTripCountEquals}&monthlyTripCount.notEquals={monthlyTripCountNotEquals}&monthlyTripCount.specified={monthlyTripCountSpecified}&monthlyTripCount.in={monthlyTripCountIn}&monthlyTripCount.notIn={monthlyTripCountNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countUserStatisticsWithHttpInfo(@QueryMap(encoded=true) CountUserStatisticsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countUserStatistics</code> method in a fluent style.
   */
  public static class CountUserStatisticsQueryParams extends HashMap<String, Object> {
    public CountUserStatisticsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams totalTripsGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("totalTrips.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams totalTripsLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("totalTrips.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams totalTripsGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("totalTrips.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams totalTripsLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("totalTrips.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams totalTripsEquals(@jakarta.annotation.Nullable final Integer value) {
      put("totalTrips.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams totalTripsNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("totalTrips.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams totalTripsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("totalTrips.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams totalTripsIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("totalTrips.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams totalTripsNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("totalTrips.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams totalSpentGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalSpent.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams totalSpentLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalSpent.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams totalSpentGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalSpent.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams totalSpentLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalSpent.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams totalSpentEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalSpent.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams totalSpentNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalSpent.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams totalSpentSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("totalSpent.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams totalSpentIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("totalSpent.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams totalSpentNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("totalSpent.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams favoriteRoutesContains(@jakarta.annotation.Nullable final String value) {
      put("favoriteRoutes.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams favoriteRoutesDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("favoriteRoutes.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams favoriteRoutesEquals(@jakarta.annotation.Nullable final String value) {
      put("favoriteRoutes.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams favoriteRoutesNotEquals(@jakarta.annotation.Nullable final String value) {
      put("favoriteRoutes.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams favoriteRoutesSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("favoriteRoutes.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams favoriteRoutesIn(@jakarta.annotation.Nullable final List<String> value) {
      put("favoriteRoutes.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams favoriteRoutesNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("favoriteRoutes.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams preferredVehicleTypesContains(@jakarta.annotation.Nullable final String value) {
      put("preferredVehicleTypes.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams preferredVehicleTypesDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("preferredVehicleTypes.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams preferredVehicleTypesEquals(@jakarta.annotation.Nullable final String value) {
      put("preferredVehicleTypes.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams preferredVehicleTypesNotEquals(@jakarta.annotation.Nullable final String value) {
      put("preferredVehicleTypes.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams preferredVehicleTypesSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("preferredVehicleTypes.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams preferredVehicleTypesIn(@jakarta.annotation.Nullable final List<String> value) {
      put("preferredVehicleTypes.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams preferredVehicleTypesNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("preferredVehicleTypes.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDurationGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("averageTripDuration.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDurationLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("averageTripDuration.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDurationGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("averageTripDuration.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDurationLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("averageTripDuration.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDurationEquals(@jakarta.annotation.Nullable final Integer value) {
      put("averageTripDuration.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDurationNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("averageTripDuration.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDurationSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("averageTripDuration.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDurationIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("averageTripDuration.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDurationNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("averageTripDuration.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams lastTravelDateGreaterThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("lastTravelDate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams lastTravelDateLessThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("lastTravelDate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams lastTravelDateGreaterThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("lastTravelDate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams lastTravelDateLessThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("lastTravelDate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams lastTravelDateEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("lastTravelDate.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams lastTravelDateNotEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("lastTravelDate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams lastTravelDateSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("lastTravelDate.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams lastTravelDateIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("lastTravelDate.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams lastTravelDateNotIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("lastTravelDate.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams bookingFrequencyContains(@jakarta.annotation.Nullable final String value) {
      put("bookingFrequency.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams bookingFrequencyDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("bookingFrequency.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams bookingFrequencyEquals(@jakarta.annotation.Nullable final String value) {
      put("bookingFrequency.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams bookingFrequencyNotEquals(@jakarta.annotation.Nullable final String value) {
      put("bookingFrequency.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams bookingFrequencySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("bookingFrequency.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams bookingFrequencyIn(@jakarta.annotation.Nullable final List<String> value) {
      put("bookingFrequency.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams bookingFrequencyNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("bookingFrequency.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams loyaltyPointsGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("loyaltyPoints.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams loyaltyPointsLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("loyaltyPoints.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams loyaltyPointsGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("loyaltyPoints.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams loyaltyPointsLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("loyaltyPoints.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams loyaltyPointsEquals(@jakarta.annotation.Nullable final Integer value) {
      put("loyaltyPoints.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams loyaltyPointsNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("loyaltyPoints.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams loyaltyPointsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("loyaltyPoints.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams loyaltyPointsIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("loyaltyPoints.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams loyaltyPointsNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("loyaltyPoints.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams mostFrequentOriginContains(@jakarta.annotation.Nullable final String value) {
      put("mostFrequentOrigin.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams mostFrequentOriginDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("mostFrequentOrigin.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams mostFrequentOriginEquals(@jakarta.annotation.Nullable final String value) {
      put("mostFrequentOrigin.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams mostFrequentOriginNotEquals(@jakarta.annotation.Nullable final String value) {
      put("mostFrequentOrigin.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams mostFrequentOriginSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("mostFrequentOrigin.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams mostFrequentOriginIn(@jakarta.annotation.Nullable final List<String> value) {
      put("mostFrequentOrigin.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams mostFrequentOriginNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("mostFrequentOrigin.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams mostFrequentDestinationContains(@jakarta.annotation.Nullable final String value) {
      put("mostFrequentDestination.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams mostFrequentDestinationDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("mostFrequentDestination.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams mostFrequentDestinationEquals(@jakarta.annotation.Nullable final String value) {
      put("mostFrequentDestination.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams mostFrequentDestinationNotEquals(@jakarta.annotation.Nullable final String value) {
      put("mostFrequentDestination.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams mostFrequentDestinationSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("mostFrequentDestination.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams mostFrequentDestinationIn(@jakarta.annotation.Nullable final List<String> value) {
      put("mostFrequentDestination.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams mostFrequentDestinationNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("mostFrequentDestination.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDistanceGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averageTripDistance.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDistanceLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averageTripDistance.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDistanceGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averageTripDistance.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDistanceLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averageTripDistance.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDistanceEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averageTripDistance.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDistanceNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averageTripDistance.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDistanceSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("averageTripDistance.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDistanceIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("averageTripDistance.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams averageTripDistanceNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("averageTripDistance.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams peakTravelTimeContains(@jakarta.annotation.Nullable final String value) {
      put("peakTravelTime.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams peakTravelTimeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("peakTravelTime.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams peakTravelTimeEquals(@jakarta.annotation.Nullable final String value) {
      put("peakTravelTime.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams peakTravelTimeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("peakTravelTime.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams peakTravelTimeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("peakTravelTime.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams peakTravelTimeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("peakTravelTime.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams peakTravelTimeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("peakTravelTime.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams weekendTripsGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("weekendTrips.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams weekendTripsLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("weekendTrips.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams weekendTripsGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("weekendTrips.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams weekendTripsLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("weekendTrips.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams weekendTripsEquals(@jakarta.annotation.Nullable final Integer value) {
      put("weekendTrips.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams weekendTripsNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("weekendTrips.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams weekendTripsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("weekendTrips.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams weekendTripsIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("weekendTrips.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams weekendTripsNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("weekendTrips.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams holidayTripsGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("holidayTrips.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams holidayTripsLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("holidayTrips.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams holidayTripsGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("holidayTrips.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams holidayTripsLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("holidayTrips.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams holidayTripsEquals(@jakarta.annotation.Nullable final Integer value) {
      put("holidayTrips.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams holidayTripsNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("holidayTrips.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams holidayTripsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("holidayTrips.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams holidayTripsIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("holidayTrips.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams holidayTripsNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("holidayTrips.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams cancelledTripsGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("cancelledTrips.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams cancelledTripsLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("cancelledTrips.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams cancelledTripsGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("cancelledTrips.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams cancelledTripsLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("cancelledTrips.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams cancelledTripsEquals(@jakarta.annotation.Nullable final Integer value) {
      put("cancelledTrips.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams cancelledTripsNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("cancelledTrips.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams cancelledTripsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("cancelledTrips.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams cancelledTripsIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("cancelledTrips.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams cancelledTripsNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("cancelledTrips.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams onTimePerformanceRateGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("onTimePerformanceRate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams onTimePerformanceRateLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("onTimePerformanceRate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams onTimePerformanceRateGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("onTimePerformanceRate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams onTimePerformanceRateLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("onTimePerformanceRate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams onTimePerformanceRateEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("onTimePerformanceRate.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams onTimePerformanceRateNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("onTimePerformanceRate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams onTimePerformanceRateSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("onTimePerformanceRate.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams onTimePerformanceRateIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("onTimePerformanceRate.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams onTimePerformanceRateNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("onTimePerformanceRate.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams preferredSeatTypesContains(@jakarta.annotation.Nullable final String value) {
      put("preferredSeatTypes.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams preferredSeatTypesDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("preferredSeatTypes.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams preferredSeatTypesEquals(@jakarta.annotation.Nullable final String value) {
      put("preferredSeatTypes.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams preferredSeatTypesNotEquals(@jakarta.annotation.Nullable final String value) {
      put("preferredSeatTypes.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams preferredSeatTypesSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("preferredSeatTypes.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams preferredSeatTypesIn(@jakarta.annotation.Nullable final List<String> value) {
      put("preferredSeatTypes.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams preferredSeatTypesNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("preferredSeatTypes.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams monthlyTripCountGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("monthlyTripCount.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams monthlyTripCountLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("monthlyTripCount.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams monthlyTripCountGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("monthlyTripCount.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams monthlyTripCountLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("monthlyTripCount.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams monthlyTripCountEquals(@jakarta.annotation.Nullable final Integer value) {
      put("monthlyTripCount.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams monthlyTripCountNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("monthlyTripCount.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams monthlyTripCountSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("monthlyTripCount.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams monthlyTripCountIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("monthlyTripCount.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams monthlyTripCountNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("monthlyTripCount.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams userIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("userId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams userIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("userId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams userIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("userId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams userIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("userId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams userIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("userId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams userIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("userId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams userIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("userId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserStatisticsQueryParams userIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("userId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams userIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("userId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserStatisticsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param userStatisticsDTO  (required)
   * @return UserStatisticsDTO
   */
  @RequestLine("POST /api/user-statistics")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  UserStatisticsDTO createUserStatistics(@jakarta.annotation.Nonnull UserStatisticsDTO userStatisticsDTO);

  /**
   * 
   * Similar to <code>createUserStatistics</code> but it also returns the http response headers .
   * 
   * @param userStatisticsDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/user-statistics")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<UserStatisticsDTO> createUserStatisticsWithHttpInfo(@jakarta.annotation.Nonnull UserStatisticsDTO userStatisticsDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/user-statistics/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteUserStatistics(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deleteUserStatistics</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/user-statistics/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteUserStatisticsWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



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
   * @param totalTripsGreaterThan  (optional)
   * @param totalTripsLessThan  (optional)
   * @param totalTripsGreaterThanOrEqual  (optional)
   * @param totalTripsLessThanOrEqual  (optional)
   * @param totalTripsEquals  (optional)
   * @param totalTripsNotEquals  (optional)
   * @param totalTripsSpecified  (optional)
   * @param totalTripsIn  (optional)
   * @param totalTripsNotIn  (optional)
   * @param totalSpentGreaterThan  (optional)
   * @param totalSpentLessThan  (optional)
   * @param totalSpentGreaterThanOrEqual  (optional)
   * @param totalSpentLessThanOrEqual  (optional)
   * @param totalSpentEquals  (optional)
   * @param totalSpentNotEquals  (optional)
   * @param totalSpentSpecified  (optional)
   * @param totalSpentIn  (optional)
   * @param totalSpentNotIn  (optional)
   * @param favoriteRoutesContains  (optional)
   * @param favoriteRoutesDoesNotContain  (optional)
   * @param favoriteRoutesEquals  (optional)
   * @param favoriteRoutesNotEquals  (optional)
   * @param favoriteRoutesSpecified  (optional)
   * @param favoriteRoutesIn  (optional)
   * @param favoriteRoutesNotIn  (optional)
   * @param preferredVehicleTypesContains  (optional)
   * @param preferredVehicleTypesDoesNotContain  (optional)
   * @param preferredVehicleTypesEquals  (optional)
   * @param preferredVehicleTypesNotEquals  (optional)
   * @param preferredVehicleTypesSpecified  (optional)
   * @param preferredVehicleTypesIn  (optional)
   * @param preferredVehicleTypesNotIn  (optional)
   * @param averageTripDurationGreaterThan  (optional)
   * @param averageTripDurationLessThan  (optional)
   * @param averageTripDurationGreaterThanOrEqual  (optional)
   * @param averageTripDurationLessThanOrEqual  (optional)
   * @param averageTripDurationEquals  (optional)
   * @param averageTripDurationNotEquals  (optional)
   * @param averageTripDurationSpecified  (optional)
   * @param averageTripDurationIn  (optional)
   * @param averageTripDurationNotIn  (optional)
   * @param lastTravelDateGreaterThan  (optional)
   * @param lastTravelDateLessThan  (optional)
   * @param lastTravelDateGreaterThanOrEqual  (optional)
   * @param lastTravelDateLessThanOrEqual  (optional)
   * @param lastTravelDateEquals  (optional)
   * @param lastTravelDateNotEquals  (optional)
   * @param lastTravelDateSpecified  (optional)
   * @param lastTravelDateIn  (optional)
   * @param lastTravelDateNotIn  (optional)
   * @param bookingFrequencyContains  (optional)
   * @param bookingFrequencyDoesNotContain  (optional)
   * @param bookingFrequencyEquals  (optional)
   * @param bookingFrequencyNotEquals  (optional)
   * @param bookingFrequencySpecified  (optional)
   * @param bookingFrequencyIn  (optional)
   * @param bookingFrequencyNotIn  (optional)
   * @param loyaltyPointsGreaterThan  (optional)
   * @param loyaltyPointsLessThan  (optional)
   * @param loyaltyPointsGreaterThanOrEqual  (optional)
   * @param loyaltyPointsLessThanOrEqual  (optional)
   * @param loyaltyPointsEquals  (optional)
   * @param loyaltyPointsNotEquals  (optional)
   * @param loyaltyPointsSpecified  (optional)
   * @param loyaltyPointsIn  (optional)
   * @param loyaltyPointsNotIn  (optional)
   * @param mostFrequentOriginContains  (optional)
   * @param mostFrequentOriginDoesNotContain  (optional)
   * @param mostFrequentOriginEquals  (optional)
   * @param mostFrequentOriginNotEquals  (optional)
   * @param mostFrequentOriginSpecified  (optional)
   * @param mostFrequentOriginIn  (optional)
   * @param mostFrequentOriginNotIn  (optional)
   * @param mostFrequentDestinationContains  (optional)
   * @param mostFrequentDestinationDoesNotContain  (optional)
   * @param mostFrequentDestinationEquals  (optional)
   * @param mostFrequentDestinationNotEquals  (optional)
   * @param mostFrequentDestinationSpecified  (optional)
   * @param mostFrequentDestinationIn  (optional)
   * @param mostFrequentDestinationNotIn  (optional)
   * @param averageTripDistanceGreaterThan  (optional)
   * @param averageTripDistanceLessThan  (optional)
   * @param averageTripDistanceGreaterThanOrEqual  (optional)
   * @param averageTripDistanceLessThanOrEqual  (optional)
   * @param averageTripDistanceEquals  (optional)
   * @param averageTripDistanceNotEquals  (optional)
   * @param averageTripDistanceSpecified  (optional)
   * @param averageTripDistanceIn  (optional)
   * @param averageTripDistanceNotIn  (optional)
   * @param peakTravelTimeContains  (optional)
   * @param peakTravelTimeDoesNotContain  (optional)
   * @param peakTravelTimeEquals  (optional)
   * @param peakTravelTimeNotEquals  (optional)
   * @param peakTravelTimeSpecified  (optional)
   * @param peakTravelTimeIn  (optional)
   * @param peakTravelTimeNotIn  (optional)
   * @param weekendTripsGreaterThan  (optional)
   * @param weekendTripsLessThan  (optional)
   * @param weekendTripsGreaterThanOrEqual  (optional)
   * @param weekendTripsLessThanOrEqual  (optional)
   * @param weekendTripsEquals  (optional)
   * @param weekendTripsNotEquals  (optional)
   * @param weekendTripsSpecified  (optional)
   * @param weekendTripsIn  (optional)
   * @param weekendTripsNotIn  (optional)
   * @param holidayTripsGreaterThan  (optional)
   * @param holidayTripsLessThan  (optional)
   * @param holidayTripsGreaterThanOrEqual  (optional)
   * @param holidayTripsLessThanOrEqual  (optional)
   * @param holidayTripsEquals  (optional)
   * @param holidayTripsNotEquals  (optional)
   * @param holidayTripsSpecified  (optional)
   * @param holidayTripsIn  (optional)
   * @param holidayTripsNotIn  (optional)
   * @param cancelledTripsGreaterThan  (optional)
   * @param cancelledTripsLessThan  (optional)
   * @param cancelledTripsGreaterThanOrEqual  (optional)
   * @param cancelledTripsLessThanOrEqual  (optional)
   * @param cancelledTripsEquals  (optional)
   * @param cancelledTripsNotEquals  (optional)
   * @param cancelledTripsSpecified  (optional)
   * @param cancelledTripsIn  (optional)
   * @param cancelledTripsNotIn  (optional)
   * @param onTimePerformanceRateGreaterThan  (optional)
   * @param onTimePerformanceRateLessThan  (optional)
   * @param onTimePerformanceRateGreaterThanOrEqual  (optional)
   * @param onTimePerformanceRateLessThanOrEqual  (optional)
   * @param onTimePerformanceRateEquals  (optional)
   * @param onTimePerformanceRateNotEquals  (optional)
   * @param onTimePerformanceRateSpecified  (optional)
   * @param onTimePerformanceRateIn  (optional)
   * @param onTimePerformanceRateNotIn  (optional)
   * @param preferredSeatTypesContains  (optional)
   * @param preferredSeatTypesDoesNotContain  (optional)
   * @param preferredSeatTypesEquals  (optional)
   * @param preferredSeatTypesNotEquals  (optional)
   * @param preferredSeatTypesSpecified  (optional)
   * @param preferredSeatTypesIn  (optional)
   * @param preferredSeatTypesNotIn  (optional)
   * @param monthlyTripCountGreaterThan  (optional)
   * @param monthlyTripCountLessThan  (optional)
   * @param monthlyTripCountGreaterThanOrEqual  (optional)
   * @param monthlyTripCountLessThanOrEqual  (optional)
   * @param monthlyTripCountEquals  (optional)
   * @param monthlyTripCountNotEquals  (optional)
   * @param monthlyTripCountSpecified  (optional)
   * @param monthlyTripCountIn  (optional)
   * @param monthlyTripCountNotIn  (optional)
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
   * @param userIdGreaterThan  (optional)
   * @param userIdLessThan  (optional)
   * @param userIdGreaterThanOrEqual  (optional)
   * @param userIdLessThanOrEqual  (optional)
   * @param userIdEquals  (optional)
   * @param userIdNotEquals  (optional)
   * @param userIdSpecified  (optional)
   * @param userIdIn  (optional)
   * @param userIdNotIn  (optional)
   * @param distinct  (optional)
   * @param page Zero-based page index (0..N) (optional, default to 0)
   * @param size The size of the page to be returned (optional, default to 20)
   * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return List&lt;UserStatisticsDTO&gt;
   */
  @RequestLine("GET /api/user-statistics?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&totalTrips.greaterThan={totalTripsGreaterThan}&totalTrips.lessThan={totalTripsLessThan}&totalTrips.greaterThanOrEqual={totalTripsGreaterThanOrEqual}&totalTrips.lessThanOrEqual={totalTripsLessThanOrEqual}&totalTrips.equals={totalTripsEquals}&totalTrips.notEquals={totalTripsNotEquals}&totalTrips.specified={totalTripsSpecified}&totalTrips.in={totalTripsIn}&totalTrips.notIn={totalTripsNotIn}&totalSpent.greaterThan={totalSpentGreaterThan}&totalSpent.lessThan={totalSpentLessThan}&totalSpent.greaterThanOrEqual={totalSpentGreaterThanOrEqual}&totalSpent.lessThanOrEqual={totalSpentLessThanOrEqual}&totalSpent.equals={totalSpentEquals}&totalSpent.notEquals={totalSpentNotEquals}&totalSpent.specified={totalSpentSpecified}&totalSpent.in={totalSpentIn}&totalSpent.notIn={totalSpentNotIn}&favoriteRoutes.contains={favoriteRoutesContains}&favoriteRoutes.doesNotContain={favoriteRoutesDoesNotContain}&favoriteRoutes.equals={favoriteRoutesEquals}&favoriteRoutes.notEquals={favoriteRoutesNotEquals}&favoriteRoutes.specified={favoriteRoutesSpecified}&favoriteRoutes.in={favoriteRoutesIn}&favoriteRoutes.notIn={favoriteRoutesNotIn}&preferredVehicleTypes.contains={preferredVehicleTypesContains}&preferredVehicleTypes.doesNotContain={preferredVehicleTypesDoesNotContain}&preferredVehicleTypes.equals={preferredVehicleTypesEquals}&preferredVehicleTypes.notEquals={preferredVehicleTypesNotEquals}&preferredVehicleTypes.specified={preferredVehicleTypesSpecified}&preferredVehicleTypes.in={preferredVehicleTypesIn}&preferredVehicleTypes.notIn={preferredVehicleTypesNotIn}&averageTripDuration.greaterThan={averageTripDurationGreaterThan}&averageTripDuration.lessThan={averageTripDurationLessThan}&averageTripDuration.greaterThanOrEqual={averageTripDurationGreaterThanOrEqual}&averageTripDuration.lessThanOrEqual={averageTripDurationLessThanOrEqual}&averageTripDuration.equals={averageTripDurationEquals}&averageTripDuration.notEquals={averageTripDurationNotEquals}&averageTripDuration.specified={averageTripDurationSpecified}&averageTripDuration.in={averageTripDurationIn}&averageTripDuration.notIn={averageTripDurationNotIn}&lastTravelDate.greaterThan={lastTravelDateGreaterThan}&lastTravelDate.lessThan={lastTravelDateLessThan}&lastTravelDate.greaterThanOrEqual={lastTravelDateGreaterThanOrEqual}&lastTravelDate.lessThanOrEqual={lastTravelDateLessThanOrEqual}&lastTravelDate.equals={lastTravelDateEquals}&lastTravelDate.notEquals={lastTravelDateNotEquals}&lastTravelDate.specified={lastTravelDateSpecified}&lastTravelDate.in={lastTravelDateIn}&lastTravelDate.notIn={lastTravelDateNotIn}&bookingFrequency.contains={bookingFrequencyContains}&bookingFrequency.doesNotContain={bookingFrequencyDoesNotContain}&bookingFrequency.equals={bookingFrequencyEquals}&bookingFrequency.notEquals={bookingFrequencyNotEquals}&bookingFrequency.specified={bookingFrequencySpecified}&bookingFrequency.in={bookingFrequencyIn}&bookingFrequency.notIn={bookingFrequencyNotIn}&loyaltyPoints.greaterThan={loyaltyPointsGreaterThan}&loyaltyPoints.lessThan={loyaltyPointsLessThan}&loyaltyPoints.greaterThanOrEqual={loyaltyPointsGreaterThanOrEqual}&loyaltyPoints.lessThanOrEqual={loyaltyPointsLessThanOrEqual}&loyaltyPoints.equals={loyaltyPointsEquals}&loyaltyPoints.notEquals={loyaltyPointsNotEquals}&loyaltyPoints.specified={loyaltyPointsSpecified}&loyaltyPoints.in={loyaltyPointsIn}&loyaltyPoints.notIn={loyaltyPointsNotIn}&mostFrequentOrigin.contains={mostFrequentOriginContains}&mostFrequentOrigin.doesNotContain={mostFrequentOriginDoesNotContain}&mostFrequentOrigin.equals={mostFrequentOriginEquals}&mostFrequentOrigin.notEquals={mostFrequentOriginNotEquals}&mostFrequentOrigin.specified={mostFrequentOriginSpecified}&mostFrequentOrigin.in={mostFrequentOriginIn}&mostFrequentOrigin.notIn={mostFrequentOriginNotIn}&mostFrequentDestination.contains={mostFrequentDestinationContains}&mostFrequentDestination.doesNotContain={mostFrequentDestinationDoesNotContain}&mostFrequentDestination.equals={mostFrequentDestinationEquals}&mostFrequentDestination.notEquals={mostFrequentDestinationNotEquals}&mostFrequentDestination.specified={mostFrequentDestinationSpecified}&mostFrequentDestination.in={mostFrequentDestinationIn}&mostFrequentDestination.notIn={mostFrequentDestinationNotIn}&averageTripDistance.greaterThan={averageTripDistanceGreaterThan}&averageTripDistance.lessThan={averageTripDistanceLessThan}&averageTripDistance.greaterThanOrEqual={averageTripDistanceGreaterThanOrEqual}&averageTripDistance.lessThanOrEqual={averageTripDistanceLessThanOrEqual}&averageTripDistance.equals={averageTripDistanceEquals}&averageTripDistance.notEquals={averageTripDistanceNotEquals}&averageTripDistance.specified={averageTripDistanceSpecified}&averageTripDistance.in={averageTripDistanceIn}&averageTripDistance.notIn={averageTripDistanceNotIn}&peakTravelTime.contains={peakTravelTimeContains}&peakTravelTime.doesNotContain={peakTravelTimeDoesNotContain}&peakTravelTime.equals={peakTravelTimeEquals}&peakTravelTime.notEquals={peakTravelTimeNotEquals}&peakTravelTime.specified={peakTravelTimeSpecified}&peakTravelTime.in={peakTravelTimeIn}&peakTravelTime.notIn={peakTravelTimeNotIn}&weekendTrips.greaterThan={weekendTripsGreaterThan}&weekendTrips.lessThan={weekendTripsLessThan}&weekendTrips.greaterThanOrEqual={weekendTripsGreaterThanOrEqual}&weekendTrips.lessThanOrEqual={weekendTripsLessThanOrEqual}&weekendTrips.equals={weekendTripsEquals}&weekendTrips.notEquals={weekendTripsNotEquals}&weekendTrips.specified={weekendTripsSpecified}&weekendTrips.in={weekendTripsIn}&weekendTrips.notIn={weekendTripsNotIn}&holidayTrips.greaterThan={holidayTripsGreaterThan}&holidayTrips.lessThan={holidayTripsLessThan}&holidayTrips.greaterThanOrEqual={holidayTripsGreaterThanOrEqual}&holidayTrips.lessThanOrEqual={holidayTripsLessThanOrEqual}&holidayTrips.equals={holidayTripsEquals}&holidayTrips.notEquals={holidayTripsNotEquals}&holidayTrips.specified={holidayTripsSpecified}&holidayTrips.in={holidayTripsIn}&holidayTrips.notIn={holidayTripsNotIn}&cancelledTrips.greaterThan={cancelledTripsGreaterThan}&cancelledTrips.lessThan={cancelledTripsLessThan}&cancelledTrips.greaterThanOrEqual={cancelledTripsGreaterThanOrEqual}&cancelledTrips.lessThanOrEqual={cancelledTripsLessThanOrEqual}&cancelledTrips.equals={cancelledTripsEquals}&cancelledTrips.notEquals={cancelledTripsNotEquals}&cancelledTrips.specified={cancelledTripsSpecified}&cancelledTrips.in={cancelledTripsIn}&cancelledTrips.notIn={cancelledTripsNotIn}&onTimePerformanceRate.greaterThan={onTimePerformanceRateGreaterThan}&onTimePerformanceRate.lessThan={onTimePerformanceRateLessThan}&onTimePerformanceRate.greaterThanOrEqual={onTimePerformanceRateGreaterThanOrEqual}&onTimePerformanceRate.lessThanOrEqual={onTimePerformanceRateLessThanOrEqual}&onTimePerformanceRate.equals={onTimePerformanceRateEquals}&onTimePerformanceRate.notEquals={onTimePerformanceRateNotEquals}&onTimePerformanceRate.specified={onTimePerformanceRateSpecified}&onTimePerformanceRate.in={onTimePerformanceRateIn}&onTimePerformanceRate.notIn={onTimePerformanceRateNotIn}&preferredSeatTypes.contains={preferredSeatTypesContains}&preferredSeatTypes.doesNotContain={preferredSeatTypesDoesNotContain}&preferredSeatTypes.equals={preferredSeatTypesEquals}&preferredSeatTypes.notEquals={preferredSeatTypesNotEquals}&preferredSeatTypes.specified={preferredSeatTypesSpecified}&preferredSeatTypes.in={preferredSeatTypesIn}&preferredSeatTypes.notIn={preferredSeatTypesNotIn}&monthlyTripCount.greaterThan={monthlyTripCountGreaterThan}&monthlyTripCount.lessThan={monthlyTripCountLessThan}&monthlyTripCount.greaterThanOrEqual={monthlyTripCountGreaterThanOrEqual}&monthlyTripCount.lessThanOrEqual={monthlyTripCountLessThanOrEqual}&monthlyTripCount.equals={monthlyTripCountEquals}&monthlyTripCount.notEquals={monthlyTripCountNotEquals}&monthlyTripCount.specified={monthlyTripCountSpecified}&monthlyTripCount.in={monthlyTripCountIn}&monthlyTripCount.notIn={monthlyTripCountNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  List<UserStatisticsDTO> getAllUserStatistics(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("totalTripsGreaterThan") @jakarta.annotation.Nullable Integer totalTripsGreaterThan, @Param("totalTripsLessThan") @jakarta.annotation.Nullable Integer totalTripsLessThan, @Param("totalTripsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer totalTripsGreaterThanOrEqual, @Param("totalTripsLessThanOrEqual") @jakarta.annotation.Nullable Integer totalTripsLessThanOrEqual, @Param("totalTripsEquals") @jakarta.annotation.Nullable Integer totalTripsEquals, @Param("totalTripsNotEquals") @jakarta.annotation.Nullable Integer totalTripsNotEquals, @Param("totalTripsSpecified") @jakarta.annotation.Nullable Boolean totalTripsSpecified, @Param("totalTripsIn") @jakarta.annotation.Nullable List<Integer> totalTripsIn, @Param("totalTripsNotIn") @jakarta.annotation.Nullable List<Integer> totalTripsNotIn, @Param("totalSpentGreaterThan") @jakarta.annotation.Nullable BigDecimal totalSpentGreaterThan, @Param("totalSpentLessThan") @jakarta.annotation.Nullable BigDecimal totalSpentLessThan, @Param("totalSpentGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal totalSpentGreaterThanOrEqual, @Param("totalSpentLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal totalSpentLessThanOrEqual, @Param("totalSpentEquals") @jakarta.annotation.Nullable BigDecimal totalSpentEquals, @Param("totalSpentNotEquals") @jakarta.annotation.Nullable BigDecimal totalSpentNotEquals, @Param("totalSpentSpecified") @jakarta.annotation.Nullable Boolean totalSpentSpecified, @Param("totalSpentIn") @jakarta.annotation.Nullable List<BigDecimal> totalSpentIn, @Param("totalSpentNotIn") @jakarta.annotation.Nullable List<BigDecimal> totalSpentNotIn, @Param("favoriteRoutesContains") @jakarta.annotation.Nullable String favoriteRoutesContains, @Param("favoriteRoutesDoesNotContain") @jakarta.annotation.Nullable String favoriteRoutesDoesNotContain, @Param("favoriteRoutesEquals") @jakarta.annotation.Nullable String favoriteRoutesEquals, @Param("favoriteRoutesNotEquals") @jakarta.annotation.Nullable String favoriteRoutesNotEquals, @Param("favoriteRoutesSpecified") @jakarta.annotation.Nullable Boolean favoriteRoutesSpecified, @Param("favoriteRoutesIn") @jakarta.annotation.Nullable List<String> favoriteRoutesIn, @Param("favoriteRoutesNotIn") @jakarta.annotation.Nullable List<String> favoriteRoutesNotIn, @Param("preferredVehicleTypesContains") @jakarta.annotation.Nullable String preferredVehicleTypesContains, @Param("preferredVehicleTypesDoesNotContain") @jakarta.annotation.Nullable String preferredVehicleTypesDoesNotContain, @Param("preferredVehicleTypesEquals") @jakarta.annotation.Nullable String preferredVehicleTypesEquals, @Param("preferredVehicleTypesNotEquals") @jakarta.annotation.Nullable String preferredVehicleTypesNotEquals, @Param("preferredVehicleTypesSpecified") @jakarta.annotation.Nullable Boolean preferredVehicleTypesSpecified, @Param("preferredVehicleTypesIn") @jakarta.annotation.Nullable List<String> preferredVehicleTypesIn, @Param("preferredVehicleTypesNotIn") @jakarta.annotation.Nullable List<String> preferredVehicleTypesNotIn, @Param("averageTripDurationGreaterThan") @jakarta.annotation.Nullable Integer averageTripDurationGreaterThan, @Param("averageTripDurationLessThan") @jakarta.annotation.Nullable Integer averageTripDurationLessThan, @Param("averageTripDurationGreaterThanOrEqual") @jakarta.annotation.Nullable Integer averageTripDurationGreaterThanOrEqual, @Param("averageTripDurationLessThanOrEqual") @jakarta.annotation.Nullable Integer averageTripDurationLessThanOrEqual, @Param("averageTripDurationEquals") @jakarta.annotation.Nullable Integer averageTripDurationEquals, @Param("averageTripDurationNotEquals") @jakarta.annotation.Nullable Integer averageTripDurationNotEquals, @Param("averageTripDurationSpecified") @jakarta.annotation.Nullable Boolean averageTripDurationSpecified, @Param("averageTripDurationIn") @jakarta.annotation.Nullable List<Integer> averageTripDurationIn, @Param("averageTripDurationNotIn") @jakarta.annotation.Nullable List<Integer> averageTripDurationNotIn, @Param("lastTravelDateGreaterThan") @jakarta.annotation.Nullable LocalDate lastTravelDateGreaterThan, @Param("lastTravelDateLessThan") @jakarta.annotation.Nullable LocalDate lastTravelDateLessThan, @Param("lastTravelDateGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate lastTravelDateGreaterThanOrEqual, @Param("lastTravelDateLessThanOrEqual") @jakarta.annotation.Nullable LocalDate lastTravelDateLessThanOrEqual, @Param("lastTravelDateEquals") @jakarta.annotation.Nullable LocalDate lastTravelDateEquals, @Param("lastTravelDateNotEquals") @jakarta.annotation.Nullable LocalDate lastTravelDateNotEquals, @Param("lastTravelDateSpecified") @jakarta.annotation.Nullable Boolean lastTravelDateSpecified, @Param("lastTravelDateIn") @jakarta.annotation.Nullable List<LocalDate> lastTravelDateIn, @Param("lastTravelDateNotIn") @jakarta.annotation.Nullable List<LocalDate> lastTravelDateNotIn, @Param("bookingFrequencyContains") @jakarta.annotation.Nullable String bookingFrequencyContains, @Param("bookingFrequencyDoesNotContain") @jakarta.annotation.Nullable String bookingFrequencyDoesNotContain, @Param("bookingFrequencyEquals") @jakarta.annotation.Nullable String bookingFrequencyEquals, @Param("bookingFrequencyNotEquals") @jakarta.annotation.Nullable String bookingFrequencyNotEquals, @Param("bookingFrequencySpecified") @jakarta.annotation.Nullable Boolean bookingFrequencySpecified, @Param("bookingFrequencyIn") @jakarta.annotation.Nullable List<String> bookingFrequencyIn, @Param("bookingFrequencyNotIn") @jakarta.annotation.Nullable List<String> bookingFrequencyNotIn, @Param("loyaltyPointsGreaterThan") @jakarta.annotation.Nullable Integer loyaltyPointsGreaterThan, @Param("loyaltyPointsLessThan") @jakarta.annotation.Nullable Integer loyaltyPointsLessThan, @Param("loyaltyPointsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer loyaltyPointsGreaterThanOrEqual, @Param("loyaltyPointsLessThanOrEqual") @jakarta.annotation.Nullable Integer loyaltyPointsLessThanOrEqual, @Param("loyaltyPointsEquals") @jakarta.annotation.Nullable Integer loyaltyPointsEquals, @Param("loyaltyPointsNotEquals") @jakarta.annotation.Nullable Integer loyaltyPointsNotEquals, @Param("loyaltyPointsSpecified") @jakarta.annotation.Nullable Boolean loyaltyPointsSpecified, @Param("loyaltyPointsIn") @jakarta.annotation.Nullable List<Integer> loyaltyPointsIn, @Param("loyaltyPointsNotIn") @jakarta.annotation.Nullable List<Integer> loyaltyPointsNotIn, @Param("mostFrequentOriginContains") @jakarta.annotation.Nullable String mostFrequentOriginContains, @Param("mostFrequentOriginDoesNotContain") @jakarta.annotation.Nullable String mostFrequentOriginDoesNotContain, @Param("mostFrequentOriginEquals") @jakarta.annotation.Nullable String mostFrequentOriginEquals, @Param("mostFrequentOriginNotEquals") @jakarta.annotation.Nullable String mostFrequentOriginNotEquals, @Param("mostFrequentOriginSpecified") @jakarta.annotation.Nullable Boolean mostFrequentOriginSpecified, @Param("mostFrequentOriginIn") @jakarta.annotation.Nullable List<String> mostFrequentOriginIn, @Param("mostFrequentOriginNotIn") @jakarta.annotation.Nullable List<String> mostFrequentOriginNotIn, @Param("mostFrequentDestinationContains") @jakarta.annotation.Nullable String mostFrequentDestinationContains, @Param("mostFrequentDestinationDoesNotContain") @jakarta.annotation.Nullable String mostFrequentDestinationDoesNotContain, @Param("mostFrequentDestinationEquals") @jakarta.annotation.Nullable String mostFrequentDestinationEquals, @Param("mostFrequentDestinationNotEquals") @jakarta.annotation.Nullable String mostFrequentDestinationNotEquals, @Param("mostFrequentDestinationSpecified") @jakarta.annotation.Nullable Boolean mostFrequentDestinationSpecified, @Param("mostFrequentDestinationIn") @jakarta.annotation.Nullable List<String> mostFrequentDestinationIn, @Param("mostFrequentDestinationNotIn") @jakarta.annotation.Nullable List<String> mostFrequentDestinationNotIn, @Param("averageTripDistanceGreaterThan") @jakarta.annotation.Nullable BigDecimal averageTripDistanceGreaterThan, @Param("averageTripDistanceLessThan") @jakarta.annotation.Nullable BigDecimal averageTripDistanceLessThan, @Param("averageTripDistanceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal averageTripDistanceGreaterThanOrEqual, @Param("averageTripDistanceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal averageTripDistanceLessThanOrEqual, @Param("averageTripDistanceEquals") @jakarta.annotation.Nullable BigDecimal averageTripDistanceEquals, @Param("averageTripDistanceNotEquals") @jakarta.annotation.Nullable BigDecimal averageTripDistanceNotEquals, @Param("averageTripDistanceSpecified") @jakarta.annotation.Nullable Boolean averageTripDistanceSpecified, @Param("averageTripDistanceIn") @jakarta.annotation.Nullable List<BigDecimal> averageTripDistanceIn, @Param("averageTripDistanceNotIn") @jakarta.annotation.Nullable List<BigDecimal> averageTripDistanceNotIn, @Param("peakTravelTimeContains") @jakarta.annotation.Nullable String peakTravelTimeContains, @Param("peakTravelTimeDoesNotContain") @jakarta.annotation.Nullable String peakTravelTimeDoesNotContain, @Param("peakTravelTimeEquals") @jakarta.annotation.Nullable String peakTravelTimeEquals, @Param("peakTravelTimeNotEquals") @jakarta.annotation.Nullable String peakTravelTimeNotEquals, @Param("peakTravelTimeSpecified") @jakarta.annotation.Nullable Boolean peakTravelTimeSpecified, @Param("peakTravelTimeIn") @jakarta.annotation.Nullable List<String> peakTravelTimeIn, @Param("peakTravelTimeNotIn") @jakarta.annotation.Nullable List<String> peakTravelTimeNotIn, @Param("weekendTripsGreaterThan") @jakarta.annotation.Nullable Integer weekendTripsGreaterThan, @Param("weekendTripsLessThan") @jakarta.annotation.Nullable Integer weekendTripsLessThan, @Param("weekendTripsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer weekendTripsGreaterThanOrEqual, @Param("weekendTripsLessThanOrEqual") @jakarta.annotation.Nullable Integer weekendTripsLessThanOrEqual, @Param("weekendTripsEquals") @jakarta.annotation.Nullable Integer weekendTripsEquals, @Param("weekendTripsNotEquals") @jakarta.annotation.Nullable Integer weekendTripsNotEquals, @Param("weekendTripsSpecified") @jakarta.annotation.Nullable Boolean weekendTripsSpecified, @Param("weekendTripsIn") @jakarta.annotation.Nullable List<Integer> weekendTripsIn, @Param("weekendTripsNotIn") @jakarta.annotation.Nullable List<Integer> weekendTripsNotIn, @Param("holidayTripsGreaterThan") @jakarta.annotation.Nullable Integer holidayTripsGreaterThan, @Param("holidayTripsLessThan") @jakarta.annotation.Nullable Integer holidayTripsLessThan, @Param("holidayTripsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer holidayTripsGreaterThanOrEqual, @Param("holidayTripsLessThanOrEqual") @jakarta.annotation.Nullable Integer holidayTripsLessThanOrEqual, @Param("holidayTripsEquals") @jakarta.annotation.Nullable Integer holidayTripsEquals, @Param("holidayTripsNotEquals") @jakarta.annotation.Nullable Integer holidayTripsNotEquals, @Param("holidayTripsSpecified") @jakarta.annotation.Nullable Boolean holidayTripsSpecified, @Param("holidayTripsIn") @jakarta.annotation.Nullable List<Integer> holidayTripsIn, @Param("holidayTripsNotIn") @jakarta.annotation.Nullable List<Integer> holidayTripsNotIn, @Param("cancelledTripsGreaterThan") @jakarta.annotation.Nullable Integer cancelledTripsGreaterThan, @Param("cancelledTripsLessThan") @jakarta.annotation.Nullable Integer cancelledTripsLessThan, @Param("cancelledTripsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer cancelledTripsGreaterThanOrEqual, @Param("cancelledTripsLessThanOrEqual") @jakarta.annotation.Nullable Integer cancelledTripsLessThanOrEqual, @Param("cancelledTripsEquals") @jakarta.annotation.Nullable Integer cancelledTripsEquals, @Param("cancelledTripsNotEquals") @jakarta.annotation.Nullable Integer cancelledTripsNotEquals, @Param("cancelledTripsSpecified") @jakarta.annotation.Nullable Boolean cancelledTripsSpecified, @Param("cancelledTripsIn") @jakarta.annotation.Nullable List<Integer> cancelledTripsIn, @Param("cancelledTripsNotIn") @jakarta.annotation.Nullable List<Integer> cancelledTripsNotIn, @Param("onTimePerformanceRateGreaterThan") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateGreaterThan, @Param("onTimePerformanceRateLessThan") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateLessThan, @Param("onTimePerformanceRateGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateGreaterThanOrEqual, @Param("onTimePerformanceRateLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateLessThanOrEqual, @Param("onTimePerformanceRateEquals") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateEquals, @Param("onTimePerformanceRateNotEquals") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateNotEquals, @Param("onTimePerformanceRateSpecified") @jakarta.annotation.Nullable Boolean onTimePerformanceRateSpecified, @Param("onTimePerformanceRateIn") @jakarta.annotation.Nullable List<BigDecimal> onTimePerformanceRateIn, @Param("onTimePerformanceRateNotIn") @jakarta.annotation.Nullable List<BigDecimal> onTimePerformanceRateNotIn, @Param("preferredSeatTypesContains") @jakarta.annotation.Nullable String preferredSeatTypesContains, @Param("preferredSeatTypesDoesNotContain") @jakarta.annotation.Nullable String preferredSeatTypesDoesNotContain, @Param("preferredSeatTypesEquals") @jakarta.annotation.Nullable String preferredSeatTypesEquals, @Param("preferredSeatTypesNotEquals") @jakarta.annotation.Nullable String preferredSeatTypesNotEquals, @Param("preferredSeatTypesSpecified") @jakarta.annotation.Nullable Boolean preferredSeatTypesSpecified, @Param("preferredSeatTypesIn") @jakarta.annotation.Nullable List<String> preferredSeatTypesIn, @Param("preferredSeatTypesNotIn") @jakarta.annotation.Nullable List<String> preferredSeatTypesNotIn, @Param("monthlyTripCountGreaterThan") @jakarta.annotation.Nullable Integer monthlyTripCountGreaterThan, @Param("monthlyTripCountLessThan") @jakarta.annotation.Nullable Integer monthlyTripCountLessThan, @Param("monthlyTripCountGreaterThanOrEqual") @jakarta.annotation.Nullable Integer monthlyTripCountGreaterThanOrEqual, @Param("monthlyTripCountLessThanOrEqual") @jakarta.annotation.Nullable Integer monthlyTripCountLessThanOrEqual, @Param("monthlyTripCountEquals") @jakarta.annotation.Nullable Integer monthlyTripCountEquals, @Param("monthlyTripCountNotEquals") @jakarta.annotation.Nullable Integer monthlyTripCountNotEquals, @Param("monthlyTripCountSpecified") @jakarta.annotation.Nullable Boolean monthlyTripCountSpecified, @Param("monthlyTripCountIn") @jakarta.annotation.Nullable List<Integer> monthlyTripCountIn, @Param("monthlyTripCountNotIn") @jakarta.annotation.Nullable List<Integer> monthlyTripCountNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("userIdGreaterThan") @jakarta.annotation.Nullable Long userIdGreaterThan, @Param("userIdLessThan") @jakarta.annotation.Nullable Long userIdLessThan, @Param("userIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long userIdGreaterThanOrEqual, @Param("userIdLessThanOrEqual") @jakarta.annotation.Nullable Long userIdLessThanOrEqual, @Param("userIdEquals") @jakarta.annotation.Nullable Long userIdEquals, @Param("userIdNotEquals") @jakarta.annotation.Nullable Long userIdNotEquals, @Param("userIdSpecified") @jakarta.annotation.Nullable Boolean userIdSpecified, @Param("userIdIn") @jakarta.annotation.Nullable List<Long> userIdIn, @Param("userIdNotIn") @jakarta.annotation.Nullable List<Long> userIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);

  /**
   * 
   * Similar to <code>getAllUserStatistics</code> but it also returns the http response headers .
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
   * @param totalTripsGreaterThan  (optional)
   * @param totalTripsLessThan  (optional)
   * @param totalTripsGreaterThanOrEqual  (optional)
   * @param totalTripsLessThanOrEqual  (optional)
   * @param totalTripsEquals  (optional)
   * @param totalTripsNotEquals  (optional)
   * @param totalTripsSpecified  (optional)
   * @param totalTripsIn  (optional)
   * @param totalTripsNotIn  (optional)
   * @param totalSpentGreaterThan  (optional)
   * @param totalSpentLessThan  (optional)
   * @param totalSpentGreaterThanOrEqual  (optional)
   * @param totalSpentLessThanOrEqual  (optional)
   * @param totalSpentEquals  (optional)
   * @param totalSpentNotEquals  (optional)
   * @param totalSpentSpecified  (optional)
   * @param totalSpentIn  (optional)
   * @param totalSpentNotIn  (optional)
   * @param favoriteRoutesContains  (optional)
   * @param favoriteRoutesDoesNotContain  (optional)
   * @param favoriteRoutesEquals  (optional)
   * @param favoriteRoutesNotEquals  (optional)
   * @param favoriteRoutesSpecified  (optional)
   * @param favoriteRoutesIn  (optional)
   * @param favoriteRoutesNotIn  (optional)
   * @param preferredVehicleTypesContains  (optional)
   * @param preferredVehicleTypesDoesNotContain  (optional)
   * @param preferredVehicleTypesEquals  (optional)
   * @param preferredVehicleTypesNotEquals  (optional)
   * @param preferredVehicleTypesSpecified  (optional)
   * @param preferredVehicleTypesIn  (optional)
   * @param preferredVehicleTypesNotIn  (optional)
   * @param averageTripDurationGreaterThan  (optional)
   * @param averageTripDurationLessThan  (optional)
   * @param averageTripDurationGreaterThanOrEqual  (optional)
   * @param averageTripDurationLessThanOrEqual  (optional)
   * @param averageTripDurationEquals  (optional)
   * @param averageTripDurationNotEquals  (optional)
   * @param averageTripDurationSpecified  (optional)
   * @param averageTripDurationIn  (optional)
   * @param averageTripDurationNotIn  (optional)
   * @param lastTravelDateGreaterThan  (optional)
   * @param lastTravelDateLessThan  (optional)
   * @param lastTravelDateGreaterThanOrEqual  (optional)
   * @param lastTravelDateLessThanOrEqual  (optional)
   * @param lastTravelDateEquals  (optional)
   * @param lastTravelDateNotEquals  (optional)
   * @param lastTravelDateSpecified  (optional)
   * @param lastTravelDateIn  (optional)
   * @param lastTravelDateNotIn  (optional)
   * @param bookingFrequencyContains  (optional)
   * @param bookingFrequencyDoesNotContain  (optional)
   * @param bookingFrequencyEquals  (optional)
   * @param bookingFrequencyNotEquals  (optional)
   * @param bookingFrequencySpecified  (optional)
   * @param bookingFrequencyIn  (optional)
   * @param bookingFrequencyNotIn  (optional)
   * @param loyaltyPointsGreaterThan  (optional)
   * @param loyaltyPointsLessThan  (optional)
   * @param loyaltyPointsGreaterThanOrEqual  (optional)
   * @param loyaltyPointsLessThanOrEqual  (optional)
   * @param loyaltyPointsEquals  (optional)
   * @param loyaltyPointsNotEquals  (optional)
   * @param loyaltyPointsSpecified  (optional)
   * @param loyaltyPointsIn  (optional)
   * @param loyaltyPointsNotIn  (optional)
   * @param mostFrequentOriginContains  (optional)
   * @param mostFrequentOriginDoesNotContain  (optional)
   * @param mostFrequentOriginEquals  (optional)
   * @param mostFrequentOriginNotEquals  (optional)
   * @param mostFrequentOriginSpecified  (optional)
   * @param mostFrequentOriginIn  (optional)
   * @param mostFrequentOriginNotIn  (optional)
   * @param mostFrequentDestinationContains  (optional)
   * @param mostFrequentDestinationDoesNotContain  (optional)
   * @param mostFrequentDestinationEquals  (optional)
   * @param mostFrequentDestinationNotEquals  (optional)
   * @param mostFrequentDestinationSpecified  (optional)
   * @param mostFrequentDestinationIn  (optional)
   * @param mostFrequentDestinationNotIn  (optional)
   * @param averageTripDistanceGreaterThan  (optional)
   * @param averageTripDistanceLessThan  (optional)
   * @param averageTripDistanceGreaterThanOrEqual  (optional)
   * @param averageTripDistanceLessThanOrEqual  (optional)
   * @param averageTripDistanceEquals  (optional)
   * @param averageTripDistanceNotEquals  (optional)
   * @param averageTripDistanceSpecified  (optional)
   * @param averageTripDistanceIn  (optional)
   * @param averageTripDistanceNotIn  (optional)
   * @param peakTravelTimeContains  (optional)
   * @param peakTravelTimeDoesNotContain  (optional)
   * @param peakTravelTimeEquals  (optional)
   * @param peakTravelTimeNotEquals  (optional)
   * @param peakTravelTimeSpecified  (optional)
   * @param peakTravelTimeIn  (optional)
   * @param peakTravelTimeNotIn  (optional)
   * @param weekendTripsGreaterThan  (optional)
   * @param weekendTripsLessThan  (optional)
   * @param weekendTripsGreaterThanOrEqual  (optional)
   * @param weekendTripsLessThanOrEqual  (optional)
   * @param weekendTripsEquals  (optional)
   * @param weekendTripsNotEquals  (optional)
   * @param weekendTripsSpecified  (optional)
   * @param weekendTripsIn  (optional)
   * @param weekendTripsNotIn  (optional)
   * @param holidayTripsGreaterThan  (optional)
   * @param holidayTripsLessThan  (optional)
   * @param holidayTripsGreaterThanOrEqual  (optional)
   * @param holidayTripsLessThanOrEqual  (optional)
   * @param holidayTripsEquals  (optional)
   * @param holidayTripsNotEquals  (optional)
   * @param holidayTripsSpecified  (optional)
   * @param holidayTripsIn  (optional)
   * @param holidayTripsNotIn  (optional)
   * @param cancelledTripsGreaterThan  (optional)
   * @param cancelledTripsLessThan  (optional)
   * @param cancelledTripsGreaterThanOrEqual  (optional)
   * @param cancelledTripsLessThanOrEqual  (optional)
   * @param cancelledTripsEquals  (optional)
   * @param cancelledTripsNotEquals  (optional)
   * @param cancelledTripsSpecified  (optional)
   * @param cancelledTripsIn  (optional)
   * @param cancelledTripsNotIn  (optional)
   * @param onTimePerformanceRateGreaterThan  (optional)
   * @param onTimePerformanceRateLessThan  (optional)
   * @param onTimePerformanceRateGreaterThanOrEqual  (optional)
   * @param onTimePerformanceRateLessThanOrEqual  (optional)
   * @param onTimePerformanceRateEquals  (optional)
   * @param onTimePerformanceRateNotEquals  (optional)
   * @param onTimePerformanceRateSpecified  (optional)
   * @param onTimePerformanceRateIn  (optional)
   * @param onTimePerformanceRateNotIn  (optional)
   * @param preferredSeatTypesContains  (optional)
   * @param preferredSeatTypesDoesNotContain  (optional)
   * @param preferredSeatTypesEquals  (optional)
   * @param preferredSeatTypesNotEquals  (optional)
   * @param preferredSeatTypesSpecified  (optional)
   * @param preferredSeatTypesIn  (optional)
   * @param preferredSeatTypesNotIn  (optional)
   * @param monthlyTripCountGreaterThan  (optional)
   * @param monthlyTripCountLessThan  (optional)
   * @param monthlyTripCountGreaterThanOrEqual  (optional)
   * @param monthlyTripCountLessThanOrEqual  (optional)
   * @param monthlyTripCountEquals  (optional)
   * @param monthlyTripCountNotEquals  (optional)
   * @param monthlyTripCountSpecified  (optional)
   * @param monthlyTripCountIn  (optional)
   * @param monthlyTripCountNotIn  (optional)
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
   * @param userIdGreaterThan  (optional)
   * @param userIdLessThan  (optional)
   * @param userIdGreaterThanOrEqual  (optional)
   * @param userIdLessThanOrEqual  (optional)
   * @param userIdEquals  (optional)
   * @param userIdNotEquals  (optional)
   * @param userIdSpecified  (optional)
   * @param userIdIn  (optional)
   * @param userIdNotIn  (optional)
   * @param distinct  (optional)
   * @param page Zero-based page index (0..N) (optional, default to 0)
   * @param size The size of the page to be returned (optional, default to 20)
   * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/user-statistics?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&totalTrips.greaterThan={totalTripsGreaterThan}&totalTrips.lessThan={totalTripsLessThan}&totalTrips.greaterThanOrEqual={totalTripsGreaterThanOrEqual}&totalTrips.lessThanOrEqual={totalTripsLessThanOrEqual}&totalTrips.equals={totalTripsEquals}&totalTrips.notEquals={totalTripsNotEquals}&totalTrips.specified={totalTripsSpecified}&totalTrips.in={totalTripsIn}&totalTrips.notIn={totalTripsNotIn}&totalSpent.greaterThan={totalSpentGreaterThan}&totalSpent.lessThan={totalSpentLessThan}&totalSpent.greaterThanOrEqual={totalSpentGreaterThanOrEqual}&totalSpent.lessThanOrEqual={totalSpentLessThanOrEqual}&totalSpent.equals={totalSpentEquals}&totalSpent.notEquals={totalSpentNotEquals}&totalSpent.specified={totalSpentSpecified}&totalSpent.in={totalSpentIn}&totalSpent.notIn={totalSpentNotIn}&favoriteRoutes.contains={favoriteRoutesContains}&favoriteRoutes.doesNotContain={favoriteRoutesDoesNotContain}&favoriteRoutes.equals={favoriteRoutesEquals}&favoriteRoutes.notEquals={favoriteRoutesNotEquals}&favoriteRoutes.specified={favoriteRoutesSpecified}&favoriteRoutes.in={favoriteRoutesIn}&favoriteRoutes.notIn={favoriteRoutesNotIn}&preferredVehicleTypes.contains={preferredVehicleTypesContains}&preferredVehicleTypes.doesNotContain={preferredVehicleTypesDoesNotContain}&preferredVehicleTypes.equals={preferredVehicleTypesEquals}&preferredVehicleTypes.notEquals={preferredVehicleTypesNotEquals}&preferredVehicleTypes.specified={preferredVehicleTypesSpecified}&preferredVehicleTypes.in={preferredVehicleTypesIn}&preferredVehicleTypes.notIn={preferredVehicleTypesNotIn}&averageTripDuration.greaterThan={averageTripDurationGreaterThan}&averageTripDuration.lessThan={averageTripDurationLessThan}&averageTripDuration.greaterThanOrEqual={averageTripDurationGreaterThanOrEqual}&averageTripDuration.lessThanOrEqual={averageTripDurationLessThanOrEqual}&averageTripDuration.equals={averageTripDurationEquals}&averageTripDuration.notEquals={averageTripDurationNotEquals}&averageTripDuration.specified={averageTripDurationSpecified}&averageTripDuration.in={averageTripDurationIn}&averageTripDuration.notIn={averageTripDurationNotIn}&lastTravelDate.greaterThan={lastTravelDateGreaterThan}&lastTravelDate.lessThan={lastTravelDateLessThan}&lastTravelDate.greaterThanOrEqual={lastTravelDateGreaterThanOrEqual}&lastTravelDate.lessThanOrEqual={lastTravelDateLessThanOrEqual}&lastTravelDate.equals={lastTravelDateEquals}&lastTravelDate.notEquals={lastTravelDateNotEquals}&lastTravelDate.specified={lastTravelDateSpecified}&lastTravelDate.in={lastTravelDateIn}&lastTravelDate.notIn={lastTravelDateNotIn}&bookingFrequency.contains={bookingFrequencyContains}&bookingFrequency.doesNotContain={bookingFrequencyDoesNotContain}&bookingFrequency.equals={bookingFrequencyEquals}&bookingFrequency.notEquals={bookingFrequencyNotEquals}&bookingFrequency.specified={bookingFrequencySpecified}&bookingFrequency.in={bookingFrequencyIn}&bookingFrequency.notIn={bookingFrequencyNotIn}&loyaltyPoints.greaterThan={loyaltyPointsGreaterThan}&loyaltyPoints.lessThan={loyaltyPointsLessThan}&loyaltyPoints.greaterThanOrEqual={loyaltyPointsGreaterThanOrEqual}&loyaltyPoints.lessThanOrEqual={loyaltyPointsLessThanOrEqual}&loyaltyPoints.equals={loyaltyPointsEquals}&loyaltyPoints.notEquals={loyaltyPointsNotEquals}&loyaltyPoints.specified={loyaltyPointsSpecified}&loyaltyPoints.in={loyaltyPointsIn}&loyaltyPoints.notIn={loyaltyPointsNotIn}&mostFrequentOrigin.contains={mostFrequentOriginContains}&mostFrequentOrigin.doesNotContain={mostFrequentOriginDoesNotContain}&mostFrequentOrigin.equals={mostFrequentOriginEquals}&mostFrequentOrigin.notEquals={mostFrequentOriginNotEquals}&mostFrequentOrigin.specified={mostFrequentOriginSpecified}&mostFrequentOrigin.in={mostFrequentOriginIn}&mostFrequentOrigin.notIn={mostFrequentOriginNotIn}&mostFrequentDestination.contains={mostFrequentDestinationContains}&mostFrequentDestination.doesNotContain={mostFrequentDestinationDoesNotContain}&mostFrequentDestination.equals={mostFrequentDestinationEquals}&mostFrequentDestination.notEquals={mostFrequentDestinationNotEquals}&mostFrequentDestination.specified={mostFrequentDestinationSpecified}&mostFrequentDestination.in={mostFrequentDestinationIn}&mostFrequentDestination.notIn={mostFrequentDestinationNotIn}&averageTripDistance.greaterThan={averageTripDistanceGreaterThan}&averageTripDistance.lessThan={averageTripDistanceLessThan}&averageTripDistance.greaterThanOrEqual={averageTripDistanceGreaterThanOrEqual}&averageTripDistance.lessThanOrEqual={averageTripDistanceLessThanOrEqual}&averageTripDistance.equals={averageTripDistanceEquals}&averageTripDistance.notEquals={averageTripDistanceNotEquals}&averageTripDistance.specified={averageTripDistanceSpecified}&averageTripDistance.in={averageTripDistanceIn}&averageTripDistance.notIn={averageTripDistanceNotIn}&peakTravelTime.contains={peakTravelTimeContains}&peakTravelTime.doesNotContain={peakTravelTimeDoesNotContain}&peakTravelTime.equals={peakTravelTimeEquals}&peakTravelTime.notEquals={peakTravelTimeNotEquals}&peakTravelTime.specified={peakTravelTimeSpecified}&peakTravelTime.in={peakTravelTimeIn}&peakTravelTime.notIn={peakTravelTimeNotIn}&weekendTrips.greaterThan={weekendTripsGreaterThan}&weekendTrips.lessThan={weekendTripsLessThan}&weekendTrips.greaterThanOrEqual={weekendTripsGreaterThanOrEqual}&weekendTrips.lessThanOrEqual={weekendTripsLessThanOrEqual}&weekendTrips.equals={weekendTripsEquals}&weekendTrips.notEquals={weekendTripsNotEquals}&weekendTrips.specified={weekendTripsSpecified}&weekendTrips.in={weekendTripsIn}&weekendTrips.notIn={weekendTripsNotIn}&holidayTrips.greaterThan={holidayTripsGreaterThan}&holidayTrips.lessThan={holidayTripsLessThan}&holidayTrips.greaterThanOrEqual={holidayTripsGreaterThanOrEqual}&holidayTrips.lessThanOrEqual={holidayTripsLessThanOrEqual}&holidayTrips.equals={holidayTripsEquals}&holidayTrips.notEquals={holidayTripsNotEquals}&holidayTrips.specified={holidayTripsSpecified}&holidayTrips.in={holidayTripsIn}&holidayTrips.notIn={holidayTripsNotIn}&cancelledTrips.greaterThan={cancelledTripsGreaterThan}&cancelledTrips.lessThan={cancelledTripsLessThan}&cancelledTrips.greaterThanOrEqual={cancelledTripsGreaterThanOrEqual}&cancelledTrips.lessThanOrEqual={cancelledTripsLessThanOrEqual}&cancelledTrips.equals={cancelledTripsEquals}&cancelledTrips.notEquals={cancelledTripsNotEquals}&cancelledTrips.specified={cancelledTripsSpecified}&cancelledTrips.in={cancelledTripsIn}&cancelledTrips.notIn={cancelledTripsNotIn}&onTimePerformanceRate.greaterThan={onTimePerformanceRateGreaterThan}&onTimePerformanceRate.lessThan={onTimePerformanceRateLessThan}&onTimePerformanceRate.greaterThanOrEqual={onTimePerformanceRateGreaterThanOrEqual}&onTimePerformanceRate.lessThanOrEqual={onTimePerformanceRateLessThanOrEqual}&onTimePerformanceRate.equals={onTimePerformanceRateEquals}&onTimePerformanceRate.notEquals={onTimePerformanceRateNotEquals}&onTimePerformanceRate.specified={onTimePerformanceRateSpecified}&onTimePerformanceRate.in={onTimePerformanceRateIn}&onTimePerformanceRate.notIn={onTimePerformanceRateNotIn}&preferredSeatTypes.contains={preferredSeatTypesContains}&preferredSeatTypes.doesNotContain={preferredSeatTypesDoesNotContain}&preferredSeatTypes.equals={preferredSeatTypesEquals}&preferredSeatTypes.notEquals={preferredSeatTypesNotEquals}&preferredSeatTypes.specified={preferredSeatTypesSpecified}&preferredSeatTypes.in={preferredSeatTypesIn}&preferredSeatTypes.notIn={preferredSeatTypesNotIn}&monthlyTripCount.greaterThan={monthlyTripCountGreaterThan}&monthlyTripCount.lessThan={monthlyTripCountLessThan}&monthlyTripCount.greaterThanOrEqual={monthlyTripCountGreaterThanOrEqual}&monthlyTripCount.lessThanOrEqual={monthlyTripCountLessThanOrEqual}&monthlyTripCount.equals={monthlyTripCountEquals}&monthlyTripCount.notEquals={monthlyTripCountNotEquals}&monthlyTripCount.specified={monthlyTripCountSpecified}&monthlyTripCount.in={monthlyTripCountIn}&monthlyTripCount.notIn={monthlyTripCountNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<UserStatisticsDTO>> getAllUserStatisticsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("totalTripsGreaterThan") @jakarta.annotation.Nullable Integer totalTripsGreaterThan, @Param("totalTripsLessThan") @jakarta.annotation.Nullable Integer totalTripsLessThan, @Param("totalTripsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer totalTripsGreaterThanOrEqual, @Param("totalTripsLessThanOrEqual") @jakarta.annotation.Nullable Integer totalTripsLessThanOrEqual, @Param("totalTripsEquals") @jakarta.annotation.Nullable Integer totalTripsEquals, @Param("totalTripsNotEquals") @jakarta.annotation.Nullable Integer totalTripsNotEquals, @Param("totalTripsSpecified") @jakarta.annotation.Nullable Boolean totalTripsSpecified, @Param("totalTripsIn") @jakarta.annotation.Nullable List<Integer> totalTripsIn, @Param("totalTripsNotIn") @jakarta.annotation.Nullable List<Integer> totalTripsNotIn, @Param("totalSpentGreaterThan") @jakarta.annotation.Nullable BigDecimal totalSpentGreaterThan, @Param("totalSpentLessThan") @jakarta.annotation.Nullable BigDecimal totalSpentLessThan, @Param("totalSpentGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal totalSpentGreaterThanOrEqual, @Param("totalSpentLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal totalSpentLessThanOrEqual, @Param("totalSpentEquals") @jakarta.annotation.Nullable BigDecimal totalSpentEquals, @Param("totalSpentNotEquals") @jakarta.annotation.Nullable BigDecimal totalSpentNotEquals, @Param("totalSpentSpecified") @jakarta.annotation.Nullable Boolean totalSpentSpecified, @Param("totalSpentIn") @jakarta.annotation.Nullable List<BigDecimal> totalSpentIn, @Param("totalSpentNotIn") @jakarta.annotation.Nullable List<BigDecimal> totalSpentNotIn, @Param("favoriteRoutesContains") @jakarta.annotation.Nullable String favoriteRoutesContains, @Param("favoriteRoutesDoesNotContain") @jakarta.annotation.Nullable String favoriteRoutesDoesNotContain, @Param("favoriteRoutesEquals") @jakarta.annotation.Nullable String favoriteRoutesEquals, @Param("favoriteRoutesNotEquals") @jakarta.annotation.Nullable String favoriteRoutesNotEquals, @Param("favoriteRoutesSpecified") @jakarta.annotation.Nullable Boolean favoriteRoutesSpecified, @Param("favoriteRoutesIn") @jakarta.annotation.Nullable List<String> favoriteRoutesIn, @Param("favoriteRoutesNotIn") @jakarta.annotation.Nullable List<String> favoriteRoutesNotIn, @Param("preferredVehicleTypesContains") @jakarta.annotation.Nullable String preferredVehicleTypesContains, @Param("preferredVehicleTypesDoesNotContain") @jakarta.annotation.Nullable String preferredVehicleTypesDoesNotContain, @Param("preferredVehicleTypesEquals") @jakarta.annotation.Nullable String preferredVehicleTypesEquals, @Param("preferredVehicleTypesNotEquals") @jakarta.annotation.Nullable String preferredVehicleTypesNotEquals, @Param("preferredVehicleTypesSpecified") @jakarta.annotation.Nullable Boolean preferredVehicleTypesSpecified, @Param("preferredVehicleTypesIn") @jakarta.annotation.Nullable List<String> preferredVehicleTypesIn, @Param("preferredVehicleTypesNotIn") @jakarta.annotation.Nullable List<String> preferredVehicleTypesNotIn, @Param("averageTripDurationGreaterThan") @jakarta.annotation.Nullable Integer averageTripDurationGreaterThan, @Param("averageTripDurationLessThan") @jakarta.annotation.Nullable Integer averageTripDurationLessThan, @Param("averageTripDurationGreaterThanOrEqual") @jakarta.annotation.Nullable Integer averageTripDurationGreaterThanOrEqual, @Param("averageTripDurationLessThanOrEqual") @jakarta.annotation.Nullable Integer averageTripDurationLessThanOrEqual, @Param("averageTripDurationEquals") @jakarta.annotation.Nullable Integer averageTripDurationEquals, @Param("averageTripDurationNotEquals") @jakarta.annotation.Nullable Integer averageTripDurationNotEquals, @Param("averageTripDurationSpecified") @jakarta.annotation.Nullable Boolean averageTripDurationSpecified, @Param("averageTripDurationIn") @jakarta.annotation.Nullable List<Integer> averageTripDurationIn, @Param("averageTripDurationNotIn") @jakarta.annotation.Nullable List<Integer> averageTripDurationNotIn, @Param("lastTravelDateGreaterThan") @jakarta.annotation.Nullable LocalDate lastTravelDateGreaterThan, @Param("lastTravelDateLessThan") @jakarta.annotation.Nullable LocalDate lastTravelDateLessThan, @Param("lastTravelDateGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate lastTravelDateGreaterThanOrEqual, @Param("lastTravelDateLessThanOrEqual") @jakarta.annotation.Nullable LocalDate lastTravelDateLessThanOrEqual, @Param("lastTravelDateEquals") @jakarta.annotation.Nullable LocalDate lastTravelDateEquals, @Param("lastTravelDateNotEquals") @jakarta.annotation.Nullable LocalDate lastTravelDateNotEquals, @Param("lastTravelDateSpecified") @jakarta.annotation.Nullable Boolean lastTravelDateSpecified, @Param("lastTravelDateIn") @jakarta.annotation.Nullable List<LocalDate> lastTravelDateIn, @Param("lastTravelDateNotIn") @jakarta.annotation.Nullable List<LocalDate> lastTravelDateNotIn, @Param("bookingFrequencyContains") @jakarta.annotation.Nullable String bookingFrequencyContains, @Param("bookingFrequencyDoesNotContain") @jakarta.annotation.Nullable String bookingFrequencyDoesNotContain, @Param("bookingFrequencyEquals") @jakarta.annotation.Nullable String bookingFrequencyEquals, @Param("bookingFrequencyNotEquals") @jakarta.annotation.Nullable String bookingFrequencyNotEquals, @Param("bookingFrequencySpecified") @jakarta.annotation.Nullable Boolean bookingFrequencySpecified, @Param("bookingFrequencyIn") @jakarta.annotation.Nullable List<String> bookingFrequencyIn, @Param("bookingFrequencyNotIn") @jakarta.annotation.Nullable List<String> bookingFrequencyNotIn, @Param("loyaltyPointsGreaterThan") @jakarta.annotation.Nullable Integer loyaltyPointsGreaterThan, @Param("loyaltyPointsLessThan") @jakarta.annotation.Nullable Integer loyaltyPointsLessThan, @Param("loyaltyPointsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer loyaltyPointsGreaterThanOrEqual, @Param("loyaltyPointsLessThanOrEqual") @jakarta.annotation.Nullable Integer loyaltyPointsLessThanOrEqual, @Param("loyaltyPointsEquals") @jakarta.annotation.Nullable Integer loyaltyPointsEquals, @Param("loyaltyPointsNotEquals") @jakarta.annotation.Nullable Integer loyaltyPointsNotEquals, @Param("loyaltyPointsSpecified") @jakarta.annotation.Nullable Boolean loyaltyPointsSpecified, @Param("loyaltyPointsIn") @jakarta.annotation.Nullable List<Integer> loyaltyPointsIn, @Param("loyaltyPointsNotIn") @jakarta.annotation.Nullable List<Integer> loyaltyPointsNotIn, @Param("mostFrequentOriginContains") @jakarta.annotation.Nullable String mostFrequentOriginContains, @Param("mostFrequentOriginDoesNotContain") @jakarta.annotation.Nullable String mostFrequentOriginDoesNotContain, @Param("mostFrequentOriginEquals") @jakarta.annotation.Nullable String mostFrequentOriginEquals, @Param("mostFrequentOriginNotEquals") @jakarta.annotation.Nullable String mostFrequentOriginNotEquals, @Param("mostFrequentOriginSpecified") @jakarta.annotation.Nullable Boolean mostFrequentOriginSpecified, @Param("mostFrequentOriginIn") @jakarta.annotation.Nullable List<String> mostFrequentOriginIn, @Param("mostFrequentOriginNotIn") @jakarta.annotation.Nullable List<String> mostFrequentOriginNotIn, @Param("mostFrequentDestinationContains") @jakarta.annotation.Nullable String mostFrequentDestinationContains, @Param("mostFrequentDestinationDoesNotContain") @jakarta.annotation.Nullable String mostFrequentDestinationDoesNotContain, @Param("mostFrequentDestinationEquals") @jakarta.annotation.Nullable String mostFrequentDestinationEquals, @Param("mostFrequentDestinationNotEquals") @jakarta.annotation.Nullable String mostFrequentDestinationNotEquals, @Param("mostFrequentDestinationSpecified") @jakarta.annotation.Nullable Boolean mostFrequentDestinationSpecified, @Param("mostFrequentDestinationIn") @jakarta.annotation.Nullable List<String> mostFrequentDestinationIn, @Param("mostFrequentDestinationNotIn") @jakarta.annotation.Nullable List<String> mostFrequentDestinationNotIn, @Param("averageTripDistanceGreaterThan") @jakarta.annotation.Nullable BigDecimal averageTripDistanceGreaterThan, @Param("averageTripDistanceLessThan") @jakarta.annotation.Nullable BigDecimal averageTripDistanceLessThan, @Param("averageTripDistanceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal averageTripDistanceGreaterThanOrEqual, @Param("averageTripDistanceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal averageTripDistanceLessThanOrEqual, @Param("averageTripDistanceEquals") @jakarta.annotation.Nullable BigDecimal averageTripDistanceEquals, @Param("averageTripDistanceNotEquals") @jakarta.annotation.Nullable BigDecimal averageTripDistanceNotEquals, @Param("averageTripDistanceSpecified") @jakarta.annotation.Nullable Boolean averageTripDistanceSpecified, @Param("averageTripDistanceIn") @jakarta.annotation.Nullable List<BigDecimal> averageTripDistanceIn, @Param("averageTripDistanceNotIn") @jakarta.annotation.Nullable List<BigDecimal> averageTripDistanceNotIn, @Param("peakTravelTimeContains") @jakarta.annotation.Nullable String peakTravelTimeContains, @Param("peakTravelTimeDoesNotContain") @jakarta.annotation.Nullable String peakTravelTimeDoesNotContain, @Param("peakTravelTimeEquals") @jakarta.annotation.Nullable String peakTravelTimeEquals, @Param("peakTravelTimeNotEquals") @jakarta.annotation.Nullable String peakTravelTimeNotEquals, @Param("peakTravelTimeSpecified") @jakarta.annotation.Nullable Boolean peakTravelTimeSpecified, @Param("peakTravelTimeIn") @jakarta.annotation.Nullable List<String> peakTravelTimeIn, @Param("peakTravelTimeNotIn") @jakarta.annotation.Nullable List<String> peakTravelTimeNotIn, @Param("weekendTripsGreaterThan") @jakarta.annotation.Nullable Integer weekendTripsGreaterThan, @Param("weekendTripsLessThan") @jakarta.annotation.Nullable Integer weekendTripsLessThan, @Param("weekendTripsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer weekendTripsGreaterThanOrEqual, @Param("weekendTripsLessThanOrEqual") @jakarta.annotation.Nullable Integer weekendTripsLessThanOrEqual, @Param("weekendTripsEquals") @jakarta.annotation.Nullable Integer weekendTripsEquals, @Param("weekendTripsNotEquals") @jakarta.annotation.Nullable Integer weekendTripsNotEquals, @Param("weekendTripsSpecified") @jakarta.annotation.Nullable Boolean weekendTripsSpecified, @Param("weekendTripsIn") @jakarta.annotation.Nullable List<Integer> weekendTripsIn, @Param("weekendTripsNotIn") @jakarta.annotation.Nullable List<Integer> weekendTripsNotIn, @Param("holidayTripsGreaterThan") @jakarta.annotation.Nullable Integer holidayTripsGreaterThan, @Param("holidayTripsLessThan") @jakarta.annotation.Nullable Integer holidayTripsLessThan, @Param("holidayTripsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer holidayTripsGreaterThanOrEqual, @Param("holidayTripsLessThanOrEqual") @jakarta.annotation.Nullable Integer holidayTripsLessThanOrEqual, @Param("holidayTripsEquals") @jakarta.annotation.Nullable Integer holidayTripsEquals, @Param("holidayTripsNotEquals") @jakarta.annotation.Nullable Integer holidayTripsNotEquals, @Param("holidayTripsSpecified") @jakarta.annotation.Nullable Boolean holidayTripsSpecified, @Param("holidayTripsIn") @jakarta.annotation.Nullable List<Integer> holidayTripsIn, @Param("holidayTripsNotIn") @jakarta.annotation.Nullable List<Integer> holidayTripsNotIn, @Param("cancelledTripsGreaterThan") @jakarta.annotation.Nullable Integer cancelledTripsGreaterThan, @Param("cancelledTripsLessThan") @jakarta.annotation.Nullable Integer cancelledTripsLessThan, @Param("cancelledTripsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer cancelledTripsGreaterThanOrEqual, @Param("cancelledTripsLessThanOrEqual") @jakarta.annotation.Nullable Integer cancelledTripsLessThanOrEqual, @Param("cancelledTripsEquals") @jakarta.annotation.Nullable Integer cancelledTripsEquals, @Param("cancelledTripsNotEquals") @jakarta.annotation.Nullable Integer cancelledTripsNotEquals, @Param("cancelledTripsSpecified") @jakarta.annotation.Nullable Boolean cancelledTripsSpecified, @Param("cancelledTripsIn") @jakarta.annotation.Nullable List<Integer> cancelledTripsIn, @Param("cancelledTripsNotIn") @jakarta.annotation.Nullable List<Integer> cancelledTripsNotIn, @Param("onTimePerformanceRateGreaterThan") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateGreaterThan, @Param("onTimePerformanceRateLessThan") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateLessThan, @Param("onTimePerformanceRateGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateGreaterThanOrEqual, @Param("onTimePerformanceRateLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateLessThanOrEqual, @Param("onTimePerformanceRateEquals") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateEquals, @Param("onTimePerformanceRateNotEquals") @jakarta.annotation.Nullable BigDecimal onTimePerformanceRateNotEquals, @Param("onTimePerformanceRateSpecified") @jakarta.annotation.Nullable Boolean onTimePerformanceRateSpecified, @Param("onTimePerformanceRateIn") @jakarta.annotation.Nullable List<BigDecimal> onTimePerformanceRateIn, @Param("onTimePerformanceRateNotIn") @jakarta.annotation.Nullable List<BigDecimal> onTimePerformanceRateNotIn, @Param("preferredSeatTypesContains") @jakarta.annotation.Nullable String preferredSeatTypesContains, @Param("preferredSeatTypesDoesNotContain") @jakarta.annotation.Nullable String preferredSeatTypesDoesNotContain, @Param("preferredSeatTypesEquals") @jakarta.annotation.Nullable String preferredSeatTypesEquals, @Param("preferredSeatTypesNotEquals") @jakarta.annotation.Nullable String preferredSeatTypesNotEquals, @Param("preferredSeatTypesSpecified") @jakarta.annotation.Nullable Boolean preferredSeatTypesSpecified, @Param("preferredSeatTypesIn") @jakarta.annotation.Nullable List<String> preferredSeatTypesIn, @Param("preferredSeatTypesNotIn") @jakarta.annotation.Nullable List<String> preferredSeatTypesNotIn, @Param("monthlyTripCountGreaterThan") @jakarta.annotation.Nullable Integer monthlyTripCountGreaterThan, @Param("monthlyTripCountLessThan") @jakarta.annotation.Nullable Integer monthlyTripCountLessThan, @Param("monthlyTripCountGreaterThanOrEqual") @jakarta.annotation.Nullable Integer monthlyTripCountGreaterThanOrEqual, @Param("monthlyTripCountLessThanOrEqual") @jakarta.annotation.Nullable Integer monthlyTripCountLessThanOrEqual, @Param("monthlyTripCountEquals") @jakarta.annotation.Nullable Integer monthlyTripCountEquals, @Param("monthlyTripCountNotEquals") @jakarta.annotation.Nullable Integer monthlyTripCountNotEquals, @Param("monthlyTripCountSpecified") @jakarta.annotation.Nullable Boolean monthlyTripCountSpecified, @Param("monthlyTripCountIn") @jakarta.annotation.Nullable List<Integer> monthlyTripCountIn, @Param("monthlyTripCountNotIn") @jakarta.annotation.Nullable List<Integer> monthlyTripCountNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("userIdGreaterThan") @jakarta.annotation.Nullable Long userIdGreaterThan, @Param("userIdLessThan") @jakarta.annotation.Nullable Long userIdLessThan, @Param("userIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long userIdGreaterThanOrEqual, @Param("userIdLessThanOrEqual") @jakarta.annotation.Nullable Long userIdLessThanOrEqual, @Param("userIdEquals") @jakarta.annotation.Nullable Long userIdEquals, @Param("userIdNotEquals") @jakarta.annotation.Nullable Long userIdNotEquals, @Param("userIdSpecified") @jakarta.annotation.Nullable Boolean userIdSpecified, @Param("userIdIn") @jakarta.annotation.Nullable List<Long> userIdIn, @Param("userIdNotIn") @jakarta.annotation.Nullable List<Long> userIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllUserStatistics</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllUserStatisticsQueryParams} class that allows for
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
   *   <li>totalTripsGreaterThan -  (optional)</li>
   *   <li>totalTripsLessThan -  (optional)</li>
   *   <li>totalTripsGreaterThanOrEqual -  (optional)</li>
   *   <li>totalTripsLessThanOrEqual -  (optional)</li>
   *   <li>totalTripsEquals -  (optional)</li>
   *   <li>totalTripsNotEquals -  (optional)</li>
   *   <li>totalTripsSpecified -  (optional)</li>
   *   <li>totalTripsIn -  (optional)</li>
   *   <li>totalTripsNotIn -  (optional)</li>
   *   <li>totalSpentGreaterThan -  (optional)</li>
   *   <li>totalSpentLessThan -  (optional)</li>
   *   <li>totalSpentGreaterThanOrEqual -  (optional)</li>
   *   <li>totalSpentLessThanOrEqual -  (optional)</li>
   *   <li>totalSpentEquals -  (optional)</li>
   *   <li>totalSpentNotEquals -  (optional)</li>
   *   <li>totalSpentSpecified -  (optional)</li>
   *   <li>totalSpentIn -  (optional)</li>
   *   <li>totalSpentNotIn -  (optional)</li>
   *   <li>favoriteRoutesContains -  (optional)</li>
   *   <li>favoriteRoutesDoesNotContain -  (optional)</li>
   *   <li>favoriteRoutesEquals -  (optional)</li>
   *   <li>favoriteRoutesNotEquals -  (optional)</li>
   *   <li>favoriteRoutesSpecified -  (optional)</li>
   *   <li>favoriteRoutesIn -  (optional)</li>
   *   <li>favoriteRoutesNotIn -  (optional)</li>
   *   <li>preferredVehicleTypesContains -  (optional)</li>
   *   <li>preferredVehicleTypesDoesNotContain -  (optional)</li>
   *   <li>preferredVehicleTypesEquals -  (optional)</li>
   *   <li>preferredVehicleTypesNotEquals -  (optional)</li>
   *   <li>preferredVehicleTypesSpecified -  (optional)</li>
   *   <li>preferredVehicleTypesIn -  (optional)</li>
   *   <li>preferredVehicleTypesNotIn -  (optional)</li>
   *   <li>averageTripDurationGreaterThan -  (optional)</li>
   *   <li>averageTripDurationLessThan -  (optional)</li>
   *   <li>averageTripDurationGreaterThanOrEqual -  (optional)</li>
   *   <li>averageTripDurationLessThanOrEqual -  (optional)</li>
   *   <li>averageTripDurationEquals -  (optional)</li>
   *   <li>averageTripDurationNotEquals -  (optional)</li>
   *   <li>averageTripDurationSpecified -  (optional)</li>
   *   <li>averageTripDurationIn -  (optional)</li>
   *   <li>averageTripDurationNotIn -  (optional)</li>
   *   <li>lastTravelDateGreaterThan -  (optional)</li>
   *   <li>lastTravelDateLessThan -  (optional)</li>
   *   <li>lastTravelDateGreaterThanOrEqual -  (optional)</li>
   *   <li>lastTravelDateLessThanOrEqual -  (optional)</li>
   *   <li>lastTravelDateEquals -  (optional)</li>
   *   <li>lastTravelDateNotEquals -  (optional)</li>
   *   <li>lastTravelDateSpecified -  (optional)</li>
   *   <li>lastTravelDateIn -  (optional)</li>
   *   <li>lastTravelDateNotIn -  (optional)</li>
   *   <li>bookingFrequencyContains -  (optional)</li>
   *   <li>bookingFrequencyDoesNotContain -  (optional)</li>
   *   <li>bookingFrequencyEquals -  (optional)</li>
   *   <li>bookingFrequencyNotEquals -  (optional)</li>
   *   <li>bookingFrequencySpecified -  (optional)</li>
   *   <li>bookingFrequencyIn -  (optional)</li>
   *   <li>bookingFrequencyNotIn -  (optional)</li>
   *   <li>loyaltyPointsGreaterThan -  (optional)</li>
   *   <li>loyaltyPointsLessThan -  (optional)</li>
   *   <li>loyaltyPointsGreaterThanOrEqual -  (optional)</li>
   *   <li>loyaltyPointsLessThanOrEqual -  (optional)</li>
   *   <li>loyaltyPointsEquals -  (optional)</li>
   *   <li>loyaltyPointsNotEquals -  (optional)</li>
   *   <li>loyaltyPointsSpecified -  (optional)</li>
   *   <li>loyaltyPointsIn -  (optional)</li>
   *   <li>loyaltyPointsNotIn -  (optional)</li>
   *   <li>mostFrequentOriginContains -  (optional)</li>
   *   <li>mostFrequentOriginDoesNotContain -  (optional)</li>
   *   <li>mostFrequentOriginEquals -  (optional)</li>
   *   <li>mostFrequentOriginNotEquals -  (optional)</li>
   *   <li>mostFrequentOriginSpecified -  (optional)</li>
   *   <li>mostFrequentOriginIn -  (optional)</li>
   *   <li>mostFrequentOriginNotIn -  (optional)</li>
   *   <li>mostFrequentDestinationContains -  (optional)</li>
   *   <li>mostFrequentDestinationDoesNotContain -  (optional)</li>
   *   <li>mostFrequentDestinationEquals -  (optional)</li>
   *   <li>mostFrequentDestinationNotEquals -  (optional)</li>
   *   <li>mostFrequentDestinationSpecified -  (optional)</li>
   *   <li>mostFrequentDestinationIn -  (optional)</li>
   *   <li>mostFrequentDestinationNotIn -  (optional)</li>
   *   <li>averageTripDistanceGreaterThan -  (optional)</li>
   *   <li>averageTripDistanceLessThan -  (optional)</li>
   *   <li>averageTripDistanceGreaterThanOrEqual -  (optional)</li>
   *   <li>averageTripDistanceLessThanOrEqual -  (optional)</li>
   *   <li>averageTripDistanceEquals -  (optional)</li>
   *   <li>averageTripDistanceNotEquals -  (optional)</li>
   *   <li>averageTripDistanceSpecified -  (optional)</li>
   *   <li>averageTripDistanceIn -  (optional)</li>
   *   <li>averageTripDistanceNotIn -  (optional)</li>
   *   <li>peakTravelTimeContains -  (optional)</li>
   *   <li>peakTravelTimeDoesNotContain -  (optional)</li>
   *   <li>peakTravelTimeEquals -  (optional)</li>
   *   <li>peakTravelTimeNotEquals -  (optional)</li>
   *   <li>peakTravelTimeSpecified -  (optional)</li>
   *   <li>peakTravelTimeIn -  (optional)</li>
   *   <li>peakTravelTimeNotIn -  (optional)</li>
   *   <li>weekendTripsGreaterThan -  (optional)</li>
   *   <li>weekendTripsLessThan -  (optional)</li>
   *   <li>weekendTripsGreaterThanOrEqual -  (optional)</li>
   *   <li>weekendTripsLessThanOrEqual -  (optional)</li>
   *   <li>weekendTripsEquals -  (optional)</li>
   *   <li>weekendTripsNotEquals -  (optional)</li>
   *   <li>weekendTripsSpecified -  (optional)</li>
   *   <li>weekendTripsIn -  (optional)</li>
   *   <li>weekendTripsNotIn -  (optional)</li>
   *   <li>holidayTripsGreaterThan -  (optional)</li>
   *   <li>holidayTripsLessThan -  (optional)</li>
   *   <li>holidayTripsGreaterThanOrEqual -  (optional)</li>
   *   <li>holidayTripsLessThanOrEqual -  (optional)</li>
   *   <li>holidayTripsEquals -  (optional)</li>
   *   <li>holidayTripsNotEquals -  (optional)</li>
   *   <li>holidayTripsSpecified -  (optional)</li>
   *   <li>holidayTripsIn -  (optional)</li>
   *   <li>holidayTripsNotIn -  (optional)</li>
   *   <li>cancelledTripsGreaterThan -  (optional)</li>
   *   <li>cancelledTripsLessThan -  (optional)</li>
   *   <li>cancelledTripsGreaterThanOrEqual -  (optional)</li>
   *   <li>cancelledTripsLessThanOrEqual -  (optional)</li>
   *   <li>cancelledTripsEquals -  (optional)</li>
   *   <li>cancelledTripsNotEquals -  (optional)</li>
   *   <li>cancelledTripsSpecified -  (optional)</li>
   *   <li>cancelledTripsIn -  (optional)</li>
   *   <li>cancelledTripsNotIn -  (optional)</li>
   *   <li>onTimePerformanceRateGreaterThan -  (optional)</li>
   *   <li>onTimePerformanceRateLessThan -  (optional)</li>
   *   <li>onTimePerformanceRateGreaterThanOrEqual -  (optional)</li>
   *   <li>onTimePerformanceRateLessThanOrEqual -  (optional)</li>
   *   <li>onTimePerformanceRateEquals -  (optional)</li>
   *   <li>onTimePerformanceRateNotEquals -  (optional)</li>
   *   <li>onTimePerformanceRateSpecified -  (optional)</li>
   *   <li>onTimePerformanceRateIn -  (optional)</li>
   *   <li>onTimePerformanceRateNotIn -  (optional)</li>
   *   <li>preferredSeatTypesContains -  (optional)</li>
   *   <li>preferredSeatTypesDoesNotContain -  (optional)</li>
   *   <li>preferredSeatTypesEquals -  (optional)</li>
   *   <li>preferredSeatTypesNotEquals -  (optional)</li>
   *   <li>preferredSeatTypesSpecified -  (optional)</li>
   *   <li>preferredSeatTypesIn -  (optional)</li>
   *   <li>preferredSeatTypesNotIn -  (optional)</li>
   *   <li>monthlyTripCountGreaterThan -  (optional)</li>
   *   <li>monthlyTripCountLessThan -  (optional)</li>
   *   <li>monthlyTripCountGreaterThanOrEqual -  (optional)</li>
   *   <li>monthlyTripCountLessThanOrEqual -  (optional)</li>
   *   <li>monthlyTripCountEquals -  (optional)</li>
   *   <li>monthlyTripCountNotEquals -  (optional)</li>
   *   <li>monthlyTripCountSpecified -  (optional)</li>
   *   <li>monthlyTripCountIn -  (optional)</li>
   *   <li>monthlyTripCountNotIn -  (optional)</li>
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
   *   <li>userIdGreaterThan -  (optional)</li>
   *   <li>userIdLessThan -  (optional)</li>
   *   <li>userIdGreaterThanOrEqual -  (optional)</li>
   *   <li>userIdLessThanOrEqual -  (optional)</li>
   *   <li>userIdEquals -  (optional)</li>
   *   <li>userIdNotEquals -  (optional)</li>
   *   <li>userIdSpecified -  (optional)</li>
   *   <li>userIdIn -  (optional)</li>
   *   <li>userIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   <li>page - Zero-based page index (0..N) (optional, default to 0)</li>
   *   <li>size - The size of the page to be returned (optional, default to 20)</li>
   *   <li>sort - Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
   *   </ul>
   * @return List&lt;UserStatisticsDTO&gt;
   */
  @RequestLine("GET /api/user-statistics?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&totalTrips.greaterThan={totalTripsGreaterThan}&totalTrips.lessThan={totalTripsLessThan}&totalTrips.greaterThanOrEqual={totalTripsGreaterThanOrEqual}&totalTrips.lessThanOrEqual={totalTripsLessThanOrEqual}&totalTrips.equals={totalTripsEquals}&totalTrips.notEquals={totalTripsNotEquals}&totalTrips.specified={totalTripsSpecified}&totalTrips.in={totalTripsIn}&totalTrips.notIn={totalTripsNotIn}&totalSpent.greaterThan={totalSpentGreaterThan}&totalSpent.lessThan={totalSpentLessThan}&totalSpent.greaterThanOrEqual={totalSpentGreaterThanOrEqual}&totalSpent.lessThanOrEqual={totalSpentLessThanOrEqual}&totalSpent.equals={totalSpentEquals}&totalSpent.notEquals={totalSpentNotEquals}&totalSpent.specified={totalSpentSpecified}&totalSpent.in={totalSpentIn}&totalSpent.notIn={totalSpentNotIn}&favoriteRoutes.contains={favoriteRoutesContains}&favoriteRoutes.doesNotContain={favoriteRoutesDoesNotContain}&favoriteRoutes.equals={favoriteRoutesEquals}&favoriteRoutes.notEquals={favoriteRoutesNotEquals}&favoriteRoutes.specified={favoriteRoutesSpecified}&favoriteRoutes.in={favoriteRoutesIn}&favoriteRoutes.notIn={favoriteRoutesNotIn}&preferredVehicleTypes.contains={preferredVehicleTypesContains}&preferredVehicleTypes.doesNotContain={preferredVehicleTypesDoesNotContain}&preferredVehicleTypes.equals={preferredVehicleTypesEquals}&preferredVehicleTypes.notEquals={preferredVehicleTypesNotEquals}&preferredVehicleTypes.specified={preferredVehicleTypesSpecified}&preferredVehicleTypes.in={preferredVehicleTypesIn}&preferredVehicleTypes.notIn={preferredVehicleTypesNotIn}&averageTripDuration.greaterThan={averageTripDurationGreaterThan}&averageTripDuration.lessThan={averageTripDurationLessThan}&averageTripDuration.greaterThanOrEqual={averageTripDurationGreaterThanOrEqual}&averageTripDuration.lessThanOrEqual={averageTripDurationLessThanOrEqual}&averageTripDuration.equals={averageTripDurationEquals}&averageTripDuration.notEquals={averageTripDurationNotEquals}&averageTripDuration.specified={averageTripDurationSpecified}&averageTripDuration.in={averageTripDurationIn}&averageTripDuration.notIn={averageTripDurationNotIn}&lastTravelDate.greaterThan={lastTravelDateGreaterThan}&lastTravelDate.lessThan={lastTravelDateLessThan}&lastTravelDate.greaterThanOrEqual={lastTravelDateGreaterThanOrEqual}&lastTravelDate.lessThanOrEqual={lastTravelDateLessThanOrEqual}&lastTravelDate.equals={lastTravelDateEquals}&lastTravelDate.notEquals={lastTravelDateNotEquals}&lastTravelDate.specified={lastTravelDateSpecified}&lastTravelDate.in={lastTravelDateIn}&lastTravelDate.notIn={lastTravelDateNotIn}&bookingFrequency.contains={bookingFrequencyContains}&bookingFrequency.doesNotContain={bookingFrequencyDoesNotContain}&bookingFrequency.equals={bookingFrequencyEquals}&bookingFrequency.notEquals={bookingFrequencyNotEquals}&bookingFrequency.specified={bookingFrequencySpecified}&bookingFrequency.in={bookingFrequencyIn}&bookingFrequency.notIn={bookingFrequencyNotIn}&loyaltyPoints.greaterThan={loyaltyPointsGreaterThan}&loyaltyPoints.lessThan={loyaltyPointsLessThan}&loyaltyPoints.greaterThanOrEqual={loyaltyPointsGreaterThanOrEqual}&loyaltyPoints.lessThanOrEqual={loyaltyPointsLessThanOrEqual}&loyaltyPoints.equals={loyaltyPointsEquals}&loyaltyPoints.notEquals={loyaltyPointsNotEquals}&loyaltyPoints.specified={loyaltyPointsSpecified}&loyaltyPoints.in={loyaltyPointsIn}&loyaltyPoints.notIn={loyaltyPointsNotIn}&mostFrequentOrigin.contains={mostFrequentOriginContains}&mostFrequentOrigin.doesNotContain={mostFrequentOriginDoesNotContain}&mostFrequentOrigin.equals={mostFrequentOriginEquals}&mostFrequentOrigin.notEquals={mostFrequentOriginNotEquals}&mostFrequentOrigin.specified={mostFrequentOriginSpecified}&mostFrequentOrigin.in={mostFrequentOriginIn}&mostFrequentOrigin.notIn={mostFrequentOriginNotIn}&mostFrequentDestination.contains={mostFrequentDestinationContains}&mostFrequentDestination.doesNotContain={mostFrequentDestinationDoesNotContain}&mostFrequentDestination.equals={mostFrequentDestinationEquals}&mostFrequentDestination.notEquals={mostFrequentDestinationNotEquals}&mostFrequentDestination.specified={mostFrequentDestinationSpecified}&mostFrequentDestination.in={mostFrequentDestinationIn}&mostFrequentDestination.notIn={mostFrequentDestinationNotIn}&averageTripDistance.greaterThan={averageTripDistanceGreaterThan}&averageTripDistance.lessThan={averageTripDistanceLessThan}&averageTripDistance.greaterThanOrEqual={averageTripDistanceGreaterThanOrEqual}&averageTripDistance.lessThanOrEqual={averageTripDistanceLessThanOrEqual}&averageTripDistance.equals={averageTripDistanceEquals}&averageTripDistance.notEquals={averageTripDistanceNotEquals}&averageTripDistance.specified={averageTripDistanceSpecified}&averageTripDistance.in={averageTripDistanceIn}&averageTripDistance.notIn={averageTripDistanceNotIn}&peakTravelTime.contains={peakTravelTimeContains}&peakTravelTime.doesNotContain={peakTravelTimeDoesNotContain}&peakTravelTime.equals={peakTravelTimeEquals}&peakTravelTime.notEquals={peakTravelTimeNotEquals}&peakTravelTime.specified={peakTravelTimeSpecified}&peakTravelTime.in={peakTravelTimeIn}&peakTravelTime.notIn={peakTravelTimeNotIn}&weekendTrips.greaterThan={weekendTripsGreaterThan}&weekendTrips.lessThan={weekendTripsLessThan}&weekendTrips.greaterThanOrEqual={weekendTripsGreaterThanOrEqual}&weekendTrips.lessThanOrEqual={weekendTripsLessThanOrEqual}&weekendTrips.equals={weekendTripsEquals}&weekendTrips.notEquals={weekendTripsNotEquals}&weekendTrips.specified={weekendTripsSpecified}&weekendTrips.in={weekendTripsIn}&weekendTrips.notIn={weekendTripsNotIn}&holidayTrips.greaterThan={holidayTripsGreaterThan}&holidayTrips.lessThan={holidayTripsLessThan}&holidayTrips.greaterThanOrEqual={holidayTripsGreaterThanOrEqual}&holidayTrips.lessThanOrEqual={holidayTripsLessThanOrEqual}&holidayTrips.equals={holidayTripsEquals}&holidayTrips.notEquals={holidayTripsNotEquals}&holidayTrips.specified={holidayTripsSpecified}&holidayTrips.in={holidayTripsIn}&holidayTrips.notIn={holidayTripsNotIn}&cancelledTrips.greaterThan={cancelledTripsGreaterThan}&cancelledTrips.lessThan={cancelledTripsLessThan}&cancelledTrips.greaterThanOrEqual={cancelledTripsGreaterThanOrEqual}&cancelledTrips.lessThanOrEqual={cancelledTripsLessThanOrEqual}&cancelledTrips.equals={cancelledTripsEquals}&cancelledTrips.notEquals={cancelledTripsNotEquals}&cancelledTrips.specified={cancelledTripsSpecified}&cancelledTrips.in={cancelledTripsIn}&cancelledTrips.notIn={cancelledTripsNotIn}&onTimePerformanceRate.greaterThan={onTimePerformanceRateGreaterThan}&onTimePerformanceRate.lessThan={onTimePerformanceRateLessThan}&onTimePerformanceRate.greaterThanOrEqual={onTimePerformanceRateGreaterThanOrEqual}&onTimePerformanceRate.lessThanOrEqual={onTimePerformanceRateLessThanOrEqual}&onTimePerformanceRate.equals={onTimePerformanceRateEquals}&onTimePerformanceRate.notEquals={onTimePerformanceRateNotEquals}&onTimePerformanceRate.specified={onTimePerformanceRateSpecified}&onTimePerformanceRate.in={onTimePerformanceRateIn}&onTimePerformanceRate.notIn={onTimePerformanceRateNotIn}&preferredSeatTypes.contains={preferredSeatTypesContains}&preferredSeatTypes.doesNotContain={preferredSeatTypesDoesNotContain}&preferredSeatTypes.equals={preferredSeatTypesEquals}&preferredSeatTypes.notEquals={preferredSeatTypesNotEquals}&preferredSeatTypes.specified={preferredSeatTypesSpecified}&preferredSeatTypes.in={preferredSeatTypesIn}&preferredSeatTypes.notIn={preferredSeatTypesNotIn}&monthlyTripCount.greaterThan={monthlyTripCountGreaterThan}&monthlyTripCount.lessThan={monthlyTripCountLessThan}&monthlyTripCount.greaterThanOrEqual={monthlyTripCountGreaterThanOrEqual}&monthlyTripCount.lessThanOrEqual={monthlyTripCountLessThanOrEqual}&monthlyTripCount.equals={monthlyTripCountEquals}&monthlyTripCount.notEquals={monthlyTripCountNotEquals}&monthlyTripCount.specified={monthlyTripCountSpecified}&monthlyTripCount.in={monthlyTripCountIn}&monthlyTripCount.notIn={monthlyTripCountNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
  "Accept: */*",
  })
  List<UserStatisticsDTO> getAllUserStatistics(@QueryMap(encoded=true) GetAllUserStatisticsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllUserStatistics</code> that receives the query parameters as a map,
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
          *   <li>totalTripsGreaterThan -  (optional)</li>
          *   <li>totalTripsLessThan -  (optional)</li>
          *   <li>totalTripsGreaterThanOrEqual -  (optional)</li>
          *   <li>totalTripsLessThanOrEqual -  (optional)</li>
          *   <li>totalTripsEquals -  (optional)</li>
          *   <li>totalTripsNotEquals -  (optional)</li>
          *   <li>totalTripsSpecified -  (optional)</li>
          *   <li>totalTripsIn -  (optional)</li>
          *   <li>totalTripsNotIn -  (optional)</li>
          *   <li>totalSpentGreaterThan -  (optional)</li>
          *   <li>totalSpentLessThan -  (optional)</li>
          *   <li>totalSpentGreaterThanOrEqual -  (optional)</li>
          *   <li>totalSpentLessThanOrEqual -  (optional)</li>
          *   <li>totalSpentEquals -  (optional)</li>
          *   <li>totalSpentNotEquals -  (optional)</li>
          *   <li>totalSpentSpecified -  (optional)</li>
          *   <li>totalSpentIn -  (optional)</li>
          *   <li>totalSpentNotIn -  (optional)</li>
          *   <li>favoriteRoutesContains -  (optional)</li>
          *   <li>favoriteRoutesDoesNotContain -  (optional)</li>
          *   <li>favoriteRoutesEquals -  (optional)</li>
          *   <li>favoriteRoutesNotEquals -  (optional)</li>
          *   <li>favoriteRoutesSpecified -  (optional)</li>
          *   <li>favoriteRoutesIn -  (optional)</li>
          *   <li>favoriteRoutesNotIn -  (optional)</li>
          *   <li>preferredVehicleTypesContains -  (optional)</li>
          *   <li>preferredVehicleTypesDoesNotContain -  (optional)</li>
          *   <li>preferredVehicleTypesEquals -  (optional)</li>
          *   <li>preferredVehicleTypesNotEquals -  (optional)</li>
          *   <li>preferredVehicleTypesSpecified -  (optional)</li>
          *   <li>preferredVehicleTypesIn -  (optional)</li>
          *   <li>preferredVehicleTypesNotIn -  (optional)</li>
          *   <li>averageTripDurationGreaterThan -  (optional)</li>
          *   <li>averageTripDurationLessThan -  (optional)</li>
          *   <li>averageTripDurationGreaterThanOrEqual -  (optional)</li>
          *   <li>averageTripDurationLessThanOrEqual -  (optional)</li>
          *   <li>averageTripDurationEquals -  (optional)</li>
          *   <li>averageTripDurationNotEquals -  (optional)</li>
          *   <li>averageTripDurationSpecified -  (optional)</li>
          *   <li>averageTripDurationIn -  (optional)</li>
          *   <li>averageTripDurationNotIn -  (optional)</li>
          *   <li>lastTravelDateGreaterThan -  (optional)</li>
          *   <li>lastTravelDateLessThan -  (optional)</li>
          *   <li>lastTravelDateGreaterThanOrEqual -  (optional)</li>
          *   <li>lastTravelDateLessThanOrEqual -  (optional)</li>
          *   <li>lastTravelDateEquals -  (optional)</li>
          *   <li>lastTravelDateNotEquals -  (optional)</li>
          *   <li>lastTravelDateSpecified -  (optional)</li>
          *   <li>lastTravelDateIn -  (optional)</li>
          *   <li>lastTravelDateNotIn -  (optional)</li>
          *   <li>bookingFrequencyContains -  (optional)</li>
          *   <li>bookingFrequencyDoesNotContain -  (optional)</li>
          *   <li>bookingFrequencyEquals -  (optional)</li>
          *   <li>bookingFrequencyNotEquals -  (optional)</li>
          *   <li>bookingFrequencySpecified -  (optional)</li>
          *   <li>bookingFrequencyIn -  (optional)</li>
          *   <li>bookingFrequencyNotIn -  (optional)</li>
          *   <li>loyaltyPointsGreaterThan -  (optional)</li>
          *   <li>loyaltyPointsLessThan -  (optional)</li>
          *   <li>loyaltyPointsGreaterThanOrEqual -  (optional)</li>
          *   <li>loyaltyPointsLessThanOrEqual -  (optional)</li>
          *   <li>loyaltyPointsEquals -  (optional)</li>
          *   <li>loyaltyPointsNotEquals -  (optional)</li>
          *   <li>loyaltyPointsSpecified -  (optional)</li>
          *   <li>loyaltyPointsIn -  (optional)</li>
          *   <li>loyaltyPointsNotIn -  (optional)</li>
          *   <li>mostFrequentOriginContains -  (optional)</li>
          *   <li>mostFrequentOriginDoesNotContain -  (optional)</li>
          *   <li>mostFrequentOriginEquals -  (optional)</li>
          *   <li>mostFrequentOriginNotEquals -  (optional)</li>
          *   <li>mostFrequentOriginSpecified -  (optional)</li>
          *   <li>mostFrequentOriginIn -  (optional)</li>
          *   <li>mostFrequentOriginNotIn -  (optional)</li>
          *   <li>mostFrequentDestinationContains -  (optional)</li>
          *   <li>mostFrequentDestinationDoesNotContain -  (optional)</li>
          *   <li>mostFrequentDestinationEquals -  (optional)</li>
          *   <li>mostFrequentDestinationNotEquals -  (optional)</li>
          *   <li>mostFrequentDestinationSpecified -  (optional)</li>
          *   <li>mostFrequentDestinationIn -  (optional)</li>
          *   <li>mostFrequentDestinationNotIn -  (optional)</li>
          *   <li>averageTripDistanceGreaterThan -  (optional)</li>
          *   <li>averageTripDistanceLessThan -  (optional)</li>
          *   <li>averageTripDistanceGreaterThanOrEqual -  (optional)</li>
          *   <li>averageTripDistanceLessThanOrEqual -  (optional)</li>
          *   <li>averageTripDistanceEquals -  (optional)</li>
          *   <li>averageTripDistanceNotEquals -  (optional)</li>
          *   <li>averageTripDistanceSpecified -  (optional)</li>
          *   <li>averageTripDistanceIn -  (optional)</li>
          *   <li>averageTripDistanceNotIn -  (optional)</li>
          *   <li>peakTravelTimeContains -  (optional)</li>
          *   <li>peakTravelTimeDoesNotContain -  (optional)</li>
          *   <li>peakTravelTimeEquals -  (optional)</li>
          *   <li>peakTravelTimeNotEquals -  (optional)</li>
          *   <li>peakTravelTimeSpecified -  (optional)</li>
          *   <li>peakTravelTimeIn -  (optional)</li>
          *   <li>peakTravelTimeNotIn -  (optional)</li>
          *   <li>weekendTripsGreaterThan -  (optional)</li>
          *   <li>weekendTripsLessThan -  (optional)</li>
          *   <li>weekendTripsGreaterThanOrEqual -  (optional)</li>
          *   <li>weekendTripsLessThanOrEqual -  (optional)</li>
          *   <li>weekendTripsEquals -  (optional)</li>
          *   <li>weekendTripsNotEquals -  (optional)</li>
          *   <li>weekendTripsSpecified -  (optional)</li>
          *   <li>weekendTripsIn -  (optional)</li>
          *   <li>weekendTripsNotIn -  (optional)</li>
          *   <li>holidayTripsGreaterThan -  (optional)</li>
          *   <li>holidayTripsLessThan -  (optional)</li>
          *   <li>holidayTripsGreaterThanOrEqual -  (optional)</li>
          *   <li>holidayTripsLessThanOrEqual -  (optional)</li>
          *   <li>holidayTripsEquals -  (optional)</li>
          *   <li>holidayTripsNotEquals -  (optional)</li>
          *   <li>holidayTripsSpecified -  (optional)</li>
          *   <li>holidayTripsIn -  (optional)</li>
          *   <li>holidayTripsNotIn -  (optional)</li>
          *   <li>cancelledTripsGreaterThan -  (optional)</li>
          *   <li>cancelledTripsLessThan -  (optional)</li>
          *   <li>cancelledTripsGreaterThanOrEqual -  (optional)</li>
          *   <li>cancelledTripsLessThanOrEqual -  (optional)</li>
          *   <li>cancelledTripsEquals -  (optional)</li>
          *   <li>cancelledTripsNotEquals -  (optional)</li>
          *   <li>cancelledTripsSpecified -  (optional)</li>
          *   <li>cancelledTripsIn -  (optional)</li>
          *   <li>cancelledTripsNotIn -  (optional)</li>
          *   <li>onTimePerformanceRateGreaterThan -  (optional)</li>
          *   <li>onTimePerformanceRateLessThan -  (optional)</li>
          *   <li>onTimePerformanceRateGreaterThanOrEqual -  (optional)</li>
          *   <li>onTimePerformanceRateLessThanOrEqual -  (optional)</li>
          *   <li>onTimePerformanceRateEquals -  (optional)</li>
          *   <li>onTimePerformanceRateNotEquals -  (optional)</li>
          *   <li>onTimePerformanceRateSpecified -  (optional)</li>
          *   <li>onTimePerformanceRateIn -  (optional)</li>
          *   <li>onTimePerformanceRateNotIn -  (optional)</li>
          *   <li>preferredSeatTypesContains -  (optional)</li>
          *   <li>preferredSeatTypesDoesNotContain -  (optional)</li>
          *   <li>preferredSeatTypesEquals -  (optional)</li>
          *   <li>preferredSeatTypesNotEquals -  (optional)</li>
          *   <li>preferredSeatTypesSpecified -  (optional)</li>
          *   <li>preferredSeatTypesIn -  (optional)</li>
          *   <li>preferredSeatTypesNotIn -  (optional)</li>
          *   <li>monthlyTripCountGreaterThan -  (optional)</li>
          *   <li>monthlyTripCountLessThan -  (optional)</li>
          *   <li>monthlyTripCountGreaterThanOrEqual -  (optional)</li>
          *   <li>monthlyTripCountLessThanOrEqual -  (optional)</li>
          *   <li>monthlyTripCountEquals -  (optional)</li>
          *   <li>monthlyTripCountNotEquals -  (optional)</li>
          *   <li>monthlyTripCountSpecified -  (optional)</li>
          *   <li>monthlyTripCountIn -  (optional)</li>
          *   <li>monthlyTripCountNotIn -  (optional)</li>
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
          *   <li>userIdGreaterThan -  (optional)</li>
          *   <li>userIdLessThan -  (optional)</li>
          *   <li>userIdGreaterThanOrEqual -  (optional)</li>
          *   <li>userIdLessThanOrEqual -  (optional)</li>
          *   <li>userIdEquals -  (optional)</li>
          *   <li>userIdNotEquals -  (optional)</li>
          *   <li>userIdSpecified -  (optional)</li>
          *   <li>userIdIn -  (optional)</li>
          *   <li>userIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
          *   <li>page - Zero-based page index (0..N) (optional, default to 0)</li>
          *   <li>size - The size of the page to be returned (optional, default to 20)</li>
          *   <li>sort - Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
      *   </ul>
          * @return List&lt;UserStatisticsDTO&gt;
      */
      @RequestLine("GET /api/user-statistics?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&totalTrips.greaterThan={totalTripsGreaterThan}&totalTrips.lessThan={totalTripsLessThan}&totalTrips.greaterThanOrEqual={totalTripsGreaterThanOrEqual}&totalTrips.lessThanOrEqual={totalTripsLessThanOrEqual}&totalTrips.equals={totalTripsEquals}&totalTrips.notEquals={totalTripsNotEquals}&totalTrips.specified={totalTripsSpecified}&totalTrips.in={totalTripsIn}&totalTrips.notIn={totalTripsNotIn}&totalSpent.greaterThan={totalSpentGreaterThan}&totalSpent.lessThan={totalSpentLessThan}&totalSpent.greaterThanOrEqual={totalSpentGreaterThanOrEqual}&totalSpent.lessThanOrEqual={totalSpentLessThanOrEqual}&totalSpent.equals={totalSpentEquals}&totalSpent.notEquals={totalSpentNotEquals}&totalSpent.specified={totalSpentSpecified}&totalSpent.in={totalSpentIn}&totalSpent.notIn={totalSpentNotIn}&favoriteRoutes.contains={favoriteRoutesContains}&favoriteRoutes.doesNotContain={favoriteRoutesDoesNotContain}&favoriteRoutes.equals={favoriteRoutesEquals}&favoriteRoutes.notEquals={favoriteRoutesNotEquals}&favoriteRoutes.specified={favoriteRoutesSpecified}&favoriteRoutes.in={favoriteRoutesIn}&favoriteRoutes.notIn={favoriteRoutesNotIn}&preferredVehicleTypes.contains={preferredVehicleTypesContains}&preferredVehicleTypes.doesNotContain={preferredVehicleTypesDoesNotContain}&preferredVehicleTypes.equals={preferredVehicleTypesEquals}&preferredVehicleTypes.notEquals={preferredVehicleTypesNotEquals}&preferredVehicleTypes.specified={preferredVehicleTypesSpecified}&preferredVehicleTypes.in={preferredVehicleTypesIn}&preferredVehicleTypes.notIn={preferredVehicleTypesNotIn}&averageTripDuration.greaterThan={averageTripDurationGreaterThan}&averageTripDuration.lessThan={averageTripDurationLessThan}&averageTripDuration.greaterThanOrEqual={averageTripDurationGreaterThanOrEqual}&averageTripDuration.lessThanOrEqual={averageTripDurationLessThanOrEqual}&averageTripDuration.equals={averageTripDurationEquals}&averageTripDuration.notEquals={averageTripDurationNotEquals}&averageTripDuration.specified={averageTripDurationSpecified}&averageTripDuration.in={averageTripDurationIn}&averageTripDuration.notIn={averageTripDurationNotIn}&lastTravelDate.greaterThan={lastTravelDateGreaterThan}&lastTravelDate.lessThan={lastTravelDateLessThan}&lastTravelDate.greaterThanOrEqual={lastTravelDateGreaterThanOrEqual}&lastTravelDate.lessThanOrEqual={lastTravelDateLessThanOrEqual}&lastTravelDate.equals={lastTravelDateEquals}&lastTravelDate.notEquals={lastTravelDateNotEquals}&lastTravelDate.specified={lastTravelDateSpecified}&lastTravelDate.in={lastTravelDateIn}&lastTravelDate.notIn={lastTravelDateNotIn}&bookingFrequency.contains={bookingFrequencyContains}&bookingFrequency.doesNotContain={bookingFrequencyDoesNotContain}&bookingFrequency.equals={bookingFrequencyEquals}&bookingFrequency.notEquals={bookingFrequencyNotEquals}&bookingFrequency.specified={bookingFrequencySpecified}&bookingFrequency.in={bookingFrequencyIn}&bookingFrequency.notIn={bookingFrequencyNotIn}&loyaltyPoints.greaterThan={loyaltyPointsGreaterThan}&loyaltyPoints.lessThan={loyaltyPointsLessThan}&loyaltyPoints.greaterThanOrEqual={loyaltyPointsGreaterThanOrEqual}&loyaltyPoints.lessThanOrEqual={loyaltyPointsLessThanOrEqual}&loyaltyPoints.equals={loyaltyPointsEquals}&loyaltyPoints.notEquals={loyaltyPointsNotEquals}&loyaltyPoints.specified={loyaltyPointsSpecified}&loyaltyPoints.in={loyaltyPointsIn}&loyaltyPoints.notIn={loyaltyPointsNotIn}&mostFrequentOrigin.contains={mostFrequentOriginContains}&mostFrequentOrigin.doesNotContain={mostFrequentOriginDoesNotContain}&mostFrequentOrigin.equals={mostFrequentOriginEquals}&mostFrequentOrigin.notEquals={mostFrequentOriginNotEquals}&mostFrequentOrigin.specified={mostFrequentOriginSpecified}&mostFrequentOrigin.in={mostFrequentOriginIn}&mostFrequentOrigin.notIn={mostFrequentOriginNotIn}&mostFrequentDestination.contains={mostFrequentDestinationContains}&mostFrequentDestination.doesNotContain={mostFrequentDestinationDoesNotContain}&mostFrequentDestination.equals={mostFrequentDestinationEquals}&mostFrequentDestination.notEquals={mostFrequentDestinationNotEquals}&mostFrequentDestination.specified={mostFrequentDestinationSpecified}&mostFrequentDestination.in={mostFrequentDestinationIn}&mostFrequentDestination.notIn={mostFrequentDestinationNotIn}&averageTripDistance.greaterThan={averageTripDistanceGreaterThan}&averageTripDistance.lessThan={averageTripDistanceLessThan}&averageTripDistance.greaterThanOrEqual={averageTripDistanceGreaterThanOrEqual}&averageTripDistance.lessThanOrEqual={averageTripDistanceLessThanOrEqual}&averageTripDistance.equals={averageTripDistanceEquals}&averageTripDistance.notEquals={averageTripDistanceNotEquals}&averageTripDistance.specified={averageTripDistanceSpecified}&averageTripDistance.in={averageTripDistanceIn}&averageTripDistance.notIn={averageTripDistanceNotIn}&peakTravelTime.contains={peakTravelTimeContains}&peakTravelTime.doesNotContain={peakTravelTimeDoesNotContain}&peakTravelTime.equals={peakTravelTimeEquals}&peakTravelTime.notEquals={peakTravelTimeNotEquals}&peakTravelTime.specified={peakTravelTimeSpecified}&peakTravelTime.in={peakTravelTimeIn}&peakTravelTime.notIn={peakTravelTimeNotIn}&weekendTrips.greaterThan={weekendTripsGreaterThan}&weekendTrips.lessThan={weekendTripsLessThan}&weekendTrips.greaterThanOrEqual={weekendTripsGreaterThanOrEqual}&weekendTrips.lessThanOrEqual={weekendTripsLessThanOrEqual}&weekendTrips.equals={weekendTripsEquals}&weekendTrips.notEquals={weekendTripsNotEquals}&weekendTrips.specified={weekendTripsSpecified}&weekendTrips.in={weekendTripsIn}&weekendTrips.notIn={weekendTripsNotIn}&holidayTrips.greaterThan={holidayTripsGreaterThan}&holidayTrips.lessThan={holidayTripsLessThan}&holidayTrips.greaterThanOrEqual={holidayTripsGreaterThanOrEqual}&holidayTrips.lessThanOrEqual={holidayTripsLessThanOrEqual}&holidayTrips.equals={holidayTripsEquals}&holidayTrips.notEquals={holidayTripsNotEquals}&holidayTrips.specified={holidayTripsSpecified}&holidayTrips.in={holidayTripsIn}&holidayTrips.notIn={holidayTripsNotIn}&cancelledTrips.greaterThan={cancelledTripsGreaterThan}&cancelledTrips.lessThan={cancelledTripsLessThan}&cancelledTrips.greaterThanOrEqual={cancelledTripsGreaterThanOrEqual}&cancelledTrips.lessThanOrEqual={cancelledTripsLessThanOrEqual}&cancelledTrips.equals={cancelledTripsEquals}&cancelledTrips.notEquals={cancelledTripsNotEquals}&cancelledTrips.specified={cancelledTripsSpecified}&cancelledTrips.in={cancelledTripsIn}&cancelledTrips.notIn={cancelledTripsNotIn}&onTimePerformanceRate.greaterThan={onTimePerformanceRateGreaterThan}&onTimePerformanceRate.lessThan={onTimePerformanceRateLessThan}&onTimePerformanceRate.greaterThanOrEqual={onTimePerformanceRateGreaterThanOrEqual}&onTimePerformanceRate.lessThanOrEqual={onTimePerformanceRateLessThanOrEqual}&onTimePerformanceRate.equals={onTimePerformanceRateEquals}&onTimePerformanceRate.notEquals={onTimePerformanceRateNotEquals}&onTimePerformanceRate.specified={onTimePerformanceRateSpecified}&onTimePerformanceRate.in={onTimePerformanceRateIn}&onTimePerformanceRate.notIn={onTimePerformanceRateNotIn}&preferredSeatTypes.contains={preferredSeatTypesContains}&preferredSeatTypes.doesNotContain={preferredSeatTypesDoesNotContain}&preferredSeatTypes.equals={preferredSeatTypesEquals}&preferredSeatTypes.notEquals={preferredSeatTypesNotEquals}&preferredSeatTypes.specified={preferredSeatTypesSpecified}&preferredSeatTypes.in={preferredSeatTypesIn}&preferredSeatTypes.notIn={preferredSeatTypesNotIn}&monthlyTripCount.greaterThan={monthlyTripCountGreaterThan}&monthlyTripCount.lessThan={monthlyTripCountLessThan}&monthlyTripCount.greaterThanOrEqual={monthlyTripCountGreaterThanOrEqual}&monthlyTripCount.lessThanOrEqual={monthlyTripCountLessThanOrEqual}&monthlyTripCount.equals={monthlyTripCountEquals}&monthlyTripCount.notEquals={monthlyTripCountNotEquals}&monthlyTripCount.specified={monthlyTripCountSpecified}&monthlyTripCount.in={monthlyTripCountIn}&monthlyTripCount.notIn={monthlyTripCountNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<UserStatisticsDTO>> getAllUserStatisticsWithHttpInfo(@QueryMap(encoded=true) GetAllUserStatisticsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllUserStatistics</code> method in a fluent style.
   */
  public static class GetAllUserStatisticsQueryParams extends HashMap<String, Object> {
    public GetAllUserStatisticsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalTripsGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("totalTrips.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalTripsLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("totalTrips.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalTripsGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("totalTrips.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalTripsLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("totalTrips.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalTripsEquals(@jakarta.annotation.Nullable final Integer value) {
      put("totalTrips.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalTripsNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("totalTrips.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalTripsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("totalTrips.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalTripsIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("totalTrips.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalTripsNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("totalTrips.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalSpentGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalSpent.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalSpentLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalSpent.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalSpentGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalSpent.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalSpentLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalSpent.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalSpentEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalSpent.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalSpentNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalSpent.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalSpentSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("totalSpent.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalSpentIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("totalSpent.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams totalSpentNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("totalSpent.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams favoriteRoutesContains(@jakarta.annotation.Nullable final String value) {
      put("favoriteRoutes.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams favoriteRoutesDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("favoriteRoutes.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams favoriteRoutesEquals(@jakarta.annotation.Nullable final String value) {
      put("favoriteRoutes.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams favoriteRoutesNotEquals(@jakarta.annotation.Nullable final String value) {
      put("favoriteRoutes.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams favoriteRoutesSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("favoriteRoutes.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams favoriteRoutesIn(@jakarta.annotation.Nullable final List<String> value) {
      put("favoriteRoutes.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams favoriteRoutesNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("favoriteRoutes.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams preferredVehicleTypesContains(@jakarta.annotation.Nullable final String value) {
      put("preferredVehicleTypes.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams preferredVehicleTypesDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("preferredVehicleTypes.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams preferredVehicleTypesEquals(@jakarta.annotation.Nullable final String value) {
      put("preferredVehicleTypes.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams preferredVehicleTypesNotEquals(@jakarta.annotation.Nullable final String value) {
      put("preferredVehicleTypes.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams preferredVehicleTypesSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("preferredVehicleTypes.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams preferredVehicleTypesIn(@jakarta.annotation.Nullable final List<String> value) {
      put("preferredVehicleTypes.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams preferredVehicleTypesNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("preferredVehicleTypes.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDurationGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("averageTripDuration.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDurationLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("averageTripDuration.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDurationGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("averageTripDuration.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDurationLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("averageTripDuration.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDurationEquals(@jakarta.annotation.Nullable final Integer value) {
      put("averageTripDuration.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDurationNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("averageTripDuration.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDurationSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("averageTripDuration.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDurationIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("averageTripDuration.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDurationNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("averageTripDuration.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams lastTravelDateGreaterThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("lastTravelDate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams lastTravelDateLessThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("lastTravelDate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams lastTravelDateGreaterThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("lastTravelDate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams lastTravelDateLessThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("lastTravelDate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams lastTravelDateEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("lastTravelDate.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams lastTravelDateNotEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("lastTravelDate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams lastTravelDateSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("lastTravelDate.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams lastTravelDateIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("lastTravelDate.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams lastTravelDateNotIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("lastTravelDate.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams bookingFrequencyContains(@jakarta.annotation.Nullable final String value) {
      put("bookingFrequency.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams bookingFrequencyDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("bookingFrequency.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams bookingFrequencyEquals(@jakarta.annotation.Nullable final String value) {
      put("bookingFrequency.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams bookingFrequencyNotEquals(@jakarta.annotation.Nullable final String value) {
      put("bookingFrequency.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams bookingFrequencySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("bookingFrequency.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams bookingFrequencyIn(@jakarta.annotation.Nullable final List<String> value) {
      put("bookingFrequency.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams bookingFrequencyNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("bookingFrequency.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams loyaltyPointsGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("loyaltyPoints.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams loyaltyPointsLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("loyaltyPoints.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams loyaltyPointsGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("loyaltyPoints.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams loyaltyPointsLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("loyaltyPoints.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams loyaltyPointsEquals(@jakarta.annotation.Nullable final Integer value) {
      put("loyaltyPoints.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams loyaltyPointsNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("loyaltyPoints.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams loyaltyPointsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("loyaltyPoints.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams loyaltyPointsIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("loyaltyPoints.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams loyaltyPointsNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("loyaltyPoints.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams mostFrequentOriginContains(@jakarta.annotation.Nullable final String value) {
      put("mostFrequentOrigin.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams mostFrequentOriginDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("mostFrequentOrigin.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams mostFrequentOriginEquals(@jakarta.annotation.Nullable final String value) {
      put("mostFrequentOrigin.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams mostFrequentOriginNotEquals(@jakarta.annotation.Nullable final String value) {
      put("mostFrequentOrigin.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams mostFrequentOriginSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("mostFrequentOrigin.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams mostFrequentOriginIn(@jakarta.annotation.Nullable final List<String> value) {
      put("mostFrequentOrigin.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams mostFrequentOriginNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("mostFrequentOrigin.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams mostFrequentDestinationContains(@jakarta.annotation.Nullable final String value) {
      put("mostFrequentDestination.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams mostFrequentDestinationDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("mostFrequentDestination.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams mostFrequentDestinationEquals(@jakarta.annotation.Nullable final String value) {
      put("mostFrequentDestination.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams mostFrequentDestinationNotEquals(@jakarta.annotation.Nullable final String value) {
      put("mostFrequentDestination.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams mostFrequentDestinationSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("mostFrequentDestination.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams mostFrequentDestinationIn(@jakarta.annotation.Nullable final List<String> value) {
      put("mostFrequentDestination.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams mostFrequentDestinationNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("mostFrequentDestination.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDistanceGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averageTripDistance.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDistanceLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averageTripDistance.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDistanceGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averageTripDistance.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDistanceLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averageTripDistance.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDistanceEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averageTripDistance.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDistanceNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averageTripDistance.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDistanceSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("averageTripDistance.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDistanceIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("averageTripDistance.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams averageTripDistanceNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("averageTripDistance.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams peakTravelTimeContains(@jakarta.annotation.Nullable final String value) {
      put("peakTravelTime.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams peakTravelTimeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("peakTravelTime.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams peakTravelTimeEquals(@jakarta.annotation.Nullable final String value) {
      put("peakTravelTime.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams peakTravelTimeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("peakTravelTime.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams peakTravelTimeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("peakTravelTime.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams peakTravelTimeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("peakTravelTime.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams peakTravelTimeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("peakTravelTime.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams weekendTripsGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("weekendTrips.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams weekendTripsLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("weekendTrips.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams weekendTripsGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("weekendTrips.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams weekendTripsLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("weekendTrips.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams weekendTripsEquals(@jakarta.annotation.Nullable final Integer value) {
      put("weekendTrips.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams weekendTripsNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("weekendTrips.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams weekendTripsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("weekendTrips.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams weekendTripsIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("weekendTrips.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams weekendTripsNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("weekendTrips.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams holidayTripsGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("holidayTrips.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams holidayTripsLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("holidayTrips.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams holidayTripsGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("holidayTrips.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams holidayTripsLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("holidayTrips.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams holidayTripsEquals(@jakarta.annotation.Nullable final Integer value) {
      put("holidayTrips.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams holidayTripsNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("holidayTrips.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams holidayTripsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("holidayTrips.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams holidayTripsIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("holidayTrips.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams holidayTripsNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("holidayTrips.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams cancelledTripsGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("cancelledTrips.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams cancelledTripsLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("cancelledTrips.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams cancelledTripsGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("cancelledTrips.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams cancelledTripsLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("cancelledTrips.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams cancelledTripsEquals(@jakarta.annotation.Nullable final Integer value) {
      put("cancelledTrips.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams cancelledTripsNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("cancelledTrips.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams cancelledTripsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("cancelledTrips.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams cancelledTripsIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("cancelledTrips.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams cancelledTripsNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("cancelledTrips.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams onTimePerformanceRateGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("onTimePerformanceRate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams onTimePerformanceRateLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("onTimePerformanceRate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams onTimePerformanceRateGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("onTimePerformanceRate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams onTimePerformanceRateLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("onTimePerformanceRate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams onTimePerformanceRateEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("onTimePerformanceRate.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams onTimePerformanceRateNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("onTimePerformanceRate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams onTimePerformanceRateSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("onTimePerformanceRate.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams onTimePerformanceRateIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("onTimePerformanceRate.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams onTimePerformanceRateNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("onTimePerformanceRate.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams preferredSeatTypesContains(@jakarta.annotation.Nullable final String value) {
      put("preferredSeatTypes.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams preferredSeatTypesDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("preferredSeatTypes.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams preferredSeatTypesEquals(@jakarta.annotation.Nullable final String value) {
      put("preferredSeatTypes.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams preferredSeatTypesNotEquals(@jakarta.annotation.Nullable final String value) {
      put("preferredSeatTypes.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams preferredSeatTypesSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("preferredSeatTypes.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams preferredSeatTypesIn(@jakarta.annotation.Nullable final List<String> value) {
      put("preferredSeatTypes.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams preferredSeatTypesNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("preferredSeatTypes.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams monthlyTripCountGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("monthlyTripCount.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams monthlyTripCountLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("monthlyTripCount.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams monthlyTripCountGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("monthlyTripCount.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams monthlyTripCountLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("monthlyTripCount.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams monthlyTripCountEquals(@jakarta.annotation.Nullable final Integer value) {
      put("monthlyTripCount.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams monthlyTripCountNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("monthlyTripCount.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams monthlyTripCountSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("monthlyTripCount.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams monthlyTripCountIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("monthlyTripCount.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams monthlyTripCountNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("monthlyTripCount.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams userIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("userId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams userIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("userId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams userIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("userId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams userIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("userId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams userIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("userId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams userIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("userId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams userIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("userId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams userIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("userId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams userIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("userId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserStatisticsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams page(@jakarta.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams size(@jakarta.annotation.Nullable final Integer value) {
      put("size", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserStatisticsQueryParams sort(@jakarta.annotation.Nullable final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return UserStatisticsDTO
   */
  @RequestLine("GET /api/user-statistics/{id}")
  @Headers({
    "Accept: */*",
  })
  UserStatisticsDTO getUserStatistics(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getUserStatistics</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/user-statistics/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<UserStatisticsDTO> getUserStatisticsWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param userStatisticsDTO  (required)
   * @return UserStatisticsDTO
   */
  @RequestLine("PATCH /api/user-statistics/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  UserStatisticsDTO partialUpdateUserStatistics(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull UserStatisticsDTO userStatisticsDTO);

  /**
   * 
   * Similar to <code>partialUpdateUserStatistics</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param userStatisticsDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/user-statistics/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<UserStatisticsDTO> partialUpdateUserStatisticsWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull UserStatisticsDTO userStatisticsDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param userStatisticsDTO  (required)
   * @return UserStatisticsDTO
   */
  @RequestLine("PUT /api/user-statistics/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  UserStatisticsDTO updateUserStatistics(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull UserStatisticsDTO userStatisticsDTO);

  /**
   * 
   * Similar to <code>updateUserStatistics</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param userStatisticsDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/user-statistics/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<UserStatisticsDTO> updateUserStatisticsWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull UserStatisticsDTO userStatisticsDTO);


}
