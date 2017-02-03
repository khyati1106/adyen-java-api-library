package com.adyen;

import com.adyen.Util.Util;
import com.adyen.model.Amount;
import com.adyen.model.hpp.DirectoryLookupRequest;
import org.junit.Test;

import java.math.BigDecimal;
import java.security.SignatureException;
import java.util.SortedMap;
import java.util.TreeMap;

import static com.adyen.constants.HPPConstants.Fields.CURRENCY_CODE;
import static com.adyen.constants.HPPConstants.Fields.MERCHANT_ACCOUNT;
import static org.junit.Assert.assertEquals;

/**
 * Tests for Util class
 */
public class UtilTest {
    @Test
    public void testAmountDecimals() {
        Amount amount = new Amount();
        amount.setCurrency("EUR");
        amount.setValue(new Long("1000"));

        assertEquals(0, new BigDecimal("10.00").compareTo(amount.getDecimalValue()));
    }

    @Test
    public void testCreateAmount() {
        Amount amount = Util.createAmount("12.34", "EUR");

        assertEquals(0, new Long("1234").compareTo(amount.getValue()));
    }

    @Test
    public void testGetDataToSign() throws Exception {
        SortedMap<String, String> postParameters;

        postParameters = new TreeMap<>();
        postParameters.put(MERCHANT_ACCOUNT, "ACC");
        postParameters.put(CURRENCY_CODE, "EUR");

        String dataToSign = Util.getDataToSign(postParameters);
        assertEquals("currencyCode:merchantAccount:EUR:ACC", dataToSign);

        //Test escaping and sorting
        postParameters = new TreeMap<>();
        postParameters.put(CURRENCY_CODE, "EUR");
        postParameters.put(MERCHANT_ACCOUNT, "ACC:\\'");

        dataToSign = Util.getDataToSign(postParameters);
        assertEquals("currencyCode:merchantAccount:EUR:ACC\\:\\\\'", dataToSign);
    }

    @Test
    public void testHmac() throws SignatureException {
        String data = "countryCode:currencyCode:merchantAccount:merchantReference:paymentAmount:sessionValidity:skinCode:NL:EUR:MagentoMerchantTest2:TEST-PAYMENT-2017-02-01-14\\:02\\:05:199:2017-02-02T14\\:02\\:05+01\\:00:PKz2KML1";
        String key = "DFB1EB5485895CFA84146406857104ABB4CBCABDC8AAF103A624C8F6A3EAAB00";
        String ecnrypted = Util.calculateHMAC(data, key);
        assertEquals("34oR8T1whkQWTv9P+SzKyp8zhusf9n0dpqrm9nsqSJs=", ecnrypted);
    }
}
