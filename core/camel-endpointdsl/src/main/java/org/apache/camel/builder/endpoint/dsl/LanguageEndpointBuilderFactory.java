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
 * The language component allows you to send a message to an endpoint which
 * executes a script by any of the supported Languages in Camel.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface LanguageEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Language component.
     */
    public interface LanguageEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedLanguageEndpointBuilder advanced() {
            return (AdvancedLanguageEndpointBuilder) this;
        }
        /**
         * Sets the name of the language to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default LanguageEndpointBuilder languageName(String languageName) {
            setProperty("languageName", languageName);
            return this;
        }
        /**
         * Path to the resource, or a reference to lookup a bean in the Registry
         * to use as the resource.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default LanguageEndpointBuilder resourceUri(String resourceUri) {
            setProperty("resourceUri", resourceUri);
            return this;
        }
        /**
         * Whether the script is binary content or text content. By default the
         * script is read as text content (eg java.lang.String).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default LanguageEndpointBuilder binary(boolean binary) {
            setProperty("binary", binary);
            return this;
        }
        /**
         * Whether the script is binary content or text content. By default the
         * script is read as text content (eg java.lang.String).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default LanguageEndpointBuilder binary(String binary) {
            setProperty("binary", binary);
            return this;
        }
        /**
         * Whether to cache the compiled script and reuse Notice reusing the
         * script can cause side effects from processing one Camel
         * org.apache.camel.Exchange to the next org.apache.camel.Exchange.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default LanguageEndpointBuilder cacheScript(boolean cacheScript) {
            setProperty("cacheScript", cacheScript);
            return this;
        }
        /**
         * Whether to cache the compiled script and reuse Notice reusing the
         * script can cause side effects from processing one Camel
         * org.apache.camel.Exchange to the next org.apache.camel.Exchange.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default LanguageEndpointBuilder cacheScript(String cacheScript) {
            setProperty("cacheScript", cacheScript);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default LanguageEndpointBuilder contentCache(boolean contentCache) {
            setProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default LanguageEndpointBuilder contentCache(String contentCache) {
            setProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets the script to execute.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default LanguageEndpointBuilder script(String script) {
            setProperty("script", script);
            return this;
        }
        /**
         * Whether or not the result of the script should be used as message
         * body. This options is default true.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default LanguageEndpointBuilder transform(boolean transform) {
            setProperty("transform", transform);
            return this;
        }
        /**
         * Whether or not the result of the script should be used as message
         * body. This options is default true.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default LanguageEndpointBuilder transform(String transform) {
            setProperty("transform", transform);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Language component.
     */
    public interface AdvancedLanguageEndpointBuilder
            extends
                EndpointProducerBuilder {
        default LanguageEndpointBuilder basic() {
            return (LanguageEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedLanguageEndpointBuilder basicPropertyBinding(
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
        default AdvancedLanguageEndpointBuilder basicPropertyBinding(
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
        default AdvancedLanguageEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedLanguageEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Language (camel-language)
     * The language component allows you to send a message to an endpoint which
     * executes a script by any of the supported Languages in Camel.
     * 
     * Syntax: <code>language:languageName:resourceUri</code>
     * Category: core,script
     * Available as of version: 2.5
     * Maven coordinates: org.apache.camel:camel-language
     */
    default LanguageEndpointBuilder language(String path) {
        class LanguageEndpointBuilderImpl extends AbstractEndpointBuilder implements LanguageEndpointBuilder, AdvancedLanguageEndpointBuilder {
            public LanguageEndpointBuilderImpl(String path) {
                super("language", path);
            }
        }
        return new LanguageEndpointBuilderImpl(path);
    }
}