package decoratorPizza;

public class ThinCrustPizza implements Pizza {

    @Override
    public String description() {
        return "ThinCrustPizza";
    }

    @Override
    public int getCost() {

        return 200;

    }
    
}
