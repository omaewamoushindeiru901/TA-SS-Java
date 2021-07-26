package Task2.Classes;

public class BMW extends Car {

    public BMW( String model, String colour, int price, float speedUp, float slowDown) {
        super("BMW", model, colour, price, speedUp, slowDown);
    }

    public void setBrand() {
        super.setBrand("BMW");
    }

    @Override
    public String getBrand(){
        return "BMW";
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

}
