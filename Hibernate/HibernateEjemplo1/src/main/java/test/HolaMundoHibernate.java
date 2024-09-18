package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import mx.com.gm.domain.Persona;

public class HolaMundoHibernate {

	public static void main(String args[]) {
		
		// Este lenguaje(HQL - Hibernate Query Language) se aplica sobre las clases entidad o de persistencia y no sobre las tablas de la base de datos
		String hql = "SELECT p from Persona p";
		
		// Creamos el Entity Manager Factory a partir de nuestra unidad de persistencia "HibernatePU" definida en el archivo de configuración "persistence.xml"
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
		
		// Creamos el Entity Manager a partir del Entity Manager Factory anterior
		EntityManager em = emf.createEntityManager();
		
		// Creamos la consulta a la base de datos
		TypedQuery<Persona> query = em.createQuery(hql, Persona.class);
		
		// Ejecutamos la consulta en la base de datos
		List<Persona> personas = query.getResultList();
		
		for(Persona p: personas)
			System.out.println("Persona: " + p);
		
		// Cerramos el Entity Manager
		em.close();
	}
}
