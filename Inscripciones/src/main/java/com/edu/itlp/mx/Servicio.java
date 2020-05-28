package com.edu.itlp.mx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.edu.itlp.mx.models.*;
import com.edu.itlp.mx.dao.*;

@RestController
@RequestMapping("/inscripcion")

public class Servicio {
	@Autowired
	InscripcionesDAO repositorio;
	
    @GetMapping("/carreras/{id_carrera}")
     public Carrera buscarCarrera(@PathVariable int id_carrera) {
    	return repositorio.buscarCarrera(id_carrera);
    }

    @GetMapping("/alumnos/carreras/{idcarrera}")
     public Alumno buscarAlumno(@PathVariable int idcarrera) {
    	return repositorio.buscarAlumno(idcarrera);
    }
}
