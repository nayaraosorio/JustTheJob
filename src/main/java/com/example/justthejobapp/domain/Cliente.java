package com.example.justthejobapp.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Integer historicoServicos;

    public Cliente() {
    }

    public Cliente(Long idCliente, String nome, String endereco, String telefone, String email, Integer historicoServicos) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.historicoServicos = historicoServicos;
    }


    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getHistoricoServicos() {
        return historicoServicos;
    }

    public void setHistoricoServicos(Integer historicoServicos) {
        this.historicoServicos = historicoServicos;
    }
}
