package one.digitalinnovation.demo.map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        //Cadastrar estudantes na HashTable
        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        //Alterar o value de uma key
        estudantes.put("Pedro", 55);
        System.out.println(estudantes);

        //Remove uma entrada, dada sua chave
        estudantes.remove("Pedro");
        System.out.println(estudantes);

        //Recupera um estudante dada sua chave
        int idadeEstudante = estudantes.get("Mariana");
        System.out.println(idadeEstudante);

        //Informa o tamanho da table
        System.out.println(estudantes.size());

        //Navega/itera nos registros da table
        for (Map.Entry<String, Integer> entry : estudantes.entrySet()){
            System.out.println("->" + entry.getKey() + " -- " + entry.getValue());
        }

        for (String key : estudantes.keySet()){
            System.out.println("-->" + key + " -- " + estudantes.get(key));
        }
        System.out.println(estudantes);

    }
}
