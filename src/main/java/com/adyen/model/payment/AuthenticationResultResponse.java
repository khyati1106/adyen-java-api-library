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
import com.adyen.model.payment.ThreeDS1Result;
import com.adyen.model.payment.ThreeDS2Result;
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
 * AuthenticationResultResponse
 */

public class AuthenticationResultResponse {
  public static final String SERIALIZED_NAME_THREE_D_S1_RESULT = "threeDS1Result";
  @SerializedName(SERIALIZED_NAME_THREE_D_S1_RESULT)
  private ThreeDS1Result threeDS1Result;

  public static final String SERIALIZED_NAME_THREE_D_S2_RESULT = "threeDS2Result";
  @SerializedName(SERIALIZED_NAME_THREE_D_S2_RESULT)
  private ThreeDS2Result threeDS2Result;

  public AuthenticationResultResponse() { 
  }

  public AuthenticationResultResponse threeDS1Result(ThreeDS1Result threeDS1Result) {
    
    this.threeDS1Result = threeDS1Result;
    return this;
  }

   /**
   * Get threeDS1Result
   * @return threeDS1Result
  **/
  @ApiModelProperty(value = "")

  public ThreeDS1Result getThreeDS1Result() {
    return threeDS1Result;
  }


  public void setThreeDS1Result(ThreeDS1Result threeDS1Result) {
    this.threeDS1Result = threeDS1Result;
  }


  public AuthenticationResultResponse threeDS2Result(ThreeDS2Result threeDS2Result) {
    
    this.threeDS2Result = threeDS2Result;
    return this;
  }

   /**
   * Get threeDS2Result
   * @return threeDS2Result
  **/
  @ApiModelProperty(value = "")

  public ThreeDS2Result getThreeDS2Result() {
    return threeDS2Result;
  }


  public void setThreeDS2Result(ThreeDS2Result threeDS2Result) {
    this.threeDS2Result = threeDS2Result;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationResultResponse authenticationResultResponse = (AuthenticationResultResponse) o;
    return Objects.equals(this.threeDS1Result, authenticationResultResponse.threeDS1Result) &&
        Objects.equals(this.threeDS2Result, authenticationResultResponse.threeDS2Result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threeDS1Result, threeDS2Result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationResultResponse {\n");
    sb.append("    threeDS1Result: ").append(toIndentedString(threeDS1Result)).append("\n");
    sb.append("    threeDS2Result: ").append(toIndentedString(threeDS2Result)).append("\n");
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
    openapiFields.add("threeDS1Result");
    openapiFields.add("threeDS2Result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(AuthenticationResultResponse.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthenticationResultResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthenticationResultResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthenticationResultResponse is not found in the empty JSON string", AuthenticationResultResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthenticationResultResponse.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `AuthenticationResultResponse` properties.", entry.getKey()));
        }
      }
      // validate the optional field `threeDS1Result`
      if (jsonObj.getAsJsonObject("threeDS1Result") != null) {
        ThreeDS1Result.validateJsonObject(jsonObj.getAsJsonObject("threeDS1Result"));
      }
      // validate the optional field `threeDS2Result`
      if (jsonObj.getAsJsonObject("threeDS2Result") != null) {
        ThreeDS2Result.validateJsonObject(jsonObj.getAsJsonObject("threeDS2Result"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthenticationResultResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthenticationResultResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthenticationResultResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthenticationResultResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthenticationResultResponse>() {
           @Override
           public void write(JsonWriter out, AuthenticationResultResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthenticationResultResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthenticationResultResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthenticationResultResponse
  * @throws IOException if the JSON string is invalid with respect to AuthenticationResultResponse
  */
  public static AuthenticationResultResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenticationResultResponse.class);
  }

 /**
  * Convert an instance of AuthenticationResultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

