package com.institutomatera.collections.set;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {
    public static void main(String[] args) {
        Set<String> contas = new HashSet<>();

        // Set é uma lista, mas impede valores repetidos, pois obtém o hashcode do objeto

        // em Java, Sets não aceitam valores repetidos
        // e não garantem a ordem de inserção

        contas.add("Conta Corrente");
        contas.add("Conta Poupança");
        contas.add("Conta Investimento");
        contas.add("Conta Corrente");

        // contas.get(0); // não é possível acessar elementos por índice

        // ao fazer o forEach, ele ignora o elemento repetido e o mostra apenas uma vez
        contas.forEach(conta -> {
            System.out.println("Conta -> " + conta);
            System.out.println("Hashcode -> " + conta.hashCode());
        });
    }
}
