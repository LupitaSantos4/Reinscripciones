package mx.edu.itlapiedad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.edu.itlapiedad.models.Docente;

public class DocenteRM implements RowMapper<Docente> {

	@Override
	public Docente mapRow(ResultSet rs, int rowNum) throws SQLException {
		Docente docente = new Docente();
		docente.setId_docente(rs.getInt("id_docente"));
		docente.setNombre_do(rs.getString("nombre_do"));
		return docente;
	}
}
