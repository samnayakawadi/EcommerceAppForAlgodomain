package com.algodomain.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@RestController
public class EcommerceApplication {

	@GetMapping("/")
	public String ecommerceWelcomeMessage() {
		return "Welcome to Ecommerce App";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

}
