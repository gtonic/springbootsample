package com.alp54.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Hello {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    private String message;
    
    public Hello() {};
    
    public Hello(final long id, final String message) {
        this.id = id;
        this.message = message;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}