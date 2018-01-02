package com.hq.cloud.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: Lwl
 * @create: create in 0:18 2017-12-29
 * @Modified By:
 */
public interface TestApi {

    @RequestMapping(value="/testhello/{name}", method= RequestMethod.GET)
    String testHello(@PathVariable("name") String name);
}