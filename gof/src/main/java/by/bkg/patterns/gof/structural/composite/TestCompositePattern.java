package by.bkg.patterns.gof.structural.composite;

import by.bkg.patterns.gof.structural.composite.model.basecomponent.Shape;
import by.bkg.patterns.gof.structural.composite.model.compositeobject.Drawing;
import by.bkg.patterns.gof.structural.composite.model.leafcomponents.Circle;
import by.bkg.patterns.gof.structural.composite.model.leafcomponents.Triangle;

// https://www.digitalocean.com/community/tutorials/composite-design-pattern-in-java
public class TestCompositePattern {

    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
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
