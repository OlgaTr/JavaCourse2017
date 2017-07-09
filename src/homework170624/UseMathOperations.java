package homework170624;

public class UseMathOperations {
    public static void main(String[] args) {

        // tests for "Sign of a number"

        System.out.println(SimpleUnit.assertEquals(Sign.sign(5), 1));
        System.out.println(SimpleUnit.assertEquals(Sign.sign(-100000), -1));
        System.out.println(SimpleUnit.assertEquals(Sign.sign(0), 0));
        System.out.println(SimpleUnit.assertEquals(Sign.sign(Integer.MAX_VALUE), 1));

        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(2000), 0));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(-5), 1));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(0), -1));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(Integer.MIN_VALUE), 0));

        //tests for "Remainder after division"

        System.out.println(SimpleUnit.assertEquals(Remainder.mod(21, 2), 1));
        System.out.println(SimpleUnit.assertEquals(Remainder.mod(103, 5), 3));
        System.out.println(SimpleUnit.assertEquals(Remainder.mod(5, 103), 5));

        System.out.println(SimpleUnit.assertNotEquals(Remainder.mod(335, 3), 1));

        //tests for "Primality test"

        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(2), true));
        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(1777), true));
        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(48), false));
        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(1), false));

        System.out.println(SimpleUnit.assertNotEquals(IsPrime.isPrime(30), true));
        System.out.println(SimpleUnit.assertNotEquals(IsPrime.isPrime(31), false));
        System.out.println(SimpleUnit.assertNotEquals(IsPrime.isPrime(-47), true));

        //tests for "Fibonacci"

        System.out.println(SimpleUnit.assertEquals(Fibonacci.isFibonacci(10946), true));
        System.out.println(SimpleUnit.assertEquals(Fibonacci.isFibonacci(1), true));
        System.out.println(SimpleUnit.assertEquals(Fibonacci.isFibonacci(0), false));


        System.out.println(SimpleUnit.assertNotEquals(Fibonacci.isFibonacci(1597), false));
        System.out.println(SimpleUnit.assertNotEquals(Fibonacci.isFibonacci(-5), true));


    }
}
