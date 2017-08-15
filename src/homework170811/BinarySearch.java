package homework170811;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11};
        System.out.println(binarySearch(array, 3));
        System.out.println(binarySearch(array, 0));
        System.out.println(binarySearch(array, 2));
        System.out.println(binarySearch(array, 12));
        System.out.println(binarySearch(array, 6));
    }

    public static int binarySearch(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -lo;
    }
}
