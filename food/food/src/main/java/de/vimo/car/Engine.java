package de.vimo.car;

public class Engine {
    private String text;
    public Engine(String text) {
        this.text = text;
    }
    public void start() {
        System.out.println("engine start");
    }
    public void stop() {
        System.out.println("engine stop");
    }
    public String getBrake() {
        System.out.println(text);
        return text;
    }
}
