package decoratorPizza;

public class VegetableToppings extends PizzaDecorator {

    public VegetableToppings(Pizza pizza){
        super(pizza);
    }

    @Override
    public String description() {
        return pizza.description()+" - Tomatoes, mushrooms, onions and olives are added as toppings";

    }

    @Override
    public int getCost() {
        return pizza.getCost()+150;

    }
    
}
