package Task2.Services;

public enum OptionsService {
    ADD("Add a new car", 1),REMOVE("Remove a car",2),
    SHOW("Show all your cars",3),SORT("Sort your cars",4),
    ALARM("Turn alarm on/off",5),EXIT("Exit",6);


    private String option;
    private int optionNumber;

     OptionsService(String option, int optionNumber){
        this.option=option;
        this.optionNumber=optionNumber;
    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public void setOptionNumber(int optionNumber) {
        this.optionNumber = optionNumber;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }
}
