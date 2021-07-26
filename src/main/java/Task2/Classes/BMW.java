package Task2.Classes;

public class BMW extends Car {

    public BMW() {
        super("BMW");
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
