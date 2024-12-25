package decoratorIceCream;

public class ChocolateSyrup extends IceCreamDecorator {

    public ChocolateSyrup(IceCream iceCream){
        super(iceCream);
    }

    @Override
    public String description() {
        return iceCream.description()+" Chocolate Syrup";
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+ 70;
    }
    
}
