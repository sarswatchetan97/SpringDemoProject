package com.example.SpringDemo1.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void Laptop() {
        System.out.println("Laptop Object created");
    }

    @Override
    public void compile() {
        System.out.println("Code compiled from Laptop");
    }
}
