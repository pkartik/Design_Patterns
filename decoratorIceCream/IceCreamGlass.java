package decoratorIceCream;

public class IceCreamGlass implements IceCream {

    @Override
    public String description() {
            return "IceCream Glass";

    }

    @Override
    public int getCost() {
            return 130;

    }
    
}
