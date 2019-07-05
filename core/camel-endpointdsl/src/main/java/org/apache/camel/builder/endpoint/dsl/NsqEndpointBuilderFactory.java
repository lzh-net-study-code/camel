/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Represents a nsq endpoint.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface NsqEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the NSQ component.
     */
    public interface NsqEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedNsqEndpointConsumerBuilder advanced() {
            return (AdvancedNsqEndpointConsumerBuilder) this;
        }
        /**
         * The hostnames of one or more nsqlookupd servers (consumer) or nsqd
         * servers (producer).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default NsqEndpointConsumerBuilder servers(String servers) {
            setProperty("servers", servers);
            return this;
        }
        /**
         * The name of topic we want to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: common
         */
        default NsqEndpointConsumerBuilder topic(String topic) {
            setProperty("topic", topic);
            return this;
        }
        /**
         * A String to identify the kind of client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default NsqEndpointConsumerBuilder userAgent(String userAgent) {
            setProperty("userAgent", userAgent);
            return this;
        }
        /**
         * Automatically finish the NSQ message when it is retrieved from the
         * quese and before the Exchange is processed.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: consumer
         */
        default NsqEndpointConsumerBuilder autoFinish(Boolean autoFinish) {
            setProperty("autoFinish", autoFinish);
            return this;
        }
        /**
         * Automatically finish the NSQ message when it is retrieved from the
         * quese and before the Exchange is processed.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: consumer
         */
        default NsqEndpointConsumerBuilder autoFinish(String autoFinish) {
            setProperty("autoFinish", autoFinish);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default NsqEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default NsqEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The name of channel we want to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default NsqEndpointConsumerBuilder channel(String channel) {
            setProperty("channel", channel);
            return this;
        }
        /**
         * The lookup retry interval.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: consumer
         */
        default NsqEndpointConsumerBuilder lookupInterval(long lookupInterval) {
            setProperty("lookupInterval", lookupInterval);
            return this;
        }
        /**
         * The lookup retry interval.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: consumer
         */
        default NsqEndpointConsumerBuilder lookupInterval(String lookupInterval) {
            setProperty("lookupInterval", lookupInterval);
            return this;
        }
        /**
         * The port of the nsqdlookupd server.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: consumer
         */
        default NsqEndpointConsumerBuilder lookupServerPort(int lookupServerPort) {
            setProperty("lookupServerPort", lookupServerPort);
            return this;
        }
        /**
         * The port of the nsqdlookupd server.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: consumer
         */
        default NsqEndpointConsumerBuilder lookupServerPort(
                String lookupServerPort) {
            setProperty("lookupServerPort", lookupServerPort);
            return this;
        }
        /**
         * The NSQ message timeout for a consumer.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: consumer
         */
        default NsqEndpointConsumerBuilder messageTimeout(long messageTimeout) {
            setProperty("messageTimeout", messageTimeout);
            return this;
        }
        /**
         * The NSQ message timeout for a consumer.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: consumer
         */
        default NsqEndpointConsumerBuilder messageTimeout(String messageTimeout) {
            setProperty("messageTimeout", messageTimeout);
            return this;
        }
        /**
         * Consumer pool size.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: consumer
         */
        default NsqEndpointConsumerBuilder poolSize(int poolSize) {
            setProperty("poolSize", poolSize);
            return this;
        }
        /**
         * Consumer pool size.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: consumer
         */
        default NsqEndpointConsumerBuilder poolSize(String poolSize) {
            setProperty("poolSize", poolSize);
            return this;
        }
        /**
         * The requeue interval.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: consumer
         */
        default NsqEndpointConsumerBuilder requeueInterval(long requeueInterval) {
            setProperty("requeueInterval", requeueInterval);
            return this;
        }
        /**
         * The requeue interval.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: consumer
         */
        default NsqEndpointConsumerBuilder requeueInterval(
                String requeueInterval) {
            setProperty("requeueInterval", requeueInterval);
            return this;
        }
        /**
         * Set secure option indicating TLS is required.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: security
         */
        default NsqEndpointConsumerBuilder secure(boolean secure) {
            setProperty("secure", secure);
            return this;
        }
        /**
         * Set secure option indicating TLS is required.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: security
         */
        default NsqEndpointConsumerBuilder secure(String secure) {
            setProperty("secure", secure);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default NsqEndpointConsumerBuilder sslContextParameters(
                Object sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default NsqEndpointConsumerBuilder sslContextParameters(
                String sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the NSQ component.
     */
    public interface AdvancedNsqEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default NsqEndpointConsumerBuilder basic() {
            return (NsqEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedNsqEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedNsqEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedNsqEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedNsqEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNsqEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNsqEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNsqEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNsqEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the NSQ component.
     */
    public interface NsqEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedNsqEndpointProducerBuilder advanced() {
            return (AdvancedNsqEndpointProducerBuilder) this;
        }
        /**
         * The hostnames of one or more nsqlookupd servers (consumer) or nsqd
         * servers (producer).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default NsqEndpointProducerBuilder servers(String servers) {
            setProperty("servers", servers);
            return this;
        }
        /**
         * The name of topic we want to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: common
         */
        default NsqEndpointProducerBuilder topic(String topic) {
            setProperty("topic", topic);
            return this;
        }
        /**
         * A String to identify the kind of client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default NsqEndpointProducerBuilder userAgent(String userAgent) {
            setProperty("userAgent", userAgent);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default NsqEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default NsqEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The port of the nsqd server.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default NsqEndpointProducerBuilder port(int port) {
            setProperty("port", port);
            return this;
        }
        /**
         * The port of the nsqd server.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default NsqEndpointProducerBuilder port(String port) {
            setProperty("port", port);
            return this;
        }
        /**
         * Set secure option indicating TLS is required.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: security
         */
        default NsqEndpointProducerBuilder secure(boolean secure) {
            setProperty("secure", secure);
            return this;
        }
        /**
         * Set secure option indicating TLS is required.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: security
         */
        default NsqEndpointProducerBuilder secure(String secure) {
            setProperty("secure", secure);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default NsqEndpointProducerBuilder sslContextParameters(
                Object sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default NsqEndpointProducerBuilder sslContextParameters(
                String sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the NSQ component.
     */
    public interface AdvancedNsqEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default NsqEndpointProducerBuilder basic() {
            return (NsqEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNsqEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNsqEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNsqEndpointProducerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNsqEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the NSQ component.
     */
    public interface NsqEndpointBuilder
            extends
                NsqEndpointConsumerBuilder, NsqEndpointProducerBuilder {
        default AdvancedNsqEndpointBuilder advanced() {
            return (AdvancedNsqEndpointBuilder) this;
        }
        /**
         * The hostnames of one or more nsqlookupd servers (consumer) or nsqd
         * servers (producer).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default NsqEndpointBuilder servers(String servers) {
            setProperty("servers", servers);
            return this;
        }
        /**
         * The name of topic we want to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: common
         */
        default NsqEndpointBuilder topic(String topic) {
            setProperty("topic", topic);
            return this;
        }
        /**
         * A String to identify the kind of client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default NsqEndpointBuilder userAgent(String userAgent) {
            setProperty("userAgent", userAgent);
            return this;
        }
        /**
         * Set secure option indicating TLS is required.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: security
         */
        default NsqEndpointBuilder secure(boolean secure) {
            setProperty("secure", secure);
            return this;
        }
        /**
         * Set secure option indicating TLS is required.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: security
         */
        default NsqEndpointBuilder secure(String secure) {
            setProperty("secure", secure);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default NsqEndpointBuilder sslContextParameters(
                Object sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default NsqEndpointBuilder sslContextParameters(
                String sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the NSQ component.
     */
    public interface AdvancedNsqEndpointBuilder
            extends
                AdvancedNsqEndpointConsumerBuilder, AdvancedNsqEndpointProducerBuilder {
        default NsqEndpointBuilder basic() {
            return (NsqEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNsqEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNsqEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNsqEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNsqEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * NSQ (camel-nsq)
     * Represents a nsq endpoint.
     * 
     * Syntax: <code>nsq:servers</code>
     * Category: messaging
     * Available as of version: 2.23
     * Maven coordinates: org.apache.camel:camel-nsq
     */
    default NsqEndpointBuilder nsq(String path) {
        class NsqEndpointBuilderImpl extends AbstractEndpointBuilder implements NsqEndpointBuilder, AdvancedNsqEndpointBuilder {
            public NsqEndpointBuilderImpl(String path) {
                super("nsq", path);
            }
        }
        return new NsqEndpointBuilderImpl(path);
    }
}