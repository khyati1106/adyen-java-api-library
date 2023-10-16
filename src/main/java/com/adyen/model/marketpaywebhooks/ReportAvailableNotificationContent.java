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
 * ReportAvailableNotificationContent
 */
@JsonPropertyOrder({
  ReportAvailableNotificationContent.JSON_PROPERTY_ACCOUNT_CODE,
  ReportAvailableNotificationContent.JSON_PROPERTY_ACCOUNT_TYPE,
  ReportAvailableNotificationContent.JSON_PROPERTY_EVENT_DATE,
  ReportAvailableNotificationContent.JSON_PROPERTY_REMOTE_ACCESS_URL,
  ReportAvailableNotificationContent.JSON_PROPERTY_SUCCESS
})

public class ReportAvailableNotificationContent {
  public static final String JSON_PROPERTY_ACCOUNT_CODE = "accountCode";
  private String accountCode;

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "accountType";
  private String accountType;

  public static final String JSON_PROPERTY_EVENT_DATE = "eventDate";
  private OffsetDateTime eventDate;

  public static final String JSON_PROPERTY_REMOTE_ACCESS_URL = "remoteAccessUrl";
  private String remoteAccessUrl;

  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public ReportAvailableNotificationContent() { 
  }

  public ReportAvailableNotificationContent accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

   /**
   * The code of the Account to which the report applies.
   * @return accountCode
  **/
  @ApiModelProperty(value = "The code of the Account to which the report applies.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountCode() {
    return accountCode;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }


  public ReportAvailableNotificationContent accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * The type of Account to which the report applies.
   * @return accountType
  **/
  @ApiModelProperty(value = "The type of Account to which the report applies.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountType() {
    return accountType;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public ReportAvailableNotificationContent eventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * The date of the event to which the report applies.
   * @return eventDate
  **/
  @ApiModelProperty(value = "The date of the event to which the report applies.")
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


  public ReportAvailableNotificationContent remoteAccessUrl(String remoteAccessUrl) {
    this.remoteAccessUrl = remoteAccessUrl;
    return this;
  }

   /**
   * The URL at which the report can be accessed.
   * @return remoteAccessUrl
  **/
  @ApiModelProperty(value = "The URL at which the report can be accessed.")
  @JsonProperty(JSON_PROPERTY_REMOTE_ACCESS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRemoteAccessUrl() {
    return remoteAccessUrl;
  }


  @JsonProperty(JSON_PROPERTY_REMOTE_ACCESS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemoteAccessUrl(String remoteAccessUrl) {
    this.remoteAccessUrl = remoteAccessUrl;
  }


  public ReportAvailableNotificationContent success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Indicates whether the event resulted in a success.
   * @return success
  **/
  @ApiModelProperty(value = "Indicates whether the event resulted in a success.")
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  /**
   * Return true if this ReportAvailableNotificationContent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportAvailableNotificationContent reportAvailableNotificationContent = (ReportAvailableNotificationContent) o;
    return Objects.equals(this.accountCode, reportAvailableNotificationContent.accountCode) &&
        Objects.equals(this.accountType, reportAvailableNotificationContent.accountType) &&
        Objects.equals(this.eventDate, reportAvailableNotificationContent.eventDate) &&
        Objects.equals(this.remoteAccessUrl, reportAvailableNotificationContent.remoteAccessUrl) &&
        Objects.equals(this.success, reportAvailableNotificationContent.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCode, accountType, eventDate, remoteAccessUrl, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAvailableNotificationContent {\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    remoteAccessUrl: ").append(toIndentedString(remoteAccessUrl)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
   * Create an instance of ReportAvailableNotificationContent given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReportAvailableNotificationContent
   * @throws JsonProcessingException if the JSON string is invalid with respect to ReportAvailableNotificationContent
   */
  public static ReportAvailableNotificationContent fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ReportAvailableNotificationContent.class);
  }
/**
  * Convert an instance of ReportAvailableNotificationContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

