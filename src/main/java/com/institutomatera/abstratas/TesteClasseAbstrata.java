package com.institutomatera.abstratas;

// A classe abstrata tem métodos com implementação parcial,
// e os detalhes ficam para as classes filhas.

public class TesteClasseAbstrata {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.imprimeExtrato();

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.imprimeExtrato();
    }
}
