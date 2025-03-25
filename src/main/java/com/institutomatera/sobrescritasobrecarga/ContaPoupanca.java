package com.institutomatera.sobrescritasobrecarga;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Double saldo) {
        super(saldo);
    }

    @Override
    // sobrescrita do metodo herdado da classe Conta para não ser cobrada a taxa de operação na CP
    public void depositar(Double valor) {
        this.saldo += valor;
    }
}
