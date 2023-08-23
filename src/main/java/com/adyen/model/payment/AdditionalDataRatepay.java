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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * AdditionalDataRatepay
 */
@JsonPropertyOrder({
  AdditionalDataRatepay.JSON_PROPERTY_RATEPAY_INSTALLMENT_AMOUNT,
  AdditionalDataRatepay.JSON_PROPERTY_RATEPAY_INTEREST_RATE,
  AdditionalDataRatepay.JSON_PROPERTY_RATEPAY_LAST_INSTALLMENT_AMOUNT,
  AdditionalDataRatepay.JSON_PROPERTY_RATEPAY_PAYMENT_FIRSTDAY,
  AdditionalDataRatepay.JSON_PROPERTY_RATEPAYDATA_DELIVERY_DATE,
  AdditionalDataRatepay.JSON_PROPERTY_RATEPAYDATA_DUE_DATE,
  AdditionalDataRatepay.JSON_PROPERTY_RATEPAYDATA_INVOICE_DATE,
  AdditionalDataRatepay.JSON_PROPERTY_RATEPAYDATA_INVOICE_ID
})

public class AdditionalDataRatepay {
  public static final String JSON_PROPERTY_RATEPAY_INSTALLMENT_AMOUNT = "ratepay.installmentAmount";
  private String ratepayInstallmentAmount;

  public static final String JSON_PROPERTY_RATEPAY_INTEREST_RATE = "ratepay.interestRate";
  private String ratepayInterestRate;

  public static final String JSON_PROPERTY_RATEPAY_LAST_INSTALLMENT_AMOUNT = "ratepay.lastInstallmentAmount";
  private String ratepayLastInstallmentAmount;

  public static final String JSON_PROPERTY_RATEPAY_PAYMENT_FIRSTDAY = "ratepay.paymentFirstday";
  private String ratepayPaymentFirstday;

  public static final String JSON_PROPERTY_RATEPAYDATA_DELIVERY_DATE = "ratepaydata.deliveryDate";
  private String ratepaydataDeliveryDate;

  public static final String JSON_PROPERTY_RATEPAYDATA_DUE_DATE = "ratepaydata.dueDate";
  private String ratepaydataDueDate;

  public static final String JSON_PROPERTY_RATEPAYDATA_INVOICE_DATE = "ratepaydata.invoiceDate";
  private String ratepaydataInvoiceDate;

  public static final String JSON_PROPERTY_RATEPAYDATA_INVOICE_ID = "ratepaydata.invoiceId";
  private String ratepaydataInvoiceId;

  public AdditionalDataRatepay() { 
  }

  public AdditionalDataRatepay ratepayInstallmentAmount(String ratepayInstallmentAmount) {
    this.ratepayInstallmentAmount = ratepayInstallmentAmount;
    return this;
  }

   /**
   * Amount the customer has to pay each month.
   * @return ratepayInstallmentAmount
  **/
  @ApiModelProperty(value = "Amount the customer has to pay each month.")
  @JsonProperty(JSON_PROPERTY_RATEPAY_INSTALLMENT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRatepayInstallmentAmount() {
    return ratepayInstallmentAmount;
  }


  @JsonProperty(JSON_PROPERTY_RATEPAY_INSTALLMENT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatepayInstallmentAmount(String ratepayInstallmentAmount) {
    this.ratepayInstallmentAmount = ratepayInstallmentAmount;
  }


  public AdditionalDataRatepay ratepayInterestRate(String ratepayInterestRate) {
    this.ratepayInterestRate = ratepayInterestRate;
    return this;
  }

   /**
   * Interest rate of this installment.
   * @return ratepayInterestRate
  **/
  @ApiModelProperty(value = "Interest rate of this installment.")
  @JsonProperty(JSON_PROPERTY_RATEPAY_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRatepayInterestRate() {
    return ratepayInterestRate;
  }


  @JsonProperty(JSON_PROPERTY_RATEPAY_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatepayInterestRate(String ratepayInterestRate) {
    this.ratepayInterestRate = ratepayInterestRate;
  }


  public AdditionalDataRatepay ratepayLastInstallmentAmount(String ratepayLastInstallmentAmount) {
    this.ratepayLastInstallmentAmount = ratepayLastInstallmentAmount;
    return this;
  }

   /**
   * Amount of the last installment.
   * @return ratepayLastInstallmentAmount
  **/
  @ApiModelProperty(value = "Amount of the last installment.")
  @JsonProperty(JSON_PROPERTY_RATEPAY_LAST_INSTALLMENT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRatepayLastInstallmentAmount() {
    return ratepayLastInstallmentAmount;
  }


  @JsonProperty(JSON_PROPERTY_RATEPAY_LAST_INSTALLMENT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatepayLastInstallmentAmount(String ratepayLastInstallmentAmount) {
    this.ratepayLastInstallmentAmount = ratepayLastInstallmentAmount;
  }


  public AdditionalDataRatepay ratepayPaymentFirstday(String ratepayPaymentFirstday) {
    this.ratepayPaymentFirstday = ratepayPaymentFirstday;
    return this;
  }

   /**
   * Calendar day of the first payment.
   * @return ratepayPaymentFirstday
  **/
  @ApiModelProperty(value = "Calendar day of the first payment.")
  @JsonProperty(JSON_PROPERTY_RATEPAY_PAYMENT_FIRSTDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRatepayPaymentFirstday() {
    return ratepayPaymentFirstday;
  }


  @JsonProperty(JSON_PROPERTY_RATEPAY_PAYMENT_FIRSTDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatepayPaymentFirstday(String ratepayPaymentFirstday) {
    this.ratepayPaymentFirstday = ratepayPaymentFirstday;
  }


  public AdditionalDataRatepay ratepaydataDeliveryDate(String ratepaydataDeliveryDate) {
    this.ratepaydataDeliveryDate = ratepaydataDeliveryDate;
    return this;
  }

   /**
   * Date the merchant delivered the goods to the customer.
   * @return ratepaydataDeliveryDate
  **/
  @ApiModelProperty(value = "Date the merchant delivered the goods to the customer.")
  @JsonProperty(JSON_PROPERTY_RATEPAYDATA_DELIVERY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRatepaydataDeliveryDate() {
    return ratepaydataDeliveryDate;
  }


  @JsonProperty(JSON_PROPERTY_RATEPAYDATA_DELIVERY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatepaydataDeliveryDate(String ratepaydataDeliveryDate) {
    this.ratepaydataDeliveryDate = ratepaydataDeliveryDate;
  }


  public AdditionalDataRatepay ratepaydataDueDate(String ratepaydataDueDate) {
    this.ratepaydataDueDate = ratepaydataDueDate;
    return this;
  }

   /**
   * Date by which the customer must settle the payment.
   * @return ratepaydataDueDate
  **/
  @ApiModelProperty(value = "Date by which the customer must settle the payment.")
  @JsonProperty(JSON_PROPERTY_RATEPAYDATA_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRatepaydataDueDate() {
    return ratepaydataDueDate;
  }


  @JsonProperty(JSON_PROPERTY_RATEPAYDATA_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatepaydataDueDate(String ratepaydataDueDate) {
    this.ratepaydataDueDate = ratepaydataDueDate;
  }


  public AdditionalDataRatepay ratepaydataInvoiceDate(String ratepaydataInvoiceDate) {
    this.ratepaydataInvoiceDate = ratepaydataInvoiceDate;
    return this;
  }

   /**
   * Invoice date, defined by the merchant. If not included, the invoice date is set to the delivery date.
   * @return ratepaydataInvoiceDate
  **/
  @ApiModelProperty(value = "Invoice date, defined by the merchant. If not included, the invoice date is set to the delivery date.")
  @JsonProperty(JSON_PROPERTY_RATEPAYDATA_INVOICE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRatepaydataInvoiceDate() {
    return ratepaydataInvoiceDate;
  }


  @JsonProperty(JSON_PROPERTY_RATEPAYDATA_INVOICE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatepaydataInvoiceDate(String ratepaydataInvoiceDate) {
    this.ratepaydataInvoiceDate = ratepaydataInvoiceDate;
  }


  public AdditionalDataRatepay ratepaydataInvoiceId(String ratepaydataInvoiceId) {
    this.ratepaydataInvoiceId = ratepaydataInvoiceId;
    return this;
  }

   /**
   * Identification name or number for the invoice, defined by the merchant.
   * @return ratepaydataInvoiceId
  **/
  @ApiModelProperty(value = "Identification name or number for the invoice, defined by the merchant.")
  @JsonProperty(JSON_PROPERTY_RATEPAYDATA_INVOICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRatepaydataInvoiceId() {
    return ratepaydataInvoiceId;
  }


  @JsonProperty(JSON_PROPERTY_RATEPAYDATA_INVOICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatepaydataInvoiceId(String ratepaydataInvoiceId) {
    this.ratepaydataInvoiceId = ratepaydataInvoiceId;
  }


  /**
   * Return true if this AdditionalDataRatepay object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataRatepay additionalDataRatepay = (AdditionalDataRatepay) o;
    return Objects.equals(this.ratepayInstallmentAmount, additionalDataRatepay.ratepayInstallmentAmount) &&
        Objects.equals(this.ratepayInterestRate, additionalDataRatepay.ratepayInterestRate) &&
        Objects.equals(this.ratepayLastInstallmentAmount, additionalDataRatepay.ratepayLastInstallmentAmount) &&
        Objects.equals(this.ratepayPaymentFirstday, additionalDataRatepay.ratepayPaymentFirstday) &&
        Objects.equals(this.ratepaydataDeliveryDate, additionalDataRatepay.ratepaydataDeliveryDate) &&
        Objects.equals(this.ratepaydataDueDate, additionalDataRatepay.ratepaydataDueDate) &&
        Objects.equals(this.ratepaydataInvoiceDate, additionalDataRatepay.ratepaydataInvoiceDate) &&
        Objects.equals(this.ratepaydataInvoiceId, additionalDataRatepay.ratepaydataInvoiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratepayInstallmentAmount, ratepayInterestRate, ratepayLastInstallmentAmount, ratepayPaymentFirstday, ratepaydataDeliveryDate, ratepaydataDueDate, ratepaydataInvoiceDate, ratepaydataInvoiceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataRatepay {\n");
    sb.append("    ratepayInstallmentAmount: ").append(toIndentedString(ratepayInstallmentAmount)).append("\n");
    sb.append("    ratepayInterestRate: ").append(toIndentedString(ratepayInterestRate)).append("\n");
    sb.append("    ratepayLastInstallmentAmount: ").append(toIndentedString(ratepayLastInstallmentAmount)).append("\n");
    sb.append("    ratepayPaymentFirstday: ").append(toIndentedString(ratepayPaymentFirstday)).append("\n");
    sb.append("    ratepaydataDeliveryDate: ").append(toIndentedString(ratepaydataDeliveryDate)).append("\n");
    sb.append("    ratepaydataDueDate: ").append(toIndentedString(ratepaydataDueDate)).append("\n");
    sb.append("    ratepaydataInvoiceDate: ").append(toIndentedString(ratepaydataInvoiceDate)).append("\n");
    sb.append("    ratepaydataInvoiceId: ").append(toIndentedString(ratepaydataInvoiceId)).append("\n");
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
   * Create an instance of AdditionalDataRatepay given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdditionalDataRatepay
   * @throws JsonProcessingException if the JSON string is invalid with respect to AdditionalDataRatepay
   */
  public static AdditionalDataRatepay fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AdditionalDataRatepay.class);
  }
/**
  * Convert an instance of AdditionalDataRatepay to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
