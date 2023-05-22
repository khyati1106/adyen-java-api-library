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
 * AdditionalDataLodging
 */

public class AdditionalDataLodging {
  public static final String SERIALIZED_NAME_LODGING_CHECK_IN_DATE = "lodging.checkInDate";
  @SerializedName(SERIALIZED_NAME_LODGING_CHECK_IN_DATE)
  private String lodgingCheckInDate;

  public static final String SERIALIZED_NAME_LODGING_CHECK_OUT_DATE = "lodging.checkOutDate";
  @SerializedName(SERIALIZED_NAME_LODGING_CHECK_OUT_DATE)
  private String lodgingCheckOutDate;

  public static final String SERIALIZED_NAME_LODGING_CUSTOMER_SERVICE_TOLL_FREE_NUMBER = "lodging.customerServiceTollFreeNumber";
  @SerializedName(SERIALIZED_NAME_LODGING_CUSTOMER_SERVICE_TOLL_FREE_NUMBER)
  private String lodgingCustomerServiceTollFreeNumber;

  public static final String SERIALIZED_NAME_LODGING_FIRE_SAFETY_ACT_INDICATOR = "lodging.fireSafetyActIndicator";
  @SerializedName(SERIALIZED_NAME_LODGING_FIRE_SAFETY_ACT_INDICATOR)
  private String lodgingFireSafetyActIndicator;

  public static final String SERIALIZED_NAME_LODGING_FOLIO_CASH_ADVANCES = "lodging.folioCashAdvances";
  @SerializedName(SERIALIZED_NAME_LODGING_FOLIO_CASH_ADVANCES)
  private String lodgingFolioCashAdvances;

  public static final String SERIALIZED_NAME_LODGING_FOLIO_NUMBER = "lodging.folioNumber";
  @SerializedName(SERIALIZED_NAME_LODGING_FOLIO_NUMBER)
  private String lodgingFolioNumber;

  public static final String SERIALIZED_NAME_LODGING_FOOD_BEVERAGE_CHARGES = "lodging.foodBeverageCharges";
  @SerializedName(SERIALIZED_NAME_LODGING_FOOD_BEVERAGE_CHARGES)
  private String lodgingFoodBeverageCharges;

  public static final String SERIALIZED_NAME_LODGING_NO_SHOW_INDICATOR = "lodging.noShowIndicator";
  @SerializedName(SERIALIZED_NAME_LODGING_NO_SHOW_INDICATOR)
  private String lodgingNoShowIndicator;

  public static final String SERIALIZED_NAME_LODGING_PREPAID_EXPENSES = "lodging.prepaidExpenses";
  @SerializedName(SERIALIZED_NAME_LODGING_PREPAID_EXPENSES)
  private String lodgingPrepaidExpenses;

  public static final String SERIALIZED_NAME_LODGING_PROPERTY_PHONE_NUMBER = "lodging.propertyPhoneNumber";
  @SerializedName(SERIALIZED_NAME_LODGING_PROPERTY_PHONE_NUMBER)
  private String lodgingPropertyPhoneNumber;

  public static final String SERIALIZED_NAME_LODGING_ROOM1_NUMBER_OF_NIGHTS = "lodging.room1.numberOfNights";
  @SerializedName(SERIALIZED_NAME_LODGING_ROOM1_NUMBER_OF_NIGHTS)
  private String lodgingRoom1NumberOfNights;

  public static final String SERIALIZED_NAME_LODGING_ROOM1_RATE = "lodging.room1.rate";
  @SerializedName(SERIALIZED_NAME_LODGING_ROOM1_RATE)
  private String lodgingRoom1Rate;

  public static final String SERIALIZED_NAME_LODGING_TOTAL_ROOM_TAX = "lodging.totalRoomTax";
  @SerializedName(SERIALIZED_NAME_LODGING_TOTAL_ROOM_TAX)
  private String lodgingTotalRoomTax;

  public static final String SERIALIZED_NAME_LODGING_TOTAL_TAX = "lodging.totalTax";
  @SerializedName(SERIALIZED_NAME_LODGING_TOTAL_TAX)
  private String lodgingTotalTax;

  public static final String SERIALIZED_NAME_TRAVEL_ENTERTAINMENT_AUTH_DATA_DURATION = "travelEntertainmentAuthData.duration";
  @SerializedName(SERIALIZED_NAME_TRAVEL_ENTERTAINMENT_AUTH_DATA_DURATION)
  private String travelEntertainmentAuthDataDuration;

  public static final String SERIALIZED_NAME_TRAVEL_ENTERTAINMENT_AUTH_DATA_MARKET = "travelEntertainmentAuthData.market";
  @SerializedName(SERIALIZED_NAME_TRAVEL_ENTERTAINMENT_AUTH_DATA_MARKET)
  private String travelEntertainmentAuthDataMarket;

  public AdditionalDataLodging() { 
  }

  public AdditionalDataLodging lodgingCheckInDate(String lodgingCheckInDate) {
    
    this.lodgingCheckInDate = lodgingCheckInDate;
    return this;
  }

   /**
   * The arrival date. * Date format: **yyyyMmDd**. For example, for 2023 April 22, **20230422**.
   * @return lodgingCheckInDate
  **/
  @ApiModelProperty(value = "The arrival date. * Date format: **yyyyMmDd**. For example, for 2023 April 22, **20230422**.")

  public String getLodgingCheckInDate() {
    return lodgingCheckInDate;
  }


  public void setLodgingCheckInDate(String lodgingCheckInDate) {
    this.lodgingCheckInDate = lodgingCheckInDate;
  }


  public AdditionalDataLodging lodgingCheckOutDate(String lodgingCheckOutDate) {
    
    this.lodgingCheckOutDate = lodgingCheckOutDate;
    return this;
  }

   /**
   * The departure date. * Date format: **yyyyMmDd**. For example, for 2023 April 22, **20230422**.
   * @return lodgingCheckOutDate
  **/
  @ApiModelProperty(value = "The departure date. * Date format: **yyyyMmDd**. For example, for 2023 April 22, **20230422**.")

  public String getLodgingCheckOutDate() {
    return lodgingCheckOutDate;
  }


  public void setLodgingCheckOutDate(String lodgingCheckOutDate) {
    this.lodgingCheckOutDate = lodgingCheckOutDate;
  }


  public AdditionalDataLodging lodgingCustomerServiceTollFreeNumber(String lodgingCustomerServiceTollFreeNumber) {
    
    this.lodgingCustomerServiceTollFreeNumber = lodgingCustomerServiceTollFreeNumber;
    return this;
  }

   /**
   * The toll-free phone number for the lodging. * Format: numeric * Max length: 17 characters. * For US and CA numbers must be 10 characters in length * Must not start with a space * Must not be all zeros * Must not contain any special characters such as + or -
   * @return lodgingCustomerServiceTollFreeNumber
  **/
  @ApiModelProperty(value = "The toll-free phone number for the lodging. * Format: numeric * Max length: 17 characters. * For US and CA numbers must be 10 characters in length * Must not start with a space * Must not be all zeros * Must not contain any special characters such as + or -")

  public String getLodgingCustomerServiceTollFreeNumber() {
    return lodgingCustomerServiceTollFreeNumber;
  }


  public void setLodgingCustomerServiceTollFreeNumber(String lodgingCustomerServiceTollFreeNumber) {
    this.lodgingCustomerServiceTollFreeNumber = lodgingCustomerServiceTollFreeNumber;
  }


  public AdditionalDataLodging lodgingFireSafetyActIndicator(String lodgingFireSafetyActIndicator) {
    
    this.lodgingFireSafetyActIndicator = lodgingFireSafetyActIndicator;
    return this;
  }

   /**
   * Identifies that the facility complies with the Hotel and Motel Fire Safety Act of 1990. Must be &#39;Y&#39; or &#39;N&#39;. * Format: alphabetic * Max length: 1 character
   * @return lodgingFireSafetyActIndicator
  **/
  @ApiModelProperty(value = "Identifies that the facility complies with the Hotel and Motel Fire Safety Act of 1990. Must be 'Y' or 'N'. * Format: alphabetic * Max length: 1 character")

  public String getLodgingFireSafetyActIndicator() {
    return lodgingFireSafetyActIndicator;
  }


  public void setLodgingFireSafetyActIndicator(String lodgingFireSafetyActIndicator) {
    this.lodgingFireSafetyActIndicator = lodgingFireSafetyActIndicator;
  }


  public AdditionalDataLodging lodgingFolioCashAdvances(String lodgingFolioCashAdvances) {
    
    this.lodgingFolioCashAdvances = lodgingFolioCashAdvances;
    return this;
  }

   /**
   * The folio cash advances, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters
   * @return lodgingFolioCashAdvances
  **/
  @ApiModelProperty(value = "The folio cash advances, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters")

  public String getLodgingFolioCashAdvances() {
    return lodgingFolioCashAdvances;
  }


  public void setLodgingFolioCashAdvances(String lodgingFolioCashAdvances) {
    this.lodgingFolioCashAdvances = lodgingFolioCashAdvances;
  }


  public AdditionalDataLodging lodgingFolioNumber(String lodgingFolioNumber) {
    
    this.lodgingFolioNumber = lodgingFolioNumber;
    return this;
  }

   /**
   * The card acceptor’s internal invoice or billing ID reference number. * Max length: 25 characters. * Must not start with a space * Must not be all zeros
   * @return lodgingFolioNumber
  **/
  @ApiModelProperty(value = "The card acceptor’s internal invoice or billing ID reference number. * Max length: 25 characters. * Must not start with a space * Must not be all zeros")

  public String getLodgingFolioNumber() {
    return lodgingFolioNumber;
  }


  public void setLodgingFolioNumber(String lodgingFolioNumber) {
    this.lodgingFolioNumber = lodgingFolioNumber;
  }


  public AdditionalDataLodging lodgingFoodBeverageCharges(String lodgingFoodBeverageCharges) {
    
    this.lodgingFoodBeverageCharges = lodgingFoodBeverageCharges;
    return this;
  }

   /**
   * Any charges for food and beverages associated with the booking, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters
   * @return lodgingFoodBeverageCharges
  **/
  @ApiModelProperty(value = "Any charges for food and beverages associated with the booking, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters")

  public String getLodgingFoodBeverageCharges() {
    return lodgingFoodBeverageCharges;
  }


  public void setLodgingFoodBeverageCharges(String lodgingFoodBeverageCharges) {
    this.lodgingFoodBeverageCharges = lodgingFoodBeverageCharges;
  }


  public AdditionalDataLodging lodgingNoShowIndicator(String lodgingNoShowIndicator) {
    
    this.lodgingNoShowIndicator = lodgingNoShowIndicator;
    return this;
  }

   /**
   * Indicates if the customer didn&#39;t check in for their booking.  Possible values:  * **Y**: the customer didn&#39;t check in  * **N**: the customer checked in
   * @return lodgingNoShowIndicator
  **/
  @ApiModelProperty(value = "Indicates if the customer didn't check in for their booking.  Possible values:  * **Y**: the customer didn't check in  * **N**: the customer checked in")

  public String getLodgingNoShowIndicator() {
    return lodgingNoShowIndicator;
  }


  public void setLodgingNoShowIndicator(String lodgingNoShowIndicator) {
    this.lodgingNoShowIndicator = lodgingNoShowIndicator;
  }


  public AdditionalDataLodging lodgingPrepaidExpenses(String lodgingPrepaidExpenses) {
    
    this.lodgingPrepaidExpenses = lodgingPrepaidExpenses;
    return this;
  }

   /**
   * The prepaid expenses for the booking. * Format: numeric * Max length: 12 characters
   * @return lodgingPrepaidExpenses
  **/
  @ApiModelProperty(value = "The prepaid expenses for the booking. * Format: numeric * Max length: 12 characters")

  public String getLodgingPrepaidExpenses() {
    return lodgingPrepaidExpenses;
  }


  public void setLodgingPrepaidExpenses(String lodgingPrepaidExpenses) {
    this.lodgingPrepaidExpenses = lodgingPrepaidExpenses;
  }


  public AdditionalDataLodging lodgingPropertyPhoneNumber(String lodgingPropertyPhoneNumber) {
    
    this.lodgingPropertyPhoneNumber = lodgingPropertyPhoneNumber;
    return this;
  }

   /**
   * The lodging property location&#39;s phone number. * Format: numeric. * Min length: 10 characters * Max length: 17 characters * For US and CA numbers must be 10 characters in length * Must not start with a space * Must not be all zeros * Must not contain any special characters such as + or -
   * @return lodgingPropertyPhoneNumber
  **/
  @ApiModelProperty(value = "The lodging property location's phone number. * Format: numeric. * Min length: 10 characters * Max length: 17 characters * For US and CA numbers must be 10 characters in length * Must not start with a space * Must not be all zeros * Must not contain any special characters such as + or -")

  public String getLodgingPropertyPhoneNumber() {
    return lodgingPropertyPhoneNumber;
  }


  public void setLodgingPropertyPhoneNumber(String lodgingPropertyPhoneNumber) {
    this.lodgingPropertyPhoneNumber = lodgingPropertyPhoneNumber;
  }


  public AdditionalDataLodging lodgingRoom1NumberOfNights(String lodgingRoom1NumberOfNights) {
    
    this.lodgingRoom1NumberOfNights = lodgingRoom1NumberOfNights;
    return this;
  }

   /**
   * The total number of nights the room is booked for. * Format: numeric * Must be a number between 0 and 99 * Max length: 2 characters
   * @return lodgingRoom1NumberOfNights
  **/
  @ApiModelProperty(value = "The total number of nights the room is booked for. * Format: numeric * Must be a number between 0 and 99 * Max length: 2 characters")

  public String getLodgingRoom1NumberOfNights() {
    return lodgingRoom1NumberOfNights;
  }


  public void setLodgingRoom1NumberOfNights(String lodgingRoom1NumberOfNights) {
    this.lodgingRoom1NumberOfNights = lodgingRoom1NumberOfNights;
  }


  public AdditionalDataLodging lodgingRoom1Rate(String lodgingRoom1Rate) {
    
    this.lodgingRoom1Rate = lodgingRoom1Rate;
    return this;
  }

   /**
   * The rate for the room, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters * Must not be a negative number
   * @return lodgingRoom1Rate
  **/
  @ApiModelProperty(value = "The rate for the room, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters * Must not be a negative number")

  public String getLodgingRoom1Rate() {
    return lodgingRoom1Rate;
  }


  public void setLodgingRoom1Rate(String lodgingRoom1Rate) {
    this.lodgingRoom1Rate = lodgingRoom1Rate;
  }


  public AdditionalDataLodging lodgingTotalRoomTax(String lodgingTotalRoomTax) {
    
    this.lodgingTotalRoomTax = lodgingTotalRoomTax;
    return this;
  }

   /**
   * The total room tax amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters * Must not be a negative number
   * @return lodgingTotalRoomTax
  **/
  @ApiModelProperty(value = "The total room tax amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters * Must not be a negative number")

  public String getLodgingTotalRoomTax() {
    return lodgingTotalRoomTax;
  }


  public void setLodgingTotalRoomTax(String lodgingTotalRoomTax) {
    this.lodgingTotalRoomTax = lodgingTotalRoomTax;
  }


  public AdditionalDataLodging lodgingTotalTax(String lodgingTotalTax) {
    
    this.lodgingTotalTax = lodgingTotalTax;
    return this;
  }

   /**
   * The total tax amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters * Must not be a negative number
   * @return lodgingTotalTax
  **/
  @ApiModelProperty(value = "The total tax amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters * Must not be a negative number")

  public String getLodgingTotalTax() {
    return lodgingTotalTax;
  }


  public void setLodgingTotalTax(String lodgingTotalTax) {
    this.lodgingTotalTax = lodgingTotalTax;
  }


  public AdditionalDataLodging travelEntertainmentAuthDataDuration(String travelEntertainmentAuthDataDuration) {
    
    this.travelEntertainmentAuthDataDuration = travelEntertainmentAuthDataDuration;
    return this;
  }

   /**
   * The number of nights. This should be included in the auth message. * Format: numeric * Max length: 2 characters
   * @return travelEntertainmentAuthDataDuration
  **/
  @ApiModelProperty(value = "The number of nights. This should be included in the auth message. * Format: numeric * Max length: 2 characters")

  public String getTravelEntertainmentAuthDataDuration() {
    return travelEntertainmentAuthDataDuration;
  }


  public void setTravelEntertainmentAuthDataDuration(String travelEntertainmentAuthDataDuration) {
    this.travelEntertainmentAuthDataDuration = travelEntertainmentAuthDataDuration;
  }


  public AdditionalDataLodging travelEntertainmentAuthDataMarket(String travelEntertainmentAuthDataMarket) {
    
    this.travelEntertainmentAuthDataMarket = travelEntertainmentAuthDataMarket;
    return this;
  }

   /**
   * Indicates what market-specific dataset will be submitted. Must be &#39;H&#39; for Hotel. This should be included in the auth message.  * Format: alphanumeric * Max length: 1 character
   * @return travelEntertainmentAuthDataMarket
  **/
  @ApiModelProperty(value = "Indicates what market-specific dataset will be submitted. Must be 'H' for Hotel. This should be included in the auth message.  * Format: alphanumeric * Max length: 1 character")

  public String getTravelEntertainmentAuthDataMarket() {
    return travelEntertainmentAuthDataMarket;
  }


  public void setTravelEntertainmentAuthDataMarket(String travelEntertainmentAuthDataMarket) {
    this.travelEntertainmentAuthDataMarket = travelEntertainmentAuthDataMarket;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataLodging additionalDataLodging = (AdditionalDataLodging) o;
    return Objects.equals(this.lodgingCheckInDate, additionalDataLodging.lodgingCheckInDate) &&
        Objects.equals(this.lodgingCheckOutDate, additionalDataLodging.lodgingCheckOutDate) &&
        Objects.equals(this.lodgingCustomerServiceTollFreeNumber, additionalDataLodging.lodgingCustomerServiceTollFreeNumber) &&
        Objects.equals(this.lodgingFireSafetyActIndicator, additionalDataLodging.lodgingFireSafetyActIndicator) &&
        Objects.equals(this.lodgingFolioCashAdvances, additionalDataLodging.lodgingFolioCashAdvances) &&
        Objects.equals(this.lodgingFolioNumber, additionalDataLodging.lodgingFolioNumber) &&
        Objects.equals(this.lodgingFoodBeverageCharges, additionalDataLodging.lodgingFoodBeverageCharges) &&
        Objects.equals(this.lodgingNoShowIndicator, additionalDataLodging.lodgingNoShowIndicator) &&
        Objects.equals(this.lodgingPrepaidExpenses, additionalDataLodging.lodgingPrepaidExpenses) &&
        Objects.equals(this.lodgingPropertyPhoneNumber, additionalDataLodging.lodgingPropertyPhoneNumber) &&
        Objects.equals(this.lodgingRoom1NumberOfNights, additionalDataLodging.lodgingRoom1NumberOfNights) &&
        Objects.equals(this.lodgingRoom1Rate, additionalDataLodging.lodgingRoom1Rate) &&
        Objects.equals(this.lodgingTotalRoomTax, additionalDataLodging.lodgingTotalRoomTax) &&
        Objects.equals(this.lodgingTotalTax, additionalDataLodging.lodgingTotalTax) &&
        Objects.equals(this.travelEntertainmentAuthDataDuration, additionalDataLodging.travelEntertainmentAuthDataDuration) &&
        Objects.equals(this.travelEntertainmentAuthDataMarket, additionalDataLodging.travelEntertainmentAuthDataMarket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lodgingCheckInDate, lodgingCheckOutDate, lodgingCustomerServiceTollFreeNumber, lodgingFireSafetyActIndicator, lodgingFolioCashAdvances, lodgingFolioNumber, lodgingFoodBeverageCharges, lodgingNoShowIndicator, lodgingPrepaidExpenses, lodgingPropertyPhoneNumber, lodgingRoom1NumberOfNights, lodgingRoom1Rate, lodgingTotalRoomTax, lodgingTotalTax, travelEntertainmentAuthDataDuration, travelEntertainmentAuthDataMarket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataLodging {\n");
    sb.append("    lodgingCheckInDate: ").append(toIndentedString(lodgingCheckInDate)).append("\n");
    sb.append("    lodgingCheckOutDate: ").append(toIndentedString(lodgingCheckOutDate)).append("\n");
    sb.append("    lodgingCustomerServiceTollFreeNumber: ").append(toIndentedString(lodgingCustomerServiceTollFreeNumber)).append("\n");
    sb.append("    lodgingFireSafetyActIndicator: ").append(toIndentedString(lodgingFireSafetyActIndicator)).append("\n");
    sb.append("    lodgingFolioCashAdvances: ").append(toIndentedString(lodgingFolioCashAdvances)).append("\n");
    sb.append("    lodgingFolioNumber: ").append(toIndentedString(lodgingFolioNumber)).append("\n");
    sb.append("    lodgingFoodBeverageCharges: ").append(toIndentedString(lodgingFoodBeverageCharges)).append("\n");
    sb.append("    lodgingNoShowIndicator: ").append(toIndentedString(lodgingNoShowIndicator)).append("\n");
    sb.append("    lodgingPrepaidExpenses: ").append(toIndentedString(lodgingPrepaidExpenses)).append("\n");
    sb.append("    lodgingPropertyPhoneNumber: ").append(toIndentedString(lodgingPropertyPhoneNumber)).append("\n");
    sb.append("    lodgingRoom1NumberOfNights: ").append(toIndentedString(lodgingRoom1NumberOfNights)).append("\n");
    sb.append("    lodgingRoom1Rate: ").append(toIndentedString(lodgingRoom1Rate)).append("\n");
    sb.append("    lodgingTotalRoomTax: ").append(toIndentedString(lodgingTotalRoomTax)).append("\n");
    sb.append("    lodgingTotalTax: ").append(toIndentedString(lodgingTotalTax)).append("\n");
    sb.append("    travelEntertainmentAuthDataDuration: ").append(toIndentedString(travelEntertainmentAuthDataDuration)).append("\n");
    sb.append("    travelEntertainmentAuthDataMarket: ").append(toIndentedString(travelEntertainmentAuthDataMarket)).append("\n");
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
    openapiFields.add("lodging.checkInDate");
    openapiFields.add("lodging.checkOutDate");
    openapiFields.add("lodging.customerServiceTollFreeNumber");
    openapiFields.add("lodging.fireSafetyActIndicator");
    openapiFields.add("lodging.folioCashAdvances");
    openapiFields.add("lodging.folioNumber");
    openapiFields.add("lodging.foodBeverageCharges");
    openapiFields.add("lodging.noShowIndicator");
    openapiFields.add("lodging.prepaidExpenses");
    openapiFields.add("lodging.propertyPhoneNumber");
    openapiFields.add("lodging.room1.numberOfNights");
    openapiFields.add("lodging.room1.rate");
    openapiFields.add("lodging.totalRoomTax");
    openapiFields.add("lodging.totalTax");
    openapiFields.add("travelEntertainmentAuthData.duration");
    openapiFields.add("travelEntertainmentAuthData.market");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(AdditionalDataLodging.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdditionalDataLodging
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdditionalDataLodging.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalDataLodging is not found in the empty JSON string", AdditionalDataLodging.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdditionalDataLodging.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `AdditionalDataLodging` properties.", entry.getKey()));
        }
      }
      // validate the optional field lodging.checkInDate
      if (jsonObj.get("lodging.checkInDate") != null && !jsonObj.get("lodging.checkInDate").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `lodging.checkInDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lodging.checkInDate").toString()));
      }
      // validate the optional field lodging.checkOutDate
      if (jsonObj.get("lodging.checkOutDate") != null && !jsonObj.get("lodging.checkOutDate").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `lodging.checkOutDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lodging.checkOutDate").toString()));
      }
      // validate the optional field lodging.customerServiceTollFreeNumber
      if (jsonObj.get("lodging.customerServiceTollFreeNumber") != null && !jsonObj.get("lodging.customerServiceTollFreeNumber").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `lodging.customerServiceTollFreeNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lodging.customerServiceTollFreeNumber").toString()));
      }
      // validate the optional field lodging.fireSafetyActIndicator
      if (jsonObj.get("lodging.fireSafetyActIndicator") != null && !jsonObj.get("lodging.fireSafetyActIndicator").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `lodging.fireSafetyActIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lodging.fireSafetyActIndicator").toString()));
      }
      // validate the optional field lodging.folioCashAdvances
      if (jsonObj.get("lodging.folioCashAdvances") != null && !jsonObj.get("lodging.folioCashAdvances").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `lodging.folioCashAdvances` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lodging.folioCashAdvances").toString()));
      }
      // validate the optional field lodging.folioNumber
      if (jsonObj.get("lodging.folioNumber") != null && !jsonObj.get("lodging.folioNumber").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `lodging.folioNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lodging.folioNumber").toString()));
      }
      // validate the optional field lodging.foodBeverageCharges
      if (jsonObj.get("lodging.foodBeverageCharges") != null && !jsonObj.get("lodging.foodBeverageCharges").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `lodging.foodBeverageCharges` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lodging.foodBeverageCharges").toString()));
      }
      // validate the optional field lodging.noShowIndicator
      if (jsonObj.get("lodging.noShowIndicator") != null && !jsonObj.get("lodging.noShowIndicator").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `lodging.noShowIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lodging.noShowIndicator").toString()));
      }
      // validate the optional field lodging.prepaidExpenses
      if (jsonObj.get("lodging.prepaidExpenses") != null && !jsonObj.get("lodging.prepaidExpenses").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `lodging.prepaidExpenses` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lodging.prepaidExpenses").toString()));
      }
      // validate the optional field lodging.propertyPhoneNumber
      if (jsonObj.get("lodging.propertyPhoneNumber") != null && !jsonObj.get("lodging.propertyPhoneNumber").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `lodging.propertyPhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lodging.propertyPhoneNumber").toString()));
      }
      // validate the optional field lodging.room1.numberOfNights
      if (jsonObj.get("lodging.room1.numberOfNights") != null && !jsonObj.get("lodging.room1.numberOfNights").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `lodging.room1.numberOfNights` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lodging.room1.numberOfNights").toString()));
      }
      // validate the optional field lodging.room1.rate
      if (jsonObj.get("lodging.room1.rate") != null && !jsonObj.get("lodging.room1.rate").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `lodging.room1.rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lodging.room1.rate").toString()));
      }
      // validate the optional field lodging.totalRoomTax
      if (jsonObj.get("lodging.totalRoomTax") != null && !jsonObj.get("lodging.totalRoomTax").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `lodging.totalRoomTax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lodging.totalRoomTax").toString()));
      }
      // validate the optional field lodging.totalTax
      if (jsonObj.get("lodging.totalTax") != null && !jsonObj.get("lodging.totalTax").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `lodging.totalTax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lodging.totalTax").toString()));
      }
      // validate the optional field travelEntertainmentAuthData.duration
      if (jsonObj.get("travelEntertainmentAuthData.duration") != null && !jsonObj.get("travelEntertainmentAuthData.duration").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `travelEntertainmentAuthData.duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("travelEntertainmentAuthData.duration").toString()));
      }
      // validate the optional field travelEntertainmentAuthData.market
      if (jsonObj.get("travelEntertainmentAuthData.market") != null && !jsonObj.get("travelEntertainmentAuthData.market").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `travelEntertainmentAuthData.market` to be a primitive type in the JSON string but got `%s`", jsonObj.get("travelEntertainmentAuthData.market").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalDataLodging.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalDataLodging' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalDataLodging> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalDataLodging.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalDataLodging>() {
           @Override
           public void write(JsonWriter out, AdditionalDataLodging value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalDataLodging read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdditionalDataLodging given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdditionalDataLodging
  * @throws IOException if the JSON string is invalid with respect to AdditionalDataLodging
  */
  public static AdditionalDataLodging fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalDataLodging.class);
  }

 /**
  * Convert an instance of AdditionalDataLodging to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

