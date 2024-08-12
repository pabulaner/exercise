package de.vimo;

import java.awt.*;

public class AfricaPicture implements Picture {
    private Point newPositionPoint;
    private String motive = "Africa";
    private double lengthPicture = 200.33;
    private double heightPicture = 302.56;

    public AfricaPicture(Point point) {
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
