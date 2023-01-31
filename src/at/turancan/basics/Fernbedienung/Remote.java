package at.turancan.basics.Fernbedienung;

public class Remote {

    public class Remoter {
        private int battery1;
        private int battery2;
        private boolean batteryON;



        public boolean isbON() {
            return batteryON;
        }

        public void setbON(boolean bON) {
            bON = true;
            this.batteryON = batteryON;
        }

        public int getBattery1() {
            return battery1;
        }

        public void setBattery1(int battery1, int battery2) {
            this.battery1 = battery1;
        }

        public int getBattery2() {
            return battery2;
        }

        public void setBattery2(int battery2) {
            this.battery2 = battery2;
        }
    }
}
