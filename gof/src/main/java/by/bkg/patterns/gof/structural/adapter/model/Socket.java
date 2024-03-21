package by.bkg.patterns.gof.structural.adapter.model;

public class Socket {

    public Volt getVoltage() {
        return new Volt(120);
    }
}