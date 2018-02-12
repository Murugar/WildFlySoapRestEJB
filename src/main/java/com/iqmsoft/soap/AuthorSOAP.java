package com.iqmsoft.soap;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.transaction.Transactional;

import com.iqmsoft.dao.AuthorDAO;
import com.iqmsoft.model.Author;


@WebService(portName="AuthorServicePort", name = "AuthorWS", serviceName="AuthorSOAPService", endpointInterface = "com.iqmsoft.soap.AuthorWS")
@Stateless
public class AuthorSOAP implements AuthorWS {
    
    @EJB
    private AuthorDAO adao;
    
   
    @Override
	@Transactional
    public void addAutor(@WebParam(name = "author") Author author) {
        this.adao.add(author);
    }
    
        
   
    @Override
	@Transactional
    public void updateAutor(@WebParam(name = "name") Author author) {
        this.adao.update(author);
    }
    
  
    @Override
    public Author[] listAllAuthors() {
        return this.adao.listAll().toArray(new Author[0]);
    }
}
