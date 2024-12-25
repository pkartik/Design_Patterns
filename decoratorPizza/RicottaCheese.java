package decoratorPizza;

public class RicottaCheese extends PizzaDecorator {

    public RicottaCheese(Pizza pizza){
        super(pizza);
    }

    @Override
    public String description() {
        return pizza.description()+" with RicottaCheese";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+ 140;

    }
    
}
