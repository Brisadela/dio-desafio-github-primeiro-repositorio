package br.com.dio.calculadora;

public class Calculadora extends Operandos {

    private double resultado = 0;

    public Calculadora(double x, double y) {
        super(x, y);
    }

    public double soma(){

        return  resultado = this.getX() + this.getY();

    }

    public double subtracao(){

        if(this.getX() > this.getY()){
            resultado = this.getX()-this.getY();
        }else{
            resultado = this.getY()-this.getX();
        }
        return resultado;
    }

    public double multiplicacao(){

        if(this.getX() > this.getY()){
            resultado = this.getX()*this.getY();
        }else{
            resultado = this.getY()*this.getX();
        }
        return resultado;
    }

    public double divisao(){

        if(this.getX() > this.getY()){
            resultado = this.getX()/this.getY();
        }else{
            resultado = this.getY()/this.getX();
        }
        return resultado;
    }

    public double restodivisao(){

        if(this.getX() > this.getY()){
            resultado = this.getX()%this.getY();
        }else{
            resultado = this.getY()%this.getX();
        }
        return resultado;
    }

    @Override
    public String toString() {

        return String.format("resultado %.1f", this.resultado);

    }
}
