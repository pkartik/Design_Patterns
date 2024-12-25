package decoratorIceCream;
import static decoratorIceCream.IceCreamHelper.addChocolateSyrup;
import static decoratorIceCream.IceCreamHelper.addIceCreamGlass;
import static decoratorIceCream.IceCreamHelper.addVanillaScoop;

public class IceCreamClient {

    public static void main(String[] args) {
        
        IceCream iceCream = addChocolateSyrup(addVanillaScoop(addIceCreamGlass()));
        System.out.println("Order IceCream "+iceCream.description());
        System.out.println(" Cost of IceCream "+iceCream.getCost());

    }
    
}