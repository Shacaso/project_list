package com.project_list.project_list.dao;

import com.project_list.project_list.models.Project;
import com.project_list.project_list.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
    public void delete_project ( Long id ) {

    }

    @Override
    public void register_project ( User user ) {

    }

    @Override
    public boolean Auth_project ( User user ) {
        return false;
    }
}
