package br.com.dio.collection.list.aulasSet;

import java.util.Comparator;

public class ComparatoTempoEpisodioNome implements Comparator<Serie> {

    @Override
    public int compare(Serie o1, Serie o2) {
        int tempoEpisodio = Integer.compare(o1.getTempoEpisodio(), o2.getTempoEpisodio());

        if (tempoEpisodio != 0) {
            return tempoEpisodio;
        }else{
            return o1.getNome().compareTo(o2.getNome());
        }
    }
}
