package com.example.seguradoraapi.entities.DTO;

import com.example.seguradoraapi.entities.Assistencia;

public class PortadorDTO {

    private String nome;
    private String cpf;
    private String telefone;

    private Long idAssistencia;
    private Long diaFaturamento;

    public PortadorDTO(){}

    public PortadorDTO(String nome, String cpf, String telefone, Long idAssistencia, Long diaFaturamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idAssistencia = idAssistencia;
        this.diaFaturamento = diaFaturamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Long getIdAssistencia() {
        return idAssistencia;
    }

    public void setIdAssistencia(Long idAssistencia) {
        this.idAssistencia = idAssistencia;
    }

    public Long getDiaFaturamento() {
        return diaFaturamento;
    }

    public void setDiaFaturamento(Long diaFaturamento) {
        this.diaFaturamento = diaFaturamento;
    }
}
