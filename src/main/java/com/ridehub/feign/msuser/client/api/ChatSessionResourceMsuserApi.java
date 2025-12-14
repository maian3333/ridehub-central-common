package com.ridehub.feign.msuser.client.api;

import com.ridehub.feign.msuser.client.invoker.ApiClient;
import com.ridehub.feign.msuser.client.invoker.EncodingUtils;
import com.ridehub.feign.msuser.client.model.ApiResponse;

import com.ridehub.feign.msuser.client.model.ChatSessionDTO;
import java.time.OffsetDateTime;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface ChatSessionResourceMsuserApi extends ApiClient.Api {


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
   * @param sessionIdContains  (optional)
   * @param sessionIdDoesNotContain  (optional)
   * @param sessionIdEquals  (optional)
   * @param sessionIdNotEquals  (optional)
   * @param sessionIdSpecified  (optional)
   * @param sessionIdIn  (optional)
   * @param sessionIdNotIn  (optional)
   * @param startedAtGreaterThan  (optional)
   * @param startedAtLessThan  (optional)
   * @param startedAtGreaterThanOrEqual  (optional)
   * @param startedAtLessThanOrEqual  (optional)
   * @param startedAtEquals  (optional)
   * @param startedAtNotEquals  (optional)
   * @param startedAtSpecified  (optional)
   * @param startedAtIn  (optional)
   * @param startedAtNotIn  (optional)
   * @param endedAtGreaterThan  (optional)
   * @param endedAtLessThan  (optional)
   * @param endedAtGreaterThanOrEqual  (optional)
   * @param endedAtLessThanOrEqual  (optional)
   * @param endedAtEquals  (optional)
   * @param endedAtNotEquals  (optional)
   * @param endedAtSpecified  (optional)
   * @param endedAtIn  (optional)
   * @param endedAtNotIn  (optional)
   * @param isActiveEquals  (optional)
   * @param isActiveNotEquals  (optional)
   * @param isActiveSpecified  (optional)
   * @param isActiveIn  (optional)
   * @param isActiveNotIn  (optional)
   * @param contextContains  (optional)
   * @param contextDoesNotContain  (optional)
   * @param contextEquals  (optional)
   * @param contextNotEquals  (optional)
   * @param contextSpecified  (optional)
   * @param contextIn  (optional)
   * @param contextNotIn  (optional)
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
   * @param messagesIdGreaterThan  (optional)
   * @param messagesIdLessThan  (optional)
   * @param messagesIdGreaterThanOrEqual  (optional)
   * @param messagesIdLessThanOrEqual  (optional)
   * @param messagesIdEquals  (optional)
   * @param messagesIdNotEquals  (optional)
   * @param messagesIdSpecified  (optional)
   * @param messagesIdIn  (optional)
   * @param messagesIdNotIn  (optional)
   * @param queriesIdGreaterThan  (optional)
   * @param queriesIdLessThan  (optional)
   * @param queriesIdGreaterThanOrEqual  (optional)
   * @param queriesIdLessThanOrEqual  (optional)
   * @param queriesIdEquals  (optional)
   * @param queriesIdNotEquals  (optional)
   * @param queriesIdSpecified  (optional)
   * @param queriesIdIn  (optional)
   * @param queriesIdNotIn  (optional)
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
  @RequestLine("GET /api/chat-sessions/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&sessionId.contains={sessionIdContains}&sessionId.doesNotContain={sessionIdDoesNotContain}&sessionId.equals={sessionIdEquals}&sessionId.notEquals={sessionIdNotEquals}&sessionId.specified={sessionIdSpecified}&sessionId.in={sessionIdIn}&sessionId.notIn={sessionIdNotIn}&startedAt.greaterThan={startedAtGreaterThan}&startedAt.lessThan={startedAtLessThan}&startedAt.greaterThanOrEqual={startedAtGreaterThanOrEqual}&startedAt.lessThanOrEqual={startedAtLessThanOrEqual}&startedAt.equals={startedAtEquals}&startedAt.notEquals={startedAtNotEquals}&startedAt.specified={startedAtSpecified}&startedAt.in={startedAtIn}&startedAt.notIn={startedAtNotIn}&endedAt.greaterThan={endedAtGreaterThan}&endedAt.lessThan={endedAtLessThan}&endedAt.greaterThanOrEqual={endedAtGreaterThanOrEqual}&endedAt.lessThanOrEqual={endedAtLessThanOrEqual}&endedAt.equals={endedAtEquals}&endedAt.notEquals={endedAtNotEquals}&endedAt.specified={endedAtSpecified}&endedAt.in={endedAtIn}&endedAt.notIn={endedAtNotIn}&isActive.equals={isActiveEquals}&isActive.notEquals={isActiveNotEquals}&isActive.specified={isActiveSpecified}&isActive.in={isActiveIn}&isActive.notIn={isActiveNotIn}&context.contains={contextContains}&context.doesNotContain={contextDoesNotContain}&context.equals={contextEquals}&context.notEquals={contextNotEquals}&context.specified={contextSpecified}&context.in={contextIn}&context.notIn={contextNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&messagesId.greaterThan={messagesIdGreaterThan}&messagesId.lessThan={messagesIdLessThan}&messagesId.greaterThanOrEqual={messagesIdGreaterThanOrEqual}&messagesId.lessThanOrEqual={messagesIdLessThanOrEqual}&messagesId.equals={messagesIdEquals}&messagesId.notEquals={messagesIdNotEquals}&messagesId.specified={messagesIdSpecified}&messagesId.in={messagesIdIn}&messagesId.notIn={messagesIdNotIn}&queriesId.greaterThan={queriesIdGreaterThan}&queriesId.lessThan={queriesIdLessThan}&queriesId.greaterThanOrEqual={queriesIdGreaterThanOrEqual}&queriesId.lessThanOrEqual={queriesIdLessThanOrEqual}&queriesId.equals={queriesIdEquals}&queriesId.notEquals={queriesIdNotEquals}&queriesId.specified={queriesIdSpecified}&queriesId.in={queriesIdIn}&queriesId.notIn={queriesIdNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countChatSessions(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("sessionIdContains") @jakarta.annotation.Nullable String sessionIdContains, @Param("sessionIdDoesNotContain") @jakarta.annotation.Nullable String sessionIdDoesNotContain, @Param("sessionIdEquals") @jakarta.annotation.Nullable String sessionIdEquals, @Param("sessionIdNotEquals") @jakarta.annotation.Nullable String sessionIdNotEquals, @Param("sessionIdSpecified") @jakarta.annotation.Nullable Boolean sessionIdSpecified, @Param("sessionIdIn") @jakarta.annotation.Nullable List<String> sessionIdIn, @Param("sessionIdNotIn") @jakarta.annotation.Nullable List<String> sessionIdNotIn, @Param("startedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime startedAtGreaterThan, @Param("startedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime startedAtLessThan, @Param("startedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime startedAtGreaterThanOrEqual, @Param("startedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime startedAtLessThanOrEqual, @Param("startedAtEquals") @jakarta.annotation.Nullable OffsetDateTime startedAtEquals, @Param("startedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime startedAtNotEquals, @Param("startedAtSpecified") @jakarta.annotation.Nullable Boolean startedAtSpecified, @Param("startedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> startedAtIn, @Param("startedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> startedAtNotIn, @Param("endedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime endedAtGreaterThan, @Param("endedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime endedAtLessThan, @Param("endedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime endedAtGreaterThanOrEqual, @Param("endedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime endedAtLessThanOrEqual, @Param("endedAtEquals") @jakarta.annotation.Nullable OffsetDateTime endedAtEquals, @Param("endedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime endedAtNotEquals, @Param("endedAtSpecified") @jakarta.annotation.Nullable Boolean endedAtSpecified, @Param("endedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> endedAtIn, @Param("endedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> endedAtNotIn, @Param("isActiveEquals") @jakarta.annotation.Nullable Boolean isActiveEquals, @Param("isActiveNotEquals") @jakarta.annotation.Nullable Boolean isActiveNotEquals, @Param("isActiveSpecified") @jakarta.annotation.Nullable Boolean isActiveSpecified, @Param("isActiveIn") @jakarta.annotation.Nullable List<Boolean> isActiveIn, @Param("isActiveNotIn") @jakarta.annotation.Nullable List<Boolean> isActiveNotIn, @Param("contextContains") @jakarta.annotation.Nullable String contextContains, @Param("contextDoesNotContain") @jakarta.annotation.Nullable String contextDoesNotContain, @Param("contextEquals") @jakarta.annotation.Nullable String contextEquals, @Param("contextNotEquals") @jakarta.annotation.Nullable String contextNotEquals, @Param("contextSpecified") @jakarta.annotation.Nullable Boolean contextSpecified, @Param("contextIn") @jakarta.annotation.Nullable List<String> contextIn, @Param("contextNotIn") @jakarta.annotation.Nullable List<String> contextNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("messagesIdGreaterThan") @jakarta.annotation.Nullable Long messagesIdGreaterThan, @Param("messagesIdLessThan") @jakarta.annotation.Nullable Long messagesIdLessThan, @Param("messagesIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long messagesIdGreaterThanOrEqual, @Param("messagesIdLessThanOrEqual") @jakarta.annotation.Nullable Long messagesIdLessThanOrEqual, @Param("messagesIdEquals") @jakarta.annotation.Nullable Long messagesIdEquals, @Param("messagesIdNotEquals") @jakarta.annotation.Nullable Long messagesIdNotEquals, @Param("messagesIdSpecified") @jakarta.annotation.Nullable Boolean messagesIdSpecified, @Param("messagesIdIn") @jakarta.annotation.Nullable List<Long> messagesIdIn, @Param("messagesIdNotIn") @jakarta.annotation.Nullable List<Long> messagesIdNotIn, @Param("queriesIdGreaterThan") @jakarta.annotation.Nullable Long queriesIdGreaterThan, @Param("queriesIdLessThan") @jakarta.annotation.Nullable Long queriesIdLessThan, @Param("queriesIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long queriesIdGreaterThanOrEqual, @Param("queriesIdLessThanOrEqual") @jakarta.annotation.Nullable Long queriesIdLessThanOrEqual, @Param("queriesIdEquals") @jakarta.annotation.Nullable Long queriesIdEquals, @Param("queriesIdNotEquals") @jakarta.annotation.Nullable Long queriesIdNotEquals, @Param("queriesIdSpecified") @jakarta.annotation.Nullable Boolean queriesIdSpecified, @Param("queriesIdIn") @jakarta.annotation.Nullable List<Long> queriesIdIn, @Param("queriesIdNotIn") @jakarta.annotation.Nullable List<Long> queriesIdNotIn, @Param("userIdGreaterThan") @jakarta.annotation.Nullable Long userIdGreaterThan, @Param("userIdLessThan") @jakarta.annotation.Nullable Long userIdLessThan, @Param("userIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long userIdGreaterThanOrEqual, @Param("userIdLessThanOrEqual") @jakarta.annotation.Nullable Long userIdLessThanOrEqual, @Param("userIdEquals") @jakarta.annotation.Nullable Long userIdEquals, @Param("userIdNotEquals") @jakarta.annotation.Nullable Long userIdNotEquals, @Param("userIdSpecified") @jakarta.annotation.Nullable Boolean userIdSpecified, @Param("userIdIn") @jakarta.annotation.Nullable List<Long> userIdIn, @Param("userIdNotIn") @jakarta.annotation.Nullable List<Long> userIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countChatSessions</code> but it also returns the http response headers .
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
   * @param sessionIdContains  (optional)
   * @param sessionIdDoesNotContain  (optional)
   * @param sessionIdEquals  (optional)
   * @param sessionIdNotEquals  (optional)
   * @param sessionIdSpecified  (optional)
   * @param sessionIdIn  (optional)
   * @param sessionIdNotIn  (optional)
   * @param startedAtGreaterThan  (optional)
   * @param startedAtLessThan  (optional)
   * @param startedAtGreaterThanOrEqual  (optional)
   * @param startedAtLessThanOrEqual  (optional)
   * @param startedAtEquals  (optional)
   * @param startedAtNotEquals  (optional)
   * @param startedAtSpecified  (optional)
   * @param startedAtIn  (optional)
   * @param startedAtNotIn  (optional)
   * @param endedAtGreaterThan  (optional)
   * @param endedAtLessThan  (optional)
   * @param endedAtGreaterThanOrEqual  (optional)
   * @param endedAtLessThanOrEqual  (optional)
   * @param endedAtEquals  (optional)
   * @param endedAtNotEquals  (optional)
   * @param endedAtSpecified  (optional)
   * @param endedAtIn  (optional)
   * @param endedAtNotIn  (optional)
   * @param isActiveEquals  (optional)
   * @param isActiveNotEquals  (optional)
   * @param isActiveSpecified  (optional)
   * @param isActiveIn  (optional)
   * @param isActiveNotIn  (optional)
   * @param contextContains  (optional)
   * @param contextDoesNotContain  (optional)
   * @param contextEquals  (optional)
   * @param contextNotEquals  (optional)
   * @param contextSpecified  (optional)
   * @param contextIn  (optional)
   * @param contextNotIn  (optional)
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
   * @param messagesIdGreaterThan  (optional)
   * @param messagesIdLessThan  (optional)
   * @param messagesIdGreaterThanOrEqual  (optional)
   * @param messagesIdLessThanOrEqual  (optional)
   * @param messagesIdEquals  (optional)
   * @param messagesIdNotEquals  (optional)
   * @param messagesIdSpecified  (optional)
   * @param messagesIdIn  (optional)
   * @param messagesIdNotIn  (optional)
   * @param queriesIdGreaterThan  (optional)
   * @param queriesIdLessThan  (optional)
   * @param queriesIdGreaterThanOrEqual  (optional)
   * @param queriesIdLessThanOrEqual  (optional)
   * @param queriesIdEquals  (optional)
   * @param queriesIdNotEquals  (optional)
   * @param queriesIdSpecified  (optional)
   * @param queriesIdIn  (optional)
   * @param queriesIdNotIn  (optional)
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
  @RequestLine("GET /api/chat-sessions/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&sessionId.contains={sessionIdContains}&sessionId.doesNotContain={sessionIdDoesNotContain}&sessionId.equals={sessionIdEquals}&sessionId.notEquals={sessionIdNotEquals}&sessionId.specified={sessionIdSpecified}&sessionId.in={sessionIdIn}&sessionId.notIn={sessionIdNotIn}&startedAt.greaterThan={startedAtGreaterThan}&startedAt.lessThan={startedAtLessThan}&startedAt.greaterThanOrEqual={startedAtGreaterThanOrEqual}&startedAt.lessThanOrEqual={startedAtLessThanOrEqual}&startedAt.equals={startedAtEquals}&startedAt.notEquals={startedAtNotEquals}&startedAt.specified={startedAtSpecified}&startedAt.in={startedAtIn}&startedAt.notIn={startedAtNotIn}&endedAt.greaterThan={endedAtGreaterThan}&endedAt.lessThan={endedAtLessThan}&endedAt.greaterThanOrEqual={endedAtGreaterThanOrEqual}&endedAt.lessThanOrEqual={endedAtLessThanOrEqual}&endedAt.equals={endedAtEquals}&endedAt.notEquals={endedAtNotEquals}&endedAt.specified={endedAtSpecified}&endedAt.in={endedAtIn}&endedAt.notIn={endedAtNotIn}&isActive.equals={isActiveEquals}&isActive.notEquals={isActiveNotEquals}&isActive.specified={isActiveSpecified}&isActive.in={isActiveIn}&isActive.notIn={isActiveNotIn}&context.contains={contextContains}&context.doesNotContain={contextDoesNotContain}&context.equals={contextEquals}&context.notEquals={contextNotEquals}&context.specified={contextSpecified}&context.in={contextIn}&context.notIn={contextNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&messagesId.greaterThan={messagesIdGreaterThan}&messagesId.lessThan={messagesIdLessThan}&messagesId.greaterThanOrEqual={messagesIdGreaterThanOrEqual}&messagesId.lessThanOrEqual={messagesIdLessThanOrEqual}&messagesId.equals={messagesIdEquals}&messagesId.notEquals={messagesIdNotEquals}&messagesId.specified={messagesIdSpecified}&messagesId.in={messagesIdIn}&messagesId.notIn={messagesIdNotIn}&queriesId.greaterThan={queriesIdGreaterThan}&queriesId.lessThan={queriesIdLessThan}&queriesId.greaterThanOrEqual={queriesIdGreaterThanOrEqual}&queriesId.lessThanOrEqual={queriesIdLessThanOrEqual}&queriesId.equals={queriesIdEquals}&queriesId.notEquals={queriesIdNotEquals}&queriesId.specified={queriesIdSpecified}&queriesId.in={queriesIdIn}&queriesId.notIn={queriesIdNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countChatSessionsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("sessionIdContains") @jakarta.annotation.Nullable String sessionIdContains, @Param("sessionIdDoesNotContain") @jakarta.annotation.Nullable String sessionIdDoesNotContain, @Param("sessionIdEquals") @jakarta.annotation.Nullable String sessionIdEquals, @Param("sessionIdNotEquals") @jakarta.annotation.Nullable String sessionIdNotEquals, @Param("sessionIdSpecified") @jakarta.annotation.Nullable Boolean sessionIdSpecified, @Param("sessionIdIn") @jakarta.annotation.Nullable List<String> sessionIdIn, @Param("sessionIdNotIn") @jakarta.annotation.Nullable List<String> sessionIdNotIn, @Param("startedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime startedAtGreaterThan, @Param("startedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime startedAtLessThan, @Param("startedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime startedAtGreaterThanOrEqual, @Param("startedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime startedAtLessThanOrEqual, @Param("startedAtEquals") @jakarta.annotation.Nullable OffsetDateTime startedAtEquals, @Param("startedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime startedAtNotEquals, @Param("startedAtSpecified") @jakarta.annotation.Nullable Boolean startedAtSpecified, @Param("startedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> startedAtIn, @Param("startedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> startedAtNotIn, @Param("endedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime endedAtGreaterThan, @Param("endedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime endedAtLessThan, @Param("endedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime endedAtGreaterThanOrEqual, @Param("endedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime endedAtLessThanOrEqual, @Param("endedAtEquals") @jakarta.annotation.Nullable OffsetDateTime endedAtEquals, @Param("endedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime endedAtNotEquals, @Param("endedAtSpecified") @jakarta.annotation.Nullable Boolean endedAtSpecified, @Param("endedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> endedAtIn, @Param("endedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> endedAtNotIn, @Param("isActiveEquals") @jakarta.annotation.Nullable Boolean isActiveEquals, @Param("isActiveNotEquals") @jakarta.annotation.Nullable Boolean isActiveNotEquals, @Param("isActiveSpecified") @jakarta.annotation.Nullable Boolean isActiveSpecified, @Param("isActiveIn") @jakarta.annotation.Nullable List<Boolean> isActiveIn, @Param("isActiveNotIn") @jakarta.annotation.Nullable List<Boolean> isActiveNotIn, @Param("contextContains") @jakarta.annotation.Nullable String contextContains, @Param("contextDoesNotContain") @jakarta.annotation.Nullable String contextDoesNotContain, @Param("contextEquals") @jakarta.annotation.Nullable String contextEquals, @Param("contextNotEquals") @jakarta.annotation.Nullable String contextNotEquals, @Param("contextSpecified") @jakarta.annotation.Nullable Boolean contextSpecified, @Param("contextIn") @jakarta.annotation.Nullable List<String> contextIn, @Param("contextNotIn") @jakarta.annotation.Nullable List<String> contextNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("messagesIdGreaterThan") @jakarta.annotation.Nullable Long messagesIdGreaterThan, @Param("messagesIdLessThan") @jakarta.annotation.Nullable Long messagesIdLessThan, @Param("messagesIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long messagesIdGreaterThanOrEqual, @Param("messagesIdLessThanOrEqual") @jakarta.annotation.Nullable Long messagesIdLessThanOrEqual, @Param("messagesIdEquals") @jakarta.annotation.Nullable Long messagesIdEquals, @Param("messagesIdNotEquals") @jakarta.annotation.Nullable Long messagesIdNotEquals, @Param("messagesIdSpecified") @jakarta.annotation.Nullable Boolean messagesIdSpecified, @Param("messagesIdIn") @jakarta.annotation.Nullable List<Long> messagesIdIn, @Param("messagesIdNotIn") @jakarta.annotation.Nullable List<Long> messagesIdNotIn, @Param("queriesIdGreaterThan") @jakarta.annotation.Nullable Long queriesIdGreaterThan, @Param("queriesIdLessThan") @jakarta.annotation.Nullable Long queriesIdLessThan, @Param("queriesIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long queriesIdGreaterThanOrEqual, @Param("queriesIdLessThanOrEqual") @jakarta.annotation.Nullable Long queriesIdLessThanOrEqual, @Param("queriesIdEquals") @jakarta.annotation.Nullable Long queriesIdEquals, @Param("queriesIdNotEquals") @jakarta.annotation.Nullable Long queriesIdNotEquals, @Param("queriesIdSpecified") @jakarta.annotation.Nullable Boolean queriesIdSpecified, @Param("queriesIdIn") @jakarta.annotation.Nullable List<Long> queriesIdIn, @Param("queriesIdNotIn") @jakarta.annotation.Nullable List<Long> queriesIdNotIn, @Param("userIdGreaterThan") @jakarta.annotation.Nullable Long userIdGreaterThan, @Param("userIdLessThan") @jakarta.annotation.Nullable Long userIdLessThan, @Param("userIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long userIdGreaterThanOrEqual, @Param("userIdLessThanOrEqual") @jakarta.annotation.Nullable Long userIdLessThanOrEqual, @Param("userIdEquals") @jakarta.annotation.Nullable Long userIdEquals, @Param("userIdNotEquals") @jakarta.annotation.Nullable Long userIdNotEquals, @Param("userIdSpecified") @jakarta.annotation.Nullable Boolean userIdSpecified, @Param("userIdIn") @jakarta.annotation.Nullable List<Long> userIdIn, @Param("userIdNotIn") @jakarta.annotation.Nullable List<Long> userIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countChatSessions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountChatSessionsQueryParams} class that allows for
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
   *   <li>sessionIdContains -  (optional)</li>
   *   <li>sessionIdDoesNotContain -  (optional)</li>
   *   <li>sessionIdEquals -  (optional)</li>
   *   <li>sessionIdNotEquals -  (optional)</li>
   *   <li>sessionIdSpecified -  (optional)</li>
   *   <li>sessionIdIn -  (optional)</li>
   *   <li>sessionIdNotIn -  (optional)</li>
   *   <li>startedAtGreaterThan -  (optional)</li>
   *   <li>startedAtLessThan -  (optional)</li>
   *   <li>startedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>startedAtLessThanOrEqual -  (optional)</li>
   *   <li>startedAtEquals -  (optional)</li>
   *   <li>startedAtNotEquals -  (optional)</li>
   *   <li>startedAtSpecified -  (optional)</li>
   *   <li>startedAtIn -  (optional)</li>
   *   <li>startedAtNotIn -  (optional)</li>
   *   <li>endedAtGreaterThan -  (optional)</li>
   *   <li>endedAtLessThan -  (optional)</li>
   *   <li>endedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>endedAtLessThanOrEqual -  (optional)</li>
   *   <li>endedAtEquals -  (optional)</li>
   *   <li>endedAtNotEquals -  (optional)</li>
   *   <li>endedAtSpecified -  (optional)</li>
   *   <li>endedAtIn -  (optional)</li>
   *   <li>endedAtNotIn -  (optional)</li>
   *   <li>isActiveEquals -  (optional)</li>
   *   <li>isActiveNotEquals -  (optional)</li>
   *   <li>isActiveSpecified -  (optional)</li>
   *   <li>isActiveIn -  (optional)</li>
   *   <li>isActiveNotIn -  (optional)</li>
   *   <li>contextContains -  (optional)</li>
   *   <li>contextDoesNotContain -  (optional)</li>
   *   <li>contextEquals -  (optional)</li>
   *   <li>contextNotEquals -  (optional)</li>
   *   <li>contextSpecified -  (optional)</li>
   *   <li>contextIn -  (optional)</li>
   *   <li>contextNotIn -  (optional)</li>
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
   *   <li>messagesIdGreaterThan -  (optional)</li>
   *   <li>messagesIdLessThan -  (optional)</li>
   *   <li>messagesIdGreaterThanOrEqual -  (optional)</li>
   *   <li>messagesIdLessThanOrEqual -  (optional)</li>
   *   <li>messagesIdEquals -  (optional)</li>
   *   <li>messagesIdNotEquals -  (optional)</li>
   *   <li>messagesIdSpecified -  (optional)</li>
   *   <li>messagesIdIn -  (optional)</li>
   *   <li>messagesIdNotIn -  (optional)</li>
   *   <li>queriesIdGreaterThan -  (optional)</li>
   *   <li>queriesIdLessThan -  (optional)</li>
   *   <li>queriesIdGreaterThanOrEqual -  (optional)</li>
   *   <li>queriesIdLessThanOrEqual -  (optional)</li>
   *   <li>queriesIdEquals -  (optional)</li>
   *   <li>queriesIdNotEquals -  (optional)</li>
   *   <li>queriesIdSpecified -  (optional)</li>
   *   <li>queriesIdIn -  (optional)</li>
   *   <li>queriesIdNotIn -  (optional)</li>
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
  @RequestLine("GET /api/chat-sessions/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&sessionId.contains={sessionIdContains}&sessionId.doesNotContain={sessionIdDoesNotContain}&sessionId.equals={sessionIdEquals}&sessionId.notEquals={sessionIdNotEquals}&sessionId.specified={sessionIdSpecified}&sessionId.in={sessionIdIn}&sessionId.notIn={sessionIdNotIn}&startedAt.greaterThan={startedAtGreaterThan}&startedAt.lessThan={startedAtLessThan}&startedAt.greaterThanOrEqual={startedAtGreaterThanOrEqual}&startedAt.lessThanOrEqual={startedAtLessThanOrEqual}&startedAt.equals={startedAtEquals}&startedAt.notEquals={startedAtNotEquals}&startedAt.specified={startedAtSpecified}&startedAt.in={startedAtIn}&startedAt.notIn={startedAtNotIn}&endedAt.greaterThan={endedAtGreaterThan}&endedAt.lessThan={endedAtLessThan}&endedAt.greaterThanOrEqual={endedAtGreaterThanOrEqual}&endedAt.lessThanOrEqual={endedAtLessThanOrEqual}&endedAt.equals={endedAtEquals}&endedAt.notEquals={endedAtNotEquals}&endedAt.specified={endedAtSpecified}&endedAt.in={endedAtIn}&endedAt.notIn={endedAtNotIn}&isActive.equals={isActiveEquals}&isActive.notEquals={isActiveNotEquals}&isActive.specified={isActiveSpecified}&isActive.in={isActiveIn}&isActive.notIn={isActiveNotIn}&context.contains={contextContains}&context.doesNotContain={contextDoesNotContain}&context.equals={contextEquals}&context.notEquals={contextNotEquals}&context.specified={contextSpecified}&context.in={contextIn}&context.notIn={contextNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&messagesId.greaterThan={messagesIdGreaterThan}&messagesId.lessThan={messagesIdLessThan}&messagesId.greaterThanOrEqual={messagesIdGreaterThanOrEqual}&messagesId.lessThanOrEqual={messagesIdLessThanOrEqual}&messagesId.equals={messagesIdEquals}&messagesId.notEquals={messagesIdNotEquals}&messagesId.specified={messagesIdSpecified}&messagesId.in={messagesIdIn}&messagesId.notIn={messagesIdNotIn}&queriesId.greaterThan={queriesIdGreaterThan}&queriesId.lessThan={queriesIdLessThan}&queriesId.greaterThanOrEqual={queriesIdGreaterThanOrEqual}&queriesId.lessThanOrEqual={queriesIdLessThanOrEqual}&queriesId.equals={queriesIdEquals}&queriesId.notEquals={queriesIdNotEquals}&queriesId.specified={queriesIdSpecified}&queriesId.in={queriesIdIn}&queriesId.notIn={queriesIdNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countChatSessions(@QueryMap(encoded=true) CountChatSessionsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countChatSessions</code> that receives the query parameters as a map,
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
          *   <li>sessionIdContains -  (optional)</li>
          *   <li>sessionIdDoesNotContain -  (optional)</li>
          *   <li>sessionIdEquals -  (optional)</li>
          *   <li>sessionIdNotEquals -  (optional)</li>
          *   <li>sessionIdSpecified -  (optional)</li>
          *   <li>sessionIdIn -  (optional)</li>
          *   <li>sessionIdNotIn -  (optional)</li>
          *   <li>startedAtGreaterThan -  (optional)</li>
          *   <li>startedAtLessThan -  (optional)</li>
          *   <li>startedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>startedAtLessThanOrEqual -  (optional)</li>
          *   <li>startedAtEquals -  (optional)</li>
          *   <li>startedAtNotEquals -  (optional)</li>
          *   <li>startedAtSpecified -  (optional)</li>
          *   <li>startedAtIn -  (optional)</li>
          *   <li>startedAtNotIn -  (optional)</li>
          *   <li>endedAtGreaterThan -  (optional)</li>
          *   <li>endedAtLessThan -  (optional)</li>
          *   <li>endedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>endedAtLessThanOrEqual -  (optional)</li>
          *   <li>endedAtEquals -  (optional)</li>
          *   <li>endedAtNotEquals -  (optional)</li>
          *   <li>endedAtSpecified -  (optional)</li>
          *   <li>endedAtIn -  (optional)</li>
          *   <li>endedAtNotIn -  (optional)</li>
          *   <li>isActiveEquals -  (optional)</li>
          *   <li>isActiveNotEquals -  (optional)</li>
          *   <li>isActiveSpecified -  (optional)</li>
          *   <li>isActiveIn -  (optional)</li>
          *   <li>isActiveNotIn -  (optional)</li>
          *   <li>contextContains -  (optional)</li>
          *   <li>contextDoesNotContain -  (optional)</li>
          *   <li>contextEquals -  (optional)</li>
          *   <li>contextNotEquals -  (optional)</li>
          *   <li>contextSpecified -  (optional)</li>
          *   <li>contextIn -  (optional)</li>
          *   <li>contextNotIn -  (optional)</li>
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
          *   <li>messagesIdGreaterThan -  (optional)</li>
          *   <li>messagesIdLessThan -  (optional)</li>
          *   <li>messagesIdGreaterThanOrEqual -  (optional)</li>
          *   <li>messagesIdLessThanOrEqual -  (optional)</li>
          *   <li>messagesIdEquals -  (optional)</li>
          *   <li>messagesIdNotEquals -  (optional)</li>
          *   <li>messagesIdSpecified -  (optional)</li>
          *   <li>messagesIdIn -  (optional)</li>
          *   <li>messagesIdNotIn -  (optional)</li>
          *   <li>queriesIdGreaterThan -  (optional)</li>
          *   <li>queriesIdLessThan -  (optional)</li>
          *   <li>queriesIdGreaterThanOrEqual -  (optional)</li>
          *   <li>queriesIdLessThanOrEqual -  (optional)</li>
          *   <li>queriesIdEquals -  (optional)</li>
          *   <li>queriesIdNotEquals -  (optional)</li>
          *   <li>queriesIdSpecified -  (optional)</li>
          *   <li>queriesIdIn -  (optional)</li>
          *   <li>queriesIdNotIn -  (optional)</li>
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
      @RequestLine("GET /api/chat-sessions/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&sessionId.contains={sessionIdContains}&sessionId.doesNotContain={sessionIdDoesNotContain}&sessionId.equals={sessionIdEquals}&sessionId.notEquals={sessionIdNotEquals}&sessionId.specified={sessionIdSpecified}&sessionId.in={sessionIdIn}&sessionId.notIn={sessionIdNotIn}&startedAt.greaterThan={startedAtGreaterThan}&startedAt.lessThan={startedAtLessThan}&startedAt.greaterThanOrEqual={startedAtGreaterThanOrEqual}&startedAt.lessThanOrEqual={startedAtLessThanOrEqual}&startedAt.equals={startedAtEquals}&startedAt.notEquals={startedAtNotEquals}&startedAt.specified={startedAtSpecified}&startedAt.in={startedAtIn}&startedAt.notIn={startedAtNotIn}&endedAt.greaterThan={endedAtGreaterThan}&endedAt.lessThan={endedAtLessThan}&endedAt.greaterThanOrEqual={endedAtGreaterThanOrEqual}&endedAt.lessThanOrEqual={endedAtLessThanOrEqual}&endedAt.equals={endedAtEquals}&endedAt.notEquals={endedAtNotEquals}&endedAt.specified={endedAtSpecified}&endedAt.in={endedAtIn}&endedAt.notIn={endedAtNotIn}&isActive.equals={isActiveEquals}&isActive.notEquals={isActiveNotEquals}&isActive.specified={isActiveSpecified}&isActive.in={isActiveIn}&isActive.notIn={isActiveNotIn}&context.contains={contextContains}&context.doesNotContain={contextDoesNotContain}&context.equals={contextEquals}&context.notEquals={contextNotEquals}&context.specified={contextSpecified}&context.in={contextIn}&context.notIn={contextNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&messagesId.greaterThan={messagesIdGreaterThan}&messagesId.lessThan={messagesIdLessThan}&messagesId.greaterThanOrEqual={messagesIdGreaterThanOrEqual}&messagesId.lessThanOrEqual={messagesIdLessThanOrEqual}&messagesId.equals={messagesIdEquals}&messagesId.notEquals={messagesIdNotEquals}&messagesId.specified={messagesIdSpecified}&messagesId.in={messagesIdIn}&messagesId.notIn={messagesIdNotIn}&queriesId.greaterThan={queriesIdGreaterThan}&queriesId.lessThan={queriesIdLessThan}&queriesId.greaterThanOrEqual={queriesIdGreaterThanOrEqual}&queriesId.lessThanOrEqual={queriesIdLessThanOrEqual}&queriesId.equals={queriesIdEquals}&queriesId.notEquals={queriesIdNotEquals}&queriesId.specified={queriesIdSpecified}&queriesId.in={queriesIdIn}&queriesId.notIn={queriesIdNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countChatSessionsWithHttpInfo(@QueryMap(encoded=true) CountChatSessionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countChatSessions</code> method in a fluent style.
   */
  public static class CountChatSessionsQueryParams extends HashMap<String, Object> {
    public CountChatSessionsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams sessionIdContains(@jakarta.annotation.Nullable final String value) {
      put("sessionId.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams sessionIdDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("sessionId.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams sessionIdEquals(@jakarta.annotation.Nullable final String value) {
      put("sessionId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams sessionIdNotEquals(@jakarta.annotation.Nullable final String value) {
      put("sessionId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams sessionIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("sessionId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams sessionIdIn(@jakarta.annotation.Nullable final List<String> value) {
      put("sessionId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams sessionIdNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("sessionId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams startedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("startedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams startedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("startedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams startedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("startedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams startedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("startedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams startedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("startedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams startedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("startedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams startedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("startedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams startedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("startedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams startedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("startedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams endedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("endedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams endedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("endedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams endedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("endedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams endedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("endedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams endedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("endedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams endedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("endedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams endedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("endedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams endedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("endedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams endedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("endedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams isActiveEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isActive.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams isActiveNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isActive.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams isActiveSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isActive.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams isActiveIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isActive.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams isActiveNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isActive.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams contextContains(@jakarta.annotation.Nullable final String value) {
      put("context.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams contextDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("context.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams contextEquals(@jakarta.annotation.Nullable final String value) {
      put("context.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams contextNotEquals(@jakarta.annotation.Nullable final String value) {
      put("context.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams contextSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("context.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams contextIn(@jakarta.annotation.Nullable final List<String> value) {
      put("context.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams contextNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("context.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams messagesIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("messagesId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams messagesIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("messagesId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams messagesIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("messagesId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams messagesIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("messagesId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams messagesIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("messagesId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams messagesIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("messagesId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams messagesIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("messagesId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams messagesIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("messagesId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams messagesIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("messagesId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams queriesIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("queriesId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams queriesIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("queriesId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams queriesIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("queriesId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams queriesIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("queriesId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams queriesIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("queriesId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams queriesIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("queriesId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams queriesIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("queriesId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams queriesIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("queriesId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams queriesIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("queriesId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams userIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("userId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams userIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("userId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams userIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("userId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams userIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("userId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams userIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("userId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams userIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("userId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams userIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("userId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatSessionsQueryParams userIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("userId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams userIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("userId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatSessionsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param chatSessionDTO  (required)
   * @return ChatSessionDTO
   */
  @RequestLine("POST /api/chat-sessions")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ChatSessionDTO createChatSession(@jakarta.annotation.Nonnull ChatSessionDTO chatSessionDTO);

  /**
   * 
   * Similar to <code>createChatSession</code> but it also returns the http response headers .
   * 
   * @param chatSessionDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/chat-sessions")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<ChatSessionDTO> createChatSessionWithHttpInfo(@jakarta.annotation.Nonnull ChatSessionDTO chatSessionDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/chat-sessions/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteChatSession(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deleteChatSession</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/chat-sessions/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteChatSessionWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



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
   * @param sessionIdContains  (optional)
   * @param sessionIdDoesNotContain  (optional)
   * @param sessionIdEquals  (optional)
   * @param sessionIdNotEquals  (optional)
   * @param sessionIdSpecified  (optional)
   * @param sessionIdIn  (optional)
   * @param sessionIdNotIn  (optional)
   * @param startedAtGreaterThan  (optional)
   * @param startedAtLessThan  (optional)
   * @param startedAtGreaterThanOrEqual  (optional)
   * @param startedAtLessThanOrEqual  (optional)
   * @param startedAtEquals  (optional)
   * @param startedAtNotEquals  (optional)
   * @param startedAtSpecified  (optional)
   * @param startedAtIn  (optional)
   * @param startedAtNotIn  (optional)
   * @param endedAtGreaterThan  (optional)
   * @param endedAtLessThan  (optional)
   * @param endedAtGreaterThanOrEqual  (optional)
   * @param endedAtLessThanOrEqual  (optional)
   * @param endedAtEquals  (optional)
   * @param endedAtNotEquals  (optional)
   * @param endedAtSpecified  (optional)
   * @param endedAtIn  (optional)
   * @param endedAtNotIn  (optional)
   * @param isActiveEquals  (optional)
   * @param isActiveNotEquals  (optional)
   * @param isActiveSpecified  (optional)
   * @param isActiveIn  (optional)
   * @param isActiveNotIn  (optional)
   * @param contextContains  (optional)
   * @param contextDoesNotContain  (optional)
   * @param contextEquals  (optional)
   * @param contextNotEquals  (optional)
   * @param contextSpecified  (optional)
   * @param contextIn  (optional)
   * @param contextNotIn  (optional)
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
   * @param messagesIdGreaterThan  (optional)
   * @param messagesIdLessThan  (optional)
   * @param messagesIdGreaterThanOrEqual  (optional)
   * @param messagesIdLessThanOrEqual  (optional)
   * @param messagesIdEquals  (optional)
   * @param messagesIdNotEquals  (optional)
   * @param messagesIdSpecified  (optional)
   * @param messagesIdIn  (optional)
   * @param messagesIdNotIn  (optional)
   * @param queriesIdGreaterThan  (optional)
   * @param queriesIdLessThan  (optional)
   * @param queriesIdGreaterThanOrEqual  (optional)
   * @param queriesIdLessThanOrEqual  (optional)
   * @param queriesIdEquals  (optional)
   * @param queriesIdNotEquals  (optional)
   * @param queriesIdSpecified  (optional)
   * @param queriesIdIn  (optional)
   * @param queriesIdNotIn  (optional)
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
   * @return List&lt;ChatSessionDTO&gt;
   */
  @RequestLine("GET /api/chat-sessions?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&sessionId.contains={sessionIdContains}&sessionId.doesNotContain={sessionIdDoesNotContain}&sessionId.equals={sessionIdEquals}&sessionId.notEquals={sessionIdNotEquals}&sessionId.specified={sessionIdSpecified}&sessionId.in={sessionIdIn}&sessionId.notIn={sessionIdNotIn}&startedAt.greaterThan={startedAtGreaterThan}&startedAt.lessThan={startedAtLessThan}&startedAt.greaterThanOrEqual={startedAtGreaterThanOrEqual}&startedAt.lessThanOrEqual={startedAtLessThanOrEqual}&startedAt.equals={startedAtEquals}&startedAt.notEquals={startedAtNotEquals}&startedAt.specified={startedAtSpecified}&startedAt.in={startedAtIn}&startedAt.notIn={startedAtNotIn}&endedAt.greaterThan={endedAtGreaterThan}&endedAt.lessThan={endedAtLessThan}&endedAt.greaterThanOrEqual={endedAtGreaterThanOrEqual}&endedAt.lessThanOrEqual={endedAtLessThanOrEqual}&endedAt.equals={endedAtEquals}&endedAt.notEquals={endedAtNotEquals}&endedAt.specified={endedAtSpecified}&endedAt.in={endedAtIn}&endedAt.notIn={endedAtNotIn}&isActive.equals={isActiveEquals}&isActive.notEquals={isActiveNotEquals}&isActive.specified={isActiveSpecified}&isActive.in={isActiveIn}&isActive.notIn={isActiveNotIn}&context.contains={contextContains}&context.doesNotContain={contextDoesNotContain}&context.equals={contextEquals}&context.notEquals={contextNotEquals}&context.specified={contextSpecified}&context.in={contextIn}&context.notIn={contextNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&messagesId.greaterThan={messagesIdGreaterThan}&messagesId.lessThan={messagesIdLessThan}&messagesId.greaterThanOrEqual={messagesIdGreaterThanOrEqual}&messagesId.lessThanOrEqual={messagesIdLessThanOrEqual}&messagesId.equals={messagesIdEquals}&messagesId.notEquals={messagesIdNotEquals}&messagesId.specified={messagesIdSpecified}&messagesId.in={messagesIdIn}&messagesId.notIn={messagesIdNotIn}&queriesId.greaterThan={queriesIdGreaterThan}&queriesId.lessThan={queriesIdLessThan}&queriesId.greaterThanOrEqual={queriesIdGreaterThanOrEqual}&queriesId.lessThanOrEqual={queriesIdLessThanOrEqual}&queriesId.equals={queriesIdEquals}&queriesId.notEquals={queriesIdNotEquals}&queriesId.specified={queriesIdSpecified}&queriesId.in={queriesIdIn}&queriesId.notIn={queriesIdNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  List<ChatSessionDTO> getAllChatSessions(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("sessionIdContains") @jakarta.annotation.Nullable String sessionIdContains, @Param("sessionIdDoesNotContain") @jakarta.annotation.Nullable String sessionIdDoesNotContain, @Param("sessionIdEquals") @jakarta.annotation.Nullable String sessionIdEquals, @Param("sessionIdNotEquals") @jakarta.annotation.Nullable String sessionIdNotEquals, @Param("sessionIdSpecified") @jakarta.annotation.Nullable Boolean sessionIdSpecified, @Param("sessionIdIn") @jakarta.annotation.Nullable List<String> sessionIdIn, @Param("sessionIdNotIn") @jakarta.annotation.Nullable List<String> sessionIdNotIn, @Param("startedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime startedAtGreaterThan, @Param("startedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime startedAtLessThan, @Param("startedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime startedAtGreaterThanOrEqual, @Param("startedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime startedAtLessThanOrEqual, @Param("startedAtEquals") @jakarta.annotation.Nullable OffsetDateTime startedAtEquals, @Param("startedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime startedAtNotEquals, @Param("startedAtSpecified") @jakarta.annotation.Nullable Boolean startedAtSpecified, @Param("startedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> startedAtIn, @Param("startedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> startedAtNotIn, @Param("endedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime endedAtGreaterThan, @Param("endedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime endedAtLessThan, @Param("endedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime endedAtGreaterThanOrEqual, @Param("endedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime endedAtLessThanOrEqual, @Param("endedAtEquals") @jakarta.annotation.Nullable OffsetDateTime endedAtEquals, @Param("endedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime endedAtNotEquals, @Param("endedAtSpecified") @jakarta.annotation.Nullable Boolean endedAtSpecified, @Param("endedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> endedAtIn, @Param("endedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> endedAtNotIn, @Param("isActiveEquals") @jakarta.annotation.Nullable Boolean isActiveEquals, @Param("isActiveNotEquals") @jakarta.annotation.Nullable Boolean isActiveNotEquals, @Param("isActiveSpecified") @jakarta.annotation.Nullable Boolean isActiveSpecified, @Param("isActiveIn") @jakarta.annotation.Nullable List<Boolean> isActiveIn, @Param("isActiveNotIn") @jakarta.annotation.Nullable List<Boolean> isActiveNotIn, @Param("contextContains") @jakarta.annotation.Nullable String contextContains, @Param("contextDoesNotContain") @jakarta.annotation.Nullable String contextDoesNotContain, @Param("contextEquals") @jakarta.annotation.Nullable String contextEquals, @Param("contextNotEquals") @jakarta.annotation.Nullable String contextNotEquals, @Param("contextSpecified") @jakarta.annotation.Nullable Boolean contextSpecified, @Param("contextIn") @jakarta.annotation.Nullable List<String> contextIn, @Param("contextNotIn") @jakarta.annotation.Nullable List<String> contextNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("messagesIdGreaterThan") @jakarta.annotation.Nullable Long messagesIdGreaterThan, @Param("messagesIdLessThan") @jakarta.annotation.Nullable Long messagesIdLessThan, @Param("messagesIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long messagesIdGreaterThanOrEqual, @Param("messagesIdLessThanOrEqual") @jakarta.annotation.Nullable Long messagesIdLessThanOrEqual, @Param("messagesIdEquals") @jakarta.annotation.Nullable Long messagesIdEquals, @Param("messagesIdNotEquals") @jakarta.annotation.Nullable Long messagesIdNotEquals, @Param("messagesIdSpecified") @jakarta.annotation.Nullable Boolean messagesIdSpecified, @Param("messagesIdIn") @jakarta.annotation.Nullable List<Long> messagesIdIn, @Param("messagesIdNotIn") @jakarta.annotation.Nullable List<Long> messagesIdNotIn, @Param("queriesIdGreaterThan") @jakarta.annotation.Nullable Long queriesIdGreaterThan, @Param("queriesIdLessThan") @jakarta.annotation.Nullable Long queriesIdLessThan, @Param("queriesIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long queriesIdGreaterThanOrEqual, @Param("queriesIdLessThanOrEqual") @jakarta.annotation.Nullable Long queriesIdLessThanOrEqual, @Param("queriesIdEquals") @jakarta.annotation.Nullable Long queriesIdEquals, @Param("queriesIdNotEquals") @jakarta.annotation.Nullable Long queriesIdNotEquals, @Param("queriesIdSpecified") @jakarta.annotation.Nullable Boolean queriesIdSpecified, @Param("queriesIdIn") @jakarta.annotation.Nullable List<Long> queriesIdIn, @Param("queriesIdNotIn") @jakarta.annotation.Nullable List<Long> queriesIdNotIn, @Param("userIdGreaterThan") @jakarta.annotation.Nullable Long userIdGreaterThan, @Param("userIdLessThan") @jakarta.annotation.Nullable Long userIdLessThan, @Param("userIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long userIdGreaterThanOrEqual, @Param("userIdLessThanOrEqual") @jakarta.annotation.Nullable Long userIdLessThanOrEqual, @Param("userIdEquals") @jakarta.annotation.Nullable Long userIdEquals, @Param("userIdNotEquals") @jakarta.annotation.Nullable Long userIdNotEquals, @Param("userIdSpecified") @jakarta.annotation.Nullable Boolean userIdSpecified, @Param("userIdIn") @jakarta.annotation.Nullable List<Long> userIdIn, @Param("userIdNotIn") @jakarta.annotation.Nullable List<Long> userIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);

  /**
   * 
   * Similar to <code>getAllChatSessions</code> but it also returns the http response headers .
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
   * @param sessionIdContains  (optional)
   * @param sessionIdDoesNotContain  (optional)
   * @param sessionIdEquals  (optional)
   * @param sessionIdNotEquals  (optional)
   * @param sessionIdSpecified  (optional)
   * @param sessionIdIn  (optional)
   * @param sessionIdNotIn  (optional)
   * @param startedAtGreaterThan  (optional)
   * @param startedAtLessThan  (optional)
   * @param startedAtGreaterThanOrEqual  (optional)
   * @param startedAtLessThanOrEqual  (optional)
   * @param startedAtEquals  (optional)
   * @param startedAtNotEquals  (optional)
   * @param startedAtSpecified  (optional)
   * @param startedAtIn  (optional)
   * @param startedAtNotIn  (optional)
   * @param endedAtGreaterThan  (optional)
   * @param endedAtLessThan  (optional)
   * @param endedAtGreaterThanOrEqual  (optional)
   * @param endedAtLessThanOrEqual  (optional)
   * @param endedAtEquals  (optional)
   * @param endedAtNotEquals  (optional)
   * @param endedAtSpecified  (optional)
   * @param endedAtIn  (optional)
   * @param endedAtNotIn  (optional)
   * @param isActiveEquals  (optional)
   * @param isActiveNotEquals  (optional)
   * @param isActiveSpecified  (optional)
   * @param isActiveIn  (optional)
   * @param isActiveNotIn  (optional)
   * @param contextContains  (optional)
   * @param contextDoesNotContain  (optional)
   * @param contextEquals  (optional)
   * @param contextNotEquals  (optional)
   * @param contextSpecified  (optional)
   * @param contextIn  (optional)
   * @param contextNotIn  (optional)
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
   * @param messagesIdGreaterThan  (optional)
   * @param messagesIdLessThan  (optional)
   * @param messagesIdGreaterThanOrEqual  (optional)
   * @param messagesIdLessThanOrEqual  (optional)
   * @param messagesIdEquals  (optional)
   * @param messagesIdNotEquals  (optional)
   * @param messagesIdSpecified  (optional)
   * @param messagesIdIn  (optional)
   * @param messagesIdNotIn  (optional)
   * @param queriesIdGreaterThan  (optional)
   * @param queriesIdLessThan  (optional)
   * @param queriesIdGreaterThanOrEqual  (optional)
   * @param queriesIdLessThanOrEqual  (optional)
   * @param queriesIdEquals  (optional)
   * @param queriesIdNotEquals  (optional)
   * @param queriesIdSpecified  (optional)
   * @param queriesIdIn  (optional)
   * @param queriesIdNotIn  (optional)
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
  @RequestLine("GET /api/chat-sessions?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&sessionId.contains={sessionIdContains}&sessionId.doesNotContain={sessionIdDoesNotContain}&sessionId.equals={sessionIdEquals}&sessionId.notEquals={sessionIdNotEquals}&sessionId.specified={sessionIdSpecified}&sessionId.in={sessionIdIn}&sessionId.notIn={sessionIdNotIn}&startedAt.greaterThan={startedAtGreaterThan}&startedAt.lessThan={startedAtLessThan}&startedAt.greaterThanOrEqual={startedAtGreaterThanOrEqual}&startedAt.lessThanOrEqual={startedAtLessThanOrEqual}&startedAt.equals={startedAtEquals}&startedAt.notEquals={startedAtNotEquals}&startedAt.specified={startedAtSpecified}&startedAt.in={startedAtIn}&startedAt.notIn={startedAtNotIn}&endedAt.greaterThan={endedAtGreaterThan}&endedAt.lessThan={endedAtLessThan}&endedAt.greaterThanOrEqual={endedAtGreaterThanOrEqual}&endedAt.lessThanOrEqual={endedAtLessThanOrEqual}&endedAt.equals={endedAtEquals}&endedAt.notEquals={endedAtNotEquals}&endedAt.specified={endedAtSpecified}&endedAt.in={endedAtIn}&endedAt.notIn={endedAtNotIn}&isActive.equals={isActiveEquals}&isActive.notEquals={isActiveNotEquals}&isActive.specified={isActiveSpecified}&isActive.in={isActiveIn}&isActive.notIn={isActiveNotIn}&context.contains={contextContains}&context.doesNotContain={contextDoesNotContain}&context.equals={contextEquals}&context.notEquals={contextNotEquals}&context.specified={contextSpecified}&context.in={contextIn}&context.notIn={contextNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&messagesId.greaterThan={messagesIdGreaterThan}&messagesId.lessThan={messagesIdLessThan}&messagesId.greaterThanOrEqual={messagesIdGreaterThanOrEqual}&messagesId.lessThanOrEqual={messagesIdLessThanOrEqual}&messagesId.equals={messagesIdEquals}&messagesId.notEquals={messagesIdNotEquals}&messagesId.specified={messagesIdSpecified}&messagesId.in={messagesIdIn}&messagesId.notIn={messagesIdNotIn}&queriesId.greaterThan={queriesIdGreaterThan}&queriesId.lessThan={queriesIdLessThan}&queriesId.greaterThanOrEqual={queriesIdGreaterThanOrEqual}&queriesId.lessThanOrEqual={queriesIdLessThanOrEqual}&queriesId.equals={queriesIdEquals}&queriesId.notEquals={queriesIdNotEquals}&queriesId.specified={queriesIdSpecified}&queriesId.in={queriesIdIn}&queriesId.notIn={queriesIdNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<ChatSessionDTO>> getAllChatSessionsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("sessionIdContains") @jakarta.annotation.Nullable String sessionIdContains, @Param("sessionIdDoesNotContain") @jakarta.annotation.Nullable String sessionIdDoesNotContain, @Param("sessionIdEquals") @jakarta.annotation.Nullable String sessionIdEquals, @Param("sessionIdNotEquals") @jakarta.annotation.Nullable String sessionIdNotEquals, @Param("sessionIdSpecified") @jakarta.annotation.Nullable Boolean sessionIdSpecified, @Param("sessionIdIn") @jakarta.annotation.Nullable List<String> sessionIdIn, @Param("sessionIdNotIn") @jakarta.annotation.Nullable List<String> sessionIdNotIn, @Param("startedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime startedAtGreaterThan, @Param("startedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime startedAtLessThan, @Param("startedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime startedAtGreaterThanOrEqual, @Param("startedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime startedAtLessThanOrEqual, @Param("startedAtEquals") @jakarta.annotation.Nullable OffsetDateTime startedAtEquals, @Param("startedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime startedAtNotEquals, @Param("startedAtSpecified") @jakarta.annotation.Nullable Boolean startedAtSpecified, @Param("startedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> startedAtIn, @Param("startedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> startedAtNotIn, @Param("endedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime endedAtGreaterThan, @Param("endedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime endedAtLessThan, @Param("endedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime endedAtGreaterThanOrEqual, @Param("endedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime endedAtLessThanOrEqual, @Param("endedAtEquals") @jakarta.annotation.Nullable OffsetDateTime endedAtEquals, @Param("endedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime endedAtNotEquals, @Param("endedAtSpecified") @jakarta.annotation.Nullable Boolean endedAtSpecified, @Param("endedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> endedAtIn, @Param("endedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> endedAtNotIn, @Param("isActiveEquals") @jakarta.annotation.Nullable Boolean isActiveEquals, @Param("isActiveNotEquals") @jakarta.annotation.Nullable Boolean isActiveNotEquals, @Param("isActiveSpecified") @jakarta.annotation.Nullable Boolean isActiveSpecified, @Param("isActiveIn") @jakarta.annotation.Nullable List<Boolean> isActiveIn, @Param("isActiveNotIn") @jakarta.annotation.Nullable List<Boolean> isActiveNotIn, @Param("contextContains") @jakarta.annotation.Nullable String contextContains, @Param("contextDoesNotContain") @jakarta.annotation.Nullable String contextDoesNotContain, @Param("contextEquals") @jakarta.annotation.Nullable String contextEquals, @Param("contextNotEquals") @jakarta.annotation.Nullable String contextNotEquals, @Param("contextSpecified") @jakarta.annotation.Nullable Boolean contextSpecified, @Param("contextIn") @jakarta.annotation.Nullable List<String> contextIn, @Param("contextNotIn") @jakarta.annotation.Nullable List<String> contextNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("messagesIdGreaterThan") @jakarta.annotation.Nullable Long messagesIdGreaterThan, @Param("messagesIdLessThan") @jakarta.annotation.Nullable Long messagesIdLessThan, @Param("messagesIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long messagesIdGreaterThanOrEqual, @Param("messagesIdLessThanOrEqual") @jakarta.annotation.Nullable Long messagesIdLessThanOrEqual, @Param("messagesIdEquals") @jakarta.annotation.Nullable Long messagesIdEquals, @Param("messagesIdNotEquals") @jakarta.annotation.Nullable Long messagesIdNotEquals, @Param("messagesIdSpecified") @jakarta.annotation.Nullable Boolean messagesIdSpecified, @Param("messagesIdIn") @jakarta.annotation.Nullable List<Long> messagesIdIn, @Param("messagesIdNotIn") @jakarta.annotation.Nullable List<Long> messagesIdNotIn, @Param("queriesIdGreaterThan") @jakarta.annotation.Nullable Long queriesIdGreaterThan, @Param("queriesIdLessThan") @jakarta.annotation.Nullable Long queriesIdLessThan, @Param("queriesIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long queriesIdGreaterThanOrEqual, @Param("queriesIdLessThanOrEqual") @jakarta.annotation.Nullable Long queriesIdLessThanOrEqual, @Param("queriesIdEquals") @jakarta.annotation.Nullable Long queriesIdEquals, @Param("queriesIdNotEquals") @jakarta.annotation.Nullable Long queriesIdNotEquals, @Param("queriesIdSpecified") @jakarta.annotation.Nullable Boolean queriesIdSpecified, @Param("queriesIdIn") @jakarta.annotation.Nullable List<Long> queriesIdIn, @Param("queriesIdNotIn") @jakarta.annotation.Nullable List<Long> queriesIdNotIn, @Param("userIdGreaterThan") @jakarta.annotation.Nullable Long userIdGreaterThan, @Param("userIdLessThan") @jakarta.annotation.Nullable Long userIdLessThan, @Param("userIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long userIdGreaterThanOrEqual, @Param("userIdLessThanOrEqual") @jakarta.annotation.Nullable Long userIdLessThanOrEqual, @Param("userIdEquals") @jakarta.annotation.Nullable Long userIdEquals, @Param("userIdNotEquals") @jakarta.annotation.Nullable Long userIdNotEquals, @Param("userIdSpecified") @jakarta.annotation.Nullable Boolean userIdSpecified, @Param("userIdIn") @jakarta.annotation.Nullable List<Long> userIdIn, @Param("userIdNotIn") @jakarta.annotation.Nullable List<Long> userIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllChatSessions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllChatSessionsQueryParams} class that allows for
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
   *   <li>sessionIdContains -  (optional)</li>
   *   <li>sessionIdDoesNotContain -  (optional)</li>
   *   <li>sessionIdEquals -  (optional)</li>
   *   <li>sessionIdNotEquals -  (optional)</li>
   *   <li>sessionIdSpecified -  (optional)</li>
   *   <li>sessionIdIn -  (optional)</li>
   *   <li>sessionIdNotIn -  (optional)</li>
   *   <li>startedAtGreaterThan -  (optional)</li>
   *   <li>startedAtLessThan -  (optional)</li>
   *   <li>startedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>startedAtLessThanOrEqual -  (optional)</li>
   *   <li>startedAtEquals -  (optional)</li>
   *   <li>startedAtNotEquals -  (optional)</li>
   *   <li>startedAtSpecified -  (optional)</li>
   *   <li>startedAtIn -  (optional)</li>
   *   <li>startedAtNotIn -  (optional)</li>
   *   <li>endedAtGreaterThan -  (optional)</li>
   *   <li>endedAtLessThan -  (optional)</li>
   *   <li>endedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>endedAtLessThanOrEqual -  (optional)</li>
   *   <li>endedAtEquals -  (optional)</li>
   *   <li>endedAtNotEquals -  (optional)</li>
   *   <li>endedAtSpecified -  (optional)</li>
   *   <li>endedAtIn -  (optional)</li>
   *   <li>endedAtNotIn -  (optional)</li>
   *   <li>isActiveEquals -  (optional)</li>
   *   <li>isActiveNotEquals -  (optional)</li>
   *   <li>isActiveSpecified -  (optional)</li>
   *   <li>isActiveIn -  (optional)</li>
   *   <li>isActiveNotIn -  (optional)</li>
   *   <li>contextContains -  (optional)</li>
   *   <li>contextDoesNotContain -  (optional)</li>
   *   <li>contextEquals -  (optional)</li>
   *   <li>contextNotEquals -  (optional)</li>
   *   <li>contextSpecified -  (optional)</li>
   *   <li>contextIn -  (optional)</li>
   *   <li>contextNotIn -  (optional)</li>
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
   *   <li>messagesIdGreaterThan -  (optional)</li>
   *   <li>messagesIdLessThan -  (optional)</li>
   *   <li>messagesIdGreaterThanOrEqual -  (optional)</li>
   *   <li>messagesIdLessThanOrEqual -  (optional)</li>
   *   <li>messagesIdEquals -  (optional)</li>
   *   <li>messagesIdNotEquals -  (optional)</li>
   *   <li>messagesIdSpecified -  (optional)</li>
   *   <li>messagesIdIn -  (optional)</li>
   *   <li>messagesIdNotIn -  (optional)</li>
   *   <li>queriesIdGreaterThan -  (optional)</li>
   *   <li>queriesIdLessThan -  (optional)</li>
   *   <li>queriesIdGreaterThanOrEqual -  (optional)</li>
   *   <li>queriesIdLessThanOrEqual -  (optional)</li>
   *   <li>queriesIdEquals -  (optional)</li>
   *   <li>queriesIdNotEquals -  (optional)</li>
   *   <li>queriesIdSpecified -  (optional)</li>
   *   <li>queriesIdIn -  (optional)</li>
   *   <li>queriesIdNotIn -  (optional)</li>
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
   * @return List&lt;ChatSessionDTO&gt;
   */
  @RequestLine("GET /api/chat-sessions?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&sessionId.contains={sessionIdContains}&sessionId.doesNotContain={sessionIdDoesNotContain}&sessionId.equals={sessionIdEquals}&sessionId.notEquals={sessionIdNotEquals}&sessionId.specified={sessionIdSpecified}&sessionId.in={sessionIdIn}&sessionId.notIn={sessionIdNotIn}&startedAt.greaterThan={startedAtGreaterThan}&startedAt.lessThan={startedAtLessThan}&startedAt.greaterThanOrEqual={startedAtGreaterThanOrEqual}&startedAt.lessThanOrEqual={startedAtLessThanOrEqual}&startedAt.equals={startedAtEquals}&startedAt.notEquals={startedAtNotEquals}&startedAt.specified={startedAtSpecified}&startedAt.in={startedAtIn}&startedAt.notIn={startedAtNotIn}&endedAt.greaterThan={endedAtGreaterThan}&endedAt.lessThan={endedAtLessThan}&endedAt.greaterThanOrEqual={endedAtGreaterThanOrEqual}&endedAt.lessThanOrEqual={endedAtLessThanOrEqual}&endedAt.equals={endedAtEquals}&endedAt.notEquals={endedAtNotEquals}&endedAt.specified={endedAtSpecified}&endedAt.in={endedAtIn}&endedAt.notIn={endedAtNotIn}&isActive.equals={isActiveEquals}&isActive.notEquals={isActiveNotEquals}&isActive.specified={isActiveSpecified}&isActive.in={isActiveIn}&isActive.notIn={isActiveNotIn}&context.contains={contextContains}&context.doesNotContain={contextDoesNotContain}&context.equals={contextEquals}&context.notEquals={contextNotEquals}&context.specified={contextSpecified}&context.in={contextIn}&context.notIn={contextNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&messagesId.greaterThan={messagesIdGreaterThan}&messagesId.lessThan={messagesIdLessThan}&messagesId.greaterThanOrEqual={messagesIdGreaterThanOrEqual}&messagesId.lessThanOrEqual={messagesIdLessThanOrEqual}&messagesId.equals={messagesIdEquals}&messagesId.notEquals={messagesIdNotEquals}&messagesId.specified={messagesIdSpecified}&messagesId.in={messagesIdIn}&messagesId.notIn={messagesIdNotIn}&queriesId.greaterThan={queriesIdGreaterThan}&queriesId.lessThan={queriesIdLessThan}&queriesId.greaterThanOrEqual={queriesIdGreaterThanOrEqual}&queriesId.lessThanOrEqual={queriesIdLessThanOrEqual}&queriesId.equals={queriesIdEquals}&queriesId.notEquals={queriesIdNotEquals}&queriesId.specified={queriesIdSpecified}&queriesId.in={queriesIdIn}&queriesId.notIn={queriesIdNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
  "Accept: */*",
  })
  List<ChatSessionDTO> getAllChatSessions(@QueryMap(encoded=true) GetAllChatSessionsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllChatSessions</code> that receives the query parameters as a map,
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
          *   <li>sessionIdContains -  (optional)</li>
          *   <li>sessionIdDoesNotContain -  (optional)</li>
          *   <li>sessionIdEquals -  (optional)</li>
          *   <li>sessionIdNotEquals -  (optional)</li>
          *   <li>sessionIdSpecified -  (optional)</li>
          *   <li>sessionIdIn -  (optional)</li>
          *   <li>sessionIdNotIn -  (optional)</li>
          *   <li>startedAtGreaterThan -  (optional)</li>
          *   <li>startedAtLessThan -  (optional)</li>
          *   <li>startedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>startedAtLessThanOrEqual -  (optional)</li>
          *   <li>startedAtEquals -  (optional)</li>
          *   <li>startedAtNotEquals -  (optional)</li>
          *   <li>startedAtSpecified -  (optional)</li>
          *   <li>startedAtIn -  (optional)</li>
          *   <li>startedAtNotIn -  (optional)</li>
          *   <li>endedAtGreaterThan -  (optional)</li>
          *   <li>endedAtLessThan -  (optional)</li>
          *   <li>endedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>endedAtLessThanOrEqual -  (optional)</li>
          *   <li>endedAtEquals -  (optional)</li>
          *   <li>endedAtNotEquals -  (optional)</li>
          *   <li>endedAtSpecified -  (optional)</li>
          *   <li>endedAtIn -  (optional)</li>
          *   <li>endedAtNotIn -  (optional)</li>
          *   <li>isActiveEquals -  (optional)</li>
          *   <li>isActiveNotEquals -  (optional)</li>
          *   <li>isActiveSpecified -  (optional)</li>
          *   <li>isActiveIn -  (optional)</li>
          *   <li>isActiveNotIn -  (optional)</li>
          *   <li>contextContains -  (optional)</li>
          *   <li>contextDoesNotContain -  (optional)</li>
          *   <li>contextEquals -  (optional)</li>
          *   <li>contextNotEquals -  (optional)</li>
          *   <li>contextSpecified -  (optional)</li>
          *   <li>contextIn -  (optional)</li>
          *   <li>contextNotIn -  (optional)</li>
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
          *   <li>messagesIdGreaterThan -  (optional)</li>
          *   <li>messagesIdLessThan -  (optional)</li>
          *   <li>messagesIdGreaterThanOrEqual -  (optional)</li>
          *   <li>messagesIdLessThanOrEqual -  (optional)</li>
          *   <li>messagesIdEquals -  (optional)</li>
          *   <li>messagesIdNotEquals -  (optional)</li>
          *   <li>messagesIdSpecified -  (optional)</li>
          *   <li>messagesIdIn -  (optional)</li>
          *   <li>messagesIdNotIn -  (optional)</li>
          *   <li>queriesIdGreaterThan -  (optional)</li>
          *   <li>queriesIdLessThan -  (optional)</li>
          *   <li>queriesIdGreaterThanOrEqual -  (optional)</li>
          *   <li>queriesIdLessThanOrEqual -  (optional)</li>
          *   <li>queriesIdEquals -  (optional)</li>
          *   <li>queriesIdNotEquals -  (optional)</li>
          *   <li>queriesIdSpecified -  (optional)</li>
          *   <li>queriesIdIn -  (optional)</li>
          *   <li>queriesIdNotIn -  (optional)</li>
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
          * @return List&lt;ChatSessionDTO&gt;
      */
      @RequestLine("GET /api/chat-sessions?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&sessionId.contains={sessionIdContains}&sessionId.doesNotContain={sessionIdDoesNotContain}&sessionId.equals={sessionIdEquals}&sessionId.notEquals={sessionIdNotEquals}&sessionId.specified={sessionIdSpecified}&sessionId.in={sessionIdIn}&sessionId.notIn={sessionIdNotIn}&startedAt.greaterThan={startedAtGreaterThan}&startedAt.lessThan={startedAtLessThan}&startedAt.greaterThanOrEqual={startedAtGreaterThanOrEqual}&startedAt.lessThanOrEqual={startedAtLessThanOrEqual}&startedAt.equals={startedAtEquals}&startedAt.notEquals={startedAtNotEquals}&startedAt.specified={startedAtSpecified}&startedAt.in={startedAtIn}&startedAt.notIn={startedAtNotIn}&endedAt.greaterThan={endedAtGreaterThan}&endedAt.lessThan={endedAtLessThan}&endedAt.greaterThanOrEqual={endedAtGreaterThanOrEqual}&endedAt.lessThanOrEqual={endedAtLessThanOrEqual}&endedAt.equals={endedAtEquals}&endedAt.notEquals={endedAtNotEquals}&endedAt.specified={endedAtSpecified}&endedAt.in={endedAtIn}&endedAt.notIn={endedAtNotIn}&isActive.equals={isActiveEquals}&isActive.notEquals={isActiveNotEquals}&isActive.specified={isActiveSpecified}&isActive.in={isActiveIn}&isActive.notIn={isActiveNotIn}&context.contains={contextContains}&context.doesNotContain={contextDoesNotContain}&context.equals={contextEquals}&context.notEquals={contextNotEquals}&context.specified={contextSpecified}&context.in={contextIn}&context.notIn={contextNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&messagesId.greaterThan={messagesIdGreaterThan}&messagesId.lessThan={messagesIdLessThan}&messagesId.greaterThanOrEqual={messagesIdGreaterThanOrEqual}&messagesId.lessThanOrEqual={messagesIdLessThanOrEqual}&messagesId.equals={messagesIdEquals}&messagesId.notEquals={messagesIdNotEquals}&messagesId.specified={messagesIdSpecified}&messagesId.in={messagesIdIn}&messagesId.notIn={messagesIdNotIn}&queriesId.greaterThan={queriesIdGreaterThan}&queriesId.lessThan={queriesIdLessThan}&queriesId.greaterThanOrEqual={queriesIdGreaterThanOrEqual}&queriesId.lessThanOrEqual={queriesIdLessThanOrEqual}&queriesId.equals={queriesIdEquals}&queriesId.notEquals={queriesIdNotEquals}&queriesId.specified={queriesIdSpecified}&queriesId.in={queriesIdIn}&queriesId.notIn={queriesIdNotIn}&userId.greaterThan={userIdGreaterThan}&userId.lessThan={userIdLessThan}&userId.greaterThanOrEqual={userIdGreaterThanOrEqual}&userId.lessThanOrEqual={userIdLessThanOrEqual}&userId.equals={userIdEquals}&userId.notEquals={userIdNotEquals}&userId.specified={userIdSpecified}&userId.in={userIdIn}&userId.notIn={userIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<ChatSessionDTO>> getAllChatSessionsWithHttpInfo(@QueryMap(encoded=true) GetAllChatSessionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllChatSessions</code> method in a fluent style.
   */
  public static class GetAllChatSessionsQueryParams extends HashMap<String, Object> {
    public GetAllChatSessionsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams sessionIdContains(@jakarta.annotation.Nullable final String value) {
      put("sessionId.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams sessionIdDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("sessionId.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams sessionIdEquals(@jakarta.annotation.Nullable final String value) {
      put("sessionId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams sessionIdNotEquals(@jakarta.annotation.Nullable final String value) {
      put("sessionId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams sessionIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("sessionId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams sessionIdIn(@jakarta.annotation.Nullable final List<String> value) {
      put("sessionId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams sessionIdNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("sessionId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams startedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("startedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams startedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("startedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams startedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("startedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams startedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("startedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams startedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("startedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams startedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("startedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams startedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("startedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams startedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("startedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams startedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("startedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams endedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("endedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams endedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("endedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams endedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("endedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams endedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("endedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams endedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("endedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams endedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("endedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams endedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("endedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams endedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("endedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams endedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("endedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams isActiveEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isActive.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams isActiveNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isActive.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams isActiveSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isActive.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams isActiveIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isActive.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams isActiveNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isActive.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams contextContains(@jakarta.annotation.Nullable final String value) {
      put("context.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams contextDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("context.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams contextEquals(@jakarta.annotation.Nullable final String value) {
      put("context.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams contextNotEquals(@jakarta.annotation.Nullable final String value) {
      put("context.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams contextSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("context.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams contextIn(@jakarta.annotation.Nullable final List<String> value) {
      put("context.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams contextNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("context.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams messagesIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("messagesId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams messagesIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("messagesId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams messagesIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("messagesId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams messagesIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("messagesId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams messagesIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("messagesId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams messagesIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("messagesId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams messagesIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("messagesId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams messagesIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("messagesId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams messagesIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("messagesId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams queriesIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("queriesId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams queriesIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("queriesId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams queriesIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("queriesId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams queriesIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("queriesId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams queriesIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("queriesId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams queriesIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("queriesId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams queriesIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("queriesId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams queriesIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("queriesId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams queriesIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("queriesId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams userIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("userId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams userIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("userId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams userIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("userId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams userIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("userId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams userIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("userId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams userIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("userId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams userIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("userId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams userIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("userId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams userIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("userId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatSessionsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams page(@jakarta.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams size(@jakarta.annotation.Nullable final Integer value) {
      put("size", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatSessionsQueryParams sort(@jakarta.annotation.Nullable final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return ChatSessionDTO
   */
  @RequestLine("GET /api/chat-sessions/{id}")
  @Headers({
    "Accept: */*",
  })
  ChatSessionDTO getChatSession(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getChatSession</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/chat-sessions/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<ChatSessionDTO> getChatSessionWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param chatSessionDTO  (required)
   * @return ChatSessionDTO
   */
  @RequestLine("PATCH /api/chat-sessions/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ChatSessionDTO partialUpdateChatSession(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ChatSessionDTO chatSessionDTO);

  /**
   * 
   * Similar to <code>partialUpdateChatSession</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param chatSessionDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/chat-sessions/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<ChatSessionDTO> partialUpdateChatSessionWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ChatSessionDTO chatSessionDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param chatSessionDTO  (required)
   * @return ChatSessionDTO
   */
  @RequestLine("PUT /api/chat-sessions/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ChatSessionDTO updateChatSession(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ChatSessionDTO chatSessionDTO);

  /**
   * 
   * Similar to <code>updateChatSession</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param chatSessionDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/chat-sessions/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<ChatSessionDTO> updateChatSessionWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ChatSessionDTO chatSessionDTO);


}
