package com.hq.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author: Lwl
 * @create: create in 16:43 2017-12-28
 * @Modified By:
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerApplication {

    /**
     * {application}/{profile}[/{label}]
     * {application}-{profile}.yml
     * {label}/{application}-{profile}.yml
     * {application}-{profile}.properties
     * {label}/{application}-{profile}.properties
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
