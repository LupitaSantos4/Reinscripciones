package mx.edu.itlapiedad.dao;

import java.util.List;

import mx.edu.itlapiedad.models.Alumnos;
import mx.edu.itlapiedad.models.Carrera;
import mx.edu.itlapiedad.models.Docente;
import mx.edu.itlapiedad.models.Materia;

public interface DAO {

	Alumnos buscaralum(int id_alumno);

	Alumnos sesion(int id_alumno);

	List<Alumnos> consultaralum();

	List<Carrera> consultarcarreras();

	Carrera buscarcarrera(int id_carrera);

	List<Docente> consultardocentes();

	Docente buscardocente(int id);

	List<Materia> consultarmaterias();

	Materia buscarmateria(int id);

	

	

}
