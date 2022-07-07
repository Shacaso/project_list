package com.project_list.project_list.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
@Getter @Setter
@AllArgsConstructor //LOMBOK
@NoArgsConstructor //LOMBOK
public class Project {

    @Id
    @Column(name = "id", nullable = false)
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
