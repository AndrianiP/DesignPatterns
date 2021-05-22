package factory;

public class SmallCar extends Car {
    public SmallCar(String make, String model) {
        super(make, model);
        addAccessories();
        assemble();
    }

    protected void addFrame() {
        System.out.println("Adding a small frame");
    }

    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
        
    }
}