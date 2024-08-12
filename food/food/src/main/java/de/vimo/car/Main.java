package de.vimo.car;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("brake now");
        Swift swift = new Swift("red",200,engine);
        swift.carInfo();
        swift.startSwift();
        swift.stopSwift();
        swift.getSwift();
    }
}
