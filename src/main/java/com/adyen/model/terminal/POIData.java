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
import com.adyen.model.terminal.TransactionIDType;
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
 * In the Message Response, identification of the POI transaction. Data related to the POI System.
 */
@ApiModel(description = "In the Message Response, identification of the POI transaction. Data related to the POI System.")
@JsonPropertyOrder({
  POIData.JSON_PROPERTY_PO_I_TRANSACTION_I_D,
  POIData.JSON_PROPERTY_PO_I_RECONCILIATION_I_D
})

public class POIData {
  public static final String JSON_PROPERTY_PO_I_TRANSACTION_I_D = "POITransactionID";
  private TransactionIDType poITransactionID;

  public static final String JSON_PROPERTY_PO_I_RECONCILIATION_I_D = "POIReconciliationID";
  private Integer poIReconciliationID;

  public POIData() { 
  }

  public POIData poITransactionID(TransactionIDType poITransactionID) {
    this.poITransactionID = poITransactionID;
    return this;
  }

   /**
   * Get poITransactionID
   * @return poITransactionID
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PO_I_TRANSACTION_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionIDType getPoITransactionID() {
    return poITransactionID;
  }


 /**
  * poITransactionID
  *
  * @param poITransactionID
  */ 
  @JsonProperty(JSON_PROPERTY_PO_I_TRANSACTION_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoITransactionID(TransactionIDType poITransactionID) {
    this.poITransactionID = poITransactionID;
  }


  public POIData poIReconciliationID(Integer poIReconciliationID) {
    this.poIReconciliationID = poIReconciliationID;
    return this;
  }

   /**
   * If Result is Success.
   * @return poIReconciliationID
  **/
  @ApiModelProperty(value = "If Result is Success.")
  @JsonProperty(JSON_PROPERTY_PO_I_RECONCILIATION_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPoIReconciliationID() {
    return poIReconciliationID;
  }


 /**
  * If Result is Success.
  *
  * @param poIReconciliationID
  */ 
  @JsonProperty(JSON_PROPERTY_PO_I_RECONCILIATION_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoIReconciliationID(Integer poIReconciliationID) {
    this.poIReconciliationID = poIReconciliationID;
  }


  /**
   * Return true if this POIData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    POIData poIData = (POIData) o;
    return Objects.equals(this.poITransactionID, poIData.poITransactionID) &&
        Objects.equals(this.poIReconciliationID, poIData.poIReconciliationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poITransactionID, poIReconciliationID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class POIData {\n");
    sb.append("    poITransactionID: ").append(toIndentedString(poITransactionID)).append("\n");
    sb.append("    poIReconciliationID: ").append(toIndentedString(poIReconciliationID)).append("\n");
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
   * Create an instance of POIData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of POIData
   * @throws JsonProcessingException if the JSON string is invalid with respect to POIData
   */
  public static POIData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, POIData.class);
  }
/**
  * Convert an instance of POIData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
