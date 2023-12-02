package com.example.justthejobapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ServicoPontual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLimpezaPontual;

    @ManyToOne
    private Cliente cliente;

    private Float valorOrcamento;
    private String dataServico;

    // getters e setters

}
