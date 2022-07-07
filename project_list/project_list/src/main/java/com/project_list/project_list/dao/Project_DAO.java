package com.project_list.project_list.dao;

import com.project_list.project_list.models.Project;
import com.project_list.project_list.models.User;

import java.util.List;

public interface Project_DAO {
    List<Project> Get_project();

    void delete_project(Long id);

    void register_project(User user);

    boolean Auth_project(User user);
}
