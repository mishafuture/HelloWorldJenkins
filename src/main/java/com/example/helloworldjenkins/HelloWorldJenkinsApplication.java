package com.example.helloworldjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldJenkinsApplication.class, args);

        System.out.println("Hello world1!");
    }

}
