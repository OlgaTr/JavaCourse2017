package homework170710;

public class UseStringLinkedList {

    public static void main(String[] args) {

        StringLinkedList list = new StringLinkedList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");

        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.remove(4);
        System.out.println(list);
    }
}
