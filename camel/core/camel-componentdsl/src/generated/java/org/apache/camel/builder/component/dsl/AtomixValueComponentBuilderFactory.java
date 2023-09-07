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
import org.apache.camel.component.atomix.client.value.AtomixValueComponent;

/**
 * The atomix-value component is used to access Atomix's distributed value.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AtomixValueComponentBuilderFactory {

    /**
     * Atomix Value (camel-atomix)
     * The atomix-value component is used to access Atomix's distributed value.
     * 
     * Category: clustering
     * Since: 2.20
     * Maven coordinates: org.apache.camel:camel-atomix
     */
    static AtomixValueComponentBuilder atomixValue() {
        return new AtomixValueComponentBuilderImpl();
    }

    /**
     * Builder for the Atomix Value component.
     */
    interface AtomixValueComponentBuilder
            extends
                ComponentBuilder<AtomixValueComponent> {
        /**
         * The shared AtomixClient instance.
         * 
         * The option is a: <code>io.atomix.AtomixClient</code> type.
         * 
         * Group: common
         */
        default AtomixValueComponentBuilder atomix(io.atomix.AtomixClient atomix) {
            doSetProperty("atomix", atomix);
            return this;
        }
        /**
         * The shared component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.atomix.client.value.AtomixValueConfiguration</code> type.
         * 
         * Group: common
         */
        default AtomixValueComponentBuilder configuration(
                org.apache.camel.component.atomix.client.value.AtomixValueConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The path to the AtomixClient configuration.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AtomixValueComponentBuilder configurationUri(
                java.lang.String configurationUri) {
            doSetProperty("configurationUri", configurationUri);
            return this;
        }
        /**
         * The nodes the AtomixClient should connect to.
         * 
         * The option is a:
         * <code>java.util.List<io.atomix.catalyst.transport.Address></code>
         * type.
         * 
         * Group: common
         */
        default AtomixValueComponentBuilder nodes(
                java.util.List<io.atomix.catalyst.transport.Address> nodes) {
            doSetProperty("nodes", nodes);
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
        default AtomixValueComponentBuilder bridgeErrorHandler(
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
        default AtomixValueComponentBuilder lazyStartProducer(
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
        default AtomixValueComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
    }

    class AtomixValueComponentBuilderImpl
            extends
                AbstractComponentBuilder<AtomixValueComponent>
            implements
                AtomixValueComponentBuilder {
        @Override
        protected AtomixValueComponent buildConcreteComponent() {
            return new AtomixValueComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "atomix": ((AtomixValueComponent) component).setAtomix((io.atomix.AtomixClient) value); return true;
            case "configuration": ((AtomixValueComponent) component).setConfiguration((org.apache.camel.component.atomix.client.value.AtomixValueConfiguration) value); return true;
            case "configurationUri": ((AtomixValueComponent) component).setConfigurationUri((java.lang.String) value); return true;
            case "nodes": ((AtomixValueComponent) component).setNodes((java.util.List<io.atomix.catalyst.transport.Address>) value); return true;
            case "bridgeErrorHandler": ((AtomixValueComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((AtomixValueComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((AtomixValueComponent) component).setBasicPropertyBinding((boolean) value); return true;
            default: return false;
            }
        }
    }
}