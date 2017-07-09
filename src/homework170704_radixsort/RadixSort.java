package homework170704_radixsort;

import java.util.ArrayList;

public class RadixSort {

    public static ArrayList<Integer> sort(int[] nums, int digits) {

        ArrayList<Integer> numsCopy = new ArrayList<>();
        Object radixTable []= new Object[10];

        for (int i = 0; i < nums.length; i++) {
            numsCopy.add(nums[i]);
        }

        for (int i = 0; i < 10; i++) {
            radixTable[i] = new ArrayList<Integer>();
        }

        for (int j = 1; j <= digits; j++) {
            for (int i = 0; i < nums.length; i++) {
                int temp = numsCopy.get(i);
                int z = (temp % ((int) Math.pow(10, j))) /((int) Math.pow(10, j - 1));
                ((ArrayList) radixTable[z]).add(temp);
            }

            numsCopy = new ArrayList<>();
            for (int z = 0; z < 10; z++) {
                if (!((ArrayList) radixTable[z]).isEmpty()) {
                    for (Object i : ((ArrayList) radixTable[z])) {
                        numsCopy.add((int)i);
                    }
                    ((ArrayList) radixTable[z]).clear();
                }
            }
        }

        return numsCopy;
    }
}