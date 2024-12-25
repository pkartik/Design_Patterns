
package decoratorPizza;

public class MozarellaCheese extends PizzaDecorator {

    public MozarellaCheese(Pizza pizza){
        super(pizza);
    }

    @Override
    public String description() {
       return pizza.description()+" with MozarellaCheese";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+100;

    }

    
}