package com.example.justthejobapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class FormularioReserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormularioDeReserva;
    private Long servicoPontualId;
    private String enderecoImovel;
    private Date dataServico;
    private String horaServico;
    private Double duracaoServico;
    private Integer valorOrcamento;
    private Double valorDepositoPago;
    private Double saldoAPagar;

    public FormularioReserva() {
    }

    public FormularioReserva(Long servicoPontualId, String enderecoImovel, Date dataServico, String horaServico, Double duracaoServico, Integer valorOrcamento, Double valorDepositoPago, Double saldoAPagar) {
        this.servicoPontualId = servicoPontualId;
        this.enderecoImovel = enderecoImovel;
        this.dataServico = dataServico;
        this.horaServico = horaServico;
        this.duracaoServico = duracaoServico;
        this.valorOrcamento = valorOrcamento;
        this.valorDepositoPago = valorDepositoPago;
        this.saldoAPagar = saldoAPagar;
    }

    // Getters e setters
    public Long getIdFormularioDeReserva() {
        return idFormularioDeReserva;
    }

    public void setIdFormularioDeReserva(Long idFormularioDeReserva) {
        this.idFormularioDeReserva = idFormularioDeReserva;
    }

    public Long getServicoPontualId() {
        return servicoPontualId;
    }

    public void setServicoPontualId(Long servicoPontualId) {
        this.servicoPontualId = servicoPontualId;
    }

    public String getEnderecoImovel() {
        return enderecoImovel;
    }

    public void setEnderecoImovel(String enderecoImovel) {
        this.enderecoImovel = enderecoImovel;
    }

    public Date getDataServico() {
        return dataServico;
    }

    public void setDataServico(Date dataServico) {
        this.dataServico = dataServico;
    }

    public String getHoraServico() {
        return horaServico;
    }

    public void setHoraServico(String horaServico) {
        this.horaServico = horaServico;
    }

    public Double getDuracaoServico() {
        return duracaoServico;
    }

    public void setDuracaoServico(Double duracaoServico) {
        this.duracaoServico = duracaoServico;
    }

    public Integer getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(Integer valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public Double getValorDepositoPago() {
        return valorDepositoPago;
    }

    public void setValorDepositoPago(Double valorDepositoPago) {
        this.valorDepositoPago = valorDepositoPago;
    }

    public Double getSaldoAPagar() {
        return saldoAPagar;
    }

    public void setSaldoAPagar(Double saldoAPagar) {
        this.saldoAPagar = saldoAPagar;
    }
}
