/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

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

import com.adyen.model.management.JSON;

/**
 * GenerateHmacKeyResponse
 */

public class GenerateHmacKeyResponse {
  public static final String SERIALIZED_NAME_HMAC_KEY = "hmacKey";
  @SerializedName(SERIALIZED_NAME_HMAC_KEY)
  private String hmacKey;

  public GenerateHmacKeyResponse() { 
  }

  public GenerateHmacKeyResponse hmacKey(String hmacKey) {
    
    this.hmacKey = hmacKey;
    return this;
  }

   /**
   * The HMAC key generated for this webhook.
   * @return hmacKey
  **/
  @ApiModelProperty(required = true, value = "The HMAC key generated for this webhook.")

  public String getHmacKey() {
    return hmacKey;
  }


  public void setHmacKey(String hmacKey) {
    this.hmacKey = hmacKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateHmacKeyResponse generateHmacKeyResponse = (GenerateHmacKeyResponse) o;
    return Objects.equals(this.hmacKey, generateHmacKeyResponse.hmacKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hmacKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateHmacKeyResponse {\n");
    sb.append("    hmacKey: ").append(toIndentedString(hmacKey)).append("\n");
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
    openapiFields.add("hmacKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("hmacKey");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(GenerateHmacKeyResponse.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GenerateHmacKeyResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GenerateHmacKeyResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenerateHmacKeyResponse is not found in the empty JSON string", GenerateHmacKeyResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GenerateHmacKeyResponse.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `GenerateHmacKeyResponse` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GenerateHmacKeyResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field hmacKey
      if (jsonObj.get("hmacKey") != null && !jsonObj.get("hmacKey").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `hmacKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hmacKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenerateHmacKeyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenerateHmacKeyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenerateHmacKeyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenerateHmacKeyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GenerateHmacKeyResponse>() {
           @Override
           public void write(JsonWriter out, GenerateHmacKeyResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenerateHmacKeyResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GenerateHmacKeyResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenerateHmacKeyResponse
  * @throws IOException if the JSON string is invalid with respect to GenerateHmacKeyResponse
  */
  public static GenerateHmacKeyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenerateHmacKeyResponse.class);
  }

 /**
  * Convert an instance of GenerateHmacKeyResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

