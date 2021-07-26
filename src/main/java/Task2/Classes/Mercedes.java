package Task2.Classes;

public class Mercedes extends Car{

    public Mercedes( String model, String colour, int price, float speedUp, float slowDown) {
        super("Mercedes", model, colour, price, speedUp, slowDown);
    }

    public void setBrand() {
        super.setBrand("Mercedes");
    }

    @Override
    public String getBrand(){
        return "Mercedes";
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
