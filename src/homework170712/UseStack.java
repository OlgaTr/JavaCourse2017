package homework170712;

import homework170624.Asserts;

public class UseStack {

    public static void main(String[] args) {
        StringStack stack = new StringStack();

        System.out.println(Asserts.assertEquals(stack.push("one"), true));
        System.out.println(Asserts.assertEquals(stack.push("two"), true));
        System.out.println(Asserts.assertEquals(stack.push("three"), true));

        System.out.println(Asserts.assertEquals(stack.toString(), "[one, two, three]"));

        System.out.println(Asserts.assertEquals(stack.size(), 3));

        System.out.println(Asserts.assertEquals(stack.pop(), "three"));

        System.out.println(Asserts.assertEquals(stack.tos(), "two"));

        System.out.println(stack);

    }
}
