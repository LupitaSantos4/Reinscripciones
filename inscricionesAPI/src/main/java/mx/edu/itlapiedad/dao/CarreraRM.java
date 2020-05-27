package mx.edu.itlapiedad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.edu.itlapiedad.models.Carrera;

public class CarreraRM implements RowMapper<Carrera> {
	
	@Override
	public Carrera mapRow(ResultSet rs, int rowNum) throws SQLException {
		Carrera carrera = new Carrera();
		carrera.setId_carrera(rs.getInt("id_carrera"));
		carrera.setNombre_ca(rs.getString("nombre_ca"));
		carrera.setCreditos_ca(rs.getInt("creditos_ca"));
		
		return carrera;
	}

}
