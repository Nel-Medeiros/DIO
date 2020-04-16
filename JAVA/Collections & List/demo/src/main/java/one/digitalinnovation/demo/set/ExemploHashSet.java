package one.digitalinnovation.demo.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        // Adiciona as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        //Remove a nota do set
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);

        //Retorna a quantidade de itens no set
        System.out.println(notasAlunos.size());



        notasAlunos.add(null);
        System.out.println(notasAlunos);

        //Navega em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();

        for (Double nota: notasAlunos) {
            System.out.println("-->" + nota);
        }

        while (iterator.hasNext()) {
            System.out.println("---->" + iterator.next());
        }

        notasAlunos.clear();

        System.out.println(notasAlunos.isEmpty());



    }
}
