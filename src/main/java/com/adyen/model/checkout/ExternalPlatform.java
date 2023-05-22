/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

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

import com.adyen.model.checkout.JSON;

/**
 * ExternalPlatform
 */

public class ExternalPlatform {
  public static final String SERIALIZED_NAME_INTEGRATOR = "integrator";
  @SerializedName(SERIALIZED_NAME_INTEGRATOR)
  private String integrator;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public ExternalPlatform() { 
  }

  public ExternalPlatform integrator(String integrator) {
    
    this.integrator = integrator;
    return this;
  }

   /**
   * External platform integrator.
   * @return integrator
  **/
  @ApiModelProperty(value = "External platform integrator.")

  public String getIntegrator() {
    return integrator;
  }


  public void setIntegrator(String integrator) {
    this.integrator = integrator;
  }


  public ExternalPlatform name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the field. For example, Name of External Platform.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the field. For example, Name of External Platform.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ExternalPlatform version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version of the field. For example, Version of External Platform.
   * @return version
  **/
  @ApiModelProperty(value = "Version of the field. For example, Version of External Platform.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalPlatform externalPlatform = (ExternalPlatform) o;
    return Objects.equals(this.integrator, externalPlatform.integrator) &&
        Objects.equals(this.name, externalPlatform.name) &&
        Objects.equals(this.version, externalPlatform.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrator, name, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPlatform {\n");
    sb.append("    integrator: ").append(toIndentedString(integrator)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("integrator");
    openapiFields.add("name");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(ExternalPlatform.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalPlatform
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExternalPlatform.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalPlatform is not found in the empty JSON string", ExternalPlatform.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExternalPlatform.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `ExternalPlatform` properties.", entry.getKey()));
        }
      }
      // validate the optional field integrator
      if (jsonObj.get("integrator") != null && !jsonObj.get("integrator").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `integrator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integrator").toString()));
      }
      // validate the optional field name
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field version
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalPlatform.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalPlatform' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalPlatform> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalPlatform.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalPlatform>() {
           @Override
           public void write(JsonWriter out, ExternalPlatform value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExternalPlatform read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExternalPlatform given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalPlatform
  * @throws IOException if the JSON string is invalid with respect to ExternalPlatform
  */
  public static ExternalPlatform fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalPlatform.class);
  }

 /**
  * Convert an instance of ExternalPlatform to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

