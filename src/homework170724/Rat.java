package homework170724;

public class Rat implements Pet{

    Brain brain = new Hungry(this);

    @Override
    public void feed() {
        brain.feed();
    }

    @Override
    public void play() {
        brain.play();
    }

    @Override
    public void bathe() {
        brain.bathe();
    }

    public void eat() {
        System.out.println("Eats");
    }

    public void twitch() {
        System.out.println("Twitches its whiskers");
    }

    public void sniff() {
        System.out.println("Sniffs");
    }

    public void grind() {
        System.out.println("Grinds its teeth");
    }

    public void squeak() {
        System.out.println("Squeaks");
    }

    public void run() {
        System.out.println("Runs");
    }

    public void jump() {
        System.out.println("Jumps");
    }

    public void wag() {
        System.out.println("Wags its tail");
    }

    public void groom() {
        System.out.println("Grooms itself");
    }
}

class Hungry implements Brain {

    private Rat rat;

    public Hungry (Rat rat) {
        this.rat = rat;
    }

    @Override
    public void feed() {
        rat.sniff();
        rat.twitch();
        rat.eat();
        rat.brain = new Fed(rat);
    }

    @Override
    public void play() {
        rat.grind();
    }

    @Override
    public void bathe() {
        rat.grind();
        rat.squeak();
    }
}

class Fed implements Brain {

    private Rat rat;

    public Fed(Rat rat) {
        this.rat = rat;
    }

    @Override
    public void feed() {
        rat.sniff();
        rat.twitch();
        rat.run();
    }

    @Override
    public void play() {
        rat.jump();
        rat.wag();
        rat.jump();
        rat.brain = new Grimy(rat);
    }

    @Override
    public void bathe() {
        rat.run();
    }
}

class Grimy implements Brain {

    private Rat rat;

    public Grimy (Rat rat) {
        this.rat = rat;
    }

    @Override
    public void feed() {
        rat.sniff();
        rat.twitch();
        rat.groom();
    }

    @Override
    public void play() {
        rat.groom();
    }

    @Override
    public void bathe() {
        rat.wag();
        rat.groom();
        rat.grind();
        rat.brain = new Hungry(rat);
    }
}




