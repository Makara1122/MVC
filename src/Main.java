import controller.CarController;
import model.Car;
import model.Engine;
import view.CarView;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine());
        CarView view = new CarView();
        CarController controller = new CarController();
        car = (Car) controller.controllerCar();
        view.CarShow(car);
//      view.CarShow(car);
    }
}