package com.task.TaskManageTry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	
	@GetMapping("/hometask")
    public String showHomePage() {
        return "home";
    }
	
}
