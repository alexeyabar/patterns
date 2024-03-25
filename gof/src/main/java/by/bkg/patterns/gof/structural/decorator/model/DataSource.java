package by.bkg.patterns.gof.structural.decorator.model;

public interface DataSource {

    void writeData(Object data);

    Object readData();
}
