package practiceJava2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Practice1 {
    void display(Object o) {
        System.out.println("object");
    }

    void display(String str) {
        System.out.println("string");

    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("a");
        sb.append("123456781234567891164656565646464644 ");
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        new Practice1().display(null);
        System.out.println(false != false == !true);
        Random random = new Random();
        System.out.println(random.nextInt(100));
        System.out.println(random.ints(1, 100).limit(1));

    }


    class Parent {
        Child display(int i) {
            System.out.println("Parent");
            return null;
        }
    }

    class Child extends Parent {
        Child display(int i) {
            System.out.println("Child");
            return null;
        }
    }
}


class Compute {
    public String isSubset(long a1[], long a2[], long n, long m) {

        Set<Long> s = new HashSet<>();

        for (int i = 0; i < n; i++) {
            s.add(a1[i]);
        }
        for (long num : a2) {
            if (!s.contains(num)) {
                return "NO";
            }
        }
        return "YES";
    }
}