package com.company;

import com.company.Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.addPlayer();

        Singleton singleton1 = Singleton.getInstance();
        singleton1.addPlayer();

        System.out.println(singleton.getCurrentPlayer());
        System.out.println(singleton1.getCurrentPlayer());
    }
}
