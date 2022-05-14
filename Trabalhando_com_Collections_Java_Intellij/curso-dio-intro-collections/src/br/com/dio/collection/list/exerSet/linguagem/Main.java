package br.com.dio.collection.list.exerSet.linguagem;




import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/* Crie um conjunto com 3 linguagem e faça umprograma que
 * ordene esse conjunto por:
 * a- Ordem de inserção
 * b- Ordem Natural(nome)
 * c-  ..IDE
 * d-  ..Ano de criação e nome
 * e- Nome, ano de criação IDE
 *
 * ao final exiba uma abaixo da outra*/
public class Main {
    public static void main(String[] args) {

        // a- Ordem de inserção
        Set<LinguagemFavorita> minhasLinguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("java","1991","IntelliJ"));
            add(new LinguagemFavorita("C","1972","NetBeans"));
            add(new LinguagemFavorita("javaScript","1995","NetBeans"));
        }};
        System.out.println("\nOrdem de inserção ________________________");

        for (LinguagemFavorita linguagemFavorita :minhasLinguagens) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriação() + " - "
                    + linguagemFavorita.getIde());
        }

        //b- Ordem Natural(nome)

        Set<LinguagemFavorita> minhasLinguagens2 = new TreeSet<>(minhasLinguagens);

        System.out.println("\nOrdem Natural(nome) ________________________");
        for (LinguagemFavorita linguagem : minhasLinguagens2) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriação() + " - "
                    + linguagem.getIde());
        }

        //Ordem IDE

        Set<LinguagemFavorita> minhasLinguagens3 = new TreeSet<>(new ComparatoIDE());
        minhasLinguagens3.addAll(minhasLinguagens);
        System.out.println("\nOrdem IDE ________________________");
        for (LinguagemFavorita linguagem : minhasLinguagens3) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriação() + " - "
                    + linguagem.getIde());
        }

        //Ordem Ano de criação e nome

        Set<LinguagemFavorita> minhasLinguagens4 = new TreeSet<>(new ComparatoNomeAnoCriacao());
        minhasLinguagens4.addAll(minhasLinguagens);
        System.out.println("\nOrdem Ano de criação e nome ________________________");
        for (LinguagemFavorita linguagem : minhasLinguagens4) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriação() + " - "
                    + linguagem.getIde());
        }

        // Ordem Nome, ano de criação IDE

        Set<LinguagemFavorita> minhasLinguagens5 = new TreeSet<>(new ComparatoNomeAnoCriacao());
        minhasLinguagens5.addAll(minhasLinguagens);
        System.out.println("\nOrdem Nome, ano de criação IDE ________________________");
        for (LinguagemFavorita linguagem : minhasLinguagens5) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriação() + " - "
                    + linguagem.getIde());
        }
    }
}
