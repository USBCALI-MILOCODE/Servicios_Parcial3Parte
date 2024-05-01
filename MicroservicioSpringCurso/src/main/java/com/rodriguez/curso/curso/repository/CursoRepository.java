package com.rodriguez.curso.curso.repository;

import org.springframework.data.repository.CrudRepository;

import com.rodriguez.curso.curso.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {

}
