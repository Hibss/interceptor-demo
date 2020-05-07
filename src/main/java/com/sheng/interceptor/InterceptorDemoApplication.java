package com.sheng.interceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InterceptorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterceptorDemoApplication.class, args);
	}

	@GetMapping("/home")
	public String home(){
		return "home";
	}
	@GetMapping("/exclude")
	public String exclude(){
		return "exclude";
	}
	@GetMapping("/")
	public String index(){
		return "index";
	}

}
