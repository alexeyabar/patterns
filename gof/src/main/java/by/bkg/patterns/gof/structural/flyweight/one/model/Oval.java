package by.bkg.patterns.gof.structural.flyweight.one.model;

import java.awt.*;

public class Oval implements Shape {

    //intrinsic property
    private boolean mustBeFilled;

    public Oval(boolean mustBeFilled) {
        this.mustBeFilled = mustBeFilled;
        System.out.println("Creating Oval object with mustBeFilled=" + mustBeFilled);
        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height, Color color) {
        g.setColor(color);
        g.drawOval(x, y, width, height);
        if (mustBeFilled) {
            g.fillOval(x, y, width, height);
        }
    }
}