package com.project_list.project_list.dao;

import com.project_list.project_list.models.Project;
import com.project_list.project_list.models.User;
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

    @Override
    public void Delete_project ( Long id ) {
        Project project = entity_manager.find(Project.class, id);
        entity_manager.remove(project);
    }

    @Override
    public void Add_project ( Project project ) {
        entity_manager.merge(project);
    }

}
