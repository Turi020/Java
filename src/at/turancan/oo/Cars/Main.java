package at.turancan.oo.Cars;

import at.turancan.oo.Cars.Car;
import at.turancan.oo.Cars.Engine;

public class Main {
 public static void main(String[] args) {

  Engine e1 = new Engine(232, Engine.TYPE.DIESEL);
  Car c1 = new Car(e1, "Volkswagen", "4");
  c1.setBrand("Volkswagen");
  c1.setBrake("no");
  c1.setDrive("yes");
  c1.setFuelConsumption(38);
  c1.setSerialNumber("4");
  c1.setColor("yellow");
  c1.setSpeed(70);
  c1.setFuelAmount(100);
  c1.amountOfRepetitions = 5;
  System.out.println(c1.getEngine().getHorsePower());

  c1.drive();



  Car c2 = new Car(e1, "Lamborgini", "A12345");
  c2.setBrand("Lamborgini");
  c2.setDrive("Yes");
  c2.setBrake("NO");
  c2.setFuelConsumption(11);
  c2.setSerialNumber("A12345");
  c2.setColor("red");
  c2.setFuelAmount(78);
  c2.amountOfRepetitions = 2;

  c2.drive();
  c1.honk();
  c1.getRemainingRange();
  c2.getRemainingRange();

 }
}










