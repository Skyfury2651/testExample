package main.java.com.company;

import main.java.com.company.Decorator.*;

public class MainDecorator {
    public static void main(String[] args) {
        ICake cake = new TwoLevelCake();
        cake = new CreamCakeDecorator(cake);

        ICake cake3 = new ThreeLevelCake();
        System.out.println(new CreamCakeDecorator(new CherryCakeDecorator(cake3)).makeCake());

        System.out.println(cake.makeCake());
    }
}
