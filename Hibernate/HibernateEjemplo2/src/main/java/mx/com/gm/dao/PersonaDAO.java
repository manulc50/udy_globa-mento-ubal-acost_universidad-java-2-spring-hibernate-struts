package mx.com.gm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import mx.com.gm.domain.Persona;

public class PersonaDAO {
	
	private EntityManager em;
	
	public PersonaDAO() {
		// Creamos el Entity Manager Factory a partir de nuestra unidad de persistencia "HibernatePU" definida en el archivo de configuración "persistence.xml"
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
		
		// Creamos el Entity Manager a partir del Entity Manager Factory anterior
		em = emf.createEntityManager();
	}
	
	public void listar() {
		// Este lenguaje(HQL - Hibernate Query Language) se aplica sobre las clases entidad o de persistencia y no sobre las tablas de la base de datos
		String hql = "SELECT p from Persona p";
		
		// Creamos la consulta a la base de datos
		TypedQuery<Persona> query = em.createQuery(hql, Persona.class);
		
		// Ejecutamos la consulta en la base de datos
		List<Persona> personas = query.getResultList();
		
		personas.forEach(System.out::println); // Versión simplificada de la expresión "p -> System.out.println(p)"
	}
	
	public Persona buscarPersonaPorId(Integer id) {
		return em.find(Persona.class, id);
	}
	
	public void insertar(Persona persona) {
		try {
			em.getTransaction().begin(); // Empieza la transacción
			em.persist(persona);
			em.getTransaction().commit(); // Finaliza la transacción
		}
		catch(Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback(); // En caso de error durante la transacción, hacemos un rollback
		}
	}
	
	public void modificar(Persona persona) {
		try {
			em.getTransaction().begin(); // Empieza la transacción
			em.merge(persona);
			em.getTransaction().commit(); // Finaliza la transacción
		}
		catch(Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback(); // En caso de error durante la transacción, hacemos un rollback
		}
	}
	
	public void eliminar(Persona persona) {
		try {
			em.getTransaction().begin(); // Empieza la transacción
			em.remove(persona);
			em.getTransaction().commit(); // Finaliza la transacción
		}
		catch(Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback(); // En caso de error durante la transacción, hacemos un rollback
		}
	}
	
	public void cerrarEM() {
		if(em != null)
			em.close();
	}

}
