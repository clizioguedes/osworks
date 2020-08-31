package com.algaworks.osworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OsworksApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsworksApiApplication.class, args);
	}

}
