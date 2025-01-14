package org.apache.ojb.broker.core;

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

/**
 * @author <a href="mailto:thma@apache.org">Thomas Mahler<a>
 * @version $Id: PersistenceBrokerConfiguration.java,v 1.4.2.3 2005/12/21 22:25:01 tomdz Exp $
 */
public interface PersistenceBrokerConfiguration
{
    public Class getObjectCacheClass();

    public Class getPersistentFieldClass();

    public String getRepositoryFilename();

    public Class getPersistenceBrokerClass();

    public int getSqlInLimit();
}
