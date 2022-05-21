package dio.com.desafio.banco;

import dio.com.desafio.banco.contas.Conta;
import dio.com.desafio.banco.contas.IConta;

import java.util.*;
import java.util.stream.Collectors;

public class Banco {

    private String nome;
    private List<Conta> contas;
    private Conta conta;



    public Banco() {
        this.nome = nome;
        contas = new ArrayList<>();

    }

    public Banco(String nome) {
        this.nome = nome;
        contas = new ArrayList<>();

    }

    public int getQuantidadeContas() {
        return contas.size();
    }

    public boolean addConta(Conta c) {
        if(c != null) {
            return contas.add(c);
        }
        return false;
    }

    public boolean removeConta(Long numero) {
        if(numero != null) {
            for(int i = 0; i < contas.size(); i++) {
                conta = contas.get(i);
                if(conta.getNumero()== numero){

                    return contas.remove(conta);
                }
            }
        }
        return false;
    }


    public void exibeContas() {
        System.out.println("*** Dados Bancarios ***");

        for(Conta c: contas) {
            System.out.println("Agencia: " + c.getAgencia());
            System.out.println("Numero Conta: " +c.getNumero());
            System.out.println("Data criação em "+ c.getTimeStamp());
            System.out.println("Nome: " +c.getCliente().getNome());
            System.out.println("DataNasc.: " +c.getCliente().getDataNascimento());
            System.out.println("-------------");
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
