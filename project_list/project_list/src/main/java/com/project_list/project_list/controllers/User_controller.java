package com.project_list.project_list.controllers;

import com.project_list.project_list.dao.User_DAO;
import com.project_list.project_list.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class User_controller {

    @Autowired
    private User_DAO user_dao;

    @RequestMapping(value = "api/users", method = RequestMethod.GET)
    public List<User> Get_users(){
        return user_dao.Get_users();
    }

    @RequestMapping(value = "api/users/{id}",method = RequestMethod.DELETE)
    public void Delete_users(@PathVariable Long id){
        user_dao.delete_user(id);
    }

    @RequestMapping(value = "api/users", method = RequestMethod.POST)
    public void Add_users(@RequestBody User user){
        user_dao.register_user(user);
    }
    @RequestMapping(value = "user1", method = RequestMethod.GET)
    public List<User> Edit_users(){
        return List.of();//PASS
    }

    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody User user){
        if(user_dao.Auth_user(user)){
            return "OK";
        } else {
            return "FAIL";
        }
    }


}
