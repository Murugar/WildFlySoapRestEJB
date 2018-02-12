package com.iqmsoft.dao;

import java.util.List;

import com.iqmsoft.model.Author;

public interface AuthorDAO {
	
	    
	    void add(Author autor);
	    void remove(Author autor);
	    List<Author> listAll();
	    void update(Author autor);
	    
	
}
