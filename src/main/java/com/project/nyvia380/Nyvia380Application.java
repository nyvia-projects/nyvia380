package com.project.nyvia380;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Nyvia380Application {

    public static void main(String[] args) {
        SpringApplication.run(Nyvia380Application.class, args);


        TestClass.print();
    }

}
