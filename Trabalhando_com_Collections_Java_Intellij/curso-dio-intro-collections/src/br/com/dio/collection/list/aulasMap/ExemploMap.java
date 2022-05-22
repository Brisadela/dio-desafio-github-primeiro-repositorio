package br.com.dio.collection.list.aulasMap;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionario que relacione os modelos e seu respectivos valores");

        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15.2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson esta no dicionario " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno " + carrosPopulares.get("uno"));

        //exiba o terceiro modelo adicionado -- não possui

        //exiba os modelos
        System.out.println("exiba os modelos ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        //exiba os consumos
        System.out.println("exiba os consumos dos carros ");
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);

        //exiba o modelo mais economico e seu consumo
        System.out.println("exiba o modelo mais economico e seu consumo");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();

        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
             System.out.println("Modelo mais eficiente: "+ modeloMaisEficiente + " - " + consumoMaisEficiente);
        }
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);

        //2parte
        System.out.println("exiba o modelo menos economico e seu consumo");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.println("Exiba a soma dos consumos: ");
        Iterator <Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(" soma dos consumos: "+ soma);

        //exiba a media do consumo
        System.out.println(" Media dos consumos: "+ (soma/carrosPopulares.size()));

        //remova os modelos com consumos iguais a 15.6
        Iterator <Double> iterator1 = carrosPopulares.values().iterator();

        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        //exiba o dicionario ordenado pelos modelos
        System.out.println("exiba o dicionario ordenado pelos modelos");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        //apague o dicionario de carros
        carrosPopulares.clear();
        //confira se esta vazio
        System.out.println( "Conferindo se esta vazio"+ carrosPopulares.isEmpty());

    }
}
