package by.bkg.patterns.gof.creational.abstractfactory;

import by.bkg.patterns.gof.creational.abstractfactory.model.AbstractAnimal;
import by.bkg.patterns.gof.creational.abstractfactory.model.AbstractPlant;

public interface AbstractLifeFactory {

    AbstractAnimal createAnimal();

    AbstractPlant createPlant();
}
