package by.bkg.patterns.gof.structural.decorator.model;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(Object data) {
        System.out.println("EncryptionDecorator: writing data...");
        Object encrypted = encryptData(data);
        super.writeData(encrypted);
    }

    @Override
    public Object readData() {
        System.out.println("EncryptionDecorator: reading data...");
        Object originalData = super.readData();
        if (isEncrypted(originalData)) {
            return decryptData(originalData);
        }
        return originalData;
    }

    private Object encryptData(Object data) {
        // perform encryption
        return data;
    }

    private Object decryptData(Object originalData) {
        // perform decryption
        return originalData;
    }

    private boolean isEncrypted(Object data) {
        // some checks here
        return true;
    }
}
