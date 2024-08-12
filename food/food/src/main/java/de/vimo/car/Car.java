package de.vimo.car;

public class Car {
    String color;
    int maxSpeed;
    Car(String color, int maxSpeed) {
        super();
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void carInfo() {
        System.out.println("color " + color + "speed" + maxSpeed);
    }
}
