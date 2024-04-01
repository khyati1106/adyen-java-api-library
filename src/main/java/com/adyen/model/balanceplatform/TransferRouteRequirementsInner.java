/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.balanceplatform.AddressRequirement;
import com.adyen.model.balanceplatform.AmountMinMaxRequirement;
import com.adyen.model.balanceplatform.BankAccountIdentificationTypeRequirement;
import com.adyen.model.balanceplatform.PaymentInstrumentRequirement;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
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


@JsonDeserialize(using = TransferRouteRequirementsInner.TransferRouteRequirementsInnerDeserializer.class)
@JsonSerialize(using = TransferRouteRequirementsInner.TransferRouteRequirementsInnerSerializer.class)
public class TransferRouteRequirementsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TransferRouteRequirementsInner.class.getName());

    public static class TransferRouteRequirementsInnerSerializer extends StdSerializer<TransferRouteRequirementsInner> {
        public TransferRouteRequirementsInnerSerializer(Class<TransferRouteRequirementsInner> t) {
            super(t);
        }

        public TransferRouteRequirementsInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(TransferRouteRequirementsInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class TransferRouteRequirementsInnerDeserializer extends StdDeserializer<TransferRouteRequirementsInner> {
        public TransferRouteRequirementsInnerDeserializer() {
            this(TransferRouteRequirementsInner.class);
        }

        public TransferRouteRequirementsInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public TransferRouteRequirementsInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();

            // deserialize AddressRequirement
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AddressRequirement.class.equals(Integer.class) || AddressRequirement.class.equals(Long.class) || AddressRequirement.class.equals(Float.class) || AddressRequirement.class.equals(Double.class) || AddressRequirement.class.equals(Boolean.class) || AddressRequirement.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AddressRequirement.class.equals(Integer.class) || AddressRequirement.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AddressRequirement.class.equals(Float.class) || AddressRequirement.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AddressRequirement.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AddressRequirement.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                // Checks if the unique type of the oneOf json matches any of the object TypeEnum values
                boolean typeMatch = Arrays.stream(AddressRequirement.TypeEnum.values()).anyMatch((t) -> t.getValue().contains(tree.findValue("type").asText()));
                if (attemptParsing || typeMatch) {
                    // Strict deserialization for oneOf models
                    deserialized = JSON.getMapper().readValue(tree.toString(), AddressRequirement.class);
                    // typeMatch should enforce proper deserialization
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AddressRequirement'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AddressRequirement'", e);
            }


            // deserialize AmountMinMaxRequirement
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AmountMinMaxRequirement.class.equals(Integer.class) || AmountMinMaxRequirement.class.equals(Long.class) || AmountMinMaxRequirement.class.equals(Float.class) || AmountMinMaxRequirement.class.equals(Double.class) || AmountMinMaxRequirement.class.equals(Boolean.class) || AmountMinMaxRequirement.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AmountMinMaxRequirement.class.equals(Integer.class) || AmountMinMaxRequirement.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AmountMinMaxRequirement.class.equals(Float.class) || AmountMinMaxRequirement.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AmountMinMaxRequirement.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AmountMinMaxRequirement.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                // Checks if the unique type of the oneOf json matches any of the object TypeEnum values
                boolean typeMatch = Arrays.stream(AmountMinMaxRequirement.TypeEnum.values()).anyMatch((t) -> t.getValue().contains(tree.findValue("type").asText()));
                if (attemptParsing || typeMatch) {
                    // Strict deserialization for oneOf models
                    deserialized = JSON.getMapper().readValue(tree.toString(), AmountMinMaxRequirement.class);
                    // typeMatch should enforce proper deserialization
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AmountMinMaxRequirement'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AmountMinMaxRequirement'", e);
            }


            // deserialize BankAccountIdentificationTypeRequirement
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (BankAccountIdentificationTypeRequirement.class.equals(Integer.class) || BankAccountIdentificationTypeRequirement.class.equals(Long.class) || BankAccountIdentificationTypeRequirement.class.equals(Float.class) || BankAccountIdentificationTypeRequirement.class.equals(Double.class) || BankAccountIdentificationTypeRequirement.class.equals(Boolean.class) || BankAccountIdentificationTypeRequirement.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((BankAccountIdentificationTypeRequirement.class.equals(Integer.class) || BankAccountIdentificationTypeRequirement.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((BankAccountIdentificationTypeRequirement.class.equals(Float.class) || BankAccountIdentificationTypeRequirement.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (BankAccountIdentificationTypeRequirement.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (BankAccountIdentificationTypeRequirement.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                // Checks if the unique type of the oneOf json matches any of the object TypeEnum values
                boolean typeMatch = Arrays.stream(BankAccountIdentificationTypeRequirement.TypeEnum.values()).anyMatch((t) -> t.getValue().contains(tree.findValue("type").asText()));
                if (attemptParsing || typeMatch) {
                    // Strict deserialization for oneOf models
                    deserialized = JSON.getMapper().readValue(tree.toString(), BankAccountIdentificationTypeRequirement.class);
                    // typeMatch should enforce proper deserialization
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'BankAccountIdentificationTypeRequirement'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'BankAccountIdentificationTypeRequirement'", e);
            }


            // deserialize PaymentInstrumentRequirement
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PaymentInstrumentRequirement.class.equals(Integer.class) || PaymentInstrumentRequirement.class.equals(Long.class) || PaymentInstrumentRequirement.class.equals(Float.class) || PaymentInstrumentRequirement.class.equals(Double.class) || PaymentInstrumentRequirement.class.equals(Boolean.class) || PaymentInstrumentRequirement.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PaymentInstrumentRequirement.class.equals(Integer.class) || PaymentInstrumentRequirement.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PaymentInstrumentRequirement.class.equals(Float.class) || PaymentInstrumentRequirement.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PaymentInstrumentRequirement.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PaymentInstrumentRequirement.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                // Checks if the unique type of the oneOf json matches any of the object TypeEnum values
                boolean typeMatch = Arrays.stream(PaymentInstrumentRequirement.TypeEnum.values()).anyMatch((t) -> t.getValue().contains(tree.findValue("type").asText()));
                if (attemptParsing || typeMatch) {
                    // Strict deserialization for oneOf models
                    deserialized = JSON.getMapper().readValue(tree.toString(), PaymentInstrumentRequirement.class);
                    // typeMatch should enforce proper deserialization
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PaymentInstrumentRequirement'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PaymentInstrumentRequirement'", e);
            }

            // Throw error if there is no match
            if (match == 0) {
                throw new IOException(String.format("Failed deserialization for TransferRouteRequirementsInner: %d classes match result, expected 1", match));
            }
            // Log warning if there is more than one match
            if (match > 1) {
                log.log(Level.WARNING, String.format("Warning, indecisive deserialization for TransferRouteRequirementsInner: %d classes match result, expected 1", match));
            }

            TransferRouteRequirementsInner ret = new TransferRouteRequirementsInner();
            ret.setActualInstance(deserialized);
            return ret;
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public TransferRouteRequirementsInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "TransferRouteRequirementsInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public TransferRouteRequirementsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public TransferRouteRequirementsInner(AddressRequirement o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TransferRouteRequirementsInner(AmountMinMaxRequirement o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TransferRouteRequirementsInner(BankAccountIdentificationTypeRequirement o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TransferRouteRequirementsInner(PaymentInstrumentRequirement o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AddressRequirement", new GenericType<AddressRequirement>() {
        });
        schemas.put("AmountMinMaxRequirement", new GenericType<AmountMinMaxRequirement>() {
        });
        schemas.put("BankAccountIdentificationTypeRequirement", new GenericType<BankAccountIdentificationTypeRequirement>() {
        });
        schemas.put("PaymentInstrumentRequirement", new GenericType<PaymentInstrumentRequirement>() {
        });
        JSON.registerDescendants(TransferRouteRequirementsInner.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return TransferRouteRequirementsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AddressRequirement, AmountMinMaxRequirement, BankAccountIdentificationTypeRequirement, PaymentInstrumentRequirement
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(AddressRequirement.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AmountMinMaxRequirement.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(BankAccountIdentificationTypeRequirement.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PaymentInstrumentRequirement.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AddressRequirement, AmountMinMaxRequirement, BankAccountIdentificationTypeRequirement, PaymentInstrumentRequirement");
    }

    /**
     * Get the actual instance, which can be the following:
     * AddressRequirement, AmountMinMaxRequirement, BankAccountIdentificationTypeRequirement, PaymentInstrumentRequirement
     *
     * @return The actual instance (AddressRequirement, AmountMinMaxRequirement, BankAccountIdentificationTypeRequirement, PaymentInstrumentRequirement)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AddressRequirement`. If the actual instance is not `AddressRequirement`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AddressRequirement`
     * @throws ClassCastException if the instance is not `AddressRequirement`
     */
    public AddressRequirement getAddressRequirement() throws ClassCastException {
        return (AddressRequirement)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AmountMinMaxRequirement`. If the actual instance is not `AmountMinMaxRequirement`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AmountMinMaxRequirement`
     * @throws ClassCastException if the instance is not `AmountMinMaxRequirement`
     */
    public AmountMinMaxRequirement getAmountMinMaxRequirement() throws ClassCastException {
        return (AmountMinMaxRequirement)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BankAccountIdentificationTypeRequirement`. If the actual instance is not `BankAccountIdentificationTypeRequirement`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BankAccountIdentificationTypeRequirement`
     * @throws ClassCastException if the instance is not `BankAccountIdentificationTypeRequirement`
     */
    public BankAccountIdentificationTypeRequirement getBankAccountIdentificationTypeRequirement() throws ClassCastException {
        return (BankAccountIdentificationTypeRequirement)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentInstrumentRequirement`. If the actual instance is not `PaymentInstrumentRequirement`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentInstrumentRequirement`
     * @throws ClassCastException if the instance is not `PaymentInstrumentRequirement`
     */
    public PaymentInstrumentRequirement getPaymentInstrumentRequirement() throws ClassCastException {
        return (PaymentInstrumentRequirement)super.getActualInstance();
    }

    /**
    * Create an instance of TransferRouteRequirementsInner given an JSON string
    *
    * @param jsonString JSON string
    * @return An instance of TransferRouteRequirementsInner
    * @throws IOException if the JSON string is invalid with respect to TransferRouteRequirementsInner
    */
    public static TransferRouteRequirementsInner fromJson(String jsonString) throws IOException {
        return JSON.getMapper().readValue(jsonString, TransferRouteRequirementsInner.class);
    }

    /**
    * Convert an instance of TransferRouteRequirementsInner to an JSON string
    *
    * @return JSON string
    */
    public String toJson() throws JsonProcessingException {
        return JSON.getMapper().writeValueAsString(this);
    }
}

