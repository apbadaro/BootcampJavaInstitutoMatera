package com.institutomatera.equalseigualigual;

public class TesteEqualsEIgualIgual {
    public static void main(String[] args) {
        // Criação de variáveis com strings
        String nome1 = "Fulano"; // Atribui a string literal "Fulano"
        String nome2 = "Fulano"; // String literal, mesma referência de nome1
        String nome3 = new String("Fulano"); // Criação de um novo objeto String, mesmo valor mas referência diferente
        String nome4 = "fulano"; // String com a primeira letra minúscula (diferente de nome1 e nome2)

        // Comparação de referências usando == (verifica se apontam para o mesmo local de memória)
        System.out.println("(nome1 == nome2): " + (nome1 == nome2));
        // Resultado: true, pois nome1 e nome2 apontam para a mesma string literal no pool de strings

        System.out.println("(nome1 == nome3): " + (nome1 == nome3));
        // Resultado: false, nome3 é criado com 'new String()', então tem uma referência diferente em memória

        // Comparação de conteúdo usando equals() (verifica se o conteúdo dos objetos é igual)
        System.out.println("nome1.equals(nome2): " + nome1.equals(nome2));
        // Resultado: true, pois o conteúdo de nome1 e nome2 é o mesmo ("Fulano")

        System.out.println("nome1.equals(nome3):" + nome1.equals(nome3));
        // Resultado: true, pois o conteúdo de nome1 e nome3 é o mesmo ("Fulano"), mesmo com referências diferentes

        // Comparação de conteúdo ignorando diferenças entre maiúsculas e minúsculas usando equalsIgnoreCase()
        System.out.println("nome1.equalsIgnoreCase(nome4): " + nome1.equalsIgnoreCase(nome4));
        // Resultado: true, pois ignora diferenças de maiúsculas/minúsculas (nome1 = "Fulano" e nome4 = "fulano")
    }
}
