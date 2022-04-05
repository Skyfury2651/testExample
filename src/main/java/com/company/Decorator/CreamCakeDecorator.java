package main.java.com.company.Decorator;

public class CreamCakeDecorator extends CakeDecorator {
    @Override
    public String makeCake() {
        String type = iCake.makeCake();
        return type + addCream();
    }


    public CreamCakeDecorator(ICake cake) {
        super(cake);
    }

    private String addCream() {
        return " + Cream";
    }
}
