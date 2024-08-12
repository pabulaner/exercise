package de.vimo;


import java.awt.*;

public class App
{
    public static void main( String[] args )
    {
        Point originPoint = new Point(13,24);
        AfricaPicture africaPicture = new AfricaPicture(originPoint);
        africaPicture.getPictureMotive();
        africaPicture.getPictureLength();
        africaPicture.getPictureHeight();
        africaPicture.switchPicturePosition(20,10);

        JunglePicture junglePicture = new JunglePicture(originPoint);
        junglePicture.getPictureMotive();
        junglePicture.getPictureLength();
        junglePicture.getPictureHeight();
        junglePicture.switchPicturePosition(33,56);
    }
}
