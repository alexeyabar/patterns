package by.bkg.patterns.gof.structural.adapter.viaineritance;

import by.bkg.patterns.gof.structural.adapter.model.Socket;
import by.bkg.patterns.gof.structural.adapter.model.SocketAdapter;
import by.bkg.patterns.gof.structural.adapter.model.Volt;

//Using inheritance for adapter pattern
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = getVolt();
        return convertVolt(v, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
