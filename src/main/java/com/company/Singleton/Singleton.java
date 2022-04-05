package com.company.Singleton;

public class Singleton {
    private int currentPlayer;
    private static Singleton instance;

    public Singleton () {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void addPlayer() {
        this.currentPlayer += 1;
    }
}
