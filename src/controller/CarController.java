package controller;

import model.Car;
import model.Engine;
import java.util.Scanner;
public class CarController {
    Car car = new Car(new Engine());



    Scanner scanner = new Scanner(System.in);

    public Car controllerCar (){

        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();
        car.setBrand(brand);
        System.out.print("Enter car Year: ");
        Integer year = scanner.nextInt();
        car.setYear(year);
        System.out.print("Enter car Price: ");
        Float price = scanner.nextFloat();
        car.setPrice(price);
        System.out.print("Enter engine brand: ");
        scanner.nextLine();
        String brandEngine = scanner.nextLine();
        car.getEngine().setBrandEngine(brandEngine);
        System.out.print("Enter engine year: ");
        Integer yearEngine = scanner.nextInt();
        car.getEngine().setYear(yearEngine);
        System.out.print("Enter engine Price: ");
        Float priceEngine = scanner.nextFloat();
        car.getEngine().setPrice(priceEngine);




        return this.car;
    }
}
