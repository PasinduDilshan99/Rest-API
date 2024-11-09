package com.rest_api.rest_api.controller;

import com.rest_api.rest_api.model.HelloWorldBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    private static Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world/{name}")
    public HelloWorldBean helloWorldbean(@PathVariable String name){
        logger.info("Path Variables : " + name);
        return new HelloWorldBean(name);
    }

}
