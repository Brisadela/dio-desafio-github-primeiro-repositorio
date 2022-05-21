package dio.com.desafio.banco;

import dio.com.desafio.banco.clientes.Cliente;
import dio.com.desafio.banco.contas.Conta;
import dio.com.desafio.banco.contas.ContaCorrente;
import dio.com.desafio.banco.contas.ContaPoupança;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        // criação clientes
        Cliente cli1 = new Cliente("ARTHUR FELIPE R. COSTA", LocalDate.of(1984, Month.APRIL, 15));
        //15/04/1984

        Cliente cli2 = new Cliente("DIOGO FERNANDES DE SOUZA", LocalDate.of(1989, Month.JANUARY, 22));
        //22/01/1989

        Cliente cli3 = new Cliente("ELIVELTON COSTA DA SILVA", LocalDate.of(1986, Month.DECEMBER, 2));
        //02/12/1986

        Cliente cli4 = new Cliente("ANA TEREZA DE A. VASQUES", LocalDate.of(1997, Month.JANUARY, 27));
        //27/01/1997

        Cliente cli5 = new Cliente("MARIA CONCEIÇÃO DA S. SOUZA", LocalDate.of(1980, Month.APRIL, 19));
        //19/04/1980

        // criação contas corrente poupança

        Conta ccorrente = new ContaCorrente(cli1);
        ccorrente.depositar(BigDecimal.valueOf(500));
        ccorrente.imprimirExtrato();
        ccorrente.depositar(BigDecimal.valueOf(500));

        Conta cpopanca  = new ContaPoupança(cli2);
        cpopanca.depositar(BigDecimal.valueOf(1000));
        cpopanca.depositar(BigDecimal.valueOf(1000));
        cpopanca.imprimirExtrato();

        Conta ccorrente1 = new ContaCorrente(cli3);
        ccorrente1.depositar(BigDecimal.valueOf(1000));
        Conta cpopanca1  = new ContaPoupança(cli3);
        cpopanca1.depositar(BigDecimal.valueOf(1000));
        ccorrente1.depositar(BigDecimal.valueOf(500));
        ccorrente1.imprimirExtrato();
        cpopanca.imprimirExtrato();
        cpopanca1.transferir(BigDecimal.valueOf(500),ccorrente1);








        Conta cpopanca2 = new ContaPoupança(cli3);
        cpopanca.depositar(BigDecimal.valueOf(1000));
        ccorrente.depositar(BigDecimal.valueOf(500));
        cpopanca.imprimirExtrato();
        ccorrente.transferir(BigDecimal.valueOf(500),cpopanca);

        ccorrente.imprimirExtrato();
        cpopanca.imprimirExtrato();

        banco.addConta(cpopanca);
        banco.addConta(ccorrente);
        banco.exibeContas();
        System.out.println("Removendo conta Numero: 1");
        banco.removeConta(001L);
        banco.exibeContas();
    }
}
