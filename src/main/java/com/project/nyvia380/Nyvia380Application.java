package com.project.nyvia380;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Nyvia380Application {

    public static void main(String[] args) {
        System.setProperty("server.port", "8080");
        SpringApplication.run(Nyvia380Application.class, args);



    }

}
