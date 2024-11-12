package com.rest_api.rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class RestApiApplication {

    public static void main(String[] args) {
        System.out.println("args : " + Arrays.toString(args));
        SpringApplication.run(RestApiApplication.class, args);
    }

}
