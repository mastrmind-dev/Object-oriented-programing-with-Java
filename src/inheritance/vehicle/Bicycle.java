package src.inheritance.vehicle;

public class Bicycle extends Vehicle {
    private final int wheels = 2;
    private final int pedals = 2;

    public Integer getWheels() {
        return wheels;
    }

    public Integer getPedals() {
        return pedals;
    }
}
