package by.bkg.patterns.gof.creational.abstractfactory;

import by.bkg.patterns.gof.creational.abstractfactory.model.AbstractAnimal;
import by.bkg.patterns.gof.creational.abstractfactory.model.AbstractPlant;
import by.bkg.patterns.gof.creational.abstractfactory.model.MesozoicAnimal;
import by.bkg.patterns.gof.creational.abstractfactory.model.MesozoicPlant;

public class MesozoicLifeFactory implements AbstractLifeFactory{
    @Override
    public AbstractAnimal createAnimal() {
        return new MesozoicAnimal();
    }

    @Override
    public AbstractPlant createPlant() {
        return new MesozoicPlant();
    }
}
