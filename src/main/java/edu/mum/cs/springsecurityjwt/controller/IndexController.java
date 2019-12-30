package edu.mum.cs.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "Hello World";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String show(){
        System.out.println("hello triggered");
        return "hello";
    }
}
