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
 * Represents a ChatScript endpoint.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ChatScriptEndpointBuilderFactory {


    /**
     * Builder for endpoint for the ChatScript component.
     */
    public interface ChatScriptEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedChatScriptEndpointBuilder advanced() {
            return (AdvancedChatScriptEndpointBuilder) this;
        }
        /**
         * Hostname or IP of the server on which CS server is running.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ChatScriptEndpointBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * Port on which ChatScript is listening to.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default ChatScriptEndpointBuilder port(int port) {
            setProperty("port", port);
            return this;
        }
        /**
         * Port on which ChatScript is listening to.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default ChatScriptEndpointBuilder port(String port) {
            setProperty("port", port);
            return this;
        }
        /**
         * Name of the Bot in CS to converse with.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ChatScriptEndpointBuilder botName(String botName) {
            setProperty("botName", botName);
            return this;
        }
        /**
         * Issues :reset command to start a new conversation everytime.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: reset
         */
        default ChatScriptEndpointBuilder resetchat(boolean resetchat) {
            setProperty("resetchat", resetchat);
            return this;
        }
        /**
         * Issues :reset command to start a new conversation everytime.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: reset
         */
        default ChatScriptEndpointBuilder resetchat(String resetchat) {
            setProperty("resetchat", resetchat);
            return this;
        }
        /**
         * Username who initializes the CS conversation. To be set when chat is
         * initialized from camel route.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: username
         */
        default ChatScriptEndpointBuilder chatUserName(String chatUserName) {
            setProperty("chatUserName", chatUserName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the ChatScript component.
     */
    public interface AdvancedChatScriptEndpointBuilder
            extends
                EndpointProducerBuilder {
        default ChatScriptEndpointBuilder basic() {
            return (ChatScriptEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedChatScriptEndpointBuilder basicPropertyBinding(
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
        default AdvancedChatScriptEndpointBuilder basicPropertyBinding(
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
        default AdvancedChatScriptEndpointBuilder synchronous(
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
        default AdvancedChatScriptEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * ChatScript (camel-chatscript)
     * Represents a ChatScript endpoint.
     * 
     * Syntax: <code>chatscript:host:port/botname</code>
     * Category: ai,chatscript
     * Available as of version: 3.0
     * Maven coordinates: org.apache.camel:camel-chatscript
     */
    default ChatScriptEndpointBuilder chatScript(String path) {
        class ChatScriptEndpointBuilderImpl extends AbstractEndpointBuilder implements ChatScriptEndpointBuilder, AdvancedChatScriptEndpointBuilder {
            public ChatScriptEndpointBuilderImpl(String path) {
                super("chatscript", path);
            }
        }
        return new ChatScriptEndpointBuilderImpl(path);
    }
}