package com.example.seguradoraapi.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Portador implements Serializable {

    private static final long serialVerionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPortador;

    private String nome;
    private String cpf;
    private String telefone;
    @OneToOne
    @NotNull
    private Assistencia assistencia;

    private Boolean adesaoAtiva;

    private Long diaFaturamento;

    public Portador(){}

    public Portador(String nome, String cpf, String telefone, Assistencia assistencia, Long diaFaturamento){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.assistencia = assistencia;
        this.diaFaturamento = diaFaturamento;
        this.adesaoAtiva = true;
    }

    public Long getIdPortador() {
        return idPortador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getDiaFaturamento() {
        return diaFaturamento;
    }

    public void setDiaFaturamento(Long diaFaturamento) {
        this.diaFaturamento = diaFaturamento;
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

    public Assistencia getAssistencia() {
        return assistencia;
    }

    public void setAssistencia(Assistencia assistencia) {
        this.assistencia = assistencia;
    }

    public Boolean getAdesaoAtiva() {
        return adesaoAtiva;
    }

    public void setAdesaoAtiva(Boolean adesaoAtiva) {
        this.adesaoAtiva = adesaoAtiva;
    }
}
