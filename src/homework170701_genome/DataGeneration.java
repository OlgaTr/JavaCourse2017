package homework170701_genome;

import java.util.Random;


public class DataGeneration {
    static final byte[]  ALPHABET = {'A', 'C', 'G', 'T'};

    static public char[] generate(int size) {
        char[] data = new char[size];
        int temp;
        Random random = new Random();

        for (int i = 0; i < size; i++){
            temp = random.nextInt(ALPHABET.length);
            data[i] = (char) ALPHABET [temp];
        }
        return data;
    }

    public static int[] generate(int size, int digits) {
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            nums[i] = random.nextInt((int) Math.pow(10, digits));
        }
        return nums;
    }
}
