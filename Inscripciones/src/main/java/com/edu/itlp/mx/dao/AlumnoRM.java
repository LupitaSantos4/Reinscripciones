package com.edu.itlp.mx.dao;

import java.sql.SQLException;
import java.sql.ResultSet;
import org.springframework.jdbc.core.RowMapper;
import com.edu.itlp.mx.models.Alumno;

public class AlumnoRM implements RowMapper<Alumno>{

	@Override
	public Alumno mapRow(ResultSet rs, int rowNum)throws SQLException {
		Alumno alumno = new Alumno();
		alumno.setNocontrol(rs.getInt("nocontrol"));
		alumno.setNombre(rs.getString("nombre"));
		alumno.setGenero(rs.getString("genero"));
		alumno.setCreditos_totales(rs.getInt("creditos_totales"));
		alumno.setId_carrera(rs.getInt("idCarrera"));
		return alumno;
	}
}
