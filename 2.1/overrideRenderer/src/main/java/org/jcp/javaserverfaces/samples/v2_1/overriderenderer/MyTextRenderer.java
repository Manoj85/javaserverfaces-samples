package org.jcp.javaserverfaces.samples.v2_1.overriderenderer;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.Renderer;

/*
 * See http://docs.oracle.com/javaee/6/javaserverfaces/2.1/docs/renderkitdocs/
 */
public class MyTextRenderer extends Renderer {

    @Override
    public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
    }

    @Override
    public void encodeChildren(FacesContext context, UIComponent component) throws IOException {
    }

    @Override
    public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
        ResponseWriter responseWriter = context.getResponseWriter();
        UIOutput output = (UIOutput) component;
        String value = "Let's be funny: " + output.getValue().toString();
        responseWriter.writeText(value, null);
    }
}
