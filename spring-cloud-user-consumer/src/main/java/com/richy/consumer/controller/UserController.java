package com.richy.consumer.controller;



import org.springframework.beans.factory.annotation.Autowired;
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
	
	private final String USER_USERVICE = "http://user-service";
	
	@RequestMapping("/findList")
	@ResponseBody
	public Object findList(){
		String baseUrl = USER_USERVICE+"/user/findList";
		return restTemplate.getForEntity(baseUrl, String.class).getBody();
	}
}
