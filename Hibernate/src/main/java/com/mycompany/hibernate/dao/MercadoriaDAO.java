package com.mycompany.hibernate.dao;

import com.mycompany.hibernate.model.Mercadoria;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class MercadoriaDAO {
    
    private static EntityManager entityManager;
    
    public MercadoriaDAO() {
       
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MercadoriaPersistence");
       entityManager = entityManagerFactory.createEntityManager();
    }
    
    public List<Mercadoria> listAll() {
        
        String jpql = "SELECT m FROM Mercadoria m";
        
        List<Mercadoria> mercadoriaList = entityManager.createQuery(jpql, Mercadoria.class).getResultList();
        
        return mercadoriaList;
    }
    
    public void add(Mercadoria mercadoria) {
        
        entityManager.getTransaction().begin();
        entityManager.persist(mercadoria);
        entityManager.getTransaction().commit();
    }
    
    public void update(Mercadoria mercadoria) { 
        
        entityManager.getTransaction().begin();
        entityManager.merge(mercadoria);
        entityManager.getTransaction().commit();
    }
    
    public void removeById(Long id) {
        
        Mercadoria mercadoria = entityManager.find(Mercadoria.class, id);
        
        entityManager.getTransaction().begin();
        entityManager.remove(mercadoria);
        entityManager.getTransaction().commit();
    }
}
