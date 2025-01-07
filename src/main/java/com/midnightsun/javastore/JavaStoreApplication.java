package com.midnightsun.javastore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaStoreApplication {

	@GetMapping("/")
	public String root() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaStoreApplication.class, args);
	}

}
