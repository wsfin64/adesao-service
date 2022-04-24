package com.example.seguradoraapi.entities;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Assistencia implements Serializable {

    private static final long serialVerionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAssistencia;
    @NotNull
    private String nome;
    @NotNull
    private Double valor;
    @NotNull
    private String descricao;
    @NotNull
    private Boolean ativo = true;

    public Assistencia(String nome, Double valor, String descricao){
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }


    public Assistencia() {}

    public Long getIdAssistencia() {
        return idAssistencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
