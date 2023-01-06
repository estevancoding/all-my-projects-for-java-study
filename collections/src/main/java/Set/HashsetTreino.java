package Set;

import java.util.HashSet;
import java.util.Set;

public class HashsetTreino {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(20);
        conjunto.add(30);
        conjunto.add(40);
        conjunto.add(50);
        conjunto.add(60);


        System.out.println(conjunto.size());
        System.out.println(conjunto.isEmpty());
        System.out.println(conjunto.remove(30));
        System.out.println(conjunto.size());
        System.out.println("----------------------------");
        System.out.println(conjunto.contains(30));
        System.out.println(conjunto.contains(50));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4123);

        conjunto.addAll(nums);
        conjunto.remove(4123);
        System.out.println(conjunto);

        conjunto.retainAll(nums);

        conjunto.clear();
        System.out.println(conjunto);


    }


    




}
