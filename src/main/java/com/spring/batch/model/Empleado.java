package com.spring.batch.model;

public class Empleado {

	private int id;
	private String nombre;
	private String apellido;
	private String email;
	
	public static String[] fields() {
		return new String[] { "id", "nombre", "apellido", "email" };
	}
	
	public Empleado() {
		
	}
	
	public Empleado(int id, String nombre, String apellido, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
}
