package mx.edu.itlapiedad.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.dao.DAO;
import mx.edu.itlapiedad.models.Alumnos;
import mx.edu.itlapiedad.models.Carrera;
import mx.edu.itlapiedad.models.Docente;
import mx.edu.itlapiedad.models.Materia;

@RestController
@RequestMapping("/hola")
public class Mensaje {
	
	@Autowired
	DAO repositorio;
	
	@GetMapping("ejemplo")
	public String enviarSaludo() {
		return "Hola Mundo!!";
	}
	
	// ------------------------------- ALUMNOS --------------------------------------------------
	@GetMapping("alumnos")
	public List<Alumnos> consultarAlumno() {
		return repositorio.consultaralum();
	}
	
	@GetMapping("alumnos/{id_alumno}")
	public Alumnos buscarAlumno(@PathVariable int id_alumno) {
		return repositorio.buscaralum(id_alumno);
	}
	
	@GetMapping("sesion/{id_alumno}")
	public Alumnos sesionAlumno(@PathVariable int id_alumno) {
		return repositorio.sesion(id_alumno);
	}
	
	// ----------------------------------- CARRERAS -----------------------------------------------
	@GetMapping("carreras")
	public List<Carrera> consultarCarreras() {
		return repositorio.consultarcarreras();
	}
	
	@GetMapping("carrera/{id_carrera}")
	public Carrera buscarCarreras(@PathVariable int id_carrera) {
		return repositorio.buscarcarrera(id_carrera);
	}
	
	// ---------------------------------- DOCENTES -----------------------------------------------
	@GetMapping("docentes")
	public List<Docente> consultarDocentes() {
		return repositorio.consultardocentes();
	}
	
	@GetMapping("docente/{id_docente}")
	public Docente buscarDocente(@PathVariable int id_docente) {
		return repositorio.buscardocente(id_docente);
	}
	
	// ----------------------------------- MATERIA ---------------------------------------------------
	@GetMapping("materias")
	public List<Materia> consultarMaterias() {
		return repositorio.consultarmaterias();
	}
	
	@GetMapping("materia/{id_materia}")
	public Materia buscarMateria(@PathVariable int id_materia) {
		return repositorio.buscarmateria(id_materia);
	}
}
