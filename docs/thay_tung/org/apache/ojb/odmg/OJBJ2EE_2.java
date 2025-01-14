package org.apache.ojb.odmg;

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

import org.odmg.Implementation;

/**
 * Facade to the persistence ObjectServer system, returns an {@link Implementation}
 * interface instance for use in managed environments.
 *
 * @deprecated use {@link OJB#getInstance} with setting for 'ImplementationClass'
 *  declared in OJB properties file.
 * @version $Id: OJBJ2EE_2.java,v 1.12.2.1 2005/12/21 22:29:21 tomdz Exp $
 */
public class OJBJ2EE_2 extends OJB
{

}
