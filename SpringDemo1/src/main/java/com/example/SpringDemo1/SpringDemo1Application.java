package com.example.SpringDemo1;

import com.example.SpringDemo1.model.Alien;
import com.example.SpringDemo1.model.Laptop;
import com.example.SpringDemo1.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemo1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemo1Application.class, args);

        LaptopService laptopService = context.getBean(LaptopService.class);

        Laptop laptopObj = context.getBean(Laptop.class);
        laptopService.addLaptop(laptopObj);

//        Alien obj = context.getBean(Alien.class);
//        System.out.println("Age: " + obj.getAge());
//        obj.code();
	}

}
