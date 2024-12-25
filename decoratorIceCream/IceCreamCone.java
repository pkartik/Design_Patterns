
package decoratorIceCream;

class IceCreamCone implements IceCream {

    @Override
    public String description() {

        return "IceCream Cone";

    }

    @Override
    public int getCost() {

        return 110;

    }

    
}