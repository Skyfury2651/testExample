package com.company.Factory.ExampleOnline;

public class HatchBackFactory extends CarFactory {

    /**
     *
     */
    public HatchBackFactory() {
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see com.globinch.pattern.factorymethod.CarFactory#manufactureCar(java.lang.String)
     */
    @Override
    public Car manufactureCar(String make) {
        return new HatchBack(make);
    }

}