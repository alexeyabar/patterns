package by.bkg.patterns.gof.structural.bridge;

import by.bkg.patterns.gof.structural.bridge.model.GreenColor;
import by.bkg.patterns.gof.structural.bridge.model.Pentagon;
import by.bkg.patterns.gof.structural.bridge.model.RedColor;
import by.bkg.patterns.gof.structural.bridge.model.Triangle;

// https://www.digitalocean.com/community/tutorials/bridge-design-pattern-java
// https://refactoring.guru/design-patterns/bridge
public class BridgePatternTest {

    public static void main(String[] args) {
        var tri = new Triangle(new RedColor());
        tri.applyColor();

        var pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
