package main.abstractfactory;

public class AbstractCarFactory {
    public static CarFactory getFactory(String type) {
        if (type.equalsIgnoreCase("Economy")) {
            return new EconomyCarFactory();
        } else if (type.equalsIgnoreCase("Luxury")) {
            return new LuxuryCarFactory();
        } else {
            throw new IllegalArgumentException("Invalid car type");
        }
    }
}
