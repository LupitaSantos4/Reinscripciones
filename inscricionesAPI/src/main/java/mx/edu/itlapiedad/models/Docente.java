package mx.edu.itlapiedad.models;

public class Docente {
	int id_docente;
	String nombre_do;
	
	public Docente() {
		super();
	}

	public Docente(int id_docente, String nombre_do) {
		super();
		this.id_docente = id_docente;
		this.nombre_do = nombre_do;
		
	}

	public int getId_docente() {
		return id_docente;
	}

	public void setId_docente(int id_docente) {
		this.id_docente = id_docente;
	}

	public String getNombre_do() {
		return nombre_do;
	}

	public void setNombre_do(String nombre_do) {
		this.nombre_do = nombre_do;
	}
	
	
	}
