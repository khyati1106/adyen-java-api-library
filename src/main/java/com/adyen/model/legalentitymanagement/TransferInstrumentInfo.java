/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.legalentitymanagement.BankAccountInfo;
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

import com.adyen.model.legalentitymanagement.JSON;

/**
 * TransferInstrumentInfo
 */

public class TransferInstrumentInfo {
  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bankAccount";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private BankAccountInfo bankAccount;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY_ID = "legalEntityId";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY_ID)
  private String legalEntityId;

  /**
   * The type of transfer instrument.  Possible value: **bankAccount**.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BANKACCOUNT("bankAccount"),
    
    RECURRINGDETAIL("recurringDetail");

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
  private TypeEnum type;

  public TransferInstrumentInfo() { 
  }

  public TransferInstrumentInfo bankAccount(BankAccountInfo bankAccount) {
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(required = true, value = "")

  public BankAccountInfo getBankAccount() {
    return bankAccount;
  }


  public void setBankAccount(BankAccountInfo bankAccount) {
    this.bankAccount = bankAccount;
  }


  public TransferInstrumentInfo legalEntityId(String legalEntityId) {
    
    this.legalEntityId = legalEntityId;
    return this;
  }

   /**
   * The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id) that owns the transfer instrument.
   * @return legalEntityId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id) that owns the transfer instrument.")

  public String getLegalEntityId() {
    return legalEntityId;
  }


  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
  }


  public TransferInstrumentInfo type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of transfer instrument.  Possible value: **bankAccount**.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of transfer instrument.  Possible value: **bankAccount**.")

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
    TransferInstrumentInfo transferInstrumentInfo = (TransferInstrumentInfo) o;
    return Objects.equals(this.bankAccount, transferInstrumentInfo.bankAccount) &&
        Objects.equals(this.legalEntityId, transferInstrumentInfo.legalEntityId) &&
        Objects.equals(this.type, transferInstrumentInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccount, legalEntityId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferInstrumentInfo {\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
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
    openapiFields.add("bankAccount");
    openapiFields.add("legalEntityId");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bankAccount");
    openapiRequiredFields.add("legalEntityId");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransferInstrumentInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransferInstrumentInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransferInstrumentInfo is not found in the empty JSON string", TransferInstrumentInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransferInstrumentInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransferInstrumentInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransferInstrumentInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `bankAccount`
      if (jsonObj.getAsJsonObject("bankAccount") != null) {
        BankAccountInfo.validateJsonObject(jsonObj.getAsJsonObject("bankAccount"));
      }
      // validate the optional field legalEntityId
      if (jsonObj.get("legalEntityId") != null && !jsonObj.get("legalEntityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalEntityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalEntityId").toString()));
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
       if (!TransferInstrumentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferInstrumentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferInstrumentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferInstrumentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferInstrumentInfo>() {
           @Override
           public void write(JsonWriter out, TransferInstrumentInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferInstrumentInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransferInstrumentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransferInstrumentInfo
  * @throws IOException if the JSON string is invalid with respect to TransferInstrumentInfo
  */
  public static TransferInstrumentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferInstrumentInfo.class);
  }

 /**
  * Convert an instance of TransferInstrumentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

