package factory;

public class CarFactory {
    public static Car createCar(String type, String make, String model) {

        switch (type.toLowerCase()) {
            case "small":
                Car tempSmall = new SmallCar(make, model);
                return tempSmall;
            case "sedan":
                Car tempSedan = new SedanCar(make, model);
                return tempSedan;
            case "luxury":
                Car tempLuxury = new LuxuryCar(make, model);
                return tempLuxury;

            default:
                System.out.println("please enter one of the three types: Small, Sedan, or Luxury");
                Car emptyCar = new SmallCar(make, model);
                return emptyCar;
        }

    }
}
