package com.hq.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * spring启动文件
 * @title 
 * @filename Application.java
 * @author L-wl
 * @date 2017年8月15日 下午7:20:09
 * @version 1.0
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {


	/**
	 * 这里就是运行spring boot的入口 ， 右键运行就可以
	 */
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
    }

}
