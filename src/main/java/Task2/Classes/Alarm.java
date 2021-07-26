package Task2.Classes;

public interface Alarm {
    default String turnAlarmOn(boolean isAlarmOn){
        if(isAlarmOn) return "Alarm is already on";
        else{
            isAlarmOn=true;
            return "Alarm on";
        }
    }

    default String turnAlarmOff(boolean isAlarmOn){
        if(!isAlarmOn) return "Alarm is already off";
        else {
            isAlarmOn=false;
            return "Alarm off";
        }
    }
}
