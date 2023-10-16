/*
 * Classic Platforms - Notifications
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpaywebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.marketpaywebhooks.NotificationErrorContainer;
import com.adyen.model.marketpaywebhooks.TransferFundsNotificationContent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * TransferFundsNotification
 */
@JsonPropertyOrder({
  TransferFundsNotification.JSON_PROPERTY_CONTENT,
  TransferFundsNotification.JSON_PROPERTY_ERROR,
  TransferFundsNotification.JSON_PROPERTY_EVENT_DATE,
  TransferFundsNotification.JSON_PROPERTY_EVENT_TYPE,
  TransferFundsNotification.JSON_PROPERTY_EXECUTING_USER_KEY,
  TransferFundsNotification.JSON_PROPERTY_LIVE,
  TransferFundsNotification.JSON_PROPERTY_PSP_REFERENCE
})

public class TransferFundsNotification {
  public static final String JSON_PROPERTY_CONTENT = "content";
  private TransferFundsNotificationContent content;

  public static final String JSON_PROPERTY_ERROR = "error";
  private NotificationErrorContainer error;

  public static final String JSON_PROPERTY_EVENT_DATE = "eventDate";
  private OffsetDateTime eventDate;

  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private String eventType;

  public static final String JSON_PROPERTY_EXECUTING_USER_KEY = "executingUserKey";
  private String executingUserKey;

  public static final String JSON_PROPERTY_LIVE = "live";
  private Boolean live;

  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public TransferFundsNotification() { 
  }

  public TransferFundsNotification content(TransferFundsNotificationContent content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransferFundsNotificationContent getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(TransferFundsNotificationContent content) {
    this.content = content;
  }


  public TransferFundsNotification error(NotificationErrorContainer error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NotificationErrorContainer getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(NotificationErrorContainer error) {
    this.error = error;
  }


  public TransferFundsNotification eventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * The date and time when an event has been completed.
   * @return eventDate
  **/
  @ApiModelProperty(required = true, value = "The date and time when an event has been completed.")
  @JsonProperty(JSON_PROPERTY_EVENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEventDate() {
    return eventDate;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
  }


  public TransferFundsNotification eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * The event type of the notification.
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "The event type of the notification.")
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventType() {
    return eventType;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public TransferFundsNotification executingUserKey(String executingUserKey) {
    this.executingUserKey = executingUserKey;
    return this;
  }

   /**
   * The user or process that has triggered the notification.
   * @return executingUserKey
  **/
  @ApiModelProperty(required = true, value = "The user or process that has triggered the notification.")
  @JsonProperty(JSON_PROPERTY_EXECUTING_USER_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExecutingUserKey() {
    return executingUserKey;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTING_USER_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecutingUserKey(String executingUserKey) {
    this.executingUserKey = executingUserKey;
  }


  public TransferFundsNotification live(Boolean live) {
    this.live = live;
    return this;
  }

   /**
   * Indicates whether the notification originated from the live environment or the test environment. If true, the notification originated from the live environment. If false, the notification originated from the test environment.
   * @return live
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the notification originated from the live environment or the test environment. If true, the notification originated from the live environment. If false, the notification originated from the test environment.")
  @JsonProperty(JSON_PROPERTY_LIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLive() {
    return live;
  }


  @JsonProperty(JSON_PROPERTY_LIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLive(Boolean live) {
    this.live = live;
  }


  public TransferFundsNotification pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

   /**
   * The PSP reference of the request from which the notification originates.
   * @return pspReference
  **/
  @ApiModelProperty(required = true, value = "The PSP reference of the request from which the notification originates.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPspReference() {
    return pspReference;
  }


  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  /**
   * Return true if this TransferFundsNotification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferFundsNotification transferFundsNotification = (TransferFundsNotification) o;
    return Objects.equals(this.content, transferFundsNotification.content) &&
        Objects.equals(this.error, transferFundsNotification.error) &&
        Objects.equals(this.eventDate, transferFundsNotification.eventDate) &&
        Objects.equals(this.eventType, transferFundsNotification.eventType) &&
        Objects.equals(this.executingUserKey, transferFundsNotification.executingUserKey) &&
        Objects.equals(this.live, transferFundsNotification.live) &&
        Objects.equals(this.pspReference, transferFundsNotification.pspReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, error, eventDate, eventType, executingUserKey, live, pspReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferFundsNotification {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    executingUserKey: ").append(toIndentedString(executingUserKey)).append("\n");
    sb.append("    live: ").append(toIndentedString(live)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

/**
   * Create an instance of TransferFundsNotification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransferFundsNotification
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransferFundsNotification
   */
  public static TransferFundsNotification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransferFundsNotification.class);
  }
/**
  * Convert an instance of TransferFundsNotification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

