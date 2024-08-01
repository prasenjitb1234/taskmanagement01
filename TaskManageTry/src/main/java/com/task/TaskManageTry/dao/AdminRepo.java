package com.task.TaskManageTry.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.TaskManageTry.model.TaskAdmin;

@Repository
public interface AdminRepo extends JpaRepository<TaskAdmin, Integer>{

	
	
}
