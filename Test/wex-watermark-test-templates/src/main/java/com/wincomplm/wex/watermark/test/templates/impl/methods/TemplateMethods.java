
package com.wincomplm.wex.watermark.test.templates.impl.methods;

import com.wincomplm.wex.kernel.impl.annotations.WexComponent;
import com.wincomplm.wex.kernel.impl.annotations.WexMethod;
import com.wincomplm.wex.watermark.test.templates.impl.helper.TemplateLoadHelper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nassim Bouayad-Agha
 */
@WexComponent(uid = "watermark-template-methods", description = "Wex Methods")
public class TemplateMethods  {
 
    
    @WexMethod(name = "load-templates", description = "Set templates in target wex")
    public void loadTemplates(HttpServletRequest request, HttpServletResponse response) throws Exception {
       TemplateLoadHelper.instance.loadTemplates();
    }
    
    @WexMethod(name = "remove-templates", description = "Remove templates in target wex")
    public void removeTemplates(HttpServletRequest request, HttpServletResponse response) throws Exception {
        TemplateLoadHelper.instance.removeTemplates();
    }    
}
