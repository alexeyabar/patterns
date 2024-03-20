package by.bkg.patterns.gof.structural.adapter.viacomposition;

import by.bkg.patterns.gof.structural.adapter.model.Socket;
import by.bkg.patterns.gof.structural.adapter.model.SocketAdapter;
import by.bkg.patterns.gof.structural.adapter.model.Volt;

public class SocketObjectAdapterImpl implements SocketAdapter {

    //Using Composition for adapter pattern
    private final Socket sock = new Socket();

    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = sock.getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = sock.getVolt();
        return convertVolt(v, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}