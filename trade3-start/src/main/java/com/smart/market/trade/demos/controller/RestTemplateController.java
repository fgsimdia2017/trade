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
 package com.smart.market.trade.demos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class RestTemplateController {
    @Value("${url.path}")
    private String path;
    @Value("${agent.url}")
    private String agentUrl;
    @Value("${common.test}")
    private String common;

    @GetMapping("/call/echo/{message}")
    public String callEcho(@PathVariable String message) {
        return "";
    }
    @PostConstruct
    public void init(){
        System.err.println(path);
        System.err.println("--------------------");
        System.err.println(agentUrl);
        System.err.println("--------------------");
        System.err.println(common);
        System.err.println("--------------------");

    }
}
