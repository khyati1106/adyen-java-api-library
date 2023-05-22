/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.balanceplatform.BankAccountIdentificationValidationRequestAccountIdentification;
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

import com.adyen.model.balanceplatform.JSON;

/**
 * BankAccountIdentificationValidationRequest
 */

public class BankAccountIdentificationValidationRequest {
  public static final String SERIALIZED_NAME_ACCOUNT_IDENTIFICATION = "accountIdentification";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDENTIFICATION)
  private BankAccountIdentificationValidationRequestAccountIdentification accountIdentification;

  public BankAccountIdentificationValidationRequest() { 
  }

  public BankAccountIdentificationValidationRequest accountIdentification(BankAccountIdentificationValidationRequestAccountIdentification accountIdentification) {
    
    this.accountIdentification = accountIdentification;
    return this;
  }

   /**
   * Get accountIdentification
   * @return accountIdentification
  **/
  @ApiModelProperty(required = true, value = "")

  public BankAccountIdentificationValidationRequestAccountIdentification getAccountIdentification() {
    return accountIdentification;
  }


  public void setAccountIdentification(BankAccountIdentificationValidationRequestAccountIdentification accountIdentification) {
    this.accountIdentification = accountIdentification;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccountIdentificationValidationRequest bankAccountIdentificationValidationRequest = (BankAccountIdentificationValidationRequest) o;
    return Objects.equals(this.accountIdentification, bankAccountIdentificationValidationRequest.accountIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountIdentificationValidationRequest {\n");
    sb.append("    accountIdentification: ").append(toIndentedString(accountIdentification)).append("\n");
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
    openapiFields.add("accountIdentification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountIdentification");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(BankAccountIdentificationValidationRequest.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BankAccountIdentificationValidationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BankAccountIdentificationValidationRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BankAccountIdentificationValidationRequest is not found in the empty JSON string", BankAccountIdentificationValidationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BankAccountIdentificationValidationRequest.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `BankAccountIdentificationValidationRequest` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BankAccountIdentificationValidationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `accountIdentification`
      if (jsonObj.getAsJsonObject("accountIdentification") != null) {
        BankAccountIdentificationValidationRequestAccountIdentification.validateJsonObject(jsonObj.getAsJsonObject("accountIdentification"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BankAccountIdentificationValidationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BankAccountIdentificationValidationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BankAccountIdentificationValidationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BankAccountIdentificationValidationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BankAccountIdentificationValidationRequest>() {
           @Override
           public void write(JsonWriter out, BankAccountIdentificationValidationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BankAccountIdentificationValidationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BankAccountIdentificationValidationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BankAccountIdentificationValidationRequest
  * @throws IOException if the JSON string is invalid with respect to BankAccountIdentificationValidationRequest
  */
  public static BankAccountIdentificationValidationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BankAccountIdentificationValidationRequest.class);
  }

 /**
  * Convert an instance of BankAccountIdentificationValidationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

