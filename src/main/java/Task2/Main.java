package Task2;

import Task2.Classes.Car;
import Task2.Services.BrandService;
import Task2.Services.FunctionsService;
import Task2.Services.MessagesService;
import Task2.Services.OptionsService;

import java.util.*;

import static java.lang.System.exit;


public class Main {
    public static void main(String [] args){
        List<Car> carList=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        while (true){
            MessagesService.CHOOSE_OPT.alertMessage();
            System.out.println((Arrays.toString(OptionsService.values())));
            int ind=0;
            try {
                ind = input.nextInt();
            }catch (InputMismatchException e){
                MessagesService.ERROR.alertMessage();
            }finally {
                input.nextLine();
            }
            OptionsService option = null;
            for(OptionsService value: OptionsService.values()){
                if(ind==value.getOptionNumber()){
                    option=value;
                }
            }
            FunctionsService functionsService=new FunctionsService();
            switch (option){
                case ADD:
                    functionsService.add(carList);
                    break;
                case SHOW:
                    functionsService.show(carList);
                    break;
                case REMOVE:
                    functionsService.remove(carList);
                    break;
                case SORT:
                    functionsService.sort(carList);
                    break;
                case ALARM:
                    functionsService.alarm(carList);
                    break;
                case EXIT:
                    exit(0);
            }
        }

    }

}
