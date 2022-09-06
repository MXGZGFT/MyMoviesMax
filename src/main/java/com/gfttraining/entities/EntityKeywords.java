package com.gfttraining.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class EntityKeywords {
	int id;
	String name;
	public EntityKeywords(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public EntityKeywords() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
		return "EntityKeywords [kw_id=" + id + ", kw_name=" + name + "]";
	}
}
