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
        Double num1 = Double.parseDouble(primeiroNumero);
        Double num2 = Double.parseDouble(segundoNumero);

        // criando  calculadora
        Calculadora calculadora = new Calculadora(num1, num2);


        calculadora.setX(num1);
        calculadora.setY(num2);

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

