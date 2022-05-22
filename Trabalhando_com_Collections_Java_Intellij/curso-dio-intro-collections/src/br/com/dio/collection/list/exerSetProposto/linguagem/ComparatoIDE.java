package br.com.dio.collection.list.exerSetProposto.linguagem;


import java.util.Comparator;

public class ComparatoIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {

        int ide =  o1.getIde().compareTo(o2.getIde());
        if (ide != 0) {
            return ide;
        }
        return o1.getNome().compareTo(o2.getNome());
    }
}
