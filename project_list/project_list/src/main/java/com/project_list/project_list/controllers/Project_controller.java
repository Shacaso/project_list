package com.project_list.project_list.controllers;

import com.project_list.project_list.dao.Project_DAO;
import com.project_list.project_list.models.Project;
import com.project_list.project_list.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Project_controller {

    @Autowired
    Project_DAO project_dao;

    @RequestMapping(value = "api/tables_projects", method = RequestMethod.GET)
    public List<Project> Get_projects () {
        return project_dao.Get_project();
    }

    @RequestMapping(value = "api/tables_projects/{id}",method = RequestMethod.DELETE)
    public void Delete_project(@PathVariable Long id){
        project_dao.Delete_project(id);
    }
    @RequestMapping(value = "api/tables_projects", method = RequestMethod.POST)
    public void Add_projects(@RequestBody Project project){
        project_dao.Add_project(project);
    }

}
