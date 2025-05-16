package com.example.DependencyInjectionRef.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSum {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ambiConfig.xml");
        Sum sum = (Sum) context.getBean("addition1");
        sum.doSum();
    }
}
//if order is like int,int
//
//Constructor: int, int
//37
//
//Now reversing the order of the constructor in Sum.java
//
//Constructor: double,double
//37
//
//But as soon we put String , String It'll not care for order and it'll take string
//Output
//Constructor: String, String
//37
//
//we can give type in constructor-arg