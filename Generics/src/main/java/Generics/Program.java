package Generics;

public class Program {
    public static void main(String[] args) {

        FruitBox<Apples> applesFruitBox = new FruitBox<Apples>(1);
        FruitBox<Oranges> orangesFruitBox = new FruitBox<Oranges>(2);

        FruitBox<Apples> applesFruitBox1 = new FruitBox<Apples>(3);
        FruitBox<Oranges> orangesFruitBox1 = new FruitBox<Oranges>(4);

        for(int i = 0; i < 15; i++) {

            Apples a = new Apples();
            Oranges o = new Oranges();
            applesFruitBox.addFruit(a);
            orangesFruitBox.addFruit(o);
        }

        System.out.println("Коробки изначально :");

        System.out.println(applesFruitBox.toString());
        System.out.println(orangesFruitBox.toString());
        System.out.println(applesFruitBox1.toString());
        System.out.println(orangesFruitBox1.toString());

        applesFruitBox.shiftBox(applesFruitBox1);
        orangesFruitBox.shiftBox(orangesFruitBox1);

        System.out.println("Коробки пересыпали :");

        System.out.println(applesFruitBox.toString());
        System.out.println(orangesFruitBox.toString());
        System.out.println(applesFruitBox1.toString());
        System.out.println(orangesFruitBox1.toString());
    }

    public void showBoxes() {

    }
}
