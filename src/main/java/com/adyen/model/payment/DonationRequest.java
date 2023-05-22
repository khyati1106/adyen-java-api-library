/*
 * Adyen Payment API
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.payment.Amount;
import com.adyen.model.payment.PlatformChargebackLogic;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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

import com.adyen.model.payment.JSON;

/**
 * DonationRequest
 */

public class DonationRequest {
  public static final String SERIALIZED_NAME_DONATION_ACCOUNT = "donationAccount";
  @SerializedName(SERIALIZED_NAME_DONATION_ACCOUNT)
  private String donationAccount;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_MODIFICATION_AMOUNT = "modificationAmount";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_AMOUNT)
  private Amount modificationAmount;

  public static final String SERIALIZED_NAME_ORIGINAL_REFERENCE = "originalReference";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_REFERENCE)
  private String originalReference;

  public static final String SERIALIZED_NAME_PLATFORM_CHARGEBACK_LOGIC = "platformChargebackLogic";
  @SerializedName(SERIALIZED_NAME_PLATFORM_CHARGEBACK_LOGIC)
  private PlatformChargebackLogic platformChargebackLogic;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public DonationRequest() { 
  }

  public DonationRequest donationAccount(String donationAccount) {
    
    this.donationAccount = donationAccount;
    return this;
  }

   /**
   * The Adyen account name of the charity.
   * @return donationAccount
  **/
  @ApiModelProperty(required = true, value = "The Adyen account name of the charity.")

  public String getDonationAccount() {
    return donationAccount;
  }


  public void setDonationAccount(String donationAccount) {
    this.donationAccount = donationAccount;
  }


  public DonationRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account that is used to process the payment.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account that is used to process the payment.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public DonationRequest modificationAmount(Amount modificationAmount) {
    
    this.modificationAmount = modificationAmount;
    return this;
  }

   /**
   * Get modificationAmount
   * @return modificationAmount
  **/
  @ApiModelProperty(required = true, value = "")

  public Amount getModificationAmount() {
    return modificationAmount;
  }


  public void setModificationAmount(Amount modificationAmount) {
    this.modificationAmount = modificationAmount;
  }


  public DonationRequest originalReference(String originalReference) {
    
    this.originalReference = originalReference;
    return this;
  }

   /**
   * The original pspReference of the payment to modify. This reference is returned in: * authorisation response * authorisation notification  
   * @return originalReference
  **/
  @ApiModelProperty(value = "The original pspReference of the payment to modify. This reference is returned in: * authorisation response * authorisation notification  ")

  public String getOriginalReference() {
    return originalReference;
  }


  public void setOriginalReference(String originalReference) {
    this.originalReference = originalReference;
  }


  public DonationRequest platformChargebackLogic(PlatformChargebackLogic platformChargebackLogic) {
    
    this.platformChargebackLogic = platformChargebackLogic;
    return this;
  }

   /**
   * Get platformChargebackLogic
   * @return platformChargebackLogic
  **/
  @ApiModelProperty(value = "")

  public PlatformChargebackLogic getPlatformChargebackLogic() {
    return platformChargebackLogic;
  }


  public void setPlatformChargebackLogic(PlatformChargebackLogic platformChargebackLogic) {
    this.platformChargebackLogic = platformChargebackLogic;
  }


  public DonationRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DonationRequest donationRequest = (DonationRequest) o;
    return Objects.equals(this.donationAccount, donationRequest.donationAccount) &&
        Objects.equals(this.merchantAccount, donationRequest.merchantAccount) &&
        Objects.equals(this.modificationAmount, donationRequest.modificationAmount) &&
        Objects.equals(this.originalReference, donationRequest.originalReference) &&
        Objects.equals(this.platformChargebackLogic, donationRequest.platformChargebackLogic) &&
        Objects.equals(this.reference, donationRequest.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(donationAccount, merchantAccount, modificationAmount, originalReference, platformChargebackLogic, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DonationRequest {\n");
    sb.append("    donationAccount: ").append(toIndentedString(donationAccount)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    modificationAmount: ").append(toIndentedString(modificationAmount)).append("\n");
    sb.append("    originalReference: ").append(toIndentedString(originalReference)).append("\n");
    sb.append("    platformChargebackLogic: ").append(toIndentedString(platformChargebackLogic)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
    openapiFields.add("donationAccount");
    openapiFields.add("merchantAccount");
    openapiFields.add("modificationAmount");
    openapiFields.add("originalReference");
    openapiFields.add("platformChargebackLogic");
    openapiFields.add("reference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("donationAccount");
    openapiRequiredFields.add("merchantAccount");
    openapiRequiredFields.add("modificationAmount");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(DonationRequest.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DonationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DonationRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DonationRequest is not found in the empty JSON string", DonationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DonationRequest.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `DonationRequest` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DonationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field donationAccount
      if (jsonObj.get("donationAccount") != null && !jsonObj.get("donationAccount").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `donationAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("donationAccount").toString()));
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field `modificationAmount`
      if (jsonObj.getAsJsonObject("modificationAmount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("modificationAmount"));
      }
      // validate the optional field originalReference
      if (jsonObj.get("originalReference") != null && !jsonObj.get("originalReference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `originalReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalReference").toString()));
      }
      // validate the optional field `platformChargebackLogic`
      if (jsonObj.getAsJsonObject("platformChargebackLogic") != null) {
        PlatformChargebackLogic.validateJsonObject(jsonObj.getAsJsonObject("platformChargebackLogic"));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DonationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DonationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DonationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DonationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DonationRequest>() {
           @Override
           public void write(JsonWriter out, DonationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DonationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DonationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DonationRequest
  * @throws IOException if the JSON string is invalid with respect to DonationRequest
  */
  public static DonationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DonationRequest.class);
  }

 /**
  * Convert an instance of DonationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

