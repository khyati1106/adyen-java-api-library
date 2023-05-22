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
import com.adyen.model.balanceplatform.ActiveNetworkTokensRestriction;
import com.adyen.model.balanceplatform.BrandVariantsRestriction;
import com.adyen.model.balanceplatform.CountriesRestriction;
import com.adyen.model.balanceplatform.DayOfWeekRestriction;
import com.adyen.model.balanceplatform.DifferentCurrenciesRestriction;
import com.adyen.model.balanceplatform.EntryModesRestriction;
import com.adyen.model.balanceplatform.InternationalTransactionRestriction;
import com.adyen.model.balanceplatform.MatchingTransactionsRestriction;
import com.adyen.model.balanceplatform.MccsRestriction;
import com.adyen.model.balanceplatform.MerchantNamesRestriction;
import com.adyen.model.balanceplatform.MerchantsRestriction;
import com.adyen.model.balanceplatform.ProcessingTypesRestriction;
import com.adyen.model.balanceplatform.TimeOfDayRestriction;
import com.adyen.model.balanceplatform.TotalAmountRestriction;
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

import com.adyen.model.balanceplatform.JSON;

/**
 * TransactionRuleRestrictions
 */

public class TransactionRuleRestrictions {
  public static final String SERIALIZED_NAME_ACTIVE_NETWORK_TOKENS = "activeNetworkTokens";
  @SerializedName(SERIALIZED_NAME_ACTIVE_NETWORK_TOKENS)
  private ActiveNetworkTokensRestriction activeNetworkTokens;

  public static final String SERIALIZED_NAME_BRAND_VARIANTS = "brandVariants";
  @SerializedName(SERIALIZED_NAME_BRAND_VARIANTS)
  private BrandVariantsRestriction brandVariants;

  public static final String SERIALIZED_NAME_COUNTRIES = "countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  private CountriesRestriction countries;

  public static final String SERIALIZED_NAME_DAY_OF_WEEK = "dayOfWeek";
  @SerializedName(SERIALIZED_NAME_DAY_OF_WEEK)
  private DayOfWeekRestriction dayOfWeek;

  public static final String SERIALIZED_NAME_DIFFERENT_CURRENCIES = "differentCurrencies";
  @SerializedName(SERIALIZED_NAME_DIFFERENT_CURRENCIES)
  private DifferentCurrenciesRestriction differentCurrencies;

  public static final String SERIALIZED_NAME_ENTRY_MODES = "entryModes";
  @SerializedName(SERIALIZED_NAME_ENTRY_MODES)
  private EntryModesRestriction entryModes;

  public static final String SERIALIZED_NAME_INTERNATIONAL_TRANSACTION = "internationalTransaction";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL_TRANSACTION)
  private InternationalTransactionRestriction internationalTransaction;

  public static final String SERIALIZED_NAME_MATCHING_TRANSACTIONS = "matchingTransactions";
  @SerializedName(SERIALIZED_NAME_MATCHING_TRANSACTIONS)
  private MatchingTransactionsRestriction matchingTransactions;

  public static final String SERIALIZED_NAME_MCCS = "mccs";
  @SerializedName(SERIALIZED_NAME_MCCS)
  private MccsRestriction mccs;

  public static final String SERIALIZED_NAME_MERCHANT_NAMES = "merchantNames";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAMES)
  private MerchantNamesRestriction merchantNames;

  public static final String SERIALIZED_NAME_MERCHANTS = "merchants";
  @SerializedName(SERIALIZED_NAME_MERCHANTS)
  private MerchantsRestriction merchants;

  public static final String SERIALIZED_NAME_PROCESSING_TYPES = "processingTypes";
  @SerializedName(SERIALIZED_NAME_PROCESSING_TYPES)
  private ProcessingTypesRestriction processingTypes;

  public static final String SERIALIZED_NAME_TIME_OF_DAY = "timeOfDay";
  @SerializedName(SERIALIZED_NAME_TIME_OF_DAY)
  private TimeOfDayRestriction timeOfDay;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "totalAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private TotalAmountRestriction totalAmount;

  public TransactionRuleRestrictions() { 
  }

  public TransactionRuleRestrictions activeNetworkTokens(ActiveNetworkTokensRestriction activeNetworkTokens) {
    
    this.activeNetworkTokens = activeNetworkTokens;
    return this;
  }

   /**
   * Get activeNetworkTokens
   * @return activeNetworkTokens
  **/
  @ApiModelProperty(value = "")

  public ActiveNetworkTokensRestriction getActiveNetworkTokens() {
    return activeNetworkTokens;
  }


  public void setActiveNetworkTokens(ActiveNetworkTokensRestriction activeNetworkTokens) {
    this.activeNetworkTokens = activeNetworkTokens;
  }


  public TransactionRuleRestrictions brandVariants(BrandVariantsRestriction brandVariants) {
    
    this.brandVariants = brandVariants;
    return this;
  }

   /**
   * Get brandVariants
   * @return brandVariants
  **/
  @ApiModelProperty(value = "")

  public BrandVariantsRestriction getBrandVariants() {
    return brandVariants;
  }


  public void setBrandVariants(BrandVariantsRestriction brandVariants) {
    this.brandVariants = brandVariants;
  }


  public TransactionRuleRestrictions countries(CountriesRestriction countries) {
    
    this.countries = countries;
    return this;
  }

   /**
   * Get countries
   * @return countries
  **/
  @ApiModelProperty(value = "")

  public CountriesRestriction getCountries() {
    return countries;
  }


  public void setCountries(CountriesRestriction countries) {
    this.countries = countries;
  }


  public TransactionRuleRestrictions dayOfWeek(DayOfWeekRestriction dayOfWeek) {
    
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @ApiModelProperty(value = "")

  public DayOfWeekRestriction getDayOfWeek() {
    return dayOfWeek;
  }


  public void setDayOfWeek(DayOfWeekRestriction dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  public TransactionRuleRestrictions differentCurrencies(DifferentCurrenciesRestriction differentCurrencies) {
    
    this.differentCurrencies = differentCurrencies;
    return this;
  }

   /**
   * Get differentCurrencies
   * @return differentCurrencies
  **/
  @ApiModelProperty(value = "")

  public DifferentCurrenciesRestriction getDifferentCurrencies() {
    return differentCurrencies;
  }


  public void setDifferentCurrencies(DifferentCurrenciesRestriction differentCurrencies) {
    this.differentCurrencies = differentCurrencies;
  }


  public TransactionRuleRestrictions entryModes(EntryModesRestriction entryModes) {
    
    this.entryModes = entryModes;
    return this;
  }

   /**
   * Get entryModes
   * @return entryModes
  **/
  @ApiModelProperty(value = "")

  public EntryModesRestriction getEntryModes() {
    return entryModes;
  }


  public void setEntryModes(EntryModesRestriction entryModes) {
    this.entryModes = entryModes;
  }


  public TransactionRuleRestrictions internationalTransaction(InternationalTransactionRestriction internationalTransaction) {
    
    this.internationalTransaction = internationalTransaction;
    return this;
  }

   /**
   * Get internationalTransaction
   * @return internationalTransaction
  **/
  @ApiModelProperty(value = "")

  public InternationalTransactionRestriction getInternationalTransaction() {
    return internationalTransaction;
  }


  public void setInternationalTransaction(InternationalTransactionRestriction internationalTransaction) {
    this.internationalTransaction = internationalTransaction;
  }


  public TransactionRuleRestrictions matchingTransactions(MatchingTransactionsRestriction matchingTransactions) {
    
    this.matchingTransactions = matchingTransactions;
    return this;
  }

   /**
   * Get matchingTransactions
   * @return matchingTransactions
  **/
  @ApiModelProperty(value = "")

  public MatchingTransactionsRestriction getMatchingTransactions() {
    return matchingTransactions;
  }


  public void setMatchingTransactions(MatchingTransactionsRestriction matchingTransactions) {
    this.matchingTransactions = matchingTransactions;
  }


  public TransactionRuleRestrictions mccs(MccsRestriction mccs) {
    
    this.mccs = mccs;
    return this;
  }

   /**
   * Get mccs
   * @return mccs
  **/
  @ApiModelProperty(value = "")

  public MccsRestriction getMccs() {
    return mccs;
  }


  public void setMccs(MccsRestriction mccs) {
    this.mccs = mccs;
  }


  public TransactionRuleRestrictions merchantNames(MerchantNamesRestriction merchantNames) {
    
    this.merchantNames = merchantNames;
    return this;
  }

   /**
   * Get merchantNames
   * @return merchantNames
  **/
  @ApiModelProperty(value = "")

  public MerchantNamesRestriction getMerchantNames() {
    return merchantNames;
  }


  public void setMerchantNames(MerchantNamesRestriction merchantNames) {
    this.merchantNames = merchantNames;
  }


  public TransactionRuleRestrictions merchants(MerchantsRestriction merchants) {
    
    this.merchants = merchants;
    return this;
  }

   /**
   * Get merchants
   * @return merchants
  **/
  @ApiModelProperty(value = "")

  public MerchantsRestriction getMerchants() {
    return merchants;
  }


  public void setMerchants(MerchantsRestriction merchants) {
    this.merchants = merchants;
  }


  public TransactionRuleRestrictions processingTypes(ProcessingTypesRestriction processingTypes) {
    
    this.processingTypes = processingTypes;
    return this;
  }

   /**
   * Get processingTypes
   * @return processingTypes
  **/
  @ApiModelProperty(value = "")

  public ProcessingTypesRestriction getProcessingTypes() {
    return processingTypes;
  }


  public void setProcessingTypes(ProcessingTypesRestriction processingTypes) {
    this.processingTypes = processingTypes;
  }


  public TransactionRuleRestrictions timeOfDay(TimeOfDayRestriction timeOfDay) {
    
    this.timeOfDay = timeOfDay;
    return this;
  }

   /**
   * Get timeOfDay
   * @return timeOfDay
  **/
  @ApiModelProperty(value = "")

  public TimeOfDayRestriction getTimeOfDay() {
    return timeOfDay;
  }


  public void setTimeOfDay(TimeOfDayRestriction timeOfDay) {
    this.timeOfDay = timeOfDay;
  }


  public TransactionRuleRestrictions totalAmount(TotalAmountRestriction totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @ApiModelProperty(value = "")

  public TotalAmountRestriction getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(TotalAmountRestriction totalAmount) {
    this.totalAmount = totalAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRuleRestrictions transactionRuleRestrictions = (TransactionRuleRestrictions) o;
    return Objects.equals(this.activeNetworkTokens, transactionRuleRestrictions.activeNetworkTokens) &&
        Objects.equals(this.brandVariants, transactionRuleRestrictions.brandVariants) &&
        Objects.equals(this.countries, transactionRuleRestrictions.countries) &&
        Objects.equals(this.dayOfWeek, transactionRuleRestrictions.dayOfWeek) &&
        Objects.equals(this.differentCurrencies, transactionRuleRestrictions.differentCurrencies) &&
        Objects.equals(this.entryModes, transactionRuleRestrictions.entryModes) &&
        Objects.equals(this.internationalTransaction, transactionRuleRestrictions.internationalTransaction) &&
        Objects.equals(this.matchingTransactions, transactionRuleRestrictions.matchingTransactions) &&
        Objects.equals(this.mccs, transactionRuleRestrictions.mccs) &&
        Objects.equals(this.merchantNames, transactionRuleRestrictions.merchantNames) &&
        Objects.equals(this.merchants, transactionRuleRestrictions.merchants) &&
        Objects.equals(this.processingTypes, transactionRuleRestrictions.processingTypes) &&
        Objects.equals(this.timeOfDay, transactionRuleRestrictions.timeOfDay) &&
        Objects.equals(this.totalAmount, transactionRuleRestrictions.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeNetworkTokens, brandVariants, countries, dayOfWeek, differentCurrencies, entryModes, internationalTransaction, matchingTransactions, mccs, merchantNames, merchants, processingTypes, timeOfDay, totalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRuleRestrictions {\n");
    sb.append("    activeNetworkTokens: ").append(toIndentedString(activeNetworkTokens)).append("\n");
    sb.append("    brandVariants: ").append(toIndentedString(brandVariants)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    differentCurrencies: ").append(toIndentedString(differentCurrencies)).append("\n");
    sb.append("    entryModes: ").append(toIndentedString(entryModes)).append("\n");
    sb.append("    internationalTransaction: ").append(toIndentedString(internationalTransaction)).append("\n");
    sb.append("    matchingTransactions: ").append(toIndentedString(matchingTransactions)).append("\n");
    sb.append("    mccs: ").append(toIndentedString(mccs)).append("\n");
    sb.append("    merchantNames: ").append(toIndentedString(merchantNames)).append("\n");
    sb.append("    merchants: ").append(toIndentedString(merchants)).append("\n");
    sb.append("    processingTypes: ").append(toIndentedString(processingTypes)).append("\n");
    sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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
    openapiFields.add("activeNetworkTokens");
    openapiFields.add("brandVariants");
    openapiFields.add("countries");
    openapiFields.add("dayOfWeek");
    openapiFields.add("differentCurrencies");
    openapiFields.add("entryModes");
    openapiFields.add("internationalTransaction");
    openapiFields.add("matchingTransactions");
    openapiFields.add("mccs");
    openapiFields.add("merchantNames");
    openapiFields.add("merchants");
    openapiFields.add("processingTypes");
    openapiFields.add("timeOfDay");
    openapiFields.add("totalAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(TransactionRuleRestrictions.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionRuleRestrictions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransactionRuleRestrictions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionRuleRestrictions is not found in the empty JSON string", TransactionRuleRestrictions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransactionRuleRestrictions.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `TransactionRuleRestrictions` properties.", entry.getKey()));
        }
      }
      // validate the optional field `activeNetworkTokens`
      if (jsonObj.getAsJsonObject("activeNetworkTokens") != null) {
        ActiveNetworkTokensRestriction.validateJsonObject(jsonObj.getAsJsonObject("activeNetworkTokens"));
      }
      // validate the optional field `brandVariants`
      if (jsonObj.getAsJsonObject("brandVariants") != null) {
        BrandVariantsRestriction.validateJsonObject(jsonObj.getAsJsonObject("brandVariants"));
      }
      // validate the optional field `countries`
      if (jsonObj.getAsJsonObject("countries") != null) {
        CountriesRestriction.validateJsonObject(jsonObj.getAsJsonObject("countries"));
      }
      // validate the optional field `dayOfWeek`
      if (jsonObj.getAsJsonObject("dayOfWeek") != null) {
        DayOfWeekRestriction.validateJsonObject(jsonObj.getAsJsonObject("dayOfWeek"));
      }
      // validate the optional field `differentCurrencies`
      if (jsonObj.getAsJsonObject("differentCurrencies") != null) {
        DifferentCurrenciesRestriction.validateJsonObject(jsonObj.getAsJsonObject("differentCurrencies"));
      }
      // validate the optional field `entryModes`
      if (jsonObj.getAsJsonObject("entryModes") != null) {
        EntryModesRestriction.validateJsonObject(jsonObj.getAsJsonObject("entryModes"));
      }
      // validate the optional field `internationalTransaction`
      if (jsonObj.getAsJsonObject("internationalTransaction") != null) {
        InternationalTransactionRestriction.validateJsonObject(jsonObj.getAsJsonObject("internationalTransaction"));
      }
      // validate the optional field `matchingTransactions`
      if (jsonObj.getAsJsonObject("matchingTransactions") != null) {
        MatchingTransactionsRestriction.validateJsonObject(jsonObj.getAsJsonObject("matchingTransactions"));
      }
      // validate the optional field `mccs`
      if (jsonObj.getAsJsonObject("mccs") != null) {
        MccsRestriction.validateJsonObject(jsonObj.getAsJsonObject("mccs"));
      }
      // validate the optional field `merchantNames`
      if (jsonObj.getAsJsonObject("merchantNames") != null) {
        MerchantNamesRestriction.validateJsonObject(jsonObj.getAsJsonObject("merchantNames"));
      }
      // validate the optional field `merchants`
      if (jsonObj.getAsJsonObject("merchants") != null) {
        MerchantsRestriction.validateJsonObject(jsonObj.getAsJsonObject("merchants"));
      }
      // validate the optional field `processingTypes`
      if (jsonObj.getAsJsonObject("processingTypes") != null) {
        ProcessingTypesRestriction.validateJsonObject(jsonObj.getAsJsonObject("processingTypes"));
      }
      // validate the optional field `timeOfDay`
      if (jsonObj.getAsJsonObject("timeOfDay") != null) {
        TimeOfDayRestriction.validateJsonObject(jsonObj.getAsJsonObject("timeOfDay"));
      }
      // validate the optional field `totalAmount`
      if (jsonObj.getAsJsonObject("totalAmount") != null) {
        TotalAmountRestriction.validateJsonObject(jsonObj.getAsJsonObject("totalAmount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionRuleRestrictions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionRuleRestrictions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionRuleRestrictions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionRuleRestrictions.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionRuleRestrictions>() {
           @Override
           public void write(JsonWriter out, TransactionRuleRestrictions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionRuleRestrictions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionRuleRestrictions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionRuleRestrictions
  * @throws IOException if the JSON string is invalid with respect to TransactionRuleRestrictions
  */
  public static TransactionRuleRestrictions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionRuleRestrictions.class);
  }

 /**
  * Convert an instance of TransactionRuleRestrictions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

