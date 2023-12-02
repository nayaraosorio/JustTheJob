package com.example.justthejobapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class ServicoRegular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServicoRegular;

    @ManyToOne
    private Cliente cliente;

    private String enderecoImovel;
    private Float orcamentoAcordado;
    private String diaServico;

    // getters e setters

}