package by.bkg.patterns.gof.structural.composite.model.compositeobject;

import by.bkg.patterns.gof.structural.composite.model.basecomponent.Shape;

import java.util.ArrayList;
import java.util.List;

// composite object
public class Drawing implements Shape {

    //collection of Shapes
    private final List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for (var sh : shapes) {
            sh.draw(fillColor);
        }
    }

    //adding shape to drawing
    public void add(Shape s) {
        this.shapes.add(s);
    }

    //removing shape from drawing
    public void remove(Shape s) {
        shapes.remove(s);
    }

    //removing all the shapes
    public void clear() {
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}