package com.edu.itlp.mx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.edu.itlp.mx.models.*;

@Repository
public class InscripcionesJDBC implements InscripcionesDAO{

	@Autowired
	JdbcTemplate conexion;
	
	String sql;
	
	@Override
	public Carrera buscarCarrera(int id_carrera) {
		sql= "SELECT * FROM carrera where idCarrera = ?";
		return conexion.queryForObject(sql, new CarreraRM(), id_carrera);
	}
	
	@Override
	public Alumno buscarAlumno(int idcarrera) {
		sql= "SELECT * FROM alumno a "
	    + " JOIN carrera c ON c.idCarrera = a.idCarrera "
		+ " WHERE a.idCarrera = ? ";
		return conexion.queryForObject(sql, new AlumnoRM(), idcarrera);
	}
}
