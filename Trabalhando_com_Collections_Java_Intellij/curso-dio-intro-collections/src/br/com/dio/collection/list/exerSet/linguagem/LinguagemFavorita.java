package br.com.dio.collection.list.exerSet.linguagem;

import br.com.dio.collection.list.aulasSet.Serie;

import java.util.Objects;

/* Crie uma classe LinguamFavorita que possua os atributos:*/
public class LinguagemFavorita implements Comparable<LinguagemFavorita>{

    private String nome;
    private String anoDeCriação;
    private String ide;

    public LinguagemFavorita(String nome, String anoDeCriação, String ide) {
        this.nome = nome;
        this.anoDeCriação = anoDeCriação;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public String getAnoDeCriação() {
        return anoDeCriação;
    }

    public String getIde() {
        return ide;
    }



    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriação, ide);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriação='" + anoDeCriação + '\'' +
                ", ide='" + ide + '\'' +
                '}';
    }
    //b- Ordem Natural(nome)
    @Override
    public int compareTo(LinguagemFavorita l) {
        return this.getNome().compareTo(l.getNome());
    }

    @Override
    public boolean equals (Object obj) {
        //System.out.println("");
        if(obj instanceof LinguagemFavorita) {
            LinguagemFavorita a = (LinguagemFavorita) obj;
            return this.getAnoDeCriação().equals(a.getAnoDeCriação());
        }
        return false;

    }

}
