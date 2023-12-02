package com.example.justthejobapp.usecase;

import com.example.justthejobapp.domain.Cliente;

public interface ClienteUseCase {

    Cliente cadastrarCliente(String nome, String endereco, String telefone, String email);

    Cliente obterClientePorId(Long idCliente);

    void atualizarCliente(Long idCliente, String nome, String endereco, String telefone, String email);

    void excluirCliente(Long idCliente);

}
