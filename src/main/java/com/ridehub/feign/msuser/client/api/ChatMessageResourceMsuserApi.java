package com.ridehub.feign.msuser.client.api;

import com.ridehub.feign.msuser.client.invoker.ApiClient;
import com.ridehub.feign.msuser.client.invoker.EncodingUtils;
import com.ridehub.feign.msuser.client.model.ApiResponse;

import java.math.BigDecimal;
import com.ridehub.feign.msuser.client.model.ChatMessageDTO;
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
public interface ChatMessageResourceMsuserApi extends ApiClient.Api {


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
   * @param messageTextContains  (optional)
   * @param messageTextDoesNotContain  (optional)
   * @param messageTextEquals  (optional)
   * @param messageTextNotEquals  (optional)
   * @param messageTextSpecified  (optional)
   * @param messageTextIn  (optional)
   * @param messageTextNotIn  (optional)
   * @param messageTypeContains  (optional)
   * @param messageTypeDoesNotContain  (optional)
   * @param messageTypeEquals  (optional)
   * @param messageTypeNotEquals  (optional)
   * @param messageTypeSpecified  (optional)
   * @param messageTypeIn  (optional)
   * @param messageTypeNotIn  (optional)
   * @param timestampGreaterThan  (optional)
   * @param timestampLessThan  (optional)
   * @param timestampGreaterThanOrEqual  (optional)
   * @param timestampLessThanOrEqual  (optional)
   * @param timestampEquals  (optional)
   * @param timestampNotEquals  (optional)
   * @param timestampSpecified  (optional)
   * @param timestampIn  (optional)
   * @param timestampNotIn  (optional)
   * @param intentContains  (optional)
   * @param intentDoesNotContain  (optional)
   * @param intentEquals  (optional)
   * @param intentNotEquals  (optional)
   * @param intentSpecified  (optional)
   * @param intentIn  (optional)
   * @param intentNotIn  (optional)
   * @param entitiesContains  (optional)
   * @param entitiesDoesNotContain  (optional)
   * @param entitiesEquals  (optional)
   * @param entitiesNotEquals  (optional)
   * @param entitiesSpecified  (optional)
   * @param entitiesIn  (optional)
   * @param entitiesNotIn  (optional)
   * @param confidenceGreaterThan  (optional)
   * @param confidenceLessThan  (optional)
   * @param confidenceGreaterThanOrEqual  (optional)
   * @param confidenceLessThanOrEqual  (optional)
   * @param confidenceEquals  (optional)
   * @param confidenceNotEquals  (optional)
   * @param confidenceSpecified  (optional)
   * @param confidenceIn  (optional)
   * @param confidenceNotIn  (optional)
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
  @RequestLine("GET /api/chat-messages/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&messageText.contains={messageTextContains}&messageText.doesNotContain={messageTextDoesNotContain}&messageText.equals={messageTextEquals}&messageText.notEquals={messageTextNotEquals}&messageText.specified={messageTextSpecified}&messageText.in={messageTextIn}&messageText.notIn={messageTextNotIn}&messageType.contains={messageTypeContains}&messageType.doesNotContain={messageTypeDoesNotContain}&messageType.equals={messageTypeEquals}&messageType.notEquals={messageTypeNotEquals}&messageType.specified={messageTypeSpecified}&messageType.in={messageTypeIn}&messageType.notIn={messageTypeNotIn}&timestamp.greaterThan={timestampGreaterThan}&timestamp.lessThan={timestampLessThan}&timestamp.greaterThanOrEqual={timestampGreaterThanOrEqual}&timestamp.lessThanOrEqual={timestampLessThanOrEqual}&timestamp.equals={timestampEquals}&timestamp.notEquals={timestampNotEquals}&timestamp.specified={timestampSpecified}&timestamp.in={timestampIn}&timestamp.notIn={timestampNotIn}&intent.contains={intentContains}&intent.doesNotContain={intentDoesNotContain}&intent.equals={intentEquals}&intent.notEquals={intentNotEquals}&intent.specified={intentSpecified}&intent.in={intentIn}&intent.notIn={intentNotIn}&entities.contains={entitiesContains}&entities.doesNotContain={entitiesDoesNotContain}&entities.equals={entitiesEquals}&entities.notEquals={entitiesNotEquals}&entities.specified={entitiesSpecified}&entities.in={entitiesIn}&entities.notIn={entitiesNotIn}&confidence.greaterThan={confidenceGreaterThan}&confidence.lessThan={confidenceLessThan}&confidence.greaterThanOrEqual={confidenceGreaterThanOrEqual}&confidence.lessThanOrEqual={confidenceLessThanOrEqual}&confidence.equals={confidenceEquals}&confidence.notEquals={confidenceNotEquals}&confidence.specified={confidenceSpecified}&confidence.in={confidenceIn}&confidence.notIn={confidenceNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&chatSessionId.greaterThan={chatSessionIdGreaterThan}&chatSessionId.lessThan={chatSessionIdLessThan}&chatSessionId.greaterThanOrEqual={chatSessionIdGreaterThanOrEqual}&chatSessionId.lessThanOrEqual={chatSessionIdLessThanOrEqual}&chatSessionId.equals={chatSessionIdEquals}&chatSessionId.notEquals={chatSessionIdNotEquals}&chatSessionId.specified={chatSessionIdSpecified}&chatSessionId.in={chatSessionIdIn}&chatSessionId.notIn={chatSessionIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countChatMessages(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("messageTextContains") @jakarta.annotation.Nullable String messageTextContains, @Param("messageTextDoesNotContain") @jakarta.annotation.Nullable String messageTextDoesNotContain, @Param("messageTextEquals") @jakarta.annotation.Nullable String messageTextEquals, @Param("messageTextNotEquals") @jakarta.annotation.Nullable String messageTextNotEquals, @Param("messageTextSpecified") @jakarta.annotation.Nullable Boolean messageTextSpecified, @Param("messageTextIn") @jakarta.annotation.Nullable List<String> messageTextIn, @Param("messageTextNotIn") @jakarta.annotation.Nullable List<String> messageTextNotIn, @Param("messageTypeContains") @jakarta.annotation.Nullable String messageTypeContains, @Param("messageTypeDoesNotContain") @jakarta.annotation.Nullable String messageTypeDoesNotContain, @Param("messageTypeEquals") @jakarta.annotation.Nullable String messageTypeEquals, @Param("messageTypeNotEquals") @jakarta.annotation.Nullable String messageTypeNotEquals, @Param("messageTypeSpecified") @jakarta.annotation.Nullable Boolean messageTypeSpecified, @Param("messageTypeIn") @jakarta.annotation.Nullable List<String> messageTypeIn, @Param("messageTypeNotIn") @jakarta.annotation.Nullable List<String> messageTypeNotIn, @Param("timestampGreaterThan") @jakarta.annotation.Nullable OffsetDateTime timestampGreaterThan, @Param("timestampLessThan") @jakarta.annotation.Nullable OffsetDateTime timestampLessThan, @Param("timestampGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timestampGreaterThanOrEqual, @Param("timestampLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timestampLessThanOrEqual, @Param("timestampEquals") @jakarta.annotation.Nullable OffsetDateTime timestampEquals, @Param("timestampNotEquals") @jakarta.annotation.Nullable OffsetDateTime timestampNotEquals, @Param("timestampSpecified") @jakarta.annotation.Nullable Boolean timestampSpecified, @Param("timestampIn") @jakarta.annotation.Nullable List<OffsetDateTime> timestampIn, @Param("timestampNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> timestampNotIn, @Param("intentContains") @jakarta.annotation.Nullable String intentContains, @Param("intentDoesNotContain") @jakarta.annotation.Nullable String intentDoesNotContain, @Param("intentEquals") @jakarta.annotation.Nullable String intentEquals, @Param("intentNotEquals") @jakarta.annotation.Nullable String intentNotEquals, @Param("intentSpecified") @jakarta.annotation.Nullable Boolean intentSpecified, @Param("intentIn") @jakarta.annotation.Nullable List<String> intentIn, @Param("intentNotIn") @jakarta.annotation.Nullable List<String> intentNotIn, @Param("entitiesContains") @jakarta.annotation.Nullable String entitiesContains, @Param("entitiesDoesNotContain") @jakarta.annotation.Nullable String entitiesDoesNotContain, @Param("entitiesEquals") @jakarta.annotation.Nullable String entitiesEquals, @Param("entitiesNotEquals") @jakarta.annotation.Nullable String entitiesNotEquals, @Param("entitiesSpecified") @jakarta.annotation.Nullable Boolean entitiesSpecified, @Param("entitiesIn") @jakarta.annotation.Nullable List<String> entitiesIn, @Param("entitiesNotIn") @jakarta.annotation.Nullable List<String> entitiesNotIn, @Param("confidenceGreaterThan") @jakarta.annotation.Nullable BigDecimal confidenceGreaterThan, @Param("confidenceLessThan") @jakarta.annotation.Nullable BigDecimal confidenceLessThan, @Param("confidenceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal confidenceGreaterThanOrEqual, @Param("confidenceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal confidenceLessThanOrEqual, @Param("confidenceEquals") @jakarta.annotation.Nullable BigDecimal confidenceEquals, @Param("confidenceNotEquals") @jakarta.annotation.Nullable BigDecimal confidenceNotEquals, @Param("confidenceSpecified") @jakarta.annotation.Nullable Boolean confidenceSpecified, @Param("confidenceIn") @jakarta.annotation.Nullable List<BigDecimal> confidenceIn, @Param("confidenceNotIn") @jakarta.annotation.Nullable List<BigDecimal> confidenceNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("chatSessionIdGreaterThan") @jakarta.annotation.Nullable Long chatSessionIdGreaterThan, @Param("chatSessionIdLessThan") @jakarta.annotation.Nullable Long chatSessionIdLessThan, @Param("chatSessionIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long chatSessionIdGreaterThanOrEqual, @Param("chatSessionIdLessThanOrEqual") @jakarta.annotation.Nullable Long chatSessionIdLessThanOrEqual, @Param("chatSessionIdEquals") @jakarta.annotation.Nullable Long chatSessionIdEquals, @Param("chatSessionIdNotEquals") @jakarta.annotation.Nullable Long chatSessionIdNotEquals, @Param("chatSessionIdSpecified") @jakarta.annotation.Nullable Boolean chatSessionIdSpecified, @Param("chatSessionIdIn") @jakarta.annotation.Nullable List<Long> chatSessionIdIn, @Param("chatSessionIdNotIn") @jakarta.annotation.Nullable List<Long> chatSessionIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countChatMessages</code> but it also returns the http response headers .
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
   * @param messageTextContains  (optional)
   * @param messageTextDoesNotContain  (optional)
   * @param messageTextEquals  (optional)
   * @param messageTextNotEquals  (optional)
   * @param messageTextSpecified  (optional)
   * @param messageTextIn  (optional)
   * @param messageTextNotIn  (optional)
   * @param messageTypeContains  (optional)
   * @param messageTypeDoesNotContain  (optional)
   * @param messageTypeEquals  (optional)
   * @param messageTypeNotEquals  (optional)
   * @param messageTypeSpecified  (optional)
   * @param messageTypeIn  (optional)
   * @param messageTypeNotIn  (optional)
   * @param timestampGreaterThan  (optional)
   * @param timestampLessThan  (optional)
   * @param timestampGreaterThanOrEqual  (optional)
   * @param timestampLessThanOrEqual  (optional)
   * @param timestampEquals  (optional)
   * @param timestampNotEquals  (optional)
   * @param timestampSpecified  (optional)
   * @param timestampIn  (optional)
   * @param timestampNotIn  (optional)
   * @param intentContains  (optional)
   * @param intentDoesNotContain  (optional)
   * @param intentEquals  (optional)
   * @param intentNotEquals  (optional)
   * @param intentSpecified  (optional)
   * @param intentIn  (optional)
   * @param intentNotIn  (optional)
   * @param entitiesContains  (optional)
   * @param entitiesDoesNotContain  (optional)
   * @param entitiesEquals  (optional)
   * @param entitiesNotEquals  (optional)
   * @param entitiesSpecified  (optional)
   * @param entitiesIn  (optional)
   * @param entitiesNotIn  (optional)
   * @param confidenceGreaterThan  (optional)
   * @param confidenceLessThan  (optional)
   * @param confidenceGreaterThanOrEqual  (optional)
   * @param confidenceLessThanOrEqual  (optional)
   * @param confidenceEquals  (optional)
   * @param confidenceNotEquals  (optional)
   * @param confidenceSpecified  (optional)
   * @param confidenceIn  (optional)
   * @param confidenceNotIn  (optional)
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
  @RequestLine("GET /api/chat-messages/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&messageText.contains={messageTextContains}&messageText.doesNotContain={messageTextDoesNotContain}&messageText.equals={messageTextEquals}&messageText.notEquals={messageTextNotEquals}&messageText.specified={messageTextSpecified}&messageText.in={messageTextIn}&messageText.notIn={messageTextNotIn}&messageType.contains={messageTypeContains}&messageType.doesNotContain={messageTypeDoesNotContain}&messageType.equals={messageTypeEquals}&messageType.notEquals={messageTypeNotEquals}&messageType.specified={messageTypeSpecified}&messageType.in={messageTypeIn}&messageType.notIn={messageTypeNotIn}&timestamp.greaterThan={timestampGreaterThan}&timestamp.lessThan={timestampLessThan}&timestamp.greaterThanOrEqual={timestampGreaterThanOrEqual}&timestamp.lessThanOrEqual={timestampLessThanOrEqual}&timestamp.equals={timestampEquals}&timestamp.notEquals={timestampNotEquals}&timestamp.specified={timestampSpecified}&timestamp.in={timestampIn}&timestamp.notIn={timestampNotIn}&intent.contains={intentContains}&intent.doesNotContain={intentDoesNotContain}&intent.equals={intentEquals}&intent.notEquals={intentNotEquals}&intent.specified={intentSpecified}&intent.in={intentIn}&intent.notIn={intentNotIn}&entities.contains={entitiesContains}&entities.doesNotContain={entitiesDoesNotContain}&entities.equals={entitiesEquals}&entities.notEquals={entitiesNotEquals}&entities.specified={entitiesSpecified}&entities.in={entitiesIn}&entities.notIn={entitiesNotIn}&confidence.greaterThan={confidenceGreaterThan}&confidence.lessThan={confidenceLessThan}&confidence.greaterThanOrEqual={confidenceGreaterThanOrEqual}&confidence.lessThanOrEqual={confidenceLessThanOrEqual}&confidence.equals={confidenceEquals}&confidence.notEquals={confidenceNotEquals}&confidence.specified={confidenceSpecified}&confidence.in={confidenceIn}&confidence.notIn={confidenceNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&chatSessionId.greaterThan={chatSessionIdGreaterThan}&chatSessionId.lessThan={chatSessionIdLessThan}&chatSessionId.greaterThanOrEqual={chatSessionIdGreaterThanOrEqual}&chatSessionId.lessThanOrEqual={chatSessionIdLessThanOrEqual}&chatSessionId.equals={chatSessionIdEquals}&chatSessionId.notEquals={chatSessionIdNotEquals}&chatSessionId.specified={chatSessionIdSpecified}&chatSessionId.in={chatSessionIdIn}&chatSessionId.notIn={chatSessionIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countChatMessagesWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("messageTextContains") @jakarta.annotation.Nullable String messageTextContains, @Param("messageTextDoesNotContain") @jakarta.annotation.Nullable String messageTextDoesNotContain, @Param("messageTextEquals") @jakarta.annotation.Nullable String messageTextEquals, @Param("messageTextNotEquals") @jakarta.annotation.Nullable String messageTextNotEquals, @Param("messageTextSpecified") @jakarta.annotation.Nullable Boolean messageTextSpecified, @Param("messageTextIn") @jakarta.annotation.Nullable List<String> messageTextIn, @Param("messageTextNotIn") @jakarta.annotation.Nullable List<String> messageTextNotIn, @Param("messageTypeContains") @jakarta.annotation.Nullable String messageTypeContains, @Param("messageTypeDoesNotContain") @jakarta.annotation.Nullable String messageTypeDoesNotContain, @Param("messageTypeEquals") @jakarta.annotation.Nullable String messageTypeEquals, @Param("messageTypeNotEquals") @jakarta.annotation.Nullable String messageTypeNotEquals, @Param("messageTypeSpecified") @jakarta.annotation.Nullable Boolean messageTypeSpecified, @Param("messageTypeIn") @jakarta.annotation.Nullable List<String> messageTypeIn, @Param("messageTypeNotIn") @jakarta.annotation.Nullable List<String> messageTypeNotIn, @Param("timestampGreaterThan") @jakarta.annotation.Nullable OffsetDateTime timestampGreaterThan, @Param("timestampLessThan") @jakarta.annotation.Nullable OffsetDateTime timestampLessThan, @Param("timestampGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timestampGreaterThanOrEqual, @Param("timestampLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timestampLessThanOrEqual, @Param("timestampEquals") @jakarta.annotation.Nullable OffsetDateTime timestampEquals, @Param("timestampNotEquals") @jakarta.annotation.Nullable OffsetDateTime timestampNotEquals, @Param("timestampSpecified") @jakarta.annotation.Nullable Boolean timestampSpecified, @Param("timestampIn") @jakarta.annotation.Nullable List<OffsetDateTime> timestampIn, @Param("timestampNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> timestampNotIn, @Param("intentContains") @jakarta.annotation.Nullable String intentContains, @Param("intentDoesNotContain") @jakarta.annotation.Nullable String intentDoesNotContain, @Param("intentEquals") @jakarta.annotation.Nullable String intentEquals, @Param("intentNotEquals") @jakarta.annotation.Nullable String intentNotEquals, @Param("intentSpecified") @jakarta.annotation.Nullable Boolean intentSpecified, @Param("intentIn") @jakarta.annotation.Nullable List<String> intentIn, @Param("intentNotIn") @jakarta.annotation.Nullable List<String> intentNotIn, @Param("entitiesContains") @jakarta.annotation.Nullable String entitiesContains, @Param("entitiesDoesNotContain") @jakarta.annotation.Nullable String entitiesDoesNotContain, @Param("entitiesEquals") @jakarta.annotation.Nullable String entitiesEquals, @Param("entitiesNotEquals") @jakarta.annotation.Nullable String entitiesNotEquals, @Param("entitiesSpecified") @jakarta.annotation.Nullable Boolean entitiesSpecified, @Param("entitiesIn") @jakarta.annotation.Nullable List<String> entitiesIn, @Param("entitiesNotIn") @jakarta.annotation.Nullable List<String> entitiesNotIn, @Param("confidenceGreaterThan") @jakarta.annotation.Nullable BigDecimal confidenceGreaterThan, @Param("confidenceLessThan") @jakarta.annotation.Nullable BigDecimal confidenceLessThan, @Param("confidenceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal confidenceGreaterThanOrEqual, @Param("confidenceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal confidenceLessThanOrEqual, @Param("confidenceEquals") @jakarta.annotation.Nullable BigDecimal confidenceEquals, @Param("confidenceNotEquals") @jakarta.annotation.Nullable BigDecimal confidenceNotEquals, @Param("confidenceSpecified") @jakarta.annotation.Nullable Boolean confidenceSpecified, @Param("confidenceIn") @jakarta.annotation.Nullable List<BigDecimal> confidenceIn, @Param("confidenceNotIn") @jakarta.annotation.Nullable List<BigDecimal> confidenceNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("chatSessionIdGreaterThan") @jakarta.annotation.Nullable Long chatSessionIdGreaterThan, @Param("chatSessionIdLessThan") @jakarta.annotation.Nullable Long chatSessionIdLessThan, @Param("chatSessionIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long chatSessionIdGreaterThanOrEqual, @Param("chatSessionIdLessThanOrEqual") @jakarta.annotation.Nullable Long chatSessionIdLessThanOrEqual, @Param("chatSessionIdEquals") @jakarta.annotation.Nullable Long chatSessionIdEquals, @Param("chatSessionIdNotEquals") @jakarta.annotation.Nullable Long chatSessionIdNotEquals, @Param("chatSessionIdSpecified") @jakarta.annotation.Nullable Boolean chatSessionIdSpecified, @Param("chatSessionIdIn") @jakarta.annotation.Nullable List<Long> chatSessionIdIn, @Param("chatSessionIdNotIn") @jakarta.annotation.Nullable List<Long> chatSessionIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countChatMessages</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountChatMessagesQueryParams} class that allows for
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
   *   <li>messageTextContains -  (optional)</li>
   *   <li>messageTextDoesNotContain -  (optional)</li>
   *   <li>messageTextEquals -  (optional)</li>
   *   <li>messageTextNotEquals -  (optional)</li>
   *   <li>messageTextSpecified -  (optional)</li>
   *   <li>messageTextIn -  (optional)</li>
   *   <li>messageTextNotIn -  (optional)</li>
   *   <li>messageTypeContains -  (optional)</li>
   *   <li>messageTypeDoesNotContain -  (optional)</li>
   *   <li>messageTypeEquals -  (optional)</li>
   *   <li>messageTypeNotEquals -  (optional)</li>
   *   <li>messageTypeSpecified -  (optional)</li>
   *   <li>messageTypeIn -  (optional)</li>
   *   <li>messageTypeNotIn -  (optional)</li>
   *   <li>timestampGreaterThan -  (optional)</li>
   *   <li>timestampLessThan -  (optional)</li>
   *   <li>timestampGreaterThanOrEqual -  (optional)</li>
   *   <li>timestampLessThanOrEqual -  (optional)</li>
   *   <li>timestampEquals -  (optional)</li>
   *   <li>timestampNotEquals -  (optional)</li>
   *   <li>timestampSpecified -  (optional)</li>
   *   <li>timestampIn -  (optional)</li>
   *   <li>timestampNotIn -  (optional)</li>
   *   <li>intentContains -  (optional)</li>
   *   <li>intentDoesNotContain -  (optional)</li>
   *   <li>intentEquals -  (optional)</li>
   *   <li>intentNotEquals -  (optional)</li>
   *   <li>intentSpecified -  (optional)</li>
   *   <li>intentIn -  (optional)</li>
   *   <li>intentNotIn -  (optional)</li>
   *   <li>entitiesContains -  (optional)</li>
   *   <li>entitiesDoesNotContain -  (optional)</li>
   *   <li>entitiesEquals -  (optional)</li>
   *   <li>entitiesNotEquals -  (optional)</li>
   *   <li>entitiesSpecified -  (optional)</li>
   *   <li>entitiesIn -  (optional)</li>
   *   <li>entitiesNotIn -  (optional)</li>
   *   <li>confidenceGreaterThan -  (optional)</li>
   *   <li>confidenceLessThan -  (optional)</li>
   *   <li>confidenceGreaterThanOrEqual -  (optional)</li>
   *   <li>confidenceLessThanOrEqual -  (optional)</li>
   *   <li>confidenceEquals -  (optional)</li>
   *   <li>confidenceNotEquals -  (optional)</li>
   *   <li>confidenceSpecified -  (optional)</li>
   *   <li>confidenceIn -  (optional)</li>
   *   <li>confidenceNotIn -  (optional)</li>
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
  @RequestLine("GET /api/chat-messages/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&messageText.contains={messageTextContains}&messageText.doesNotContain={messageTextDoesNotContain}&messageText.equals={messageTextEquals}&messageText.notEquals={messageTextNotEquals}&messageText.specified={messageTextSpecified}&messageText.in={messageTextIn}&messageText.notIn={messageTextNotIn}&messageType.contains={messageTypeContains}&messageType.doesNotContain={messageTypeDoesNotContain}&messageType.equals={messageTypeEquals}&messageType.notEquals={messageTypeNotEquals}&messageType.specified={messageTypeSpecified}&messageType.in={messageTypeIn}&messageType.notIn={messageTypeNotIn}&timestamp.greaterThan={timestampGreaterThan}&timestamp.lessThan={timestampLessThan}&timestamp.greaterThanOrEqual={timestampGreaterThanOrEqual}&timestamp.lessThanOrEqual={timestampLessThanOrEqual}&timestamp.equals={timestampEquals}&timestamp.notEquals={timestampNotEquals}&timestamp.specified={timestampSpecified}&timestamp.in={timestampIn}&timestamp.notIn={timestampNotIn}&intent.contains={intentContains}&intent.doesNotContain={intentDoesNotContain}&intent.equals={intentEquals}&intent.notEquals={intentNotEquals}&intent.specified={intentSpecified}&intent.in={intentIn}&intent.notIn={intentNotIn}&entities.contains={entitiesContains}&entities.doesNotContain={entitiesDoesNotContain}&entities.equals={entitiesEquals}&entities.notEquals={entitiesNotEquals}&entities.specified={entitiesSpecified}&entities.in={entitiesIn}&entities.notIn={entitiesNotIn}&confidence.greaterThan={confidenceGreaterThan}&confidence.lessThan={confidenceLessThan}&confidence.greaterThanOrEqual={confidenceGreaterThanOrEqual}&confidence.lessThanOrEqual={confidenceLessThanOrEqual}&confidence.equals={confidenceEquals}&confidence.notEquals={confidenceNotEquals}&confidence.specified={confidenceSpecified}&confidence.in={confidenceIn}&confidence.notIn={confidenceNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&chatSessionId.greaterThan={chatSessionIdGreaterThan}&chatSessionId.lessThan={chatSessionIdLessThan}&chatSessionId.greaterThanOrEqual={chatSessionIdGreaterThanOrEqual}&chatSessionId.lessThanOrEqual={chatSessionIdLessThanOrEqual}&chatSessionId.equals={chatSessionIdEquals}&chatSessionId.notEquals={chatSessionIdNotEquals}&chatSessionId.specified={chatSessionIdSpecified}&chatSessionId.in={chatSessionIdIn}&chatSessionId.notIn={chatSessionIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countChatMessages(@QueryMap(encoded=true) CountChatMessagesQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countChatMessages</code> that receives the query parameters as a map,
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
          *   <li>messageTextContains -  (optional)</li>
          *   <li>messageTextDoesNotContain -  (optional)</li>
          *   <li>messageTextEquals -  (optional)</li>
          *   <li>messageTextNotEquals -  (optional)</li>
          *   <li>messageTextSpecified -  (optional)</li>
          *   <li>messageTextIn -  (optional)</li>
          *   <li>messageTextNotIn -  (optional)</li>
          *   <li>messageTypeContains -  (optional)</li>
          *   <li>messageTypeDoesNotContain -  (optional)</li>
          *   <li>messageTypeEquals -  (optional)</li>
          *   <li>messageTypeNotEquals -  (optional)</li>
          *   <li>messageTypeSpecified -  (optional)</li>
          *   <li>messageTypeIn -  (optional)</li>
          *   <li>messageTypeNotIn -  (optional)</li>
          *   <li>timestampGreaterThan -  (optional)</li>
          *   <li>timestampLessThan -  (optional)</li>
          *   <li>timestampGreaterThanOrEqual -  (optional)</li>
          *   <li>timestampLessThanOrEqual -  (optional)</li>
          *   <li>timestampEquals -  (optional)</li>
          *   <li>timestampNotEquals -  (optional)</li>
          *   <li>timestampSpecified -  (optional)</li>
          *   <li>timestampIn -  (optional)</li>
          *   <li>timestampNotIn -  (optional)</li>
          *   <li>intentContains -  (optional)</li>
          *   <li>intentDoesNotContain -  (optional)</li>
          *   <li>intentEquals -  (optional)</li>
          *   <li>intentNotEquals -  (optional)</li>
          *   <li>intentSpecified -  (optional)</li>
          *   <li>intentIn -  (optional)</li>
          *   <li>intentNotIn -  (optional)</li>
          *   <li>entitiesContains -  (optional)</li>
          *   <li>entitiesDoesNotContain -  (optional)</li>
          *   <li>entitiesEquals -  (optional)</li>
          *   <li>entitiesNotEquals -  (optional)</li>
          *   <li>entitiesSpecified -  (optional)</li>
          *   <li>entitiesIn -  (optional)</li>
          *   <li>entitiesNotIn -  (optional)</li>
          *   <li>confidenceGreaterThan -  (optional)</li>
          *   <li>confidenceLessThan -  (optional)</li>
          *   <li>confidenceGreaterThanOrEqual -  (optional)</li>
          *   <li>confidenceLessThanOrEqual -  (optional)</li>
          *   <li>confidenceEquals -  (optional)</li>
          *   <li>confidenceNotEquals -  (optional)</li>
          *   <li>confidenceSpecified -  (optional)</li>
          *   <li>confidenceIn -  (optional)</li>
          *   <li>confidenceNotIn -  (optional)</li>
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
      @RequestLine("GET /api/chat-messages/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&messageText.contains={messageTextContains}&messageText.doesNotContain={messageTextDoesNotContain}&messageText.equals={messageTextEquals}&messageText.notEquals={messageTextNotEquals}&messageText.specified={messageTextSpecified}&messageText.in={messageTextIn}&messageText.notIn={messageTextNotIn}&messageType.contains={messageTypeContains}&messageType.doesNotContain={messageTypeDoesNotContain}&messageType.equals={messageTypeEquals}&messageType.notEquals={messageTypeNotEquals}&messageType.specified={messageTypeSpecified}&messageType.in={messageTypeIn}&messageType.notIn={messageTypeNotIn}&timestamp.greaterThan={timestampGreaterThan}&timestamp.lessThan={timestampLessThan}&timestamp.greaterThanOrEqual={timestampGreaterThanOrEqual}&timestamp.lessThanOrEqual={timestampLessThanOrEqual}&timestamp.equals={timestampEquals}&timestamp.notEquals={timestampNotEquals}&timestamp.specified={timestampSpecified}&timestamp.in={timestampIn}&timestamp.notIn={timestampNotIn}&intent.contains={intentContains}&intent.doesNotContain={intentDoesNotContain}&intent.equals={intentEquals}&intent.notEquals={intentNotEquals}&intent.specified={intentSpecified}&intent.in={intentIn}&intent.notIn={intentNotIn}&entities.contains={entitiesContains}&entities.doesNotContain={entitiesDoesNotContain}&entities.equals={entitiesEquals}&entities.notEquals={entitiesNotEquals}&entities.specified={entitiesSpecified}&entities.in={entitiesIn}&entities.notIn={entitiesNotIn}&confidence.greaterThan={confidenceGreaterThan}&confidence.lessThan={confidenceLessThan}&confidence.greaterThanOrEqual={confidenceGreaterThanOrEqual}&confidence.lessThanOrEqual={confidenceLessThanOrEqual}&confidence.equals={confidenceEquals}&confidence.notEquals={confidenceNotEquals}&confidence.specified={confidenceSpecified}&confidence.in={confidenceIn}&confidence.notIn={confidenceNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&chatSessionId.greaterThan={chatSessionIdGreaterThan}&chatSessionId.lessThan={chatSessionIdLessThan}&chatSessionId.greaterThanOrEqual={chatSessionIdGreaterThanOrEqual}&chatSessionId.lessThanOrEqual={chatSessionIdLessThanOrEqual}&chatSessionId.equals={chatSessionIdEquals}&chatSessionId.notEquals={chatSessionIdNotEquals}&chatSessionId.specified={chatSessionIdSpecified}&chatSessionId.in={chatSessionIdIn}&chatSessionId.notIn={chatSessionIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countChatMessagesWithHttpInfo(@QueryMap(encoded=true) CountChatMessagesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countChatMessages</code> method in a fluent style.
   */
  public static class CountChatMessagesQueryParams extends HashMap<String, Object> {
    public CountChatMessagesQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams messageTextContains(@jakarta.annotation.Nullable final String value) {
      put("messageText.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams messageTextDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("messageText.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams messageTextEquals(@jakarta.annotation.Nullable final String value) {
      put("messageText.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams messageTextNotEquals(@jakarta.annotation.Nullable final String value) {
      put("messageText.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams messageTextSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("messageText.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams messageTextIn(@jakarta.annotation.Nullable final List<String> value) {
      put("messageText.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams messageTextNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("messageText.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams messageTypeContains(@jakarta.annotation.Nullable final String value) {
      put("messageType.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams messageTypeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("messageType.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams messageTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("messageType.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams messageTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("messageType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams messageTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("messageType.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams messageTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("messageType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams messageTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("messageType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams timestampGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timestamp.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams timestampLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timestamp.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams timestampGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timestamp.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams timestampLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timestamp.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams timestampEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timestamp.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams timestampNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timestamp.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams timestampSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("timestamp.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams timestampIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("timestamp.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams timestampNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("timestamp.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams intentContains(@jakarta.annotation.Nullable final String value) {
      put("intent.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams intentDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("intent.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams intentEquals(@jakarta.annotation.Nullable final String value) {
      put("intent.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams intentNotEquals(@jakarta.annotation.Nullable final String value) {
      put("intent.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams intentSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("intent.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams intentIn(@jakarta.annotation.Nullable final List<String> value) {
      put("intent.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams intentNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("intent.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams entitiesContains(@jakarta.annotation.Nullable final String value) {
      put("entities.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams entitiesDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("entities.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams entitiesEquals(@jakarta.annotation.Nullable final String value) {
      put("entities.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams entitiesNotEquals(@jakarta.annotation.Nullable final String value) {
      put("entities.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams entitiesSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("entities.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams entitiesIn(@jakarta.annotation.Nullable final List<String> value) {
      put("entities.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams entitiesNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("entities.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams confidenceGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidence.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams confidenceLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidence.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams confidenceGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidence.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams confidenceLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidence.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams confidenceEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidence.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams confidenceNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidence.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams confidenceSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("confidence.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams confidenceIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("confidence.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams confidenceNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("confidence.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams chatSessionIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams chatSessionIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams chatSessionIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams chatSessionIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams chatSessionIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams chatSessionIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams chatSessionIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("chatSessionId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountChatMessagesQueryParams chatSessionIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("chatSessionId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams chatSessionIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("chatSessionId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountChatMessagesQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param chatMessageDTO  (required)
   * @return ChatMessageDTO
   */
  @RequestLine("POST /api/chat-messages")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ChatMessageDTO createChatMessage(@jakarta.annotation.Nonnull ChatMessageDTO chatMessageDTO);

  /**
   * 
   * Similar to <code>createChatMessage</code> but it also returns the http response headers .
   * 
   * @param chatMessageDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/chat-messages")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<ChatMessageDTO> createChatMessageWithHttpInfo(@jakarta.annotation.Nonnull ChatMessageDTO chatMessageDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/chat-messages/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteChatMessage(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deleteChatMessage</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/chat-messages/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteChatMessageWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



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
   * @param messageTextContains  (optional)
   * @param messageTextDoesNotContain  (optional)
   * @param messageTextEquals  (optional)
   * @param messageTextNotEquals  (optional)
   * @param messageTextSpecified  (optional)
   * @param messageTextIn  (optional)
   * @param messageTextNotIn  (optional)
   * @param messageTypeContains  (optional)
   * @param messageTypeDoesNotContain  (optional)
   * @param messageTypeEquals  (optional)
   * @param messageTypeNotEquals  (optional)
   * @param messageTypeSpecified  (optional)
   * @param messageTypeIn  (optional)
   * @param messageTypeNotIn  (optional)
   * @param timestampGreaterThan  (optional)
   * @param timestampLessThan  (optional)
   * @param timestampGreaterThanOrEqual  (optional)
   * @param timestampLessThanOrEqual  (optional)
   * @param timestampEquals  (optional)
   * @param timestampNotEquals  (optional)
   * @param timestampSpecified  (optional)
   * @param timestampIn  (optional)
   * @param timestampNotIn  (optional)
   * @param intentContains  (optional)
   * @param intentDoesNotContain  (optional)
   * @param intentEquals  (optional)
   * @param intentNotEquals  (optional)
   * @param intentSpecified  (optional)
   * @param intentIn  (optional)
   * @param intentNotIn  (optional)
   * @param entitiesContains  (optional)
   * @param entitiesDoesNotContain  (optional)
   * @param entitiesEquals  (optional)
   * @param entitiesNotEquals  (optional)
   * @param entitiesSpecified  (optional)
   * @param entitiesIn  (optional)
   * @param entitiesNotIn  (optional)
   * @param confidenceGreaterThan  (optional)
   * @param confidenceLessThan  (optional)
   * @param confidenceGreaterThanOrEqual  (optional)
   * @param confidenceLessThanOrEqual  (optional)
   * @param confidenceEquals  (optional)
   * @param confidenceNotEquals  (optional)
   * @param confidenceSpecified  (optional)
   * @param confidenceIn  (optional)
   * @param confidenceNotIn  (optional)
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
   * @return List&lt;ChatMessageDTO&gt;
   */
  @RequestLine("GET /api/chat-messages?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&messageText.contains={messageTextContains}&messageText.doesNotContain={messageTextDoesNotContain}&messageText.equals={messageTextEquals}&messageText.notEquals={messageTextNotEquals}&messageText.specified={messageTextSpecified}&messageText.in={messageTextIn}&messageText.notIn={messageTextNotIn}&messageType.contains={messageTypeContains}&messageType.doesNotContain={messageTypeDoesNotContain}&messageType.equals={messageTypeEquals}&messageType.notEquals={messageTypeNotEquals}&messageType.specified={messageTypeSpecified}&messageType.in={messageTypeIn}&messageType.notIn={messageTypeNotIn}&timestamp.greaterThan={timestampGreaterThan}&timestamp.lessThan={timestampLessThan}&timestamp.greaterThanOrEqual={timestampGreaterThanOrEqual}&timestamp.lessThanOrEqual={timestampLessThanOrEqual}&timestamp.equals={timestampEquals}&timestamp.notEquals={timestampNotEquals}&timestamp.specified={timestampSpecified}&timestamp.in={timestampIn}&timestamp.notIn={timestampNotIn}&intent.contains={intentContains}&intent.doesNotContain={intentDoesNotContain}&intent.equals={intentEquals}&intent.notEquals={intentNotEquals}&intent.specified={intentSpecified}&intent.in={intentIn}&intent.notIn={intentNotIn}&entities.contains={entitiesContains}&entities.doesNotContain={entitiesDoesNotContain}&entities.equals={entitiesEquals}&entities.notEquals={entitiesNotEquals}&entities.specified={entitiesSpecified}&entities.in={entitiesIn}&entities.notIn={entitiesNotIn}&confidence.greaterThan={confidenceGreaterThan}&confidence.lessThan={confidenceLessThan}&confidence.greaterThanOrEqual={confidenceGreaterThanOrEqual}&confidence.lessThanOrEqual={confidenceLessThanOrEqual}&confidence.equals={confidenceEquals}&confidence.notEquals={confidenceNotEquals}&confidence.specified={confidenceSpecified}&confidence.in={confidenceIn}&confidence.notIn={confidenceNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&chatSessionId.greaterThan={chatSessionIdGreaterThan}&chatSessionId.lessThan={chatSessionIdLessThan}&chatSessionId.greaterThanOrEqual={chatSessionIdGreaterThanOrEqual}&chatSessionId.lessThanOrEqual={chatSessionIdLessThanOrEqual}&chatSessionId.equals={chatSessionIdEquals}&chatSessionId.notEquals={chatSessionIdNotEquals}&chatSessionId.specified={chatSessionIdSpecified}&chatSessionId.in={chatSessionIdIn}&chatSessionId.notIn={chatSessionIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  List<ChatMessageDTO> getAllChatMessages(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("messageTextContains") @jakarta.annotation.Nullable String messageTextContains, @Param("messageTextDoesNotContain") @jakarta.annotation.Nullable String messageTextDoesNotContain, @Param("messageTextEquals") @jakarta.annotation.Nullable String messageTextEquals, @Param("messageTextNotEquals") @jakarta.annotation.Nullable String messageTextNotEquals, @Param("messageTextSpecified") @jakarta.annotation.Nullable Boolean messageTextSpecified, @Param("messageTextIn") @jakarta.annotation.Nullable List<String> messageTextIn, @Param("messageTextNotIn") @jakarta.annotation.Nullable List<String> messageTextNotIn, @Param("messageTypeContains") @jakarta.annotation.Nullable String messageTypeContains, @Param("messageTypeDoesNotContain") @jakarta.annotation.Nullable String messageTypeDoesNotContain, @Param("messageTypeEquals") @jakarta.annotation.Nullable String messageTypeEquals, @Param("messageTypeNotEquals") @jakarta.annotation.Nullable String messageTypeNotEquals, @Param("messageTypeSpecified") @jakarta.annotation.Nullable Boolean messageTypeSpecified, @Param("messageTypeIn") @jakarta.annotation.Nullable List<String> messageTypeIn, @Param("messageTypeNotIn") @jakarta.annotation.Nullable List<String> messageTypeNotIn, @Param("timestampGreaterThan") @jakarta.annotation.Nullable OffsetDateTime timestampGreaterThan, @Param("timestampLessThan") @jakarta.annotation.Nullable OffsetDateTime timestampLessThan, @Param("timestampGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timestampGreaterThanOrEqual, @Param("timestampLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timestampLessThanOrEqual, @Param("timestampEquals") @jakarta.annotation.Nullable OffsetDateTime timestampEquals, @Param("timestampNotEquals") @jakarta.annotation.Nullable OffsetDateTime timestampNotEquals, @Param("timestampSpecified") @jakarta.annotation.Nullable Boolean timestampSpecified, @Param("timestampIn") @jakarta.annotation.Nullable List<OffsetDateTime> timestampIn, @Param("timestampNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> timestampNotIn, @Param("intentContains") @jakarta.annotation.Nullable String intentContains, @Param("intentDoesNotContain") @jakarta.annotation.Nullable String intentDoesNotContain, @Param("intentEquals") @jakarta.annotation.Nullable String intentEquals, @Param("intentNotEquals") @jakarta.annotation.Nullable String intentNotEquals, @Param("intentSpecified") @jakarta.annotation.Nullable Boolean intentSpecified, @Param("intentIn") @jakarta.annotation.Nullable List<String> intentIn, @Param("intentNotIn") @jakarta.annotation.Nullable List<String> intentNotIn, @Param("entitiesContains") @jakarta.annotation.Nullable String entitiesContains, @Param("entitiesDoesNotContain") @jakarta.annotation.Nullable String entitiesDoesNotContain, @Param("entitiesEquals") @jakarta.annotation.Nullable String entitiesEquals, @Param("entitiesNotEquals") @jakarta.annotation.Nullable String entitiesNotEquals, @Param("entitiesSpecified") @jakarta.annotation.Nullable Boolean entitiesSpecified, @Param("entitiesIn") @jakarta.annotation.Nullable List<String> entitiesIn, @Param("entitiesNotIn") @jakarta.annotation.Nullable List<String> entitiesNotIn, @Param("confidenceGreaterThan") @jakarta.annotation.Nullable BigDecimal confidenceGreaterThan, @Param("confidenceLessThan") @jakarta.annotation.Nullable BigDecimal confidenceLessThan, @Param("confidenceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal confidenceGreaterThanOrEqual, @Param("confidenceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal confidenceLessThanOrEqual, @Param("confidenceEquals") @jakarta.annotation.Nullable BigDecimal confidenceEquals, @Param("confidenceNotEquals") @jakarta.annotation.Nullable BigDecimal confidenceNotEquals, @Param("confidenceSpecified") @jakarta.annotation.Nullable Boolean confidenceSpecified, @Param("confidenceIn") @jakarta.annotation.Nullable List<BigDecimal> confidenceIn, @Param("confidenceNotIn") @jakarta.annotation.Nullable List<BigDecimal> confidenceNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("chatSessionIdGreaterThan") @jakarta.annotation.Nullable Long chatSessionIdGreaterThan, @Param("chatSessionIdLessThan") @jakarta.annotation.Nullable Long chatSessionIdLessThan, @Param("chatSessionIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long chatSessionIdGreaterThanOrEqual, @Param("chatSessionIdLessThanOrEqual") @jakarta.annotation.Nullable Long chatSessionIdLessThanOrEqual, @Param("chatSessionIdEquals") @jakarta.annotation.Nullable Long chatSessionIdEquals, @Param("chatSessionIdNotEquals") @jakarta.annotation.Nullable Long chatSessionIdNotEquals, @Param("chatSessionIdSpecified") @jakarta.annotation.Nullable Boolean chatSessionIdSpecified, @Param("chatSessionIdIn") @jakarta.annotation.Nullable List<Long> chatSessionIdIn, @Param("chatSessionIdNotIn") @jakarta.annotation.Nullable List<Long> chatSessionIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>getAllChatMessages</code> but it also returns the http response headers .
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
   * @param messageTextContains  (optional)
   * @param messageTextDoesNotContain  (optional)
   * @param messageTextEquals  (optional)
   * @param messageTextNotEquals  (optional)
   * @param messageTextSpecified  (optional)
   * @param messageTextIn  (optional)
   * @param messageTextNotIn  (optional)
   * @param messageTypeContains  (optional)
   * @param messageTypeDoesNotContain  (optional)
   * @param messageTypeEquals  (optional)
   * @param messageTypeNotEquals  (optional)
   * @param messageTypeSpecified  (optional)
   * @param messageTypeIn  (optional)
   * @param messageTypeNotIn  (optional)
   * @param timestampGreaterThan  (optional)
   * @param timestampLessThan  (optional)
   * @param timestampGreaterThanOrEqual  (optional)
   * @param timestampLessThanOrEqual  (optional)
   * @param timestampEquals  (optional)
   * @param timestampNotEquals  (optional)
   * @param timestampSpecified  (optional)
   * @param timestampIn  (optional)
   * @param timestampNotIn  (optional)
   * @param intentContains  (optional)
   * @param intentDoesNotContain  (optional)
   * @param intentEquals  (optional)
   * @param intentNotEquals  (optional)
   * @param intentSpecified  (optional)
   * @param intentIn  (optional)
   * @param intentNotIn  (optional)
   * @param entitiesContains  (optional)
   * @param entitiesDoesNotContain  (optional)
   * @param entitiesEquals  (optional)
   * @param entitiesNotEquals  (optional)
   * @param entitiesSpecified  (optional)
   * @param entitiesIn  (optional)
   * @param entitiesNotIn  (optional)
   * @param confidenceGreaterThan  (optional)
   * @param confidenceLessThan  (optional)
   * @param confidenceGreaterThanOrEqual  (optional)
   * @param confidenceLessThanOrEqual  (optional)
   * @param confidenceEquals  (optional)
   * @param confidenceNotEquals  (optional)
   * @param confidenceSpecified  (optional)
   * @param confidenceIn  (optional)
   * @param confidenceNotIn  (optional)
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
  @RequestLine("GET /api/chat-messages?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&messageText.contains={messageTextContains}&messageText.doesNotContain={messageTextDoesNotContain}&messageText.equals={messageTextEquals}&messageText.notEquals={messageTextNotEquals}&messageText.specified={messageTextSpecified}&messageText.in={messageTextIn}&messageText.notIn={messageTextNotIn}&messageType.contains={messageTypeContains}&messageType.doesNotContain={messageTypeDoesNotContain}&messageType.equals={messageTypeEquals}&messageType.notEquals={messageTypeNotEquals}&messageType.specified={messageTypeSpecified}&messageType.in={messageTypeIn}&messageType.notIn={messageTypeNotIn}&timestamp.greaterThan={timestampGreaterThan}&timestamp.lessThan={timestampLessThan}&timestamp.greaterThanOrEqual={timestampGreaterThanOrEqual}&timestamp.lessThanOrEqual={timestampLessThanOrEqual}&timestamp.equals={timestampEquals}&timestamp.notEquals={timestampNotEquals}&timestamp.specified={timestampSpecified}&timestamp.in={timestampIn}&timestamp.notIn={timestampNotIn}&intent.contains={intentContains}&intent.doesNotContain={intentDoesNotContain}&intent.equals={intentEquals}&intent.notEquals={intentNotEquals}&intent.specified={intentSpecified}&intent.in={intentIn}&intent.notIn={intentNotIn}&entities.contains={entitiesContains}&entities.doesNotContain={entitiesDoesNotContain}&entities.equals={entitiesEquals}&entities.notEquals={entitiesNotEquals}&entities.specified={entitiesSpecified}&entities.in={entitiesIn}&entities.notIn={entitiesNotIn}&confidence.greaterThan={confidenceGreaterThan}&confidence.lessThan={confidenceLessThan}&confidence.greaterThanOrEqual={confidenceGreaterThanOrEqual}&confidence.lessThanOrEqual={confidenceLessThanOrEqual}&confidence.equals={confidenceEquals}&confidence.notEquals={confidenceNotEquals}&confidence.specified={confidenceSpecified}&confidence.in={confidenceIn}&confidence.notIn={confidenceNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&chatSessionId.greaterThan={chatSessionIdGreaterThan}&chatSessionId.lessThan={chatSessionIdLessThan}&chatSessionId.greaterThanOrEqual={chatSessionIdGreaterThanOrEqual}&chatSessionId.lessThanOrEqual={chatSessionIdLessThanOrEqual}&chatSessionId.equals={chatSessionIdEquals}&chatSessionId.notEquals={chatSessionIdNotEquals}&chatSessionId.specified={chatSessionIdSpecified}&chatSessionId.in={chatSessionIdIn}&chatSessionId.notIn={chatSessionIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<ChatMessageDTO>> getAllChatMessagesWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("messageTextContains") @jakarta.annotation.Nullable String messageTextContains, @Param("messageTextDoesNotContain") @jakarta.annotation.Nullable String messageTextDoesNotContain, @Param("messageTextEquals") @jakarta.annotation.Nullable String messageTextEquals, @Param("messageTextNotEquals") @jakarta.annotation.Nullable String messageTextNotEquals, @Param("messageTextSpecified") @jakarta.annotation.Nullable Boolean messageTextSpecified, @Param("messageTextIn") @jakarta.annotation.Nullable List<String> messageTextIn, @Param("messageTextNotIn") @jakarta.annotation.Nullable List<String> messageTextNotIn, @Param("messageTypeContains") @jakarta.annotation.Nullable String messageTypeContains, @Param("messageTypeDoesNotContain") @jakarta.annotation.Nullable String messageTypeDoesNotContain, @Param("messageTypeEquals") @jakarta.annotation.Nullable String messageTypeEquals, @Param("messageTypeNotEquals") @jakarta.annotation.Nullable String messageTypeNotEquals, @Param("messageTypeSpecified") @jakarta.annotation.Nullable Boolean messageTypeSpecified, @Param("messageTypeIn") @jakarta.annotation.Nullable List<String> messageTypeIn, @Param("messageTypeNotIn") @jakarta.annotation.Nullable List<String> messageTypeNotIn, @Param("timestampGreaterThan") @jakarta.annotation.Nullable OffsetDateTime timestampGreaterThan, @Param("timestampLessThan") @jakarta.annotation.Nullable OffsetDateTime timestampLessThan, @Param("timestampGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timestampGreaterThanOrEqual, @Param("timestampLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime timestampLessThanOrEqual, @Param("timestampEquals") @jakarta.annotation.Nullable OffsetDateTime timestampEquals, @Param("timestampNotEquals") @jakarta.annotation.Nullable OffsetDateTime timestampNotEquals, @Param("timestampSpecified") @jakarta.annotation.Nullable Boolean timestampSpecified, @Param("timestampIn") @jakarta.annotation.Nullable List<OffsetDateTime> timestampIn, @Param("timestampNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> timestampNotIn, @Param("intentContains") @jakarta.annotation.Nullable String intentContains, @Param("intentDoesNotContain") @jakarta.annotation.Nullable String intentDoesNotContain, @Param("intentEquals") @jakarta.annotation.Nullable String intentEquals, @Param("intentNotEquals") @jakarta.annotation.Nullable String intentNotEquals, @Param("intentSpecified") @jakarta.annotation.Nullable Boolean intentSpecified, @Param("intentIn") @jakarta.annotation.Nullable List<String> intentIn, @Param("intentNotIn") @jakarta.annotation.Nullable List<String> intentNotIn, @Param("entitiesContains") @jakarta.annotation.Nullable String entitiesContains, @Param("entitiesDoesNotContain") @jakarta.annotation.Nullable String entitiesDoesNotContain, @Param("entitiesEquals") @jakarta.annotation.Nullable String entitiesEquals, @Param("entitiesNotEquals") @jakarta.annotation.Nullable String entitiesNotEquals, @Param("entitiesSpecified") @jakarta.annotation.Nullable Boolean entitiesSpecified, @Param("entitiesIn") @jakarta.annotation.Nullable List<String> entitiesIn, @Param("entitiesNotIn") @jakarta.annotation.Nullable List<String> entitiesNotIn, @Param("confidenceGreaterThan") @jakarta.annotation.Nullable BigDecimal confidenceGreaterThan, @Param("confidenceLessThan") @jakarta.annotation.Nullable BigDecimal confidenceLessThan, @Param("confidenceGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal confidenceGreaterThanOrEqual, @Param("confidenceLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal confidenceLessThanOrEqual, @Param("confidenceEquals") @jakarta.annotation.Nullable BigDecimal confidenceEquals, @Param("confidenceNotEquals") @jakarta.annotation.Nullable BigDecimal confidenceNotEquals, @Param("confidenceSpecified") @jakarta.annotation.Nullable Boolean confidenceSpecified, @Param("confidenceIn") @jakarta.annotation.Nullable List<BigDecimal> confidenceIn, @Param("confidenceNotIn") @jakarta.annotation.Nullable List<BigDecimal> confidenceNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("chatSessionIdGreaterThan") @jakarta.annotation.Nullable Long chatSessionIdGreaterThan, @Param("chatSessionIdLessThan") @jakarta.annotation.Nullable Long chatSessionIdLessThan, @Param("chatSessionIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long chatSessionIdGreaterThanOrEqual, @Param("chatSessionIdLessThanOrEqual") @jakarta.annotation.Nullable Long chatSessionIdLessThanOrEqual, @Param("chatSessionIdEquals") @jakarta.annotation.Nullable Long chatSessionIdEquals, @Param("chatSessionIdNotEquals") @jakarta.annotation.Nullable Long chatSessionIdNotEquals, @Param("chatSessionIdSpecified") @jakarta.annotation.Nullable Boolean chatSessionIdSpecified, @Param("chatSessionIdIn") @jakarta.annotation.Nullable List<Long> chatSessionIdIn, @Param("chatSessionIdNotIn") @jakarta.annotation.Nullable List<Long> chatSessionIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllChatMessages</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllChatMessagesQueryParams} class that allows for
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
   *   <li>messageTextContains -  (optional)</li>
   *   <li>messageTextDoesNotContain -  (optional)</li>
   *   <li>messageTextEquals -  (optional)</li>
   *   <li>messageTextNotEquals -  (optional)</li>
   *   <li>messageTextSpecified -  (optional)</li>
   *   <li>messageTextIn -  (optional)</li>
   *   <li>messageTextNotIn -  (optional)</li>
   *   <li>messageTypeContains -  (optional)</li>
   *   <li>messageTypeDoesNotContain -  (optional)</li>
   *   <li>messageTypeEquals -  (optional)</li>
   *   <li>messageTypeNotEquals -  (optional)</li>
   *   <li>messageTypeSpecified -  (optional)</li>
   *   <li>messageTypeIn -  (optional)</li>
   *   <li>messageTypeNotIn -  (optional)</li>
   *   <li>timestampGreaterThan -  (optional)</li>
   *   <li>timestampLessThan -  (optional)</li>
   *   <li>timestampGreaterThanOrEqual -  (optional)</li>
   *   <li>timestampLessThanOrEqual -  (optional)</li>
   *   <li>timestampEquals -  (optional)</li>
   *   <li>timestampNotEquals -  (optional)</li>
   *   <li>timestampSpecified -  (optional)</li>
   *   <li>timestampIn -  (optional)</li>
   *   <li>timestampNotIn -  (optional)</li>
   *   <li>intentContains -  (optional)</li>
   *   <li>intentDoesNotContain -  (optional)</li>
   *   <li>intentEquals -  (optional)</li>
   *   <li>intentNotEquals -  (optional)</li>
   *   <li>intentSpecified -  (optional)</li>
   *   <li>intentIn -  (optional)</li>
   *   <li>intentNotIn -  (optional)</li>
   *   <li>entitiesContains -  (optional)</li>
   *   <li>entitiesDoesNotContain -  (optional)</li>
   *   <li>entitiesEquals -  (optional)</li>
   *   <li>entitiesNotEquals -  (optional)</li>
   *   <li>entitiesSpecified -  (optional)</li>
   *   <li>entitiesIn -  (optional)</li>
   *   <li>entitiesNotIn -  (optional)</li>
   *   <li>confidenceGreaterThan -  (optional)</li>
   *   <li>confidenceLessThan -  (optional)</li>
   *   <li>confidenceGreaterThanOrEqual -  (optional)</li>
   *   <li>confidenceLessThanOrEqual -  (optional)</li>
   *   <li>confidenceEquals -  (optional)</li>
   *   <li>confidenceNotEquals -  (optional)</li>
   *   <li>confidenceSpecified -  (optional)</li>
   *   <li>confidenceIn -  (optional)</li>
   *   <li>confidenceNotIn -  (optional)</li>
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
   * @return List&lt;ChatMessageDTO&gt;
   */
  @RequestLine("GET /api/chat-messages?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&messageText.contains={messageTextContains}&messageText.doesNotContain={messageTextDoesNotContain}&messageText.equals={messageTextEquals}&messageText.notEquals={messageTextNotEquals}&messageText.specified={messageTextSpecified}&messageText.in={messageTextIn}&messageText.notIn={messageTextNotIn}&messageType.contains={messageTypeContains}&messageType.doesNotContain={messageTypeDoesNotContain}&messageType.equals={messageTypeEquals}&messageType.notEquals={messageTypeNotEquals}&messageType.specified={messageTypeSpecified}&messageType.in={messageTypeIn}&messageType.notIn={messageTypeNotIn}&timestamp.greaterThan={timestampGreaterThan}&timestamp.lessThan={timestampLessThan}&timestamp.greaterThanOrEqual={timestampGreaterThanOrEqual}&timestamp.lessThanOrEqual={timestampLessThanOrEqual}&timestamp.equals={timestampEquals}&timestamp.notEquals={timestampNotEquals}&timestamp.specified={timestampSpecified}&timestamp.in={timestampIn}&timestamp.notIn={timestampNotIn}&intent.contains={intentContains}&intent.doesNotContain={intentDoesNotContain}&intent.equals={intentEquals}&intent.notEquals={intentNotEquals}&intent.specified={intentSpecified}&intent.in={intentIn}&intent.notIn={intentNotIn}&entities.contains={entitiesContains}&entities.doesNotContain={entitiesDoesNotContain}&entities.equals={entitiesEquals}&entities.notEquals={entitiesNotEquals}&entities.specified={entitiesSpecified}&entities.in={entitiesIn}&entities.notIn={entitiesNotIn}&confidence.greaterThan={confidenceGreaterThan}&confidence.lessThan={confidenceLessThan}&confidence.greaterThanOrEqual={confidenceGreaterThanOrEqual}&confidence.lessThanOrEqual={confidenceLessThanOrEqual}&confidence.equals={confidenceEquals}&confidence.notEquals={confidenceNotEquals}&confidence.specified={confidenceSpecified}&confidence.in={confidenceIn}&confidence.notIn={confidenceNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&chatSessionId.greaterThan={chatSessionIdGreaterThan}&chatSessionId.lessThan={chatSessionIdLessThan}&chatSessionId.greaterThanOrEqual={chatSessionIdGreaterThanOrEqual}&chatSessionId.lessThanOrEqual={chatSessionIdLessThanOrEqual}&chatSessionId.equals={chatSessionIdEquals}&chatSessionId.notEquals={chatSessionIdNotEquals}&chatSessionId.specified={chatSessionIdSpecified}&chatSessionId.in={chatSessionIdIn}&chatSessionId.notIn={chatSessionIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  List<ChatMessageDTO> getAllChatMessages(@QueryMap(encoded=true) GetAllChatMessagesQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllChatMessages</code> that receives the query parameters as a map,
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
          *   <li>messageTextContains -  (optional)</li>
          *   <li>messageTextDoesNotContain -  (optional)</li>
          *   <li>messageTextEquals -  (optional)</li>
          *   <li>messageTextNotEquals -  (optional)</li>
          *   <li>messageTextSpecified -  (optional)</li>
          *   <li>messageTextIn -  (optional)</li>
          *   <li>messageTextNotIn -  (optional)</li>
          *   <li>messageTypeContains -  (optional)</li>
          *   <li>messageTypeDoesNotContain -  (optional)</li>
          *   <li>messageTypeEquals -  (optional)</li>
          *   <li>messageTypeNotEquals -  (optional)</li>
          *   <li>messageTypeSpecified -  (optional)</li>
          *   <li>messageTypeIn -  (optional)</li>
          *   <li>messageTypeNotIn -  (optional)</li>
          *   <li>timestampGreaterThan -  (optional)</li>
          *   <li>timestampLessThan -  (optional)</li>
          *   <li>timestampGreaterThanOrEqual -  (optional)</li>
          *   <li>timestampLessThanOrEqual -  (optional)</li>
          *   <li>timestampEquals -  (optional)</li>
          *   <li>timestampNotEquals -  (optional)</li>
          *   <li>timestampSpecified -  (optional)</li>
          *   <li>timestampIn -  (optional)</li>
          *   <li>timestampNotIn -  (optional)</li>
          *   <li>intentContains -  (optional)</li>
          *   <li>intentDoesNotContain -  (optional)</li>
          *   <li>intentEquals -  (optional)</li>
          *   <li>intentNotEquals -  (optional)</li>
          *   <li>intentSpecified -  (optional)</li>
          *   <li>intentIn -  (optional)</li>
          *   <li>intentNotIn -  (optional)</li>
          *   <li>entitiesContains -  (optional)</li>
          *   <li>entitiesDoesNotContain -  (optional)</li>
          *   <li>entitiesEquals -  (optional)</li>
          *   <li>entitiesNotEquals -  (optional)</li>
          *   <li>entitiesSpecified -  (optional)</li>
          *   <li>entitiesIn -  (optional)</li>
          *   <li>entitiesNotIn -  (optional)</li>
          *   <li>confidenceGreaterThan -  (optional)</li>
          *   <li>confidenceLessThan -  (optional)</li>
          *   <li>confidenceGreaterThanOrEqual -  (optional)</li>
          *   <li>confidenceLessThanOrEqual -  (optional)</li>
          *   <li>confidenceEquals -  (optional)</li>
          *   <li>confidenceNotEquals -  (optional)</li>
          *   <li>confidenceSpecified -  (optional)</li>
          *   <li>confidenceIn -  (optional)</li>
          *   <li>confidenceNotIn -  (optional)</li>
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
          * @return List&lt;ChatMessageDTO&gt;
      */
      @RequestLine("GET /api/chat-messages?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&messageText.contains={messageTextContains}&messageText.doesNotContain={messageTextDoesNotContain}&messageText.equals={messageTextEquals}&messageText.notEquals={messageTextNotEquals}&messageText.specified={messageTextSpecified}&messageText.in={messageTextIn}&messageText.notIn={messageTextNotIn}&messageType.contains={messageTypeContains}&messageType.doesNotContain={messageTypeDoesNotContain}&messageType.equals={messageTypeEquals}&messageType.notEquals={messageTypeNotEquals}&messageType.specified={messageTypeSpecified}&messageType.in={messageTypeIn}&messageType.notIn={messageTypeNotIn}&timestamp.greaterThan={timestampGreaterThan}&timestamp.lessThan={timestampLessThan}&timestamp.greaterThanOrEqual={timestampGreaterThanOrEqual}&timestamp.lessThanOrEqual={timestampLessThanOrEqual}&timestamp.equals={timestampEquals}&timestamp.notEquals={timestampNotEquals}&timestamp.specified={timestampSpecified}&timestamp.in={timestampIn}&timestamp.notIn={timestampNotIn}&intent.contains={intentContains}&intent.doesNotContain={intentDoesNotContain}&intent.equals={intentEquals}&intent.notEquals={intentNotEquals}&intent.specified={intentSpecified}&intent.in={intentIn}&intent.notIn={intentNotIn}&entities.contains={entitiesContains}&entities.doesNotContain={entitiesDoesNotContain}&entities.equals={entitiesEquals}&entities.notEquals={entitiesNotEquals}&entities.specified={entitiesSpecified}&entities.in={entitiesIn}&entities.notIn={entitiesNotIn}&confidence.greaterThan={confidenceGreaterThan}&confidence.lessThan={confidenceLessThan}&confidence.greaterThanOrEqual={confidenceGreaterThanOrEqual}&confidence.lessThanOrEqual={confidenceLessThanOrEqual}&confidence.equals={confidenceEquals}&confidence.notEquals={confidenceNotEquals}&confidence.specified={confidenceSpecified}&confidence.in={confidenceIn}&confidence.notIn={confidenceNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&chatSessionId.greaterThan={chatSessionIdGreaterThan}&chatSessionId.lessThan={chatSessionIdLessThan}&chatSessionId.greaterThanOrEqual={chatSessionIdGreaterThanOrEqual}&chatSessionId.lessThanOrEqual={chatSessionIdLessThanOrEqual}&chatSessionId.equals={chatSessionIdEquals}&chatSessionId.notEquals={chatSessionIdNotEquals}&chatSessionId.specified={chatSessionIdSpecified}&chatSessionId.in={chatSessionIdIn}&chatSessionId.notIn={chatSessionIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<ChatMessageDTO>> getAllChatMessagesWithHttpInfo(@QueryMap(encoded=true) GetAllChatMessagesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllChatMessages</code> method in a fluent style.
   */
  public static class GetAllChatMessagesQueryParams extends HashMap<String, Object> {
    public GetAllChatMessagesQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams messageTextContains(@jakarta.annotation.Nullable final String value) {
      put("messageText.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams messageTextDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("messageText.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams messageTextEquals(@jakarta.annotation.Nullable final String value) {
      put("messageText.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams messageTextNotEquals(@jakarta.annotation.Nullable final String value) {
      put("messageText.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams messageTextSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("messageText.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams messageTextIn(@jakarta.annotation.Nullable final List<String> value) {
      put("messageText.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams messageTextNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("messageText.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams messageTypeContains(@jakarta.annotation.Nullable final String value) {
      put("messageType.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams messageTypeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("messageType.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams messageTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("messageType.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams messageTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("messageType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams messageTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("messageType.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams messageTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("messageType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams messageTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("messageType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams timestampGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timestamp.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams timestampLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timestamp.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams timestampGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timestamp.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams timestampLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timestamp.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams timestampEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timestamp.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams timestampNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("timestamp.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams timestampSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("timestamp.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams timestampIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("timestamp.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams timestampNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("timestamp.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams intentContains(@jakarta.annotation.Nullable final String value) {
      put("intent.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams intentDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("intent.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams intentEquals(@jakarta.annotation.Nullable final String value) {
      put("intent.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams intentNotEquals(@jakarta.annotation.Nullable final String value) {
      put("intent.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams intentSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("intent.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams intentIn(@jakarta.annotation.Nullable final List<String> value) {
      put("intent.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams intentNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("intent.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams entitiesContains(@jakarta.annotation.Nullable final String value) {
      put("entities.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams entitiesDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("entities.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams entitiesEquals(@jakarta.annotation.Nullable final String value) {
      put("entities.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams entitiesNotEquals(@jakarta.annotation.Nullable final String value) {
      put("entities.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams entitiesSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("entities.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams entitiesIn(@jakarta.annotation.Nullable final List<String> value) {
      put("entities.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams entitiesNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("entities.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams confidenceGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidence.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams confidenceLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidence.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams confidenceGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidence.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams confidenceLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidence.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams confidenceEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidence.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams confidenceNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("confidence.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams confidenceSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("confidence.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams confidenceIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("confidence.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams confidenceNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("confidence.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams chatSessionIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams chatSessionIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams chatSessionIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams chatSessionIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams chatSessionIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams chatSessionIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("chatSessionId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams chatSessionIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("chatSessionId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllChatMessagesQueryParams chatSessionIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("chatSessionId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams chatSessionIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("chatSessionId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllChatMessagesQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return ChatMessageDTO
   */
  @RequestLine("GET /api/chat-messages/{id}")
  @Headers({
    "Accept: */*",
  })
  ChatMessageDTO getChatMessage(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getChatMessage</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/chat-messages/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<ChatMessageDTO> getChatMessageWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param chatMessageDTO  (required)
   * @return ChatMessageDTO
   */
  @RequestLine("PATCH /api/chat-messages/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ChatMessageDTO partialUpdateChatMessage(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ChatMessageDTO chatMessageDTO);

  /**
   * 
   * Similar to <code>partialUpdateChatMessage</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param chatMessageDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/chat-messages/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<ChatMessageDTO> partialUpdateChatMessageWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ChatMessageDTO chatMessageDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param chatMessageDTO  (required)
   * @return ChatMessageDTO
   */
  @RequestLine("PUT /api/chat-messages/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ChatMessageDTO updateChatMessage(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ChatMessageDTO chatMessageDTO);

  /**
   * 
   * Similar to <code>updateChatMessage</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param chatMessageDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/chat-messages/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<ChatMessageDTO> updateChatMessageWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull ChatMessageDTO chatMessageDTO);


}
