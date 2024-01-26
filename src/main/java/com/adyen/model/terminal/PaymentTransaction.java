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
import com.adyen.model.terminal.AmountsReq;
import com.adyen.model.terminal.OriginalPOITransaction;
import com.adyen.model.terminal.SaleItem;
import com.adyen.model.terminal.TransactionConditions;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * PaymentTransaction
 */
@JsonPropertyOrder({
  PaymentTransaction.JSON_PROPERTY_AMOUNTS_REQ,
  PaymentTransaction.JSON_PROPERTY_ORIGINAL_P_O_I_TRANSACTION,
  PaymentTransaction.JSON_PROPERTY_TRANSACTION_CONDITIONS,
  PaymentTransaction.JSON_PROPERTY_SALE_ITEM
})

public class PaymentTransaction {
  public static final String JSON_PROPERTY_AMOUNTS_REQ = "AmountsReq";
  private AmountsReq amountsReq;

  public static final String JSON_PROPERTY_ORIGINAL_P_O_I_TRANSACTION = "OriginalPOITransaction";
  private OriginalPOITransaction originalPOITransaction;

  public static final String JSON_PROPERTY_TRANSACTION_CONDITIONS = "TransactionConditions";
  private TransactionConditions transactionConditions;

  public static final String JSON_PROPERTY_SALE_ITEM = "SaleItem";
  private List<SaleItem> saleItem = null;

  public PaymentTransaction() { 
  }

  public PaymentTransaction amountsReq(AmountsReq amountsReq) {
    this.amountsReq = amountsReq;
    return this;
  }

   /**
   * Get amountsReq
   * @return amountsReq
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNTS_REQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AmountsReq getAmountsReq() {
    return amountsReq;
  }


 /**
  * amountsReq
  *
  * @param amountsReq
  */ 
  @JsonProperty(JSON_PROPERTY_AMOUNTS_REQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountsReq(AmountsReq amountsReq) {
    this.amountsReq = amountsReq;
  }


  public PaymentTransaction originalPOITransaction(OriginalPOITransaction originalPOITransaction) {
    this.originalPOITransaction = originalPOITransaction;
    return this;
  }

   /**
   * Get originalPOITransaction
   * @return originalPOITransaction
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_P_O_I_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OriginalPOITransaction getOriginalPOITransaction() {
    return originalPOITransaction;
  }


 /**
  * originalPOITransaction
  *
  * @param originalPOITransaction
  */ 
  @JsonProperty(JSON_PROPERTY_ORIGINAL_P_O_I_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalPOITransaction(OriginalPOITransaction originalPOITransaction) {
    this.originalPOITransaction = originalPOITransaction;
  }


  public PaymentTransaction transactionConditions(TransactionConditions transactionConditions) {
    this.transactionConditions = transactionConditions;
    return this;
  }

   /**
   * Get transactionConditions
   * @return transactionConditions
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionConditions getTransactionConditions() {
    return transactionConditions;
  }


 /**
  * transactionConditions
  *
  * @param transactionConditions
  */ 
  @JsonProperty(JSON_PROPERTY_TRANSACTION_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionConditions(TransactionConditions transactionConditions) {
    this.transactionConditions = transactionConditions;
  }


  public PaymentTransaction saleItem(List<SaleItem> saleItem) {
    this.saleItem = saleItem;
    return this;
  }

  public PaymentTransaction addSaleItemItem(SaleItem saleItemItem) {
    if (this.saleItem == null) {
      this.saleItem = new ArrayList<>();
    }
    this.saleItem.add(saleItemItem);
    return this;
  }

   /**
   * Get saleItem
   * @return saleItem
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SALE_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SaleItem> getSaleItem() {
    return saleItem;
  }


 /**
  * saleItem
  *
  * @param saleItem
  */ 
  @JsonProperty(JSON_PROPERTY_SALE_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaleItem(List<SaleItem> saleItem) {
    this.saleItem = saleItem;
  }


  /**
   * Return true if this PaymentTransaction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransaction paymentTransaction = (PaymentTransaction) o;
    return Objects.equals(this.amountsReq, paymentTransaction.amountsReq) &&
        Objects.equals(this.originalPOITransaction, paymentTransaction.originalPOITransaction) &&
        Objects.equals(this.transactionConditions, paymentTransaction.transactionConditions) &&
        Objects.equals(this.saleItem, paymentTransaction.saleItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountsReq, originalPOITransaction, transactionConditions, saleItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransaction {\n");
    sb.append("    amountsReq: ").append(toIndentedString(amountsReq)).append("\n");
    sb.append("    originalPOITransaction: ").append(toIndentedString(originalPOITransaction)).append("\n");
    sb.append("    transactionConditions: ").append(toIndentedString(transactionConditions)).append("\n");
    sb.append("    saleItem: ").append(toIndentedString(saleItem)).append("\n");
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
   * Create an instance of PaymentTransaction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentTransaction
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentTransaction
   */
  public static PaymentTransaction fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentTransaction.class);
  }
/**
  * Convert an instance of PaymentTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
