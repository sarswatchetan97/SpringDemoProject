package com.example.SpringDemo1.repo;

import com.example.SpringDemo1.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptopObj) {
        System.out.println("Laptop Saved");
    }
}
