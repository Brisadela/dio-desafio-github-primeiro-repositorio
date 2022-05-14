package br.com.dio.collection.list.aulasList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        //crie uma lista de gatos com nomes, idade, cor

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon",18,"preto"));
            add(new Gato("Simba",6,"tigrado"));
            add(new Gato("Jon",12,"amarelo"));
        }};


        //Ordem de Inserção
        System.out.println(meusGatos);

        //Ordem Aleatoria
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);//confirmando

        //Ordem Natural (nome)
        Collections.sort(meusGatos);
        System.out.println(meusGatos);//confirmando

        //parte 2

        // Ordem idade
        Collections.sort(meusGatos,new ComparatorIdade());
        //meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);//confirmando

        //Ordem por cor
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);//confirmando

        // Ordem Nome/Cor/Idade
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);//confirmando

    }
}
