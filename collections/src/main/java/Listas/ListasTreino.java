package Listas;

import java.util.ArrayList;
import java.util.List;

public class ListasTreino {

    public static void main(String[] args) {

        List<Usuario> lista =  new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("Paulo"));
        lista.add(new Usuario("Malu"));
        lista.add(new Usuario("Milena"));
        lista.add(new Usuario("Plinio"));

        for (Usuario nome: lista
             ) {
            System.out.println(nome);
        }
        System.out.println("------------------------");
        System.out.println(lista.get(2));

        lista.remove(2);

        System.out.println("------------------------");
        for (Usuario nome: lista
             ) {
            System.out.println(nome);
        }

    }

}
