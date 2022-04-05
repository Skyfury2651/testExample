package com.company.Factory.ExampleOnline;

public abstract class CarFactory {

    public Car getCar(String make) throws Exception {
        try {
            CarMake.valueOf(make);
        } catch (IllegalArgumentException e) {
            throw new Exception("This make " + make + " is not available");
        }
        Car car = manufactureCar(make);
        System.out.println("...The car " + car.getMake() + " is ready to deliver...");
        return car;
    }

    protected abstract Car manufactureCar(String make);
}