package by.bkg.patterns.gof.behavioral.templatemethod.model;

public class WoodenHouseBuilder extends HouseBuilder {
    @Override
    protected void buildWalls() {
        System.out.println("Building wooden walls...");
    }
}
