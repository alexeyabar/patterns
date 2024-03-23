package by.bkg.patterns.gof.structural.flyweight.two;

import by.bkg.patterns.gof.structural.flyweight.two.model.TreeDrawingTemplateIsARepeatedStateIntrinsic;
import by.bkg.patterns.gof.structural.flyweight.two.model.TreeType;

import java.util.HashSet;
import java.util.Set;

public class TreeFactory {

    private static final Set<TreeDrawingTemplateIsARepeatedStateIntrinsic> cache = new HashSet<>();

    public static TreeDrawingTemplateIsARepeatedStateIntrinsic getTreeDrawingTemplate(TreeType type) {
        var result = cache.stream()
                .filter(elem -> elem.type().equals(type))
                .findFirst()
                .orElse(null);
        if (result == null) {
            result = new TreeDrawingTemplateIsARepeatedStateIntrinsic(type, new Byte[5]);
            cache.add(result);
        }
        return result;
    }
}
