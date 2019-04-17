package com.richy.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulGateway100Application {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGateway100Application.class, args);
		System.out.println("ZuulGateway100Application Start Successfully...");
	}
}
