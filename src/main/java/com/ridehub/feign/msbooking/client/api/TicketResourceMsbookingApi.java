package com.ridehub.feign.msbooking.client.api;

import com.ridehub.feign.msbooking.client.invoker.ApiClient;
import com.ridehub.feign.msbooking.client.invoker.EncodingUtils;
import com.ridehub.feign.msbooking.client.model.ApiResponse;

import java.math.BigDecimal;
import com.ridehub.feign.msbooking.client.model.CheckinResponse;
import java.time.OffsetDateTime;
import com.ridehub.feign.msbooking.client.model.TicketCancelRequestDTO;
import com.ridehub.feign.msbooking.client.model.TicketDTO;
import com.ridehub.feign.msbooking.client.model.TicketExchangeRequestDTO;
import com.ridehub.feign.msbooking.client.model.TicketOperationResponseDTO;
import com.ridehub.feign.msbooking.client.model.TicketRefundRequestDTO;
import com.ridehub.feign.msbooking.client.model.TicketResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface TicketResourceMsbookingApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param code  (required)
   * @param ticketCancelRequestDTO  (required)
   * @return TicketOperationResponseDTO
   */
  @RequestLine("POST /api/tickets/{code}/cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TicketOperationResponseDTO cancelTicket(@Param("code") @jakarta.annotation.Nonnull String code, @jakarta.annotation.Nonnull TicketCancelRequestDTO ticketCancelRequestDTO);

  /**
   * 
   * Similar to <code>cancelTicket</code> but it also returns the http response headers .
   * 
   * @param code  (required)
   * @param ticketCancelRequestDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/tickets/{code}/cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TicketOperationResponseDTO> cancelTicketWithHttpInfo(@Param("code") @jakarta.annotation.Nonnull String code, @jakarta.annotation.Nonnull TicketCancelRequestDTO ticketCancelRequestDTO);



  /**
   * 
   * 
   * @param code  (required)
   * @return CheckinResponse
   */
  @RequestLine("POST /api/tickets/{code}/checkin")
  @Headers({
    "Accept: */*",
  })
  CheckinResponse checkinTicket(@Param("code") @jakarta.annotation.Nonnull String code);

  /**
   * 
   * Similar to <code>checkinTicket</code> but it also returns the http response headers .
   * 
   * @param code  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/tickets/{code}/checkin")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<CheckinResponse> checkinTicketWithHttpInfo(@Param("code") @jakarta.annotation.Nonnull String code);



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
   * @param ticketCodeContains  (optional)
   * @param ticketCodeDoesNotContain  (optional)
   * @param ticketCodeEquals  (optional)
   * @param ticketCodeNotEquals  (optional)
   * @param ticketCodeSpecified  (optional)
   * @param ticketCodeIn  (optional)
   * @param ticketCodeNotIn  (optional)
   * @param priceGreaterThan  (optional)
   * @param priceLessThan  (optional)
   * @param priceGreaterThanOrEqual  (optional)
   * @param priceLessThanOrEqual  (optional)
   * @param priceEquals  (optional)
   * @param priceNotEquals  (optional)
   * @param priceSpecified  (optional)
   * @param priceIn  (optional)
   * @param priceNotIn  (optional)
   * @param timeFromGreaterThan  (optional)
   * @param timeFromLessThan  (optional)
   * @param timeFromGreaterThanOrEqual  (optional)
   * @param timeFromLessThanOrEqual  (optional)
   * @param timeFromEquals  (optional)
   * @param timeFromNotEquals  (optional)
   * @param timeFromSpecified  (optional)
   * @param timeFromIn  (optional)
   * @param timeFromNotIn  (optional)
   * @param timeToGreaterThan  (optional)
   * @param timeToLessThan  (optional)
   * @param timeToGreaterThanOrEqual  (optional)
   * @param timeToLessThanOrEqual  (optional)
   * @param timeToEquals  (optional)
   * @param timeToNotEquals  (optional)
   * @param timeToSpecified  (optional)
   * @param timeToIn  (optional)
   * @param timeToNotIn  (optional)
   * @param checkedInEquals  (optional)
   * @param checkedInNotEquals  (optional)
   * @param checkedInSpecified  (optional)
   * @param checkedInIn  (optional)
   * @param checkedInNotIn  (optional)
   * @param statusEquals  (optional)
   * @param statusNotEquals  (optional)
   * @param statusSpecified  (optional)
   * @param statusIn  (optional)
   * @param statusNotIn  (optional)
   * @param refundStatusEquals  (optional)
   * @param refundStatusNotEquals  (optional)
   * @param refundStatusSpecified  (optional)
   * @param refundStatusIn  (optional)
   * @param refundStatusNotIn  (optional)
   * @param refundReasonContains  (optional)
   * @param refundReasonDoesNotContain  (optional)
   * @param refundReasonEquals  (optional)
   * @param refundReasonNotEquals  (optional)
   * @param refundReasonSpecified  (optional)
   * @param refundReasonIn  (optional)
   * @param refundReasonNotIn  (optional)
   * @param refundRequestedAtGreaterThan  (optional)
   * @param refundRequestedAtLessThan  (optional)
   * @param refundRequestedAtGreaterThanOrEqual  (optional)
   * @param refundRequestedAtLessThanOrEqual  (optional)
   * @param refundRequestedAtEquals  (optional)
   * @param refundRequestedAtNotEquals  (optional)
   * @param refundRequestedAtSpecified  (optional)
   * @param refundRequestedAtIn  (optional)
   * @param refundRequestedAtNotIn  (optional)
   * @param refundCompletedAtGreaterThan  (optional)
   * @param refundCompletedAtLessThan  (optional)
   * @param refundCompletedAtGreaterThanOrEqual  (optional)
   * @param refundCompletedAtLessThanOrEqual  (optional)
   * @param refundCompletedAtEquals  (optional)
   * @param refundCompletedAtNotEquals  (optional)
   * @param refundCompletedAtSpecified  (optional)
   * @param refundCompletedAtIn  (optional)
   * @param refundCompletedAtNotIn  (optional)
   * @param refundAmountGreaterThan  (optional)
   * @param refundAmountLessThan  (optional)
   * @param refundAmountGreaterThanOrEqual  (optional)
   * @param refundAmountLessThanOrEqual  (optional)
   * @param refundAmountEquals  (optional)
   * @param refundAmountNotEquals  (optional)
   * @param refundAmountSpecified  (optional)
   * @param refundAmountIn  (optional)
   * @param refundAmountNotIn  (optional)
   * @param refundTransactionIdContains  (optional)
   * @param refundTransactionIdDoesNotContain  (optional)
   * @param refundTransactionIdEquals  (optional)
   * @param refundTransactionIdNotEquals  (optional)
   * @param refundTransactionIdSpecified  (optional)
   * @param refundTransactionIdIn  (optional)
   * @param refundTransactionIdNotIn  (optional)
   * @param tripIdGreaterThan  (optional)
   * @param tripIdLessThan  (optional)
   * @param tripIdGreaterThanOrEqual  (optional)
   * @param tripIdLessThanOrEqual  (optional)
   * @param tripIdEquals  (optional)
   * @param tripIdNotEquals  (optional)
   * @param tripIdSpecified  (optional)
   * @param tripIdIn  (optional)
   * @param tripIdNotIn  (optional)
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param seatIdGreaterThan  (optional)
   * @param seatIdLessThan  (optional)
   * @param seatIdGreaterThanOrEqual  (optional)
   * @param seatIdLessThanOrEqual  (optional)
   * @param seatIdEquals  (optional)
   * @param seatIdNotEquals  (optional)
   * @param seatIdSpecified  (optional)
   * @param seatIdIn  (optional)
   * @param seatIdNotIn  (optional)
   * @param createdAtGreaterThan  (optional)
   * @param createdAtLessThan  (optional)
   * @param createdAtGreaterThanOrEqual  (optional)
   * @param createdAtLessThanOrEqual  (optional)
   * @param createdAtEquals  (optional)
   * @param createdAtNotEquals  (optional)
   * @param createdAtSpecified  (optional)
   * @param createdAtIn  (optional)
   * @param createdAtNotIn  (optional)
   * @param isDeletedEquals  (optional)
   * @param isDeletedNotEquals  (optional)
   * @param isDeletedSpecified  (optional)
   * @param isDeletedIn  (optional)
   * @param isDeletedNotIn  (optional)
   * @param deletedByEquals  (optional)
   * @param deletedByNotEquals  (optional)
   * @param deletedBySpecified  (optional)
   * @param deletedByIn  (optional)
   * @param deletedByNotIn  (optional)
   * @param originalTicketIdGreaterThan  (optional)
   * @param originalTicketIdLessThan  (optional)
   * @param originalTicketIdGreaterThanOrEqual  (optional)
   * @param originalTicketIdLessThanOrEqual  (optional)
   * @param originalTicketIdEquals  (optional)
   * @param originalTicketIdNotEquals  (optional)
   * @param originalTicketIdSpecified  (optional)
   * @param originalTicketIdIn  (optional)
   * @param originalTicketIdNotIn  (optional)
   * @param exchangedTicketIdGreaterThan  (optional)
   * @param exchangedTicketIdLessThan  (optional)
   * @param exchangedTicketIdGreaterThanOrEqual  (optional)
   * @param exchangedTicketIdLessThanOrEqual  (optional)
   * @param exchangedTicketIdEquals  (optional)
   * @param exchangedTicketIdNotEquals  (optional)
   * @param exchangedTicketIdSpecified  (optional)
   * @param exchangedTicketIdIn  (optional)
   * @param exchangedTicketIdNotIn  (optional)
   * @param bookingIdGreaterThan  (optional)
   * @param bookingIdLessThan  (optional)
   * @param bookingIdGreaterThanOrEqual  (optional)
   * @param bookingIdLessThanOrEqual  (optional)
   * @param bookingIdEquals  (optional)
   * @param bookingIdNotEquals  (optional)
   * @param bookingIdSpecified  (optional)
   * @param bookingIdIn  (optional)
   * @param bookingIdNotIn  (optional)
   * @param exchangedFromIdGreaterThan  (optional)
   * @param exchangedFromIdLessThan  (optional)
   * @param exchangedFromIdGreaterThanOrEqual  (optional)
   * @param exchangedFromIdLessThanOrEqual  (optional)
   * @param exchangedFromIdEquals  (optional)
   * @param exchangedFromIdNotEquals  (optional)
   * @param exchangedFromIdSpecified  (optional)
   * @param exchangedFromIdIn  (optional)
   * @param exchangedFromIdNotIn  (optional)
   * @param exchangedToIdGreaterThan  (optional)
   * @param exchangedToIdLessThan  (optional)
   * @param exchangedToIdGreaterThanOrEqual  (optional)
   * @param exchangedToIdLessThanOrEqual  (optional)
   * @param exchangedToIdEquals  (optional)
   * @param exchangedToIdNotEquals  (optional)
   * @param exchangedToIdSpecified  (optional)
   * @param exchangedToIdIn  (optional)
   * @param exchangedToIdNotIn  (optional)
   * @param distinct  (optional)
   * @return Long
   */
  @RequestLine("GET /api/tickets/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&ticketCode.contains={ticketCodeContains}&ticketCode.doesNotContain={ticketCodeDoesNotContain}&ticketCode.equals={ticketCodeEquals}&ticketCode.notEquals={ticketCodeNotEquals}&ticketCode.specified={ticketCodeSpecified}&ticketCode.in={ticketCodeIn}&ticketCode.notIn={ticketCodeNotIn}&price.greaterThan={priceGreaterThan}&price.lessThan={priceLessThan}&price.greaterThanOrEqual={priceGreaterThanOrEqual}&price.lessThanOrEqual={priceLessThanOrEqual}&price.equals={priceEquals}&price.notEquals={priceNotEquals}&price.specified={priceSpecified}&price.in={priceIn}&price.notIn={priceNotIn}&timeFrom.greaterThan={timeFromGreaterThan}&timeFrom.lessThan={timeFromLessThan}&timeFrom.greaterThanOrEqual={timeFromGreaterThanOrEqual}&timeFrom.lessThanOrEqual={timeFromLessThanOrEqual}&timeFrom.equals={timeFromEquals}&timeFrom.notEquals={timeFromNotEquals}&timeFrom.specified={timeFromSpecified}&timeFrom.in={timeFromIn}&timeFrom.notIn={timeFromNotIn}&timeTo.greaterThan={timeToGreaterThan}&timeTo.lessThan={timeToLessThan}&timeTo.greaterThanOrEqual={timeToGreaterThanOrEqual}&timeTo.lessThanOrEqual={timeToLessThanOrEqual}&timeTo.equals={timeToEquals}&timeTo.notEquals={timeToNotEquals}&timeTo.specified={timeToSpecified}&timeTo.in={timeToIn}&timeTo.notIn={timeToNotIn}&checkedIn.equals={checkedInEquals}&checkedIn.notEquals={checkedInNotEquals}&checkedIn.specified={checkedInSpecified}&checkedIn.in={checkedInIn}&checkedIn.notIn={checkedInNotIn}&status.equals={statusEquals}&status.notEquals={statusNotEquals}&status.specified={statusSpecified}&status.in={statusIn}&status.notIn={statusNotIn}&refundStatus.equals={refundStatusEquals}&refundStatus.notEquals={refundStatusNotEquals}&refundStatus.specified={refundStatusSpecified}&refundStatus.in={refundStatusIn}&refundStatus.notIn={refundStatusNotIn}&refundReason.contains={refundReasonContains}&refundReason.doesNotContain={refundReasonDoesNotContain}&refundReason.equals={refundReasonEquals}&refundReason.notEquals={refundReasonNotEquals}&refundReason.specified={refundReasonSpecified}&refundReason.in={refundReasonIn}&refundReason.notIn={refundReasonNotIn}&refundRequestedAt.greaterThan={refundRequestedAtGreaterThan}&refundRequestedAt.lessThan={refundRequestedAtLessThan}&refundRequestedAt.greaterThanOrEqual={refundRequestedAtGreaterThanOrEqual}&refundRequestedAt.lessThanOrEqual={refundRequestedAtLessThanOrEqual}&refundRequestedAt.equals={refundRequestedAtEquals}&refundRequestedAt.notEquals={refundRequestedAtNotEquals}&refundRequestedAt.specified={refundRequestedAtSpecified}&refundRequestedAt.in={refundRequestedAtIn}&refundRequestedAt.notIn={refundRequestedAtNotIn}&refundCompletedAt.greaterThan={refundCompletedAtGreaterThan}&refundCompletedAt.lessThan={refundCompletedAtLessThan}&refundCompletedAt.greaterThanOrEqual={refundCompletedAtGreaterThanOrEqual}&refundCompletedAt.lessThanOrEqual={refundCompletedAtLessThanOrEqual}&refundCompletedAt.equals={refundCompletedAtEquals}&refundCompletedAt.notEquals={refundCompletedAtNotEquals}&refundCompletedAt.specified={refundCompletedAtSpecified}&refundCompletedAt.in={refundCompletedAtIn}&refundCompletedAt.notIn={refundCompletedAtNotIn}&refundAmount.greaterThan={refundAmountGreaterThan}&refundAmount.lessThan={refundAmountLessThan}&refundAmount.greaterThanOrEqual={refundAmountGreaterThanOrEqual}&refundAmount.lessThanOrEqual={refundAmountLessThanOrEqual}&refundAmount.equals={refundAmountEquals}&refundAmount.notEquals={refundAmountNotEquals}&refundAmount.specified={refundAmountSpecified}&refundAmount.in={refundAmountIn}&refundAmount.notIn={refundAmountNotIn}&refundTransactionId.contains={refundTransactionIdContains}&refundTransactionId.doesNotContain={refundTransactionIdDoesNotContain}&refundTransactionId.equals={refundTransactionIdEquals}&refundTransactionId.notEquals={refundTransactionIdNotEquals}&refundTransactionId.specified={refundTransactionIdSpecified}&refundTransactionId.in={refundTransactionIdIn}&refundTransactionId.notIn={refundTransactionIdNotIn}&tripId.greaterThan={tripIdGreaterThan}&tripId.lessThan={tripIdLessThan}&tripId.greaterThanOrEqual={tripIdGreaterThanOrEqual}&tripId.lessThanOrEqual={tripIdLessThanOrEqual}&tripId.equals={tripIdEquals}&tripId.notEquals={tripIdNotEquals}&tripId.specified={tripIdSpecified}&tripId.in={tripIdIn}&tripId.notIn={tripIdNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&seatId.greaterThan={seatIdGreaterThan}&seatId.lessThan={seatIdLessThan}&seatId.greaterThanOrEqual={seatIdGreaterThanOrEqual}&seatId.lessThanOrEqual={seatIdLessThanOrEqual}&seatId.equals={seatIdEquals}&seatId.notEquals={seatIdNotEquals}&seatId.specified={seatIdSpecified}&seatId.in={seatIdIn}&seatId.notIn={seatIdNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&originalTicketId.greaterThan={originalTicketIdGreaterThan}&originalTicketId.lessThan={originalTicketIdLessThan}&originalTicketId.greaterThanOrEqual={originalTicketIdGreaterThanOrEqual}&originalTicketId.lessThanOrEqual={originalTicketIdLessThanOrEqual}&originalTicketId.equals={originalTicketIdEquals}&originalTicketId.notEquals={originalTicketIdNotEquals}&originalTicketId.specified={originalTicketIdSpecified}&originalTicketId.in={originalTicketIdIn}&originalTicketId.notIn={originalTicketIdNotIn}&exchangedTicketId.greaterThan={exchangedTicketIdGreaterThan}&exchangedTicketId.lessThan={exchangedTicketIdLessThan}&exchangedTicketId.greaterThanOrEqual={exchangedTicketIdGreaterThanOrEqual}&exchangedTicketId.lessThanOrEqual={exchangedTicketIdLessThanOrEqual}&exchangedTicketId.equals={exchangedTicketIdEquals}&exchangedTicketId.notEquals={exchangedTicketIdNotEquals}&exchangedTicketId.specified={exchangedTicketIdSpecified}&exchangedTicketId.in={exchangedTicketIdIn}&exchangedTicketId.notIn={exchangedTicketIdNotIn}&bookingId.greaterThan={bookingIdGreaterThan}&bookingId.lessThan={bookingIdLessThan}&bookingId.greaterThanOrEqual={bookingIdGreaterThanOrEqual}&bookingId.lessThanOrEqual={bookingIdLessThanOrEqual}&bookingId.equals={bookingIdEquals}&bookingId.notEquals={bookingIdNotEquals}&bookingId.specified={bookingIdSpecified}&bookingId.in={bookingIdIn}&bookingId.notIn={bookingIdNotIn}&exchangedFromId.greaterThan={exchangedFromIdGreaterThan}&exchangedFromId.lessThan={exchangedFromIdLessThan}&exchangedFromId.greaterThanOrEqual={exchangedFromIdGreaterThanOrEqual}&exchangedFromId.lessThanOrEqual={exchangedFromIdLessThanOrEqual}&exchangedFromId.equals={exchangedFromIdEquals}&exchangedFromId.notEquals={exchangedFromIdNotEquals}&exchangedFromId.specified={exchangedFromIdSpecified}&exchangedFromId.in={exchangedFromIdIn}&exchangedFromId.notIn={exchangedFromIdNotIn}&exchangedToId.greaterThan={exchangedToIdGreaterThan}&exchangedToId.lessThan={exchangedToIdLessThan}&exchangedToId.greaterThanOrEqual={exchangedToIdGreaterThanOrEqual}&exchangedToId.lessThanOrEqual={exchangedToIdLessThanOrEqual}&exchangedToId.equals={exchangedToIdEquals}&exchangedToId.notEquals={exchangedToIdNotEquals}&exchangedToId.specified={exchangedToIdSpecified}&exchangedToId.in={exchangedToIdIn}&exchangedToId.notIn={exchangedToIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countTickets(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("ticketCodeContains") @jakarta.annotation.Nullable String ticketCodeContains, @Param("ticketCodeDoesNotContain") @jakarta.annotation.Nullable String ticketCodeDoesNotContain, @Param("ticketCodeEquals") @jakarta.annotation.Nullable String ticketCodeEquals, @Param("ticketCodeNotEquals") @jakarta.annotation.Nullable String ticketCodeNotEquals, @Param("ticketCodeSpecified") @jakarta.annotation.Nullable Boolean ticketCodeSpecified, @Param("ticketCodeIn") @jakarta.annotation.Nullable List<String> ticketCodeIn, @Param("ticketCodeNotIn") @jakarta.annotation.Nullable List<String> ticketCodeNotIn, @Param("priceGreaterThan") @jakarta.annotation.Nullable BigDecimal priceGreaterThan, @Param("priceLessThan") @jakarta.annotation.Nullable BigDecimal priceLessThan, @Param("priceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal priceGreaterThanOrEqual, @Param("priceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal priceLessThanOrEqual, @Param("priceEquals") @jakarta.annotation.Nullable BigDecimal priceEquals, @Param("priceNotEquals") @jakarta.annotation.Nullable BigDecimal priceNotEquals, @Param("priceSpecified") @jakarta.annotation.Nullable Boolean priceSpecified, @Param("priceIn") @jakarta.annotation.Nullable List<BigDecimal> priceIn, @Param("priceNotIn") @jakarta.annotation.Nullable List<BigDecimal> priceNotIn, @Param("timeFromGreaterThan") @jakarta.annotation.Nullable OffsetDateTime timeFromGreaterThan, @Param("timeFromLessThan") @jakarta.annotation.Nullable OffsetDateTime timeFromLessThan, @Param("timeFromGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timeFromGreaterThanOrEqual, @Param("timeFromLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timeFromLessThanOrEqual, @Param("timeFromEquals") @jakarta.annotation.Nullable OffsetDateTime timeFromEquals, @Param("timeFromNotEquals") @jakarta.annotation.Nullable OffsetDateTime timeFromNotEquals, @Param("timeFromSpecified") @jakarta.annotation.Nullable Boolean timeFromSpecified, @Param("timeFromIn") @jakarta.annotation.Nullable List<OffsetDateTime> timeFromIn, @Param("timeFromNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> timeFromNotIn, @Param("timeToGreaterThan") @jakarta.annotation.Nullable OffsetDateTime timeToGreaterThan, @Param("timeToLessThan") @jakarta.annotation.Nullable OffsetDateTime timeToLessThan, @Param("timeToGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timeToGreaterThanOrEqual, @Param("timeToLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timeToLessThanOrEqual, @Param("timeToEquals") @jakarta.annotation.Nullable OffsetDateTime timeToEquals, @Param("timeToNotEquals") @jakarta.annotation.Nullable OffsetDateTime timeToNotEquals, @Param("timeToSpecified") @jakarta.annotation.Nullable Boolean timeToSpecified, @Param("timeToIn") @jakarta.annotation.Nullable List<OffsetDateTime> timeToIn, @Param("timeToNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> timeToNotIn, @Param("checkedInEquals") @jakarta.annotation.Nullable Boolean checkedInEquals, @Param("checkedInNotEquals") @jakarta.annotation.Nullable Boolean checkedInNotEquals, @Param("checkedInSpecified") @jakarta.annotation.Nullable Boolean checkedInSpecified, @Param("checkedInIn") @jakarta.annotation.Nullable List<Boolean> checkedInIn, @Param("checkedInNotIn") @jakarta.annotation.Nullable List<Boolean> checkedInNotIn, @Param("statusEquals") @jakarta.annotation.Nullable String statusEquals, @Param("statusNotEquals") @jakarta.annotation.Nullable String statusNotEquals, @Param("statusSpecified") @jakarta.annotation.Nullable Boolean statusSpecified, @Param("statusIn") @jakarta.annotation.Nullable List<String> statusIn, @Param("statusNotIn") @jakarta.annotation.Nullable List<String> statusNotIn, @Param("refundStatusEquals") @jakarta.annotation.Nullable String refundStatusEquals, @Param("refundStatusNotEquals") @jakarta.annotation.Nullable String refundStatusNotEquals, @Param("refundStatusSpecified") @jakarta.annotation.Nullable Boolean refundStatusSpecified, @Param("refundStatusIn") @jakarta.annotation.Nullable List<String> refundStatusIn, @Param("refundStatusNotIn") @jakarta.annotation.Nullable List<String> refundStatusNotIn, @Param("refundReasonContains") @jakarta.annotation.Nullable String refundReasonContains, @Param("refundReasonDoesNotContain") @jakarta.annotation.Nullable String refundReasonDoesNotContain, @Param("refundReasonEquals") @jakarta.annotation.Nullable String refundReasonEquals, @Param("refundReasonNotEquals") @jakarta.annotation.Nullable String refundReasonNotEquals, @Param("refundReasonSpecified") @jakarta.annotation.Nullable Boolean refundReasonSpecified, @Param("refundReasonIn") @jakarta.annotation.Nullable List<String> refundReasonIn, @Param("refundReasonNotIn") @jakarta.annotation.Nullable List<String> refundReasonNotIn, @Param("refundRequestedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtGreaterThan, @Param("refundRequestedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtLessThan, @Param("refundRequestedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtGreaterThanOrEqual, @Param("refundRequestedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtLessThanOrEqual, @Param("refundRequestedAtEquals") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtEquals, @Param("refundRequestedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtNotEquals, @Param("refundRequestedAtSpecified") @jakarta.annotation.Nullable Boolean refundRequestedAtSpecified, @Param("refundRequestedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> refundRequestedAtIn, @Param("refundRequestedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> refundRequestedAtNotIn, @Param("refundCompletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtGreaterThan, @Param("refundCompletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtLessThan, @Param("refundCompletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtGreaterThanOrEqual, @Param("refundCompletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtLessThanOrEqual, @Param("refundCompletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtEquals, @Param("refundCompletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtNotEquals, @Param("refundCompletedAtSpecified") @jakarta.annotation.Nullable Boolean refundCompletedAtSpecified, @Param("refundCompletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> refundCompletedAtIn, @Param("refundCompletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> refundCompletedAtNotIn, @Param("refundAmountGreaterThan") @jakarta.annotation.Nullable BigDecimal refundAmountGreaterThan, @Param("refundAmountLessThan") @jakarta.annotation.Nullable BigDecimal refundAmountLessThan, @Param("refundAmountGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal refundAmountGreaterThanOrEqual, @Param("refundAmountLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal refundAmountLessThanOrEqual, @Param("refundAmountEquals") @jakarta.annotation.Nullable BigDecimal refundAmountEquals, @Param("refundAmountNotEquals") @jakarta.annotation.Nullable BigDecimal refundAmountNotEquals, @Param("refundAmountSpecified") @jakarta.annotation.Nullable Boolean refundAmountSpecified, @Param("refundAmountIn") @jakarta.annotation.Nullable List<BigDecimal> refundAmountIn, @Param("refundAmountNotIn") @jakarta.annotation.Nullable List<BigDecimal> refundAmountNotIn, @Param("refundTransactionIdContains") @jakarta.annotation.Nullable String refundTransactionIdContains, @Param("refundTransactionIdDoesNotContain") @jakarta.annotation.Nullable String refundTransactionIdDoesNotContain, @Param("refundTransactionIdEquals") @jakarta.annotation.Nullable String refundTransactionIdEquals, @Param("refundTransactionIdNotEquals") @jakarta.annotation.Nullable String refundTransactionIdNotEquals, @Param("refundTransactionIdSpecified") @jakarta.annotation.Nullable Boolean refundTransactionIdSpecified, @Param("refundTransactionIdIn") @jakarta.annotation.Nullable List<String> refundTransactionIdIn, @Param("refundTransactionIdNotIn") @jakarta.annotation.Nullable List<String> refundTransactionIdNotIn, @Param("tripIdGreaterThan") @jakarta.annotation.Nullable Long tripIdGreaterThan, @Param("tripIdLessThan") @jakarta.annotation.Nullable Long tripIdLessThan, @Param("tripIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long tripIdGreaterThanOrEqual, @Param("tripIdLessThanOrEqual") @jakarta.annotation.Nullable Long tripIdLessThanOrEqual, @Param("tripIdEquals") @jakarta.annotation.Nullable Long tripIdEquals, @Param("tripIdNotEquals") @jakarta.annotation.Nullable Long tripIdNotEquals, @Param("tripIdSpecified") @jakarta.annotation.Nullable Boolean tripIdSpecified, @Param("tripIdIn") @jakarta.annotation.Nullable List<Long> tripIdIn, @Param("tripIdNotIn") @jakarta.annotation.Nullable List<Long> tripIdNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("seatIdGreaterThan") @jakarta.annotation.Nullable Long seatIdGreaterThan, @Param("seatIdLessThan") @jakarta.annotation.Nullable Long seatIdLessThan, @Param("seatIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long seatIdGreaterThanOrEqual, @Param("seatIdLessThanOrEqual") @jakarta.annotation.Nullable Long seatIdLessThanOrEqual, @Param("seatIdEquals") @jakarta.annotation.Nullable Long seatIdEquals, @Param("seatIdNotEquals") @jakarta.annotation.Nullable Long seatIdNotEquals, @Param("seatIdSpecified") @jakarta.annotation.Nullable Boolean seatIdSpecified, @Param("seatIdIn") @jakarta.annotation.Nullable List<Long> seatIdIn, @Param("seatIdNotIn") @jakarta.annotation.Nullable List<Long> seatIdNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("originalTicketIdGreaterThan") @jakarta.annotation.Nullable Long originalTicketIdGreaterThan, @Param("originalTicketIdLessThan") @jakarta.annotation.Nullable Long originalTicketIdLessThan, @Param("originalTicketIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long originalTicketIdGreaterThanOrEqual, @Param("originalTicketIdLessThanOrEqual") @jakarta.annotation.Nullable Long originalTicketIdLessThanOrEqual, @Param("originalTicketIdEquals") @jakarta.annotation.Nullable Long originalTicketIdEquals, @Param("originalTicketIdNotEquals") @jakarta.annotation.Nullable Long originalTicketIdNotEquals, @Param("originalTicketIdSpecified") @jakarta.annotation.Nullable Boolean originalTicketIdSpecified, @Param("originalTicketIdIn") @jakarta.annotation.Nullable List<Long> originalTicketIdIn, @Param("originalTicketIdNotIn") @jakarta.annotation.Nullable List<Long> originalTicketIdNotIn, @Param("exchangedTicketIdGreaterThan") @jakarta.annotation.Nullable Long exchangedTicketIdGreaterThan, @Param("exchangedTicketIdLessThan") @jakarta.annotation.Nullable Long exchangedTicketIdLessThan, @Param("exchangedTicketIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long exchangedTicketIdGreaterThanOrEqual, @Param("exchangedTicketIdLessThanOrEqual") @jakarta.annotation.Nullable Long exchangedTicketIdLessThanOrEqual, @Param("exchangedTicketIdEquals") @jakarta.annotation.Nullable Long exchangedTicketIdEquals, @Param("exchangedTicketIdNotEquals") @jakarta.annotation.Nullable Long exchangedTicketIdNotEquals, @Param("exchangedTicketIdSpecified") @jakarta.annotation.Nullable Boolean exchangedTicketIdSpecified, @Param("exchangedTicketIdIn") @jakarta.annotation.Nullable List<Long> exchangedTicketIdIn, @Param("exchangedTicketIdNotIn") @jakarta.annotation.Nullable List<Long> exchangedTicketIdNotIn, @Param("bookingIdGreaterThan") @jakarta.annotation.Nullable Long bookingIdGreaterThan, @Param("bookingIdLessThan") @jakarta.annotation.Nullable Long bookingIdLessThan, @Param("bookingIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long bookingIdGreaterThanOrEqual, @Param("bookingIdLessThanOrEqual") @jakarta.annotation.Nullable Long bookingIdLessThanOrEqual, @Param("bookingIdEquals") @jakarta.annotation.Nullable Long bookingIdEquals, @Param("bookingIdNotEquals") @jakarta.annotation.Nullable Long bookingIdNotEquals, @Param("bookingIdSpecified") @jakarta.annotation.Nullable Boolean bookingIdSpecified, @Param("bookingIdIn") @jakarta.annotation.Nullable List<Long> bookingIdIn, @Param("bookingIdNotIn") @jakarta.annotation.Nullable List<Long> bookingIdNotIn, @Param("exchangedFromIdGreaterThan") @jakarta.annotation.Nullable Long exchangedFromIdGreaterThan, @Param("exchangedFromIdLessThan") @jakarta.annotation.Nullable Long exchangedFromIdLessThan, @Param("exchangedFromIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long exchangedFromIdGreaterThanOrEqual, @Param("exchangedFromIdLessThanOrEqual") @jakarta.annotation.Nullable Long exchangedFromIdLessThanOrEqual, @Param("exchangedFromIdEquals") @jakarta.annotation.Nullable Long exchangedFromIdEquals, @Param("exchangedFromIdNotEquals") @jakarta.annotation.Nullable Long exchangedFromIdNotEquals, @Param("exchangedFromIdSpecified") @jakarta.annotation.Nullable Boolean exchangedFromIdSpecified, @Param("exchangedFromIdIn") @jakarta.annotation.Nullable List<Long> exchangedFromIdIn, @Param("exchangedFromIdNotIn") @jakarta.annotation.Nullable List<Long> exchangedFromIdNotIn, @Param("exchangedToIdGreaterThan") @jakarta.annotation.Nullable Long exchangedToIdGreaterThan, @Param("exchangedToIdLessThan") @jakarta.annotation.Nullable Long exchangedToIdLessThan, @Param("exchangedToIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long exchangedToIdGreaterThanOrEqual, @Param("exchangedToIdLessThanOrEqual") @jakarta.annotation.Nullable Long exchangedToIdLessThanOrEqual, @Param("exchangedToIdEquals") @jakarta.annotation.Nullable Long exchangedToIdEquals, @Param("exchangedToIdNotEquals") @jakarta.annotation.Nullable Long exchangedToIdNotEquals, @Param("exchangedToIdSpecified") @jakarta.annotation.Nullable Boolean exchangedToIdSpecified, @Param("exchangedToIdIn") @jakarta.annotation.Nullable List<Long> exchangedToIdIn, @Param("exchangedToIdNotIn") @jakarta.annotation.Nullable List<Long> exchangedToIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countTickets</code> but it also returns the http response headers .
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
   * @param ticketCodeContains  (optional)
   * @param ticketCodeDoesNotContain  (optional)
   * @param ticketCodeEquals  (optional)
   * @param ticketCodeNotEquals  (optional)
   * @param ticketCodeSpecified  (optional)
   * @param ticketCodeIn  (optional)
   * @param ticketCodeNotIn  (optional)
   * @param priceGreaterThan  (optional)
   * @param priceLessThan  (optional)
   * @param priceGreaterThanOrEqual  (optional)
   * @param priceLessThanOrEqual  (optional)
   * @param priceEquals  (optional)
   * @param priceNotEquals  (optional)
   * @param priceSpecified  (optional)
   * @param priceIn  (optional)
   * @param priceNotIn  (optional)
   * @param timeFromGreaterThan  (optional)
   * @param timeFromLessThan  (optional)
   * @param timeFromGreaterThanOrEqual  (optional)
   * @param timeFromLessThanOrEqual  (optional)
   * @param timeFromEquals  (optional)
   * @param timeFromNotEquals  (optional)
   * @param timeFromSpecified  (optional)
   * @param timeFromIn  (optional)
   * @param timeFromNotIn  (optional)
   * @param timeToGreaterThan  (optional)
   * @param timeToLessThan  (optional)
   * @param timeToGreaterThanOrEqual  (optional)
   * @param timeToLessThanOrEqual  (optional)
   * @param timeToEquals  (optional)
   * @param timeToNotEquals  (optional)
   * @param timeToSpecified  (optional)
   * @param timeToIn  (optional)
   * @param timeToNotIn  (optional)
   * @param checkedInEquals  (optional)
   * @param checkedInNotEquals  (optional)
   * @param checkedInSpecified  (optional)
   * @param checkedInIn  (optional)
   * @param checkedInNotIn  (optional)
   * @param statusEquals  (optional)
   * @param statusNotEquals  (optional)
   * @param statusSpecified  (optional)
   * @param statusIn  (optional)
   * @param statusNotIn  (optional)
   * @param refundStatusEquals  (optional)
   * @param refundStatusNotEquals  (optional)
   * @param refundStatusSpecified  (optional)
   * @param refundStatusIn  (optional)
   * @param refundStatusNotIn  (optional)
   * @param refundReasonContains  (optional)
   * @param refundReasonDoesNotContain  (optional)
   * @param refundReasonEquals  (optional)
   * @param refundReasonNotEquals  (optional)
   * @param refundReasonSpecified  (optional)
   * @param refundReasonIn  (optional)
   * @param refundReasonNotIn  (optional)
   * @param refundRequestedAtGreaterThan  (optional)
   * @param refundRequestedAtLessThan  (optional)
   * @param refundRequestedAtGreaterThanOrEqual  (optional)
   * @param refundRequestedAtLessThanOrEqual  (optional)
   * @param refundRequestedAtEquals  (optional)
   * @param refundRequestedAtNotEquals  (optional)
   * @param refundRequestedAtSpecified  (optional)
   * @param refundRequestedAtIn  (optional)
   * @param refundRequestedAtNotIn  (optional)
   * @param refundCompletedAtGreaterThan  (optional)
   * @param refundCompletedAtLessThan  (optional)
   * @param refundCompletedAtGreaterThanOrEqual  (optional)
   * @param refundCompletedAtLessThanOrEqual  (optional)
   * @param refundCompletedAtEquals  (optional)
   * @param refundCompletedAtNotEquals  (optional)
   * @param refundCompletedAtSpecified  (optional)
   * @param refundCompletedAtIn  (optional)
   * @param refundCompletedAtNotIn  (optional)
   * @param refundAmountGreaterThan  (optional)
   * @param refundAmountLessThan  (optional)
   * @param refundAmountGreaterThanOrEqual  (optional)
   * @param refundAmountLessThanOrEqual  (optional)
   * @param refundAmountEquals  (optional)
   * @param refundAmountNotEquals  (optional)
   * @param refundAmountSpecified  (optional)
   * @param refundAmountIn  (optional)
   * @param refundAmountNotIn  (optional)
   * @param refundTransactionIdContains  (optional)
   * @param refundTransactionIdDoesNotContain  (optional)
   * @param refundTransactionIdEquals  (optional)
   * @param refundTransactionIdNotEquals  (optional)
   * @param refundTransactionIdSpecified  (optional)
   * @param refundTransactionIdIn  (optional)
   * @param refundTransactionIdNotIn  (optional)
   * @param tripIdGreaterThan  (optional)
   * @param tripIdLessThan  (optional)
   * @param tripIdGreaterThanOrEqual  (optional)
   * @param tripIdLessThanOrEqual  (optional)
   * @param tripIdEquals  (optional)
   * @param tripIdNotEquals  (optional)
   * @param tripIdSpecified  (optional)
   * @param tripIdIn  (optional)
   * @param tripIdNotIn  (optional)
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param seatIdGreaterThan  (optional)
   * @param seatIdLessThan  (optional)
   * @param seatIdGreaterThanOrEqual  (optional)
   * @param seatIdLessThanOrEqual  (optional)
   * @param seatIdEquals  (optional)
   * @param seatIdNotEquals  (optional)
   * @param seatIdSpecified  (optional)
   * @param seatIdIn  (optional)
   * @param seatIdNotIn  (optional)
   * @param createdAtGreaterThan  (optional)
   * @param createdAtLessThan  (optional)
   * @param createdAtGreaterThanOrEqual  (optional)
   * @param createdAtLessThanOrEqual  (optional)
   * @param createdAtEquals  (optional)
   * @param createdAtNotEquals  (optional)
   * @param createdAtSpecified  (optional)
   * @param createdAtIn  (optional)
   * @param createdAtNotIn  (optional)
   * @param isDeletedEquals  (optional)
   * @param isDeletedNotEquals  (optional)
   * @param isDeletedSpecified  (optional)
   * @param isDeletedIn  (optional)
   * @param isDeletedNotIn  (optional)
   * @param deletedByEquals  (optional)
   * @param deletedByNotEquals  (optional)
   * @param deletedBySpecified  (optional)
   * @param deletedByIn  (optional)
   * @param deletedByNotIn  (optional)
   * @param originalTicketIdGreaterThan  (optional)
   * @param originalTicketIdLessThan  (optional)
   * @param originalTicketIdGreaterThanOrEqual  (optional)
   * @param originalTicketIdLessThanOrEqual  (optional)
   * @param originalTicketIdEquals  (optional)
   * @param originalTicketIdNotEquals  (optional)
   * @param originalTicketIdSpecified  (optional)
   * @param originalTicketIdIn  (optional)
   * @param originalTicketIdNotIn  (optional)
   * @param exchangedTicketIdGreaterThan  (optional)
   * @param exchangedTicketIdLessThan  (optional)
   * @param exchangedTicketIdGreaterThanOrEqual  (optional)
   * @param exchangedTicketIdLessThanOrEqual  (optional)
   * @param exchangedTicketIdEquals  (optional)
   * @param exchangedTicketIdNotEquals  (optional)
   * @param exchangedTicketIdSpecified  (optional)
   * @param exchangedTicketIdIn  (optional)
   * @param exchangedTicketIdNotIn  (optional)
   * @param bookingIdGreaterThan  (optional)
   * @param bookingIdLessThan  (optional)
   * @param bookingIdGreaterThanOrEqual  (optional)
   * @param bookingIdLessThanOrEqual  (optional)
   * @param bookingIdEquals  (optional)
   * @param bookingIdNotEquals  (optional)
   * @param bookingIdSpecified  (optional)
   * @param bookingIdIn  (optional)
   * @param bookingIdNotIn  (optional)
   * @param exchangedFromIdGreaterThan  (optional)
   * @param exchangedFromIdLessThan  (optional)
   * @param exchangedFromIdGreaterThanOrEqual  (optional)
   * @param exchangedFromIdLessThanOrEqual  (optional)
   * @param exchangedFromIdEquals  (optional)
   * @param exchangedFromIdNotEquals  (optional)
   * @param exchangedFromIdSpecified  (optional)
   * @param exchangedFromIdIn  (optional)
   * @param exchangedFromIdNotIn  (optional)
   * @param exchangedToIdGreaterThan  (optional)
   * @param exchangedToIdLessThan  (optional)
   * @param exchangedToIdGreaterThanOrEqual  (optional)
   * @param exchangedToIdLessThanOrEqual  (optional)
   * @param exchangedToIdEquals  (optional)
   * @param exchangedToIdNotEquals  (optional)
   * @param exchangedToIdSpecified  (optional)
   * @param exchangedToIdIn  (optional)
   * @param exchangedToIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/tickets/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&ticketCode.contains={ticketCodeContains}&ticketCode.doesNotContain={ticketCodeDoesNotContain}&ticketCode.equals={ticketCodeEquals}&ticketCode.notEquals={ticketCodeNotEquals}&ticketCode.specified={ticketCodeSpecified}&ticketCode.in={ticketCodeIn}&ticketCode.notIn={ticketCodeNotIn}&price.greaterThan={priceGreaterThan}&price.lessThan={priceLessThan}&price.greaterThanOrEqual={priceGreaterThanOrEqual}&price.lessThanOrEqual={priceLessThanOrEqual}&price.equals={priceEquals}&price.notEquals={priceNotEquals}&price.specified={priceSpecified}&price.in={priceIn}&price.notIn={priceNotIn}&timeFrom.greaterThan={timeFromGreaterThan}&timeFrom.lessThan={timeFromLessThan}&timeFrom.greaterThanOrEqual={timeFromGreaterThanOrEqual}&timeFrom.lessThanOrEqual={timeFromLessThanOrEqual}&timeFrom.equals={timeFromEquals}&timeFrom.notEquals={timeFromNotEquals}&timeFrom.specified={timeFromSpecified}&timeFrom.in={timeFromIn}&timeFrom.notIn={timeFromNotIn}&timeTo.greaterThan={timeToGreaterThan}&timeTo.lessThan={timeToLessThan}&timeTo.greaterThanOrEqual={timeToGreaterThanOrEqual}&timeTo.lessThanOrEqual={timeToLessThanOrEqual}&timeTo.equals={timeToEquals}&timeTo.notEquals={timeToNotEquals}&timeTo.specified={timeToSpecified}&timeTo.in={timeToIn}&timeTo.notIn={timeToNotIn}&checkedIn.equals={checkedInEquals}&checkedIn.notEquals={checkedInNotEquals}&checkedIn.specified={checkedInSpecified}&checkedIn.in={checkedInIn}&checkedIn.notIn={checkedInNotIn}&status.equals={statusEquals}&status.notEquals={statusNotEquals}&status.specified={statusSpecified}&status.in={statusIn}&status.notIn={statusNotIn}&refundStatus.equals={refundStatusEquals}&refundStatus.notEquals={refundStatusNotEquals}&refundStatus.specified={refundStatusSpecified}&refundStatus.in={refundStatusIn}&refundStatus.notIn={refundStatusNotIn}&refundReason.contains={refundReasonContains}&refundReason.doesNotContain={refundReasonDoesNotContain}&refundReason.equals={refundReasonEquals}&refundReason.notEquals={refundReasonNotEquals}&refundReason.specified={refundReasonSpecified}&refundReason.in={refundReasonIn}&refundReason.notIn={refundReasonNotIn}&refundRequestedAt.greaterThan={refundRequestedAtGreaterThan}&refundRequestedAt.lessThan={refundRequestedAtLessThan}&refundRequestedAt.greaterThanOrEqual={refundRequestedAtGreaterThanOrEqual}&refundRequestedAt.lessThanOrEqual={refundRequestedAtLessThanOrEqual}&refundRequestedAt.equals={refundRequestedAtEquals}&refundRequestedAt.notEquals={refundRequestedAtNotEquals}&refundRequestedAt.specified={refundRequestedAtSpecified}&refundRequestedAt.in={refundRequestedAtIn}&refundRequestedAt.notIn={refundRequestedAtNotIn}&refundCompletedAt.greaterThan={refundCompletedAtGreaterThan}&refundCompletedAt.lessThan={refundCompletedAtLessThan}&refundCompletedAt.greaterThanOrEqual={refundCompletedAtGreaterThanOrEqual}&refundCompletedAt.lessThanOrEqual={refundCompletedAtLessThanOrEqual}&refundCompletedAt.equals={refundCompletedAtEquals}&refundCompletedAt.notEquals={refundCompletedAtNotEquals}&refundCompletedAt.specified={refundCompletedAtSpecified}&refundCompletedAt.in={refundCompletedAtIn}&refundCompletedAt.notIn={refundCompletedAtNotIn}&refundAmount.greaterThan={refundAmountGreaterThan}&refundAmount.lessThan={refundAmountLessThan}&refundAmount.greaterThanOrEqual={refundAmountGreaterThanOrEqual}&refundAmount.lessThanOrEqual={refundAmountLessThanOrEqual}&refundAmount.equals={refundAmountEquals}&refundAmount.notEquals={refundAmountNotEquals}&refundAmount.specified={refundAmountSpecified}&refundAmount.in={refundAmountIn}&refundAmount.notIn={refundAmountNotIn}&refundTransactionId.contains={refundTransactionIdContains}&refundTransactionId.doesNotContain={refundTransactionIdDoesNotContain}&refundTransactionId.equals={refundTransactionIdEquals}&refundTransactionId.notEquals={refundTransactionIdNotEquals}&refundTransactionId.specified={refundTransactionIdSpecified}&refundTransactionId.in={refundTransactionIdIn}&refundTransactionId.notIn={refundTransactionIdNotIn}&tripId.greaterThan={tripIdGreaterThan}&tripId.lessThan={tripIdLessThan}&tripId.greaterThanOrEqual={tripIdGreaterThanOrEqual}&tripId.lessThanOrEqual={tripIdLessThanOrEqual}&tripId.equals={tripIdEquals}&tripId.notEquals={tripIdNotEquals}&tripId.specified={tripIdSpecified}&tripId.in={tripIdIn}&tripId.notIn={tripIdNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&seatId.greaterThan={seatIdGreaterThan}&seatId.lessThan={seatIdLessThan}&seatId.greaterThanOrEqual={seatIdGreaterThanOrEqual}&seatId.lessThanOrEqual={seatIdLessThanOrEqual}&seatId.equals={seatIdEquals}&seatId.notEquals={seatIdNotEquals}&seatId.specified={seatIdSpecified}&seatId.in={seatIdIn}&seatId.notIn={seatIdNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&originalTicketId.greaterThan={originalTicketIdGreaterThan}&originalTicketId.lessThan={originalTicketIdLessThan}&originalTicketId.greaterThanOrEqual={originalTicketIdGreaterThanOrEqual}&originalTicketId.lessThanOrEqual={originalTicketIdLessThanOrEqual}&originalTicketId.equals={originalTicketIdEquals}&originalTicketId.notEquals={originalTicketIdNotEquals}&originalTicketId.specified={originalTicketIdSpecified}&originalTicketId.in={originalTicketIdIn}&originalTicketId.notIn={originalTicketIdNotIn}&exchangedTicketId.greaterThan={exchangedTicketIdGreaterThan}&exchangedTicketId.lessThan={exchangedTicketIdLessThan}&exchangedTicketId.greaterThanOrEqual={exchangedTicketIdGreaterThanOrEqual}&exchangedTicketId.lessThanOrEqual={exchangedTicketIdLessThanOrEqual}&exchangedTicketId.equals={exchangedTicketIdEquals}&exchangedTicketId.notEquals={exchangedTicketIdNotEquals}&exchangedTicketId.specified={exchangedTicketIdSpecified}&exchangedTicketId.in={exchangedTicketIdIn}&exchangedTicketId.notIn={exchangedTicketIdNotIn}&bookingId.greaterThan={bookingIdGreaterThan}&bookingId.lessThan={bookingIdLessThan}&bookingId.greaterThanOrEqual={bookingIdGreaterThanOrEqual}&bookingId.lessThanOrEqual={bookingIdLessThanOrEqual}&bookingId.equals={bookingIdEquals}&bookingId.notEquals={bookingIdNotEquals}&bookingId.specified={bookingIdSpecified}&bookingId.in={bookingIdIn}&bookingId.notIn={bookingIdNotIn}&exchangedFromId.greaterThan={exchangedFromIdGreaterThan}&exchangedFromId.lessThan={exchangedFromIdLessThan}&exchangedFromId.greaterThanOrEqual={exchangedFromIdGreaterThanOrEqual}&exchangedFromId.lessThanOrEqual={exchangedFromIdLessThanOrEqual}&exchangedFromId.equals={exchangedFromIdEquals}&exchangedFromId.notEquals={exchangedFromIdNotEquals}&exchangedFromId.specified={exchangedFromIdSpecified}&exchangedFromId.in={exchangedFromIdIn}&exchangedFromId.notIn={exchangedFromIdNotIn}&exchangedToId.greaterThan={exchangedToIdGreaterThan}&exchangedToId.lessThan={exchangedToIdLessThan}&exchangedToId.greaterThanOrEqual={exchangedToIdGreaterThanOrEqual}&exchangedToId.lessThanOrEqual={exchangedToIdLessThanOrEqual}&exchangedToId.equals={exchangedToIdEquals}&exchangedToId.notEquals={exchangedToIdNotEquals}&exchangedToId.specified={exchangedToIdSpecified}&exchangedToId.in={exchangedToIdIn}&exchangedToId.notIn={exchangedToIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countTicketsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("ticketCodeContains") @jakarta.annotation.Nullable String ticketCodeContains, @Param("ticketCodeDoesNotContain") @jakarta.annotation.Nullable String ticketCodeDoesNotContain, @Param("ticketCodeEquals") @jakarta.annotation.Nullable String ticketCodeEquals, @Param("ticketCodeNotEquals") @jakarta.annotation.Nullable String ticketCodeNotEquals, @Param("ticketCodeSpecified") @jakarta.annotation.Nullable Boolean ticketCodeSpecified, @Param("ticketCodeIn") @jakarta.annotation.Nullable List<String> ticketCodeIn, @Param("ticketCodeNotIn") @jakarta.annotation.Nullable List<String> ticketCodeNotIn, @Param("priceGreaterThan") @jakarta.annotation.Nullable BigDecimal priceGreaterThan, @Param("priceLessThan") @jakarta.annotation.Nullable BigDecimal priceLessThan, @Param("priceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal priceGreaterThanOrEqual, @Param("priceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal priceLessThanOrEqual, @Param("priceEquals") @jakarta.annotation.Nullable BigDecimal priceEquals, @Param("priceNotEquals") @jakarta.annotation.Nullable BigDecimal priceNotEquals, @Param("priceSpecified") @jakarta.annotation.Nullable Boolean priceSpecified, @Param("priceIn") @jakarta.annotation.Nullable List<BigDecimal> priceIn, @Param("priceNotIn") @jakarta.annotation.Nullable List<BigDecimal> priceNotIn, @Param("timeFromGreaterThan") @jakarta.annotation.Nullable OffsetDateTime timeFromGreaterThan, @Param("timeFromLessThan") @jakarta.annotation.Nullable OffsetDateTime timeFromLessThan, @Param("timeFromGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timeFromGreaterThanOrEqual, @Param("timeFromLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timeFromLessThanOrEqual, @Param("timeFromEquals") @jakarta.annotation.Nullable OffsetDateTime timeFromEquals, @Param("timeFromNotEquals") @jakarta.annotation.Nullable OffsetDateTime timeFromNotEquals, @Param("timeFromSpecified") @jakarta.annotation.Nullable Boolean timeFromSpecified, @Param("timeFromIn") @jakarta.annotation.Nullable List<OffsetDateTime> timeFromIn, @Param("timeFromNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> timeFromNotIn, @Param("timeToGreaterThan") @jakarta.annotation.Nullable OffsetDateTime timeToGreaterThan, @Param("timeToLessThan") @jakarta.annotation.Nullable OffsetDateTime timeToLessThan, @Param("timeToGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timeToGreaterThanOrEqual, @Param("timeToLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timeToLessThanOrEqual, @Param("timeToEquals") @jakarta.annotation.Nullable OffsetDateTime timeToEquals, @Param("timeToNotEquals") @jakarta.annotation.Nullable OffsetDateTime timeToNotEquals, @Param("timeToSpecified") @jakarta.annotation.Nullable Boolean timeToSpecified, @Param("timeToIn") @jakarta.annotation.Nullable List<OffsetDateTime> timeToIn, @Param("timeToNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> timeToNotIn, @Param("checkedInEquals") @jakarta.annotation.Nullable Boolean checkedInEquals, @Param("checkedInNotEquals") @jakarta.annotation.Nullable Boolean checkedInNotEquals, @Param("checkedInSpecified") @jakarta.annotation.Nullable Boolean checkedInSpecified, @Param("checkedInIn") @jakarta.annotation.Nullable List<Boolean> checkedInIn, @Param("checkedInNotIn") @jakarta.annotation.Nullable List<Boolean> checkedInNotIn, @Param("statusEquals") @jakarta.annotation.Nullable String statusEquals, @Param("statusNotEquals") @jakarta.annotation.Nullable String statusNotEquals, @Param("statusSpecified") @jakarta.annotation.Nullable Boolean statusSpecified, @Param("statusIn") @jakarta.annotation.Nullable List<String> statusIn, @Param("statusNotIn") @jakarta.annotation.Nullable List<String> statusNotIn, @Param("refundStatusEquals") @jakarta.annotation.Nullable String refundStatusEquals, @Param("refundStatusNotEquals") @jakarta.annotation.Nullable String refundStatusNotEquals, @Param("refundStatusSpecified") @jakarta.annotation.Nullable Boolean refundStatusSpecified, @Param("refundStatusIn") @jakarta.annotation.Nullable List<String> refundStatusIn, @Param("refundStatusNotIn") @jakarta.annotation.Nullable List<String> refundStatusNotIn, @Param("refundReasonContains") @jakarta.annotation.Nullable String refundReasonContains, @Param("refundReasonDoesNotContain") @jakarta.annotation.Nullable String refundReasonDoesNotContain, @Param("refundReasonEquals") @jakarta.annotation.Nullable String refundReasonEquals, @Param("refundReasonNotEquals") @jakarta.annotation.Nullable String refundReasonNotEquals, @Param("refundReasonSpecified") @jakarta.annotation.Nullable Boolean refundReasonSpecified, @Param("refundReasonIn") @jakarta.annotation.Nullable List<String> refundReasonIn, @Param("refundReasonNotIn") @jakarta.annotation.Nullable List<String> refundReasonNotIn, @Param("refundRequestedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtGreaterThan, @Param("refundRequestedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtLessThan, @Param("refundRequestedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtGreaterThanOrEqual, @Param("refundRequestedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtLessThanOrEqual, @Param("refundRequestedAtEquals") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtEquals, @Param("refundRequestedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtNotEquals, @Param("refundRequestedAtSpecified") @jakarta.annotation.Nullable Boolean refundRequestedAtSpecified, @Param("refundRequestedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> refundRequestedAtIn, @Param("refundRequestedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> refundRequestedAtNotIn, @Param("refundCompletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtGreaterThan, @Param("refundCompletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtLessThan, @Param("refundCompletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtGreaterThanOrEqual, @Param("refundCompletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtLessThanOrEqual, @Param("refundCompletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtEquals, @Param("refundCompletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtNotEquals, @Param("refundCompletedAtSpecified") @jakarta.annotation.Nullable Boolean refundCompletedAtSpecified, @Param("refundCompletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> refundCompletedAtIn, @Param("refundCompletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> refundCompletedAtNotIn, @Param("refundAmountGreaterThan") @jakarta.annotation.Nullable BigDecimal refundAmountGreaterThan, @Param("refundAmountLessThan") @jakarta.annotation.Nullable BigDecimal refundAmountLessThan, @Param("refundAmountGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal refundAmountGreaterThanOrEqual, @Param("refundAmountLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal refundAmountLessThanOrEqual, @Param("refundAmountEquals") @jakarta.annotation.Nullable BigDecimal refundAmountEquals, @Param("refundAmountNotEquals") @jakarta.annotation.Nullable BigDecimal refundAmountNotEquals, @Param("refundAmountSpecified") @jakarta.annotation.Nullable Boolean refundAmountSpecified, @Param("refundAmountIn") @jakarta.annotation.Nullable List<BigDecimal> refundAmountIn, @Param("refundAmountNotIn") @jakarta.annotation.Nullable List<BigDecimal> refundAmountNotIn, @Param("refundTransactionIdContains") @jakarta.annotation.Nullable String refundTransactionIdContains, @Param("refundTransactionIdDoesNotContain") @jakarta.annotation.Nullable String refundTransactionIdDoesNotContain, @Param("refundTransactionIdEquals") @jakarta.annotation.Nullable String refundTransactionIdEquals, @Param("refundTransactionIdNotEquals") @jakarta.annotation.Nullable String refundTransactionIdNotEquals, @Param("refundTransactionIdSpecified") @jakarta.annotation.Nullable Boolean refundTransactionIdSpecified, @Param("refundTransactionIdIn") @jakarta.annotation.Nullable List<String> refundTransactionIdIn, @Param("refundTransactionIdNotIn") @jakarta.annotation.Nullable List<String> refundTransactionIdNotIn, @Param("tripIdGreaterThan") @jakarta.annotation.Nullable Long tripIdGreaterThan, @Param("tripIdLessThan") @jakarta.annotation.Nullable Long tripIdLessThan, @Param("tripIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long tripIdGreaterThanOrEqual, @Param("tripIdLessThanOrEqual") @jakarta.annotation.Nullable Long tripIdLessThanOrEqual, @Param("tripIdEquals") @jakarta.annotation.Nullable Long tripIdEquals, @Param("tripIdNotEquals") @jakarta.annotation.Nullable Long tripIdNotEquals, @Param("tripIdSpecified") @jakarta.annotation.Nullable Boolean tripIdSpecified, @Param("tripIdIn") @jakarta.annotation.Nullable List<Long> tripIdIn, @Param("tripIdNotIn") @jakarta.annotation.Nullable List<Long> tripIdNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("seatIdGreaterThan") @jakarta.annotation.Nullable Long seatIdGreaterThan, @Param("seatIdLessThan") @jakarta.annotation.Nullable Long seatIdLessThan, @Param("seatIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long seatIdGreaterThanOrEqual, @Param("seatIdLessThanOrEqual") @jakarta.annotation.Nullable Long seatIdLessThanOrEqual, @Param("seatIdEquals") @jakarta.annotation.Nullable Long seatIdEquals, @Param("seatIdNotEquals") @jakarta.annotation.Nullable Long seatIdNotEquals, @Param("seatIdSpecified") @jakarta.annotation.Nullable Boolean seatIdSpecified, @Param("seatIdIn") @jakarta.annotation.Nullable List<Long> seatIdIn, @Param("seatIdNotIn") @jakarta.annotation.Nullable List<Long> seatIdNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("originalTicketIdGreaterThan") @jakarta.annotation.Nullable Long originalTicketIdGreaterThan, @Param("originalTicketIdLessThan") @jakarta.annotation.Nullable Long originalTicketIdLessThan, @Param("originalTicketIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long originalTicketIdGreaterThanOrEqual, @Param("originalTicketIdLessThanOrEqual") @jakarta.annotation.Nullable Long originalTicketIdLessThanOrEqual, @Param("originalTicketIdEquals") @jakarta.annotation.Nullable Long originalTicketIdEquals, @Param("originalTicketIdNotEquals") @jakarta.annotation.Nullable Long originalTicketIdNotEquals, @Param("originalTicketIdSpecified") @jakarta.annotation.Nullable Boolean originalTicketIdSpecified, @Param("originalTicketIdIn") @jakarta.annotation.Nullable List<Long> originalTicketIdIn, @Param("originalTicketIdNotIn") @jakarta.annotation.Nullable List<Long> originalTicketIdNotIn, @Param("exchangedTicketIdGreaterThan") @jakarta.annotation.Nullable Long exchangedTicketIdGreaterThan, @Param("exchangedTicketIdLessThan") @jakarta.annotation.Nullable Long exchangedTicketIdLessThan, @Param("exchangedTicketIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long exchangedTicketIdGreaterThanOrEqual, @Param("exchangedTicketIdLessThanOrEqual") @jakarta.annotation.Nullable Long exchangedTicketIdLessThanOrEqual, @Param("exchangedTicketIdEquals") @jakarta.annotation.Nullable Long exchangedTicketIdEquals, @Param("exchangedTicketIdNotEquals") @jakarta.annotation.Nullable Long exchangedTicketIdNotEquals, @Param("exchangedTicketIdSpecified") @jakarta.annotation.Nullable Boolean exchangedTicketIdSpecified, @Param("exchangedTicketIdIn") @jakarta.annotation.Nullable List<Long> exchangedTicketIdIn, @Param("exchangedTicketIdNotIn") @jakarta.annotation.Nullable List<Long> exchangedTicketIdNotIn, @Param("bookingIdGreaterThan") @jakarta.annotation.Nullable Long bookingIdGreaterThan, @Param("bookingIdLessThan") @jakarta.annotation.Nullable Long bookingIdLessThan, @Param("bookingIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long bookingIdGreaterThanOrEqual, @Param("bookingIdLessThanOrEqual") @jakarta.annotation.Nullable Long bookingIdLessThanOrEqual, @Param("bookingIdEquals") @jakarta.annotation.Nullable Long bookingIdEquals, @Param("bookingIdNotEquals") @jakarta.annotation.Nullable Long bookingIdNotEquals, @Param("bookingIdSpecified") @jakarta.annotation.Nullable Boolean bookingIdSpecified, @Param("bookingIdIn") @jakarta.annotation.Nullable List<Long> bookingIdIn, @Param("bookingIdNotIn") @jakarta.annotation.Nullable List<Long> bookingIdNotIn, @Param("exchangedFromIdGreaterThan") @jakarta.annotation.Nullable Long exchangedFromIdGreaterThan, @Param("exchangedFromIdLessThan") @jakarta.annotation.Nullable Long exchangedFromIdLessThan, @Param("exchangedFromIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long exchangedFromIdGreaterThanOrEqual, @Param("exchangedFromIdLessThanOrEqual") @jakarta.annotation.Nullable Long exchangedFromIdLessThanOrEqual, @Param("exchangedFromIdEquals") @jakarta.annotation.Nullable Long exchangedFromIdEquals, @Param("exchangedFromIdNotEquals") @jakarta.annotation.Nullable Long exchangedFromIdNotEquals, @Param("exchangedFromIdSpecified") @jakarta.annotation.Nullable Boolean exchangedFromIdSpecified, @Param("exchangedFromIdIn") @jakarta.annotation.Nullable List<Long> exchangedFromIdIn, @Param("exchangedFromIdNotIn") @jakarta.annotation.Nullable List<Long> exchangedFromIdNotIn, @Param("exchangedToIdGreaterThan") @jakarta.annotation.Nullable Long exchangedToIdGreaterThan, @Param("exchangedToIdLessThan") @jakarta.annotation.Nullable Long exchangedToIdLessThan, @Param("exchangedToIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long exchangedToIdGreaterThanOrEqual, @Param("exchangedToIdLessThanOrEqual") @jakarta.annotation.Nullable Long exchangedToIdLessThanOrEqual, @Param("exchangedToIdEquals") @jakarta.annotation.Nullable Long exchangedToIdEquals, @Param("exchangedToIdNotEquals") @jakarta.annotation.Nullable Long exchangedToIdNotEquals, @Param("exchangedToIdSpecified") @jakarta.annotation.Nullable Boolean exchangedToIdSpecified, @Param("exchangedToIdIn") @jakarta.annotation.Nullable List<Long> exchangedToIdIn, @Param("exchangedToIdNotIn") @jakarta.annotation.Nullable List<Long> exchangedToIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countTickets</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountTicketsQueryParams} class that allows for
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
   *   <li>ticketCodeContains -  (optional)</li>
   *   <li>ticketCodeDoesNotContain -  (optional)</li>
   *   <li>ticketCodeEquals -  (optional)</li>
   *   <li>ticketCodeNotEquals -  (optional)</li>
   *   <li>ticketCodeSpecified -  (optional)</li>
   *   <li>ticketCodeIn -  (optional)</li>
   *   <li>ticketCodeNotIn -  (optional)</li>
   *   <li>priceGreaterThan -  (optional)</li>
   *   <li>priceLessThan -  (optional)</li>
   *   <li>priceGreaterThanOrEqual -  (optional)</li>
   *   <li>priceLessThanOrEqual -  (optional)</li>
   *   <li>priceEquals -  (optional)</li>
   *   <li>priceNotEquals -  (optional)</li>
   *   <li>priceSpecified -  (optional)</li>
   *   <li>priceIn -  (optional)</li>
   *   <li>priceNotIn -  (optional)</li>
   *   <li>timeFromGreaterThan -  (optional)</li>
   *   <li>timeFromLessThan -  (optional)</li>
   *   <li>timeFromGreaterThanOrEqual -  (optional)</li>
   *   <li>timeFromLessThanOrEqual -  (optional)</li>
   *   <li>timeFromEquals -  (optional)</li>
   *   <li>timeFromNotEquals -  (optional)</li>
   *   <li>timeFromSpecified -  (optional)</li>
   *   <li>timeFromIn -  (optional)</li>
   *   <li>timeFromNotIn -  (optional)</li>
   *   <li>timeToGreaterThan -  (optional)</li>
   *   <li>timeToLessThan -  (optional)</li>
   *   <li>timeToGreaterThanOrEqual -  (optional)</li>
   *   <li>timeToLessThanOrEqual -  (optional)</li>
   *   <li>timeToEquals -  (optional)</li>
   *   <li>timeToNotEquals -  (optional)</li>
   *   <li>timeToSpecified -  (optional)</li>
   *   <li>timeToIn -  (optional)</li>
   *   <li>timeToNotIn -  (optional)</li>
   *   <li>checkedInEquals -  (optional)</li>
   *   <li>checkedInNotEquals -  (optional)</li>
   *   <li>checkedInSpecified -  (optional)</li>
   *   <li>checkedInIn -  (optional)</li>
   *   <li>checkedInNotIn -  (optional)</li>
   *   <li>statusEquals -  (optional)</li>
   *   <li>statusNotEquals -  (optional)</li>
   *   <li>statusSpecified -  (optional)</li>
   *   <li>statusIn -  (optional)</li>
   *   <li>statusNotIn -  (optional)</li>
   *   <li>refundStatusEquals -  (optional)</li>
   *   <li>refundStatusNotEquals -  (optional)</li>
   *   <li>refundStatusSpecified -  (optional)</li>
   *   <li>refundStatusIn -  (optional)</li>
   *   <li>refundStatusNotIn -  (optional)</li>
   *   <li>refundReasonContains -  (optional)</li>
   *   <li>refundReasonDoesNotContain -  (optional)</li>
   *   <li>refundReasonEquals -  (optional)</li>
   *   <li>refundReasonNotEquals -  (optional)</li>
   *   <li>refundReasonSpecified -  (optional)</li>
   *   <li>refundReasonIn -  (optional)</li>
   *   <li>refundReasonNotIn -  (optional)</li>
   *   <li>refundRequestedAtGreaterThan -  (optional)</li>
   *   <li>refundRequestedAtLessThan -  (optional)</li>
   *   <li>refundRequestedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>refundRequestedAtLessThanOrEqual -  (optional)</li>
   *   <li>refundRequestedAtEquals -  (optional)</li>
   *   <li>refundRequestedAtNotEquals -  (optional)</li>
   *   <li>refundRequestedAtSpecified -  (optional)</li>
   *   <li>refundRequestedAtIn -  (optional)</li>
   *   <li>refundRequestedAtNotIn -  (optional)</li>
   *   <li>refundCompletedAtGreaterThan -  (optional)</li>
   *   <li>refundCompletedAtLessThan -  (optional)</li>
   *   <li>refundCompletedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>refundCompletedAtLessThanOrEqual -  (optional)</li>
   *   <li>refundCompletedAtEquals -  (optional)</li>
   *   <li>refundCompletedAtNotEquals -  (optional)</li>
   *   <li>refundCompletedAtSpecified -  (optional)</li>
   *   <li>refundCompletedAtIn -  (optional)</li>
   *   <li>refundCompletedAtNotIn -  (optional)</li>
   *   <li>refundAmountGreaterThan -  (optional)</li>
   *   <li>refundAmountLessThan -  (optional)</li>
   *   <li>refundAmountGreaterThanOrEqual -  (optional)</li>
   *   <li>refundAmountLessThanOrEqual -  (optional)</li>
   *   <li>refundAmountEquals -  (optional)</li>
   *   <li>refundAmountNotEquals -  (optional)</li>
   *   <li>refundAmountSpecified -  (optional)</li>
   *   <li>refundAmountIn -  (optional)</li>
   *   <li>refundAmountNotIn -  (optional)</li>
   *   <li>refundTransactionIdContains -  (optional)</li>
   *   <li>refundTransactionIdDoesNotContain -  (optional)</li>
   *   <li>refundTransactionIdEquals -  (optional)</li>
   *   <li>refundTransactionIdNotEquals -  (optional)</li>
   *   <li>refundTransactionIdSpecified -  (optional)</li>
   *   <li>refundTransactionIdIn -  (optional)</li>
   *   <li>refundTransactionIdNotIn -  (optional)</li>
   *   <li>tripIdGreaterThan -  (optional)</li>
   *   <li>tripIdLessThan -  (optional)</li>
   *   <li>tripIdGreaterThanOrEqual -  (optional)</li>
   *   <li>tripIdLessThanOrEqual -  (optional)</li>
   *   <li>tripIdEquals -  (optional)</li>
   *   <li>tripIdNotEquals -  (optional)</li>
   *   <li>tripIdSpecified -  (optional)</li>
   *   <li>tripIdIn -  (optional)</li>
   *   <li>tripIdNotIn -  (optional)</li>
   *   <li>routeIdGreaterThan -  (optional)</li>
   *   <li>routeIdLessThan -  (optional)</li>
   *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
   *   <li>routeIdLessThanOrEqual -  (optional)</li>
   *   <li>routeIdEquals -  (optional)</li>
   *   <li>routeIdNotEquals -  (optional)</li>
   *   <li>routeIdSpecified -  (optional)</li>
   *   <li>routeIdIn -  (optional)</li>
   *   <li>routeIdNotIn -  (optional)</li>
   *   <li>seatIdGreaterThan -  (optional)</li>
   *   <li>seatIdLessThan -  (optional)</li>
   *   <li>seatIdGreaterThanOrEqual -  (optional)</li>
   *   <li>seatIdLessThanOrEqual -  (optional)</li>
   *   <li>seatIdEquals -  (optional)</li>
   *   <li>seatIdNotEquals -  (optional)</li>
   *   <li>seatIdSpecified -  (optional)</li>
   *   <li>seatIdIn -  (optional)</li>
   *   <li>seatIdNotIn -  (optional)</li>
   *   <li>createdAtGreaterThan -  (optional)</li>
   *   <li>createdAtLessThan -  (optional)</li>
   *   <li>createdAtGreaterThanOrEqual -  (optional)</li>
   *   <li>createdAtLessThanOrEqual -  (optional)</li>
   *   <li>createdAtEquals -  (optional)</li>
   *   <li>createdAtNotEquals -  (optional)</li>
   *   <li>createdAtSpecified -  (optional)</li>
   *   <li>createdAtIn -  (optional)</li>
   *   <li>createdAtNotIn -  (optional)</li>
   *   <li>isDeletedEquals -  (optional)</li>
   *   <li>isDeletedNotEquals -  (optional)</li>
   *   <li>isDeletedSpecified -  (optional)</li>
   *   <li>isDeletedIn -  (optional)</li>
   *   <li>isDeletedNotIn -  (optional)</li>
   *   <li>deletedByEquals -  (optional)</li>
   *   <li>deletedByNotEquals -  (optional)</li>
   *   <li>deletedBySpecified -  (optional)</li>
   *   <li>deletedByIn -  (optional)</li>
   *   <li>deletedByNotIn -  (optional)</li>
   *   <li>originalTicketIdGreaterThan -  (optional)</li>
   *   <li>originalTicketIdLessThan -  (optional)</li>
   *   <li>originalTicketIdGreaterThanOrEqual -  (optional)</li>
   *   <li>originalTicketIdLessThanOrEqual -  (optional)</li>
   *   <li>originalTicketIdEquals -  (optional)</li>
   *   <li>originalTicketIdNotEquals -  (optional)</li>
   *   <li>originalTicketIdSpecified -  (optional)</li>
   *   <li>originalTicketIdIn -  (optional)</li>
   *   <li>originalTicketIdNotIn -  (optional)</li>
   *   <li>exchangedTicketIdGreaterThan -  (optional)</li>
   *   <li>exchangedTicketIdLessThan -  (optional)</li>
   *   <li>exchangedTicketIdGreaterThanOrEqual -  (optional)</li>
   *   <li>exchangedTicketIdLessThanOrEqual -  (optional)</li>
   *   <li>exchangedTicketIdEquals -  (optional)</li>
   *   <li>exchangedTicketIdNotEquals -  (optional)</li>
   *   <li>exchangedTicketIdSpecified -  (optional)</li>
   *   <li>exchangedTicketIdIn -  (optional)</li>
   *   <li>exchangedTicketIdNotIn -  (optional)</li>
   *   <li>bookingIdGreaterThan -  (optional)</li>
   *   <li>bookingIdLessThan -  (optional)</li>
   *   <li>bookingIdGreaterThanOrEqual -  (optional)</li>
   *   <li>bookingIdLessThanOrEqual -  (optional)</li>
   *   <li>bookingIdEquals -  (optional)</li>
   *   <li>bookingIdNotEquals -  (optional)</li>
   *   <li>bookingIdSpecified -  (optional)</li>
   *   <li>bookingIdIn -  (optional)</li>
   *   <li>bookingIdNotIn -  (optional)</li>
   *   <li>exchangedFromIdGreaterThan -  (optional)</li>
   *   <li>exchangedFromIdLessThan -  (optional)</li>
   *   <li>exchangedFromIdGreaterThanOrEqual -  (optional)</li>
   *   <li>exchangedFromIdLessThanOrEqual -  (optional)</li>
   *   <li>exchangedFromIdEquals -  (optional)</li>
   *   <li>exchangedFromIdNotEquals -  (optional)</li>
   *   <li>exchangedFromIdSpecified -  (optional)</li>
   *   <li>exchangedFromIdIn -  (optional)</li>
   *   <li>exchangedFromIdNotIn -  (optional)</li>
   *   <li>exchangedToIdGreaterThan -  (optional)</li>
   *   <li>exchangedToIdLessThan -  (optional)</li>
   *   <li>exchangedToIdGreaterThanOrEqual -  (optional)</li>
   *   <li>exchangedToIdLessThanOrEqual -  (optional)</li>
   *   <li>exchangedToIdEquals -  (optional)</li>
   *   <li>exchangedToIdNotEquals -  (optional)</li>
   *   <li>exchangedToIdSpecified -  (optional)</li>
   *   <li>exchangedToIdIn -  (optional)</li>
   *   <li>exchangedToIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return Long
   */
  @RequestLine("GET /api/tickets/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&ticketCode.contains={ticketCodeContains}&ticketCode.doesNotContain={ticketCodeDoesNotContain}&ticketCode.equals={ticketCodeEquals}&ticketCode.notEquals={ticketCodeNotEquals}&ticketCode.specified={ticketCodeSpecified}&ticketCode.in={ticketCodeIn}&ticketCode.notIn={ticketCodeNotIn}&price.greaterThan={priceGreaterThan}&price.lessThan={priceLessThan}&price.greaterThanOrEqual={priceGreaterThanOrEqual}&price.lessThanOrEqual={priceLessThanOrEqual}&price.equals={priceEquals}&price.notEquals={priceNotEquals}&price.specified={priceSpecified}&price.in={priceIn}&price.notIn={priceNotIn}&timeFrom.greaterThan={timeFromGreaterThan}&timeFrom.lessThan={timeFromLessThan}&timeFrom.greaterThanOrEqual={timeFromGreaterThanOrEqual}&timeFrom.lessThanOrEqual={timeFromLessThanOrEqual}&timeFrom.equals={timeFromEquals}&timeFrom.notEquals={timeFromNotEquals}&timeFrom.specified={timeFromSpecified}&timeFrom.in={timeFromIn}&timeFrom.notIn={timeFromNotIn}&timeTo.greaterThan={timeToGreaterThan}&timeTo.lessThan={timeToLessThan}&timeTo.greaterThanOrEqual={timeToGreaterThanOrEqual}&timeTo.lessThanOrEqual={timeToLessThanOrEqual}&timeTo.equals={timeToEquals}&timeTo.notEquals={timeToNotEquals}&timeTo.specified={timeToSpecified}&timeTo.in={timeToIn}&timeTo.notIn={timeToNotIn}&checkedIn.equals={checkedInEquals}&checkedIn.notEquals={checkedInNotEquals}&checkedIn.specified={checkedInSpecified}&checkedIn.in={checkedInIn}&checkedIn.notIn={checkedInNotIn}&status.equals={statusEquals}&status.notEquals={statusNotEquals}&status.specified={statusSpecified}&status.in={statusIn}&status.notIn={statusNotIn}&refundStatus.equals={refundStatusEquals}&refundStatus.notEquals={refundStatusNotEquals}&refundStatus.specified={refundStatusSpecified}&refundStatus.in={refundStatusIn}&refundStatus.notIn={refundStatusNotIn}&refundReason.contains={refundReasonContains}&refundReason.doesNotContain={refundReasonDoesNotContain}&refundReason.equals={refundReasonEquals}&refundReason.notEquals={refundReasonNotEquals}&refundReason.specified={refundReasonSpecified}&refundReason.in={refundReasonIn}&refundReason.notIn={refundReasonNotIn}&refundRequestedAt.greaterThan={refundRequestedAtGreaterThan}&refundRequestedAt.lessThan={refundRequestedAtLessThan}&refundRequestedAt.greaterThanOrEqual={refundRequestedAtGreaterThanOrEqual}&refundRequestedAt.lessThanOrEqual={refundRequestedAtLessThanOrEqual}&refundRequestedAt.equals={refundRequestedAtEquals}&refundRequestedAt.notEquals={refundRequestedAtNotEquals}&refundRequestedAt.specified={refundRequestedAtSpecified}&refundRequestedAt.in={refundRequestedAtIn}&refundRequestedAt.notIn={refundRequestedAtNotIn}&refundCompletedAt.greaterThan={refundCompletedAtGreaterThan}&refundCompletedAt.lessThan={refundCompletedAtLessThan}&refundCompletedAt.greaterThanOrEqual={refundCompletedAtGreaterThanOrEqual}&refundCompletedAt.lessThanOrEqual={refundCompletedAtLessThanOrEqual}&refundCompletedAt.equals={refundCompletedAtEquals}&refundCompletedAt.notEquals={refundCompletedAtNotEquals}&refundCompletedAt.specified={refundCompletedAtSpecified}&refundCompletedAt.in={refundCompletedAtIn}&refundCompletedAt.notIn={refundCompletedAtNotIn}&refundAmount.greaterThan={refundAmountGreaterThan}&refundAmount.lessThan={refundAmountLessThan}&refundAmount.greaterThanOrEqual={refundAmountGreaterThanOrEqual}&refundAmount.lessThanOrEqual={refundAmountLessThanOrEqual}&refundAmount.equals={refundAmountEquals}&refundAmount.notEquals={refundAmountNotEquals}&refundAmount.specified={refundAmountSpecified}&refundAmount.in={refundAmountIn}&refundAmount.notIn={refundAmountNotIn}&refundTransactionId.contains={refundTransactionIdContains}&refundTransactionId.doesNotContain={refundTransactionIdDoesNotContain}&refundTransactionId.equals={refundTransactionIdEquals}&refundTransactionId.notEquals={refundTransactionIdNotEquals}&refundTransactionId.specified={refundTransactionIdSpecified}&refundTransactionId.in={refundTransactionIdIn}&refundTransactionId.notIn={refundTransactionIdNotIn}&tripId.greaterThan={tripIdGreaterThan}&tripId.lessThan={tripIdLessThan}&tripId.greaterThanOrEqual={tripIdGreaterThanOrEqual}&tripId.lessThanOrEqual={tripIdLessThanOrEqual}&tripId.equals={tripIdEquals}&tripId.notEquals={tripIdNotEquals}&tripId.specified={tripIdSpecified}&tripId.in={tripIdIn}&tripId.notIn={tripIdNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&seatId.greaterThan={seatIdGreaterThan}&seatId.lessThan={seatIdLessThan}&seatId.greaterThanOrEqual={seatIdGreaterThanOrEqual}&seatId.lessThanOrEqual={seatIdLessThanOrEqual}&seatId.equals={seatIdEquals}&seatId.notEquals={seatIdNotEquals}&seatId.specified={seatIdSpecified}&seatId.in={seatIdIn}&seatId.notIn={seatIdNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&originalTicketId.greaterThan={originalTicketIdGreaterThan}&originalTicketId.lessThan={originalTicketIdLessThan}&originalTicketId.greaterThanOrEqual={originalTicketIdGreaterThanOrEqual}&originalTicketId.lessThanOrEqual={originalTicketIdLessThanOrEqual}&originalTicketId.equals={originalTicketIdEquals}&originalTicketId.notEquals={originalTicketIdNotEquals}&originalTicketId.specified={originalTicketIdSpecified}&originalTicketId.in={originalTicketIdIn}&originalTicketId.notIn={originalTicketIdNotIn}&exchangedTicketId.greaterThan={exchangedTicketIdGreaterThan}&exchangedTicketId.lessThan={exchangedTicketIdLessThan}&exchangedTicketId.greaterThanOrEqual={exchangedTicketIdGreaterThanOrEqual}&exchangedTicketId.lessThanOrEqual={exchangedTicketIdLessThanOrEqual}&exchangedTicketId.equals={exchangedTicketIdEquals}&exchangedTicketId.notEquals={exchangedTicketIdNotEquals}&exchangedTicketId.specified={exchangedTicketIdSpecified}&exchangedTicketId.in={exchangedTicketIdIn}&exchangedTicketId.notIn={exchangedTicketIdNotIn}&bookingId.greaterThan={bookingIdGreaterThan}&bookingId.lessThan={bookingIdLessThan}&bookingId.greaterThanOrEqual={bookingIdGreaterThanOrEqual}&bookingId.lessThanOrEqual={bookingIdLessThanOrEqual}&bookingId.equals={bookingIdEquals}&bookingId.notEquals={bookingIdNotEquals}&bookingId.specified={bookingIdSpecified}&bookingId.in={bookingIdIn}&bookingId.notIn={bookingIdNotIn}&exchangedFromId.greaterThan={exchangedFromIdGreaterThan}&exchangedFromId.lessThan={exchangedFromIdLessThan}&exchangedFromId.greaterThanOrEqual={exchangedFromIdGreaterThanOrEqual}&exchangedFromId.lessThanOrEqual={exchangedFromIdLessThanOrEqual}&exchangedFromId.equals={exchangedFromIdEquals}&exchangedFromId.notEquals={exchangedFromIdNotEquals}&exchangedFromId.specified={exchangedFromIdSpecified}&exchangedFromId.in={exchangedFromIdIn}&exchangedFromId.notIn={exchangedFromIdNotIn}&exchangedToId.greaterThan={exchangedToIdGreaterThan}&exchangedToId.lessThan={exchangedToIdLessThan}&exchangedToId.greaterThanOrEqual={exchangedToIdGreaterThanOrEqual}&exchangedToId.lessThanOrEqual={exchangedToIdLessThanOrEqual}&exchangedToId.equals={exchangedToIdEquals}&exchangedToId.notEquals={exchangedToIdNotEquals}&exchangedToId.specified={exchangedToIdSpecified}&exchangedToId.in={exchangedToIdIn}&exchangedToId.notIn={exchangedToIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countTickets(@QueryMap(encoded=true) CountTicketsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countTickets</code> that receives the query parameters as a map,
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
          *   <li>ticketCodeContains -  (optional)</li>
          *   <li>ticketCodeDoesNotContain -  (optional)</li>
          *   <li>ticketCodeEquals -  (optional)</li>
          *   <li>ticketCodeNotEquals -  (optional)</li>
          *   <li>ticketCodeSpecified -  (optional)</li>
          *   <li>ticketCodeIn -  (optional)</li>
          *   <li>ticketCodeNotIn -  (optional)</li>
          *   <li>priceGreaterThan -  (optional)</li>
          *   <li>priceLessThan -  (optional)</li>
          *   <li>priceGreaterThanOrEqual -  (optional)</li>
          *   <li>priceLessThanOrEqual -  (optional)</li>
          *   <li>priceEquals -  (optional)</li>
          *   <li>priceNotEquals -  (optional)</li>
          *   <li>priceSpecified -  (optional)</li>
          *   <li>priceIn -  (optional)</li>
          *   <li>priceNotIn -  (optional)</li>
          *   <li>timeFromGreaterThan -  (optional)</li>
          *   <li>timeFromLessThan -  (optional)</li>
          *   <li>timeFromGreaterThanOrEqual -  (optional)</li>
          *   <li>timeFromLessThanOrEqual -  (optional)</li>
          *   <li>timeFromEquals -  (optional)</li>
          *   <li>timeFromNotEquals -  (optional)</li>
          *   <li>timeFromSpecified -  (optional)</li>
          *   <li>timeFromIn -  (optional)</li>
          *   <li>timeFromNotIn -  (optional)</li>
          *   <li>timeToGreaterThan -  (optional)</li>
          *   <li>timeToLessThan -  (optional)</li>
          *   <li>timeToGreaterThanOrEqual -  (optional)</li>
          *   <li>timeToLessThanOrEqual -  (optional)</li>
          *   <li>timeToEquals -  (optional)</li>
          *   <li>timeToNotEquals -  (optional)</li>
          *   <li>timeToSpecified -  (optional)</li>
          *   <li>timeToIn -  (optional)</li>
          *   <li>timeToNotIn -  (optional)</li>
          *   <li>checkedInEquals -  (optional)</li>
          *   <li>checkedInNotEquals -  (optional)</li>
          *   <li>checkedInSpecified -  (optional)</li>
          *   <li>checkedInIn -  (optional)</li>
          *   <li>checkedInNotIn -  (optional)</li>
          *   <li>statusEquals -  (optional)</li>
          *   <li>statusNotEquals -  (optional)</li>
          *   <li>statusSpecified -  (optional)</li>
          *   <li>statusIn -  (optional)</li>
          *   <li>statusNotIn -  (optional)</li>
          *   <li>refundStatusEquals -  (optional)</li>
          *   <li>refundStatusNotEquals -  (optional)</li>
          *   <li>refundStatusSpecified -  (optional)</li>
          *   <li>refundStatusIn -  (optional)</li>
          *   <li>refundStatusNotIn -  (optional)</li>
          *   <li>refundReasonContains -  (optional)</li>
          *   <li>refundReasonDoesNotContain -  (optional)</li>
          *   <li>refundReasonEquals -  (optional)</li>
          *   <li>refundReasonNotEquals -  (optional)</li>
          *   <li>refundReasonSpecified -  (optional)</li>
          *   <li>refundReasonIn -  (optional)</li>
          *   <li>refundReasonNotIn -  (optional)</li>
          *   <li>refundRequestedAtGreaterThan -  (optional)</li>
          *   <li>refundRequestedAtLessThan -  (optional)</li>
          *   <li>refundRequestedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>refundRequestedAtLessThanOrEqual -  (optional)</li>
          *   <li>refundRequestedAtEquals -  (optional)</li>
          *   <li>refundRequestedAtNotEquals -  (optional)</li>
          *   <li>refundRequestedAtSpecified -  (optional)</li>
          *   <li>refundRequestedAtIn -  (optional)</li>
          *   <li>refundRequestedAtNotIn -  (optional)</li>
          *   <li>refundCompletedAtGreaterThan -  (optional)</li>
          *   <li>refundCompletedAtLessThan -  (optional)</li>
          *   <li>refundCompletedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>refundCompletedAtLessThanOrEqual -  (optional)</li>
          *   <li>refundCompletedAtEquals -  (optional)</li>
          *   <li>refundCompletedAtNotEquals -  (optional)</li>
          *   <li>refundCompletedAtSpecified -  (optional)</li>
          *   <li>refundCompletedAtIn -  (optional)</li>
          *   <li>refundCompletedAtNotIn -  (optional)</li>
          *   <li>refundAmountGreaterThan -  (optional)</li>
          *   <li>refundAmountLessThan -  (optional)</li>
          *   <li>refundAmountGreaterThanOrEqual -  (optional)</li>
          *   <li>refundAmountLessThanOrEqual -  (optional)</li>
          *   <li>refundAmountEquals -  (optional)</li>
          *   <li>refundAmountNotEquals -  (optional)</li>
          *   <li>refundAmountSpecified -  (optional)</li>
          *   <li>refundAmountIn -  (optional)</li>
          *   <li>refundAmountNotIn -  (optional)</li>
          *   <li>refundTransactionIdContains -  (optional)</li>
          *   <li>refundTransactionIdDoesNotContain -  (optional)</li>
          *   <li>refundTransactionIdEquals -  (optional)</li>
          *   <li>refundTransactionIdNotEquals -  (optional)</li>
          *   <li>refundTransactionIdSpecified -  (optional)</li>
          *   <li>refundTransactionIdIn -  (optional)</li>
          *   <li>refundTransactionIdNotIn -  (optional)</li>
          *   <li>tripIdGreaterThan -  (optional)</li>
          *   <li>tripIdLessThan -  (optional)</li>
          *   <li>tripIdGreaterThanOrEqual -  (optional)</li>
          *   <li>tripIdLessThanOrEqual -  (optional)</li>
          *   <li>tripIdEquals -  (optional)</li>
          *   <li>tripIdNotEquals -  (optional)</li>
          *   <li>tripIdSpecified -  (optional)</li>
          *   <li>tripIdIn -  (optional)</li>
          *   <li>tripIdNotIn -  (optional)</li>
          *   <li>routeIdGreaterThan -  (optional)</li>
          *   <li>routeIdLessThan -  (optional)</li>
          *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
          *   <li>routeIdLessThanOrEqual -  (optional)</li>
          *   <li>routeIdEquals -  (optional)</li>
          *   <li>routeIdNotEquals -  (optional)</li>
          *   <li>routeIdSpecified -  (optional)</li>
          *   <li>routeIdIn -  (optional)</li>
          *   <li>routeIdNotIn -  (optional)</li>
          *   <li>seatIdGreaterThan -  (optional)</li>
          *   <li>seatIdLessThan -  (optional)</li>
          *   <li>seatIdGreaterThanOrEqual -  (optional)</li>
          *   <li>seatIdLessThanOrEqual -  (optional)</li>
          *   <li>seatIdEquals -  (optional)</li>
          *   <li>seatIdNotEquals -  (optional)</li>
          *   <li>seatIdSpecified -  (optional)</li>
          *   <li>seatIdIn -  (optional)</li>
          *   <li>seatIdNotIn -  (optional)</li>
          *   <li>createdAtGreaterThan -  (optional)</li>
          *   <li>createdAtLessThan -  (optional)</li>
          *   <li>createdAtGreaterThanOrEqual -  (optional)</li>
          *   <li>createdAtLessThanOrEqual -  (optional)</li>
          *   <li>createdAtEquals -  (optional)</li>
          *   <li>createdAtNotEquals -  (optional)</li>
          *   <li>createdAtSpecified -  (optional)</li>
          *   <li>createdAtIn -  (optional)</li>
          *   <li>createdAtNotIn -  (optional)</li>
          *   <li>isDeletedEquals -  (optional)</li>
          *   <li>isDeletedNotEquals -  (optional)</li>
          *   <li>isDeletedSpecified -  (optional)</li>
          *   <li>isDeletedIn -  (optional)</li>
          *   <li>isDeletedNotIn -  (optional)</li>
          *   <li>deletedByEquals -  (optional)</li>
          *   <li>deletedByNotEquals -  (optional)</li>
          *   <li>deletedBySpecified -  (optional)</li>
          *   <li>deletedByIn -  (optional)</li>
          *   <li>deletedByNotIn -  (optional)</li>
          *   <li>originalTicketIdGreaterThan -  (optional)</li>
          *   <li>originalTicketIdLessThan -  (optional)</li>
          *   <li>originalTicketIdGreaterThanOrEqual -  (optional)</li>
          *   <li>originalTicketIdLessThanOrEqual -  (optional)</li>
          *   <li>originalTicketIdEquals -  (optional)</li>
          *   <li>originalTicketIdNotEquals -  (optional)</li>
          *   <li>originalTicketIdSpecified -  (optional)</li>
          *   <li>originalTicketIdIn -  (optional)</li>
          *   <li>originalTicketIdNotIn -  (optional)</li>
          *   <li>exchangedTicketIdGreaterThan -  (optional)</li>
          *   <li>exchangedTicketIdLessThan -  (optional)</li>
          *   <li>exchangedTicketIdGreaterThanOrEqual -  (optional)</li>
          *   <li>exchangedTicketIdLessThanOrEqual -  (optional)</li>
          *   <li>exchangedTicketIdEquals -  (optional)</li>
          *   <li>exchangedTicketIdNotEquals -  (optional)</li>
          *   <li>exchangedTicketIdSpecified -  (optional)</li>
          *   <li>exchangedTicketIdIn -  (optional)</li>
          *   <li>exchangedTicketIdNotIn -  (optional)</li>
          *   <li>bookingIdGreaterThan -  (optional)</li>
          *   <li>bookingIdLessThan -  (optional)</li>
          *   <li>bookingIdGreaterThanOrEqual -  (optional)</li>
          *   <li>bookingIdLessThanOrEqual -  (optional)</li>
          *   <li>bookingIdEquals -  (optional)</li>
          *   <li>bookingIdNotEquals -  (optional)</li>
          *   <li>bookingIdSpecified -  (optional)</li>
          *   <li>bookingIdIn -  (optional)</li>
          *   <li>bookingIdNotIn -  (optional)</li>
          *   <li>exchangedFromIdGreaterThan -  (optional)</li>
          *   <li>exchangedFromIdLessThan -  (optional)</li>
          *   <li>exchangedFromIdGreaterThanOrEqual -  (optional)</li>
          *   <li>exchangedFromIdLessThanOrEqual -  (optional)</li>
          *   <li>exchangedFromIdEquals -  (optional)</li>
          *   <li>exchangedFromIdNotEquals -  (optional)</li>
          *   <li>exchangedFromIdSpecified -  (optional)</li>
          *   <li>exchangedFromIdIn -  (optional)</li>
          *   <li>exchangedFromIdNotIn -  (optional)</li>
          *   <li>exchangedToIdGreaterThan -  (optional)</li>
          *   <li>exchangedToIdLessThan -  (optional)</li>
          *   <li>exchangedToIdGreaterThanOrEqual -  (optional)</li>
          *   <li>exchangedToIdLessThanOrEqual -  (optional)</li>
          *   <li>exchangedToIdEquals -  (optional)</li>
          *   <li>exchangedToIdNotEquals -  (optional)</li>
          *   <li>exchangedToIdSpecified -  (optional)</li>
          *   <li>exchangedToIdIn -  (optional)</li>
          *   <li>exchangedToIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return Long
      */
      @RequestLine("GET /api/tickets/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&ticketCode.contains={ticketCodeContains}&ticketCode.doesNotContain={ticketCodeDoesNotContain}&ticketCode.equals={ticketCodeEquals}&ticketCode.notEquals={ticketCodeNotEquals}&ticketCode.specified={ticketCodeSpecified}&ticketCode.in={ticketCodeIn}&ticketCode.notIn={ticketCodeNotIn}&price.greaterThan={priceGreaterThan}&price.lessThan={priceLessThan}&price.greaterThanOrEqual={priceGreaterThanOrEqual}&price.lessThanOrEqual={priceLessThanOrEqual}&price.equals={priceEquals}&price.notEquals={priceNotEquals}&price.specified={priceSpecified}&price.in={priceIn}&price.notIn={priceNotIn}&timeFrom.greaterThan={timeFromGreaterThan}&timeFrom.lessThan={timeFromLessThan}&timeFrom.greaterThanOrEqual={timeFromGreaterThanOrEqual}&timeFrom.lessThanOrEqual={timeFromLessThanOrEqual}&timeFrom.equals={timeFromEquals}&timeFrom.notEquals={timeFromNotEquals}&timeFrom.specified={timeFromSpecified}&timeFrom.in={timeFromIn}&timeFrom.notIn={timeFromNotIn}&timeTo.greaterThan={timeToGreaterThan}&timeTo.lessThan={timeToLessThan}&timeTo.greaterThanOrEqual={timeToGreaterThanOrEqual}&timeTo.lessThanOrEqual={timeToLessThanOrEqual}&timeTo.equals={timeToEquals}&timeTo.notEquals={timeToNotEquals}&timeTo.specified={timeToSpecified}&timeTo.in={timeToIn}&timeTo.notIn={timeToNotIn}&checkedIn.equals={checkedInEquals}&checkedIn.notEquals={checkedInNotEquals}&checkedIn.specified={checkedInSpecified}&checkedIn.in={checkedInIn}&checkedIn.notIn={checkedInNotIn}&status.equals={statusEquals}&status.notEquals={statusNotEquals}&status.specified={statusSpecified}&status.in={statusIn}&status.notIn={statusNotIn}&refundStatus.equals={refundStatusEquals}&refundStatus.notEquals={refundStatusNotEquals}&refundStatus.specified={refundStatusSpecified}&refundStatus.in={refundStatusIn}&refundStatus.notIn={refundStatusNotIn}&refundReason.contains={refundReasonContains}&refundReason.doesNotContain={refundReasonDoesNotContain}&refundReason.equals={refundReasonEquals}&refundReason.notEquals={refundReasonNotEquals}&refundReason.specified={refundReasonSpecified}&refundReason.in={refundReasonIn}&refundReason.notIn={refundReasonNotIn}&refundRequestedAt.greaterThan={refundRequestedAtGreaterThan}&refundRequestedAt.lessThan={refundRequestedAtLessThan}&refundRequestedAt.greaterThanOrEqual={refundRequestedAtGreaterThanOrEqual}&refundRequestedAt.lessThanOrEqual={refundRequestedAtLessThanOrEqual}&refundRequestedAt.equals={refundRequestedAtEquals}&refundRequestedAt.notEquals={refundRequestedAtNotEquals}&refundRequestedAt.specified={refundRequestedAtSpecified}&refundRequestedAt.in={refundRequestedAtIn}&refundRequestedAt.notIn={refundRequestedAtNotIn}&refundCompletedAt.greaterThan={refundCompletedAtGreaterThan}&refundCompletedAt.lessThan={refundCompletedAtLessThan}&refundCompletedAt.greaterThanOrEqual={refundCompletedAtGreaterThanOrEqual}&refundCompletedAt.lessThanOrEqual={refundCompletedAtLessThanOrEqual}&refundCompletedAt.equals={refundCompletedAtEquals}&refundCompletedAt.notEquals={refundCompletedAtNotEquals}&refundCompletedAt.specified={refundCompletedAtSpecified}&refundCompletedAt.in={refundCompletedAtIn}&refundCompletedAt.notIn={refundCompletedAtNotIn}&refundAmount.greaterThan={refundAmountGreaterThan}&refundAmount.lessThan={refundAmountLessThan}&refundAmount.greaterThanOrEqual={refundAmountGreaterThanOrEqual}&refundAmount.lessThanOrEqual={refundAmountLessThanOrEqual}&refundAmount.equals={refundAmountEquals}&refundAmount.notEquals={refundAmountNotEquals}&refundAmount.specified={refundAmountSpecified}&refundAmount.in={refundAmountIn}&refundAmount.notIn={refundAmountNotIn}&refundTransactionId.contains={refundTransactionIdContains}&refundTransactionId.doesNotContain={refundTransactionIdDoesNotContain}&refundTransactionId.equals={refundTransactionIdEquals}&refundTransactionId.notEquals={refundTransactionIdNotEquals}&refundTransactionId.specified={refundTransactionIdSpecified}&refundTransactionId.in={refundTransactionIdIn}&refundTransactionId.notIn={refundTransactionIdNotIn}&tripId.greaterThan={tripIdGreaterThan}&tripId.lessThan={tripIdLessThan}&tripId.greaterThanOrEqual={tripIdGreaterThanOrEqual}&tripId.lessThanOrEqual={tripIdLessThanOrEqual}&tripId.equals={tripIdEquals}&tripId.notEquals={tripIdNotEquals}&tripId.specified={tripIdSpecified}&tripId.in={tripIdIn}&tripId.notIn={tripIdNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&seatId.greaterThan={seatIdGreaterThan}&seatId.lessThan={seatIdLessThan}&seatId.greaterThanOrEqual={seatIdGreaterThanOrEqual}&seatId.lessThanOrEqual={seatIdLessThanOrEqual}&seatId.equals={seatIdEquals}&seatId.notEquals={seatIdNotEquals}&seatId.specified={seatIdSpecified}&seatId.in={seatIdIn}&seatId.notIn={seatIdNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&originalTicketId.greaterThan={originalTicketIdGreaterThan}&originalTicketId.lessThan={originalTicketIdLessThan}&originalTicketId.greaterThanOrEqual={originalTicketIdGreaterThanOrEqual}&originalTicketId.lessThanOrEqual={originalTicketIdLessThanOrEqual}&originalTicketId.equals={originalTicketIdEquals}&originalTicketId.notEquals={originalTicketIdNotEquals}&originalTicketId.specified={originalTicketIdSpecified}&originalTicketId.in={originalTicketIdIn}&originalTicketId.notIn={originalTicketIdNotIn}&exchangedTicketId.greaterThan={exchangedTicketIdGreaterThan}&exchangedTicketId.lessThan={exchangedTicketIdLessThan}&exchangedTicketId.greaterThanOrEqual={exchangedTicketIdGreaterThanOrEqual}&exchangedTicketId.lessThanOrEqual={exchangedTicketIdLessThanOrEqual}&exchangedTicketId.equals={exchangedTicketIdEquals}&exchangedTicketId.notEquals={exchangedTicketIdNotEquals}&exchangedTicketId.specified={exchangedTicketIdSpecified}&exchangedTicketId.in={exchangedTicketIdIn}&exchangedTicketId.notIn={exchangedTicketIdNotIn}&bookingId.greaterThan={bookingIdGreaterThan}&bookingId.lessThan={bookingIdLessThan}&bookingId.greaterThanOrEqual={bookingIdGreaterThanOrEqual}&bookingId.lessThanOrEqual={bookingIdLessThanOrEqual}&bookingId.equals={bookingIdEquals}&bookingId.notEquals={bookingIdNotEquals}&bookingId.specified={bookingIdSpecified}&bookingId.in={bookingIdIn}&bookingId.notIn={bookingIdNotIn}&exchangedFromId.greaterThan={exchangedFromIdGreaterThan}&exchangedFromId.lessThan={exchangedFromIdLessThan}&exchangedFromId.greaterThanOrEqual={exchangedFromIdGreaterThanOrEqual}&exchangedFromId.lessThanOrEqual={exchangedFromIdLessThanOrEqual}&exchangedFromId.equals={exchangedFromIdEquals}&exchangedFromId.notEquals={exchangedFromIdNotEquals}&exchangedFromId.specified={exchangedFromIdSpecified}&exchangedFromId.in={exchangedFromIdIn}&exchangedFromId.notIn={exchangedFromIdNotIn}&exchangedToId.greaterThan={exchangedToIdGreaterThan}&exchangedToId.lessThan={exchangedToIdLessThan}&exchangedToId.greaterThanOrEqual={exchangedToIdGreaterThanOrEqual}&exchangedToId.lessThanOrEqual={exchangedToIdLessThanOrEqual}&exchangedToId.equals={exchangedToIdEquals}&exchangedToId.notEquals={exchangedToIdNotEquals}&exchangedToId.specified={exchangedToIdSpecified}&exchangedToId.in={exchangedToIdIn}&exchangedToId.notIn={exchangedToIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countTicketsWithHttpInfo(@QueryMap(encoded=true) CountTicketsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countTickets</code> method in a fluent style.
   */
  public static class CountTicketsQueryParams extends HashMap<String, Object> {
    public CountTicketsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams ticketCodeContains(@jakarta.annotation.Nullable final String value) {
      put("ticketCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams ticketCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("ticketCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams ticketCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("ticketCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams ticketCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("ticketCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams ticketCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("ticketCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams ticketCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("ticketCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams ticketCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("ticketCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams priceGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("price.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams priceLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("price.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams priceGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("price.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams priceLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("price.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams priceEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("price.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams priceNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("price.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams priceSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("price.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams priceIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("price.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams priceNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("price.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams timeFromGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeFrom.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams timeFromLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeFrom.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams timeFromGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeFrom.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams timeFromLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeFrom.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams timeFromEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeFrom.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams timeFromNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeFrom.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams timeFromSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("timeFrom.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams timeFromIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("timeFrom.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams timeFromNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("timeFrom.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams timeToGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeTo.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams timeToLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeTo.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams timeToGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeTo.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams timeToLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeTo.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams timeToEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeTo.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams timeToNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeTo.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams timeToSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("timeTo.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams timeToIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("timeTo.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams timeToNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("timeTo.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams checkedInEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("checkedIn.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams checkedInNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("checkedIn.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams checkedInSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("checkedIn.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams checkedInIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("checkedIn.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams checkedInNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("checkedIn.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams statusEquals(@jakarta.annotation.Nullable final String value) {
      put("status.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams statusNotEquals(@jakarta.annotation.Nullable final String value) {
      put("status.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams statusSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("status.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams statusIn(@jakarta.annotation.Nullable final List<String> value) {
      put("status.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams statusNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("status.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams refundStatusEquals(@jakarta.annotation.Nullable final String value) {
      put("refundStatus.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundStatusNotEquals(@jakarta.annotation.Nullable final String value) {
      put("refundStatus.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundStatusSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("refundStatus.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundStatusIn(@jakarta.annotation.Nullable final List<String> value) {
      put("refundStatus.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams refundStatusNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("refundStatus.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams refundReasonContains(@jakarta.annotation.Nullable final String value) {
      put("refundReason.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundReasonDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("refundReason.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundReasonEquals(@jakarta.annotation.Nullable final String value) {
      put("refundReason.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundReasonNotEquals(@jakarta.annotation.Nullable final String value) {
      put("refundReason.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundReasonSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("refundReason.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundReasonIn(@jakarta.annotation.Nullable final List<String> value) {
      put("refundReason.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams refundReasonNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("refundReason.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams refundRequestedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundRequestedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundRequestedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundRequestedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundRequestedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundRequestedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundRequestedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundRequestedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundRequestedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundRequestedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundRequestedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundRequestedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundRequestedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("refundRequestedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundRequestedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("refundRequestedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams refundRequestedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("refundRequestedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams refundCompletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundCompletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundCompletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundCompletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundCompletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundCompletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundCompletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundCompletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundCompletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundCompletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundCompletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundCompletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundCompletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("refundCompletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundCompletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("refundCompletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams refundCompletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("refundCompletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams refundAmountGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("refundAmount.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundAmountLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("refundAmount.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundAmountGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("refundAmount.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundAmountLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("refundAmount.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundAmountEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("refundAmount.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundAmountNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("refundAmount.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundAmountSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("refundAmount.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundAmountIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("refundAmount.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams refundAmountNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("refundAmount.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams refundTransactionIdContains(@jakarta.annotation.Nullable final String value) {
      put("refundTransactionId.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundTransactionIdDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("refundTransactionId.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundTransactionIdEquals(@jakarta.annotation.Nullable final String value) {
      put("refundTransactionId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundTransactionIdNotEquals(@jakarta.annotation.Nullable final String value) {
      put("refundTransactionId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundTransactionIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("refundTransactionId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams refundTransactionIdIn(@jakarta.annotation.Nullable final List<String> value) {
      put("refundTransactionId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams refundTransactionIdNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("refundTransactionId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams tripIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("tripId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams tripIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("tripId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams tripIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("tripId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams tripIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("tripId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams tripIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("tripId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams tripIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("tripId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams tripIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("tripId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams tripIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("tripId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams tripIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("tripId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams routeIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams routeIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams routeIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams routeIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams routeIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams routeIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams routeIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("routeId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams routeIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams routeIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams seatIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("seatId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams seatIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("seatId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams seatIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("seatId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams seatIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("seatId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams seatIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("seatId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams seatIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("seatId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams seatIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("seatId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams seatIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("seatId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams seatIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("seatId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams originalTicketIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("originalTicketId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams originalTicketIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("originalTicketId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams originalTicketIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("originalTicketId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams originalTicketIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("originalTicketId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams originalTicketIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("originalTicketId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams originalTicketIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("originalTicketId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams originalTicketIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("originalTicketId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams originalTicketIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("originalTicketId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams originalTicketIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("originalTicketId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams exchangedTicketIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("exchangedTicketId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedTicketIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("exchangedTicketId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedTicketIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("exchangedTicketId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedTicketIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("exchangedTicketId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedTicketIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("exchangedTicketId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedTicketIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("exchangedTicketId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedTicketIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("exchangedTicketId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedTicketIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("exchangedTicketId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams exchangedTicketIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("exchangedTicketId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams bookingIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams bookingIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams bookingIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams bookingIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams bookingIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams bookingIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams bookingIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("bookingId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams bookingIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("bookingId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams bookingIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("bookingId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams exchangedFromIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("exchangedFromId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedFromIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("exchangedFromId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedFromIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("exchangedFromId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedFromIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("exchangedFromId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedFromIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("exchangedFromId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedFromIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("exchangedFromId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedFromIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("exchangedFromId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedFromIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("exchangedFromId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams exchangedFromIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("exchangedFromId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams exchangedToIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("exchangedToId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedToIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("exchangedToId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedToIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("exchangedToId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedToIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("exchangedToId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedToIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("exchangedToId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedToIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("exchangedToId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedToIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("exchangedToId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTicketsQueryParams exchangedToIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("exchangedToId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams exchangedToIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("exchangedToId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTicketsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param ticketDTO  (required)
   * @return TicketDTO
   */
  @RequestLine("POST /api/tickets")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TicketDTO createTicket(@jakarta.annotation.Nonnull TicketDTO ticketDTO);

  /**
   * 
   * Similar to <code>createTicket</code> but it also returns the http response headers .
   * 
   * @param ticketDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/tickets")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TicketDTO> createTicketWithHttpInfo(@jakarta.annotation.Nonnull TicketDTO ticketDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/tickets/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTicket(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deleteTicket</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/tickets/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTicketWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param code  (required)
   * @param ticketExchangeRequestDTO  (required)
   * @return TicketOperationResponseDTO
   */
  @RequestLine("POST /api/tickets/{code}/exchange")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TicketOperationResponseDTO exchangeTicket(@Param("code") @jakarta.annotation.Nonnull String code, @jakarta.annotation.Nonnull TicketExchangeRequestDTO ticketExchangeRequestDTO);

  /**
   * 
   * Similar to <code>exchangeTicket</code> but it also returns the http response headers .
   * 
   * @param code  (required)
   * @param ticketExchangeRequestDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/tickets/{code}/exchange")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TicketOperationResponseDTO> exchangeTicketWithHttpInfo(@Param("code") @jakarta.annotation.Nonnull String code, @jakarta.annotation.Nonnull TicketExchangeRequestDTO ticketExchangeRequestDTO);



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
   * @param ticketCodeContains  (optional)
   * @param ticketCodeDoesNotContain  (optional)
   * @param ticketCodeEquals  (optional)
   * @param ticketCodeNotEquals  (optional)
   * @param ticketCodeSpecified  (optional)
   * @param ticketCodeIn  (optional)
   * @param ticketCodeNotIn  (optional)
   * @param priceGreaterThan  (optional)
   * @param priceLessThan  (optional)
   * @param priceGreaterThanOrEqual  (optional)
   * @param priceLessThanOrEqual  (optional)
   * @param priceEquals  (optional)
   * @param priceNotEquals  (optional)
   * @param priceSpecified  (optional)
   * @param priceIn  (optional)
   * @param priceNotIn  (optional)
   * @param timeFromGreaterThan  (optional)
   * @param timeFromLessThan  (optional)
   * @param timeFromGreaterThanOrEqual  (optional)
   * @param timeFromLessThanOrEqual  (optional)
   * @param timeFromEquals  (optional)
   * @param timeFromNotEquals  (optional)
   * @param timeFromSpecified  (optional)
   * @param timeFromIn  (optional)
   * @param timeFromNotIn  (optional)
   * @param timeToGreaterThan  (optional)
   * @param timeToLessThan  (optional)
   * @param timeToGreaterThanOrEqual  (optional)
   * @param timeToLessThanOrEqual  (optional)
   * @param timeToEquals  (optional)
   * @param timeToNotEquals  (optional)
   * @param timeToSpecified  (optional)
   * @param timeToIn  (optional)
   * @param timeToNotIn  (optional)
   * @param checkedInEquals  (optional)
   * @param checkedInNotEquals  (optional)
   * @param checkedInSpecified  (optional)
   * @param checkedInIn  (optional)
   * @param checkedInNotIn  (optional)
   * @param statusEquals  (optional)
   * @param statusNotEquals  (optional)
   * @param statusSpecified  (optional)
   * @param statusIn  (optional)
   * @param statusNotIn  (optional)
   * @param refundStatusEquals  (optional)
   * @param refundStatusNotEquals  (optional)
   * @param refundStatusSpecified  (optional)
   * @param refundStatusIn  (optional)
   * @param refundStatusNotIn  (optional)
   * @param refundReasonContains  (optional)
   * @param refundReasonDoesNotContain  (optional)
   * @param refundReasonEquals  (optional)
   * @param refundReasonNotEquals  (optional)
   * @param refundReasonSpecified  (optional)
   * @param refundReasonIn  (optional)
   * @param refundReasonNotIn  (optional)
   * @param refundRequestedAtGreaterThan  (optional)
   * @param refundRequestedAtLessThan  (optional)
   * @param refundRequestedAtGreaterThanOrEqual  (optional)
   * @param refundRequestedAtLessThanOrEqual  (optional)
   * @param refundRequestedAtEquals  (optional)
   * @param refundRequestedAtNotEquals  (optional)
   * @param refundRequestedAtSpecified  (optional)
   * @param refundRequestedAtIn  (optional)
   * @param refundRequestedAtNotIn  (optional)
   * @param refundCompletedAtGreaterThan  (optional)
   * @param refundCompletedAtLessThan  (optional)
   * @param refundCompletedAtGreaterThanOrEqual  (optional)
   * @param refundCompletedAtLessThanOrEqual  (optional)
   * @param refundCompletedAtEquals  (optional)
   * @param refundCompletedAtNotEquals  (optional)
   * @param refundCompletedAtSpecified  (optional)
   * @param refundCompletedAtIn  (optional)
   * @param refundCompletedAtNotIn  (optional)
   * @param refundAmountGreaterThan  (optional)
   * @param refundAmountLessThan  (optional)
   * @param refundAmountGreaterThanOrEqual  (optional)
   * @param refundAmountLessThanOrEqual  (optional)
   * @param refundAmountEquals  (optional)
   * @param refundAmountNotEquals  (optional)
   * @param refundAmountSpecified  (optional)
   * @param refundAmountIn  (optional)
   * @param refundAmountNotIn  (optional)
   * @param refundTransactionIdContains  (optional)
   * @param refundTransactionIdDoesNotContain  (optional)
   * @param refundTransactionIdEquals  (optional)
   * @param refundTransactionIdNotEquals  (optional)
   * @param refundTransactionIdSpecified  (optional)
   * @param refundTransactionIdIn  (optional)
   * @param refundTransactionIdNotIn  (optional)
   * @param tripIdGreaterThan  (optional)
   * @param tripIdLessThan  (optional)
   * @param tripIdGreaterThanOrEqual  (optional)
   * @param tripIdLessThanOrEqual  (optional)
   * @param tripIdEquals  (optional)
   * @param tripIdNotEquals  (optional)
   * @param tripIdSpecified  (optional)
   * @param tripIdIn  (optional)
   * @param tripIdNotIn  (optional)
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param seatIdGreaterThan  (optional)
   * @param seatIdLessThan  (optional)
   * @param seatIdGreaterThanOrEqual  (optional)
   * @param seatIdLessThanOrEqual  (optional)
   * @param seatIdEquals  (optional)
   * @param seatIdNotEquals  (optional)
   * @param seatIdSpecified  (optional)
   * @param seatIdIn  (optional)
   * @param seatIdNotIn  (optional)
   * @param createdAtGreaterThan  (optional)
   * @param createdAtLessThan  (optional)
   * @param createdAtGreaterThanOrEqual  (optional)
   * @param createdAtLessThanOrEqual  (optional)
   * @param createdAtEquals  (optional)
   * @param createdAtNotEquals  (optional)
   * @param createdAtSpecified  (optional)
   * @param createdAtIn  (optional)
   * @param createdAtNotIn  (optional)
   * @param isDeletedEquals  (optional)
   * @param isDeletedNotEquals  (optional)
   * @param isDeletedSpecified  (optional)
   * @param isDeletedIn  (optional)
   * @param isDeletedNotIn  (optional)
   * @param deletedByEquals  (optional)
   * @param deletedByNotEquals  (optional)
   * @param deletedBySpecified  (optional)
   * @param deletedByIn  (optional)
   * @param deletedByNotIn  (optional)
   * @param originalTicketIdGreaterThan  (optional)
   * @param originalTicketIdLessThan  (optional)
   * @param originalTicketIdGreaterThanOrEqual  (optional)
   * @param originalTicketIdLessThanOrEqual  (optional)
   * @param originalTicketIdEquals  (optional)
   * @param originalTicketIdNotEquals  (optional)
   * @param originalTicketIdSpecified  (optional)
   * @param originalTicketIdIn  (optional)
   * @param originalTicketIdNotIn  (optional)
   * @param exchangedTicketIdGreaterThan  (optional)
   * @param exchangedTicketIdLessThan  (optional)
   * @param exchangedTicketIdGreaterThanOrEqual  (optional)
   * @param exchangedTicketIdLessThanOrEqual  (optional)
   * @param exchangedTicketIdEquals  (optional)
   * @param exchangedTicketIdNotEquals  (optional)
   * @param exchangedTicketIdSpecified  (optional)
   * @param exchangedTicketIdIn  (optional)
   * @param exchangedTicketIdNotIn  (optional)
   * @param bookingIdGreaterThan  (optional)
   * @param bookingIdLessThan  (optional)
   * @param bookingIdGreaterThanOrEqual  (optional)
   * @param bookingIdLessThanOrEqual  (optional)
   * @param bookingIdEquals  (optional)
   * @param bookingIdNotEquals  (optional)
   * @param bookingIdSpecified  (optional)
   * @param bookingIdIn  (optional)
   * @param bookingIdNotIn  (optional)
   * @param exchangedFromIdGreaterThan  (optional)
   * @param exchangedFromIdLessThan  (optional)
   * @param exchangedFromIdGreaterThanOrEqual  (optional)
   * @param exchangedFromIdLessThanOrEqual  (optional)
   * @param exchangedFromIdEquals  (optional)
   * @param exchangedFromIdNotEquals  (optional)
   * @param exchangedFromIdSpecified  (optional)
   * @param exchangedFromIdIn  (optional)
   * @param exchangedFromIdNotIn  (optional)
   * @param exchangedToIdGreaterThan  (optional)
   * @param exchangedToIdLessThan  (optional)
   * @param exchangedToIdGreaterThanOrEqual  (optional)
   * @param exchangedToIdLessThanOrEqual  (optional)
   * @param exchangedToIdEquals  (optional)
   * @param exchangedToIdNotEquals  (optional)
   * @param exchangedToIdSpecified  (optional)
   * @param exchangedToIdIn  (optional)
   * @param exchangedToIdNotIn  (optional)
   * @param distinct  (optional)
   * @return List&lt;TicketDTO&gt;
   */
  @RequestLine("GET /api/tickets?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&ticketCode.contains={ticketCodeContains}&ticketCode.doesNotContain={ticketCodeDoesNotContain}&ticketCode.equals={ticketCodeEquals}&ticketCode.notEquals={ticketCodeNotEquals}&ticketCode.specified={ticketCodeSpecified}&ticketCode.in={ticketCodeIn}&ticketCode.notIn={ticketCodeNotIn}&price.greaterThan={priceGreaterThan}&price.lessThan={priceLessThan}&price.greaterThanOrEqual={priceGreaterThanOrEqual}&price.lessThanOrEqual={priceLessThanOrEqual}&price.equals={priceEquals}&price.notEquals={priceNotEquals}&price.specified={priceSpecified}&price.in={priceIn}&price.notIn={priceNotIn}&timeFrom.greaterThan={timeFromGreaterThan}&timeFrom.lessThan={timeFromLessThan}&timeFrom.greaterThanOrEqual={timeFromGreaterThanOrEqual}&timeFrom.lessThanOrEqual={timeFromLessThanOrEqual}&timeFrom.equals={timeFromEquals}&timeFrom.notEquals={timeFromNotEquals}&timeFrom.specified={timeFromSpecified}&timeFrom.in={timeFromIn}&timeFrom.notIn={timeFromNotIn}&timeTo.greaterThan={timeToGreaterThan}&timeTo.lessThan={timeToLessThan}&timeTo.greaterThanOrEqual={timeToGreaterThanOrEqual}&timeTo.lessThanOrEqual={timeToLessThanOrEqual}&timeTo.equals={timeToEquals}&timeTo.notEquals={timeToNotEquals}&timeTo.specified={timeToSpecified}&timeTo.in={timeToIn}&timeTo.notIn={timeToNotIn}&checkedIn.equals={checkedInEquals}&checkedIn.notEquals={checkedInNotEquals}&checkedIn.specified={checkedInSpecified}&checkedIn.in={checkedInIn}&checkedIn.notIn={checkedInNotIn}&status.equals={statusEquals}&status.notEquals={statusNotEquals}&status.specified={statusSpecified}&status.in={statusIn}&status.notIn={statusNotIn}&refundStatus.equals={refundStatusEquals}&refundStatus.notEquals={refundStatusNotEquals}&refundStatus.specified={refundStatusSpecified}&refundStatus.in={refundStatusIn}&refundStatus.notIn={refundStatusNotIn}&refundReason.contains={refundReasonContains}&refundReason.doesNotContain={refundReasonDoesNotContain}&refundReason.equals={refundReasonEquals}&refundReason.notEquals={refundReasonNotEquals}&refundReason.specified={refundReasonSpecified}&refundReason.in={refundReasonIn}&refundReason.notIn={refundReasonNotIn}&refundRequestedAt.greaterThan={refundRequestedAtGreaterThan}&refundRequestedAt.lessThan={refundRequestedAtLessThan}&refundRequestedAt.greaterThanOrEqual={refundRequestedAtGreaterThanOrEqual}&refundRequestedAt.lessThanOrEqual={refundRequestedAtLessThanOrEqual}&refundRequestedAt.equals={refundRequestedAtEquals}&refundRequestedAt.notEquals={refundRequestedAtNotEquals}&refundRequestedAt.specified={refundRequestedAtSpecified}&refundRequestedAt.in={refundRequestedAtIn}&refundRequestedAt.notIn={refundRequestedAtNotIn}&refundCompletedAt.greaterThan={refundCompletedAtGreaterThan}&refundCompletedAt.lessThan={refundCompletedAtLessThan}&refundCompletedAt.greaterThanOrEqual={refundCompletedAtGreaterThanOrEqual}&refundCompletedAt.lessThanOrEqual={refundCompletedAtLessThanOrEqual}&refundCompletedAt.equals={refundCompletedAtEquals}&refundCompletedAt.notEquals={refundCompletedAtNotEquals}&refundCompletedAt.specified={refundCompletedAtSpecified}&refundCompletedAt.in={refundCompletedAtIn}&refundCompletedAt.notIn={refundCompletedAtNotIn}&refundAmount.greaterThan={refundAmountGreaterThan}&refundAmount.lessThan={refundAmountLessThan}&refundAmount.greaterThanOrEqual={refundAmountGreaterThanOrEqual}&refundAmount.lessThanOrEqual={refundAmountLessThanOrEqual}&refundAmount.equals={refundAmountEquals}&refundAmount.notEquals={refundAmountNotEquals}&refundAmount.specified={refundAmountSpecified}&refundAmount.in={refundAmountIn}&refundAmount.notIn={refundAmountNotIn}&refundTransactionId.contains={refundTransactionIdContains}&refundTransactionId.doesNotContain={refundTransactionIdDoesNotContain}&refundTransactionId.equals={refundTransactionIdEquals}&refundTransactionId.notEquals={refundTransactionIdNotEquals}&refundTransactionId.specified={refundTransactionIdSpecified}&refundTransactionId.in={refundTransactionIdIn}&refundTransactionId.notIn={refundTransactionIdNotIn}&tripId.greaterThan={tripIdGreaterThan}&tripId.lessThan={tripIdLessThan}&tripId.greaterThanOrEqual={tripIdGreaterThanOrEqual}&tripId.lessThanOrEqual={tripIdLessThanOrEqual}&tripId.equals={tripIdEquals}&tripId.notEquals={tripIdNotEquals}&tripId.specified={tripIdSpecified}&tripId.in={tripIdIn}&tripId.notIn={tripIdNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&seatId.greaterThan={seatIdGreaterThan}&seatId.lessThan={seatIdLessThan}&seatId.greaterThanOrEqual={seatIdGreaterThanOrEqual}&seatId.lessThanOrEqual={seatIdLessThanOrEqual}&seatId.equals={seatIdEquals}&seatId.notEquals={seatIdNotEquals}&seatId.specified={seatIdSpecified}&seatId.in={seatIdIn}&seatId.notIn={seatIdNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&originalTicketId.greaterThan={originalTicketIdGreaterThan}&originalTicketId.lessThan={originalTicketIdLessThan}&originalTicketId.greaterThanOrEqual={originalTicketIdGreaterThanOrEqual}&originalTicketId.lessThanOrEqual={originalTicketIdLessThanOrEqual}&originalTicketId.equals={originalTicketIdEquals}&originalTicketId.notEquals={originalTicketIdNotEquals}&originalTicketId.specified={originalTicketIdSpecified}&originalTicketId.in={originalTicketIdIn}&originalTicketId.notIn={originalTicketIdNotIn}&exchangedTicketId.greaterThan={exchangedTicketIdGreaterThan}&exchangedTicketId.lessThan={exchangedTicketIdLessThan}&exchangedTicketId.greaterThanOrEqual={exchangedTicketIdGreaterThanOrEqual}&exchangedTicketId.lessThanOrEqual={exchangedTicketIdLessThanOrEqual}&exchangedTicketId.equals={exchangedTicketIdEquals}&exchangedTicketId.notEquals={exchangedTicketIdNotEquals}&exchangedTicketId.specified={exchangedTicketIdSpecified}&exchangedTicketId.in={exchangedTicketIdIn}&exchangedTicketId.notIn={exchangedTicketIdNotIn}&bookingId.greaterThan={bookingIdGreaterThan}&bookingId.lessThan={bookingIdLessThan}&bookingId.greaterThanOrEqual={bookingIdGreaterThanOrEqual}&bookingId.lessThanOrEqual={bookingIdLessThanOrEqual}&bookingId.equals={bookingIdEquals}&bookingId.notEquals={bookingIdNotEquals}&bookingId.specified={bookingIdSpecified}&bookingId.in={bookingIdIn}&bookingId.notIn={bookingIdNotIn}&exchangedFromId.greaterThan={exchangedFromIdGreaterThan}&exchangedFromId.lessThan={exchangedFromIdLessThan}&exchangedFromId.greaterThanOrEqual={exchangedFromIdGreaterThanOrEqual}&exchangedFromId.lessThanOrEqual={exchangedFromIdLessThanOrEqual}&exchangedFromId.equals={exchangedFromIdEquals}&exchangedFromId.notEquals={exchangedFromIdNotEquals}&exchangedFromId.specified={exchangedFromIdSpecified}&exchangedFromId.in={exchangedFromIdIn}&exchangedFromId.notIn={exchangedFromIdNotIn}&exchangedToId.greaterThan={exchangedToIdGreaterThan}&exchangedToId.lessThan={exchangedToIdLessThan}&exchangedToId.greaterThanOrEqual={exchangedToIdGreaterThanOrEqual}&exchangedToId.lessThanOrEqual={exchangedToIdLessThanOrEqual}&exchangedToId.equals={exchangedToIdEquals}&exchangedToId.notEquals={exchangedToIdNotEquals}&exchangedToId.specified={exchangedToIdSpecified}&exchangedToId.in={exchangedToIdIn}&exchangedToId.notIn={exchangedToIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  List<TicketDTO> getAllTickets(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("ticketCodeContains") @jakarta.annotation.Nullable String ticketCodeContains, @Param("ticketCodeDoesNotContain") @jakarta.annotation.Nullable String ticketCodeDoesNotContain, @Param("ticketCodeEquals") @jakarta.annotation.Nullable String ticketCodeEquals, @Param("ticketCodeNotEquals") @jakarta.annotation.Nullable String ticketCodeNotEquals, @Param("ticketCodeSpecified") @jakarta.annotation.Nullable Boolean ticketCodeSpecified, @Param("ticketCodeIn") @jakarta.annotation.Nullable List<String> ticketCodeIn, @Param("ticketCodeNotIn") @jakarta.annotation.Nullable List<String> ticketCodeNotIn, @Param("priceGreaterThan") @jakarta.annotation.Nullable BigDecimal priceGreaterThan, @Param("priceLessThan") @jakarta.annotation.Nullable BigDecimal priceLessThan, @Param("priceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal priceGreaterThanOrEqual, @Param("priceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal priceLessThanOrEqual, @Param("priceEquals") @jakarta.annotation.Nullable BigDecimal priceEquals, @Param("priceNotEquals") @jakarta.annotation.Nullable BigDecimal priceNotEquals, @Param("priceSpecified") @jakarta.annotation.Nullable Boolean priceSpecified, @Param("priceIn") @jakarta.annotation.Nullable List<BigDecimal> priceIn, @Param("priceNotIn") @jakarta.annotation.Nullable List<BigDecimal> priceNotIn, @Param("timeFromGreaterThan") @jakarta.annotation.Nullable OffsetDateTime timeFromGreaterThan, @Param("timeFromLessThan") @jakarta.annotation.Nullable OffsetDateTime timeFromLessThan, @Param("timeFromGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timeFromGreaterThanOrEqual, @Param("timeFromLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timeFromLessThanOrEqual, @Param("timeFromEquals") @jakarta.annotation.Nullable OffsetDateTime timeFromEquals, @Param("timeFromNotEquals") @jakarta.annotation.Nullable OffsetDateTime timeFromNotEquals, @Param("timeFromSpecified") @jakarta.annotation.Nullable Boolean timeFromSpecified, @Param("timeFromIn") @jakarta.annotation.Nullable List<OffsetDateTime> timeFromIn, @Param("timeFromNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> timeFromNotIn, @Param("timeToGreaterThan") @jakarta.annotation.Nullable OffsetDateTime timeToGreaterThan, @Param("timeToLessThan") @jakarta.annotation.Nullable OffsetDateTime timeToLessThan, @Param("timeToGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timeToGreaterThanOrEqual, @Param("timeToLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timeToLessThanOrEqual, @Param("timeToEquals") @jakarta.annotation.Nullable OffsetDateTime timeToEquals, @Param("timeToNotEquals") @jakarta.annotation.Nullable OffsetDateTime timeToNotEquals, @Param("timeToSpecified") @jakarta.annotation.Nullable Boolean timeToSpecified, @Param("timeToIn") @jakarta.annotation.Nullable List<OffsetDateTime> timeToIn, @Param("timeToNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> timeToNotIn, @Param("checkedInEquals") @jakarta.annotation.Nullable Boolean checkedInEquals, @Param("checkedInNotEquals") @jakarta.annotation.Nullable Boolean checkedInNotEquals, @Param("checkedInSpecified") @jakarta.annotation.Nullable Boolean checkedInSpecified, @Param("checkedInIn") @jakarta.annotation.Nullable List<Boolean> checkedInIn, @Param("checkedInNotIn") @jakarta.annotation.Nullable List<Boolean> checkedInNotIn, @Param("statusEquals") @jakarta.annotation.Nullable String statusEquals, @Param("statusNotEquals") @jakarta.annotation.Nullable String statusNotEquals, @Param("statusSpecified") @jakarta.annotation.Nullable Boolean statusSpecified, @Param("statusIn") @jakarta.annotation.Nullable List<String> statusIn, @Param("statusNotIn") @jakarta.annotation.Nullable List<String> statusNotIn, @Param("refundStatusEquals") @jakarta.annotation.Nullable String refundStatusEquals, @Param("refundStatusNotEquals") @jakarta.annotation.Nullable String refundStatusNotEquals, @Param("refundStatusSpecified") @jakarta.annotation.Nullable Boolean refundStatusSpecified, @Param("refundStatusIn") @jakarta.annotation.Nullable List<String> refundStatusIn, @Param("refundStatusNotIn") @jakarta.annotation.Nullable List<String> refundStatusNotIn, @Param("refundReasonContains") @jakarta.annotation.Nullable String refundReasonContains, @Param("refundReasonDoesNotContain") @jakarta.annotation.Nullable String refundReasonDoesNotContain, @Param("refundReasonEquals") @jakarta.annotation.Nullable String refundReasonEquals, @Param("refundReasonNotEquals") @jakarta.annotation.Nullable String refundReasonNotEquals, @Param("refundReasonSpecified") @jakarta.annotation.Nullable Boolean refundReasonSpecified, @Param("refundReasonIn") @jakarta.annotation.Nullable List<String> refundReasonIn, @Param("refundReasonNotIn") @jakarta.annotation.Nullable List<String> refundReasonNotIn, @Param("refundRequestedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtGreaterThan, @Param("refundRequestedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtLessThan, @Param("refundRequestedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtGreaterThanOrEqual, @Param("refundRequestedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtLessThanOrEqual, @Param("refundRequestedAtEquals") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtEquals, @Param("refundRequestedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtNotEquals, @Param("refundRequestedAtSpecified") @jakarta.annotation.Nullable Boolean refundRequestedAtSpecified, @Param("refundRequestedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> refundRequestedAtIn, @Param("refundRequestedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> refundRequestedAtNotIn, @Param("refundCompletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtGreaterThan, @Param("refundCompletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtLessThan, @Param("refundCompletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtGreaterThanOrEqual, @Param("refundCompletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtLessThanOrEqual, @Param("refundCompletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtEquals, @Param("refundCompletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtNotEquals, @Param("refundCompletedAtSpecified") @jakarta.annotation.Nullable Boolean refundCompletedAtSpecified, @Param("refundCompletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> refundCompletedAtIn, @Param("refundCompletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> refundCompletedAtNotIn, @Param("refundAmountGreaterThan") @jakarta.annotation.Nullable BigDecimal refundAmountGreaterThan, @Param("refundAmountLessThan") @jakarta.annotation.Nullable BigDecimal refundAmountLessThan, @Param("refundAmountGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal refundAmountGreaterThanOrEqual, @Param("refundAmountLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal refundAmountLessThanOrEqual, @Param("refundAmountEquals") @jakarta.annotation.Nullable BigDecimal refundAmountEquals, @Param("refundAmountNotEquals") @jakarta.annotation.Nullable BigDecimal refundAmountNotEquals, @Param("refundAmountSpecified") @jakarta.annotation.Nullable Boolean refundAmountSpecified, @Param("refundAmountIn") @jakarta.annotation.Nullable List<BigDecimal> refundAmountIn, @Param("refundAmountNotIn") @jakarta.annotation.Nullable List<BigDecimal> refundAmountNotIn, @Param("refundTransactionIdContains") @jakarta.annotation.Nullable String refundTransactionIdContains, @Param("refundTransactionIdDoesNotContain") @jakarta.annotation.Nullable String refundTransactionIdDoesNotContain, @Param("refundTransactionIdEquals") @jakarta.annotation.Nullable String refundTransactionIdEquals, @Param("refundTransactionIdNotEquals") @jakarta.annotation.Nullable String refundTransactionIdNotEquals, @Param("refundTransactionIdSpecified") @jakarta.annotation.Nullable Boolean refundTransactionIdSpecified, @Param("refundTransactionIdIn") @jakarta.annotation.Nullable List<String> refundTransactionIdIn, @Param("refundTransactionIdNotIn") @jakarta.annotation.Nullable List<String> refundTransactionIdNotIn, @Param("tripIdGreaterThan") @jakarta.annotation.Nullable Long tripIdGreaterThan, @Param("tripIdLessThan") @jakarta.annotation.Nullable Long tripIdLessThan, @Param("tripIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long tripIdGreaterThanOrEqual, @Param("tripIdLessThanOrEqual") @jakarta.annotation.Nullable Long tripIdLessThanOrEqual, @Param("tripIdEquals") @jakarta.annotation.Nullable Long tripIdEquals, @Param("tripIdNotEquals") @jakarta.annotation.Nullable Long tripIdNotEquals, @Param("tripIdSpecified") @jakarta.annotation.Nullable Boolean tripIdSpecified, @Param("tripIdIn") @jakarta.annotation.Nullable List<Long> tripIdIn, @Param("tripIdNotIn") @jakarta.annotation.Nullable List<Long> tripIdNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("seatIdGreaterThan") @jakarta.annotation.Nullable Long seatIdGreaterThan, @Param("seatIdLessThan") @jakarta.annotation.Nullable Long seatIdLessThan, @Param("seatIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long seatIdGreaterThanOrEqual, @Param("seatIdLessThanOrEqual") @jakarta.annotation.Nullable Long seatIdLessThanOrEqual, @Param("seatIdEquals") @jakarta.annotation.Nullable Long seatIdEquals, @Param("seatIdNotEquals") @jakarta.annotation.Nullable Long seatIdNotEquals, @Param("seatIdSpecified") @jakarta.annotation.Nullable Boolean seatIdSpecified, @Param("seatIdIn") @jakarta.annotation.Nullable List<Long> seatIdIn, @Param("seatIdNotIn") @jakarta.annotation.Nullable List<Long> seatIdNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("originalTicketIdGreaterThan") @jakarta.annotation.Nullable Long originalTicketIdGreaterThan, @Param("originalTicketIdLessThan") @jakarta.annotation.Nullable Long originalTicketIdLessThan, @Param("originalTicketIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long originalTicketIdGreaterThanOrEqual, @Param("originalTicketIdLessThanOrEqual") @jakarta.annotation.Nullable Long originalTicketIdLessThanOrEqual, @Param("originalTicketIdEquals") @jakarta.annotation.Nullable Long originalTicketIdEquals, @Param("originalTicketIdNotEquals") @jakarta.annotation.Nullable Long originalTicketIdNotEquals, @Param("originalTicketIdSpecified") @jakarta.annotation.Nullable Boolean originalTicketIdSpecified, @Param("originalTicketIdIn") @jakarta.annotation.Nullable List<Long> originalTicketIdIn, @Param("originalTicketIdNotIn") @jakarta.annotation.Nullable List<Long> originalTicketIdNotIn, @Param("exchangedTicketIdGreaterThan") @jakarta.annotation.Nullable Long exchangedTicketIdGreaterThan, @Param("exchangedTicketIdLessThan") @jakarta.annotation.Nullable Long exchangedTicketIdLessThan, @Param("exchangedTicketIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long exchangedTicketIdGreaterThanOrEqual, @Param("exchangedTicketIdLessThanOrEqual") @jakarta.annotation.Nullable Long exchangedTicketIdLessThanOrEqual, @Param("exchangedTicketIdEquals") @jakarta.annotation.Nullable Long exchangedTicketIdEquals, @Param("exchangedTicketIdNotEquals") @jakarta.annotation.Nullable Long exchangedTicketIdNotEquals, @Param("exchangedTicketIdSpecified") @jakarta.annotation.Nullable Boolean exchangedTicketIdSpecified, @Param("exchangedTicketIdIn") @jakarta.annotation.Nullable List<Long> exchangedTicketIdIn, @Param("exchangedTicketIdNotIn") @jakarta.annotation.Nullable List<Long> exchangedTicketIdNotIn, @Param("bookingIdGreaterThan") @jakarta.annotation.Nullable Long bookingIdGreaterThan, @Param("bookingIdLessThan") @jakarta.annotation.Nullable Long bookingIdLessThan, @Param("bookingIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long bookingIdGreaterThanOrEqual, @Param("bookingIdLessThanOrEqual") @jakarta.annotation.Nullable Long bookingIdLessThanOrEqual, @Param("bookingIdEquals") @jakarta.annotation.Nullable Long bookingIdEquals, @Param("bookingIdNotEquals") @jakarta.annotation.Nullable Long bookingIdNotEquals, @Param("bookingIdSpecified") @jakarta.annotation.Nullable Boolean bookingIdSpecified, @Param("bookingIdIn") @jakarta.annotation.Nullable List<Long> bookingIdIn, @Param("bookingIdNotIn") @jakarta.annotation.Nullable List<Long> bookingIdNotIn, @Param("exchangedFromIdGreaterThan") @jakarta.annotation.Nullable Long exchangedFromIdGreaterThan, @Param("exchangedFromIdLessThan") @jakarta.annotation.Nullable Long exchangedFromIdLessThan, @Param("exchangedFromIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long exchangedFromIdGreaterThanOrEqual, @Param("exchangedFromIdLessThanOrEqual") @jakarta.annotation.Nullable Long exchangedFromIdLessThanOrEqual, @Param("exchangedFromIdEquals") @jakarta.annotation.Nullable Long exchangedFromIdEquals, @Param("exchangedFromIdNotEquals") @jakarta.annotation.Nullable Long exchangedFromIdNotEquals, @Param("exchangedFromIdSpecified") @jakarta.annotation.Nullable Boolean exchangedFromIdSpecified, @Param("exchangedFromIdIn") @jakarta.annotation.Nullable List<Long> exchangedFromIdIn, @Param("exchangedFromIdNotIn") @jakarta.annotation.Nullable List<Long> exchangedFromIdNotIn, @Param("exchangedToIdGreaterThan") @jakarta.annotation.Nullable Long exchangedToIdGreaterThan, @Param("exchangedToIdLessThan") @jakarta.annotation.Nullable Long exchangedToIdLessThan, @Param("exchangedToIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long exchangedToIdGreaterThanOrEqual, @Param("exchangedToIdLessThanOrEqual") @jakarta.annotation.Nullable Long exchangedToIdLessThanOrEqual, @Param("exchangedToIdEquals") @jakarta.annotation.Nullable Long exchangedToIdEquals, @Param("exchangedToIdNotEquals") @jakarta.annotation.Nullable Long exchangedToIdNotEquals, @Param("exchangedToIdSpecified") @jakarta.annotation.Nullable Boolean exchangedToIdSpecified, @Param("exchangedToIdIn") @jakarta.annotation.Nullable List<Long> exchangedToIdIn, @Param("exchangedToIdNotIn") @jakarta.annotation.Nullable List<Long> exchangedToIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>getAllTickets</code> but it also returns the http response headers .
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
   * @param ticketCodeContains  (optional)
   * @param ticketCodeDoesNotContain  (optional)
   * @param ticketCodeEquals  (optional)
   * @param ticketCodeNotEquals  (optional)
   * @param ticketCodeSpecified  (optional)
   * @param ticketCodeIn  (optional)
   * @param ticketCodeNotIn  (optional)
   * @param priceGreaterThan  (optional)
   * @param priceLessThan  (optional)
   * @param priceGreaterThanOrEqual  (optional)
   * @param priceLessThanOrEqual  (optional)
   * @param priceEquals  (optional)
   * @param priceNotEquals  (optional)
   * @param priceSpecified  (optional)
   * @param priceIn  (optional)
   * @param priceNotIn  (optional)
   * @param timeFromGreaterThan  (optional)
   * @param timeFromLessThan  (optional)
   * @param timeFromGreaterThanOrEqual  (optional)
   * @param timeFromLessThanOrEqual  (optional)
   * @param timeFromEquals  (optional)
   * @param timeFromNotEquals  (optional)
   * @param timeFromSpecified  (optional)
   * @param timeFromIn  (optional)
   * @param timeFromNotIn  (optional)
   * @param timeToGreaterThan  (optional)
   * @param timeToLessThan  (optional)
   * @param timeToGreaterThanOrEqual  (optional)
   * @param timeToLessThanOrEqual  (optional)
   * @param timeToEquals  (optional)
   * @param timeToNotEquals  (optional)
   * @param timeToSpecified  (optional)
   * @param timeToIn  (optional)
   * @param timeToNotIn  (optional)
   * @param checkedInEquals  (optional)
   * @param checkedInNotEquals  (optional)
   * @param checkedInSpecified  (optional)
   * @param checkedInIn  (optional)
   * @param checkedInNotIn  (optional)
   * @param statusEquals  (optional)
   * @param statusNotEquals  (optional)
   * @param statusSpecified  (optional)
   * @param statusIn  (optional)
   * @param statusNotIn  (optional)
   * @param refundStatusEquals  (optional)
   * @param refundStatusNotEquals  (optional)
   * @param refundStatusSpecified  (optional)
   * @param refundStatusIn  (optional)
   * @param refundStatusNotIn  (optional)
   * @param refundReasonContains  (optional)
   * @param refundReasonDoesNotContain  (optional)
   * @param refundReasonEquals  (optional)
   * @param refundReasonNotEquals  (optional)
   * @param refundReasonSpecified  (optional)
   * @param refundReasonIn  (optional)
   * @param refundReasonNotIn  (optional)
   * @param refundRequestedAtGreaterThan  (optional)
   * @param refundRequestedAtLessThan  (optional)
   * @param refundRequestedAtGreaterThanOrEqual  (optional)
   * @param refundRequestedAtLessThanOrEqual  (optional)
   * @param refundRequestedAtEquals  (optional)
   * @param refundRequestedAtNotEquals  (optional)
   * @param refundRequestedAtSpecified  (optional)
   * @param refundRequestedAtIn  (optional)
   * @param refundRequestedAtNotIn  (optional)
   * @param refundCompletedAtGreaterThan  (optional)
   * @param refundCompletedAtLessThan  (optional)
   * @param refundCompletedAtGreaterThanOrEqual  (optional)
   * @param refundCompletedAtLessThanOrEqual  (optional)
   * @param refundCompletedAtEquals  (optional)
   * @param refundCompletedAtNotEquals  (optional)
   * @param refundCompletedAtSpecified  (optional)
   * @param refundCompletedAtIn  (optional)
   * @param refundCompletedAtNotIn  (optional)
   * @param refundAmountGreaterThan  (optional)
   * @param refundAmountLessThan  (optional)
   * @param refundAmountGreaterThanOrEqual  (optional)
   * @param refundAmountLessThanOrEqual  (optional)
   * @param refundAmountEquals  (optional)
   * @param refundAmountNotEquals  (optional)
   * @param refundAmountSpecified  (optional)
   * @param refundAmountIn  (optional)
   * @param refundAmountNotIn  (optional)
   * @param refundTransactionIdContains  (optional)
   * @param refundTransactionIdDoesNotContain  (optional)
   * @param refundTransactionIdEquals  (optional)
   * @param refundTransactionIdNotEquals  (optional)
   * @param refundTransactionIdSpecified  (optional)
   * @param refundTransactionIdIn  (optional)
   * @param refundTransactionIdNotIn  (optional)
   * @param tripIdGreaterThan  (optional)
   * @param tripIdLessThan  (optional)
   * @param tripIdGreaterThanOrEqual  (optional)
   * @param tripIdLessThanOrEqual  (optional)
   * @param tripIdEquals  (optional)
   * @param tripIdNotEquals  (optional)
   * @param tripIdSpecified  (optional)
   * @param tripIdIn  (optional)
   * @param tripIdNotIn  (optional)
   * @param routeIdGreaterThan  (optional)
   * @param routeIdLessThan  (optional)
   * @param routeIdGreaterThanOrEqual  (optional)
   * @param routeIdLessThanOrEqual  (optional)
   * @param routeIdEquals  (optional)
   * @param routeIdNotEquals  (optional)
   * @param routeIdSpecified  (optional)
   * @param routeIdIn  (optional)
   * @param routeIdNotIn  (optional)
   * @param seatIdGreaterThan  (optional)
   * @param seatIdLessThan  (optional)
   * @param seatIdGreaterThanOrEqual  (optional)
   * @param seatIdLessThanOrEqual  (optional)
   * @param seatIdEquals  (optional)
   * @param seatIdNotEquals  (optional)
   * @param seatIdSpecified  (optional)
   * @param seatIdIn  (optional)
   * @param seatIdNotIn  (optional)
   * @param createdAtGreaterThan  (optional)
   * @param createdAtLessThan  (optional)
   * @param createdAtGreaterThanOrEqual  (optional)
   * @param createdAtLessThanOrEqual  (optional)
   * @param createdAtEquals  (optional)
   * @param createdAtNotEquals  (optional)
   * @param createdAtSpecified  (optional)
   * @param createdAtIn  (optional)
   * @param createdAtNotIn  (optional)
   * @param isDeletedEquals  (optional)
   * @param isDeletedNotEquals  (optional)
   * @param isDeletedSpecified  (optional)
   * @param isDeletedIn  (optional)
   * @param isDeletedNotIn  (optional)
   * @param deletedByEquals  (optional)
   * @param deletedByNotEquals  (optional)
   * @param deletedBySpecified  (optional)
   * @param deletedByIn  (optional)
   * @param deletedByNotIn  (optional)
   * @param originalTicketIdGreaterThan  (optional)
   * @param originalTicketIdLessThan  (optional)
   * @param originalTicketIdGreaterThanOrEqual  (optional)
   * @param originalTicketIdLessThanOrEqual  (optional)
   * @param originalTicketIdEquals  (optional)
   * @param originalTicketIdNotEquals  (optional)
   * @param originalTicketIdSpecified  (optional)
   * @param originalTicketIdIn  (optional)
   * @param originalTicketIdNotIn  (optional)
   * @param exchangedTicketIdGreaterThan  (optional)
   * @param exchangedTicketIdLessThan  (optional)
   * @param exchangedTicketIdGreaterThanOrEqual  (optional)
   * @param exchangedTicketIdLessThanOrEqual  (optional)
   * @param exchangedTicketIdEquals  (optional)
   * @param exchangedTicketIdNotEquals  (optional)
   * @param exchangedTicketIdSpecified  (optional)
   * @param exchangedTicketIdIn  (optional)
   * @param exchangedTicketIdNotIn  (optional)
   * @param bookingIdGreaterThan  (optional)
   * @param bookingIdLessThan  (optional)
   * @param bookingIdGreaterThanOrEqual  (optional)
   * @param bookingIdLessThanOrEqual  (optional)
   * @param bookingIdEquals  (optional)
   * @param bookingIdNotEquals  (optional)
   * @param bookingIdSpecified  (optional)
   * @param bookingIdIn  (optional)
   * @param bookingIdNotIn  (optional)
   * @param exchangedFromIdGreaterThan  (optional)
   * @param exchangedFromIdLessThan  (optional)
   * @param exchangedFromIdGreaterThanOrEqual  (optional)
   * @param exchangedFromIdLessThanOrEqual  (optional)
   * @param exchangedFromIdEquals  (optional)
   * @param exchangedFromIdNotEquals  (optional)
   * @param exchangedFromIdSpecified  (optional)
   * @param exchangedFromIdIn  (optional)
   * @param exchangedFromIdNotIn  (optional)
   * @param exchangedToIdGreaterThan  (optional)
   * @param exchangedToIdLessThan  (optional)
   * @param exchangedToIdGreaterThanOrEqual  (optional)
   * @param exchangedToIdLessThanOrEqual  (optional)
   * @param exchangedToIdEquals  (optional)
   * @param exchangedToIdNotEquals  (optional)
   * @param exchangedToIdSpecified  (optional)
   * @param exchangedToIdIn  (optional)
   * @param exchangedToIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/tickets?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&ticketCode.contains={ticketCodeContains}&ticketCode.doesNotContain={ticketCodeDoesNotContain}&ticketCode.equals={ticketCodeEquals}&ticketCode.notEquals={ticketCodeNotEquals}&ticketCode.specified={ticketCodeSpecified}&ticketCode.in={ticketCodeIn}&ticketCode.notIn={ticketCodeNotIn}&price.greaterThan={priceGreaterThan}&price.lessThan={priceLessThan}&price.greaterThanOrEqual={priceGreaterThanOrEqual}&price.lessThanOrEqual={priceLessThanOrEqual}&price.equals={priceEquals}&price.notEquals={priceNotEquals}&price.specified={priceSpecified}&price.in={priceIn}&price.notIn={priceNotIn}&timeFrom.greaterThan={timeFromGreaterThan}&timeFrom.lessThan={timeFromLessThan}&timeFrom.greaterThanOrEqual={timeFromGreaterThanOrEqual}&timeFrom.lessThanOrEqual={timeFromLessThanOrEqual}&timeFrom.equals={timeFromEquals}&timeFrom.notEquals={timeFromNotEquals}&timeFrom.specified={timeFromSpecified}&timeFrom.in={timeFromIn}&timeFrom.notIn={timeFromNotIn}&timeTo.greaterThan={timeToGreaterThan}&timeTo.lessThan={timeToLessThan}&timeTo.greaterThanOrEqual={timeToGreaterThanOrEqual}&timeTo.lessThanOrEqual={timeToLessThanOrEqual}&timeTo.equals={timeToEquals}&timeTo.notEquals={timeToNotEquals}&timeTo.specified={timeToSpecified}&timeTo.in={timeToIn}&timeTo.notIn={timeToNotIn}&checkedIn.equals={checkedInEquals}&checkedIn.notEquals={checkedInNotEquals}&checkedIn.specified={checkedInSpecified}&checkedIn.in={checkedInIn}&checkedIn.notIn={checkedInNotIn}&status.equals={statusEquals}&status.notEquals={statusNotEquals}&status.specified={statusSpecified}&status.in={statusIn}&status.notIn={statusNotIn}&refundStatus.equals={refundStatusEquals}&refundStatus.notEquals={refundStatusNotEquals}&refundStatus.specified={refundStatusSpecified}&refundStatus.in={refundStatusIn}&refundStatus.notIn={refundStatusNotIn}&refundReason.contains={refundReasonContains}&refundReason.doesNotContain={refundReasonDoesNotContain}&refundReason.equals={refundReasonEquals}&refundReason.notEquals={refundReasonNotEquals}&refundReason.specified={refundReasonSpecified}&refundReason.in={refundReasonIn}&refundReason.notIn={refundReasonNotIn}&refundRequestedAt.greaterThan={refundRequestedAtGreaterThan}&refundRequestedAt.lessThan={refundRequestedAtLessThan}&refundRequestedAt.greaterThanOrEqual={refundRequestedAtGreaterThanOrEqual}&refundRequestedAt.lessThanOrEqual={refundRequestedAtLessThanOrEqual}&refundRequestedAt.equals={refundRequestedAtEquals}&refundRequestedAt.notEquals={refundRequestedAtNotEquals}&refundRequestedAt.specified={refundRequestedAtSpecified}&refundRequestedAt.in={refundRequestedAtIn}&refundRequestedAt.notIn={refundRequestedAtNotIn}&refundCompletedAt.greaterThan={refundCompletedAtGreaterThan}&refundCompletedAt.lessThan={refundCompletedAtLessThan}&refundCompletedAt.greaterThanOrEqual={refundCompletedAtGreaterThanOrEqual}&refundCompletedAt.lessThanOrEqual={refundCompletedAtLessThanOrEqual}&refundCompletedAt.equals={refundCompletedAtEquals}&refundCompletedAt.notEquals={refundCompletedAtNotEquals}&refundCompletedAt.specified={refundCompletedAtSpecified}&refundCompletedAt.in={refundCompletedAtIn}&refundCompletedAt.notIn={refundCompletedAtNotIn}&refundAmount.greaterThan={refundAmountGreaterThan}&refundAmount.lessThan={refundAmountLessThan}&refundAmount.greaterThanOrEqual={refundAmountGreaterThanOrEqual}&refundAmount.lessThanOrEqual={refundAmountLessThanOrEqual}&refundAmount.equals={refundAmountEquals}&refundAmount.notEquals={refundAmountNotEquals}&refundAmount.specified={refundAmountSpecified}&refundAmount.in={refundAmountIn}&refundAmount.notIn={refundAmountNotIn}&refundTransactionId.contains={refundTransactionIdContains}&refundTransactionId.doesNotContain={refundTransactionIdDoesNotContain}&refundTransactionId.equals={refundTransactionIdEquals}&refundTransactionId.notEquals={refundTransactionIdNotEquals}&refundTransactionId.specified={refundTransactionIdSpecified}&refundTransactionId.in={refundTransactionIdIn}&refundTransactionId.notIn={refundTransactionIdNotIn}&tripId.greaterThan={tripIdGreaterThan}&tripId.lessThan={tripIdLessThan}&tripId.greaterThanOrEqual={tripIdGreaterThanOrEqual}&tripId.lessThanOrEqual={tripIdLessThanOrEqual}&tripId.equals={tripIdEquals}&tripId.notEquals={tripIdNotEquals}&tripId.specified={tripIdSpecified}&tripId.in={tripIdIn}&tripId.notIn={tripIdNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&seatId.greaterThan={seatIdGreaterThan}&seatId.lessThan={seatIdLessThan}&seatId.greaterThanOrEqual={seatIdGreaterThanOrEqual}&seatId.lessThanOrEqual={seatIdLessThanOrEqual}&seatId.equals={seatIdEquals}&seatId.notEquals={seatIdNotEquals}&seatId.specified={seatIdSpecified}&seatId.in={seatIdIn}&seatId.notIn={seatIdNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&originalTicketId.greaterThan={originalTicketIdGreaterThan}&originalTicketId.lessThan={originalTicketIdLessThan}&originalTicketId.greaterThanOrEqual={originalTicketIdGreaterThanOrEqual}&originalTicketId.lessThanOrEqual={originalTicketIdLessThanOrEqual}&originalTicketId.equals={originalTicketIdEquals}&originalTicketId.notEquals={originalTicketIdNotEquals}&originalTicketId.specified={originalTicketIdSpecified}&originalTicketId.in={originalTicketIdIn}&originalTicketId.notIn={originalTicketIdNotIn}&exchangedTicketId.greaterThan={exchangedTicketIdGreaterThan}&exchangedTicketId.lessThan={exchangedTicketIdLessThan}&exchangedTicketId.greaterThanOrEqual={exchangedTicketIdGreaterThanOrEqual}&exchangedTicketId.lessThanOrEqual={exchangedTicketIdLessThanOrEqual}&exchangedTicketId.equals={exchangedTicketIdEquals}&exchangedTicketId.notEquals={exchangedTicketIdNotEquals}&exchangedTicketId.specified={exchangedTicketIdSpecified}&exchangedTicketId.in={exchangedTicketIdIn}&exchangedTicketId.notIn={exchangedTicketIdNotIn}&bookingId.greaterThan={bookingIdGreaterThan}&bookingId.lessThan={bookingIdLessThan}&bookingId.greaterThanOrEqual={bookingIdGreaterThanOrEqual}&bookingId.lessThanOrEqual={bookingIdLessThanOrEqual}&bookingId.equals={bookingIdEquals}&bookingId.notEquals={bookingIdNotEquals}&bookingId.specified={bookingIdSpecified}&bookingId.in={bookingIdIn}&bookingId.notIn={bookingIdNotIn}&exchangedFromId.greaterThan={exchangedFromIdGreaterThan}&exchangedFromId.lessThan={exchangedFromIdLessThan}&exchangedFromId.greaterThanOrEqual={exchangedFromIdGreaterThanOrEqual}&exchangedFromId.lessThanOrEqual={exchangedFromIdLessThanOrEqual}&exchangedFromId.equals={exchangedFromIdEquals}&exchangedFromId.notEquals={exchangedFromIdNotEquals}&exchangedFromId.specified={exchangedFromIdSpecified}&exchangedFromId.in={exchangedFromIdIn}&exchangedFromId.notIn={exchangedFromIdNotIn}&exchangedToId.greaterThan={exchangedToIdGreaterThan}&exchangedToId.lessThan={exchangedToIdLessThan}&exchangedToId.greaterThanOrEqual={exchangedToIdGreaterThanOrEqual}&exchangedToId.lessThanOrEqual={exchangedToIdLessThanOrEqual}&exchangedToId.equals={exchangedToIdEquals}&exchangedToId.notEquals={exchangedToIdNotEquals}&exchangedToId.specified={exchangedToIdSpecified}&exchangedToId.in={exchangedToIdIn}&exchangedToId.notIn={exchangedToIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<TicketDTO>> getAllTicketsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("ticketCodeContains") @jakarta.annotation.Nullable String ticketCodeContains, @Param("ticketCodeDoesNotContain") @jakarta.annotation.Nullable String ticketCodeDoesNotContain, @Param("ticketCodeEquals") @jakarta.annotation.Nullable String ticketCodeEquals, @Param("ticketCodeNotEquals") @jakarta.annotation.Nullable String ticketCodeNotEquals, @Param("ticketCodeSpecified") @jakarta.annotation.Nullable Boolean ticketCodeSpecified, @Param("ticketCodeIn") @jakarta.annotation.Nullable List<String> ticketCodeIn, @Param("ticketCodeNotIn") @jakarta.annotation.Nullable List<String> ticketCodeNotIn, @Param("priceGreaterThan") @jakarta.annotation.Nullable BigDecimal priceGreaterThan, @Param("priceLessThan") @jakarta.annotation.Nullable BigDecimal priceLessThan, @Param("priceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal priceGreaterThanOrEqual, @Param("priceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal priceLessThanOrEqual, @Param("priceEquals") @jakarta.annotation.Nullable BigDecimal priceEquals, @Param("priceNotEquals") @jakarta.annotation.Nullable BigDecimal priceNotEquals, @Param("priceSpecified") @jakarta.annotation.Nullable Boolean priceSpecified, @Param("priceIn") @jakarta.annotation.Nullable List<BigDecimal> priceIn, @Param("priceNotIn") @jakarta.annotation.Nullable List<BigDecimal> priceNotIn, @Param("timeFromGreaterThan") @jakarta.annotation.Nullable OffsetDateTime timeFromGreaterThan, @Param("timeFromLessThan") @jakarta.annotation.Nullable OffsetDateTime timeFromLessThan, @Param("timeFromGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timeFromGreaterThanOrEqual, @Param("timeFromLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timeFromLessThanOrEqual, @Param("timeFromEquals") @jakarta.annotation.Nullable OffsetDateTime timeFromEquals, @Param("timeFromNotEquals") @jakarta.annotation.Nullable OffsetDateTime timeFromNotEquals, @Param("timeFromSpecified") @jakarta.annotation.Nullable Boolean timeFromSpecified, @Param("timeFromIn") @jakarta.annotation.Nullable List<OffsetDateTime> timeFromIn, @Param("timeFromNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> timeFromNotIn, @Param("timeToGreaterThan") @jakarta.annotation.Nullable OffsetDateTime timeToGreaterThan, @Param("timeToLessThan") @jakarta.annotation.Nullable OffsetDateTime timeToLessThan, @Param("timeToGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timeToGreaterThanOrEqual, @Param("timeToLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timeToLessThanOrEqual, @Param("timeToEquals") @jakarta.annotation.Nullable OffsetDateTime timeToEquals, @Param("timeToNotEquals") @jakarta.annotation.Nullable OffsetDateTime timeToNotEquals, @Param("timeToSpecified") @jakarta.annotation.Nullable Boolean timeToSpecified, @Param("timeToIn") @jakarta.annotation.Nullable List<OffsetDateTime> timeToIn, @Param("timeToNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> timeToNotIn, @Param("checkedInEquals") @jakarta.annotation.Nullable Boolean checkedInEquals, @Param("checkedInNotEquals") @jakarta.annotation.Nullable Boolean checkedInNotEquals, @Param("checkedInSpecified") @jakarta.annotation.Nullable Boolean checkedInSpecified, @Param("checkedInIn") @jakarta.annotation.Nullable List<Boolean> checkedInIn, @Param("checkedInNotIn") @jakarta.annotation.Nullable List<Boolean> checkedInNotIn, @Param("statusEquals") @jakarta.annotation.Nullable String statusEquals, @Param("statusNotEquals") @jakarta.annotation.Nullable String statusNotEquals, @Param("statusSpecified") @jakarta.annotation.Nullable Boolean statusSpecified, @Param("statusIn") @jakarta.annotation.Nullable List<String> statusIn, @Param("statusNotIn") @jakarta.annotation.Nullable List<String> statusNotIn, @Param("refundStatusEquals") @jakarta.annotation.Nullable String refundStatusEquals, @Param("refundStatusNotEquals") @jakarta.annotation.Nullable String refundStatusNotEquals, @Param("refundStatusSpecified") @jakarta.annotation.Nullable Boolean refundStatusSpecified, @Param("refundStatusIn") @jakarta.annotation.Nullable List<String> refundStatusIn, @Param("refundStatusNotIn") @jakarta.annotation.Nullable List<String> refundStatusNotIn, @Param("refundReasonContains") @jakarta.annotation.Nullable String refundReasonContains, @Param("refundReasonDoesNotContain") @jakarta.annotation.Nullable String refundReasonDoesNotContain, @Param("refundReasonEquals") @jakarta.annotation.Nullable String refundReasonEquals, @Param("refundReasonNotEquals") @jakarta.annotation.Nullable String refundReasonNotEquals, @Param("refundReasonSpecified") @jakarta.annotation.Nullable Boolean refundReasonSpecified, @Param("refundReasonIn") @jakarta.annotation.Nullable List<String> refundReasonIn, @Param("refundReasonNotIn") @jakarta.annotation.Nullable List<String> refundReasonNotIn, @Param("refundRequestedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtGreaterThan, @Param("refundRequestedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtLessThan, @Param("refundRequestedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtGreaterThanOrEqual, @Param("refundRequestedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtLessThanOrEqual, @Param("refundRequestedAtEquals") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtEquals, @Param("refundRequestedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime refundRequestedAtNotEquals, @Param("refundRequestedAtSpecified") @jakarta.annotation.Nullable Boolean refundRequestedAtSpecified, @Param("refundRequestedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> refundRequestedAtIn, @Param("refundRequestedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> refundRequestedAtNotIn, @Param("refundCompletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtGreaterThan, @Param("refundCompletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtLessThan, @Param("refundCompletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtGreaterThanOrEqual, @Param("refundCompletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtLessThanOrEqual, @Param("refundCompletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtEquals, @Param("refundCompletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime refundCompletedAtNotEquals, @Param("refundCompletedAtSpecified") @jakarta.annotation.Nullable Boolean refundCompletedAtSpecified, @Param("refundCompletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> refundCompletedAtIn, @Param("refundCompletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> refundCompletedAtNotIn, @Param("refundAmountGreaterThan") @jakarta.annotation.Nullable BigDecimal refundAmountGreaterThan, @Param("refundAmountLessThan") @jakarta.annotation.Nullable BigDecimal refundAmountLessThan, @Param("refundAmountGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal refundAmountGreaterThanOrEqual, @Param("refundAmountLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal refundAmountLessThanOrEqual, @Param("refundAmountEquals") @jakarta.annotation.Nullable BigDecimal refundAmountEquals, @Param("refundAmountNotEquals") @jakarta.annotation.Nullable BigDecimal refundAmountNotEquals, @Param("refundAmountSpecified") @jakarta.annotation.Nullable Boolean refundAmountSpecified, @Param("refundAmountIn") @jakarta.annotation.Nullable List<BigDecimal> refundAmountIn, @Param("refundAmountNotIn") @jakarta.annotation.Nullable List<BigDecimal> refundAmountNotIn, @Param("refundTransactionIdContains") @jakarta.annotation.Nullable String refundTransactionIdContains, @Param("refundTransactionIdDoesNotContain") @jakarta.annotation.Nullable String refundTransactionIdDoesNotContain, @Param("refundTransactionIdEquals") @jakarta.annotation.Nullable String refundTransactionIdEquals, @Param("refundTransactionIdNotEquals") @jakarta.annotation.Nullable String refundTransactionIdNotEquals, @Param("refundTransactionIdSpecified") @jakarta.annotation.Nullable Boolean refundTransactionIdSpecified, @Param("refundTransactionIdIn") @jakarta.annotation.Nullable List<String> refundTransactionIdIn, @Param("refundTransactionIdNotIn") @jakarta.annotation.Nullable List<String> refundTransactionIdNotIn, @Param("tripIdGreaterThan") @jakarta.annotation.Nullable Long tripIdGreaterThan, @Param("tripIdLessThan") @jakarta.annotation.Nullable Long tripIdLessThan, @Param("tripIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long tripIdGreaterThanOrEqual, @Param("tripIdLessThanOrEqual") @jakarta.annotation.Nullable Long tripIdLessThanOrEqual, @Param("tripIdEquals") @jakarta.annotation.Nullable Long tripIdEquals, @Param("tripIdNotEquals") @jakarta.annotation.Nullable Long tripIdNotEquals, @Param("tripIdSpecified") @jakarta.annotation.Nullable Boolean tripIdSpecified, @Param("tripIdIn") @jakarta.annotation.Nullable List<Long> tripIdIn, @Param("tripIdNotIn") @jakarta.annotation.Nullable List<Long> tripIdNotIn, @Param("routeIdGreaterThan") @jakarta.annotation.Nullable Long routeIdGreaterThan, @Param("routeIdLessThan") @jakarta.annotation.Nullable Long routeIdLessThan, @Param("routeIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long routeIdGreaterThanOrEqual, @Param("routeIdLessThanOrEqual") @jakarta.annotation.Nullable Long routeIdLessThanOrEqual, @Param("routeIdEquals") @jakarta.annotation.Nullable Long routeIdEquals, @Param("routeIdNotEquals") @jakarta.annotation.Nullable Long routeIdNotEquals, @Param("routeIdSpecified") @jakarta.annotation.Nullable Boolean routeIdSpecified, @Param("routeIdIn") @jakarta.annotation.Nullable List<Long> routeIdIn, @Param("routeIdNotIn") @jakarta.annotation.Nullable List<Long> routeIdNotIn, @Param("seatIdGreaterThan") @jakarta.annotation.Nullable Long seatIdGreaterThan, @Param("seatIdLessThan") @jakarta.annotation.Nullable Long seatIdLessThan, @Param("seatIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long seatIdGreaterThanOrEqual, @Param("seatIdLessThanOrEqual") @jakarta.annotation.Nullable Long seatIdLessThanOrEqual, @Param("seatIdEquals") @jakarta.annotation.Nullable Long seatIdEquals, @Param("seatIdNotEquals") @jakarta.annotation.Nullable Long seatIdNotEquals, @Param("seatIdSpecified") @jakarta.annotation.Nullable Boolean seatIdSpecified, @Param("seatIdIn") @jakarta.annotation.Nullable List<Long> seatIdIn, @Param("seatIdNotIn") @jakarta.annotation.Nullable List<Long> seatIdNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("originalTicketIdGreaterThan") @jakarta.annotation.Nullable Long originalTicketIdGreaterThan, @Param("originalTicketIdLessThan") @jakarta.annotation.Nullable Long originalTicketIdLessThan, @Param("originalTicketIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long originalTicketIdGreaterThanOrEqual, @Param("originalTicketIdLessThanOrEqual") @jakarta.annotation.Nullable Long originalTicketIdLessThanOrEqual, @Param("originalTicketIdEquals") @jakarta.annotation.Nullable Long originalTicketIdEquals, @Param("originalTicketIdNotEquals") @jakarta.annotation.Nullable Long originalTicketIdNotEquals, @Param("originalTicketIdSpecified") @jakarta.annotation.Nullable Boolean originalTicketIdSpecified, @Param("originalTicketIdIn") @jakarta.annotation.Nullable List<Long> originalTicketIdIn, @Param("originalTicketIdNotIn") @jakarta.annotation.Nullable List<Long> originalTicketIdNotIn, @Param("exchangedTicketIdGreaterThan") @jakarta.annotation.Nullable Long exchangedTicketIdGreaterThan, @Param("exchangedTicketIdLessThan") @jakarta.annotation.Nullable Long exchangedTicketIdLessThan, @Param("exchangedTicketIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long exchangedTicketIdGreaterThanOrEqual, @Param("exchangedTicketIdLessThanOrEqual") @jakarta.annotation.Nullable Long exchangedTicketIdLessThanOrEqual, @Param("exchangedTicketIdEquals") @jakarta.annotation.Nullable Long exchangedTicketIdEquals, @Param("exchangedTicketIdNotEquals") @jakarta.annotation.Nullable Long exchangedTicketIdNotEquals, @Param("exchangedTicketIdSpecified") @jakarta.annotation.Nullable Boolean exchangedTicketIdSpecified, @Param("exchangedTicketIdIn") @jakarta.annotation.Nullable List<Long> exchangedTicketIdIn, @Param("exchangedTicketIdNotIn") @jakarta.annotation.Nullable List<Long> exchangedTicketIdNotIn, @Param("bookingIdGreaterThan") @jakarta.annotation.Nullable Long bookingIdGreaterThan, @Param("bookingIdLessThan") @jakarta.annotation.Nullable Long bookingIdLessThan, @Param("bookingIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long bookingIdGreaterThanOrEqual, @Param("bookingIdLessThanOrEqual") @jakarta.annotation.Nullable Long bookingIdLessThanOrEqual, @Param("bookingIdEquals") @jakarta.annotation.Nullable Long bookingIdEquals, @Param("bookingIdNotEquals") @jakarta.annotation.Nullable Long bookingIdNotEquals, @Param("bookingIdSpecified") @jakarta.annotation.Nullable Boolean bookingIdSpecified, @Param("bookingIdIn") @jakarta.annotation.Nullable List<Long> bookingIdIn, @Param("bookingIdNotIn") @jakarta.annotation.Nullable List<Long> bookingIdNotIn, @Param("exchangedFromIdGreaterThan") @jakarta.annotation.Nullable Long exchangedFromIdGreaterThan, @Param("exchangedFromIdLessThan") @jakarta.annotation.Nullable Long exchangedFromIdLessThan, @Param("exchangedFromIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long exchangedFromIdGreaterThanOrEqual, @Param("exchangedFromIdLessThanOrEqual") @jakarta.annotation.Nullable Long exchangedFromIdLessThanOrEqual, @Param("exchangedFromIdEquals") @jakarta.annotation.Nullable Long exchangedFromIdEquals, @Param("exchangedFromIdNotEquals") @jakarta.annotation.Nullable Long exchangedFromIdNotEquals, @Param("exchangedFromIdSpecified") @jakarta.annotation.Nullable Boolean exchangedFromIdSpecified, @Param("exchangedFromIdIn") @jakarta.annotation.Nullable List<Long> exchangedFromIdIn, @Param("exchangedFromIdNotIn") @jakarta.annotation.Nullable List<Long> exchangedFromIdNotIn, @Param("exchangedToIdGreaterThan") @jakarta.annotation.Nullable Long exchangedToIdGreaterThan, @Param("exchangedToIdLessThan") @jakarta.annotation.Nullable Long exchangedToIdLessThan, @Param("exchangedToIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long exchangedToIdGreaterThanOrEqual, @Param("exchangedToIdLessThanOrEqual") @jakarta.annotation.Nullable Long exchangedToIdLessThanOrEqual, @Param("exchangedToIdEquals") @jakarta.annotation.Nullable Long exchangedToIdEquals, @Param("exchangedToIdNotEquals") @jakarta.annotation.Nullable Long exchangedToIdNotEquals, @Param("exchangedToIdSpecified") @jakarta.annotation.Nullable Boolean exchangedToIdSpecified, @Param("exchangedToIdIn") @jakarta.annotation.Nullable List<Long> exchangedToIdIn, @Param("exchangedToIdNotIn") @jakarta.annotation.Nullable List<Long> exchangedToIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllTickets</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllTicketsQueryParams} class that allows for
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
   *   <li>ticketCodeContains -  (optional)</li>
   *   <li>ticketCodeDoesNotContain -  (optional)</li>
   *   <li>ticketCodeEquals -  (optional)</li>
   *   <li>ticketCodeNotEquals -  (optional)</li>
   *   <li>ticketCodeSpecified -  (optional)</li>
   *   <li>ticketCodeIn -  (optional)</li>
   *   <li>ticketCodeNotIn -  (optional)</li>
   *   <li>priceGreaterThan -  (optional)</li>
   *   <li>priceLessThan -  (optional)</li>
   *   <li>priceGreaterThanOrEqual -  (optional)</li>
   *   <li>priceLessThanOrEqual -  (optional)</li>
   *   <li>priceEquals -  (optional)</li>
   *   <li>priceNotEquals -  (optional)</li>
   *   <li>priceSpecified -  (optional)</li>
   *   <li>priceIn -  (optional)</li>
   *   <li>priceNotIn -  (optional)</li>
   *   <li>timeFromGreaterThan -  (optional)</li>
   *   <li>timeFromLessThan -  (optional)</li>
   *   <li>timeFromGreaterThanOrEqual -  (optional)</li>
   *   <li>timeFromLessThanOrEqual -  (optional)</li>
   *   <li>timeFromEquals -  (optional)</li>
   *   <li>timeFromNotEquals -  (optional)</li>
   *   <li>timeFromSpecified -  (optional)</li>
   *   <li>timeFromIn -  (optional)</li>
   *   <li>timeFromNotIn -  (optional)</li>
   *   <li>timeToGreaterThan -  (optional)</li>
   *   <li>timeToLessThan -  (optional)</li>
   *   <li>timeToGreaterThanOrEqual -  (optional)</li>
   *   <li>timeToLessThanOrEqual -  (optional)</li>
   *   <li>timeToEquals -  (optional)</li>
   *   <li>timeToNotEquals -  (optional)</li>
   *   <li>timeToSpecified -  (optional)</li>
   *   <li>timeToIn -  (optional)</li>
   *   <li>timeToNotIn -  (optional)</li>
   *   <li>checkedInEquals -  (optional)</li>
   *   <li>checkedInNotEquals -  (optional)</li>
   *   <li>checkedInSpecified -  (optional)</li>
   *   <li>checkedInIn -  (optional)</li>
   *   <li>checkedInNotIn -  (optional)</li>
   *   <li>statusEquals -  (optional)</li>
   *   <li>statusNotEquals -  (optional)</li>
   *   <li>statusSpecified -  (optional)</li>
   *   <li>statusIn -  (optional)</li>
   *   <li>statusNotIn -  (optional)</li>
   *   <li>refundStatusEquals -  (optional)</li>
   *   <li>refundStatusNotEquals -  (optional)</li>
   *   <li>refundStatusSpecified -  (optional)</li>
   *   <li>refundStatusIn -  (optional)</li>
   *   <li>refundStatusNotIn -  (optional)</li>
   *   <li>refundReasonContains -  (optional)</li>
   *   <li>refundReasonDoesNotContain -  (optional)</li>
   *   <li>refundReasonEquals -  (optional)</li>
   *   <li>refundReasonNotEquals -  (optional)</li>
   *   <li>refundReasonSpecified -  (optional)</li>
   *   <li>refundReasonIn -  (optional)</li>
   *   <li>refundReasonNotIn -  (optional)</li>
   *   <li>refundRequestedAtGreaterThan -  (optional)</li>
   *   <li>refundRequestedAtLessThan -  (optional)</li>
   *   <li>refundRequestedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>refundRequestedAtLessThanOrEqual -  (optional)</li>
   *   <li>refundRequestedAtEquals -  (optional)</li>
   *   <li>refundRequestedAtNotEquals -  (optional)</li>
   *   <li>refundRequestedAtSpecified -  (optional)</li>
   *   <li>refundRequestedAtIn -  (optional)</li>
   *   <li>refundRequestedAtNotIn -  (optional)</li>
   *   <li>refundCompletedAtGreaterThan -  (optional)</li>
   *   <li>refundCompletedAtLessThan -  (optional)</li>
   *   <li>refundCompletedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>refundCompletedAtLessThanOrEqual -  (optional)</li>
   *   <li>refundCompletedAtEquals -  (optional)</li>
   *   <li>refundCompletedAtNotEquals -  (optional)</li>
   *   <li>refundCompletedAtSpecified -  (optional)</li>
   *   <li>refundCompletedAtIn -  (optional)</li>
   *   <li>refundCompletedAtNotIn -  (optional)</li>
   *   <li>refundAmountGreaterThan -  (optional)</li>
   *   <li>refundAmountLessThan -  (optional)</li>
   *   <li>refundAmountGreaterThanOrEqual -  (optional)</li>
   *   <li>refundAmountLessThanOrEqual -  (optional)</li>
   *   <li>refundAmountEquals -  (optional)</li>
   *   <li>refundAmountNotEquals -  (optional)</li>
   *   <li>refundAmountSpecified -  (optional)</li>
   *   <li>refundAmountIn -  (optional)</li>
   *   <li>refundAmountNotIn -  (optional)</li>
   *   <li>refundTransactionIdContains -  (optional)</li>
   *   <li>refundTransactionIdDoesNotContain -  (optional)</li>
   *   <li>refundTransactionIdEquals -  (optional)</li>
   *   <li>refundTransactionIdNotEquals -  (optional)</li>
   *   <li>refundTransactionIdSpecified -  (optional)</li>
   *   <li>refundTransactionIdIn -  (optional)</li>
   *   <li>refundTransactionIdNotIn -  (optional)</li>
   *   <li>tripIdGreaterThan -  (optional)</li>
   *   <li>tripIdLessThan -  (optional)</li>
   *   <li>tripIdGreaterThanOrEqual -  (optional)</li>
   *   <li>tripIdLessThanOrEqual -  (optional)</li>
   *   <li>tripIdEquals -  (optional)</li>
   *   <li>tripIdNotEquals -  (optional)</li>
   *   <li>tripIdSpecified -  (optional)</li>
   *   <li>tripIdIn -  (optional)</li>
   *   <li>tripIdNotIn -  (optional)</li>
   *   <li>routeIdGreaterThan -  (optional)</li>
   *   <li>routeIdLessThan -  (optional)</li>
   *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
   *   <li>routeIdLessThanOrEqual -  (optional)</li>
   *   <li>routeIdEquals -  (optional)</li>
   *   <li>routeIdNotEquals -  (optional)</li>
   *   <li>routeIdSpecified -  (optional)</li>
   *   <li>routeIdIn -  (optional)</li>
   *   <li>routeIdNotIn -  (optional)</li>
   *   <li>seatIdGreaterThan -  (optional)</li>
   *   <li>seatIdLessThan -  (optional)</li>
   *   <li>seatIdGreaterThanOrEqual -  (optional)</li>
   *   <li>seatIdLessThanOrEqual -  (optional)</li>
   *   <li>seatIdEquals -  (optional)</li>
   *   <li>seatIdNotEquals -  (optional)</li>
   *   <li>seatIdSpecified -  (optional)</li>
   *   <li>seatIdIn -  (optional)</li>
   *   <li>seatIdNotIn -  (optional)</li>
   *   <li>createdAtGreaterThan -  (optional)</li>
   *   <li>createdAtLessThan -  (optional)</li>
   *   <li>createdAtGreaterThanOrEqual -  (optional)</li>
   *   <li>createdAtLessThanOrEqual -  (optional)</li>
   *   <li>createdAtEquals -  (optional)</li>
   *   <li>createdAtNotEquals -  (optional)</li>
   *   <li>createdAtSpecified -  (optional)</li>
   *   <li>createdAtIn -  (optional)</li>
   *   <li>createdAtNotIn -  (optional)</li>
   *   <li>isDeletedEquals -  (optional)</li>
   *   <li>isDeletedNotEquals -  (optional)</li>
   *   <li>isDeletedSpecified -  (optional)</li>
   *   <li>isDeletedIn -  (optional)</li>
   *   <li>isDeletedNotIn -  (optional)</li>
   *   <li>deletedByEquals -  (optional)</li>
   *   <li>deletedByNotEquals -  (optional)</li>
   *   <li>deletedBySpecified -  (optional)</li>
   *   <li>deletedByIn -  (optional)</li>
   *   <li>deletedByNotIn -  (optional)</li>
   *   <li>originalTicketIdGreaterThan -  (optional)</li>
   *   <li>originalTicketIdLessThan -  (optional)</li>
   *   <li>originalTicketIdGreaterThanOrEqual -  (optional)</li>
   *   <li>originalTicketIdLessThanOrEqual -  (optional)</li>
   *   <li>originalTicketIdEquals -  (optional)</li>
   *   <li>originalTicketIdNotEquals -  (optional)</li>
   *   <li>originalTicketIdSpecified -  (optional)</li>
   *   <li>originalTicketIdIn -  (optional)</li>
   *   <li>originalTicketIdNotIn -  (optional)</li>
   *   <li>exchangedTicketIdGreaterThan -  (optional)</li>
   *   <li>exchangedTicketIdLessThan -  (optional)</li>
   *   <li>exchangedTicketIdGreaterThanOrEqual -  (optional)</li>
   *   <li>exchangedTicketIdLessThanOrEqual -  (optional)</li>
   *   <li>exchangedTicketIdEquals -  (optional)</li>
   *   <li>exchangedTicketIdNotEquals -  (optional)</li>
   *   <li>exchangedTicketIdSpecified -  (optional)</li>
   *   <li>exchangedTicketIdIn -  (optional)</li>
   *   <li>exchangedTicketIdNotIn -  (optional)</li>
   *   <li>bookingIdGreaterThan -  (optional)</li>
   *   <li>bookingIdLessThan -  (optional)</li>
   *   <li>bookingIdGreaterThanOrEqual -  (optional)</li>
   *   <li>bookingIdLessThanOrEqual -  (optional)</li>
   *   <li>bookingIdEquals -  (optional)</li>
   *   <li>bookingIdNotEquals -  (optional)</li>
   *   <li>bookingIdSpecified -  (optional)</li>
   *   <li>bookingIdIn -  (optional)</li>
   *   <li>bookingIdNotIn -  (optional)</li>
   *   <li>exchangedFromIdGreaterThan -  (optional)</li>
   *   <li>exchangedFromIdLessThan -  (optional)</li>
   *   <li>exchangedFromIdGreaterThanOrEqual -  (optional)</li>
   *   <li>exchangedFromIdLessThanOrEqual -  (optional)</li>
   *   <li>exchangedFromIdEquals -  (optional)</li>
   *   <li>exchangedFromIdNotEquals -  (optional)</li>
   *   <li>exchangedFromIdSpecified -  (optional)</li>
   *   <li>exchangedFromIdIn -  (optional)</li>
   *   <li>exchangedFromIdNotIn -  (optional)</li>
   *   <li>exchangedToIdGreaterThan -  (optional)</li>
   *   <li>exchangedToIdLessThan -  (optional)</li>
   *   <li>exchangedToIdGreaterThanOrEqual -  (optional)</li>
   *   <li>exchangedToIdLessThanOrEqual -  (optional)</li>
   *   <li>exchangedToIdEquals -  (optional)</li>
   *   <li>exchangedToIdNotEquals -  (optional)</li>
   *   <li>exchangedToIdSpecified -  (optional)</li>
   *   <li>exchangedToIdIn -  (optional)</li>
   *   <li>exchangedToIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return List&lt;TicketDTO&gt;
   */
  @RequestLine("GET /api/tickets?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&ticketCode.contains={ticketCodeContains}&ticketCode.doesNotContain={ticketCodeDoesNotContain}&ticketCode.equals={ticketCodeEquals}&ticketCode.notEquals={ticketCodeNotEquals}&ticketCode.specified={ticketCodeSpecified}&ticketCode.in={ticketCodeIn}&ticketCode.notIn={ticketCodeNotIn}&price.greaterThan={priceGreaterThan}&price.lessThan={priceLessThan}&price.greaterThanOrEqual={priceGreaterThanOrEqual}&price.lessThanOrEqual={priceLessThanOrEqual}&price.equals={priceEquals}&price.notEquals={priceNotEquals}&price.specified={priceSpecified}&price.in={priceIn}&price.notIn={priceNotIn}&timeFrom.greaterThan={timeFromGreaterThan}&timeFrom.lessThan={timeFromLessThan}&timeFrom.greaterThanOrEqual={timeFromGreaterThanOrEqual}&timeFrom.lessThanOrEqual={timeFromLessThanOrEqual}&timeFrom.equals={timeFromEquals}&timeFrom.notEquals={timeFromNotEquals}&timeFrom.specified={timeFromSpecified}&timeFrom.in={timeFromIn}&timeFrom.notIn={timeFromNotIn}&timeTo.greaterThan={timeToGreaterThan}&timeTo.lessThan={timeToLessThan}&timeTo.greaterThanOrEqual={timeToGreaterThanOrEqual}&timeTo.lessThanOrEqual={timeToLessThanOrEqual}&timeTo.equals={timeToEquals}&timeTo.notEquals={timeToNotEquals}&timeTo.specified={timeToSpecified}&timeTo.in={timeToIn}&timeTo.notIn={timeToNotIn}&checkedIn.equals={checkedInEquals}&checkedIn.notEquals={checkedInNotEquals}&checkedIn.specified={checkedInSpecified}&checkedIn.in={checkedInIn}&checkedIn.notIn={checkedInNotIn}&status.equals={statusEquals}&status.notEquals={statusNotEquals}&status.specified={statusSpecified}&status.in={statusIn}&status.notIn={statusNotIn}&refundStatus.equals={refundStatusEquals}&refundStatus.notEquals={refundStatusNotEquals}&refundStatus.specified={refundStatusSpecified}&refundStatus.in={refundStatusIn}&refundStatus.notIn={refundStatusNotIn}&refundReason.contains={refundReasonContains}&refundReason.doesNotContain={refundReasonDoesNotContain}&refundReason.equals={refundReasonEquals}&refundReason.notEquals={refundReasonNotEquals}&refundReason.specified={refundReasonSpecified}&refundReason.in={refundReasonIn}&refundReason.notIn={refundReasonNotIn}&refundRequestedAt.greaterThan={refundRequestedAtGreaterThan}&refundRequestedAt.lessThan={refundRequestedAtLessThan}&refundRequestedAt.greaterThanOrEqual={refundRequestedAtGreaterThanOrEqual}&refundRequestedAt.lessThanOrEqual={refundRequestedAtLessThanOrEqual}&refundRequestedAt.equals={refundRequestedAtEquals}&refundRequestedAt.notEquals={refundRequestedAtNotEquals}&refundRequestedAt.specified={refundRequestedAtSpecified}&refundRequestedAt.in={refundRequestedAtIn}&refundRequestedAt.notIn={refundRequestedAtNotIn}&refundCompletedAt.greaterThan={refundCompletedAtGreaterThan}&refundCompletedAt.lessThan={refundCompletedAtLessThan}&refundCompletedAt.greaterThanOrEqual={refundCompletedAtGreaterThanOrEqual}&refundCompletedAt.lessThanOrEqual={refundCompletedAtLessThanOrEqual}&refundCompletedAt.equals={refundCompletedAtEquals}&refundCompletedAt.notEquals={refundCompletedAtNotEquals}&refundCompletedAt.specified={refundCompletedAtSpecified}&refundCompletedAt.in={refundCompletedAtIn}&refundCompletedAt.notIn={refundCompletedAtNotIn}&refundAmount.greaterThan={refundAmountGreaterThan}&refundAmount.lessThan={refundAmountLessThan}&refundAmount.greaterThanOrEqual={refundAmountGreaterThanOrEqual}&refundAmount.lessThanOrEqual={refundAmountLessThanOrEqual}&refundAmount.equals={refundAmountEquals}&refundAmount.notEquals={refundAmountNotEquals}&refundAmount.specified={refundAmountSpecified}&refundAmount.in={refundAmountIn}&refundAmount.notIn={refundAmountNotIn}&refundTransactionId.contains={refundTransactionIdContains}&refundTransactionId.doesNotContain={refundTransactionIdDoesNotContain}&refundTransactionId.equals={refundTransactionIdEquals}&refundTransactionId.notEquals={refundTransactionIdNotEquals}&refundTransactionId.specified={refundTransactionIdSpecified}&refundTransactionId.in={refundTransactionIdIn}&refundTransactionId.notIn={refundTransactionIdNotIn}&tripId.greaterThan={tripIdGreaterThan}&tripId.lessThan={tripIdLessThan}&tripId.greaterThanOrEqual={tripIdGreaterThanOrEqual}&tripId.lessThanOrEqual={tripIdLessThanOrEqual}&tripId.equals={tripIdEquals}&tripId.notEquals={tripIdNotEquals}&tripId.specified={tripIdSpecified}&tripId.in={tripIdIn}&tripId.notIn={tripIdNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&seatId.greaterThan={seatIdGreaterThan}&seatId.lessThan={seatIdLessThan}&seatId.greaterThanOrEqual={seatIdGreaterThanOrEqual}&seatId.lessThanOrEqual={seatIdLessThanOrEqual}&seatId.equals={seatIdEquals}&seatId.notEquals={seatIdNotEquals}&seatId.specified={seatIdSpecified}&seatId.in={seatIdIn}&seatId.notIn={seatIdNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&originalTicketId.greaterThan={originalTicketIdGreaterThan}&originalTicketId.lessThan={originalTicketIdLessThan}&originalTicketId.greaterThanOrEqual={originalTicketIdGreaterThanOrEqual}&originalTicketId.lessThanOrEqual={originalTicketIdLessThanOrEqual}&originalTicketId.equals={originalTicketIdEquals}&originalTicketId.notEquals={originalTicketIdNotEquals}&originalTicketId.specified={originalTicketIdSpecified}&originalTicketId.in={originalTicketIdIn}&originalTicketId.notIn={originalTicketIdNotIn}&exchangedTicketId.greaterThan={exchangedTicketIdGreaterThan}&exchangedTicketId.lessThan={exchangedTicketIdLessThan}&exchangedTicketId.greaterThanOrEqual={exchangedTicketIdGreaterThanOrEqual}&exchangedTicketId.lessThanOrEqual={exchangedTicketIdLessThanOrEqual}&exchangedTicketId.equals={exchangedTicketIdEquals}&exchangedTicketId.notEquals={exchangedTicketIdNotEquals}&exchangedTicketId.specified={exchangedTicketIdSpecified}&exchangedTicketId.in={exchangedTicketIdIn}&exchangedTicketId.notIn={exchangedTicketIdNotIn}&bookingId.greaterThan={bookingIdGreaterThan}&bookingId.lessThan={bookingIdLessThan}&bookingId.greaterThanOrEqual={bookingIdGreaterThanOrEqual}&bookingId.lessThanOrEqual={bookingIdLessThanOrEqual}&bookingId.equals={bookingIdEquals}&bookingId.notEquals={bookingIdNotEquals}&bookingId.specified={bookingIdSpecified}&bookingId.in={bookingIdIn}&bookingId.notIn={bookingIdNotIn}&exchangedFromId.greaterThan={exchangedFromIdGreaterThan}&exchangedFromId.lessThan={exchangedFromIdLessThan}&exchangedFromId.greaterThanOrEqual={exchangedFromIdGreaterThanOrEqual}&exchangedFromId.lessThanOrEqual={exchangedFromIdLessThanOrEqual}&exchangedFromId.equals={exchangedFromIdEquals}&exchangedFromId.notEquals={exchangedFromIdNotEquals}&exchangedFromId.specified={exchangedFromIdSpecified}&exchangedFromId.in={exchangedFromIdIn}&exchangedFromId.notIn={exchangedFromIdNotIn}&exchangedToId.greaterThan={exchangedToIdGreaterThan}&exchangedToId.lessThan={exchangedToIdLessThan}&exchangedToId.greaterThanOrEqual={exchangedToIdGreaterThanOrEqual}&exchangedToId.lessThanOrEqual={exchangedToIdLessThanOrEqual}&exchangedToId.equals={exchangedToIdEquals}&exchangedToId.notEquals={exchangedToIdNotEquals}&exchangedToId.specified={exchangedToIdSpecified}&exchangedToId.in={exchangedToIdIn}&exchangedToId.notIn={exchangedToIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  List<TicketDTO> getAllTickets(@QueryMap(encoded=true) GetAllTicketsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllTickets</code> that receives the query parameters as a map,
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
          *   <li>ticketCodeContains -  (optional)</li>
          *   <li>ticketCodeDoesNotContain -  (optional)</li>
          *   <li>ticketCodeEquals -  (optional)</li>
          *   <li>ticketCodeNotEquals -  (optional)</li>
          *   <li>ticketCodeSpecified -  (optional)</li>
          *   <li>ticketCodeIn -  (optional)</li>
          *   <li>ticketCodeNotIn -  (optional)</li>
          *   <li>priceGreaterThan -  (optional)</li>
          *   <li>priceLessThan -  (optional)</li>
          *   <li>priceGreaterThanOrEqual -  (optional)</li>
          *   <li>priceLessThanOrEqual -  (optional)</li>
          *   <li>priceEquals -  (optional)</li>
          *   <li>priceNotEquals -  (optional)</li>
          *   <li>priceSpecified -  (optional)</li>
          *   <li>priceIn -  (optional)</li>
          *   <li>priceNotIn -  (optional)</li>
          *   <li>timeFromGreaterThan -  (optional)</li>
          *   <li>timeFromLessThan -  (optional)</li>
          *   <li>timeFromGreaterThanOrEqual -  (optional)</li>
          *   <li>timeFromLessThanOrEqual -  (optional)</li>
          *   <li>timeFromEquals -  (optional)</li>
          *   <li>timeFromNotEquals -  (optional)</li>
          *   <li>timeFromSpecified -  (optional)</li>
          *   <li>timeFromIn -  (optional)</li>
          *   <li>timeFromNotIn -  (optional)</li>
          *   <li>timeToGreaterThan -  (optional)</li>
          *   <li>timeToLessThan -  (optional)</li>
          *   <li>timeToGreaterThanOrEqual -  (optional)</li>
          *   <li>timeToLessThanOrEqual -  (optional)</li>
          *   <li>timeToEquals -  (optional)</li>
          *   <li>timeToNotEquals -  (optional)</li>
          *   <li>timeToSpecified -  (optional)</li>
          *   <li>timeToIn -  (optional)</li>
          *   <li>timeToNotIn -  (optional)</li>
          *   <li>checkedInEquals -  (optional)</li>
          *   <li>checkedInNotEquals -  (optional)</li>
          *   <li>checkedInSpecified -  (optional)</li>
          *   <li>checkedInIn -  (optional)</li>
          *   <li>checkedInNotIn -  (optional)</li>
          *   <li>statusEquals -  (optional)</li>
          *   <li>statusNotEquals -  (optional)</li>
          *   <li>statusSpecified -  (optional)</li>
          *   <li>statusIn -  (optional)</li>
          *   <li>statusNotIn -  (optional)</li>
          *   <li>refundStatusEquals -  (optional)</li>
          *   <li>refundStatusNotEquals -  (optional)</li>
          *   <li>refundStatusSpecified -  (optional)</li>
          *   <li>refundStatusIn -  (optional)</li>
          *   <li>refundStatusNotIn -  (optional)</li>
          *   <li>refundReasonContains -  (optional)</li>
          *   <li>refundReasonDoesNotContain -  (optional)</li>
          *   <li>refundReasonEquals -  (optional)</li>
          *   <li>refundReasonNotEquals -  (optional)</li>
          *   <li>refundReasonSpecified -  (optional)</li>
          *   <li>refundReasonIn -  (optional)</li>
          *   <li>refundReasonNotIn -  (optional)</li>
          *   <li>refundRequestedAtGreaterThan -  (optional)</li>
          *   <li>refundRequestedAtLessThan -  (optional)</li>
          *   <li>refundRequestedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>refundRequestedAtLessThanOrEqual -  (optional)</li>
          *   <li>refundRequestedAtEquals -  (optional)</li>
          *   <li>refundRequestedAtNotEquals -  (optional)</li>
          *   <li>refundRequestedAtSpecified -  (optional)</li>
          *   <li>refundRequestedAtIn -  (optional)</li>
          *   <li>refundRequestedAtNotIn -  (optional)</li>
          *   <li>refundCompletedAtGreaterThan -  (optional)</li>
          *   <li>refundCompletedAtLessThan -  (optional)</li>
          *   <li>refundCompletedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>refundCompletedAtLessThanOrEqual -  (optional)</li>
          *   <li>refundCompletedAtEquals -  (optional)</li>
          *   <li>refundCompletedAtNotEquals -  (optional)</li>
          *   <li>refundCompletedAtSpecified -  (optional)</li>
          *   <li>refundCompletedAtIn -  (optional)</li>
          *   <li>refundCompletedAtNotIn -  (optional)</li>
          *   <li>refundAmountGreaterThan -  (optional)</li>
          *   <li>refundAmountLessThan -  (optional)</li>
          *   <li>refundAmountGreaterThanOrEqual -  (optional)</li>
          *   <li>refundAmountLessThanOrEqual -  (optional)</li>
          *   <li>refundAmountEquals -  (optional)</li>
          *   <li>refundAmountNotEquals -  (optional)</li>
          *   <li>refundAmountSpecified -  (optional)</li>
          *   <li>refundAmountIn -  (optional)</li>
          *   <li>refundAmountNotIn -  (optional)</li>
          *   <li>refundTransactionIdContains -  (optional)</li>
          *   <li>refundTransactionIdDoesNotContain -  (optional)</li>
          *   <li>refundTransactionIdEquals -  (optional)</li>
          *   <li>refundTransactionIdNotEquals -  (optional)</li>
          *   <li>refundTransactionIdSpecified -  (optional)</li>
          *   <li>refundTransactionIdIn -  (optional)</li>
          *   <li>refundTransactionIdNotIn -  (optional)</li>
          *   <li>tripIdGreaterThan -  (optional)</li>
          *   <li>tripIdLessThan -  (optional)</li>
          *   <li>tripIdGreaterThanOrEqual -  (optional)</li>
          *   <li>tripIdLessThanOrEqual -  (optional)</li>
          *   <li>tripIdEquals -  (optional)</li>
          *   <li>tripIdNotEquals -  (optional)</li>
          *   <li>tripIdSpecified -  (optional)</li>
          *   <li>tripIdIn -  (optional)</li>
          *   <li>tripIdNotIn -  (optional)</li>
          *   <li>routeIdGreaterThan -  (optional)</li>
          *   <li>routeIdLessThan -  (optional)</li>
          *   <li>routeIdGreaterThanOrEqual -  (optional)</li>
          *   <li>routeIdLessThanOrEqual -  (optional)</li>
          *   <li>routeIdEquals -  (optional)</li>
          *   <li>routeIdNotEquals -  (optional)</li>
          *   <li>routeIdSpecified -  (optional)</li>
          *   <li>routeIdIn -  (optional)</li>
          *   <li>routeIdNotIn -  (optional)</li>
          *   <li>seatIdGreaterThan -  (optional)</li>
          *   <li>seatIdLessThan -  (optional)</li>
          *   <li>seatIdGreaterThanOrEqual -  (optional)</li>
          *   <li>seatIdLessThanOrEqual -  (optional)</li>
          *   <li>seatIdEquals -  (optional)</li>
          *   <li>seatIdNotEquals -  (optional)</li>
          *   <li>seatIdSpecified -  (optional)</li>
          *   <li>seatIdIn -  (optional)</li>
          *   <li>seatIdNotIn -  (optional)</li>
          *   <li>createdAtGreaterThan -  (optional)</li>
          *   <li>createdAtLessThan -  (optional)</li>
          *   <li>createdAtGreaterThanOrEqual -  (optional)</li>
          *   <li>createdAtLessThanOrEqual -  (optional)</li>
          *   <li>createdAtEquals -  (optional)</li>
          *   <li>createdAtNotEquals -  (optional)</li>
          *   <li>createdAtSpecified -  (optional)</li>
          *   <li>createdAtIn -  (optional)</li>
          *   <li>createdAtNotIn -  (optional)</li>
          *   <li>isDeletedEquals -  (optional)</li>
          *   <li>isDeletedNotEquals -  (optional)</li>
          *   <li>isDeletedSpecified -  (optional)</li>
          *   <li>isDeletedIn -  (optional)</li>
          *   <li>isDeletedNotIn -  (optional)</li>
          *   <li>deletedByEquals -  (optional)</li>
          *   <li>deletedByNotEquals -  (optional)</li>
          *   <li>deletedBySpecified -  (optional)</li>
          *   <li>deletedByIn -  (optional)</li>
          *   <li>deletedByNotIn -  (optional)</li>
          *   <li>originalTicketIdGreaterThan -  (optional)</li>
          *   <li>originalTicketIdLessThan -  (optional)</li>
          *   <li>originalTicketIdGreaterThanOrEqual -  (optional)</li>
          *   <li>originalTicketIdLessThanOrEqual -  (optional)</li>
          *   <li>originalTicketIdEquals -  (optional)</li>
          *   <li>originalTicketIdNotEquals -  (optional)</li>
          *   <li>originalTicketIdSpecified -  (optional)</li>
          *   <li>originalTicketIdIn -  (optional)</li>
          *   <li>originalTicketIdNotIn -  (optional)</li>
          *   <li>exchangedTicketIdGreaterThan -  (optional)</li>
          *   <li>exchangedTicketIdLessThan -  (optional)</li>
          *   <li>exchangedTicketIdGreaterThanOrEqual -  (optional)</li>
          *   <li>exchangedTicketIdLessThanOrEqual -  (optional)</li>
          *   <li>exchangedTicketIdEquals -  (optional)</li>
          *   <li>exchangedTicketIdNotEquals -  (optional)</li>
          *   <li>exchangedTicketIdSpecified -  (optional)</li>
          *   <li>exchangedTicketIdIn -  (optional)</li>
          *   <li>exchangedTicketIdNotIn -  (optional)</li>
          *   <li>bookingIdGreaterThan -  (optional)</li>
          *   <li>bookingIdLessThan -  (optional)</li>
          *   <li>bookingIdGreaterThanOrEqual -  (optional)</li>
          *   <li>bookingIdLessThanOrEqual -  (optional)</li>
          *   <li>bookingIdEquals -  (optional)</li>
          *   <li>bookingIdNotEquals -  (optional)</li>
          *   <li>bookingIdSpecified -  (optional)</li>
          *   <li>bookingIdIn -  (optional)</li>
          *   <li>bookingIdNotIn -  (optional)</li>
          *   <li>exchangedFromIdGreaterThan -  (optional)</li>
          *   <li>exchangedFromIdLessThan -  (optional)</li>
          *   <li>exchangedFromIdGreaterThanOrEqual -  (optional)</li>
          *   <li>exchangedFromIdLessThanOrEqual -  (optional)</li>
          *   <li>exchangedFromIdEquals -  (optional)</li>
          *   <li>exchangedFromIdNotEquals -  (optional)</li>
          *   <li>exchangedFromIdSpecified -  (optional)</li>
          *   <li>exchangedFromIdIn -  (optional)</li>
          *   <li>exchangedFromIdNotIn -  (optional)</li>
          *   <li>exchangedToIdGreaterThan -  (optional)</li>
          *   <li>exchangedToIdLessThan -  (optional)</li>
          *   <li>exchangedToIdGreaterThanOrEqual -  (optional)</li>
          *   <li>exchangedToIdLessThanOrEqual -  (optional)</li>
          *   <li>exchangedToIdEquals -  (optional)</li>
          *   <li>exchangedToIdNotEquals -  (optional)</li>
          *   <li>exchangedToIdSpecified -  (optional)</li>
          *   <li>exchangedToIdIn -  (optional)</li>
          *   <li>exchangedToIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return List&lt;TicketDTO&gt;
      */
      @RequestLine("GET /api/tickets?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&ticketCode.contains={ticketCodeContains}&ticketCode.doesNotContain={ticketCodeDoesNotContain}&ticketCode.equals={ticketCodeEquals}&ticketCode.notEquals={ticketCodeNotEquals}&ticketCode.specified={ticketCodeSpecified}&ticketCode.in={ticketCodeIn}&ticketCode.notIn={ticketCodeNotIn}&price.greaterThan={priceGreaterThan}&price.lessThan={priceLessThan}&price.greaterThanOrEqual={priceGreaterThanOrEqual}&price.lessThanOrEqual={priceLessThanOrEqual}&price.equals={priceEquals}&price.notEquals={priceNotEquals}&price.specified={priceSpecified}&price.in={priceIn}&price.notIn={priceNotIn}&timeFrom.greaterThan={timeFromGreaterThan}&timeFrom.lessThan={timeFromLessThan}&timeFrom.greaterThanOrEqual={timeFromGreaterThanOrEqual}&timeFrom.lessThanOrEqual={timeFromLessThanOrEqual}&timeFrom.equals={timeFromEquals}&timeFrom.notEquals={timeFromNotEquals}&timeFrom.specified={timeFromSpecified}&timeFrom.in={timeFromIn}&timeFrom.notIn={timeFromNotIn}&timeTo.greaterThan={timeToGreaterThan}&timeTo.lessThan={timeToLessThan}&timeTo.greaterThanOrEqual={timeToGreaterThanOrEqual}&timeTo.lessThanOrEqual={timeToLessThanOrEqual}&timeTo.equals={timeToEquals}&timeTo.notEquals={timeToNotEquals}&timeTo.specified={timeToSpecified}&timeTo.in={timeToIn}&timeTo.notIn={timeToNotIn}&checkedIn.equals={checkedInEquals}&checkedIn.notEquals={checkedInNotEquals}&checkedIn.specified={checkedInSpecified}&checkedIn.in={checkedInIn}&checkedIn.notIn={checkedInNotIn}&status.equals={statusEquals}&status.notEquals={statusNotEquals}&status.specified={statusSpecified}&status.in={statusIn}&status.notIn={statusNotIn}&refundStatus.equals={refundStatusEquals}&refundStatus.notEquals={refundStatusNotEquals}&refundStatus.specified={refundStatusSpecified}&refundStatus.in={refundStatusIn}&refundStatus.notIn={refundStatusNotIn}&refundReason.contains={refundReasonContains}&refundReason.doesNotContain={refundReasonDoesNotContain}&refundReason.equals={refundReasonEquals}&refundReason.notEquals={refundReasonNotEquals}&refundReason.specified={refundReasonSpecified}&refundReason.in={refundReasonIn}&refundReason.notIn={refundReasonNotIn}&refundRequestedAt.greaterThan={refundRequestedAtGreaterThan}&refundRequestedAt.lessThan={refundRequestedAtLessThan}&refundRequestedAt.greaterThanOrEqual={refundRequestedAtGreaterThanOrEqual}&refundRequestedAt.lessThanOrEqual={refundRequestedAtLessThanOrEqual}&refundRequestedAt.equals={refundRequestedAtEquals}&refundRequestedAt.notEquals={refundRequestedAtNotEquals}&refundRequestedAt.specified={refundRequestedAtSpecified}&refundRequestedAt.in={refundRequestedAtIn}&refundRequestedAt.notIn={refundRequestedAtNotIn}&refundCompletedAt.greaterThan={refundCompletedAtGreaterThan}&refundCompletedAt.lessThan={refundCompletedAtLessThan}&refundCompletedAt.greaterThanOrEqual={refundCompletedAtGreaterThanOrEqual}&refundCompletedAt.lessThanOrEqual={refundCompletedAtLessThanOrEqual}&refundCompletedAt.equals={refundCompletedAtEquals}&refundCompletedAt.notEquals={refundCompletedAtNotEquals}&refundCompletedAt.specified={refundCompletedAtSpecified}&refundCompletedAt.in={refundCompletedAtIn}&refundCompletedAt.notIn={refundCompletedAtNotIn}&refundAmount.greaterThan={refundAmountGreaterThan}&refundAmount.lessThan={refundAmountLessThan}&refundAmount.greaterThanOrEqual={refundAmountGreaterThanOrEqual}&refundAmount.lessThanOrEqual={refundAmountLessThanOrEqual}&refundAmount.equals={refundAmountEquals}&refundAmount.notEquals={refundAmountNotEquals}&refundAmount.specified={refundAmountSpecified}&refundAmount.in={refundAmountIn}&refundAmount.notIn={refundAmountNotIn}&refundTransactionId.contains={refundTransactionIdContains}&refundTransactionId.doesNotContain={refundTransactionIdDoesNotContain}&refundTransactionId.equals={refundTransactionIdEquals}&refundTransactionId.notEquals={refundTransactionIdNotEquals}&refundTransactionId.specified={refundTransactionIdSpecified}&refundTransactionId.in={refundTransactionIdIn}&refundTransactionId.notIn={refundTransactionIdNotIn}&tripId.greaterThan={tripIdGreaterThan}&tripId.lessThan={tripIdLessThan}&tripId.greaterThanOrEqual={tripIdGreaterThanOrEqual}&tripId.lessThanOrEqual={tripIdLessThanOrEqual}&tripId.equals={tripIdEquals}&tripId.notEquals={tripIdNotEquals}&tripId.specified={tripIdSpecified}&tripId.in={tripIdIn}&tripId.notIn={tripIdNotIn}&routeId.greaterThan={routeIdGreaterThan}&routeId.lessThan={routeIdLessThan}&routeId.greaterThanOrEqual={routeIdGreaterThanOrEqual}&routeId.lessThanOrEqual={routeIdLessThanOrEqual}&routeId.equals={routeIdEquals}&routeId.notEquals={routeIdNotEquals}&routeId.specified={routeIdSpecified}&routeId.in={routeIdIn}&routeId.notIn={routeIdNotIn}&seatId.greaterThan={seatIdGreaterThan}&seatId.lessThan={seatIdLessThan}&seatId.greaterThanOrEqual={seatIdGreaterThanOrEqual}&seatId.lessThanOrEqual={seatIdLessThanOrEqual}&seatId.equals={seatIdEquals}&seatId.notEquals={seatIdNotEquals}&seatId.specified={seatIdSpecified}&seatId.in={seatIdIn}&seatId.notIn={seatIdNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&originalTicketId.greaterThan={originalTicketIdGreaterThan}&originalTicketId.lessThan={originalTicketIdLessThan}&originalTicketId.greaterThanOrEqual={originalTicketIdGreaterThanOrEqual}&originalTicketId.lessThanOrEqual={originalTicketIdLessThanOrEqual}&originalTicketId.equals={originalTicketIdEquals}&originalTicketId.notEquals={originalTicketIdNotEquals}&originalTicketId.specified={originalTicketIdSpecified}&originalTicketId.in={originalTicketIdIn}&originalTicketId.notIn={originalTicketIdNotIn}&exchangedTicketId.greaterThan={exchangedTicketIdGreaterThan}&exchangedTicketId.lessThan={exchangedTicketIdLessThan}&exchangedTicketId.greaterThanOrEqual={exchangedTicketIdGreaterThanOrEqual}&exchangedTicketId.lessThanOrEqual={exchangedTicketIdLessThanOrEqual}&exchangedTicketId.equals={exchangedTicketIdEquals}&exchangedTicketId.notEquals={exchangedTicketIdNotEquals}&exchangedTicketId.specified={exchangedTicketIdSpecified}&exchangedTicketId.in={exchangedTicketIdIn}&exchangedTicketId.notIn={exchangedTicketIdNotIn}&bookingId.greaterThan={bookingIdGreaterThan}&bookingId.lessThan={bookingIdLessThan}&bookingId.greaterThanOrEqual={bookingIdGreaterThanOrEqual}&bookingId.lessThanOrEqual={bookingIdLessThanOrEqual}&bookingId.equals={bookingIdEquals}&bookingId.notEquals={bookingIdNotEquals}&bookingId.specified={bookingIdSpecified}&bookingId.in={bookingIdIn}&bookingId.notIn={bookingIdNotIn}&exchangedFromId.greaterThan={exchangedFromIdGreaterThan}&exchangedFromId.lessThan={exchangedFromIdLessThan}&exchangedFromId.greaterThanOrEqual={exchangedFromIdGreaterThanOrEqual}&exchangedFromId.lessThanOrEqual={exchangedFromIdLessThanOrEqual}&exchangedFromId.equals={exchangedFromIdEquals}&exchangedFromId.notEquals={exchangedFromIdNotEquals}&exchangedFromId.specified={exchangedFromIdSpecified}&exchangedFromId.in={exchangedFromIdIn}&exchangedFromId.notIn={exchangedFromIdNotIn}&exchangedToId.greaterThan={exchangedToIdGreaterThan}&exchangedToId.lessThan={exchangedToIdLessThan}&exchangedToId.greaterThanOrEqual={exchangedToIdGreaterThanOrEqual}&exchangedToId.lessThanOrEqual={exchangedToIdLessThanOrEqual}&exchangedToId.equals={exchangedToIdEquals}&exchangedToId.notEquals={exchangedToIdNotEquals}&exchangedToId.specified={exchangedToIdSpecified}&exchangedToId.in={exchangedToIdIn}&exchangedToId.notIn={exchangedToIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<TicketDTO>> getAllTicketsWithHttpInfo(@QueryMap(encoded=true) GetAllTicketsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllTickets</code> method in a fluent style.
   */
  public static class GetAllTicketsQueryParams extends HashMap<String, Object> {
    public GetAllTicketsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams ticketCodeContains(@jakarta.annotation.Nullable final String value) {
      put("ticketCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams ticketCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("ticketCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams ticketCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("ticketCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams ticketCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("ticketCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams ticketCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("ticketCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams ticketCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("ticketCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams ticketCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("ticketCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams priceGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("price.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams priceLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("price.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams priceGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("price.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams priceLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("price.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams priceEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("price.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams priceNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("price.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams priceSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("price.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams priceIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("price.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams priceNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("price.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams timeFromGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeFrom.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams timeFromLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeFrom.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams timeFromGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeFrom.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams timeFromLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeFrom.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams timeFromEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeFrom.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams timeFromNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeFrom.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams timeFromSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("timeFrom.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams timeFromIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("timeFrom.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams timeFromNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("timeFrom.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams timeToGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeTo.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams timeToLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeTo.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams timeToGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeTo.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams timeToLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeTo.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams timeToEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeTo.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams timeToNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timeTo.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams timeToSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("timeTo.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams timeToIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("timeTo.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams timeToNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("timeTo.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams checkedInEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("checkedIn.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams checkedInNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("checkedIn.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams checkedInSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("checkedIn.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams checkedInIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("checkedIn.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams checkedInNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("checkedIn.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams statusEquals(@jakarta.annotation.Nullable final String value) {
      put("status.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams statusNotEquals(@jakarta.annotation.Nullable final String value) {
      put("status.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams statusSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("status.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams statusIn(@jakarta.annotation.Nullable final List<String> value) {
      put("status.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams statusNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("status.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams refundStatusEquals(@jakarta.annotation.Nullable final String value) {
      put("refundStatus.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundStatusNotEquals(@jakarta.annotation.Nullable final String value) {
      put("refundStatus.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundStatusSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("refundStatus.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundStatusIn(@jakarta.annotation.Nullable final List<String> value) {
      put("refundStatus.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams refundStatusNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("refundStatus.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams refundReasonContains(@jakarta.annotation.Nullable final String value) {
      put("refundReason.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundReasonDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("refundReason.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundReasonEquals(@jakarta.annotation.Nullable final String value) {
      put("refundReason.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundReasonNotEquals(@jakarta.annotation.Nullable final String value) {
      put("refundReason.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundReasonSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("refundReason.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundReasonIn(@jakarta.annotation.Nullable final List<String> value) {
      put("refundReason.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams refundReasonNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("refundReason.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams refundRequestedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundRequestedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundRequestedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundRequestedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundRequestedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundRequestedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundRequestedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundRequestedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundRequestedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundRequestedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundRequestedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundRequestedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundRequestedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("refundRequestedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundRequestedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("refundRequestedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams refundRequestedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("refundRequestedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams refundCompletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundCompletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundCompletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundCompletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundCompletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundCompletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundCompletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundCompletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundCompletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundCompletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundCompletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("refundCompletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundCompletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("refundCompletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundCompletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("refundCompletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams refundCompletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("refundCompletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams refundAmountGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("refundAmount.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundAmountLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("refundAmount.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundAmountGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("refundAmount.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundAmountLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("refundAmount.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundAmountEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("refundAmount.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundAmountNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("refundAmount.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundAmountSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("refundAmount.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundAmountIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("refundAmount.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams refundAmountNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("refundAmount.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams refundTransactionIdContains(@jakarta.annotation.Nullable final String value) {
      put("refundTransactionId.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundTransactionIdDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("refundTransactionId.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundTransactionIdEquals(@jakarta.annotation.Nullable final String value) {
      put("refundTransactionId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundTransactionIdNotEquals(@jakarta.annotation.Nullable final String value) {
      put("refundTransactionId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundTransactionIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("refundTransactionId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams refundTransactionIdIn(@jakarta.annotation.Nullable final List<String> value) {
      put("refundTransactionId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams refundTransactionIdNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("refundTransactionId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams tripIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("tripId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams tripIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("tripId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams tripIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("tripId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams tripIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("tripId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams tripIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("tripId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams tripIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("tripId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams tripIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("tripId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams tripIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("tripId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams tripIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("tripId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams routeIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams routeIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams routeIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams routeIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("routeId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams routeIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams routeIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("routeId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams routeIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("routeId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams routeIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams routeIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("routeId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams seatIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("seatId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams seatIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("seatId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams seatIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("seatId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams seatIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("seatId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams seatIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("seatId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams seatIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("seatId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams seatIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("seatId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams seatIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("seatId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams seatIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("seatId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams originalTicketIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("originalTicketId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams originalTicketIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("originalTicketId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams originalTicketIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("originalTicketId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams originalTicketIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("originalTicketId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams originalTicketIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("originalTicketId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams originalTicketIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("originalTicketId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams originalTicketIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("originalTicketId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams originalTicketIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("originalTicketId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams originalTicketIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("originalTicketId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams exchangedTicketIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("exchangedTicketId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedTicketIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("exchangedTicketId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedTicketIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("exchangedTicketId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedTicketIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("exchangedTicketId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedTicketIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("exchangedTicketId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedTicketIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("exchangedTicketId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedTicketIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("exchangedTicketId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedTicketIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("exchangedTicketId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams exchangedTicketIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("exchangedTicketId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams bookingIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams bookingIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams bookingIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams bookingIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams bookingIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams bookingIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("bookingId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams bookingIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("bookingId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams bookingIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("bookingId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams bookingIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("bookingId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams exchangedFromIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("exchangedFromId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedFromIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("exchangedFromId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedFromIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("exchangedFromId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedFromIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("exchangedFromId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedFromIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("exchangedFromId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedFromIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("exchangedFromId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedFromIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("exchangedFromId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedFromIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("exchangedFromId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams exchangedFromIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("exchangedFromId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams exchangedToIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("exchangedToId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedToIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("exchangedToId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedToIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("exchangedToId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedToIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("exchangedToId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedToIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("exchangedToId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedToIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("exchangedToId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedToIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("exchangedToId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTicketsQueryParams exchangedToIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("exchangedToId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams exchangedToIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("exchangedToId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTicketsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return TicketDTO
   */
  @RequestLine("GET /api/tickets/{id}")
  @Headers({
    "Accept: */*",
  })
  TicketDTO getTicket(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getTicket</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/tickets/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<TicketDTO> getTicketWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param bookingCode  (required)
   * @return TicketResponse
   */
  @RequestLine("GET /api/tickets/by-booking-code?bookingCode={bookingCode}")
  @Headers({
    "Accept: */*",
  })
  TicketResponse getTicketsByBookingCode(@Param("bookingCode") @jakarta.annotation.Nonnull String bookingCode);

  /**
   * 
   * Similar to <code>getTicketsByBookingCode</code> but it also returns the http response headers .
   * 
   * @param bookingCode  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/tickets/by-booking-code?bookingCode={bookingCode}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<TicketResponse> getTicketsByBookingCodeWithHttpInfo(@Param("bookingCode") @jakarta.annotation.Nonnull String bookingCode);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getTicketsByBookingCode</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTicketsByBookingCodeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>bookingCode -  (required)</li>
   *   </ul>
   * @return TicketResponse
   */
  @RequestLine("GET /api/tickets/by-booking-code?bookingCode={bookingCode}")
  @Headers({
  "Accept: */*",
  })
  TicketResponse getTicketsByBookingCode(@QueryMap(encoded=true) GetTicketsByBookingCodeQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getTicketsByBookingCode</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>bookingCode -  (required)</li>
      *   </ul>
          * @return TicketResponse
      */
      @RequestLine("GET /api/tickets/by-booking-code?bookingCode={bookingCode}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<TicketResponse> getTicketsByBookingCodeWithHttpInfo(@QueryMap(encoded=true) GetTicketsByBookingCodeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getTicketsByBookingCode</code> method in a fluent style.
   */
  public static class GetTicketsByBookingCodeQueryParams extends HashMap<String, Object> {
    public GetTicketsByBookingCodeQueryParams bookingCode(@jakarta.annotation.Nonnull final String value) {
      put("bookingCode", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @param ticketDTO  (required)
   * @return TicketDTO
   */
  @RequestLine("PATCH /api/tickets/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TicketDTO partialUpdateTicket(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TicketDTO ticketDTO);

  /**
   * 
   * Similar to <code>partialUpdateTicket</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param ticketDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/tickets/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TicketDTO> partialUpdateTicketWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TicketDTO ticketDTO);



  /**
   * 
   * 
   * @param code  (required)
   * @param ticketRefundRequestDTO  (required)
   * @return TicketOperationResponseDTO
   */
  @RequestLine("POST /api/tickets/{code}/refund")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TicketOperationResponseDTO refundTicket(@Param("code") @jakarta.annotation.Nonnull String code, @jakarta.annotation.Nonnull TicketRefundRequestDTO ticketRefundRequestDTO);

  /**
   * 
   * Similar to <code>refundTicket</code> but it also returns the http response headers .
   * 
   * @param code  (required)
   * @param ticketRefundRequestDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/tickets/{code}/refund")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TicketOperationResponseDTO> refundTicketWithHttpInfo(@Param("code") @jakarta.annotation.Nonnull String code, @jakarta.annotation.Nonnull TicketRefundRequestDTO ticketRefundRequestDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param ticketDTO  (required)
   * @return TicketDTO
   */
  @RequestLine("PUT /api/tickets/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TicketDTO updateTicket(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TicketDTO ticketDTO);

  /**
   * 
   * Similar to <code>updateTicket</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param ticketDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/tickets/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TicketDTO> updateTicketWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TicketDTO ticketDTO);


}
