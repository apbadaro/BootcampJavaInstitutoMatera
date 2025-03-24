package com.institutomatera.collections.lista;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {
    public static void main(String[] args) {
        List<String> contas = new ArrayList();

        // em Java, Listas aceitam valores repetidos

        contas.add("Conta Corrente");
        contas.add("Conta Poupança");
        contas.add("Conta Investimento");

        contas.get(0);
        contas.get(1);
        contas.get(2);

        System.out.println("Conta 1: " + contas.get(0));
        System.out.println("Conta 2: " + contas.get(1));
        System.out.println("Conta 3: " + contas.get(2));
    }
}
