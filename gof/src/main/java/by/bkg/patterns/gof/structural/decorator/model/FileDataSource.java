package by.bkg.patterns.gof.structural.decorator.model;

public class FileDataSource implements DataSource {

    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(Object data) {
        System.out.println("Write data to file '" + fileName + "'");
    }

    @Override
    public Object readData() {
        System.out.println("Read data from file '" + fileName + "'");
        return null;
    }
}
