package com.example.seguradoraapi.repositories;

import com.example.seguradoraapi.entities.Portador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortadorRespository extends JpaRepository<Portador, Long> {
}
