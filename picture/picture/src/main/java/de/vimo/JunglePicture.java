package de.vimo;

import java.awt.*;

public class JunglePicture {
    private Point newPositionPoint;
    private String motive = "Jungle";
    private double lengthPicture = 50.67;
    private double heightPicture = 92.33;

    public JunglePicture(Point point) {
        newPositionPoint = point;
    }
    public String getPictureMotive() {
        System.out.println(motive);
        return motive;
    }
    public double getPictureLength() {
        System.out.println(lengthPicture);
        return lengthPicture;
    }
    public double getPictureHeight() {
        System.out.println(heightPicture);
        return heightPicture;
    }
    public void switchPicturePosition(int a, int b) {
        newPositionPoint.x = a;
        newPositionPoint.y = b;
        System.out.println(a);
        System.out.println(b);
    }
}
