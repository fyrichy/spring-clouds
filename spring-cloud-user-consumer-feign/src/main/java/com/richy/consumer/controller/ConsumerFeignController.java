package com.richy.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.richy.consumer.service.ConsumerFeignService;

@Controller
@RequestMapping("/user")
public class ConsumerFeignController {

	@Autowired
	private ConsumerFeignService consumerFeignService;
	
	@RequestMapping("/findList")
	@ResponseBody
	public Object findList(){
		return consumerFeignService.findList();
	}
}
