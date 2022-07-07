package com.project_list.project_list.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "projects")
@Getter @Setter
@AllArgsConstructor //LOMBOK
@NoArgsConstructor //LOMBOK
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column (name = "password")
    private String idea;

   @Column (name = "state")
    private String state;

    @Column (name = "repository")
    private String repository;

    @Column (name = "bibliografy")
    private String bibliografy;

}
