package by.bkg.patterns.gof.structural.composite;

import by.bkg.patterns.gof.structural.composite.model.compositeobject.Drawing;
import by.bkg.patterns.gof.structural.composite.model.leafcomponents.Circle;
import by.bkg.patterns.gof.structural.composite.model.leafcomponents.Triangle;

// https://www.digitalocean.com/community/tutorials/composite-design-pattern-in-java
// https://refactoring.guru/design-patterns/composite
public class TestCompositePattern {

    public static void main(String[] args) {
        var tri = new Triangle();
        var tri1 = new Triangle();
        var cir = new Circle();

        var drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }
}
