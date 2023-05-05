package main.abstractfactory;

public class App {
    public static void main(String[] args) {
        CarFactory economyCarFactory = AbstractCarFactory.getFactory("Economy");
        Car economyCar = economyCarFactory.createCar();
        economyCar.assemble();

        CarFactory luxuryCarFactory = AbstractCarFactory.getFactory("Luxury");
        Car luxuryCar = luxuryCarFactory.createCar();
        luxuryCar.assemble();
    }
}
