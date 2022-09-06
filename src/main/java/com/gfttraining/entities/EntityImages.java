package com.gfttraining.entities;

import java.util.List;

public class EntityImages {
	public List<EntityBackdrops> entityBackdrops;
	public List<EntityPosters> entityPosters;
	public EntityImages() {
		
	}
	public List<EntityBackdrops> getEntityBackdrops() {
		return entityBackdrops;
	}
	public void setEntityBackdrops(List<EntityBackdrops> entityBackdrops) {
		this.entityBackdrops = entityBackdrops;
	}
	public List<EntityPosters> getEntityPosters() {
		return entityPosters;
	}
	public void setEntityPosters(List<EntityPosters> entityPosters) {
		this.entityPosters = entityPosters;
	}
}
