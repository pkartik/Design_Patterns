package decoratorIceCream;

public class VanillaScoop extends IceCreamDecorator {

    public VanillaScoop(IceCream iceCream){
        super(iceCream);
    }

    @Override
    public String description() {
        return iceCream.description()+" Vanilla Scoop";
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+50;

    }
    
}
