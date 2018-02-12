package com.iqmsoft.dao;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.iqmsoft.model.Author;


@Stateless
@Local(AuthorDAO.class)
public class AuthorImpl implements AuthorDAO {
    
    @PersistenceContext(unitName = "product")
    private EntityManager manager;
    
    @Override
    public void add(Author autor) {
        this.manager.persist(autor);
    }

    @Override
    public void remove(Author autor) {
        Author merged = this.manager.merge(autor);
        this.manager.remove(merged);
    }

    @Override
    public List<Author> listAll() {
        TypedQuery<Author> query = this.manager
                .createQuery("SELECT a FROM Autor a", Author.class);
        return query.getResultList();
    }

    @Override
    public void update(Author autor) {
        this.manager.merge(autor);
    }

   
    
    
}
