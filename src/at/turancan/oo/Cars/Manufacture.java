package at.turancan.oo.Cars;

public class Manufacture {
        private int basePreis;
        private String manufacturer;
        private String mCountry;
        private double mDiscount;


    public Manufacture(String manuName, String manuCountry, double manuDiscount){
            this.manufacturer = manuName;
            this.mCountry = manuCountry;
            this.mDiscount = manuDiscount;
        }




    public int getBasePrice() {
        return basePreis;
    }

    public void setBasePreis(int basePreis) {
        this.basePreis = basePreis;
    }

    public String getManufacture() {
        return manufacturer;
    }

    public void setManufacture(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufactureCountry() {
        return mCountry;
    }

    public void setManufacturerCountry(String manufactureCountry) {
        this.mCountry = manufactureCountry;
    }

    public double getManufactureDiscount() {
        return mDiscount;
    }

    public void setManufactureDiscount(double manufactureDiscount) {
        this.mDiscount = manufactureDiscount;
    }
}

