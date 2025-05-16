package com.example.DependencyInjectionRef.controller;

import com.example.DependencyInjectionRef.assgnmet.PersonA;
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
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"refConfig.xml", "consConfig.xml", "consConfigA.xml"});
        A a = (A) context.getBean("aref");
        System.out.println(a);
        System.out.println(a.getOb());
        Person person1 = (Person) context.getBean("consObj1");
        Person person2 = (Person) context.getBean("consObj2");
        PersonA person3 =(PersonA) context.getBean("consObj1A");
        PersonA person4 =(PersonA) context.getBean("consObj2A");

        return a.toString()+  person1.toString() +" \n" +person2.toString() + person3.toString() +" \n" +person4.toString();
    }
}
