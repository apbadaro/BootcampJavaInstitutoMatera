package com.institutomatera.tratamentoexcecoes;

public class TesteExcecao {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();

        conta.setSaldo(1000.00);
        conta.setTaxaOperacao(0.5);

        try {
            System.out.println("Saldo inicial: " + conta.getSaldo());
            conta.sacar(1500.0); // saldo insuficiente
            // conta.sacar(0.0); // valor para saque zerado
            // conta.sacar(500.0); // saque normal
        } catch (ExcecaoValorParaSaqueZerado e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Saldo atual: " + conta.getSaldo()); // o finally sempre será executado
        }
    }
}
