package com.institutomatera.interfaces;

// não podemos implementar os métodos nas interfaces, apenas declarar
// interfaces não podem ter atributos

public interface Conta {
    void depositar(Double valor);

    void sacar(Double valor);

    Double getSaldo();
}
