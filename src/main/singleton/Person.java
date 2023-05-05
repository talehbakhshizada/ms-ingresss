package main.singleton;

public class Person {

    private static Person person;

    private Person(){
    }

    public static Person getInstance() {
        if (person == null) return person = new Person();
        return person;
    }
}
