package com.mlorenzo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mlorenzo.repositorio.PersonaRepositorio;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class PersonaControlador {
	
	@Autowired
	private PersonaRepositorio personaRepositorio;

	@GetMapping
	public String mostrarPersonas(Model model) {
		log.info("Ejecutando el controlador MVC");
		
		model.addAttribute("personas", personaRepositorio.findAll());
		
		return "index";
	}
}
