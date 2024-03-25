package by.bkg.patterns.gof.structural.decorator;

import by.bkg.patterns.gof.structural.decorator.model.CompressionDecorator;
import by.bkg.patterns.gof.structural.decorator.model.DataSource;
import by.bkg.patterns.gof.structural.decorator.model.EncryptionDecorator;
import by.bkg.patterns.gof.structural.decorator.model.FileDataSource;

// https://refactoring.guru/design-patterns/decorator
// not so good example: https://www.digitalocean.com/community/tutorials/decorator-design-pattern-in-java-example
public class DecoratorTest {

    public static void main(String[] args) {
        var data = new Object();

        System.out.println("Use-case 1: plain datasource. just write");
        DataSource dataSource = new FileDataSource("someFileName.txt");
        dataSource.writeData(data);
        System.out.println("============================");

        System.out.println("Use-case 2: compressed datasource. compress, write");
        if (isCompressionEnabled()) {
            dataSource = new CompressionDecorator(dataSource);
            dataSource.writeData(data);
        }
        System.out.println("============================");

        System.out.println("Use-case 3: encrypted datasource. encrypt, compress, write");
        if (isEncryptionEnabled()) {
            dataSource = new EncryptionDecorator(dataSource);
            dataSource.writeData(data);
        }
        System.out.println("============================");
    }

    private static boolean isCompressionEnabled() {
        // read from config
        return true;
    }

    private static boolean isEncryptionEnabled() {
        // read from config
        return true;
    }
}
