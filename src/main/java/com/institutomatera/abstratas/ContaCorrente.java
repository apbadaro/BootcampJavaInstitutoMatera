package com.institutomatera.abstratas;

// extends: palavra reservada para herança
// ContaCorrente herda todos os atributos e métodos de Conta

public class ContaCorrente extends Conta{
    @Override
    public void imprimeExtrato() {
        System.out.println("Extrato da Conta Corrente");
    }
}
