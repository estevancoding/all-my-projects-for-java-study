package Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueTreino {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.off("Senhor Dos Aneis");
        livros.push("Duna");
        livros.push("O Hobbit");
        livros.push("1984");

        System.out.println(livros.peek());




    }

}
