package com.mlorenzo.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.mlorenzo.dominio.Persona;

public interface PersonaRepositorio extends CrudRepository<Persona, Integer> {

}
