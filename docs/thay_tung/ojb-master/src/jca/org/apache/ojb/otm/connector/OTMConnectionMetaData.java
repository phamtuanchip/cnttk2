package org.apache.ojb.otm.connector;

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

import javax.resource.ResourceException;
import javax.resource.spi.ManagedConnectionMetaData;

/**
 *
 * @author <a href="mailto:mattbaird@yahoo.com">Matthew Baird<a>
 */

public class OTMConnectionMetaData implements ManagedConnectionMetaData
{

	private OTMJCAManagedConnection mc;

	public OTMConnectionMetaData(OTMJCAManagedConnection mc)
	{
		System.out.println("In OTMConnectionMetaData.constructor");
		this.mc = mc;
	}

	public String getEISProductName()
			throws ResourceException
	{
		Util.log("In OTMConnectionMetaData.getEISProductName");
		return "Apache OJB";
	}

	public String getEISProductVersion()
			throws ResourceException
	{
		Util.log("In OTMConnectionMetaData.getEISProductVersion");
		return "1.0";

	}

	public int getMaxConnections()
			throws ResourceException
	{
		Util.log("In OTMConnectionMetaData.getMaxConnections");
		return 50;	//MBAIRD: Remove this hardcoding.
	}

	public String getUserName()
			throws ResourceException
	{
		return mc.getUserName();
	}


}
