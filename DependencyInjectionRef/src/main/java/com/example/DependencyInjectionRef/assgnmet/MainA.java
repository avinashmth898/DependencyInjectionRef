package com.example.DependencyInjectionRef.assgnmet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainA {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("consConfigA.xml");
        PersonA person1 = (PersonA) context.getBean("consObj1A");
        System.out.println(person1);
        PersonA person2 = (PersonA) context.getBean("consObj2A");
        System.out.println(person2);
    }
}
