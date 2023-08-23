/*
 * Adyen Payment API
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.payment.Amount;
import com.adyen.model.payment.PlatformChargebackLogic;
import com.adyen.model.payment.Split;
import com.adyen.model.payment.ThreeDSecureData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * CaptureRequest
 */
@JsonPropertyOrder({
  CaptureRequest.JSON_PROPERTY_ADDITIONAL_DATA,
  CaptureRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  CaptureRequest.JSON_PROPERTY_MODIFICATION_AMOUNT,
  CaptureRequest.JSON_PROPERTY_MPI_DATA,
  CaptureRequest.JSON_PROPERTY_ORIGINAL_MERCHANT_REFERENCE,
  CaptureRequest.JSON_PROPERTY_ORIGINAL_REFERENCE,
  CaptureRequest.JSON_PROPERTY_PLATFORM_CHARGEBACK_LOGIC,
  CaptureRequest.JSON_PROPERTY_REFERENCE,
  CaptureRequest.JSON_PROPERTY_SPLITS,
  CaptureRequest.JSON_PROPERTY_TENDER_REFERENCE,
  CaptureRequest.JSON_PROPERTY_UNIQUE_TERMINAL_ID
})

public class CaptureRequest {
  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additionalData";
  private Map<String, String> additionalData = null;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_MODIFICATION_AMOUNT = "modificationAmount";
  private Amount modificationAmount;

  public static final String JSON_PROPERTY_MPI_DATA = "mpiData";
  private ThreeDSecureData mpiData;

  public static final String JSON_PROPERTY_ORIGINAL_MERCHANT_REFERENCE = "originalMerchantReference";
  private String originalMerchantReference;

  public static final String JSON_PROPERTY_ORIGINAL_REFERENCE = "originalReference";
  private String originalReference;

  public static final String JSON_PROPERTY_PLATFORM_CHARGEBACK_LOGIC = "platformChargebackLogic";
  private PlatformChargebackLogic platformChargebackLogic;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_SPLITS = "splits";
  private List<Split> splits = null;

  public static final String JSON_PROPERTY_TENDER_REFERENCE = "tenderReference";
  private String tenderReference;

  public static final String JSON_PROPERTY_UNIQUE_TERMINAL_ID = "uniqueTerminalId";
  private String uniqueTerminalId;

  public CaptureRequest() { 
  }

  public CaptureRequest additionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  public CaptureRequest putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * This field contains additional data, which may be required for a particular modification request.  The additionalData object consists of entries, each of which includes the key and value.
   * @return additionalData
  **/
  @ApiModelProperty(value = "This field contains additional data, which may be required for a particular modification request.  The additionalData object consists of entries, each of which includes the key and value.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAdditionalData() {
    return additionalData;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }


  public CaptureRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account that is used to process the payment.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account that is used to process the payment.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantAccount() {
    return merchantAccount;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public CaptureRequest modificationAmount(Amount modificationAmount) {
    this.modificationAmount = modificationAmount;
    return this;
  }

   /**
   * Get modificationAmount
   * @return modificationAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MODIFICATION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getModificationAmount() {
    return modificationAmount;
  }


  @JsonProperty(JSON_PROPERTY_MODIFICATION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModificationAmount(Amount modificationAmount) {
    this.modificationAmount = modificationAmount;
  }


  public CaptureRequest mpiData(ThreeDSecureData mpiData) {
    this.mpiData = mpiData;
    return this;
  }

   /**
   * Get mpiData
   * @return mpiData
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MPI_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ThreeDSecureData getMpiData() {
    return mpiData;
  }


  @JsonProperty(JSON_PROPERTY_MPI_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMpiData(ThreeDSecureData mpiData) {
    this.mpiData = mpiData;
  }


  public CaptureRequest originalMerchantReference(String originalMerchantReference) {
    this.originalMerchantReference = originalMerchantReference;
    return this;
  }

   /**
   * The original merchant reference to cancel.
   * @return originalMerchantReference
  **/
  @ApiModelProperty(value = "The original merchant reference to cancel.")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalMerchantReference() {
    return originalMerchantReference;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalMerchantReference(String originalMerchantReference) {
    this.originalMerchantReference = originalMerchantReference;
  }


  public CaptureRequest originalReference(String originalReference) {
    this.originalReference = originalReference;
    return this;
  }

   /**
   * The original pspReference of the payment to modify. This reference is returned in: * authorisation response * authorisation notification  
   * @return originalReference
  **/
  @ApiModelProperty(required = true, value = "The original pspReference of the payment to modify. This reference is returned in: * authorisation response * authorisation notification  ")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalReference() {
    return originalReference;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalReference(String originalReference) {
    this.originalReference = originalReference;
  }


  public CaptureRequest platformChargebackLogic(PlatformChargebackLogic platformChargebackLogic) {
    this.platformChargebackLogic = platformChargebackLogic;
    return this;
  }

   /**
   * Get platformChargebackLogic
   * @return platformChargebackLogic
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLATFORM_CHARGEBACK_LOGIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlatformChargebackLogic getPlatformChargebackLogic() {
    return platformChargebackLogic;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM_CHARGEBACK_LOGIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformChargebackLogic(PlatformChargebackLogic platformChargebackLogic) {
    this.platformChargebackLogic = platformChargebackLogic;
  }


  public CaptureRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public CaptureRequest splits(List<Split> splits) {
    this.splits = splits;
    return this;
  }

  public CaptureRequest addSplitsItem(Split splitsItem) {
    if (this.splits == null) {
      this.splits = new ArrayList<>();
    }
    this.splits.add(splitsItem);
    return this;
  }

   /**
   * An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For details, refer to [Providing split information](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information).
   * @return splits
  **/
  @ApiModelProperty(value = "An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For details, refer to [Providing split information](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information).")
  @JsonProperty(JSON_PROPERTY_SPLITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Split> getSplits() {
    return splits;
  }


  @JsonProperty(JSON_PROPERTY_SPLITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSplits(List<Split> splits) {
    this.splits = splits;
  }


  public CaptureRequest tenderReference(String tenderReference) {
    this.tenderReference = tenderReference;
    return this;
  }

   /**
   * The transaction reference provided by the PED. For point-of-sale integrations only.
   * @return tenderReference
  **/
  @ApiModelProperty(value = "The transaction reference provided by the PED. For point-of-sale integrations only.")
  @JsonProperty(JSON_PROPERTY_TENDER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenderReference() {
    return tenderReference;
  }


  @JsonProperty(JSON_PROPERTY_TENDER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenderReference(String tenderReference) {
    this.tenderReference = tenderReference;
  }


  public CaptureRequest uniqueTerminalId(String uniqueTerminalId) {
    this.uniqueTerminalId = uniqueTerminalId;
    return this;
  }

   /**
   * Unique terminal ID for the PED that originally processed the request. For point-of-sale integrations only.
   * @return uniqueTerminalId
  **/
  @ApiModelProperty(value = "Unique terminal ID for the PED that originally processed the request. For point-of-sale integrations only.")
  @JsonProperty(JSON_PROPERTY_UNIQUE_TERMINAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniqueTerminalId() {
    return uniqueTerminalId;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_TERMINAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueTerminalId(String uniqueTerminalId) {
    this.uniqueTerminalId = uniqueTerminalId;
  }


  /**
   * Return true if this CaptureRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptureRequest captureRequest = (CaptureRequest) o;
    return Objects.equals(this.additionalData, captureRequest.additionalData) &&
        Objects.equals(this.merchantAccount, captureRequest.merchantAccount) &&
        Objects.equals(this.modificationAmount, captureRequest.modificationAmount) &&
        Objects.equals(this.mpiData, captureRequest.mpiData) &&
        Objects.equals(this.originalMerchantReference, captureRequest.originalMerchantReference) &&
        Objects.equals(this.originalReference, captureRequest.originalReference) &&
        Objects.equals(this.platformChargebackLogic, captureRequest.platformChargebackLogic) &&
        Objects.equals(this.reference, captureRequest.reference) &&
        Objects.equals(this.splits, captureRequest.splits) &&
        Objects.equals(this.tenderReference, captureRequest.tenderReference) &&
        Objects.equals(this.uniqueTerminalId, captureRequest.uniqueTerminalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, merchantAccount, modificationAmount, mpiData, originalMerchantReference, originalReference, platformChargebackLogic, reference, splits, tenderReference, uniqueTerminalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptureRequest {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    modificationAmount: ").append(toIndentedString(modificationAmount)).append("\n");
    sb.append("    mpiData: ").append(toIndentedString(mpiData)).append("\n");
    sb.append("    originalMerchantReference: ").append(toIndentedString(originalMerchantReference)).append("\n");
    sb.append("    originalReference: ").append(toIndentedString(originalReference)).append("\n");
    sb.append("    platformChargebackLogic: ").append(toIndentedString(platformChargebackLogic)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    splits: ").append(toIndentedString(splits)).append("\n");
    sb.append("    tenderReference: ").append(toIndentedString(tenderReference)).append("\n");
    sb.append("    uniqueTerminalId: ").append(toIndentedString(uniqueTerminalId)).append("\n");
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

/**
   * Create an instance of CaptureRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CaptureRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to CaptureRequest
   */
  public static CaptureRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CaptureRequest.class);
  }
/**
  * Convert an instance of CaptureRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
