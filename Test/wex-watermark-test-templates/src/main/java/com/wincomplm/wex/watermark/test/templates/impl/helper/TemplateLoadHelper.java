package com.wincomplm.wex.watermark.test.templates.impl.helper;

import com.wincomplm.wex.kernel.api.invoke.WexInvoker;
import com.wincomplm.wex.security.commons.impl.WexAdminCheckAccess;

/**
 *
 * @author simon
 */
public class TemplateLoadHelper {
    
    public static TemplateLoadHelper instance = new TemplateLoadHelper();
    private static final String TARGET_WEX = "com.wincomplm.wex-watermark-adv";

    public void loadTemplates() throws Exception {
        //WexAdminCheckAccess.instance.checkAccess();
        WexInvoker.invoke(TARGET_WEX,"methods.addTemplates",this.getClass());
    }
     
    public void removeTemplates() throws Exception {
        //WexAdminCheckAccess.instance.checkAccess();
        WexInvoker.invoke(TARGET_WEX,"methods.removeTemplates",this.getClass());
    }   
}
