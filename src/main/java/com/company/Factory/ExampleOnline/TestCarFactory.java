package main.java.com.company.Factory.ExampleOnline;

public class TestCarFactory {
    public static void main(String[] args) {
        try {
            CarFactory carFactory = new SedanFactory();
            Car car = carFactory.getCar(CarMake.Ford.name());
            car.drive();
            carFactory = new HatchBackFactory();
            car = carFactory.getCar(CarMake.Toyota.name());
            car.drive();
            car = carFactory.getCar(CarMake.Honda.name());
            car.drive();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
