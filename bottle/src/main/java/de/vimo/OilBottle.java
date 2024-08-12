package de.vimo;

public class OilBottle implements Bottle {
    int millilitreOil = 700;
    String shape = "round";
    String liquid = "oil";

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
