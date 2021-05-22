package factory;

import java.util.*;

public abstract class Car {
    private String make;
    private String model;
    // Array to keep a list of accessories assigned in the subclasses
    protected ArrayList<Accessories> accessories = new ArrayList<Accessories>();

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Calls each method in the class in
    public void assemble() {
        System.out.println("Creating a " + make + " " + model);
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        displayAccessories();
    }

    protected abstract void addFrame();

    protected void addWheels() {
        System.out.println("Adding the Wheels");
    }

    protected void addEngine() {
        System.out.println("Adding a Standard Engine");
    }

    protected void addWindows() {
        System.out.println("Adding Windows");
    }

    protected abstract void addAccessories();

    protected void displayAccessories() {
        System.out.println("Accessories:");
        for (Accessories accessory : accessories) {
            System.out.println("- " + accessory);
        }
    }
}
