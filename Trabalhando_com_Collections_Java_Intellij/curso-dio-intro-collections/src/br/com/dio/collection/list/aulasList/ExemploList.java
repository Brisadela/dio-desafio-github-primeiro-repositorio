package br.com.dio.collection.list.aulasList;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno[7,8.5,9.3,5,7,0,3.6], faça:

        // Crie uma lista e adicione as sete notas
        List<Double> notas = new ArrayList<Double>(); //
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas.toString());

        // Exiba a posição da nota5.0
        System.out.println("posição da nota 5.0 é: "+ notas.indexOf(5d));

        // adicione na lista a nota 8.0 na posição 4
       notas.add(4,8.0);//add(posição, valor);
        System.out.println(notas);//confirmando

        //Substitua a nota 5.0 pela 7.0
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);//confirmando

        //confira se a nota 5.0 está na lista
        System.out.println("Confirmando se nota 5.0 está na lista"+ notas.contains(5d));//contains(5d); tipo boolean

        //Exiba todas as notas na ordem em que foram inseridos
        for (Double nota: notas) System.out.println(notas);

        //Exiba a terceira nota inserida
        System.out.println("Exibindo a terceira nota adicionada"+ notas.get(2));
        System.out.println(notas.toString());

        //Exiba a menor nota
        System.out.println("Menor nota" + Collections.min(notas));

        //Exiba a maior nota
        System.out.println("Maior nota" + Collections.max(notas));

        //Exiba a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){ //tem proximo hasNext()
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma" + soma);

        //Exiba a media das notas
        System.out.println("Media" + (soma/notas.size()));//quantidade notas.size();

        //Remova a nota 0.0
        notas.remove(0d);
        System.out.println(notas);//confirmando

        //Remova a posição 0
        notas.remove(0d);
        System.out.println(notas);//confirmando

        //remova as notas menores que 7 e exiba a lista
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){ //tem proximo hasNext()
            Double next = iterator1.next();
           if(next < 7) iterator1.remove();
        }
        System.out.println(notas);//confirmando

        //apague toda a lista
       // notas.clear();
        System.out.println(notas);//confirmando

        //confirmar se lista está vazia
        System.out.println("confirmando se lista está vazia: "+ notas.isEmpty());//confirmando

        //Resolva os exercicios ultilizando os metodos de implementação LinkedList -- para pratica

        //Crie uma lista chamada notas2

        List<Double> notas2 = new LinkedList<Double>();

        //coloque todos elementos da List ArrayList nesta nova Lista -- para pratica
        notas2.addAll(notas);
        System.out.println("elementos nova lista: ");//confirmando
        System.out.println(notas2);//confirmando


        //Mostre a Primeira nota da nova Lista sem removê-la-- para pratica
        //Exiba a terceira nota inserida
        System.out.println("Exibindo a primeira nota adicionada "+ notas2.get(0));
        System.out.println(notas2.toString());
        //Mostre a Primeira nota da nova Lista removendo-o -- para pratica
        System.out.println("Exibindo a primeira nota adicionada "+ notas2.get(0));

        System.out.println("Removendo-a primeira nota adicionada "+ notas2.get(0));
        notas2.remove(7d);
        System.out.println(notas2);//confirmando
    }
}
