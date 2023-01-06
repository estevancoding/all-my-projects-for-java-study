package Queues;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> nums = new LinkedList<>();

        nums.offer(48); // retorna false caso não tenha mais espaço
        nums.add(76); // lanca uma exceção caso não tenha mais espaço

        nums.offer(123);
        nums.offer(12);
        nums.offer(31);

        for (int n: nums
             ) {
            System.out.println(n);
        }

        System.out.println("------------------\n" + nums.peek()); // retorna null caso não tenha nada
        System.out.println("------------------\n" + nums.peekLast());
        System.out.println("------------------\n" + nums.element()); // lanca uma exception caso não tenha nada


        System.out.println(nums.poll()); // retorna o primeiro elemento e em seguida remove ele, caso não tenha nada retorna null
        System.out.println(nums.poll());
        System.out.println(nums.poll());

        System.out.println("-------------------");

        System.out.println(nums.remove()); // retorna o primeiro elemento e em seguida remove ele, caso não lanca uma exception
        System.out.println(nums.remove());










    }

}
