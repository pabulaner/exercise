package de.vimo;

public class Chicken {
    private String chickenWing = "chickenWing";
    private String chickenBreast = "chickenBreast";
    ChickenAvailable chickenAvailable;

    public Chicken(String chickenWing, String chickenBreast) {
        this.chickenWing = chickenWing;
        this.chickenBreast = chickenBreast;
    }
    public ChickenAvailable getChickenWing() {
        return chickenAvailable.CHICKEN_WING_BBQ;
    }
    public String getChickenBreast() {
        return chickenBreast;
    }
}
