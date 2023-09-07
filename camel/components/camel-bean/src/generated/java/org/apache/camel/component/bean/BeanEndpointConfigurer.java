/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.bean;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class BeanEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        BeanEndpoint target = (BeanEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cache": target.setCache(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "method": target.setMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "scope": target.setScope(property(camelContext, org.apache.camel.BeanScope.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "parameters": target.setParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

