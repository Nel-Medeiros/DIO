package one.digitalinnovation.demo.map;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();

        //Monta a árvore com as capitais
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianopolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "Sao Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeira capital(chave) no topo da árvore
        System.out.println(treeCapitais.firstKey());

        //Retorna a última capital(chave) no final da árvore
        System.out.println(treeCapitais.lastKey());

        //Retorna a primeira capital(chave) abaixo da capital(chave) passada como parâmetro
        System.out.println(treeCapitais.lowerKey("SC"));

        //Retorna a primeira capital(chave) acima da capital(chave) passada como parâmetro
        System.out.println(treeCapitais.higherKey("SC"));

        //Exibe todas as capitais
        System.out.println(treeCapitais);

        //Retorna a primeira chave e seu valor no topo da árvore
        System.out.println(treeCapitais.firstEntry().getKey() + "-" + treeCapitais.firstEntry().getValue());

        //Retorna a última chave e seu valor no final da árvore
        System.out.println(treeCapitais.lastEntry().getKey() + "-" + treeCapitais.lastEntry().getValue());

        //Remove a primeira key e seu value dá árvore
        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();

        //Remove a última key e seu value da árvore
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();

        System.out.println(treeCapitais);

        //Navega em todas as chaves do iterator
        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println("->" + key + " - " + treeCapitais.get(key));
        }

        for (String capital : treeCapitais.keySet()){
            System.out.println("-->" + capital + " - " + treeCapitais.get(capital));
        }

        for (Map.Entry<String, String> capital : treeCapitais.entrySet()){
            System.out.println("--->" + capital.getKey() + " - " + capital.getValue());
        }
    }
}
