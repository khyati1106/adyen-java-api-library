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
import com.adyen.model.management.InvalidField;
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
 * InvalidFieldWrapper
 */

public class InvalidFieldWrapper {
  public static final String SERIALIZED_NAME_INVALID_FIELD = "InvalidField";
  @SerializedName(SERIALIZED_NAME_INVALID_FIELD)
  private InvalidField invalidField;

  public InvalidFieldWrapper() { 
  }

  public InvalidFieldWrapper invalidField(InvalidField invalidField) {
    
    this.invalidField = invalidField;
    return this;
  }

   /**
   * Get invalidField
   * @return invalidField
  **/
  @ApiModelProperty(value = "")

  public InvalidField getInvalidField() {
    return invalidField;
  }


  public void setInvalidField(InvalidField invalidField) {
    this.invalidField = invalidField;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidFieldWrapper invalidFieldWrapper = (InvalidFieldWrapper) o;
    return Objects.equals(this.invalidField, invalidFieldWrapper.invalidField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invalidField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidFieldWrapper {\n");
    sb.append("    invalidField: ").append(toIndentedString(invalidField)).append("\n");
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
    openapiFields.add("InvalidField");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(InvalidFieldWrapper.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvalidFieldWrapper
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InvalidFieldWrapper.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvalidFieldWrapper is not found in the empty JSON string", InvalidFieldWrapper.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InvalidFieldWrapper.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `InvalidFieldWrapper` properties.", entry.getKey()));
        }
      }
      // validate the optional field `InvalidField`
      if (jsonObj.getAsJsonObject("InvalidField") != null) {
        InvalidField.validateJsonObject(jsonObj.getAsJsonObject("InvalidField"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvalidFieldWrapper.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvalidFieldWrapper' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvalidFieldWrapper> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvalidFieldWrapper.class));

       return (TypeAdapter<T>) new TypeAdapter<InvalidFieldWrapper>() {
           @Override
           public void write(JsonWriter out, InvalidFieldWrapper value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvalidFieldWrapper read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvalidFieldWrapper given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvalidFieldWrapper
  * @throws IOException if the JSON string is invalid with respect to InvalidFieldWrapper
  */
  public static InvalidFieldWrapper fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvalidFieldWrapper.class);
  }

 /**
  * Convert an instance of InvalidFieldWrapper to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

