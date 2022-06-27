package com.example.seguradoraapi.controllers;

import com.example.seguradoraapi.entities.Portador;
import com.example.seguradoraapi.services.PortadorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/portadores")
public class PortadorController {

    @Autowired
    PortadorService portadorService;

    @GetMapping
    public ResponseEntity<List<Portador>> listarPortadores(){
        return ResponseEntity.ok(portadorService.listarPortadores());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Portador> buscarPortador(@PathVariable Long id){
        return ResponseEntity.ok(portadorService.buscarPortador(id));
    }

    @PostMapping
    public ResponseEntity<Portador> cadastrarPortador(@RequestBody Portador portador){
        return ResponseEntity.ok(portadorService.cadastrarPortador(portador));
    }

    @DeleteMapping("/{id}")
    public void cancelarAdesao(@PathVariable Long id){
        portadorService.apagarPortador(id);
    }

    @GetMapping("faturamento/{diaFaturamento}")
    public ResponseEntity<List<Portador>> listarPortadoresDiaFaturamento(@PathVariable Long diaFaturamento){
        return ResponseEntity.ok(portadorService.listarPortadorPorDiaFaturamento(diaFaturamento));
    }
}
