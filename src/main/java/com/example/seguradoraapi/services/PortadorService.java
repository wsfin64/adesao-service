package com.example.seguradoraapi.services;

import com.example.seguradoraapi.entities.Portador;
import com.example.seguradoraapi.repositories.AssistenciaRepository;
import com.example.seguradoraapi.repositories.PortadorRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortadorService {

    @Autowired
    PortadorRespository portadorRespository;

    @Autowired
    AssistenciaRepository assistenciaRepository;

    public List<Portador> listarPortadores(){
        return portadorRespository.findAll();
    }

    public Portador buscarPortador(Long id){
        return portadorRespository.findById(id).get();
    }

    public Portador cadastrarPortador(Portador portador){
        portador.setAdesaoAtiva(true);
        return portadorRespository.save(portador);
    }

    public void apagarPortador(Long id){
        Portador portador = this.buscarPortador(id);

        if (portador != null){
            portador.setAdesaoAtiva(false);
            portadorRespository.save(portador);
        }
    }

}
