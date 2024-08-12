package de.vimo.car;

public class Swift extends Car {
    private Engine engine;
    public Swift(String color, int maxSpeed, Engine engine) {
        super(color,maxSpeed);
        this.engine = engine;
    }
    public void startSwift() {
        engine.start();
    }
    public void stopSwift() {
        engine.stop();
    }
    public String getSwift() {
        return engine.getBrake();
    }
}
