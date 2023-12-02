package com.example.justthejobapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class VisitaOrcamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVisitaOrcamento;
    private Long servicoPontualId;
    private Date dataVisita;
    private String informacoesColetadas;

    // Construtores
    public VisitaOrcamento() {
    }

    public VisitaOrcamento(Long servicoPontualId, Date dataVisita, String informacoesColetadas) {
        this.servicoPontualId = servicoPontualId;
        this.dataVisita = dataVisita;
        this.informacoesColetadas = informacoesColetadas;
    }

    // Getters e setters
    public Long getIdVisitaOrcamento() {
        return idVisitaOrcamento;
    }

    public void setIdVisitaOrcamento(Long idVisitaOrcamento) {
        this.idVisitaOrcamento = idVisitaOrcamento;
    }

    public Long getServicoPontualId() {
        return servicoPontualId;
    }

    public void setServicoPontualId(Long servicoPontualId) {
        this.servicoPontualId = servicoPontualId;
    }

    public Date getDataVisita() {
        return dataVisita;
    }

    public void setDataVisita(Date dataVisita) {
        this.dataVisita = dataVisita;
    }

    public String getInformacoesColetadas() {
        return informacoesColetadas;
    }

    public void setInformacoesColetadas(String informacoesColetadas) {
        this.informacoesColetadas = informacoesColetadas;
    }
}
