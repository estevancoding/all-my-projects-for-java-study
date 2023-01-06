package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetHomogeneo {

    public static void main(String[] args) {

        Set<String> lista = new HashSet<>();

        lista.add("Paulo");
        lista.add("Roberta");
        lista.add("Fernanda");
        lista.add("Marcos");
        lista.add("Marcia");

        System.out.println(lista);

        for (String nome: lista
             ) {
            System.out.println(nome);
        }

        System.out.println("----------------------------------");


        Set<String> listaAprovados = new LinkedHashSet<>();

        listaAprovados.add("Paulo");
        listaAprovados.add("Roberta");
        listaAprovados.add("Fernanda");
        listaAprovados.add("Marcos");
        listaAprovados.add("Marcia");

        System.out.println(listaAprovados);

        for (String nome: listaAprovados
        ) {
            System.out.println(nome);
        }

        System.out.println("----------------------------------");

        Set<Integer> listaReprovados = new TreeSet<>();

        listaReprovados.add(45);
        listaReprovados.add(98);
        listaReprovados.add(2);
        listaReprovados.add(75);
        listaReprovados.add(12);

        for (int num: listaReprovados
        ) {
            System.out.println(num);
        }

    }

}


