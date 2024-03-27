package by.bkg.patterns.gof.creational.factory;

import by.bkg.patterns.gof.creational.factory.model.Computer;
import by.bkg.patterns.gof.creational.factory.model.PC;
import by.bkg.patterns.gof.creational.factory.model.Server;

// https://www.digitalocean.com/community/tutorials/factory-design-pattern-in-java
// https://refactoring.guru/design-patterns/factory-method
public class ComputerFactory {

    public static Computer getComputer(String type) {
        var ram = "ramValue";     // read from config
        var hdd = "hddValue";     // read from config
        var cpu = "cpuValue";     // read from config

        if ("PC".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }

        return null;
    }
}