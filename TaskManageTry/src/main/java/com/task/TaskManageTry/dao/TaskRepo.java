package com.task.TaskManageTry.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.TaskManageTry.model.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task,Integer>{

}
