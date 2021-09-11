
package com.wincomplm.wex.watermark.test.templates.impl.bootstrap;

import com.wincomplm.wex.kernel.impl.bootstrap.IWexBootstrap;
import com.wincomplm.wex.kernel.impl.manager.IWexKernelPackage;
import com.wincomplm.wex.system.impl.scan.WexScanner;
import com.wincomplm.wex.watermark.test.templates.impl.helper.TemplateLoadHelper;

/**
 *
 * @author Nassim Bouayad-Agha
 */
public class WexBootstrap implements IWexBootstrap {

    @Override
    public void initialize(IWexKernelPackage wex) throws Exception {
        WexScanner.scan(wex, "com.wincomplm.wex.watermark.test.templates");
        TemplateLoadHelper.instance.loadTemplates();

    }

    @Override
    public void terminate(IWexKernelPackage wex) throws Exception {
        TemplateLoadHelper.instance.removeTemplates();

    }

}
