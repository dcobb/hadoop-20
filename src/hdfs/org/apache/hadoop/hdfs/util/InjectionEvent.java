/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hdfs.util;

/** 
 * Enumeration of all injection events.
 * When defining new events, please PREFIX the name 
 * with the supervised class.
 * 
 * Please see InjectionHandler.
 */
public enum InjectionEvent {
  
  FSIMAGE_STARTING_SAVE_NAMESPACE,
  FSIMAGE_CREATING_SAVER_THREADS,
  FSIMAGE_STARTING_SAVER_THREAD,
  FSIMAGE_SN_CLEANUP,
  FSIMAGE_CANCEL_REQUEST_RECEIVED,
  
  FSEDIT_LOG_WRITE_END_LOG_SEGMENT,
  
  FSNAMESYSTEM_CLOSE_DIRECTORY,
  FSNAMESYSTEM_STOP_LEASEMANAGER,
  
  LEASEMANAGER_CHECKLEASES,

  STANDBY_CANCELLED_EXCEPTION_THROWN,
  STANDBY_FELL_BEHIND,
  STANDBY_INSTANTIATE_INGEST, 
  STANDBY_QUIESCE_INGEST, 
  STANDBY_ENTER_CHECKPOINT, 
  STANDBY_EXIT_CHECKPOINT,
  STANDBY_EXIT_CHECKPOINT_EXCEPTION,
  STANDBY_BEFORE_SAVE_NAMESPACE, 
  STANDBY_BEFORE_PUT_IMAGE,
  STANDBY_BEFORE_ROLL_EDIT, 
  STANDBY_BEFORE_ROLL_IMAGE, 
  STANDBY_BEGIN_RUN, 
  STANDBY_EDITS_NOT_EXISTS,
  STANDBY_CREATE_INGEST_RUNLOOP,
  STANDBY_AFTER_DO_CHECKPOINT,
  STANDBY_CHECKPOINT_TRIGGER,
  STANDBY_VALIDATE_CREATE,
  STANDBY_VALIDATE_CREATE_FAIL,
  STANDBY_QUIESCE_INITIATED,
  STANDBY_QUIESCE_INTERRUPT,
  STANDBY_QUIESCE_INGEST_CKPT,
  STANDBY_RECOVER_STATE,
  STANDBY_JOURNAL_GETSTREAM,
  STANDBY_FAILOVER_INPROGRESS,

  INGEST_BEFORE_LOAD_EDIT,
  INGEST_READ_OP,
  INGEST_CLEAR_STANDBY_STATE,
  
  OFFERSERVICE_SCHEDULE_HEARTBEAT,
  OFFERSERVICE_SCHEDULE_BR,
  OFFERSERVICE_CLEAR_PRIMARY,
  OFFERSERVICE_START,
  
  AVATARNODE_CHECKEDITSTREAMS,
  AVATARNODE_SHUTDOWN,

  AVATARDATANODE_BEFORE_START_OFFERSERVICE1,
  AVATARDATANODE_START_OFFERSERVICE1,
  AVATARDATANODE_START_OFFERSERVICE2,

  TRANSFERFSIMAGE_GETFILESERVER0, 
  TRANSFERFSIMAGE_GETFILESERVER1, 
  TRANSFERFSIMAGE_GETFILESERVER2,

  SECONDARYNAMENODE_CHECKPOINT0, 
  SECONDARYNAMENODE_CHECKPOINT1,
  
  AVATARXEIVER_RUNTIME_FAILURE,

  NAMENODE_AFTER_CREATE_FILE,
  NAMENODE_STOP_CLIENT_RPC,

  NAMENODE_FSCK_START,

  AVATARZK_GET_REGISTRATION_TIME,
  AVATARZK_GET_PRIMARY_ADDRESS,

  DAFS_CHECK_FAILOVER,
  
  IMAGE_LOADER_CURRENT_START,
  IMAGE_LOADER_CURRENT_INTERRUPT,
  
  SAVE_NAMESPACE_CONTEXT_EXCEPTION,

  STANDBY_ENTER_SAFE_MODE
}
