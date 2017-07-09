package homework170704_radixsort;

import homework170701_genome.DataGeneration;

import java.util.ArrayList;


public class UseRadixSort {

    private static final int DATA_SIZE = 10000;
    private static final int DIGITS = 4;

    public static void main(String[] args) {

        int[] nums = DataGeneration.generate(DATA_SIZE, DIGITS);
        ArrayList<Integer> radix;

        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

        radix = RadixSort.sort(nums, DIGITS);

        for (int i: radix) {
            System.out.print(i + " ");
        }

    }
}
