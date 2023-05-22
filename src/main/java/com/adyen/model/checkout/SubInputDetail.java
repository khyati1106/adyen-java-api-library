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
import com.adyen.model.checkout.Item;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * SubInputDetail
 */

public class SubInputDetail {
  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private Map<String, String> configuration = null;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Item> items = null;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public SubInputDetail() { 
  }

  public SubInputDetail configuration(Map<String, String> configuration) {
    
    this.configuration = configuration;
    return this;
  }

  public SubInputDetail putConfigurationItem(String key, String configurationItem) {
    if (this.configuration == null) {
      this.configuration = new HashMap<>();
    }
    this.configuration.put(key, configurationItem);
    return this;
  }

   /**
   * Configuration parameters for the required input.
   * @return configuration
  **/
  @ApiModelProperty(value = "Configuration parameters for the required input.")

  public Map<String, String> getConfiguration() {
    return configuration;
  }


  public void setConfiguration(Map<String, String> configuration) {
    this.configuration = configuration;
  }


  public SubInputDetail items(List<Item> items) {
    
    this.items = items;
    return this;
  }

  public SubInputDetail addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * In case of a select, the items to choose from.
   * @return items
  **/
  @ApiModelProperty(value = "In case of a select, the items to choose from.")

  public List<Item> getItems() {
    return items;
  }


  public void setItems(List<Item> items) {
    this.items = items;
  }


  public SubInputDetail key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The value to provide in the result.
   * @return key
  **/
  @ApiModelProperty(value = "The value to provide in the result.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public SubInputDetail optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * True if this input is optional to provide.
   * @return optional
  **/
  @ApiModelProperty(value = "True if this input is optional to provide.")

  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public SubInputDetail type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the required input.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the required input.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public SubInputDetail value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value can be pre-filled, if available.
   * @return value
  **/
  @ApiModelProperty(value = "The value can be pre-filled, if available.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubInputDetail subInputDetail = (SubInputDetail) o;
    return Objects.equals(this.configuration, subInputDetail.configuration) &&
        Objects.equals(this.items, subInputDetail.items) &&
        Objects.equals(this.key, subInputDetail.key) &&
        Objects.equals(this.optional, subInputDetail.optional) &&
        Objects.equals(this.type, subInputDetail.type) &&
        Objects.equals(this.value, subInputDetail.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configuration, items, key, optional, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubInputDetail {\n");
    sb.append("    configuration: ").append(toIndentedString(configuration)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("configuration");
    openapiFields.add("items");
    openapiFields.add("key");
    openapiFields.add("optional");
    openapiFields.add("type");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(SubInputDetail.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubInputDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubInputDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubInputDetail is not found in the empty JSON string", SubInputDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubInputDetail.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `SubInputDetail` properties.", entry.getKey()));
        }
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      if (jsonArrayitems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
        }

        // validate the optional field `items` (array)
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          Item.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
        }
      }
      // validate the optional field key
      if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      // validate the optional field type
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field value
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubInputDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubInputDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubInputDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubInputDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<SubInputDetail>() {
           @Override
           public void write(JsonWriter out, SubInputDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubInputDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubInputDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubInputDetail
  * @throws IOException if the JSON string is invalid with respect to SubInputDetail
  */
  public static SubInputDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubInputDetail.class);
  }

 /**
  * Convert an instance of SubInputDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

