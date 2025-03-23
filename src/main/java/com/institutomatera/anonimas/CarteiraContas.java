package com.institutomatera.anonimas;

// Classe Anônima: Você improvisa na hora.
// Cria-se uma subclasse sem nome,
// sem a necessidade de uma definição separada de classe.

public class CarteiraContas {
    Conta contaCorrente = new Conta() {
        @Override
        public void imprimeTipoConta() {
            System.out.println("Conta Corrente");
        }
    };

    Conta contaPoupanca = new Conta() {
        @Override
        public void imprimeTipoConta() {
            System.out.println("Conta Poupança");
        }
    };
}