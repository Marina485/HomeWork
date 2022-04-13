package Serialization;

import java.io.Serializable;

public class ClassData implements Serializable {
    private String name;
    private String lastName;
    private int age;
    private float temperature;

    public ClassData(String name, String lastName, int age, float temperature) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public float getTemperature() {
        return temperature;
    }
}
