import at.turancan.oo.Car;

public class Main {
    public static void main(String [] args){
        int a = 7;

        Car c1 = new Car();
        c1.brand = "Mercedes";
        c1.fuelConsumption=7;
        c1.fuelAmount= 30;
        c1.serialNumber= "C63";



        Car c2 = new Car();
        c2.brand = "Audi";
        c2.fuelConsumption=4;
        c2.fuelAmount=20;
        c2.serialNumber= "C6233";

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);





        System.out.println(c1.serialNumber);
        System.out.println(c2.brand);

    }
}
