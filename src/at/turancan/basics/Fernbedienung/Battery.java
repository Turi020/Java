package at.turancan.basics.Fernbedienung;

public class Battery {
    private int battery0;
    private int battery1;
    private double voltage;
    private int chargingStatus;

    public Battery() {
    }

    public Battery(int i, int i2) {
    }

    public void Battery (double voltage, int chargingStatus) {
        this.voltage = voltage;
        this.chargingStatus = chargingStatus;
    }

    public void getStatus() {
        this.battery0 = 100;
        this.battery1 = 100;
        System.out.println("Der Ladestatus beträgt " + (this.battery0 + this.battery1) / 2 + "%");
    }

    public void turnON(){
        int turnON1 = this.battery0/20;
        int turnON2 = this.battery1/20;
        int battery1status = this.battery0 - turnON1;
        int battery2status = this.battery1 - turnON1;
        int result = (battery1status + battery2status)/2;

        System.out.println("Verbraucher ist angeschlossen " + result + "%");
    }

    public void turnOFF() {
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }}


