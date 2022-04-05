package main.java.com.company.Factory.ExampleOnline;

public abstract class Car {
    private String make;

    public Car(String make) {
        this.make = make;
    }

    public abstract void drive();

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }
}
