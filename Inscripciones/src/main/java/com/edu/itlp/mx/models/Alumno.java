package com.edu.itlp.mx.models;

public class Alumno {
	
	int nocontrol;
	String nombre;
	String genero;
	int creditos_totales;
	int id_carrera;
	
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(int nocontrol, String nombre, String genero, int creditos_totales, int id_carrera) {
		super();
		this.nocontrol = nocontrol;
		this.nombre = nombre;
		this.genero = genero;
		this.creditos_totales = creditos_totales;
		this.id_carrera = id_carrera;
	}

	public int getNocontrol() {
		return nocontrol;
	}

	public void setNocontrol(int nocontrol) {
		this.nocontrol = nocontrol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getCreditos_totales() {
		return creditos_totales;
	}

	public void setCreditos_totales(int creditos_totales) {
		this.creditos_totales = creditos_totales;
	}

	public int getId_carrera() {
		return id_carrera;
	}

	public void setId_carrera(int id_carrera) {
		this.id_carrera = id_carrera;
	}
	
	

}
