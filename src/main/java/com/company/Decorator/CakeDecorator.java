package com.company.Decorator;

public abstract class CakeDecorator implements ICake {
    protected ICake iCake;

    public CakeDecorator(ICake cake) {
        iCake = cake;
    }

    public ICake getCake() {
        return iCake;
    }

    public void setPizza(ICake cake) {
        this.iCake = cake;
    }
}
