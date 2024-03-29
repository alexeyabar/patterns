package by.bkg.patterns.gof.creational.builder;

// https://www.digitalocean.com/community/tutorials/builder-design-pattern-in-java
// https://circle.visual-paradigm.com/builder/
// https://refactoring.guru/design-patterns/builder
public class UsageExample {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        var comp1 = new Computer.Builder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        var comp2 = new ComputerAsRecord.Builder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
    }
}
