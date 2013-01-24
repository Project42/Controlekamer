import greenfoot.*;

import java.awt.Color;
import java.awt.Graphics;

public class PoliceUnits extends Counter {
    private static final Color textColor = new Color(255, 255, 255);

    public int value = 5;
    public int target = 5;
    private String text;
    private int stringLength;

    public PoliceUnits() {
        this("");
    }

    public PoliceUnits(String prefix) {
        text = prefix;
        stringLength = (text.length() + 2) * 10;

        setImage(new GreenfootImage(stringLength, 16));
        GreenfootImage image = getImage();
        image.setColor(textColor);

        updateImage();
    }

    public void act() {
        if(value < target) {
            value++;
            updateImage();
        }
        else if(value > target) {
            value--;
            updateImage();
        }
    }

    public void add(int score) {
        target += score;
    }

    public int getValue() {
        return value;
    }

    private void updateImage() {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 12);
     }
}
