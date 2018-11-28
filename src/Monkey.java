public abstract class Monkey extends Animal implements VeryFarJump, Runnable {

    @Override
    public void jumpVeryFar() {
        System.out.println("jump very far");
    }

    @Override
    public void jump() {
        System.out.println("jump");
    }

    @Override
    public void run() {
        System.out.println("...");
    }

    @Override
    public void runFast() {
        System.out.println("...");
    }
}
