package main.abstractfactory;

public class LuxuryCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Luxury Car");
    }
}
