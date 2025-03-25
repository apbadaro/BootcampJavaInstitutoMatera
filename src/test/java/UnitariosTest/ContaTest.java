package UnitariosTest;

import com.institutomatera.testesunitarios.Conta;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContaTest {
    Double saldo = 1000.00;
    Double taxaOperacao = 0.5;
    Double saldoFinal = 799.50;

    @Test
    public void sacarTest() {
        Conta conta = new Conta(saldo, taxaOperacao);
        conta.sacar(200.00);
        assertEquals(saldoFinal, conta.getSaldo());
    }
}
