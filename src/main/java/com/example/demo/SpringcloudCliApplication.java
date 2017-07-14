package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringcloudCliApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringcloudCliApplication.class, args);
	}

	@Value("${server.port}")
	String port;
	@RequestMapping(value="/hi")
	public String sayhi(@RequestParam String name){
		return "im is"+name+"port is"+ port+"11113335554448888";
	}
}
