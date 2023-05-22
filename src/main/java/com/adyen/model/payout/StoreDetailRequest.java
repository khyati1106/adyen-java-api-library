/*
 * Adyen Payout API
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payout;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.payout.Address;
import com.adyen.model.payout.BankAccount;
import com.adyen.model.payout.Card;
import com.adyen.model.payout.Name;
import com.adyen.model.payout.Recurring;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.adyen.model.payout.JSON;

/**
 * StoreDetailRequest
 */

public class StoreDetailRequest {
  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additionalData";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  private Map<String, String> additionalData = null;

  public static final String SERIALIZED_NAME_BANK = "bank";
  @SerializedName(SERIALIZED_NAME_BANK)
  private BankAccount bank;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private Address billingAddress;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private Card card;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  /**
   * The type of the entity the payout is processed for.
   */
  @JsonAdapter(EntityTypeEnum.Adapter.class)
  public enum EntityTypeEnum {
    NATURALPERSON("NaturalPerson"),
    
    COMPANY("Company");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntityTypeEnum fromValue(String value) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EntityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EntityTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private EntityTypeEnum entityType;

  public static final String SERIALIZED_NAME_FRAUD_OFFSET = "fraudOffset";
  @SerializedName(SERIALIZED_NAME_FRAUD_OFFSET)
  private Integer fraudOffset;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private String nationality;

  public static final String SERIALIZED_NAME_RECURRING = "recurring";
  @SerializedName(SERIALIZED_NAME_RECURRING)
  private Recurring recurring;

  public static final String SERIALIZED_NAME_SELECTED_BRAND = "selectedBrand";
  @SerializedName(SERIALIZED_NAME_SELECTED_BRAND)
  private String selectedBrand;

  public static final String SERIALIZED_NAME_SHOPPER_EMAIL = "shopperEmail";
  @SerializedName(SERIALIZED_NAME_SHOPPER_EMAIL)
  private String shopperEmail;

  public static final String SERIALIZED_NAME_SHOPPER_NAME = "shopperName";
  @SerializedName(SERIALIZED_NAME_SHOPPER_NAME)
  private Name shopperName;

  public static final String SERIALIZED_NAME_SHOPPER_REFERENCE = "shopperReference";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFERENCE)
  private String shopperReference;

  public static final String SERIALIZED_NAME_SOCIAL_SECURITY_NUMBER = "socialSecurityNumber";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SECURITY_NUMBER)
  private String socialSecurityNumber;

  public static final String SERIALIZED_NAME_TELEPHONE_NUMBER = "telephoneNumber";
  @SerializedName(SERIALIZED_NAME_TELEPHONE_NUMBER)
  private String telephoneNumber;

  public StoreDetailRequest() { 
  }

  public StoreDetailRequest additionalData(Map<String, String> additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

  public StoreDetailRequest putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * This field contains additional data, which may be required for a particular request.
   * @return additionalData
  **/
  @ApiModelProperty(value = "This field contains additional data, which may be required for a particular request.")

  public Map<String, String> getAdditionalData() {
    return additionalData;
  }


  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }


  public StoreDetailRequest bank(BankAccount bank) {
    
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(value = "")

  public BankAccount getBank() {
    return bank;
  }


  public void setBank(BankAccount bank) {
    this.bank = bank;
  }


  public StoreDetailRequest billingAddress(Address billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")

  public Address getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }


  public StoreDetailRequest card(Card card) {
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")

  public Card getCard() {
    return card;
  }


  public void setCard(Card card) {
    this.card = card;
  }


  public StoreDetailRequest dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The date of birth. Format: [ISO-8601](https://www.w3.org/TR/NOTE-datetime); example: YYYY-MM-DD For Paysafecard it must be the same as used when registering the Paysafecard account. &gt; This field is mandatory for natural persons.
   * @return dateOfBirth
  **/
  @ApiModelProperty(required = true, value = "The date of birth. Format: [ISO-8601](https://www.w3.org/TR/NOTE-datetime); example: YYYY-MM-DD For Paysafecard it must be the same as used when registering the Paysafecard account. > This field is mandatory for natural persons.")

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public StoreDetailRequest entityType(EntityTypeEnum entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * The type of the entity the payout is processed for.
   * @return entityType
  **/
  @ApiModelProperty(required = true, value = "The type of the entity the payout is processed for.")

  public EntityTypeEnum getEntityType() {
    return entityType;
  }


  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }


  public StoreDetailRequest fraudOffset(Integer fraudOffset) {
    
    this.fraudOffset = fraudOffset;
    return this;
  }

   /**
   * An integer value that is added to the normal fraud score. The value can be either positive or negative.
   * @return fraudOffset
  **/
  @ApiModelProperty(value = "An integer value that is added to the normal fraud score. The value can be either positive or negative.")

  public Integer getFraudOffset() {
    return fraudOffset;
  }


  public void setFraudOffset(Integer fraudOffset) {
    this.fraudOffset = fraudOffset;
  }


  public StoreDetailRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account identifier, with which you want to process the transaction.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account identifier, with which you want to process the transaction.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public StoreDetailRequest nationality(String nationality) {
    
    this.nationality = nationality;
    return this;
  }

   /**
   * The shopper&#39;s nationality.  A valid value is an ISO 2-character country code (e.g. &#39;NL&#39;).
   * @return nationality
  **/
  @ApiModelProperty(required = true, value = "The shopper's nationality.  A valid value is an ISO 2-character country code (e.g. 'NL').")

  public String getNationality() {
    return nationality;
  }


  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public StoreDetailRequest recurring(Recurring recurring) {
    
    this.recurring = recurring;
    return this;
  }

   /**
   * Get recurring
   * @return recurring
  **/
  @ApiModelProperty(required = true, value = "")

  public Recurring getRecurring() {
    return recurring;
  }


  public void setRecurring(Recurring recurring) {
    this.recurring = recurring;
  }


  public StoreDetailRequest selectedBrand(String selectedBrand) {
    
    this.selectedBrand = selectedBrand;
    return this;
  }

   /**
   * The name of the brand to make a payout to.  For Paysafecard it must be set to &#x60;paysafecard&#x60;.
   * @return selectedBrand
  **/
  @ApiModelProperty(value = "The name of the brand to make a payout to.  For Paysafecard it must be set to `paysafecard`.")

  public String getSelectedBrand() {
    return selectedBrand;
  }


  public void setSelectedBrand(String selectedBrand) {
    this.selectedBrand = selectedBrand;
  }


  public StoreDetailRequest shopperEmail(String shopperEmail) {
    
    this.shopperEmail = shopperEmail;
    return this;
  }

   /**
   * The shopper&#39;s email address.
   * @return shopperEmail
  **/
  @ApiModelProperty(required = true, value = "The shopper's email address.")

  public String getShopperEmail() {
    return shopperEmail;
  }


  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }


  public StoreDetailRequest shopperName(Name shopperName) {
    
    this.shopperName = shopperName;
    return this;
  }

   /**
   * Get shopperName
   * @return shopperName
  **/
  @ApiModelProperty(value = "")

  public Name getShopperName() {
    return shopperName;
  }


  public void setShopperName(Name shopperName) {
    this.shopperName = shopperName;
  }


  public StoreDetailRequest shopperReference(String shopperReference) {
    
    this.shopperReference = shopperReference;
    return this;
  }

   /**
   * The shopper&#39;s reference for the payment transaction.
   * @return shopperReference
  **/
  @ApiModelProperty(required = true, value = "The shopper's reference for the payment transaction.")

  public String getShopperReference() {
    return shopperReference;
  }


  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }


  public StoreDetailRequest socialSecurityNumber(String socialSecurityNumber) {
    
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

   /**
   * The shopper&#39;s social security number.
   * @return socialSecurityNumber
  **/
  @ApiModelProperty(value = "The shopper's social security number.")

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }


  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }


  public StoreDetailRequest telephoneNumber(String telephoneNumber) {
    
    this.telephoneNumber = telephoneNumber;
    return this;
  }

   /**
   * The shopper&#39;s phone number.
   * @return telephoneNumber
  **/
  @ApiModelProperty(value = "The shopper's phone number.")

  public String getTelephoneNumber() {
    return telephoneNumber;
  }


  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreDetailRequest storeDetailRequest = (StoreDetailRequest) o;
    return Objects.equals(this.additionalData, storeDetailRequest.additionalData) &&
        Objects.equals(this.bank, storeDetailRequest.bank) &&
        Objects.equals(this.billingAddress, storeDetailRequest.billingAddress) &&
        Objects.equals(this.card, storeDetailRequest.card) &&
        Objects.equals(this.dateOfBirth, storeDetailRequest.dateOfBirth) &&
        Objects.equals(this.entityType, storeDetailRequest.entityType) &&
        Objects.equals(this.fraudOffset, storeDetailRequest.fraudOffset) &&
        Objects.equals(this.merchantAccount, storeDetailRequest.merchantAccount) &&
        Objects.equals(this.nationality, storeDetailRequest.nationality) &&
        Objects.equals(this.recurring, storeDetailRequest.recurring) &&
        Objects.equals(this.selectedBrand, storeDetailRequest.selectedBrand) &&
        Objects.equals(this.shopperEmail, storeDetailRequest.shopperEmail) &&
        Objects.equals(this.shopperName, storeDetailRequest.shopperName) &&
        Objects.equals(this.shopperReference, storeDetailRequest.shopperReference) &&
        Objects.equals(this.socialSecurityNumber, storeDetailRequest.socialSecurityNumber) &&
        Objects.equals(this.telephoneNumber, storeDetailRequest.telephoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, bank, billingAddress, card, dateOfBirth, entityType, fraudOffset, merchantAccount, nationality, recurring, selectedBrand, shopperEmail, shopperName, shopperReference, socialSecurityNumber, telephoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreDetailRequest {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    fraudOffset: ").append(toIndentedString(fraudOffset)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    selectedBrand: ").append(toIndentedString(selectedBrand)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    shopperName: ").append(toIndentedString(shopperName)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("additionalData");
    openapiFields.add("bank");
    openapiFields.add("billingAddress");
    openapiFields.add("card");
    openapiFields.add("dateOfBirth");
    openapiFields.add("entityType");
    openapiFields.add("fraudOffset");
    openapiFields.add("merchantAccount");
    openapiFields.add("nationality");
    openapiFields.add("recurring");
    openapiFields.add("selectedBrand");
    openapiFields.add("shopperEmail");
    openapiFields.add("shopperName");
    openapiFields.add("shopperReference");
    openapiFields.add("socialSecurityNumber");
    openapiFields.add("telephoneNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dateOfBirth");
    openapiRequiredFields.add("entityType");
    openapiRequiredFields.add("merchantAccount");
    openapiRequiredFields.add("nationality");
    openapiRequiredFields.add("recurring");
    openapiRequiredFields.add("shopperEmail");
    openapiRequiredFields.add("shopperReference");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(StoreDetailRequest.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StoreDetailRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StoreDetailRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StoreDetailRequest is not found in the empty JSON string", StoreDetailRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StoreDetailRequest.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `StoreDetailRequest` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StoreDetailRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `bank`
      if (jsonObj.getAsJsonObject("bank") != null) {
        BankAccount.validateJsonObject(jsonObj.getAsJsonObject("bank"));
      }
      // validate the optional field `billingAddress`
      if (jsonObj.getAsJsonObject("billingAddress") != null) {
        Address.validateJsonObject(jsonObj.getAsJsonObject("billingAddress"));
      }
      // validate the optional field `card`
      if (jsonObj.getAsJsonObject("card") != null) {
        Card.validateJsonObject(jsonObj.getAsJsonObject("card"));
      }
      // ensure the field entityType can be parsed to an enum value
      if (jsonObj.get("entityType") != null) {
        if(!jsonObj.get("entityType").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `entityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityType").toString()));
        }
        EntityTypeEnum.fromValue(jsonObj.get("entityType").getAsString());
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field nationality
      if (jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      // validate the optional field `recurring`
      if (jsonObj.getAsJsonObject("recurring") != null) {
        Recurring.validateJsonObject(jsonObj.getAsJsonObject("recurring"));
      }
      // validate the optional field selectedBrand
      if (jsonObj.get("selectedBrand") != null && !jsonObj.get("selectedBrand").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `selectedBrand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectedBrand").toString()));
      }
      // validate the optional field shopperEmail
      if (jsonObj.get("shopperEmail") != null && !jsonObj.get("shopperEmail").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `shopperEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperEmail").toString()));
      }
      // validate the optional field `shopperName`
      if (jsonObj.getAsJsonObject("shopperName") != null) {
        Name.validateJsonObject(jsonObj.getAsJsonObject("shopperName"));
      }
      // validate the optional field shopperReference
      if (jsonObj.get("shopperReference") != null && !jsonObj.get("shopperReference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `shopperReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperReference").toString()));
      }
      // validate the optional field socialSecurityNumber
      if (jsonObj.get("socialSecurityNumber") != null && !jsonObj.get("socialSecurityNumber").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `socialSecurityNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("socialSecurityNumber").toString()));
      }
      // validate the optional field telephoneNumber
      if (jsonObj.get("telephoneNumber") != null && !jsonObj.get("telephoneNumber").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `telephoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("telephoneNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StoreDetailRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StoreDetailRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StoreDetailRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StoreDetailRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<StoreDetailRequest>() {
           @Override
           public void write(JsonWriter out, StoreDetailRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StoreDetailRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StoreDetailRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StoreDetailRequest
  * @throws IOException if the JSON string is invalid with respect to StoreDetailRequest
  */
  public static StoreDetailRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StoreDetailRequest.class);
  }

 /**
  * Convert an instance of StoreDetailRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

