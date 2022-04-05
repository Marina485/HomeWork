package Generics;

import java.util.ArrayList;

public class FruitBox<T extends Fruits> {
    private int number;
    private ArrayList <T> fruits  = new ArrayList<>();

    public FruitBox(int number) {
        this.number = number;
        clearBox();
    }

    public void clearBox() {
        fruits.clear();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.size() != 0) {
            return fruits.size() * fruits.get(0).getWeight();
        } else {
            return 0.0f;
        }
    }

    public int getFruitsAmount() {
        return fruits.size();
    }

    public String getFruitsName() {
        if (fruits.size() != 0) {
            return fruits.get(0).getName();
        } else {
            return " - ";
        }
    }

    @Override
    public String toString() {
        return "Коробка № " + this.number + ". Кол-во фруктов: " + getFruitsAmount() +
                ". Вес: " + getWeight() + ". Фрукты : " + getFruitsName();
    }

    public void shiftBox(FruitBox<T> box) {
        box.clearBox();
        for (T fruit : fruits) {
           box.addFruit(fruit);
        }
        clearBox();
    }
}
