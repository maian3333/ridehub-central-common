package com.ridehub.feign.msuser.client.api;

import com.ridehub.feign.msuser.client.invoker.ApiClient;
import com.ridehub.feign.msuser.client.invoker.EncodingUtils;
import com.ridehub.feign.msuser.client.model.ApiResponse;

import java.time.OffsetDateTime;
import java.util.UUID;
import com.ridehub.feign.msuser.client.model.UserQueryDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface UserQueryResourceMsuserApi extends ApiClient.Api {


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
   * @param queryTextContains  (optional)
   * @param queryTextDoesNotContain  (optional)
   * @param queryTextEquals  (optional)
   * @param queryTextNotEquals  (optional)
   * @param queryTextSpecified  (optional)
   * @param queryTextIn  (optional)
   * @param queryTextNotIn  (optional)
   * @param queryTypeContains  (optional)
   * @param queryTypeDoesNotContain  (optional)
   * @param queryTypeEquals  (optional)
   * @param queryTypeNotEquals  (optional)
   * @param queryTypeSpecified  (optional)
   * @param queryTypeIn  (optional)
   * @param queryTypeNotIn  (optional)
   * @param parametersContains  (optional)
   * @param parametersDoesNotContain  (optional)
   * @param parametersEquals  (optional)
   * @param parametersNotEquals  (optional)
   * @param parametersSpecified  (optional)
   * @param parametersIn  (optional)
   * @param parametersNotIn  (optional)
   * @param responseGeneratedEquals  (optional)
   * @param responseGeneratedNotEquals  (optional)
   * @param responseGeneratedSpecified  (optional)
   * @param responseGeneratedIn  (optional)
   * @param responseGeneratedNotIn  (optional)
   * @param responseTimeGreaterThan  (optional)
   * @param responseTimeLessThan  (optional)
   * @param responseTimeGreaterThanOrEqual  (optional)
   * @param responseTimeLessThanOrEqual  (optional)
   * @param responseTimeEquals  (optional)
   * @param responseTimeNotEquals  (optional)
   * @param responseTimeSpecified  (optional)
   * @param responseTimeIn  (optional)
   * @param responseTimeNotIn  (optional)
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
   * @param chatSessionIdGreaterThan  (optional)
   * @param chatSessionIdLessThan  (optional)
   * @param chatSessionIdGreaterThanOrEqual  (optional)
   * @param chatSessionIdLessThanOrEqual  (optional)
   * @param chatSessionIdEquals  (optional)
   * @param chatSessionIdNotEquals  (optional)
   * @param chatSessionIdSpecified  (optional)
   * @param chatSessionIdIn  (optional)
   * @param chatSessionIdNotIn  (optional)
   * @param distinct  (optional)
   * @return Long
   */
  @RequestLine("GET /api/user-queries/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&queryText.contains={queryTextContains}&queryText.doesNotContain={queryTextDoesNotContain}&queryText.equals={queryTextEquals}&queryText.notEquals={queryTextNotEquals}&queryText.specified={queryTextSpecified}&queryText.in={queryTextIn}&queryText.notIn={queryTextNotIn}&queryType.contains={queryTypeContains}&queryType.doesNotContain={queryTypeDoesNotContain}&queryType.equals={queryTypeEquals}&queryType.notEquals={queryTypeNotEquals}&queryType.specified={queryTypeSpecified}&queryType.in={queryTypeIn}&queryType.notIn={queryTypeNotIn}&parameters.contains={parametersContains}&parameters.doesNotContain={parametersDoesNotContain}&parameters.equals={parametersEquals}&parameters.notEquals={parametersNotEquals}&parameters.specified={parametersSpecified}&parameters.in={parametersIn}&parameters.notIn={parametersNotIn}&responseGenerated.equals={responseGeneratedEquals}&responseGenerated.notEquals={responseGeneratedNotEquals}&responseGenerated.specified={responseGeneratedSpecified}&responseGenerated.in={responseGeneratedIn}&responseGenerated.notIn={responseGeneratedNotIn}&responseTime.greaterThan={responseTimeGreaterThan}&responseTime.lessThan={responseTimeLessThan}&responseTime.greaterThanOrEqual={responseTimeGreaterThanOrEqual}&responseTime.lessThanOrEqual={responseTimeLessThanOrEqual}&responseTime.equals={responseTimeEquals}&responseTime.notEquals={responseTimeNotEquals}&responseTime.specified={responseTimeSpecified}&responseTime.in={responseTimeIn}&responseTime.notIn={responseTimeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&chatSessionId.greaterThan={chatSessionIdGreaterThan}&chatSessionId.lessThan={chatSessionIdLessThan}&chatSessionId.greaterThanOrEqual={chatSessionIdGreaterThanOrEqual}&chatSessionId.lessThanOrEqual={chatSessionIdLessThanOrEqual}&chatSessionId.equals={chatSessionIdEquals}&chatSessionId.notEquals={chatSessionIdNotEquals}&chatSessionId.specified={chatSessionIdSpecified}&chatSessionId.in={chatSessionIdIn}&chatSessionId.notIn={chatSessionIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countUserQueries(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("queryTextContains") @jakarta.annotation.Nullable String queryTextContains, @Param("queryTextDoesNotContain") @jakarta.annotation.Nullable String queryTextDoesNotContain, @Param("queryTextEquals") @jakarta.annotation.Nullable String queryTextEquals, @Param("queryTextNotEquals") @jakarta.annotation.Nullable String queryTextNotEquals, @Param("queryTextSpecified") @jakarta.annotation.Nullable Boolean queryTextSpecified, @Param("queryTextIn") @jakarta.annotation.Nullable List<String> queryTextIn, @Param("queryTextNotIn") @jakarta.annotation.Nullable List<String> queryTextNotIn, @Param("queryTypeContains") @jakarta.annotation.Nullable String queryTypeContains, @Param("queryTypeDoesNotContain") @jakarta.annotation.Nullable String queryTypeDoesNotContain, @Param("queryTypeEquals") @jakarta.annotation.Nullable String queryTypeEquals, @Param("queryTypeNotEquals") @jakarta.annotation.Nullable String queryTypeNotEquals, @Param("queryTypeSpecified") @jakarta.annotation.Nullable Boolean queryTypeSpecified, @Param("queryTypeIn") @jakarta.annotation.Nullable List<String> queryTypeIn, @Param("queryTypeNotIn") @jakarta.annotation.Nullable List<String> queryTypeNotIn, @Param("parametersContains") @jakarta.annotation.Nullable String parametersContains, @Param("parametersDoesNotContain") @jakarta.annotation.Nullable String parametersDoesNotContain, @Param("parametersEquals") @jakarta.annotation.Nullable String parametersEquals, @Param("parametersNotEquals") @jakarta.annotation.Nullable String parametersNotEquals, @Param("parametersSpecified") @jakarta.annotation.Nullable Boolean parametersSpecified, @Param("parametersIn") @jakarta.annotation.Nullable List<String> parametersIn, @Param("parametersNotIn") @jakarta.annotation.Nullable List<String> parametersNotIn, @Param("responseGeneratedEquals") @jakarta.annotation.Nullable Boolean responseGeneratedEquals, @Param("responseGeneratedNotEquals") @jakarta.annotation.Nullable Boolean responseGeneratedNotEquals, @Param("responseGeneratedSpecified") @jakarta.annotation.Nullable Boolean responseGeneratedSpecified, @Param("responseGeneratedIn") @jakarta.annotation.Nullable List<Boolean> responseGeneratedIn, @Param("responseGeneratedNotIn") @jakarta.annotation.Nullable List<Boolean> responseGeneratedNotIn, @Param("responseTimeGreaterThan") @jakarta.annotation.Nullable Integer responseTimeGreaterThan, @Param("responseTimeLessThan") @jakarta.annotation.Nullable Integer responseTimeLessThan, @Param("responseTimeGreaterThanOrEqual") @jakarta.annotation.Nullable Integer responseTimeGreaterThanOrEqual, @Param("responseTimeLessThanOrEqual") @jakarta.annotation.Nullable Integer responseTimeLessThanOrEqual, @Param("responseTimeEquals") @jakarta.annotation.Nullable Integer responseTimeEquals, @Param("responseTimeNotEquals") @jakarta.annotation.Nullable Integer responseTimeNotEquals, @Param("responseTimeSpecified") @jakarta.annotation.Nullable Boolean responseTimeSpecified, @Param("responseTimeIn") @jakarta.annotation.Nullable List<Integer> responseTimeIn, @Param("responseTimeNotIn") @jakarta.annotation.Nullable List<Integer> responseTimeNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("chatSessionIdGreaterThan") @jakarta.annotation.Nullable Long chatSessionIdGreaterThan, @Param("chatSessionIdLessThan") @jakarta.annotation.Nullable Long chatSessionIdLessThan, @Param("chatSessionIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long chatSessionIdGreaterThanOrEqual, @Param("chatSessionIdLessThanOrEqual") @jakarta.annotation.Nullable Long chatSessionIdLessThanOrEqual, @Param("chatSessionIdEquals") @jakarta.annotation.Nullable Long chatSessionIdEquals, @Param("chatSessionIdNotEquals") @jakarta.annotation.Nullable Long chatSessionIdNotEquals, @Param("chatSessionIdSpecified") @jakarta.annotation.Nullable Boolean chatSessionIdSpecified, @Param("chatSessionIdIn") @jakarta.annotation.Nullable List<Long> chatSessionIdIn, @Param("chatSessionIdNotIn") @jakarta.annotation.Nullable List<Long> chatSessionIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countUserQueries</code> but it also returns the http response headers .
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
   * @param queryTextContains  (optional)
   * @param queryTextDoesNotContain  (optional)
   * @param queryTextEquals  (optional)
   * @param queryTextNotEquals  (optional)
   * @param queryTextSpecified  (optional)
   * @param queryTextIn  (optional)
   * @param queryTextNotIn  (optional)
   * @param queryTypeContains  (optional)
   * @param queryTypeDoesNotContain  (optional)
   * @param queryTypeEquals  (optional)
   * @param queryTypeNotEquals  (optional)
   * @param queryTypeSpecified  (optional)
   * @param queryTypeIn  (optional)
   * @param queryTypeNotIn  (optional)
   * @param parametersContains  (optional)
   * @param parametersDoesNotContain  (optional)
   * @param parametersEquals  (optional)
   * @param parametersNotEquals  (optional)
   * @param parametersSpecified  (optional)
   * @param parametersIn  (optional)
   * @param parametersNotIn  (optional)
   * @param responseGeneratedEquals  (optional)
   * @param responseGeneratedNotEquals  (optional)
   * @param responseGeneratedSpecified  (optional)
   * @param responseGeneratedIn  (optional)
   * @param responseGeneratedNotIn  (optional)
   * @param responseTimeGreaterThan  (optional)
   * @param responseTimeLessThan  (optional)
   * @param responseTimeGreaterThanOrEqual  (optional)
   * @param responseTimeLessThanOrEqual  (optional)
   * @param responseTimeEquals  (optional)
   * @param responseTimeNotEquals  (optional)
   * @param responseTimeSpecified  (optional)
   * @param responseTimeIn  (optional)
   * @param responseTimeNotIn  (optional)
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
   * @param chatSessionIdGreaterThan  (optional)
   * @param chatSessionIdLessThan  (optional)
   * @param chatSessionIdGreaterThanOrEqual  (optional)
   * @param chatSessionIdLessThanOrEqual  (optional)
   * @param chatSessionIdEquals  (optional)
   * @param chatSessionIdNotEquals  (optional)
   * @param chatSessionIdSpecified  (optional)
   * @param chatSessionIdIn  (optional)
   * @param chatSessionIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/user-queries/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&queryText.contains={queryTextContains}&queryText.doesNotContain={queryTextDoesNotContain}&queryText.equals={queryTextEquals}&queryText.notEquals={queryTextNotEquals}&queryText.specified={queryTextSpecified}&queryText.in={queryTextIn}&queryText.notIn={queryTextNotIn}&queryType.contains={queryTypeContains}&queryType.doesNotContain={queryTypeDoesNotContain}&queryType.equals={queryTypeEquals}&queryType.notEquals={queryTypeNotEquals}&queryType.specified={queryTypeSpecified}&queryType.in={queryTypeIn}&queryType.notIn={queryTypeNotIn}&parameters.contains={parametersContains}&parameters.doesNotContain={parametersDoesNotContain}&parameters.equals={parametersEquals}&parameters.notEquals={parametersNotEquals}&parameters.specified={parametersSpecified}&parameters.in={parametersIn}&parameters.notIn={parametersNotIn}&responseGenerated.equals={responseGeneratedEquals}&responseGenerated.notEquals={responseGeneratedNotEquals}&responseGenerated.specified={responseGeneratedSpecified}&responseGenerated.in={responseGeneratedIn}&responseGenerated.notIn={responseGeneratedNotIn}&responseTime.greaterThan={responseTimeGreaterThan}&responseTime.lessThan={responseTimeLessThan}&responseTime.greaterThanOrEqual={responseTimeGreaterThanOrEqual}&responseTime.lessThanOrEqual={responseTimeLessThanOrEqual}&responseTime.equals={responseTimeEquals}&responseTime.notEquals={responseTimeNotEquals}&responseTime.specified={responseTimeSpecified}&responseTime.in={responseTimeIn}&responseTime.notIn={responseTimeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&chatSessionId.greaterThan={chatSessionIdGreaterThan}&chatSessionId.lessThan={chatSessionIdLessThan}&chatSessionId.greaterThanOrEqual={chatSessionIdGreaterThanOrEqual}&chatSessionId.lessThanOrEqual={chatSessionIdLessThanOrEqual}&chatSessionId.equals={chatSessionIdEquals}&chatSessionId.notEquals={chatSessionIdNotEquals}&chatSessionId.specified={chatSessionIdSpecified}&chatSessionId.in={chatSessionIdIn}&chatSessionId.notIn={chatSessionIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countUserQueriesWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("queryTextContains") @jakarta.annotation.Nullable String queryTextContains, @Param("queryTextDoesNotContain") @jakarta.annotation.Nullable String queryTextDoesNotContain, @Param("queryTextEquals") @jakarta.annotation.Nullable String queryTextEquals, @Param("queryTextNotEquals") @jakarta.annotation.Nullable String queryTextNotEquals, @Param("queryTextSpecified") @jakarta.annotation.Nullable Boolean queryTextSpecified, @Param("queryTextIn") @jakarta.annotation.Nullable List<String> queryTextIn, @Param("queryTextNotIn") @jakarta.annotation.Nullable List<String> queryTextNotIn, @Param("queryTypeContains") @jakarta.annotation.Nullable String queryTypeContains, @Param("queryTypeDoesNotContain") @jakarta.annotation.Nullable String queryTypeDoesNotContain, @Param("queryTypeEquals") @jakarta.annotation.Nullable String queryTypeEquals, @Param("queryTypeNotEquals") @jakarta.annotation.Nullable String queryTypeNotEquals, @Param("queryTypeSpecified") @jakarta.annotation.Nullable Boolean queryTypeSpecified, @Param("queryTypeIn") @jakarta.annotation.Nullable List<String> queryTypeIn, @Param("queryTypeNotIn") @jakarta.annotation.Nullable List<String> queryTypeNotIn, @Param("parametersContains") @jakarta.annotation.Nullable String parametersContains, @Param("parametersDoesNotContain") @jakarta.annotation.Nullable String parametersDoesNotContain, @Param("parametersEquals") @jakarta.annotation.Nullable String parametersEquals, @Param("parametersNotEquals") @jakarta.annotation.Nullable String parametersNotEquals, @Param("parametersSpecified") @jakarta.annotation.Nullable Boolean parametersSpecified, @Param("parametersIn") @jakarta.annotation.Nullable List<String> parametersIn, @Param("parametersNotIn") @jakarta.annotation.Nullable List<String> parametersNotIn, @Param("responseGeneratedEquals") @jakarta.annotation.Nullable Boolean responseGeneratedEquals, @Param("responseGeneratedNotEquals") @jakarta.annotation.Nullable Boolean responseGeneratedNotEquals, @Param("responseGeneratedSpecified") @jakarta.annotation.Nullable Boolean responseGeneratedSpecified, @Param("responseGeneratedIn") @jakarta.annotation.Nullable List<Boolean> responseGeneratedIn, @Param("responseGeneratedNotIn") @jakarta.annotation.Nullable List<Boolean> responseGeneratedNotIn, @Param("responseTimeGreaterThan") @jakarta.annotation.Nullable Integer responseTimeGreaterThan, @Param("responseTimeLessThan") @jakarta.annotation.Nullable Integer responseTimeLessThan, @Param("responseTimeGreaterThanOrEqual") @jakarta.annotation.Nullable Integer responseTimeGreaterThanOrEqual, @Param("responseTimeLessThanOrEqual") @jakarta.annotation.Nullable Integer responseTimeLessThanOrEqual, @Param("responseTimeEquals") @jakarta.annotation.Nullable Integer responseTimeEquals, @Param("responseTimeNotEquals") @jakarta.annotation.Nullable Integer responseTimeNotEquals, @Param("responseTimeSpecified") @jakarta.annotation.Nullable Boolean responseTimeSpecified, @Param("responseTimeIn") @jakarta.annotation.Nullable List<Integer> responseTimeIn, @Param("responseTimeNotIn") @jakarta.annotation.Nullable List<Integer> responseTimeNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("chatSessionIdGreaterThan") @jakarta.annotation.Nullable Long chatSessionIdGreaterThan, @Param("chatSessionIdLessThan") @jakarta.annotation.Nullable Long chatSessionIdLessThan, @Param("chatSessionIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long chatSessionIdGreaterThanOrEqual, @Param("chatSessionIdLessThanOrEqual") @jakarta.annotation.Nullable Long chatSessionIdLessThanOrEqual, @Param("chatSessionIdEquals") @jakarta.annotation.Nullable Long chatSessionIdEquals, @Param("chatSessionIdNotEquals") @jakarta.annotation.Nullable Long chatSessionIdNotEquals, @Param("chatSessionIdSpecified") @jakarta.annotation.Nullable Boolean chatSessionIdSpecified, @Param("chatSessionIdIn") @jakarta.annotation.Nullable List<Long> chatSessionIdIn, @Param("chatSessionIdNotIn") @jakarta.annotation.Nullable List<Long> chatSessionIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countUserQueries</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountUserQueriesQueryParams} class that allows for
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
   *   <li>queryTextContains -  (optional)</li>
   *   <li>queryTextDoesNotContain -  (optional)</li>
   *   <li>queryTextEquals -  (optional)</li>
   *   <li>queryTextNotEquals -  (optional)</li>
   *   <li>queryTextSpecified -  (optional)</li>
   *   <li>queryTextIn -  (optional)</li>
   *   <li>queryTextNotIn -  (optional)</li>
   *   <li>queryTypeContains -  (optional)</li>
   *   <li>queryTypeDoesNotContain -  (optional)</li>
   *   <li>queryTypeEquals -  (optional)</li>
   *   <li>queryTypeNotEquals -  (optional)</li>
   *   <li>queryTypeSpecified -  (optional)</li>
   *   <li>queryTypeIn -  (optional)</li>
   *   <li>queryTypeNotIn -  (optional)</li>
   *   <li>parametersContains -  (optional)</li>
   *   <li>parametersDoesNotContain -  (optional)</li>
   *   <li>parametersEquals -  (optional)</li>
   *   <li>parametersNotEquals -  (optional)</li>
   *   <li>parametersSpecified -  (optional)</li>
   *   <li>parametersIn -  (optional)</li>
   *   <li>parametersNotIn -  (optional)</li>
   *   <li>responseGeneratedEquals -  (optional)</li>
   *   <li>responseGeneratedNotEquals -  (optional)</li>
   *   <li>responseGeneratedSpecified -  (optional)</li>
   *   <li>responseGeneratedIn -  (optional)</li>
   *   <li>responseGeneratedNotIn -  (optional)</li>
   *   <li>responseTimeGreaterThan -  (optional)</li>
   *   <li>responseTimeLessThan -  (optional)</li>
   *   <li>responseTimeGreaterThanOrEqual -  (optional)</li>
   *   <li>responseTimeLessThanOrEqual -  (optional)</li>
   *   <li>responseTimeEquals -  (optional)</li>
   *   <li>responseTimeNotEquals -  (optional)</li>
   *   <li>responseTimeSpecified -  (optional)</li>
   *   <li>responseTimeIn -  (optional)</li>
   *   <li>responseTimeNotIn -  (optional)</li>
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
   *   <li>chatSessionIdGreaterThan -  (optional)</li>
   *   <li>chatSessionIdLessThan -  (optional)</li>
   *   <li>chatSessionIdGreaterThanOrEqual -  (optional)</li>
   *   <li>chatSessionIdLessThanOrEqual -  (optional)</li>
   *   <li>chatSessionIdEquals -  (optional)</li>
   *   <li>chatSessionIdNotEquals -  (optional)</li>
   *   <li>chatSessionIdSpecified -  (optional)</li>
   *   <li>chatSessionIdIn -  (optional)</li>
   *   <li>chatSessionIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return Long
   */
  @RequestLine("GET /api/user-queries/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&queryText.contains={queryTextContains}&queryText.doesNotContain={queryTextDoesNotContain}&queryText.equals={queryTextEquals}&queryText.notEquals={queryTextNotEquals}&queryText.specified={queryTextSpecified}&queryText.in={queryTextIn}&queryText.notIn={queryTextNotIn}&queryType.contains={queryTypeContains}&queryType.doesNotContain={queryTypeDoesNotContain}&queryType.equals={queryTypeEquals}&queryType.notEquals={queryTypeNotEquals}&queryType.specified={queryTypeSpecified}&queryType.in={queryTypeIn}&queryType.notIn={queryTypeNotIn}&parameters.contains={parametersContains}&parameters.doesNotContain={parametersDoesNotContain}&parameters.equals={parametersEquals}&parameters.notEquals={parametersNotEquals}&parameters.specified={parametersSpecified}&parameters.in={parametersIn}&parameters.notIn={parametersNotIn}&responseGenerated.equals={responseGeneratedEquals}&responseGenerated.notEquals={responseGeneratedNotEquals}&responseGenerated.specified={responseGeneratedSpecified}&responseGenerated.in={responseGeneratedIn}&responseGenerated.notIn={responseGeneratedNotIn}&responseTime.greaterThan={responseTimeGreaterThan}&responseTime.lessThan={responseTimeLessThan}&responseTime.greaterThanOrEqual={responseTimeGreaterThanOrEqual}&responseTime.lessThanOrEqual={responseTimeLessThanOrEqual}&responseTime.equals={responseTimeEquals}&responseTime.notEquals={responseTimeNotEquals}&responseTime.specified={responseTimeSpecified}&responseTime.in={responseTimeIn}&responseTime.notIn={responseTimeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&chatSessionId.greaterThan={chatSessionIdGreaterThan}&chatSessionId.lessThan={chatSessionIdLessThan}&chatSessionId.greaterThanOrEqual={chatSessionIdGreaterThanOrEqual}&chatSessionId.lessThanOrEqual={chatSessionIdLessThanOrEqual}&chatSessionId.equals={chatSessionIdEquals}&chatSessionId.notEquals={chatSessionIdNotEquals}&chatSessionId.specified={chatSessionIdSpecified}&chatSessionId.in={chatSessionIdIn}&chatSessionId.notIn={chatSessionIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countUserQueries(@QueryMap(encoded=true) CountUserQueriesQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countUserQueries</code> that receives the query parameters as a map,
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
          *   <li>queryTextContains -  (optional)</li>
          *   <li>queryTextDoesNotContain -  (optional)</li>
          *   <li>queryTextEquals -  (optional)</li>
          *   <li>queryTextNotEquals -  (optional)</li>
          *   <li>queryTextSpecified -  (optional)</li>
          *   <li>queryTextIn -  (optional)</li>
          *   <li>queryTextNotIn -  (optional)</li>
          *   <li>queryTypeContains -  (optional)</li>
          *   <li>queryTypeDoesNotContain -  (optional)</li>
          *   <li>queryTypeEquals -  (optional)</li>
          *   <li>queryTypeNotEquals -  (optional)</li>
          *   <li>queryTypeSpecified -  (optional)</li>
          *   <li>queryTypeIn -  (optional)</li>
          *   <li>queryTypeNotIn -  (optional)</li>
          *   <li>parametersContains -  (optional)</li>
          *   <li>parametersDoesNotContain -  (optional)</li>
          *   <li>parametersEquals -  (optional)</li>
          *   <li>parametersNotEquals -  (optional)</li>
          *   <li>parametersSpecified -  (optional)</li>
          *   <li>parametersIn -  (optional)</li>
          *   <li>parametersNotIn -  (optional)</li>
          *   <li>responseGeneratedEquals -  (optional)</li>
          *   <li>responseGeneratedNotEquals -  (optional)</li>
          *   <li>responseGeneratedSpecified -  (optional)</li>
          *   <li>responseGeneratedIn -  (optional)</li>
          *   <li>responseGeneratedNotIn -  (optional)</li>
          *   <li>responseTimeGreaterThan -  (optional)</li>
          *   <li>responseTimeLessThan -  (optional)</li>
          *   <li>responseTimeGreaterThanOrEqual -  (optional)</li>
          *   <li>responseTimeLessThanOrEqual -  (optional)</li>
          *   <li>responseTimeEquals -  (optional)</li>
          *   <li>responseTimeNotEquals -  (optional)</li>
          *   <li>responseTimeSpecified -  (optional)</li>
          *   <li>responseTimeIn -  (optional)</li>
          *   <li>responseTimeNotIn -  (optional)</li>
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
          *   <li>chatSessionIdGreaterThan -  (optional)</li>
          *   <li>chatSessionIdLessThan -  (optional)</li>
          *   <li>chatSessionIdGreaterThanOrEqual -  (optional)</li>
          *   <li>chatSessionIdLessThanOrEqual -  (optional)</li>
          *   <li>chatSessionIdEquals -  (optional)</li>
          *   <li>chatSessionIdNotEquals -  (optional)</li>
          *   <li>chatSessionIdSpecified -  (optional)</li>
          *   <li>chatSessionIdIn -  (optional)</li>
          *   <li>chatSessionIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return Long
      */
      @RequestLine("GET /api/user-queries/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&queryText.contains={queryTextContains}&queryText.doesNotContain={queryTextDoesNotContain}&queryText.equals={queryTextEquals}&queryText.notEquals={queryTextNotEquals}&queryText.specified={queryTextSpecified}&queryText.in={queryTextIn}&queryText.notIn={queryTextNotIn}&queryType.contains={queryTypeContains}&queryType.doesNotContain={queryTypeDoesNotContain}&queryType.equals={queryTypeEquals}&queryType.notEquals={queryTypeNotEquals}&queryType.specified={queryTypeSpecified}&queryType.in={queryTypeIn}&queryType.notIn={queryTypeNotIn}&parameters.contains={parametersContains}&parameters.doesNotContain={parametersDoesNotContain}&parameters.equals={parametersEquals}&parameters.notEquals={parametersNotEquals}&parameters.specified={parametersSpecified}&parameters.in={parametersIn}&parameters.notIn={parametersNotIn}&responseGenerated.equals={responseGeneratedEquals}&responseGenerated.notEquals={responseGeneratedNotEquals}&responseGenerated.specified={responseGeneratedSpecified}&responseGenerated.in={responseGeneratedIn}&responseGenerated.notIn={responseGeneratedNotIn}&responseTime.greaterThan={responseTimeGreaterThan}&responseTime.lessThan={responseTimeLessThan}&responseTime.greaterThanOrEqual={responseTimeGreaterThanOrEqual}&responseTime.lessThanOrEqual={responseTimeLessThanOrEqual}&responseTime.equals={responseTimeEquals}&responseTime.notEquals={responseTimeNotEquals}&responseTime.specified={responseTimeSpecified}&responseTime.in={responseTimeIn}&responseTime.notIn={responseTimeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&chatSessionId.greaterThan={chatSessionIdGreaterThan}&chatSessionId.lessThan={chatSessionIdLessThan}&chatSessionId.greaterThanOrEqual={chatSessionIdGreaterThanOrEqual}&chatSessionId.lessThanOrEqual={chatSessionIdLessThanOrEqual}&chatSessionId.equals={chatSessionIdEquals}&chatSessionId.notEquals={chatSessionIdNotEquals}&chatSessionId.specified={chatSessionIdSpecified}&chatSessionId.in={chatSessionIdIn}&chatSessionId.notIn={chatSessionIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countUserQueriesWithHttpInfo(@QueryMap(encoded=true) CountUserQueriesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countUserQueries</code> method in a fluent style.
   */
  public static class CountUserQueriesQueryParams extends HashMap<String, Object> {
    public CountUserQueriesQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams queryTextContains(@jakarta.annotation.Nullable final String value) {
      put("queryText.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams queryTextDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("queryText.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams queryTextEquals(@jakarta.annotation.Nullable final String value) {
      put("queryText.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams queryTextNotEquals(@jakarta.annotation.Nullable final String value) {
      put("queryText.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams queryTextSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("queryText.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams queryTextIn(@jakarta.annotation.Nullable final List<String> value) {
      put("queryText.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams queryTextNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("queryText.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams queryTypeContains(@jakarta.annotation.Nullable final String value) {
      put("queryType.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams queryTypeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("queryType.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams queryTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("queryType.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams queryTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("queryType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams queryTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("queryType.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams queryTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("queryType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams queryTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("queryType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams parametersContains(@jakarta.annotation.Nullable final String value) {
      put("parameters.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams parametersDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("parameters.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams parametersEquals(@jakarta.annotation.Nullable final String value) {
      put("parameters.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams parametersNotEquals(@jakarta.annotation.Nullable final String value) {
      put("parameters.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams parametersSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("parameters.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams parametersIn(@jakarta.annotation.Nullable final List<String> value) {
      put("parameters.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams parametersNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("parameters.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams responseGeneratedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("responseGenerated.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams responseGeneratedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("responseGenerated.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams responseGeneratedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("responseGenerated.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams responseGeneratedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("responseGenerated.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams responseGeneratedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("responseGenerated.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams responseTimeGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("responseTime.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams responseTimeLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("responseTime.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams responseTimeGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("responseTime.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams responseTimeLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("responseTime.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams responseTimeEquals(@jakarta.annotation.Nullable final Integer value) {
      put("responseTime.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams responseTimeNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("responseTime.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams responseTimeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("responseTime.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams responseTimeIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("responseTime.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams responseTimeNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("responseTime.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams chatSessionIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams chatSessionIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams chatSessionIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams chatSessionIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams chatSessionIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams chatSessionIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams chatSessionIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("chatSessionId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserQueriesQueryParams chatSessionIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("chatSessionId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams chatSessionIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("chatSessionId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserQueriesQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param userQueryDTO  (required)
   * @return UserQueryDTO
   */
  @RequestLine("POST /api/user-queries")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  UserQueryDTO createUserQuery(@jakarta.annotation.Nonnull UserQueryDTO userQueryDTO);

  /**
   * 
   * Similar to <code>createUserQuery</code> but it also returns the http response headers .
   * 
   * @param userQueryDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/user-queries")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<UserQueryDTO> createUserQueryWithHttpInfo(@jakarta.annotation.Nonnull UserQueryDTO userQueryDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/user-queries/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteUserQuery(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deleteUserQuery</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/user-queries/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteUserQueryWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



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
   * @param queryTextContains  (optional)
   * @param queryTextDoesNotContain  (optional)
   * @param queryTextEquals  (optional)
   * @param queryTextNotEquals  (optional)
   * @param queryTextSpecified  (optional)
   * @param queryTextIn  (optional)
   * @param queryTextNotIn  (optional)
   * @param queryTypeContains  (optional)
   * @param queryTypeDoesNotContain  (optional)
   * @param queryTypeEquals  (optional)
   * @param queryTypeNotEquals  (optional)
   * @param queryTypeSpecified  (optional)
   * @param queryTypeIn  (optional)
   * @param queryTypeNotIn  (optional)
   * @param parametersContains  (optional)
   * @param parametersDoesNotContain  (optional)
   * @param parametersEquals  (optional)
   * @param parametersNotEquals  (optional)
   * @param parametersSpecified  (optional)
   * @param parametersIn  (optional)
   * @param parametersNotIn  (optional)
   * @param responseGeneratedEquals  (optional)
   * @param responseGeneratedNotEquals  (optional)
   * @param responseGeneratedSpecified  (optional)
   * @param responseGeneratedIn  (optional)
   * @param responseGeneratedNotIn  (optional)
   * @param responseTimeGreaterThan  (optional)
   * @param responseTimeLessThan  (optional)
   * @param responseTimeGreaterThanOrEqual  (optional)
   * @param responseTimeLessThanOrEqual  (optional)
   * @param responseTimeEquals  (optional)
   * @param responseTimeNotEquals  (optional)
   * @param responseTimeSpecified  (optional)
   * @param responseTimeIn  (optional)
   * @param responseTimeNotIn  (optional)
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
   * @param chatSessionIdGreaterThan  (optional)
   * @param chatSessionIdLessThan  (optional)
   * @param chatSessionIdGreaterThanOrEqual  (optional)
   * @param chatSessionIdLessThanOrEqual  (optional)
   * @param chatSessionIdEquals  (optional)
   * @param chatSessionIdNotEquals  (optional)
   * @param chatSessionIdSpecified  (optional)
   * @param chatSessionIdIn  (optional)
   * @param chatSessionIdNotIn  (optional)
   * @param distinct  (optional)
   * @return List&lt;UserQueryDTO&gt;
   */
  @RequestLine("GET /api/user-queries?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&queryText.contains={queryTextContains}&queryText.doesNotContain={queryTextDoesNotContain}&queryText.equals={queryTextEquals}&queryText.notEquals={queryTextNotEquals}&queryText.specified={queryTextSpecified}&queryText.in={queryTextIn}&queryText.notIn={queryTextNotIn}&queryType.contains={queryTypeContains}&queryType.doesNotContain={queryTypeDoesNotContain}&queryType.equals={queryTypeEquals}&queryType.notEquals={queryTypeNotEquals}&queryType.specified={queryTypeSpecified}&queryType.in={queryTypeIn}&queryType.notIn={queryTypeNotIn}&parameters.contains={parametersContains}&parameters.doesNotContain={parametersDoesNotContain}&parameters.equals={parametersEquals}&parameters.notEquals={parametersNotEquals}&parameters.specified={parametersSpecified}&parameters.in={parametersIn}&parameters.notIn={parametersNotIn}&responseGenerated.equals={responseGeneratedEquals}&responseGenerated.notEquals={responseGeneratedNotEquals}&responseGenerated.specified={responseGeneratedSpecified}&responseGenerated.in={responseGeneratedIn}&responseGenerated.notIn={responseGeneratedNotIn}&responseTime.greaterThan={responseTimeGreaterThan}&responseTime.lessThan={responseTimeLessThan}&responseTime.greaterThanOrEqual={responseTimeGreaterThanOrEqual}&responseTime.lessThanOrEqual={responseTimeLessThanOrEqual}&responseTime.equals={responseTimeEquals}&responseTime.notEquals={responseTimeNotEquals}&responseTime.specified={responseTimeSpecified}&responseTime.in={responseTimeIn}&responseTime.notIn={responseTimeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&chatSessionId.greaterThan={chatSessionIdGreaterThan}&chatSessionId.lessThan={chatSessionIdLessThan}&chatSessionId.greaterThanOrEqual={chatSessionIdGreaterThanOrEqual}&chatSessionId.lessThanOrEqual={chatSessionIdLessThanOrEqual}&chatSessionId.equals={chatSessionIdEquals}&chatSessionId.notEquals={chatSessionIdNotEquals}&chatSessionId.specified={chatSessionIdSpecified}&chatSessionId.in={chatSessionIdIn}&chatSessionId.notIn={chatSessionIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  List<UserQueryDTO> getAllUserQueries(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("queryTextContains") @jakarta.annotation.Nullable String queryTextContains, @Param("queryTextDoesNotContain") @jakarta.annotation.Nullable String queryTextDoesNotContain, @Param("queryTextEquals") @jakarta.annotation.Nullable String queryTextEquals, @Param("queryTextNotEquals") @jakarta.annotation.Nullable String queryTextNotEquals, @Param("queryTextSpecified") @jakarta.annotation.Nullable Boolean queryTextSpecified, @Param("queryTextIn") @jakarta.annotation.Nullable List<String> queryTextIn, @Param("queryTextNotIn") @jakarta.annotation.Nullable List<String> queryTextNotIn, @Param("queryTypeContains") @jakarta.annotation.Nullable String queryTypeContains, @Param("queryTypeDoesNotContain") @jakarta.annotation.Nullable String queryTypeDoesNotContain, @Param("queryTypeEquals") @jakarta.annotation.Nullable String queryTypeEquals, @Param("queryTypeNotEquals") @jakarta.annotation.Nullable String queryTypeNotEquals, @Param("queryTypeSpecified") @jakarta.annotation.Nullable Boolean queryTypeSpecified, @Param("queryTypeIn") @jakarta.annotation.Nullable List<String> queryTypeIn, @Param("queryTypeNotIn") @jakarta.annotation.Nullable List<String> queryTypeNotIn, @Param("parametersContains") @jakarta.annotation.Nullable String parametersContains, @Param("parametersDoesNotContain") @jakarta.annotation.Nullable String parametersDoesNotContain, @Param("parametersEquals") @jakarta.annotation.Nullable String parametersEquals, @Param("parametersNotEquals") @jakarta.annotation.Nullable String parametersNotEquals, @Param("parametersSpecified") @jakarta.annotation.Nullable Boolean parametersSpecified, @Param("parametersIn") @jakarta.annotation.Nullable List<String> parametersIn, @Param("parametersNotIn") @jakarta.annotation.Nullable List<String> parametersNotIn, @Param("responseGeneratedEquals") @jakarta.annotation.Nullable Boolean responseGeneratedEquals, @Param("responseGeneratedNotEquals") @jakarta.annotation.Nullable Boolean responseGeneratedNotEquals, @Param("responseGeneratedSpecified") @jakarta.annotation.Nullable Boolean responseGeneratedSpecified, @Param("responseGeneratedIn") @jakarta.annotation.Nullable List<Boolean> responseGeneratedIn, @Param("responseGeneratedNotIn") @jakarta.annotation.Nullable List<Boolean> responseGeneratedNotIn, @Param("responseTimeGreaterThan") @jakarta.annotation.Nullable Integer responseTimeGreaterThan, @Param("responseTimeLessThan") @jakarta.annotation.Nullable Integer responseTimeLessThan, @Param("responseTimeGreaterThanOrEqual") @jakarta.annotation.Nullable Integer responseTimeGreaterThanOrEqual, @Param("responseTimeLessThanOrEqual") @jakarta.annotation.Nullable Integer responseTimeLessThanOrEqual, @Param("responseTimeEquals") @jakarta.annotation.Nullable Integer responseTimeEquals, @Param("responseTimeNotEquals") @jakarta.annotation.Nullable Integer responseTimeNotEquals, @Param("responseTimeSpecified") @jakarta.annotation.Nullable Boolean responseTimeSpecified, @Param("responseTimeIn") @jakarta.annotation.Nullable List<Integer> responseTimeIn, @Param("responseTimeNotIn") @jakarta.annotation.Nullable List<Integer> responseTimeNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("chatSessionIdGreaterThan") @jakarta.annotation.Nullable Long chatSessionIdGreaterThan, @Param("chatSessionIdLessThan") @jakarta.annotation.Nullable Long chatSessionIdLessThan, @Param("chatSessionIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long chatSessionIdGreaterThanOrEqual, @Param("chatSessionIdLessThanOrEqual") @jakarta.annotation.Nullable Long chatSessionIdLessThanOrEqual, @Param("chatSessionIdEquals") @jakarta.annotation.Nullable Long chatSessionIdEquals, @Param("chatSessionIdNotEquals") @jakarta.annotation.Nullable Long chatSessionIdNotEquals, @Param("chatSessionIdSpecified") @jakarta.annotation.Nullable Boolean chatSessionIdSpecified, @Param("chatSessionIdIn") @jakarta.annotation.Nullable List<Long> chatSessionIdIn, @Param("chatSessionIdNotIn") @jakarta.annotation.Nullable List<Long> chatSessionIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>getAllUserQueries</code> but it also returns the http response headers .
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
   * @param queryTextContains  (optional)
   * @param queryTextDoesNotContain  (optional)
   * @param queryTextEquals  (optional)
   * @param queryTextNotEquals  (optional)
   * @param queryTextSpecified  (optional)
   * @param queryTextIn  (optional)
   * @param queryTextNotIn  (optional)
   * @param queryTypeContains  (optional)
   * @param queryTypeDoesNotContain  (optional)
   * @param queryTypeEquals  (optional)
   * @param queryTypeNotEquals  (optional)
   * @param queryTypeSpecified  (optional)
   * @param queryTypeIn  (optional)
   * @param queryTypeNotIn  (optional)
   * @param parametersContains  (optional)
   * @param parametersDoesNotContain  (optional)
   * @param parametersEquals  (optional)
   * @param parametersNotEquals  (optional)
   * @param parametersSpecified  (optional)
   * @param parametersIn  (optional)
   * @param parametersNotIn  (optional)
   * @param responseGeneratedEquals  (optional)
   * @param responseGeneratedNotEquals  (optional)
   * @param responseGeneratedSpecified  (optional)
   * @param responseGeneratedIn  (optional)
   * @param responseGeneratedNotIn  (optional)
   * @param responseTimeGreaterThan  (optional)
   * @param responseTimeLessThan  (optional)
   * @param responseTimeGreaterThanOrEqual  (optional)
   * @param responseTimeLessThanOrEqual  (optional)
   * @param responseTimeEquals  (optional)
   * @param responseTimeNotEquals  (optional)
   * @param responseTimeSpecified  (optional)
   * @param responseTimeIn  (optional)
   * @param responseTimeNotIn  (optional)
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
   * @param chatSessionIdGreaterThan  (optional)
   * @param chatSessionIdLessThan  (optional)
   * @param chatSessionIdGreaterThanOrEqual  (optional)
   * @param chatSessionIdLessThanOrEqual  (optional)
   * @param chatSessionIdEquals  (optional)
   * @param chatSessionIdNotEquals  (optional)
   * @param chatSessionIdSpecified  (optional)
   * @param chatSessionIdIn  (optional)
   * @param chatSessionIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/user-queries?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&queryText.contains={queryTextContains}&queryText.doesNotContain={queryTextDoesNotContain}&queryText.equals={queryTextEquals}&queryText.notEquals={queryTextNotEquals}&queryText.specified={queryTextSpecified}&queryText.in={queryTextIn}&queryText.notIn={queryTextNotIn}&queryType.contains={queryTypeContains}&queryType.doesNotContain={queryTypeDoesNotContain}&queryType.equals={queryTypeEquals}&queryType.notEquals={queryTypeNotEquals}&queryType.specified={queryTypeSpecified}&queryType.in={queryTypeIn}&queryType.notIn={queryTypeNotIn}&parameters.contains={parametersContains}&parameters.doesNotContain={parametersDoesNotContain}&parameters.equals={parametersEquals}&parameters.notEquals={parametersNotEquals}&parameters.specified={parametersSpecified}&parameters.in={parametersIn}&parameters.notIn={parametersNotIn}&responseGenerated.equals={responseGeneratedEquals}&responseGenerated.notEquals={responseGeneratedNotEquals}&responseGenerated.specified={responseGeneratedSpecified}&responseGenerated.in={responseGeneratedIn}&responseGenerated.notIn={responseGeneratedNotIn}&responseTime.greaterThan={responseTimeGreaterThan}&responseTime.lessThan={responseTimeLessThan}&responseTime.greaterThanOrEqual={responseTimeGreaterThanOrEqual}&responseTime.lessThanOrEqual={responseTimeLessThanOrEqual}&responseTime.equals={responseTimeEquals}&responseTime.notEquals={responseTimeNotEquals}&responseTime.specified={responseTimeSpecified}&responseTime.in={responseTimeIn}&responseTime.notIn={responseTimeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&chatSessionId.greaterThan={chatSessionIdGreaterThan}&chatSessionId.lessThan={chatSessionIdLessThan}&chatSessionId.greaterThanOrEqual={chatSessionIdGreaterThanOrEqual}&chatSessionId.lessThanOrEqual={chatSessionIdLessThanOrEqual}&chatSessionId.equals={chatSessionIdEquals}&chatSessionId.notEquals={chatSessionIdNotEquals}&chatSessionId.specified={chatSessionIdSpecified}&chatSessionId.in={chatSessionIdIn}&chatSessionId.notIn={chatSessionIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<UserQueryDTO>> getAllUserQueriesWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("queryTextContains") @jakarta.annotation.Nullable String queryTextContains, @Param("queryTextDoesNotContain") @jakarta.annotation.Nullable String queryTextDoesNotContain, @Param("queryTextEquals") @jakarta.annotation.Nullable String queryTextEquals, @Param("queryTextNotEquals") @jakarta.annotation.Nullable String queryTextNotEquals, @Param("queryTextSpecified") @jakarta.annotation.Nullable Boolean queryTextSpecified, @Param("queryTextIn") @jakarta.annotation.Nullable List<String> queryTextIn, @Param("queryTextNotIn") @jakarta.annotation.Nullable List<String> queryTextNotIn, @Param("queryTypeContains") @jakarta.annotation.Nullable String queryTypeContains, @Param("queryTypeDoesNotContain") @jakarta.annotation.Nullable String queryTypeDoesNotContain, @Param("queryTypeEquals") @jakarta.annotation.Nullable String queryTypeEquals, @Param("queryTypeNotEquals") @jakarta.annotation.Nullable String queryTypeNotEquals, @Param("queryTypeSpecified") @jakarta.annotation.Nullable Boolean queryTypeSpecified, @Param("queryTypeIn") @jakarta.annotation.Nullable List<String> queryTypeIn, @Param("queryTypeNotIn") @jakarta.annotation.Nullable List<String> queryTypeNotIn, @Param("parametersContains") @jakarta.annotation.Nullable String parametersContains, @Param("parametersDoesNotContain") @jakarta.annotation.Nullable String parametersDoesNotContain, @Param("parametersEquals") @jakarta.annotation.Nullable String parametersEquals, @Param("parametersNotEquals") @jakarta.annotation.Nullable String parametersNotEquals, @Param("parametersSpecified") @jakarta.annotation.Nullable Boolean parametersSpecified, @Param("parametersIn") @jakarta.annotation.Nullable List<String> parametersIn, @Param("parametersNotIn") @jakarta.annotation.Nullable List<String> parametersNotIn, @Param("responseGeneratedEquals") @jakarta.annotation.Nullable Boolean responseGeneratedEquals, @Param("responseGeneratedNotEquals") @jakarta.annotation.Nullable Boolean responseGeneratedNotEquals, @Param("responseGeneratedSpecified") @jakarta.annotation.Nullable Boolean responseGeneratedSpecified, @Param("responseGeneratedIn") @jakarta.annotation.Nullable List<Boolean> responseGeneratedIn, @Param("responseGeneratedNotIn") @jakarta.annotation.Nullable List<Boolean> responseGeneratedNotIn, @Param("responseTimeGreaterThan") @jakarta.annotation.Nullable Integer responseTimeGreaterThan, @Param("responseTimeLessThan") @jakarta.annotation.Nullable Integer responseTimeLessThan, @Param("responseTimeGreaterThanOrEqual") @jakarta.annotation.Nullable Integer responseTimeGreaterThanOrEqual, @Param("responseTimeLessThanOrEqual") @jakarta.annotation.Nullable Integer responseTimeLessThanOrEqual, @Param("responseTimeEquals") @jakarta.annotation.Nullable Integer responseTimeEquals, @Param("responseTimeNotEquals") @jakarta.annotation.Nullable Integer responseTimeNotEquals, @Param("responseTimeSpecified") @jakarta.annotation.Nullable Boolean responseTimeSpecified, @Param("responseTimeIn") @jakarta.annotation.Nullable List<Integer> responseTimeIn, @Param("responseTimeNotIn") @jakarta.annotation.Nullable List<Integer> responseTimeNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("chatSessionIdGreaterThan") @jakarta.annotation.Nullable Long chatSessionIdGreaterThan, @Param("chatSessionIdLessThan") @jakarta.annotation.Nullable Long chatSessionIdLessThan, @Param("chatSessionIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long chatSessionIdGreaterThanOrEqual, @Param("chatSessionIdLessThanOrEqual") @jakarta.annotation.Nullable Long chatSessionIdLessThanOrEqual, @Param("chatSessionIdEquals") @jakarta.annotation.Nullable Long chatSessionIdEquals, @Param("chatSessionIdNotEquals") @jakarta.annotation.Nullable Long chatSessionIdNotEquals, @Param("chatSessionIdSpecified") @jakarta.annotation.Nullable Boolean chatSessionIdSpecified, @Param("chatSessionIdIn") @jakarta.annotation.Nullable List<Long> chatSessionIdIn, @Param("chatSessionIdNotIn") @jakarta.annotation.Nullable List<Long> chatSessionIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllUserQueries</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllUserQueriesQueryParams} class that allows for
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
   *   <li>queryTextContains -  (optional)</li>
   *   <li>queryTextDoesNotContain -  (optional)</li>
   *   <li>queryTextEquals -  (optional)</li>
   *   <li>queryTextNotEquals -  (optional)</li>
   *   <li>queryTextSpecified -  (optional)</li>
   *   <li>queryTextIn -  (optional)</li>
   *   <li>queryTextNotIn -  (optional)</li>
   *   <li>queryTypeContains -  (optional)</li>
   *   <li>queryTypeDoesNotContain -  (optional)</li>
   *   <li>queryTypeEquals -  (optional)</li>
   *   <li>queryTypeNotEquals -  (optional)</li>
   *   <li>queryTypeSpecified -  (optional)</li>
   *   <li>queryTypeIn -  (optional)</li>
   *   <li>queryTypeNotIn -  (optional)</li>
   *   <li>parametersContains -  (optional)</li>
   *   <li>parametersDoesNotContain -  (optional)</li>
   *   <li>parametersEquals -  (optional)</li>
   *   <li>parametersNotEquals -  (optional)</li>
   *   <li>parametersSpecified -  (optional)</li>
   *   <li>parametersIn -  (optional)</li>
   *   <li>parametersNotIn -  (optional)</li>
   *   <li>responseGeneratedEquals -  (optional)</li>
   *   <li>responseGeneratedNotEquals -  (optional)</li>
   *   <li>responseGeneratedSpecified -  (optional)</li>
   *   <li>responseGeneratedIn -  (optional)</li>
   *   <li>responseGeneratedNotIn -  (optional)</li>
   *   <li>responseTimeGreaterThan -  (optional)</li>
   *   <li>responseTimeLessThan -  (optional)</li>
   *   <li>responseTimeGreaterThanOrEqual -  (optional)</li>
   *   <li>responseTimeLessThanOrEqual -  (optional)</li>
   *   <li>responseTimeEquals -  (optional)</li>
   *   <li>responseTimeNotEquals -  (optional)</li>
   *   <li>responseTimeSpecified -  (optional)</li>
   *   <li>responseTimeIn -  (optional)</li>
   *   <li>responseTimeNotIn -  (optional)</li>
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
   *   <li>chatSessionIdGreaterThan -  (optional)</li>
   *   <li>chatSessionIdLessThan -  (optional)</li>
   *   <li>chatSessionIdGreaterThanOrEqual -  (optional)</li>
   *   <li>chatSessionIdLessThanOrEqual -  (optional)</li>
   *   <li>chatSessionIdEquals -  (optional)</li>
   *   <li>chatSessionIdNotEquals -  (optional)</li>
   *   <li>chatSessionIdSpecified -  (optional)</li>
   *   <li>chatSessionIdIn -  (optional)</li>
   *   <li>chatSessionIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return List&lt;UserQueryDTO&gt;
   */
  @RequestLine("GET /api/user-queries?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&queryText.contains={queryTextContains}&queryText.doesNotContain={queryTextDoesNotContain}&queryText.equals={queryTextEquals}&queryText.notEquals={queryTextNotEquals}&queryText.specified={queryTextSpecified}&queryText.in={queryTextIn}&queryText.notIn={queryTextNotIn}&queryType.contains={queryTypeContains}&queryType.doesNotContain={queryTypeDoesNotContain}&queryType.equals={queryTypeEquals}&queryType.notEquals={queryTypeNotEquals}&queryType.specified={queryTypeSpecified}&queryType.in={queryTypeIn}&queryType.notIn={queryTypeNotIn}&parameters.contains={parametersContains}&parameters.doesNotContain={parametersDoesNotContain}&parameters.equals={parametersEquals}&parameters.notEquals={parametersNotEquals}&parameters.specified={parametersSpecified}&parameters.in={parametersIn}&parameters.notIn={parametersNotIn}&responseGenerated.equals={responseGeneratedEquals}&responseGenerated.notEquals={responseGeneratedNotEquals}&responseGenerated.specified={responseGeneratedSpecified}&responseGenerated.in={responseGeneratedIn}&responseGenerated.notIn={responseGeneratedNotIn}&responseTime.greaterThan={responseTimeGreaterThan}&responseTime.lessThan={responseTimeLessThan}&responseTime.greaterThanOrEqual={responseTimeGreaterThanOrEqual}&responseTime.lessThanOrEqual={responseTimeLessThanOrEqual}&responseTime.equals={responseTimeEquals}&responseTime.notEquals={responseTimeNotEquals}&responseTime.specified={responseTimeSpecified}&responseTime.in={responseTimeIn}&responseTime.notIn={responseTimeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&chatSessionId.greaterThan={chatSessionIdGreaterThan}&chatSessionId.lessThan={chatSessionIdLessThan}&chatSessionId.greaterThanOrEqual={chatSessionIdGreaterThanOrEqual}&chatSessionId.lessThanOrEqual={chatSessionIdLessThanOrEqual}&chatSessionId.equals={chatSessionIdEquals}&chatSessionId.notEquals={chatSessionIdNotEquals}&chatSessionId.specified={chatSessionIdSpecified}&chatSessionId.in={chatSessionIdIn}&chatSessionId.notIn={chatSessionIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  List<UserQueryDTO> getAllUserQueries(@QueryMap(encoded=true) GetAllUserQueriesQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllUserQueries</code> that receives the query parameters as a map,
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
          *   <li>queryTextContains -  (optional)</li>
          *   <li>queryTextDoesNotContain -  (optional)</li>
          *   <li>queryTextEquals -  (optional)</li>
          *   <li>queryTextNotEquals -  (optional)</li>
          *   <li>queryTextSpecified -  (optional)</li>
          *   <li>queryTextIn -  (optional)</li>
          *   <li>queryTextNotIn -  (optional)</li>
          *   <li>queryTypeContains -  (optional)</li>
          *   <li>queryTypeDoesNotContain -  (optional)</li>
          *   <li>queryTypeEquals -  (optional)</li>
          *   <li>queryTypeNotEquals -  (optional)</li>
          *   <li>queryTypeSpecified -  (optional)</li>
          *   <li>queryTypeIn -  (optional)</li>
          *   <li>queryTypeNotIn -  (optional)</li>
          *   <li>parametersContains -  (optional)</li>
          *   <li>parametersDoesNotContain -  (optional)</li>
          *   <li>parametersEquals -  (optional)</li>
          *   <li>parametersNotEquals -  (optional)</li>
          *   <li>parametersSpecified -  (optional)</li>
          *   <li>parametersIn -  (optional)</li>
          *   <li>parametersNotIn -  (optional)</li>
          *   <li>responseGeneratedEquals -  (optional)</li>
          *   <li>responseGeneratedNotEquals -  (optional)</li>
          *   <li>responseGeneratedSpecified -  (optional)</li>
          *   <li>responseGeneratedIn -  (optional)</li>
          *   <li>responseGeneratedNotIn -  (optional)</li>
          *   <li>responseTimeGreaterThan -  (optional)</li>
          *   <li>responseTimeLessThan -  (optional)</li>
          *   <li>responseTimeGreaterThanOrEqual -  (optional)</li>
          *   <li>responseTimeLessThanOrEqual -  (optional)</li>
          *   <li>responseTimeEquals -  (optional)</li>
          *   <li>responseTimeNotEquals -  (optional)</li>
          *   <li>responseTimeSpecified -  (optional)</li>
          *   <li>responseTimeIn -  (optional)</li>
          *   <li>responseTimeNotIn -  (optional)</li>
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
          *   <li>chatSessionIdGreaterThan -  (optional)</li>
          *   <li>chatSessionIdLessThan -  (optional)</li>
          *   <li>chatSessionIdGreaterThanOrEqual -  (optional)</li>
          *   <li>chatSessionIdLessThanOrEqual -  (optional)</li>
          *   <li>chatSessionIdEquals -  (optional)</li>
          *   <li>chatSessionIdNotEquals -  (optional)</li>
          *   <li>chatSessionIdSpecified -  (optional)</li>
          *   <li>chatSessionIdIn -  (optional)</li>
          *   <li>chatSessionIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return List&lt;UserQueryDTO&gt;
      */
      @RequestLine("GET /api/user-queries?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&queryText.contains={queryTextContains}&queryText.doesNotContain={queryTextDoesNotContain}&queryText.equals={queryTextEquals}&queryText.notEquals={queryTextNotEquals}&queryText.specified={queryTextSpecified}&queryText.in={queryTextIn}&queryText.notIn={queryTextNotIn}&queryType.contains={queryTypeContains}&queryType.doesNotContain={queryTypeDoesNotContain}&queryType.equals={queryTypeEquals}&queryType.notEquals={queryTypeNotEquals}&queryType.specified={queryTypeSpecified}&queryType.in={queryTypeIn}&queryType.notIn={queryTypeNotIn}&parameters.contains={parametersContains}&parameters.doesNotContain={parametersDoesNotContain}&parameters.equals={parametersEquals}&parameters.notEquals={parametersNotEquals}&parameters.specified={parametersSpecified}&parameters.in={parametersIn}&parameters.notIn={parametersNotIn}&responseGenerated.equals={responseGeneratedEquals}&responseGenerated.notEquals={responseGeneratedNotEquals}&responseGenerated.specified={responseGeneratedSpecified}&responseGenerated.in={responseGeneratedIn}&responseGenerated.notIn={responseGeneratedNotIn}&responseTime.greaterThan={responseTimeGreaterThan}&responseTime.lessThan={responseTimeLessThan}&responseTime.greaterThanOrEqual={responseTimeGreaterThanOrEqual}&responseTime.lessThanOrEqual={responseTimeLessThanOrEqual}&responseTime.equals={responseTimeEquals}&responseTime.notEquals={responseTimeNotEquals}&responseTime.specified={responseTimeSpecified}&responseTime.in={responseTimeIn}&responseTime.notIn={responseTimeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&chatSessionId.greaterThan={chatSessionIdGreaterThan}&chatSessionId.lessThan={chatSessionIdLessThan}&chatSessionId.greaterThanOrEqual={chatSessionIdGreaterThanOrEqual}&chatSessionId.lessThanOrEqual={chatSessionIdLessThanOrEqual}&chatSessionId.equals={chatSessionIdEquals}&chatSessionId.notEquals={chatSessionIdNotEquals}&chatSessionId.specified={chatSessionIdSpecified}&chatSessionId.in={chatSessionIdIn}&chatSessionId.notIn={chatSessionIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<UserQueryDTO>> getAllUserQueriesWithHttpInfo(@QueryMap(encoded=true) GetAllUserQueriesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllUserQueries</code> method in a fluent style.
   */
  public static class GetAllUserQueriesQueryParams extends HashMap<String, Object> {
    public GetAllUserQueriesQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams queryTextContains(@jakarta.annotation.Nullable final String value) {
      put("queryText.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams queryTextDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("queryText.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams queryTextEquals(@jakarta.annotation.Nullable final String value) {
      put("queryText.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams queryTextNotEquals(@jakarta.annotation.Nullable final String value) {
      put("queryText.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams queryTextSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("queryText.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams queryTextIn(@jakarta.annotation.Nullable final List<String> value) {
      put("queryText.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams queryTextNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("queryText.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams queryTypeContains(@jakarta.annotation.Nullable final String value) {
      put("queryType.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams queryTypeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("queryType.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams queryTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("queryType.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams queryTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("queryType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams queryTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("queryType.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams queryTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("queryType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams queryTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("queryType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams parametersContains(@jakarta.annotation.Nullable final String value) {
      put("parameters.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams parametersDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("parameters.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams parametersEquals(@jakarta.annotation.Nullable final String value) {
      put("parameters.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams parametersNotEquals(@jakarta.annotation.Nullable final String value) {
      put("parameters.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams parametersSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("parameters.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams parametersIn(@jakarta.annotation.Nullable final List<String> value) {
      put("parameters.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams parametersNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("parameters.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams responseGeneratedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("responseGenerated.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams responseGeneratedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("responseGenerated.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams responseGeneratedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("responseGenerated.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams responseGeneratedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("responseGenerated.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams responseGeneratedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("responseGenerated.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams responseTimeGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("responseTime.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams responseTimeLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("responseTime.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams responseTimeGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("responseTime.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams responseTimeLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("responseTime.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams responseTimeEquals(@jakarta.annotation.Nullable final Integer value) {
      put("responseTime.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams responseTimeNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("responseTime.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams responseTimeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("responseTime.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams responseTimeIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("responseTime.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams responseTimeNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("responseTime.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams chatSessionIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams chatSessionIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams chatSessionIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams chatSessionIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams chatSessionIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams chatSessionIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams chatSessionIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("chatSessionId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserQueriesQueryParams chatSessionIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("chatSessionId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams chatSessionIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("chatSessionId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserQueriesQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return UserQueryDTO
   */
  @RequestLine("GET /api/user-queries/{id}")
  @Headers({
    "Accept: */*",
  })
  UserQueryDTO getUserQuery(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getUserQuery</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/user-queries/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<UserQueryDTO> getUserQueryWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param userQueryDTO  (required)
   * @return UserQueryDTO
   */
  @RequestLine("PATCH /api/user-queries/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  UserQueryDTO partialUpdateUserQuery(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull UserQueryDTO userQueryDTO);

  /**
   * 
   * Similar to <code>partialUpdateUserQuery</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param userQueryDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/user-queries/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<UserQueryDTO> partialUpdateUserQueryWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull UserQueryDTO userQueryDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param userQueryDTO  (required)
   * @return UserQueryDTO
   */
  @RequestLine("PUT /api/user-queries/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  UserQueryDTO updateUserQuery(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull UserQueryDTO userQueryDTO);

  /**
   * 
   * Similar to <code>updateUserQuery</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param userQueryDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/user-queries/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<UserQueryDTO> updateUserQueryWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull UserQueryDTO userQueryDTO);


}
