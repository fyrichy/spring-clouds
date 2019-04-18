package com.richy.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudServerConfig10086_APP {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServerConfig10086_APP.class, args);
		System.out.println("SpringCloudServerConfig10086_APP Start Successfully...");
	}
}
