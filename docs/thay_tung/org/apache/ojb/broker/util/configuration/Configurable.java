package org.apache.ojb.broker.util.configuration;

/* Copyright 2002-2005 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * This interface defines the behaviour of a configurable Object.
 * It provides a single callback method configure(Configuration pConfig).
 * This method is invoked by a <code>Configurator</code>.
 * Implementors of this method evaluate the Configuration object pConfig
 * to perform the proper configuration of the current instance.
 *
 * @author Thomas Mahler
 * @version $Id: Configurable.java,v 1.5.2.1 2005/12/21 22:28:15 tomdz Exp $
 */
public interface Configurable
{

    /**
     * configure an object using the Configuration pConfig
     * @param pConfig the Configuration object used to configure current instance
     * @throws ConfigurationException
     */
    void configure(Configuration pConfig) throws ConfigurationException;

}
