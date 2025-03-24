package com.institutomatera.collections.set;

import lombok.Builder;
import lombok.Data;

@Data  // Lombok gera automaticamente getter, setter, toString, equals e hashCode (mas estamos sobrescrevendo hashCode e equals)
@Builder  // Permite criar objetos usando o padrão Builder
public class Conta {
    private Long numero_conta;  // Identificador único da conta
    private Double saldo;  // Saldo da conta

    /**
     * Sobrescrevemos hashCode para que ele seja baseado apenas no numero_conta.
     * Isso significa que contas com o mesmo número terão o mesmo hash,
     * independente do saldo.
     */
    @Override
    public int hashCode() {
        return numero_conta.hashCode();  // Usa o hashCode padrão do Long
    }

    /**
     * Sobrescrevemos equals para que duas contas sejam consideradas iguais
     * se tiverem o mesmo numero_conta.
     * Não comparamos o saldo porque ele pode variar sem alterar a identidade da conta.
     */
    @Override
    public boolean equals(Object obj) {
        Conta conta = (Conta) obj;  // Faz o cast direto para Conta (pode lançar ClassCastException se obj não for Conta)
        return this.numero_conta.equals(conta.getNumero_conta());  // Compara apenas o numero_conta
    }
}
