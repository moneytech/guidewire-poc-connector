
package org.mule.modules.guidewirepoc.generated.processors;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.debug.DebugInfoProvider;
import org.mule.api.debug.FieldDebugInfo;
import org.mule.api.debug.FieldDebugInfoFactory;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transformer.TransformerMessagingException;
import org.mule.util.ClassUtils;
import org.mule.util.TemplateParser;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-05T01:53:42+01:00", comments = "Build UNNAMED.2793.f49b6c7")
public class ClaimsTrackingInboundServicePojoMessageProcessorDebuggable
    extends ClaimsTrackingInboundServicePojoMessageProcessor
    implements DebugInfoProvider
{


    public ClaimsTrackingInboundServicePojoMessageProcessorDebuggable(String operationName) {
        super(operationName);
    }

    private boolean isConsumable(Object evaluate) {
        return (ClassUtils.isConsumable(evaluate.getClass())||Iterator.class.isAssignableFrom(evaluate.getClass()));
    }

    private Object getEvaluatedValue(MuleContext muleContext, MuleEvent muleEvent, String fieldName, Object field)
        throws NoSuchFieldException, TransformerException, TransformerMessagingException
    {
        Object evaluate = null;
        if (!(field == null)) {
            evaluate = this.evaluate(TemplateParser.createMuleStyleParser().getStyle(), muleContext.getExpressionManager(), muleEvent.getMessage(), field);
            Type genericType = this.getClass().getSuperclass().getDeclaredField(fieldName).getGenericType();
            if (!isConsumable(evaluate)) {
                evaluate = this.evaluateAndTransform(muleContext, muleEvent, genericType, null, field);
            }
        }
        return evaluate;
    }

    private FieldDebugInfo createDevKitFieldDebugInfo(String name, String friendlyName, Class type, Object value, MuleEvent muleEvent) {
        try {
            return FieldDebugInfoFactory.createFieldDebugInfo(friendlyName, type, getEvaluatedValue(muleContext, muleEvent, ("_"+name+"Type"), value));
        } catch (NoSuchFieldException e) {
            return FieldDebugInfoFactory.createFieldDebugInfo(friendlyName, type, e);
        } catch (TransformerMessagingException e) {
            return FieldDebugInfoFactory.createFieldDebugInfo(friendlyName, type, e);
        } catch (TransformerException e) {
            return FieldDebugInfoFactory.createFieldDebugInfo(friendlyName, type, e);
        }
    }

    @Override
    public List<FieldDebugInfo<?>> getDebugInfo(MuleEvent muleEvent) {
        List<FieldDebugInfo<?>> fieldDebugInfoList = new ArrayList<FieldDebugInfo<?>>();
        fieldDebugInfoList.add(createDevKitFieldDebugInfo("endpoint", "Endpoint", (java.lang.String.class), endpoint, muleEvent));
        fieldDebugInfoList.add(createDevKitFieldDebugInfo("message", "Message", (org.mule.api.MuleMessage.class), message, muleEvent));
        return fieldDebugInfoList;
    }

}