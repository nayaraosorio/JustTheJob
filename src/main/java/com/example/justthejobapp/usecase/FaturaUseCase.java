package com.example.justthejobapp.usecase;

import java.util.Date;
import com.example.justthejobapp.domain.Fatura;

public interface FaturaUseCase {

    Fatura criarFatura(Long clienteId, Date dataEmissao, String valorTotal, String statusPagamento, Long idServico);

    Fatura obterFaturaPorId(Long idFatura);

    void atualizarFatura(Long idFatura, Long clienteId, Date dataEmissao, String valorTotal, String statusPagamento, Long idServico);

    void excluirFatura(Long idFatura);


}

