package com.task.TaskManageTry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.task.TaskManageTry.model.AdminHome;
import com.task.TaskManageTry.model.TaskAdmin;
import com.task.TaskManageTry.service.AdminService;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Controller
@Transactional
public class LoginController {

	@Autowired
	private AdminService adminService;
	
	@GetMapping("/taskadminlogin")
	public String getLogin(Model model) {
		model.addAttribute("adminhome",new AdminHome());
		return "adminhome";
	}
	
	@PostMapping("/adminloginstatus")
	public String getlogstatus(@Valid @ModelAttribute ("adminhome") AdminHome adminhome,BindingResult bindResult, Model model) {
		if(bindResult.hasErrors()) {
			return "adminhome";
		}
		
		List<TaskAdmin> dbtaskList = adminService.taskadminList(); 
		boolean found = false;
		
		for(TaskAdmin dbv : dbtaskList) {
			if(dbv.getUsername().equals(adminhome.getUsername())&& dbv.getPassword().equals(adminhome.getPassword())) {
				found = true;
			}
		}
		if(found) {
			return "admindashboard";
		}
		else {
			model.addAttribute("error","Incorrect Username or Password");
			return "adminhome";
		}
	}
	
	
	
	
	
}
