package com.gfttraining.entities;

public class EntityCast {
	private boolean adult;
	   private int gender;
	   private Long id;
	   private String known_for_department;
	   private String name;
	   private String original_name;
	   private float popularity;
	   private String profile_path;
	   private Long cast_id;
	   private String character;
	   private String credit_id;
	   private Long order;
	public EntityCast() {
			super();
		}
	
	public EntityCast(boolean adult, int gender, Long id, String known_for_department, String name,
			String original_name, float popularity, String profile_path, Long cast_id, String character,
			String credit_id, Long order) {
		super();
		this.adult = adult;
		this.gender = gender;
		this.id = id;
		this.known_for_department = known_for_department;
		this.name = name;
		this.original_name = original_name;
		this.popularity = popularity;
		this.profile_path = profile_path;
		this.cast_id = cast_id;
		this.character = character;
		this.credit_id = credit_id;
		this.order = order;
	}   
	   @Override
	public String toString() {
		return "EntityCast [adult=" + String.valueOf(adult) + ", gender=" + String.valueOf(gender) + ", id=" + String.valueOf(id) + ", known_for_department="
				+ known_for_department + ", name=" + name + ", original_name=" + original_name + ", popularity="
				+ String.valueOf(popularity) + ", profile_path=" + profile_path + ", cast_id=" + String.valueOf(cast_id) + ", character=" + String.valueOf(character)
				+ ", credit_id=" + String.valueOf(credit_id) + ", order=" + String.valueOf(order) + "]";
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKnown_for_department() {
		return known_for_department;
	}

	public void setKnown_for_department(String known_for_department) {
		this.known_for_department = known_for_department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOriginal_name() {
		return original_name;
	}

	public void setOriginal_name(String original_name) {
		this.original_name = original_name;
	}

	public float getPopularity() {
		return popularity;
	}

	public void setPopularity(float popularity) {
		this.popularity = popularity;
	}

	public String getProfile_path() {
		return profile_path;
	}

	public void setProfile_path(String profile_path) {
		this.profile_path = profile_path;
	}

	public Long getCast_id() {
		return cast_id;
	}

	public void setCast_id(Long cast_id) {
		this.cast_id = cast_id;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getCredit_id() {
		return credit_id;
	}

	public void setCredit_id(String credit_id) {
		this.credit_id = credit_id;
	}

	public Long getOrder() {
		return (long) order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}


	

}
