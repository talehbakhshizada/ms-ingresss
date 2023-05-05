package main.abstractfactory;

public class EconomyCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new EconomyCar();
    }
}
