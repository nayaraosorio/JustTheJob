package com.example.justthejobapp.usecase;
import com.example.justthejobapp.domain.FormularioReserva;
import java.util.Date;


public interface FormularioReservaUseCase {

    FormularioReserva criarFormularioReserva(Long servicoPontualId, String enderecoImovel, Date dataServico, String horaServico, Double duracaoServico, Integer valorOrcamento, Double valorDepositoPago, Double saldoAPagar);

    FormularioReserva obterFormularioReservaPorId(Long idFormularioDeReserva);

    void atualizarFormularioReserva(Long idFormularioDeReserva, Long servicoPontualId, String enderecoImovel, Date dataServico, String horaServico, Double duracaoServico, Integer valorOrcamento, Double valorDepositoPago, Double saldoAPagar);

    void excluirFormularioReserva(Long idFormularioDeReserva);

    void imprimirFormulario(Long idFormularioDeReserva);


}

