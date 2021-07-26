package Task2.Services;

public enum MessagesService {
    CHOOSE_OPT("Choose an option: "),CHOOSE_BRAND("Choose a brand: "),ERROR("Invalid input"),
    ENTER("Enter car properties: "), MODEL("Model: "),COLOUR("Colour: "), PRICE("Price: "),
    SPEED_UP("Speed up: "),SLOW_DOWN("Slow down: "),REMOVE("Enter the number of car to remove: "),
    SUCCESS("Successful operation!"),CRIT("Which criteria? 1-brand, 2-colour, 3-price"), CHOOSE_CAR("Choose a car: "),
    ALARM("Alarm is 1-on, 2-off")
            ;

    private String message;

    MessagesService(String message){
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void alertMessage(){
        System.out.println(message);
    }
}


