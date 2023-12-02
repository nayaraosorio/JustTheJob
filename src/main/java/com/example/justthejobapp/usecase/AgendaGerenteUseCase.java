package com.example.justthejobapp.usecase;
import com.example.justthejobapp.domain.AgendaGerente;

import java.util.Date;

public interface AgendaGerenteUseCase {

    AgendaGerente criarAgendaGerente(Date dataCriacao, Long programacaoSemanalId, Long compromissosId);

    AgendaGerente obterAgendaGerentePorId(Long idAgendaGerente);

    void atualizarAgendaGerente(Long idAgendaGerente, Date dataCriacao, Long programacaoSemanalId, Long compromissosId);

    void excluirAgendaGerente(Long idAgendaGerente);

    // Adicione outros métodos conforme necessário para operações relacionadas à AgendaGerente

}

