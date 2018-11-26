package com.example.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * Aplicação Config Server (Servidor de Configuração), que tem o objetivo de
 * centralizar toda a configuração da rede de microserviços em um só lugar.
 * 
 * @author Leonardo Baiocchi
 * @see https://coderef.com.br/arquitetura-de-microservices-com-spring-cloud-e-spring-boot-parte-2-ff03d8d45dba
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverApplication.class, args);
	}
}
