package Task2.Classes;

public class Mercedes extends Car{

    public Mercedes() {
        super("Mercedes");
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
