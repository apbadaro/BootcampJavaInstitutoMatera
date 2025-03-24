package com.institutomatera.modificador;

import lombok.Getter;
import lombok.Setter;

public class Conta {

    @Setter
    @Getter
    private Double saldo;
    private String titular;

}
