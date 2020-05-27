package mx.edu.itlapiedad.models;

public class Carrera {
	int id_carrera;
	String nombre_ca;
	int creditos_ca;
	
	public Carrera() {
		super();
	}
	
	public Carrera(int id_carrera, String nombre_ca, int creditos_ca) {
		super();
		this.id_carrera = id_carrera;
		this.nombre_ca = nombre_ca;
		this.creditos_ca = creditos_ca;
	}



	public int getId_carrera() {
		return id_carrera;
	}



	public void setId_carrera(int id_carrera) {
		this.id_carrera = id_carrera;
	}



	public String getNombre_ca() {
		return nombre_ca;
	}



	public void setNombre_ca(String nombre_ca) {
		this.nombre_ca = nombre_ca;
	}



	public int getCreditos_ca() {
		return creditos_ca;
	}



	public void setCreditos_ca(int creditos_ca) {
		this.creditos_ca = creditos_ca;
	}
	
	
}
