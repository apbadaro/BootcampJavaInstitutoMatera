package com.institutomatera.interfaces;

public class TesteInterface {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(); // instanciando a classe ContaCorrente
        contaCorrente.depositar(5000.00); // chamando o metodo depositar
        contaCorrente.getSaldo();
        System.out.println("CC -> Saldo após depósito: " + contaCorrente.getSaldo());
        contaCorrente.sacar(1000.00);
        System.out.println("CC -> Saldo após saque: " + contaCorrente.getSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca(); // instanciando a classe ContaPoupanca
        contaPoupanca.depositar(15000.00);
        contaPoupanca.getSaldo();
        System.out.println("CP -> Saldo após depósito: " + contaPoupanca.getSaldo());
        contaPoupanca.sacar(800.00);
        System.out.println("CP -> Saldo após saque: " + contaPoupanca.getSaldo());
    }
}
