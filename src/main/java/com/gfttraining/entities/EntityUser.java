package com.gfttraining.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class EntityUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;
	@NotBlank(message = "Name can't be null")
	private String username;
	@NotBlank(message = "password cant be null")
	private String password;
	@NotBlank(message = "role can't be null")
	private String role;
	@NotBlank(message = "user must be enabled")
	private boolean enabled;
	public EntityUser() {
		super();
	}
	public EntityUser(Integer userid, @NotBlank(message = "Name can't be null") String username,
			@NotBlank(message = "password cant be null") String password,
			@NotBlank(message = "role can't be null") String role,
			@NotBlank(message = "user must be enabled") boolean enabled) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.role = role;
		this.enabled = enabled;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return "EntityUser [userid=" + userid + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", enabled=" + enabled + "]";
	}
}
