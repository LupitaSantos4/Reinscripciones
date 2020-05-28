package com.edu.itlp.mx.models;

public class Carrera {
	
	int id;
	String nombre;
	String clave_materia;
	
	public Carrera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carrera(int id, String nombre, String clave_materia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.clave_materia = clave_materia;
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

	public String getClave_materia() {
		return clave_materia;
	}

	public void setClave_materia(String clave_materia) {
		this.clave_materia = clave_materia;
	}
	
	

}
