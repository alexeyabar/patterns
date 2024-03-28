package by.bkg.patterns.gof.behavioral.templatemethod;

import by.bkg.patterns.gof.behavioral.templatemethod.model.BrickHouseBuilder;
import by.bkg.patterns.gof.behavioral.templatemethod.model.HouseBuilder;
import by.bkg.patterns.gof.behavioral.templatemethod.model.WoodenHouseBuilder;

// https://www.digitalocean.com/community/tutorials/template-method-design-pattern-in-java
// https://refactoring.guru/design-patterns/template-method
public class TemplateMethodClient {

    public static void main(String[] args) {
        HouseBuilder builderLogic = new BrickHouseBuilder();
        builderLogic.buildHouse();

        System.out.println("===================================");

        builderLogic = new WoodenHouseBuilder();
        builderLogic.buildHouse();
    }
}
