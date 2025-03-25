package com.institutomatera.tratamentoexcecoes;

public class ExcecaoValorParaSaqueZerado extends Exception {
    public String getMessage() {
        return "Valor para saque não pode ser zero";
    }
}
