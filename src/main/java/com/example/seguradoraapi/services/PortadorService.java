package com.example.seguradoraapi.services;

import com.example.seguradoraapi.entities.Assistencia;
import com.example.seguradoraapi.entities.DTO.PortadorDTO;
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

    public Portador cadastrarPortador(PortadorDTO portadorDTO){

        Assistencia assistencia = assistenciaRepository.findById(portadorDTO.getIdAssistencia()).get();

        Portador portador = new Portador(portadorDTO.getNome(), portadorDTO.getCpf(), portadorDTO.getTelefone(),
                assistencia, portadorDTO.getDiaFaturamento());

        return portadorRespository.save(portador);
    }

    public void apagarPortador(Long id){
        Portador portador = this.buscarPortador(id);

        if (portador != null){
            portador.setAdesaoAtiva(false);
            portadorRespository.save(portador);
        }
    }

    public List<Portador> listarPortadorPorDiaFaturamento(Long diaFaturamento){
        return portadorRespository.findPortadorByDiaFaturamento(diaFaturamento);
    }

}
