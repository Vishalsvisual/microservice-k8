package com.service.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@SpringBootApplication
public class ServiceOneApplication {

	public static void main(String... args) {
		SpringApplication.run(ServiceOneApplication.class, args);
	}

}

@RestController
class TestRestController{

	@GetMapping()
	public ResponseEntity<String> test(){

		return ResponseEntity.ok("tested successfully.");
	}
}
