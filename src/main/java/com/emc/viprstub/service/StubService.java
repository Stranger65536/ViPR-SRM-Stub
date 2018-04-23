/*
 * Copyright 1994-2018 EMC Corporation. All rights reserved.
 */
package com.emc.viprstub.service;

import com.emc.viprstub.transfer.srm.SRMPoolInfo;

public interface StubService {
    SRMPoolInfo getStoragePoolInfoByName(final String poolName);
}
