
package ${package}.impl.bootstrap;

import com.wincomplm.wex.kernel.impl.bootstrap.IWexBootstrap;
import com.wincomplm.wex.kernel.impl.manager.IWexKernelPackage;
import com.wincomplm.wex.system.impl.scan.WexScanner;
import ${package}.impl.helper.TemplateLoadHelper;

/**
 *
 * @author Nassim Bouayad-Agha
 */
public class WexBootstrap implements IWexBootstrap {

    @Override
    public void initialize(IWexKernelPackage wex) throws Exception {
        WexScanner.scan(wex, "${package}");
    }

    @Override
    public void terminate(IWexKernelPackage wex) throws Exception {
        TemplateLoadHelper.instance.removeTemplates();

    }

}
