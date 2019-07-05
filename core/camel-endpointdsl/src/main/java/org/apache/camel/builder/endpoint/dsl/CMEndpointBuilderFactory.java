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
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The cm-sms component allows to integrate with CM SMS Gateway.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CMEndpointBuilderFactory {


    /**
     * Builder for endpoint for the CM SMS Gateway component.
     */
    public interface CMEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedCMEndpointBuilder advanced() {
            return (AdvancedCMEndpointBuilder) this;
        }
        /**
         * SMS Provider HOST with scheme.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default CMEndpointBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * This is the sender name. The maximum length is 11 characters.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default CMEndpointBuilder defaultFrom(String defaultFrom) {
            setProperty("defaultFrom", defaultFrom);
            return this;
        }
        /**
         * If it is a multipart message forces the max number. Message can be
         * truncated. Technically the gateway will first check if a message is
         * larger than 160 characters, if so, the message will be cut into
         * multiple 153 characters parts limited by these parameters.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default CMEndpointBuilder defaultMaxNumberOfParts(
                int defaultMaxNumberOfParts) {
            setProperty("defaultMaxNumberOfParts", defaultMaxNumberOfParts);
            return this;
        }
        /**
         * If it is a multipart message forces the max number. Message can be
         * truncated. Technically the gateway will first check if a message is
         * larger than 160 characters, if so, the message will be cut into
         * multiple 153 characters parts limited by these parameters.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default CMEndpointBuilder defaultMaxNumberOfParts(
                String defaultMaxNumberOfParts) {
            setProperty("defaultMaxNumberOfParts", defaultMaxNumberOfParts);
            return this;
        }
        /**
         * The unique token to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default CMEndpointBuilder productToken(String productToken) {
            setProperty("productToken", productToken);
            return this;
        }
        /**
         * Whether to test the connection to the SMS Gateway on startup.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default CMEndpointBuilder testConnectionOnStartup(
                boolean testConnectionOnStartup) {
            setProperty("testConnectionOnStartup", testConnectionOnStartup);
            return this;
        }
        /**
         * Whether to test the connection to the SMS Gateway on startup.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default CMEndpointBuilder testConnectionOnStartup(
                String testConnectionOnStartup) {
            setProperty("testConnectionOnStartup", testConnectionOnStartup);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the CM SMS Gateway component.
     */
    public interface AdvancedCMEndpointBuilder
            extends
                EndpointProducerBuilder {
        default CMEndpointBuilder basic() {
            return (CMEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedCMEndpointBuilder basicPropertyBinding(
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
        default AdvancedCMEndpointBuilder basicPropertyBinding(
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
        default AdvancedCMEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedCMEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * CM SMS Gateway (camel-cm-sms)
     * The cm-sms component allows to integrate with CM SMS Gateway.
     * 
     * Syntax: <code>cm-sms:host</code>
     * Category: mobile
     * Available as of version: 2.18
     * Maven coordinates: org.apache.camel:camel-cm-sms
     */
    default CMEndpointBuilder cM(String path) {
        class CMEndpointBuilderImpl extends AbstractEndpointBuilder implements CMEndpointBuilder, AdvancedCMEndpointBuilder {
            public CMEndpointBuilderImpl(String path) {
                super("cm-sms", path);
            }
        }
        return new CMEndpointBuilderImpl(path);
    }
}