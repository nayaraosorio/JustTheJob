package com.example.justthejobapp.usecase;

import com.example.justthejobapp.domain.Cliente;
import com.example.justthejobapp.domain.ServicoRegular;

public interface ServicoRegularUseCase {

    ServicoRegular criarServicoRegular(Cliente cliente, String enderecoImovel, Float orcamentoAcordado, String diaServico);

    ServicoRegular obterServicoRegularPorId(Long idServicoRegular);

    void atualizarServicoRegular(Long idServicoRegular, Cliente cliente, String enderecoImovel, Float orcamentoAcordado, String diaServico);

    void excluirServicoRegular(Long idServicoRegular);

    // Adicione outros métodos conforme necessário para operações relacionadas a ServicoRegular

}

