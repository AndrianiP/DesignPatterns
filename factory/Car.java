package factory;

import java.util.*;

public abstract class Car {
    private String make;
    private String model;
    protected ArrayList<Accessories> Accessories = new ArrayList<Accessories>();

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void assemble() {
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();
    }
    protected abstract void addFrame();

    protected void addWheels() {

    }
    protected void addEngine() {

    }
    protected void addWindows() {

    }
    protected abstract void addAccessories();

    protected void displayAccessories() {

    }
}
