package at.turancan.basics.xxx.examples.cars;

public class Car {
    private int basePrice;
    private String color;
    private int baseConsumption;
    private int range;
    private int maxSpeed;
    private int manufacturerDiscount;

    public Car (String c, int maxS, int baseP, int baseC){
        this.color=c;
        this.maxSpeed=maxS;
        this.baseConsumption=baseP;
        this.basePrice=baseP;

    }

    public void Price (){
        this.basePrice=80000;
        this.manufacturerDiscount = 4;
        this.baseConsumption=41;
        this.range=40000;
        if (this.range<50000){
            System.out.println(this.baseConsumption);

        } else if (this.range>=50000){
            System.out.println(this.baseConsumption*9.8);
        }
        double discountprice= (this.basePrice/this.manufacturerDiscount);
        double endprice = this.basePrice - discountprice;
        System.out.println("Das Auto kostet"+endprice+ "€");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaximumSpeed() {
        return maxSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maxSpeed = maximumSpeed;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getBaseConsumption() {
        return baseConsumption;
    }

    public void setBaseConsumption(int baseConsumption) {
        this.baseConsumption = baseConsumption;
    }
};



