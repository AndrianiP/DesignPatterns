package factory;

import java.util.ArrayList;

public class SedanCar extends Car {
    public SedanCar(String make, String model) {
        super(make, model);
        addAccessories();
        // Calls the assemble method from Car class
        assemble();
    }

    protected void addFrame() {
        System.out.println("Adding a three part frame");
    }

    // Adds list of accessories to the Arraylist
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
    }
}
