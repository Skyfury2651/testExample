package main.java.com.company.Factory.ExampleOnline;

public class SedanFactory extends CarFactory {

    /* (non-Javadoc)
     * @see com.globinch.pattern.factorymethod.CarFactory#manufactureCar(java.lang.String)
     */
    @Override
    public Car manufactureCar(String make) {
        return new Sedan(make);
    }

}