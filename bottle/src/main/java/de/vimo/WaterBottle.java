package de.vimo;

public class WaterBottle implements Bottle {
    int millilitreOil = 500;
    String shape = "sharp";
    String liquid = "water";

    public String getShape() {
        System.out.println(shape);
        return shape;
    }
    public String getLiquid() {
        System.out.println(liquid);
        return liquid;
    }
    public int getMillilitre() {
        System.out.println(millilitreOil);
        return millilitreOil;
    }
}
