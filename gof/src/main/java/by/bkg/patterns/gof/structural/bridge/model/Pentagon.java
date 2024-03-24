package by.bkg.patterns.gof.structural.bridge.model;

public class Pentagon extends Shape {

    public Pentagon(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.println("Applying color over Pentagon...");
        color.applyColor();
    }
}
