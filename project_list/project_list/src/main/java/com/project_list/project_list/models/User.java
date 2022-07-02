package com.project_list.project_list.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "users")
@AllArgsConstructor //LOMBOK
public class User {

    @Id
    @Getter @Setter @Column (name = "id")
    private Long ID;

    @Getter @Setter @Column (name = "first_name")
    private String first_name;

    @Getter @Setter @Column (name = "last_name")
    private String last_name;

    @Getter @Setter @Column (name = "mail")
    private String mail;

    @Getter @Setter @Column (name = "password")
    private String password;

}
