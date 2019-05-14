package com.imooc.gril;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrilApplication {

    public static void main(String[] args) {
        System.out.println("testHello");
        SpringApplication.run(GrilApplication.class, args);
    }
}
