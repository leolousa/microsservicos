package com.example.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * Aplicação do tipo Gateway/Proxy utilizando o Netflix Zuul, que será responsável por rotear as APIs registradas no Eureka Server na rede.
 * 
 * @author Leonardo Baiocchi
 *
 * @see https://emmanuelneri.com.br/2018/05/02/criando-proxy-de-apis-com-spring-cloud-zuul-e-eureka/
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
