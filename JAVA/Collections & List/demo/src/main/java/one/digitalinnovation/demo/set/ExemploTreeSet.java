package one.digitalinnovation.demo.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Sao Paulo");
        treeCapitais.add("Rio de Janeiro");
        //treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //Remove um elemento da árvore
//        treeCapitais.remove("Rio de Janeiro");
//        System.out.println(treeCapitais);

        //Retorna a primeira capital do topo da árvore
        System.out.println(treeCapitais.first());

        //Retorna a última capital no final da árvore
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital abaixo na árvore da capital passada como parâmetro
        System.out.println(treeCapitais.lower("Florianopolis"));

        //Retorna a primeira capital acima na árvore da capital passada como parâmetro
        System.out.println(treeCapitais.higher("Florianopolis"));

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Retorna e remove a primeira capital no topo da árvore
        System.out.println(treeCapitais.pollFirst());

        //Retorna e remove a última capital no final da árvore
        System.out.println(treeCapitais.pollLast());

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Navega em todos os itens do iterator
        Iterator<String> iterator = treeCapitais.iterator();

        for (String capital: treeCapitais){
            System.out.println("-->" + capital);
        }

        while (iterator.hasNext()){
            System.out.println("---->" + iterator.next());
        }

        //Retorna a quantidade de elementos da árvore
        System.out.println(treeCapitais.size());

        //Retorna um boolean informando e a árvore está ou não vazia
        System.out.println(treeCapitais.isEmpty());

        //Limpa a árvore
        treeCapitais.clear();
        System.out.println(treeCapitais.isEmpty());

    }
}
