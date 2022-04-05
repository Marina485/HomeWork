package Generics;

public class Apples extends Fruits {
    private static final float APPLE_WEIGHT = 1.0f;
    private static final String APPLE_NAME = "Яблоки";

    @Override
    public float getWeight() {
        return APPLE_WEIGHT;
    }

    @Override
    public String getName() {
        return APPLE_NAME;
    }
}
