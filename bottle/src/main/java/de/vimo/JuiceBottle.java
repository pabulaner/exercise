package de.vimo;

public class JuiceBottle implements Bottle {
    int millilitreOil = 400;
    String shape = "oval";
    String liquid = "juice";

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
