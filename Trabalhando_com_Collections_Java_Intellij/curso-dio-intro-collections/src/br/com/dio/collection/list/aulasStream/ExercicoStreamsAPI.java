package br.com.dio.collection.list.aulasStream;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class ExercicoStreamsAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1","0","4","1","2","3","9","6","5");

        System.out. println("imprima todos os elementos dessa Lista de String: ");
        numerosAleatorios.forEach(System.out::println);

        System.out. println("Peque os 5 primeiros numeros e coloque dentro do Set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out. println("Trasforme esta lista em uma lista de numeros inteiros: ");
         List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        }
    }

