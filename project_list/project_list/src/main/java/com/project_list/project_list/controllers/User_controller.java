package com.project_list.project_list.controllers;

import com.project_list.project_list.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User_controller {

    @RequestMapping(value = "users")
    public User getUser(){
     return new User("Alejo","Araya","alejoaraya2000@gmail.com","12345");
    }


}
