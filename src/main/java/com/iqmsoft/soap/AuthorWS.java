package com.iqmsoft.soap;

import javax.ejb.Remote;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.iqmsoft.model.Author;


@WebService(targetNamespace = "http://iqmsoft.com")
@Remote
public interface AuthorWS {

	@WebMethod
	void addAutor(@WebParam(name = "author") Author author);
	@WebMethod
	void updateAutor(@WebParam(name = "name") Author author);
	@WebMethod
	Author[] listAllAuthors();

}