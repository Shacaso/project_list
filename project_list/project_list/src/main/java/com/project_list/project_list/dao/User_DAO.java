package com.project_list.project_list.dao;

import com.project_list.project_list.models.User;

import java.util.List;

public interface User_DAO {
    List<User> Get_users();

    void delete_user(Long id);

    void register_user(User user);

    boolean Auth_user(User user);
}
