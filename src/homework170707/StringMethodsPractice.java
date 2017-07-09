package homework170707;

import homework170624.Asserts;

public class StringMethodsPractice {
    public static void main(String[] args) {

        String s = "   Hello ";
        String s2 = "Hello";  // trimmed
        String s3 = "  Hello";
        String s4 = "Hello  ";
        String s5 = "  He l l o  ";
        String s6 = "";


        System.out.println(Asserts.assertEquals(trim(s6), ""));

    }

    private static String trim(String s) {

        if (s == null || s.length() == 0) {
            return s;
        }

        if (hasNoTrailingOrLeadingSpaces(s)) {
            return s;
        }

        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > ' ') {
                index = i;
                break;
            }
        }
        s = s.substring(index);

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) > ' ') {
                index = i;
                break;
            }
        }
        s = s.substring(0, index + 1);

        return s;
    }

    private static boolean hasNoTrailingOrLeadingSpaces(String s) {
        return s.indexOf(' ') != 0 && s.lastIndexOf(' ') != s.length() - 1;
    }

}
