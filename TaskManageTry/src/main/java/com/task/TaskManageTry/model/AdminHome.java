package com.task.TaskManageTry.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AdminHome {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO.SEQUENCE)
	private int id;
	private String username;
	private String password;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "AdminHome [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	public AdminHome(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public AdminHome() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
