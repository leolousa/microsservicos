package com.example.api1.resources;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="API Rest de Exemplo")
@RestController
@RequestMapping(value = "/recurso1")
public class ExemploResource {

	@ApiOperation(value="Retorna uma mensagem 1")
	@GetMapping
    public String imprime(){
        return "Testando método 1 do recurso 1 da API 1";
    }
	
	@ApiOperation(value="Retorna uma mensagem 2")
	@GetMapping("/{id}")
	public String imprime2() {
		return "Testando método 2 do recurso 1 da API 1";
	}
	
	@ApiOperation(value="Retorna uma mensagem 3")
	@DeleteMapping("/{id}")
	public String imprime3() {
		return "Testando método 3 do recurso 1 da API 1";
	}
}
