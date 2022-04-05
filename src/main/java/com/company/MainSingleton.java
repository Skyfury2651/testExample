package main.java.com.company;

import main.java.com.company.Singleton.Singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.addPlayer();

        Singleton singleton1 = Singleton.getInstance();
        singleton1.addPlayer();

        System.out.println(singleton.getCurrentPlayer());
        System.out.println(singleton1.getCurrentPlayer());
    }
}
