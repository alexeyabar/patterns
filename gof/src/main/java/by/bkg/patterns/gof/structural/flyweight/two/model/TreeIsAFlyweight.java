package by.bkg.patterns.gof.structural.flyweight.two.model;

public record TreeIsAFlyweight(String name,
                               int x,
                               int y,
                               TreeDrawingTemplateIsARepeatedStateIntrinsic treeType
) {

    public void draw() {
        // draw using x, y and treeType.icon
        System.out.println("Drawing tree '" + name + "' of type '" + treeType.type().name() + "' at (x, y)=(" + x + ", " + y + ")");
    }
}
