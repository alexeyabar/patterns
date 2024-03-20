package by.bkg.patterns.gof.structural.adapter.model;

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}