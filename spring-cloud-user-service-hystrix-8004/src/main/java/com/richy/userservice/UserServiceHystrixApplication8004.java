package com.richy.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//将服务注册到Eureka注册中心
@EnableDiscoveryClient//服务发现
@EnableCircuitBreaker//对Hystrix熔断机制的支持
public class UserServiceHystrixApplication8004 {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceHystrixApplication8004.class, args);
		System.out.println("UserServiceHystrixApplication8004 Start Successfully...");
	}
}
