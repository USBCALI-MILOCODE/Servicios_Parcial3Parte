package com.co.rodriguez.usuarios.MicroservicioUsuarios.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.co.rodriguez.mdbspringboot.MicroservicioSpringCommons.controller.CommonController;
import com.co.rodriguez.usuarios.MicroservicioUsuarios.entity.Alumno;
import com.co.rodriguez.usuarios.MicroservicioUsuarios.service.AlumnoService;

@RestController
public class AlumnoController extends CommonController<Alumno, AlumnoService> {

	private AlumnoService alumnoService;
	
	@Value("${config.balanceador.test}")
	private String balanceadorTest;
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id) {
        
		Optional<Alumno> ob = alumnoService.findById(id);

        if (ob.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        Alumno alumnoBd = ob.get();
        alumnoBd.setNombre(alumno.getNombre());
        alumnoBd.setApellido(alumno.getApellido());
        alumnoBd.setEmail(alumno.getEmail());

        return ResponseEntity.status(HttpStatus.CREATED).body(alumnoService.save(alumnoBd));
    }
	
}