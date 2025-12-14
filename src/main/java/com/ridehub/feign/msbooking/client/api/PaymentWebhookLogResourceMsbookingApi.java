package com.ridehub.feign.msbooking.client.api;

import com.ridehub.feign.msbooking.client.invoker.ApiClient;
import com.ridehub.feign.msbooking.client.invoker.EncodingUtils;
import com.ridehub.feign.msbooking.client.model.ApiResponse;

import java.time.OffsetDateTime;
import com.ridehub.feign.msbooking.client.model.PaymentWebhookLogDTO;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface PaymentWebhookLogResourceMsbookingApi extends ApiClient.Api {


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
   * @param providerContains  (optional)
   * @param providerDoesNotContain  (optional)
   * @param providerEquals  (optional)
   * @param providerNotEquals  (optional)
   * @param providerSpecified  (optional)
   * @param providerIn  (optional)
   * @param providerNotIn  (optional)
   * @param payloadHashContains  (optional)
   * @param payloadHashDoesNotContain  (optional)
   * @param payloadHashEquals  (optional)
   * @param payloadHashNotEquals  (optional)
   * @param payloadHashSpecified  (optional)
   * @param payloadHashIn  (optional)
   * @param payloadHashNotIn  (optional)
   * @param receivedAtGreaterThan  (optional)
   * @param receivedAtLessThan  (optional)
   * @param receivedAtGreaterThanOrEqual  (optional)
   * @param receivedAtLessThanOrEqual  (optional)
   * @param receivedAtEquals  (optional)
   * @param receivedAtNotEquals  (optional)
   * @param receivedAtSpecified  (optional)
   * @param receivedAtIn  (optional)
   * @param receivedAtNotIn  (optional)
   * @param processingStatusContains  (optional)
   * @param processingStatusDoesNotContain  (optional)
   * @param processingStatusEquals  (optional)
   * @param processingStatusNotEquals  (optional)
   * @param processingStatusSpecified  (optional)
   * @param processingStatusIn  (optional)
   * @param processingStatusNotIn  (optional)
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
   * @param paymentTransactionIdGreaterThan  (optional)
   * @param paymentTransactionIdLessThan  (optional)
   * @param paymentTransactionIdGreaterThanOrEqual  (optional)
   * @param paymentTransactionIdLessThanOrEqual  (optional)
   * @param paymentTransactionIdEquals  (optional)
   * @param paymentTransactionIdNotEquals  (optional)
   * @param paymentTransactionIdSpecified  (optional)
   * @param paymentTransactionIdIn  (optional)
   * @param paymentTransactionIdNotIn  (optional)
   * @param distinct  (optional)
   * @return Long
   */
  @RequestLine("GET /api/payment-webhook-logs/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&provider.contains={providerContains}&provider.doesNotContain={providerDoesNotContain}&provider.equals={providerEquals}&provider.notEquals={providerNotEquals}&provider.specified={providerSpecified}&provider.in={providerIn}&provider.notIn={providerNotIn}&payloadHash.contains={payloadHashContains}&payloadHash.doesNotContain={payloadHashDoesNotContain}&payloadHash.equals={payloadHashEquals}&payloadHash.notEquals={payloadHashNotEquals}&payloadHash.specified={payloadHashSpecified}&payloadHash.in={payloadHashIn}&payloadHash.notIn={payloadHashNotIn}&receivedAt.greaterThan={receivedAtGreaterThan}&receivedAt.lessThan={receivedAtLessThan}&receivedAt.greaterThanOrEqual={receivedAtGreaterThanOrEqual}&receivedAt.lessThanOrEqual={receivedAtLessThanOrEqual}&receivedAt.equals={receivedAtEquals}&receivedAt.notEquals={receivedAtNotEquals}&receivedAt.specified={receivedAtSpecified}&receivedAt.in={receivedAtIn}&receivedAt.notIn={receivedAtNotIn}&processingStatus.contains={processingStatusContains}&processingStatus.doesNotContain={processingStatusDoesNotContain}&processingStatus.equals={processingStatusEquals}&processingStatus.notEquals={processingStatusNotEquals}&processingStatus.specified={processingStatusSpecified}&processingStatus.in={processingStatusIn}&processingStatus.notIn={processingStatusNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&paymentTransactionId.greaterThan={paymentTransactionIdGreaterThan}&paymentTransactionId.lessThan={paymentTransactionIdLessThan}&paymentTransactionId.greaterThanOrEqual={paymentTransactionIdGreaterThanOrEqual}&paymentTransactionId.lessThanOrEqual={paymentTransactionIdLessThanOrEqual}&paymentTransactionId.equals={paymentTransactionIdEquals}&paymentTransactionId.notEquals={paymentTransactionIdNotEquals}&paymentTransactionId.specified={paymentTransactionIdSpecified}&paymentTransactionId.in={paymentTransactionIdIn}&paymentTransactionId.notIn={paymentTransactionIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countPaymentWebhookLogs(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("providerContains") @jakarta.annotation.Nullable String providerContains, @Param("providerDoesNotContain") @jakarta.annotation.Nullable String providerDoesNotContain, @Param("providerEquals") @jakarta.annotation.Nullable String providerEquals, @Param("providerNotEquals") @jakarta.annotation.Nullable String providerNotEquals, @Param("providerSpecified") @jakarta.annotation.Nullable Boolean providerSpecified, @Param("providerIn") @jakarta.annotation.Nullable List<String> providerIn, @Param("providerNotIn") @jakarta.annotation.Nullable List<String> providerNotIn, @Param("payloadHashContains") @jakarta.annotation.Nullable String payloadHashContains, @Param("payloadHashDoesNotContain") @jakarta.annotation.Nullable String payloadHashDoesNotContain, @Param("payloadHashEquals") @jakarta.annotation.Nullable String payloadHashEquals, @Param("payloadHashNotEquals") @jakarta.annotation.Nullable String payloadHashNotEquals, @Param("payloadHashSpecified") @jakarta.annotation.Nullable Boolean payloadHashSpecified, @Param("payloadHashIn") @jakarta.annotation.Nullable List<String> payloadHashIn, @Param("payloadHashNotIn") @jakarta.annotation.Nullable List<String> payloadHashNotIn, @Param("receivedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime receivedAtGreaterThan, @Param("receivedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime receivedAtLessThan, @Param("receivedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime receivedAtGreaterThanOrEqual, @Param("receivedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime receivedAtLessThanOrEqual, @Param("receivedAtEquals") @jakarta.annotation.Nullable OffsetDateTime receivedAtEquals, @Param("receivedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime receivedAtNotEquals, @Param("receivedAtSpecified") @jakarta.annotation.Nullable Boolean receivedAtSpecified, @Param("receivedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> receivedAtIn, @Param("receivedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> receivedAtNotIn, @Param("processingStatusContains") @jakarta.annotation.Nullable String processingStatusContains, @Param("processingStatusDoesNotContain") @jakarta.annotation.Nullable String processingStatusDoesNotContain, @Param("processingStatusEquals") @jakarta.annotation.Nullable String processingStatusEquals, @Param("processingStatusNotEquals") @jakarta.annotation.Nullable String processingStatusNotEquals, @Param("processingStatusSpecified") @jakarta.annotation.Nullable Boolean processingStatusSpecified, @Param("processingStatusIn") @jakarta.annotation.Nullable List<String> processingStatusIn, @Param("processingStatusNotIn") @jakarta.annotation.Nullable List<String> processingStatusNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("paymentTransactionIdGreaterThan") @jakarta.annotation.Nullable Long paymentTransactionIdGreaterThan, @Param("paymentTransactionIdLessThan") @jakarta.annotation.Nullable Long paymentTransactionIdLessThan, @Param("paymentTransactionIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long paymentTransactionIdGreaterThanOrEqual, @Param("paymentTransactionIdLessThanOrEqual") @jakarta.annotation.Nullable Long paymentTransactionIdLessThanOrEqual, @Param("paymentTransactionIdEquals") @jakarta.annotation.Nullable Long paymentTransactionIdEquals, @Param("paymentTransactionIdNotEquals") @jakarta.annotation.Nullable Long paymentTransactionIdNotEquals, @Param("paymentTransactionIdSpecified") @jakarta.annotation.Nullable Boolean paymentTransactionIdSpecified, @Param("paymentTransactionIdIn") @jakarta.annotation.Nullable List<Long> paymentTransactionIdIn, @Param("paymentTransactionIdNotIn") @jakarta.annotation.Nullable List<Long> paymentTransactionIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countPaymentWebhookLogs</code> but it also returns the http response headers .
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
   * @param providerContains  (optional)
   * @param providerDoesNotContain  (optional)
   * @param providerEquals  (optional)
   * @param providerNotEquals  (optional)
   * @param providerSpecified  (optional)
   * @param providerIn  (optional)
   * @param providerNotIn  (optional)
   * @param payloadHashContains  (optional)
   * @param payloadHashDoesNotContain  (optional)
   * @param payloadHashEquals  (optional)
   * @param payloadHashNotEquals  (optional)
   * @param payloadHashSpecified  (optional)
   * @param payloadHashIn  (optional)
   * @param payloadHashNotIn  (optional)
   * @param receivedAtGreaterThan  (optional)
   * @param receivedAtLessThan  (optional)
   * @param receivedAtGreaterThanOrEqual  (optional)
   * @param receivedAtLessThanOrEqual  (optional)
   * @param receivedAtEquals  (optional)
   * @param receivedAtNotEquals  (optional)
   * @param receivedAtSpecified  (optional)
   * @param receivedAtIn  (optional)
   * @param receivedAtNotIn  (optional)
   * @param processingStatusContains  (optional)
   * @param processingStatusDoesNotContain  (optional)
   * @param processingStatusEquals  (optional)
   * @param processingStatusNotEquals  (optional)
   * @param processingStatusSpecified  (optional)
   * @param processingStatusIn  (optional)
   * @param processingStatusNotIn  (optional)
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
   * @param paymentTransactionIdGreaterThan  (optional)
   * @param paymentTransactionIdLessThan  (optional)
   * @param paymentTransactionIdGreaterThanOrEqual  (optional)
   * @param paymentTransactionIdLessThanOrEqual  (optional)
   * @param paymentTransactionIdEquals  (optional)
   * @param paymentTransactionIdNotEquals  (optional)
   * @param paymentTransactionIdSpecified  (optional)
   * @param paymentTransactionIdIn  (optional)
   * @param paymentTransactionIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/payment-webhook-logs/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&provider.contains={providerContains}&provider.doesNotContain={providerDoesNotContain}&provider.equals={providerEquals}&provider.notEquals={providerNotEquals}&provider.specified={providerSpecified}&provider.in={providerIn}&provider.notIn={providerNotIn}&payloadHash.contains={payloadHashContains}&payloadHash.doesNotContain={payloadHashDoesNotContain}&payloadHash.equals={payloadHashEquals}&payloadHash.notEquals={payloadHashNotEquals}&payloadHash.specified={payloadHashSpecified}&payloadHash.in={payloadHashIn}&payloadHash.notIn={payloadHashNotIn}&receivedAt.greaterThan={receivedAtGreaterThan}&receivedAt.lessThan={receivedAtLessThan}&receivedAt.greaterThanOrEqual={receivedAtGreaterThanOrEqual}&receivedAt.lessThanOrEqual={receivedAtLessThanOrEqual}&receivedAt.equals={receivedAtEquals}&receivedAt.notEquals={receivedAtNotEquals}&receivedAt.specified={receivedAtSpecified}&receivedAt.in={receivedAtIn}&receivedAt.notIn={receivedAtNotIn}&processingStatus.contains={processingStatusContains}&processingStatus.doesNotContain={processingStatusDoesNotContain}&processingStatus.equals={processingStatusEquals}&processingStatus.notEquals={processingStatusNotEquals}&processingStatus.specified={processingStatusSpecified}&processingStatus.in={processingStatusIn}&processingStatus.notIn={processingStatusNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&paymentTransactionId.greaterThan={paymentTransactionIdGreaterThan}&paymentTransactionId.lessThan={paymentTransactionIdLessThan}&paymentTransactionId.greaterThanOrEqual={paymentTransactionIdGreaterThanOrEqual}&paymentTransactionId.lessThanOrEqual={paymentTransactionIdLessThanOrEqual}&paymentTransactionId.equals={paymentTransactionIdEquals}&paymentTransactionId.notEquals={paymentTransactionIdNotEquals}&paymentTransactionId.specified={paymentTransactionIdSpecified}&paymentTransactionId.in={paymentTransactionIdIn}&paymentTransactionId.notIn={paymentTransactionIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countPaymentWebhookLogsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("providerContains") @jakarta.annotation.Nullable String providerContains, @Param("providerDoesNotContain") @jakarta.annotation.Nullable String providerDoesNotContain, @Param("providerEquals") @jakarta.annotation.Nullable String providerEquals, @Param("providerNotEquals") @jakarta.annotation.Nullable String providerNotEquals, @Param("providerSpecified") @jakarta.annotation.Nullable Boolean providerSpecified, @Param("providerIn") @jakarta.annotation.Nullable List<String> providerIn, @Param("providerNotIn") @jakarta.annotation.Nullable List<String> providerNotIn, @Param("payloadHashContains") @jakarta.annotation.Nullable String payloadHashContains, @Param("payloadHashDoesNotContain") @jakarta.annotation.Nullable String payloadHashDoesNotContain, @Param("payloadHashEquals") @jakarta.annotation.Nullable String payloadHashEquals, @Param("payloadHashNotEquals") @jakarta.annotation.Nullable String payloadHashNotEquals, @Param("payloadHashSpecified") @jakarta.annotation.Nullable Boolean payloadHashSpecified, @Param("payloadHashIn") @jakarta.annotation.Nullable List<String> payloadHashIn, @Param("payloadHashNotIn") @jakarta.annotation.Nullable List<String> payloadHashNotIn, @Param("receivedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime receivedAtGreaterThan, @Param("receivedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime receivedAtLessThan, @Param("receivedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime receivedAtGreaterThanOrEqual, @Param("receivedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime receivedAtLessThanOrEqual, @Param("receivedAtEquals") @jakarta.annotation.Nullable OffsetDateTime receivedAtEquals, @Param("receivedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime receivedAtNotEquals, @Param("receivedAtSpecified") @jakarta.annotation.Nullable Boolean receivedAtSpecified, @Param("receivedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> receivedAtIn, @Param("receivedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> receivedAtNotIn, @Param("processingStatusContains") @jakarta.annotation.Nullable String processingStatusContains, @Param("processingStatusDoesNotContain") @jakarta.annotation.Nullable String processingStatusDoesNotContain, @Param("processingStatusEquals") @jakarta.annotation.Nullable String processingStatusEquals, @Param("processingStatusNotEquals") @jakarta.annotation.Nullable String processingStatusNotEquals, @Param("processingStatusSpecified") @jakarta.annotation.Nullable Boolean processingStatusSpecified, @Param("processingStatusIn") @jakarta.annotation.Nullable List<String> processingStatusIn, @Param("processingStatusNotIn") @jakarta.annotation.Nullable List<String> processingStatusNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("paymentTransactionIdGreaterThan") @jakarta.annotation.Nullable Long paymentTransactionIdGreaterThan, @Param("paymentTransactionIdLessThan") @jakarta.annotation.Nullable Long paymentTransactionIdLessThan, @Param("paymentTransactionIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long paymentTransactionIdGreaterThanOrEqual, @Param("paymentTransactionIdLessThanOrEqual") @jakarta.annotation.Nullable Long paymentTransactionIdLessThanOrEqual, @Param("paymentTransactionIdEquals") @jakarta.annotation.Nullable Long paymentTransactionIdEquals, @Param("paymentTransactionIdNotEquals") @jakarta.annotation.Nullable Long paymentTransactionIdNotEquals, @Param("paymentTransactionIdSpecified") @jakarta.annotation.Nullable Boolean paymentTransactionIdSpecified, @Param("paymentTransactionIdIn") @jakarta.annotation.Nullable List<Long> paymentTransactionIdIn, @Param("paymentTransactionIdNotIn") @jakarta.annotation.Nullable List<Long> paymentTransactionIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countPaymentWebhookLogs</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountPaymentWebhookLogsQueryParams} class that allows for
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
   *   <li>providerContains -  (optional)</li>
   *   <li>providerDoesNotContain -  (optional)</li>
   *   <li>providerEquals -  (optional)</li>
   *   <li>providerNotEquals -  (optional)</li>
   *   <li>providerSpecified -  (optional)</li>
   *   <li>providerIn -  (optional)</li>
   *   <li>providerNotIn -  (optional)</li>
   *   <li>payloadHashContains -  (optional)</li>
   *   <li>payloadHashDoesNotContain -  (optional)</li>
   *   <li>payloadHashEquals -  (optional)</li>
   *   <li>payloadHashNotEquals -  (optional)</li>
   *   <li>payloadHashSpecified -  (optional)</li>
   *   <li>payloadHashIn -  (optional)</li>
   *   <li>payloadHashNotIn -  (optional)</li>
   *   <li>receivedAtGreaterThan -  (optional)</li>
   *   <li>receivedAtLessThan -  (optional)</li>
   *   <li>receivedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>receivedAtLessThanOrEqual -  (optional)</li>
   *   <li>receivedAtEquals -  (optional)</li>
   *   <li>receivedAtNotEquals -  (optional)</li>
   *   <li>receivedAtSpecified -  (optional)</li>
   *   <li>receivedAtIn -  (optional)</li>
   *   <li>receivedAtNotIn -  (optional)</li>
   *   <li>processingStatusContains -  (optional)</li>
   *   <li>processingStatusDoesNotContain -  (optional)</li>
   *   <li>processingStatusEquals -  (optional)</li>
   *   <li>processingStatusNotEquals -  (optional)</li>
   *   <li>processingStatusSpecified -  (optional)</li>
   *   <li>processingStatusIn -  (optional)</li>
   *   <li>processingStatusNotIn -  (optional)</li>
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
   *   <li>paymentTransactionIdGreaterThan -  (optional)</li>
   *   <li>paymentTransactionIdLessThan -  (optional)</li>
   *   <li>paymentTransactionIdGreaterThanOrEqual -  (optional)</li>
   *   <li>paymentTransactionIdLessThanOrEqual -  (optional)</li>
   *   <li>paymentTransactionIdEquals -  (optional)</li>
   *   <li>paymentTransactionIdNotEquals -  (optional)</li>
   *   <li>paymentTransactionIdSpecified -  (optional)</li>
   *   <li>paymentTransactionIdIn -  (optional)</li>
   *   <li>paymentTransactionIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return Long
   */
  @RequestLine("GET /api/payment-webhook-logs/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&provider.contains={providerContains}&provider.doesNotContain={providerDoesNotContain}&provider.equals={providerEquals}&provider.notEquals={providerNotEquals}&provider.specified={providerSpecified}&provider.in={providerIn}&provider.notIn={providerNotIn}&payloadHash.contains={payloadHashContains}&payloadHash.doesNotContain={payloadHashDoesNotContain}&payloadHash.equals={payloadHashEquals}&payloadHash.notEquals={payloadHashNotEquals}&payloadHash.specified={payloadHashSpecified}&payloadHash.in={payloadHashIn}&payloadHash.notIn={payloadHashNotIn}&receivedAt.greaterThan={receivedAtGreaterThan}&receivedAt.lessThan={receivedAtLessThan}&receivedAt.greaterThanOrEqual={receivedAtGreaterThanOrEqual}&receivedAt.lessThanOrEqual={receivedAtLessThanOrEqual}&receivedAt.equals={receivedAtEquals}&receivedAt.notEquals={receivedAtNotEquals}&receivedAt.specified={receivedAtSpecified}&receivedAt.in={receivedAtIn}&receivedAt.notIn={receivedAtNotIn}&processingStatus.contains={processingStatusContains}&processingStatus.doesNotContain={processingStatusDoesNotContain}&processingStatus.equals={processingStatusEquals}&processingStatus.notEquals={processingStatusNotEquals}&processingStatus.specified={processingStatusSpecified}&processingStatus.in={processingStatusIn}&processingStatus.notIn={processingStatusNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&paymentTransactionId.greaterThan={paymentTransactionIdGreaterThan}&paymentTransactionId.lessThan={paymentTransactionIdLessThan}&paymentTransactionId.greaterThanOrEqual={paymentTransactionIdGreaterThanOrEqual}&paymentTransactionId.lessThanOrEqual={paymentTransactionIdLessThanOrEqual}&paymentTransactionId.equals={paymentTransactionIdEquals}&paymentTransactionId.notEquals={paymentTransactionIdNotEquals}&paymentTransactionId.specified={paymentTransactionIdSpecified}&paymentTransactionId.in={paymentTransactionIdIn}&paymentTransactionId.notIn={paymentTransactionIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countPaymentWebhookLogs(@QueryMap(encoded=true) CountPaymentWebhookLogsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countPaymentWebhookLogs</code> that receives the query parameters as a map,
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
          *   <li>providerContains -  (optional)</li>
          *   <li>providerDoesNotContain -  (optional)</li>
          *   <li>providerEquals -  (optional)</li>
          *   <li>providerNotEquals -  (optional)</li>
          *   <li>providerSpecified -  (optional)</li>
          *   <li>providerIn -  (optional)</li>
          *   <li>providerNotIn -  (optional)</li>
          *   <li>payloadHashContains -  (optional)</li>
          *   <li>payloadHashDoesNotContain -  (optional)</li>
          *   <li>payloadHashEquals -  (optional)</li>
          *   <li>payloadHashNotEquals -  (optional)</li>
          *   <li>payloadHashSpecified -  (optional)</li>
          *   <li>payloadHashIn -  (optional)</li>
          *   <li>payloadHashNotIn -  (optional)</li>
          *   <li>receivedAtGreaterThan -  (optional)</li>
          *   <li>receivedAtLessThan -  (optional)</li>
          *   <li>receivedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>receivedAtLessThanOrEqual -  (optional)</li>
          *   <li>receivedAtEquals -  (optional)</li>
          *   <li>receivedAtNotEquals -  (optional)</li>
          *   <li>receivedAtSpecified -  (optional)</li>
          *   <li>receivedAtIn -  (optional)</li>
          *   <li>receivedAtNotIn -  (optional)</li>
          *   <li>processingStatusContains -  (optional)</li>
          *   <li>processingStatusDoesNotContain -  (optional)</li>
          *   <li>processingStatusEquals -  (optional)</li>
          *   <li>processingStatusNotEquals -  (optional)</li>
          *   <li>processingStatusSpecified -  (optional)</li>
          *   <li>processingStatusIn -  (optional)</li>
          *   <li>processingStatusNotIn -  (optional)</li>
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
          *   <li>paymentTransactionIdGreaterThan -  (optional)</li>
          *   <li>paymentTransactionIdLessThan -  (optional)</li>
          *   <li>paymentTransactionIdGreaterThanOrEqual -  (optional)</li>
          *   <li>paymentTransactionIdLessThanOrEqual -  (optional)</li>
          *   <li>paymentTransactionIdEquals -  (optional)</li>
          *   <li>paymentTransactionIdNotEquals -  (optional)</li>
          *   <li>paymentTransactionIdSpecified -  (optional)</li>
          *   <li>paymentTransactionIdIn -  (optional)</li>
          *   <li>paymentTransactionIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return Long
      */
      @RequestLine("GET /api/payment-webhook-logs/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&provider.contains={providerContains}&provider.doesNotContain={providerDoesNotContain}&provider.equals={providerEquals}&provider.notEquals={providerNotEquals}&provider.specified={providerSpecified}&provider.in={providerIn}&provider.notIn={providerNotIn}&payloadHash.contains={payloadHashContains}&payloadHash.doesNotContain={payloadHashDoesNotContain}&payloadHash.equals={payloadHashEquals}&payloadHash.notEquals={payloadHashNotEquals}&payloadHash.specified={payloadHashSpecified}&payloadHash.in={payloadHashIn}&payloadHash.notIn={payloadHashNotIn}&receivedAt.greaterThan={receivedAtGreaterThan}&receivedAt.lessThan={receivedAtLessThan}&receivedAt.greaterThanOrEqual={receivedAtGreaterThanOrEqual}&receivedAt.lessThanOrEqual={receivedAtLessThanOrEqual}&receivedAt.equals={receivedAtEquals}&receivedAt.notEquals={receivedAtNotEquals}&receivedAt.specified={receivedAtSpecified}&receivedAt.in={receivedAtIn}&receivedAt.notIn={receivedAtNotIn}&processingStatus.contains={processingStatusContains}&processingStatus.doesNotContain={processingStatusDoesNotContain}&processingStatus.equals={processingStatusEquals}&processingStatus.notEquals={processingStatusNotEquals}&processingStatus.specified={processingStatusSpecified}&processingStatus.in={processingStatusIn}&processingStatus.notIn={processingStatusNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&paymentTransactionId.greaterThan={paymentTransactionIdGreaterThan}&paymentTransactionId.lessThan={paymentTransactionIdLessThan}&paymentTransactionId.greaterThanOrEqual={paymentTransactionIdGreaterThanOrEqual}&paymentTransactionId.lessThanOrEqual={paymentTransactionIdLessThanOrEqual}&paymentTransactionId.equals={paymentTransactionIdEquals}&paymentTransactionId.notEquals={paymentTransactionIdNotEquals}&paymentTransactionId.specified={paymentTransactionIdSpecified}&paymentTransactionId.in={paymentTransactionIdIn}&paymentTransactionId.notIn={paymentTransactionIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countPaymentWebhookLogsWithHttpInfo(@QueryMap(encoded=true) CountPaymentWebhookLogsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countPaymentWebhookLogs</code> method in a fluent style.
   */
  public static class CountPaymentWebhookLogsQueryParams extends HashMap<String, Object> {
    public CountPaymentWebhookLogsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams providerContains(@jakarta.annotation.Nullable final String value) {
      put("provider.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams providerDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("provider.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams providerEquals(@jakarta.annotation.Nullable final String value) {
      put("provider.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams providerNotEquals(@jakarta.annotation.Nullable final String value) {
      put("provider.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams providerSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("provider.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams providerIn(@jakarta.annotation.Nullable final List<String> value) {
      put("provider.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams providerNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("provider.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams payloadHashContains(@jakarta.annotation.Nullable final String value) {
      put("payloadHash.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams payloadHashDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("payloadHash.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams payloadHashEquals(@jakarta.annotation.Nullable final String value) {
      put("payloadHash.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams payloadHashNotEquals(@jakarta.annotation.Nullable final String value) {
      put("payloadHash.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams payloadHashSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("payloadHash.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams payloadHashIn(@jakarta.annotation.Nullable final List<String> value) {
      put("payloadHash.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams payloadHashNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("payloadHash.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams receivedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("receivedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams receivedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("receivedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams receivedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("receivedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams receivedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("receivedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams receivedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("receivedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams receivedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("receivedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams receivedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("receivedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams receivedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("receivedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams receivedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("receivedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams processingStatusContains(@jakarta.annotation.Nullable final String value) {
      put("processingStatus.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams processingStatusDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("processingStatus.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams processingStatusEquals(@jakarta.annotation.Nullable final String value) {
      put("processingStatus.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams processingStatusNotEquals(@jakarta.annotation.Nullable final String value) {
      put("processingStatus.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams processingStatusSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("processingStatus.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams processingStatusIn(@jakarta.annotation.Nullable final List<String> value) {
      put("processingStatus.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams processingStatusNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("processingStatus.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams paymentTransactionIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("paymentTransactionId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams paymentTransactionIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("paymentTransactionId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams paymentTransactionIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("paymentTransactionId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams paymentTransactionIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("paymentTransactionId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams paymentTransactionIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("paymentTransactionId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams paymentTransactionIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("paymentTransactionId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams paymentTransactionIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("paymentTransactionId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams paymentTransactionIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("paymentTransactionId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams paymentTransactionIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("paymentTransactionId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountPaymentWebhookLogsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param paymentWebhookLogDTO  (required)
   * @return PaymentWebhookLogDTO
   */
  @RequestLine("POST /api/payment-webhook-logs")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  PaymentWebhookLogDTO createPaymentWebhookLog(@jakarta.annotation.Nonnull PaymentWebhookLogDTO paymentWebhookLogDTO);

  /**
   * 
   * Similar to <code>createPaymentWebhookLog</code> but it also returns the http response headers .
   * 
   * @param paymentWebhookLogDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/payment-webhook-logs")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<PaymentWebhookLogDTO> createPaymentWebhookLogWithHttpInfo(@jakarta.annotation.Nonnull PaymentWebhookLogDTO paymentWebhookLogDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/payment-webhook-logs/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deletePaymentWebhookLog(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deletePaymentWebhookLog</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/payment-webhook-logs/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deletePaymentWebhookLogWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



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
   * @param providerContains  (optional)
   * @param providerDoesNotContain  (optional)
   * @param providerEquals  (optional)
   * @param providerNotEquals  (optional)
   * @param providerSpecified  (optional)
   * @param providerIn  (optional)
   * @param providerNotIn  (optional)
   * @param payloadHashContains  (optional)
   * @param payloadHashDoesNotContain  (optional)
   * @param payloadHashEquals  (optional)
   * @param payloadHashNotEquals  (optional)
   * @param payloadHashSpecified  (optional)
   * @param payloadHashIn  (optional)
   * @param payloadHashNotIn  (optional)
   * @param receivedAtGreaterThan  (optional)
   * @param receivedAtLessThan  (optional)
   * @param receivedAtGreaterThanOrEqual  (optional)
   * @param receivedAtLessThanOrEqual  (optional)
   * @param receivedAtEquals  (optional)
   * @param receivedAtNotEquals  (optional)
   * @param receivedAtSpecified  (optional)
   * @param receivedAtIn  (optional)
   * @param receivedAtNotIn  (optional)
   * @param processingStatusContains  (optional)
   * @param processingStatusDoesNotContain  (optional)
   * @param processingStatusEquals  (optional)
   * @param processingStatusNotEquals  (optional)
   * @param processingStatusSpecified  (optional)
   * @param processingStatusIn  (optional)
   * @param processingStatusNotIn  (optional)
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
   * @param paymentTransactionIdGreaterThan  (optional)
   * @param paymentTransactionIdLessThan  (optional)
   * @param paymentTransactionIdGreaterThanOrEqual  (optional)
   * @param paymentTransactionIdLessThanOrEqual  (optional)
   * @param paymentTransactionIdEquals  (optional)
   * @param paymentTransactionIdNotEquals  (optional)
   * @param paymentTransactionIdSpecified  (optional)
   * @param paymentTransactionIdIn  (optional)
   * @param paymentTransactionIdNotIn  (optional)
   * @param distinct  (optional)
   * @return List&lt;PaymentWebhookLogDTO&gt;
   */
  @RequestLine("GET /api/payment-webhook-logs?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&provider.contains={providerContains}&provider.doesNotContain={providerDoesNotContain}&provider.equals={providerEquals}&provider.notEquals={providerNotEquals}&provider.specified={providerSpecified}&provider.in={providerIn}&provider.notIn={providerNotIn}&payloadHash.contains={payloadHashContains}&payloadHash.doesNotContain={payloadHashDoesNotContain}&payloadHash.equals={payloadHashEquals}&payloadHash.notEquals={payloadHashNotEquals}&payloadHash.specified={payloadHashSpecified}&payloadHash.in={payloadHashIn}&payloadHash.notIn={payloadHashNotIn}&receivedAt.greaterThan={receivedAtGreaterThan}&receivedAt.lessThan={receivedAtLessThan}&receivedAt.greaterThanOrEqual={receivedAtGreaterThanOrEqual}&receivedAt.lessThanOrEqual={receivedAtLessThanOrEqual}&receivedAt.equals={receivedAtEquals}&receivedAt.notEquals={receivedAtNotEquals}&receivedAt.specified={receivedAtSpecified}&receivedAt.in={receivedAtIn}&receivedAt.notIn={receivedAtNotIn}&processingStatus.contains={processingStatusContains}&processingStatus.doesNotContain={processingStatusDoesNotContain}&processingStatus.equals={processingStatusEquals}&processingStatus.notEquals={processingStatusNotEquals}&processingStatus.specified={processingStatusSpecified}&processingStatus.in={processingStatusIn}&processingStatus.notIn={processingStatusNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&paymentTransactionId.greaterThan={paymentTransactionIdGreaterThan}&paymentTransactionId.lessThan={paymentTransactionIdLessThan}&paymentTransactionId.greaterThanOrEqual={paymentTransactionIdGreaterThanOrEqual}&paymentTransactionId.lessThanOrEqual={paymentTransactionIdLessThanOrEqual}&paymentTransactionId.equals={paymentTransactionIdEquals}&paymentTransactionId.notEquals={paymentTransactionIdNotEquals}&paymentTransactionId.specified={paymentTransactionIdSpecified}&paymentTransactionId.in={paymentTransactionIdIn}&paymentTransactionId.notIn={paymentTransactionIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  List<PaymentWebhookLogDTO> getAllPaymentWebhookLogs(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("providerContains") @jakarta.annotation.Nullable String providerContains, @Param("providerDoesNotContain") @jakarta.annotation.Nullable String providerDoesNotContain, @Param("providerEquals") @jakarta.annotation.Nullable String providerEquals, @Param("providerNotEquals") @jakarta.annotation.Nullable String providerNotEquals, @Param("providerSpecified") @jakarta.annotation.Nullable Boolean providerSpecified, @Param("providerIn") @jakarta.annotation.Nullable List<String> providerIn, @Param("providerNotIn") @jakarta.annotation.Nullable List<String> providerNotIn, @Param("payloadHashContains") @jakarta.annotation.Nullable String payloadHashContains, @Param("payloadHashDoesNotContain") @jakarta.annotation.Nullable String payloadHashDoesNotContain, @Param("payloadHashEquals") @jakarta.annotation.Nullable String payloadHashEquals, @Param("payloadHashNotEquals") @jakarta.annotation.Nullable String payloadHashNotEquals, @Param("payloadHashSpecified") @jakarta.annotation.Nullable Boolean payloadHashSpecified, @Param("payloadHashIn") @jakarta.annotation.Nullable List<String> payloadHashIn, @Param("payloadHashNotIn") @jakarta.annotation.Nullable List<String> payloadHashNotIn, @Param("receivedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime receivedAtGreaterThan, @Param("receivedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime receivedAtLessThan, @Param("receivedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime receivedAtGreaterThanOrEqual, @Param("receivedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime receivedAtLessThanOrEqual, @Param("receivedAtEquals") @jakarta.annotation.Nullable OffsetDateTime receivedAtEquals, @Param("receivedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime receivedAtNotEquals, @Param("receivedAtSpecified") @jakarta.annotation.Nullable Boolean receivedAtSpecified, @Param("receivedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> receivedAtIn, @Param("receivedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> receivedAtNotIn, @Param("processingStatusContains") @jakarta.annotation.Nullable String processingStatusContains, @Param("processingStatusDoesNotContain") @jakarta.annotation.Nullable String processingStatusDoesNotContain, @Param("processingStatusEquals") @jakarta.annotation.Nullable String processingStatusEquals, @Param("processingStatusNotEquals") @jakarta.annotation.Nullable String processingStatusNotEquals, @Param("processingStatusSpecified") @jakarta.annotation.Nullable Boolean processingStatusSpecified, @Param("processingStatusIn") @jakarta.annotation.Nullable List<String> processingStatusIn, @Param("processingStatusNotIn") @jakarta.annotation.Nullable List<String> processingStatusNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("paymentTransactionIdGreaterThan") @jakarta.annotation.Nullable Long paymentTransactionIdGreaterThan, @Param("paymentTransactionIdLessThan") @jakarta.annotation.Nullable Long paymentTransactionIdLessThan, @Param("paymentTransactionIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long paymentTransactionIdGreaterThanOrEqual, @Param("paymentTransactionIdLessThanOrEqual") @jakarta.annotation.Nullable Long paymentTransactionIdLessThanOrEqual, @Param("paymentTransactionIdEquals") @jakarta.annotation.Nullable Long paymentTransactionIdEquals, @Param("paymentTransactionIdNotEquals") @jakarta.annotation.Nullable Long paymentTransactionIdNotEquals, @Param("paymentTransactionIdSpecified") @jakarta.annotation.Nullable Boolean paymentTransactionIdSpecified, @Param("paymentTransactionIdIn") @jakarta.annotation.Nullable List<Long> paymentTransactionIdIn, @Param("paymentTransactionIdNotIn") @jakarta.annotation.Nullable List<Long> paymentTransactionIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>getAllPaymentWebhookLogs</code> but it also returns the http response headers .
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
   * @param providerContains  (optional)
   * @param providerDoesNotContain  (optional)
   * @param providerEquals  (optional)
   * @param providerNotEquals  (optional)
   * @param providerSpecified  (optional)
   * @param providerIn  (optional)
   * @param providerNotIn  (optional)
   * @param payloadHashContains  (optional)
   * @param payloadHashDoesNotContain  (optional)
   * @param payloadHashEquals  (optional)
   * @param payloadHashNotEquals  (optional)
   * @param payloadHashSpecified  (optional)
   * @param payloadHashIn  (optional)
   * @param payloadHashNotIn  (optional)
   * @param receivedAtGreaterThan  (optional)
   * @param receivedAtLessThan  (optional)
   * @param receivedAtGreaterThanOrEqual  (optional)
   * @param receivedAtLessThanOrEqual  (optional)
   * @param receivedAtEquals  (optional)
   * @param receivedAtNotEquals  (optional)
   * @param receivedAtSpecified  (optional)
   * @param receivedAtIn  (optional)
   * @param receivedAtNotIn  (optional)
   * @param processingStatusContains  (optional)
   * @param processingStatusDoesNotContain  (optional)
   * @param processingStatusEquals  (optional)
   * @param processingStatusNotEquals  (optional)
   * @param processingStatusSpecified  (optional)
   * @param processingStatusIn  (optional)
   * @param processingStatusNotIn  (optional)
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
   * @param paymentTransactionIdGreaterThan  (optional)
   * @param paymentTransactionIdLessThan  (optional)
   * @param paymentTransactionIdGreaterThanOrEqual  (optional)
   * @param paymentTransactionIdLessThanOrEqual  (optional)
   * @param paymentTransactionIdEquals  (optional)
   * @param paymentTransactionIdNotEquals  (optional)
   * @param paymentTransactionIdSpecified  (optional)
   * @param paymentTransactionIdIn  (optional)
   * @param paymentTransactionIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/payment-webhook-logs?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&provider.contains={providerContains}&provider.doesNotContain={providerDoesNotContain}&provider.equals={providerEquals}&provider.notEquals={providerNotEquals}&provider.specified={providerSpecified}&provider.in={providerIn}&provider.notIn={providerNotIn}&payloadHash.contains={payloadHashContains}&payloadHash.doesNotContain={payloadHashDoesNotContain}&payloadHash.equals={payloadHashEquals}&payloadHash.notEquals={payloadHashNotEquals}&payloadHash.specified={payloadHashSpecified}&payloadHash.in={payloadHashIn}&payloadHash.notIn={payloadHashNotIn}&receivedAt.greaterThan={receivedAtGreaterThan}&receivedAt.lessThan={receivedAtLessThan}&receivedAt.greaterThanOrEqual={receivedAtGreaterThanOrEqual}&receivedAt.lessThanOrEqual={receivedAtLessThanOrEqual}&receivedAt.equals={receivedAtEquals}&receivedAt.notEquals={receivedAtNotEquals}&receivedAt.specified={receivedAtSpecified}&receivedAt.in={receivedAtIn}&receivedAt.notIn={receivedAtNotIn}&processingStatus.contains={processingStatusContains}&processingStatus.doesNotContain={processingStatusDoesNotContain}&processingStatus.equals={processingStatusEquals}&processingStatus.notEquals={processingStatusNotEquals}&processingStatus.specified={processingStatusSpecified}&processingStatus.in={processingStatusIn}&processingStatus.notIn={processingStatusNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&paymentTransactionId.greaterThan={paymentTransactionIdGreaterThan}&paymentTransactionId.lessThan={paymentTransactionIdLessThan}&paymentTransactionId.greaterThanOrEqual={paymentTransactionIdGreaterThanOrEqual}&paymentTransactionId.lessThanOrEqual={paymentTransactionIdLessThanOrEqual}&paymentTransactionId.equals={paymentTransactionIdEquals}&paymentTransactionId.notEquals={paymentTransactionIdNotEquals}&paymentTransactionId.specified={paymentTransactionIdSpecified}&paymentTransactionId.in={paymentTransactionIdIn}&paymentTransactionId.notIn={paymentTransactionIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<PaymentWebhookLogDTO>> getAllPaymentWebhookLogsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("providerContains") @jakarta.annotation.Nullable String providerContains, @Param("providerDoesNotContain") @jakarta.annotation.Nullable String providerDoesNotContain, @Param("providerEquals") @jakarta.annotation.Nullable String providerEquals, @Param("providerNotEquals") @jakarta.annotation.Nullable String providerNotEquals, @Param("providerSpecified") @jakarta.annotation.Nullable Boolean providerSpecified, @Param("providerIn") @jakarta.annotation.Nullable List<String> providerIn, @Param("providerNotIn") @jakarta.annotation.Nullable List<String> providerNotIn, @Param("payloadHashContains") @jakarta.annotation.Nullable String payloadHashContains, @Param("payloadHashDoesNotContain") @jakarta.annotation.Nullable String payloadHashDoesNotContain, @Param("payloadHashEquals") @jakarta.annotation.Nullable String payloadHashEquals, @Param("payloadHashNotEquals") @jakarta.annotation.Nullable String payloadHashNotEquals, @Param("payloadHashSpecified") @jakarta.annotation.Nullable Boolean payloadHashSpecified, @Param("payloadHashIn") @jakarta.annotation.Nullable List<String> payloadHashIn, @Param("payloadHashNotIn") @jakarta.annotation.Nullable List<String> payloadHashNotIn, @Param("receivedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime receivedAtGreaterThan, @Param("receivedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime receivedAtLessThan, @Param("receivedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime receivedAtGreaterThanOrEqual, @Param("receivedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime receivedAtLessThanOrEqual, @Param("receivedAtEquals") @jakarta.annotation.Nullable OffsetDateTime receivedAtEquals, @Param("receivedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime receivedAtNotEquals, @Param("receivedAtSpecified") @jakarta.annotation.Nullable Boolean receivedAtSpecified, @Param("receivedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> receivedAtIn, @Param("receivedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> receivedAtNotIn, @Param("processingStatusContains") @jakarta.annotation.Nullable String processingStatusContains, @Param("processingStatusDoesNotContain") @jakarta.annotation.Nullable String processingStatusDoesNotContain, @Param("processingStatusEquals") @jakarta.annotation.Nullable String processingStatusEquals, @Param("processingStatusNotEquals") @jakarta.annotation.Nullable String processingStatusNotEquals, @Param("processingStatusSpecified") @jakarta.annotation.Nullable Boolean processingStatusSpecified, @Param("processingStatusIn") @jakarta.annotation.Nullable List<String> processingStatusIn, @Param("processingStatusNotIn") @jakarta.annotation.Nullable List<String> processingStatusNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("paymentTransactionIdGreaterThan") @jakarta.annotation.Nullable Long paymentTransactionIdGreaterThan, @Param("paymentTransactionIdLessThan") @jakarta.annotation.Nullable Long paymentTransactionIdLessThan, @Param("paymentTransactionIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long paymentTransactionIdGreaterThanOrEqual, @Param("paymentTransactionIdLessThanOrEqual") @jakarta.annotation.Nullable Long paymentTransactionIdLessThanOrEqual, @Param("paymentTransactionIdEquals") @jakarta.annotation.Nullable Long paymentTransactionIdEquals, @Param("paymentTransactionIdNotEquals") @jakarta.annotation.Nullable Long paymentTransactionIdNotEquals, @Param("paymentTransactionIdSpecified") @jakarta.annotation.Nullable Boolean paymentTransactionIdSpecified, @Param("paymentTransactionIdIn") @jakarta.annotation.Nullable List<Long> paymentTransactionIdIn, @Param("paymentTransactionIdNotIn") @jakarta.annotation.Nullable List<Long> paymentTransactionIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllPaymentWebhookLogs</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllPaymentWebhookLogsQueryParams} class that allows for
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
   *   <li>providerContains -  (optional)</li>
   *   <li>providerDoesNotContain -  (optional)</li>
   *   <li>providerEquals -  (optional)</li>
   *   <li>providerNotEquals -  (optional)</li>
   *   <li>providerSpecified -  (optional)</li>
   *   <li>providerIn -  (optional)</li>
   *   <li>providerNotIn -  (optional)</li>
   *   <li>payloadHashContains -  (optional)</li>
   *   <li>payloadHashDoesNotContain -  (optional)</li>
   *   <li>payloadHashEquals -  (optional)</li>
   *   <li>payloadHashNotEquals -  (optional)</li>
   *   <li>payloadHashSpecified -  (optional)</li>
   *   <li>payloadHashIn -  (optional)</li>
   *   <li>payloadHashNotIn -  (optional)</li>
   *   <li>receivedAtGreaterThan -  (optional)</li>
   *   <li>receivedAtLessThan -  (optional)</li>
   *   <li>receivedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>receivedAtLessThanOrEqual -  (optional)</li>
   *   <li>receivedAtEquals -  (optional)</li>
   *   <li>receivedAtNotEquals -  (optional)</li>
   *   <li>receivedAtSpecified -  (optional)</li>
   *   <li>receivedAtIn -  (optional)</li>
   *   <li>receivedAtNotIn -  (optional)</li>
   *   <li>processingStatusContains -  (optional)</li>
   *   <li>processingStatusDoesNotContain -  (optional)</li>
   *   <li>processingStatusEquals -  (optional)</li>
   *   <li>processingStatusNotEquals -  (optional)</li>
   *   <li>processingStatusSpecified -  (optional)</li>
   *   <li>processingStatusIn -  (optional)</li>
   *   <li>processingStatusNotIn -  (optional)</li>
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
   *   <li>paymentTransactionIdGreaterThan -  (optional)</li>
   *   <li>paymentTransactionIdLessThan -  (optional)</li>
   *   <li>paymentTransactionIdGreaterThanOrEqual -  (optional)</li>
   *   <li>paymentTransactionIdLessThanOrEqual -  (optional)</li>
   *   <li>paymentTransactionIdEquals -  (optional)</li>
   *   <li>paymentTransactionIdNotEquals -  (optional)</li>
   *   <li>paymentTransactionIdSpecified -  (optional)</li>
   *   <li>paymentTransactionIdIn -  (optional)</li>
   *   <li>paymentTransactionIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return List&lt;PaymentWebhookLogDTO&gt;
   */
  @RequestLine("GET /api/payment-webhook-logs?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&provider.contains={providerContains}&provider.doesNotContain={providerDoesNotContain}&provider.equals={providerEquals}&provider.notEquals={providerNotEquals}&provider.specified={providerSpecified}&provider.in={providerIn}&provider.notIn={providerNotIn}&payloadHash.contains={payloadHashContains}&payloadHash.doesNotContain={payloadHashDoesNotContain}&payloadHash.equals={payloadHashEquals}&payloadHash.notEquals={payloadHashNotEquals}&payloadHash.specified={payloadHashSpecified}&payloadHash.in={payloadHashIn}&payloadHash.notIn={payloadHashNotIn}&receivedAt.greaterThan={receivedAtGreaterThan}&receivedAt.lessThan={receivedAtLessThan}&receivedAt.greaterThanOrEqual={receivedAtGreaterThanOrEqual}&receivedAt.lessThanOrEqual={receivedAtLessThanOrEqual}&receivedAt.equals={receivedAtEquals}&receivedAt.notEquals={receivedAtNotEquals}&receivedAt.specified={receivedAtSpecified}&receivedAt.in={receivedAtIn}&receivedAt.notIn={receivedAtNotIn}&processingStatus.contains={processingStatusContains}&processingStatus.doesNotContain={processingStatusDoesNotContain}&processingStatus.equals={processingStatusEquals}&processingStatus.notEquals={processingStatusNotEquals}&processingStatus.specified={processingStatusSpecified}&processingStatus.in={processingStatusIn}&processingStatus.notIn={processingStatusNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&paymentTransactionId.greaterThan={paymentTransactionIdGreaterThan}&paymentTransactionId.lessThan={paymentTransactionIdLessThan}&paymentTransactionId.greaterThanOrEqual={paymentTransactionIdGreaterThanOrEqual}&paymentTransactionId.lessThanOrEqual={paymentTransactionIdLessThanOrEqual}&paymentTransactionId.equals={paymentTransactionIdEquals}&paymentTransactionId.notEquals={paymentTransactionIdNotEquals}&paymentTransactionId.specified={paymentTransactionIdSpecified}&paymentTransactionId.in={paymentTransactionIdIn}&paymentTransactionId.notIn={paymentTransactionIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  List<PaymentWebhookLogDTO> getAllPaymentWebhookLogs(@QueryMap(encoded=true) GetAllPaymentWebhookLogsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllPaymentWebhookLogs</code> that receives the query parameters as a map,
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
          *   <li>providerContains -  (optional)</li>
          *   <li>providerDoesNotContain -  (optional)</li>
          *   <li>providerEquals -  (optional)</li>
          *   <li>providerNotEquals -  (optional)</li>
          *   <li>providerSpecified -  (optional)</li>
          *   <li>providerIn -  (optional)</li>
          *   <li>providerNotIn -  (optional)</li>
          *   <li>payloadHashContains -  (optional)</li>
          *   <li>payloadHashDoesNotContain -  (optional)</li>
          *   <li>payloadHashEquals -  (optional)</li>
          *   <li>payloadHashNotEquals -  (optional)</li>
          *   <li>payloadHashSpecified -  (optional)</li>
          *   <li>payloadHashIn -  (optional)</li>
          *   <li>payloadHashNotIn -  (optional)</li>
          *   <li>receivedAtGreaterThan -  (optional)</li>
          *   <li>receivedAtLessThan -  (optional)</li>
          *   <li>receivedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>receivedAtLessThanOrEqual -  (optional)</li>
          *   <li>receivedAtEquals -  (optional)</li>
          *   <li>receivedAtNotEquals -  (optional)</li>
          *   <li>receivedAtSpecified -  (optional)</li>
          *   <li>receivedAtIn -  (optional)</li>
          *   <li>receivedAtNotIn -  (optional)</li>
          *   <li>processingStatusContains -  (optional)</li>
          *   <li>processingStatusDoesNotContain -  (optional)</li>
          *   <li>processingStatusEquals -  (optional)</li>
          *   <li>processingStatusNotEquals -  (optional)</li>
          *   <li>processingStatusSpecified -  (optional)</li>
          *   <li>processingStatusIn -  (optional)</li>
          *   <li>processingStatusNotIn -  (optional)</li>
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
          *   <li>paymentTransactionIdGreaterThan -  (optional)</li>
          *   <li>paymentTransactionIdLessThan -  (optional)</li>
          *   <li>paymentTransactionIdGreaterThanOrEqual -  (optional)</li>
          *   <li>paymentTransactionIdLessThanOrEqual -  (optional)</li>
          *   <li>paymentTransactionIdEquals -  (optional)</li>
          *   <li>paymentTransactionIdNotEquals -  (optional)</li>
          *   <li>paymentTransactionIdSpecified -  (optional)</li>
          *   <li>paymentTransactionIdIn -  (optional)</li>
          *   <li>paymentTransactionIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return List&lt;PaymentWebhookLogDTO&gt;
      */
      @RequestLine("GET /api/payment-webhook-logs?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&provider.contains={providerContains}&provider.doesNotContain={providerDoesNotContain}&provider.equals={providerEquals}&provider.notEquals={providerNotEquals}&provider.specified={providerSpecified}&provider.in={providerIn}&provider.notIn={providerNotIn}&payloadHash.contains={payloadHashContains}&payloadHash.doesNotContain={payloadHashDoesNotContain}&payloadHash.equals={payloadHashEquals}&payloadHash.notEquals={payloadHashNotEquals}&payloadHash.specified={payloadHashSpecified}&payloadHash.in={payloadHashIn}&payloadHash.notIn={payloadHashNotIn}&receivedAt.greaterThan={receivedAtGreaterThan}&receivedAt.lessThan={receivedAtLessThan}&receivedAt.greaterThanOrEqual={receivedAtGreaterThanOrEqual}&receivedAt.lessThanOrEqual={receivedAtLessThanOrEqual}&receivedAt.equals={receivedAtEquals}&receivedAt.notEquals={receivedAtNotEquals}&receivedAt.specified={receivedAtSpecified}&receivedAt.in={receivedAtIn}&receivedAt.notIn={receivedAtNotIn}&processingStatus.contains={processingStatusContains}&processingStatus.doesNotContain={processingStatusDoesNotContain}&processingStatus.equals={processingStatusEquals}&processingStatus.notEquals={processingStatusNotEquals}&processingStatus.specified={processingStatusSpecified}&processingStatus.in={processingStatusIn}&processingStatus.notIn={processingStatusNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&paymentTransactionId.greaterThan={paymentTransactionIdGreaterThan}&paymentTransactionId.lessThan={paymentTransactionIdLessThan}&paymentTransactionId.greaterThanOrEqual={paymentTransactionIdGreaterThanOrEqual}&paymentTransactionId.lessThanOrEqual={paymentTransactionIdLessThanOrEqual}&paymentTransactionId.equals={paymentTransactionIdEquals}&paymentTransactionId.notEquals={paymentTransactionIdNotEquals}&paymentTransactionId.specified={paymentTransactionIdSpecified}&paymentTransactionId.in={paymentTransactionIdIn}&paymentTransactionId.notIn={paymentTransactionIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<PaymentWebhookLogDTO>> getAllPaymentWebhookLogsWithHttpInfo(@QueryMap(encoded=true) GetAllPaymentWebhookLogsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllPaymentWebhookLogs</code> method in a fluent style.
   */
  public static class GetAllPaymentWebhookLogsQueryParams extends HashMap<String, Object> {
    public GetAllPaymentWebhookLogsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams providerContains(@jakarta.annotation.Nullable final String value) {
      put("provider.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams providerDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("provider.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams providerEquals(@jakarta.annotation.Nullable final String value) {
      put("provider.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams providerNotEquals(@jakarta.annotation.Nullable final String value) {
      put("provider.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams providerSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("provider.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams providerIn(@jakarta.annotation.Nullable final List<String> value) {
      put("provider.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams providerNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("provider.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams payloadHashContains(@jakarta.annotation.Nullable final String value) {
      put("payloadHash.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams payloadHashDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("payloadHash.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams payloadHashEquals(@jakarta.annotation.Nullable final String value) {
      put("payloadHash.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams payloadHashNotEquals(@jakarta.annotation.Nullable final String value) {
      put("payloadHash.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams payloadHashSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("payloadHash.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams payloadHashIn(@jakarta.annotation.Nullable final List<String> value) {
      put("payloadHash.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams payloadHashNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("payloadHash.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams receivedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("receivedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams receivedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("receivedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams receivedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("receivedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams receivedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("receivedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams receivedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("receivedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams receivedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("receivedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams receivedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("receivedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams receivedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("receivedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams receivedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("receivedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams processingStatusContains(@jakarta.annotation.Nullable final String value) {
      put("processingStatus.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams processingStatusDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("processingStatus.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams processingStatusEquals(@jakarta.annotation.Nullable final String value) {
      put("processingStatus.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams processingStatusNotEquals(@jakarta.annotation.Nullable final String value) {
      put("processingStatus.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams processingStatusSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("processingStatus.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams processingStatusIn(@jakarta.annotation.Nullable final List<String> value) {
      put("processingStatus.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams processingStatusNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("processingStatus.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams paymentTransactionIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("paymentTransactionId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams paymentTransactionIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("paymentTransactionId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams paymentTransactionIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("paymentTransactionId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams paymentTransactionIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("paymentTransactionId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams paymentTransactionIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("paymentTransactionId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams paymentTransactionIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("paymentTransactionId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams paymentTransactionIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("paymentTransactionId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams paymentTransactionIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("paymentTransactionId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams paymentTransactionIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("paymentTransactionId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllPaymentWebhookLogsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return PaymentWebhookLogDTO
   */
  @RequestLine("GET /api/payment-webhook-logs/{id}")
  @Headers({
    "Accept: */*",
  })
  PaymentWebhookLogDTO getPaymentWebhookLog(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getPaymentWebhookLog</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/payment-webhook-logs/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<PaymentWebhookLogDTO> getPaymentWebhookLogWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param paymentWebhookLogDTO  (required)
   * @return PaymentWebhookLogDTO
   */
  @RequestLine("PATCH /api/payment-webhook-logs/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  PaymentWebhookLogDTO partialUpdatePaymentWebhookLog(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull PaymentWebhookLogDTO paymentWebhookLogDTO);

  /**
   * 
   * Similar to <code>partialUpdatePaymentWebhookLog</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param paymentWebhookLogDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/payment-webhook-logs/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<PaymentWebhookLogDTO> partialUpdatePaymentWebhookLogWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull PaymentWebhookLogDTO paymentWebhookLogDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param paymentWebhookLogDTO  (required)
   * @return PaymentWebhookLogDTO
   */
  @RequestLine("PUT /api/payment-webhook-logs/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  PaymentWebhookLogDTO updatePaymentWebhookLog(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull PaymentWebhookLogDTO paymentWebhookLogDTO);

  /**
   * 
   * Similar to <code>updatePaymentWebhookLog</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param paymentWebhookLogDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/payment-webhook-logs/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<PaymentWebhookLogDTO> updatePaymentWebhookLogWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull PaymentWebhookLogDTO paymentWebhookLogDTO);


}
