package by.bkg.patterns.gof.creational.builder;

//required parameters: HDD, RAM
//optional parameters: isGraphicsCardEnabled, isBluetoothEnabled
public record ComputerAsRecord(String HDD, String RAM, boolean isGraphicsCardEnabled, boolean isBluetoothEnabled) {

    public static class Builder {

        // required parameters
        private String HDD;
        private String RAM;

        // optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public Builder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public ComputerAsRecord build() {
            return new ComputerAsRecord(HDD, RAM, isGraphicsCardEnabled, isBluetoothEnabled);
        }
    }
}