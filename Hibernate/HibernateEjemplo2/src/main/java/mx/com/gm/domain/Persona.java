package mx.com.gm.domain;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Clase entidad o de persistencia "Persona" que está relacionada con la tabla "personas" de la base de datos


@Entity
@Table(name = "personas")
public class Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3789534387531614857L;
	
	@Column(name = "id_persona")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Con este tipo de estrategia, JPA, cuando persista una entidad en la tabla correspondiente de la base de datos, no enviará el valor del id, ya que asume que la columna correspondiente al id es auto generada
	private Integer id;
	
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	
	public Persona() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", telefono=" + telefono + "]";
	}

}
