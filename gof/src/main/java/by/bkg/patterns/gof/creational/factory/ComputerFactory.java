package by.bkg.patterns.gof.creational.factory;

import by.bkg.patterns.gof.creational.factory.model.Computer;
import by.bkg.patterns.gof.creational.factory.model.PC;
import by.bkg.patterns.gof.creational.factory.model.Server;

// https://www.digitalocean.com/community/tutorials/factory-design-pattern-in-java
public class ComputerFactory {

    public static Computer getComputer(String type) {
        String ram = "aa";     // read from config
        String hdd = "aa";     // read from config
        String cpu = "aa";     // read from config

        if ("PC".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }

        return null;
    }
}