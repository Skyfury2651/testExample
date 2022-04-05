package main.java.com.company.Decorator;

public class CherryCakeDecorator extends CakeDecorator {
    @Override
    public String makeCake() {
        String type = iCake.makeCake();
        return type + addCherry();
    }


    public CherryCakeDecorator(ICake cake) {
        super(cake);
    }

    private String addCherry() {
        return " + Cherry";
    }
}