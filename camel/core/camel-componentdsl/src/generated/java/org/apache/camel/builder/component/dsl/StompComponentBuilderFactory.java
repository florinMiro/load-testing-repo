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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.stomp.StompComponent;

/**
 * The stomp component is used for communicating with Stomp compliant message
 * brokers.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface StompComponentBuilderFactory {

    /**
     * Stomp (camel-stomp)
     * The stomp component is used for communicating with Stomp compliant
     * message brokers.
     * 
     * Category: messaging
     * Since: 2.12
     * Maven coordinates: org.apache.camel:camel-stomp
     */
    static StompComponentBuilder stomp() {
        return new StompComponentBuilderImpl();
    }

    /**
     * Builder for the Stomp component.
     */
    interface StompComponentBuilder extends ComponentBuilder<StompComponent> {
        /**
         * The URI of the Stomp broker to connect to.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default StompComponentBuilder brokerURL(java.lang.String brokerURL) {
            doSetProperty("brokerURL", brokerURL);
            return this;
        }
        /**
         * The virtual host.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default StompComponentBuilder host(java.lang.String host) {
            doSetProperty("host", host);
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
         * Default: false
         * Group: consumer
         */
        default StompComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
         * Default: false
         * Group: producer
         */
        default StompComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default StompComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use the shared stomp configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.stomp.StompConfiguration</code>
         * type.
         * 
         * Group: advanced
         */
        default StompComponentBuilder configuration(
                org.apache.camel.component.stomp.StompConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
         * header to and from Camel message.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: filter
         */
        default StompComponentBuilder headerFilterStrategy(
                org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * The username.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default StompComponentBuilder login(java.lang.String login) {
            doSetProperty("login", login);
            return this;
        }
        /**
         * The password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default StompComponentBuilder passcode(java.lang.String passcode) {
            doSetProperty("passcode", passcode);
            return this;
        }
        /**
         * Enable usage of global SSL context parameters.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: security
         */
        default StompComponentBuilder useGlobalSslContextParameters(
                boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
    }

    class StompComponentBuilderImpl
            extends
                AbstractComponentBuilder<StompComponent>
            implements
                StompComponentBuilder {
        @Override
        protected StompComponent buildConcreteComponent() {
            return new StompComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "brokerURL": ((StompComponent) component).setBrokerURL((java.lang.String) value); return true;
            case "host": ((StompComponent) component).setHost((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((StompComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((StompComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((StompComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "configuration": ((StompComponent) component).setConfiguration((org.apache.camel.component.stomp.StompConfiguration) value); return true;
            case "headerFilterStrategy": ((StompComponent) component).setHeaderFilterStrategy((org.apache.camel.spi.HeaderFilterStrategy) value); return true;
            case "login": ((StompComponent) component).setLogin((java.lang.String) value); return true;
            case "passcode": ((StompComponent) component).setPasscode((java.lang.String) value); return true;
            case "useGlobalSslContextParameters": ((StompComponent) component).setUseGlobalSslContextParameters((boolean) value); return true;
            default: return false;
            }
        }
    }
}