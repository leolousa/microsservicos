package com.example.api1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * API modelo utilizando a arquitetura de microserviços.
 * @author Leonardo Baiocchi
 * @see https://coderef.com.br/arquitetura-de-microservices-com-spring-cloud-e-spring-boot-parte-5-971bc068fe70
 */
@SpringBootApplication
@EnableEurekaClient
public class Api1Application {

	public static void main(String[] args) {
		SpringApplication.run(Api1Application.class, args);
	}
}
