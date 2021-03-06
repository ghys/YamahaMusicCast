/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.yamahamusiccast.internal;

/**
 * The {@link yamahamusiccastConfiguration} class contains fields mapping thing configuration parameters.
 *
 * @author Lennert Coopman - Initial contribution
 */

public class YamahaMusiccastConfiguration {

    /**
     * Sample configuration parameter. Replace with your own.
     */
    public Integer config_refreshInterval;
    public String config_host;
    public boolean config_FullLogs;
    public boolean config_ActionRefresh;

    public boolean config_Zone2;
    public boolean config_Zone3;
    public boolean config_Zone4;
}
