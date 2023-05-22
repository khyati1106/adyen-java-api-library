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
 * SubMerchant
 */

public class SubMerchant {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_MCC = "mcc";
  @SerializedName(SERIALIZED_NAME_MCC)
  private String mcc;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TAX_ID = "taxId";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private String taxId;

  public SubMerchant() { 
  }

  public SubMerchant city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city of the sub-merchant&#39;s address. * Format: Alphanumeric * Maximum length: 13 characters
   * @return city
  **/
  @ApiModelProperty(value = "The city of the sub-merchant's address. * Format: Alphanumeric * Maximum length: 13 characters")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public SubMerchant country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The three-letter country code of the sub-merchant&#39;s address. For example, **BRA** for Brazil.  * Format: [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) * Fixed length: 3 characters
   * @return country
  **/
  @ApiModelProperty(value = "The three-letter country code of the sub-merchant's address. For example, **BRA** for Brazil.  * Format: [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) * Fixed length: 3 characters")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public SubMerchant mcc(String mcc) {
    
    this.mcc = mcc;
    return this;
  }

   /**
   * The sub-merchant&#39;s 4-digit Merchant Category Code (MCC).  * Format: Numeric * Fixed length: 4 digits
   * @return mcc
  **/
  @ApiModelProperty(value = "The sub-merchant's 4-digit Merchant Category Code (MCC).  * Format: Numeric * Fixed length: 4 digits")

  public String getMcc() {
    return mcc;
  }


  public void setMcc(String mcc) {
    this.mcc = mcc;
  }


  public SubMerchant name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the sub-merchant. Based on scheme specifications, this value will overwrite the shopper statement  that will appear in the card statement. * Format: Alphanumeric * Maximum length: 22 characters
   * @return name
  **/
  @ApiModelProperty(value = "The name of the sub-merchant. Based on scheme specifications, this value will overwrite the shopper statement  that will appear in the card statement. * Format: Alphanumeric * Maximum length: 22 characters")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SubMerchant taxId(String taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * The tax ID of the sub-merchant. * Format: Numeric * Fixed length: 11 digits for the CPF or 14 digits for the CNPJ
   * @return taxId
  **/
  @ApiModelProperty(value = "The tax ID of the sub-merchant. * Format: Numeric * Fixed length: 11 digits for the CPF or 14 digits for the CNPJ")

  public String getTaxId() {
    return taxId;
  }


  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubMerchant subMerchant = (SubMerchant) o;
    return Objects.equals(this.city, subMerchant.city) &&
        Objects.equals(this.country, subMerchant.country) &&
        Objects.equals(this.mcc, subMerchant.mcc) &&
        Objects.equals(this.name, subMerchant.name) &&
        Objects.equals(this.taxId, subMerchant.taxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, mcc, name, taxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubMerchant {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("mcc");
    openapiFields.add("name");
    openapiFields.add("taxId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(SubMerchant.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubMerchant
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubMerchant.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubMerchant is not found in the empty JSON string", SubMerchant.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubMerchant.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `SubMerchant` properties.", entry.getKey()));
        }
      }
      // validate the optional field city
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      // validate the optional field country
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      // validate the optional field mcc
      if (jsonObj.get("mcc") != null && !jsonObj.get("mcc").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `mcc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc").toString()));
      }
      // validate the optional field name
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field taxId
      if (jsonObj.get("taxId") != null && !jsonObj.get("taxId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `taxId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubMerchant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubMerchant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubMerchant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubMerchant.class));

       return (TypeAdapter<T>) new TypeAdapter<SubMerchant>() {
           @Override
           public void write(JsonWriter out, SubMerchant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubMerchant read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubMerchant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubMerchant
  * @throws IOException if the JSON string is invalid with respect to SubMerchant
  */
  public static SubMerchant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubMerchant.class);
  }

 /**
  * Convert an instance of SubMerchant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

