package ru.team;

public class Course {
    private String name;
    private int swimDistance;
    private int jumpHeight;
    private int runDistance;

    public Course (String name, int swimDistance, int jumpHeight, int runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
        this.runDistance = runDistance;
    }

    public void doCourse (Team team) {
        for (Member m : team.members) {
            if (jumpHeight <= m.getJumpHeight() && swimDistance <= m.getSwimDistance() && runDistance <= m.getRunDistance()) {
                m.setResult(true);
            } else {
                m.setResult(false);
            }
        }
    }
}
