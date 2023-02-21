package at.turancan.basics.xxx.examples.cars;

public class Engine {
 public enum TYPE {Diesel,GAS}
    private int horsepower;
 private TYPE type;


    public Engine(int horsePower,TYPE type) {
        this.horsepower = horsePower;
        this.type = type;
    }
}
