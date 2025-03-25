package com.institutomatera.sobrescritasobrecarga;

public class TesteSobrescrita {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(6000.00);
        contaPoupanca.depositar(500.00);

        ContaCorrente contaCorrenteSemTaxa = new ContaCorrente(9000.00);
        contaCorrenteSemTaxa.sacar(1000.00);

        ContaCorrente contaCorrenteComTaxa = new ContaCorrente(10000.00);
        contaCorrenteComTaxa.sacar(1000.00, 0.45);


        System.out.println("Saldo da conta poupança após o depósito: " + contaPoupanca.getSaldo());
        System.out.println("Saldo da conta corrente sem taxa: " + contaCorrenteSemTaxa.getSaldo());
        System.out.println("Saldo da conta corrente com taxa: " + contaCorrenteComTaxa.getSaldo());
    }
}
