package com.example.justthejobapp.usecase;

import com.example.justthejobapp.domain.RegistroHorasTrabalhadas;

public interface RegistroHorasTrabalhadasUseCase {

    RegistroHorasTrabalhadas criarRegistroHorasTrabalhadas(Long faxineiroId, Long servicoId, Double horasServicoRealizado);

    RegistroHorasTrabalhadas obterRegistroHorasTrabalhadasPorId(Long idRegistroHorasTrabalhadas);

    void atualizarRegistroHorasTrabalhadas(Long idRegistroHorasTrabalhadas, Long faxineiroId, Long servicoId, Double horasServicoRealizado);

    void excluirRegistroHorasTrabalhadas(Long idRegistroHorasTrabalhadas);



}
