/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.configurationwebhooks.IbanAccountIdentification;
import com.adyen.model.configurationwebhooks.UKLocalAccountIdentification;
import com.adyen.model.configurationwebhooks.USLocalAccountIdentification;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.core.type.TypeReference;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;


@JsonDeserialize(using = PaymentInstrumentBankAccount.PaymentInstrumentBankAccountDeserializer.class)
@JsonSerialize(using = PaymentInstrumentBankAccount.PaymentInstrumentBankAccountSerializer.class)
public class PaymentInstrumentBankAccount extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PaymentInstrumentBankAccount.class.getName());

    public static class PaymentInstrumentBankAccountSerializer extends StdSerializer<PaymentInstrumentBankAccount> {
        public PaymentInstrumentBankAccountSerializer(Class<PaymentInstrumentBankAccount> t) {
            super(t);
        }

        public PaymentInstrumentBankAccountSerializer() {
            this(null);
        }

        @Override
        public void serialize(PaymentInstrumentBankAccount value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class PaymentInstrumentBankAccountDeserializer extends StdDeserializer<PaymentInstrumentBankAccount> {
        public PaymentInstrumentBankAccountDeserializer() {
            this(PaymentInstrumentBankAccount.class);
        }

        public PaymentInstrumentBankAccountDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public PaymentInstrumentBankAccount deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();

            // deserialize IbanAccountIdentification
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (IbanAccountIdentification.class.equals(Integer.class) || IbanAccountIdentification.class.equals(Long.class) || IbanAccountIdentification.class.equals(Float.class) || IbanAccountIdentification.class.equals(Double.class) || IbanAccountIdentification.class.equals(Boolean.class) || IbanAccountIdentification.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((IbanAccountIdentification.class.equals(Integer.class) || IbanAccountIdentification.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((IbanAccountIdentification.class.equals(Float.class) || IbanAccountIdentification.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (IbanAccountIdentification.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (IbanAccountIdentification.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                // Checks if the unique type of the oneOf json matches any of the object TypeEnum values
                boolean typeMatch = Arrays.stream(IbanAccountIdentification.TypeEnum.values()).anyMatch((t) -> t.getValue().contains(tree.findValue("type").asText()));
                if (attemptParsing || typeMatch) {
                    // Strict deserialization for oneOf models
                    deserialized = JSON.getMapper().readValue(tree.toString(), IbanAccountIdentification.class);
                    // typeMatch should enforce proper deserialization
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'IbanAccountIdentification'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'IbanAccountIdentification'", e);
            }


            // deserialize UKLocalAccountIdentification
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (UKLocalAccountIdentification.class.equals(Integer.class) || UKLocalAccountIdentification.class.equals(Long.class) || UKLocalAccountIdentification.class.equals(Float.class) || UKLocalAccountIdentification.class.equals(Double.class) || UKLocalAccountIdentification.class.equals(Boolean.class) || UKLocalAccountIdentification.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((UKLocalAccountIdentification.class.equals(Integer.class) || UKLocalAccountIdentification.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((UKLocalAccountIdentification.class.equals(Float.class) || UKLocalAccountIdentification.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (UKLocalAccountIdentification.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (UKLocalAccountIdentification.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                // Checks if the unique type of the oneOf json matches any of the object TypeEnum values
                boolean typeMatch = Arrays.stream(UKLocalAccountIdentification.TypeEnum.values()).anyMatch((t) -> t.getValue().contains(tree.findValue("type").asText()));
                if (attemptParsing || typeMatch) {
                    // Strict deserialization for oneOf models
                    deserialized = JSON.getMapper().readValue(tree.toString(), UKLocalAccountIdentification.class);
                    // typeMatch should enforce proper deserialization
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'UKLocalAccountIdentification'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'UKLocalAccountIdentification'", e);
            }


            // deserialize USLocalAccountIdentification
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (USLocalAccountIdentification.class.equals(Integer.class) || USLocalAccountIdentification.class.equals(Long.class) || USLocalAccountIdentification.class.equals(Float.class) || USLocalAccountIdentification.class.equals(Double.class) || USLocalAccountIdentification.class.equals(Boolean.class) || USLocalAccountIdentification.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((USLocalAccountIdentification.class.equals(Integer.class) || USLocalAccountIdentification.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((USLocalAccountIdentification.class.equals(Float.class) || USLocalAccountIdentification.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (USLocalAccountIdentification.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (USLocalAccountIdentification.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                // Checks if the unique type of the oneOf json matches any of the object TypeEnum values
                boolean typeMatch = Arrays.stream(USLocalAccountIdentification.TypeEnum.values()).anyMatch((t) -> t.getValue().contains(tree.findValue("type").asText()));
                if (attemptParsing || typeMatch) {
                    // Strict deserialization for oneOf models
                    deserialized = JSON.getMapper().readValue(tree.toString(), USLocalAccountIdentification.class);
                    // typeMatch should enforce proper deserialization
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'USLocalAccountIdentification'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'USLocalAccountIdentification'", e);
            }

            // Throw error if there is no match
            if (match == 0) {
                throw new IOException(String.format("Failed deserialization for PaymentInstrumentBankAccount: %d classes match result, expected 1", match));
            }
            // Log warning if there is more than one match
            if (match > 1) {
                log.log(Level.WARNING, String.format("Warning, indecisive deserialization for PaymentInstrumentBankAccount: %d classes match result, expected 1", match));
            }

            PaymentInstrumentBankAccount ret = new PaymentInstrumentBankAccount();
            ret.setActualInstance(deserialized);
            return ret;
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public PaymentInstrumentBankAccount getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "PaymentInstrumentBankAccount cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public PaymentInstrumentBankAccount() {
        super("oneOf", Boolean.FALSE);
    }

    public PaymentInstrumentBankAccount(IbanAccountIdentification o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentInstrumentBankAccount(UKLocalAccountIdentification o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentInstrumentBankAccount(USLocalAccountIdentification o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("IbanAccountIdentification", new GenericType<IbanAccountIdentification>() {
        });
        schemas.put("UKLocalAccountIdentification", new GenericType<UKLocalAccountIdentification>() {
        });
        schemas.put("USLocalAccountIdentification", new GenericType<USLocalAccountIdentification>() {
        });
        JSON.registerDescendants(PaymentInstrumentBankAccount.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return PaymentInstrumentBankAccount.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * IbanAccountIdentification, UKLocalAccountIdentification, USLocalAccountIdentification
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(IbanAccountIdentification.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UKLocalAccountIdentification.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(USLocalAccountIdentification.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be IbanAccountIdentification, UKLocalAccountIdentification, USLocalAccountIdentification");
    }

    /**
     * Get the actual instance, which can be the following:
     * IbanAccountIdentification, UKLocalAccountIdentification, USLocalAccountIdentification
     *
     * @return The actual instance (IbanAccountIdentification, UKLocalAccountIdentification, USLocalAccountIdentification)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `IbanAccountIdentification`. If the actual instance is not `IbanAccountIdentification`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IbanAccountIdentification`
     * @throws ClassCastException if the instance is not `IbanAccountIdentification`
     */
    public IbanAccountIdentification getIbanAccountIdentification() throws ClassCastException {
        return (IbanAccountIdentification)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UKLocalAccountIdentification`. If the actual instance is not `UKLocalAccountIdentification`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UKLocalAccountIdentification`
     * @throws ClassCastException if the instance is not `UKLocalAccountIdentification`
     */
    public UKLocalAccountIdentification getUKLocalAccountIdentification() throws ClassCastException {
        return (UKLocalAccountIdentification)super.getActualInstance();
    }

    /**
     * Get the actual instance of `USLocalAccountIdentification`. If the actual instance is not `USLocalAccountIdentification`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `USLocalAccountIdentification`
     * @throws ClassCastException if the instance is not `USLocalAccountIdentification`
     */
    public USLocalAccountIdentification getUSLocalAccountIdentification() throws ClassCastException {
        return (USLocalAccountIdentification)super.getActualInstance();
    }

    /**
    * Create an instance of PaymentInstrumentBankAccount given an JSON string
    *
    * @param jsonString JSON string
    * @return An instance of PaymentInstrumentBankAccount
    * @throws IOException if the JSON string is invalid with respect to PaymentInstrumentBankAccount
    */
    public static PaymentInstrumentBankAccount fromJson(String jsonString) throws IOException {
        return JSON.getMapper().readValue(jsonString, PaymentInstrumentBankAccount.class);
    }

    /**
    * Convert an instance of PaymentInstrumentBankAccount to an JSON string
    *
    * @return JSON string
    */
    public String toJson() throws JsonProcessingException {
        return JSON.getMapper().writeValueAsString(this);
    }
}

