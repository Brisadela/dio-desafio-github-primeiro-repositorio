package dio.com.desafio.banco.contas;

import dio.com.desafio.banco.clientes.Cliente;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{



    private BigDecimal limite;

    public ContaCorrente(Cliente cliente) {
    super(cliente);
    this.limite =  BigDecimal.ZERO;;
    }

    @Override
    public void sacar(BigDecimal saque) {
        BigDecimal somaSaldo = getSaldo().add(limite);
        int resultado = somaSaldo.compareTo(saque);
        if(resultado == 1 || resultado == 0){
            BigDecimal novoSaldo = getSaldo().subtract(saque);
            setSaldo(novoSaldo);
            System.out.println("Saque realizado em "+ getTimeStamp());
            System.out.println(getTimeStamp());

        }else{
            System.out.println("Não eh possivel realizar saque");

        }
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***");
        super.imprimirInfoComuns();
    }



}
