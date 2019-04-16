package com.richy.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//将服务注册到Eureka中
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.richy.consumer"})
@ComponentScan("com.richy.consumer")
public class ConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeignApplication.class, args);
		System.out.println("ConsumerFeignApplication Start Successfully...");
	}
}
