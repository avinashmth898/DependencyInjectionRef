package com.example.DependencyInjectionRef.assgnmet;
import java.util.List;

public class PersonA {
    private CarA car;
    private String name;
    private int id;
    private List<String> famName;
    public PersonA(){
        super();
    }
    public PersonA(String name, int id, CarA car, List<String> famName){
        this.name=name;
        this.id=id;
        this.car=car;
        this.famName=famName;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", id=" + id + " Family members name: "+famName + " "+this.car.price+ " "+this.car.name+'}';

    }
}

