package at.turancan.oo.Cars;

public class Car {
    private int speed;
    private Engine engine;
    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String drive;
    private String brake;
    private String serialNumber;
    private String color;
    public int amountOfRepetitions;

    public Car(Engine engine, String brand, String serialNumber) {
        this.engine = engine;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
        if (this.speed > 100) {
            System.out.println("schnell fahren");
        } else {
            System.out.println("lagsam am fahren");
        }
    }

    public  void setSpeed(int speed) {
        this.speed = speed;


    }


    public void bremsen(){
        System.out.println("am bremsen");
    }

    public void turboBoost(){
        if (fuelAmount > fuelAmount * 0.1);
        System.out.println("SuperBoostMode");
        if (fuelAmount < fuelAmount * 0.1);
        System.out.println("Not enough fuel to go to Superboost");
    }

    public void honk(){

        for (int i = 0; i < this.amountOfRepetitions; i++) {
            System.out.println("Tut");
            System.out.println("ich bin ein " + this.brand + "und habe die Farbe " + this.color + "und habe " + this.getEngine().getHorsePower());
        }
    }

    public void getRemainingRange(){
        int range = (fuelAmount/fuelConsumption)*100;
        System.out.println(range +"km");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setAmountOfRepetitions(int amountOfRepetitions) {
        this.amountOfRepetitions = amountOfRepetitions;
    }

    public void setBrake(String brake) {
        this.brake = brake;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public void setFuelAmount(int fuelAmount) {
        if (fuelAmount>150){
            this.fuelAmount = 100;
        } else {
            this.fuelAmount = fuelAmount;
        }

    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getAmountOfRepetitions() {
        return amountOfRepetitions;
    }

    public String getBrake() {
        return brake;
    }

    public String getDrive() {
        return drive;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}