package com.iqmsoft.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Author implements Serializable {
    
    @Id
    private String email;
    private String name;
    

    public Author(String email, String nome) {
        this.email = email;
        this.name = nome;
        
    }

    public Author() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

  

    @Override
    public String toString() {
        return "Author{" + "email=" + email + ", name=" + name + "}";
    }
}
