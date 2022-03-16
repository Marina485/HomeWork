package CatEats;

public class Cat {
    private String name;
    private int appetite;
    private boolean hunger;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = true;
    }

    public void eat(SmartPlate p) {
        if (hunger != false) {
            if (p.decreaseFood(appetite) == true) {
                hunger = false;
            }
        }
    }

    public boolean getHunger() {
        return hunger;
    }

    @Override
    public String toString() {
        return name + ", " + appetite + ", " + hunger;
    }
}
