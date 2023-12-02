package com.example.justthejobapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProgramacaoSemanal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProgramacao;
    private Long faxineiroId;
    private Long servicoId;

    // Construtores
    public ProgramacaoSemanal() {
    }

    public ProgramacaoSemanal(Long faxineiroId, Long servicoId) {
        this.faxineiroId = faxineiroId;
        this.servicoId = servicoId;
    }

    // Getters e setters
    public Long getIdProgramacao() {
        return idProgramacao;
    }

    public void setIdProgramacao(Long idProgramacao) {
        this.idProgramacao = idProgramacao;
    }

    public Long getFaxineiroId() {
        return faxineiroId;
    }

    public void setFaxineiroId(Long faxineiroId) {
        this.faxineiroId = faxineiroId;
    }

    public Long getServicoId() {
        return servicoId;
    }

    public void setServicoId(Long servicoId) {
        this.servicoId = servicoId;
    }
}
