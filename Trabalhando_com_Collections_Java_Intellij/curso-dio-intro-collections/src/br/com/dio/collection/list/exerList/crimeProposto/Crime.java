package br.com.dio.collection.list.exerList.crimeProposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Ultilizando lista, faça um programa que faça 5 perguntas para uma
 * pessoa sobre um crime as perguntas são:
 * 1- Telefonou para a vítima?
 * 2- Esteve no local do crime?
 * 3- Mora perto da vítima?
 * 4- Devia para a vítima?
 * 5- Já trabalhou com a vítima?
 *
 * Se a a pessoa responder positivamente a 2 questão ela deve
 * ser considerada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
 * "Assasina. Caso contrario, ela será classificada como "Inocente"
 * criar uma lista com as perguntas,  lista com s e n, depois filtro para verificação e definição*/
public class Crime {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String resposta;
        int sim = 0;

        List<Perguntas> perguntas = new ArrayList<Perguntas>() {{
            add(new Perguntas("1- Telefonou para a vítima?", "Sim", "Não"));
            add(new Perguntas("2- Esteve no local do crime?", "Sim", "Não"));
            add(new Perguntas("3- Mora perto da vítima?", "Sim", "Não"));
            add(new Perguntas("4- Devia para a vítima?", "Sim", "Não"));
            add(new Perguntas("5- Já trabalhou com a vítima?", "Sim", "Não"));
        }};

        List<String> respostas = new ArrayList<>();

        for (Perguntas p : perguntas) {
            System.out.println(p.toString());
            resposta  =  ler.next();
            if (resposta.equalsIgnoreCase("Sim")){
                sim++;
                respostas.add(resposta);
            }

            System.out.println("\n");
        }

        System.out.println("----------sentença ---------------");
            switch (sim){
                case 0:
                case 1:  System.out.println("Inocente");
                    break;
                case 2:  System.out.println("Suspeita");
                break;
                case 3:
                case 4:
                    System.out.println("Cúmplice");
                    break;
                case 5: System.out.println("Assasina");
                    break;
                default: System.out.println("resposta indefinida");
                    break;
            }

        }


}
