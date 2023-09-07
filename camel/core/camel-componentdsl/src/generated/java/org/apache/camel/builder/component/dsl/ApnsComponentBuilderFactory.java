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
import org.apache.camel.component.apns.ApnsComponent;

/**
 * For sending notifications to Apple iOS devices.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface ApnsComponentBuilderFactory {

    /**
     * APNS (camel-apns)
     * For sending notifications to Apple iOS devices.
     * 
     * Category: eventbus,mobile
     * Since: 2.8
     * Maven coordinates: org.apache.camel:camel-apns
     */
    static ApnsComponentBuilder apns() {
        return new ApnsComponentBuilderImpl();
    }

    /**
     * Builder for the APNS component.
     */
    interface ApnsComponentBuilder extends ComponentBuilder<ApnsComponent> {
        /**
         * The ApnsService to use. The
         * org.apache.camel.component.apns.factory.ApnsServiceFactory can be
         * used to build a ApnsService.
         * 
         * The option is a: <code>com.notnoop.apns.ApnsService</code> type.
         * 
         * Group: common
         */
        default ApnsComponentBuilder apnsService(
                com.notnoop.apns.ApnsService apnsService) {
            doSetProperty("apnsService", apnsService);
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
        default ApnsComponentBuilder bridgeErrorHandler(
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
        default ApnsComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default ApnsComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
    }

    class ApnsComponentBuilderImpl
            extends
                AbstractComponentBuilder<ApnsComponent>
            implements
                ApnsComponentBuilder {
        @Override
        protected ApnsComponent buildConcreteComponent() {
            return new ApnsComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "apnsService": ((ApnsComponent) component).setApnsService((com.notnoop.apns.ApnsService) value); return true;
            case "bridgeErrorHandler": ((ApnsComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((ApnsComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((ApnsComponent) component).setBasicPropertyBinding((boolean) value); return true;
            default: return false;
            }
        }
    }
}