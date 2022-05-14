package br.com.dio.collection.list.exerSet.arcoIris;

import java.util.*;

/* Crie um conjunto contendo as cores do arco iris e :
 *  a- exiba todas as cores uma abaixo da outra
 *  b- a quantidade de cores do arco iris tem
 *  c- exiba as cores em ordem alfabetica
 *  d- exiba as cores na ordem inversa da que foi informada(ciar uma liste com um set das cores, do metodo collectiosn)
 *  e- exiba todas as cores que começam com a letra "v"
 *  f- exiba todas as cores que não começam com a letra  "v"
 *  g- limpe o conjunto
 *  h- Confira se o conjunto está vazio*/

public class ArcoIris {
    public static void main(String[] args) {


        //conjunto contendo as cores do arco iris

        Set<Cor> arcoIris = new HashSet<>(){{
            add(new Cor("violeta"));
            add(new Cor("anil"));
            add(new Cor("azul"));
            add(new Cor("verde"));
            add(new Cor("amarelo"));
            add(new Cor("laranja"));
            add(new Cor("vermelho"));
        }};

        //a- exiba todas as cores uma abaixo da outra
        System.out.println("\n----------Todas as cores uma abaixo da outra ________________________");
        arcoIris.forEach(a -> System.out.println(a.getCor()));

        //b- a quantidade de cores do arco iris tem
        System.out.println("\nQuantidade de cores do arco iris: " + arcoIris.size());

        //c- exiba as cores em ordem alfabética
        List<Cor> cores = new  ArrayList<>();
        cores.addAll(arcoIris);
        GerenciaColecao envio;
        envio = new GerenciaColecao(cores); // envio de lista
        Cor [] coresArray = envio.getColecaoParaArray();

        System.out.print("\n");
        System.out.println("----------Cores em ordem alfabética ---------------");
        System.out.print("\n");
        Arrays.stream(coresArray).forEach(System.out::println);



        //d- exiba as cores na ordem inversa da que foi informada
        System.out.println("----------ordem inversa ---------------");
        List<Cor> coreIn = new  ArrayList<>(){{
            add(new Cor("violeta"));
            add(new Cor("anil"));
            add(new Cor("azul"));
            add(new Cor("verde"));
            add(new Cor("amarelo"));
            add(new Cor("laranja"));
            add(new Cor("vermelho"));
        }};
        Collections.reverse(coreIn);
        coreIn.forEach(a -> System.out.println(a.getCor()));


        // *  e- exiba todas as cores que começam com a letra "v"
        System.out.println("----------cores que começam com a letra v ---------------");
        Iterator<Cor> iterator = coreIn.iterator();
        while(iterator.hasNext()){ //tem proximo hasNext()
            Cor next = iterator.next();
            if(next.getCor() == "violeta" || next.getCor() == "verde"
                    || next.getCor() =="vermelho") {
                System.out.println(next);
            }
        }




        // *  f- exiba todas as cores que não começam com a letra  "v"
        System.out.println("----------cores que não começam com a letra v ---------------");
        Iterator<Cor> iterator1 = coreIn.iterator();
        while(iterator1.hasNext()){ //tem proximo hasNext()
            Cor next = iterator1.next();
            if(next.getCor() != "violeta" && next.getCor() != "verde"
                    && next.getCor() !="vermelho") {
                System.out.println(next);
            }

        }

        // *  g- limpe o conjunto
        System.out.println("---------limpamdo o conjunto ---------------");
        arcoIris.clear();
        System.out.println(arcoIris);

        // *  h- Confira se o conjunto está vazio
        System.out.println("---------conjunto está vazio---------------");
        System.out.println("Conferindo conjunto vazio: "+ arcoIris.isEmpty());

    }
}
