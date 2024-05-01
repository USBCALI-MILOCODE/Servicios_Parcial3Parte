package com.co.rodriguez.usuarios.MicroservicioUsuarios.service;

import com.co.rodriguez.mdbspringboot.MicroservicioSpringCommons.service.CommonService;
import com.co.rodriguez.usuarios.MicroservicioUsuarios.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno> { 

	public Alumno save(Alumno alumno);
	
	public void deleteById(Long id);
}
