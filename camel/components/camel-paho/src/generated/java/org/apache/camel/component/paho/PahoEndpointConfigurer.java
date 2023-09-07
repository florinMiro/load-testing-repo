/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.paho;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class PahoEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        PahoEndpoint target = (PahoEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "automaticreconnect":
        case "automaticReconnect": target.getConfiguration().setAutomaticReconnect(property(camelContext, boolean.class, value)); return true;
        case "brokerurl":
        case "brokerUrl": target.getConfiguration().setBrokerUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "cleansession":
        case "cleanSession": target.getConfiguration().setCleanSession(property(camelContext, boolean.class, value)); return true;
        case "clientid":
        case "clientId": target.getConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.getConfiguration().setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "filepersistencedirectory":
        case "filePersistenceDirectory": target.getConfiguration().setFilePersistenceDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "keepaliveinterval":
        case "keepAliveInterval": target.getConfiguration().setKeepAliveInterval(property(camelContext, int.class, value)); return true;
        case "maxinflight":
        case "maxInflight": target.getConfiguration().setMaxInflight(property(camelContext, int.class, value)); return true;
        case "maxreconnectdelay":
        case "maxReconnectDelay": target.getConfiguration().setMaxReconnectDelay(property(camelContext, int.class, value)); return true;
        case "mqttversion":
        case "mqttVersion": target.getConfiguration().setMqttVersion(property(camelContext, int.class, value)); return true;
        case "persistence": target.getConfiguration().setPersistence(property(camelContext, org.apache.camel.component.paho.PahoPersistence.class, value)); return true;
        case "qos": target.getConfiguration().setQos(property(camelContext, int.class, value)); return true;
        case "retained": target.getConfiguration().setRetained(property(camelContext, boolean.class, value)); return true;
        case "serveruris":
        case "serverURIs": target.getConfiguration().setServerURIs(property(camelContext, java.lang.String.class, value)); return true;
        case "willpayload":
        case "willPayload": target.getConfiguration().setWillPayload(property(camelContext, java.lang.String.class, value)); return true;
        case "willqos":
        case "willQos": target.getConfiguration().setWillQos(property(camelContext, int.class, value)); return true;
        case "willretained":
        case "willRetained": target.getConfiguration().setWillRetained(property(camelContext, boolean.class, value)); return true;
        case "willtopic":
        case "willTopic": target.getConfiguration().setWillTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "client": target.setClient(property(camelContext, org.eclipse.paho.client.mqttv3.MqttClient.class, value)); return true;
        case "customwebsocketheaders":
        case "customWebSocketHeaders": target.getConfiguration().setCustomWebSocketHeaders(property(camelContext, java.util.Properties.class, value)); return true;
        case "executorservicetimeout":
        case "executorServiceTimeout": target.getConfiguration().setExecutorServiceTimeout(property(camelContext, int.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "httpshostnameverificationenabled":
        case "httpsHostnameVerificationEnabled": target.getConfiguration().setHttpsHostnameVerificationEnabled(property(camelContext, boolean.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "socketfactory":
        case "socketFactory": target.getConfiguration().setSocketFactory(property(camelContext, javax.net.SocketFactory.class, value)); return true;
        case "sslclientprops":
        case "sslClientProps": target.getConfiguration().setSslClientProps(property(camelContext, java.util.Properties.class, value)); return true;
        case "sslhostnameverifier":
        case "sslHostnameVerifier": target.getConfiguration().setSslHostnameVerifier(property(camelContext, javax.net.ssl.HostnameVerifier.class, value)); return true;
        case "username":
        case "userName": target.getConfiguration().setUserName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

