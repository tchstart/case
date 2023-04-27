package com.example.controller;


import com.example.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public Person test() {
        Person user = new Person();
        user.setRealName("鱼仔仔");
        user.setPhoneNumber("13117972379");
        user.setAddress("河南省商丘市梁园区");
        user.setIdCard("411422200002258325");
        return user;
    }
}