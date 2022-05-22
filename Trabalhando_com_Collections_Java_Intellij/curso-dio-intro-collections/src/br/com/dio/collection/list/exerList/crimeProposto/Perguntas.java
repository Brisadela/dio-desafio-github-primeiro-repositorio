package br.com.dio.collection.list.exerList.crimeProposto;

public class Perguntas {

    private String pergunta;
    private String sim;
    private String nao;




    public Perguntas(String pergunta,String sim,String nao) {
        this.pergunta = pergunta;
        this.sim = sim;
        this.nao = nao;



    }

    public String getPergunta() {
        return pergunta;
    }


    @Override
    public String toString() {
        return
                  pergunta + '\'' +
                 sim + '\'' +
                 nao + '\''
                ;
    }
}
