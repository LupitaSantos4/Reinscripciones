package mx.edu.itlapiedad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.edu.itlapiedad.models.Materia;

public class MateriaRM implements RowMapper<Materia> {
	
	@Override
	public Materia mapRow(ResultSet rs, int rowNum) throws SQLException {
		Materia materia = new Materia();
		materia.setId_materia(rs.getInt("id_materia"));
		materia.setNombre_ma(rs.getString("nombre_ma"));
		materia.setCreditos_ma(rs.getInt("creditos_ma"));
		materia.setDocente_id(rs.getInt("docente_id"));
		materia.setCarrera_id(rs.getInt("carrera_id"));
		return materia;
	}

}
