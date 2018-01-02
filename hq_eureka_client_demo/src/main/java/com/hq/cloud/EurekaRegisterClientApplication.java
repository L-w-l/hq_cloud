package com.hq.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: Lwl
 * @create: create in 0:16 2017-12-29
 * @Modified By:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class EurekaRegisterClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegisterClientApplication.class, args);
    }
}
