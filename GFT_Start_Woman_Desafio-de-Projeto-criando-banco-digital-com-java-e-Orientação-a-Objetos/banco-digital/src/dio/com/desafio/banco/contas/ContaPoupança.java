package dio.com.desafio.banco.contas;

import dio.com.desafio.banco.clientes.Cliente;

import java.math.BigDecimal;

public class ContaPoupança extends Conta{



    public ContaPoupança(Cliente cliente) {
        super(cliente);

    }

    @Override
    public void sacar(BigDecimal saque) {
        int resultado = getSaldo().compareTo(saque);
        if(resultado == 1 || resultado == 0){
            BigDecimal novoSaldo = getSaldo().subtract(saque);
            setSaldo(novoSaldo);
            System.out.println("Saque realizado em"+ getTimeStamp());
        }else{
            System.out.println("Não eh possivel realizar saque");
        }

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Popança ***");
        super.imprimirInfoComuns();
    }







}
