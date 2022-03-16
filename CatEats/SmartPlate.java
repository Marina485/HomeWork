package CatEats;

public class SmartPlate {
    private int food;

    public SmartPlate(int food) {
        if (food < 0) throw new IllegalArgumentException("Еда меньше нуля.");
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            return true;
        }
        return false;
    }

    public void addFood(int f) {
        food += f;
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}