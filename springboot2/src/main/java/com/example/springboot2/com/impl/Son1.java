package com.example.springboot2.com.impl;

import com.example.springboot2.com.Father;
import org.springframework.stereotype.Component;

@Component
public class Son1 implements Father {
    @Override
    public void run() {
        System.out.println("son1");
    }
}
