package ru.marina;

public abstract class Animal implements IAnimal {
    protected String name;
    protected String color;
    protected int age;
    int animalsCreated;

    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void action (int max, int distance, String act) {
        if(distance <= max) {
            System.out.println(name + " " + act + " " + distance + " метров.");
        } else {
            System.out.println(name + " так не умеет.");
        }
    }

    @Override
    public String toString() {
        return name + ", " + color + ", " + age;
    }
}

interface IAnimal {
    String voice();
    void run(int distance);
    void swim(int distance);
}

class Cat extends Animal {
    Cat(String name, String color, int age) {
        super(name, color, age);
    }
    @Override
    public String voice() {
        return "meow";
    }
    @Override
    public void run(int distance) {
        action(200, distance, "пробежал");
    }
    @Override
    public void swim(int distance) {
        action(0, distance, "проплыл");
    }
}

class Dog extends Animal {
    Dog(String name, String color, int age) {
        super(name, color, age);
    }
    @Override
    public String voice() {
        return "gaf-gaf";
    }
    @Override
    public void run(int distance) {
        action(500, distance, "пробежал");
    }
    @Override
    public void swim(int distance) {
        action(10, distance, "проплыл");
    }
}

