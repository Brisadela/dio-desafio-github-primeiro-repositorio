package br.com.dio.aulas.aula1Metodos;

public class Main {
    public static void main(String[] args) {

        //execução exemplo calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multilicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //execução  exemplo  mensagem
        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //execução exemplo  emprestimo

        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasPrcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresPrcelas());
        Emprestimo.calcular(1000, 5);
    }
}
