package com.company;

import com.company.Strategy.Context;
import com.company.Strategy.CreateStrategy;
import com.company.Strategy.UpdateStrategy;

public class MainStrategy {
    public static void main(String[] args) {
        Context context = new Context(new CreateStrategy());
        System.out.println(context.submitButton());

        context = new Context(new UpdateStrategy());
        System.out.println(context.submitButton());

    }
}
