package com.project_list.project_list.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {


    private String first_name;
    private String last_name;
    private String mail;
    private String password;

}
