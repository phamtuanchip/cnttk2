package org.apache.ojb.broker.transaction.tm;

/* Copyright 2003-2005 The Apache Software Foundation
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

import org.apache.ojb.broker.transaction.tm.AbstractTransactionManagerFactory;

/**
 * Orion {@link javax.transaction.TransactionManager} lookup.
 *
 * @author andreas.bayer
 * @version $Id: OrionTransactionManagerFactory.java,v 1.1.2.1 2005/12/21 22:27:48 tomdz Exp $
 */
public class OrionTransactionManagerFactory extends AbstractTransactionManagerFactory
{
    private static final String[][] config = {{"Orion", "java:comp/UserTransaction", null}};

    /**
     * @see org.apache.ojb.broker.transaction.tm.AbstractTransactionManagerFactory#getLookupInfo
     */
    public String[][] getLookupInfo()
    {
        return config;
    }
}
