package mx.edu.itlapiedad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.edu.itlapiedad.models.Alumnos;

public class AlumnoRM implements RowMapper<Alumnos> {
	
	@Override
	public Alumnos mapRow(ResultSet rs, int rowNum) throws SQLException {
		Alumnos alum = new Alumnos();
		alum.setId_alumno(rs.getInt("id_alumno"));
		alum.setNombre_al(rs.getString("nombre_al"));
		alum.setNocontrol(rs.getString("nocontrol"));
		alum.setContrasena(rs.getString("contrasena"));
		alum.setCarrera_id(rs.getInt("carrera_id"));
		
		return alum;
	}

}
