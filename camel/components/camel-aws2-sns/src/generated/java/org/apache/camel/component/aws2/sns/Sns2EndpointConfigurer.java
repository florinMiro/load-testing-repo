/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.sns;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Sns2EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Sns2Endpoint target = (Sns2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "amazonsnsclient":
        case "amazonSNSClient": target.getConfiguration().setAmazonSNSClient(property(camelContext, software.amazon.awssdk.services.sns.SnsClient.class, value)); return true;
        case "autocreatetopic":
        case "autoCreateTopic": target.getConfiguration().setAutoCreateTopic(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "kmsmasterkeyid":
        case "kmsMasterKeyId": target.getConfiguration().setKmsMasterKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "messagestructure":
        case "messageStructure": target.getConfiguration().setMessageStructure(property(camelContext, java.lang.String.class, value)); return true;
        case "policy": target.getConfiguration().setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": target.getConfiguration().setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "queueurl":
        case "queueUrl": target.getConfiguration().setQueueUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "region": target.getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "serversideencryptionenabled":
        case "serverSideEncryptionEnabled": target.getConfiguration().setServerSideEncryptionEnabled(property(camelContext, boolean.class, value)); return true;
        case "subject": target.getConfiguration().setSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "subscribesnstosqs":
        case "subscribeSNStoSQS": target.getConfiguration().setSubscribeSNStoSQS(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

