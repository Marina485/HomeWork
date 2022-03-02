package ru.marina;

/**
 * Java 1. Homework #6
 *
 * @autor Marina Terekhova
 * @version 02.03.2022
 */

public class Program {
    public static void main(String[]args) {
        IAnimal [] animals = {new Cat("Tigra", "tabby", 10), new Dog("Yuki", "grey", 3)};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.voice());
        }
        animals[0].swim(100);
        animals[0].swim(700);
        animals[1].swim(5);
        animals[1].swim(70);
        animals[0].run(100);
        animals[0].run(700);
        animals[1].run(200);
        animals[1].run(700);
    }
}
