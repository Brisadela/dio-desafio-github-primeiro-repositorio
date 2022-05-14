package br.com.dio.collection.list.aulasSet;

import java.util.Comparator;

public class ComparatoGenero implements Comparator<Serie> {
    @Override
    public int compare(Serie o1, Serie o2) {
        return o1.getGenero().compareTo(o2.getGenero());
    }
}
