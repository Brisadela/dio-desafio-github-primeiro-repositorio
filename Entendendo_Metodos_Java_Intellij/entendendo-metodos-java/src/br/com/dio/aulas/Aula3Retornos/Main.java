package br.com.dio.aulas.Aula3Retornos;

public class Main {
    public static void main(String[] args) {
        //execução exemplo  quadrilatero

        System.out.println("Exercicio Retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Area do quadrado " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Area do retangulo " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Area do trapézio " + areaTrapezio);


    }
}
