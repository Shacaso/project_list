package com.project_list.project_list.dao;

import com.project_list.project_list.models.Project;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class Project_DAO_Imp implements Project_DAO{

    @PersistenceContext
    EntityManager entity_manager; //Conexion con la base de datos

    @Override
    public List<Project> Get_project () {
        String query = "FROM Project";
        return entity_manager.createQuery(query).getResultList();
    }
}
