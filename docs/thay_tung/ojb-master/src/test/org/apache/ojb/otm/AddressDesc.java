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

import java.io.Serializable;

public class AddressDesc implements Serializable
{

    private int id;
    private String desc;
    private int personId;
    private Person person;
    private int addressId;
    private Address address;

    public AddressDesc()
    {
    }

    public AddressDesc(String desc, Address address)
    {
        this.desc = desc;
        this.address = address;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public int getPersonId()
    {
        return personId;
    }

    public void setPersonId(int personId)
    {
        this.personId = personId;
    }

    public Person getPerson()
    {
        return person;
    }

    public void setPerson(Person person)
    {
        this.person = person;
    }

    public int getAddressId()
    {
        return addressId;
    }

    public void setAddressId(int addressId)
    {
        this.addressId = addressId;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

}
