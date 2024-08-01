package com.task.TaskManageTry.service;

import java.util.List;

import com.task.TaskManageTry.model.Task;

public interface TaskService {

	public Task saveTask(Task task);

	public List<Task> taskList();

	public void deleteByID(int id);

	public Task findByID(int id);

	public Task updateTask(Task task);

}
