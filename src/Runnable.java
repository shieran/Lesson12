public interface Runnable {
    String SPEED = "100"; // constant alllways
    void run();
    void runFast();
    static void runSlow(){
        System.out.println("slow");
    }
    default void noRun(){
        System.out.println("no run");
    }

}
