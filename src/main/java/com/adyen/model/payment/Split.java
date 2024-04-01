/*
 * Adyen Payment API
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
import com.adyen.model.payment.SplitAmount;
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
 * Split
 */
@JsonPropertyOrder({
  Split.JSON_PROPERTY_ACCOUNT,
  Split.JSON_PROPERTY_AMOUNT,
  Split.JSON_PROPERTY_DESCRIPTION,
  Split.JSON_PROPERTY_REFERENCE,
  Split.JSON_PROPERTY_TYPE
})

public class Split {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private String account;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private SplitAmount amount;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  /**
   * The type of the split item.  Possible values:  * [Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic): **Commission**, **Default**, **Marketplace**, **PaymentFee**, **VAT**. * [Balance Platform](https://docs.adyen.com/marketplaces-and-platforms): **BalanceAccount**, **Commission**, **Default**, **PaymentFee**, **Remainder**, **Surcharge**, **Tip**, **VAT**.
   */
  public enum TypeEnum {
    ACQUIRINGFEES("AcquiringFees"),
    
    ADYENCOMMISSION("AdyenCommission"),
    
    ADYENFEES("AdyenFees"),
    
    ADYENMARKUP("AdyenMarkup"),
    
    BALANCEACCOUNT("BalanceAccount"),
    
    COMMISSION("Commission"),
    
    DEFAULT("Default"),
    
    INTERCHANGE("Interchange"),
    
    MARKETPLACE("MarketPlace"),
    
    PAYMENTFEE("PaymentFee"),
    
    REMAINDER("Remainder"),
    
    SCHEMEFEE("SchemeFee"),
    
    SURCHARGE("Surcharge"),
    
    TIP("Tip"),
    
    VAT("VAT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public Split() { 
  }

  public Split account(String account) {
    this.account = account;
    return this;
  }

   /**
   * The unique identifier of the account to which the split amount is booked. Required if &#x60;type&#x60; is **MarketPlace** or **BalanceAccount**.  * [Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic): The [&#x60;accountCode&#x60;](https://docs.adyen.com/api-explorer/Account/latest/post/updateAccount#request-accountCode) of the account to which the split amount is booked. * [Balance Platform](https://docs.adyen.com/marketplaces-and-platforms): The [&#x60;balanceAccountId&#x60;](https://docs.adyen.com/api-explorer/balanceplatform/latest/get/balanceAccounts/_id_#path-id) of the account to which the split amount is booked.
   * @return account
  **/
  @ApiModelProperty(value = "The unique identifier of the account to which the split amount is booked. Required if `type` is **MarketPlace** or **BalanceAccount**.  * [Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic): The [`accountCode`](https://docs.adyen.com/api-explorer/Account/latest/post/updateAccount#request-accountCode) of the account to which the split amount is booked. * [Balance Platform](https://docs.adyen.com/marketplaces-and-platforms): The [`balanceAccountId`](https://docs.adyen.com/api-explorer/balanceplatform/latest/get/balanceAccounts/_id_#path-id) of the account to which the split amount is booked.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccount() {
    return account;
  }


 /**
  * The unique identifier of the account to which the split amount is booked. Required if &#x60;type&#x60; is **MarketPlace** or **BalanceAccount**.  * [Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic): The [&#x60;accountCode&#x60;](https://docs.adyen.com/api-explorer/Account/latest/post/updateAccount#request-accountCode) of the account to which the split amount is booked. * [Balance Platform](https://docs.adyen.com/marketplaces-and-platforms): The [&#x60;balanceAccountId&#x60;](https://docs.adyen.com/api-explorer/balanceplatform/latest/get/balanceAccounts/_id_#path-id) of the account to which the split amount is booked.
  *
  * @param account
  */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccount(String account) {
    this.account = account;
  }


  public Split amount(SplitAmount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SplitAmount getAmount() {
    return amount;
  }


 /**
  * amount
  *
  * @param amount
  */ 
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(SplitAmount amount) {
    this.amount = amount;
  }


  public Split description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Your description for the split item.
   * @return description
  **/
  @ApiModelProperty(value = "Your description for the split item.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


 /**
  * Your description for the split item.
  *
  * @param description
  */ 
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public Split reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your unique reference for the split item.  This is required if &#x60;type&#x60; is **MarketPlace** ([Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic)) or **BalanceAccount** ([Balance Platform](https://docs.adyen.com/marketplaces-and-platforms)).  For the other types, we also recommend providing a **unique** reference so you can reconcile the split and the associated payment in the transaction overview and in the reports.
   * @return reference
  **/
  @ApiModelProperty(value = "Your unique reference for the split item.  This is required if `type` is **MarketPlace** ([Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic)) or **BalanceAccount** ([Balance Platform](https://docs.adyen.com/marketplaces-and-platforms)).  For the other types, we also recommend providing a **unique** reference so you can reconcile the split and the associated payment in the transaction overview and in the reports.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


 /**
  * Your unique reference for the split item.  This is required if &#x60;type&#x60; is **MarketPlace** ([Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic)) or **BalanceAccount** ([Balance Platform](https://docs.adyen.com/marketplaces-and-platforms)).  For the other types, we also recommend providing a **unique** reference so you can reconcile the split and the associated payment in the transaction overview and in the reports.
  *
  * @param reference
  */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public Split type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the split item.  Possible values:  * [Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic): **Commission**, **Default**, **Marketplace**, **PaymentFee**, **VAT**. * [Balance Platform](https://docs.adyen.com/marketplaces-and-platforms): **BalanceAccount**, **Commission**, **Default**, **PaymentFee**, **Remainder**, **Surcharge**, **Tip**, **VAT**.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the split item.  Possible values:  * [Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic): **Commission**, **Default**, **Marketplace**, **PaymentFee**, **VAT**. * [Balance Platform](https://docs.adyen.com/marketplaces-and-platforms): **BalanceAccount**, **Commission**, **Default**, **PaymentFee**, **Remainder**, **Surcharge**, **Tip**, **VAT**.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * The type of the split item.  Possible values:  * [Classic Platforms integration](https://docs.adyen.com/marketplaces-and-platforms/classic): **Commission**, **Default**, **Marketplace**, **PaymentFee**, **VAT**. * [Balance Platform](https://docs.adyen.com/marketplaces-and-platforms): **BalanceAccount**, **Commission**, **Default**, **PaymentFee**, **Remainder**, **Surcharge**, **Tip**, **VAT**.
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this Split object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Split split = (Split) o;
    return Objects.equals(this.account, split.account) &&
        Objects.equals(this.amount, split.amount) &&
        Objects.equals(this.description, split.description) &&
        Objects.equals(this.reference, split.reference) &&
        Objects.equals(this.type, split.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, amount, description, reference, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Split {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
   * Create an instance of Split given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Split
   * @throws JsonProcessingException if the JSON string is invalid with respect to Split
   */
  public static Split fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Split.class);
  }
/**
  * Convert an instance of Split to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

