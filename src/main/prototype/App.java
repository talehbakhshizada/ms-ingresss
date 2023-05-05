package main.prototype;

public class App {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        Car firstClone = car.cloneCar();
        Car secondClone = car.cloneCar();
        System.out.println(car + "," + car.hashCode());
        System.out.println(firstClone + "," + firstClone.hashCode());
        System.out.println(secondClone + "," + secondClone.hashCode());
    }
}
