package main.prototype;

public class Car {

    public String name;

    public Car(String name) {
        this.name = name;
    }

    public Car cloneCar() {
        return new Car(name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
