package Generics;

public class Oranges extends Fruits {
    private static final float ORANGE_WEIGHT = 1.5f;
    private static final String ORANGE_NAME = "Апельсины";

    @Override
    public float getWeight() {
        return ORANGE_WEIGHT;
    }

    @Override
    public String getName() {
        return ORANGE_NAME;
    }
}
