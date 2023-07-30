package com.service.three;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ServiceThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceThreeApplication.class, args);
	}

}



@RestController
class TestRestController{

	@GetMapping()
	public ResponseEntity<String> test(){

		return ResponseEntity.ok("tested successfully.");
	}
}