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

package org.apache.shardingsphere.proxy.frontend.spi;

import org.apache.shardingsphere.db.protocol.codec.DatabasePacketCodecEngine;
import org.apache.shardingsphere.proxy.backend.session.ConnectionSession;
import org.apache.shardingsphere.proxy.frontend.authentication.AuthenticationEngine;
import org.apache.shardingsphere.proxy.frontend.command.CommandExecuteEngine;
import org.apache.shardingsphere.proxy.frontend.context.FrontendContext;
import org.apache.shardingsphere.spi.type.typed.StatefulTypedSPI;

/**
 * Database protocol frontend engine.
 */
public interface DatabaseProtocolFrontendEngine extends StatefulTypedSPI {
    
    /**
     * Set database version.
     * 
     * @param databaseVersion database version
     */
    default void setDatabaseVersion(String databaseVersion) {
    }
    
    /**
     * Get frontend context.
     *
     * @return frontend context
     */
    FrontendContext getFrontendContext();
    
    /**
     * Get database packet codec engine.
     * 
     * @return database packet codec engine
     */
    DatabasePacketCodecEngine<?> getCodecEngine();
    
    /**
     * Get authentication engine.
     * 
     * @return authentication engine
     */
    AuthenticationEngine getAuthenticationEngine();
    
    /**
     * Get command execute engine.
     * 
     * @return command execute engine
     */
    CommandExecuteEngine getCommandExecuteEngine();
    
    /**
     * Release resource.
     * 
     * @param connectionSession connection session
     */
    void release(ConnectionSession connectionSession);
    
    /**
     * Handle exception.
     *
     * @param connectionSession connection session
     */
    void handleException(ConnectionSession connectionSession);
}
