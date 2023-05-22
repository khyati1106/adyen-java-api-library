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
 * UninstallAndroidAppDetails
 */

public class UninstallAndroidAppDetails {
  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  /**
   * Type of terminal action: Uninstall an Android app.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UNINSTALLANDROIDAPP("UninstallAndroidApp");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.UNINSTALLANDROIDAPP;

  public UninstallAndroidAppDetails() { 
  }

  public UninstallAndroidAppDetails appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * The unique identifier of the app to be uninstalled.
   * @return appId
  **/
  @ApiModelProperty(value = "The unique identifier of the app to be uninstalled.")

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public UninstallAndroidAppDetails type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of terminal action: Uninstall an Android app.
   * @return type
  **/
  @ApiModelProperty(value = "Type of terminal action: Uninstall an Android app.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UninstallAndroidAppDetails uninstallAndroidAppDetails = (UninstallAndroidAppDetails) o;
    return Objects.equals(this.appId, uninstallAndroidAppDetails.appId) &&
        Objects.equals(this.type, uninstallAndroidAppDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UninstallAndroidAppDetails {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("appId");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(UninstallAndroidAppDetails.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UninstallAndroidAppDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UninstallAndroidAppDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UninstallAndroidAppDetails is not found in the empty JSON string", UninstallAndroidAppDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UninstallAndroidAppDetails.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `UninstallAndroidAppDetails` properties.", entry.getKey()));
        }
      }
      // validate the optional field appId
      if (jsonObj.get("appId") != null && !jsonObj.get("appId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `appId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appId").toString()));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UninstallAndroidAppDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UninstallAndroidAppDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UninstallAndroidAppDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UninstallAndroidAppDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<UninstallAndroidAppDetails>() {
           @Override
           public void write(JsonWriter out, UninstallAndroidAppDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UninstallAndroidAppDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UninstallAndroidAppDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UninstallAndroidAppDetails
  * @throws IOException if the JSON string is invalid with respect to UninstallAndroidAppDetails
  */
  public static UninstallAndroidAppDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UninstallAndroidAppDetails.class);
  }

 /**
  * Convert an instance of UninstallAndroidAppDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

