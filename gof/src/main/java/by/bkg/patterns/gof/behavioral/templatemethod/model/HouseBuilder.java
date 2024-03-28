package by.bkg.patterns.gof.behavioral.templatemethod.model;

public abstract class HouseBuilder {

    public final void buildHouse() {
        buildFoundation();
        buildWalls();
        buildRoof();
    }

    protected void buildFoundation() {
        System.out.println("Building foundation...");
    }

    protected abstract void buildWalls();

    protected void buildRoof() {
        System.out.println("Building roof...");
    }
}
