package com.example.DependencyInjectionRef.constructor;

public class Car {
    String name;
    int price;
    public Car(String name, int price){
//        super();
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}