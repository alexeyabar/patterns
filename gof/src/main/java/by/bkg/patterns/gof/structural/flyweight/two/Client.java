package by.bkg.patterns.gof.structural.flyweight.two;

import by.bkg.patterns.gof.structural.flyweight.two.model.ForestIsAContext;
import by.bkg.patterns.gof.structural.flyweight.two.model.TreeType;

// https://refactoring.guru/design-patterns/flyweight
public class Client {

    public static void main(String[] args) {
        var forest = new ForestIsAContext();

        forest.plantTree("tree 1", generateX(), generateY(), generateTreeType());
        forest.plantTree("tree 2", generateX(), generateY(), generateTreeType());
        forest.plantTree("tree 3", generateX(), generateY(), generateTreeType());
        forest.plantTree("tree 4", generateX(), generateY(), generateTreeType());
        forest.plantTree("tree 5", generateX(), generateY(), generateTreeType());

        forest.draw();
    }

    private static int generateX() {
        return (int) (Math.random() * 100);
    }

    private static int generateY() {
        return (int) (Math.random() * 100);
    }

    private static TreeType generateTreeType() {
        var treeTypes = TreeType.values();
        var index = (int) (Math.random() * treeTypes.length);
        return treeTypes[index];
    }
}
