package by.bkg.patterns.gof.structural.flyweight.two.model;

import by.bkg.patterns.gof.structural.flyweight.two.TreeFactory;

import java.util.HashSet;
import java.util.Set;

public class ForestIsAContext {

    private final Set<TreeIsAFlyweight> trees = new HashSet<>();

    public void plantTree(String treeName, int x, int y, TreeType treeType) {
        var drawingTemplate = TreeFactory.getTreeDrawingTemplate(treeType);
        trees.add(new TreeIsAFlyweight(treeName, x, y, drawingTemplate));
    }


    public void draw() {
        trees.forEach(TreeIsAFlyweight::draw);
    }
}
