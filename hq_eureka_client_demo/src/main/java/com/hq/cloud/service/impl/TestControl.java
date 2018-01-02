package com.hq.cloud.service.impl;

import com.hq.cloud.service.TestApi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Lwl
 * @create: create in 0:18 2017-12-29
 * @Modified By:
 */
@RestController
public class TestControl implements TestApi {

    @Override
    public String testHello(@PathVariable("name")String name) {
        return "Hello world,"+name;
    }
}
