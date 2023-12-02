package com.example.justthejobapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compromissos")
public class Compromissos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompromissos;

    private String descricao;
    private Integer tipoCompromisso;
    private Float hora;

    // Construtores, getters e setters

    // Construtor vazio
    public Compromissos() {
    }

    // Construtor completo
    public Compromissos(Long idCompromissos, String descricao, Integer tipoCompromisso, Float hora) {
        this.idCompromissos = idCompromissos;
        this.descricao = descricao;
        this.tipoCompromisso = tipoCompromisso;
        this.hora = hora;
    }

    // Getters e Setters

    public Long getIdCompromissos() {
        return idCompromissos;
    }

    public void setIdCompromissos(Long idCompromissos) {
        this.idCompromissos = idCompromissos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getTipoCompromisso() {
        return tipoCompromisso;
    }

    public void setTipoCompromisso(Integer tipoCompromisso) {
        this.tipoCompromisso = tipoCompromisso;
    }

    public Float getHora() {
        return hora;
    }

    public void setHora(Float hora) {
        this.hora = hora;
    }
}
