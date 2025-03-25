package com.institutomatera.switches;

public class ContaPoupanca implements Conta {
    private final String tipoConta;

    public ContaPoupanca() {
        this.tipoConta = "Conta Poupança";
    }

    @Override
    public String getTipoConta() {
        return this.tipoConta;
    }
}
