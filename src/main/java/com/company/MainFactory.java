package main.java.com.company;

import main.java.com.company.Factory.AuthFactory;
import main.java.com.company.Factory.FacebookAuth;
import main.java.com.company.Factory.GoogleAuth;
import main.java.com.company.Factory.IAuth;

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
