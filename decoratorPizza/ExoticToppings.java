package decoratorPizza;

public class ExoticToppings extends PizzaDecorator {

    public ExoticToppings(Pizza pizza){
        super(pizza);
    }

    @Override
    public String description() {
        return pizza.description()+" - chocolate, marshmallows, cookies, edible gold and bananas are added as toppings";

    }

    @Override
    public int getCost() {
      return pizza.getCost()+250;

    }
    
}
