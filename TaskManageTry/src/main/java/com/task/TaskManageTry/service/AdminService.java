package com.task.TaskManageTry.service;

import java.util.List;

import com.task.TaskManageTry.model.TaskAdmin;

public interface AdminService {

	public TaskAdmin saveAdmin(TaskAdmin taskadmin);
	public List<TaskAdmin> taskadminList();
	
	
}
