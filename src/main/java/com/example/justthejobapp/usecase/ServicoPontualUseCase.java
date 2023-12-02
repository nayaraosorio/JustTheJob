package com.example.justthejobapp.usecase;

import com.example.justthejobapp.domain.Cliente;
import com.example.justthejobapp.domain.ServicoPontual;

public interface ServicoPontualUseCase {

    ServicoPontual criarServicoPontual(Cliente cliente, Float valorOrcamento, String dataServico);

    ServicoPontual obterServicoPontualPorId(Long idLimpezaPontual);

    void atualizarServicoPontual(Long idLimpezaPontual, Cliente cliente, Float valorOrcamento, String dataServico);

    void excluirServicoPontual(Long idLimpezaPontual);

    // Adicione outros métodos conforme necessário para operações relacionadas a ServicoPontual

}
