package at.turancan.basics.xxx.examples.cars;

public class Main {
    public static void main (String [] args) {

        Manufacturer Mercedes = new Manufacturer("Mercedes Benz Schneider","Schweiz", "2");
        Engine e1 = new Engine (4,500);
        Car c1 = new Car (e1,Mercedes,80000,412,"white","Mercedes C63 AMG");

    }
}
