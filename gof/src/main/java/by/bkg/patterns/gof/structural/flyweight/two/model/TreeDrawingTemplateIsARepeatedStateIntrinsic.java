package by.bkg.patterns.gof.structural.flyweight.two.model;

public record TreeDrawingTemplateIsARepeatedStateIntrinsic(TreeType type,
                                                           Byte[] icon
// icon takes lots of resources in case of many-many trees are created
) {

    public TreeDrawingTemplateIsARepeatedStateIntrinsic {
        System.out.println("====    Creating TreeDrawingTemplate: type = " + type.name());
    }
}
