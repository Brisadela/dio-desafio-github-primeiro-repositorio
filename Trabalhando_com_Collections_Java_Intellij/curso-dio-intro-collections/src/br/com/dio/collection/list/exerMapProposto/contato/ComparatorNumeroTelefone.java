package br.com.dio.collection.list.exerMapProposto.contato;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNumeroTelefone implements Comparator<Map.Entry<Integer, Contatos>> {


    @Override
    public int compare(Map.Entry<Integer, Contatos> c1, Map.Entry<Integer, Contatos> c2) {
        return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
    }
}
