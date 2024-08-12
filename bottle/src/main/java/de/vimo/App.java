package de.vimo;


public class App 
{
    public static void main( String[] args )
    {
        OilBottle oilBottle = new OilBottle();
        oilBottle.getMillilitre();
        oilBottle.getLiquid();
        oilBottle.getShape();

        JuiceBottle juiceBottle = new JuiceBottle();
        juiceBottle.getMillilitre();
        juiceBottle.getLiquid();
        juiceBottle.getShape();

        WaterBottle waterBottle = new WaterBottle();
        waterBottle.getMillilitre();
        waterBottle.getLiquid();
        waterBottle.getShape();
    }
}
