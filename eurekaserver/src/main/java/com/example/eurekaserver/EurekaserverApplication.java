package com.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * Aplicação do tipo Service Registry utilizando o Netflix Eureka Server, que será responsável por gerenciar o status e a localização dos microserviços na rede.
 * A aplicação também é responsável pelo Load Balance das APIs e roda no endereço <b>http://localhost:9091</b>. O arquivo de configuração está no repositório GIT e se
 * chama <b>eureka-server.yml</b>.
 * 
 * @author Leonardo Baiocchi
 *
 * @see https://coderef.com.br/arquitetura-de-microservices-com-spring-cloud-e-spring-boot-parte-3-b84b3dce13a0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverApplication.class, args);
	}
}
