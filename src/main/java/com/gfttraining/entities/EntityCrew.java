package com.gfttraining.entities;

public class EntityCrew {
	private boolean adult;
	   private int gender;
	   private Long id;
	   private String known_for_department;
	   private String name;
	   private String original_name;
	   private float popularity;
	   private String profile_path;
	   private String credit_id;
	   private String department;
	   private String job;
	public EntityCrew() {
		super();
	}
	public EntityCrew(boolean adult, int gender, Long id, String known_for_department, String name,
			String original_name, float popularity, String profile_path, String credit_id, String department,
			String job) {
		super();
		this.adult = adult;
		this.gender = gender;
		this.id = id;
		this.known_for_department = known_for_department;
		this.name = name;
		this.original_name = original_name;
		this.popularity = popularity;
		this.profile_path = profile_path;
		this.credit_id = credit_id;
		this.department = department;
		this.job = job;
	}
	@Override
	public String toString() {
		return "EntityCrew [adult=" + adult + ", gender=" + gender + ", id=" + id + ", known_for_department="
				+ known_for_department + ", name=" + name + ", original_name=" + original_name + ", popularity="
				+ popularity + ", profile_path=" + profile_path + ", credit_id=" + credit_id + ", department="
				+ department + ", job=" + job + "]";
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
	public String getCredit_id() {
		return credit_id;
	}
	public void setCredit_id(String credit_id) {
		this.credit_id = credit_id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
}
