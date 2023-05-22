/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

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

import com.adyen.model.balanceplatform.JSON;

/**
 * DayOfWeekRestriction
 */

public class DayOfWeekRestriction {
  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  /**
   * Gets or Sets value
   */
  @JsonAdapter(ValueEnum.Adapter.class)
  public enum ValueEnum {
    FRIDAY("friday"),
    
    MONDAY("monday"),
    
    SATURDAY("saturday"),
    
    SUNDAY("sunday"),
    
    THURSDAY("thursday"),
    
    TUESDAY("tuesday"),
    
    WEDNESDAY("wednesday");

    private String value;

    ValueEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValueEnum fromValue(String value) {
      for (ValueEnum b : ValueEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ValueEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValueEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValueEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ValueEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private List<ValueEnum> value = null;

  public DayOfWeekRestriction() { 
  }

  public DayOfWeekRestriction operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Defines how the condition must be evaluated.
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "Defines how the condition must be evaluated.")

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }


  public DayOfWeekRestriction value(List<ValueEnum> value) {
    
    this.value = value;
    return this;
  }

  public DayOfWeekRestriction addValueItem(ValueEnum valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * List of days of the week.  Possible values: **monday**, **tuesday**, **wednesday**, **thursday**, **friday**, **saturday**, **sunday**.  
   * @return value
  **/
  @ApiModelProperty(value = "List of days of the week.  Possible values: **monday**, **tuesday**, **wednesday**, **thursday**, **friday**, **saturday**, **sunday**.  ")

  public List<ValueEnum> getValue() {
    return value;
  }


  public void setValue(List<ValueEnum> value) {
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
    DayOfWeekRestriction dayOfWeekRestriction = (DayOfWeekRestriction) o;
    return Objects.equals(this.operation, dayOfWeekRestriction.operation) &&
        Objects.equals(this.value, dayOfWeekRestriction.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DayOfWeekRestriction {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
    openapiFields.add("operation");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operation");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(DayOfWeekRestriction.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DayOfWeekRestriction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DayOfWeekRestriction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DayOfWeekRestriction is not found in the empty JSON string", DayOfWeekRestriction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DayOfWeekRestriction.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `DayOfWeekRestriction` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DayOfWeekRestriction.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field operation
      if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonArray()) {
        log.log(Level.WARNING, String.format("Expected the field `value` to be an array in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DayOfWeekRestriction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DayOfWeekRestriction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DayOfWeekRestriction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DayOfWeekRestriction.class));

       return (TypeAdapter<T>) new TypeAdapter<DayOfWeekRestriction>() {
           @Override
           public void write(JsonWriter out, DayOfWeekRestriction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DayOfWeekRestriction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DayOfWeekRestriction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DayOfWeekRestriction
  * @throws IOException if the JSON string is invalid with respect to DayOfWeekRestriction
  */
  public static DayOfWeekRestriction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DayOfWeekRestriction.class);
  }

 /**
  * Convert an instance of DayOfWeekRestriction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

