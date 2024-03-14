package by.bkg.patterns.gof.creational.abstractfactory;

import by.bkg.patterns.gof.creational.abstractfactory.model.AbstractAnimal;
import by.bkg.patterns.gof.creational.abstractfactory.model.AbstractPlant;
import by.bkg.patterns.gof.creational.abstractfactory.model.LifeEra;

// https://circle.visual-paradigm.com/abstract-factory/
public class AbstractFactoryClient {

    public static void main(String[] args) {
        LifeEra era = getEraFromConfig();

        AbstractLifeFactory lifeFactory = switch (era) {
            case CENOZOIC -> new CenozoicLifeFactory();
            case MESOZOIC -> new MesozoicLifeFactory();
        };

        AbstractAnimal animal = lifeFactory.createAnimal();
        AbstractPlant plant = lifeFactory.createPlant();
    }

    private static LifeEra getEraFromConfig() {
        return LifeEra.MESOZOIC;    // default one
    }
}