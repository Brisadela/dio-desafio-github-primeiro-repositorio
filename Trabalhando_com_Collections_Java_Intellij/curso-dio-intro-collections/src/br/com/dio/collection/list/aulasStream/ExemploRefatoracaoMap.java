package br.com.dio.collection.list.aulasStream;

import br.com.dio.collection.list.exerMapProposto.contato.Contatos;

import java.util.*;
import java.util.function.Function;

public class ExemploRefatoracaoMap {
    public static void main(String[] args) {

        System.out.println("\nOrdem aleatoria");

        Map<Integer, Contato> meusContatos = new HashMap<>(){{
            put(1, new Contato("Aline", 25666));
            put(2, new Contato("Carlos", 23568));
            put(3, new Contato("Robison", 36664));
        }};
        System.out.println(meusContatos);

        for(Map.Entry<Integer, Contato> contato: meusContatos.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome());
        }

        System.out.println("\nOrdem inseção");
        Map<Integer, Contato> meusContatos1 = new LinkedHashMap<>(){{
            put(1, new Contato("Aline", 25666));
            put(2, new Contato("Carlos", 23568));
            put(3, new Contato("Robison", 36664));
        }};
        System.out.println(meusContatos1);

        for(Map.Entry<Integer, Contato> contato1: meusContatos1.entrySet()) {
            System.out.println(contato1.getKey() + " - " + contato1.getValue().getNome()+ " - " + contato1.getValue().getNumero());
        }
        System.out.println("\nOrdem por id");
        Map<Integer, Contato> meusContatos4 = new TreeMap(meusContatos);
        System.out.println(meusContatos4);
        for(Map.Entry<Integer, Contato> contato2: meusContatos4.entrySet()) {
            System.out.println(contato2.getKey() + " - " + contato2.getValue().getNome()+ " - " + contato2.getValue().getNumero());
        }
        System.out.println("\nOrdem por numero telefone");  // trecho refatorado como classe anonima
       /* Set<Map.Entry<Integer, Contato>> meusContatos3 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
                return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
            }
        });*/
       /* Set<Map.Entry<Integer, Contato>> meusContatos3 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }));*/
        // uso de lambda
        Set<Map.Entry<Integer, Contato>> meusContatos3 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));

        meusContatos3.addAll(meusContatos.entrySet());
        for(Map.Entry<Integer, Contato> contato3: meusContatos3) {
            System.out.println(contato3.getKey() + " - " + contato3.getValue().getNome()+ " - " + contato3.getValue().getNumero());
        }

        System.out.println("\nOrdem por nome contato");

    }
}
