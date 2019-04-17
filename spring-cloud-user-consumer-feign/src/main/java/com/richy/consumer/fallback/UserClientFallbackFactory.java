package com.richy.consumer.fallback;

import org.springframework.stereotype.Component;

import com.richy.consumer.service.ConsumerFeignService;

import feign.hystrix.FallbackFactory;

@Component
public class UserClientFallbackFactory implements FallbackFactory<ConsumerFeignService>{

	@Override
	public ConsumerFeignService create(Throwable cause) {
		
		return new ConsumerFeignService() {
			
			@Override
			public Object findList() {
				return "服务降级，没有数据返回";
			}
			
			@Override
			public Object findById(Integer id) {
				return "服务降级，Hstrix一套择优方案，根据id查询不到";
			}
		};
	}

}
