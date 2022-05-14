package br.com.dio.collection.list.aulasSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        //crie um conjuto de series

        //ordem aleatoria
        System.out.println("\nordem aleatoria--------------");
        Set<Serie> minhasSeries = new HashSet<>(){{
           add(new Serie("got","fantasia",60));
           add(new Serie("dark","drama",60));
           add(new Serie("that 70s show","comedia",25));
        }};

        for (Serie serie :minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }

        // ordem de inserção
        System.out.println("\nordem de inserção---------------");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that 70s show","comedia",25));
        }};

        for (Serie serie :minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }

        //ordem natural (tempo de episodio)
        System.out.println("\nordem natural (tempo de episodio)---------------");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);


        for (Serie serie :minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }

        //Ordem Nome/Genero/TempoEpisodio
        System.out.println("\nOrdem Nome/Genero/TempoEpisodio---------------");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie :minhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }

        //ordenar por genero -- para pratica
        System.out.println("\nOrdenar por genero---------------");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatoGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie :minhasSeries4) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }

        //ordenar por tempo de episodio/nome -- para pratica
        System.out.println("\nOrdenar por tempo de episodio---------------");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatoTempoEpisodioNome());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie :minhasSeries5) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }
    }


}
