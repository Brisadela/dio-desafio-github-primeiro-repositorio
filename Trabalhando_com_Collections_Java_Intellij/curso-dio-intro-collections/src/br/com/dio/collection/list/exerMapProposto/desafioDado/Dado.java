package br.com.dio.collection.list.exerMapProposto.desafioDado;


import com.sun.jdi.Value;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Collections.sort;
import static java.util.function.UnaryOperator.identity;

/*Lance o dade 100 vezez e mostre a quantidade de vezes cada num saiu
 * */
public class Dado {
    public static void main(String[] args) {


        int VALOR = 100;
        Random randon = new Random();

        int[] array = new int[VALOR];

        for (int i = 0; i < VALOR; i++) {
            int numero = randon.nextInt(VALOR);
            array[i] = numero;

        }

        System.out.print("Numeros Aleatorios: \n");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.print("\nQuantidade que cada Numeros apareceu\n\n");


        Map<Integer, Long> occurrences = Arrays.stream(array).boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        occurrences.forEach((k, v) -> System.out.println("Numero: " + k + ": " + " apareceu: " + v));
    }
}