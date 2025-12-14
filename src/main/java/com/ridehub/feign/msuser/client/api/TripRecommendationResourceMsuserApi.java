package com.ridehub.feign.msuser.client.api;

import com.ridehub.feign.msuser.client.invoker.ApiClient;
import com.ridehub.feign.msuser.client.invoker.EncodingUtils;
import com.ridehub.feign.msuser.client.model.ApiResponse;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.ridehub.feign.msuser.client.model.TripRecommendationDTO;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface TripRecommendationResourceMsuserApi extends ApiClient.Api {


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
   * @param originContains  (optional)
   * @param originDoesNotContain  (optional)
   * @param originEquals  (optional)
   * @param originNotEquals  (optional)
   * @param originSpecified  (optional)
   * @param originIn  (optional)
   * @param originNotIn  (optional)
   * @param destinationContains  (optional)
   * @param destinationDoesNotContain  (optional)
   * @param destinationEquals  (optional)
   * @param destinationNotEquals  (optional)
   * @param destinationSpecified  (optional)
   * @param destinationIn  (optional)
   * @param destinationNotIn  (optional)
   * @param travelDateGreaterThan  (optional)
   * @param travelDateLessThan  (optional)
   * @param travelDateGreaterThanOrEqual  (optional)
   * @param travelDateLessThanOrEqual  (optional)
   * @param travelDateEquals  (optional)
   * @param travelDateNotEquals  (optional)
   * @param travelDateSpecified  (optional)
   * @param travelDateIn  (optional)
   * @param travelDateNotIn  (optional)
   * @param preferredTimeGreaterThan  (optional)
   * @param preferredTimeLessThan  (optional)
   * @param preferredTimeGreaterThanOrEqual  (optional)
   * @param preferredTimeLessThanOrEqual  (optional)
   * @param preferredTimeEquals  (optional)
   * @param preferredTimeNotEquals  (optional)
   * @param preferredTimeSpecified  (optional)
   * @param preferredTimeIn  (optional)
   * @param preferredTimeNotIn  (optional)
   * @param budgetRangeContains  (optional)
   * @param budgetRangeDoesNotContain  (optional)
   * @param budgetRangeEquals  (optional)
   * @param budgetRangeNotEquals  (optional)
   * @param budgetRangeSpecified  (optional)
   * @param budgetRangeIn  (optional)
   * @param budgetRangeNotIn  (optional)
   * @param seatPreferenceContains  (optional)
   * @param seatPreferenceDoesNotContain  (optional)
   * @param seatPreferenceEquals  (optional)
   * @param seatPreferenceNotEquals  (optional)
   * @param seatPreferenceSpecified  (optional)
   * @param seatPreferenceIn  (optional)
   * @param seatPreferenceNotIn  (optional)
   * @param recommendedTripsContains  (optional)
   * @param recommendedTripsDoesNotContain  (optional)
   * @param recommendedTripsEquals  (optional)
   * @param recommendedTripsNotEquals  (optional)
   * @param recommendedTripsSpecified  (optional)
   * @param recommendedTripsIn  (optional)
   * @param recommendedTripsNotIn  (optional)
   * @param confidenceScoreGreaterThan  (optional)
   * @param confidenceScoreLessThan  (optional)
   * @param confidenceScoreGreaterThanOrEqual  (optional)
   * @param confidenceScoreLessThanOrEqual  (optional)
   * @param confidenceScoreEquals  (optional)
   * @param confidenceScoreNotEquals  (optional)
   * @param confidenceScoreSpecified  (optional)
   * @param confidenceScoreIn  (optional)
   * @param confidenceScoreNotIn  (optional)
   * @param isBookedEquals  (optional)
   * @param isBookedNotEquals  (optional)
   * @param isBookedSpecified  (optional)
   * @param isBookedIn  (optional)
   * @param isBookedNotIn  (optional)
   * @param feedbackRatingGreaterThan  (optional)
   * @param feedbackRatingLessThan  (optional)
   * @param feedbackRatingGreaterThanOrEqual  (optional)
   * @param feedbackRatingLessThanOrEqual  (optional)
   * @param feedbackRatingEquals  (optional)
   * @param feedbackRatingNotEquals  (optional)
   * @param feedbackRatingSpecified  (optional)
   * @param feedbackRatingIn  (optional)
   * @param feedbackRatingNotIn  (optional)
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
  @RequestLine("GET /api/trip-recommendations/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&origin.contains={originContains}&origin.doesNotContain={originDoesNotContain}&origin.equals={originEquals}&origin.notEquals={originNotEquals}&origin.specified={originSpecified}&origin.in={originIn}&origin.notIn={originNotIn}&destination.contains={destinationContains}&destination.doesNotContain={destinationDoesNotContain}&destination.equals={destinationEquals}&destination.notEquals={destinationNotEquals}&destination.specified={destinationSpecified}&destination.in={destinationIn}&destination.notIn={destinationNotIn}&travelDate.greaterThan={travelDateGreaterThan}&travelDate.lessThan={travelDateLessThan}&travelDate.greaterThanOrEqual={travelDateGreaterThanOrEqual}&travelDate.lessThanOrEqual={travelDateLessThanOrEqual}&travelDate.equals={travelDateEquals}&travelDate.notEquals={travelDateNotEquals}&travelDate.specified={travelDateSpecified}&travelDate.in={travelDateIn}&travelDate.notIn={travelDateNotIn}&preferredTime.greaterThan={preferredTimeGreaterThan}&preferredTime.lessThan={preferredTimeLessThan}&preferredTime.greaterThanOrEqual={preferredTimeGreaterThanOrEqual}&preferredTime.lessThanOrEqual={preferredTimeLessThanOrEqual}&preferredTime.equals={preferredTimeEquals}&preferredTime.notEquals={preferredTimeNotEquals}&preferredTime.specified={preferredTimeSpecified}&preferredTime.in={preferredTimeIn}&preferredTime.notIn={preferredTimeNotIn}&budgetRange.contains={budgetRangeContains}&budgetRange.doesNotContain={budgetRangeDoesNotContain}&budgetRange.equals={budgetRangeEquals}&budgetRange.notEquals={budgetRangeNotEquals}&budgetRange.specified={budgetRangeSpecified}&budgetRange.in={budgetRangeIn}&budgetRange.notIn={budgetRangeNotIn}&seatPreference.contains={seatPreferenceContains}&seatPreference.doesNotContain={seatPreferenceDoesNotContain}&seatPreference.equals={seatPreferenceEquals}&seatPreference.notEquals={seatPreferenceNotEquals}&seatPreference.specified={seatPreferenceSpecified}&seatPreference.in={seatPreferenceIn}&seatPreference.notIn={seatPreferenceNotIn}&recommendedTrips.contains={recommendedTripsContains}&recommendedTrips.doesNotContain={recommendedTripsDoesNotContain}&recommendedTrips.equals={recommendedTripsEquals}&recommendedTrips.notEquals={recommendedTripsNotEquals}&recommendedTrips.specified={recommendedTripsSpecified}&recommendedTrips.in={recommendedTripsIn}&recommendedTrips.notIn={recommendedTripsNotIn}&confidenceScore.greaterThan={confidenceScoreGreaterThan}&confidenceScore.lessThan={confidenceScoreLessThan}&confidenceScore.greaterThanOrEqual={confidenceScoreGreaterThanOrEqual}&confidenceScore.lessThanOrEqual={confidenceScoreLessThanOrEqual}&confidenceScore.equals={confidenceScoreEquals}&confidenceScore.notEquals={confidenceScoreNotEquals}&confidenceScore.specified={confidenceScoreSpecified}&confidenceScore.in={confidenceScoreIn}&confidenceScore.notIn={confidenceScoreNotIn}&isBooked.equals={isBookedEquals}&isBooked.notEquals={isBookedNotEquals}&isBooked.specified={isBookedSpecified}&isBooked.in={isBookedIn}&isBooked.notIn={isBookedNotIn}&feedbackRating.greaterThan={feedbackRatingGreaterThan}&feedbackRating.lessThan={feedbackRatingLessThan}&feedbackRating.greaterThanOrEqual={feedbackRatingGreaterThanOrEqual}&feedbackRating.lessThanOrEqual={feedbackRatingLessThanOrEqual}&feedbackRating.equals={feedbackRatingEquals}&feedbackRating.notEquals={feedbackRatingNotEquals}&feedbackRating.specified={feedbackRatingSpecified}&feedbackRating.in={feedbackRatingIn}&feedbackRating.notIn={feedbackRatingNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countTripRecommendations(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("originContains") @jakarta.annotation.Nullable String originContains, @Param("originDoesNotContain") @jakarta.annotation.Nullable String originDoesNotContain, @Param("originEquals") @jakarta.annotation.Nullable String originEquals, @Param("originNotEquals") @jakarta.annotation.Nullable String originNotEquals, @Param("originSpecified") @jakarta.annotation.Nullable Boolean originSpecified, @Param("originIn") @jakarta.annotation.Nullable List<String> originIn, @Param("originNotIn") @jakarta.annotation.Nullable List<String> originNotIn, @Param("destinationContains") @jakarta.annotation.Nullable String destinationContains, @Param("destinationDoesNotContain") @jakarta.annotation.Nullable String destinationDoesNotContain, @Param("destinationEquals") @jakarta.annotation.Nullable String destinationEquals, @Param("destinationNotEquals") @jakarta.annotation.Nullable String destinationNotEquals, @Param("destinationSpecified") @jakarta.annotation.Nullable Boolean destinationSpecified, @Param("destinationIn") @jakarta.annotation.Nullable List<String> destinationIn, @Param("destinationNotIn") @jakarta.annotation.Nullable List<String> destinationNotIn, @Param("travelDateGreaterThan") @jakarta.annotation.Nullable LocalDate travelDateGreaterThan, @Param("travelDateLessThan") @jakarta.annotation.Nullable LocalDate travelDateLessThan, @Param("travelDateGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate travelDateGreaterThanOrEqual, @Param("travelDateLessThanOrEqual") @jakarta.annotation.Nullable LocalDate travelDateLessThanOrEqual, @Param("travelDateEquals") @jakarta.annotation.Nullable LocalDate travelDateEquals, @Param("travelDateNotEquals") @jakarta.annotation.Nullable LocalDate travelDateNotEquals, @Param("travelDateSpecified") @jakarta.annotation.Nullable Boolean travelDateSpecified, @Param("travelDateIn") @jakarta.annotation.Nullable List<LocalDate> travelDateIn, @Param("travelDateNotIn") @jakarta.annotation.Nullable List<LocalDate> travelDateNotIn, @Param("preferredTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime preferredTimeGreaterThan, @Param("preferredTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime preferredTimeLessThan, @Param("preferredTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime preferredTimeGreaterThanOrEqual, @Param("preferredTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime preferredTimeLessThanOrEqual, @Param("preferredTimeEquals") @jakarta.annotation.Nullable OffsetDateTime preferredTimeEquals, @Param("preferredTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime preferredTimeNotEquals, @Param("preferredTimeSpecified") @jakarta.annotation.Nullable Boolean preferredTimeSpecified, @Param("preferredTimeIn") @jakarta.annotation.Nullable List<String> preferredTimeIn, @Param("preferredTimeNotIn") @jakarta.annotation.Nullable List<String> preferredTimeNotIn, @Param("budgetRangeContains") @jakarta.annotation.Nullable String budgetRangeContains, @Param("budgetRangeDoesNotContain") @jakarta.annotation.Nullable String budgetRangeDoesNotContain, @Param("budgetRangeEquals") @jakarta.annotation.Nullable String budgetRangeEquals, @Param("budgetRangeNotEquals") @jakarta.annotation.Nullable String budgetRangeNotEquals, @Param("budgetRangeSpecified") @jakarta.annotation.Nullable Boolean budgetRangeSpecified, @Param("budgetRangeIn") @jakarta.annotation.Nullable List<String> budgetRangeIn, @Param("budgetRangeNotIn") @jakarta.annotation.Nullable List<String> budgetRangeNotIn, @Param("seatPreferenceContains") @jakarta.annotation.Nullable String seatPreferenceContains, @Param("seatPreferenceDoesNotContain") @jakarta.annotation.Nullable String seatPreferenceDoesNotContain, @Param("seatPreferenceEquals") @jakarta.annotation.Nullable String seatPreferenceEquals, @Param("seatPreferenceNotEquals") @jakarta.annotation.Nullable String seatPreferenceNotEquals, @Param("seatPreferenceSpecified") @jakarta.annotation.Nullable Boolean seatPreferenceSpecified, @Param("seatPreferenceIn") @jakarta.annotation.Nullable List<String> seatPreferenceIn, @Param("seatPreferenceNotIn") @jakarta.annotation.Nullable List<String> seatPreferenceNotIn, @Param("recommendedTripsContains") @jakarta.annotation.Nullable String recommendedTripsContains, @Param("recommendedTripsDoesNotContain") @jakarta.annotation.Nullable String recommendedTripsDoesNotContain, @Param("recommendedTripsEquals") @jakarta.annotation.Nullable String recommendedTripsEquals, @Param("recommendedTripsNotEquals") @jakarta.annotation.Nullable String recommendedTripsNotEquals, @Param("recommendedTripsSpecified") @jakarta.annotation.Nullable Boolean recommendedTripsSpecified, @Param("recommendedTripsIn") @jakarta.annotation.Nullable List<String> recommendedTripsIn, @Param("recommendedTripsNotIn") @jakarta.annotation.Nullable List<String> recommendedTripsNotIn, @Param("confidenceScoreGreaterThan") @jakarta.annotation.Nullable BigDecimal confidenceScoreGreaterThan, @Param("confidenceScoreLessThan") @jakarta.annotation.Nullable BigDecimal confidenceScoreLessThan, @Param("confidenceScoreGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal confidenceScoreGreaterThanOrEqual, @Param("confidenceScoreLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal confidenceScoreLessThanOrEqual, @Param("confidenceScoreEquals") @jakarta.annotation.Nullable BigDecimal confidenceScoreEquals, @Param("confidenceScoreNotEquals") @jakarta.annotation.Nullable BigDecimal confidenceScoreNotEquals, @Param("confidenceScoreSpecified") @jakarta.annotation.Nullable Boolean confidenceScoreSpecified, @Param("confidenceScoreIn") @jakarta.annotation.Nullable List<BigDecimal> confidenceScoreIn, @Param("confidenceScoreNotIn") @jakarta.annotation.Nullable List<BigDecimal> confidenceScoreNotIn, @Param("isBookedEquals") @jakarta.annotation.Nullable Boolean isBookedEquals, @Param("isBookedNotEquals") @jakarta.annotation.Nullable Boolean isBookedNotEquals, @Param("isBookedSpecified") @jakarta.annotation.Nullable Boolean isBookedSpecified, @Param("isBookedIn") @jakarta.annotation.Nullable List<Boolean> isBookedIn, @Param("isBookedNotIn") @jakarta.annotation.Nullable List<Boolean> isBookedNotIn, @Param("feedbackRatingGreaterThan") @jakarta.annotation.Nullable Integer feedbackRatingGreaterThan, @Param("feedbackRatingLessThan") @jakarta.annotation.Nullable Integer feedbackRatingLessThan, @Param("feedbackRatingGreaterThanOrEqual") @jakarta.annotation.Nullable Integer feedbackRatingGreaterThanOrEqual, @Param("feedbackRatingLessThanOrEqual") @jakarta.annotation.Nullable Integer feedbackRatingLessThanOrEqual, @Param("feedbackRatingEquals") @jakarta.annotation.Nullable Integer feedbackRatingEquals, @Param("feedbackRatingNotEquals") @jakarta.annotation.Nullable Integer feedbackRatingNotEquals, @Param("feedbackRatingSpecified") @jakarta.annotation.Nullable Boolean feedbackRatingSpecified, @Param("feedbackRatingIn") @jakarta.annotation.Nullable List<Integer> feedbackRatingIn, @Param("feedbackRatingNotIn") @jakarta.annotation.Nullable List<Integer> feedbackRatingNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("userIdGreaterThan") @jakarta.annotation.Nullable Long userIdGreaterThan, @Param("userIdLessThan") @jakarta.annotation.Nullable Long userIdLessThan, @Param("userIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long userIdGreaterThanOrEqual, @Param("userIdLessThanOrEqual") @jakarta.annotation.Nullable Long userIdLessThanOrEqual, @Param("userIdEquals") @jakarta.annotation.Nullable Long userIdEquals, @Param("userIdNotEquals") @jakarta.annotation.Nullable Long userIdNotEquals, @Param("userIdSpecified") @jakarta.annotation.Nullable Boolean userIdSpecified, @Param("userIdIn") @jakarta.annotation.Nullable List<Long> userIdIn, @Param("userIdNotIn") @jakarta.annotation.Nullable List<Long> userIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countTripRecommendations</code> but it also returns the http response headers .
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
   * @param originContains  (optional)
   * @param originDoesNotContain  (optional)
   * @param originEquals  (optional)
   * @param originNotEquals  (optional)
   * @param originSpecified  (optional)
   * @param originIn  (optional)
   * @param originNotIn  (optional)
   * @param destinationContains  (optional)
   * @param destinationDoesNotContain  (optional)
   * @param destinationEquals  (optional)
   * @param destinationNotEquals  (optional)
   * @param destinationSpecified  (optional)
   * @param destinationIn  (optional)
   * @param destinationNotIn  (optional)
   * @param travelDateGreaterThan  (optional)
   * @param travelDateLessThan  (optional)
   * @param travelDateGreaterThanOrEqual  (optional)
   * @param travelDateLessThanOrEqual  (optional)
   * @param travelDateEquals  (optional)
   * @param travelDateNotEquals  (optional)
   * @param travelDateSpecified  (optional)
   * @param travelDateIn  (optional)
   * @param travelDateNotIn  (optional)
   * @param preferredTimeGreaterThan  (optional)
   * @param preferredTimeLessThan  (optional)
   * @param preferredTimeGreaterThanOrEqual  (optional)
   * @param preferredTimeLessThanOrEqual  (optional)
   * @param preferredTimeEquals  (optional)
   * @param preferredTimeNotEquals  (optional)
   * @param preferredTimeSpecified  (optional)
   * @param preferredTimeIn  (optional)
   * @param preferredTimeNotIn  (optional)
   * @param budgetRangeContains  (optional)
   * @param budgetRangeDoesNotContain  (optional)
   * @param budgetRangeEquals  (optional)
   * @param budgetRangeNotEquals  (optional)
   * @param budgetRangeSpecified  (optional)
   * @param budgetRangeIn  (optional)
   * @param budgetRangeNotIn  (optional)
   * @param seatPreferenceContains  (optional)
   * @param seatPreferenceDoesNotContain  (optional)
   * @param seatPreferenceEquals  (optional)
   * @param seatPreferenceNotEquals  (optional)
   * @param seatPreferenceSpecified  (optional)
   * @param seatPreferenceIn  (optional)
   * @param seatPreferenceNotIn  (optional)
   * @param recommendedTripsContains  (optional)
   * @param recommendedTripsDoesNotContain  (optional)
   * @param recommendedTripsEquals  (optional)
   * @param recommendedTripsNotEquals  (optional)
   * @param recommendedTripsSpecified  (optional)
   * @param recommendedTripsIn  (optional)
   * @param recommendedTripsNotIn  (optional)
   * @param confidenceScoreGreaterThan  (optional)
   * @param confidenceScoreLessThan  (optional)
   * @param confidenceScoreGreaterThanOrEqual  (optional)
   * @param confidenceScoreLessThanOrEqual  (optional)
   * @param confidenceScoreEquals  (optional)
   * @param confidenceScoreNotEquals  (optional)
   * @param confidenceScoreSpecified  (optional)
   * @param confidenceScoreIn  (optional)
   * @param confidenceScoreNotIn  (optional)
   * @param isBookedEquals  (optional)
   * @param isBookedNotEquals  (optional)
   * @param isBookedSpecified  (optional)
   * @param isBookedIn  (optional)
   * @param isBookedNotIn  (optional)
   * @param feedbackRatingGreaterThan  (optional)
   * @param feedbackRatingLessThan  (optional)
   * @param feedbackRatingGreaterThanOrEqual  (optional)
   * @param feedbackRatingLessThanOrEqual  (optional)
   * @param feedbackRatingEquals  (optional)
   * @param feedbackRatingNotEquals  (optional)
   * @param feedbackRatingSpecified  (optional)
   * @param feedbackRatingIn  (optional)
   * @param feedbackRatingNotIn  (optional)
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
  @RequestLine("GET /api/trip-recommendations/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&origin.contains={originContains}&origin.doesNotContain={originDoesNotContain}&origin.equals={originEquals}&origin.notEquals={originNotEquals}&origin.specified={originSpecified}&origin.in={originIn}&origin.notIn={originNotIn}&destination.contains={destinationContains}&destination.doesNotContain={destinationDoesNotContain}&destination.equals={destinationEquals}&destination.notEquals={destinationNotEquals}&destination.specified={destinationSpecified}&destination.in={destinationIn}&destination.notIn={destinationNotIn}&travelDate.greaterThan={travelDateGreaterThan}&travelDate.lessThan={travelDateLessThan}&travelDate.greaterThanOrEqual={travelDateGreaterThanOrEqual}&travelDate.lessThanOrEqual={travelDateLessThanOrEqual}&travelDate.equals={travelDateEquals}&travelDate.notEquals={travelDateNotEquals}&travelDate.specified={travelDateSpecified}&travelDate.in={travelDateIn}&travelDate.notIn={travelDateNotIn}&preferredTime.greaterThan={preferredTimeGreaterThan}&preferredTime.lessThan={preferredTimeLessThan}&preferredTime.greaterThanOrEqual={preferredTimeGreaterThanOrEqual}&preferredTime.lessThanOrEqual={preferredTimeLessThanOrEqual}&preferredTime.equals={preferredTimeEquals}&preferredTime.notEquals={preferredTimeNotEquals}&preferredTime.specified={preferredTimeSpecified}&preferredTime.in={preferredTimeIn}&preferredTime.notIn={preferredTimeNotIn}&budgetRange.contains={budgetRangeContains}&budgetRange.doesNotContain={budgetRangeDoesNotContain}&budgetRange.equals={budgetRangeEquals}&budgetRange.notEquals={budgetRangeNotEquals}&budgetRange.specified={budgetRangeSpecified}&budgetRange.in={budgetRangeIn}&budgetRange.notIn={budgetRangeNotIn}&seatPreference.contains={seatPreferenceContains}&seatPreference.doesNotContain={seatPreferenceDoesNotContain}&seatPreference.equals={seatPreferenceEquals}&seatPreference.notEquals={seatPreferenceNotEquals}&seatPreference.specified={seatPreferenceSpecified}&seatPreference.in={seatPreferenceIn}&seatPreference.notIn={seatPreferenceNotIn}&recommendedTrips.contains={recommendedTripsContains}&recommendedTrips.doesNotContain={recommendedTripsDoesNotContain}&recommendedTrips.equals={recommendedTripsEquals}&recommendedTrips.notEquals={recommendedTripsNotEquals}&recommendedTrips.specified={recommendedTripsSpecified}&recommendedTrips.in={recommendedTripsIn}&recommendedTrips.notIn={recommendedTripsNotIn}&confidenceScore.greaterThan={confidenceScoreGreaterThan}&confidenceScore.lessThan={confidenceScoreLessThan}&confidenceScore.greaterThanOrEqual={confidenceScoreGreaterThanOrEqual}&confidenceScore.lessThanOrEqual={confidenceScoreLessThanOrEqual}&confidenceScore.equals={confidenceScoreEquals}&confidenceScore.notEquals={confidenceScoreNotEquals}&confidenceScore.specified={confidenceScoreSpecified}&confidenceScore.in={confidenceScoreIn}&confidenceScore.notIn={confidenceScoreNotIn}&isBooked.equals={isBookedEquals}&isBooked.notEquals={isBookedNotEquals}&isBooked.specified={isBookedSpecified}&isBooked.in={isBookedIn}&isBooked.notIn={isBookedNotIn}&feedbackRating.greaterThan={feedbackRatingGreaterThan}&feedbackRating.lessThan={feedbackRatingLessThan}&feedbackRating.greaterThanOrEqual={feedbackRatingGreaterThanOrEqual}&feedbackRating.lessThanOrEqual={feedbackRatingLessThanOrEqual}&feedbackRating.equals={feedbackRatingEquals}&feedbackRating.notEquals={feedbackRatingNotEquals}&feedbackRating.specified={feedbackRatingSpecified}&feedbackRating.in={feedbackRatingIn}&feedbackRating.notIn={feedbackRatingNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countTripRecommendationsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("originContains") @jakarta.annotation.Nullable String originContains, @Param("originDoesNotContain") @jakarta.annotation.Nullable String originDoesNotContain, @Param("originEquals") @jakarta.annotation.Nullable String originEquals, @Param("originNotEquals") @jakarta.annotation.Nullable String originNotEquals, @Param("originSpecified") @jakarta.annotation.Nullable Boolean originSpecified, @Param("originIn") @jakarta.annotation.Nullable List<String> originIn, @Param("originNotIn") @jakarta.annotation.Nullable List<String> originNotIn, @Param("destinationContains") @jakarta.annotation.Nullable String destinationContains, @Param("destinationDoesNotContain") @jakarta.annotation.Nullable String destinationDoesNotContain, @Param("destinationEquals") @jakarta.annotation.Nullable String destinationEquals, @Param("destinationNotEquals") @jakarta.annotation.Nullable String destinationNotEquals, @Param("destinationSpecified") @jakarta.annotation.Nullable Boolean destinationSpecified, @Param("destinationIn") @jakarta.annotation.Nullable List<String> destinationIn, @Param("destinationNotIn") @jakarta.annotation.Nullable List<String> destinationNotIn, @Param("travelDateGreaterThan") @jakarta.annotation.Nullable LocalDate travelDateGreaterThan, @Param("travelDateLessThan") @jakarta.annotation.Nullable LocalDate travelDateLessThan, @Param("travelDateGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate travelDateGreaterThanOrEqual, @Param("travelDateLessThanOrEqual") @jakarta.annotation.Nullable LocalDate travelDateLessThanOrEqual, @Param("travelDateEquals") @jakarta.annotation.Nullable LocalDate travelDateEquals, @Param("travelDateNotEquals") @jakarta.annotation.Nullable LocalDate travelDateNotEquals, @Param("travelDateSpecified") @jakarta.annotation.Nullable Boolean travelDateSpecified, @Param("travelDateIn") @jakarta.annotation.Nullable List<LocalDate> travelDateIn, @Param("travelDateNotIn") @jakarta.annotation.Nullable List<LocalDate> travelDateNotIn, @Param("preferredTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime preferredTimeGreaterThan, @Param("preferredTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime preferredTimeLessThan, @Param("preferredTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime preferredTimeGreaterThanOrEqual, @Param("preferredTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime preferredTimeLessThanOrEqual, @Param("preferredTimeEquals") @jakarta.annotation.Nullable OffsetDateTime preferredTimeEquals, @Param("preferredTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime preferredTimeNotEquals, @Param("preferredTimeSpecified") @jakarta.annotation.Nullable Boolean preferredTimeSpecified, @Param("preferredTimeIn") @jakarta.annotation.Nullable List<String> preferredTimeIn, @Param("preferredTimeNotIn") @jakarta.annotation.Nullable List<String> preferredTimeNotIn, @Param("budgetRangeContains") @jakarta.annotation.Nullable String budgetRangeContains, @Param("budgetRangeDoesNotContain") @jakarta.annotation.Nullable String budgetRangeDoesNotContain, @Param("budgetRangeEquals") @jakarta.annotation.Nullable String budgetRangeEquals, @Param("budgetRangeNotEquals") @jakarta.annotation.Nullable String budgetRangeNotEquals, @Param("budgetRangeSpecified") @jakarta.annotation.Nullable Boolean budgetRangeSpecified, @Param("budgetRangeIn") @jakarta.annotation.Nullable List<String> budgetRangeIn, @Param("budgetRangeNotIn") @jakarta.annotation.Nullable List<String> budgetRangeNotIn, @Param("seatPreferenceContains") @jakarta.annotation.Nullable String seatPreferenceContains, @Param("seatPreferenceDoesNotContain") @jakarta.annotation.Nullable String seatPreferenceDoesNotContain, @Param("seatPreferenceEquals") @jakarta.annotation.Nullable String seatPreferenceEquals, @Param("seatPreferenceNotEquals") @jakarta.annotation.Nullable String seatPreferenceNotEquals, @Param("seatPreferenceSpecified") @jakarta.annotation.Nullable Boolean seatPreferenceSpecified, @Param("seatPreferenceIn") @jakarta.annotation.Nullable List<String> seatPreferenceIn, @Param("seatPreferenceNotIn") @jakarta.annotation.Nullable List<String> seatPreferenceNotIn, @Param("recommendedTripsContains") @jakarta.annotation.Nullable String recommendedTripsContains, @Param("recommendedTripsDoesNotContain") @jakarta.annotation.Nullable String recommendedTripsDoesNotContain, @Param("recommendedTripsEquals") @jakarta.annotation.Nullable String recommendedTripsEquals, @Param("recommendedTripsNotEquals") @jakarta.annotation.Nullable String recommendedTripsNotEquals, @Param("recommendedTripsSpecified") @jakarta.annotation.Nullable Boolean recommendedTripsSpecified, @Param("recommendedTripsIn") @jakarta.annotation.Nullable List<String> recommendedTripsIn, @Param("recommendedTripsNotIn") @jakarta.annotation.Nullable List<String> recommendedTripsNotIn, @Param("confidenceScoreGreaterThan") @jakarta.annotation.Nullable BigDecimal confidenceScoreGreaterThan, @Param("confidenceScoreLessThan") @jakarta.annotation.Nullable BigDecimal confidenceScoreLessThan, @Param("confidenceScoreGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal confidenceScoreGreaterThanOrEqual, @Param("confidenceScoreLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal confidenceScoreLessThanOrEqual, @Param("confidenceScoreEquals") @jakarta.annotation.Nullable BigDecimal confidenceScoreEquals, @Param("confidenceScoreNotEquals") @jakarta.annotation.Nullable BigDecimal confidenceScoreNotEquals, @Param("confidenceScoreSpecified") @jakarta.annotation.Nullable Boolean confidenceScoreSpecified, @Param("confidenceScoreIn") @jakarta.annotation.Nullable List<BigDecimal> confidenceScoreIn, @Param("confidenceScoreNotIn") @jakarta.annotation.Nullable List<BigDecimal> confidenceScoreNotIn, @Param("isBookedEquals") @jakarta.annotation.Nullable Boolean isBookedEquals, @Param("isBookedNotEquals") @jakarta.annotation.Nullable Boolean isBookedNotEquals, @Param("isBookedSpecified") @jakarta.annotation.Nullable Boolean isBookedSpecified, @Param("isBookedIn") @jakarta.annotation.Nullable List<Boolean> isBookedIn, @Param("isBookedNotIn") @jakarta.annotation.Nullable List<Boolean> isBookedNotIn, @Param("feedbackRatingGreaterThan") @jakarta.annotation.Nullable Integer feedbackRatingGreaterThan, @Param("feedbackRatingLessThan") @jakarta.annotation.Nullable Integer feedbackRatingLessThan, @Param("feedbackRatingGreaterThanOrEqual") @jakarta.annotation.Nullable Integer feedbackRatingGreaterThanOrEqual, @Param("feedbackRatingLessThanOrEqual") @jakarta.annotation.Nullable Integer feedbackRatingLessThanOrEqual, @Param("feedbackRatingEquals") @jakarta.annotation.Nullable Integer feedbackRatingEquals, @Param("feedbackRatingNotEquals") @jakarta.annotation.Nullable Integer feedbackRatingNotEquals, @Param("feedbackRatingSpecified") @jakarta.annotation.Nullable Boolean feedbackRatingSpecified, @Param("feedbackRatingIn") @jakarta.annotation.Nullable List<Integer> feedbackRatingIn, @Param("feedbackRatingNotIn") @jakarta.annotation.Nullable List<Integer> feedbackRatingNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("userIdGreaterThan") @jakarta.annotation.Nullable Long userIdGreaterThan, @Param("userIdLessThan") @jakarta.annotation.Nullable Long userIdLessThan, @Param("userIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long userIdGreaterThanOrEqual, @Param("userIdLessThanOrEqual") @jakarta.annotation.Nullable Long userIdLessThanOrEqual, @Param("userIdEquals") @jakarta.annotation.Nullable Long userIdEquals, @Param("userIdNotEquals") @jakarta.annotation.Nullable Long userIdNotEquals, @Param("userIdSpecified") @jakarta.annotation.Nullable Boolean userIdSpecified, @Param("userIdIn") @jakarta.annotation.Nullable List<Long> userIdIn, @Param("userIdNotIn") @jakarta.annotation.Nullable List<Long> userIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countTripRecommendations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountTripRecommendationsQueryParams} class that allows for
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
   *   <li>originContains -  (optional)</li>
   *   <li>originDoesNotContain -  (optional)</li>
   *   <li>originEquals -  (optional)</li>
   *   <li>originNotEquals -  (optional)</li>
   *   <li>originSpecified -  (optional)</li>
   *   <li>originIn -  (optional)</li>
   *   <li>originNotIn -  (optional)</li>
   *   <li>destinationContains -  (optional)</li>
   *   <li>destinationDoesNotContain -  (optional)</li>
   *   <li>destinationEquals -  (optional)</li>
   *   <li>destinationNotEquals -  (optional)</li>
   *   <li>destinationSpecified -  (optional)</li>
   *   <li>destinationIn -  (optional)</li>
   *   <li>destinationNotIn -  (optional)</li>
   *   <li>travelDateGreaterThan -  (optional)</li>
   *   <li>travelDateLessThan -  (optional)</li>
   *   <li>travelDateGreaterThanOrEqual -  (optional)</li>
   *   <li>travelDateLessThanOrEqual -  (optional)</li>
   *   <li>travelDateEquals -  (optional)</li>
   *   <li>travelDateNotEquals -  (optional)</li>
   *   <li>travelDateSpecified -  (optional)</li>
   *   <li>travelDateIn -  (optional)</li>
   *   <li>travelDateNotIn -  (optional)</li>
   *   <li>preferredTimeGreaterThan -  (optional)</li>
   *   <li>preferredTimeLessThan -  (optional)</li>
   *   <li>preferredTimeGreaterThanOrEqual -  (optional)</li>
   *   <li>preferredTimeLessThanOrEqual -  (optional)</li>
   *   <li>preferredTimeEquals -  (optional)</li>
   *   <li>preferredTimeNotEquals -  (optional)</li>
   *   <li>preferredTimeSpecified -  (optional)</li>
   *   <li>preferredTimeIn -  (optional)</li>
   *   <li>preferredTimeNotIn -  (optional)</li>
   *   <li>budgetRangeContains -  (optional)</li>
   *   <li>budgetRangeDoesNotContain -  (optional)</li>
   *   <li>budgetRangeEquals -  (optional)</li>
   *   <li>budgetRangeNotEquals -  (optional)</li>
   *   <li>budgetRangeSpecified -  (optional)</li>
   *   <li>budgetRangeIn -  (optional)</li>
   *   <li>budgetRangeNotIn -  (optional)</li>
   *   <li>seatPreferenceContains -  (optional)</li>
   *   <li>seatPreferenceDoesNotContain -  (optional)</li>
   *   <li>seatPreferenceEquals -  (optional)</li>
   *   <li>seatPreferenceNotEquals -  (optional)</li>
   *   <li>seatPreferenceSpecified -  (optional)</li>
   *   <li>seatPreferenceIn -  (optional)</li>
   *   <li>seatPreferenceNotIn -  (optional)</li>
   *   <li>recommendedTripsContains -  (optional)</li>
   *   <li>recommendedTripsDoesNotContain -  (optional)</li>
   *   <li>recommendedTripsEquals -  (optional)</li>
   *   <li>recommendedTripsNotEquals -  (optional)</li>
   *   <li>recommendedTripsSpecified -  (optional)</li>
   *   <li>recommendedTripsIn -  (optional)</li>
   *   <li>recommendedTripsNotIn -  (optional)</li>
   *   <li>confidenceScoreGreaterThan -  (optional)</li>
   *   <li>confidenceScoreLessThan -  (optional)</li>
   *   <li>confidenceScoreGreaterThanOrEqual -  (optional)</li>
   *   <li>confidenceScoreLessThanOrEqual -  (optional)</li>
   *   <li>confidenceScoreEquals -  (optional)</li>
   *   <li>confidenceScoreNotEquals -  (optional)</li>
   *   <li>confidenceScoreSpecified -  (optional)</li>
   *   <li>confidenceScoreIn -  (optional)</li>
   *   <li>confidenceScoreNotIn -  (optional)</li>
   *   <li>isBookedEquals -  (optional)</li>
   *   <li>isBookedNotEquals -  (optional)</li>
   *   <li>isBookedSpecified -  (optional)</li>
   *   <li>isBookedIn -  (optional)</li>
   *   <li>isBookedNotIn -  (optional)</li>
   *   <li>feedbackRatingGreaterThan -  (optional)</li>
   *   <li>feedbackRatingLessThan -  (optional)</li>
   *   <li>feedbackRatingGreaterThanOrEqual -  (optional)</li>
   *   <li>feedbackRatingLessThanOrEqual -  (optional)</li>
   *   <li>feedbackRatingEquals -  (optional)</li>
   *   <li>feedbackRatingNotEquals -  (optional)</li>
   *   <li>feedbackRatingSpecified -  (optional)</li>
   *   <li>feedbackRatingIn -  (optional)</li>
   *   <li>feedbackRatingNotIn -  (optional)</li>
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
  @RequestLine("GET /api/trip-recommendations/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&origin.contains={originContains}&origin.doesNotContain={originDoesNotContain}&origin.equals={originEquals}&origin.notEquals={originNotEquals}&origin.specified={originSpecified}&origin.in={originIn}&origin.notIn={originNotIn}&destination.contains={destinationContains}&destination.doesNotContain={destinationDoesNotContain}&destination.equals={destinationEquals}&destination.notEquals={destinationNotEquals}&destination.specified={destinationSpecified}&destination.in={destinationIn}&destination.notIn={destinationNotIn}&travelDate.greaterThan={travelDateGreaterThan}&travelDate.lessThan={travelDateLessThan}&travelDate.greaterThanOrEqual={travelDateGreaterThanOrEqual}&travelDate.lessThanOrEqual={travelDateLessThanOrEqual}&travelDate.equals={travelDateEquals}&travelDate.notEquals={travelDateNotEquals}&travelDate.specified={travelDateSpecified}&travelDate.in={travelDateIn}&travelDate.notIn={travelDateNotIn}&preferredTime.greaterThan={preferredTimeGreaterThan}&preferredTime.lessThan={preferredTimeLessThan}&preferredTime.greaterThanOrEqual={preferredTimeGreaterThanOrEqual}&preferredTime.lessThanOrEqual={preferredTimeLessThanOrEqual}&preferredTime.equals={preferredTimeEquals}&preferredTime.notEquals={preferredTimeNotEquals}&preferredTime.specified={preferredTimeSpecified}&preferredTime.in={preferredTimeIn}&preferredTime.notIn={preferredTimeNotIn}&budgetRange.contains={budgetRangeContains}&budgetRange.doesNotContain={budgetRangeDoesNotContain}&budgetRange.equals={budgetRangeEquals}&budgetRange.notEquals={budgetRangeNotEquals}&budgetRange.specified={budgetRangeSpecified}&budgetRange.in={budgetRangeIn}&budgetRange.notIn={budgetRangeNotIn}&seatPreference.contains={seatPreferenceContains}&seatPreference.doesNotContain={seatPreferenceDoesNotContain}&seatPreference.equals={seatPreferenceEquals}&seatPreference.notEquals={seatPreferenceNotEquals}&seatPreference.specified={seatPreferenceSpecified}&seatPreference.in={seatPreferenceIn}&seatPreference.notIn={seatPreferenceNotIn}&recommendedTrips.contains={recommendedTripsContains}&recommendedTrips.doesNotContain={recommendedTripsDoesNotContain}&recommendedTrips.equals={recommendedTripsEquals}&recommendedTrips.notEquals={recommendedTripsNotEquals}&recommendedTrips.specified={recommendedTripsSpecified}&recommendedTrips.in={recommendedTripsIn}&recommendedTrips.notIn={recommendedTripsNotIn}&confidenceScore.greaterThan={confidenceScoreGreaterThan}&confidenceScore.lessThan={confidenceScoreLessThan}&confidenceScore.greaterThanOrEqual={confidenceScoreGreaterThanOrEqual}&confidenceScore.lessThanOrEqual={confidenceScoreLessThanOrEqual}&confidenceScore.equals={confidenceScoreEquals}&confidenceScore.notEquals={confidenceScoreNotEquals}&confidenceScore.specified={confidenceScoreSpecified}&confidenceScore.in={confidenceScoreIn}&confidenceScore.notIn={confidenceScoreNotIn}&isBooked.equals={isBookedEquals}&isBooked.notEquals={isBookedNotEquals}&isBooked.specified={isBookedSpecified}&isBooked.in={isBookedIn}&isBooked.notIn={isBookedNotIn}&feedbackRating.greaterThan={feedbackRatingGreaterThan}&feedbackRating.lessThan={feedbackRatingLessThan}&feedbackRating.greaterThanOrEqual={feedbackRatingGreaterThanOrEqual}&feedbackRating.lessThanOrEqual={feedbackRatingLessThanOrEqual}&feedbackRating.equals={feedbackRatingEquals}&feedbackRating.notEquals={feedbackRatingNotEquals}&feedbackRating.specified={feedbackRatingSpecified}&feedbackRating.in={feedbackRatingIn}&feedbackRating.notIn={feedbackRatingNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countTripRecommendations(@QueryMap(encoded=true) CountTripRecommendationsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countTripRecommendations</code> that receives the query parameters as a map,
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
          *   <li>originContains -  (optional)</li>
          *   <li>originDoesNotContain -  (optional)</li>
          *   <li>originEquals -  (optional)</li>
          *   <li>originNotEquals -  (optional)</li>
          *   <li>originSpecified -  (optional)</li>
          *   <li>originIn -  (optional)</li>
          *   <li>originNotIn -  (optional)</li>
          *   <li>destinationContains -  (optional)</li>
          *   <li>destinationDoesNotContain -  (optional)</li>
          *   <li>destinationEquals -  (optional)</li>
          *   <li>destinationNotEquals -  (optional)</li>
          *   <li>destinationSpecified -  (optional)</li>
          *   <li>destinationIn -  (optional)</li>
          *   <li>destinationNotIn -  (optional)</li>
          *   <li>travelDateGreaterThan -  (optional)</li>
          *   <li>travelDateLessThan -  (optional)</li>
          *   <li>travelDateGreaterThanOrEqual -  (optional)</li>
          *   <li>travelDateLessThanOrEqual -  (optional)</li>
          *   <li>travelDateEquals -  (optional)</li>
          *   <li>travelDateNotEquals -  (optional)</li>
          *   <li>travelDateSpecified -  (optional)</li>
          *   <li>travelDateIn -  (optional)</li>
          *   <li>travelDateNotIn -  (optional)</li>
          *   <li>preferredTimeGreaterThan -  (optional)</li>
          *   <li>preferredTimeLessThan -  (optional)</li>
          *   <li>preferredTimeGreaterThanOrEqual -  (optional)</li>
          *   <li>preferredTimeLessThanOrEqual -  (optional)</li>
          *   <li>preferredTimeEquals -  (optional)</li>
          *   <li>preferredTimeNotEquals -  (optional)</li>
          *   <li>preferredTimeSpecified -  (optional)</li>
          *   <li>preferredTimeIn -  (optional)</li>
          *   <li>preferredTimeNotIn -  (optional)</li>
          *   <li>budgetRangeContains -  (optional)</li>
          *   <li>budgetRangeDoesNotContain -  (optional)</li>
          *   <li>budgetRangeEquals -  (optional)</li>
          *   <li>budgetRangeNotEquals -  (optional)</li>
          *   <li>budgetRangeSpecified -  (optional)</li>
          *   <li>budgetRangeIn -  (optional)</li>
          *   <li>budgetRangeNotIn -  (optional)</li>
          *   <li>seatPreferenceContains -  (optional)</li>
          *   <li>seatPreferenceDoesNotContain -  (optional)</li>
          *   <li>seatPreferenceEquals -  (optional)</li>
          *   <li>seatPreferenceNotEquals -  (optional)</li>
          *   <li>seatPreferenceSpecified -  (optional)</li>
          *   <li>seatPreferenceIn -  (optional)</li>
          *   <li>seatPreferenceNotIn -  (optional)</li>
          *   <li>recommendedTripsContains -  (optional)</li>
          *   <li>recommendedTripsDoesNotContain -  (optional)</li>
          *   <li>recommendedTripsEquals -  (optional)</li>
          *   <li>recommendedTripsNotEquals -  (optional)</li>
          *   <li>recommendedTripsSpecified -  (optional)</li>
          *   <li>recommendedTripsIn -  (optional)</li>
          *   <li>recommendedTripsNotIn -  (optional)</li>
          *   <li>confidenceScoreGreaterThan -  (optional)</li>
          *   <li>confidenceScoreLessThan -  (optional)</li>
          *   <li>confidenceScoreGreaterThanOrEqual -  (optional)</li>
          *   <li>confidenceScoreLessThanOrEqual -  (optional)</li>
          *   <li>confidenceScoreEquals -  (optional)</li>
          *   <li>confidenceScoreNotEquals -  (optional)</li>
          *   <li>confidenceScoreSpecified -  (optional)</li>
          *   <li>confidenceScoreIn -  (optional)</li>
          *   <li>confidenceScoreNotIn -  (optional)</li>
          *   <li>isBookedEquals -  (optional)</li>
          *   <li>isBookedNotEquals -  (optional)</li>
          *   <li>isBookedSpecified -  (optional)</li>
          *   <li>isBookedIn -  (optional)</li>
          *   <li>isBookedNotIn -  (optional)</li>
          *   <li>feedbackRatingGreaterThan -  (optional)</li>
          *   <li>feedbackRatingLessThan -  (optional)</li>
          *   <li>feedbackRatingGreaterThanOrEqual -  (optional)</li>
          *   <li>feedbackRatingLessThanOrEqual -  (optional)</li>
          *   <li>feedbackRatingEquals -  (optional)</li>
          *   <li>feedbackRatingNotEquals -  (optional)</li>
          *   <li>feedbackRatingSpecified -  (optional)</li>
          *   <li>feedbackRatingIn -  (optional)</li>
          *   <li>feedbackRatingNotIn -  (optional)</li>
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
      @RequestLine("GET /api/trip-recommendations/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&origin.contains={originContains}&origin.doesNotContain={originDoesNotContain}&origin.equals={originEquals}&origin.notEquals={originNotEquals}&origin.specified={originSpecified}&origin.in={originIn}&origin.notIn={originNotIn}&destination.contains={destinationContains}&destination.doesNotContain={destinationDoesNotContain}&destination.equals={destinationEquals}&destination.notEquals={destinationNotEquals}&destination.specified={destinationSpecified}&destination.in={destinationIn}&destination.notIn={destinationNotIn}&travelDate.greaterThan={travelDateGreaterThan}&travelDate.lessThan={travelDateLessThan}&travelDate.greaterThanOrEqual={travelDateGreaterThanOrEqual}&travelDate.lessThanOrEqual={travelDateLessThanOrEqual}&travelDate.equals={travelDateEquals}&travelDate.notEquals={travelDateNotEquals}&travelDate.specified={travelDateSpecified}&travelDate.in={travelDateIn}&travelDate.notIn={travelDateNotIn}&preferredTime.greaterThan={preferredTimeGreaterThan}&preferredTime.lessThan={preferredTimeLessThan}&preferredTime.greaterThanOrEqual={preferredTimeGreaterThanOrEqual}&preferredTime.lessThanOrEqual={preferredTimeLessThanOrEqual}&preferredTime.equals={preferredTimeEquals}&preferredTime.notEquals={preferredTimeNotEquals}&preferredTime.specified={preferredTimeSpecified}&preferredTime.in={preferredTimeIn}&preferredTime.notIn={preferredTimeNotIn}&budgetRange.contains={budgetRangeContains}&budgetRange.doesNotContain={budgetRangeDoesNotContain}&budgetRange.equals={budgetRangeEquals}&budgetRange.notEquals={budgetRangeNotEquals}&budgetRange.specified={budgetRangeSpecified}&budgetRange.in={budgetRangeIn}&budgetRange.notIn={budgetRangeNotIn}&seatPreference.contains={seatPreferenceContains}&seatPreference.doesNotContain={seatPreferenceDoesNotContain}&seatPreference.equals={seatPreferenceEquals}&seatPreference.notEquals={seatPreferenceNotEquals}&seatPreference.specified={seatPreferenceSpecified}&seatPreference.in={seatPreferenceIn}&seatPreference.notIn={seatPreferenceNotIn}&recommendedTrips.contains={recommendedTripsContains}&recommendedTrips.doesNotContain={recommendedTripsDoesNotContain}&recommendedTrips.equals={recommendedTripsEquals}&recommendedTrips.notEquals={recommendedTripsNotEquals}&recommendedTrips.specified={recommendedTripsSpecified}&recommendedTrips.in={recommendedTripsIn}&recommendedTrips.notIn={recommendedTripsNotIn}&confidenceScore.greaterThan={confidenceScoreGreaterThan}&confidenceScore.lessThan={confidenceScoreLessThan}&confidenceScore.greaterThanOrEqual={confidenceScoreGreaterThanOrEqual}&confidenceScore.lessThanOrEqual={confidenceScoreLessThanOrEqual}&confidenceScore.equals={confidenceScoreEquals}&confidenceScore.notEquals={confidenceScoreNotEquals}&confidenceScore.specified={confidenceScoreSpecified}&confidenceScore.in={confidenceScoreIn}&confidenceScore.notIn={confidenceScoreNotIn}&isBooked.equals={isBookedEquals}&isBooked.notEquals={isBookedNotEquals}&isBooked.specified={isBookedSpecified}&isBooked.in={isBookedIn}&isBooked.notIn={isBookedNotIn}&feedbackRating.greaterThan={feedbackRatingGreaterThan}&feedbackRating.lessThan={feedbackRatingLessThan}&feedbackRating.greaterThanOrEqual={feedbackRatingGreaterThanOrEqual}&feedbackRating.lessThanOrEqual={feedbackRatingLessThanOrEqual}&feedbackRating.equals={feedbackRatingEquals}&feedbackRating.notEquals={feedbackRatingNotEquals}&feedbackRating.specified={feedbackRatingSpecified}&feedbackRating.in={feedbackRatingIn}&feedbackRating.notIn={feedbackRatingNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countTripRecommendationsWithHttpInfo(@QueryMap(encoded=true) CountTripRecommendationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countTripRecommendations</code> method in a fluent style.
   */
  public static class CountTripRecommendationsQueryParams extends HashMap<String, Object> {
    public CountTripRecommendationsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams originContains(@jakarta.annotation.Nullable final String value) {
      put("origin.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams originDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("origin.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams originEquals(@jakarta.annotation.Nullable final String value) {
      put("origin.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams originNotEquals(@jakarta.annotation.Nullable final String value) {
      put("origin.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams originSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("origin.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams originIn(@jakarta.annotation.Nullable final List<String> value) {
      put("origin.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams originNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("origin.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams destinationContains(@jakarta.annotation.Nullable final String value) {
      put("destination.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams destinationDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("destination.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams destinationEquals(@jakarta.annotation.Nullable final String value) {
      put("destination.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams destinationNotEquals(@jakarta.annotation.Nullable final String value) {
      put("destination.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams destinationSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("destination.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams destinationIn(@jakarta.annotation.Nullable final List<String> value) {
      put("destination.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams destinationNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("destination.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams travelDateGreaterThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("travelDate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams travelDateLessThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("travelDate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams travelDateGreaterThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("travelDate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams travelDateLessThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("travelDate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams travelDateEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("travelDate.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams travelDateNotEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("travelDate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams travelDateSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("travelDate.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams travelDateIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("travelDate.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams travelDateNotIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("travelDate.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams preferredTimeGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("preferredTime.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams preferredTimeLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("preferredTime.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams preferredTimeGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("preferredTime.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams preferredTimeLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("preferredTime.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams preferredTimeEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("preferredTime.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams preferredTimeNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("preferredTime.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams preferredTimeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("preferredTime.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams preferredTimeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("preferredTime.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams preferredTimeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("preferredTime.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams budgetRangeContains(@jakarta.annotation.Nullable final String value) {
      put("budgetRange.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams budgetRangeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("budgetRange.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams budgetRangeEquals(@jakarta.annotation.Nullable final String value) {
      put("budgetRange.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams budgetRangeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("budgetRange.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams budgetRangeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("budgetRange.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams budgetRangeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("budgetRange.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams budgetRangeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("budgetRange.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams seatPreferenceContains(@jakarta.annotation.Nullable final String value) {
      put("seatPreference.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams seatPreferenceDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("seatPreference.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams seatPreferenceEquals(@jakarta.annotation.Nullable final String value) {
      put("seatPreference.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams seatPreferenceNotEquals(@jakarta.annotation.Nullable final String value) {
      put("seatPreference.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams seatPreferenceSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("seatPreference.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams seatPreferenceIn(@jakarta.annotation.Nullable final List<String> value) {
      put("seatPreference.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams seatPreferenceNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("seatPreference.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams recommendedTripsContains(@jakarta.annotation.Nullable final String value) {
      put("recommendedTrips.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams recommendedTripsDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("recommendedTrips.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams recommendedTripsEquals(@jakarta.annotation.Nullable final String value) {
      put("recommendedTrips.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams recommendedTripsNotEquals(@jakarta.annotation.Nullable final String value) {
      put("recommendedTrips.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams recommendedTripsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("recommendedTrips.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams recommendedTripsIn(@jakarta.annotation.Nullable final List<String> value) {
      put("recommendedTrips.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams recommendedTripsNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("recommendedTrips.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams confidenceScoreGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidenceScore.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams confidenceScoreLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidenceScore.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams confidenceScoreGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidenceScore.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams confidenceScoreLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidenceScore.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams confidenceScoreEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidenceScore.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams confidenceScoreNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidenceScore.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams confidenceScoreSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("confidenceScore.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams confidenceScoreIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("confidenceScore.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams confidenceScoreNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("confidenceScore.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams isBookedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isBooked.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams isBookedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isBooked.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams isBookedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isBooked.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams isBookedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isBooked.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams isBookedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isBooked.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams feedbackRatingGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("feedbackRating.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams feedbackRatingLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("feedbackRating.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams feedbackRatingGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("feedbackRating.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams feedbackRatingLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("feedbackRating.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams feedbackRatingEquals(@jakarta.annotation.Nullable final Integer value) {
      put("feedbackRating.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams feedbackRatingNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("feedbackRating.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams feedbackRatingSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("feedbackRating.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams feedbackRatingIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("feedbackRating.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams feedbackRatingNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("feedbackRating.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams userIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("userId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams userIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("userId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams userIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("userId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams userIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("userId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams userIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("userId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams userIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("userId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams userIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("userId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripRecommendationsQueryParams userIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("userId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams userIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("userId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripRecommendationsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param tripRecommendationDTO  (required)
   * @return TripRecommendationDTO
   */
  @RequestLine("POST /api/trip-recommendations")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TripRecommendationDTO createTripRecommendation(@jakarta.annotation.Nonnull TripRecommendationDTO tripRecommendationDTO);

  /**
   * 
   * Similar to <code>createTripRecommendation</code> but it also returns the http response headers .
   * 
   * @param tripRecommendationDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/trip-recommendations")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TripRecommendationDTO> createTripRecommendationWithHttpInfo(@jakarta.annotation.Nonnull TripRecommendationDTO tripRecommendationDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/trip-recommendations/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTripRecommendation(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deleteTripRecommendation</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/trip-recommendations/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTripRecommendationWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



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
   * @param originContains  (optional)
   * @param originDoesNotContain  (optional)
   * @param originEquals  (optional)
   * @param originNotEquals  (optional)
   * @param originSpecified  (optional)
   * @param originIn  (optional)
   * @param originNotIn  (optional)
   * @param destinationContains  (optional)
   * @param destinationDoesNotContain  (optional)
   * @param destinationEquals  (optional)
   * @param destinationNotEquals  (optional)
   * @param destinationSpecified  (optional)
   * @param destinationIn  (optional)
   * @param destinationNotIn  (optional)
   * @param travelDateGreaterThan  (optional)
   * @param travelDateLessThan  (optional)
   * @param travelDateGreaterThanOrEqual  (optional)
   * @param travelDateLessThanOrEqual  (optional)
   * @param travelDateEquals  (optional)
   * @param travelDateNotEquals  (optional)
   * @param travelDateSpecified  (optional)
   * @param travelDateIn  (optional)
   * @param travelDateNotIn  (optional)
   * @param preferredTimeGreaterThan  (optional)
   * @param preferredTimeLessThan  (optional)
   * @param preferredTimeGreaterThanOrEqual  (optional)
   * @param preferredTimeLessThanOrEqual  (optional)
   * @param preferredTimeEquals  (optional)
   * @param preferredTimeNotEquals  (optional)
   * @param preferredTimeSpecified  (optional)
   * @param preferredTimeIn  (optional)
   * @param preferredTimeNotIn  (optional)
   * @param budgetRangeContains  (optional)
   * @param budgetRangeDoesNotContain  (optional)
   * @param budgetRangeEquals  (optional)
   * @param budgetRangeNotEquals  (optional)
   * @param budgetRangeSpecified  (optional)
   * @param budgetRangeIn  (optional)
   * @param budgetRangeNotIn  (optional)
   * @param seatPreferenceContains  (optional)
   * @param seatPreferenceDoesNotContain  (optional)
   * @param seatPreferenceEquals  (optional)
   * @param seatPreferenceNotEquals  (optional)
   * @param seatPreferenceSpecified  (optional)
   * @param seatPreferenceIn  (optional)
   * @param seatPreferenceNotIn  (optional)
   * @param recommendedTripsContains  (optional)
   * @param recommendedTripsDoesNotContain  (optional)
   * @param recommendedTripsEquals  (optional)
   * @param recommendedTripsNotEquals  (optional)
   * @param recommendedTripsSpecified  (optional)
   * @param recommendedTripsIn  (optional)
   * @param recommendedTripsNotIn  (optional)
   * @param confidenceScoreGreaterThan  (optional)
   * @param confidenceScoreLessThan  (optional)
   * @param confidenceScoreGreaterThanOrEqual  (optional)
   * @param confidenceScoreLessThanOrEqual  (optional)
   * @param confidenceScoreEquals  (optional)
   * @param confidenceScoreNotEquals  (optional)
   * @param confidenceScoreSpecified  (optional)
   * @param confidenceScoreIn  (optional)
   * @param confidenceScoreNotIn  (optional)
   * @param isBookedEquals  (optional)
   * @param isBookedNotEquals  (optional)
   * @param isBookedSpecified  (optional)
   * @param isBookedIn  (optional)
   * @param isBookedNotIn  (optional)
   * @param feedbackRatingGreaterThan  (optional)
   * @param feedbackRatingLessThan  (optional)
   * @param feedbackRatingGreaterThanOrEqual  (optional)
   * @param feedbackRatingLessThanOrEqual  (optional)
   * @param feedbackRatingEquals  (optional)
   * @param feedbackRatingNotEquals  (optional)
   * @param feedbackRatingSpecified  (optional)
   * @param feedbackRatingIn  (optional)
   * @param feedbackRatingNotIn  (optional)
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
   * @return List&lt;TripRecommendationDTO&gt;
   */
  @RequestLine("GET /api/trip-recommendations?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&origin.contains={originContains}&origin.doesNotContain={originDoesNotContain}&origin.equals={originEquals}&origin.notEquals={originNotEquals}&origin.specified={originSpecified}&origin.in={originIn}&origin.notIn={originNotIn}&destination.contains={destinationContains}&destination.doesNotContain={destinationDoesNotContain}&destination.equals={destinationEquals}&destination.notEquals={destinationNotEquals}&destination.specified={destinationSpecified}&destination.in={destinationIn}&destination.notIn={destinationNotIn}&travelDate.greaterThan={travelDateGreaterThan}&travelDate.lessThan={travelDateLessThan}&travelDate.greaterThanOrEqual={travelDateGreaterThanOrEqual}&travelDate.lessThanOrEqual={travelDateLessThanOrEqual}&travelDate.equals={travelDateEquals}&travelDate.notEquals={travelDateNotEquals}&travelDate.specified={travelDateSpecified}&travelDate.in={travelDateIn}&travelDate.notIn={travelDateNotIn}&preferredTime.greaterThan={preferredTimeGreaterThan}&preferredTime.lessThan={preferredTimeLessThan}&preferredTime.greaterThanOrEqual={preferredTimeGreaterThanOrEqual}&preferredTime.lessThanOrEqual={preferredTimeLessThanOrEqual}&preferredTime.equals={preferredTimeEquals}&preferredTime.notEquals={preferredTimeNotEquals}&preferredTime.specified={preferredTimeSpecified}&preferredTime.in={preferredTimeIn}&preferredTime.notIn={preferredTimeNotIn}&budgetRange.contains={budgetRangeContains}&budgetRange.doesNotContain={budgetRangeDoesNotContain}&budgetRange.equals={budgetRangeEquals}&budgetRange.notEquals={budgetRangeNotEquals}&budgetRange.specified={budgetRangeSpecified}&budgetRange.in={budgetRangeIn}&budgetRange.notIn={budgetRangeNotIn}&seatPreference.contains={seatPreferenceContains}&seatPreference.doesNotContain={seatPreferenceDoesNotContain}&seatPreference.equals={seatPreferenceEquals}&seatPreference.notEquals={seatPreferenceNotEquals}&seatPreference.specified={seatPreferenceSpecified}&seatPreference.in={seatPreferenceIn}&seatPreference.notIn={seatPreferenceNotIn}&recommendedTrips.contains={recommendedTripsContains}&recommendedTrips.doesNotContain={recommendedTripsDoesNotContain}&recommendedTrips.equals={recommendedTripsEquals}&recommendedTrips.notEquals={recommendedTripsNotEquals}&recommendedTrips.specified={recommendedTripsSpecified}&recommendedTrips.in={recommendedTripsIn}&recommendedTrips.notIn={recommendedTripsNotIn}&confidenceScore.greaterThan={confidenceScoreGreaterThan}&confidenceScore.lessThan={confidenceScoreLessThan}&confidenceScore.greaterThanOrEqual={confidenceScoreGreaterThanOrEqual}&confidenceScore.lessThanOrEqual={confidenceScoreLessThanOrEqual}&confidenceScore.equals={confidenceScoreEquals}&confidenceScore.notEquals={confidenceScoreNotEquals}&confidenceScore.specified={confidenceScoreSpecified}&confidenceScore.in={confidenceScoreIn}&confidenceScore.notIn={confidenceScoreNotIn}&isBooked.equals={isBookedEquals}&isBooked.notEquals={isBookedNotEquals}&isBooked.specified={isBookedSpecified}&isBooked.in={isBookedIn}&isBooked.notIn={isBookedNotIn}&feedbackRating.greaterThan={feedbackRatingGreaterThan}&feedbackRating.lessThan={feedbackRatingLessThan}&feedbackRating.greaterThanOrEqual={feedbackRatingGreaterThanOrEqual}&feedbackRating.lessThanOrEqual={feedbackRatingLessThanOrEqual}&feedbackRating.equals={feedbackRatingEquals}&feedbackRating.notEquals={feedbackRatingNotEquals}&feedbackRating.specified={feedbackRatingSpecified}&feedbackRating.in={feedbackRatingIn}&feedbackRating.notIn={feedbackRatingNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  List<TripRecommendationDTO> getAllTripRecommendations(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("originContains") @jakarta.annotation.Nullable String originContains, @Param("originDoesNotContain") @jakarta.annotation.Nullable String originDoesNotContain, @Param("originEquals") @jakarta.annotation.Nullable String originEquals, @Param("originNotEquals") @jakarta.annotation.Nullable String originNotEquals, @Param("originSpecified") @jakarta.annotation.Nullable Boolean originSpecified, @Param("originIn") @jakarta.annotation.Nullable List<String> originIn, @Param("originNotIn") @jakarta.annotation.Nullable List<String> originNotIn, @Param("destinationContains") @jakarta.annotation.Nullable String destinationContains, @Param("destinationDoesNotContain") @jakarta.annotation.Nullable String destinationDoesNotContain, @Param("destinationEquals") @jakarta.annotation.Nullable String destinationEquals, @Param("destinationNotEquals") @jakarta.annotation.Nullable String destinationNotEquals, @Param("destinationSpecified") @jakarta.annotation.Nullable Boolean destinationSpecified, @Param("destinationIn") @jakarta.annotation.Nullable List<String> destinationIn, @Param("destinationNotIn") @jakarta.annotation.Nullable List<String> destinationNotIn, @Param("travelDateGreaterThan") @jakarta.annotation.Nullable LocalDate travelDateGreaterThan, @Param("travelDateLessThan") @jakarta.annotation.Nullable LocalDate travelDateLessThan, @Param("travelDateGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate travelDateGreaterThanOrEqual, @Param("travelDateLessThanOrEqual") @jakarta.annotation.Nullable LocalDate travelDateLessThanOrEqual, @Param("travelDateEquals") @jakarta.annotation.Nullable LocalDate travelDateEquals, @Param("travelDateNotEquals") @jakarta.annotation.Nullable LocalDate travelDateNotEquals, @Param("travelDateSpecified") @jakarta.annotation.Nullable Boolean travelDateSpecified, @Param("travelDateIn") @jakarta.annotation.Nullable List<LocalDate> travelDateIn, @Param("travelDateNotIn") @jakarta.annotation.Nullable List<LocalDate> travelDateNotIn, @Param("preferredTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime preferredTimeGreaterThan, @Param("preferredTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime preferredTimeLessThan, @Param("preferredTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime preferredTimeGreaterThanOrEqual, @Param("preferredTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime preferredTimeLessThanOrEqual, @Param("preferredTimeEquals") @jakarta.annotation.Nullable OffsetDateTime preferredTimeEquals, @Param("preferredTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime preferredTimeNotEquals, @Param("preferredTimeSpecified") @jakarta.annotation.Nullable Boolean preferredTimeSpecified, @Param("preferredTimeIn") @jakarta.annotation.Nullable List<String> preferredTimeIn, @Param("preferredTimeNotIn") @jakarta.annotation.Nullable List<String> preferredTimeNotIn, @Param("budgetRangeContains") @jakarta.annotation.Nullable String budgetRangeContains, @Param("budgetRangeDoesNotContain") @jakarta.annotation.Nullable String budgetRangeDoesNotContain, @Param("budgetRangeEquals") @jakarta.annotation.Nullable String budgetRangeEquals, @Param("budgetRangeNotEquals") @jakarta.annotation.Nullable String budgetRangeNotEquals, @Param("budgetRangeSpecified") @jakarta.annotation.Nullable Boolean budgetRangeSpecified, @Param("budgetRangeIn") @jakarta.annotation.Nullable List<String> budgetRangeIn, @Param("budgetRangeNotIn") @jakarta.annotation.Nullable List<String> budgetRangeNotIn, @Param("seatPreferenceContains") @jakarta.annotation.Nullable String seatPreferenceContains, @Param("seatPreferenceDoesNotContain") @jakarta.annotation.Nullable String seatPreferenceDoesNotContain, @Param("seatPreferenceEquals") @jakarta.annotation.Nullable String seatPreferenceEquals, @Param("seatPreferenceNotEquals") @jakarta.annotation.Nullable String seatPreferenceNotEquals, @Param("seatPreferenceSpecified") @jakarta.annotation.Nullable Boolean seatPreferenceSpecified, @Param("seatPreferenceIn") @jakarta.annotation.Nullable List<String> seatPreferenceIn, @Param("seatPreferenceNotIn") @jakarta.annotation.Nullable List<String> seatPreferenceNotIn, @Param("recommendedTripsContains") @jakarta.annotation.Nullable String recommendedTripsContains, @Param("recommendedTripsDoesNotContain") @jakarta.annotation.Nullable String recommendedTripsDoesNotContain, @Param("recommendedTripsEquals") @jakarta.annotation.Nullable String recommendedTripsEquals, @Param("recommendedTripsNotEquals") @jakarta.annotation.Nullable String recommendedTripsNotEquals, @Param("recommendedTripsSpecified") @jakarta.annotation.Nullable Boolean recommendedTripsSpecified, @Param("recommendedTripsIn") @jakarta.annotation.Nullable List<String> recommendedTripsIn, @Param("recommendedTripsNotIn") @jakarta.annotation.Nullable List<String> recommendedTripsNotIn, @Param("confidenceScoreGreaterThan") @jakarta.annotation.Nullable BigDecimal confidenceScoreGreaterThan, @Param("confidenceScoreLessThan") @jakarta.annotation.Nullable BigDecimal confidenceScoreLessThan, @Param("confidenceScoreGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal confidenceScoreGreaterThanOrEqual, @Param("confidenceScoreLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal confidenceScoreLessThanOrEqual, @Param("confidenceScoreEquals") @jakarta.annotation.Nullable BigDecimal confidenceScoreEquals, @Param("confidenceScoreNotEquals") @jakarta.annotation.Nullable BigDecimal confidenceScoreNotEquals, @Param("confidenceScoreSpecified") @jakarta.annotation.Nullable Boolean confidenceScoreSpecified, @Param("confidenceScoreIn") @jakarta.annotation.Nullable List<BigDecimal> confidenceScoreIn, @Param("confidenceScoreNotIn") @jakarta.annotation.Nullable List<BigDecimal> confidenceScoreNotIn, @Param("isBookedEquals") @jakarta.annotation.Nullable Boolean isBookedEquals, @Param("isBookedNotEquals") @jakarta.annotation.Nullable Boolean isBookedNotEquals, @Param("isBookedSpecified") @jakarta.annotation.Nullable Boolean isBookedSpecified, @Param("isBookedIn") @jakarta.annotation.Nullable List<Boolean> isBookedIn, @Param("isBookedNotIn") @jakarta.annotation.Nullable List<Boolean> isBookedNotIn, @Param("feedbackRatingGreaterThan") @jakarta.annotation.Nullable Integer feedbackRatingGreaterThan, @Param("feedbackRatingLessThan") @jakarta.annotation.Nullable Integer feedbackRatingLessThan, @Param("feedbackRatingGreaterThanOrEqual") @jakarta.annotation.Nullable Integer feedbackRatingGreaterThanOrEqual, @Param("feedbackRatingLessThanOrEqual") @jakarta.annotation.Nullable Integer feedbackRatingLessThanOrEqual, @Param("feedbackRatingEquals") @jakarta.annotation.Nullable Integer feedbackRatingEquals, @Param("feedbackRatingNotEquals") @jakarta.annotation.Nullable Integer feedbackRatingNotEquals, @Param("feedbackRatingSpecified") @jakarta.annotation.Nullable Boolean feedbackRatingSpecified, @Param("feedbackRatingIn") @jakarta.annotation.Nullable List<Integer> feedbackRatingIn, @Param("feedbackRatingNotIn") @jakarta.annotation.Nullable List<Integer> feedbackRatingNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("userIdGreaterThan") @jakarta.annotation.Nullable Long userIdGreaterThan, @Param("userIdLessThan") @jakarta.annotation.Nullable Long userIdLessThan, @Param("userIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long userIdGreaterThanOrEqual, @Param("userIdLessThanOrEqual") @jakarta.annotation.Nullable Long userIdLessThanOrEqual, @Param("userIdEquals") @jakarta.annotation.Nullable Long userIdEquals, @Param("userIdNotEquals") @jakarta.annotation.Nullable Long userIdNotEquals, @Param("userIdSpecified") @jakarta.annotation.Nullable Boolean userIdSpecified, @Param("userIdIn") @jakarta.annotation.Nullable List<Long> userIdIn, @Param("userIdNotIn") @jakarta.annotation.Nullable List<Long> userIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);

  /**
   * 
   * Similar to <code>getAllTripRecommendations</code> but it also returns the http response headers .
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
   * @param originContains  (optional)
   * @param originDoesNotContain  (optional)
   * @param originEquals  (optional)
   * @param originNotEquals  (optional)
   * @param originSpecified  (optional)
   * @param originIn  (optional)
   * @param originNotIn  (optional)
   * @param destinationContains  (optional)
   * @param destinationDoesNotContain  (optional)
   * @param destinationEquals  (optional)
   * @param destinationNotEquals  (optional)
   * @param destinationSpecified  (optional)
   * @param destinationIn  (optional)
   * @param destinationNotIn  (optional)
   * @param travelDateGreaterThan  (optional)
   * @param travelDateLessThan  (optional)
   * @param travelDateGreaterThanOrEqual  (optional)
   * @param travelDateLessThanOrEqual  (optional)
   * @param travelDateEquals  (optional)
   * @param travelDateNotEquals  (optional)
   * @param travelDateSpecified  (optional)
   * @param travelDateIn  (optional)
   * @param travelDateNotIn  (optional)
   * @param preferredTimeGreaterThan  (optional)
   * @param preferredTimeLessThan  (optional)
   * @param preferredTimeGreaterThanOrEqual  (optional)
   * @param preferredTimeLessThanOrEqual  (optional)
   * @param preferredTimeEquals  (optional)
   * @param preferredTimeNotEquals  (optional)
   * @param preferredTimeSpecified  (optional)
   * @param preferredTimeIn  (optional)
   * @param preferredTimeNotIn  (optional)
   * @param budgetRangeContains  (optional)
   * @param budgetRangeDoesNotContain  (optional)
   * @param budgetRangeEquals  (optional)
   * @param budgetRangeNotEquals  (optional)
   * @param budgetRangeSpecified  (optional)
   * @param budgetRangeIn  (optional)
   * @param budgetRangeNotIn  (optional)
   * @param seatPreferenceContains  (optional)
   * @param seatPreferenceDoesNotContain  (optional)
   * @param seatPreferenceEquals  (optional)
   * @param seatPreferenceNotEquals  (optional)
   * @param seatPreferenceSpecified  (optional)
   * @param seatPreferenceIn  (optional)
   * @param seatPreferenceNotIn  (optional)
   * @param recommendedTripsContains  (optional)
   * @param recommendedTripsDoesNotContain  (optional)
   * @param recommendedTripsEquals  (optional)
   * @param recommendedTripsNotEquals  (optional)
   * @param recommendedTripsSpecified  (optional)
   * @param recommendedTripsIn  (optional)
   * @param recommendedTripsNotIn  (optional)
   * @param confidenceScoreGreaterThan  (optional)
   * @param confidenceScoreLessThan  (optional)
   * @param confidenceScoreGreaterThanOrEqual  (optional)
   * @param confidenceScoreLessThanOrEqual  (optional)
   * @param confidenceScoreEquals  (optional)
   * @param confidenceScoreNotEquals  (optional)
   * @param confidenceScoreSpecified  (optional)
   * @param confidenceScoreIn  (optional)
   * @param confidenceScoreNotIn  (optional)
   * @param isBookedEquals  (optional)
   * @param isBookedNotEquals  (optional)
   * @param isBookedSpecified  (optional)
   * @param isBookedIn  (optional)
   * @param isBookedNotIn  (optional)
   * @param feedbackRatingGreaterThan  (optional)
   * @param feedbackRatingLessThan  (optional)
   * @param feedbackRatingGreaterThanOrEqual  (optional)
   * @param feedbackRatingLessThanOrEqual  (optional)
   * @param feedbackRatingEquals  (optional)
   * @param feedbackRatingNotEquals  (optional)
   * @param feedbackRatingSpecified  (optional)
   * @param feedbackRatingIn  (optional)
   * @param feedbackRatingNotIn  (optional)
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
  @RequestLine("GET /api/trip-recommendations?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&origin.contains={originContains}&origin.doesNotContain={originDoesNotContain}&origin.equals={originEquals}&origin.notEquals={originNotEquals}&origin.specified={originSpecified}&origin.in={originIn}&origin.notIn={originNotIn}&destination.contains={destinationContains}&destination.doesNotContain={destinationDoesNotContain}&destination.equals={destinationEquals}&destination.notEquals={destinationNotEquals}&destination.specified={destinationSpecified}&destination.in={destinationIn}&destination.notIn={destinationNotIn}&travelDate.greaterThan={travelDateGreaterThan}&travelDate.lessThan={travelDateLessThan}&travelDate.greaterThanOrEqual={travelDateGreaterThanOrEqual}&travelDate.lessThanOrEqual={travelDateLessThanOrEqual}&travelDate.equals={travelDateEquals}&travelDate.notEquals={travelDateNotEquals}&travelDate.specified={travelDateSpecified}&travelDate.in={travelDateIn}&travelDate.notIn={travelDateNotIn}&preferredTime.greaterThan={preferredTimeGreaterThan}&preferredTime.lessThan={preferredTimeLessThan}&preferredTime.greaterThanOrEqual={preferredTimeGreaterThanOrEqual}&preferredTime.lessThanOrEqual={preferredTimeLessThanOrEqual}&preferredTime.equals={preferredTimeEquals}&preferredTime.notEquals={preferredTimeNotEquals}&preferredTime.specified={preferredTimeSpecified}&preferredTime.in={preferredTimeIn}&preferredTime.notIn={preferredTimeNotIn}&budgetRange.contains={budgetRangeContains}&budgetRange.doesNotContain={budgetRangeDoesNotContain}&budgetRange.equals={budgetRangeEquals}&budgetRange.notEquals={budgetRangeNotEquals}&budgetRange.specified={budgetRangeSpecified}&budgetRange.in={budgetRangeIn}&budgetRange.notIn={budgetRangeNotIn}&seatPreference.contains={seatPreferenceContains}&seatPreference.doesNotContain={seatPreferenceDoesNotContain}&seatPreference.equals={seatPreferenceEquals}&seatPreference.notEquals={seatPreferenceNotEquals}&seatPreference.specified={seatPreferenceSpecified}&seatPreference.in={seatPreferenceIn}&seatPreference.notIn={seatPreferenceNotIn}&recommendedTrips.contains={recommendedTripsContains}&recommendedTrips.doesNotContain={recommendedTripsDoesNotContain}&recommendedTrips.equals={recommendedTripsEquals}&recommendedTrips.notEquals={recommendedTripsNotEquals}&recommendedTrips.specified={recommendedTripsSpecified}&recommendedTrips.in={recommendedTripsIn}&recommendedTrips.notIn={recommendedTripsNotIn}&confidenceScore.greaterThan={confidenceScoreGreaterThan}&confidenceScore.lessThan={confidenceScoreLessThan}&confidenceScore.greaterThanOrEqual={confidenceScoreGreaterThanOrEqual}&confidenceScore.lessThanOrEqual={confidenceScoreLessThanOrEqual}&confidenceScore.equals={confidenceScoreEquals}&confidenceScore.notEquals={confidenceScoreNotEquals}&confidenceScore.specified={confidenceScoreSpecified}&confidenceScore.in={confidenceScoreIn}&confidenceScore.notIn={confidenceScoreNotIn}&isBooked.equals={isBookedEquals}&isBooked.notEquals={isBookedNotEquals}&isBooked.specified={isBookedSpecified}&isBooked.in={isBookedIn}&isBooked.notIn={isBookedNotIn}&feedbackRating.greaterThan={feedbackRatingGreaterThan}&feedbackRating.lessThan={feedbackRatingLessThan}&feedbackRating.greaterThanOrEqual={feedbackRatingGreaterThanOrEqual}&feedbackRating.lessThanOrEqual={feedbackRatingLessThanOrEqual}&feedbackRating.equals={feedbackRatingEquals}&feedbackRating.notEquals={feedbackRatingNotEquals}&feedbackRating.specified={feedbackRatingSpecified}&feedbackRating.in={feedbackRatingIn}&feedbackRating.notIn={feedbackRatingNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<TripRecommendationDTO>> getAllTripRecommendationsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("originContains") @jakarta.annotation.Nullable String originContains, @Param("originDoesNotContain") @jakarta.annotation.Nullable String originDoesNotContain, @Param("originEquals") @jakarta.annotation.Nullable String originEquals, @Param("originNotEquals") @jakarta.annotation.Nullable String originNotEquals, @Param("originSpecified") @jakarta.annotation.Nullable Boolean originSpecified, @Param("originIn") @jakarta.annotation.Nullable List<String> originIn, @Param("originNotIn") @jakarta.annotation.Nullable List<String> originNotIn, @Param("destinationContains") @jakarta.annotation.Nullable String destinationContains, @Param("destinationDoesNotContain") @jakarta.annotation.Nullable String destinationDoesNotContain, @Param("destinationEquals") @jakarta.annotation.Nullable String destinationEquals, @Param("destinationNotEquals") @jakarta.annotation.Nullable String destinationNotEquals, @Param("destinationSpecified") @jakarta.annotation.Nullable Boolean destinationSpecified, @Param("destinationIn") @jakarta.annotation.Nullable List<String> destinationIn, @Param("destinationNotIn") @jakarta.annotation.Nullable List<String> destinationNotIn, @Param("travelDateGreaterThan") @jakarta.annotation.Nullable LocalDate travelDateGreaterThan, @Param("travelDateLessThan") @jakarta.annotation.Nullable LocalDate travelDateLessThan, @Param("travelDateGreaterThanOrEqual") @jakarta.annotation.Nullable LocalDate travelDateGreaterThanOrEqual, @Param("travelDateLessThanOrEqual") @jakarta.annotation.Nullable LocalDate travelDateLessThanOrEqual, @Param("travelDateEquals") @jakarta.annotation.Nullable LocalDate travelDateEquals, @Param("travelDateNotEquals") @jakarta.annotation.Nullable LocalDate travelDateNotEquals, @Param("travelDateSpecified") @jakarta.annotation.Nullable Boolean travelDateSpecified, @Param("travelDateIn") @jakarta.annotation.Nullable List<LocalDate> travelDateIn, @Param("travelDateNotIn") @jakarta.annotation.Nullable List<LocalDate> travelDateNotIn, @Param("preferredTimeGreaterThan") @jakarta.annotation.Nullable OffsetDateTime preferredTimeGreaterThan, @Param("preferredTimeLessThan") @jakarta.annotation.Nullable OffsetDateTime preferredTimeLessThan, @Param("preferredTimeGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime preferredTimeGreaterThanOrEqual, @Param("preferredTimeLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime preferredTimeLessThanOrEqual, @Param("preferredTimeEquals") @jakarta.annotation.Nullable OffsetDateTime preferredTimeEquals, @Param("preferredTimeNotEquals") @jakarta.annotation.Nullable OffsetDateTime preferredTimeNotEquals, @Param("preferredTimeSpecified") @jakarta.annotation.Nullable Boolean preferredTimeSpecified, @Param("preferredTimeIn") @jakarta.annotation.Nullable List<String> preferredTimeIn, @Param("preferredTimeNotIn") @jakarta.annotation.Nullable List<String> preferredTimeNotIn, @Param("budgetRangeContains") @jakarta.annotation.Nullable String budgetRangeContains, @Param("budgetRangeDoesNotContain") @jakarta.annotation.Nullable String budgetRangeDoesNotContain, @Param("budgetRangeEquals") @jakarta.annotation.Nullable String budgetRangeEquals, @Param("budgetRangeNotEquals") @jakarta.annotation.Nullable String budgetRangeNotEquals, @Param("budgetRangeSpecified") @jakarta.annotation.Nullable Boolean budgetRangeSpecified, @Param("budgetRangeIn") @jakarta.annotation.Nullable List<String> budgetRangeIn, @Param("budgetRangeNotIn") @jakarta.annotation.Nullable List<String> budgetRangeNotIn, @Param("seatPreferenceContains") @jakarta.annotation.Nullable String seatPreferenceContains, @Param("seatPreferenceDoesNotContain") @jakarta.annotation.Nullable String seatPreferenceDoesNotContain, @Param("seatPreferenceEquals") @jakarta.annotation.Nullable String seatPreferenceEquals, @Param("seatPreferenceNotEquals") @jakarta.annotation.Nullable String seatPreferenceNotEquals, @Param("seatPreferenceSpecified") @jakarta.annotation.Nullable Boolean seatPreferenceSpecified, @Param("seatPreferenceIn") @jakarta.annotation.Nullable List<String> seatPreferenceIn, @Param("seatPreferenceNotIn") @jakarta.annotation.Nullable List<String> seatPreferenceNotIn, @Param("recommendedTripsContains") @jakarta.annotation.Nullable String recommendedTripsContains, @Param("recommendedTripsDoesNotContain") @jakarta.annotation.Nullable String recommendedTripsDoesNotContain, @Param("recommendedTripsEquals") @jakarta.annotation.Nullable String recommendedTripsEquals, @Param("recommendedTripsNotEquals") @jakarta.annotation.Nullable String recommendedTripsNotEquals, @Param("recommendedTripsSpecified") @jakarta.annotation.Nullable Boolean recommendedTripsSpecified, @Param("recommendedTripsIn") @jakarta.annotation.Nullable List<String> recommendedTripsIn, @Param("recommendedTripsNotIn") @jakarta.annotation.Nullable List<String> recommendedTripsNotIn, @Param("confidenceScoreGreaterThan") @jakarta.annotation.Nullable BigDecimal confidenceScoreGreaterThan, @Param("confidenceScoreLessThan") @jakarta.annotation.Nullable BigDecimal confidenceScoreLessThan, @Param("confidenceScoreGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal confidenceScoreGreaterThanOrEqual, @Param("confidenceScoreLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal confidenceScoreLessThanOrEqual, @Param("confidenceScoreEquals") @jakarta.annotation.Nullable BigDecimal confidenceScoreEquals, @Param("confidenceScoreNotEquals") @jakarta.annotation.Nullable BigDecimal confidenceScoreNotEquals, @Param("confidenceScoreSpecified") @jakarta.annotation.Nullable Boolean confidenceScoreSpecified, @Param("confidenceScoreIn") @jakarta.annotation.Nullable List<BigDecimal> confidenceScoreIn, @Param("confidenceScoreNotIn") @jakarta.annotation.Nullable List<BigDecimal> confidenceScoreNotIn, @Param("isBookedEquals") @jakarta.annotation.Nullable Boolean isBookedEquals, @Param("isBookedNotEquals") @jakarta.annotation.Nullable Boolean isBookedNotEquals, @Param("isBookedSpecified") @jakarta.annotation.Nullable Boolean isBookedSpecified, @Param("isBookedIn") @jakarta.annotation.Nullable List<Boolean> isBookedIn, @Param("isBookedNotIn") @jakarta.annotation.Nullable List<Boolean> isBookedNotIn, @Param("feedbackRatingGreaterThan") @jakarta.annotation.Nullable Integer feedbackRatingGreaterThan, @Param("feedbackRatingLessThan") @jakarta.annotation.Nullable Integer feedbackRatingLessThan, @Param("feedbackRatingGreaterThanOrEqual") @jakarta.annotation.Nullable Integer feedbackRatingGreaterThanOrEqual, @Param("feedbackRatingLessThanOrEqual") @jakarta.annotation.Nullable Integer feedbackRatingLessThanOrEqual, @Param("feedbackRatingEquals") @jakarta.annotation.Nullable Integer feedbackRatingEquals, @Param("feedbackRatingNotEquals") @jakarta.annotation.Nullable Integer feedbackRatingNotEquals, @Param("feedbackRatingSpecified") @jakarta.annotation.Nullable Boolean feedbackRatingSpecified, @Param("feedbackRatingIn") @jakarta.annotation.Nullable List<Integer> feedbackRatingIn, @Param("feedbackRatingNotIn") @jakarta.annotation.Nullable List<Integer> feedbackRatingNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("userIdGreaterThan") @jakarta.annotation.Nullable Long userIdGreaterThan, @Param("userIdLessThan") @jakarta.annotation.Nullable Long userIdLessThan, @Param("userIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long userIdGreaterThanOrEqual, @Param("userIdLessThanOrEqual") @jakarta.annotation.Nullable Long userIdLessThanOrEqual, @Param("userIdEquals") @jakarta.annotation.Nullable Long userIdEquals, @Param("userIdNotEquals") @jakarta.annotation.Nullable Long userIdNotEquals, @Param("userIdSpecified") @jakarta.annotation.Nullable Boolean userIdSpecified, @Param("userIdIn") @jakarta.annotation.Nullable List<Long> userIdIn, @Param("userIdNotIn") @jakarta.annotation.Nullable List<Long> userIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllTripRecommendations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllTripRecommendationsQueryParams} class that allows for
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
   *   <li>originContains -  (optional)</li>
   *   <li>originDoesNotContain -  (optional)</li>
   *   <li>originEquals -  (optional)</li>
   *   <li>originNotEquals -  (optional)</li>
   *   <li>originSpecified -  (optional)</li>
   *   <li>originIn -  (optional)</li>
   *   <li>originNotIn -  (optional)</li>
   *   <li>destinationContains -  (optional)</li>
   *   <li>destinationDoesNotContain -  (optional)</li>
   *   <li>destinationEquals -  (optional)</li>
   *   <li>destinationNotEquals -  (optional)</li>
   *   <li>destinationSpecified -  (optional)</li>
   *   <li>destinationIn -  (optional)</li>
   *   <li>destinationNotIn -  (optional)</li>
   *   <li>travelDateGreaterThan -  (optional)</li>
   *   <li>travelDateLessThan -  (optional)</li>
   *   <li>travelDateGreaterThanOrEqual -  (optional)</li>
   *   <li>travelDateLessThanOrEqual -  (optional)</li>
   *   <li>travelDateEquals -  (optional)</li>
   *   <li>travelDateNotEquals -  (optional)</li>
   *   <li>travelDateSpecified -  (optional)</li>
   *   <li>travelDateIn -  (optional)</li>
   *   <li>travelDateNotIn -  (optional)</li>
   *   <li>preferredTimeGreaterThan -  (optional)</li>
   *   <li>preferredTimeLessThan -  (optional)</li>
   *   <li>preferredTimeGreaterThanOrEqual -  (optional)</li>
   *   <li>preferredTimeLessThanOrEqual -  (optional)</li>
   *   <li>preferredTimeEquals -  (optional)</li>
   *   <li>preferredTimeNotEquals -  (optional)</li>
   *   <li>preferredTimeSpecified -  (optional)</li>
   *   <li>preferredTimeIn -  (optional)</li>
   *   <li>preferredTimeNotIn -  (optional)</li>
   *   <li>budgetRangeContains -  (optional)</li>
   *   <li>budgetRangeDoesNotContain -  (optional)</li>
   *   <li>budgetRangeEquals -  (optional)</li>
   *   <li>budgetRangeNotEquals -  (optional)</li>
   *   <li>budgetRangeSpecified -  (optional)</li>
   *   <li>budgetRangeIn -  (optional)</li>
   *   <li>budgetRangeNotIn -  (optional)</li>
   *   <li>seatPreferenceContains -  (optional)</li>
   *   <li>seatPreferenceDoesNotContain -  (optional)</li>
   *   <li>seatPreferenceEquals -  (optional)</li>
   *   <li>seatPreferenceNotEquals -  (optional)</li>
   *   <li>seatPreferenceSpecified -  (optional)</li>
   *   <li>seatPreferenceIn -  (optional)</li>
   *   <li>seatPreferenceNotIn -  (optional)</li>
   *   <li>recommendedTripsContains -  (optional)</li>
   *   <li>recommendedTripsDoesNotContain -  (optional)</li>
   *   <li>recommendedTripsEquals -  (optional)</li>
   *   <li>recommendedTripsNotEquals -  (optional)</li>
   *   <li>recommendedTripsSpecified -  (optional)</li>
   *   <li>recommendedTripsIn -  (optional)</li>
   *   <li>recommendedTripsNotIn -  (optional)</li>
   *   <li>confidenceScoreGreaterThan -  (optional)</li>
   *   <li>confidenceScoreLessThan -  (optional)</li>
   *   <li>confidenceScoreGreaterThanOrEqual -  (optional)</li>
   *   <li>confidenceScoreLessThanOrEqual -  (optional)</li>
   *   <li>confidenceScoreEquals -  (optional)</li>
   *   <li>confidenceScoreNotEquals -  (optional)</li>
   *   <li>confidenceScoreSpecified -  (optional)</li>
   *   <li>confidenceScoreIn -  (optional)</li>
   *   <li>confidenceScoreNotIn -  (optional)</li>
   *   <li>isBookedEquals -  (optional)</li>
   *   <li>isBookedNotEquals -  (optional)</li>
   *   <li>isBookedSpecified -  (optional)</li>
   *   <li>isBookedIn -  (optional)</li>
   *   <li>isBookedNotIn -  (optional)</li>
   *   <li>feedbackRatingGreaterThan -  (optional)</li>
   *   <li>feedbackRatingLessThan -  (optional)</li>
   *   <li>feedbackRatingGreaterThanOrEqual -  (optional)</li>
   *   <li>feedbackRatingLessThanOrEqual -  (optional)</li>
   *   <li>feedbackRatingEquals -  (optional)</li>
   *   <li>feedbackRatingNotEquals -  (optional)</li>
   *   <li>feedbackRatingSpecified -  (optional)</li>
   *   <li>feedbackRatingIn -  (optional)</li>
   *   <li>feedbackRatingNotIn -  (optional)</li>
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
   * @return List&lt;TripRecommendationDTO&gt;
   */
  @RequestLine("GET /api/trip-recommendations?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&origin.contains={originContains}&origin.doesNotContain={originDoesNotContain}&origin.equals={originEquals}&origin.notEquals={originNotEquals}&origin.specified={originSpecified}&origin.in={originIn}&origin.notIn={originNotIn}&destination.contains={destinationContains}&destination.doesNotContain={destinationDoesNotContain}&destination.equals={destinationEquals}&destination.notEquals={destinationNotEquals}&destination.specified={destinationSpecified}&destination.in={destinationIn}&destination.notIn={destinationNotIn}&travelDate.greaterThan={travelDateGreaterThan}&travelDate.lessThan={travelDateLessThan}&travelDate.greaterThanOrEqual={travelDateGreaterThanOrEqual}&travelDate.lessThanOrEqual={travelDateLessThanOrEqual}&travelDate.equals={travelDateEquals}&travelDate.notEquals={travelDateNotEquals}&travelDate.specified={travelDateSpecified}&travelDate.in={travelDateIn}&travelDate.notIn={travelDateNotIn}&preferredTime.greaterThan={preferredTimeGreaterThan}&preferredTime.lessThan={preferredTimeLessThan}&preferredTime.greaterThanOrEqual={preferredTimeGreaterThanOrEqual}&preferredTime.lessThanOrEqual={preferredTimeLessThanOrEqual}&preferredTime.equals={preferredTimeEquals}&preferredTime.notEquals={preferredTimeNotEquals}&preferredTime.specified={preferredTimeSpecified}&preferredTime.in={preferredTimeIn}&preferredTime.notIn={preferredTimeNotIn}&budgetRange.contains={budgetRangeContains}&budgetRange.doesNotContain={budgetRangeDoesNotContain}&budgetRange.equals={budgetRangeEquals}&budgetRange.notEquals={budgetRangeNotEquals}&budgetRange.specified={budgetRangeSpecified}&budgetRange.in={budgetRangeIn}&budgetRange.notIn={budgetRangeNotIn}&seatPreference.contains={seatPreferenceContains}&seatPreference.doesNotContain={seatPreferenceDoesNotContain}&seatPreference.equals={seatPreferenceEquals}&seatPreference.notEquals={seatPreferenceNotEquals}&seatPreference.specified={seatPreferenceSpecified}&seatPreference.in={seatPreferenceIn}&seatPreference.notIn={seatPreferenceNotIn}&recommendedTrips.contains={recommendedTripsContains}&recommendedTrips.doesNotContain={recommendedTripsDoesNotContain}&recommendedTrips.equals={recommendedTripsEquals}&recommendedTrips.notEquals={recommendedTripsNotEquals}&recommendedTrips.specified={recommendedTripsSpecified}&recommendedTrips.in={recommendedTripsIn}&recommendedTrips.notIn={recommendedTripsNotIn}&confidenceScore.greaterThan={confidenceScoreGreaterThan}&confidenceScore.lessThan={confidenceScoreLessThan}&confidenceScore.greaterThanOrEqual={confidenceScoreGreaterThanOrEqual}&confidenceScore.lessThanOrEqual={confidenceScoreLessThanOrEqual}&confidenceScore.equals={confidenceScoreEquals}&confidenceScore.notEquals={confidenceScoreNotEquals}&confidenceScore.specified={confidenceScoreSpecified}&confidenceScore.in={confidenceScoreIn}&confidenceScore.notIn={confidenceScoreNotIn}&isBooked.equals={isBookedEquals}&isBooked.notEquals={isBookedNotEquals}&isBooked.specified={isBookedSpecified}&isBooked.in={isBookedIn}&isBooked.notIn={isBookedNotIn}&feedbackRating.greaterThan={feedbackRatingGreaterThan}&feedbackRating.lessThan={feedbackRatingLessThan}&feedbackRating.greaterThanOrEqual={feedbackRatingGreaterThanOrEqual}&feedbackRating.lessThanOrEqual={feedbackRatingLessThanOrEqual}&feedbackRating.equals={feedbackRatingEquals}&feedbackRating.notEquals={feedbackRatingNotEquals}&feedbackRating.specified={feedbackRatingSpecified}&feedbackRating.in={feedbackRatingIn}&feedbackRating.notIn={feedbackRatingNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
  "Accept: */*",
  })
  List<TripRecommendationDTO> getAllTripRecommendations(@QueryMap(encoded=true) GetAllTripRecommendationsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllTripRecommendations</code> that receives the query parameters as a map,
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
          *   <li>originContains -  (optional)</li>
          *   <li>originDoesNotContain -  (optional)</li>
          *   <li>originEquals -  (optional)</li>
          *   <li>originNotEquals -  (optional)</li>
          *   <li>originSpecified -  (optional)</li>
          *   <li>originIn -  (optional)</li>
          *   <li>originNotIn -  (optional)</li>
          *   <li>destinationContains -  (optional)</li>
          *   <li>destinationDoesNotContain -  (optional)</li>
          *   <li>destinationEquals -  (optional)</li>
          *   <li>destinationNotEquals -  (optional)</li>
          *   <li>destinationSpecified -  (optional)</li>
          *   <li>destinationIn -  (optional)</li>
          *   <li>destinationNotIn -  (optional)</li>
          *   <li>travelDateGreaterThan -  (optional)</li>
          *   <li>travelDateLessThan -  (optional)</li>
          *   <li>travelDateGreaterThanOrEqual -  (optional)</li>
          *   <li>travelDateLessThanOrEqual -  (optional)</li>
          *   <li>travelDateEquals -  (optional)</li>
          *   <li>travelDateNotEquals -  (optional)</li>
          *   <li>travelDateSpecified -  (optional)</li>
          *   <li>travelDateIn -  (optional)</li>
          *   <li>travelDateNotIn -  (optional)</li>
          *   <li>preferredTimeGreaterThan -  (optional)</li>
          *   <li>preferredTimeLessThan -  (optional)</li>
          *   <li>preferredTimeGreaterThanOrEqual -  (optional)</li>
          *   <li>preferredTimeLessThanOrEqual -  (optional)</li>
          *   <li>preferredTimeEquals -  (optional)</li>
          *   <li>preferredTimeNotEquals -  (optional)</li>
          *   <li>preferredTimeSpecified -  (optional)</li>
          *   <li>preferredTimeIn -  (optional)</li>
          *   <li>preferredTimeNotIn -  (optional)</li>
          *   <li>budgetRangeContains -  (optional)</li>
          *   <li>budgetRangeDoesNotContain -  (optional)</li>
          *   <li>budgetRangeEquals -  (optional)</li>
          *   <li>budgetRangeNotEquals -  (optional)</li>
          *   <li>budgetRangeSpecified -  (optional)</li>
          *   <li>budgetRangeIn -  (optional)</li>
          *   <li>budgetRangeNotIn -  (optional)</li>
          *   <li>seatPreferenceContains -  (optional)</li>
          *   <li>seatPreferenceDoesNotContain -  (optional)</li>
          *   <li>seatPreferenceEquals -  (optional)</li>
          *   <li>seatPreferenceNotEquals -  (optional)</li>
          *   <li>seatPreferenceSpecified -  (optional)</li>
          *   <li>seatPreferenceIn -  (optional)</li>
          *   <li>seatPreferenceNotIn -  (optional)</li>
          *   <li>recommendedTripsContains -  (optional)</li>
          *   <li>recommendedTripsDoesNotContain -  (optional)</li>
          *   <li>recommendedTripsEquals -  (optional)</li>
          *   <li>recommendedTripsNotEquals -  (optional)</li>
          *   <li>recommendedTripsSpecified -  (optional)</li>
          *   <li>recommendedTripsIn -  (optional)</li>
          *   <li>recommendedTripsNotIn -  (optional)</li>
          *   <li>confidenceScoreGreaterThan -  (optional)</li>
          *   <li>confidenceScoreLessThan -  (optional)</li>
          *   <li>confidenceScoreGreaterThanOrEqual -  (optional)</li>
          *   <li>confidenceScoreLessThanOrEqual -  (optional)</li>
          *   <li>confidenceScoreEquals -  (optional)</li>
          *   <li>confidenceScoreNotEquals -  (optional)</li>
          *   <li>confidenceScoreSpecified -  (optional)</li>
          *   <li>confidenceScoreIn -  (optional)</li>
          *   <li>confidenceScoreNotIn -  (optional)</li>
          *   <li>isBookedEquals -  (optional)</li>
          *   <li>isBookedNotEquals -  (optional)</li>
          *   <li>isBookedSpecified -  (optional)</li>
          *   <li>isBookedIn -  (optional)</li>
          *   <li>isBookedNotIn -  (optional)</li>
          *   <li>feedbackRatingGreaterThan -  (optional)</li>
          *   <li>feedbackRatingLessThan -  (optional)</li>
          *   <li>feedbackRatingGreaterThanOrEqual -  (optional)</li>
          *   <li>feedbackRatingLessThanOrEqual -  (optional)</li>
          *   <li>feedbackRatingEquals -  (optional)</li>
          *   <li>feedbackRatingNotEquals -  (optional)</li>
          *   <li>feedbackRatingSpecified -  (optional)</li>
          *   <li>feedbackRatingIn -  (optional)</li>
          *   <li>feedbackRatingNotIn -  (optional)</li>
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
          * @return List&lt;TripRecommendationDTO&gt;
      */
      @RequestLine("GET /api/trip-recommendations?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&origin.contains={originContains}&origin.doesNotContain={originDoesNotContain}&origin.equals={originEquals}&origin.notEquals={originNotEquals}&origin.specified={originSpecified}&origin.in={originIn}&origin.notIn={originNotIn}&destination.contains={destinationContains}&destination.doesNotContain={destinationDoesNotContain}&destination.equals={destinationEquals}&destination.notEquals={destinationNotEquals}&destination.specified={destinationSpecified}&destination.in={destinationIn}&destination.notIn={destinationNotIn}&travelDate.greaterThan={travelDateGreaterThan}&travelDate.lessThan={travelDateLessThan}&travelDate.greaterThanOrEqual={travelDateGreaterThanOrEqual}&travelDate.lessThanOrEqual={travelDateLessThanOrEqual}&travelDate.equals={travelDateEquals}&travelDate.notEquals={travelDateNotEquals}&travelDate.specified={travelDateSpecified}&travelDate.in={travelDateIn}&travelDate.notIn={travelDateNotIn}&preferredTime.greaterThan={preferredTimeGreaterThan}&preferredTime.lessThan={preferredTimeLessThan}&preferredTime.greaterThanOrEqual={preferredTimeGreaterThanOrEqual}&preferredTime.lessThanOrEqual={preferredTimeLessThanOrEqual}&preferredTime.equals={preferredTimeEquals}&preferredTime.notEquals={preferredTimeNotEquals}&preferredTime.specified={preferredTimeSpecified}&preferredTime.in={preferredTimeIn}&preferredTime.notIn={preferredTimeNotIn}&budgetRange.contains={budgetRangeContains}&budgetRange.doesNotContain={budgetRangeDoesNotContain}&budgetRange.equals={budgetRangeEquals}&budgetRange.notEquals={budgetRangeNotEquals}&budgetRange.specified={budgetRangeSpecified}&budgetRange.in={budgetRangeIn}&budgetRange.notIn={budgetRangeNotIn}&seatPreference.contains={seatPreferenceContains}&seatPreference.doesNotContain={seatPreferenceDoesNotContain}&seatPreference.equals={seatPreferenceEquals}&seatPreference.notEquals={seatPreferenceNotEquals}&seatPreference.specified={seatPreferenceSpecified}&seatPreference.in={seatPreferenceIn}&seatPreference.notIn={seatPreferenceNotIn}&recommendedTrips.contains={recommendedTripsContains}&recommendedTrips.doesNotContain={recommendedTripsDoesNotContain}&recommendedTrips.equals={recommendedTripsEquals}&recommendedTrips.notEquals={recommendedTripsNotEquals}&recommendedTrips.specified={recommendedTripsSpecified}&recommendedTrips.in={recommendedTripsIn}&recommendedTrips.notIn={recommendedTripsNotIn}&confidenceScore.greaterThan={confidenceScoreGreaterThan}&confidenceScore.lessThan={confidenceScoreLessThan}&confidenceScore.greaterThanOrEqual={confidenceScoreGreaterThanOrEqual}&confidenceScore.lessThanOrEqual={confidenceScoreLessThanOrEqual}&confidenceScore.equals={confidenceScoreEquals}&confidenceScore.notEquals={confidenceScoreNotEquals}&confidenceScore.specified={confidenceScoreSpecified}&confidenceScore.in={confidenceScoreIn}&confidenceScore.notIn={confidenceScoreNotIn}&isBooked.equals={isBookedEquals}&isBooked.notEquals={isBookedNotEquals}&isBooked.specified={isBookedSpecified}&isBooked.in={isBookedIn}&isBooked.notIn={isBookedNotIn}&feedbackRating.greaterThan={feedbackRatingGreaterThan}&feedbackRating.lessThan={feedbackRatingLessThan}&feedbackRating.greaterThanOrEqual={feedbackRatingGreaterThanOrEqual}&feedbackRating.lessThanOrEqual={feedbackRatingLessThanOrEqual}&feedbackRating.equals={feedbackRatingEquals}&feedbackRating.notEquals={feedbackRatingNotEquals}&feedbackRating.specified={feedbackRatingSpecified}&feedbackRating.in={feedbackRatingIn}&feedbackRating.notIn={feedbackRatingNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<TripRecommendationDTO>> getAllTripRecommendationsWithHttpInfo(@QueryMap(encoded=true) GetAllTripRecommendationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllTripRecommendations</code> method in a fluent style.
   */
  public static class GetAllTripRecommendationsQueryParams extends HashMap<String, Object> {
    public GetAllTripRecommendationsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams originContains(@jakarta.annotation.Nullable final String value) {
      put("origin.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams originDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("origin.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams originEquals(@jakarta.annotation.Nullable final String value) {
      put("origin.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams originNotEquals(@jakarta.annotation.Nullable final String value) {
      put("origin.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams originSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("origin.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams originIn(@jakarta.annotation.Nullable final List<String> value) {
      put("origin.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams originNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("origin.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams destinationContains(@jakarta.annotation.Nullable final String value) {
      put("destination.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams destinationDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("destination.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams destinationEquals(@jakarta.annotation.Nullable final String value) {
      put("destination.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams destinationNotEquals(@jakarta.annotation.Nullable final String value) {
      put("destination.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams destinationSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("destination.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams destinationIn(@jakarta.annotation.Nullable final List<String> value) {
      put("destination.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams destinationNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("destination.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams travelDateGreaterThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("travelDate.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams travelDateLessThan(@jakarta.annotation.Nullable final LocalDate value) {
      put("travelDate.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams travelDateGreaterThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("travelDate.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams travelDateLessThanOrEqual(@jakarta.annotation.Nullable final LocalDate value) {
      put("travelDate.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams travelDateEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("travelDate.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams travelDateNotEquals(@jakarta.annotation.Nullable final LocalDate value) {
      put("travelDate.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams travelDateSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("travelDate.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams travelDateIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("travelDate.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams travelDateNotIn(@jakarta.annotation.Nullable final List<LocalDate> value) {
      put("travelDate.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams preferredTimeGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("preferredTime.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams preferredTimeLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("preferredTime.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams preferredTimeGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("preferredTime.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams preferredTimeLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("preferredTime.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams preferredTimeEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("preferredTime.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams preferredTimeNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("preferredTime.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams preferredTimeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("preferredTime.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams preferredTimeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("preferredTime.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams preferredTimeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("preferredTime.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams budgetRangeContains(@jakarta.annotation.Nullable final String value) {
      put("budgetRange.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams budgetRangeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("budgetRange.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams budgetRangeEquals(@jakarta.annotation.Nullable final String value) {
      put("budgetRange.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams budgetRangeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("budgetRange.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams budgetRangeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("budgetRange.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams budgetRangeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("budgetRange.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams budgetRangeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("budgetRange.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams seatPreferenceContains(@jakarta.annotation.Nullable final String value) {
      put("seatPreference.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams seatPreferenceDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("seatPreference.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams seatPreferenceEquals(@jakarta.annotation.Nullable final String value) {
      put("seatPreference.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams seatPreferenceNotEquals(@jakarta.annotation.Nullable final String value) {
      put("seatPreference.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams seatPreferenceSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("seatPreference.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams seatPreferenceIn(@jakarta.annotation.Nullable final List<String> value) {
      put("seatPreference.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams seatPreferenceNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("seatPreference.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams recommendedTripsContains(@jakarta.annotation.Nullable final String value) {
      put("recommendedTrips.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams recommendedTripsDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("recommendedTrips.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams recommendedTripsEquals(@jakarta.annotation.Nullable final String value) {
      put("recommendedTrips.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams recommendedTripsNotEquals(@jakarta.annotation.Nullable final String value) {
      put("recommendedTrips.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams recommendedTripsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("recommendedTrips.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams recommendedTripsIn(@jakarta.annotation.Nullable final List<String> value) {
      put("recommendedTrips.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams recommendedTripsNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("recommendedTrips.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams confidenceScoreGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidenceScore.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams confidenceScoreLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidenceScore.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams confidenceScoreGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidenceScore.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams confidenceScoreLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidenceScore.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams confidenceScoreEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidenceScore.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams confidenceScoreNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidenceScore.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams confidenceScoreSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("confidenceScore.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams confidenceScoreIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("confidenceScore.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams confidenceScoreNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("confidenceScore.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams isBookedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isBooked.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams isBookedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isBooked.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams isBookedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isBooked.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams isBookedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isBooked.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams isBookedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isBooked.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams feedbackRatingGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("feedbackRating.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams feedbackRatingLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("feedbackRating.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams feedbackRatingGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("feedbackRating.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams feedbackRatingLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("feedbackRating.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams feedbackRatingEquals(@jakarta.annotation.Nullable final Integer value) {
      put("feedbackRating.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams feedbackRatingNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("feedbackRating.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams feedbackRatingSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("feedbackRating.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams feedbackRatingIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("feedbackRating.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams feedbackRatingNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("feedbackRating.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams userIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("userId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams userIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("userId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams userIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("userId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams userIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("userId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams userIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("userId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams userIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("userId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams userIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("userId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams userIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("userId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams userIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("userId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripRecommendationsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams page(@jakarta.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams size(@jakarta.annotation.Nullable final Integer value) {
      put("size", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripRecommendationsQueryParams sort(@jakarta.annotation.Nullable final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return TripRecommendationDTO
   */
  @RequestLine("GET /api/trip-recommendations/{id}")
  @Headers({
    "Accept: */*",
  })
  TripRecommendationDTO getTripRecommendation(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getTripRecommendation</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/trip-recommendations/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<TripRecommendationDTO> getTripRecommendationWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param tripRecommendationDTO  (required)
   * @return TripRecommendationDTO
   */
  @RequestLine("PATCH /api/trip-recommendations/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TripRecommendationDTO partialUpdateTripRecommendation(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TripRecommendationDTO tripRecommendationDTO);

  /**
   * 
   * Similar to <code>partialUpdateTripRecommendation</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param tripRecommendationDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/trip-recommendations/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TripRecommendationDTO> partialUpdateTripRecommendationWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TripRecommendationDTO tripRecommendationDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param tripRecommendationDTO  (required)
   * @return TripRecommendationDTO
   */
  @RequestLine("PUT /api/trip-recommendations/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TripRecommendationDTO updateTripRecommendation(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TripRecommendationDTO tripRecommendationDTO);

  /**
   * 
   * Similar to <code>updateTripRecommendation</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param tripRecommendationDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/trip-recommendations/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TripRecommendationDTO> updateTripRecommendationWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TripRecommendationDTO tripRecommendationDTO);


}
