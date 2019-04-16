package com.richy.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//添加@FeignClient，指定服务提供者
@FeignClient(value="user-service")
public interface ConsumerFeignService {

	@RequestMapping(value="/user/findList",method=RequestMethod.GET)
	public Object findList();
	
	@RequestMapping(value="/user/findById/{id}",method=RequestMethod.GET)
	public Object findById(@PathVariable("id") Integer id);
}
