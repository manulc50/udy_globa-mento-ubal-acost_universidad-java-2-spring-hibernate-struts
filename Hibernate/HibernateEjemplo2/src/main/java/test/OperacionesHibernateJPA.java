package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class OperacionesHibernateJPA {
	
	public static void main(String[] args) {
		PersonaDAO personaDAO = new PersonaDAO();
		
		personaDAO.listar();
		
		//Persona persona = new Persona();
		Persona persona = personaDAO.buscarPersonaPorId(5);
		System.out.println("Persona encontrada: " + persona);
		
		//persona.setNombre("Carlos");
		//persona.setApellido("Esparza");
		//persona.setEmail("cesparza@gmail.com");
		//persona.setTelefono("55443322");
		
		//personaDAO.insertar(persona);
		//personaDAO.modificar(persona);
		personaDAO.eliminar(persona);
		
		personaDAO.listar();
		
		personaDAO.cerrarEM();
	}

}
