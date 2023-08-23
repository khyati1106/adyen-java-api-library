/*
 * Adyen Payment API
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * Phone
 */
@JsonPropertyOrder({
  Phone.JSON_PROPERTY_CC,
  Phone.JSON_PROPERTY_SUBSCRIBER
})

public class Phone {
  public static final String JSON_PROPERTY_CC = "cc";
  private String cc;

  public static final String JSON_PROPERTY_SUBSCRIBER = "subscriber";
  private String subscriber;

  public Phone() { 
  }

  public Phone cc(String cc) {
    this.cc = cc;
    return this;
  }

   /**
   * Country code. Length: 1–3 characters.
   * @return cc
  **/
  @ApiModelProperty(value = "Country code. Length: 1–3 characters.")
  @JsonProperty(JSON_PROPERTY_CC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCc() {
    return cc;
  }


  @JsonProperty(JSON_PROPERTY_CC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCc(String cc) {
    this.cc = cc;
  }


  public Phone subscriber(String subscriber) {
    this.subscriber = subscriber;
    return this;
  }

   /**
   * Subscriber number. Maximum length: 15 characters.
   * @return subscriber
  **/
  @ApiModelProperty(value = "Subscriber number. Maximum length: 15 characters.")
  @JsonProperty(JSON_PROPERTY_SUBSCRIBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubscriber() {
    return subscriber;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriber(String subscriber) {
    this.subscriber = subscriber;
  }


  /**
   * Return true if this Phone object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phone phone = (Phone) o;
    return Objects.equals(this.cc, phone.cc) &&
        Objects.equals(this.subscriber, phone.subscriber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cc, subscriber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
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
   * Create an instance of Phone given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Phone
   * @throws JsonProcessingException if the JSON string is invalid with respect to Phone
   */
  public static Phone fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Phone.class);
  }
/**
  * Convert an instance of Phone to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
