package mx.edu.itlapiedad.models;

public class Alumnos {
	int id_alumno;
	String nombre_al;
	String nocontrol;
	String contrasena;
	int carrera_id;
	

	
	
	public Alumnos() {
		super();
	}

	public Alumnos(int id_alumno, String nombre_al, String nocontrol, String contrasena, int carrera_id) {
		super();
		this.id_alumno = id_alumno;
		this.nombre_al = nombre_al;
		this.nocontrol = nocontrol;
		this.contrasena = contrasena;
		this.carrera_id = carrera_id;
	}

	//ALUMNOOOOOOO
	
	public int getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}

	public String getNombre_al() {
		return nombre_al;
	}
	
	public void setNombre_al(String nombre_al) {
		this.nombre_al = nombre_al;
	}

	public String getNocontrol() {
		return nocontrol;
	}

	public void setNocontrol(String nocontrol) {
		this.nocontrol = nocontrol;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public int getCarrera_id() {
		return carrera_id;
	}

	public void setCarrera_id(int carrera_id) {
		this.carrera_id = carrera_id;
	}
	
	
	
}
