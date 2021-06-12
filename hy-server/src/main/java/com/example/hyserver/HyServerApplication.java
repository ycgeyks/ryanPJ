package com.example.hyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class HyServerApplication {

	public static void main(String[] args) {

//		SpringApplication.run(HyServerApplication.class, args);
		new SpringApplicationBuilder(HyServerApplication.class).properties("spring.config.location=classpath:/abc.properties").run(args);
	}

}
