package homework170627;

public class NumberConversion {

    public static String toBinaryString(int x) {
        if (x == 0) {
            return "0";
        }
        String temp = "";
        while (x >= 1) {
            temp += x % 2;
            x /= 2;
        }
        return reverseString(temp);
    }

    public static String toOctalString (int x) {
        if (x == 0) {
            return "0";
        }
        String temp = "";
        while (x >= 1) {
            temp += x % 8;
            x /= 8;
        }
        return reverseString(temp);
    }

    public static String toHexString(int x) {
        if (x == 0) {
            return "0";
        }
        String temp = "";
        int temporary;
        while (x >= 1) {
            temporary = x % 16;
            if (temporary < 10) {
                temp += temporary;
            } else {
                temp += (char) (65 + (temporary - 10));
            }
            x /= 16;
        }
        return reverseString(temp);
    }

    public static String toString (int x, int system) {
        if (x == 0) {
            return "0";
        }
        if (system > 36) {
            return "Numerical system is not valid";
        }
        String temp = "";
        int temporary;
        while (x >= 1) {
            temporary = x % system;
            if (temporary < 10) {
                temp += temporary;
            } else {
                temp += (char) (65 + (temporary - 10));
            }
            x /= system;
        }

        return reverseString(temp);
    }

    private static String reverseString (String temp) {
        String result = "";
        for (int i = temp.length() - 1; i >= 0; i --) {
            result += temp.charAt(i);
        }
        return result;
    }

}
