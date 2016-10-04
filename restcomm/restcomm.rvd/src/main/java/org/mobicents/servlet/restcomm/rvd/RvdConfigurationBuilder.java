/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2014, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 */

package org.mobicents.servlet.restcomm.rvd;

import org.mobicents.servlet.restcomm.rvd.configuration.RestcommConfig;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author otsakir@gmail.com - Orestis Tsakiridis
 */
public class RvdConfigurationBuilder {
    private URI restcommBaseUri;
    private RestcommConfig restcommConfig;

    public RvdConfigurationBuilder() {
    }

    public RvdConfigurationBuilder setRestcommConfig(RestcommConfig restcommConfig) {
        this.restcommConfig = restcommConfig;
        return this;
    }

    public RvdConfigurationBuilder setRestcommBaseUri(String uriString) {
        try {
            this.restcommBaseUri = new URI(uriString);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public RvdConfiguration build() {
        RvdConfiguration instance = new RvdConfiguration(null, null,restcommConfig,null,restcommBaseUri);
        return instance;
    }
}