package main.java.com.company.Factory.ExampleOnline;

public class Sedan extends Car {

    /**
     *
     */
    public Sedan(String make) {
        super(make);
    }

    /* (non-Javadoc)
     * @see com.globinch.pattern.factorymethod.Car#drive()
     */
    @Override
    public void drive() {
        System.out.println("I am driving "+getMake()+" Sedan car!");

    }

}