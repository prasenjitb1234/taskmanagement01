package com.task.TaskManageTry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.task.TaskManageTry.model.TaskAdmin;
import com.task.TaskManageTry.service.AdminService;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Controller
@Transactional
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	
	@GetMapping("/registertaskadmin")
	public String registerAdmin(Model model) {
		model.addAttribute("taskadmin",new TaskAdmin());
		return "taskadminregistration";
	}
	
	@PostMapping("/status")
	public String getStatus(@Valid @ModelAttribute("taskadmin") TaskAdmin taskadmin, BindingResult bindResult) {
		if(bindResult.hasErrors()) {
			return "taskadminregistration";
		}
		adminService.saveAdmin(taskadmin);
		return "redirect:/taskadminlogin";
	}
	
	
}
