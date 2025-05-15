package com.example.DependencyInjectionRef.controller;

import com.example.DependencyInjectionRef.constructor.Person;
import com.example.DependencyInjectionRef.ref.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    @GetMapping("/")
    public String default_url(){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"refConfig.xml", "consConfig.xml"});
        A a = (A) context.getBean("aref");
        System.out.println(a);
        System.out.println(a.getOb());
        Person person1 = (Person) context.getBean("consObj1");
        Person person2 = (Person) context.getBean("consObj2");
        return a.toString()+  person1.toString() +" \n" +person2.toString();
    }
}
