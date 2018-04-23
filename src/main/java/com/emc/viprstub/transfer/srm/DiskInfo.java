/*
 * Copyright 1994-2018 EMC Corporation. All rights reserved.
 */
package com.emc.viprstub.transfer.srm;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.google.common.base.MoreObjects;

public class DiskInfo {
    private static final String NAME = "name";
    private static final String RESPONSE_TIME = "responseTime";
    private static final String UTILIZATION = "utilization";
    private static final String READ_IOPS = "readIOPS";
    private static final String WRITE_IOPS = "writeIOPS";

    private final String name;
    private final Double responseTime;
    private final Double utilization;
    private final Double readIOPS;
    private final Double writeIOPS;

    public DiskInfo(
            final String name,
            final Double responseTime,
            final Double utilization,
            final Double readIOPS,
            final Double writeIOPS) {
        this.name = name;
        this.responseTime = responseTime;
        this.utilization = utilization;
        this.readIOPS = readIOPS;
        this.writeIOPS = writeIOPS;
    }

    @JsonGetter(NAME)
    public String getName() {
        return name;
    }

    @JsonGetter(RESPONSE_TIME)
    public Double getResponseTime() {
        return responseTime;
    }

    @JsonGetter(UTILIZATION)
    public Double getUtilization() {
        return utilization;
    }

    @JsonGetter(READ_IOPS)
    public Double getReadIOPS() {
        return readIOPS;
    }

    @JsonGetter(WRITE_IOPS)
    public Double getWriteIOPS() {
        return writeIOPS;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("responseTime", responseTime)
                .add("utilization", utilization)
                .add("readIOPS", readIOPS)
                .add("writeIOPS", writeIOPS)
                .toString();
    }
}
