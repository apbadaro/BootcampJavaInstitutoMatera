package com.institutomatera.stream;

import java.util.ArrayList;
import java.util.List;

public class TesteListaStream {
    public static void main(String[] args) {

        // Stream funciona com coleções como List, Set e Map.
        // Permite realizar operações em coleções de forma mais simples e funcional.
        // Exemplo de operações em Streams: filtrar, transformar, ordenar e coletar dados.

        List<String> contas = new ArrayList<>();

        // Adicionando diferentes tipos de contas à lista.
        contas.add("Conta Corrente");
        contas.add("Conta Poupança");
        contas.add("Conta Investimento");
        contas.add("Conta Corrente");

        // Utilizando Stream para filtrar contas que possuem "Corrente" no nome
        // e exibir cada uma no console.
        contas.stream()
                .filter(conta -> filterLista(conta)) // Aplica o filtro
                .forEach(conta -> System.out.println("Conta: " + conta)); // Imprime os resultados filtrados

        // Calculando a quantidade de contas "Corrente" usando Stream com o metodo count().
        long total = contas.stream()
                .filter(conta -> filterLista(conta)) // Filtra as contas que atendem ao critério
                .count(); // Conta o total de elementos filtrados
        System.out.println("Total de CC: " + total);

        // Metodo tradicional para verificar o total de contas "Corrente", sem utilizar Stream.
        // Neste caso, um loop explícito é usado para iterar na lista e aplicar a lógica de filtro.
        long totalContas = 0;
        for (int index = 0; index < contas.size(); index++) {
            String conta = contas.get(index); // Obtém o elemento atual da lista
            if (filterLista(conta)) { // Aplica o filtro
                totalContas = totalContas + 1; // Incrementa o contador se passar no filtro
            }
        }
        // Exibe o resultado do metodo tradicional no console.
        System.out.println("Total de CC: " + totalContas);
    }

    /**
     * Metodo de filtro para verificar se o nome da conta contém a palavra "Corrente"
     *
     * @param conta => nome da conta a ser verificado
     * @return true se o nome da conta contém "Corrente" (e false caso contrário, obvs)
     */
    public static Boolean filterLista(String conta) {
        return conta.contains("Corrente");
    }
}