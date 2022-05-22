package br.com.dio.collection.list.aulasMap;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        // ordem aleatoria
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("HawKing, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do Habito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições", 432));
        }};
        for(Map.Entry<String, Livro> livro:meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        //ordem de inserção

        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("HawKing, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do Habito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições", 432));
        }};
        for(Map.Entry<String, Livro> livro:meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        // Ordem Alfabetica dos autores
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro> livro:meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        //Ordem alfabetica dos livros

        Set<Map.Entry<String, Livro>> meusLivros3= new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro:meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        // ordem por numeros de paginas -- para pratica
        Set<Map.Entry<String, Livro>> meusLivros4= new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro:meusLivros4)
            System.out.println(livro.getKey() + " - " + livro.getValue().getPaginas());

    }
}
