package org.apache.ojb.ejb;

/* Copyright 2004-2005 The Apache Software Foundation
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

import junit.framework.Test;
import junit.framework.TestSuite;
import org.apache.ojb.ejb.pb.ArticleTestClient;
import org.apache.ojb.ejb.pb.PBClient;
import org.apache.ojb.ejb.pb.PersonArticleClient;
import org.apache.ojb.ejb.pb.StressTestClient;
import org.apache.ojb.ejb.pb.RollbackClient;

/**
 * The facade to all PB-api session bean test cases.
 *
 * @author <a href="mailto:armin@codeAuLait.de">Armin Waibel</a>
 * @version $Id: AllPBTests.java,v 1.1 2007-08-24 22:17:39 ewestfal Exp $
 */
public class AllPBTests
{
    /**
     * runs the suite in a junit.textui.TestRunner.
     */
    public static void main(String[] args)
    {
        String[] arr = {AllPBTests.class.getName()};
        junit.textui.TestRunner.main(arr);
    }

    /** build a TestSuite from all the TestCases in this package*/
    public static Test suite()
    {
        TestSuite suite = new TestSuite();
        suite.addTest(new TestSuite(PBClient.class));
        suite.addTest(new TestSuite(PersonArticleClient.class));
        suite.addTest(new TestSuite(ArticleTestClient.class));
        suite.addTest(new TestSuite(StressTestClient.class));
        suite.addTest(new TestSuite(RollbackClient.class));
        return suite;
    }
}
