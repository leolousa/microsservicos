package com.example.api2.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/recurso2")
public class ExemploResource {

	@GetMapping
    public String imprime(){
        return "Testando recurso 2 da API 2";
    }
}
