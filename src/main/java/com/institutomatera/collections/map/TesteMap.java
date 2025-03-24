package com.institutomatera.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {
    public static void main(String[] args) {

        // Map é uma coleção de chave e valor
        // diferentemente do Set, o Map não verifica o valor da chave, apenas sobrescreve
        // pode ser qualquer tipo de objeto (String, Integer, Double etc)
        Map<String, String> contas = new HashMap<>();

        contas.put("Conta Corrente", "Ana Paula");
        contas.put("Conta Poupança", "Rennan");
        contas.put("Conta Investimento", "Selma");
        // contas.put("Conta Corrente", "Ana Paula Badaró") -> sobrescreve o valor da chave (Conta Corrente)

        System.out.println(contas); // traz o mapa inteiro
        System.out.println(contas.get("Conta Corrente")); // traz o valor da chave ("Ana Paula")

        System.out.println(contas.keySet()); // traz as chaves
    }
}