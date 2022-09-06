package com.gfttraining.entities;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityGenre {

private Long id;
    private String name;
    
    
    public EntityGenre() {
        
    }
    
    public EntityGenre(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    
    
    public Long getId() {
        return id;
    }



   public void setId(Long id) {
        this.id = id;
    }



   public String getName() {
        return name;
    }



   public void setName(String name) {
        this.name = name;
    }
   @Override
	    public String toString() {
	        return "Genre{" +
	                "id=" + id +
	                ", name=" + name +
	                '}';
	    }
}
