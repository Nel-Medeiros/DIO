package one.digitalinnovation.demo.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        //Adiciona os campeões mundiais fifa no map
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Italia", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("Franca", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        //Atualiza o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);
        System.out.println(campeoesMundialFifa);

        //Retorna o value de Argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));

        //Retorna um boolean dizendo se existe ou não um campeão Franca
        System.out.println(campeoesMundialFifa.containsKey("Franca"));

        //Remove campeão Franca
        campeoesMundialFifa.remove("Franca");

        //Retorna um boolean dizendo se existe ou não campeão Franca
        System.out.println(campeoesMundialFifa.containsKey("Franca"));

        //Retorna um boolean dizendo se existe ou não seleção hexacampeã
        System.out.println(campeoesMundialFifa.containsValue(6));

        //Retorna o tamanho do map
        System.out.println(campeoesMundialFifa.size());
        System.out.println(campeoesMundialFifa);

        //Navega nos registros do map
        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        for (String key : campeoesMundialFifa.keySet()) {
            System.out.println(key + " ---- " + campeoesMundialFifa.get(key));
        }

        System.out.println(campeoesMundialFifa);

        //Limpa o map
        campeoesMundialFifa.clear();
        System.out.println(campeoesMundialFifa.size());

    }
}
