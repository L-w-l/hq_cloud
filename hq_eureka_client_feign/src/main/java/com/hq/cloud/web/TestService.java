package com.hq.cloud.web;

import com.hq.cloud.service.TestApi;
import feign.Feign;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.feign.support.ResponseEntityDecoder;
import org.springframework.cloud.netflix.feign.support.SpringDecoder;
import org.springframework.cloud.netflix.feign.support.SpringMvcContract;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Lwl
 * @create: create in 1:00 2017-12-29
 * @Modified By:
 */
@RestController
public class TestService {

    private TestApi computeClient;

    private static final String SERVER_NAME = "eureka.client";

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/gethello/{name}", method = RequestMethod.GET)
    public String getHello(@PathVariable("name") String name) {
        Feign.Builder feignBuilder= Feign.builder().decoder(new ResponseEntityDecoder(new SpringDecoder(new ObjectFactory<HttpMessageConverters>(){
            @Override
            public HttpMessageConverters getObject() throws BeansException {
                return new HttpMessageConverters();
            }
        }))).contract(new SpringMvcContract());
        computeClient = feignBuilder.target(TestApi.class,discoveryClient.getInstances(SERVER_NAME).get(0).getUri().toString());
        return computeClient.testHello(name);
    }
}
