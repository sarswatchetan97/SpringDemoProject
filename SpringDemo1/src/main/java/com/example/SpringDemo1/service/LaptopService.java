package com.example.SpringDemo1.service;

import com.example.SpringDemo1.model.Laptop;
import com.example.SpringDemo1.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    public void addLaptop(Laptop laptopObj) {
//        System.out.println("Add Laptop Method called");
        laptopRepository.save(laptopObj);
    }
}
