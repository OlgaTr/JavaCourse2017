package homework170627;

import homework170624.Asserts;

public class UseNumberConversion {

    public static void main(String[] args) {

        //Tests for binary system

        System.out.println(Asserts.assertEquals(NumberConversion.toBinaryString(77), "1001101"));
        System.out.println(Asserts.assertEquals(NumberConversion.toBinaryString(0), "0"));

        System.out.println(Asserts.assertNotEquals(NumberConversion.toBinaryString(55), "2"));

        //Tests for octal system

        System.out.println(Asserts.assertEquals(NumberConversion.toOctalString(5), "5"));
        System.out.println(Asserts.assertEquals(NumberConversion.toOctalString(278), "426"));

        System.out.println(Asserts.assertNotEquals(NumberConversion.toOctalString(777), "19"));

        //Tests for hexadecimal system

        System.out.println(Asserts.assertEquals(NumberConversion.toHexString(1550), "60E"));
        System.out.println(Asserts.assertEquals(NumberConversion.toHexString(1), "1"));

        System.out.println(Asserts.assertNotEquals(NumberConversion.toHexString(345), "1"));

        //Tests for universal converter

        System.out.println(Asserts.assertEquals(NumberConversion.toString(1105678, 35), "PRKS"));
        System.out.println(Asserts.assertEquals(NumberConversion.toString(27, 3), "1000"));
        System.out.println(Asserts.assertEquals(NumberConversion.toString(27, 37), "Numerical system is not valid"));

        System.out.println(Asserts.assertNotEquals(NumberConversion.toString(123, 5), "7"));

    }
}
