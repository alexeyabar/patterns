package by.bkg.patterns.gof.structural.adapter;

import by.bkg.patterns.gof.structural.adapter.model.SocketAdapter;
import by.bkg.patterns.gof.structural.adapter.model.Volt;
import by.bkg.patterns.gof.structural.adapter.viacomposition.SocketObjectAdapterImpl;
import by.bkg.patterns.gof.structural.adapter.viaineritance.SocketClassAdapterImpl;

// https://www.digitalocean.com/community/tutorials/adapter-design-pattern-java
// https://refactoring.guru/design-patterns/adapter
public class AdapterPatternTest {

    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        var sockAdapter = new SocketObjectAdapterImpl();
        var v3 = getVolt(sockAdapter, 3);
        var v12 = getVolt(sockAdapter, 12);
        var v120 = getVolt(sockAdapter, 120);
        System.out.println("v3 voltsValue using Object Adapter=" + v3.voltsValue());
        System.out.println("v12 voltsValue using Object Adapter=" + v12.voltsValue());
        System.out.println("v120 voltsValue using Object Adapter=" + v120.voltsValue());
    }

    private static void testClassAdapter() {
        var sockAdapter = new SocketClassAdapterImpl();
        var v3 = getVolt(sockAdapter, 3);
        var v12 = getVolt(sockAdapter, 12);
        var v120 = getVolt(sockAdapter, 120);
        System.out.println("v3 voltsValue using Class Adapter=" + v3.voltsValue());
        System.out.println("v12 voltsValue using Class Adapter=" + v12.voltsValue());
        System.out.println("v120 voltsValue using Class Adapter=" + v120.voltsValue());
    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        return switch (i) {
            case 3 -> sockAdapter.get3Volt();
            case 12 -> sockAdapter.get12Volt();
            default -> sockAdapter.get120Volt();
        };
    }
}