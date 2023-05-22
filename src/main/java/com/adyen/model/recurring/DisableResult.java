/*
 * Adyen Recurring API
 * The Recurring APIs allow you to manage and remove your tokens or saved payment details. Tokens should be created with validation during a payment request.  For more information, refer to our [Tokenization documentation](https://docs.adyen.com/online-payments/tokenization). ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Recurring API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Recurring/v68/disable ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Recurring/v68/disable ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.recurring;

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

import com.adyen.model.recurring.JSON;

/**
 * DisableResult
 */

public class DisableResult {
  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private String response;

  public DisableResult() { 
  }

  public DisableResult response(String response) {
    
    this.response = response;
    return this;
  }

   /**
   * Depending on whether a specific recurring detail was in the request, result is either [detail-successfully-disabled] or [all-details-successfully-disabled].
   * @return response
  **/
  @ApiModelProperty(value = "Depending on whether a specific recurring detail was in the request, result is either [detail-successfully-disabled] or [all-details-successfully-disabled].")

  public String getResponse() {
    return response;
  }


  public void setResponse(String response) {
    this.response = response;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisableResult disableResult = (DisableResult) o;
    return Objects.equals(this.response, disableResult.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisableResult {\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
    openapiFields.add("response");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(DisableResult.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DisableResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DisableResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DisableResult is not found in the empty JSON string", DisableResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DisableResult.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `DisableResult` properties.", entry.getKey()));
        }
      }
      // validate the optional field response
      if (jsonObj.get("response") != null && !jsonObj.get("response").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `response` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DisableResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DisableResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DisableResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DisableResult.class));

       return (TypeAdapter<T>) new TypeAdapter<DisableResult>() {
           @Override
           public void write(JsonWriter out, DisableResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DisableResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DisableResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DisableResult
  * @throws IOException if the JSON string is invalid with respect to DisableResult
  */
  public static DisableResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DisableResult.class);
  }

 /**
  * Convert an instance of DisableResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

