package br.com.dio.aulas.aula1Metodos;

public class Mensagem {

    public static void obterMensagem(int hora){

        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBomTarde();
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBomNoite();
            default:
                System.out.println("Hora invalida");

        }
    }

    private static void mensagemBomNoite() {
        System.out.println("Boa Noite!");
    }

    private static void mensagemBomTarde() {
        System.out.println("Boa Tarde!");
    }

    private static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

}
