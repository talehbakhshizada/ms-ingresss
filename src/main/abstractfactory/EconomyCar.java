package main.abstractfactory;

public class EconomyCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Economy Car ");
    }
}
