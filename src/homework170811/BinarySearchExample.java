package homework170811;

import java.util.*;

public class BinarySearchExample {

    public static void main(String[] args) {
        List<A> list = new LinkedList<>();
        System.out.println("LinkedList");

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(new A());
        }
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;

        long start2 = System.currentTimeMillis();
        Collections.sort(list);
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;

        A key = new A();
        long start3 = System.currentTimeMillis();
        Collections.binarySearch(list, key);
        long finish3 = System.currentTimeMillis();
        long timeConsumedMillis3 = finish3 - start3;
        
        System.out.println("Adding 1000000 elements: " + timeConsumedMillis1 + " millisec.");
        System.out.println("Sorting 1000000 elements: " + timeConsumedMillis2 + " millisec.");
        System.out.println("Binary search: " + timeConsumedMillis3 + " millisec.");
        System.out.println("Total time: " + (timeConsumedMillis1 + timeConsumedMillis2 + timeConsumedMillis3) + " millisec.");

        List<A> list2 = new ArrayList<>();
        System.out.println();
        System.out.println("ArrayList");

        start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list2.add(new A());
        }
        finish1 = System.currentTimeMillis();
        timeConsumedMillis1 = finish1 - start1;

        start2 = System.currentTimeMillis();
        Collections.sort(list2);
        finish2 = System.currentTimeMillis();
        timeConsumedMillis2 = finish2 - start2;

        start3 = System.currentTimeMillis();
        Collections.binarySearch(list2, key);
        finish3 = System.currentTimeMillis();
        timeConsumedMillis3 = finish3 - start3;

        System.out.println("Adding 1000000 elements: " + timeConsumedMillis1 + " millisec.");
        System.out.println("Sorting 1000000 elements: " + timeConsumedMillis2 + " millisec.");
        System.out.println("Binary search: " + timeConsumedMillis3 + " millisec.");
        System.out.println("Total time: " + (timeConsumedMillis1 + timeConsumedMillis2 + timeConsumedMillis3) + " millisec.");


        Set<A> set = new TreeSet<>();
        System.out.println();
        System.out.println("TreeSet");

        start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            set.add(new A());
        }
        finish1 = System.currentTimeMillis();
        timeConsumedMillis1 = finish1 - start1;

        start3 = System.currentTimeMillis();
        set.contains(key);
        finish3 = System.currentTimeMillis();
        timeConsumedMillis3 = finish3 - start3;

        System.out.println("Adding 1000000 elements in the sorted order: " + timeConsumedMillis1 + " millisec.");
        System.out.println("Binary search: " + timeConsumedMillis3 + " millisec.");
        System.out.println("Total time: " + (timeConsumedMillis1 + timeConsumedMillis3) + " millisec.");

    }
}

class A implements Comparable<A> {
    static Random r = new Random(1);
    int x = r.nextInt(1000000);

    @Override
    public String toString() {
        return Integer.toString(x);
    }

    @Override
    public int compareTo(A other) {
        return x - other.x;
    }
}
