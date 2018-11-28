public class Dog extends Animal implements Swimmable, Runnable {



    public Dog() {}

    public Dog(String name, Colour color) {
        super(name, color);
    }

    @Override
    public void swim() {
        System.out.println("Dog swim");
    }

    @Override
    public void run() {
        Runnable.runSlow();
    }

    @Override
    public void runFast() {
        System.out.println("Dog run fast");
    }
}
