package com.richy.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//将本服务注册到eureka注册中心
@EnableEurekaClient
@EnableDiscoveryClient
public class UserServiceApplication001 {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication001.class, args);
		System.out.println("UserServiceApplication001 Start Application...");
	}
}
