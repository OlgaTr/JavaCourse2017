package homework170724;


public class Cat implements Pet {

    private Brain brain = new Hungry();

    private class Hungry implements Brain {

        @Override
        public void feed() {
            purr();
            eat();
            purr();
            brain = new Fed();
        }

        @Override
        public void play() {
            scratch();
            bite();
            scratch();
        }

        @Override
        public void bathe() {
            scratch();
            waul();
            bite();
            scratch();
        }
    }

    private class Fed implements Brain {

        @Override
        public void feed() {
            mew();
            run();
        }

        @Override
        public void play() {
            mew();
            jump();
            run();
            mew();
            brain = new Hungry();
        }


        @Override
        public void bathe() {
            scratch();
            waul();
            bite();
            scratch();
        }
    }

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

    private void purr() {
        System.out.println("Purrs");
    }

    private void mew() {
        System.out.println("Mews");

    }

    private void waul() {
        System.out.println("Wauls");
    }

    private void run() {
        System.out.println("Runs");
    }

    private void jump() {
        System.out.println("Jumps");
    }

    private void bite() {
        System.out.println("Bites");
    }

    private void scratch() {
        System.out.println("Scratches");
    }

    private void eat() {
        System.out.println("Eats");
    }
}
