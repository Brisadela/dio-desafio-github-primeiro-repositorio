package br.com.dio.collection.list.exerSet.linguagem;

import java.util.Comparator;

public class ComparatoNomeAnoCriacao implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {

        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) {
            return nome;
        }
        return l1.getAnoDeCriação().compareTo(l2.getAnoDeCriação());
    }
}
