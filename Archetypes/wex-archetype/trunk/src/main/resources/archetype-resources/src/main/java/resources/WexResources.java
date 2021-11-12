/*
 * Copyright (c) 2021 Wincom Consulting S.L.
 * All Rights Reserved.
 * This source is subject to the terms of a software license agreement.
 * You shall not disclose such confidential information and shall use it only in accordance with the terms and conditions of the license agreement.
 */
package ${package}.resources;

import com.wincomplm.wex.kernel.impl.annotations.WexComponent;
import wt.util.resource.RBEntry;
import wt.util.resource.RBNameException;
import wt.util.resource.RBUUID;
import wt.util.resource.WTListResourceBundle;

@WexComponent(uid = "${package}.resources.WexResources", description = "Resource bundle")
@RBUUID("${package}.resources.WexResources")
@RBNameException
public class WexResources extends WTListResourceBundle {

    /*
        @RBEntry("Example")
        public static final String P0 = "${package}.[your-action-name].description";
        @RBEntry("Example")
        public static final String P1 = "${package}.[your-action-name].tooltip";
        @RBEntry("Example")
        public static final String p3 = "${package}.[your-action-name].activetooltip";
    */

}
