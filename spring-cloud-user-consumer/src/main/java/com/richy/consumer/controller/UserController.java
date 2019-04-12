package com.richy.consumer.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@RequestMapping("/user")
@Controller
public class UserController {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private DiscoveryClient client;
	
	private final String USER_USERVICE = "user-service";
	
	@RequestMapping("/findList")
	@ResponseBody
	public Object findList(){
		List<ServiceInstance> list = client.getInstances(USER_USERVICE);
		ServiceInstance instance = list.get(0);
		String baseUrl = "http://"+instance.getHost() + ":" + instance.getPort()+"/user/findList";
		return restTemplate.getForEntity(baseUrl, String.class).getBody();
	}
}
