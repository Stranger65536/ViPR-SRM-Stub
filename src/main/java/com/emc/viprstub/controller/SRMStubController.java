/*
 * Copyright 1994-2018 EMC Corporation. All rights reserved.
 */
package com.emc.viprstub.controller;

import com.emc.viprstub.service.StubService;
import com.emc.viprstub.transfer.srm.SRMPoolInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.ALL_VALUE)
public class SRMStubController {
    private static final ObjectMapper JSON = new ObjectMapper();

    private final StubService stubService;

    @Autowired
    public SRMStubController(final StubService stubService) {
        this.stubService = stubService;
    }

    @ResponseBody
    @GetMapping("/info")
    public SRMPoolInfo info(@RequestParam("pool") final String poolName) {
        return stubService.getStoragePoolInfoByName(poolName);
    }
}
