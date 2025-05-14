package com.example.DependencyInjectionRef;

import com.example.DependencyInjectionRef.ref.A;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependencyInjectionRefApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionRefApplication.class, args);

	ApplicationContext context = new ClassPathXmlApplicationContext("refConfig.xml");
	A temp = (A)context.getBean("aref");
	System.out.println(temp);
	System.out.println(temp.getOb());

}

}
