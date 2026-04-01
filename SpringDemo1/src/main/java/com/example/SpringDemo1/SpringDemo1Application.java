package com.example.SpringDemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemo1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemo1Application.class, args);
        Alien obj = context.getBean(Alien.class);
        System.out.println("Age: " + obj.getAge());
        obj.code();
	}

}
