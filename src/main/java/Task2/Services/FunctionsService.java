package Task2.Services;

import Task2.Classes.BMW;
import Task2.Classes.Car;
import Task2.Classes.Mercedes;
import java.util.*;



public class FunctionsService {
    Scanner input=new Scanner(System.in);
    public void add(List<Car> carList){
        MessagesService.CHOOSE_BRAND.alertMessage();
        System.out.println(Arrays.toString(BrandService.values()));
        int number=0;
        try {
            number=input.nextInt();
        }catch (InputMismatchException exception){
            MessagesService.ERROR.alertMessage();
        }finally {
            input.nextLine();
        }
        String brand="";
        if(number==BrandService.OTHER.getBrandNumber()){
            MessagesService.CHOOSE_BRAND.alertMessage();
            brand=input.nextLine();
        }
        MessagesService.ENTER.alertMessage();
        MessagesService.MODEL.alertMessage();
        String model=input.nextLine();
        MessagesService.COLOUR.alertMessage();
        String colour=input.nextLine();
        MessagesService.PRICE.alertMessage();
        int price=input.nextInt();
        MessagesService.SPEED_UP.alertMessage();
        float speedup=input.nextFloat();
        MessagesService.SLOW_DOWN.alertMessage();
        float slowdown=input.nextFloat();

        Car car=null;
        if(number==BrandService.BMW.getBrandNumber()){
            car=new BMW(model,colour,price,speedup,slowdown);
        }
        else if(number==BrandService.MERS.getBrandNumber()){
            car=new Mercedes(model,colour,price,speedup,slowdown);
        }
        else if (number==BrandService.OTHER.getBrandNumber()){
            car=new Car(brand,model,colour,price,speedup,slowdown);
        }
        carList.add(car);
    }
    public void show(List<Car> carList){
        for(Car cars:carList){
            System.out.println(carList.indexOf(cars));
            String disp=cars.display();
            System.out.println(disp);
        }
    }
    public void remove(List<Car> carList){
        MessagesService.REMOVE.alertMessage();
        int ind=input.nextInt();
        if(ind<carList.size()){
            carList.remove(ind);
            MessagesService.SUCCESS.alertMessage();
        }
        else MessagesService.ERROR.alertMessage();
    }
    public void sort(List<Car> carList){
        MessagesService.CRIT.alertMessage();
        int number=input.nextInt();
        if(number==1){
            carList.sort(Comparator.comparing(Car::getBrand));
        }
        else if(number==2){
            carList.sort(Comparator.comparing(Car::getColour));
        }
        else if(number==3){
            carList.sort(Comparator.comparing(Car::getPrice));
        }
        else MessagesService.ERROR.alertMessage();
    }

    public void alarm(List<Car> carList){
        MessagesService.CHOOSE_CAR.alertMessage();
        int ind=input.nextInt();
        if(ind<carList.size()){
           Car car=carList.get(ind);
           MessagesService.ALARM.alertMessage();
           int number=input.nextInt();
           if(number==1) System.out.println(car.turnAlarmOn(car.isAlarmOn));
           else if(number==2) System.out.println(car.turnAlarmOff(car.isAlarmOn));
           else MessagesService.ERROR.alertMessage();
            MessagesService.SUCCESS.alertMessage();
        }
        else MessagesService.ERROR.alertMessage();
    }
}
