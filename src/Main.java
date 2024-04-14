package src;

import src.inheritance.vehicle.Bicycle;
import src.inheritance.vehicle.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();

        Bicycle bicycle = new Bicycle();
        bicycle.go();

        //stopping
        car.stop();
        bicycle.stop();

        //attributes
        System.out.println("Car has " + car.getWheels() + " wheels and " + car.getDoors() + " doors");
        System.out.println("Bicycle has " + bicycle.getWheels() + " wheels and " + bicycle.getPedals() + " pedals");
    }
}
