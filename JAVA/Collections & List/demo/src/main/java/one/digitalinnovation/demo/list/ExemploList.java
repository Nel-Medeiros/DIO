package one.digitalinnovation.demo.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Ricardo");
        nomes.add("Victoria");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Emanuel");

        System.out.println(nomes);
        nomes.set(3, "Kawana");

        System.out.println(nomes);
        Collections.sort(nomes);

        nomes.set(3, "Michael");
        System.out.println(nomes);

        int position = nomes.indexOf("Emanuel");
        System.out.println(position);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Maria");
        System.out.println(nomes);

        String nome = nomes.get(0);
        System.out.println(nome);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean hasMichael = nomes.contains("Michael");
        System.out.println(hasMichael);

        nomes.addAll(nomes);
        System.out.println(nomes);

        boolean listIsEmpty = nomes.isEmpty();
        System.out.println(listIsEmpty);


        for (String nomeDoItem: nomes) {
            System.out.println("-->" + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("---->" + iterator.next());
        }

        nomes.clear();
        listIsEmpty = nomes.isEmpty();
        System.out.println(listIsEmpty);
    }
}
