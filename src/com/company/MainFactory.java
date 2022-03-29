package com.company;

import com.company.Factory.AuthFactory;
import com.company.Factory.FacebookAuth;
import com.company.Factory.GoogleAuth;
import com.company.Factory.IAuth;

import java.util.Random;

public class MainFactory {
    protected static IAuth auth;

    public static void main(String[] args) throws Exception {

        auth = new AuthFactory().createAuth(1);
        auth.register();

        auth = new AuthFactory().createAuth(2);
        auth.login();

        // extend for OCP in Factory.ExampleOnline to create factory without define Concrete class
    }
}
