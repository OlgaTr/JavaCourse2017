package homework170701_genome;

import java.util.HashMap;

public class GenomeWithHashMap {

    private static final int GENOME_SIZE = 300;
    private static final int WORD_SIZE = 4;

    public static void main(String[] args) {

        char[] data = DataGeneration.generate(GENOME_SIZE);
        HashMap<Integer, String> map = new HashMap<>();
        int counter = 0;

        for (char c : data) {
            System.out.print(c);
        }

        System.out.println();
        System.out.println("The words appeared in the data set more than once:");

        for (int i = 0; i < data.length - WORD_SIZE; i++) {
            String word = new String(data, i, WORD_SIZE);
            if (map.containsValue(word)) {
                System.out.println(word);
                counter++;
            } else {
                map.put(i, word);
            }
        }
        System.out.println("The number of repetitions: " + counter);
    }
}