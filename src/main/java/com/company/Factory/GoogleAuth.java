package main.java.com.company.Factory;

public class GoogleAuth implements IAuth {
    @Override
    public void login() {
        System.out.println("Login with Google provider");
    }

    @Override
    public void register() {
        System.out.println("Register with Google provider");
    }
}
