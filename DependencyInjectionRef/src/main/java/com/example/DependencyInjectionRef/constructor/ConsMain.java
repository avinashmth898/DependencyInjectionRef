package com.example.DependencyInjectionRef.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("consConfig.xml");
        Person obj1 = (Person) context.getBean("consObj1");
        Person obj2 = (Person) context.getBean("consObj2");
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
