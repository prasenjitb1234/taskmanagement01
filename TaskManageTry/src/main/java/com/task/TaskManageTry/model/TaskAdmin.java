package com.task.TaskManageTry.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TaskAdmin {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO.SEQUENCE)
	private int id;
	private String name;
	private String username;
	private String password;
	
	
	
	
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
		return "TaskAdmin [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + "]";
	}
	public TaskAdmin(int id, String name, String username, String password) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public TaskAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
