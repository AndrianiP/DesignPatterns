package factory;

public class CarFactory {
    public static Car createCar(String type, String make, String model) {

        switch (type.toLowerCase()) {
            case "small":
                // Creates a small car intaking the make and model from the CarStore class
                Car tempSmall = new SmallCar(make, model);
                return tempSmall;
            case "sedan":
                // Creates a sedan intaking the make and model from the CarStore class
                Car tempSedan = new SedanCar(make, model);
                return tempSedan;
            case "luxury":
                // Creates a luxury car intaking the make and model from the CarStore class
                Car tempLuxury = new LuxuryCar(make, model);
                return tempLuxury;

            default:
                System.out.println(
                        "please enter one of the three types: Small, Sedan, or Luxury. We will create a small car since nothing was put in.");
                Car emptyCar = new SmallCar(make, model);
                return emptyCar;
        }

    }
}
