
package decoratorPizza;

public class WholeWheatCrustPizza implements Pizza {

    @Override
    public String description() {
        return "WholeWheatCrustPizza";
    }

    @Override
    public int getCost() {

        return 300;

    }
    
}