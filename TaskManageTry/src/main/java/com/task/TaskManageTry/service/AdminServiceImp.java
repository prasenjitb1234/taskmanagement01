package com.task.TaskManageTry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.TaskManageTry.dao.AdminRepo;
import com.task.TaskManageTry.model.TaskAdmin;

@Service
public class AdminServiceImp implements AdminService{
	
	@Autowired
	private AdminRepo adminRepo;

	@Override
	public TaskAdmin saveAdmin(TaskAdmin taskadmin) {
		// TODO Auto-generated method stub
		
		return adminRepo.save(taskadmin);
	}

	@Override
	public List<TaskAdmin> taskadminList() {
		// TODO Auto-generated method stub
		List<TaskAdmin> findAll = adminRepo.findAll();
		return findAll;
	}

}
