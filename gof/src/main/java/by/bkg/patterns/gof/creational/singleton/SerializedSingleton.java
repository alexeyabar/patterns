package by.bkg.patterns.gof.creational.singleton;

import java.io.Serial;
import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    @Serial
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    // allows to deserialize into existing object. If this method is not present -- new instance of SerializedSingleton will be created during deserialization
    @Serial
    protected Object readResolve() {
        return getInstance();
    }
}