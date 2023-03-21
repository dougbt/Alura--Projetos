package com.alura.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.api.Modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    List<Topico> findByCursoNome(String nomeCurso);

    
}
