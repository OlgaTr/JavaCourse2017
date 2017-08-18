package homework170809;

import homework170809.Dictionary.Pair;

import java.util.Random;

public class UseDictionary {

    public static void main(String[] args) {
        Dictionary<String, String> d1 = new Dictionary<>();

        d1.put("Pete", "New York");
        d1.put("John", "Boston");
        d1.put("Вася", "Москва");
        d1.put("Петя", "Москва");
        d1.put("Боря", "Москва");
        d1.put("Оля", "Москва");
        d1.put("Жанна", "Москва");
        d1.put("Маша", "Москва");
        d1.put("Вано", "Москва");

        for (Pair pair : d1) {
            System.out.println(pair.key + " : " + pair.value);
        }

        d1.delete("Вася");
        System.out.println();
        for (Pair pair : d1) {
            System.out.println(pair.key + " : " + pair.value);
        }
        System.out.println();


        Dictionary<Integer, Integer> d = new Dictionary<>();
        System.out.println("1000 elements:");
        fillDictionaryIntegers(d, 1000);
        getElement(d, 100);
        System.out.println("Number of elements: " + numberOfElements(d));
        System.out.println("Size: "+ d.getSize());

        d = new Dictionary<>();
        System.out.println();
        System.out.println("10000 elements:");
        fillDictionaryIntegers(d, 10000);
        getElement(d, 100);
        System.out.println("Number of elements: " + numberOfElements(d));
        System.out.println("Size: "+ d.getSize());

        d = new Dictionary<>();
        System.out.println();
        System.out.println("100000 elements:");
        fillDictionaryIntegers(d, 100000);
        getElement(d, 100);
        System.out.println("Number of elements: " + numberOfElements(d));
        System.out.println("Size: "+ d.getSize());

    }

    private static void addIntegers (Dictionary<Integer, Integer> d) {
        Random r = new Random();
        Random r1 = new Random();
        int key = r.nextInt(1000000000);
        int value = r1.nextInt(1000000000);
        d.put(key, value);
    }

    private static void fillDictionaryIntegers (Dictionary<Integer, Integer> d, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            addIntegers(d);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Adding " + n + " elements: " + (finish - start) + " nanosec.");
    }

    private static void getElement (Dictionary<Integer, Integer> d, int n) {
        long start = System.nanoTime();
        d.get(n);
        long finish = System.nanoTime();
        System.out.println("Getting an element: " + (finish - start) + " nanosec.");
    }

    private static int numberOfElements (Dictionary<Integer, Integer> d) {
        int counter = 0;
        long start = System.nanoTime();
        for (Pair pair : d) {
            counter++;
        }
        long finish = System.nanoTime();
        System.out.println("Counting elements: " + (finish - start) + " nanosec.");
        return counter;
    }
}
