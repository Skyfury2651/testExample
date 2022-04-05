package main.java.com.company;

import main.java.com.company.Strategy.Context;
import main.java.com.company.Strategy.CreateStrategy;
import main.java.com.company.Strategy.UpdateStrategy;

public class MainStrategy {
    public static void main(String[] args) {
        Context context = new Context(new CreateStrategy());
        System.out.println(context.submitButton());

        context = new Context(new UpdateStrategy());
        System.out.println(context.submitButton());

    }
}
