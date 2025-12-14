package com.ridehub.feign.msbooking.client.api;

import com.ridehub.feign.msbooking.client.invoker.ApiClient;
import com.ridehub.feign.msbooking.client.invoker.EncodingUtils;
import com.ridehub.feign.msbooking.client.model.ApiResponse;

import com.ridehub.feign.msbooking.client.model.FileBookingDTO;
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
public interface FileBookingResourceMsbookingApi extends ApiClient.Api {


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
   * @param bucketContains  (optional)
   * @param bucketDoesNotContain  (optional)
   * @param bucketEquals  (optional)
   * @param bucketNotEquals  (optional)
   * @param bucketSpecified  (optional)
   * @param bucketIn  (optional)
   * @param bucketNotIn  (optional)
   * @param objectKeyContains  (optional)
   * @param objectKeyDoesNotContain  (optional)
   * @param objectKeyEquals  (optional)
   * @param objectKeyNotEquals  (optional)
   * @param objectKeySpecified  (optional)
   * @param objectKeyIn  (optional)
   * @param objectKeyNotIn  (optional)
   * @param contentTypeContains  (optional)
   * @param contentTypeDoesNotContain  (optional)
   * @param contentTypeEquals  (optional)
   * @param contentTypeNotEquals  (optional)
   * @param contentTypeSpecified  (optional)
   * @param contentTypeIn  (optional)
   * @param contentTypeNotIn  (optional)
   * @param sizeGreaterThan  (optional)
   * @param sizeLessThan  (optional)
   * @param sizeGreaterThanOrEqual  (optional)
   * @param sizeLessThanOrEqual  (optional)
   * @param sizeEquals  (optional)
   * @param sizeNotEquals  (optional)
   * @param sizeSpecified  (optional)
   * @param sizeIn  (optional)
   * @param sizeNotIn  (optional)
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
   * @param ticketIdGreaterThan  (optional)
   * @param ticketIdLessThan  (optional)
   * @param ticketIdGreaterThanOrEqual  (optional)
   * @param ticketIdLessThanOrEqual  (optional)
   * @param ticketIdEquals  (optional)
   * @param ticketIdNotEquals  (optional)
   * @param ticketIdSpecified  (optional)
   * @param ticketIdIn  (optional)
   * @param ticketIdNotIn  (optional)
   * @param distinct  (optional)
   * @return Long
   */
  @RequestLine("GET /api/file-bookings/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&bucket.contains={bucketContains}&bucket.doesNotContain={bucketDoesNotContain}&bucket.equals={bucketEquals}&bucket.notEquals={bucketNotEquals}&bucket.specified={bucketSpecified}&bucket.in={bucketIn}&bucket.notIn={bucketNotIn}&objectKey.contains={objectKeyContains}&objectKey.doesNotContain={objectKeyDoesNotContain}&objectKey.equals={objectKeyEquals}&objectKey.notEquals={objectKeyNotEquals}&objectKey.specified={objectKeySpecified}&objectKey.in={objectKeyIn}&objectKey.notIn={objectKeyNotIn}&contentType.contains={contentTypeContains}&contentType.doesNotContain={contentTypeDoesNotContain}&contentType.equals={contentTypeEquals}&contentType.notEquals={contentTypeNotEquals}&contentType.specified={contentTypeSpecified}&contentType.in={contentTypeIn}&contentType.notIn={contentTypeNotIn}&size.greaterThan={sizeGreaterThan}&size.lessThan={sizeLessThan}&size.greaterThanOrEqual={sizeGreaterThanOrEqual}&size.lessThanOrEqual={sizeLessThanOrEqual}&size.equals={sizeEquals}&size.notEquals={sizeNotEquals}&size.specified={sizeSpecified}&size.in={sizeIn}&size.notIn={sizeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&ticketId.greaterThan={ticketIdGreaterThan}&ticketId.lessThan={ticketIdLessThan}&ticketId.greaterThanOrEqual={ticketIdGreaterThanOrEqual}&ticketId.lessThanOrEqual={ticketIdLessThanOrEqual}&ticketId.equals={ticketIdEquals}&ticketId.notEquals={ticketIdNotEquals}&ticketId.specified={ticketIdSpecified}&ticketId.in={ticketIdIn}&ticketId.notIn={ticketIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countFileBookings(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("bucketContains") @jakarta.annotation.Nullable String bucketContains, @Param("bucketDoesNotContain") @jakarta.annotation.Nullable String bucketDoesNotContain, @Param("bucketEquals") @jakarta.annotation.Nullable String bucketEquals, @Param("bucketNotEquals") @jakarta.annotation.Nullable String bucketNotEquals, @Param("bucketSpecified") @jakarta.annotation.Nullable Boolean bucketSpecified, @Param("bucketIn") @jakarta.annotation.Nullable List<String> bucketIn, @Param("bucketNotIn") @jakarta.annotation.Nullable List<String> bucketNotIn, @Param("objectKeyContains") @jakarta.annotation.Nullable String objectKeyContains, @Param("objectKeyDoesNotContain") @jakarta.annotation.Nullable String objectKeyDoesNotContain, @Param("objectKeyEquals") @jakarta.annotation.Nullable String objectKeyEquals, @Param("objectKeyNotEquals") @jakarta.annotation.Nullable String objectKeyNotEquals, @Param("objectKeySpecified") @jakarta.annotation.Nullable Boolean objectKeySpecified, @Param("objectKeyIn") @jakarta.annotation.Nullable List<String> objectKeyIn, @Param("objectKeyNotIn") @jakarta.annotation.Nullable List<String> objectKeyNotIn, @Param("contentTypeContains") @jakarta.annotation.Nullable String contentTypeContains, @Param("contentTypeDoesNotContain") @jakarta.annotation.Nullable String contentTypeDoesNotContain, @Param("contentTypeEquals") @jakarta.annotation.Nullable String contentTypeEquals, @Param("contentTypeNotEquals") @jakarta.annotation.Nullable String contentTypeNotEquals, @Param("contentTypeSpecified") @jakarta.annotation.Nullable Boolean contentTypeSpecified, @Param("contentTypeIn") @jakarta.annotation.Nullable List<String> contentTypeIn, @Param("contentTypeNotIn") @jakarta.annotation.Nullable List<String> contentTypeNotIn, @Param("sizeGreaterThan") @jakarta.annotation.Nullable Long sizeGreaterThan, @Param("sizeLessThan") @jakarta.annotation.Nullable Long sizeLessThan, @Param("sizeGreaterThanOrEqual") @jakarta.annotation.Nullable Long sizeGreaterThanOrEqual, @Param("sizeLessThanOrEqual") @jakarta.annotation.Nullable Long sizeLessThanOrEqual, @Param("sizeEquals") @jakarta.annotation.Nullable Long sizeEquals, @Param("sizeNotEquals") @jakarta.annotation.Nullable Long sizeNotEquals, @Param("sizeSpecified") @jakarta.annotation.Nullable Boolean sizeSpecified, @Param("sizeIn") @jakarta.annotation.Nullable List<Long> sizeIn, @Param("sizeNotIn") @jakarta.annotation.Nullable List<Long> sizeNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("ticketIdGreaterThan") @jakarta.annotation.Nullable Long ticketIdGreaterThan, @Param("ticketIdLessThan") @jakarta.annotation.Nullable Long ticketIdLessThan, @Param("ticketIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long ticketIdGreaterThanOrEqual, @Param("ticketIdLessThanOrEqual") @jakarta.annotation.Nullable Long ticketIdLessThanOrEqual, @Param("ticketIdEquals") @jakarta.annotation.Nullable Long ticketIdEquals, @Param("ticketIdNotEquals") @jakarta.annotation.Nullable Long ticketIdNotEquals, @Param("ticketIdSpecified") @jakarta.annotation.Nullable Boolean ticketIdSpecified, @Param("ticketIdIn") @jakarta.annotation.Nullable List<Long> ticketIdIn, @Param("ticketIdNotIn") @jakarta.annotation.Nullable List<Long> ticketIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countFileBookings</code> but it also returns the http response headers .
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
   * @param bucketContains  (optional)
   * @param bucketDoesNotContain  (optional)
   * @param bucketEquals  (optional)
   * @param bucketNotEquals  (optional)
   * @param bucketSpecified  (optional)
   * @param bucketIn  (optional)
   * @param bucketNotIn  (optional)
   * @param objectKeyContains  (optional)
   * @param objectKeyDoesNotContain  (optional)
   * @param objectKeyEquals  (optional)
   * @param objectKeyNotEquals  (optional)
   * @param objectKeySpecified  (optional)
   * @param objectKeyIn  (optional)
   * @param objectKeyNotIn  (optional)
   * @param contentTypeContains  (optional)
   * @param contentTypeDoesNotContain  (optional)
   * @param contentTypeEquals  (optional)
   * @param contentTypeNotEquals  (optional)
   * @param contentTypeSpecified  (optional)
   * @param contentTypeIn  (optional)
   * @param contentTypeNotIn  (optional)
   * @param sizeGreaterThan  (optional)
   * @param sizeLessThan  (optional)
   * @param sizeGreaterThanOrEqual  (optional)
   * @param sizeLessThanOrEqual  (optional)
   * @param sizeEquals  (optional)
   * @param sizeNotEquals  (optional)
   * @param sizeSpecified  (optional)
   * @param sizeIn  (optional)
   * @param sizeNotIn  (optional)
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
   * @param ticketIdGreaterThan  (optional)
   * @param ticketIdLessThan  (optional)
   * @param ticketIdGreaterThanOrEqual  (optional)
   * @param ticketIdLessThanOrEqual  (optional)
   * @param ticketIdEquals  (optional)
   * @param ticketIdNotEquals  (optional)
   * @param ticketIdSpecified  (optional)
   * @param ticketIdIn  (optional)
   * @param ticketIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/file-bookings/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&bucket.contains={bucketContains}&bucket.doesNotContain={bucketDoesNotContain}&bucket.equals={bucketEquals}&bucket.notEquals={bucketNotEquals}&bucket.specified={bucketSpecified}&bucket.in={bucketIn}&bucket.notIn={bucketNotIn}&objectKey.contains={objectKeyContains}&objectKey.doesNotContain={objectKeyDoesNotContain}&objectKey.equals={objectKeyEquals}&objectKey.notEquals={objectKeyNotEquals}&objectKey.specified={objectKeySpecified}&objectKey.in={objectKeyIn}&objectKey.notIn={objectKeyNotIn}&contentType.contains={contentTypeContains}&contentType.doesNotContain={contentTypeDoesNotContain}&contentType.equals={contentTypeEquals}&contentType.notEquals={contentTypeNotEquals}&contentType.specified={contentTypeSpecified}&contentType.in={contentTypeIn}&contentType.notIn={contentTypeNotIn}&size.greaterThan={sizeGreaterThan}&size.lessThan={sizeLessThan}&size.greaterThanOrEqual={sizeGreaterThanOrEqual}&size.lessThanOrEqual={sizeLessThanOrEqual}&size.equals={sizeEquals}&size.notEquals={sizeNotEquals}&size.specified={sizeSpecified}&size.in={sizeIn}&size.notIn={sizeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&ticketId.greaterThan={ticketIdGreaterThan}&ticketId.lessThan={ticketIdLessThan}&ticketId.greaterThanOrEqual={ticketIdGreaterThanOrEqual}&ticketId.lessThanOrEqual={ticketIdLessThanOrEqual}&ticketId.equals={ticketIdEquals}&ticketId.notEquals={ticketIdNotEquals}&ticketId.specified={ticketIdSpecified}&ticketId.in={ticketIdIn}&ticketId.notIn={ticketIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countFileBookingsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("bucketContains") @jakarta.annotation.Nullable String bucketContains, @Param("bucketDoesNotContain") @jakarta.annotation.Nullable String bucketDoesNotContain, @Param("bucketEquals") @jakarta.annotation.Nullable String bucketEquals, @Param("bucketNotEquals") @jakarta.annotation.Nullable String bucketNotEquals, @Param("bucketSpecified") @jakarta.annotation.Nullable Boolean bucketSpecified, @Param("bucketIn") @jakarta.annotation.Nullable List<String> bucketIn, @Param("bucketNotIn") @jakarta.annotation.Nullable List<String> bucketNotIn, @Param("objectKeyContains") @jakarta.annotation.Nullable String objectKeyContains, @Param("objectKeyDoesNotContain") @jakarta.annotation.Nullable String objectKeyDoesNotContain, @Param("objectKeyEquals") @jakarta.annotation.Nullable String objectKeyEquals, @Param("objectKeyNotEquals") @jakarta.annotation.Nullable String objectKeyNotEquals, @Param("objectKeySpecified") @jakarta.annotation.Nullable Boolean objectKeySpecified, @Param("objectKeyIn") @jakarta.annotation.Nullable List<String> objectKeyIn, @Param("objectKeyNotIn") @jakarta.annotation.Nullable List<String> objectKeyNotIn, @Param("contentTypeContains") @jakarta.annotation.Nullable String contentTypeContains, @Param("contentTypeDoesNotContain") @jakarta.annotation.Nullable String contentTypeDoesNotContain, @Param("contentTypeEquals") @jakarta.annotation.Nullable String contentTypeEquals, @Param("contentTypeNotEquals") @jakarta.annotation.Nullable String contentTypeNotEquals, @Param("contentTypeSpecified") @jakarta.annotation.Nullable Boolean contentTypeSpecified, @Param("contentTypeIn") @jakarta.annotation.Nullable List<String> contentTypeIn, @Param("contentTypeNotIn") @jakarta.annotation.Nullable List<String> contentTypeNotIn, @Param("sizeGreaterThan") @jakarta.annotation.Nullable Long sizeGreaterThan, @Param("sizeLessThan") @jakarta.annotation.Nullable Long sizeLessThan, @Param("sizeGreaterThanOrEqual") @jakarta.annotation.Nullable Long sizeGreaterThanOrEqual, @Param("sizeLessThanOrEqual") @jakarta.annotation.Nullable Long sizeLessThanOrEqual, @Param("sizeEquals") @jakarta.annotation.Nullable Long sizeEquals, @Param("sizeNotEquals") @jakarta.annotation.Nullable Long sizeNotEquals, @Param("sizeSpecified") @jakarta.annotation.Nullable Boolean sizeSpecified, @Param("sizeIn") @jakarta.annotation.Nullable List<Long> sizeIn, @Param("sizeNotIn") @jakarta.annotation.Nullable List<Long> sizeNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("ticketIdGreaterThan") @jakarta.annotation.Nullable Long ticketIdGreaterThan, @Param("ticketIdLessThan") @jakarta.annotation.Nullable Long ticketIdLessThan, @Param("ticketIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long ticketIdGreaterThanOrEqual, @Param("ticketIdLessThanOrEqual") @jakarta.annotation.Nullable Long ticketIdLessThanOrEqual, @Param("ticketIdEquals") @jakarta.annotation.Nullable Long ticketIdEquals, @Param("ticketIdNotEquals") @jakarta.annotation.Nullable Long ticketIdNotEquals, @Param("ticketIdSpecified") @jakarta.annotation.Nullable Boolean ticketIdSpecified, @Param("ticketIdIn") @jakarta.annotation.Nullable List<Long> ticketIdIn, @Param("ticketIdNotIn") @jakarta.annotation.Nullable List<Long> ticketIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countFileBookings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountFileBookingsQueryParams} class that allows for
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
   *   <li>bucketContains -  (optional)</li>
   *   <li>bucketDoesNotContain -  (optional)</li>
   *   <li>bucketEquals -  (optional)</li>
   *   <li>bucketNotEquals -  (optional)</li>
   *   <li>bucketSpecified -  (optional)</li>
   *   <li>bucketIn -  (optional)</li>
   *   <li>bucketNotIn -  (optional)</li>
   *   <li>objectKeyContains -  (optional)</li>
   *   <li>objectKeyDoesNotContain -  (optional)</li>
   *   <li>objectKeyEquals -  (optional)</li>
   *   <li>objectKeyNotEquals -  (optional)</li>
   *   <li>objectKeySpecified -  (optional)</li>
   *   <li>objectKeyIn -  (optional)</li>
   *   <li>objectKeyNotIn -  (optional)</li>
   *   <li>contentTypeContains -  (optional)</li>
   *   <li>contentTypeDoesNotContain -  (optional)</li>
   *   <li>contentTypeEquals -  (optional)</li>
   *   <li>contentTypeNotEquals -  (optional)</li>
   *   <li>contentTypeSpecified -  (optional)</li>
   *   <li>contentTypeIn -  (optional)</li>
   *   <li>contentTypeNotIn -  (optional)</li>
   *   <li>sizeGreaterThan -  (optional)</li>
   *   <li>sizeLessThan -  (optional)</li>
   *   <li>sizeGreaterThanOrEqual -  (optional)</li>
   *   <li>sizeLessThanOrEqual -  (optional)</li>
   *   <li>sizeEquals -  (optional)</li>
   *   <li>sizeNotEquals -  (optional)</li>
   *   <li>sizeSpecified -  (optional)</li>
   *   <li>sizeIn -  (optional)</li>
   *   <li>sizeNotIn -  (optional)</li>
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
   *   <li>ticketIdGreaterThan -  (optional)</li>
   *   <li>ticketIdLessThan -  (optional)</li>
   *   <li>ticketIdGreaterThanOrEqual -  (optional)</li>
   *   <li>ticketIdLessThanOrEqual -  (optional)</li>
   *   <li>ticketIdEquals -  (optional)</li>
   *   <li>ticketIdNotEquals -  (optional)</li>
   *   <li>ticketIdSpecified -  (optional)</li>
   *   <li>ticketIdIn -  (optional)</li>
   *   <li>ticketIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return Long
   */
  @RequestLine("GET /api/file-bookings/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&bucket.contains={bucketContains}&bucket.doesNotContain={bucketDoesNotContain}&bucket.equals={bucketEquals}&bucket.notEquals={bucketNotEquals}&bucket.specified={bucketSpecified}&bucket.in={bucketIn}&bucket.notIn={bucketNotIn}&objectKey.contains={objectKeyContains}&objectKey.doesNotContain={objectKeyDoesNotContain}&objectKey.equals={objectKeyEquals}&objectKey.notEquals={objectKeyNotEquals}&objectKey.specified={objectKeySpecified}&objectKey.in={objectKeyIn}&objectKey.notIn={objectKeyNotIn}&contentType.contains={contentTypeContains}&contentType.doesNotContain={contentTypeDoesNotContain}&contentType.equals={contentTypeEquals}&contentType.notEquals={contentTypeNotEquals}&contentType.specified={contentTypeSpecified}&contentType.in={contentTypeIn}&contentType.notIn={contentTypeNotIn}&size.greaterThan={sizeGreaterThan}&size.lessThan={sizeLessThan}&size.greaterThanOrEqual={sizeGreaterThanOrEqual}&size.lessThanOrEqual={sizeLessThanOrEqual}&size.equals={sizeEquals}&size.notEquals={sizeNotEquals}&size.specified={sizeSpecified}&size.in={sizeIn}&size.notIn={sizeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&ticketId.greaterThan={ticketIdGreaterThan}&ticketId.lessThan={ticketIdLessThan}&ticketId.greaterThanOrEqual={ticketIdGreaterThanOrEqual}&ticketId.lessThanOrEqual={ticketIdLessThanOrEqual}&ticketId.equals={ticketIdEquals}&ticketId.notEquals={ticketIdNotEquals}&ticketId.specified={ticketIdSpecified}&ticketId.in={ticketIdIn}&ticketId.notIn={ticketIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countFileBookings(@QueryMap(encoded=true) CountFileBookingsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countFileBookings</code> that receives the query parameters as a map,
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
          *   <li>bucketContains -  (optional)</li>
          *   <li>bucketDoesNotContain -  (optional)</li>
          *   <li>bucketEquals -  (optional)</li>
          *   <li>bucketNotEquals -  (optional)</li>
          *   <li>bucketSpecified -  (optional)</li>
          *   <li>bucketIn -  (optional)</li>
          *   <li>bucketNotIn -  (optional)</li>
          *   <li>objectKeyContains -  (optional)</li>
          *   <li>objectKeyDoesNotContain -  (optional)</li>
          *   <li>objectKeyEquals -  (optional)</li>
          *   <li>objectKeyNotEquals -  (optional)</li>
          *   <li>objectKeySpecified -  (optional)</li>
          *   <li>objectKeyIn -  (optional)</li>
          *   <li>objectKeyNotIn -  (optional)</li>
          *   <li>contentTypeContains -  (optional)</li>
          *   <li>contentTypeDoesNotContain -  (optional)</li>
          *   <li>contentTypeEquals -  (optional)</li>
          *   <li>contentTypeNotEquals -  (optional)</li>
          *   <li>contentTypeSpecified -  (optional)</li>
          *   <li>contentTypeIn -  (optional)</li>
          *   <li>contentTypeNotIn -  (optional)</li>
          *   <li>sizeGreaterThan -  (optional)</li>
          *   <li>sizeLessThan -  (optional)</li>
          *   <li>sizeGreaterThanOrEqual -  (optional)</li>
          *   <li>sizeLessThanOrEqual -  (optional)</li>
          *   <li>sizeEquals -  (optional)</li>
          *   <li>sizeNotEquals -  (optional)</li>
          *   <li>sizeSpecified -  (optional)</li>
          *   <li>sizeIn -  (optional)</li>
          *   <li>sizeNotIn -  (optional)</li>
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
          *   <li>ticketIdGreaterThan -  (optional)</li>
          *   <li>ticketIdLessThan -  (optional)</li>
          *   <li>ticketIdGreaterThanOrEqual -  (optional)</li>
          *   <li>ticketIdLessThanOrEqual -  (optional)</li>
          *   <li>ticketIdEquals -  (optional)</li>
          *   <li>ticketIdNotEquals -  (optional)</li>
          *   <li>ticketIdSpecified -  (optional)</li>
          *   <li>ticketIdIn -  (optional)</li>
          *   <li>ticketIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return Long
      */
      @RequestLine("GET /api/file-bookings/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&bucket.contains={bucketContains}&bucket.doesNotContain={bucketDoesNotContain}&bucket.equals={bucketEquals}&bucket.notEquals={bucketNotEquals}&bucket.specified={bucketSpecified}&bucket.in={bucketIn}&bucket.notIn={bucketNotIn}&objectKey.contains={objectKeyContains}&objectKey.doesNotContain={objectKeyDoesNotContain}&objectKey.equals={objectKeyEquals}&objectKey.notEquals={objectKeyNotEquals}&objectKey.specified={objectKeySpecified}&objectKey.in={objectKeyIn}&objectKey.notIn={objectKeyNotIn}&contentType.contains={contentTypeContains}&contentType.doesNotContain={contentTypeDoesNotContain}&contentType.equals={contentTypeEquals}&contentType.notEquals={contentTypeNotEquals}&contentType.specified={contentTypeSpecified}&contentType.in={contentTypeIn}&contentType.notIn={contentTypeNotIn}&size.greaterThan={sizeGreaterThan}&size.lessThan={sizeLessThan}&size.greaterThanOrEqual={sizeGreaterThanOrEqual}&size.lessThanOrEqual={sizeLessThanOrEqual}&size.equals={sizeEquals}&size.notEquals={sizeNotEquals}&size.specified={sizeSpecified}&size.in={sizeIn}&size.notIn={sizeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&ticketId.greaterThan={ticketIdGreaterThan}&ticketId.lessThan={ticketIdLessThan}&ticketId.greaterThanOrEqual={ticketIdGreaterThanOrEqual}&ticketId.lessThanOrEqual={ticketIdLessThanOrEqual}&ticketId.equals={ticketIdEquals}&ticketId.notEquals={ticketIdNotEquals}&ticketId.specified={ticketIdSpecified}&ticketId.in={ticketIdIn}&ticketId.notIn={ticketIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countFileBookingsWithHttpInfo(@QueryMap(encoded=true) CountFileBookingsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countFileBookings</code> method in a fluent style.
   */
  public static class CountFileBookingsQueryParams extends HashMap<String, Object> {
    public CountFileBookingsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams bucketContains(@jakarta.annotation.Nullable final String value) {
      put("bucket.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams bucketDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("bucket.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams bucketEquals(@jakarta.annotation.Nullable final String value) {
      put("bucket.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams bucketNotEquals(@jakarta.annotation.Nullable final String value) {
      put("bucket.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams bucketSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("bucket.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams bucketIn(@jakarta.annotation.Nullable final List<String> value) {
      put("bucket.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams bucketNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("bucket.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams objectKeyContains(@jakarta.annotation.Nullable final String value) {
      put("objectKey.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams objectKeyDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("objectKey.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams objectKeyEquals(@jakarta.annotation.Nullable final String value) {
      put("objectKey.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams objectKeyNotEquals(@jakarta.annotation.Nullable final String value) {
      put("objectKey.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams objectKeySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("objectKey.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams objectKeyIn(@jakarta.annotation.Nullable final List<String> value) {
      put("objectKey.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams objectKeyNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("objectKey.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams contentTypeContains(@jakarta.annotation.Nullable final String value) {
      put("contentType.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams contentTypeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("contentType.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams contentTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("contentType.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams contentTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("contentType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams contentTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("contentType.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams contentTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("contentType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams contentTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("contentType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams sizeGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("size.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams sizeLessThan(@jakarta.annotation.Nullable final Long value) {
      put("size.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams sizeGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("size.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams sizeLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("size.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams sizeEquals(@jakarta.annotation.Nullable final Long value) {
      put("size.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams sizeNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("size.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams sizeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("size.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams sizeIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("size.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams sizeNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("size.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams ticketIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("ticketId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams ticketIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("ticketId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams ticketIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("ticketId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams ticketIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("ticketId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams ticketIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("ticketId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams ticketIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("ticketId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams ticketIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("ticketId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountFileBookingsQueryParams ticketIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("ticketId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams ticketIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("ticketId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountFileBookingsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param fileBookingDTO  (required)
   * @return FileBookingDTO
   */
  @RequestLine("POST /api/file-bookings")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  FileBookingDTO createFileBooking(@jakarta.annotation.Nonnull FileBookingDTO fileBookingDTO);

  /**
   * 
   * Similar to <code>createFileBooking</code> but it also returns the http response headers .
   * 
   * @param fileBookingDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/file-bookings")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<FileBookingDTO> createFileBookingWithHttpInfo(@jakarta.annotation.Nonnull FileBookingDTO fileBookingDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/file-bookings/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteFileBooking(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deleteFileBooking</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/file-bookings/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteFileBookingWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



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
   * @param bucketContains  (optional)
   * @param bucketDoesNotContain  (optional)
   * @param bucketEquals  (optional)
   * @param bucketNotEquals  (optional)
   * @param bucketSpecified  (optional)
   * @param bucketIn  (optional)
   * @param bucketNotIn  (optional)
   * @param objectKeyContains  (optional)
   * @param objectKeyDoesNotContain  (optional)
   * @param objectKeyEquals  (optional)
   * @param objectKeyNotEquals  (optional)
   * @param objectKeySpecified  (optional)
   * @param objectKeyIn  (optional)
   * @param objectKeyNotIn  (optional)
   * @param contentTypeContains  (optional)
   * @param contentTypeDoesNotContain  (optional)
   * @param contentTypeEquals  (optional)
   * @param contentTypeNotEquals  (optional)
   * @param contentTypeSpecified  (optional)
   * @param contentTypeIn  (optional)
   * @param contentTypeNotIn  (optional)
   * @param sizeGreaterThan  (optional)
   * @param sizeLessThan  (optional)
   * @param sizeGreaterThanOrEqual  (optional)
   * @param sizeLessThanOrEqual  (optional)
   * @param sizeEquals  (optional)
   * @param sizeNotEquals  (optional)
   * @param sizeSpecified  (optional)
   * @param sizeIn  (optional)
   * @param sizeNotIn  (optional)
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
   * @param ticketIdGreaterThan  (optional)
   * @param ticketIdLessThan  (optional)
   * @param ticketIdGreaterThanOrEqual  (optional)
   * @param ticketIdLessThanOrEqual  (optional)
   * @param ticketIdEquals  (optional)
   * @param ticketIdNotEquals  (optional)
   * @param ticketIdSpecified  (optional)
   * @param ticketIdIn  (optional)
   * @param ticketIdNotIn  (optional)
   * @param distinct  (optional)
   * @return List&lt;FileBookingDTO&gt;
   */
  @RequestLine("GET /api/file-bookings?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&bucket.contains={bucketContains}&bucket.doesNotContain={bucketDoesNotContain}&bucket.equals={bucketEquals}&bucket.notEquals={bucketNotEquals}&bucket.specified={bucketSpecified}&bucket.in={bucketIn}&bucket.notIn={bucketNotIn}&objectKey.contains={objectKeyContains}&objectKey.doesNotContain={objectKeyDoesNotContain}&objectKey.equals={objectKeyEquals}&objectKey.notEquals={objectKeyNotEquals}&objectKey.specified={objectKeySpecified}&objectKey.in={objectKeyIn}&objectKey.notIn={objectKeyNotIn}&contentType.contains={contentTypeContains}&contentType.doesNotContain={contentTypeDoesNotContain}&contentType.equals={contentTypeEquals}&contentType.notEquals={contentTypeNotEquals}&contentType.specified={contentTypeSpecified}&contentType.in={contentTypeIn}&contentType.notIn={contentTypeNotIn}&size.greaterThan={sizeGreaterThan}&size.lessThan={sizeLessThan}&size.greaterThanOrEqual={sizeGreaterThanOrEqual}&size.lessThanOrEqual={sizeLessThanOrEqual}&size.equals={sizeEquals}&size.notEquals={sizeNotEquals}&size.specified={sizeSpecified}&size.in={sizeIn}&size.notIn={sizeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&ticketId.greaterThan={ticketIdGreaterThan}&ticketId.lessThan={ticketIdLessThan}&ticketId.greaterThanOrEqual={ticketIdGreaterThanOrEqual}&ticketId.lessThanOrEqual={ticketIdLessThanOrEqual}&ticketId.equals={ticketIdEquals}&ticketId.notEquals={ticketIdNotEquals}&ticketId.specified={ticketIdSpecified}&ticketId.in={ticketIdIn}&ticketId.notIn={ticketIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  List<FileBookingDTO> getAllFileBookings(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("bucketContains") @jakarta.annotation.Nullable String bucketContains, @Param("bucketDoesNotContain") @jakarta.annotation.Nullable String bucketDoesNotContain, @Param("bucketEquals") @jakarta.annotation.Nullable String bucketEquals, @Param("bucketNotEquals") @jakarta.annotation.Nullable String bucketNotEquals, @Param("bucketSpecified") @jakarta.annotation.Nullable Boolean bucketSpecified, @Param("bucketIn") @jakarta.annotation.Nullable List<String> bucketIn, @Param("bucketNotIn") @jakarta.annotation.Nullable List<String> bucketNotIn, @Param("objectKeyContains") @jakarta.annotation.Nullable String objectKeyContains, @Param("objectKeyDoesNotContain") @jakarta.annotation.Nullable String objectKeyDoesNotContain, @Param("objectKeyEquals") @jakarta.annotation.Nullable String objectKeyEquals, @Param("objectKeyNotEquals") @jakarta.annotation.Nullable String objectKeyNotEquals, @Param("objectKeySpecified") @jakarta.annotation.Nullable Boolean objectKeySpecified, @Param("objectKeyIn") @jakarta.annotation.Nullable List<String> objectKeyIn, @Param("objectKeyNotIn") @jakarta.annotation.Nullable List<String> objectKeyNotIn, @Param("contentTypeContains") @jakarta.annotation.Nullable String contentTypeContains, @Param("contentTypeDoesNotContain") @jakarta.annotation.Nullable String contentTypeDoesNotContain, @Param("contentTypeEquals") @jakarta.annotation.Nullable String contentTypeEquals, @Param("contentTypeNotEquals") @jakarta.annotation.Nullable String contentTypeNotEquals, @Param("contentTypeSpecified") @jakarta.annotation.Nullable Boolean contentTypeSpecified, @Param("contentTypeIn") @jakarta.annotation.Nullable List<String> contentTypeIn, @Param("contentTypeNotIn") @jakarta.annotation.Nullable List<String> contentTypeNotIn, @Param("sizeGreaterThan") @jakarta.annotation.Nullable Long sizeGreaterThan, @Param("sizeLessThan") @jakarta.annotation.Nullable Long sizeLessThan, @Param("sizeGreaterThanOrEqual") @jakarta.annotation.Nullable Long sizeGreaterThanOrEqual, @Param("sizeLessThanOrEqual") @jakarta.annotation.Nullable Long sizeLessThanOrEqual, @Param("sizeEquals") @jakarta.annotation.Nullable Long sizeEquals, @Param("sizeNotEquals") @jakarta.annotation.Nullable Long sizeNotEquals, @Param("sizeSpecified") @jakarta.annotation.Nullable Boolean sizeSpecified, @Param("sizeIn") @jakarta.annotation.Nullable List<Long> sizeIn, @Param("sizeNotIn") @jakarta.annotation.Nullable List<Long> sizeNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("ticketIdGreaterThan") @jakarta.annotation.Nullable Long ticketIdGreaterThan, @Param("ticketIdLessThan") @jakarta.annotation.Nullable Long ticketIdLessThan, @Param("ticketIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long ticketIdGreaterThanOrEqual, @Param("ticketIdLessThanOrEqual") @jakarta.annotation.Nullable Long ticketIdLessThanOrEqual, @Param("ticketIdEquals") @jakarta.annotation.Nullable Long ticketIdEquals, @Param("ticketIdNotEquals") @jakarta.annotation.Nullable Long ticketIdNotEquals, @Param("ticketIdSpecified") @jakarta.annotation.Nullable Boolean ticketIdSpecified, @Param("ticketIdIn") @jakarta.annotation.Nullable List<Long> ticketIdIn, @Param("ticketIdNotIn") @jakarta.annotation.Nullable List<Long> ticketIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>getAllFileBookings</code> but it also returns the http response headers .
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
   * @param bucketContains  (optional)
   * @param bucketDoesNotContain  (optional)
   * @param bucketEquals  (optional)
   * @param bucketNotEquals  (optional)
   * @param bucketSpecified  (optional)
   * @param bucketIn  (optional)
   * @param bucketNotIn  (optional)
   * @param objectKeyContains  (optional)
   * @param objectKeyDoesNotContain  (optional)
   * @param objectKeyEquals  (optional)
   * @param objectKeyNotEquals  (optional)
   * @param objectKeySpecified  (optional)
   * @param objectKeyIn  (optional)
   * @param objectKeyNotIn  (optional)
   * @param contentTypeContains  (optional)
   * @param contentTypeDoesNotContain  (optional)
   * @param contentTypeEquals  (optional)
   * @param contentTypeNotEquals  (optional)
   * @param contentTypeSpecified  (optional)
   * @param contentTypeIn  (optional)
   * @param contentTypeNotIn  (optional)
   * @param sizeGreaterThan  (optional)
   * @param sizeLessThan  (optional)
   * @param sizeGreaterThanOrEqual  (optional)
   * @param sizeLessThanOrEqual  (optional)
   * @param sizeEquals  (optional)
   * @param sizeNotEquals  (optional)
   * @param sizeSpecified  (optional)
   * @param sizeIn  (optional)
   * @param sizeNotIn  (optional)
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
   * @param ticketIdGreaterThan  (optional)
   * @param ticketIdLessThan  (optional)
   * @param ticketIdGreaterThanOrEqual  (optional)
   * @param ticketIdLessThanOrEqual  (optional)
   * @param ticketIdEquals  (optional)
   * @param ticketIdNotEquals  (optional)
   * @param ticketIdSpecified  (optional)
   * @param ticketIdIn  (optional)
   * @param ticketIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/file-bookings?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&bucket.contains={bucketContains}&bucket.doesNotContain={bucketDoesNotContain}&bucket.equals={bucketEquals}&bucket.notEquals={bucketNotEquals}&bucket.specified={bucketSpecified}&bucket.in={bucketIn}&bucket.notIn={bucketNotIn}&objectKey.contains={objectKeyContains}&objectKey.doesNotContain={objectKeyDoesNotContain}&objectKey.equals={objectKeyEquals}&objectKey.notEquals={objectKeyNotEquals}&objectKey.specified={objectKeySpecified}&objectKey.in={objectKeyIn}&objectKey.notIn={objectKeyNotIn}&contentType.contains={contentTypeContains}&contentType.doesNotContain={contentTypeDoesNotContain}&contentType.equals={contentTypeEquals}&contentType.notEquals={contentTypeNotEquals}&contentType.specified={contentTypeSpecified}&contentType.in={contentTypeIn}&contentType.notIn={contentTypeNotIn}&size.greaterThan={sizeGreaterThan}&size.lessThan={sizeLessThan}&size.greaterThanOrEqual={sizeGreaterThanOrEqual}&size.lessThanOrEqual={sizeLessThanOrEqual}&size.equals={sizeEquals}&size.notEquals={sizeNotEquals}&size.specified={sizeSpecified}&size.in={sizeIn}&size.notIn={sizeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&ticketId.greaterThan={ticketIdGreaterThan}&ticketId.lessThan={ticketIdLessThan}&ticketId.greaterThanOrEqual={ticketIdGreaterThanOrEqual}&ticketId.lessThanOrEqual={ticketIdLessThanOrEqual}&ticketId.equals={ticketIdEquals}&ticketId.notEquals={ticketIdNotEquals}&ticketId.specified={ticketIdSpecified}&ticketId.in={ticketIdIn}&ticketId.notIn={ticketIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<FileBookingDTO>> getAllFileBookingsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("bucketContains") @jakarta.annotation.Nullable String bucketContains, @Param("bucketDoesNotContain") @jakarta.annotation.Nullable String bucketDoesNotContain, @Param("bucketEquals") @jakarta.annotation.Nullable String bucketEquals, @Param("bucketNotEquals") @jakarta.annotation.Nullable String bucketNotEquals, @Param("bucketSpecified") @jakarta.annotation.Nullable Boolean bucketSpecified, @Param("bucketIn") @jakarta.annotation.Nullable List<String> bucketIn, @Param("bucketNotIn") @jakarta.annotation.Nullable List<String> bucketNotIn, @Param("objectKeyContains") @jakarta.annotation.Nullable String objectKeyContains, @Param("objectKeyDoesNotContain") @jakarta.annotation.Nullable String objectKeyDoesNotContain, @Param("objectKeyEquals") @jakarta.annotation.Nullable String objectKeyEquals, @Param("objectKeyNotEquals") @jakarta.annotation.Nullable String objectKeyNotEquals, @Param("objectKeySpecified") @jakarta.annotation.Nullable Boolean objectKeySpecified, @Param("objectKeyIn") @jakarta.annotation.Nullable List<String> objectKeyIn, @Param("objectKeyNotIn") @jakarta.annotation.Nullable List<String> objectKeyNotIn, @Param("contentTypeContains") @jakarta.annotation.Nullable String contentTypeContains, @Param("contentTypeDoesNotContain") @jakarta.annotation.Nullable String contentTypeDoesNotContain, @Param("contentTypeEquals") @jakarta.annotation.Nullable String contentTypeEquals, @Param("contentTypeNotEquals") @jakarta.annotation.Nullable String contentTypeNotEquals, @Param("contentTypeSpecified") @jakarta.annotation.Nullable Boolean contentTypeSpecified, @Param("contentTypeIn") @jakarta.annotation.Nullable List<String> contentTypeIn, @Param("contentTypeNotIn") @jakarta.annotation.Nullable List<String> contentTypeNotIn, @Param("sizeGreaterThan") @jakarta.annotation.Nullable Long sizeGreaterThan, @Param("sizeLessThan") @jakarta.annotation.Nullable Long sizeLessThan, @Param("sizeGreaterThanOrEqual") @jakarta.annotation.Nullable Long sizeGreaterThanOrEqual, @Param("sizeLessThanOrEqual") @jakarta.annotation.Nullable Long sizeLessThanOrEqual, @Param("sizeEquals") @jakarta.annotation.Nullable Long sizeEquals, @Param("sizeNotEquals") @jakarta.annotation.Nullable Long sizeNotEquals, @Param("sizeSpecified") @jakarta.annotation.Nullable Boolean sizeSpecified, @Param("sizeIn") @jakarta.annotation.Nullable List<Long> sizeIn, @Param("sizeNotIn") @jakarta.annotation.Nullable List<Long> sizeNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("ticketIdGreaterThan") @jakarta.annotation.Nullable Long ticketIdGreaterThan, @Param("ticketIdLessThan") @jakarta.annotation.Nullable Long ticketIdLessThan, @Param("ticketIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long ticketIdGreaterThanOrEqual, @Param("ticketIdLessThanOrEqual") @jakarta.annotation.Nullable Long ticketIdLessThanOrEqual, @Param("ticketIdEquals") @jakarta.annotation.Nullable Long ticketIdEquals, @Param("ticketIdNotEquals") @jakarta.annotation.Nullable Long ticketIdNotEquals, @Param("ticketIdSpecified") @jakarta.annotation.Nullable Boolean ticketIdSpecified, @Param("ticketIdIn") @jakarta.annotation.Nullable List<Long> ticketIdIn, @Param("ticketIdNotIn") @jakarta.annotation.Nullable List<Long> ticketIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllFileBookings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllFileBookingsQueryParams} class that allows for
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
   *   <li>bucketContains -  (optional)</li>
   *   <li>bucketDoesNotContain -  (optional)</li>
   *   <li>bucketEquals -  (optional)</li>
   *   <li>bucketNotEquals -  (optional)</li>
   *   <li>bucketSpecified -  (optional)</li>
   *   <li>bucketIn -  (optional)</li>
   *   <li>bucketNotIn -  (optional)</li>
   *   <li>objectKeyContains -  (optional)</li>
   *   <li>objectKeyDoesNotContain -  (optional)</li>
   *   <li>objectKeyEquals -  (optional)</li>
   *   <li>objectKeyNotEquals -  (optional)</li>
   *   <li>objectKeySpecified -  (optional)</li>
   *   <li>objectKeyIn -  (optional)</li>
   *   <li>objectKeyNotIn -  (optional)</li>
   *   <li>contentTypeContains -  (optional)</li>
   *   <li>contentTypeDoesNotContain -  (optional)</li>
   *   <li>contentTypeEquals -  (optional)</li>
   *   <li>contentTypeNotEquals -  (optional)</li>
   *   <li>contentTypeSpecified -  (optional)</li>
   *   <li>contentTypeIn -  (optional)</li>
   *   <li>contentTypeNotIn -  (optional)</li>
   *   <li>sizeGreaterThan -  (optional)</li>
   *   <li>sizeLessThan -  (optional)</li>
   *   <li>sizeGreaterThanOrEqual -  (optional)</li>
   *   <li>sizeLessThanOrEqual -  (optional)</li>
   *   <li>sizeEquals -  (optional)</li>
   *   <li>sizeNotEquals -  (optional)</li>
   *   <li>sizeSpecified -  (optional)</li>
   *   <li>sizeIn -  (optional)</li>
   *   <li>sizeNotIn -  (optional)</li>
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
   *   <li>ticketIdGreaterThan -  (optional)</li>
   *   <li>ticketIdLessThan -  (optional)</li>
   *   <li>ticketIdGreaterThanOrEqual -  (optional)</li>
   *   <li>ticketIdLessThanOrEqual -  (optional)</li>
   *   <li>ticketIdEquals -  (optional)</li>
   *   <li>ticketIdNotEquals -  (optional)</li>
   *   <li>ticketIdSpecified -  (optional)</li>
   *   <li>ticketIdIn -  (optional)</li>
   *   <li>ticketIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return List&lt;FileBookingDTO&gt;
   */
  @RequestLine("GET /api/file-bookings?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&bucket.contains={bucketContains}&bucket.doesNotContain={bucketDoesNotContain}&bucket.equals={bucketEquals}&bucket.notEquals={bucketNotEquals}&bucket.specified={bucketSpecified}&bucket.in={bucketIn}&bucket.notIn={bucketNotIn}&objectKey.contains={objectKeyContains}&objectKey.doesNotContain={objectKeyDoesNotContain}&objectKey.equals={objectKeyEquals}&objectKey.notEquals={objectKeyNotEquals}&objectKey.specified={objectKeySpecified}&objectKey.in={objectKeyIn}&objectKey.notIn={objectKeyNotIn}&contentType.contains={contentTypeContains}&contentType.doesNotContain={contentTypeDoesNotContain}&contentType.equals={contentTypeEquals}&contentType.notEquals={contentTypeNotEquals}&contentType.specified={contentTypeSpecified}&contentType.in={contentTypeIn}&contentType.notIn={contentTypeNotIn}&size.greaterThan={sizeGreaterThan}&size.lessThan={sizeLessThan}&size.greaterThanOrEqual={sizeGreaterThanOrEqual}&size.lessThanOrEqual={sizeLessThanOrEqual}&size.equals={sizeEquals}&size.notEquals={sizeNotEquals}&size.specified={sizeSpecified}&size.in={sizeIn}&size.notIn={sizeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&ticketId.greaterThan={ticketIdGreaterThan}&ticketId.lessThan={ticketIdLessThan}&ticketId.greaterThanOrEqual={ticketIdGreaterThanOrEqual}&ticketId.lessThanOrEqual={ticketIdLessThanOrEqual}&ticketId.equals={ticketIdEquals}&ticketId.notEquals={ticketIdNotEquals}&ticketId.specified={ticketIdSpecified}&ticketId.in={ticketIdIn}&ticketId.notIn={ticketIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  List<FileBookingDTO> getAllFileBookings(@QueryMap(encoded=true) GetAllFileBookingsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllFileBookings</code> that receives the query parameters as a map,
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
          *   <li>bucketContains -  (optional)</li>
          *   <li>bucketDoesNotContain -  (optional)</li>
          *   <li>bucketEquals -  (optional)</li>
          *   <li>bucketNotEquals -  (optional)</li>
          *   <li>bucketSpecified -  (optional)</li>
          *   <li>bucketIn -  (optional)</li>
          *   <li>bucketNotIn -  (optional)</li>
          *   <li>objectKeyContains -  (optional)</li>
          *   <li>objectKeyDoesNotContain -  (optional)</li>
          *   <li>objectKeyEquals -  (optional)</li>
          *   <li>objectKeyNotEquals -  (optional)</li>
          *   <li>objectKeySpecified -  (optional)</li>
          *   <li>objectKeyIn -  (optional)</li>
          *   <li>objectKeyNotIn -  (optional)</li>
          *   <li>contentTypeContains -  (optional)</li>
          *   <li>contentTypeDoesNotContain -  (optional)</li>
          *   <li>contentTypeEquals -  (optional)</li>
          *   <li>contentTypeNotEquals -  (optional)</li>
          *   <li>contentTypeSpecified -  (optional)</li>
          *   <li>contentTypeIn -  (optional)</li>
          *   <li>contentTypeNotIn -  (optional)</li>
          *   <li>sizeGreaterThan -  (optional)</li>
          *   <li>sizeLessThan -  (optional)</li>
          *   <li>sizeGreaterThanOrEqual -  (optional)</li>
          *   <li>sizeLessThanOrEqual -  (optional)</li>
          *   <li>sizeEquals -  (optional)</li>
          *   <li>sizeNotEquals -  (optional)</li>
          *   <li>sizeSpecified -  (optional)</li>
          *   <li>sizeIn -  (optional)</li>
          *   <li>sizeNotIn -  (optional)</li>
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
          *   <li>ticketIdGreaterThan -  (optional)</li>
          *   <li>ticketIdLessThan -  (optional)</li>
          *   <li>ticketIdGreaterThanOrEqual -  (optional)</li>
          *   <li>ticketIdLessThanOrEqual -  (optional)</li>
          *   <li>ticketIdEquals -  (optional)</li>
          *   <li>ticketIdNotEquals -  (optional)</li>
          *   <li>ticketIdSpecified -  (optional)</li>
          *   <li>ticketIdIn -  (optional)</li>
          *   <li>ticketIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return List&lt;FileBookingDTO&gt;
      */
      @RequestLine("GET /api/file-bookings?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&bucket.contains={bucketContains}&bucket.doesNotContain={bucketDoesNotContain}&bucket.equals={bucketEquals}&bucket.notEquals={bucketNotEquals}&bucket.specified={bucketSpecified}&bucket.in={bucketIn}&bucket.notIn={bucketNotIn}&objectKey.contains={objectKeyContains}&objectKey.doesNotContain={objectKeyDoesNotContain}&objectKey.equals={objectKeyEquals}&objectKey.notEquals={objectKeyNotEquals}&objectKey.specified={objectKeySpecified}&objectKey.in={objectKeyIn}&objectKey.notIn={objectKeyNotIn}&contentType.contains={contentTypeContains}&contentType.doesNotContain={contentTypeDoesNotContain}&contentType.equals={contentTypeEquals}&contentType.notEquals={contentTypeNotEquals}&contentType.specified={contentTypeSpecified}&contentType.in={contentTypeIn}&contentType.notIn={contentTypeNotIn}&size.greaterThan={sizeGreaterThan}&size.lessThan={sizeLessThan}&size.greaterThanOrEqual={sizeGreaterThanOrEqual}&size.lessThanOrEqual={sizeLessThanOrEqual}&size.equals={sizeEquals}&size.notEquals={sizeNotEquals}&size.specified={sizeSpecified}&size.in={sizeIn}&size.notIn={sizeNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&ticketId.greaterThan={ticketIdGreaterThan}&ticketId.lessThan={ticketIdLessThan}&ticketId.greaterThanOrEqual={ticketIdGreaterThanOrEqual}&ticketId.lessThanOrEqual={ticketIdLessThanOrEqual}&ticketId.equals={ticketIdEquals}&ticketId.notEquals={ticketIdNotEquals}&ticketId.specified={ticketIdSpecified}&ticketId.in={ticketIdIn}&ticketId.notIn={ticketIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<FileBookingDTO>> getAllFileBookingsWithHttpInfo(@QueryMap(encoded=true) GetAllFileBookingsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllFileBookings</code> method in a fluent style.
   */
  public static class GetAllFileBookingsQueryParams extends HashMap<String, Object> {
    public GetAllFileBookingsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams bucketContains(@jakarta.annotation.Nullable final String value) {
      put("bucket.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams bucketDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("bucket.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams bucketEquals(@jakarta.annotation.Nullable final String value) {
      put("bucket.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams bucketNotEquals(@jakarta.annotation.Nullable final String value) {
      put("bucket.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams bucketSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("bucket.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams bucketIn(@jakarta.annotation.Nullable final List<String> value) {
      put("bucket.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams bucketNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("bucket.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams objectKeyContains(@jakarta.annotation.Nullable final String value) {
      put("objectKey.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams objectKeyDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("objectKey.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams objectKeyEquals(@jakarta.annotation.Nullable final String value) {
      put("objectKey.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams objectKeyNotEquals(@jakarta.annotation.Nullable final String value) {
      put("objectKey.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams objectKeySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("objectKey.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams objectKeyIn(@jakarta.annotation.Nullable final List<String> value) {
      put("objectKey.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams objectKeyNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("objectKey.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams contentTypeContains(@jakarta.annotation.Nullable final String value) {
      put("contentType.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams contentTypeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("contentType.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams contentTypeEquals(@jakarta.annotation.Nullable final String value) {
      put("contentType.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams contentTypeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("contentType.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams contentTypeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("contentType.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams contentTypeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("contentType.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams contentTypeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("contentType.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams sizeGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("size.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams sizeLessThan(@jakarta.annotation.Nullable final Long value) {
      put("size.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams sizeGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("size.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams sizeLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("size.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams sizeEquals(@jakarta.annotation.Nullable final Long value) {
      put("size.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams sizeNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("size.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams sizeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("size.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams sizeIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("size.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams sizeNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("size.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams ticketIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("ticketId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams ticketIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("ticketId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams ticketIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("ticketId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams ticketIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("ticketId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams ticketIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("ticketId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams ticketIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("ticketId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams ticketIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("ticketId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllFileBookingsQueryParams ticketIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("ticketId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams ticketIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("ticketId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllFileBookingsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return FileBookingDTO
   */
  @RequestLine("GET /api/file-bookings/{id}")
  @Headers({
    "Accept: */*",
  })
  FileBookingDTO getFileBooking(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getFileBooking</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/file-bookings/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<FileBookingDTO> getFileBookingWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param fileBookingDTO  (required)
   * @return FileBookingDTO
   */
  @RequestLine("PATCH /api/file-bookings/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  FileBookingDTO partialUpdateFileBooking(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull FileBookingDTO fileBookingDTO);

  /**
   * 
   * Similar to <code>partialUpdateFileBooking</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param fileBookingDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/file-bookings/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<FileBookingDTO> partialUpdateFileBookingWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull FileBookingDTO fileBookingDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param fileBookingDTO  (required)
   * @return FileBookingDTO
   */
  @RequestLine("PUT /api/file-bookings/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  FileBookingDTO updateFileBooking(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull FileBookingDTO fileBookingDTO);

  /**
   * 
   * Similar to <code>updateFileBooking</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param fileBookingDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/file-bookings/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<FileBookingDTO> updateFileBookingWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull FileBookingDTO fileBookingDTO);


}
