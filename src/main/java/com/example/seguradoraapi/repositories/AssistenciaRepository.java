package com.example.seguradoraapi.repositories;

import com.example.seguradoraapi.entities.Assistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AssistenciaRepository extends JpaRepository<Assistencia, Long> {
}
