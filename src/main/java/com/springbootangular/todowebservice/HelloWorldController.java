package com.springbootangular.todowebservice;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path="/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        //throw new RuntimeException("Some error happened! Please contact suport at bla bla.");
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World,  %s", name));
    }

}
