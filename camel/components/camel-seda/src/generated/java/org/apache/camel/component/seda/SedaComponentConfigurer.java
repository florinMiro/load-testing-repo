/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.seda;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SedaComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SedaComponent target = (SedaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "defaultblockwhenfull":
        case "defaultBlockWhenFull": target.setDefaultBlockWhenFull(property(camelContext, boolean.class, value)); return true;
        case "defaultdiscardwhenfull":
        case "defaultDiscardWhenFull": target.setDefaultDiscardWhenFull(property(camelContext, boolean.class, value)); return true;
        case "defaultoffertimeout":
        case "defaultOfferTimeout": target.setDefaultOfferTimeout(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "defaultqueuefactory":
        case "defaultQueueFactory": target.setDefaultQueueFactory(property(camelContext, org.apache.camel.component.seda.BlockingQueueFactory.class, value)); return true;
        case "queuesize":
        case "queueSize": target.setQueueSize(property(camelContext, int.class, value)); return true;
        default: return false;
        }
    }

}

