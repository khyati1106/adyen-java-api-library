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
import com.adyen.model.recurring.PermitRestriction;
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

import com.adyen.model.recurring.JSON;

/**
 * Permit
 */

public class Permit {
  public static final String SERIALIZED_NAME_PARTNER_ID = "partnerId";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_PROFILE_REFERENCE = "profileReference";
  @SerializedName(SERIALIZED_NAME_PROFILE_REFERENCE)
  private String profileReference;

  public static final String SERIALIZED_NAME_RESTRICTION = "restriction";
  @SerializedName(SERIALIZED_NAME_RESTRICTION)
  private PermitRestriction restriction;

  public static final String SERIALIZED_NAME_RESULT_KEY = "resultKey";
  @SerializedName(SERIALIZED_NAME_RESULT_KEY)
  private String resultKey;

  public static final String SERIALIZED_NAME_VALID_TILL_DATE = "validTillDate";
  @SerializedName(SERIALIZED_NAME_VALID_TILL_DATE)
  private OffsetDateTime validTillDate;

  public Permit() { 
  }

  public Permit partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Partner ID (when using the permit-per-partner token sharing model).
   * @return partnerId
  **/
  @ApiModelProperty(value = "Partner ID (when using the permit-per-partner token sharing model).")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public Permit profileReference(String profileReference) {
    
    this.profileReference = profileReference;
    return this;
  }

   /**
   * The profile to apply to this permit (when using the shared permits model).
   * @return profileReference
  **/
  @ApiModelProperty(value = "The profile to apply to this permit (when using the shared permits model).")

  public String getProfileReference() {
    return profileReference;
  }


  public void setProfileReference(String profileReference) {
    this.profileReference = profileReference;
  }


  public Permit restriction(PermitRestriction restriction) {
    
    this.restriction = restriction;
    return this;
  }

   /**
   * Get restriction
   * @return restriction
  **/
  @ApiModelProperty(value = "")

  public PermitRestriction getRestriction() {
    return restriction;
  }


  public void setRestriction(PermitRestriction restriction) {
    this.restriction = restriction;
  }


  public Permit resultKey(String resultKey) {
    
    this.resultKey = resultKey;
    return this;
  }

   /**
   * The key to link permit requests to permit results.
   * @return resultKey
  **/
  @ApiModelProperty(value = "The key to link permit requests to permit results.")

  public String getResultKey() {
    return resultKey;
  }


  public void setResultKey(String resultKey) {
    this.resultKey = resultKey;
  }


  public Permit validTillDate(OffsetDateTime validTillDate) {
    
    this.validTillDate = validTillDate;
    return this;
  }

   /**
   * The expiry date for this permit.
   * @return validTillDate
  **/
  @ApiModelProperty(value = "The expiry date for this permit.")

  public OffsetDateTime getValidTillDate() {
    return validTillDate;
  }


  public void setValidTillDate(OffsetDateTime validTillDate) {
    this.validTillDate = validTillDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permit permit = (Permit) o;
    return Objects.equals(this.partnerId, permit.partnerId) &&
        Objects.equals(this.profileReference, permit.profileReference) &&
        Objects.equals(this.restriction, permit.restriction) &&
        Objects.equals(this.resultKey, permit.resultKey) &&
        Objects.equals(this.validTillDate, permit.validTillDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerId, profileReference, restriction, resultKey, validTillDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permit {\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    profileReference: ").append(toIndentedString(profileReference)).append("\n");
    sb.append("    restriction: ").append(toIndentedString(restriction)).append("\n");
    sb.append("    resultKey: ").append(toIndentedString(resultKey)).append("\n");
    sb.append("    validTillDate: ").append(toIndentedString(validTillDate)).append("\n");
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
    openapiFields.add("partnerId");
    openapiFields.add("profileReference");
    openapiFields.add("restriction");
    openapiFields.add("resultKey");
    openapiFields.add("validTillDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(Permit.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Permit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Permit.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Permit is not found in the empty JSON string", Permit.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Permit.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `Permit` properties.", entry.getKey()));
        }
      }
      // validate the optional field partnerId
      if (jsonObj.get("partnerId") != null && !jsonObj.get("partnerId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `partnerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerId").toString()));
      }
      // validate the optional field profileReference
      if (jsonObj.get("profileReference") != null && !jsonObj.get("profileReference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `profileReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileReference").toString()));
      }
      // validate the optional field `restriction`
      if (jsonObj.getAsJsonObject("restriction") != null) {
        PermitRestriction.validateJsonObject(jsonObj.getAsJsonObject("restriction"));
      }
      // validate the optional field resultKey
      if (jsonObj.get("resultKey") != null && !jsonObj.get("resultKey").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `resultKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Permit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Permit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Permit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Permit.class));

       return (TypeAdapter<T>) new TypeAdapter<Permit>() {
           @Override
           public void write(JsonWriter out, Permit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Permit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Permit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Permit
  * @throws IOException if the JSON string is invalid with respect to Permit
  */
  public static Permit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Permit.class);
  }

 /**
  * Convert an instance of Permit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

