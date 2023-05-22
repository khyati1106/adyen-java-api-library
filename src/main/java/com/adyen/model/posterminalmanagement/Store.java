/*
 * POS Terminal Management API
 * This API provides endpoints for managing your point-of-sale (POS) payment terminals. You can use the API to obtain information about a specific terminal, retrieve overviews of your terminals and stores, and assign terminals to a merchant account or store.  For more information, refer to [Assign terminals](https://docs.adyen.com/point-of-sale/automating-terminal-management/assign-terminals-api).  ## Authentication Each request to the Terminal Management API must be signed with an API key. For this, obtain an API Key from your Customer Area, as described in [How to get the API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key). Then set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: Your_API_key\" \\ ... ``` Note that when going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning Terminal Management API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://postfmapi-test.adyen.com/postfmapi/terminal/v1/getTerminalsUnderAccount ``` When using versioned endpoints, Boolean response values are returned in string format: `\"true\"` or `\"false\"`. If you omit the version from the endpoint URL, Boolean response values are returned like this: `true` or `false`.
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.posterminalmanagement;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.posterminalmanagement.Address;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import com.adyen.model.posterminalmanagement.JSON;

/**
 * Store
 */

public class Store {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IN_STORE_TERMINALS = "inStoreTerminals";
  @SerializedName(SERIALIZED_NAME_IN_STORE_TERMINALS)
  private List<String> inStoreTerminals = null;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT_CODE = "merchantAccountCode";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT_CODE)
  private String merchantAccountCode;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STORE = "store";
  @SerializedName(SERIALIZED_NAME_STORE)
  private String store;

  public Store() { 
  }

  public Store address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public Store description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the store.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the store.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Store inStoreTerminals(List<String> inStoreTerminals) {
    
    this.inStoreTerminals = inStoreTerminals;
    return this;
  }

  public Store addInStoreTerminalsItem(String inStoreTerminalsItem) {
    if (this.inStoreTerminals == null) {
      this.inStoreTerminals = new ArrayList<>();
    }
    this.inStoreTerminals.add(inStoreTerminalsItem);
    return this;
  }

   /**
   * The list of terminals assigned to the store.
   * @return inStoreTerminals
  **/
  @ApiModelProperty(value = "The list of terminals assigned to the store.")

  public List<String> getInStoreTerminals() {
    return inStoreTerminals;
  }


  public void setInStoreTerminals(List<String> inStoreTerminals) {
    this.inStoreTerminals = inStoreTerminals;
  }


  public Store merchantAccountCode(String merchantAccountCode) {
    
    this.merchantAccountCode = merchantAccountCode;
    return this;
  }

   /**
   * The code of the merchant account.
   * @return merchantAccountCode
  **/
  @ApiModelProperty(value = "The code of the merchant account.")

  public String getMerchantAccountCode() {
    return merchantAccountCode;
  }


  public void setMerchantAccountCode(String merchantAccountCode) {
    this.merchantAccountCode = merchantAccountCode;
  }


  public Store status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the store:  - &#x60;PreActive&#x60;: the store has been created, but not yet activated.   - &#x60;Active&#x60;: the store has been activated. This means you can process payments for this store.   - &#x60;Inactive&#x60;: the store is currently not active.   - &#x60;InactiveWithModifications&#x60;: the store is currently not active, but payment modifications such as refunds are possible.   - &#x60;Closed&#x60;: the store has been closed. 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the store:  - `PreActive`: the store has been created, but not yet activated.   - `Active`: the store has been activated. This means you can process payments for this store.   - `Inactive`: the store is currently not active.   - `InactiveWithModifications`: the store is currently not active, but payment modifications such as refunds are possible.   - `Closed`: the store has been closed. ")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Store store(String store) {
    
    this.store = store;
    return this;
  }

   /**
   * The code of the store.
   * @return store
  **/
  @ApiModelProperty(required = true, value = "The code of the store.")

  public String getStore() {
    return store;
  }


  public void setStore(String store) {
    this.store = store;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Store store = (Store) o;
    return Objects.equals(this.address, store.address) &&
        Objects.equals(this.description, store.description) &&
        Objects.equals(this.inStoreTerminals, store.inStoreTerminals) &&
        Objects.equals(this.merchantAccountCode, store.merchantAccountCode) &&
        Objects.equals(this.status, store.status) &&
        Objects.equals(this.store, store.store);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, description, inStoreTerminals, merchantAccountCode, status, store);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Store {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inStoreTerminals: ").append(toIndentedString(inStoreTerminals)).append("\n");
    sb.append("    merchantAccountCode: ").append(toIndentedString(merchantAccountCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("description");
    openapiFields.add("inStoreTerminals");
    openapiFields.add("merchantAccountCode");
    openapiFields.add("status");
    openapiFields.add("store");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("store");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(Store.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Store
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Store.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Store is not found in the empty JSON string", Store.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Store.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `Store` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Store.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `address`
      if (jsonObj.getAsJsonObject("address") != null) {
        Address.validateJsonObject(jsonObj.getAsJsonObject("address"));
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("inStoreTerminals") != null && !jsonObj.get("inStoreTerminals").isJsonArray()) {
        log.log(Level.WARNING, String.format("Expected the field `inStoreTerminals` to be an array in the JSON string but got `%s`", jsonObj.get("inStoreTerminals").toString()));
      }
      // validate the optional field merchantAccountCode
      if (jsonObj.get("merchantAccountCode") != null && !jsonObj.get("merchantAccountCode").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `merchantAccountCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccountCode").toString()));
      }
      // validate the optional field status
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field store
      if (jsonObj.get("store") != null && !jsonObj.get("store").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `store` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Store.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Store' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Store> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Store.class));

       return (TypeAdapter<T>) new TypeAdapter<Store>() {
           @Override
           public void write(JsonWriter out, Store value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Store read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Store given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Store
  * @throws IOException if the JSON string is invalid with respect to Store
  */
  public static Store fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Store.class);
  }

 /**
  * Convert an instance of Store to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

