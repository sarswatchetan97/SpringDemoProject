package com.example.SpringDemo1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

    public void Desktop() {
        System.out.println("Desktop Object created");
    }

    @Override
    public void compile() {
        System.out.println("Code compiled from Desktop");
    }
}
