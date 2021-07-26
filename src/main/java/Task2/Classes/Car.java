package Task2.Classes;

public class Car implements Alarm, Vehicle {
    public boolean isAlarmOn;
    private String brand;
    private String model;
    private String colour;
    private int price;
    private float speedUp;
    private float slowDown;


    public Car(String brand, String model, String colour,int price,float speedUp, float slowDown){
        this.brand=brand;
        this.model=model;
        this.colour=colour;
        this.price=price;
        this.speedUp=speedUp;
        this.slowDown=slowDown;
    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public float getSpeedUp() {
        return speedUp;
    }

    public void setSpeedUp(float speedUp) {
        this.speedUp = speedUp;
    }

    public float getSlowDown() {
        return slowDown;
    }

    public void setSlowDown(float slowDown) {
        this.slowDown = slowDown;
    }


    public String display(){
       return "Brand: "+getBrand()+
                "\nModel: "+getModel()+
                "\nColour: "+getColour()+
                "\nPrice: "+getPrice()+
                "\nSpeed up: "+getSpeedUp()+
                "\nSlow down: "+getSlowDown()+
                "\n";
    }
}
