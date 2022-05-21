package dio.com.desafio.banco.contas;

import java.math.BigDecimal;

public interface IConta {

     void sacar(BigDecimal saque);
     void depositar(BigDecimal valor);
     void transferir(BigDecimal valor,IConta contaDestino);

     void imprimirExtrato();
}
