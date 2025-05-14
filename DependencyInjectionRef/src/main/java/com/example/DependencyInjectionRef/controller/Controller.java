package com.example.DependencyInjectionRef.controller;

import com.example.DependencyInjectionRef.ref.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    @GetMapping("/")
    public String default_url(){
        ApplicationContext context = new ClassPathXmlApplicationContext("refConfig.xml");
        A a = (A) context.getBean("aref");
        System.out.println(a);
        System.out.println(a.getOb());
        return a.toString();
    }
}
