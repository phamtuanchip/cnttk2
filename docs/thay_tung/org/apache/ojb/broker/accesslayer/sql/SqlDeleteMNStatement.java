package org.apache.ojb.broker.accesslayer.sql;

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

import org.apache.ojb.broker.util.logging.Logger;

/**
 * Model an DELETE Statement for M:N indirection table
 *
 * @author <a href="mailto:jbraeuchi@hotmail.com">Jakob Braeuchi</a>
 * @version $Id: SqlDeleteMNStatement.java,v 1.8.2.1 2005/12/21 22:23:44 tomdz Exp $
 */
public class SqlDeleteMNStatement extends SqlMNStatement
{
    /**
     * Constructor for SqlInsertMNStatement.
     * @param table
     * @param columns
     */
    public SqlDeleteMNStatement(String table, String[] columns, Logger logger)
    {
        super(table, columns, logger);
    }

    /**
     * @see org.apache.ojb.broker.accesslayer.sql.SqlStatement#getStatement()
     */
    public String getStatement()
    {
        StringBuffer stmt = new StringBuffer(1024);

        stmt.append("DELETE FROM ");
        appendTable(getTable(), stmt);
        appendWhereClause(stmt, getColumns());
        return stmt.toString();
    }

}
