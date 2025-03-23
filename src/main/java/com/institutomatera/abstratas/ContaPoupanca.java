package com.institutomatera.abstratas;

// classe filha, herda todos os atributos e métodos de Conta
public class ContaPoupanca extends Conta {
    @Override
    public void imprimeExtrato() {
        System.out.println("Extrato da Conta Poupança");
    }
}
