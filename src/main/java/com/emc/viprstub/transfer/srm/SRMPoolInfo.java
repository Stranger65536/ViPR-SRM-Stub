/*
 * Copyright 1994-2018 EMC Corporation. All rights reserved.
 */
package com.emc.viprstub.transfer.srm;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.google.common.base.MoreObjects;

import java.util.List;

public class SRMPoolInfo {
    private static final String NAME = "name";
    private static final String UTILIZATION = "utilization";
    private static final String RESPONSE_TIME = "responseTime";
    private static final String TOTAL_IOPS = "totalIOPS";
    private static final String USED_CAPACITY = "usedCapacity";
    private static final String DISKS = "disks";

    private final String name;
    private final Double utilization;
    private final Double responseTime;
    private final Double totalIOPS;
    private final Double usedCapacity;
    private final List<DiskInfo> disks;

    public SRMPoolInfo(
            final String name,
            final Double utilization,
            final Double responseTime,
            final Double totalIOPS,
            final Double usedCapacity,
            final List<DiskInfo> disks) {
        this.name = name;
        this.utilization = utilization;
        this.responseTime = responseTime;
        this.totalIOPS = totalIOPS;
        this.usedCapacity = usedCapacity;
        this.disks = disks;
    }

    @JsonGetter(NAME)
    public String getName() {
        return name;
    }

    @JsonGetter(UTILIZATION)
    public Double getUtilization() {
        return utilization;
    }

    @JsonGetter(RESPONSE_TIME)
    public Double getResponseTime() {
        return responseTime;
    }

    @JsonGetter(TOTAL_IOPS)
    public Double getTotalIOPS() {
        return totalIOPS;
    }

    @JsonGetter(USED_CAPACITY)
    public Double getUsedCapacity() {
        return usedCapacity;
    }

    @JsonGetter(DISKS)
    public List<DiskInfo> getDisks() {
        return disks;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("utilization", utilization)
                .add("responseTime", responseTime)
                .add("totalIOPS", totalIOPS)
                .add("usedCapacity", usedCapacity)
                .add("disks", disks)
                .toString();
    }
}
