package com.example.helloworldweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class HelloWorldWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldWebApplication.class, args);
	}

	@GetMapping
	String greet() {
		return "Hello World - V4";
	}
}
