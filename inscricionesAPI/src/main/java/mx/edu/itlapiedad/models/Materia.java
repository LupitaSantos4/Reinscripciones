package mx.edu.itlapiedad.models;

public class Materia {
	int id_materia;
	String nombre_ma;
	int creditos_ma;
	int docente_id;
	int carrera_id;
	
	public Materia() {
		super();
	}

	public Materia(int id_materia, String nombre_ma, int creditos_ma, int docente_id) {
		super();
		this.id_materia = id_materia;
		this.nombre_ma = nombre_ma;
		this.creditos_ma = creditos_ma;
		this.docente_id = docente_id;
	}


	public int getId_materia() {
		return id_materia;
	}

	public void setId_materia(int id_materia) {
		this.id_materia = id_materia;
	}

	public String getNombre_ma() {
		return nombre_ma;
	}

	public void setNombre_ma(String nombre_ma) {
		this.nombre_ma = nombre_ma;
	}

	public int getCreditos_ma() {
		return creditos_ma;
	}

	public void setCreditos_ma(int creditos_ma) {
		this.creditos_ma = creditos_ma;
	}

	public int getDocente_id() {
		return docente_id;
	}

	public void setDocente_id(int docente_id) {
		this.docente_id = docente_id;
	}
	
	
}
