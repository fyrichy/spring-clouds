package com.richy.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * @descr：RestTemplateConfig
 * @author： Richy
 * @time：下午3:48:26
 */
@Configuration
public class RestTemplateConfig {

	@Bean
	@LoadBalanced//负载均衡
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	/*@Bean
	public IRule selfRule() {
		//return new RoundRobinRule();//轮询方式，也是默认的方式
		return new RandomRule();//随机方式
	}*/
}
