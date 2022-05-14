package br.com.dio.collection.list.exerSet.arcoIris;
/* Crie um conjunto contendo as cores do arco iris e :
*  a- exiba todas as cores uma abaixo da outra
*  b- a quantidade de cores do arco iris tem
*  c- exiba as cores em ordem alfabetica
*  d- exiba as cores na ordem inversa da que foi informada(ciar uma liste com um set das cores, do metodo collectiosn)
*  e- exiba todas as cores que começam com a letra "v"
*  f- exiba todas as cores que não começam com a letra  "v"
*  g- limpe o conjunto
*  h- Confira se o conjunto está vazio*/
public class Cor implements  Comparable<Cor>{

    private String cor;


    public Cor(String cor) {
        this.cor = cor;

    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cor o) {
        if(this.equals(o)) {
            return 0;
        }
        return this.getCor().compareTo(o.getCor());
    }
}
