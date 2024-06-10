package com.nttdata.dipartimentoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication( scanBasePackages = {"com.nttdata.dipartimentoapi"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}