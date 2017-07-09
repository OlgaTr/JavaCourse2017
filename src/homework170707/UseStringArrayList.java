package homework170707;

public class UseStringArrayList {

    public static void main(String[] args) {

        StringArrayList list = new StringArrayList();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.get(1));

        list.set(2, "three");
        System.out.println(list);

        int i = list.size();
        System.out.println(i);

        System.out.println(list.isEmpty());

        System.out.println(list.remove("one"));
        System.out.println(list);


    }
}
