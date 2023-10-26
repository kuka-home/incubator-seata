/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.seata.saga.engine.pcext.handlers;


import io.seata.saga.engine.exception.EngineExecutionException;
import io.seata.saga.engine.pcext.StateHandler;
import io.seata.saga.engine.pcext.utils.ParallelContextHolder;
import io.seata.saga.proctrl.ProcessContext;

/**
 * JoinState handler
 *
 * @author ptyin
 */
public class JoinStateHandler implements StateHandler {
    @Override
    public void process(ProcessContext context) throws EngineExecutionException {
        ParallelContextHolder parallelContextHolder = ParallelContextHolder.getCurrent(context);
        parallelContextHolder.complete();
    }
}