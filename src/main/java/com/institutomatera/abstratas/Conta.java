package com.institutomatera.abstratas;

// classes abstratas são classes mãe/pai, não podem ser instanciadas
public abstract class Conta {

    // private: só pode ser acessado dentro da classe
    // precisa de construtores e métodos para ser acessado
    private Double saldo;

    // construtores
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // métodos

    // abstract method: não tem corpo
    // precisa, obrigatoriamente, ser implementado nas classes filhas
    public abstract void imprimeExtrato();
}