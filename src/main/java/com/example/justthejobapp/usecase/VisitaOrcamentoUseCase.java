package com.example.justthejobapp.usecase;

import com.example.justthejobapp.domain.VisitaOrcamento;

import java.util.Date;

public interface VisitaOrcamentoUseCase {

    VisitaOrcamento criarVisitaOrcamento(Long servicoPontualId, Date dataVisita, String informacoesColetadas);

    VisitaOrcamento obterVisitaOrcamentoPorId(Long idVisitaOrcamento);

    void atualizarVisitaOrcamento(Long idVisitaOrcamento, Long servicoPontualId, Date dataVisita, String informacoesColetadas);

    void excluirVisitaOrcamento(Long idVisitaOrcamento);


}
