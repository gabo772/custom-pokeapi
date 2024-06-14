package com.backend.spring.custompokeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CustomPokeapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomPokeapiApplication.class, args);
	}

}
