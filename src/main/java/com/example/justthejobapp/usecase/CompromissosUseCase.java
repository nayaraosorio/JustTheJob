package com.example.justthejobapp.usecase;

import com.example.justthejobapp.domain.Compromissos;


public interface CompromissosUseCase {

    Compromissos criarCompromissos(String descricao, Integer tipoCompromisso, Float hora);

    Compromissos obterCompromissosPorId(Long idCompromissos);

    void atualizarCompromissos(Long idCompromissos, String descricao, Integer tipoCompromisso, Float hora);

    void excluirCompromissos(Long idCompromissos);

    // Adicione outros métodos conforme necessário para operações relacionadas a Compromissos

}
