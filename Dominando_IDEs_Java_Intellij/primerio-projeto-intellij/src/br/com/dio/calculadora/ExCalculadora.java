package br.com.dio.calculadora;

import javax.swing.*;

public class ExCalculadora {
    public static void main(String[] args) {

        // coletando valores ultilizando
        String primeiroNumero =
                JOptionPane.showInputDialog("Digite primeiro valor");
        String segundoNumero =
                JOptionPane.showInputDialog("Digite segundo valor");

        // ciação variaveis, conversão de variaveis para atribuição
        Double primeiroValor = Double.parseDouble(primeiroNumero);
        Double segundoValor = Double.parseDouble(segundoNumero);

        // criando  calculadora mediante ao uso do contrutor atribuindo valor
        Calculadora calculadora = new Calculadora(primeiroValor, segundoValor);

        // demostração do que o construtor acima está realizando
        calculadora.setPrimeiroOperando(primeiroValor);
        calculadora.setSegundoOperando(segundoValor);



        //visualização
        JOptionPane.showMessageDialog(null,
                calculadora.soma(),
                "Soma", JOptionPane.INFORMATION_MESSAGE);//JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,
                calculadora.subtracao(),
                "Subtracao", JOptionPane.INFORMATION_MESSAGE);//JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,
                calculadora.multiplicacao(),
                "Multiplicação", JOptionPane.INFORMATION_MESSAGE);//JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,
                calculadora.divisao(),
                "Divisão", JOptionPane.INFORMATION_MESSAGE);//JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,
                calculadora.restodivisao(),
                "Resto da Divisão", JOptionPane.INFORMATION_MESSAGE);//JOptionPane.ERROR_MESSAGE);

    }


}

