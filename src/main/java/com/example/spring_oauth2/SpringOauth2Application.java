package com.example.spring_oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.security.Principal;

@SpringBootApplication
@RestController

public class SpringOauth2Application {
@GetMapping("/")
	public String message(Principal principal) {
		return "Hi "+principal.getName()+" welcome to SpringCloudOauth2ExampleApplication";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringOauth2Application.class, args);
	}

}
