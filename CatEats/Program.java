package CatEats;

/**
 * Java 1. Homework #7
 *
 * @autor Marina Terekhova
 * @version 14.03.2022
 */

public class Program {
    public static void main(String[] args) {
        Cat cats[] = {new Cat("Tigra", 10), new Cat("Frosya", 5), new Cat("Fillip", 17)};
        SmartPlate plate = new SmartPlate(5);
        //SmartPlate plate = new SmartPlate(-5);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.toString());
        }
        System.out.println(plate);

        plate.addFood(30);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.toString());
        }
        System.out.println(plate);
    }
}



