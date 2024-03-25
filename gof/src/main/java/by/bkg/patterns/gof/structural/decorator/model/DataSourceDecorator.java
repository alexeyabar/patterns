package by.bkg.patterns.gof.structural.decorator.model;

public class DataSourceDecorator implements DataSource {

    private DataSource wrappee;

    public DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void writeData(Object data) {
        wrappee.writeData(data);
    }

    @Override
    public Object readData() {
        return wrappee.readData();
    }
}
