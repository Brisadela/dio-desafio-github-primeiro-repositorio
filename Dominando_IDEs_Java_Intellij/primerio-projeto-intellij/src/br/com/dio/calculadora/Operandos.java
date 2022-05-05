package br.com.dio.calculadora;

public class Operandos {

    private double primeiroOperando;
    private double segundoOperando;

    public Operandos(double primeiroOperando, double segundoOperando) {
        this.primeiroOperando = primeiroOperando;
        this.segundoOperando = segundoOperando;
    }

    public double getPrimeiroOperando() {
        return primeiroOperando;
    }

    public void setPrimeiroOperando(double primeiroOperando) {
        this.primeiroOperando = primeiroOperando;
    }

    public double getSegundoOperando() {
        return segundoOperando;
    }

    public void setSegundoOperando(double segundoOperando) {
        this.segundoOperando = segundoOperando;
    }


}
