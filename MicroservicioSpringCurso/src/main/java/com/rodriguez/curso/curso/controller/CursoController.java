package com.rodriguez.curso.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.co.rodriguez.mdbspringboot.MicroservicioSpringCommons.controller.CommonController;
import com.rodriguez.common.usuario.models.entity.Alumno;
import com.rodriguez.curso.curso.models.entity.Curso;
import com.rodriguez.curso.curso.service.CursoService;

@RestController
public class CursoController extends CommonController<Curso, CursoService> {
	
	private CursoService cursoService;

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Curso curso, @PathVariable Long id) {
        
		Optional<Curso> ob = cursoService.findById(id);

        if (ob.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        Curso cursoBd = ob.get();
        cursoBd.setNombre(curso.getNombre());
        cursoBd.setNombre(curso.getCreateAt());
       
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoService.save(cursoBd));
    }
	
	@PutMapping("/{id}/asignar-alumno")
	public ResponseEntity<?> asignarAlumno(@RequestBody List<Alumno> alumno, @PathVariable Long id) {
		
		Optional<Curso> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		Curso cursoBd = ob.get();
		alumno.forEach( a -> {
			cursoBd.addAlumnos(a);
		});
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cursoBd));
	}
	
	@PutMapping("/{id}/eliminar-alumno")
	public ResponseEntity<?> asignarAlumno(@RequestBody Alumno alumno, @PathVariable Long id) {
		
		Optional<Curso> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		Curso cursoBd = ob.get();
		
		cursoBd.removeAlumnos(alumno);
		
	    return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
