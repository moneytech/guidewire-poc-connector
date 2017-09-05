
package org.mule.modules.guidewirepoc.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.guidewirepoc.GuidewirePOCConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>GuidewirePOCConnectorProcessAdapter</code> is a wrapper around {@link GuidewirePOCConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-05T01:53:42+01:00", comments = "Build UNNAMED.2793.f49b6c7")
public class GuidewirePOCConnectorProcessAdapter
    extends GuidewirePOCConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<GuidewirePOCConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, GuidewirePOCConnectorCapabilitiesAdapter> getProcessTemplate() {
        final GuidewirePOCConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,GuidewirePOCConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, GuidewirePOCConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, GuidewirePOCConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
