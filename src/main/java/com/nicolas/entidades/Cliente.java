package com.nicolas.entidades;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="cliente")
public class Cliente {
	
	// Identificador único del cliente (clave primaria)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	// Nombre del cliente
	@NotBlank(message = "El campo nombre es obligatorio")
	@Size(min = 2, max = 20, message = "El nombre debe tener entre 2 y 20 caracteres")
	@Column(name="nombre")
	private String nombre;
	
	// Apellido del cliente
	@NotBlank(message = "El campo apellido es obligatorio")
	@Size(min = 2, max = 20, message = "El apellido debe tener entre 2 y 20 caracteres")
	@Column(name="apellido")
	private String apellido;
	
	// Correo electrónico del cliente
	@Email(message = "El email debe tener un formato válido")
	@Column(name="email")
	private String email;

	// Constructor vacío requerido por JPA
	public Cliente() {		
	}
	
	// Constructor que inicializa nombre, apellido y email
	public Cliente(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	// Devuelve el identificador del cliente
	public int getId() {
		return id;
	}

	// Establece el identificador del cliente
	public void setId(int id) {
		this.id = id;
	}

	// Devuelve el nombre del cliente
	public String getNombre() {
		return nombre;
	}

	// Establece el nombre del cliente
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Devuelve el apellido del cliente
	public String getApellido() {
		return apellido;
	}

	// Establece el apellido del cliente
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// Devuelve el correo electrónico del cliente
	public String getEmail() {
		return email;
	}

	// Establece el correo electrónico del cliente
	public void setEmail(String email) {
		this.email = email;
	}

	// Devuelve una representación en cadena de la entidad Cliente
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + "]";
	}
	
}