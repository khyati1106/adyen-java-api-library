/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

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
 * ResponsePaymentMethod
 */
@JsonPropertyOrder({
  ResponsePaymentMethod.JSON_PROPERTY_BRAND,
  ResponsePaymentMethod.JSON_PROPERTY_TYPE
})

public class ResponsePaymentMethod {
  public static final String JSON_PROPERTY_BRAND = "brand";
  private String brand;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public ResponsePaymentMethod() { 
  }

  public ResponsePaymentMethod brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The card brand that the shopper used to pay. Only returned if &#x60;paymentMethod.type&#x60; is **scheme**.
   * @return brand
  **/
  @ApiModelProperty(value = "The card brand that the shopper used to pay. Only returned if `paymentMethod.type` is **scheme**.")
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrand() {
    return brand;
  }


  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrand(String brand) {
    this.brand = brand;
  }


  public ResponsePaymentMethod type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The &#x60;paymentMethod.type&#x60; value used in the request.
   * @return type
  **/
  @ApiModelProperty(value = "The `paymentMethod.type` value used in the request.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this ResponsePaymentMethod object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsePaymentMethod responsePaymentMethod = (ResponsePaymentMethod) o;
    return Objects.equals(this.brand, responsePaymentMethod.brand) &&
        Objects.equals(this.type, responsePaymentMethod.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsePaymentMethod {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
   * Create an instance of ResponsePaymentMethod given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResponsePaymentMethod
   * @throws JsonProcessingException if the JSON string is invalid with respect to ResponsePaymentMethod
   */
  public static ResponsePaymentMethod fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ResponsePaymentMethod.class);
  }
/**
  * Convert an instance of ResponsePaymentMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
