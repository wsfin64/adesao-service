package com.example.seguradoraapi.controllers;

import com.example.seguradoraapi.entities.Assistencia;
import com.example.seguradoraapi.services.AssistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/assistencias")
public class AssistenciaController {

    @Autowired
    AssistenciaService assistenciaService;

    @GetMapping
    public ResponseEntity<List<Assistencia>> listarAssistencias(){
        return ResponseEntity.ok(assistenciaService.listarAssistencias());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Assistencia> buscarAssistencia(@PathVariable Long id){
        return ResponseEntity.ok(assistenciaService.buscarAssistenciaPorId(id));
    }

    @PostMapping
    public ResponseEntity<Assistencia> cadastrarAssistencia(@RequestBody Assistencia assistencia){
        return ResponseEntity.ok(assistenciaService.cadastrarAssistencia(assistencia));
    }

    @DeleteMapping("/{id}")
    public void cancelarAssitencia(@PathVariable Long id){
        assistenciaService.cancelarAssistencia(id);
    }


}
