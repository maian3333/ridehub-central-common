package com.ridehub.feign.msuser.client.api;

import com.ridehub.feign.msuser.client.invoker.ApiClient;
import com.ridehub.feign.msuser.client.invoker.EncodingUtils;
import com.ridehub.feign.msuser.client.model.ApiResponse;

import com.ridehub.feign.msuser.client.model.ChatbotRequestDTO;
import com.ridehub.feign.msuser.client.model.ChatbotResponseDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface ChatbotMsuserApi extends ApiClient.Api {


  /**
   * Send a message to the AI chatbot
   * Send a message and receive an AI response. Supports conversation history through session management.
   * @param chatbotRequestDTO  (required)
   * @return ChatbotResponseDTO
   */
  @RequestLine("POST /api/chatbot/chat")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ChatbotResponseDTO chat(@jakarta.annotation.Nonnull ChatbotRequestDTO chatbotRequestDTO);

  /**
   * Send a message to the AI chatbot
   * Similar to <code>chat</code> but it also returns the http response headers .
   * Send a message and receive an AI response. Supports conversation history through session management.
   * @param chatbotRequestDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/chatbot/chat")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<ChatbotResponseDTO> chatWithHttpInfo(@jakarta.annotation.Nonnull ChatbotRequestDTO chatbotRequestDTO);



  /**
   * Check chatbot service health
   * Simple health check endpoint for the chatbot service
   * @return String
   */
  @RequestLine("GET /api/chatbot/health")
  @Headers({
    "Accept: */*",
  })
  String health();

  /**
   * Check chatbot service health
   * Similar to <code>health</code> but it also returns the http response headers .
   * Simple health check endpoint for the chatbot service
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/chatbot/health")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<String> healthWithHttpInfo();


}
