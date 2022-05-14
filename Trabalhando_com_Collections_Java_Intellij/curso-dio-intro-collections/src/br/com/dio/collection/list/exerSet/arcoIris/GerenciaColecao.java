package br.com.dio.collection.list.exerSet.arcoIris;

import java.util.*;

public class GerenciaColecao {

    private SortedSet<Cor> conjuntounmodsortset;
    private SortedSet<Cor>  sub;

    public GerenciaColecao(List<Cor> cores) {// item a


        conjuntounmodsortset = new TreeSet<>(cores);
        conjuntounmodsortset = Collections.unmodifiableSortedSet(conjuntounmodsortset);

    }

    public Cor[] getColecaoParaArray() {

        Cor []  o =  conjuntounmodsortset.toArray(Cor[]:: new);

        return o;

    }
}
