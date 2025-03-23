package com.institutomatera.interfaces;


// implements: palavra reservada para implementar interfaces
// ContaCorrente implementa a interface Conta

public class ContaCorrente implements Conta {
    private Double saldo = 100.00;
    private final Double taxaOperacao = 0.50;

    @Override
    public void depositar(Double valor) {
        this.saldo += valor - taxaOperacao;
    }

    @Override
    public void sacar(Double valor) {
        this.saldo -= valor + taxaOperacao;
    }

    @Override
    public Double getSaldo() {
        return this.saldo;
    }

}
