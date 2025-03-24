package com.institutomatera.collections.set;

import java.util.HashSet;
import java.util.Set;

public class TesteSetConta {
    public static void main(String[] args) {
        Set<Conta> contas = new HashSet<>();

        // construindo objetos Conta com o construtor padrão
//        contas.add(new Conta(100L, 252.00));
//        contas.add(new Conta(100L, 300.00));

        // construindo objetos Conta com o padrão Builder
        contas.add(
                Conta.builder()
                        .saldo(350.00)
                        .numero_conta(101L)
                        .build()
        );

        contas.forEach(conta -> System.out.println("Conta -> " + conta));

    }
}
