package com.example.DependencyInjectionRef.assgnmet;

public class CarA {
    String name;
    int price;
    public CarA(String name, int price){
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