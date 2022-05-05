package br.com.dio.calculadora;

public class Calculadora extends Operandos {

    private double resultado = 0;

    public Calculadora(double primeiroOperando, double segundoOperando) {
        super(primeiroOperando, segundoOperando);
    }

    public double soma(){

        return  resultado = this.getPrimeiroOperando() + this.getSegundoOperando();

    }

    public double subtracao(){

        if(this.getPrimeiroOperando() > this.getSegundoOperando()){
            resultado = this.getPrimeiroOperando()-this.getSegundoOperando();
        }else{
            resultado = this.getSegundoOperando()-this.getPrimeiroOperando();
        }
        return resultado;
    }

    public double multiplicacao(){

        if(this.getPrimeiroOperando() > this.getSegundoOperando()){
            resultado = this.getPrimeiroOperando()*this.getSegundoOperando();
        }else{
            resultado = this.getSegundoOperando()*this.getPrimeiroOperando();
        }
        return resultado;
    }

    public double divisao(){

        if(this.getPrimeiroOperando() > this.getSegundoOperando()){
            resultado = this.getPrimeiroOperando()/this.getSegundoOperando();
        }else{
            resultado = this.getSegundoOperando()/this.getPrimeiroOperando();
        }
        return resultado;
    }

    public double restodivisao(){

        if(this.getPrimeiroOperando() > this.getSegundoOperando()){
            resultado = this.getPrimeiroOperando()%this.getSegundoOperando();
        }else{
            resultado = this.getSegundoOperando()%this.getPrimeiroOperando();
        }
        return resultado;
    }

    @Override
    public String toString() {

        return String.format("resultado %.1f", this.resultado);

    }
}
