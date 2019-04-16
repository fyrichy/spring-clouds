package com.richy.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.richy.consumer.config.RibbonSelfRule;

@SpringBootApplication
@EnableDiscoveryClient
//Ribbon是客户端负载均衡
@EnableEurekaClient
//使用自定义负载均衡策略
@RibbonClient(name="user-service",configuration=RibbonSelfRule.class)
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
		System.out.println("ConsumerApplication Start Successfully...");
	}
	
	@Bean
	@LoadBalanced//负载均衡
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
