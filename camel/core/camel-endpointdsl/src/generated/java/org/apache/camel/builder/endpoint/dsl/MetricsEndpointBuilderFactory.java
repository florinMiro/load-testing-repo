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
 * To collect various metrics directly from Camel routes using the DropWizard
 * metrics library.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MetricsEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Metrics component.
     */
    public interface MetricsEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedMetricsEndpointBuilder advanced() {
            return (AdvancedMetricsEndpointBuilder) this;
        }
        /**
         * Action when using timer type.
         * 
         * The option is a:
         * <code>org.apache.camel.component.metrics.MetricsTimerAction</code>
         * type.
         * 
         * Group: producer
         */
        default MetricsEndpointBuilder action(MetricsTimerAction action) {
            doSetProperty("action", action);
            return this;
        }
        /**
         * Action when using timer type.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.metrics.MetricsTimerAction</code>
         * type.
         * 
         * Group: producer
         */
        default MetricsEndpointBuilder action(String action) {
            doSetProperty("action", action);
            return this;
        }
        /**
         * Decrement value when using counter type.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default MetricsEndpointBuilder decrement(Long decrement) {
            doSetProperty("decrement", decrement);
            return this;
        }
        /**
         * Decrement value when using counter type.
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default MetricsEndpointBuilder decrement(String decrement) {
            doSetProperty("decrement", decrement);
            return this;
        }
        /**
         * Increment value when using counter type.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default MetricsEndpointBuilder increment(Long increment) {
            doSetProperty("increment", increment);
            return this;
        }
        /**
         * Increment value when using counter type.
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default MetricsEndpointBuilder increment(String increment) {
            doSetProperty("increment", increment);
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
        default MetricsEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * Default: false
         * Group: producer
         */
        default MetricsEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Mark when using meter type.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default MetricsEndpointBuilder mark(Long mark) {
            doSetProperty("mark", mark);
            return this;
        }
        /**
         * Mark when using meter type.
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default MetricsEndpointBuilder mark(String mark) {
            doSetProperty("mark", mark);
            return this;
        }
        /**
         * Subject value when using gauge type.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Group: producer
         */
        default MetricsEndpointBuilder subject(Object subject) {
            doSetProperty("subject", subject);
            return this;
        }
        /**
         * Subject value when using gauge type.
         * 
         * The option will be converted to a <code>java.lang.Object</code> type.
         * 
         * Group: producer
         */
        default MetricsEndpointBuilder subject(String subject) {
            doSetProperty("subject", subject);
            return this;
        }
        /**
         * Value value when using histogram type.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default MetricsEndpointBuilder value(Long value) {
            doSetProperty("value", value);
            return this;
        }
        /**
         * Value value when using histogram type.
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default MetricsEndpointBuilder value(String value) {
            doSetProperty("value", value);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Metrics component.
     */
    public interface AdvancedMetricsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default MetricsEndpointBuilder basic() {
            return (MetricsEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedMetricsEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedMetricsEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedMetricsEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedMetricsEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.metrics.MetricsTimerAction</code> enum.
     */
    enum MetricsTimerAction {
        start,
        stop;
    }

    public interface MetricsBuilders {
        /**
         * Metrics (camel-metrics)
         * To collect various metrics directly from Camel routes using the
         * DropWizard metrics library.
         * 
         * Category: monitoring
         * Since: 2.14
         * Maven coordinates: org.apache.camel:camel-metrics
         * 
         * Syntax: <code>metrics:metricsType:metricsName</code>
         * 
         * Path parameter: metricsType (required)
         * Type of metrics
         * The value can be one of: gauge, counter, histogram, meter, timer
         * 
         * Path parameter: metricsName (required)
         * Name of metrics
         */
        default MetricsEndpointBuilder metrics(String path) {
            return MetricsEndpointBuilderFactory.metrics(path);
        }
    }
    /**
     * Metrics (camel-metrics)
     * To collect various metrics directly from Camel routes using the
     * DropWizard metrics library.
     * 
     * Category: monitoring
     * Since: 2.14
     * Maven coordinates: org.apache.camel:camel-metrics
     * 
     * Syntax: <code>metrics:metricsType:metricsName</code>
     * 
     * Path parameter: metricsType (required)
     * Type of metrics
     * The value can be one of: gauge, counter, histogram, meter, timer
     * 
     * Path parameter: metricsName (required)
     * Name of metrics
     */
    static MetricsEndpointBuilder metrics(String path) {
        class MetricsEndpointBuilderImpl extends AbstractEndpointBuilder implements MetricsEndpointBuilder, AdvancedMetricsEndpointBuilder {
            public MetricsEndpointBuilderImpl(String path) {
                super("metrics", path);
            }
        }
        return new MetricsEndpointBuilderImpl(path);
    }
}