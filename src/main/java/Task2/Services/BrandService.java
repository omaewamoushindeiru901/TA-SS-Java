package Task2.Services;

public enum BrandService {
    BMW("BMW",1),MERS("Mercedes",2),OTHER("Other",3);

    private String brand;
    private int brandNumber;

    BrandService(String brand, int brandNumber){
        this.brand=brand;
        this.brandNumber=brandNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBrandNumber() {
        return brandNumber;
    }

    public void setBrandNumber(int brandNumber) {
        this.brandNumber = brandNumber;
    }
}
