package com.example.acme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
public class AcmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcmeApplication.class, args);
	}

}

@RestController
class AcmeController {

	@GetMapping("/")
	public String helloWorld() {
		return new String("Hello Spring Boot & GitHub Actions!");
	}
	

}