package com.richy.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.richy.userservice.mapper.UserMapper;
import com.richy.userservice.pojo.User;

@Controller
@RequestMapping("/user")
public class UserController {

	private final String USER_SERVICE = "user-service";
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping("/findList")
	@ResponseBody
	public List<User> findList(){
		return userMapper.findList();
	}
	
	@RequestMapping("/findById/{id}")
	@ResponseBody
	public User findById(@PathVariable Integer id) {
		return userMapper.findById(id);
	}
	
	@RequestMapping("/discovery")
	@ResponseBody
	public Object discovery() {
		List<String> list = client.getServices();
		System.out.println("list:"+list);
		List<ServiceInstance> servList = client.getInstances(USER_SERVICE);
		for(ServiceInstance element:servList) {
			System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"+ element.getUri());
		}
		return this.client;
	}
}
