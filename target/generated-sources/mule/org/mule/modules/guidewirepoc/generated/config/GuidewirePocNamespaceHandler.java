
package org.mule.modules.guidewirepoc.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/guidewire-poc</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-05T01:53:42+01:00", comments = "Build UNNAMED.2793.f49b6c7")
public class GuidewirePocNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(GuidewirePocNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [guidewire-poc] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [guidewire-poc] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config", new GuidewirePOCConnectorConnectorConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("claims-tracking-inbound-service-string", new ClaimsTrackingInboundServiceStringDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("claims-tracking-inbound-service-string", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("claims-tracking-inbound-service-pojo", new ClaimsTrackingInboundServicePojoDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("claims-tracking-inbound-service-pojo", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("poc-claim-service", new PocClaimServiceDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("poc-claim-service", "@Processor", ex);
        }
    }

}
