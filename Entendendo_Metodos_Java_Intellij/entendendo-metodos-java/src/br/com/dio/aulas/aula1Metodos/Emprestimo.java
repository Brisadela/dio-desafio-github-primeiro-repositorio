package br.com.dio.aulas.aula1Metodos;

public class Emprestimo {

    public static int getDuasPrcelas(){
       return 2;
    }

    public static int getTresPrcelas(){
        return 3;
    }

    public static double getTaxaDuasPrcelas(){
        return 0.3;
    }
    public static double getTaxaTresPrcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas){

        if(parcelas == 2){
            
            double valorFinal = valor +(valor * getTaxaDuasPrcelas());
            System.out.println("Valor final de emprestimo para 2 parcelas: R$" + valorFinal);
            
        } else if (parcelas == 3) {

            double valorFinal = valor +(valor * getTaxaTresPrcelas());
            System.out.println("Valor final de emprestimo para 3 parcelas: R$" + valorFinal);
            
        }else{
            System.out.println("Quantidade de parcelas não aceita.");
        }
    }
}
