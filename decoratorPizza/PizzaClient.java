package decoratorPizza;

import static decoratorPizza.PizzaHelper.useThinCrustPizzaBase;
import static decoratorPizza.PizzaHelper.addMozarellaCheeseOnPizzaBase;
import static decoratorPizza.PizzaHelper.addVegetableToppings;

public class PizzaClient {
     public static void main(String[] args) {

          Pizza pizza = addVegetableToppings(addMozarellaCheeseOnPizzaBase(useThinCrustPizzaBase()));
          System.out.println(pizza.description());
          System.out.println(pizza.getCost());
        
     }
}
