package com.ridehub.feign.msuser.client.api;

import com.ridehub.feign.msuser.client.invoker.ApiClient;
import com.ridehub.feign.msuser.client.invoker.EncodingUtils;
import com.ridehub.feign.msuser.client.model.ApiResponse;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.ridehub.feign.msuser.client.model.TripStatisticsDTO;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface TripStatisticsResourceMsuserApi extends ApiClient.Api {


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
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param vehicleTypeEquals  (optional)
   * @param vehicleTypeNotEquals  (optional)
   * @param vehicleTypeSpecified  (optional)
   * @param vehicleTypeIn  (optional)
   * @param vehicleTypeNotIn  (optional)
   * @param occasionTypeEquals  (optional)
   * @param occasionTypeNotEquals  (optional)
   * @param occasionTypeSpecified  (optional)
   * @param occasionTypeIn  (optional)
   * @param occasionTypeNotIn  (optional)
   * @param totalBookingsGreaterThan  (optional)
   * @param totalBookingsLessThan  (optional)
   * @param totalBookingsGreaterThanOrEqual  (optional)
   * @param totalBookingsLessThanOrEqual  (optional)
   * @param totalBookingsEquals  (optional)
   * @param totalBookingsNotEquals  (optional)
   * @param totalBookingsSpecified  (optional)
   * @param totalBookingsIn  (optional)
   * @param totalBookingsNotIn  (optional)
   * @param totalRevenueGreaterThan  (optional)
   * @param totalRevenueLessThan  (optional)
   * @param totalRevenueGreaterThanOrEqual  (optional)
   * @param totalRevenueLessThanOrEqual  (optional)
   * @param totalRevenueEquals  (optional)
   * @param totalRevenueNotEquals  (optional)
   * @param totalRevenueSpecified  (optional)
   * @param totalRevenueIn  (optional)
   * @param totalRevenueNotIn  (optional)
   * @param averagePriceGreaterThan  (optional)
   * @param averagePriceLessThan  (optional)
   * @param averagePriceGreaterThanOrEqual  (optional)
   * @param averagePriceLessThanOrEqual  (optional)
   * @param averagePriceEquals  (optional)
   * @param averagePriceNotEquals  (optional)
   * @param averagePriceSpecified  (optional)
   * @param averagePriceIn  (optional)
   * @param averagePriceNotIn  (optional)
   * @param occupancyRateGreaterThan  (optional)
   * @param occupancyRateLessThan  (optional)
   * @param occupancyRateGreaterThanOrEqual  (optional)
   * @param occupancyRateLessThanOrEqual  (optional)
   * @param occupancyRateEquals  (optional)
   * @param occupancyRateNotEquals  (optional)
   * @param occupancyRateSpecified  (optional)
   * @param occupancyRateIn  (optional)
   * @param occupancyRateNotIn  (optional)
   * @param popularSeatTypesContains  (optional)
   * @param popularSeatTypesDoesNotContain  (optional)
   * @param popularSeatTypesEquals  (optional)
   * @param popularSeatTypesNotEquals  (optional)
   * @param popularSeatTypesSpecified  (optional)
   * @param popularSeatTypesIn  (optional)
   * @param popularSeatTypesNotIn  (optional)
   * @param peakTravelTimesContains  (optional)
   * @param peakTravelTimesDoesNotContain  (optional)
   * @param peakTravelTimesEquals  (optional)
   * @param peakTravelTimesNotEquals  (optional)
   * @param peakTravelTimesSpecified  (optional)
   * @param peakTravelTimesIn  (optional)
   * @param peakTravelTimesNotIn  (optional)
   * @param cancellationRateGreaterThan  (optional)
   * @param cancellationRateLessThan  (optional)
   * @param cancellationRateGreaterThanOrEqual  (optional)
   * @param cancellationRateLessThanOrEqual  (optional)
   * @param cancellationRateEquals  (optional)
   * @param cancellationRateNotEquals  (optional)
   * @param cancellationRateSpecified  (optional)
   * @param cancellationRateIn  (optional)
   * @param cancellationRateNotIn  (optional)
   * @param customerSatisfactionScoreGreaterThan  (optional)
   * @param customerSatisfactionScoreLessThan  (optional)
   * @param customerSatisfactionScoreGreaterThanOrEqual  (optional)
   * @param customerSatisfactionScoreLessThanOrEqual  (optional)
   * @param customerSatisfactionScoreEquals  (optional)
   * @param customerSatisfactionScoreNotEquals  (optional)
   * @param customerSatisfactionScoreSpecified  (optional)
   * @param customerSatisfactionScoreIn  (optional)
   * @param customerSatisfactionScoreNotIn  (optional)
   * @param monthlyTrendContains  (optional)
   * @param monthlyTrendDoesNotContain  (optional)
   * @param monthlyTrendEquals  (optional)
   * @param monthlyTrendNotEquals  (optional)
   * @param monthlyTrendSpecified  (optional)
   * @param monthlyTrendIn  (optional)
   * @param monthlyTrendNotIn  (optional)
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
   * @param distinct  (optional)
   * @return Long
   */
  @RequestLine("GET /api/trip-statistics/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&occasionType.equals={occasionTypeEquals}&occasionType.notEquals={occasionTypeNotEquals}&occasionType.specified={occasionTypeSpecified}&occasionType.in={occasionTypeIn}&occasionType.notIn={occasionTypeNotIn}&totalBookings.greaterThan={totalBookingsGreaterThan}&totalBookings.lessThan={totalBookingsLessThan}&totalBookings.greaterThanOrEqual={totalBookingsGreaterThanOrEqual}&totalBookings.lessThanOrEqual={totalBookingsLessThanOrEqual}&totalBookings.equals={totalBookingsEquals}&totalBookings.notEquals={totalBookingsNotEquals}&totalBookings.specified={totalBookingsSpecified}&totalBookings.in={totalBookingsIn}&totalBookings.notIn={totalBookingsNotIn}&totalRevenue.greaterThan={totalRevenueGreaterThan}&totalRevenue.lessThan={totalRevenueLessThan}&totalRevenue.greaterThanOrEqual={totalRevenueGreaterThanOrEqual}&totalRevenue.lessThanOrEqual={totalRevenueLessThanOrEqual}&totalRevenue.equals={totalRevenueEquals}&totalRevenue.notEquals={totalRevenueNotEquals}&totalRevenue.specified={totalRevenueSpecified}&totalRevenue.in={totalRevenueIn}&totalRevenue.notIn={totalRevenueNotIn}&averagePrice.greaterThan={averagePriceGreaterThan}&averagePrice.lessThan={averagePriceLessThan}&averagePrice.greaterThanOrEqual={averagePriceGreaterThanOrEqual}&averagePrice.lessThanOrEqual={averagePriceLessThanOrEqual}&averagePrice.equals={averagePriceEquals}&averagePrice.notEquals={averagePriceNotEquals}&averagePrice.specified={averagePriceSpecified}&averagePrice.in={averagePriceIn}&averagePrice.notIn={averagePriceNotIn}&occupancyRate.greaterThan={occupancyRateGreaterThan}&occupancyRate.lessThan={occupancyRateLessThan}&occupancyRate.greaterThanOrEqual={occupancyRateGreaterThanOrEqual}&occupancyRate.lessThanOrEqual={occupancyRateLessThanOrEqual}&occupancyRate.equals={occupancyRateEquals}&occupancyRate.notEquals={occupancyRateNotEquals}&occupancyRate.specified={occupancyRateSpecified}&occupancyRate.in={occupancyRateIn}&occupancyRate.notIn={occupancyRateNotIn}&popularSeatTypes.contains={popularSeatTypesContains}&popularSeatTypes.doesNotContain={popularSeatTypesDoesNotContain}&popularSeatTypes.equals={popularSeatTypesEquals}&popularSeatTypes.notEquals={popularSeatTypesNotEquals}&popularSeatTypes.specified={popularSeatTypesSpecified}&popularSeatTypes.in={popularSeatTypesIn}&popularSeatTypes.notIn={popularSeatTypesNotIn}&peakTravelTimes.contains={peakTravelTimesContains}&peakTravelTimes.doesNotContain={peakTravelTimesDoesNotContain}&peakTravelTimes.equals={peakTravelTimesEquals}&peakTravelTimes.notEquals={peakTravelTimesNotEquals}&peakTravelTimes.specified={peakTravelTimesSpecified}&peakTravelTimes.in={peakTravelTimesIn}&peakTravelTimes.notIn={peakTravelTimesNotIn}&cancellationRate.greaterThan={cancellationRateGreaterThan}&cancellationRate.lessThan={cancellationRateLessThan}&cancellationRate.greaterThanOrEqual={cancellationRateGreaterThanOrEqual}&cancellationRate.lessThanOrEqual={cancellationRateLessThanOrEqual}&cancellationRate.equals={cancellationRateEquals}&cancellationRate.notEquals={cancellationRateNotEquals}&cancellationRate.specified={cancellationRateSpecified}&cancellationRate.in={cancellationRateIn}&cancellationRate.notIn={cancellationRateNotIn}&customerSatisfactionScore.greaterThan={customerSatisfactionScoreGreaterThan}&customerSatisfactionScore.lessThan={customerSatisfactionScoreLessThan}&customerSatisfactionScore.greaterThanOrEqual={customerSatisfactionScoreGreaterThanOrEqual}&customerSatisfactionScore.lessThanOrEqual={customerSatisfactionScoreLessThanOrEqual}&customerSatisfactionScore.equals={customerSatisfactionScoreEquals}&customerSatisfactionScore.notEquals={customerSatisfactionScoreNotEquals}&customerSatisfactionScore.specified={customerSatisfactionScoreSpecified}&customerSatisfactionScore.in={customerSatisfactionScoreIn}&customerSatisfactionScore.notIn={customerSatisfactionScoreNotIn}&monthlyTrend.contains={monthlyTrendContains}&monthlyTrend.doesNotContain={monthlyTrendDoesNotContain}&monthlyTrend.equals={monthlyTrendEquals}&monthlyTrend.notEquals={monthlyTrendNotEquals}&monthlyTrend.specified={monthlyTrendSpecified}&monthlyTrend.in={monthlyTrendIn}&monthlyTrend.notIn={monthlyTrendNotIn}&validFrom.greaterThan={validFromGreaterThan}&validFrom.lessThan={validFromLessThan}&validFrom.greaterThanOrEqual={validFromGreaterThanOrEqual}&validFrom.lessThanOrEqual={validFromLessThanOrEqual}&validFrom.equals={validFromEquals}&validFrom.notEquals={validFromNotEquals}&validFrom.specified={validFromSpecified}&validFrom.in={validFromIn}&validFrom.notIn={validFromNotIn}&validTo.greaterThan={validToGreaterThan}&validTo.lessThan={validToLessThan}&validTo.greaterThanOrEqual={validToGreaterThanOrEqual}&validTo.lessThanOrEqual={validToLessThanOrEqual}&validTo.equals={validToEquals}&validTo.notEquals={validToNotEquals}&validTo.specified={validToSpecified}&validTo.in={validToIn}&validTo.notIn={validToNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countTripStatistics(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("vehicleTypeEquals") @jakarta.annotation.Nullable String vehicleTypeEquals, @Param("vehicleTypeNotEquals") @jakarta.annotation.Nullable String vehicleTypeNotEquals, @Param("vehicleTypeSpecified") @jakarta.annotation.Nullable Boolean vehicleTypeSpecified, @Param("vehicleTypeIn") @jakarta.annotation.Nullable List<String> vehicleTypeIn, @Param("vehicleTypeNotIn") @jakarta.annotation.Nullable List<String> vehicleTypeNotIn, @Param("occasionTypeEquals") @jakarta.annotation.Nullable String occasionTypeEquals, @Param("occasionTypeNotEquals") @jakarta.annotation.Nullable String occasionTypeNotEquals, @Param("occasionTypeSpecified") @jakarta.annotation.Nullable Boolean occasionTypeSpecified, @Param("occasionTypeIn") @jakarta.annotation.Nullable List<String> occasionTypeIn, @Param("occasionTypeNotIn") @jakarta.annotation.Nullable List<String> occasionTypeNotIn, @Param("totalBookingsGreaterThan") @jakarta.annotation.Nullable Integer totalBookingsGreaterThan, @Param("totalBookingsLessThan") @jakarta.annotation.Nullable Integer totalBookingsLessThan, @Param("totalBookingsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer totalBookingsGreaterThanOrEqual, @Param("totalBookingsLessThanOrEqual") @jakarta.annotation.Nullable Integer totalBookingsLessThanOrEqual, @Param("totalBookingsEquals") @jakarta.annotation.Nullable Integer totalBookingsEquals, @Param("totalBookingsNotEquals") @jakarta.annotation.Nullable Integer totalBookingsNotEquals, @Param("totalBookingsSpecified") @jakarta.annotation.Nullable Boolean totalBookingsSpecified, @Param("totalBookingsIn") @jakarta.annotation.Nullable List<Integer> totalBookingsIn, @Param("totalBookingsNotIn") @jakarta.annotation.Nullable List<Integer> totalBookingsNotIn, @Param("totalRevenueGreaterThan") @jakarta.annotation.Nullable BigDecimal totalRevenueGreaterThan, @Param("totalRevenueLessThan") @jakarta.annotation.Nullable BigDecimal totalRevenueLessThan, @Param("totalRevenueGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal totalRevenueGreaterThanOrEqual, @Param("totalRevenueLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal totalRevenueLessThanOrEqual, @Param("totalRevenueEquals") @jakarta.annotation.Nullable BigDecimal totalRevenueEquals, @Param("totalRevenueNotEquals") @jakarta.annotation.Nullable BigDecimal totalRevenueNotEquals, @Param("totalRevenueSpecified") @jakarta.annotation.Nullable Boolean totalRevenueSpecified, @Param("totalRevenueIn") @jakarta.annotation.Nullable List<BigDecimal> totalRevenueIn, @Param("totalRevenueNotIn") @jakarta.annotation.Nullable List<BigDecimal> totalRevenueNotIn, @Param("averagePriceGreaterThan") @jakarta.annotation.Nullable BigDecimal averagePriceGreaterThan, @Param("averagePriceLessThan") @jakarta.annotation.Nullable BigDecimal averagePriceLessThan, @Param("averagePriceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal averagePriceGreaterThanOrEqual, @Param("averagePriceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal averagePriceLessThanOrEqual, @Param("averagePriceEquals") @jakarta.annotation.Nullable BigDecimal averagePriceEquals, @Param("averagePriceNotEquals") @jakarta.annotation.Nullable BigDecimal averagePriceNotEquals, @Param("averagePriceSpecified") @jakarta.annotation.Nullable Boolean averagePriceSpecified, @Param("averagePriceIn") @jakarta.annotation.Nullable List<BigDecimal> averagePriceIn, @Param("averagePriceNotIn") @jakarta.annotation.Nullable List<BigDecimal> averagePriceNotIn, @Param("occupancyRateGreaterThan") @jakarta.annotation.Nullable BigDecimal occupancyRateGreaterThan, @Param("occupancyRateLessThan") @jakarta.annotation.Nullable BigDecimal occupancyRateLessThan, @Param("occupancyRateGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occupancyRateGreaterThanOrEqual, @Param("occupancyRateLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occupancyRateLessThanOrEqual, @Param("occupancyRateEquals") @jakarta.annotation.Nullable BigDecimal occupancyRateEquals, @Param("occupancyRateNotEquals") @jakarta.annotation.Nullable BigDecimal occupancyRateNotEquals, @Param("occupancyRateSpecified") @jakarta.annotation.Nullable Boolean occupancyRateSpecified, @Param("occupancyRateIn") @jakarta.annotation.Nullable List<BigDecimal> occupancyRateIn, @Param("occupancyRateNotIn") @jakarta.annotation.Nullable List<BigDecimal> occupancyRateNotIn, @Param("popularSeatTypesContains") @jakarta.annotation.Nullable String popularSeatTypesContains, @Param("popularSeatTypesDoesNotContain") @jakarta.annotation.Nullable String popularSeatTypesDoesNotContain, @Param("popularSeatTypesEquals") @jakarta.annotation.Nullable String popularSeatTypesEquals, @Param("popularSeatTypesNotEquals") @jakarta.annotation.Nullable String popularSeatTypesNotEquals, @Param("popularSeatTypesSpecified") @jakarta.annotation.Nullable Boolean popularSeatTypesSpecified, @Param("popularSeatTypesIn") @jakarta.annotation.Nullable List<String> popularSeatTypesIn, @Param("popularSeatTypesNotIn") @jakarta.annotation.Nullable List<String> popularSeatTypesNotIn, @Param("peakTravelTimesContains") @jakarta.annotation.Nullable String peakTravelTimesContains, @Param("peakTravelTimesDoesNotContain") @jakarta.annotation.Nullable String peakTravelTimesDoesNotContain, @Param("peakTravelTimesEquals") @jakarta.annotation.Nullable String peakTravelTimesEquals, @Param("peakTravelTimesNotEquals") @jakarta.annotation.Nullable String peakTravelTimesNotEquals, @Param("peakTravelTimesSpecified") @jakarta.annotation.Nullable Boolean peakTravelTimesSpecified, @Param("peakTravelTimesIn") @jakarta.annotation.Nullable List<String> peakTravelTimesIn, @Param("peakTravelTimesNotIn") @jakarta.annotation.Nullable List<String> peakTravelTimesNotIn, @Param("cancellationRateGreaterThan") @jakarta.annotation.Nullable BigDecimal cancellationRateGreaterThan, @Param("cancellationRateLessThan") @jakarta.annotation.Nullable BigDecimal cancellationRateLessThan, @Param("cancellationRateGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal cancellationRateGreaterThanOrEqual, @Param("cancellationRateLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal cancellationRateLessThanOrEqual, @Param("cancellationRateEquals") @jakarta.annotation.Nullable BigDecimal cancellationRateEquals, @Param("cancellationRateNotEquals") @jakarta.annotation.Nullable BigDecimal cancellationRateNotEquals, @Param("cancellationRateSpecified") @jakarta.annotation.Nullable Boolean cancellationRateSpecified, @Param("cancellationRateIn") @jakarta.annotation.Nullable List<BigDecimal> cancellationRateIn, @Param("cancellationRateNotIn") @jakarta.annotation.Nullable List<BigDecimal> cancellationRateNotIn, @Param("customerSatisfactionScoreGreaterThan") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreGreaterThan, @Param("customerSatisfactionScoreLessThan") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreLessThan, @Param("customerSatisfactionScoreGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreGreaterThanOrEqual, @Param("customerSatisfactionScoreLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreLessThanOrEqual, @Param("customerSatisfactionScoreEquals") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreEquals, @Param("customerSatisfactionScoreNotEquals") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreNotEquals, @Param("customerSatisfactionScoreSpecified") @jakarta.annotation.Nullable Boolean customerSatisfactionScoreSpecified, @Param("customerSatisfactionScoreIn") @jakarta.annotation.Nullable List<BigDecimal> customerSatisfactionScoreIn, @Param("customerSatisfactionScoreNotIn") @jakarta.annotation.Nullable List<BigDecimal> customerSatisfactionScoreNotIn, @Param("monthlyTrendContains") @jakarta.annotation.Nullable String monthlyTrendContains, @Param("monthlyTrendDoesNotContain") @jakarta.annotation.Nullable String monthlyTrendDoesNotContain, @Param("monthlyTrendEquals") @jakarta.annotation.Nullable String monthlyTrendEquals, @Param("monthlyTrendNotEquals") @jakarta.annotation.Nullable String monthlyTrendNotEquals, @Param("monthlyTrendSpecified") @jakarta.annotation.Nullable Boolean monthlyTrendSpecified, @Param("monthlyTrendIn") @jakarta.annotation.Nullable List<String> monthlyTrendIn, @Param("monthlyTrendNotIn") @jakarta.annotation.Nullable List<String> monthlyTrendNotIn, @Param("validFromGreaterThan") @jakarta.annotation.Nullable LocalDate validFromGreaterThan, @Param("validFromLessThan") @jakarta.annotation.Nullable LocalDate validFromLessThan, @Param("validFromGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate validFromGreaterThanOrEqual, @Param("validFromLessThanOrEqual") @jakarta.annotation.Nullable LocalDate validFromLessThanOrEqual, @Param("validFromEquals") @jakarta.annotation.Nullable LocalDate validFromEquals, @Param("validFromNotEquals") @jakarta.annotation.Nullable LocalDate validFromNotEquals, @Param("validFromSpecified") @jakarta.annotation.Nullable Boolean validFromSpecified, @Param("validFromIn") @jakarta.annotation.Nullable List<LocalDate> validFromIn, @Param("validFromNotIn") @jakarta.annotation.Nullable List<LocalDate> validFromNotIn, @Param("validToGreaterThan") @jakarta.annotation.Nullable LocalDate validToGreaterThan, @Param("validToLessThan") @jakarta.annotation.Nullable LocalDate validToLessThan, @Param("validToGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate validToGreaterThanOrEqual, @Param("validToLessThanOrEqual") @jakarta.annotation.Nullable LocalDate validToLessThanOrEqual, @Param("validToEquals") @jakarta.annotation.Nullable LocalDate validToEquals, @Param("validToNotEquals") @jakarta.annotation.Nullable LocalDate validToNotEquals, @Param("validToSpecified") @jakarta.annotation.Nullable Boolean validToSpecified, @Param("validToIn") @jakarta.annotation.Nullable List<LocalDate> validToIn, @Param("validToNotIn") @jakarta.annotation.Nullable List<LocalDate> validToNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countTripStatistics</code> but it also returns the http response headers .
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
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param vehicleTypeEquals  (optional)
   * @param vehicleTypeNotEquals  (optional)
   * @param vehicleTypeSpecified  (optional)
   * @param vehicleTypeIn  (optional)
   * @param vehicleTypeNotIn  (optional)
   * @param occasionTypeEquals  (optional)
   * @param occasionTypeNotEquals  (optional)
   * @param occasionTypeSpecified  (optional)
   * @param occasionTypeIn  (optional)
   * @param occasionTypeNotIn  (optional)
   * @param totalBookingsGreaterThan  (optional)
   * @param totalBookingsLessThan  (optional)
   * @param totalBookingsGreaterThanOrEqual  (optional)
   * @param totalBookingsLessThanOrEqual  (optional)
   * @param totalBookingsEquals  (optional)
   * @param totalBookingsNotEquals  (optional)
   * @param totalBookingsSpecified  (optional)
   * @param totalBookingsIn  (optional)
   * @param totalBookingsNotIn  (optional)
   * @param totalRevenueGreaterThan  (optional)
   * @param totalRevenueLessThan  (optional)
   * @param totalRevenueGreaterThanOrEqual  (optional)
   * @param totalRevenueLessThanOrEqual  (optional)
   * @param totalRevenueEquals  (optional)
   * @param totalRevenueNotEquals  (optional)
   * @param totalRevenueSpecified  (optional)
   * @param totalRevenueIn  (optional)
   * @param totalRevenueNotIn  (optional)
   * @param averagePriceGreaterThan  (optional)
   * @param averagePriceLessThan  (optional)
   * @param averagePriceGreaterThanOrEqual  (optional)
   * @param averagePriceLessThanOrEqual  (optional)
   * @param averagePriceEquals  (optional)
   * @param averagePriceNotEquals  (optional)
   * @param averagePriceSpecified  (optional)
   * @param averagePriceIn  (optional)
   * @param averagePriceNotIn  (optional)
   * @param occupancyRateGreaterThan  (optional)
   * @param occupancyRateLessThan  (optional)
   * @param occupancyRateGreaterThanOrEqual  (optional)
   * @param occupancyRateLessThanOrEqual  (optional)
   * @param occupancyRateEquals  (optional)
   * @param occupancyRateNotEquals  (optional)
   * @param occupancyRateSpecified  (optional)
   * @param occupancyRateIn  (optional)
   * @param occupancyRateNotIn  (optional)
   * @param popularSeatTypesContains  (optional)
   * @param popularSeatTypesDoesNotContain  (optional)
   * @param popularSeatTypesEquals  (optional)
   * @param popularSeatTypesNotEquals  (optional)
   * @param popularSeatTypesSpecified  (optional)
   * @param popularSeatTypesIn  (optional)
   * @param popularSeatTypesNotIn  (optional)
   * @param peakTravelTimesContains  (optional)
   * @param peakTravelTimesDoesNotContain  (optional)
   * @param peakTravelTimesEquals  (optional)
   * @param peakTravelTimesNotEquals  (optional)
   * @param peakTravelTimesSpecified  (optional)
   * @param peakTravelTimesIn  (optional)
   * @param peakTravelTimesNotIn  (optional)
   * @param cancellationRateGreaterThan  (optional)
   * @param cancellationRateLessThan  (optional)
   * @param cancellationRateGreaterThanOrEqual  (optional)
   * @param cancellationRateLessThanOrEqual  (optional)
   * @param cancellationRateEquals  (optional)
   * @param cancellationRateNotEquals  (optional)
   * @param cancellationRateSpecified  (optional)
   * @param cancellationRateIn  (optional)
   * @param cancellationRateNotIn  (optional)
   * @param customerSatisfactionScoreGreaterThan  (optional)
   * @param customerSatisfactionScoreLessThan  (optional)
   * @param customerSatisfactionScoreGreaterThanOrEqual  (optional)
   * @param customerSatisfactionScoreLessThanOrEqual  (optional)
   * @param customerSatisfactionScoreEquals  (optional)
   * @param customerSatisfactionScoreNotEquals  (optional)
   * @param customerSatisfactionScoreSpecified  (optional)
   * @param customerSatisfactionScoreIn  (optional)
   * @param customerSatisfactionScoreNotIn  (optional)
   * @param monthlyTrendContains  (optional)
   * @param monthlyTrendDoesNotContain  (optional)
   * @param monthlyTrendEquals  (optional)
   * @param monthlyTrendNotEquals  (optional)
   * @param monthlyTrendSpecified  (optional)
   * @param monthlyTrendIn  (optional)
   * @param monthlyTrendNotIn  (optional)
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
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/trip-statistics/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&occasionType.equals={occasionTypeEquals}&occasionType.notEquals={occasionTypeNotEquals}&occasionType.specified={occasionTypeSpecified}&occasionType.in={occasionTypeIn}&occasionType.notIn={occasionTypeNotIn}&totalBookings.greaterThan={totalBookingsGreaterThan}&totalBookings.lessThan={totalBookingsLessThan}&totalBookings.greaterThanOrEqual={totalBookingsGreaterThanOrEqual}&totalBookings.lessThanOrEqual={totalBookingsLessThanOrEqual}&totalBookings.equals={totalBookingsEquals}&totalBookings.notEquals={totalBookingsNotEquals}&totalBookings.specified={totalBookingsSpecified}&totalBookings.in={totalBookingsIn}&totalBookings.notIn={totalBookingsNotIn}&totalRevenue.greaterThan={totalRevenueGreaterThan}&totalRevenue.lessThan={totalRevenueLessThan}&totalRevenue.greaterThanOrEqual={totalRevenueGreaterThanOrEqual}&totalRevenue.lessThanOrEqual={totalRevenueLessThanOrEqual}&totalRevenue.equals={totalRevenueEquals}&totalRevenue.notEquals={totalRevenueNotEquals}&totalRevenue.specified={totalRevenueSpecified}&totalRevenue.in={totalRevenueIn}&totalRevenue.notIn={totalRevenueNotIn}&averagePrice.greaterThan={averagePriceGreaterThan}&averagePrice.lessThan={averagePriceLessThan}&averagePrice.greaterThanOrEqual={averagePriceGreaterThanOrEqual}&averagePrice.lessThanOrEqual={averagePriceLessThanOrEqual}&averagePrice.equals={averagePriceEquals}&averagePrice.notEquals={averagePriceNotEquals}&averagePrice.specified={averagePriceSpecified}&averagePrice.in={averagePriceIn}&averagePrice.notIn={averagePriceNotIn}&occupancyRate.greaterThan={occupancyRateGreaterThan}&occupancyRate.lessThan={occupancyRateLessThan}&occupancyRate.greaterThanOrEqual={occupancyRateGreaterThanOrEqual}&occupancyRate.lessThanOrEqual={occupancyRateLessThanOrEqual}&occupancyRate.equals={occupancyRateEquals}&occupancyRate.notEquals={occupancyRateNotEquals}&occupancyRate.specified={occupancyRateSpecified}&occupancyRate.in={occupancyRateIn}&occupancyRate.notIn={occupancyRateNotIn}&popularSeatTypes.contains={popularSeatTypesContains}&popularSeatTypes.doesNotContain={popularSeatTypesDoesNotContain}&popularSeatTypes.equals={popularSeatTypesEquals}&popularSeatTypes.notEquals={popularSeatTypesNotEquals}&popularSeatTypes.specified={popularSeatTypesSpecified}&popularSeatTypes.in={popularSeatTypesIn}&popularSeatTypes.notIn={popularSeatTypesNotIn}&peakTravelTimes.contains={peakTravelTimesContains}&peakTravelTimes.doesNotContain={peakTravelTimesDoesNotContain}&peakTravelTimes.equals={peakTravelTimesEquals}&peakTravelTimes.notEquals={peakTravelTimesNotEquals}&peakTravelTimes.specified={peakTravelTimesSpecified}&peakTravelTimes.in={peakTravelTimesIn}&peakTravelTimes.notIn={peakTravelTimesNotIn}&cancellationRate.greaterThan={cancellationRateGreaterThan}&cancellationRate.lessThan={cancellationRateLessThan}&cancellationRate.greaterThanOrEqual={cancellationRateGreaterThanOrEqual}&cancellationRate.lessThanOrEqual={cancellationRateLessThanOrEqual}&cancellationRate.equals={cancellationRateEquals}&cancellationRate.notEquals={cancellationRateNotEquals}&cancellationRate.specified={cancellationRateSpecified}&cancellationRate.in={cancellationRateIn}&cancellationRate.notIn={cancellationRateNotIn}&customerSatisfactionScore.greaterThan={customerSatisfactionScoreGreaterThan}&customerSatisfactionScore.lessThan={customerSatisfactionScoreLessThan}&customerSatisfactionScore.greaterThanOrEqual={customerSatisfactionScoreGreaterThanOrEqual}&customerSatisfactionScore.lessThanOrEqual={customerSatisfactionScoreLessThanOrEqual}&customerSatisfactionScore.equals={customerSatisfactionScoreEquals}&customerSatisfactionScore.notEquals={customerSatisfactionScoreNotEquals}&customerSatisfactionScore.specified={customerSatisfactionScoreSpecified}&customerSatisfactionScore.in={customerSatisfactionScoreIn}&customerSatisfactionScore.notIn={customerSatisfactionScoreNotIn}&monthlyTrend.contains={monthlyTrendContains}&monthlyTrend.doesNotContain={monthlyTrendDoesNotContain}&monthlyTrend.equals={monthlyTrendEquals}&monthlyTrend.notEquals={monthlyTrendNotEquals}&monthlyTrend.specified={monthlyTrendSpecified}&monthlyTrend.in={monthlyTrendIn}&monthlyTrend.notIn={monthlyTrendNotIn}&validFrom.greaterThan={validFromGreaterThan}&validFrom.lessThan={validFromLessThan}&validFrom.greaterThanOrEqual={validFromGreaterThanOrEqual}&validFrom.lessThanOrEqual={validFromLessThanOrEqual}&validFrom.equals={validFromEquals}&validFrom.notEquals={validFromNotEquals}&validFrom.specified={validFromSpecified}&validFrom.in={validFromIn}&validFrom.notIn={validFromNotIn}&validTo.greaterThan={validToGreaterThan}&validTo.lessThan={validToLessThan}&validTo.greaterThanOrEqual={validToGreaterThanOrEqual}&validTo.lessThanOrEqual={validToLessThanOrEqual}&validTo.equals={validToEquals}&validTo.notEquals={validToNotEquals}&validTo.specified={validToSpecified}&validTo.in={validToIn}&validTo.notIn={validToNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countTripStatisticsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("vehicleTypeEquals") @jakarta.annotation.Nullable String vehicleTypeEquals, @Param("vehicleTypeNotEquals") @jakarta.annotation.Nullable String vehicleTypeNotEquals, @Param("vehicleTypeSpecified") @jakarta.annotation.Nullable Boolean vehicleTypeSpecified, @Param("vehicleTypeIn") @jakarta.annotation.Nullable List<String> vehicleTypeIn, @Param("vehicleTypeNotIn") @jakarta.annotation.Nullable List<String> vehicleTypeNotIn, @Param("occasionTypeEquals") @jakarta.annotation.Nullable String occasionTypeEquals, @Param("occasionTypeNotEquals") @jakarta.annotation.Nullable String occasionTypeNotEquals, @Param("occasionTypeSpecified") @jakarta.annotation.Nullable Boolean occasionTypeSpecified, @Param("occasionTypeIn") @jakarta.annotation.Nullable List<String> occasionTypeIn, @Param("occasionTypeNotIn") @jakarta.annotation.Nullable List<String> occasionTypeNotIn, @Param("totalBookingsGreaterThan") @jakarta.annotation.Nullable Integer totalBookingsGreaterThan, @Param("totalBookingsLessThan") @jakarta.annotation.Nullable Integer totalBookingsLessThan, @Param("totalBookingsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer totalBookingsGreaterThanOrEqual, @Param("totalBookingsLessThanOrEqual") @jakarta.annotation.Nullable Integer totalBookingsLessThanOrEqual, @Param("totalBookingsEquals") @jakarta.annotation.Nullable Integer totalBookingsEquals, @Param("totalBookingsNotEquals") @jakarta.annotation.Nullable Integer totalBookingsNotEquals, @Param("totalBookingsSpecified") @jakarta.annotation.Nullable Boolean totalBookingsSpecified, @Param("totalBookingsIn") @jakarta.annotation.Nullable List<Integer> totalBookingsIn, @Param("totalBookingsNotIn") @jakarta.annotation.Nullable List<Integer> totalBookingsNotIn, @Param("totalRevenueGreaterThan") @jakarta.annotation.Nullable BigDecimal totalRevenueGreaterThan, @Param("totalRevenueLessThan") @jakarta.annotation.Nullable BigDecimal totalRevenueLessThan, @Param("totalRevenueGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal totalRevenueGreaterThanOrEqual, @Param("totalRevenueLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal totalRevenueLessThanOrEqual, @Param("totalRevenueEquals") @jakarta.annotation.Nullable BigDecimal totalRevenueEquals, @Param("totalRevenueNotEquals") @jakarta.annotation.Nullable BigDecimal totalRevenueNotEquals, @Param("totalRevenueSpecified") @jakarta.annotation.Nullable Boolean totalRevenueSpecified, @Param("totalRevenueIn") @jakarta.annotation.Nullable List<BigDecimal> totalRevenueIn, @Param("totalRevenueNotIn") @jakarta.annotation.Nullable List<BigDecimal> totalRevenueNotIn, @Param("averagePriceGreaterThan") @jakarta.annotation.Nullable BigDecimal averagePriceGreaterThan, @Param("averagePriceLessThan") @jakarta.annotation.Nullable BigDecimal averagePriceLessThan, @Param("averagePriceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal averagePriceGreaterThanOrEqual, @Param("averagePriceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal averagePriceLessThanOrEqual, @Param("averagePriceEquals") @jakarta.annotation.Nullable BigDecimal averagePriceEquals, @Param("averagePriceNotEquals") @jakarta.annotation.Nullable BigDecimal averagePriceNotEquals, @Param("averagePriceSpecified") @jakarta.annotation.Nullable Boolean averagePriceSpecified, @Param("averagePriceIn") @jakarta.annotation.Nullable List<BigDecimal> averagePriceIn, @Param("averagePriceNotIn") @jakarta.annotation.Nullable List<BigDecimal> averagePriceNotIn, @Param("occupancyRateGreaterThan") @jakarta.annotation.Nullable BigDecimal occupancyRateGreaterThan, @Param("occupancyRateLessThan") @jakarta.annotation.Nullable BigDecimal occupancyRateLessThan, @Param("occupancyRateGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occupancyRateGreaterThanOrEqual, @Param("occupancyRateLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occupancyRateLessThanOrEqual, @Param("occupancyRateEquals") @jakarta.annotation.Nullable BigDecimal occupancyRateEquals, @Param("occupancyRateNotEquals") @jakarta.annotation.Nullable BigDecimal occupancyRateNotEquals, @Param("occupancyRateSpecified") @jakarta.annotation.Nullable Boolean occupancyRateSpecified, @Param("occupancyRateIn") @jakarta.annotation.Nullable List<BigDecimal> occupancyRateIn, @Param("occupancyRateNotIn") @jakarta.annotation.Nullable List<BigDecimal> occupancyRateNotIn, @Param("popularSeatTypesContains") @jakarta.annotation.Nullable String popularSeatTypesContains, @Param("popularSeatTypesDoesNotContain") @jakarta.annotation.Nullable String popularSeatTypesDoesNotContain, @Param("popularSeatTypesEquals") @jakarta.annotation.Nullable String popularSeatTypesEquals, @Param("popularSeatTypesNotEquals") @jakarta.annotation.Nullable String popularSeatTypesNotEquals, @Param("popularSeatTypesSpecified") @jakarta.annotation.Nullable Boolean popularSeatTypesSpecified, @Param("popularSeatTypesIn") @jakarta.annotation.Nullable List<String> popularSeatTypesIn, @Param("popularSeatTypesNotIn") @jakarta.annotation.Nullable List<String> popularSeatTypesNotIn, @Param("peakTravelTimesContains") @jakarta.annotation.Nullable String peakTravelTimesContains, @Param("peakTravelTimesDoesNotContain") @jakarta.annotation.Nullable String peakTravelTimesDoesNotContain, @Param("peakTravelTimesEquals") @jakarta.annotation.Nullable String peakTravelTimesEquals, @Param("peakTravelTimesNotEquals") @jakarta.annotation.Nullable String peakTravelTimesNotEquals, @Param("peakTravelTimesSpecified") @jakarta.annotation.Nullable Boolean peakTravelTimesSpecified, @Param("peakTravelTimesIn") @jakarta.annotation.Nullable List<String> peakTravelTimesIn, @Param("peakTravelTimesNotIn") @jakarta.annotation.Nullable List<String> peakTravelTimesNotIn, @Param("cancellationRateGreaterThan") @jakarta.annotation.Nullable BigDecimal cancellationRateGreaterThan, @Param("cancellationRateLessThan") @jakarta.annotation.Nullable BigDecimal cancellationRateLessThan, @Param("cancellationRateGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal cancellationRateGreaterThanOrEqual, @Param("cancellationRateLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal cancellationRateLessThanOrEqual, @Param("cancellationRateEquals") @jakarta.annotation.Nullable BigDecimal cancellationRateEquals, @Param("cancellationRateNotEquals") @jakarta.annotation.Nullable BigDecimal cancellationRateNotEquals, @Param("cancellationRateSpecified") @jakarta.annotation.Nullable Boolean cancellationRateSpecified, @Param("cancellationRateIn") @jakarta.annotation.Nullable List<BigDecimal> cancellationRateIn, @Param("cancellationRateNotIn") @jakarta.annotation.Nullable List<BigDecimal> cancellationRateNotIn, @Param("customerSatisfactionScoreGreaterThan") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreGreaterThan, @Param("customerSatisfactionScoreLessThan") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreLessThan, @Param("customerSatisfactionScoreGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreGreaterThanOrEqual, @Param("customerSatisfactionScoreLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreLessThanOrEqual, @Param("customerSatisfactionScoreEquals") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreEquals, @Param("customerSatisfactionScoreNotEquals") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreNotEquals, @Param("customerSatisfactionScoreSpecified") @jakarta.annotation.Nullable Boolean customerSatisfactionScoreSpecified, @Param("customerSatisfactionScoreIn") @jakarta.annotation.Nullable List<BigDecimal> customerSatisfactionScoreIn, @Param("customerSatisfactionScoreNotIn") @jakarta.annotation.Nullable List<BigDecimal> customerSatisfactionScoreNotIn, @Param("monthlyTrendContains") @jakarta.annotation.Nullable String monthlyTrendContains, @Param("monthlyTrendDoesNotContain") @jakarta.annotation.Nullable String monthlyTrendDoesNotContain, @Param("monthlyTrendEquals") @jakarta.annotation.Nullable String monthlyTrendEquals, @Param("monthlyTrendNotEquals") @jakarta.annotation.Nullable String monthlyTrendNotEquals, @Param("monthlyTrendSpecified") @jakarta.annotation.Nullable Boolean monthlyTrendSpecified, @Param("monthlyTrendIn") @jakarta.annotation.Nullable List<String> monthlyTrendIn, @Param("monthlyTrendNotIn") @jakarta.annotation.Nullable List<String> monthlyTrendNotIn, @Param("validFromGreaterThan") @jakarta.annotation.Nullable LocalDate validFromGreaterThan, @Param("validFromLessThan") @jakarta.annotation.Nullable LocalDate validFromLessThan, @Param("validFromGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate validFromGreaterThanOrEqual, @Param("validFromLessThanOrEqual") @jakarta.annotation.Nullable LocalDate validFromLessThanOrEqual, @Param("validFromEquals") @jakarta.annotation.Nullable LocalDate validFromEquals, @Param("validFromNotEquals") @jakarta.annotation.Nullable LocalDate validFromNotEquals, @Param("validFromSpecified") @jakarta.annotation.Nullable Boolean validFromSpecified, @Param("validFromIn") @jakarta.annotation.Nullable List<LocalDate> validFromIn, @Param("validFromNotIn") @jakarta.annotation.Nullable List<LocalDate> validFromNotIn, @Param("validToGreaterThan") @jakarta.annotation.Nullable LocalDate validToGreaterThan, @Param("validToLessThan") @jakarta.annotation.Nullable LocalDate validToLessThan, @Param("validToGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate validToGreaterThanOrEqual, @Param("validToLessThanOrEqual") @jakarta.annotation.Nullable LocalDate validToLessThanOrEqual, @Param("validToEquals") @jakarta.annotation.Nullable LocalDate validToEquals, @Param("validToNotEquals") @jakarta.annotation.Nullable LocalDate validToNotEquals, @Param("validToSpecified") @jakarta.annotation.Nullable Boolean validToSpecified, @Param("validToIn") @jakarta.annotation.Nullable List<LocalDate> validToIn, @Param("validToNotIn") @jakarta.annotation.Nullable List<LocalDate> validToNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countTripStatistics</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountTripStatisticsQueryParams} class that allows for
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
   *   <li>routeIdGreaterThan -  (optional)</li>
   *   <li>routeIdLessThan -  (optional)</li>
   *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
   *   <li>routeIdLessThanOrEqual -  (optional)</li>
   *   <li>routeIdEquals -  (optional)</li>
   *   <li>routeIdNotEquals -  (optional)</li>
   *   <li>routeIdSpecified -  (optional)</li>
   *   <li>routeIdIn -  (optional)</li>
   *   <li>routeIdNotIn -  (optional)</li>
   *   <li>vehicleTypeEquals -  (optional)</li>
   *   <li>vehicleTypeNotEquals -  (optional)</li>
   *   <li>vehicleTypeSpecified -  (optional)</li>
   *   <li>vehicleTypeIn -  (optional)</li>
   *   <li>vehicleTypeNotIn -  (optional)</li>
   *   <li>occasionTypeEquals -  (optional)</li>
   *   <li>occasionTypeNotEquals -  (optional)</li>
   *   <li>occasionTypeSpecified -  (optional)</li>
   *   <li>occasionTypeIn -  (optional)</li>
   *   <li>occasionTypeNotIn -  (optional)</li>
   *   <li>totalBookingsGreaterThan -  (optional)</li>
   *   <li>totalBookingsLessThan -  (optional)</li>
   *   <li>totalBookingsGreaterThanOrEqual -  (optional)</li>
   *   <li>totalBookingsLessThanOrEqual -  (optional)</li>
   *   <li>totalBookingsEquals -  (optional)</li>
   *   <li>totalBookingsNotEquals -  (optional)</li>
   *   <li>totalBookingsSpecified -  (optional)</li>
   *   <li>totalBookingsIn -  (optional)</li>
   *   <li>totalBookingsNotIn -  (optional)</li>
   *   <li>totalRevenueGreaterThan -  (optional)</li>
   *   <li>totalRevenueLessThan -  (optional)</li>
   *   <li>totalRevenueGreaterThanOrEqual -  (optional)</li>
   *   <li>totalRevenueLessThanOrEqual -  (optional)</li>
   *   <li>totalRevenueEquals -  (optional)</li>
   *   <li>totalRevenueNotEquals -  (optional)</li>
   *   <li>totalRevenueSpecified -  (optional)</li>
   *   <li>totalRevenueIn -  (optional)</li>
   *   <li>totalRevenueNotIn -  (optional)</li>
   *   <li>averagePriceGreaterThan -  (optional)</li>
   *   <li>averagePriceLessThan -  (optional)</li>
   *   <li>averagePriceGreaterThanOrEqual -  (optional)</li>
   *   <li>averagePriceLessThanOrEqual -  (optional)</li>
   *   <li>averagePriceEquals -  (optional)</li>
   *   <li>averagePriceNotEquals -  (optional)</li>
   *   <li>averagePriceSpecified -  (optional)</li>
   *   <li>averagePriceIn -  (optional)</li>
   *   <li>averagePriceNotIn -  (optional)</li>
   *   <li>occupancyRateGreaterThan -  (optional)</li>
   *   <li>occupancyRateLessThan -  (optional)</li>
   *   <li>occupancyRateGreaterThanOrEqual -  (optional)</li>
   *   <li>occupancyRateLessThanOrEqual -  (optional)</li>
   *   <li>occupancyRateEquals -  (optional)</li>
   *   <li>occupancyRateNotEquals -  (optional)</li>
   *   <li>occupancyRateSpecified -  (optional)</li>
   *   <li>occupancyRateIn -  (optional)</li>
   *   <li>occupancyRateNotIn -  (optional)</li>
   *   <li>popularSeatTypesContains -  (optional)</li>
   *   <li>popularSeatTypesDoesNotContain -  (optional)</li>
   *   <li>popularSeatTypesEquals -  (optional)</li>
   *   <li>popularSeatTypesNotEquals -  (optional)</li>
   *   <li>popularSeatTypesSpecified -  (optional)</li>
   *   <li>popularSeatTypesIn -  (optional)</li>
   *   <li>popularSeatTypesNotIn -  (optional)</li>
   *   <li>peakTravelTimesContains -  (optional)</li>
   *   <li>peakTravelTimesDoesNotContain -  (optional)</li>
   *   <li>peakTravelTimesEquals -  (optional)</li>
   *   <li>peakTravelTimesNotEquals -  (optional)</li>
   *   <li>peakTravelTimesSpecified -  (optional)</li>
   *   <li>peakTravelTimesIn -  (optional)</li>
   *   <li>peakTravelTimesNotIn -  (optional)</li>
   *   <li>cancellationRateGreaterThan -  (optional)</li>
   *   <li>cancellationRateLessThan -  (optional)</li>
   *   <li>cancellationRateGreaterThanOrEqual -  (optional)</li>
   *   <li>cancellationRateLessThanOrEqual -  (optional)</li>
   *   <li>cancellationRateEquals -  (optional)</li>
   *   <li>cancellationRateNotEquals -  (optional)</li>
   *   <li>cancellationRateSpecified -  (optional)</li>
   *   <li>cancellationRateIn -  (optional)</li>
   *   <li>cancellationRateNotIn -  (optional)</li>
   *   <li>customerSatisfactionScoreGreaterThan -  (optional)</li>
   *   <li>customerSatisfactionScoreLessThan -  (optional)</li>
   *   <li>customerSatisfactionScoreGreaterThanOrEqual -  (optional)</li>
   *   <li>customerSatisfactionScoreLessThanOrEqual -  (optional)</li>
   *   <li>customerSatisfactionScoreEquals -  (optional)</li>
   *   <li>customerSatisfactionScoreNotEquals -  (optional)</li>
   *   <li>customerSatisfactionScoreSpecified -  (optional)</li>
   *   <li>customerSatisfactionScoreIn -  (optional)</li>
   *   <li>customerSatisfactionScoreNotIn -  (optional)</li>
   *   <li>monthlyTrendContains -  (optional)</li>
   *   <li>monthlyTrendDoesNotContain -  (optional)</li>
   *   <li>monthlyTrendEquals -  (optional)</li>
   *   <li>monthlyTrendNotEquals -  (optional)</li>
   *   <li>monthlyTrendSpecified -  (optional)</li>
   *   <li>monthlyTrendIn -  (optional)</li>
   *   <li>monthlyTrendNotIn -  (optional)</li>
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
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return Long
   */
  @RequestLine("GET /api/trip-statistics/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&occasionType.equals={occasionTypeEquals}&occasionType.notEquals={occasionTypeNotEquals}&occasionType.specified={occasionTypeSpecified}&occasionType.in={occasionTypeIn}&occasionType.notIn={occasionTypeNotIn}&totalBookings.greaterThan={totalBookingsGreaterThan}&totalBookings.lessThan={totalBookingsLessThan}&totalBookings.greaterThanOrEqual={totalBookingsGreaterThanOrEqual}&totalBookings.lessThanOrEqual={totalBookingsLessThanOrEqual}&totalBookings.equals={totalBookingsEquals}&totalBookings.notEquals={totalBookingsNotEquals}&totalBookings.specified={totalBookingsSpecified}&totalBookings.in={totalBookingsIn}&totalBookings.notIn={totalBookingsNotIn}&totalRevenue.greaterThan={totalRevenueGreaterThan}&totalRevenue.lessThan={totalRevenueLessThan}&totalRevenue.greaterThanOrEqual={totalRevenueGreaterThanOrEqual}&totalRevenue.lessThanOrEqual={totalRevenueLessThanOrEqual}&totalRevenue.equals={totalRevenueEquals}&totalRevenue.notEquals={totalRevenueNotEquals}&totalRevenue.specified={totalRevenueSpecified}&totalRevenue.in={totalRevenueIn}&totalRevenue.notIn={totalRevenueNotIn}&averagePrice.greaterThan={averagePriceGreaterThan}&averagePrice.lessThan={averagePriceLessThan}&averagePrice.greaterThanOrEqual={averagePriceGreaterThanOrEqual}&averagePrice.lessThanOrEqual={averagePriceLessThanOrEqual}&averagePrice.equals={averagePriceEquals}&averagePrice.notEquals={averagePriceNotEquals}&averagePrice.specified={averagePriceSpecified}&averagePrice.in={averagePriceIn}&averagePrice.notIn={averagePriceNotIn}&occupancyRate.greaterThan={occupancyRateGreaterThan}&occupancyRate.lessThan={occupancyRateLessThan}&occupancyRate.greaterThanOrEqual={occupancyRateGreaterThanOrEqual}&occupancyRate.lessThanOrEqual={occupancyRateLessThanOrEqual}&occupancyRate.equals={occupancyRateEquals}&occupancyRate.notEquals={occupancyRateNotEquals}&occupancyRate.specified={occupancyRateSpecified}&occupancyRate.in={occupancyRateIn}&occupancyRate.notIn={occupancyRateNotIn}&popularSeatTypes.contains={popularSeatTypesContains}&popularSeatTypes.doesNotContain={popularSeatTypesDoesNotContain}&popularSeatTypes.equals={popularSeatTypesEquals}&popularSeatTypes.notEquals={popularSeatTypesNotEquals}&popularSeatTypes.specified={popularSeatTypesSpecified}&popularSeatTypes.in={popularSeatTypesIn}&popularSeatTypes.notIn={popularSeatTypesNotIn}&peakTravelTimes.contains={peakTravelTimesContains}&peakTravelTimes.doesNotContain={peakTravelTimesDoesNotContain}&peakTravelTimes.equals={peakTravelTimesEquals}&peakTravelTimes.notEquals={peakTravelTimesNotEquals}&peakTravelTimes.specified={peakTravelTimesSpecified}&peakTravelTimes.in={peakTravelTimesIn}&peakTravelTimes.notIn={peakTravelTimesNotIn}&cancellationRate.greaterThan={cancellationRateGreaterThan}&cancellationRate.lessThan={cancellationRateLessThan}&cancellationRate.greaterThanOrEqual={cancellationRateGreaterThanOrEqual}&cancellationRate.lessThanOrEqual={cancellationRateLessThanOrEqual}&cancellationRate.equals={cancellationRateEquals}&cancellationRate.notEquals={cancellationRateNotEquals}&cancellationRate.specified={cancellationRateSpecified}&cancellationRate.in={cancellationRateIn}&cancellationRate.notIn={cancellationRateNotIn}&customerSatisfactionScore.greaterThan={customerSatisfactionScoreGreaterThan}&customerSatisfactionScore.lessThan={customerSatisfactionScoreLessThan}&customerSatisfactionScore.greaterThanOrEqual={customerSatisfactionScoreGreaterThanOrEqual}&customerSatisfactionScore.lessThanOrEqual={customerSatisfactionScoreLessThanOrEqual}&customerSatisfactionScore.equals={customerSatisfactionScoreEquals}&customerSatisfactionScore.notEquals={customerSatisfactionScoreNotEquals}&customerSatisfactionScore.specified={customerSatisfactionScoreSpecified}&customerSatisfactionScore.in={customerSatisfactionScoreIn}&customerSatisfactionScore.notIn={customerSatisfactionScoreNotIn}&monthlyTrend.contains={monthlyTrendContains}&monthlyTrend.doesNotContain={monthlyTrendDoesNotContain}&monthlyTrend.equals={monthlyTrendEquals}&monthlyTrend.notEquals={monthlyTrendNotEquals}&monthlyTrend.specified={monthlyTrendSpecified}&monthlyTrend.in={monthlyTrendIn}&monthlyTrend.notIn={monthlyTrendNotIn}&validFrom.greaterThan={validFromGreaterThan}&validFrom.lessThan={validFromLessThan}&validFrom.greaterThanOrEqual={validFromGreaterThanOrEqual}&validFrom.lessThanOrEqual={validFromLessThanOrEqual}&validFrom.equals={validFromEquals}&validFrom.notEquals={validFromNotEquals}&validFrom.specified={validFromSpecified}&validFrom.in={validFromIn}&validFrom.notIn={validFromNotIn}&validTo.greaterThan={validToGreaterThan}&validTo.lessThan={validToLessThan}&validTo.greaterThanOrEqual={validToGreaterThanOrEqual}&validTo.lessThanOrEqual={validToLessThanOrEqual}&validTo.equals={validToEquals}&validTo.notEquals={validToNotEquals}&validTo.specified={validToSpecified}&validTo.in={validToIn}&validTo.notIn={validToNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countTripStatistics(@QueryMap(encoded=true) CountTripStatisticsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countTripStatistics</code> that receives the query parameters as a map,
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
          *   <li>routeIdGreaterThan -  (optional)</li>
          *   <li>routeIdLessThan -  (optional)</li>
          *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
          *   <li>routeIdLessThanOrEqual -  (optional)</li>
          *   <li>routeIdEquals -  (optional)</li>
          *   <li>routeIdNotEquals -  (optional)</li>
          *   <li>routeIdSpecified -  (optional)</li>
          *   <li>routeIdIn -  (optional)</li>
          *   <li>routeIdNotIn -  (optional)</li>
          *   <li>vehicleTypeEquals -  (optional)</li>
          *   <li>vehicleTypeNotEquals -  (optional)</li>
          *   <li>vehicleTypeSpecified -  (optional)</li>
          *   <li>vehicleTypeIn -  (optional)</li>
          *   <li>vehicleTypeNotIn -  (optional)</li>
          *   <li>occasionTypeEquals -  (optional)</li>
          *   <li>occasionTypeNotEquals -  (optional)</li>
          *   <li>occasionTypeSpecified -  (optional)</li>
          *   <li>occasionTypeIn -  (optional)</li>
          *   <li>occasionTypeNotIn -  (optional)</li>
          *   <li>totalBookingsGreaterThan -  (optional)</li>
          *   <li>totalBookingsLessThan -  (optional)</li>
          *   <li>totalBookingsGreaterThanOrEqual -  (optional)</li>
          *   <li>totalBookingsLessThanOrEqual -  (optional)</li>
          *   <li>totalBookingsEquals -  (optional)</li>
          *   <li>totalBookingsNotEquals -  (optional)</li>
          *   <li>totalBookingsSpecified -  (optional)</li>
          *   <li>totalBookingsIn -  (optional)</li>
          *   <li>totalBookingsNotIn -  (optional)</li>
          *   <li>totalRevenueGreaterThan -  (optional)</li>
          *   <li>totalRevenueLessThan -  (optional)</li>
          *   <li>totalRevenueGreaterThanOrEqual -  (optional)</li>
          *   <li>totalRevenueLessThanOrEqual -  (optional)</li>
          *   <li>totalRevenueEquals -  (optional)</li>
          *   <li>totalRevenueNotEquals -  (optional)</li>
          *   <li>totalRevenueSpecified -  (optional)</li>
          *   <li>totalRevenueIn -  (optional)</li>
          *   <li>totalRevenueNotIn -  (optional)</li>
          *   <li>averagePriceGreaterThan -  (optional)</li>
          *   <li>averagePriceLessThan -  (optional)</li>
          *   <li>averagePriceGreaterThanOrEqual -  (optional)</li>
          *   <li>averagePriceLessThanOrEqual -  (optional)</li>
          *   <li>averagePriceEquals -  (optional)</li>
          *   <li>averagePriceNotEquals -  (optional)</li>
          *   <li>averagePriceSpecified -  (optional)</li>
          *   <li>averagePriceIn -  (optional)</li>
          *   <li>averagePriceNotIn -  (optional)</li>
          *   <li>occupancyRateGreaterThan -  (optional)</li>
          *   <li>occupancyRateLessThan -  (optional)</li>
          *   <li>occupancyRateGreaterThanOrEqual -  (optional)</li>
          *   <li>occupancyRateLessThanOrEqual -  (optional)</li>
          *   <li>occupancyRateEquals -  (optional)</li>
          *   <li>occupancyRateNotEquals -  (optional)</li>
          *   <li>occupancyRateSpecified -  (optional)</li>
          *   <li>occupancyRateIn -  (optional)</li>
          *   <li>occupancyRateNotIn -  (optional)</li>
          *   <li>popularSeatTypesContains -  (optional)</li>
          *   <li>popularSeatTypesDoesNotContain -  (optional)</li>
          *   <li>popularSeatTypesEquals -  (optional)</li>
          *   <li>popularSeatTypesNotEquals -  (optional)</li>
          *   <li>popularSeatTypesSpecified -  (optional)</li>
          *   <li>popularSeatTypesIn -  (optional)</li>
          *   <li>popularSeatTypesNotIn -  (optional)</li>
          *   <li>peakTravelTimesContains -  (optional)</li>
          *   <li>peakTravelTimesDoesNotContain -  (optional)</li>
          *   <li>peakTravelTimesEquals -  (optional)</li>
          *   <li>peakTravelTimesNotEquals -  (optional)</li>
          *   <li>peakTravelTimesSpecified -  (optional)</li>
          *   <li>peakTravelTimesIn -  (optional)</li>
          *   <li>peakTravelTimesNotIn -  (optional)</li>
          *   <li>cancellationRateGreaterThan -  (optional)</li>
          *   <li>cancellationRateLessThan -  (optional)</li>
          *   <li>cancellationRateGreaterThanOrEqual -  (optional)</li>
          *   <li>cancellationRateLessThanOrEqual -  (optional)</li>
          *   <li>cancellationRateEquals -  (optional)</li>
          *   <li>cancellationRateNotEquals -  (optional)</li>
          *   <li>cancellationRateSpecified -  (optional)</li>
          *   <li>cancellationRateIn -  (optional)</li>
          *   <li>cancellationRateNotIn -  (optional)</li>
          *   <li>customerSatisfactionScoreGreaterThan -  (optional)</li>
          *   <li>customerSatisfactionScoreLessThan -  (optional)</li>
          *   <li>customerSatisfactionScoreGreaterThanOrEqual -  (optional)</li>
          *   <li>customerSatisfactionScoreLessThanOrEqual -  (optional)</li>
          *   <li>customerSatisfactionScoreEquals -  (optional)</li>
          *   <li>customerSatisfactionScoreNotEquals -  (optional)</li>
          *   <li>customerSatisfactionScoreSpecified -  (optional)</li>
          *   <li>customerSatisfactionScoreIn -  (optional)</li>
          *   <li>customerSatisfactionScoreNotIn -  (optional)</li>
          *   <li>monthlyTrendContains -  (optional)</li>
          *   <li>monthlyTrendDoesNotContain -  (optional)</li>
          *   <li>monthlyTrendEquals -  (optional)</li>
          *   <li>monthlyTrendNotEquals -  (optional)</li>
          *   <li>monthlyTrendSpecified -  (optional)</li>
          *   <li>monthlyTrendIn -  (optional)</li>
          *   <li>monthlyTrendNotIn -  (optional)</li>
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
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return Long
      */
      @RequestLine("GET /api/trip-statistics/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&occasionType.equals={occasionTypeEquals}&occasionType.notEquals={occasionTypeNotEquals}&occasionType.specified={occasionTypeSpecified}&occasionType.in={occasionTypeIn}&occasionType.notIn={occasionTypeNotIn}&totalBookings.greaterThan={totalBookingsGreaterThan}&totalBookings.lessThan={totalBookingsLessThan}&totalBookings.greaterThanOrEqual={totalBookingsGreaterThanOrEqual}&totalBookings.lessThanOrEqual={totalBookingsLessThanOrEqual}&totalBookings.equals={totalBookingsEquals}&totalBookings.notEquals={totalBookingsNotEquals}&totalBookings.specified={totalBookingsSpecified}&totalBookings.in={totalBookingsIn}&totalBookings.notIn={totalBookingsNotIn}&totalRevenue.greaterThan={totalRevenueGreaterThan}&totalRevenue.lessThan={totalRevenueLessThan}&totalRevenue.greaterThanOrEqual={totalRevenueGreaterThanOrEqual}&totalRevenue.lessThanOrEqual={totalRevenueLessThanOrEqual}&totalRevenue.equals={totalRevenueEquals}&totalRevenue.notEquals={totalRevenueNotEquals}&totalRevenue.specified={totalRevenueSpecified}&totalRevenue.in={totalRevenueIn}&totalRevenue.notIn={totalRevenueNotIn}&averagePrice.greaterThan={averagePriceGreaterThan}&averagePrice.lessThan={averagePriceLessThan}&averagePrice.greaterThanOrEqual={averagePriceGreaterThanOrEqual}&averagePrice.lessThanOrEqual={averagePriceLessThanOrEqual}&averagePrice.equals={averagePriceEquals}&averagePrice.notEquals={averagePriceNotEquals}&averagePrice.specified={averagePriceSpecified}&averagePrice.in={averagePriceIn}&averagePrice.notIn={averagePriceNotIn}&occupancyRate.greaterThan={occupancyRateGreaterThan}&occupancyRate.lessThan={occupancyRateLessThan}&occupancyRate.greaterThanOrEqual={occupancyRateGreaterThanOrEqual}&occupancyRate.lessThanOrEqual={occupancyRateLessThanOrEqual}&occupancyRate.equals={occupancyRateEquals}&occupancyRate.notEquals={occupancyRateNotEquals}&occupancyRate.specified={occupancyRateSpecified}&occupancyRate.in={occupancyRateIn}&occupancyRate.notIn={occupancyRateNotIn}&popularSeatTypes.contains={popularSeatTypesContains}&popularSeatTypes.doesNotContain={popularSeatTypesDoesNotContain}&popularSeatTypes.equals={popularSeatTypesEquals}&popularSeatTypes.notEquals={popularSeatTypesNotEquals}&popularSeatTypes.specified={popularSeatTypesSpecified}&popularSeatTypes.in={popularSeatTypesIn}&popularSeatTypes.notIn={popularSeatTypesNotIn}&peakTravelTimes.contains={peakTravelTimesContains}&peakTravelTimes.doesNotContain={peakTravelTimesDoesNotContain}&peakTravelTimes.equals={peakTravelTimesEquals}&peakTravelTimes.notEquals={peakTravelTimesNotEquals}&peakTravelTimes.specified={peakTravelTimesSpecified}&peakTravelTimes.in={peakTravelTimesIn}&peakTravelTimes.notIn={peakTravelTimesNotIn}&cancellationRate.greaterThan={cancellationRateGreaterThan}&cancellationRate.lessThan={cancellationRateLessThan}&cancellationRate.greaterThanOrEqual={cancellationRateGreaterThanOrEqual}&cancellationRate.lessThanOrEqual={cancellationRateLessThanOrEqual}&cancellationRate.equals={cancellationRateEquals}&cancellationRate.notEquals={cancellationRateNotEquals}&cancellationRate.specified={cancellationRateSpecified}&cancellationRate.in={cancellationRateIn}&cancellationRate.notIn={cancellationRateNotIn}&customerSatisfactionScore.greaterThan={customerSatisfactionScoreGreaterThan}&customerSatisfactionScore.lessThan={customerSatisfactionScoreLessThan}&customerSatisfactionScore.greaterThanOrEqual={customerSatisfactionScoreGreaterThanOrEqual}&customerSatisfactionScore.lessThanOrEqual={customerSatisfactionScoreLessThanOrEqual}&customerSatisfactionScore.equals={customerSatisfactionScoreEquals}&customerSatisfactionScore.notEquals={customerSatisfactionScoreNotEquals}&customerSatisfactionScore.specified={customerSatisfactionScoreSpecified}&customerSatisfactionScore.in={customerSatisfactionScoreIn}&customerSatisfactionScore.notIn={customerSatisfactionScoreNotIn}&monthlyTrend.contains={monthlyTrendContains}&monthlyTrend.doesNotContain={monthlyTrendDoesNotContain}&monthlyTrend.equals={monthlyTrendEquals}&monthlyTrend.notEquals={monthlyTrendNotEquals}&monthlyTrend.specified={monthlyTrendSpecified}&monthlyTrend.in={monthlyTrendIn}&monthlyTrend.notIn={monthlyTrendNotIn}&validFrom.greaterThan={validFromGreaterThan}&validFrom.lessThan={validFromLessThan}&validFrom.greaterThanOrEqual={validFromGreaterThanOrEqual}&validFrom.lessThanOrEqual={validFromLessThanOrEqual}&validFrom.equals={validFromEquals}&validFrom.notEquals={validFromNotEquals}&validFrom.specified={validFromSpecified}&validFrom.in={validFromIn}&validFrom.notIn={validFromNotIn}&validTo.greaterThan={validToGreaterThan}&validTo.lessThan={validToLessThan}&validTo.greaterThanOrEqual={validToGreaterThanOrEqual}&validTo.lessThanOrEqual={validToLessThanOrEqual}&validTo.equals={validToEquals}&validTo.notEquals={validToNotEquals}&validTo.specified={validToSpecified}&validTo.in={validToIn}&validTo.notIn={validToNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countTripStatisticsWithHttpInfo(@QueryMap(encoded=true) CountTripStatisticsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countTripStatistics</code> method in a fluent style.
   */
  public static class CountTripStatisticsQueryParams extends HashMap<String, Object> {
    public CountTripStatisticsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams routeIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams routeIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams routeIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams routeIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams routeIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams routeIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams routeIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("routeId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams routeIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams routeIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams vehicleTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("vehicleType.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams vehicleTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("vehicleType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams vehicleTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehicleType.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams vehicleTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehicleType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams vehicleTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehicleType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams occasionTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("occasionType.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams occasionTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("occasionType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams occasionTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occasionType.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams occasionTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("occasionType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams occasionTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("occasionType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams totalBookingsGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("totalBookings.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams totalBookingsLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("totalBookings.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams totalBookingsGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("totalBookings.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams totalBookingsLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("totalBookings.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams totalBookingsEquals(@jakarta.annotation.Nullable final Integer value) {
      put("totalBookings.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams totalBookingsNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("totalBookings.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams totalBookingsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("totalBookings.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams totalBookingsIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("totalBookings.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams totalBookingsNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("totalBookings.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams totalRevenueGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalRevenue.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams totalRevenueLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalRevenue.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams totalRevenueGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalRevenue.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams totalRevenueLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalRevenue.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams totalRevenueEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalRevenue.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams totalRevenueNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalRevenue.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams totalRevenueSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("totalRevenue.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams totalRevenueIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("totalRevenue.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams totalRevenueNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("totalRevenue.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams averagePriceGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averagePrice.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams averagePriceLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averagePrice.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams averagePriceGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averagePrice.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams averagePriceLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averagePrice.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams averagePriceEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averagePrice.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams averagePriceNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averagePrice.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams averagePriceSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("averagePrice.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams averagePriceIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("averagePrice.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams averagePriceNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("averagePrice.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams occupancyRateGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occupancyRate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams occupancyRateLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occupancyRate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams occupancyRateGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occupancyRate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams occupancyRateLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occupancyRate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams occupancyRateEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occupancyRate.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams occupancyRateNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occupancyRate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams occupancyRateSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occupancyRate.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams occupancyRateIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occupancyRate.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams occupancyRateNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occupancyRate.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams popularSeatTypesContains(@jakarta.annotation.Nullable final String value) {
      put("popularSeatTypes.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams popularSeatTypesDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("popularSeatTypes.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams popularSeatTypesEquals(@jakarta.annotation.Nullable final String value) {
      put("popularSeatTypes.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams popularSeatTypesNotEquals(@jakarta.annotation.Nullable final String value) {
      put("popularSeatTypes.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams popularSeatTypesSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("popularSeatTypes.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams popularSeatTypesIn(@jakarta.annotation.Nullable final List<String> value) {
      put("popularSeatTypes.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams popularSeatTypesNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("popularSeatTypes.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams peakTravelTimesContains(@jakarta.annotation.Nullable final String value) {
      put("peakTravelTimes.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams peakTravelTimesDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("peakTravelTimes.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams peakTravelTimesEquals(@jakarta.annotation.Nullable final String value) {
      put("peakTravelTimes.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams peakTravelTimesNotEquals(@jakarta.annotation.Nullable final String value) {
      put("peakTravelTimes.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams peakTravelTimesSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("peakTravelTimes.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams peakTravelTimesIn(@jakarta.annotation.Nullable final List<String> value) {
      put("peakTravelTimes.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams peakTravelTimesNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("peakTravelTimes.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams cancellationRateGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("cancellationRate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams cancellationRateLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("cancellationRate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams cancellationRateGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("cancellationRate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams cancellationRateLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("cancellationRate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams cancellationRateEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("cancellationRate.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams cancellationRateNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("cancellationRate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams cancellationRateSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("cancellationRate.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams cancellationRateIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("cancellationRate.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams cancellationRateNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("cancellationRate.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams customerSatisfactionScoreGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("customerSatisfactionScore.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams customerSatisfactionScoreLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("customerSatisfactionScore.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams customerSatisfactionScoreGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("customerSatisfactionScore.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams customerSatisfactionScoreLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("customerSatisfactionScore.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams customerSatisfactionScoreEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("customerSatisfactionScore.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams customerSatisfactionScoreNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("customerSatisfactionScore.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams customerSatisfactionScoreSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("customerSatisfactionScore.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams customerSatisfactionScoreIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("customerSatisfactionScore.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams customerSatisfactionScoreNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("customerSatisfactionScore.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams monthlyTrendContains(@jakarta.annotation.Nullable final String value) {
      put("monthlyTrend.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams monthlyTrendDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("monthlyTrend.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams monthlyTrendEquals(@jakarta.annotation.Nullable final String value) {
      put("monthlyTrend.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams monthlyTrendNotEquals(@jakarta.annotation.Nullable final String value) {
      put("monthlyTrend.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams monthlyTrendSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("monthlyTrend.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams monthlyTrendIn(@jakarta.annotation.Nullable final List<String> value) {
      put("monthlyTrend.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams monthlyTrendNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("monthlyTrend.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams validFromGreaterThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams validFromLessThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams validFromGreaterThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams validFromLessThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams validFromEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams validFromNotEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams validFromSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("validFrom.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams validFromIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("validFrom.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams validFromNotIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("validFrom.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams validToGreaterThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams validToLessThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams validToGreaterThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams validToLessThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams validToEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams validToNotEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams validToSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("validTo.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams validToIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("validTo.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams validToNotIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("validTo.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripStatisticsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripStatisticsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param tripStatisticsDTO  (required)
   * @return TripStatisticsDTO
   */
  @RequestLine("POST /api/trip-statistics")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TripStatisticsDTO createTripStatistics(@jakarta.annotation.Nonnull TripStatisticsDTO tripStatisticsDTO);

  /**
   * 
   * Similar to <code>createTripStatistics</code> but it also returns the http response headers .
   * 
   * @param tripStatisticsDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/trip-statistics")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TripStatisticsDTO> createTripStatisticsWithHttpInfo(@jakarta.annotation.Nonnull TripStatisticsDTO tripStatisticsDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/trip-statistics/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTripStatistics(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deleteTripStatistics</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/trip-statistics/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTripStatisticsWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



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
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param vehicleTypeEquals  (optional)
   * @param vehicleTypeNotEquals  (optional)
   * @param vehicleTypeSpecified  (optional)
   * @param vehicleTypeIn  (optional)
   * @param vehicleTypeNotIn  (optional)
   * @param occasionTypeEquals  (optional)
   * @param occasionTypeNotEquals  (optional)
   * @param occasionTypeSpecified  (optional)
   * @param occasionTypeIn  (optional)
   * @param occasionTypeNotIn  (optional)
   * @param totalBookingsGreaterThan  (optional)
   * @param totalBookingsLessThan  (optional)
   * @param totalBookingsGreaterThanOrEqual  (optional)
   * @param totalBookingsLessThanOrEqual  (optional)
   * @param totalBookingsEquals  (optional)
   * @param totalBookingsNotEquals  (optional)
   * @param totalBookingsSpecified  (optional)
   * @param totalBookingsIn  (optional)
   * @param totalBookingsNotIn  (optional)
   * @param totalRevenueGreaterThan  (optional)
   * @param totalRevenueLessThan  (optional)
   * @param totalRevenueGreaterThanOrEqual  (optional)
   * @param totalRevenueLessThanOrEqual  (optional)
   * @param totalRevenueEquals  (optional)
   * @param totalRevenueNotEquals  (optional)
   * @param totalRevenueSpecified  (optional)
   * @param totalRevenueIn  (optional)
   * @param totalRevenueNotIn  (optional)
   * @param averagePriceGreaterThan  (optional)
   * @param averagePriceLessThan  (optional)
   * @param averagePriceGreaterThanOrEqual  (optional)
   * @param averagePriceLessThanOrEqual  (optional)
   * @param averagePriceEquals  (optional)
   * @param averagePriceNotEquals  (optional)
   * @param averagePriceSpecified  (optional)
   * @param averagePriceIn  (optional)
   * @param averagePriceNotIn  (optional)
   * @param occupancyRateGreaterThan  (optional)
   * @param occupancyRateLessThan  (optional)
   * @param occupancyRateGreaterThanOrEqual  (optional)
   * @param occupancyRateLessThanOrEqual  (optional)
   * @param occupancyRateEquals  (optional)
   * @param occupancyRateNotEquals  (optional)
   * @param occupancyRateSpecified  (optional)
   * @param occupancyRateIn  (optional)
   * @param occupancyRateNotIn  (optional)
   * @param popularSeatTypesContains  (optional)
   * @param popularSeatTypesDoesNotContain  (optional)
   * @param popularSeatTypesEquals  (optional)
   * @param popularSeatTypesNotEquals  (optional)
   * @param popularSeatTypesSpecified  (optional)
   * @param popularSeatTypesIn  (optional)
   * @param popularSeatTypesNotIn  (optional)
   * @param peakTravelTimesContains  (optional)
   * @param peakTravelTimesDoesNotContain  (optional)
   * @param peakTravelTimesEquals  (optional)
   * @param peakTravelTimesNotEquals  (optional)
   * @param peakTravelTimesSpecified  (optional)
   * @param peakTravelTimesIn  (optional)
   * @param peakTravelTimesNotIn  (optional)
   * @param cancellationRateGreaterThan  (optional)
   * @param cancellationRateLessThan  (optional)
   * @param cancellationRateGreaterThanOrEqual  (optional)
   * @param cancellationRateLessThanOrEqual  (optional)
   * @param cancellationRateEquals  (optional)
   * @param cancellationRateNotEquals  (optional)
   * @param cancellationRateSpecified  (optional)
   * @param cancellationRateIn  (optional)
   * @param cancellationRateNotIn  (optional)
   * @param customerSatisfactionScoreGreaterThan  (optional)
   * @param customerSatisfactionScoreLessThan  (optional)
   * @param customerSatisfactionScoreGreaterThanOrEqual  (optional)
   * @param customerSatisfactionScoreLessThanOrEqual  (optional)
   * @param customerSatisfactionScoreEquals  (optional)
   * @param customerSatisfactionScoreNotEquals  (optional)
   * @param customerSatisfactionScoreSpecified  (optional)
   * @param customerSatisfactionScoreIn  (optional)
   * @param customerSatisfactionScoreNotIn  (optional)
   * @param monthlyTrendContains  (optional)
   * @param monthlyTrendDoesNotContain  (optional)
   * @param monthlyTrendEquals  (optional)
   * @param monthlyTrendNotEquals  (optional)
   * @param monthlyTrendSpecified  (optional)
   * @param monthlyTrendIn  (optional)
   * @param monthlyTrendNotIn  (optional)
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
   * @param distinct  (optional)
   * @param page Zero-based page index (0..N) (optional, default to 0)
   * @param size The size of the page to be returned (optional, default to 20)
   * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return List&lt;TripStatisticsDTO&gt;
   */
  @RequestLine("GET /api/trip-statistics?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&occasionType.equals={occasionTypeEquals}&occasionType.notEquals={occasionTypeNotEquals}&occasionType.specified={occasionTypeSpecified}&occasionType.in={occasionTypeIn}&occasionType.notIn={occasionTypeNotIn}&totalBookings.greaterThan={totalBookingsGreaterThan}&totalBookings.lessThan={totalBookingsLessThan}&totalBookings.greaterThanOrEqual={totalBookingsGreaterThanOrEqual}&totalBookings.lessThanOrEqual={totalBookingsLessThanOrEqual}&totalBookings.equals={totalBookingsEquals}&totalBookings.notEquals={totalBookingsNotEquals}&totalBookings.specified={totalBookingsSpecified}&totalBookings.in={totalBookingsIn}&totalBookings.notIn={totalBookingsNotIn}&totalRevenue.greaterThan={totalRevenueGreaterThan}&totalRevenue.lessThan={totalRevenueLessThan}&totalRevenue.greaterThanOrEqual={totalRevenueGreaterThanOrEqual}&totalRevenue.lessThanOrEqual={totalRevenueLessThanOrEqual}&totalRevenue.equals={totalRevenueEquals}&totalRevenue.notEquals={totalRevenueNotEquals}&totalRevenue.specified={totalRevenueSpecified}&totalRevenue.in={totalRevenueIn}&totalRevenue.notIn={totalRevenueNotIn}&averagePrice.greaterThan={averagePriceGreaterThan}&averagePrice.lessThan={averagePriceLessThan}&averagePrice.greaterThanOrEqual={averagePriceGreaterThanOrEqual}&averagePrice.lessThanOrEqual={averagePriceLessThanOrEqual}&averagePrice.equals={averagePriceEquals}&averagePrice.notEquals={averagePriceNotEquals}&averagePrice.specified={averagePriceSpecified}&averagePrice.in={averagePriceIn}&averagePrice.notIn={averagePriceNotIn}&occupancyRate.greaterThan={occupancyRateGreaterThan}&occupancyRate.lessThan={occupancyRateLessThan}&occupancyRate.greaterThanOrEqual={occupancyRateGreaterThanOrEqual}&occupancyRate.lessThanOrEqual={occupancyRateLessThanOrEqual}&occupancyRate.equals={occupancyRateEquals}&occupancyRate.notEquals={occupancyRateNotEquals}&occupancyRate.specified={occupancyRateSpecified}&occupancyRate.in={occupancyRateIn}&occupancyRate.notIn={occupancyRateNotIn}&popularSeatTypes.contains={popularSeatTypesContains}&popularSeatTypes.doesNotContain={popularSeatTypesDoesNotContain}&popularSeatTypes.equals={popularSeatTypesEquals}&popularSeatTypes.notEquals={popularSeatTypesNotEquals}&popularSeatTypes.specified={popularSeatTypesSpecified}&popularSeatTypes.in={popularSeatTypesIn}&popularSeatTypes.notIn={popularSeatTypesNotIn}&peakTravelTimes.contains={peakTravelTimesContains}&peakTravelTimes.doesNotContain={peakTravelTimesDoesNotContain}&peakTravelTimes.equals={peakTravelTimesEquals}&peakTravelTimes.notEquals={peakTravelTimesNotEquals}&peakTravelTimes.specified={peakTravelTimesSpecified}&peakTravelTimes.in={peakTravelTimesIn}&peakTravelTimes.notIn={peakTravelTimesNotIn}&cancellationRate.greaterThan={cancellationRateGreaterThan}&cancellationRate.lessThan={cancellationRateLessThan}&cancellationRate.greaterThanOrEqual={cancellationRateGreaterThanOrEqual}&cancellationRate.lessThanOrEqual={cancellationRateLessThanOrEqual}&cancellationRate.equals={cancellationRateEquals}&cancellationRate.notEquals={cancellationRateNotEquals}&cancellationRate.specified={cancellationRateSpecified}&cancellationRate.in={cancellationRateIn}&cancellationRate.notIn={cancellationRateNotIn}&customerSatisfactionScore.greaterThan={customerSatisfactionScoreGreaterThan}&customerSatisfactionScore.lessThan={customerSatisfactionScoreLessThan}&customerSatisfactionScore.greaterThanOrEqual={customerSatisfactionScoreGreaterThanOrEqual}&customerSatisfactionScore.lessThanOrEqual={customerSatisfactionScoreLessThanOrEqual}&customerSatisfactionScore.equals={customerSatisfactionScoreEquals}&customerSatisfactionScore.notEquals={customerSatisfactionScoreNotEquals}&customerSatisfactionScore.specified={customerSatisfactionScoreSpecified}&customerSatisfactionScore.in={customerSatisfactionScoreIn}&customerSatisfactionScore.notIn={customerSatisfactionScoreNotIn}&monthlyTrend.contains={monthlyTrendContains}&monthlyTrend.doesNotContain={monthlyTrendDoesNotContain}&monthlyTrend.equals={monthlyTrendEquals}&monthlyTrend.notEquals={monthlyTrendNotEquals}&monthlyTrend.specified={monthlyTrendSpecified}&monthlyTrend.in={monthlyTrendIn}&monthlyTrend.notIn={monthlyTrendNotIn}&validFrom.greaterThan={validFromGreaterThan}&validFrom.lessThan={validFromLessThan}&validFrom.greaterThanOrEqual={validFromGreaterThanOrEqual}&validFrom.lessThanOrEqual={validFromLessThanOrEqual}&validFrom.equals={validFromEquals}&validFrom.notEquals={validFromNotEquals}&validFrom.specified={validFromSpecified}&validFrom.in={validFromIn}&validFrom.notIn={validFromNotIn}&validTo.greaterThan={validToGreaterThan}&validTo.lessThan={validToLessThan}&validTo.greaterThanOrEqual={validToGreaterThanOrEqual}&validTo.lessThanOrEqual={validToLessThanOrEqual}&validTo.equals={validToEquals}&validTo.notEquals={validToNotEquals}&validTo.specified={validToSpecified}&validTo.in={validToIn}&validTo.notIn={validToNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  List<TripStatisticsDTO> getAllTripStatistics(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("vehicleTypeEquals") @jakarta.annotation.Nullable String vehicleTypeEquals, @Param("vehicleTypeNotEquals") @jakarta.annotation.Nullable String vehicleTypeNotEquals, @Param("vehicleTypeSpecified") @jakarta.annotation.Nullable Boolean vehicleTypeSpecified, @Param("vehicleTypeIn") @jakarta.annotation.Nullable List<String> vehicleTypeIn, @Param("vehicleTypeNotIn") @jakarta.annotation.Nullable List<String> vehicleTypeNotIn, @Param("occasionTypeEquals") @jakarta.annotation.Nullable String occasionTypeEquals, @Param("occasionTypeNotEquals") @jakarta.annotation.Nullable String occasionTypeNotEquals, @Param("occasionTypeSpecified") @jakarta.annotation.Nullable Boolean occasionTypeSpecified, @Param("occasionTypeIn") @jakarta.annotation.Nullable List<String> occasionTypeIn, @Param("occasionTypeNotIn") @jakarta.annotation.Nullable List<String> occasionTypeNotIn, @Param("totalBookingsGreaterThan") @jakarta.annotation.Nullable Integer totalBookingsGreaterThan, @Param("totalBookingsLessThan") @jakarta.annotation.Nullable Integer totalBookingsLessThan, @Param("totalBookingsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer totalBookingsGreaterThanOrEqual, @Param("totalBookingsLessThanOrEqual") @jakarta.annotation.Nullable Integer totalBookingsLessThanOrEqual, @Param("totalBookingsEquals") @jakarta.annotation.Nullable Integer totalBookingsEquals, @Param("totalBookingsNotEquals") @jakarta.annotation.Nullable Integer totalBookingsNotEquals, @Param("totalBookingsSpecified") @jakarta.annotation.Nullable Boolean totalBookingsSpecified, @Param("totalBookingsIn") @jakarta.annotation.Nullable List<Integer> totalBookingsIn, @Param("totalBookingsNotIn") @jakarta.annotation.Nullable List<Integer> totalBookingsNotIn, @Param("totalRevenueGreaterThan") @jakarta.annotation.Nullable BigDecimal totalRevenueGreaterThan, @Param("totalRevenueLessThan") @jakarta.annotation.Nullable BigDecimal totalRevenueLessThan, @Param("totalRevenueGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal totalRevenueGreaterThanOrEqual, @Param("totalRevenueLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal totalRevenueLessThanOrEqual, @Param("totalRevenueEquals") @jakarta.annotation.Nullable BigDecimal totalRevenueEquals, @Param("totalRevenueNotEquals") @jakarta.annotation.Nullable BigDecimal totalRevenueNotEquals, @Param("totalRevenueSpecified") @jakarta.annotation.Nullable Boolean totalRevenueSpecified, @Param("totalRevenueIn") @jakarta.annotation.Nullable List<BigDecimal> totalRevenueIn, @Param("totalRevenueNotIn") @jakarta.annotation.Nullable List<BigDecimal> totalRevenueNotIn, @Param("averagePriceGreaterThan") @jakarta.annotation.Nullable BigDecimal averagePriceGreaterThan, @Param("averagePriceLessThan") @jakarta.annotation.Nullable BigDecimal averagePriceLessThan, @Param("averagePriceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal averagePriceGreaterThanOrEqual, @Param("averagePriceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal averagePriceLessThanOrEqual, @Param("averagePriceEquals") @jakarta.annotation.Nullable BigDecimal averagePriceEquals, @Param("averagePriceNotEquals") @jakarta.annotation.Nullable BigDecimal averagePriceNotEquals, @Param("averagePriceSpecified") @jakarta.annotation.Nullable Boolean averagePriceSpecified, @Param("averagePriceIn") @jakarta.annotation.Nullable List<BigDecimal> averagePriceIn, @Param("averagePriceNotIn") @jakarta.annotation.Nullable List<BigDecimal> averagePriceNotIn, @Param("occupancyRateGreaterThan") @jakarta.annotation.Nullable BigDecimal occupancyRateGreaterThan, @Param("occupancyRateLessThan") @jakarta.annotation.Nullable BigDecimal occupancyRateLessThan, @Param("occupancyRateGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occupancyRateGreaterThanOrEqual, @Param("occupancyRateLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occupancyRateLessThanOrEqual, @Param("occupancyRateEquals") @jakarta.annotation.Nullable BigDecimal occupancyRateEquals, @Param("occupancyRateNotEquals") @jakarta.annotation.Nullable BigDecimal occupancyRateNotEquals, @Param("occupancyRateSpecified") @jakarta.annotation.Nullable Boolean occupancyRateSpecified, @Param("occupancyRateIn") @jakarta.annotation.Nullable List<BigDecimal> occupancyRateIn, @Param("occupancyRateNotIn") @jakarta.annotation.Nullable List<BigDecimal> occupancyRateNotIn, @Param("popularSeatTypesContains") @jakarta.annotation.Nullable String popularSeatTypesContains, @Param("popularSeatTypesDoesNotContain") @jakarta.annotation.Nullable String popularSeatTypesDoesNotContain, @Param("popularSeatTypesEquals") @jakarta.annotation.Nullable String popularSeatTypesEquals, @Param("popularSeatTypesNotEquals") @jakarta.annotation.Nullable String popularSeatTypesNotEquals, @Param("popularSeatTypesSpecified") @jakarta.annotation.Nullable Boolean popularSeatTypesSpecified, @Param("popularSeatTypesIn") @jakarta.annotation.Nullable List<String> popularSeatTypesIn, @Param("popularSeatTypesNotIn") @jakarta.annotation.Nullable List<String> popularSeatTypesNotIn, @Param("peakTravelTimesContains") @jakarta.annotation.Nullable String peakTravelTimesContains, @Param("peakTravelTimesDoesNotContain") @jakarta.annotation.Nullable String peakTravelTimesDoesNotContain, @Param("peakTravelTimesEquals") @jakarta.annotation.Nullable String peakTravelTimesEquals, @Param("peakTravelTimesNotEquals") @jakarta.annotation.Nullable String peakTravelTimesNotEquals, @Param("peakTravelTimesSpecified") @jakarta.annotation.Nullable Boolean peakTravelTimesSpecified, @Param("peakTravelTimesIn") @jakarta.annotation.Nullable List<String> peakTravelTimesIn, @Param("peakTravelTimesNotIn") @jakarta.annotation.Nullable List<String> peakTravelTimesNotIn, @Param("cancellationRateGreaterThan") @jakarta.annotation.Nullable BigDecimal cancellationRateGreaterThan, @Param("cancellationRateLessThan") @jakarta.annotation.Nullable BigDecimal cancellationRateLessThan, @Param("cancellationRateGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal cancellationRateGreaterThanOrEqual, @Param("cancellationRateLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal cancellationRateLessThanOrEqual, @Param("cancellationRateEquals") @jakarta.annotation.Nullable BigDecimal cancellationRateEquals, @Param("cancellationRateNotEquals") @jakarta.annotation.Nullable BigDecimal cancellationRateNotEquals, @Param("cancellationRateSpecified") @jakarta.annotation.Nullable Boolean cancellationRateSpecified, @Param("cancellationRateIn") @jakarta.annotation.Nullable List<BigDecimal> cancellationRateIn, @Param("cancellationRateNotIn") @jakarta.annotation.Nullable List<BigDecimal> cancellationRateNotIn, @Param("customerSatisfactionScoreGreaterThan") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreGreaterThan, @Param("customerSatisfactionScoreLessThan") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreLessThan, @Param("customerSatisfactionScoreGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreGreaterThanOrEqual, @Param("customerSatisfactionScoreLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreLessThanOrEqual, @Param("customerSatisfactionScoreEquals") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreEquals, @Param("customerSatisfactionScoreNotEquals") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreNotEquals, @Param("customerSatisfactionScoreSpecified") @jakarta.annotation.Nullable Boolean customerSatisfactionScoreSpecified, @Param("customerSatisfactionScoreIn") @jakarta.annotation.Nullable List<BigDecimal> customerSatisfactionScoreIn, @Param("customerSatisfactionScoreNotIn") @jakarta.annotation.Nullable List<BigDecimal> customerSatisfactionScoreNotIn, @Param("monthlyTrendContains") @jakarta.annotation.Nullable String monthlyTrendContains, @Param("monthlyTrendDoesNotContain") @jakarta.annotation.Nullable String monthlyTrendDoesNotContain, @Param("monthlyTrendEquals") @jakarta.annotation.Nullable String monthlyTrendEquals, @Param("monthlyTrendNotEquals") @jakarta.annotation.Nullable String monthlyTrendNotEquals, @Param("monthlyTrendSpecified") @jakarta.annotation.Nullable Boolean monthlyTrendSpecified, @Param("monthlyTrendIn") @jakarta.annotation.Nullable List<String> monthlyTrendIn, @Param("monthlyTrendNotIn") @jakarta.annotation.Nullable List<String> monthlyTrendNotIn, @Param("validFromGreaterThan") @jakarta.annotation.Nullable LocalDate validFromGreaterThan, @Param("validFromLessThan") @jakarta.annotation.Nullable LocalDate validFromLessThan, @Param("validFromGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate validFromGreaterThanOrEqual, @Param("validFromLessThanOrEqual") @jakarta.annotation.Nullable LocalDate validFromLessThanOrEqual, @Param("validFromEquals") @jakarta.annotation.Nullable LocalDate validFromEquals, @Param("validFromNotEquals") @jakarta.annotation.Nullable LocalDate validFromNotEquals, @Param("validFromSpecified") @jakarta.annotation.Nullable Boolean validFromSpecified, @Param("validFromIn") @jakarta.annotation.Nullable List<LocalDate> validFromIn, @Param("validFromNotIn") @jakarta.annotation.Nullable List<LocalDate> validFromNotIn, @Param("validToGreaterThan") @jakarta.annotation.Nullable LocalDate validToGreaterThan, @Param("validToLessThan") @jakarta.annotation.Nullable LocalDate validToLessThan, @Param("validToGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate validToGreaterThanOrEqual, @Param("validToLessThanOrEqual") @jakarta.annotation.Nullable LocalDate validToLessThanOrEqual, @Param("validToEquals") @jakarta.annotation.Nullable LocalDate validToEquals, @Param("validToNotEquals") @jakarta.annotation.Nullable LocalDate validToNotEquals, @Param("validToSpecified") @jakarta.annotation.Nullable Boolean validToSpecified, @Param("validToIn") @jakarta.annotation.Nullable List<LocalDate> validToIn, @Param("validToNotIn") @jakarta.annotation.Nullable List<LocalDate> validToNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);

  /**
   * 
   * Similar to <code>getAllTripStatistics</code> but it also returns the http response headers .
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
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param vehicleTypeEquals  (optional)
   * @param vehicleTypeNotEquals  (optional)
   * @param vehicleTypeSpecified  (optional)
   * @param vehicleTypeIn  (optional)
   * @param vehicleTypeNotIn  (optional)
   * @param occasionTypeEquals  (optional)
   * @param occasionTypeNotEquals  (optional)
   * @param occasionTypeSpecified  (optional)
   * @param occasionTypeIn  (optional)
   * @param occasionTypeNotIn  (optional)
   * @param totalBookingsGreaterThan  (optional)
   * @param totalBookingsLessThan  (optional)
   * @param totalBookingsGreaterThanOrEqual  (optional)
   * @param totalBookingsLessThanOrEqual  (optional)
   * @param totalBookingsEquals  (optional)
   * @param totalBookingsNotEquals  (optional)
   * @param totalBookingsSpecified  (optional)
   * @param totalBookingsIn  (optional)
   * @param totalBookingsNotIn  (optional)
   * @param totalRevenueGreaterThan  (optional)
   * @param totalRevenueLessThan  (optional)
   * @param totalRevenueGreaterThanOrEqual  (optional)
   * @param totalRevenueLessThanOrEqual  (optional)
   * @param totalRevenueEquals  (optional)
   * @param totalRevenueNotEquals  (optional)
   * @param totalRevenueSpecified  (optional)
   * @param totalRevenueIn  (optional)
   * @param totalRevenueNotIn  (optional)
   * @param averagePriceGreaterThan  (optional)
   * @param averagePriceLessThan  (optional)
   * @param averagePriceGreaterThanOrEqual  (optional)
   * @param averagePriceLessThanOrEqual  (optional)
   * @param averagePriceEquals  (optional)
   * @param averagePriceNotEquals  (optional)
   * @param averagePriceSpecified  (optional)
   * @param averagePriceIn  (optional)
   * @param averagePriceNotIn  (optional)
   * @param occupancyRateGreaterThan  (optional)
   * @param occupancyRateLessThan  (optional)
   * @param occupancyRateGreaterThanOrEqual  (optional)
   * @param occupancyRateLessThanOrEqual  (optional)
   * @param occupancyRateEquals  (optional)
   * @param occupancyRateNotEquals  (optional)
   * @param occupancyRateSpecified  (optional)
   * @param occupancyRateIn  (optional)
   * @param occupancyRateNotIn  (optional)
   * @param popularSeatTypesContains  (optional)
   * @param popularSeatTypesDoesNotContain  (optional)
   * @param popularSeatTypesEquals  (optional)
   * @param popularSeatTypesNotEquals  (optional)
   * @param popularSeatTypesSpecified  (optional)
   * @param popularSeatTypesIn  (optional)
   * @param popularSeatTypesNotIn  (optional)
   * @param peakTravelTimesContains  (optional)
   * @param peakTravelTimesDoesNotContain  (optional)
   * @param peakTravelTimesEquals  (optional)
   * @param peakTravelTimesNotEquals  (optional)
   * @param peakTravelTimesSpecified  (optional)
   * @param peakTravelTimesIn  (optional)
   * @param peakTravelTimesNotIn  (optional)
   * @param cancellationRateGreaterThan  (optional)
   * @param cancellationRateLessThan  (optional)
   * @param cancellationRateGreaterThanOrEqual  (optional)
   * @param cancellationRateLessThanOrEqual  (optional)
   * @param cancellationRateEquals  (optional)
   * @param cancellationRateNotEquals  (optional)
   * @param cancellationRateSpecified  (optional)
   * @param cancellationRateIn  (optional)
   * @param cancellationRateNotIn  (optional)
   * @param customerSatisfactionScoreGreaterThan  (optional)
   * @param customerSatisfactionScoreLessThan  (optional)
   * @param customerSatisfactionScoreGreaterThanOrEqual  (optional)
   * @param customerSatisfactionScoreLessThanOrEqual  (optional)
   * @param customerSatisfactionScoreEquals  (optional)
   * @param customerSatisfactionScoreNotEquals  (optional)
   * @param customerSatisfactionScoreSpecified  (optional)
   * @param customerSatisfactionScoreIn  (optional)
   * @param customerSatisfactionScoreNotIn  (optional)
   * @param monthlyTrendContains  (optional)
   * @param monthlyTrendDoesNotContain  (optional)
   * @param monthlyTrendEquals  (optional)
   * @param monthlyTrendNotEquals  (optional)
   * @param monthlyTrendSpecified  (optional)
   * @param monthlyTrendIn  (optional)
   * @param monthlyTrendNotIn  (optional)
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
   * @param distinct  (optional)
   * @param page Zero-based page index (0..N) (optional, default to 0)
   * @param size The size of the page to be returned (optional, default to 20)
   * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/trip-statistics?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&occasionType.equals={occasionTypeEquals}&occasionType.notEquals={occasionTypeNotEquals}&occasionType.specified={occasionTypeSpecified}&occasionType.in={occasionTypeIn}&occasionType.notIn={occasionTypeNotIn}&totalBookings.greaterThan={totalBookingsGreaterThan}&totalBookings.lessThan={totalBookingsLessThan}&totalBookings.greaterThanOrEqual={totalBookingsGreaterThanOrEqual}&totalBookings.lessThanOrEqual={totalBookingsLessThanOrEqual}&totalBookings.equals={totalBookingsEquals}&totalBookings.notEquals={totalBookingsNotEquals}&totalBookings.specified={totalBookingsSpecified}&totalBookings.in={totalBookingsIn}&totalBookings.notIn={totalBookingsNotIn}&totalRevenue.greaterThan={totalRevenueGreaterThan}&totalRevenue.lessThan={totalRevenueLessThan}&totalRevenue.greaterThanOrEqual={totalRevenueGreaterThanOrEqual}&totalRevenue.lessThanOrEqual={totalRevenueLessThanOrEqual}&totalRevenue.equals={totalRevenueEquals}&totalRevenue.notEquals={totalRevenueNotEquals}&totalRevenue.specified={totalRevenueSpecified}&totalRevenue.in={totalRevenueIn}&totalRevenue.notIn={totalRevenueNotIn}&averagePrice.greaterThan={averagePriceGreaterThan}&averagePrice.lessThan={averagePriceLessThan}&averagePrice.greaterThanOrEqual={averagePriceGreaterThanOrEqual}&averagePrice.lessThanOrEqual={averagePriceLessThanOrEqual}&averagePrice.equals={averagePriceEquals}&averagePrice.notEquals={averagePriceNotEquals}&averagePrice.specified={averagePriceSpecified}&averagePrice.in={averagePriceIn}&averagePrice.notIn={averagePriceNotIn}&occupancyRate.greaterThan={occupancyRateGreaterThan}&occupancyRate.lessThan={occupancyRateLessThan}&occupancyRate.greaterThanOrEqual={occupancyRateGreaterThanOrEqual}&occupancyRate.lessThanOrEqual={occupancyRateLessThanOrEqual}&occupancyRate.equals={occupancyRateEquals}&occupancyRate.notEquals={occupancyRateNotEquals}&occupancyRate.specified={occupancyRateSpecified}&occupancyRate.in={occupancyRateIn}&occupancyRate.notIn={occupancyRateNotIn}&popularSeatTypes.contains={popularSeatTypesContains}&popularSeatTypes.doesNotContain={popularSeatTypesDoesNotContain}&popularSeatTypes.equals={popularSeatTypesEquals}&popularSeatTypes.notEquals={popularSeatTypesNotEquals}&popularSeatTypes.specified={popularSeatTypesSpecified}&popularSeatTypes.in={popularSeatTypesIn}&popularSeatTypes.notIn={popularSeatTypesNotIn}&peakTravelTimes.contains={peakTravelTimesContains}&peakTravelTimes.doesNotContain={peakTravelTimesDoesNotContain}&peakTravelTimes.equals={peakTravelTimesEquals}&peakTravelTimes.notEquals={peakTravelTimesNotEquals}&peakTravelTimes.specified={peakTravelTimesSpecified}&peakTravelTimes.in={peakTravelTimesIn}&peakTravelTimes.notIn={peakTravelTimesNotIn}&cancellationRate.greaterThan={cancellationRateGreaterThan}&cancellationRate.lessThan={cancellationRateLessThan}&cancellationRate.greaterThanOrEqual={cancellationRateGreaterThanOrEqual}&cancellationRate.lessThanOrEqual={cancellationRateLessThanOrEqual}&cancellationRate.equals={cancellationRateEquals}&cancellationRate.notEquals={cancellationRateNotEquals}&cancellationRate.specified={cancellationRateSpecified}&cancellationRate.in={cancellationRateIn}&cancellationRate.notIn={cancellationRateNotIn}&customerSatisfactionScore.greaterThan={customerSatisfactionScoreGreaterThan}&customerSatisfactionScore.lessThan={customerSatisfactionScoreLessThan}&customerSatisfactionScore.greaterThanOrEqual={customerSatisfactionScoreGreaterThanOrEqual}&customerSatisfactionScore.lessThanOrEqual={customerSatisfactionScoreLessThanOrEqual}&customerSatisfactionScore.equals={customerSatisfactionScoreEquals}&customerSatisfactionScore.notEquals={customerSatisfactionScoreNotEquals}&customerSatisfactionScore.specified={customerSatisfactionScoreSpecified}&customerSatisfactionScore.in={customerSatisfactionScoreIn}&customerSatisfactionScore.notIn={customerSatisfactionScoreNotIn}&monthlyTrend.contains={monthlyTrendContains}&monthlyTrend.doesNotContain={monthlyTrendDoesNotContain}&monthlyTrend.equals={monthlyTrendEquals}&monthlyTrend.notEquals={monthlyTrendNotEquals}&monthlyTrend.specified={monthlyTrendSpecified}&monthlyTrend.in={monthlyTrendIn}&monthlyTrend.notIn={monthlyTrendNotIn}&validFrom.greaterThan={validFromGreaterThan}&validFrom.lessThan={validFromLessThan}&validFrom.greaterThanOrEqual={validFromGreaterThanOrEqual}&validFrom.lessThanOrEqual={validFromLessThanOrEqual}&validFrom.equals={validFromEquals}&validFrom.notEquals={validFromNotEquals}&validFrom.specified={validFromSpecified}&validFrom.in={validFromIn}&validFrom.notIn={validFromNotIn}&validTo.greaterThan={validToGreaterThan}&validTo.lessThan={validToLessThan}&validTo.greaterThanOrEqual={validToGreaterThanOrEqual}&validTo.lessThanOrEqual={validToLessThanOrEqual}&validTo.equals={validToEquals}&validTo.notEquals={validToNotEquals}&validTo.specified={validToSpecified}&validTo.in={validToIn}&validTo.notIn={validToNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<TripStatisticsDTO>> getAllTripStatisticsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("vehicleTypeEquals") @jakarta.annotation.Nullable String vehicleTypeEquals, @Param("vehicleTypeNotEquals") @jakarta.annotation.Nullable String vehicleTypeNotEquals, @Param("vehicleTypeSpecified") @jakarta.annotation.Nullable Boolean vehicleTypeSpecified, @Param("vehicleTypeIn") @jakarta.annotation.Nullable List<String> vehicleTypeIn, @Param("vehicleTypeNotIn") @jakarta.annotation.Nullable List<String> vehicleTypeNotIn, @Param("occasionTypeEquals") @jakarta.annotation.Nullable String occasionTypeEquals, @Param("occasionTypeNotEquals") @jakarta.annotation.Nullable String occasionTypeNotEquals, @Param("occasionTypeSpecified") @jakarta.annotation.Nullable Boolean occasionTypeSpecified, @Param("occasionTypeIn") @jakarta.annotation.Nullable List<String> occasionTypeIn, @Param("occasionTypeNotIn") @jakarta.annotation.Nullable List<String> occasionTypeNotIn, @Param("totalBookingsGreaterThan") @jakarta.annotation.Nullable Integer totalBookingsGreaterThan, @Param("totalBookingsLessThan") @jakarta.annotation.Nullable Integer totalBookingsLessThan, @Param("totalBookingsGreaterThanOrEqual") @jakarta.annotation.Nullable Integer totalBookingsGreaterThanOrEqual, @Param("totalBookingsLessThanOrEqual") @jakarta.annotation.Nullable Integer totalBookingsLessThanOrEqual, @Param("totalBookingsEquals") @jakarta.annotation.Nullable Integer totalBookingsEquals, @Param("totalBookingsNotEquals") @jakarta.annotation.Nullable Integer totalBookingsNotEquals, @Param("totalBookingsSpecified") @jakarta.annotation.Nullable Boolean totalBookingsSpecified, @Param("totalBookingsIn") @jakarta.annotation.Nullable List<Integer> totalBookingsIn, @Param("totalBookingsNotIn") @jakarta.annotation.Nullable List<Integer> totalBookingsNotIn, @Param("totalRevenueGreaterThan") @jakarta.annotation.Nullable BigDecimal totalRevenueGreaterThan, @Param("totalRevenueLessThan") @jakarta.annotation.Nullable BigDecimal totalRevenueLessThan, @Param("totalRevenueGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal totalRevenueGreaterThanOrEqual, @Param("totalRevenueLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal totalRevenueLessThanOrEqual, @Param("totalRevenueEquals") @jakarta.annotation.Nullable BigDecimal totalRevenueEquals, @Param("totalRevenueNotEquals") @jakarta.annotation.Nullable BigDecimal totalRevenueNotEquals, @Param("totalRevenueSpecified") @jakarta.annotation.Nullable Boolean totalRevenueSpecified, @Param("totalRevenueIn") @jakarta.annotation.Nullable List<BigDecimal> totalRevenueIn, @Param("totalRevenueNotIn") @jakarta.annotation.Nullable List<BigDecimal> totalRevenueNotIn, @Param("averagePriceGreaterThan") @jakarta.annotation.Nullable BigDecimal averagePriceGreaterThan, @Param("averagePriceLessThan") @jakarta.annotation.Nullable BigDecimal averagePriceLessThan, @Param("averagePriceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal averagePriceGreaterThanOrEqual, @Param("averagePriceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal averagePriceLessThanOrEqual, @Param("averagePriceEquals") @jakarta.annotation.Nullable BigDecimal averagePriceEquals, @Param("averagePriceNotEquals") @jakarta.annotation.Nullable BigDecimal averagePriceNotEquals, @Param("averagePriceSpecified") @jakarta.annotation.Nullable Boolean averagePriceSpecified, @Param("averagePriceIn") @jakarta.annotation.Nullable List<BigDecimal> averagePriceIn, @Param("averagePriceNotIn") @jakarta.annotation.Nullable List<BigDecimal> averagePriceNotIn, @Param("occupancyRateGreaterThan") @jakarta.annotation.Nullable BigDecimal occupancyRateGreaterThan, @Param("occupancyRateLessThan") @jakarta.annotation.Nullable BigDecimal occupancyRateLessThan, @Param("occupancyRateGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal occupancyRateGreaterThanOrEqual, @Param("occupancyRateLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal occupancyRateLessThanOrEqual, @Param("occupancyRateEquals") @jakarta.annotation.Nullable BigDecimal occupancyRateEquals, @Param("occupancyRateNotEquals") @jakarta.annotation.Nullable BigDecimal occupancyRateNotEquals, @Param("occupancyRateSpecified") @jakarta.annotation.Nullable Boolean occupancyRateSpecified, @Param("occupancyRateIn") @jakarta.annotation.Nullable List<BigDecimal> occupancyRateIn, @Param("occupancyRateNotIn") @jakarta.annotation.Nullable List<BigDecimal> occupancyRateNotIn, @Param("popularSeatTypesContains") @jakarta.annotation.Nullable String popularSeatTypesContains, @Param("popularSeatTypesDoesNotContain") @jakarta.annotation.Nullable String popularSeatTypesDoesNotContain, @Param("popularSeatTypesEquals") @jakarta.annotation.Nullable String popularSeatTypesEquals, @Param("popularSeatTypesNotEquals") @jakarta.annotation.Nullable String popularSeatTypesNotEquals, @Param("popularSeatTypesSpecified") @jakarta.annotation.Nullable Boolean popularSeatTypesSpecified, @Param("popularSeatTypesIn") @jakarta.annotation.Nullable List<String> popularSeatTypesIn, @Param("popularSeatTypesNotIn") @jakarta.annotation.Nullable List<String> popularSeatTypesNotIn, @Param("peakTravelTimesContains") @jakarta.annotation.Nullable String peakTravelTimesContains, @Param("peakTravelTimesDoesNotContain") @jakarta.annotation.Nullable String peakTravelTimesDoesNotContain, @Param("peakTravelTimesEquals") @jakarta.annotation.Nullable String peakTravelTimesEquals, @Param("peakTravelTimesNotEquals") @jakarta.annotation.Nullable String peakTravelTimesNotEquals, @Param("peakTravelTimesSpecified") @jakarta.annotation.Nullable Boolean peakTravelTimesSpecified, @Param("peakTravelTimesIn") @jakarta.annotation.Nullable List<String> peakTravelTimesIn, @Param("peakTravelTimesNotIn") @jakarta.annotation.Nullable List<String> peakTravelTimesNotIn, @Param("cancellationRateGreaterThan") @jakarta.annotation.Nullable BigDecimal cancellationRateGreaterThan, @Param("cancellationRateLessThan") @jakarta.annotation.Nullable BigDecimal cancellationRateLessThan, @Param("cancellationRateGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal cancellationRateGreaterThanOrEqual, @Param("cancellationRateLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal cancellationRateLessThanOrEqual, @Param("cancellationRateEquals") @jakarta.annotation.Nullable BigDecimal cancellationRateEquals, @Param("cancellationRateNotEquals") @jakarta.annotation.Nullable BigDecimal cancellationRateNotEquals, @Param("cancellationRateSpecified") @jakarta.annotation.Nullable Boolean cancellationRateSpecified, @Param("cancellationRateIn") @jakarta.annotation.Nullable List<BigDecimal> cancellationRateIn, @Param("cancellationRateNotIn") @jakarta.annotation.Nullable List<BigDecimal> cancellationRateNotIn, @Param("customerSatisfactionScoreGreaterThan") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreGreaterThan, @Param("customerSatisfactionScoreLessThan") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreLessThan, @Param("customerSatisfactionScoreGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreGreaterThanOrEqual, @Param("customerSatisfactionScoreLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreLessThanOrEqual, @Param("customerSatisfactionScoreEquals") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreEquals, @Param("customerSatisfactionScoreNotEquals") @jakarta.annotation.Nullable BigDecimal customerSatisfactionScoreNotEquals, @Param("customerSatisfactionScoreSpecified") @jakarta.annotation.Nullable Boolean customerSatisfactionScoreSpecified, @Param("customerSatisfactionScoreIn") @jakarta.annotation.Nullable List<BigDecimal> customerSatisfactionScoreIn, @Param("customerSatisfactionScoreNotIn") @jakarta.annotation.Nullable List<BigDecimal> customerSatisfactionScoreNotIn, @Param("monthlyTrendContains") @jakarta.annotation.Nullable String monthlyTrendContains, @Param("monthlyTrendDoesNotContain") @jakarta.annotation.Nullable String monthlyTrendDoesNotContain, @Param("monthlyTrendEquals") @jakarta.annotation.Nullable String monthlyTrendEquals, @Param("monthlyTrendNotEquals") @jakarta.annotation.Nullable String monthlyTrendNotEquals, @Param("monthlyTrendSpecified") @jakarta.annotation.Nullable Boolean monthlyTrendSpecified, @Param("monthlyTrendIn") @jakarta.annotation.Nullable List<String> monthlyTrendIn, @Param("monthlyTrendNotIn") @jakarta.annotation.Nullable List<String> monthlyTrendNotIn, @Param("validFromGreaterThan") @jakarta.annotation.Nullable LocalDate validFromGreaterThan, @Param("validFromLessThan") @jakarta.annotation.Nullable LocalDate validFromLessThan, @Param("validFromGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate validFromGreaterThanOrEqual, @Param("validFromLessThanOrEqual") @jakarta.annotation.Nullable LocalDate validFromLessThanOrEqual, @Param("validFromEquals") @jakarta.annotation.Nullable LocalDate validFromEquals, @Param("validFromNotEquals") @jakarta.annotation.Nullable LocalDate validFromNotEquals, @Param("validFromSpecified") @jakarta.annotation.Nullable Boolean validFromSpecified, @Param("validFromIn") @jakarta.annotation.Nullable List<LocalDate> validFromIn, @Param("validFromNotIn") @jakarta.annotation.Nullable List<LocalDate> validFromNotIn, @Param("validToGreaterThan") @jakarta.annotation.Nullable LocalDate validToGreaterThan, @Param("validToLessThan") @jakarta.annotation.Nullable LocalDate validToLessThan, @Param("validToGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate validToGreaterThanOrEqual, @Param("validToLessThanOrEqual") @jakarta.annotation.Nullable LocalDate validToLessThanOrEqual, @Param("validToEquals") @jakarta.annotation.Nullable LocalDate validToEquals, @Param("validToNotEquals") @jakarta.annotation.Nullable LocalDate validToNotEquals, @Param("validToSpecified") @jakarta.annotation.Nullable Boolean validToSpecified, @Param("validToIn") @jakarta.annotation.Nullable List<LocalDate> validToIn, @Param("validToNotIn") @jakarta.annotation.Nullable List<LocalDate> validToNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllTripStatistics</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllTripStatisticsQueryParams} class that allows for
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
   *   <li>routeIdGreaterThan -  (optional)</li>
   *   <li>routeIdLessThan -  (optional)</li>
   *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
   *   <li>routeIdLessThanOrEqual -  (optional)</li>
   *   <li>routeIdEquals -  (optional)</li>
   *   <li>routeIdNotEquals -  (optional)</li>
   *   <li>routeIdSpecified -  (optional)</li>
   *   <li>routeIdIn -  (optional)</li>
   *   <li>routeIdNotIn -  (optional)</li>
   *   <li>vehicleTypeEquals -  (optional)</li>
   *   <li>vehicleTypeNotEquals -  (optional)</li>
   *   <li>vehicleTypeSpecified -  (optional)</li>
   *   <li>vehicleTypeIn -  (optional)</li>
   *   <li>vehicleTypeNotIn -  (optional)</li>
   *   <li>occasionTypeEquals -  (optional)</li>
   *   <li>occasionTypeNotEquals -  (optional)</li>
   *   <li>occasionTypeSpecified -  (optional)</li>
   *   <li>occasionTypeIn -  (optional)</li>
   *   <li>occasionTypeNotIn -  (optional)</li>
   *   <li>totalBookingsGreaterThan -  (optional)</li>
   *   <li>totalBookingsLessThan -  (optional)</li>
   *   <li>totalBookingsGreaterThanOrEqual -  (optional)</li>
   *   <li>totalBookingsLessThanOrEqual -  (optional)</li>
   *   <li>totalBookingsEquals -  (optional)</li>
   *   <li>totalBookingsNotEquals -  (optional)</li>
   *   <li>totalBookingsSpecified -  (optional)</li>
   *   <li>totalBookingsIn -  (optional)</li>
   *   <li>totalBookingsNotIn -  (optional)</li>
   *   <li>totalRevenueGreaterThan -  (optional)</li>
   *   <li>totalRevenueLessThan -  (optional)</li>
   *   <li>totalRevenueGreaterThanOrEqual -  (optional)</li>
   *   <li>totalRevenueLessThanOrEqual -  (optional)</li>
   *   <li>totalRevenueEquals -  (optional)</li>
   *   <li>totalRevenueNotEquals -  (optional)</li>
   *   <li>totalRevenueSpecified -  (optional)</li>
   *   <li>totalRevenueIn -  (optional)</li>
   *   <li>totalRevenueNotIn -  (optional)</li>
   *   <li>averagePriceGreaterThan -  (optional)</li>
   *   <li>averagePriceLessThan -  (optional)</li>
   *   <li>averagePriceGreaterThanOrEqual -  (optional)</li>
   *   <li>averagePriceLessThanOrEqual -  (optional)</li>
   *   <li>averagePriceEquals -  (optional)</li>
   *   <li>averagePriceNotEquals -  (optional)</li>
   *   <li>averagePriceSpecified -  (optional)</li>
   *   <li>averagePriceIn -  (optional)</li>
   *   <li>averagePriceNotIn -  (optional)</li>
   *   <li>occupancyRateGreaterThan -  (optional)</li>
   *   <li>occupancyRateLessThan -  (optional)</li>
   *   <li>occupancyRateGreaterThanOrEqual -  (optional)</li>
   *   <li>occupancyRateLessThanOrEqual -  (optional)</li>
   *   <li>occupancyRateEquals -  (optional)</li>
   *   <li>occupancyRateNotEquals -  (optional)</li>
   *   <li>occupancyRateSpecified -  (optional)</li>
   *   <li>occupancyRateIn -  (optional)</li>
   *   <li>occupancyRateNotIn -  (optional)</li>
   *   <li>popularSeatTypesContains -  (optional)</li>
   *   <li>popularSeatTypesDoesNotContain -  (optional)</li>
   *   <li>popularSeatTypesEquals -  (optional)</li>
   *   <li>popularSeatTypesNotEquals -  (optional)</li>
   *   <li>popularSeatTypesSpecified -  (optional)</li>
   *   <li>popularSeatTypesIn -  (optional)</li>
   *   <li>popularSeatTypesNotIn -  (optional)</li>
   *   <li>peakTravelTimesContains -  (optional)</li>
   *   <li>peakTravelTimesDoesNotContain -  (optional)</li>
   *   <li>peakTravelTimesEquals -  (optional)</li>
   *   <li>peakTravelTimesNotEquals -  (optional)</li>
   *   <li>peakTravelTimesSpecified -  (optional)</li>
   *   <li>peakTravelTimesIn -  (optional)</li>
   *   <li>peakTravelTimesNotIn -  (optional)</li>
   *   <li>cancellationRateGreaterThan -  (optional)</li>
   *   <li>cancellationRateLessThan -  (optional)</li>
   *   <li>cancellationRateGreaterThanOrEqual -  (optional)</li>
   *   <li>cancellationRateLessThanOrEqual -  (optional)</li>
   *   <li>cancellationRateEquals -  (optional)</li>
   *   <li>cancellationRateNotEquals -  (optional)</li>
   *   <li>cancellationRateSpecified -  (optional)</li>
   *   <li>cancellationRateIn -  (optional)</li>
   *   <li>cancellationRateNotIn -  (optional)</li>
   *   <li>customerSatisfactionScoreGreaterThan -  (optional)</li>
   *   <li>customerSatisfactionScoreLessThan -  (optional)</li>
   *   <li>customerSatisfactionScoreGreaterThanOrEqual -  (optional)</li>
   *   <li>customerSatisfactionScoreLessThanOrEqual -  (optional)</li>
   *   <li>customerSatisfactionScoreEquals -  (optional)</li>
   *   <li>customerSatisfactionScoreNotEquals -  (optional)</li>
   *   <li>customerSatisfactionScoreSpecified -  (optional)</li>
   *   <li>customerSatisfactionScoreIn -  (optional)</li>
   *   <li>customerSatisfactionScoreNotIn -  (optional)</li>
   *   <li>monthlyTrendContains -  (optional)</li>
   *   <li>monthlyTrendDoesNotContain -  (optional)</li>
   *   <li>monthlyTrendEquals -  (optional)</li>
   *   <li>monthlyTrendNotEquals -  (optional)</li>
   *   <li>monthlyTrendSpecified -  (optional)</li>
   *   <li>monthlyTrendIn -  (optional)</li>
   *   <li>monthlyTrendNotIn -  (optional)</li>
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
   *   <li>distinct -  (optional)</li>
   *   <li>page - Zero-based page index (0..N) (optional, default to 0)</li>
   *   <li>size - The size of the page to be returned (optional, default to 20)</li>
   *   <li>sort - Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
   *   </ul>
   * @return List&lt;TripStatisticsDTO&gt;
   */
  @RequestLine("GET /api/trip-statistics?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&occasionType.equals={occasionTypeEquals}&occasionType.notEquals={occasionTypeNotEquals}&occasionType.specified={occasionTypeSpecified}&occasionType.in={occasionTypeIn}&occasionType.notIn={occasionTypeNotIn}&totalBookings.greaterThan={totalBookingsGreaterThan}&totalBookings.lessThan={totalBookingsLessThan}&totalBookings.greaterThanOrEqual={totalBookingsGreaterThanOrEqual}&totalBookings.lessThanOrEqual={totalBookingsLessThanOrEqual}&totalBookings.equals={totalBookingsEquals}&totalBookings.notEquals={totalBookingsNotEquals}&totalBookings.specified={totalBookingsSpecified}&totalBookings.in={totalBookingsIn}&totalBookings.notIn={totalBookingsNotIn}&totalRevenue.greaterThan={totalRevenueGreaterThan}&totalRevenue.lessThan={totalRevenueLessThan}&totalRevenue.greaterThanOrEqual={totalRevenueGreaterThanOrEqual}&totalRevenue.lessThanOrEqual={totalRevenueLessThanOrEqual}&totalRevenue.equals={totalRevenueEquals}&totalRevenue.notEquals={totalRevenueNotEquals}&totalRevenue.specified={totalRevenueSpecified}&totalRevenue.in={totalRevenueIn}&totalRevenue.notIn={totalRevenueNotIn}&averagePrice.greaterThan={averagePriceGreaterThan}&averagePrice.lessThan={averagePriceLessThan}&averagePrice.greaterThanOrEqual={averagePriceGreaterThanOrEqual}&averagePrice.lessThanOrEqual={averagePriceLessThanOrEqual}&averagePrice.equals={averagePriceEquals}&averagePrice.notEquals={averagePriceNotEquals}&averagePrice.specified={averagePriceSpecified}&averagePrice.in={averagePriceIn}&averagePrice.notIn={averagePriceNotIn}&occupancyRate.greaterThan={occupancyRateGreaterThan}&occupancyRate.lessThan={occupancyRateLessThan}&occupancyRate.greaterThanOrEqual={occupancyRateGreaterThanOrEqual}&occupancyRate.lessThanOrEqual={occupancyRateLessThanOrEqual}&occupancyRate.equals={occupancyRateEquals}&occupancyRate.notEquals={occupancyRateNotEquals}&occupancyRate.specified={occupancyRateSpecified}&occupancyRate.in={occupancyRateIn}&occupancyRate.notIn={occupancyRateNotIn}&popularSeatTypes.contains={popularSeatTypesContains}&popularSeatTypes.doesNotContain={popularSeatTypesDoesNotContain}&popularSeatTypes.equals={popularSeatTypesEquals}&popularSeatTypes.notEquals={popularSeatTypesNotEquals}&popularSeatTypes.specified={popularSeatTypesSpecified}&popularSeatTypes.in={popularSeatTypesIn}&popularSeatTypes.notIn={popularSeatTypesNotIn}&peakTravelTimes.contains={peakTravelTimesContains}&peakTravelTimes.doesNotContain={peakTravelTimesDoesNotContain}&peakTravelTimes.equals={peakTravelTimesEquals}&peakTravelTimes.notEquals={peakTravelTimesNotEquals}&peakTravelTimes.specified={peakTravelTimesSpecified}&peakTravelTimes.in={peakTravelTimesIn}&peakTravelTimes.notIn={peakTravelTimesNotIn}&cancellationRate.greaterThan={cancellationRateGreaterThan}&cancellationRate.lessThan={cancellationRateLessThan}&cancellationRate.greaterThanOrEqual={cancellationRateGreaterThanOrEqual}&cancellationRate.lessThanOrEqual={cancellationRateLessThanOrEqual}&cancellationRate.equals={cancellationRateEquals}&cancellationRate.notEquals={cancellationRateNotEquals}&cancellationRate.specified={cancellationRateSpecified}&cancellationRate.in={cancellationRateIn}&cancellationRate.notIn={cancellationRateNotIn}&customerSatisfactionScore.greaterThan={customerSatisfactionScoreGreaterThan}&customerSatisfactionScore.lessThan={customerSatisfactionScoreLessThan}&customerSatisfactionScore.greaterThanOrEqual={customerSatisfactionScoreGreaterThanOrEqual}&customerSatisfactionScore.lessThanOrEqual={customerSatisfactionScoreLessThanOrEqual}&customerSatisfactionScore.equals={customerSatisfactionScoreEquals}&customerSatisfactionScore.notEquals={customerSatisfactionScoreNotEquals}&customerSatisfactionScore.specified={customerSatisfactionScoreSpecified}&customerSatisfactionScore.in={customerSatisfactionScoreIn}&customerSatisfactionScore.notIn={customerSatisfactionScoreNotIn}&monthlyTrend.contains={monthlyTrendContains}&monthlyTrend.doesNotContain={monthlyTrendDoesNotContain}&monthlyTrend.equals={monthlyTrendEquals}&monthlyTrend.notEquals={monthlyTrendNotEquals}&monthlyTrend.specified={monthlyTrendSpecified}&monthlyTrend.in={monthlyTrendIn}&monthlyTrend.notIn={monthlyTrendNotIn}&validFrom.greaterThan={validFromGreaterThan}&validFrom.lessThan={validFromLessThan}&validFrom.greaterThanOrEqual={validFromGreaterThanOrEqual}&validFrom.lessThanOrEqual={validFromLessThanOrEqual}&validFrom.equals={validFromEquals}&validFrom.notEquals={validFromNotEquals}&validFrom.specified={validFromSpecified}&validFrom.in={validFromIn}&validFrom.notIn={validFromNotIn}&validTo.greaterThan={validToGreaterThan}&validTo.lessThan={validToLessThan}&validTo.greaterThanOrEqual={validToGreaterThanOrEqual}&validTo.lessThanOrEqual={validToLessThanOrEqual}&validTo.equals={validToEquals}&validTo.notEquals={validToNotEquals}&validTo.specified={validToSpecified}&validTo.in={validToIn}&validTo.notIn={validToNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
  "Accept: */*",
  })
  List<TripStatisticsDTO> getAllTripStatistics(@QueryMap(encoded=true) GetAllTripStatisticsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllTripStatistics</code> that receives the query parameters as a map,
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
          *   <li>routeIdGreaterThan -  (optional)</li>
          *   <li>routeIdLessThan -  (optional)</li>
          *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
          *   <li>routeIdLessThanOrEqual -  (optional)</li>
          *   <li>routeIdEquals -  (optional)</li>
          *   <li>routeIdNotEquals -  (optional)</li>
          *   <li>routeIdSpecified -  (optional)</li>
          *   <li>routeIdIn -  (optional)</li>
          *   <li>routeIdNotIn -  (optional)</li>
          *   <li>vehicleTypeEquals -  (optional)</li>
          *   <li>vehicleTypeNotEquals -  (optional)</li>
          *   <li>vehicleTypeSpecified -  (optional)</li>
          *   <li>vehicleTypeIn -  (optional)</li>
          *   <li>vehicleTypeNotIn -  (optional)</li>
          *   <li>occasionTypeEquals -  (optional)</li>
          *   <li>occasionTypeNotEquals -  (optional)</li>
          *   <li>occasionTypeSpecified -  (optional)</li>
          *   <li>occasionTypeIn -  (optional)</li>
          *   <li>occasionTypeNotIn -  (optional)</li>
          *   <li>totalBookingsGreaterThan -  (optional)</li>
          *   <li>totalBookingsLessThan -  (optional)</li>
          *   <li>totalBookingsGreaterThanOrEqual -  (optional)</li>
          *   <li>totalBookingsLessThanOrEqual -  (optional)</li>
          *   <li>totalBookingsEquals -  (optional)</li>
          *   <li>totalBookingsNotEquals -  (optional)</li>
          *   <li>totalBookingsSpecified -  (optional)</li>
          *   <li>totalBookingsIn -  (optional)</li>
          *   <li>totalBookingsNotIn -  (optional)</li>
          *   <li>totalRevenueGreaterThan -  (optional)</li>
          *   <li>totalRevenueLessThan -  (optional)</li>
          *   <li>totalRevenueGreaterThanOrEqual -  (optional)</li>
          *   <li>totalRevenueLessThanOrEqual -  (optional)</li>
          *   <li>totalRevenueEquals -  (optional)</li>
          *   <li>totalRevenueNotEquals -  (optional)</li>
          *   <li>totalRevenueSpecified -  (optional)</li>
          *   <li>totalRevenueIn -  (optional)</li>
          *   <li>totalRevenueNotIn -  (optional)</li>
          *   <li>averagePriceGreaterThan -  (optional)</li>
          *   <li>averagePriceLessThan -  (optional)</li>
          *   <li>averagePriceGreaterThanOrEqual -  (optional)</li>
          *   <li>averagePriceLessThanOrEqual -  (optional)</li>
          *   <li>averagePriceEquals -  (optional)</li>
          *   <li>averagePriceNotEquals -  (optional)</li>
          *   <li>averagePriceSpecified -  (optional)</li>
          *   <li>averagePriceIn -  (optional)</li>
          *   <li>averagePriceNotIn -  (optional)</li>
          *   <li>occupancyRateGreaterThan -  (optional)</li>
          *   <li>occupancyRateLessThan -  (optional)</li>
          *   <li>occupancyRateGreaterThanOrEqual -  (optional)</li>
          *   <li>occupancyRateLessThanOrEqual -  (optional)</li>
          *   <li>occupancyRateEquals -  (optional)</li>
          *   <li>occupancyRateNotEquals -  (optional)</li>
          *   <li>occupancyRateSpecified -  (optional)</li>
          *   <li>occupancyRateIn -  (optional)</li>
          *   <li>occupancyRateNotIn -  (optional)</li>
          *   <li>popularSeatTypesContains -  (optional)</li>
          *   <li>popularSeatTypesDoesNotContain -  (optional)</li>
          *   <li>popularSeatTypesEquals -  (optional)</li>
          *   <li>popularSeatTypesNotEquals -  (optional)</li>
          *   <li>popularSeatTypesSpecified -  (optional)</li>
          *   <li>popularSeatTypesIn -  (optional)</li>
          *   <li>popularSeatTypesNotIn -  (optional)</li>
          *   <li>peakTravelTimesContains -  (optional)</li>
          *   <li>peakTravelTimesDoesNotContain -  (optional)</li>
          *   <li>peakTravelTimesEquals -  (optional)</li>
          *   <li>peakTravelTimesNotEquals -  (optional)</li>
          *   <li>peakTravelTimesSpecified -  (optional)</li>
          *   <li>peakTravelTimesIn -  (optional)</li>
          *   <li>peakTravelTimesNotIn -  (optional)</li>
          *   <li>cancellationRateGreaterThan -  (optional)</li>
          *   <li>cancellationRateLessThan -  (optional)</li>
          *   <li>cancellationRateGreaterThanOrEqual -  (optional)</li>
          *   <li>cancellationRateLessThanOrEqual -  (optional)</li>
          *   <li>cancellationRateEquals -  (optional)</li>
          *   <li>cancellationRateNotEquals -  (optional)</li>
          *   <li>cancellationRateSpecified -  (optional)</li>
          *   <li>cancellationRateIn -  (optional)</li>
          *   <li>cancellationRateNotIn -  (optional)</li>
          *   <li>customerSatisfactionScoreGreaterThan -  (optional)</li>
          *   <li>customerSatisfactionScoreLessThan -  (optional)</li>
          *   <li>customerSatisfactionScoreGreaterThanOrEqual -  (optional)</li>
          *   <li>customerSatisfactionScoreLessThanOrEqual -  (optional)</li>
          *   <li>customerSatisfactionScoreEquals -  (optional)</li>
          *   <li>customerSatisfactionScoreNotEquals -  (optional)</li>
          *   <li>customerSatisfactionScoreSpecified -  (optional)</li>
          *   <li>customerSatisfactionScoreIn -  (optional)</li>
          *   <li>customerSatisfactionScoreNotIn -  (optional)</li>
          *   <li>monthlyTrendContains -  (optional)</li>
          *   <li>monthlyTrendDoesNotContain -  (optional)</li>
          *   <li>monthlyTrendEquals -  (optional)</li>
          *   <li>monthlyTrendNotEquals -  (optional)</li>
          *   <li>monthlyTrendSpecified -  (optional)</li>
          *   <li>monthlyTrendIn -  (optional)</li>
          *   <li>monthlyTrendNotIn -  (optional)</li>
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
          *   <li>distinct -  (optional)</li>
          *   <li>page - Zero-based page index (0..N) (optional, default to 0)</li>
          *   <li>size - The size of the page to be returned (optional, default to 20)</li>
          *   <li>sort - Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
      *   </ul>
          * @return List&lt;TripStatisticsDTO&gt;
      */
      @RequestLine("GET /api/trip-statistics?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&vehicleType.equals={vehicleTypeEquals}&vehicleType.notEquals={vehicleTypeNotEquals}&vehicleType.specified={vehicleTypeSpecified}&vehicleType.in={vehicleTypeIn}&vehicleType.notIn={vehicleTypeNotIn}&occasionType.equals={occasionTypeEquals}&occasionType.notEquals={occasionTypeNotEquals}&occasionType.specified={occasionTypeSpecified}&occasionType.in={occasionTypeIn}&occasionType.notIn={occasionTypeNotIn}&totalBookings.greaterThan={totalBookingsGreaterThan}&totalBookings.lessThan={totalBookingsLessThan}&totalBookings.greaterThanOrEqual={totalBookingsGreaterThanOrEqual}&totalBookings.lessThanOrEqual={totalBookingsLessThanOrEqual}&totalBookings.equals={totalBookingsEquals}&totalBookings.notEquals={totalBookingsNotEquals}&totalBookings.specified={totalBookingsSpecified}&totalBookings.in={totalBookingsIn}&totalBookings.notIn={totalBookingsNotIn}&totalRevenue.greaterThan={totalRevenueGreaterThan}&totalRevenue.lessThan={totalRevenueLessThan}&totalRevenue.greaterThanOrEqual={totalRevenueGreaterThanOrEqual}&totalRevenue.lessThanOrEqual={totalRevenueLessThanOrEqual}&totalRevenue.equals={totalRevenueEquals}&totalRevenue.notEquals={totalRevenueNotEquals}&totalRevenue.specified={totalRevenueSpecified}&totalRevenue.in={totalRevenueIn}&totalRevenue.notIn={totalRevenueNotIn}&averagePrice.greaterThan={averagePriceGreaterThan}&averagePrice.lessThan={averagePriceLessThan}&averagePrice.greaterThanOrEqual={averagePriceGreaterThanOrEqual}&averagePrice.lessThanOrEqual={averagePriceLessThanOrEqual}&averagePrice.equals={averagePriceEquals}&averagePrice.notEquals={averagePriceNotEquals}&averagePrice.specified={averagePriceSpecified}&averagePrice.in={averagePriceIn}&averagePrice.notIn={averagePriceNotIn}&occupancyRate.greaterThan={occupancyRateGreaterThan}&occupancyRate.lessThan={occupancyRateLessThan}&occupancyRate.greaterThanOrEqual={occupancyRateGreaterThanOrEqual}&occupancyRate.lessThanOrEqual={occupancyRateLessThanOrEqual}&occupancyRate.equals={occupancyRateEquals}&occupancyRate.notEquals={occupancyRateNotEquals}&occupancyRate.specified={occupancyRateSpecified}&occupancyRate.in={occupancyRateIn}&occupancyRate.notIn={occupancyRateNotIn}&popularSeatTypes.contains={popularSeatTypesContains}&popularSeatTypes.doesNotContain={popularSeatTypesDoesNotContain}&popularSeatTypes.equals={popularSeatTypesEquals}&popularSeatTypes.notEquals={popularSeatTypesNotEquals}&popularSeatTypes.specified={popularSeatTypesSpecified}&popularSeatTypes.in={popularSeatTypesIn}&popularSeatTypes.notIn={popularSeatTypesNotIn}&peakTravelTimes.contains={peakTravelTimesContains}&peakTravelTimes.doesNotContain={peakTravelTimesDoesNotContain}&peakTravelTimes.equals={peakTravelTimesEquals}&peakTravelTimes.notEquals={peakTravelTimesNotEquals}&peakTravelTimes.specified={peakTravelTimesSpecified}&peakTravelTimes.in={peakTravelTimesIn}&peakTravelTimes.notIn={peakTravelTimesNotIn}&cancellationRate.greaterThan={cancellationRateGreaterThan}&cancellationRate.lessThan={cancellationRateLessThan}&cancellationRate.greaterThanOrEqual={cancellationRateGreaterThanOrEqual}&cancellationRate.lessThanOrEqual={cancellationRateLessThanOrEqual}&cancellationRate.equals={cancellationRateEquals}&cancellationRate.notEquals={cancellationRateNotEquals}&cancellationRate.specified={cancellationRateSpecified}&cancellationRate.in={cancellationRateIn}&cancellationRate.notIn={cancellationRateNotIn}&customerSatisfactionScore.greaterThan={customerSatisfactionScoreGreaterThan}&customerSatisfactionScore.lessThan={customerSatisfactionScoreLessThan}&customerSatisfactionScore.greaterThanOrEqual={customerSatisfactionScoreGreaterThanOrEqual}&customerSatisfactionScore.lessThanOrEqual={customerSatisfactionScoreLessThanOrEqual}&customerSatisfactionScore.equals={customerSatisfactionScoreEquals}&customerSatisfactionScore.notEquals={customerSatisfactionScoreNotEquals}&customerSatisfactionScore.specified={customerSatisfactionScoreSpecified}&customerSatisfactionScore.in={customerSatisfactionScoreIn}&customerSatisfactionScore.notIn={customerSatisfactionScoreNotIn}&monthlyTrend.contains={monthlyTrendContains}&monthlyTrend.doesNotContain={monthlyTrendDoesNotContain}&monthlyTrend.equals={monthlyTrendEquals}&monthlyTrend.notEquals={monthlyTrendNotEquals}&monthlyTrend.specified={monthlyTrendSpecified}&monthlyTrend.in={monthlyTrendIn}&monthlyTrend.notIn={monthlyTrendNotIn}&validFrom.greaterThan={validFromGreaterThan}&validFrom.lessThan={validFromLessThan}&validFrom.greaterThanOrEqual={validFromGreaterThanOrEqual}&validFrom.lessThanOrEqual={validFromLessThanOrEqual}&validFrom.equals={validFromEquals}&validFrom.notEquals={validFromNotEquals}&validFrom.specified={validFromSpecified}&validFrom.in={validFromIn}&validFrom.notIn={validFromNotIn}&validTo.greaterThan={validToGreaterThan}&validTo.lessThan={validToLessThan}&validTo.greaterThanOrEqual={validToGreaterThanOrEqual}&validTo.lessThanOrEqual={validToLessThanOrEqual}&validTo.equals={validToEquals}&validTo.notEquals={validToNotEquals}&validTo.specified={validToSpecified}&validTo.in={validToIn}&validTo.notIn={validToNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<TripStatisticsDTO>> getAllTripStatisticsWithHttpInfo(@QueryMap(encoded=true) GetAllTripStatisticsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllTripStatistics</code> method in a fluent style.
   */
  public static class GetAllTripStatisticsQueryParams extends HashMap<String, Object> {
    public GetAllTripStatisticsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams routeIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams routeIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams routeIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams routeIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams routeIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams routeIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams routeIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("routeId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams routeIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams routeIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams vehicleTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("vehicleType.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams vehicleTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("vehicleType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams vehicleTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("vehicleType.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams vehicleTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehicleType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams vehicleTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("vehicleType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams occasionTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("occasionType.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams occasionTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("occasionType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams occasionTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occasionType.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams occasionTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("occasionType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams occasionTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("occasionType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalBookingsGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("totalBookings.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalBookingsLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("totalBookings.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalBookingsGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("totalBookings.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalBookingsLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("totalBookings.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalBookingsEquals(@jakarta.annotation.Nullable final Integer value) {
      put("totalBookings.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalBookingsNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("totalBookings.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalBookingsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("totalBookings.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalBookingsIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("totalBookings.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalBookingsNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("totalBookings.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalRevenueGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalRevenue.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalRevenueLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalRevenue.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalRevenueGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalRevenue.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalRevenueLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalRevenue.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalRevenueEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalRevenue.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalRevenueNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("totalRevenue.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalRevenueSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("totalRevenue.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalRevenueIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("totalRevenue.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams totalRevenueNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("totalRevenue.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams averagePriceGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averagePrice.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams averagePriceLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averagePrice.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams averagePriceGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averagePrice.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams averagePriceLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averagePrice.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams averagePriceEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averagePrice.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams averagePriceNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("averagePrice.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams averagePriceSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("averagePrice.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams averagePriceIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("averagePrice.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams averagePriceNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("averagePrice.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams occupancyRateGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occupancyRate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams occupancyRateLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occupancyRate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams occupancyRateGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occupancyRate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams occupancyRateLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occupancyRate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams occupancyRateEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occupancyRate.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams occupancyRateNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("occupancyRate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams occupancyRateSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("occupancyRate.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams occupancyRateIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occupancyRate.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams occupancyRateNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("occupancyRate.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams popularSeatTypesContains(@jakarta.annotation.Nullable final String value) {
      put("popularSeatTypes.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams popularSeatTypesDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("popularSeatTypes.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams popularSeatTypesEquals(@jakarta.annotation.Nullable final String value) {
      put("popularSeatTypes.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams popularSeatTypesNotEquals(@jakarta.annotation.Nullable final String value) {
      put("popularSeatTypes.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams popularSeatTypesSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("popularSeatTypes.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams popularSeatTypesIn(@jakarta.annotation.Nullable final List<String> value) {
      put("popularSeatTypes.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams popularSeatTypesNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("popularSeatTypes.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams peakTravelTimesContains(@jakarta.annotation.Nullable final String value) {
      put("peakTravelTimes.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams peakTravelTimesDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("peakTravelTimes.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams peakTravelTimesEquals(@jakarta.annotation.Nullable final String value) {
      put("peakTravelTimes.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams peakTravelTimesNotEquals(@jakarta.annotation.Nullable final String value) {
      put("peakTravelTimes.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams peakTravelTimesSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("peakTravelTimes.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams peakTravelTimesIn(@jakarta.annotation.Nullable final List<String> value) {
      put("peakTravelTimes.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams peakTravelTimesNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("peakTravelTimes.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams cancellationRateGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("cancellationRate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams cancellationRateLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("cancellationRate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams cancellationRateGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("cancellationRate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams cancellationRateLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("cancellationRate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams cancellationRateEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("cancellationRate.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams cancellationRateNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("cancellationRate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams cancellationRateSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("cancellationRate.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams cancellationRateIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("cancellationRate.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams cancellationRateNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("cancellationRate.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams customerSatisfactionScoreGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("customerSatisfactionScore.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams customerSatisfactionScoreLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("customerSatisfactionScore.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams customerSatisfactionScoreGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("customerSatisfactionScore.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams customerSatisfactionScoreLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("customerSatisfactionScore.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams customerSatisfactionScoreEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("customerSatisfactionScore.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams customerSatisfactionScoreNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("customerSatisfactionScore.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams customerSatisfactionScoreSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("customerSatisfactionScore.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams customerSatisfactionScoreIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("customerSatisfactionScore.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams customerSatisfactionScoreNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("customerSatisfactionScore.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams monthlyTrendContains(@jakarta.annotation.Nullable final String value) {
      put("monthlyTrend.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams monthlyTrendDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("monthlyTrend.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams monthlyTrendEquals(@jakarta.annotation.Nullable final String value) {
      put("monthlyTrend.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams monthlyTrendNotEquals(@jakarta.annotation.Nullable final String value) {
      put("monthlyTrend.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams monthlyTrendSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("monthlyTrend.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams monthlyTrendIn(@jakarta.annotation.Nullable final List<String> value) {
      put("monthlyTrend.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams monthlyTrendNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("monthlyTrend.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams validFromGreaterThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams validFromLessThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams validFromGreaterThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams validFromLessThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams validFromEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams validFromNotEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("validFrom.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams validFromSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("validFrom.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams validFromIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("validFrom.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams validFromNotIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("validFrom.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams validToGreaterThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams validToLessThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams validToGreaterThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams validToLessThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams validToEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams validToNotEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("validTo.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams validToSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("validTo.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams validToIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("validTo.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams validToNotIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("validTo.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripStatisticsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams page(@jakarta.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams size(@jakarta.annotation.Nullable final Integer value) {
      put("size", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripStatisticsQueryParams sort(@jakarta.annotation.Nullable final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return TripStatisticsDTO
   */
  @RequestLine("GET /api/trip-statistics/{id}")
  @Headers({
    "Accept: */*",
  })
  TripStatisticsDTO getTripStatistics(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getTripStatistics</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/trip-statistics/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<TripStatisticsDTO> getTripStatisticsWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param tripStatisticsDTO  (required)
   * @return TripStatisticsDTO
   */
  @RequestLine("PATCH /api/trip-statistics/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TripStatisticsDTO partialUpdateTripStatistics(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TripStatisticsDTO tripStatisticsDTO);

  /**
   * 
   * Similar to <code>partialUpdateTripStatistics</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param tripStatisticsDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/trip-statistics/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TripStatisticsDTO> partialUpdateTripStatisticsWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TripStatisticsDTO tripStatisticsDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param tripStatisticsDTO  (required)
   * @return TripStatisticsDTO
   */
  @RequestLine("PUT /api/trip-statistics/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TripStatisticsDTO updateTripStatistics(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TripStatisticsDTO tripStatisticsDTO);

  /**
   * 
   * Similar to <code>updateTripStatistics</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param tripStatisticsDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/trip-statistics/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TripStatisticsDTO> updateTripStatisticsWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TripStatisticsDTO tripStatisticsDTO);


}
