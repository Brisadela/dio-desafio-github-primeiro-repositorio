package br.com.dio.collection.list.aulasSet;

import java.lang.reflect.Array;
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        //Crie um conjunto e adicione as notas
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d,3.6));
        System.out.println(notas.toString());//confirmado a desordenaçãoo

        //confira se anota5.0 esta no conjunto
        System.out.println("conferindo se a nota 5.0 esta no conjunto: " + notas.contains(5d));

    //exiba aterceira nota adicionada-- não e possivel

        //exiba a menor nota

        System.out.println("menor nota: " + Collections.min(notas));

        //exiba a maior nota
        System.out.println("maior nota: " + Collections.max(notas));

        //exiba a soma de valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);


        //Exiba a media das notas

        System.out.println("Media: " + (soma/ notas.size()));

        //Remova a nota 0
        notas.remove(0d);
        System.out.println(notas);//confirmando

        //remova anota na posição não e possivel

        // remova as notas menores que 7 e exiba a lista

        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        //exiba todas as notas na ordem que foi informada
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d,3.6));
        System.out.println(notas2);

        //exiba todas as notas em ordem crescente
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        //apague o conjunto
        notas.clear();
        System.out.println(notas);

        //Confira se o conjunto está vazio
        System.out.println("Conferindo conjunto vazio: "+ notas.isEmpty());
        System.out.println("Conferindo conjunto vazio: "+ notas2.isEmpty());

    }
}
