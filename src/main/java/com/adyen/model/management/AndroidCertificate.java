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
import java.time.OffsetDateTime;

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
 * AndroidCertificate
 */

public class AndroidCertificate {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOT_AFTER = "notAfter";
  @SerializedName(SERIALIZED_NAME_NOT_AFTER)
  private OffsetDateTime notAfter;

  public static final String SERIALIZED_NAME_NOT_BEFORE = "notBefore";
  @SerializedName(SERIALIZED_NAME_NOT_BEFORE)
  private OffsetDateTime notBefore;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AndroidCertificate() { 
  }

  public AndroidCertificate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description that was provided when uploading the certificate.
   * @return description
  **/
  @ApiModelProperty(value = "The description that was provided when uploading the certificate.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AndroidCertificate extension(String extension) {
    
    this.extension = extension;
    return this;
  }

   /**
   * The file format of the certificate, as indicated by the file extension. For example, **.cert** or **.pem**.
   * @return extension
  **/
  @ApiModelProperty(value = "The file format of the certificate, as indicated by the file extension. For example, **.cert** or **.pem**.")

  public String getExtension() {
    return extension;
  }


  public void setExtension(String extension) {
    this.extension = extension;
  }


  public AndroidCertificate id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the certificate.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the certificate.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AndroidCertificate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The file name of the certificate. For example, **mycert**.
   * @return name
  **/
  @ApiModelProperty(value = "The file name of the certificate. For example, **mycert**.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AndroidCertificate notAfter(OffsetDateTime notAfter) {
    
    this.notAfter = notAfter;
    return this;
  }

   /**
   * The date when the certificate stops to be valid.
   * @return notAfter
  **/
  @ApiModelProperty(value = "The date when the certificate stops to be valid.")

  public OffsetDateTime getNotAfter() {
    return notAfter;
  }


  public void setNotAfter(OffsetDateTime notAfter) {
    this.notAfter = notAfter;
  }


  public AndroidCertificate notBefore(OffsetDateTime notBefore) {
    
    this.notBefore = notBefore;
    return this;
  }

   /**
   * The date when the certificate starts to be valid.
   * @return notBefore
  **/
  @ApiModelProperty(value = "The date when the certificate starts to be valid.")

  public OffsetDateTime getNotBefore() {
    return notBefore;
  }


  public void setNotBefore(OffsetDateTime notBefore) {
    this.notBefore = notBefore;
  }


  public AndroidCertificate status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the certificate.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the certificate.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AndroidCertificate androidCertificate = (AndroidCertificate) o;
    return Objects.equals(this.description, androidCertificate.description) &&
        Objects.equals(this.extension, androidCertificate.extension) &&
        Objects.equals(this.id, androidCertificate.id) &&
        Objects.equals(this.name, androidCertificate.name) &&
        Objects.equals(this.notAfter, androidCertificate.notAfter) &&
        Objects.equals(this.notBefore, androidCertificate.notBefore) &&
        Objects.equals(this.status, androidCertificate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, extension, id, name, notAfter, notBefore, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AndroidCertificate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("extension");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("notAfter");
    openapiFields.add("notBefore");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(AndroidCertificate.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AndroidCertificate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AndroidCertificate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AndroidCertificate is not found in the empty JSON string", AndroidCertificate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AndroidCertificate.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `AndroidCertificate` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AndroidCertificate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field extension
      if (jsonObj.get("extension") != null && !jsonObj.get("extension").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field name
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field status
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AndroidCertificate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AndroidCertificate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AndroidCertificate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AndroidCertificate.class));

       return (TypeAdapter<T>) new TypeAdapter<AndroidCertificate>() {
           @Override
           public void write(JsonWriter out, AndroidCertificate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AndroidCertificate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AndroidCertificate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AndroidCertificate
  * @throws IOException if the JSON string is invalid with respect to AndroidCertificate
  */
  public static AndroidCertificate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AndroidCertificate.class);
  }

 /**
  * Convert an instance of AndroidCertificate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

