package homework170704;

public class ArrayMethods {
    public static String toString(Object[] matrix) {

        String res = "[";

        for (int i = 0; i < matrix.length; i ++) {
            if (i != matrix.length - 1) {
                res += matrix[i] + ", ";
            } else {
                res += matrix[i];
            }
        }
        res += "]";
        return res;
    }
}

