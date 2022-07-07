package com.project_list.project_list.controllers;

import com.project_list.project_list.dao.Project_DAO;
import com.project_list.project_list.models.Project;
import com.project_list.project_list.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Project_controller {

    @Autowired
    Project_DAO project_dao;

    @RequestMapping(value = "api/projects", method = RequestMethod.GET)
    public List<Project> Get_projects () {
        return project_dao.Get_project();
    }

}
