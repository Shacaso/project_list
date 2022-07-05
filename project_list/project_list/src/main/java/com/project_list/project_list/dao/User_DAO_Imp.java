package com.project_list.project_list.dao;

import com.project_list.project_list.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class User_DAO_Imp implements User_DAO{
    @PersistenceContext
    EntityManager entity_manager; //Conexion con la base de datos
    @Override
    public List<User> Get_users() {
        String query = "FROM User";
        return entity_manager.createQuery(query).getResultList();
    }
    @Override
    public void delete_user(Long id) {
        User user = entity_manager.find(User.class, id);
        entity_manager.remove(user);
    }

    @Override
    public void register_user(User user) {
        entity_manager.merge(user);
    }
}
