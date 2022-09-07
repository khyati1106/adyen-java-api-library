/*
 * Adyen Payment API
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payments;

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

/**
 * ThreeDSRequestorAuthenticationInfo
 */

public class ThreeDSRequestorAuthenticationInfo {
  public static final String SERIALIZED_NAME_THREE_D_S_REQ_AUTH_DATA = "threeDSReqAuthData";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_REQ_AUTH_DATA)
  private String threeDSReqAuthData;

  /**
   * Mechanism used by the Cardholder to authenticate to the 3DS Requestor. Allowed values: * **01** — No 3DS Requestor authentication occurred (for example, cardholder “logged in” as guest). * **02** — Login to the cardholder account at the 3DS Requestor system using 3DS Requestor’s own credentials. * **03** — Login to the cardholder account at the 3DS Requestor system using federated ID. * **04** — Login to the cardholder account at the 3DS Requestor system using issuer credentials. * **05** — Login to the cardholder account at the 3DS Requestor system using third-party authentication. * **06** — Login to the cardholder account at the 3DS Requestor system using FIDO Authenticator.
   */
  @JsonAdapter(ThreeDSReqAuthMethodEnum.Adapter.class)
  public enum ThreeDSReqAuthMethodEnum {
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05"),
    
    _06("06");

    private String value;

    ThreeDSReqAuthMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ThreeDSReqAuthMethodEnum fromValue(String value) {
      for (ThreeDSReqAuthMethodEnum b : ThreeDSReqAuthMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ThreeDSReqAuthMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ThreeDSReqAuthMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ThreeDSReqAuthMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ThreeDSReqAuthMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_THREE_D_S_REQ_AUTH_METHOD = "threeDSReqAuthMethod";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_REQ_AUTH_METHOD)
  private ThreeDSReqAuthMethodEnum threeDSReqAuthMethod;

  public static final String SERIALIZED_NAME_THREE_D_S_REQ_AUTH_TIMESTAMP = "threeDSReqAuthTimestamp";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_REQ_AUTH_TIMESTAMP)
  private String threeDSReqAuthTimestamp;

  public ThreeDSRequestorAuthenticationInfo() { 
  }

  public ThreeDSRequestorAuthenticationInfo threeDSReqAuthData(String threeDSReqAuthData) {
    
    this.threeDSReqAuthData = threeDSReqAuthData;
    return this;
  }

   /**
   * Data that documents and supports a specific authentication process. Maximum length: 2048 bytes.
   * @return threeDSReqAuthData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data that documents and supports a specific authentication process. Maximum length: 2048 bytes.")

  public String getThreeDSReqAuthData() {
    return threeDSReqAuthData;
  }


  public void setThreeDSReqAuthData(String threeDSReqAuthData) {
    this.threeDSReqAuthData = threeDSReqAuthData;
  }


  public ThreeDSRequestorAuthenticationInfo threeDSReqAuthMethod(ThreeDSReqAuthMethodEnum threeDSReqAuthMethod) {
    
    this.threeDSReqAuthMethod = threeDSReqAuthMethod;
    return this;
  }

   /**
   * Mechanism used by the Cardholder to authenticate to the 3DS Requestor. Allowed values: * **01** — No 3DS Requestor authentication occurred (for example, cardholder “logged in” as guest). * **02** — Login to the cardholder account at the 3DS Requestor system using 3DS Requestor’s own credentials. * **03** — Login to the cardholder account at the 3DS Requestor system using federated ID. * **04** — Login to the cardholder account at the 3DS Requestor system using issuer credentials. * **05** — Login to the cardholder account at the 3DS Requestor system using third-party authentication. * **06** — Login to the cardholder account at the 3DS Requestor system using FIDO Authenticator.
   * @return threeDSReqAuthMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mechanism used by the Cardholder to authenticate to the 3DS Requestor. Allowed values: * **01** — No 3DS Requestor authentication occurred (for example, cardholder “logged in” as guest). * **02** — Login to the cardholder account at the 3DS Requestor system using 3DS Requestor’s own credentials. * **03** — Login to the cardholder account at the 3DS Requestor system using federated ID. * **04** — Login to the cardholder account at the 3DS Requestor system using issuer credentials. * **05** — Login to the cardholder account at the 3DS Requestor system using third-party authentication. * **06** — Login to the cardholder account at the 3DS Requestor system using FIDO Authenticator.")

  public ThreeDSReqAuthMethodEnum getThreeDSReqAuthMethod() {
    return threeDSReqAuthMethod;
  }


  public void setThreeDSReqAuthMethod(ThreeDSReqAuthMethodEnum threeDSReqAuthMethod) {
    this.threeDSReqAuthMethod = threeDSReqAuthMethod;
  }


  public ThreeDSRequestorAuthenticationInfo threeDSReqAuthTimestamp(String threeDSReqAuthTimestamp) {
    
    this.threeDSReqAuthTimestamp = threeDSReqAuthTimestamp;
    return this;
  }

   /**
   * Date and time in UTC of the cardholder authentication. Format: YYYYMMDDHHMM
   * @return threeDSReqAuthTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time in UTC of the cardholder authentication. Format: YYYYMMDDHHMM")

  public String getThreeDSReqAuthTimestamp() {
    return threeDSReqAuthTimestamp;
  }


  public void setThreeDSReqAuthTimestamp(String threeDSReqAuthTimestamp) {
    this.threeDSReqAuthTimestamp = threeDSReqAuthTimestamp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSRequestorAuthenticationInfo threeDSRequestorAuthenticationInfo = (ThreeDSRequestorAuthenticationInfo) o;
    return Objects.equals(this.threeDSReqAuthData, threeDSRequestorAuthenticationInfo.threeDSReqAuthData) &&
        Objects.equals(this.threeDSReqAuthMethod, threeDSRequestorAuthenticationInfo.threeDSReqAuthMethod) &&
        Objects.equals(this.threeDSReqAuthTimestamp, threeDSRequestorAuthenticationInfo.threeDSReqAuthTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threeDSReqAuthData, threeDSReqAuthMethod, threeDSReqAuthTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSRequestorAuthenticationInfo {\n");
    sb.append("    threeDSReqAuthData: ").append(toIndentedString(threeDSReqAuthData)).append("\n");
    sb.append("    threeDSReqAuthMethod: ").append(toIndentedString(threeDSReqAuthMethod)).append("\n");
    sb.append("    threeDSReqAuthTimestamp: ").append(toIndentedString(threeDSReqAuthTimestamp)).append("\n");
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
    openapiFields.add("threeDSReqAuthData");
    openapiFields.add("threeDSReqAuthMethod");
    openapiFields.add("threeDSReqAuthTimestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThreeDSRequestorAuthenticationInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ThreeDSRequestorAuthenticationInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThreeDSRequestorAuthenticationInfo is not found in the empty JSON string", ThreeDSRequestorAuthenticationInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ThreeDSRequestorAuthenticationInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ThreeDSRequestorAuthenticationInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("threeDSReqAuthData") != null && !jsonObj.get("threeDSReqAuthData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeDSReqAuthData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDSReqAuthData").toString()));
      }
      if (jsonObj.get("threeDSReqAuthMethod") != null && !jsonObj.get("threeDSReqAuthMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeDSReqAuthMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDSReqAuthMethod").toString()));
      }
      if (jsonObj.get("threeDSReqAuthTimestamp") != null && !jsonObj.get("threeDSReqAuthTimestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeDSReqAuthTimestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDSReqAuthTimestamp").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThreeDSRequestorAuthenticationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThreeDSRequestorAuthenticationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThreeDSRequestorAuthenticationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThreeDSRequestorAuthenticationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ThreeDSRequestorAuthenticationInfo>() {
           @Override
           public void write(JsonWriter out, ThreeDSRequestorAuthenticationInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThreeDSRequestorAuthenticationInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

}

