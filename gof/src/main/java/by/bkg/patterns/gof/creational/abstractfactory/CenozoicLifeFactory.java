package by.bkg.patterns.gof.creational.abstractfactory;

import by.bkg.patterns.gof.creational.abstractfactory.model.AbstractAnimal;
import by.bkg.patterns.gof.creational.abstractfactory.model.AbstractPlant;
import by.bkg.patterns.gof.creational.abstractfactory.model.CenozoicAnimal;
import by.bkg.patterns.gof.creational.abstractfactory.model.CenozoicPlant;

public class CenozoicLifeFactory implements AbstractLifeFactory {
    @Override
    public AbstractAnimal createAnimal() {
        return new CenozoicAnimal();
    }

    @Override
    public AbstractPlant createPlant() {
        return new CenozoicPlant();
    }
}
