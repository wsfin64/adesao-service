package com.example.seguradoraapi.services;

import com.example.seguradoraapi.entities.Assistencia;
import com.example.seguradoraapi.repositories.AssistenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssistenciaService {

    @Autowired
    AssistenciaRepository assistenciaRepository;

    public List<Assistencia> listarAssistencias(){
        return assistenciaRepository.findAll();
    }

    public Assistencia buscarAssistenciaPorId(Long id){
        return assistenciaRepository.findById(id).get();
    }

    public Assistencia cadastrarAssistencia(Assistencia assistencia){
        return assistenciaRepository.save(assistencia);
    }

    public void cancelarAssistencia(Long id){
        Assistencia assistencia = this.buscarAssistenciaPorId(id);

        if (assistencia != null){
            assistencia.setAtivo(false);
            assistenciaRepository.save(assistencia);
        }
    }
}
