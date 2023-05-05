package main.abstractfactory;

public class LuxuryCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new LuxuryCar();
    }
}
