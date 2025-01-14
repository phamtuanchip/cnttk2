package org.apache.ojb.broker;

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
 * Base class for exceptions happening during persistence broker operations.
 *
 * @author Thomas Mahler
 * @version $Id: PersistenceBrokerException.java,v 1.9.2.2 2005/12/22 21:15:14 tomdz Exp $
 */
public class PersistenceBrokerException extends OJBRuntimeException
{
    /**
     * Creates a new exception instance.
     */
    public PersistenceBrokerException()
    {
        super();
    }

    /**
     * Creates a new exception instance.
     * 
     * @param msg The exception message
     */
    public PersistenceBrokerException(String msg)
    {
        super(msg);
    }

    /**
     * Creates a new exception instance.
     * 
     * @param cause The base exception
     */
    public PersistenceBrokerException(Throwable cause)
    {
        super(cause);
    }

    /**
     * Creates a new exception instance.
     * 
     * @param msg   The exception message
     * @param cause The base exception
     */
    public PersistenceBrokerException(String msg, Throwable cause)
    {
        super(msg, cause);
    }

    /**
     * Gets the original exception if any.
     * 
     * @return The source exception
     * @deprecated Use {@link #getCause()} instead
     */
    public Throwable getSourceException()
    {
        return getCause();
    }
}