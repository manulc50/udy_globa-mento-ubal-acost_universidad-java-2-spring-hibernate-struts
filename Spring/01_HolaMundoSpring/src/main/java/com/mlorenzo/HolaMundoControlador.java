package com.mlorenzo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HolaMundoControlador {

	@GetMapping
	public String inicio() {
		log.info("Ejecutando el controlador REST");
		log.debug("Más detalle del controlador");
		
		return "Hola Mundo con Spring Boot";
	}
}
