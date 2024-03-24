package by.bkg.patterns.gof.structural.bridge.model;

public class Triangle extends Shape {

    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.println("Applying color over Triangle...");
        color.applyColor();
    }
}