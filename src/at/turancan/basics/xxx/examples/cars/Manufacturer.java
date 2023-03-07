package at.turancan.basics.xxx.examples.cars;

public class Manufacturer {
    private int basePreis;
    private String manufacturer;
    private String manuRegion;
    private double manDiscount;

    public Manufacturer(String manuName, String manuRegion, double manuDiscount ){
        this.manufacturer=manuName;
        this.manuRegion=manuRegion;
        this.manDiscount=manuDiscount;
    }

    public int getBasePreis(){return basePreis;}

    public void setBasePreis (int basePreis) {this.basePreis=basePreis;}
    public String getManufacturer(){return manufacturer;}
    public void setManufacture(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufactureCountry() {
        return manuRegion;
    }



    public double getManufactureDiscount() {
        return manDiscount;
    }

    public void setManufactureDiscount(double manufactureDiscount) {
        this.manDiscount = manufactureDiscount;
    }

}
