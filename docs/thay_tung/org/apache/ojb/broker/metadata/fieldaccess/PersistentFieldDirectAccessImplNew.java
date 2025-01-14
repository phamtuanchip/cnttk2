package org.apache.ojb.broker.metadata.fieldaccess;

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
 * This {@link PersistentField} implementation
 * is the high-speed version of the access strategies.
 * <br/>
 * It does not cooperate with an AccessController,
 * but accesses the fields directly. This implementation persistent
 * attributes don't need getters and setters
 * and don't have to be declared public or protected. Only the the
 * metadata field names have to match the class fields.
 *
 * @deprecated replaced by {@link PersistentFieldDirectImpl}.
 * @version $Id: PersistentFieldDirectAccessImplNew.java,v 1.3.2.3 2005/12/21 22:26:41 tomdz Exp $
 */
public class PersistentFieldDirectAccessImplNew extends PersistentFieldDirectImpl
{
}
