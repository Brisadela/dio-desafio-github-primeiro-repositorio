package br.com.dio.collection.list.exerMapProposto.contato;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nOrdem aleatoria");

        Map<Integer, Contatos> meusContatos = new HashMap<>(){{
            put(1, new Contatos("Aline", 25666));
            put(2, new Contatos("Carlos", 23568));
            put(3, new Contatos("Robison", 36664));
        }};
        System.out.println(meusContatos);

        for(Map.Entry<Integer, Contatos> contato: meusContatos.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome());
        }

        System.out.println("\nOrdem inseção");
        Map<Integer, Contatos> meusContatos1 = new LinkedHashMap<>(){{
            put(1, new Contatos("Aline", 25666));
            put(2, new Contatos("Carlos", 23568));
            put(3, new Contatos("Robison", 36664));
        }};
        System.out.println(meusContatos1);

        for(Map.Entry<Integer, Contatos> contato1: meusContatos1.entrySet()) {
            System.out.println(contato1.getKey() + " - " + contato1.getValue().getNome()+ " - " + contato1.getValue().getNumero());
        }
        System.out.println("\nOrdem por id");
        Map<Integer, Contatos> meusContatos4 = new TreeMap(meusContatos);
        System.out.println(meusContatos4);
        for(Map.Entry<Integer, Contatos> contato2: meusContatos4.entrySet()) {
            System.out.println(contato2.getKey() + " - " + contato2.getValue().getNome()+ " - " + contato2.getValue().getNumero());
        }
        System.out.println("\nOrdem por numero telefone");
        Set<Map.Entry<Integer, Contatos>> meusContatos3 = new TreeSet<>(new ComparatorNumeroTelefone());
        meusContatos3.addAll(meusContatos.entrySet());
        for(Map.Entry<Integer, Contatos> contato3: meusContatos3) {
            System.out.println(contato3.getKey() + " - " + contato3.getValue().getNumero());
        }

        System.out.println("\nOrdem por nome contato");

        Set<Map.Entry<Integer, Contatos>> meusContatos5 = new TreeSet<>(new ComparatorNome());
        meusContatos5.addAll(meusContatos.entrySet());
        for(Map.Entry<Integer, Contatos> contato5: meusContatos5) {
            System.out.println(contato5.getKey() + " - " + contato5.getValue().getNome());
        }
    }
}
