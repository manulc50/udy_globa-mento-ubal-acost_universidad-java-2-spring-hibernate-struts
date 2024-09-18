package com.mlorenzo.controlador;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mlorenzo.dominio.Persona;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class InicioControlador {
	
	@Value("${index.saludo}")
	private String saludo;

	@GetMapping
	public String inicio(Model model) {
		log.info("Ejecutando el controlador MVC");
		log.debug("Más detalle del controlador");
		
		model.addAttribute("mensaje", "Mensaje con Thymeleaf");
		model.addAttribute("saludo", saludo);
		
		var persona1 = new Persona();
		persona1.setNombre("Juan");
		persona1.setApellido("Pérez");
		persona1.setEmail("jperez@email.com");
		persona1.setTelefono("55443322");
		
		model.addAttribute("persona", persona1);
		
		var persona2 = new Persona();
		persona2.setNombre("Karla");
		persona2.setApellido("Gómez");
		persona2.setEmail("kgomez@email.com");
		persona2.setTelefono("13229900");
		
		model.addAttribute("personas", Arrays.asList(persona1, persona2));
		//model.addAttribute("personas", List.of());
		
		return "index";
	}
}
