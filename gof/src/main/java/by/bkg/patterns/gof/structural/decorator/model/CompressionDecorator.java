package by.bkg.patterns.gof.structural.decorator.model;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(Object data) {
        System.out.println("CompressionDecorator: writing data...");
        Object compressedData = compress(data);
        super.writeData(compressedData);
    }

    @Override
    public Object readData() {
        System.out.println("CompressionDecorator: reading data...");
        Object originalData = super.readData();
        if (isCompressed(originalData)) {
            return decompress(originalData);
        }
        return originalData;
    }

    private Object compress(Object data) {
        // perform compression
        return data;
    }

    private Object decompress(Object data) {
        // perform decompression
        return data;
    }

    private boolean isCompressed(Object data) {
        // perform some checks
        return true;
    }
}
