package com.richy.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//×¢²áµ½eureka×¢²áÖÐÐÄ
@EnableEurekaClient
@EnableDiscoveryClient
public class UserServiceApplication003 {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication003.class, args);
		System.out.println("UserServiceApplication003 Start Application...");
	}
}
