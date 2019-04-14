package com.richy.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

/**
 * @descr：Ribbon自定义负载均衡算法
 * @author： Richy
 * @time：下午3:54:52
 */
@Configuration
public class RibbonSelfRule {

	@Bean
	public IRule myRule() {
		return new FiveEveryServiceRule();
	}
	
}
