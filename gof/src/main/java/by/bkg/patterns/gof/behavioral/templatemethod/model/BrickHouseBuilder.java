package by.bkg.patterns.gof.behavioral.templatemethod.model;

public class BrickHouseBuilder extends HouseBuilder {
    @Override
    protected void buildWalls() {
        System.out.println("Building brick walls...");
    }
}
