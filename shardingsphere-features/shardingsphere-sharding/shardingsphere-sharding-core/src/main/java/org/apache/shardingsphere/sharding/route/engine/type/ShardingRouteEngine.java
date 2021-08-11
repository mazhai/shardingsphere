/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.sharding.route.engine.type;

import org.apache.shardingsphere.infra.route.context.RouteContext;
import org.apache.shardingsphere.sharding.rule.ShardingRule;

import java.util.HashSet;
import java.util.Set;

/**
 * Sharding route engine.
 */
public interface ShardingRouteEngine {
    public static final Set<String> SYSTEM_TABLES = new HashSet<>();

    /**
     * 返回系统表
     * @return
     */
    static Set<String> getSystemTables() {
        if (SYSTEM_TABLES.isEmpty()) {
            SYSTEM_TABLES.add("CHARACTER_SETS");
            SYSTEM_TABLES.add("COLLATIONS");
            SYSTEM_TABLES.add("COLLATION_CHARACTER_SET_APPLICABILITY");
            SYSTEM_TABLES.add("COLUMNS");
            SYSTEM_TABLES.add("COLUMN_PRIVILEGES");
            SYSTEM_TABLES.add("ENGINES");
            SYSTEM_TABLES.add("EVENTS");
            SYSTEM_TABLES.add("FILES");
            SYSTEM_TABLES.add("GLOBAL_STATUS");
            SYSTEM_TABLES.add("GLOBAL_VARIABLES");
            SYSTEM_TABLES.add("KEY_COLUMN_USAGE");
            SYSTEM_TABLES.add("OPTIMIZER_TRACE");
            SYSTEM_TABLES.add("PARAMETERS");
            SYSTEM_TABLES.add("PARTITIONS");
            SYSTEM_TABLES.add("PLUGINS");
            SYSTEM_TABLES.add("PROCESSLIST");
            SYSTEM_TABLES.add("PROFILING");
            SYSTEM_TABLES.add("REFERENTIAL_CONSTRAINTS");
            SYSTEM_TABLES.add("ROUTINES");
            SYSTEM_TABLES.add("SCHEMATA");
            SYSTEM_TABLES.add("SCHEMA_PRIVILEGES");
            SYSTEM_TABLES.add("SESSION_STATUS");
            SYSTEM_TABLES.add("SESSION_VARIABLES");
            SYSTEM_TABLES.add("SQL_FILTER_INFO");
            SYSTEM_TABLES.add("STATISTICS");
            SYSTEM_TABLES.add("TABLES");
            SYSTEM_TABLES.add("TABLESPACES");
            SYSTEM_TABLES.add("TABLE_CONSTRAINTS");
            SYSTEM_TABLES.add("TABLE_PRIVILEGES");
            SYSTEM_TABLES.add("TRIGGERS");
            SYSTEM_TABLES.add("USER_PRIVILEGES");
            SYSTEM_TABLES.add("VIEWS");
            SYSTEM_TABLES.add("TABLE_STATISTICS");
            SYSTEM_TABLES.add("INDEX_STATISTICS");
            SYSTEM_TABLES.add("IO_STATISTICS");
            SYSTEM_TABLES.add("PERF_STATISTICS");
            SYSTEM_TABLES.add("INNODB_LOCKS");
            SYSTEM_TABLES.add("INNODB_TRX");
            SYSTEM_TABLES.add("INNODB_SYS_DATAFILES");
            SYSTEM_TABLES.add("INNODB_FT_CONFIG");
            SYSTEM_TABLES.add("THREADPOOL_INFO");
            SYSTEM_TABLES.add("INNODB_CMP");
            SYSTEM_TABLES.add("INNODB_FT_BEING_DELETED");
            SYSTEM_TABLES.add("INNODB_CMP_RESET");
            SYSTEM_TABLES.add("INNODB_CMP_PER_INDEX");
            SYSTEM_TABLES.add("INNODB_CMPMEM_RESET");
            SYSTEM_TABLES.add("INNODB_FT_DELETED");
            SYSTEM_TABLES.add("INNODB_BUFFER_PAGE_LRU");
            SYSTEM_TABLES.add("INNODB_LOCK_WAITS");
            SYSTEM_TABLES.add("INNODB_TEMP_TABLE_INFO");
            SYSTEM_TABLES.add("INNODB_PURGE_FILES");
            SYSTEM_TABLES.add("INNODB_SYS_TABLES");
            SYSTEM_TABLES.add("INNODB_SYS_FIELDS");
            SYSTEM_TABLES.add("INNODB_CMP_PER_INDEX_RESET");
            SYSTEM_TABLES.add("INNODB_BUFFER_PAGE");
            SYSTEM_TABLES.add("INNODB_SYS_INDEXES");
            SYSTEM_TABLES.add("INNODB_FT_INDEX_TABLE");
            SYSTEM_TABLES.add("INNODB_FT_INDEX_CACHE");
            SYSTEM_TABLES.add("INNODB_TABLESPACE_MASTER_KEY");
            SYSTEM_TABLES.add("INNODB_METRICS");
            SYSTEM_TABLES.add("INNODB_SYS_FOREIGN_COLS");
            SYSTEM_TABLES.add("INNODB_CMPMEM");
            SYSTEM_TABLES.add("INNODB_BUFFER_POOL_STATS");
            SYSTEM_TABLES.add("INNODB_SYS_COLUMNS");
            SYSTEM_TABLES.add("INNODB_SYS_FOREIGN");
            SYSTEM_TABLES.add("INNODB_SYS_TABLESTATS");
            SYSTEM_TABLES.add("INNODB_FT_DEFAULT_STOPWORD");
            SYSTEM_TABLES.add("INNODB_SYS_TABLESPACES");
            SYSTEM_TABLES.add("INNODB_SYS_VIRTUAL");
        }
        return SYSTEM_TABLES;
    }

    static boolean isSystemTable(String each){
        return getSystemTables().contains(each.toUpperCase());
    }

    /**
     * Route.
     *
     * @param routeContext route context
     * @param shardingRule sharding rule
     */
    void route(RouteContext routeContext, ShardingRule shardingRule);
}
