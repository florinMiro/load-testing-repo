/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.dataformat.xstream;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JsonDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        JsonDataFormat dataformat = (JsonDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "prettyprint":
        case "prettyPrint": dataformat.setPrettyPrint(property(camelContext, boolean.class, value)); return true;
        case "permissions": dataformat.setPermissions(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

