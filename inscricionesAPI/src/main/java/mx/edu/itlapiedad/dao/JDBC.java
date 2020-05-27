package mx.edu.itlapiedad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.models.Alumnos;
import mx.edu.itlapiedad.models.Carrera;
import mx.edu.itlapiedad.models.Docente;
import mx.edu.itlapiedad.models.Materia;

@Repository
public class JDBC implements DAO {
	
	@Autowired
	JdbcTemplate conexion;
	
	String sql;
	
	// ------------------------------ ALUMNOS -----------------------------------------------------------
	@Override
	public List <Alumnos> consultaralum() {
		sql = "SELECT * from alumno";
		return conexion.query(sql, new AlumnoRM());
	}
	
	@Override
	public Alumnos buscaralum(int id_alumno) {
		sql = "SELECT * from alumno WHERE id_alumno = ?";
		return conexion.queryForObject(sql, new AlumnoRM(), id_alumno);
	}
	
	@Override
	public Alumnos sesion(int id_alumno) {
		sql = "SELECT id_alumno, nocontrol, contrasena FROM alumno WHERE id_alumno = ?";
		return conexion.queryForObject(sql, new AlumnoRM(), id_alumno);
	}
	
	
	// ------------------------------------------ CARRERAS ------------------------------------------------
	@Override
	public List<Carrera> consultarcarreras() {
		sql = "SELECT * FROM carrera";
		return conexion.query(sql, new CarreraRM());
	}
	
	@Override
	public Carrera buscarcarrera(int id_carrera) {
		sql = "SELECT * FROM carrera WHERE id_carrera = ?";
		return conexion.queryForObject(sql, new CarreraRM(), id_carrera);
		
	}

	// --------------------------------------- DOCENTES --------------------------------------------------
	
	@Override
	public List<Docente> consultardocentes() {
		sql = "SELECT * FROM docente";
		return conexion.query(sql, new DocenteRM());
	}
	
	@Override
	public Docente buscardocente (int id_docente) {
		sql = "SELECT * FROM docente where id_docente = ?";
		return conexion.queryForObject(sql, new DocenteRM(), id_docente);
	}
	
	// ----------------------------------------- MATERIAS --------------------------------------------------
	
	@Override
	public List<Materia> consultarmaterias() {
		sql = "SELECT * FROM materia";
		return conexion.query(sql, new MateriaRM());
	}
	
	@Override
	public Materia buscarmateria (int id_materia) {
		sql = "SELECT * FROM materia WHERE id_materia = ?";
		return conexion.queryForObject(sql, new MateriaRM(), id_materia);
	}
}
