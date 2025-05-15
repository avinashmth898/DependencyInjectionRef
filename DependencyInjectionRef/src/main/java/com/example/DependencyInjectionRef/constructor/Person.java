package com.example.DependencyInjectionRef.constructor;

public class Person {
    private Car car;
    private String name;
    private int id;
    public Person(){
        super();
    }
    public Person(String name, int id, Car car){
        this.name=name;
        this.id=id;
        this.car=car;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", id=" + id + " "+this.car.price+ " "+this.car.name+'}';
    }
}
