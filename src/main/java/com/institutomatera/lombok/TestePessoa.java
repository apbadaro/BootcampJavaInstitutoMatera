package com.institutomatera.lombok;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa();

        pessoaUm.setId(1L);
        pessoaUm.setNome("João");
        pessoaUm.setIdade(25);

        System.out.println("ID: " + pessoaUm.getId());
        System.out.println("Nome: " + pessoaUm.getNome());
        System.out.println("Idade: " + pessoaUm.getIdade());

        System.out.println(pessoaUm); // usando a anotação @ToString para beautify o output
    }
}
