package com.example.justthejobapp.domain;

import java.util.Date;

public class Fatura {
    private Long idFatura;
    private Long clienteId;
    private Date dataEmissao;
    private String valorTotal;
    private String statusPagamento;
    private Long idServico;
}
