package com.example.api2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Api2Application {

	public static void main(String[] args) {
		SpringApplication.run(Api2Application.class, args);
	}
}
