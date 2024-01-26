/*
 * Adyen Terminal API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.terminal;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.terminal.TokenRequestedType;
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
 * Surrogate of the PAN (Primary Account Number) of the payment card to  identify the payment mean of the customer. It allows, for a merchant, to identify   the customer.
 */
@ApiModel(description = "Surrogate of the PAN (Primary Account Number) of the payment card to  identify the payment mean of the customer. It allows, for a merchant, to identify   the customer.")
@JsonPropertyOrder({
  PaymentToken.JSON_PROPERTY_TOKEN_REQUESTED_TYPE,
  PaymentToken.JSON_PROPERTY_TOKEN_VALUE,
  PaymentToken.JSON_PROPERTY_EXPIRY_DATE_TIME
})

public class PaymentToken {
  public static final String JSON_PROPERTY_TOKEN_REQUESTED_TYPE = "TokenRequestedType";
  private TokenRequestedType tokenRequestedType;

  public static final String JSON_PROPERTY_TOKEN_VALUE = "TokenValue";
  private String tokenValue;

  public static final String JSON_PROPERTY_EXPIRY_DATE_TIME = "ExpiryDateTime";
  private OffsetDateTime expiryDateTime;

  public PaymentToken() { 
  }

  public PaymentToken tokenRequestedType(TokenRequestedType tokenRequestedType) {
    this.tokenRequestedType = tokenRequestedType;
    return this;
  }

   /**
   * Get tokenRequestedType
   * @return tokenRequestedType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN_REQUESTED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TokenRequestedType getTokenRequestedType() {
    return tokenRequestedType;
  }


 /**
  * tokenRequestedType
  *
  * @param tokenRequestedType
  */ 
  @JsonProperty(JSON_PROPERTY_TOKEN_REQUESTED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenRequestedType(TokenRequestedType tokenRequestedType) {
    this.tokenRequestedType = tokenRequestedType;
  }


  public PaymentToken tokenValue(String tokenValue) {
    this.tokenValue = tokenValue;
    return this;
  }

   /**
   * Get tokenValue
   * @return tokenValue
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenValue() {
    return tokenValue;
  }


 /**
  * tokenValue
  *
  * @param tokenValue
  */ 
  @JsonProperty(JSON_PROPERTY_TOKEN_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenValue(String tokenValue) {
    this.tokenValue = tokenValue;
  }


  public PaymentToken expiryDateTime(OffsetDateTime expiryDateTime) {
    this.expiryDateTime = expiryDateTime;
    return this;
  }

   /**
   * Expiry date and time. Limits the validity of a payment token.
   * @return expiryDateTime
  **/
  @ApiModelProperty(value = "Expiry date and time. Limits the validity of a payment token.")
  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExpiryDateTime() {
    return expiryDateTime;
  }


 /**
  * Expiry date and time. Limits the validity of a payment token.
  *
  * @param expiryDateTime
  */ 
  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryDateTime(OffsetDateTime expiryDateTime) {
    this.expiryDateTime = expiryDateTime;
  }


  /**
   * Return true if this PaymentToken object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentToken paymentToken = (PaymentToken) o;
    return Objects.equals(this.tokenRequestedType, paymentToken.tokenRequestedType) &&
        Objects.equals(this.tokenValue, paymentToken.tokenValue) &&
        Objects.equals(this.expiryDateTime, paymentToken.expiryDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenRequestedType, tokenValue, expiryDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentToken {\n");
    sb.append("    tokenRequestedType: ").append(toIndentedString(tokenRequestedType)).append("\n");
    sb.append("    tokenValue: ").append(toIndentedString(tokenValue)).append("\n");
    sb.append("    expiryDateTime: ").append(toIndentedString(expiryDateTime)).append("\n");
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
   * Create an instance of PaymentToken given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentToken
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentToken
   */
  public static PaymentToken fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentToken.class);
  }
/**
  * Convert an instance of PaymentToken to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
