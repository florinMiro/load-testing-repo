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
import org.apache.camel.component.springldap.SpringLdapComponent;

/**
 * The spring-ldap component allows you to perform searches in LDAP servers
 * using filters as the message payload.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface SpringLdapComponentBuilderFactory {

    /**
     * Spring LDAP (camel-spring-ldap)
     * The spring-ldap component allows you to perform searches in LDAP servers
     * using filters as the message payload.
     * 
     * Category: spring,ldap
     * Since: 2.11
     * Maven coordinates: org.apache.camel:camel-spring-ldap
     */
    static SpringLdapComponentBuilder springLdap() {
        return new SpringLdapComponentBuilderImpl();
    }

    /**
     * Builder for the Spring LDAP component.
     */
    interface SpringLdapComponentBuilder
            extends
                ComponentBuilder<SpringLdapComponent> {
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
        default SpringLdapComponentBuilder lazyStartProducer(
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
        default SpringLdapComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
    }

    class SpringLdapComponentBuilderImpl
            extends
                AbstractComponentBuilder<SpringLdapComponent>
            implements
                SpringLdapComponentBuilder {
        @Override
        protected SpringLdapComponent buildConcreteComponent() {
            return new SpringLdapComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "lazyStartProducer": ((SpringLdapComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((SpringLdapComponent) component).setBasicPropertyBinding((boolean) value); return true;
            default: return false;
            }
        }
    }
}