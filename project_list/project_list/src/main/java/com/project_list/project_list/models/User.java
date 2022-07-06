package com.project_list.project_list.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@AllArgsConstructor //LOMBOK
@NoArgsConstructor //LOMBOK
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
