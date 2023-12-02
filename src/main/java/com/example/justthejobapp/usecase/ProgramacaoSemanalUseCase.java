package com.example.justthejobapp.usecase;

import com.example.justthejobapp.domain.ProgramacaoSemanal;

public interface ProgramacaoSemanalUseCase {

    ProgramacaoSemanal criarProgramacaoSemanal(Long faxineiroId, Long servicoId);

    ProgramacaoSemanal obterProgramacaoSemanalPorId(Long idProgramacao);

    void atualizarProgramacaoSemanal(Long idProgramacao, Long faxineiroId, Long servicoId);

    void excluirProgramacaoSemanal(Long idProgramacao);


}

