package homework170624;

import java.util.ArrayList;

public class Fibonacci {
    public static boolean isFibonacci(int a) {
        if (a == 1) return true;
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();
        fibonacci.add(1);
        fibonacci.add(1);
        for (int i = 2; ; i++) {
            fibonacci.add(fibonacci.get(i - 2) + fibonacci.get(i - 1));
            if (fibonacci.get(i) == a) return true;
            if (fibonacci.get(i) > a) return false;
        }
    }
}

