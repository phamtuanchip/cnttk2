package org.apache.ojb.otm;

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

import org.apache.ojb.otm.kit.SimpleKit;
import org.apache.ojb.otm.lock.wait.LockWaitStrategy;

/**
 * @author <a href="mailto:olegnitz@apache.org">Oleg Nitz</a>
 *
 */
public class TestKit extends SimpleKit
{

    private static TestKit _instance;

    /**
     * Constructor for SimpleKit.
     */
    protected TestKit()
    {
        super();
    }

    public static TestKit getTestInstance()
    {
        if (_instance == null)
        {
            _instance = new TestKit();
        }
        return _instance;
    }

    /**
    * This allows to test different LockWaitStrategies
    */
    public void setLockWaitStrategy(LockWaitStrategy lockWaitStrategy)
    {
        _lockWaitStrategy = lockWaitStrategy;
    }

}
