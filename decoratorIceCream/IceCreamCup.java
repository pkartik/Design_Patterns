package decoratorIceCream;

public class IceCreamCup implements IceCream{

    @Override
    public String description() {
            return "IceCream Cup";

    }

    @Override
    public int getCost() {
            return 120;

    }
    
}
