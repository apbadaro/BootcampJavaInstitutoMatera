package com.institutomatera.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Pessoa {

    private Long id;
    private String nome;
    private Integer idade;
}
