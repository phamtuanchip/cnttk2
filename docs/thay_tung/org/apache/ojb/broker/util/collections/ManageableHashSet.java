package org.apache.ojb.broker.util.collections;

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

import org.apache.ojb.broker.ManageableCollection;
import org.apache.ojb.broker.PersistenceBroker;
import org.apache.ojb.broker.PersistenceBrokerException;

import java.util.HashSet;
import java.util.Iterator;

/**
 * is a utility class. provides a HashSet that addionally implements
 * the ManageableCollection interface. This class may be used
 * as a type for collection attributes.
 *
 * @author <a href="mailto:thma@apache.org">Thomas Mahler<a>
 * @version $Id: ManageableHashSet.java,v 1.7.2.1 2005/12/21 22:28:15 tomdz Exp $
 */
public class ManageableHashSet extends HashSet implements ManageableCollection
{
    /**
     * add a single Object to the Collection. This method is used during reading Collection elements
     * from the database. Thus it is is save to cast anObject to the underlying element type of the
     * collection.
     */
    public void ojbAdd(Object anObject)
    {
        super.add(anObject);
    }

    /**
     * adds a Collection to this collection. Used in reading Extents from the Database.
     * Thus it is save to cast otherCollection to this.getClass().
     */
    public void ojbAddAll(ManageableCollection otherCollection)
    {
        super.addAll((ManageableHashSet) otherCollection);
    }

    public void afterStore(PersistenceBroker broker) throws PersistenceBrokerException
    {
        //do nothing
    }

    /**
     * returns an Iterator over all elements in the collection. Used during store and delete Operations.
     * If the implementor does not return an iterator over ALL elements, OJB cannot store and delete all elements properly.
     *
     */
    public Iterator ojbIterator()
    {
        return super.iterator();
    }
}
