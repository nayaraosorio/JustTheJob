package com.example.justthejobapp.usecase;
import com.example.justthejobapp.domain.Faxineiro;

import java.util.List;

public interface FaxineiroUseCase {

    Faxineiro criarFaxineiro(String nome, String endereco, String telefone, Integer horasTrabalhadasSemanalmente);

    Faxineiro obterFaxineiroPorId(Long idFaxineiro);

    void atualizarFaxineiro(Long idFaxineiro, String nome, String endereco, String telefone, Integer horasTrabalhadasSemanalmente);

    void excluirFaxineiro(Long idFaxineiro);

    List<Faxineiro> listarFaxineiros();


}
