import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        Swimmable sw = new Swimmable();            error
//       Animal[] zoo = new Animal[3];
//       zoo[0] = new Dog();
//       zoo[1] = new Jiraf();
//       zoo[2] = new Cat();
//
//        for (Animal animal: zoo) {
//            if (animal instanceof Swimmable){
//                Swimmable sw = (Swimmable) animal;
//                sw.swim();
//            }
//        }
//
//        Swimmable sw = createSwimmable("dog");
//        Animal dog = new Dog("Rex", Colour.BLACK);
//
//        //=============================================
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter colour");
//        String colour = sc.next();
//        Colour[] allColours = Colour.values();
//        Colour userColour = null;
//        for (Colour collourFromArray: allColours) {
//            if (collourFromArray.toString().equals(colour)){
//                userColour=collourFromArray;
//                break;
//            }
//            if (collourFromArray.getColourName().equals(colour)){
//                userColour=collourFromArray;
//                break;
//            }
//        }
//        System.out.println("your colour is " + userColour);
//
//        //===============================================
//
//        Colour cl = getColourFromUser();
//        switch (cl){
//            case BLACK:
//                System.out.println("вы выбрали чёрный");
//                break;
//            case WHITE:
//                System.out.println("вы выбрали белый");
//                break;
//        }
//
//        Student s1 = new Student("Ivan");
//        Student s2 = new Student("Ivan");
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//
//        int hc1 = s1.hashCode();
//        int hc2 = s2.hashCode();
//        System.out.println(hc1==hc2);
//    }

    public static Swimmable createSwimmable(String className){
        if ("dog".equals(className)){
            return new Dog();
        }
        return new Cat();
    }

    public static Colour getColourFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("choose colour");
        Colour[] allColoirs = Colour.values();
        for (int i = 0; i < allColoirs.length; i++) {
            System.out.println(i + "-" + allColoirs[i].getColourName());
        }
        int userColour = sc.nextInt();
        Colour colour = allColoirs[userColour];
        return colour;
    }


}
