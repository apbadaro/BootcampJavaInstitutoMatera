package com.institutomatera.optional;

import com.institutomatera.collections.set.Conta;
import java.util.Optional;

public class TesteOptional {
    public static void main(String[] args) {

        // O Optional serve para contornar o NullPointerException, mas ainda permite valor null em seu interior
        // Ele recebe qualquer tipo de objeto

        // Obtém um objeto Optional<Conta> que pode ou não conter uma conta
        Optional<Conta> optionalConta = getContaSemErro();

        // Verifica se a conta está presente
        if (optionalConta.isPresent()) {
            // Se presente, obtém o objeto Conta e imprime seu saldo
            System.out.println("Saldo -> " + optionalConta.get().getSaldo());
        } else {
            // Caso contrário, informa que a conta não foi encontrada
            System.out.println("Conta não encontrada");
        }
    }

    // Metodo legado que retorna null, mas não é mais recomendado para uso
    public static Conta getConta() {
        return null;
    }

    /**
     * Metodo atualizado que retorna uma instância de Optional<Conta>.
     * Optional é usado para evitar NullPointerException, restringindo o acesso direto a valores nulos.
     * Aqui, construímos um exemplo de Conta com um saldo e um número válido.
     *
     * @return um objeto Optional contendo a conta ou vazio, caso necessário
     */
    public static Optional<Conta> getContaSemErro() {
        return Optional.of(Conta.builder()
                .numero_conta(123L)      // Configura o número da conta como 123
                .saldo(1000.0)          // Configura o saldo inicial como 1000.0
                .build());              // Constrói a instância da Conta usando o padrão Builder
    }
}