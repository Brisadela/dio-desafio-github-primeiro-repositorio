package br.com.dio.collection.list.exerMapProposto.contato;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNome implements Comparator<Map.Entry<Integer, Contatos>> {
    @Override
    public int compare(Map.Entry<Integer, Contatos> c1, Map.Entry<Integer, Contatos> c2) {
        return c1.getValue().getNome().compareTo(c2.getValue().getNome());
    }
}
