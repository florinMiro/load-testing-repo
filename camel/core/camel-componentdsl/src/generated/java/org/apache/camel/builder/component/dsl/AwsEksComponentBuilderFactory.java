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
import org.apache.camel.component.aws.eks.EKSComponent;

/**
 * The aws-eks is used for managing Amazon EKS
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AwsEksComponentBuilderFactory {

    /**
     * AWS EKS (camel-aws-eks)
     * The aws-eks is used for managing Amazon EKS
     * 
     * Category: cloud,management
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-aws-eks
     */
    static AwsEksComponentBuilder awsEks() {
        return new AwsEksComponentBuilderImpl();
    }

    /**
     * Builder for the AWS EKS component.
     */
    interface AwsEksComponentBuilder extends ComponentBuilder<EKSComponent> {
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsEksComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
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
        default AwsEksComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The region in which EKS client needs to work.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsEksComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsEksComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
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
        default AwsEksComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The AWS EKS default configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.eks.EKSConfiguration</code>
         * type.
         * 
         * Group: advanced
         */
        default AwsEksComponentBuilder configuration(
                org.apache.camel.component.aws.eks.EKSConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
    }

    class AwsEksComponentBuilderImpl
            extends
                AbstractComponentBuilder<EKSComponent>
            implements
                AwsEksComponentBuilder {
        @Override
        protected EKSComponent buildConcreteComponent() {
            return new EKSComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "accessKey": ((EKSComponent) component).setAccessKey((java.lang.String) value); return true;
            case "lazyStartProducer": ((EKSComponent) component).setLazyStartProducer((boolean) value); return true;
            case "region": ((EKSComponent) component).setRegion((java.lang.String) value); return true;
            case "secretKey": ((EKSComponent) component).setSecretKey((java.lang.String) value); return true;
            case "basicPropertyBinding": ((EKSComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "configuration": ((EKSComponent) component).setConfiguration((org.apache.camel.component.aws.eks.EKSConfiguration) value); return true;
            default: return false;
            }
        }
    }
}