public class Cat extends Animal implements Swimmable {

    public Cat(){}

    @Override
    public void swim() {
        System.out.println("Cat swim");
    }
}
