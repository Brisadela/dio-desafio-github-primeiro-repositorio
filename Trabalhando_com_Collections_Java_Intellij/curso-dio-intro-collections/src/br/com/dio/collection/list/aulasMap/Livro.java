package br.com.dio.collection.list.aulasMap;

import java.util.Objects;

public class Livro {

    private String Nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        Nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return Nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Nome.equals(livro.Nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                "Nome='" + Nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
