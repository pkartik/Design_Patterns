package decoratorPizza;

public class PizzaHelper {
    public static ThinCrustPizza useThinCrustPizzaBase(){
        return new ThinCrustPizza();  
    } 
    public static WholeWheatCrustPizza uWholeWheatCrustPizzaBase(){
        return new WholeWheatCrustPizza();
    }

    public static MozarellaCheese addMozarellaCheeseOnPizzaBase(Pizza pizza){
        return new MozarellaCheese(pizza);
    }

    public static RicottaCheese addRicottaCheeseOnPizzaBase(Pizza pizza){
        return new RicottaCheese(pizza);
    }

    public static ExoticToppings addExoticToppings(Pizza pizza){
        return new ExoticToppings(pizza);
    }

    public static VegetableToppings addVegetableToppings(Pizza pizza){
        return new VegetableToppings(pizza);
    }
}
