package ru.team;

public class Member {
    private String name;
    private int swimDistance;
    private int jumpHeight;
    private int runDistance;
    private boolean result;

    public Member(String name, int swimDistance, int jumpHeight, int runDistance) {
        this.name = name;
        this.swimDistance = swimDistance;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
        this.result = false;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "Name = " + name + '\n' +
                "  Swim distance = " + swimDistance +
                ", Jump height = " + jumpHeight +
                ", Run distance = " + runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public void setSwimDistance(int swimDistance) {
        if (swimDistance < 0) {
            invalidValue();
        } else {
            this.swimDistance = swimDistance;
        }
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        if (jumpHeight < 0) {
            invalidValue();
        } else {
            this.jumpHeight = jumpHeight;
        }
    }

    public int getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        if (runDistance < 0) {
            invalidValue();
        } else {
            this.runDistance = runDistance;
        }
    }

    private void invalidValue() {
        System.out.println("Некорректное значение!");
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public boolean isResult() {
        return result;
    }
}
