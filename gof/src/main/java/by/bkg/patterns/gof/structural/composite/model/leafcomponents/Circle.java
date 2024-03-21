package by.bkg.patterns.gof.structural.composite.model.leafcomponents;

import by.bkg.patterns.gof.structural.composite.model.basecomponent.Shape;

// one of leaf components of Composite pattern
public class Circle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color " + fillColor);
    }
}