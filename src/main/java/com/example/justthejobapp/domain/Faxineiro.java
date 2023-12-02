package com.example.justthejobapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Faxineiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFaxineiro;
    private String nome;
    private String endereco;
    private String telefone;
    private Integer horasTrabalhadasSemanalmente;
    private Integer historicoServicosPrestados;


}
