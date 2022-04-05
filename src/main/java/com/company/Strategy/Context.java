package com.company.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public String submitButton(){
        return strategy.doAction();
    }
}