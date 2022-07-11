package com.project_list.project_list.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter @Setter
@AllArgsConstructor //LOMBOK
@NoArgsConstructor //LOMBOK
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long ID;

    @Column (name = "first_name")
    private String first_name;

    @Column (name = "last_name")
    private String last_name;

    @Column (name = "mail")
    private String mail;

    @Column (name = "password")
    private String password;

}
