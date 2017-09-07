package homework170816;

public class BitRadixSort {

    public static void main(String[] args) {

        int[] a = new int[] {3, 6, 0, 15, 7, 125};
        sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void sort(int[] numbers) {
        int n = numbers.length;
        int[] aux = new int[n];

        for (int i = 0; i < 32; i++) {
            int[] c = new int[2];

            for (int j = 0; j < n; j++) {
                c[bitShift(numbers[j], i)] ++;
            }
            c[1] += c[0];

            for (int j = n - 1; j >= 0; j--) {
                aux[--c[bitShift(numbers[j], i)]] = numbers[j];
            }

            for (int j = 0; j < n; j++) {
                numbers[j] = aux[j];
            }
        }
    }

    public static int bitShift(int n, int d) {
        return (n >> d) & 1;
    }

}
