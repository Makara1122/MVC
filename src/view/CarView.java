package view;

import model.Car;
import model.Engine;

public class CarView {

    public void CarShow(Car car){
        System.out.println("\n ___________ Car brand: " + car.getBrand());
        System.out.println("\n ___________ Car Year : " + car.getYear());
        System.out.println("\n ___________ Car Price : " + car.getPrice());
        car.showEngineSound();
        car.showEngineSpeed();
        System.out.println("\n ___________ Car Engine Brand: " + car.getEngine().getBrandEngine());
        System.out.println("\n ___________ Car Engine Price: " + car.getEngine().getYear());
        System.out.println("\n ___________ Car Engine Brand: " + car.getEngine().getPrice());


    }
}
