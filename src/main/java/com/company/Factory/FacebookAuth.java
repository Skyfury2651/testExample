package main.java.com.company.Factory;

public class FacebookAuth implements IAuth{
    @Override
    public void login() {
        System.out.println("Login with Facebook provider");
    }

    @Override
    public void register() {
        System.out.println("Register with Facebook provider");
    }
}
