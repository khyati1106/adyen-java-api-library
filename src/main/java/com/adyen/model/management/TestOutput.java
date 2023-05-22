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
 * TestOutput
 */

public class TestOutput {
  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchantId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private String output;

  public static final String SERIALIZED_NAME_REQUEST_SENT = "requestSent";
  @SerializedName(SERIALIZED_NAME_REQUEST_SENT)
  private String requestSent;

  public static final String SERIALIZED_NAME_RESPONSE_CODE = "responseCode";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CODE)
  private String responseCode;

  public static final String SERIALIZED_NAME_RESPONSE_TIME = "responseTime";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TIME)
  private String responseTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public TestOutput() { 
  }

  public TestOutput merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Unique identifier of the merchant account that the notification is about.
   * @return merchantId
  **/
  @ApiModelProperty(value = "Unique identifier of the merchant account that the notification is about.")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public TestOutput output(String output) {
    
    this.output = output;
    return this;
  }

   /**
   * The response your server returned for the test webhook.  Your server must respond with **[accepted]** for the test webhook to be successful (&#x60;data.status&#x60;: **success**). Find out more about [accepting notifications](https://docs.adyen.com/development-resources/webhooks#accept-notifications)  You can use the value of this field together with the [&#x60;responseCode&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot unsuccessful test webhooks.
   * @return output
  **/
  @ApiModelProperty(value = "The response your server returned for the test webhook.  Your server must respond with **[accepted]** for the test webhook to be successful (`data.status`: **success**). Find out more about [accepting notifications](https://docs.adyen.com/development-resources/webhooks#accept-notifications)  You can use the value of this field together with the [`responseCode`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot unsuccessful test webhooks.")

  public String getOutput() {
    return output;
  }


  public void setOutput(String output) {
    this.output = output;
  }


  public TestOutput requestSent(String requestSent) {
    
    this.requestSent = requestSent;
    return this;
  }

   /**
   * The [body of the notification webhook](https://docs.adyen.com/development-resources/webhooks/understand-notifications#notification-structure) that was sent to your server.
   * @return requestSent
  **/
  @ApiModelProperty(value = "The [body of the notification webhook](https://docs.adyen.com/development-resources/webhooks/understand-notifications#notification-structure) that was sent to your server.")

  public String getRequestSent() {
    return requestSent;
  }


  public void setRequestSent(String requestSent) {
    this.requestSent = requestSent;
  }


  public TestOutput responseCode(String responseCode) {
    
    this.responseCode = responseCode;
    return this;
  }

   /**
   * The HTTP response code for your server&#39;s response to the test webhook.  You can use the value of this field together with the the [&#x60;output&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field value to troubleshoot failed test webhooks.
   * @return responseCode
  **/
  @ApiModelProperty(example = "200", value = "The HTTP response code for your server's response to the test webhook.  You can use the value of this field together with the the [`output`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field value to troubleshoot failed test webhooks.")

  public String getResponseCode() {
    return responseCode;
  }


  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }


  public TestOutput responseTime(String responseTime) {
    
    this.responseTime = responseTime;
    return this;
  }

   /**
   * The time between sending the test webhook and receiving the response from your server. You can use it as an indication of how long your server takes to process a webhook notification. Measured in milliseconds, for example **304 ms**.
   * @return responseTime
  **/
  @ApiModelProperty(value = "The time between sending the test webhook and receiving the response from your server. You can use it as an indication of how long your server takes to process a webhook notification. Measured in milliseconds, for example **304 ms**.")

  public String getResponseTime() {
    return responseTime;
  }


  public void setResponseTime(String responseTime) {
    this.responseTime = responseTime;
  }


  public TestOutput status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the test request. Possible values are: * **success**, if &#x60;data.output&#x60;: **[accepted]** and &#x60;data.responseCode&#x60;: **200**. * **failed**, in all other cases.  You can use the value of the [&#x60;output&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field together with the [&#x60;responseCode&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot failed test webhooks.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the test request. Possible values are: * **success**, if `data.output`: **[accepted]** and `data.responseCode`: **200**. * **failed**, in all other cases.  You can use the value of the [`output`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field together with the [`responseCode`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot failed test webhooks.")

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
    TestOutput testOutput = (TestOutput) o;
    return Objects.equals(this.merchantId, testOutput.merchantId) &&
        Objects.equals(this.output, testOutput.output) &&
        Objects.equals(this.requestSent, testOutput.requestSent) &&
        Objects.equals(this.responseCode, testOutput.responseCode) &&
        Objects.equals(this.responseTime, testOutput.responseTime) &&
        Objects.equals(this.status, testOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, output, requestSent, responseCode, responseTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestOutput {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    requestSent: ").append(toIndentedString(requestSent)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
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
    openapiFields.add("merchantId");
    openapiFields.add("output");
    openapiFields.add("requestSent");
    openapiFields.add("responseCode");
    openapiFields.add("responseTime");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(TestOutput.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestOutput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TestOutput.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestOutput is not found in the empty JSON string", TestOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestOutput.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `TestOutput` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestOutput.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field merchantId
      if (jsonObj.get("merchantId") != null && !jsonObj.get("merchantId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `merchantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantId").toString()));
      }
      // validate the optional field output
      if (jsonObj.get("output") != null && !jsonObj.get("output").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `output` to be a primitive type in the JSON string but got `%s`", jsonObj.get("output").toString()));
      }
      // validate the optional field requestSent
      if (jsonObj.get("requestSent") != null && !jsonObj.get("requestSent").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `requestSent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestSent").toString()));
      }
      // validate the optional field responseCode
      if (jsonObj.get("responseCode") != null && !jsonObj.get("responseCode").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `responseCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseCode").toString()));
      }
      // validate the optional field responseTime
      if (jsonObj.get("responseTime") != null && !jsonObj.get("responseTime").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `responseTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseTime").toString()));
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
       if (!TestOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<TestOutput>() {
           @Override
           public void write(JsonWriter out, TestOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestOutput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestOutput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestOutput
  * @throws IOException if the JSON string is invalid with respect to TestOutput
  */
  public static TestOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestOutput.class);
  }

 /**
  * Convert an instance of TestOutput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

