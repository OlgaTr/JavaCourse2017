package homework170724;

public class TakeCare {

    public static void main(String[] args) {

        Pet cat = new Cat();
        System.out.println("Cat");
        System.out.println("******************");
        cat.feed();
        System.out.println("==================");
        cat.feed();
        System.out.println("==================");
        cat.play();
        System.out.println("==================");
        cat.bathe();
        System.out.println("==================");
        cat.feed();
        System.out.println("******************");

        Pet rat = new Rat();
        System.out.println("Rat");
        System.out.println("******************");
        rat.play();
        System.out.println("==================");
        rat.feed();
        System.out.println("==================");
        rat.bathe();
        System.out.println("==================");
        rat.play();
        System.out.println("==================");
        rat.feed();
        System.out.println("==================");
        rat.bathe();
        System.out.println("==================");
        rat.feed();
    }
}
